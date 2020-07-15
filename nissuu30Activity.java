package com.test.rei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;

public class nissuu30Activity extends AppCompatActivity {

    private EditText editText;
    private String kou30 = "nen30";
    private String rou30 = "tuki30";
    private String cow30 = "niti30";
    private String message;
    private String fileName30 = "name30";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nissuu30);

        double e = 36.70;

        Intent intent = getIntent();
        message = intent.getStringExtra(tuika30Activity.wow);
        TextView View = findViewById(R.id.text_view1);
        String str = readFile30(fileName30);
        if (str != null) {
            View.setText(str);

        }
        editText = findViewById(R.id.edit_text);

        String nen30 = readFile33(kou30);
        int a = Integer.parseInt(nen30);

        String tuki30 = readFile34(rou30);
        int b = Integer.parseInt(tuki30);

        String niti30 = readFile35(cow30);
        int c = Integer.parseInt(niti30);



        Calendar calendar1 = Calendar.getInstance();
        // Month 値は 0 から始まるためMonth-1にする
        calendar1.set(a, b-1, c);

        // 1970/1/1 から設定した calendar1 のミリ秒
        long timeMillis1 = calendar1.getTimeInMillis();

        // 現在時刻のミリ秒
        long currentTimeMillis = System.currentTimeMillis();

        // 差分のミリ秒
        long diff = timeMillis1 - currentTimeMillis;

        // ミリ秒から秒へ変換
        diff = diff / 1000;
        // minutes
        diff = diff / 60;
        // hour
        diff = diff / 60;
        // day
        diff = diff / 24;

        TextView textView = findViewById(R.id.text_view2);
        String str1 = String.valueOf(diff);
        textView.setText( str1 );

        TextView textView2 = findViewById(R.id.text_view3);
        String str2 = diff * e/100+"";
        textView2.setText( str2 );




        Button button = findViewById(R.id.modoru);
        button.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), tuika30Activity.class);
                startActivity(intent);
            }
        });
    }

    public String readFile30(String name30) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(name30);
             BufferedReader reader= new BufferedReader(
                     new InputStreamReader(fileInputStream, StandardCharsets.UTF_8))) {

            String lineBuffer;
            while( (lineBuffer = reader.readLine()) != null ) {
                text = lineBuffer ;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }
    public String readFile33(String nen30) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(nen30);
             BufferedReader reader = new BufferedReader(
                     new InputStreamReader(fileInputStream, StandardCharsets.UTF_8))) {

            String lineBuffer;
            while ((lineBuffer = reader.readLine()) != null) {
                text = lineBuffer;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }
    public String readFile34(String tuki30) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(tuki30);
             BufferedReader reader = new BufferedReader(
                     new InputStreamReader(fileInputStream, StandardCharsets.UTF_8))) {

            String lineBuffer;
            while ((lineBuffer = reader.readLine()) != null) {
                text = lineBuffer;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }
    public String readFile35(String niti30) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(niti30);
             BufferedReader reader = new BufferedReader(
                     new InputStreamReader(fileInputStream, StandardCharsets.UTF_8))) {

            String lineBuffer;
            while ((lineBuffer = reader.readLine()) != null) {
                text = lineBuffer;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }
}