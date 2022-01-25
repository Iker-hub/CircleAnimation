package es.ikergarciagutierrez.promul.circleanimation;

import android.service.autofill.Transformation;
import android.view.animation.Animation;

public class CircleMoveAnimation extends Animation {

    private Circle circle;

    private int currentYAxisPosition;

    public CircleMoveAnimation(Circle circle) {
        this.currentYAxisPosition = circle.getYAxis();
        this.circle = circle;
    }

    //@Override
    protected void applyTransformation(int interpolatedTime, Transformation transformation) {
        int yAxisPosition = (currentYAxisPosition + 100) * interpolatedTime;

        circle.setYAxis(yAxisPosition);
        circle.requestLayout();
    }
}
