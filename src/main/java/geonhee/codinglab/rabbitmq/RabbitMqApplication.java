package geonhee.codinglab.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 도커로 rabbitmq 다운받고 실행해야 함
 */
@SpringBootApplication
public class RabbitMqApplication {

  public static void main(String[] args) {
    SpringApplication.run(RabbitMqApplication.class, args);
  }
}
