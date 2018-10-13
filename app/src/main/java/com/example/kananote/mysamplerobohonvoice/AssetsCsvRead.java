package com.example.kananote.mysamplerobohonvoice;

import android.content.res.Resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Assetsに入っているcsvファイルを読み込むためのClass
 */
public class AssetsCsvRead {
    private Resources resources = null;

    public AssetsCsvRead(Resources resources) {
        this.resources = resources;
    }

    public Map<String, Map<String,String>> InputCsvFile(String csv) {

        Map<String, Map<String, String>> outDataArray = null;

        try {

            //assetファイルにあるcsvファイルの読み込み
            InputStream inputStream = resources.getAssets().open(csv);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


            //outFileの準備
            outDataArray = new HashMap<String, Map<String,String>>();


            //csvの列名を取得
            ArrayList<String> csvColumnArray = new ArrayList<String>();
            //csvの最初の一行を読み取り列名を取得
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), ",");

            int column = stringTokenizer.countTokens();
            for(int i=0; i<column; i++ ){
                csvColumnArray.add(stringTokenizer.nextToken());
            }

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringTokenizer = new StringTokenizer(line, ",");

                String Key = stringTokenizer.nextToken();
                outDataArray.put(Key, new HashMap<String, String>());
                for(int i=1; i < csvColumnArray.size(); i++){
                    outDataArray.get(Key).put(csvColumnArray.get(i), stringTokenizer.nextToken());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return outDataArray;
    }
}
