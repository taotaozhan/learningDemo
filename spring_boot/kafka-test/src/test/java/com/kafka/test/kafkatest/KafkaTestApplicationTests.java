package com.kafka.test.kafkatest;

import com.kafka.test.kafkatest.producer.Producer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaTestApplicationTests {

    @Autowired
    private Producer producer;

    private String TOPIC = "mytopic";
    @Test
    public void contextLoads() {
        for(int i=0; i<10; i++){
            producer.producer(TOPIC,"liu*test-------->>>"+i);
        }
    }


}
