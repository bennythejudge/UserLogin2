package android.benedetto.com.userlogin2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editEmail;
    private EditText editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEmail = findViewById(R.id.email);
        editPassword = findViewById(R.id.password);

        findViewById(R.id.button_login).setOnClickListener(this);
        findViewById(R.id.textViewRegister).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button_login:
                userLogin();
                break;
            case R.id.textViewRegister:
                break;
        }
    }


    private void userLogin() {
        String email = editEmail.getText().toString().trim();
        String password = editPassword.getText().toString().trim();

    }

}
