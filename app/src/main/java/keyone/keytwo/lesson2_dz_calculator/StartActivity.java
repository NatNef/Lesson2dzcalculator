package keyone.keytwo.lesson2_dz_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    //на обработку кнопки
    Button buttonOpenCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        //определили кнопку
        buttonOpenCalculator = findViewById(R.id.buttonOpenCalculator);
        //повесили обработчик
        buttonOpenCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StartActivity.this,MainActivity.class);
                startActivity(i);
            }
        });



//        //намерение на запуск
//        Intent i = new Intent(this,MainActivity.class);
//        startActivity(i);
    }


}
