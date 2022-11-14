package com.ab.services;

import com.ab.models.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    @KafkaListener(topics = "topic1_json",groupId = "myGroup")
    public void consume(User user){

        System.out.println("Json message received : " + user.toString());
    }

}
