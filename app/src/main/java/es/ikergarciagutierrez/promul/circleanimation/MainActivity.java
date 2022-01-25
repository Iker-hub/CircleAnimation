package es.ikergarciagutierrez.promul.circleanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Circle circle = (Circle) findViewById(R.id.circle);

        CircleMoveAnimation animation = new CircleMoveAnimation(circle);
        animation.setDuration(1000);
        circle.startAnimation(animation);
    }
}