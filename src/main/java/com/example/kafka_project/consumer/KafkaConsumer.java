package com.example.kafka_project.consumer;

import com.example.kafka_project.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(topics = "myTopic", groupId = "myGroup")
    public void consumeMessage(String message) {
        log.info(String.format("Consumed message from myTopic: %s", message));
    }

    @KafkaListener(topics = "jsonTopic", groupId = "myGroup")
    public void consumeStudentMessage(Student student) {
        log.info(String.format("Consumed student message from myTopic: %s", student.toString()));
    }

}
