package com.example.res;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView textView;
private ImageView imageView;
private ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        imageView=findViewById(R.id.imageView);
        imageButton=findViewById(R.id.imageButton1);
        textView=findViewById(R.id.textView1);
        imageButton=findViewById(R.id.imageButton2);
        textView=findViewById(R.id.textView2);
        imageButton=findViewById(R.id.imageButton3);
        textView=findViewById(R.id.textView3);
        imageButton=findViewById(R.id.imageButton4);
        textView=findViewById(R.id.textView4);
        imageButton=findViewById(R.id.imageButton5);
        textView=findViewById(R.id.textView5);
        imageButton=findViewById(R.id.imageButton6);
        textView=findViewById(R.id.textView6);
        imageButton=findViewById(R.id.imageButton7);
        textView=findViewById(R.id.textView7);
        imageButton=findViewById(R.id.imageButton8);
        textView=findViewById(R.id.textView8);
        imageButton=findViewById(R.id.imageButton9);
        textView=findViewById(R.id.textView9);
        imageButton=findViewById(R.id.imageButton10);
        textView=findViewById(R.id.textView10);
        imageButton=findViewById(R.id.imageButton11);
        textView=findViewById(R.id.textView11);
        imageButton=findViewById(R.id.imageButton12);
        textView=findViewById(R.id.textView12);












        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              textView.setText("American Restaurant");
            }
        });
    }
}