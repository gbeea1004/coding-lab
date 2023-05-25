package geonhee.codinglab.rabbitmq.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

  @RabbitListener(queues = "TestQueue")
  public void processMessage(String content) {
    System.out.println("content = " + content);
  }
}
