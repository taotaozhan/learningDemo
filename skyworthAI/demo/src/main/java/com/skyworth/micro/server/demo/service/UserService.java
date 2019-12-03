package com.skyworth.micro.server.demo.service;

import com.skyworth.micro.server.demo.model.UserModel;
import org.springframework.boot.container.core.service.BaseService;
import org.springframework.boot.container.core.common.BusinessException;

/**
 * @author Administered E-mail:
 * @version 创建时间：2019/11/6 14:04
 * 演示用户接口
 */
public interface UserService extends BaseService {


  /*** 用户登录
   * @return UserModel
   * @throws BusinessException
   */
  UserModel login() throws BusinessException;
}
