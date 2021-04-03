package com.github.andylke.demo.bar;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Bar {

  private String text;

  public Bar(final String text) {
    this.text = text;
  }

  public Bar() {}

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
