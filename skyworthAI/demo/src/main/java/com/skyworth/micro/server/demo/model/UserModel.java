package com.skyworth.micro.server.demo.model;

import java.util.*;
import java.lang.*;

import lombok.Data;
import org.springframework.boot.container.core.common.BaseModel;
import org.springframework.boot.container.core.common.ServerField;
import org.springframework.boot.container.core.common.ServerModel;

/**
 * @author Administered E-mail:
 * @version 创建时间：2019/11/6 14:01
 * 演示Model业务对象
 */
@Data
@ServerModel("T_USER")
public class UserModel extends BaseModel {
  private static final long serialVersionUID = 3193853541795909064L;
  /**
   * 表ID
   */
  @ServerField("ID")
  private Integer ID;
  /**
   * 年龄
   */
  @ServerField("AGE")
  private Integer age;
  /**
   * 名字
   */
  @ServerField("NAME")
  private String name;
}
