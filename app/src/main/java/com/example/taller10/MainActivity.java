package com.example.taller10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    String urlFb="https://www.facebook.com/";
    String urlIn="https://www.instagram.com/";
    String urlTw="https://twitter.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    public void Instagram(View view){
        Uri linkIn = Uri.parse(urlIn);
        Intent Ii= new Intent(Intent.ACTION_VIEW, linkIn);
        startActivity(Ii);
    }

    public void Facebook(View view){
        Uri linkFb= Uri.parse(urlFb);
        Intent iF= new Intent(Intent.ACTION_VIEW,linkFb);
        startActivity(iF);
    }

    public void  Twitter(View view){
        Uri linkTw = Uri.parse(urlTw);
        Intent It= new Intent(Intent.ACTION_VIEW, linkTw);
        startActivity(It);
    }

    public void Inicio(View view){
        Intent InicioC = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(InicioC);
    }
}