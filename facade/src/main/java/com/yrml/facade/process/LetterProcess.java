package com.yrml.facade.process;

/**
 * @author created by John Tan on 2018/6/25
 */
public interface LetterProcess {

  void writeVontext(String context);

  void fillEnvelope(String address);

  void letterInotoEnvelope();

  void sendLetter();
}
