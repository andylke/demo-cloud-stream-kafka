package com.github.andylke.demo.foo;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface FooStreams {

  public static final String OUTPUT = "foo-out";

  @Output(OUTPUT)
  MessageChannel output();
}
