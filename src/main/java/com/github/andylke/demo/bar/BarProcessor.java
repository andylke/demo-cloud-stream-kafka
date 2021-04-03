package com.github.andylke.demo.bar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(BarStreams.class)
public class BarProcessor {

  private Logger LOGGER = LoggerFactory.getLogger(BarProcessor.class);

  @StreamListener(BarStreams.INPUT)
  @SendTo(BarStreams.OUTPUT)
  public Bar convert(final Bar bar) {
    bar.setText(bar.getText() + " bar");
    LOGGER.info("Processed [{}]", bar.getText());
    return bar;
  }
}
