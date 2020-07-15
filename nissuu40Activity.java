package com.test.rei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class nissuu40Activity extends AppCompatActivity {

    private EditText editText;
    private String kou40 = "nen40";
    private String rou40 = "tuki40";
    private String cow40 = "niti40";
    private String message;
    private String fileName40 = "name40";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nissuu40);

        double d = 26.14;

        Intent intent = getIntent();
        message = intent.getStringExtra(tuika40Activity.age40);
        TextView View = findViewById(R.id.text_view1);
        String str = readFile40(fileName40);
        if (str != null) {
            View.setText(str);

        }
        editText = findViewById(R.id.edit_text);

        String nen40 = readFile43(kou40);
        int a = Integer.parseInt(nen40);

        String tuki40 = readFile44(rou40);
        int b = Integer.parseInt(tuki40);

        String niti40 = readFile45(cow40);
        int c = Integer.parseInt(niti40);



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
        String str2 = diff * d/100+"";
        textView2.setText( str2 );




        Button button = findViewById(R.id.modoru);
        button.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), tuika40Activity.class);
                startActivity(intent);
            }
        });
    }

    public String readFile40(String name40) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(name40);
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
    public String readFile43(String nen40) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(nen40);
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
    public String readFile44(String tuki40) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(tuki40);
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
    public String readFile45(String niti40) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(niti40);
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

