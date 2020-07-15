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

public class nissuuActivity extends AppCompatActivity {

        private EditText editText;
        private String kou = "nen";
        private String rou = "tuki";
        private String cow = "niti";
        private String message;
        private String fileName = "name";




        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_nissuu);

                double d = 52.59;

                Intent intent = getIntent();
                message = intent.getStringExtra(tuikaActivity.EXTRA_MESSAGE);
                TextView View = findViewById(R.id.text_view1);
                String str = readFile(fileName);
                if (str != null) {
                        View.setText(str);

                }
                editText = findViewById(R.id.edit_text);

                String nen = readFile3(kou);
                int a = Integer.parseInt(nen);

                String tuki = readFile4(rou);
                int b = Integer.parseInt(tuki);

                String niti = readFile5(cow);
                int c = Integer.parseInt(niti);



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
                                Intent intent = new Intent(getApplication(), tuikaActivity.class);
                                startActivity(intent);
                        }
                });
        }

        public String readFile(String name) {
                String text = null;

                // try-with-resources
                try (FileInputStream fileInputStream = openFileInput(name);
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
        public String readFile3(String nen) {
                String text = null;

                // try-with-resources
                try (FileInputStream fileInputStream = openFileInput(nen);
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
        public String readFile4(String tuki) {
                String text = null;

                // try-with-resources
                try (FileInputStream fileInputStream = openFileInput(tuki);
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
        public String readFile5(String niti) {
                String text = null;

                // try-with-resources
                try (FileInputStream fileInputStream = openFileInput(niti);
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
