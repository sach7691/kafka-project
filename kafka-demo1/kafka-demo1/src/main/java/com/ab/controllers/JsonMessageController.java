package com.ab.controllers;

import com.ab.models.User;
import com.ab.services.JsonKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class JsonMessageController {

    @Autowired
    private JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<?> publish(@RequestBody User user){
        jsonKafkaProducer.sendMessage(user);
        return new ResponseEntity<>("Json message sent to kafka topic",HttpStatus.OK);
    }
}
