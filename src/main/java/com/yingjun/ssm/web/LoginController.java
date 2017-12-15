package com.yingjun.ssm.web;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author libing
 * @desc 用户登录
 * @date 2017/12/15 9:46
 */
@Controller
public class LoginController {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value="/doLogin",method = RequestMethod.POST)
    public String doLogin(HttpServletRequest request, HttpServletResponse response, Model model){
        LOG.info("user login");
        String msg = "";
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        System.out.println(userName+":"+password);
        //创建用户登录凭证
        UsernamePasswordToken token = new UsernamePasswordToken(userName,password);
        token.setRememberMe(true);
        Subject subject = SecurityUtils.getSubject();
        try{
            subject.login(token);
            //判断是否登录成功
            if(subject.isAuthenticated()){
                //shiro authentication
                LOG.info("认证成功");
                if(subject.hasRole("admin") && subject.isPermitted("login")){
                    //shiro authorization
                    LOG.info("授权成功");
                    return "redirect:/index.jsp";
                }
            }else{
                LOG.info("登录失败");
                return "login";
            }
        }catch (IncorrectCredentialsException e) {
            msg = "登录密码错误. Password for account " + token.getPrincipal() + " was incorrect.";
            model.addAttribute("message", msg);
            System.out.println(msg);
        } catch (ExcessiveAttemptsException e) {
            msg = "登录失败次数过多";
            model.addAttribute("message", msg);
            System.out.println(msg);
        } catch (LockedAccountException e) {
            msg = "帐号已被锁定. The account for username " + token.getPrincipal() + " was locked.";
            model.addAttribute("message", msg);
            System.out.println(msg);
        } catch (DisabledAccountException e) {
            msg = "帐号已被禁用. The account for username " + token.getPrincipal() + " was disabled.";
            model.addAttribute("message", msg);
            System.out.println(msg);
        } catch (ExpiredCredentialsException e) {
            msg = "帐号已过期. the account for username " + token.getPrincipal() + "  was expired.";
            model.addAttribute("message", msg);
            System.out.println(msg);
        } catch (UnknownAccountException e) {
            msg = "帐号不存在. There is no user with username of " + token.getPrincipal();
            model.addAttribute("message", msg);
            System.out.println(msg);
        } catch (UnauthorizedException e) {
            msg = "您没有得到相应的授权！" + e.getMessage();
            model.addAttribute("message", msg);
            System.out.println(msg);
        }
        return "login";
    }
}
