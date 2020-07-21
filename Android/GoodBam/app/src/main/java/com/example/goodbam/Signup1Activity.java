package com.example.goodbam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Signup1Activity extends AppCompatActivity {

    private EditText et_id, et_name, et_pass1, et_pass2;
    private Button btn_idcheck, btn_next;
    private ImageButton btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up1);

        et_id = findViewById(R.id.signup_et_id);
        et_name = findViewById(R.id.signup_et_name);
        et_pass1 = findViewById(R.id.signup_et_pw1);
        et_pass2 = findViewById(R.id.signup_et_pw2);

        btn_back = findViewById(R.id.signup_btn_back);
        btn_idcheck = findViewById(R.id.signup_btn_idcheck);
        btn_next = findViewById(R.id.signup_btn_next);

        // 뒤로가기 버튼
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup1Activity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        btn_idcheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"아직 미구현",Toast.LENGTH_SHORT).show();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"아직 미구현",Toast.LENGTH_SHORT).show();
            }
        });


    }
}