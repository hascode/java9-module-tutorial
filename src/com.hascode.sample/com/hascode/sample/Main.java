package com.hascode.sample;

import com.hascode.datetool.api.DateTool;
import com.hascode.datetool.api.DateToolFactory;

public class Main {

  public static void main(String[] args){
    DateTool dt = DateToolFactory.create();
    System.out.printf("The time is %s", dt.currentDate());
  }
}
