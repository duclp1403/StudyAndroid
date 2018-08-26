package com.example.jacky.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Khai Báo Biến
    EditText txtTaiKhoan, txtMatKhau;
    Button btnDangNhap,btnDangXuat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Ánh Xạ

        txtTaiKhoan = (EditText)findViewById(R.id.txtTaiKhoan);
        txtMatKhau = (EditText)findViewById(R.id.txtMatKhau);
        btnDangNhap = (Button)findViewById(R.id.btnDangNhap);
        btnDangXuat = (Button)findViewById(R.id.btnDangXuat);
        // Sự Kiện khi Click Đăng Nhập
        btnDangXuat.setVisibility(View.INVISIBLE);
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username= "admin";
                String pass= "123456";
                if(txtTaiKhoan.getText().toString().equals(username) && txtMatKhau.getText().toString().equals(pass))
                {
                    Toast.makeText(getApplicationContext(),"Đăng Nhập Thành Công",Toast.LENGTH_LONG).show();
                    btnDangXuat.setVisibility(View.VISIBLE);
                    btnDangNhap.setVisibility(View.INVISIBLE);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Đăng Nhập Không Thành Công",Toast.LENGTH_LONG).show();

                }
        btnDangXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Đã Đăng Xuất",Toast.LENGTH_LONG).show();
                btnDangXuat.setVisibility(View.INVISIBLE);
                btnDangNhap.setVisibility(View.VISIBLE);
            }
        });
            }
        });
    }
}
