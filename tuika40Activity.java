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


public class tuika40Activity extends AppCompatActivity {

    public static final String age40
            = "com.test.rei.MESSAGE";

    private TextView textView;
    private String fileName40 = "name40";
    static final int RESULT_SUBACTIVITY = 1000;
    private String kou40 = "nen40";
    private String rou40 = "tuki40";
    private String cow40 = "niti40";
    private String buu40 = "nenrei40";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuika40);

        final EditText editText = findViewById(R.id.edit_text);
        String str = readFile40(fileName40); // 該当するActivityの起動時にファイル"fileName"に入っている文字列を読み込む
        if (str != null) {
            editText.setText(str);
        }



        final EditText nenText40 = findViewById(R.id.nen_text);
        String nen40 = readFile43(kou40);
        if (nen40 != null) {
            nenText40.setText(nen40);
        }

        final EditText tukiText40 = findViewById(R.id.tuki_text);
        String tuki40 = readFile44(rou40);
        if (tuki40 != null) {
            tukiText40.setText(tuki40);
        }

        final EditText nitiText40 = findViewById(R.id.niti_text);
        String niti40 = readFile45(cow40);
        if (tuki40 != null) {
            nitiText40.setText(niti40);
        }

        final EditText nenreiText40 = findViewById(R.id.tosi_text);
        String nenrei40 = readFile46(buu40);
        if (tuki40 != null) {
            nenreiText40.setText(nenrei40);
        }


        Button button = findViewById(R.id.kakutei);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), yonjuActivity.class);

                if (editText.getText() != null) {
                    String name40 = editText.getText().toString();
                    intent.putExtra(age40, name40);

                    startActivityForResult(intent, RESULT_SUBACTIVITY);
                    editText.setText("");
                    saveFile40(fileName40, name40);
                }


                String nen40 = nenText40.getText().toString();
                saveFile42(kou40, nen40);

                String tuki40 = tukiText40.getText().toString();
                saveFile44(rou40, tuki40);

                String niti40 = nitiText40.getText().toString();
                saveFile45(cow40, niti40);

                String nenrei40 = nenreiText40.getText().toString();
                saveFile46(buu40, nenrei40);
            }
        });


        Button button2 = findViewById(R.id.nissu);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), nissuu40Activity.class);
                startActivity(intent);
            }
        });
    }






    public void saveFile40(String name40, String str) {

        // try-with-resources
        try (FileOutputStream fileOutputstream = openFileOutput(name40,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    public void saveFile42(String nen40, String str) {

        // try-with-resources
        try (FileOutputStream  fileOutputstream = openFileOutput(nen40,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFile44(String tuki40, String str) {

        // try-with-resources
        try (FileOutputStream  fileOutputstream = openFileOutput(tuki40,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFile45(String niti40, String str) {

        // try-with-resources
        try (FileOutputStream  fileOutputstream = openFileOutput(niti40,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFile46(String nenrei40, String str) {

        // try-with-resources
        try (FileOutputStream  fileOutputstream = openFileOutput(nenrei40,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }






    // ファイルを読み出し
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
    public String readFile46(String nenrei40) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(nenrei40);
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


