//コメント
import ファイル.メソッド
public class ファイル {
    public static void main(String[] args) {
        処理
    }
}

> javac ファイル.java
> java ファイル

Integer
Double
String
ArrayList

var 変数 = 値;
変数 = 値;
変数

+ - * / %
== != < <= > >=
&& || !

if (条件) {
    処理
}
else if (条件) {
    処理
}
else {
    処理
}

for (型 変数 = 開始値; 変数 <= 終了値; 更新) {
    処理
    continue;
    break;
}
for (型 変数: 配列) {
    処理
    continue;
    break;
}
while (条件) {
    処理
    continue;
    break;
}

java.lang
Integer.valueOf(値); //整数化
Double.valueOf(値) //小数化
String.valueOf(値); //文字列化
文字列.subString(インデックス, インデックス) //抽出
文字列.length() //文字数
文字列.contains("文字列") //包含
文字列.replace(前, 後) //置換
文字列.startsWith(文字列) //先頭一致
文字列.endsWith(文字列) //末尾一致
文字列.toLowerCase() //小文字化
文字列.toUpperCase() //大文字化
文字列.split(区切り文字) //分割
Math.PI //円周率
Math.pow(基数, 指数) //累乗
Math.sqrt(数値) //平方根
Math.round(数値) //四捨五入
Math.ceil(数値) //切り上げ
Math.floor(数値) //切り捨て
Math.abs(数値) //絶対値
Math.max(数値, 数値) //最大値
Math.min(数値, 数値) //最小値

public class Input {
    public static void main(String[] args) {
        var a = new java.util.Scanner(System.in);
        var b = a.nextLine();
        System.out.println(b);
    }
}

public class Output {
    public static void main(String[] args) {
        var a = "Hello World";
        System.out.println(a);
    }
}

public class Datetime {
    public static void main(String[] args) {
        while (true) {
            var a = new java.util.Date();
            var b = new java.text.SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
            var c = b.format(a);
            System.out.println(c);
        }
    }
}
