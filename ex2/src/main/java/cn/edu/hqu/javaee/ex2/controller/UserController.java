package cn.edu.hqu.javaee.ex2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.hqu.javaee.ex2.domain.User;



@Controller
public class UserController {
    

    @RequestMapping(value="/register")
    public String Register(@ModelAttribute("form") User user, Model model) {  
    	// user:视图层传给控制层的表单对象；model：控制层返回给视图层的对象
        // 在 model 中添加一个名为 "user" 的 user 对象
        model.addAttribute("user", user);
        // 返回一个字符串 " success" 作为视图名称
        return "success";
    }
}
