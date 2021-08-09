package keyone.keytwo.lesson2_dz_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BlueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knopki_blue);

//        Intent i = new Intent(this,MainActivity.class);
//        startActivity(i);


        Button button_red;
        //определили кнопку
        button_red = findViewById(R.id.button_red);
        button_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BlueActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}