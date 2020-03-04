package cn.yunhe.pageh.service;

import cn.yunhe.pageh.entity.User;
import cn.yunhe.pageh.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
springboot整合pagehelper
 */


@Service
public class UserService {

    @Resource
    private UserMapper userMapper;
    public PageInfo<User> findUserList(int page,int pageSize){
       List<User> listUser= userMapper.findUserList();
        PageHelper.startPage(page,pageSize);
        PageInfo<User> pageInfoList=new PageInfo<User>(listUser);

        return pageInfoList;
    }


}
