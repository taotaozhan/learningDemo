package com.example.service.ServiceImp;

import com.example.dao.TestUserDao;
import com.example.eneity.TestUser;
import com.example.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangtoa
 * @date 2019/10/10
 * @deprecated 应用层实现类
 */

@Service
public class TestUserServiceImp implements TestUserService {

    @Autowired
    private TestUserDao testUserDao;

    @Override
    public boolean addTestUser(TestUser testUser) {
        boolean flag = false;
        try {
            testUserDao.addTestUser(testUser);
            flag = true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public String deleteTestUser(int id) {
        boolean flag = false;
        try {
            testUserDao.deleteTestUser(id);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
       if(flag != false) {
           return "删除成功";
       }else{
           return  "刪除失败";
       }
    }
}
