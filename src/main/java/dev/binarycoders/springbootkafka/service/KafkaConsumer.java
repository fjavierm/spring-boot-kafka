package dev.binarycoders.springbootkafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = {KafkaProducer.TOPIC_NAME}, groupId = "example_group_id")
    public void read(final String message) {
        System.out.println(message);
    }
}
