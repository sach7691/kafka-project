package com.ab.configs;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class TopicConfig {


    @Bean
    public NewTopic kafkaTopic(){

        return TopicBuilder.name("topic1")
                .build();

    }

    @Bean
    public NewTopic kafkaJsonTopic(){

        return TopicBuilder.name("topic1_json")
                .build();

    }

}
