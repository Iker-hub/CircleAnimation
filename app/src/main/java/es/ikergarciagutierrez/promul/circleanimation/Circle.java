package es.ikergarciagutierrez.promul.circleanimation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Circle extends View {

    private final Paint paint;

    private int yAxis = -800;

    public Circle(Context context, AttributeSet attrs) {
        super(context, attrs);

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
        canvas.translate(0, yAxis);
        canvas.drawCircle(x / 2, y / 2, radius, paint);

    }

    public int getYAxis() {
        return yAxis;
    }

    public void setYAxis(int yAxis) {
        this.yAxis = yAxis;
    }
}