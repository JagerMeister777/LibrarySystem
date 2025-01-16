package org.example;

import java.util.Scanner;

public class InputDataAndOutPutData {

  public static void inputDataAndOutPutData() {

    Library library = new Library();
    Scanner scanner = new Scanner(System.in);

    String selectMode = scanner.next();

    //入力値バリデーション
    boolean isNumber = CheckData.isNumber(selectMode);

    if (isNumber) {
      Message.makeLine();
      switch (Integer.parseInt(selectMode)) {
        case 1 -> {
          System.out.println("タイトルで検索します。");
          System.out.print("タイトルを入力してください。 : ");
          String title = scanner.next();
          library.searchBookTitle(title);
        }
        case 2 -> {
          System.out.println("著者名で検索します。");
          System.out.print("著者名を入力してください。 : ");
          String author = scanner.next();
          library.searchBookAuthor(author);
        }
        case 3 -> {
          System.out.println("管理番号で検索します。");
          System.out.print("管理番号を入力してください。 : ");
          String number = scanner.next();
          library.searchBookNumber(number);
        }
        case 4 -> {
          System.out.println("登録されている本を一覧表示します。");
          library.showBooks();
        }
        default -> System.out.println("1〜4で選択してください。");
      }
    } else {
      System.out.println("正しく入力されていません。");
    }
  }
}
