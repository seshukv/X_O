package com.example.x_o;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import static com.example.x_o.TournamentAdapter.BIG_SCALE;

public class CustomLinearLayout extends LinearLayout {
    private float scale = BIG_SCALE;

    public CustomLinearLayout(Context context) {
        super(context);
    }

    public CustomLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    public void setScaleBoth(float scale) {
        this.scale = scale;
        this.invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // The main mechanism to display scale animation, you can customize it as your needs
        int w = this.getWidth();
        int h = this.getHeight();
        canvas.scale(scale, scale, w, h);
    }
}
