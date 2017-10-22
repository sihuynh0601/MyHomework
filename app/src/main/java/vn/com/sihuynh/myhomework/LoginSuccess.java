package vn.com.sihuynh.myhomework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by User on 15/10/2017.
 */

public class LoginSuccess extends AppCompatActivity {


        TextView txtNhan;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login_success);
            addControls();
            addEvent();
        }

        private void addControls() {
            txtNhan = (TextView) findViewById(R.id.txtNhan);

        }

        private void addEvent() {
            Intent intent = getIntent();
        }


}
