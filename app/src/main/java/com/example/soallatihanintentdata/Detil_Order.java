package com.example.soallatihanintentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detil_Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_detil__order);

        if(getIntent().hasExtra("nama")) {
            TextView tv;
            tv = (TextView) findViewById (R.id.tv_nama);
            String nama = getIntent ().getStringExtra ("nama" );
            tv.setText (nama);
        }

        if(getIntent().hasExtra("alamat")) {
            TextView tv;
            tv = (TextView) findViewById (R.id.tv_alamat);
            String alamat = getIntent ().getStringExtra ("alamat" );
            tv.setText (alamat);
        }

        if(getIntent().hasExtra("pesanan")) {
            TextView tv;
            tv = (TextView) findViewById (R.id.tv_pesanan);
            String pesanan = getIntent ().getStringExtra ("pesanan" );
            tv.setText (pesanan);
        }
    }
}
