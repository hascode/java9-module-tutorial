package com.hascode.datetool.internal;

import com.hascode.datetool.api.DateTool;
import java.time.LocalDateTime;

public class DateToolImpl implements DateTool {
  public String currentDate(){
    return LocalDateTime.now().toString();
  }
}
