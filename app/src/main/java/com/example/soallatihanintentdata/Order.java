package com.example.soallatihanintentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Order extends AppCompatActivity implements View.OnClickListener {

    Button order;
    EditText nama,alamat,pesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_order);

        order = (Button) findViewById (R.id.btn_order);
        order.setOnClickListener (this);

        nama = (EditText) findViewById (R.id.et_nama);
        alamat = (EditText) findViewById (R.id.et_alamat);
        pesanan = (EditText) findViewById (R.id.et_pesanan);



        if(getIntent().hasExtra("yourImage")) {
            ImageView iv;
            iv = (ImageView) findViewById (R.id.iv_logo);
            int gambar = getIntent ().getIntExtra ("yourImage", 0);
            iv.setImageResource (gambar);
        }

        if(getIntent().hasExtra("Judul")) {
            TextView tv;
            tv = (TextView) findViewById (R.id.tv_logo);
            String judul = getIntent ().getStringExtra ("Judul" );
            tv.setText (judul);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId ()){
            case R.id.btn_order:
                inputan ( nama.getText ().toString (),alamat.getText ().toString (),pesanan.getText ().toString ());
            break;

        }

    }

    private void inputan(String nama,String alamat,String pesanan){
        Intent moveIntent3 = new Intent (Order.this, Detil_Order.class);
        moveIntent3.putExtra("nama",nama);
        moveIntent3.putExtra("alamat",alamat);
        moveIntent3.putExtra("pesanan",pesanan);
        startActivity (moveIntent3);
    }
}
