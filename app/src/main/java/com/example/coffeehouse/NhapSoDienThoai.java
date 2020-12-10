package com.example.coffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class NhapSoDienThoai extends AppCompatActivity {

    ImageView quaylai_nhapsodienthoai_229;
    EditText nhapsodienthoai3_229;
    Button btntieptuc_229;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_so_dien_thoai);

        quaylai_nhapsodienthoai_229 = (ImageView) findViewById(R.id.quaylai_nhapsodienthoai_229);
        quaylai_nhapsodienthoai_229.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });
        nhapsodienthoai3_229 = (EditText) findViewById(R.id.nhapsodienthoai3_229);
        btntieptuc_229 = (Button) findViewById(R.id.btntieptuc_229);
        btntieptuc_229.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = nhapsodienthoai3_229.getText().toString();
                if(str1.length()==0){
                    Toast.makeText(NhapSoDienThoai.this, "Bạn chưa điền. Mời nhập lại",Toast.LENGTH_LONG).show();
                }else if(str1.length()>10){
                    Toast.makeText(NhapSoDienThoai.this, "Không được nhập trên 10 kí tự",Toast.LENGTH_LONG).show();
                }
                else if(str1.length()<10){
                    Toast.makeText(NhapSoDienThoai.this, "Bạn chưa nhập đủ 10 kí tự",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(NhapSoDienThoai.this, "Tiếp tục",Toast.LENGTH_LONG).show();
                    openNhapMaXacThuc();
                }
            }
        });
    }
    public void openLogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
        finish();
    }

    public void openNhapMaXacThuc() {
        Intent intent = new Intent(this, NhapMaXacThuc.class);
        startActivity(intent);
        finish();
    }
}