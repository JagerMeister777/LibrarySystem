package org.example;

public class CheckData {
  //数字かどうかチェックする
  public static boolean isNumber(String number) {
    try {
      Integer.parseInt(number); //文字列を整数に変換して例外が起こればcatchへ
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
