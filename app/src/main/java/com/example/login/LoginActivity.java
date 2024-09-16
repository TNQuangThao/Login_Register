package com.example.login;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText inpEmail, inpPW;
    private TextView TV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        TextView btn = findViewById(R.id.textSignUp);
        inpEmail=findViewById(R.id.inputEmail);
        inpPW=findViewById(R.id.inputPassword);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });

        TextView btn_Log= findViewById(R.id.btn_Login);
        TV = findViewById(R.id.textView8);
        btn_Log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = inpEmail.getText().toString();
                String PW = inpPW.getText().toString();
                //Log.i("Run test","Email: "+email+"\nPassword: "+PW);
                TV.setText("Email: "+email+"\nPassword: "+PW);
//                Tạo thông báo ra màn hình
//                AlertDialog.Builder mydialog= new AlertDialog.Builder(LoginActivity.this);
//                mydialog.setIcon(R.drawable.baseline_notifications_active_24);
//                mydialog.setTitle("Thông báo!");
//                mydialog.setMessage("EmGail: "+email+"\nPassword: "+PW);
//                mydialog.setNegativeButton("Đóng", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        closeOptionsMenu();
//                    }
//                });
//                mydialog.create().show();

            }
        });

    }
}