package b.nas.themind;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Gamelevels extends AppCompatActivity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamelevels);

        //Развернуть игру на весь экран
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Найти изображение для перемещения
        RelativeLayout image = findViewById(R.id.background);
        image.setOnTouchListener(this);

    }

    public boolean onTouch(View v, MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        ImageView imageView = ((ImageView) findViewById(R.id.imageView4));
        imageView.setX(x + v.getLeft() - imageView.getWidth() / 2);
        imageView.setY(y + v.getTop() - imageView.getHeight() / 2);
        return true;
    }


}

