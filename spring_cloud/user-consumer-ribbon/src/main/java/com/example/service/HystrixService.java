package com.example.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangtao
 * @date 2019/10/31
 */
@Slf4j
@Service
public class HystrixService  {

  @Autowired
  private RestTemplate restTemplate;
  @Autowired
  private LoadBalancerClient loadBalancerClient;

  private  String hystrixBack(){
    return "error";
  }
  @HystrixCommand(fallbackMethod = "hystrixBack")
  public String Ticket1(@RequestParam(required = false, value = "username") String username) {
    String result = restTemplate.getForObject("http://user-eureka-client/" + "getUser?username=" + username, String.class);
    ServiceInstance serviceInstance = loadBalancerClient.choose("user-eureka-client");
    log.info("host=" + serviceInstance.getHost() + ",port=" + serviceInstance.getPort() + ",serviceid=" + serviceInstance.getServiceId());
    return result;
  }

}
