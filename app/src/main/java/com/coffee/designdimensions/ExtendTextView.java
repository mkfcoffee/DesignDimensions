package com.coffee.designdimensions;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by Mcoffee on 2018/1/30.
 * Email: mkfcoffee@163.com
 */

public class ExtendTextView extends AppCompatTextView {
    private Paint linePaint;

    public ExtendTextView(Context context) {
        super(context);
        init();
    }

    public ExtendTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ExtendTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        linePaint.setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint.FontMetrics fm = getPaint().getFontMetrics();
        canvas.drawLine(0, fm.top + getBaseline(), getWidth(), fm.top + getBaseline(), linePaint);
        canvas.drawLine(0, fm.ascent + getBaseline(), getWidth(), fm.ascent + getBaseline(), linePaint);
        canvas.drawLine(0, getBaseline(), getWidth(), getBaseline(), linePaint);
        canvas.drawLine(0, fm.descent + getBaseline(), getWidth(), fm.descent + getBaseline(), linePaint);
        canvas.drawLine(0, fm.bottom + getBaseline(), getWidth(), fm.bottom + getBaseline(), linePaint);
    }
}
