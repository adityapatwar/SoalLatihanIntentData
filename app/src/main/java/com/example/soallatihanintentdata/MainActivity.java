package com.example.soallatihanintentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    View menu_gomart,menu_goride,menu_gofood,go_send;
    int[] GAMBAR = {R.drawable.menu_gomart,R.drawable.menu_goride,R.drawable.menu_gofood,R.drawable.menu_gosend};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        menu_gomart =(View) findViewById (R.id.v_menugomart);
        menu_gomart.setOnClickListener (this);

        menu_goride =(View) findViewById (R.id.v_menugoride);
        menu_goride.setOnClickListener (this);

        menu_gofood =(View) findViewById (R.id.v_menugofood);
        menu_gofood.setOnClickListener (this);

        go_send =(View) findViewById (R.id.v_menugosend);
        go_send.setOnClickListener (this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId ()) {

            case R.id.v_menugomart:
                Intent moveIntent1 = new Intent (MainActivity.this, Order.class);
                moveIntent1.putExtra("yourImage",GAMBAR[0]);
                moveIntent1.putExtra("Judul","ORDER MART");
                startActivity (moveIntent1);
                break;
            case R.id.v_menugoride:
                Intent moveIntent2 = new Intent (MainActivity.this, Order.class);
                moveIntent2.putExtra("yourImage",GAMBAR[1]);
                moveIntent2.putExtra("Judul","ORDER RIDE");
                startActivity (moveIntent2);
                break;
            case R.id.v_menugofood:
                Intent moveIntent3 = new Intent (MainActivity.this, Order.class);
                moveIntent3.putExtra("yourImage",GAMBAR[2]);
                moveIntent3.putExtra("Judul","ORDER FOOD");
                startActivity (moveIntent3);
                break;
            case R.id.v_menugosend:
                Intent moveIntent4 = new Intent (MainActivity.this, Order.class);
                moveIntent4.putExtra("yourImage",GAMBAR[3]);
                moveIntent4.putExtra("Judul","ORDER SEND");
                startActivity (moveIntent4);
                break;
        }

    }
}
