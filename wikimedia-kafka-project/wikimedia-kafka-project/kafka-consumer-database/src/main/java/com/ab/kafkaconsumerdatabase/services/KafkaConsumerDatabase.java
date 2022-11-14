package com.ab.kafkaconsumerdatabase.services;


import com.ab.kafkaconsumerdatabase.models.WikiData;
import com.ab.kafkaconsumerdatabase.repositories.WikiDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerDatabase {

    @Autowired
    private WikiDataRepository wikiDataRepository;

    @KafkaListener(topics = "wikimedia_topic",groupId = "myGroup")
    public void consume(String eventMessage){

        System.out.println("Event Message received : " + eventMessage);

        WikiData wd = new WikiData();
        wd.setEventData(eventMessage);
        wikiDataRepository.save(wd);
    }
}
