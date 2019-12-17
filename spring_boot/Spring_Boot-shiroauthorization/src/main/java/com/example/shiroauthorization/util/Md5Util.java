package com.example.shiroauthorization.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @author zhangtao
 * @date 创建时间  2019/12/6
 */

public class Md5Util {
  //盐值
  private static final String SALT = "mrbird";

  private static final String ALGORITH_NAME = "md5";
  //散列次数
  private static final int HASH_ITERATIONS = 2;

  public static String encrypt(String pswd) {
    String newPassword = new SimpleHash(ALGORITH_NAME, pswd, ByteSource.Util.bytes(SALT), HASH_ITERATIONS).toHex();
    return newPassword;
  }

  public static String encrypt(String username, String pswd) {
    String newPassword = new SimpleHash(ALGORITH_NAME, pswd, ByteSource.Util.bytes(username + SALT),
        HASH_ITERATIONS).toHex();
    return newPassword;
  }
  public static void main(String[] args) {

    System.out.println(Md5Util.encrypt("test", "123456"));
  }
}
