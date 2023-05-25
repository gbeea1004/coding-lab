package geonhee.codinglab.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

  static final String topicExchangeName = "spring-boot-exchange";

  @Bean
  public Queue queue() {
    return new Queue("TestQueue", false);
  }

  @Bean
  TopicExchange exchange() {
    return new TopicExchange(topicExchangeName);
  }

  @Bean
  public Binding binding(TopicExchange topicExchange, Queue queue) {
    return BindingBuilder.bind(queue).to(topicExchange).with("hello.key.#");
  }
}
