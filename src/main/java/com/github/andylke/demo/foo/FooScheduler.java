package com.github.andylke.demo.foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(FooStreams.class)
public class FooScheduler {

  private static final Logger LOGGER = LoggerFactory.getLogger(FooScheduler.class);

  @Autowired private FooStreams fooStreams;

  @Scheduled(initialDelay = 1000, fixedDelay = 30000)
  public void send() {
    final Foo foo = new Foo("foo");

    LOGGER.info("Sending [{}] to stream [{}]", foo.getText(), FooStreams.OUTPUT);
    fooStreams.output().send(MessageBuilder.withPayload(foo).build());
  }
}
