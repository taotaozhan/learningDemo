package com.example.mybatisplusdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplusdemo.eneity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhangtao
 * @version 创建时间 2019/12/26
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
