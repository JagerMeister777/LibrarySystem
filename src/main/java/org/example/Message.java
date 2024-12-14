package org.example;

public class Message {

  public static void startMessage(){
    System.out.println("書籍検索システムへようこそ！");
    System.out.println("モードを選択してください！");

    makeLine();
    System.out.println("1：タイトルで検索");
    System.out.println("2：著者名で検索");
    System.out.println("3：管理番号で検索");
    System.out.println("4：登録されている本を一覧で表示");
    makeLine();

    System.out.print("数字で選択してください : ");
  }

  //見やすいように行の区切りを生成
  public static void makeLine() {
    System.out.println(
        "**********************************************************************************************************");
  }
}
