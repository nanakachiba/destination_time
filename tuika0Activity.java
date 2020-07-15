package com.test.rei;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class tuika0Activity extends AppCompatActivity {

    public static final String pulupulu
            = "com.test.rei.MESSAGE";

    private TextView textView;
    private String fileName100 = "now100";
    static final int SUBACTIVITY = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuika0);

        final EditText editText2 = findViewById(R.id.edit_text2);

        String str2 = readFile200(fileName100); // 該当するActivityの起動時にファイル"fileName"に入っている文字列を読み込む
        if (str2 != null) {
            editText2.setText(str2);
        }



        Button button2 = findViewById(R.id.kakutei100);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplication(), juumimanActivity.class);


                if (editText2.getText() != null) {
                    String now100 = editText2.getText().toString();
                    intent2.putExtra(pulupulu, now100);

                    startActivityForResult(intent2, SUBACTIVITY);
                    editText2.setText("");
                    saveFile100(fileName100, now100);
                }
            }
        });
    }
    // ファイルを保存
    public void saveFile100(String now100, String str2) {

        // try-with-resources
        try (FileOutputStream fileOutputstream = openFileOutput(now100,
                Context.MODE_PRIVATE);) {

            fileOutputstream.write(str2.getBytes());

        } catch (IOException c) {
            c.printStackTrace();
        }
    }
    public String readFile200(String now200) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(now200);
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