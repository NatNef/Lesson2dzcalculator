package keyone.keytwo.lesson2_dz_calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private final String KEY = "key counter"; // создали ключ для сохранения данных
    private Counters counters = new Counters(); // для восстановления
    private final static String keyCounters = "Counters";
    Button buttonBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knopki);
        initView();
        //определили кнопку
        buttonBlue = findViewById(R.id.buttonBlue);
        //повесили обработчик
        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BlueActivity.class);
                startActivity(i);
            }
        });
    }


    // пользовательский элемент счетчика
            private TextView textCounter_1;
            private TextView textCounter_2;
            private TextView textCounter_3;
            private TextView textCounter_4;
            private TextView textCounter_5;
            private TextView textCounter_6;
            private TextView textCounter_7;
            private TextView textCounter_8;
            private TextView textCounter_9;
            private TextView textCounter_0;
            private TextView textCounter_plus;
            private TextView textCounter_minus;
            private TextView textCounter_delenie;
            private TextView textCounter_umnogenie;
            private TextView textCounter_ravno;
            private TextView textCounter_zp;

            // кнопки

            private Button button_1;
            private Button button_2;
            private Button button_3;
            private Button button_4;
            private Button button_5;
            private Button button_6;
            private Button button_7;
            private Button button_8;
            private Button button_9;
            private Button button_0;
            private Button button_plus;
            private Button button_minus;
            private Button button_delenie;
            private Button button_umnogenie;
            private Button button_ravno;
            //_____________________________________________
            // ДЗ 3
            // создаем onCreate
//            @Override
//            protected void onCreate(Bundle savedInstanceState) {
//                super.onCreate(savedInstanceState);
//                setContentView(R.layout.activity_knopki);
//                initView();
//
//            }



            // Получить пользовательский элемент по идентификатору
            private void initView() {
                textCounter_1 = findViewById(R.id.textView_1);
                textCounter_2 = findViewById(R.id.textView_2);
                textCounter_3 = findViewById(R.id.textView_3);
                textCounter_4 = findViewById(R.id.textView_4);
                textCounter_5 = findViewById(R.id.textView_5);
                textCounter_6 = findViewById(R.id.textView_6);
                textCounter_7 = findViewById(R.id.textView_7);
                textCounter_8 = findViewById(R.id.textView_8);
                textCounter_9 = findViewById(R.id.textView_9);
                textCounter_0 = findViewById(R.id.textView_0);
                textCounter_plus = findViewById(R.id.textView_plus);
                textCounter_minus = findViewById(R.id.textView_minus);
                textCounter_umnogenie = findViewById(R.id.textView_umnogenie);
                textCounter_delenie = findViewById(R.id.textView_delenie);
                textCounter_ravno = findViewById(R.id.textView_ravno);
                textCounter_zp = findViewById(R.id.textView_zp);


                button_1 = findViewById(R.id.button_1);
                button_2 = findViewById(R.id.button_2);
                button_3 = findViewById(R.id.button_3);
                button_4 = findViewById(R.id.button_4);
                button_5 = findViewById(R.id.button_5);
                button_6 = findViewById(R.id.button_6);
                button_7 = findViewById(R.id.button_7);
                button_8 = findViewById(R.id.button_8);
                button_9 = findViewById(R.id.button_9);
                button_0 = findViewById(R.id.button_0);
                button_plus = findViewById(R.id.button_plus);
                button_minus = findViewById(R.id.button_minus);
                button_umnogenie = findViewById(R.id.button_umnogenie);
                button_delenie = findViewById(R.id.button_delenie);
                button_ravno = findViewById(R.id.button_ravno);


                button_1.setOnClickListener(Listener);
                button_2.setOnClickListener(Listener);
                button_3.setOnClickListener(Listener);
                button_4.setOnClickListener(Listener);
                button_5.setOnClickListener(Listener);
                button_6.setOnClickListener(Listener);
                button_7.setOnClickListener(Listener);
                button_8.setOnClickListener(Listener);
                button_9.setOnClickListener(Listener);
                button_0.setOnClickListener(Listener);
                button_plus.setOnClickListener(Listener);
                button_minus.setOnClickListener(Listener);
                button_umnogenie.setOnClickListener(Listener);
                button_delenie.setOnClickListener(Listener);
                button_ravno.setOnClickListener(Listener);


            }


            public View.OnClickListener Listener = new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.button_1:
                            counters.increaseCounter_1();
                            textCounter_1.setText(String.format("увеличивает %d", counters.getCounter_1()));
                            break;
                        case R.id.button_2:
                            counters.increaseCounter_2();
                            textCounter_2.setText(String.format(Locale.getDefault(), "увеличивает %d", counters.getCounter_2()));
                            break;
                        case R.id.button_3:
                            counters.increaseCounter_3();
                            textCounter_3.setText(String.format(Locale.getDefault(), "увеличивает %d", counters.getCounter_3()));
                            break;
                        case R.id.button_4:
                            counters.increaseCounter_4();
                            textCounter_4.setText(String.format(Locale.getDefault(), "увеличивает %d", counters.getCounter_4()));
                            break;
                        case R.id.button_5:
                            counters.increaseCounter_5();
                            textCounter_5.setText(String.format(Locale.getDefault(), "увеличивает %d", counters.getCounter_5()));
                            break;
                        case R.id.button_6:
                            counters.increaseCounter_6();
                            textCounter_6.setText(String.format(Locale.getDefault(), "увеличивает %d", counters.getCounter_6()));
                            break;
                        case R.id.button_7:
                            counters.increaseCounter_7();
                            textCounter_7.setText(String.format(Locale.getDefault(), "увеличивает %d", counters.getCounter_7()));
                            break;
                        case R.id.button_8:
                            counters.increaseCounter_8();
                            textCounter_8.setText(String.format(Locale.getDefault(), "увеличивает %d", counters.getCounter_8()));
                            break;
                        case R.id.button_9:
                            counters.increaseCounter_9();
                            textCounter_9.setText(String.format(Locale.getDefault(), "увеличивает %d", counters.getCounter_9()));
                            break;
                        case R.id.button_0:
                            counters.increaseCounter_0();
                            textCounter_0.setText(String.format(Locale.getDefault(), "увеличивает %d", counters.getCounter_0()));
                            break;
                        case R.id.button_plus:
                            counters.increaseCounter_plus();
                            textCounter_plus.setText(String.format(Locale.getDefault(), "увеличивает %d", counters.getCounter_plus()));
                            break;
                        case R.id.button_minus:
                            counters.increaseCounter_minus();
                            textCounter_minus.setText(String.format(Locale.getDefault(), "увеличивает %d", counters.getCounter_minus()));
                            break;
                        case R.id.button_umnogenie:
                            counters.increaseCounter_umnogenie();
                            textCounter_umnogenie.setText(String.format(Locale.getDefault(), "увеличивает %d", counters.getCounter_umnogenie()));
                            break;
                        case R.id.button_delenie:
                            counters.increaseCounter_delenie();
                            textCounter_delenie.setText(String.format(Locale.getDefault(), "увеличивает %d", counters.getCounter_delenie()));
                            break;
                        case R.id.button_ravno:
                            counters.increaseCounter_ravno();
                            textCounter_ravno.setText(String.format(Locale.getDefault(), "увеличивает %d", counters.getCounter_ravno()));
                            break;
                        case R.id.button_zp:
                            counters.increaseCounter_zp();
                            textCounter_zp.setText(String.format(Locale.getDefault(), "увеличивает %d", counters.getCounter_zp()));
                            break;
                    }
                }
            };

            private void setTextCounter(TextView textCounter, int counter) {
                textCounter.setText(String.format(Locale.getDefault(), "%d", counter));
            }

            // Сохраняем данные

            @Override
            public void onSaveInstanceState(@NonNull Bundle outState ) {
                super.onSaveInstanceState(outState);
                outState.putSerializable("KEY",counters);

            }

            @Override
            protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
                super.onRestoreInstanceState(savedInstanceState); // восстанавливает данные
                counters = (Counters) savedInstanceState.getSerializable(KEY); // по созданному ключу восстановили
                restoreText(); // метод для хранения даннх
            }
            // восстанавливает данные поочередно для всех полей
            private void restoreText() {
                textCounter_1.setText(String.format(Locale.getDefault(),"увеличивает %id", counters.getCounter_1()));
                textCounter_2.setText(String.format(Locale.getDefault(),"увеличивает %id", counters.getCounter_2()));
                textCounter_3.setText(String.format(Locale.getDefault(),"увеличивает %id", counters.getCounter_3()));
                textCounter_4.setText(String.format(Locale.getDefault(),"увеличивает %id", counters.getCounter_4()));
                textCounter_5.setText(String.format(Locale.getDefault(),"увеличивает %id", counters.getCounter_5()));
                textCounter_6.setText(String.format(Locale.getDefault(),"увеличивает %id", counters.getCounter_6()));
                textCounter_7.setText(String.format(Locale.getDefault(),"увеличивает %id", counters.getCounter_7()));
                textCounter_8.setText(String.format(Locale.getDefault(),"увеличивает %id", counters.getCounter_8()));
                textCounter_9.setText(String.format(Locale.getDefault(),"увеличивает %id", counters.getCounter_9()));
                textCounter_0.setText(String.format(Locale.getDefault(),"увеличивает %id", counters.getCounter_0()));
                textCounter_plus.setText(String.format(Locale.getDefault(),"увеличивает %id", counters.getCounter_plus()));
                textCounter_minus.setText(String.format(Locale.getDefault(),"увеличивает %id", counters.getCounter_minus()));
                textCounter_umnogenie.setText(String.format(Locale.getDefault(),"увеличивает %id", counters.getCounter_umnogenie()));
                textCounter_delenie.setText(String.format(Locale.getDefault(),"увеличивает %id", counters.getCounter_delenie()));
                textCounter_zp.setText(String.format(Locale.getDefault(),"увеличивает %id", counters.getCounter_zp()));
                textCounter_ravno.setText(String.format(Locale.getDefault(),"увеличивает %id", counters.getCounter_ravno()));
            }

    // Отображение данных на экране
    private void setTextCounters(){
        setTextCounter(textCounter_1, counters.getCounter_1());
        setTextCounter(textCounter_2, counters.getCounter_2());
        setTextCounter(textCounter_3, counters.getCounter_3());
        setTextCounter(textCounter_4, counters.getCounter_4());
        setTextCounter(textCounter_5, counters.getCounter_5());
        setTextCounter(textCounter_6, counters.getCounter_6());
        setTextCounter(textCounter_7, counters.getCounter_7());
        setTextCounter(textCounter_8, counters.getCounter_8());
        setTextCounter(textCounter_9, counters.getCounter_9());
        setTextCounter(textCounter_0, counters.getCounter_0());
    }


    @Override
    public void onClick(View v) {

    }
}
