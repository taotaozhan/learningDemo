package com.kafka.test.kafkatest.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void producer(String topic,String message){
        kafkaTemplate.send(topic,message);
    }
}
