/*

★開発環境
https://mergedoc.osdn.jp/
Pleiades All in One - Eclipse Java Full Edition 最新版
C:\Downloads\pleiades-????-??-java-win-64bit-jre_????????.exe
C:\pleiades\????-??\eclipse\eclipse.exe
タスクバーにピン留め

★プロジェクト
ファイル / 新規 / Springスターター・プロジェクト
☑Thymeleaf, Spring Web

★HTML
ファイル / 新規 / HTMLファイル
フォルダ: demo/src/main/resources/templates
ファイル: *.html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ページ名</title>
	</head>
	<body>
	
	</body>
</html>

★パッケージ
ファイル / 新規 / パッケージ
フォルダ: ​​demo/src/main/java
ファイル: com.example.demo.controller

★コントローラ
ファイル / 新規 / クラス
パッケージ: com.example.demo.controller
package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("hello/*")
@Controller
public class HelloController {
	@GetMapping("world")
	public String open(Model model) {
		String message = "初めてのSpring Boot！";
		model.addAttribute("value", message);
		return "HTMLファイル";
	}
}

★実行
demo[boot][devtools] / 実行 / Spring Boot アプリケーション
http://localhost:8080/hello/world

*/