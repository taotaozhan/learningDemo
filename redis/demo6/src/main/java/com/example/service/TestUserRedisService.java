package com.example.service;

/**
 * @author zhangtao
 * @data 2019/10/12
 * @deprecated  redis接口
 */


public interface TestUserRedisService {

    /**
     * @return
     */
    boolean  addTestString();

    boolean addTestUser();

    String deleteTestUser();


}
