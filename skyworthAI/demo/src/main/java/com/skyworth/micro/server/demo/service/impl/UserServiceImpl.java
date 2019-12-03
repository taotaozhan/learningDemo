package com.skyworth.micro.server.demo.service.impl;

import com.skyworth.micro.server.demo.model.UserModel;
import com.skyworth.micro.server.demo.service.UserService;
import org.springframework.boot.container.core.log.ZKLogger;
import org.springframework.boot.container.core.log.ZKLoggerFactory;
import org.springframework.boot.container.core.service.BaseSupportServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.boot.container.core.common.BusinessException;

import java.sql.SQLException;



/**
 * @author Administered E-mail:
 * @version 创建时间：2019/11/6 14:04
 * 演示用户实现类
 */
@Service
public class UserServiceImpl extends BaseSupportServiceImpl implements UserService {
  private static final ZKLogger logger = getLogger(UserServiceImpl.class);


  /*** 用户登录
   * @return UserModel
   * @throws BusinessException
   */
  public UserModel login() throws BusinessException {
    logger.debug("进入了login方法");
    try {
      return null;
    } catch (Exception ex) {
      if (ex instanceof BusinessException) {
        throw new BusinessException(ex);
      } else {
        logger.error(ex.getMessage());
        throw new BusinessException("数据异常：" + ex.getMessage(), 500, null);
      }
    }
  }
}
