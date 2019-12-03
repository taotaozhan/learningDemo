package com.kafka.test.kafkatest.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "mytopic")
    public void consumer(String message){
        System.out.println("the topic is : "+ message);
    }
//    @KafkaListener(topics = "test")
//    public void consumer1(String message){
//        System.out.println("the topic is : "+ message);
//    }
}
