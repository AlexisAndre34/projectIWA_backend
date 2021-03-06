package jha.stopcovid.kafka.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics="my_topic", groupId ="my_group_id")
    public void getInformation(Object info) {
        System.out.println();
    }
}
