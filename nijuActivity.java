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

public class nijuActivity extends AppCompatActivity {

    private EditText editText;
    private String message;
    private String message2;
    private String message3;
    private String fileName = "name";
    private String fileName2= "now";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niju);


        Intent intent = getIntent();
        message = intent.getStringExtra(tuikaActivity.EXTRA_MESSAGE);
        TextView View = findViewById(R.id.text_view1);
        String str = readFile(fileName);
        if (str != null) {
            View.setText(str);

        }
        editText = findViewById(R.id.edit_text);


        Intent intent2 = getIntent();
        message2 = intent2.getStringExtra(tuika2Activity.name);
        TextView View2 = findViewById(R.id.view2);
        String str2 = readFile2(fileName2);
        if (str2 != null) {
            View2.setText(str2);
        }
        editText = findViewById(R.id.edit_text2);


        Intent intent3 = getIntent();
        message3 = intent3.getStringExtra(tuika3Activity.a);
        TextView View3 = findViewById(R.id.view3);
        View3.setText(message3);
        editText = findViewById(R.id.edit_text3);


        //追加
        Button button1 = findViewById(R.id.text_view1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), tuikaActivity.class);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.view2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplication(), tuika2Activity.class);
                startActivity(intent2);
            }
        });
        Button button3 = findViewById(R.id.view3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplication(), tuika3Activity.class);
                startActivity(intent3);
            }
        });

        Button button9 = findViewById(R.id.modoru);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
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
    public String readFile2(String now) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(now);
             BufferedReader reader= new BufferedReader(
                     new InputStreamReader(fileInputStream, StandardCharsets.UTF_8))) {

            String lineBuffer;
            while( (lineBuffer = reader.readLine()) != null ) {
                text = lineBuffer ;
            }

        } catch (IOException c) {
            c.printStackTrace();
        }

        return text;
    }
}
