package com.example.controller;


import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/usr")
public class UserController {

  @Autowired
    private UserService userService;

   @RequestMapping(value = "/add",method = RequestMethod.POST)
     public boolean  addUser(User user){
      return userService.addUser(user);
      }

      @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public boolean deleteUser(int id){
       return  userService.deleteUser(id);
      }
      @RequestMapping(value = "/updata",method = RequestMethod.PUT)
    public boolean updata(User user){
       return userService.updateUser(user);
      }
      @RequestMapping(value = "/findUserByName",method = RequestMethod.POST)
      public User finUserByName(String name ){
       return userService.findUserByName(name);
      }
      @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<User> findAll(){
       return userService.findAll();
      }

}
