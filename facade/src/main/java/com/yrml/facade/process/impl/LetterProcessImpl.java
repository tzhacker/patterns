package com.yrml.facade.process.impl;

import com.yrml.facade.process.LetterProcess;

/**
 * @author created by John Tan on 2018/6/25
 */
public class LetterProcessImpl implements LetterProcess {

  @Override
  public void writeVontext(final String context) {
    System.out.println("the content of letter: " + context);
  }

  @Override
  public void fillEnvelope(final String address) {
    System.out.println("blank the adress&infomation: " + address);
  }

  @Override
  public void letterInotoEnvelope() {
    System.out.println("take the letter to the Inoto.");
  }

  @Override
  public void sendLetter() {
    System.out.println("send the letter.");
  }
}
