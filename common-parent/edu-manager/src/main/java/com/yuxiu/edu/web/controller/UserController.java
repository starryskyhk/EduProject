package com.yuxiu.edu.web.controller;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.IUserService;
import com.yuxiu.edu.web.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController extends BaseController<User> {
    @Autowired
    private IUserService userService;
    @RequestMapping("login")
    public String login(){
        System.out.println("访问控制器");
        return "Default";
    }
    @RequestMapping("find")
    public String find(Integer id){
        User user=userService.findById(id);
        System.out.println(user);
        return null;
    }
    @RequestMapping(MANAGE)
    public String manage(){
        System.out.println("进入了manage");
        System.out.println("值为:"+MANAGE_PATH);
        return MANAGE_PATH;//如果返回空，会默认寻找上一次访问的路径
    }
    @RequestMapping(INFO)
    public String info(){
        return INFO_PATH;
    }
    @RequestMapping(EDIT)
    public String edit(){

        return EDIT_PATH;
    }

}
