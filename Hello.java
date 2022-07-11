/*開発環境*/
https://www.oracle.com/java/technologies/downloads/                            //JDK
設定 → システム環境変数 → Path = C:\Program Files\Java\jdk-バージョン\bin
https://code.visualstudio.com/download                                         //VS Code
https://mergedoc.osdn.jp/                                                      //eclipse(一括)

/*基本*/
import パッケージ
public class クラス{
    public static void main(String[] args){
        処理
        return 戻り値;
    }
}

/*実行*/
> javac ファイル.java //コンパイル
> java ファイル       //実行

/*コメント*/
//コメント //単一行
/*         //複数行
コメント
*/

/*型*/
1   //整数(int)
1.0 //小数(double)
"A" //文字列(String)

/*変数*/
型 変数;   //宣言
変数 = 値; //代入
変数       //参照

/*配列*/
型 配列[];               //宣言
配列 = new 型[個数];
配列[インデックス] = 値; //代入
配列[インデックス]       //参照

/*演算子*/
+ //足し算・連結
- //引き算
* //掛け算
/ //割り算
% //余り
++ //インクリメント
-- //デクリメント
== //等しい
!= //異なる
< //小なり
<= //小なりイコール
> //大なり
>= //大なりイコール
&& //論理積
|| //論理和
! //論理否定

/*分岐*/
if (条件){
    処理
}else if (条件){
    処理
}else{
    処理
}

/*ループ*/
for (型 変数 = 開始値; 変数 <= 終了値; 更新){ //範囲
    処理
    continue;
    break;
}
for (型 変数: 配列){                          //配列
    処理
    continue;
    break;
}
while (条件){                                 //条件
    処理
    continue;
    break;
}

/*パッケージ*/
java.lang
Integer
Integer.valueOf(値); //整数化

Double
Double.valueOf(値) //小数化

String
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

java.util
Scanner
Scanner 変数 = new Scanner(System.in);
変数.next(); //入力
