package com.github.andylke.demo.bar;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface BarStreams {

  public static final String INPUT = "bar-in";

  public static final String OUTPUT = "bar-out";

  @Input(INPUT)
  SubscribableChannel input();

  @Output(OUTPUT)
  MessageChannel output();
}
