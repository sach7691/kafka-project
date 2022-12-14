package com.ab.controllers;


import com.ab.services.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class MessageController {

    @Autowired
    private KafkaProducer kafkaProducer;

    //http://localhost:8080/api/kafka/publish?message=hello
    @GetMapping("/publish")
    public ResponseEntity<?> publish(@RequestParam(value = "message") String message){
        kafkaProducer.sendMessage(message);
        return new ResponseEntity<>("Message sent to the topic",HttpStatus.OK);
    }
}
