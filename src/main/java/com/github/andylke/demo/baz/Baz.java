package com.github.andylke.demo.baz;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Baz {

  private String text;

  public Baz(final String text) {
    this.text = text;
  }

  public Baz() {}

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
