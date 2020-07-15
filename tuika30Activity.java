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



public class tuika30Activity extends AppCompatActivity {

    public static final String wow
            = "com.test.rei.MESSAGE";

    private TextView textView;
    private String fileName30 = "name30";
    static final int RESULT_SUBACTIVITY = 1000;
    private String kou30 = "nen30";
    private String rou30 = "tuki30";
    private String cow30 = "niti30";
    private String buu30 = "nenrei30";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuika30);

        final EditText editText = findViewById(R.id.edit_text);
        String str = readFile30(fileName30); // 該当するActivityの起動時にファイル"fileName"に入っている文字列を読み込む
        if (str != null) {
            editText.setText(str);
        }



        final EditText nenText30 = findViewById(R.id.nen_text);
        String nen30 = readFile33(kou30);
        if (nen30 != null) {
            nenText30.setText(nen30);
        }

        final EditText tukiText30 = findViewById(R.id.tuki_text);
        String tuki30 = readFile34(rou30);
        if (tuki30 != null) {
            tukiText30.setText(tuki30);
        }

        final EditText nitiText30 = findViewById(R.id.niti_text);
        String niti30 = readFile35(cow30);
        if (tuki30 != null) {
            nitiText30.setText(niti30);
        }

        final EditText nenreiText30 = findViewById(R.id.tosi_text);
        String nenrei30 = readFile36(buu30);
        if (tuki30 != null) {
            nenreiText30.setText(nenrei30);
        }


        Button button = findViewById(R.id.kakutei);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), sanjuActivity.class);

                if (editText.getText() != null) {
                    String name30 = editText.getText().toString();
                    intent.putExtra(wow, name30);

                    startActivityForResult(intent, RESULT_SUBACTIVITY);
                    editText.setText("");
                    saveFile30(fileName30, name30);
                }


                String nen30 = nenText30.getText().toString();
                saveFile32(kou30, nen30);

                String tuki30 = tukiText30.getText().toString();
                saveFile34(rou30, tuki30);

                String niti30 = nitiText30.getText().toString();
                saveFile35(cow30, niti30);

                String nenrei30 = nenreiText30.getText().toString();
                saveFile36(buu30, nenrei30);
            }
        });


        Button button2 = findViewById(R.id.nissu);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), nissuu30Activity.class);
                startActivity(intent);
            }
        });
    }






    public void saveFile30(String name30, String str) {

        // try-with-resources
        try (FileOutputStream  fileOutputstream = openFileOutput(name30,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    public void saveFile32(String nen30, String str) {

        // try-with-resources
        try (FileOutputStream  fileOutputstream = openFileOutput(nen30,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFile34(String tuki30, String str) {

        // try-with-resources
        try (FileOutputStream  fileOutputstream = openFileOutput(tuki30,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFile35(String niti30, String str) {

        // try-with-resources
        try (FileOutputStream  fileOutputstream = openFileOutput(niti30,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFile36(String nenrei30, String str) {

        // try-with-resources
        try (FileOutputStream  fileOutputstream = openFileOutput(nenrei30,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }






    // ファイルを読み出し
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
    public String readFile36(String nenrei30) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(nenrei30);
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