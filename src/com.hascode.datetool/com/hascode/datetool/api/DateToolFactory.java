package com.hascode.datetool.api;

import com.hascode.datetool.internal.DateToolImpl;

public class DateToolFactory {

  public static DateTool create(){
    return new DateToolImpl();
  }
}
