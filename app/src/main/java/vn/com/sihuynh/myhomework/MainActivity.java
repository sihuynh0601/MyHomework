package vn.com.sihuynh.myhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtName, txtEmail, txtPassword, txtPasswordConfirm;
    Button btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        addControls();
        addEvents();
    }
    private void addControls() {
        txtEmail = (TextView) findViewById(R.id.txtEmail);
        txtName = (TextView) findViewById(R.id.txtName);
        txtPassword = (TextView) findViewById(R.id.txtPassword);
        txtPasswordConfirm = (TextView) findViewById(R.id.txtPasswordConfirm);
        btnSignUp = (Button) findViewById(R.id.btnSignUp);
    }

    private void addEvents() {
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, "Hi, I'm An!");
                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent, "Chọn app để gửi tin nhắn"));
            }
        });
    }
}


