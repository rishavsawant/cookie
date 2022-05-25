package com.example.cookies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void eaten(View view){
        TextView t=findViewById(R.id.status_text_view);
        ImageView i=findViewById(R.id.android_cookie_image_view);
        i.setImageResource(R.drawable.after_cookie);
        t.setText("I'm so full");

    }

}