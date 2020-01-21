package app.myfirstproject.bestuniversitys;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPageActivity extends AppCompatActivity {

    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        btnlogin=findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                Intent intent=new Intent(LoginPageActivity.this,BestUniversitysActivity.class);
                startActivity(intent);
            }
        });

    }
}
