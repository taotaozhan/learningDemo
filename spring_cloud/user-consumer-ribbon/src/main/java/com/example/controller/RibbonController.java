package com.example.controller;


import com.example.service.HystrixService;
import com.example.util.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangtao
 * @date 2019/10/23
 */
@Slf4j
@RestController
public class RibbonController {

  @Autowired
  private RestTemplate restTemplate;
  @Autowired
  private LoadBalancerClient loadBalancerClient;
  @Autowired
  private HystrixService hystrixService;

@GetMapping("/getUser2")
  public String purchaseTicket2(@RequestParam(required = false, value = "username") String username) {
     String result = hystrixService.Ticket1(username);
     return result;
}

  @GetMapping("/getUser")
  public CommonResult purchaseTicket(@RequestParam(required = false, value = "username") String username) {
    CommonResult result = restTemplate.getForObject("http://user-eureka-client/" + "getUser?username=" + username, CommonResult.class);
    return result;
  }
  @GetMapping("/getUser1")
  public String purchaseTicket1(@RequestParam(required = false, value = "username") String username) {
    String result = restTemplate.getForObject("http://user-eureka-client/" + "getUser?username=" + username, String.class);
    ServiceInstance serviceInstance = loadBalancerClient.choose("user-eureka-client");
    log.info("host=" + serviceInstance.getHost() + ",port=" + serviceInstance.getPort() + ",serviceid=" + serviceInstance.getServiceId());
    return result;
}


  @GetMapping("/loginfo")
  public void loginfo() {
    ServiceInstance serviceInstance = loadBalancerClient.choose("user-eureka-client");
    log.info("host=" + serviceInstance.getHost() + ",port=" + serviceInstance.getPort() + ",serviceid=" + serviceInstance.getServiceId());
  }
}
