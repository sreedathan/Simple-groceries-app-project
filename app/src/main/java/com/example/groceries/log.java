package com.example.groceries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class log extends AppCompatActivity {
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);
        button=(Button)findViewById(R.id.login2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {
                    Toast.makeText(log.this,"LOGIN SUCCESSFUL!HAPPY SHOPPING",Toast.LENGTH_SHORT).show();
                    openMainActivity();
                }
                else
                {
                    Toast.makeText(log.this,"Unauthorized Access!!!",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    public  void openMainActivity()
    {
        Intent loginintent=new Intent(this,MainActivity.class);
        startActivity(loginintent);
    }
}