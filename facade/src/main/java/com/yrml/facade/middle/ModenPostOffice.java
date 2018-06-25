package com.yrml.facade.middle;

import com.yrml.facade.police.Police;
import com.yrml.facade.process.LetterProcess;
import com.yrml.facade.process.impl.LetterProcessImpl;

/**
 * @author created by John Tan on 2018/6/25
 */
public class ModenPostOffice {

  private LetterProcess letterProcess = new LetterProcessImpl();
  private Police police = new Police();

  public void sendLetter(String context, String address){
    letterProcess.writeVontext(context);
    letterProcess.fillEnvelope(address);

    //add the new step easily
    police.checkLetter(letterProcess);


    letterProcess.letterInotoEnvelope();
    letterProcess.sendLetter();
  }
}
