package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //図書管理システム
    //書籍（Book）を管理する情報（タイトル、著者、番号）を持つオブジェクト（クラス）を作って、そこに情報を格納してください。
    //図書館（Library）クラスみたいのを作って、そこにBookをListで持つようなものを保持する。
    //mainメソッドからこのLibraryクラスに対して、検索ができるようにする。Libraryクラスは書籍検索の機能を持つ。
    //タイトル検索、著者検索、番号検索メソッドをLibraryに持たせる。
    //それをmainメソッドから実行して、実行結果をコンソールに出力。

    //一番やりたいこと -> 検索機能の実装
    //Libraryクラスは本棚、検索機能、検索結果の表示を行うメソッドを実装

    Library library = new Library();
    Scanner scanner = new Scanner(System.in);

    System.out.println("書籍検索システムへようこそ！");
    System.out.println("モードを選択してください！");

    makeLine();
    System.out.println("1：タイトルで検索");
    System.out.println("2：著者名で検索");
    System.out.println("3：管理番号で検索");
    System.out.println("4：登録されている本を一覧で表示");
    makeLine();

    System.out.print("数字で選択してください : ");

    String selectMode = scanner.next();

    //入力値バリデーション
    boolean isNumber = selectModeCheck(selectMode);

    if (isNumber) {
      makeLine();
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
          int number = scanner.nextInt();
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

  //数字かどうかチェックする
  public static boolean selectModeCheck(String number) {
    try {
      Integer.parseInt(number); //文字列を整数に変換して例外が起こればcatchへ
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  //見やすいように行の区切りを生成
  public static void makeLine() {
    System.out.println(
        "**********************************************************************************************************");
  }


}
