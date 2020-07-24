package com.example.goodbam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Signup2Activity extends AppCompatActivity {

    private Button  btn_signup;
    private ImageButton btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btn_back = findViewById(R.id.signup2_btn_back);
        btn_signup = findViewById(R.id.signup2_btn_signup);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"아직 미구현",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Signup2Activity.this,Signup1Activity.class);
                startActivity(intent);
            }
        });
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"아직 미구현",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Signup2Activity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}