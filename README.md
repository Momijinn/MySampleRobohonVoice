# MySampleRobohonVoice
ロボホン(SR-01M)を簡単に動きながら喋らせるためのサンプルプログラム

## Description
ロボホンをassets内にあるcsvに読んでほしい文章やフレーズを入れるだけで読み上げて動作もつけられるアプリケーション

## Demo
[![](https://img.youtube.com/vi/4iOCr8tiFCE/0.jpg)](https://www.youtube.com/watch?v=4iOCr8tiFCE)

## Requirement
* 動作確認環境

    * ロボホンモデル
    
        * SR01MW
    
    * Androidバージョン
        
        * 5.0.2

## Usage
[MySampleRobohonVoice/app/src/main/assets](https://github.com/Momijinn/MySampleRobohonVoice/blob/master/app/src/main/assets/myVoice.csv)のディレクトリ下にCSVファイル(myVoice.csv)があるため，この中にID,NAME,PHRASEを追加または編集をする．

注意として，Microsoft Excelで編集すると文字化けがおきる．
そのため，エディタで変更を推奨する．

CSVファイルを編集すると，アプリ起動時にCSVファイルを読み込みディスプレイに表示される．

列名はID,NAME,PHRASEにしているが，変更や，行を追加，削除しても良い．
しかしその場合は，[MainActivity.java](https://github.com/Momijinn/MySampleRobohonVoice/blob/master/app/src/main/java/com/example/kananote/mysamplerobohonvoice/MainActivity.java)内にある表示するターゲットタグを編集する必要がある．
```java
    //ここを編集
    private String NameTag = "NAME";
    private String SentenceTag = "PHRASE";
```

### csvの説明
* ID
    
    1フレーズを識別するためのユニークな番号

* NAME
    
    喋らせたい文章の概要
    
* PHRASE

    ロボホンが喋る文章


## Install
appディレクトリ下に"jar"というディレクトリを作成後，ロボホンの喋らせるSDK(jp.co.sharp.android.voiceui.framework.jar)を置きリビルドする．

ロボホンの喋らせるSDKは，ロボホン開発サービスにてダウンロードできる．

また，SDKをダウンロードするにはココロプランに加入する必要である．

URL: https://robohon.com/service/cocoro.php

## Licence

本プログラムはSHARP様のサンプルプログラムをもとに開発をしています．

## Author
[Twitter](https://twitter.com/momijinn_aka)

[Blog](http://www.autumn-color.com/)