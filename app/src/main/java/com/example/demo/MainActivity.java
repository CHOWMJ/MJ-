package com.example.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.demo.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

             ImageView imav1 =(ImageView)this.findViewById(R.id.voice_get_query);
             imav1.setOnClickListener(new View.OnClickListener() {
                 @Override
                    public void onClick(android.view.View view) {
                    Intent intent =new Intent(MainActivity.this,queryActivity.class);
                    startActivity(intent);
             }
        });

        TextView textView1 =(TextView)this.findViewById(R.id.txt_start_query);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent =new Intent(MainActivity.this,query2Activity.class);
                EditText editText = (EditText) findViewById(R.id.edt_key_word);
                String message = editText.getText().toString();
                intent.putExtra(EXTRA_MESSAGE,message);
                startActivity(intent);

            }
        });
    }
}