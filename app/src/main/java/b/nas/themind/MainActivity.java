package b.nas.themind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

/*
плавное перемещение
взаимодействие с обьектом
при надобности обойти обьект
увеличение обьекта при нажатии
создание инвентаря
перемещение обьекта из инвентаря
рисовка обьектов
проектирование загадок
анимация
музыка
загадки
 */


public class MainActivity extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Развернуть игру на весь экран
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Кнопка перехода в игру
        TextView buttonStart =(TextView)findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(MainActivity.this, Gamelevels.class);
                    startActivity(intent); finish();
                }catch (Exception e){

                }
            }
        });

    }
    //системная кнопка "назад"
    @Override
    public void onBackPressed() {

        if(backPressedTime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }else {
           backToast = Toast.makeText(getBaseContext(), "Нажмите еще раз что бы выйти", Toast.LENGTH_SHORT);
           backToast.show();
        }

        backPressedTime = System.currentTimeMillis();
    }
}
