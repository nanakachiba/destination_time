package com.test.rei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tuika3Activity extends AppCompatActivity {

    public static final String a
            = "com.test.rei.a";

    private TextView textView;
    static final int ACTIVITY = 1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuika3);


        final EditText editText3 = findViewById(R.id.edit_text3);

        Button button = findViewById(R.id.kakutei3);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplication(), nijuActivity.class);
                if (editText3.getText() != null) {
                    String str = editText3.getText().toString();
                    intent3.putExtra(a, str);
                }
                startActivityForResult(intent3, ACTIVITY);

                editText3.setText("");
            }
        });
    }
}