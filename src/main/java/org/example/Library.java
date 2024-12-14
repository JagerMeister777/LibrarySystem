package org.example;

import java.util.List;

public class Library {

  //本棚
  List<Book> bookList = List.of(
      new Book("吾輩は猫である", "夏目漱石", 1),
      new Book("こころ", "夏目漱石", 2),
      new Book("坊っちゃん", "夏目漱石", 3),
      new Book("羅生門", "芥川龍之介", 4),
      new Book("蜘蛛の糸", "芥川龍之介", 5),
      new Book("人間失格", "太宰治", 6),
      new Book("斜陽", "太宰治", 7),
      new Book("銀河鉄道の夜", "宮沢賢治", 8),
      new Book("注文の多い料理店", "宮沢賢治", 9),
      new Book("雪国", "川端康成", 10),
      new Book("伊豆の踊子", "川端康成", 11),
      new Book("山月記", "中島敦", 12),
      new Book("走れメロス", "太宰治", 13),
      new Book("金閣寺", "三島由紀夫", 14),
      new Book("潮騒", "三島由紀夫", 15),
      new Book("風立ちぬ", "堀辰雄", 16),
      new Book("永遠の0", "百田尚樹", 17),
      new Book("海賊とよばれた男", "百田尚樹", 18),
      new Book("火花", "又吉直樹", 19),
      new Book("夜は短し歩けよ乙女", "森見登美彦", 20),
      new Book("鹿男あをによし", "万城目学", 21),
      new Book("博士の愛した数式", "小川洋子", 22),
      new Book("告白", "湊かなえ", 23),
      new Book("嫌われる勇気", "岸見一郎・古賀史健", 24),
      new Book("ビブリア古書堂の事件手帖", "三上延", 25),
      new Book("プログラミング言語Java", "James Gosling, Bill Joy, Guy Steele", 26),
      new Book("イノベーションのジレンマ", "Clayton M. Christensen", 27),
      new Book("コンピュータシステムの理論と実装", "Harvey M. Deitel", 28),
      new Book("自分を変える習慣力", "ロバート・マウラー", 29),
      new Book("プログラミングの基礎", "David Flanagan", 30),
      new Book("リーダブルコード", "Dustin Boswell, Trevor Foucher", 31),
      new Book("クリーンアーキテクチャ", "Robert C. Martin", 32),
      new Book("ゼロから作るDeep Learning", "斎藤 康毅", 33),
      new Book("改訂版 プログラミング言語C", "Brian W. Kernighan, Dennis M. Ritchie", 34),
      new Book("ソフトウェアエンジニアのためのテスト駆動開発", "Kent Beck", 35),
      new Book("モダンJavaScript", "Dustin Boswell", 36),
      new Book("デザインパターン", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", 37),
      new Book("コードコンプリート", "Steve McConnell", 38),
      new Book("アジャイルサムライ", "Jonathan Rasmusson", 39),
      new Book("実践テスト駆動開発", "Kent Beck", 40),
      new Book("プロフェッショナルシステムアーキテクチャ", "Len Bass, Paul Clements", 41),
      new Book("エンジニアリング数学", "K.A. Stroud", 42),
      new Book("コンピュータネットワーク", "Andrew S. Tanenbaum", 43),
      new Book("データベース実践", "デイヴィッド・サルシェ", 44),
      new Book("体系的に学ぶデータ構造とアルゴリズム", "中山 学", 45),
      new Book("セキュアプログラミング", "Mark G. Graff, Kenneth R. van Wyk", 46),
      new Book("ビジネスモデル・ジェネレーション", "Alexander Osterwalder, Yves Pigneur", 47),
      new Book("クラウドアーキテクチャ設計", "Sam Newman", 48),
      new Book("トライアングルストラテジー", "原田 卓也", 49),
      new Book("マネジメントの基本", "ピーター・ドラッカー", 50)
  );

  //一覧表示
  public void showBooks() {
    Message.makeLine();
    bookList
        .forEach(book ->
            System.out.println(
                "タイトル ： " + book.getTitle()
                    + " 著者名 : " + book.getAuthor()
                    + " 管理番号 : " + book.getNumber()
            )
        );
    Message.makeLine();
  }

  //タイトル検索してリスト化
  public void searchBookTitle(String title) {
    List<Book> searchBookTitle = bookList.stream()
        .filter(book -> book.getTitle().contains(title))
        .toList();

    printResult(searchBookTitle);
  }

  //著者名検索してリスト化
  public void searchBookAuthor(String author) {
    List<Book> searchBookAuthor = bookList.stream()
        .filter(book -> book.getAuthor().contains(author))
        .toList();

    printResult(searchBookAuthor);
  }

  //番号検索してリスト化
  public void searchBookNumber(String number) {
    if(CheckData.isNumber(number)){
      List<Book> searchBookNumber = bookList.stream()
          .filter(book -> Integer.parseInt(number) == book.getNumber())
          .toList();
      printResult(searchBookNumber);
    }else{
      System.out.println("正しい入力がされていません。番号検索では数字を入力してください。");
    }
  }

  //検索結果の出力
  public void printResult(List<Book> searchedBooks) {
    if (searchedBooks.isEmpty()) {
      Message.makeLine();
      System.out.println("検索対象が見つかりませんでした。");
      Message.makeLine();

    } else {
      Message.makeLine();
      System.out.println(searchedBooks.size() + "件見つかりました。");
      searchedBooks
          .forEach(book ->
              System.out.println(
                  "タイトル ： " + book.getTitle()
                      + " 著者名 : " + book.getAuthor()
                      + " 管理番号 : " + book.getNumber()
              )
          );
      Message.makeLine();
    }
  }
}
