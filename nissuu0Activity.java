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

public class nissuu0Activity extends AppCompatActivity {

    private EditText editText;
    private String kou100 = "nen100";
    private String rou100 = "tuki100";
    private String cow100 = "niti100";
    private String message;
    private String fileName300 = "name100";

    double h = 85.63;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nissuu0);

        Intent intent = getIntent();
        message = intent.getStringExtra(tuika0Activity.pulupulu);
        TextView View = findViewById(R.id.text_view1);
        String str = readFile300(fileName300);
        if (str != null) {
            View.setText(str);
        }
        editText = findViewById(R.id.edit_text);

        String nen100 = readFile300(kou100);
        int a = Integer.parseInt(nen100);

        String tuki100 = readFile400(rou100);
        int b = Integer.parseInt(tuki100);

        String niti100 = readFile500(cow100);
        int c = Integer.parseInt(niti100);
        Calendar calendar1 = Calendar.getInstance();
        // Month 値は 0 から始まるためMonth-1にする
        calendar1.set(a, b - 1, c);

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
        textView.setText(str1);

        TextView textView2 = findViewById(R.id.text_view3);
        String str2 = diff * h / 100 + "";
        textView2.setText(str2);


        Button button = findViewById(R.id.modoru);
        button.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), tuika0Activity.class);
                startActivity(intent);
            }
        });
    }

    public String readFile300(String name100) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(name100);
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

    public String readFile330(String nen100) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(nen100);
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

    public String readFile400(String tuki100) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(tuki100);
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

    public String readFile500(String niti100) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(niti100);
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