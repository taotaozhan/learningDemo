package com.example.asyncdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zhangtao
 * @version 创建时间 2019/11/13
 */

@Configuration
public class AsyncConfig {

  @Bean
  public ThreadPoolTaskExecutor asyncThreadPoolExecutor(){
    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    executor.setCorePoolSize(20);
    executor.setMaxPoolSize(200);
    executor.setQueueCapacity(25);
    executor.setKeepAliveSeconds(200);
    executor.setThreadNamePrefix("asyncThread");
    executor.setWaitForTasksToCompleteOnShutdown(true);
    executor.setAwaitTerminationSeconds(60);

    executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
    executor.initialize();
    return executor;
  }

}
