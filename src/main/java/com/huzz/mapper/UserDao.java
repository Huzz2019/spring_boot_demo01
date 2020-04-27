package com.huzz.mapper;

import com.huzz.pojo.UserDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.Update;

import java.util.List;


@Mapper
public interface UserDao {

    @Select("select * from user where loginName = #{loginName}")
    UserDto selectByLoginName(String loginName);
}