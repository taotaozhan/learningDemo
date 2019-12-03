package com.example.service;

import com.example.eneity.TestUser;

/**
 * @author zhangtao
 * @date 2019/10/10
 * @deprecated 应用层接口
 */

public interface TestUserService {


    /**
     * @return
     */
    boolean addTestUser(TestUser testUser);
    String deleteTestUser(int id);

}
