package cn.yunhe.pageh.mapper;

import cn.yunhe.pageh.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper{
    @Select("select * from user")
    List<User> findUserList();
}
