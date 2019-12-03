package com.skyworth.micro.server.demo;

import org.springframework.boot.container.core.MicroServer;
import org.springframework.boot.container.core.SpringContainerApplication;

@MicroServer
public class Application extends SpringContainerApplication {

    /**
    * 设置服务节点名字，服务名称全局唯一
    * @return
    */
    @Override
    public String getServerName() {
        return "demo";
    }

    public static void main(String[] args) throws Exception {
        Application app=new Application();//实例化启动器对象
        app.run(Application.class,args);//启动服务节点
    }


}
