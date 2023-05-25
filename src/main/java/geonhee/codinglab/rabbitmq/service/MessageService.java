package geonhee.codinglab.rabbitmq.service;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MessageService {

  private final RabbitTemplate rabbitTemplate;

  public void send(String message) {
    rabbitTemplate.convertAndSend("TestQueue", message);
  }
}
