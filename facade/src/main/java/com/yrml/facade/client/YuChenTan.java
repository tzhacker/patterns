package com.yrml.facade.client;

import com.yrml.facade.middle.ModenPostOffice;
import com.yrml.facade.process.LetterProcess;
import com.yrml.facade.process.impl.LetterProcessImpl;

/**
 * @author created by John Tan on 2018/6/25
 */
public class YuChenTan {

  public static void main(String[] args) {

    System.out.println("--------Must open the step of writing to client--------");
    LetterProcess letterProcess = new LetterProcessImpl();
    letterProcess.writeVontext("LOVE");
    letterProcess.fillEnvelope("Chengdu");
    letterProcess.letterInotoEnvelope();
    letterProcess.sendLetter();

    System.out.println("--------Just open the server of writing letter--------");
    ModenPostOffice modenPostOffice = new ModenPostOffice();
    String context = "LOVE";
    String address = "Chengdu";
    modenPostOffice.sendLetter(context, address);
  }
}
