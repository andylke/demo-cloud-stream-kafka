package com.github.andylke.demo.baz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(BazStreams.class)
public class BazProcessor {

  private Logger LOGGER = LoggerFactory.getLogger(BazProcessor.class);

  @StreamListener(BazStreams.INPUT)
  public void listen(final Baz baz) {
    LOGGER.info("Received [{}] on stream [{}]", baz.getText(), BazStreams.INPUT);
  }
}
