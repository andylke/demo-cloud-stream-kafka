package com.github.andylke.demo.baz;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface BazStreams {

  public static final String INPUT = "baz-in";

  @Input(INPUT)
  SubscribableChannel input();
}
