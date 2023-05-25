package geonhee.codinglab.rabbitmq.controller;

import geonhee.codinglab.rabbitmq.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/messages")
@RestController
public class MessageController {

  private final MessageService messageService;

  @PostMapping
  public String sendMessage(@RequestParam("message") String message) {
    messageService.send(message);

    return "send success!";
  }
}
