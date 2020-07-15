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


public class tuikaActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE
            = "com.test.rei.MESSAGE";

    private TextView textView;
    private String fileName = "name";
    static final int RESULT_SUBACTIVITY = 1000;
    private String kou = "nen";
    private String rou = "tuki";
    private String cow = "niti";
    private String buu = "nenrei";
    private String ji = "jikan";
    private String ma = "made";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuika);


        final EditText editText = findViewById(R.id.edit_text);
        String str = readFile(fileName); // 該当するActivityの起動時にファイル"fileName"に入っている文字列を読み込む
        if (str != null) {
            editText.setText(str);
        }



        final EditText nenText = findViewById(R.id.nen_text);
        String nen = readFile3(kou);
        if (nen != null) {
            nenText.setText(nen);
        }

        final EditText tukiText = findViewById(R.id.tuki_text);
        String tuki = readFile4(rou);
        if (tuki != null) {
            tukiText.setText(tuki);
        }

        final EditText nitiText = findViewById(R.id.niti_text);
        String niti = readFile5(cow);
        if (tuki != null) {
            nitiText.setText(niti);
        }

        final EditText nenreiText = findViewById(R.id.tosi_text);
        String nenrei = readFile6(buu);
        if (tuki != null) {
            nenreiText.setText(nenrei);
        }

        final EditText jikanText = findViewById(R.id.jikan_text);
        String jikan = readFile7(ji);
        if (jikan != null) {
            jikanText.setText(jikan);
        }

        final EditText madeText = findViewById(R.id.made_text);
        String made = readFile8(ma);
        if (made != null) {
            madeText.setText(made);
        }


        Button button = findViewById(R.id.kakutei);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), nijuActivity.class);

                if (editText.getText() != null) {
                    String name = editText.getText().toString();
                    intent.putExtra(EXTRA_MESSAGE, name);

                    startActivityForResult(intent, RESULT_SUBACTIVITY);
                    editText.setText("");
                    saveFile(fileName, name);
                }


                String nen = nenText.getText().toString();
                saveFile2(kou, nen);

                String tuki = tukiText.getText().toString();
                saveFile4(rou, tuki);

                String niti = nitiText.getText().toString();
                saveFile5(cow, niti);

                String nenrei = nenreiText.getText().toString();
                saveFile6(buu, nenrei);

                String jikan = jikanText.getText().toString();
                saveFile7(ji, jikan);

                String made = madeText.getText().toString();
                saveFile8(ma ,made);
            }
        });


        Button button2 = findViewById(R.id.nissu);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), nissuuActivity.class);
                startActivity(intent);
            }
        });
    }






    public void saveFile(String name, String str) {

        // try-with-resources
        try (FileOutputStream  fileOutputstream = openFileOutput(name,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    public void saveFile2(String nen, String str) {

        // try-with-resources
        try (FileOutputStream  fileOutputstream = openFileOutput(nen,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFile4(String tuki, String str) {

        // try-with-resources
        try (FileOutputStream  fileOutputstream = openFileOutput(tuki,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFile5(String niti, String str) {

        // try-with-resources
        try (FileOutputStream  fileOutputstream = openFileOutput(niti,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFile6(String nenrei, String str) {

        // try-with-resources
        try (FileOutputStream  fileOutputstream = openFileOutput(nenrei,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void saveFile7(String jikan, String str) {

        // try-with-resources
        try (FileOutputStream  fileOutputstream = openFileOutput(jikan,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void saveFile8(String made, String str) {

        // try-with-resources
        try (FileOutputStream  fileOutputstream = openFileOutput(made,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    // ファイルを読み出し
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
    public String readFile6(String nenrei) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(nenrei);
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
    public String readFile7(String jikan) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(jikan);
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
    public String readFile8(String made) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(made);
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