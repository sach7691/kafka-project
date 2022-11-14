package com.ab.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {


    @KafkaListener(topics = "topic1",groupId = "myGroup")
    public void consume(String message){

        System.out.println("Message received : " + message);
    }

}
