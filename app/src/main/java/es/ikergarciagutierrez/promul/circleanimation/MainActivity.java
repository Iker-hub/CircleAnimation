package es.ikergarciagutierrez.promul.circleanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }

    public class MyView extends View {
        Paint paint = null;

        public MyView(Context context) {
            super(context);
            paint = new Paint();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            int x = getWidth();
            int y = getHeight();
            int radius = 100;

            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.parseColor("#006600"));
            canvas.drawPaint(paint);

            paint.setColor(Color.parseColor("#ffff99"));

            for (int i = 0; i <= 10; i++) {

                canvas.translate(i, getHeight() / 2f);
                canvas.drawCircle(x / 2, y / 2, radius, paint);

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}