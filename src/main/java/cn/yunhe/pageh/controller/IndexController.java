package cn.yunhe.pageh.controller;

import cn.yunhe.pageh.entity.User;
import cn.yunhe.pageh.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class IndexController {
    @Resource
    private UserService userService;
    @RequestMapping("/index")
    public PageInfo<User> index(int page,int pageSize){
        userService.findUserList(page,pageSize);//这个查询会分页
       return userService.findUserList(page,pageSize);//这个查询不会分页
}

}
