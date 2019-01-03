package com.jaychan.library.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.jaychan.library.R;


/**
 * @author JayChan
 * @date 2018/12/24  14:10
 */
public class RoundTextView extends android.support.v7.widget.AppCompatTextView {

    public RoundTextView(Context context) {
        this(context, null);
    }

    public RoundTextView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RoundTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray attributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.RoundTextView, defStyleAttr, 0);

        if (attributes != null) {
            int borderWidth = attributes.getDimensionPixelSize(R.styleable.RoundTextView_tvBorderWidth, 0);
            int borderColor = attributes.getColor(R.styleable.RoundTextView_tvBorderColor, Color.BLACK);
            float radius = attributes.getDimension(R.styleable.RoundTextView_tvCornerRadius, 0);
            float topLeftRadius = attributes.getDimension(R.styleable.RoundTextView_tvTopLeftRadius, 0);
            float topRightRadius = attributes.getDimension(R.styleable.RoundTextView_tvTopRightRadius, 0);
            float bottomLeftRadius = attributes.getDimension(R.styleable.RoundTextView_tvBottomLeftRadius, 0);
            float bottomRightRadius = attributes.getDimension(R.styleable.RoundTextView_tvBottomRightRadius, 0);
            int backgroundColor = attributes.getColor(R.styleable.RoundTextView_tvBackgroundColor, Color.WHITE);
            attributes.recycle();

            GradientDrawable gd = new GradientDrawable();//创建drawable
            gd.setColor(backgroundColor);
            if (borderWidth > 0) {
                gd.setStroke(borderWidth, borderColor);
            }

            if (topLeftRadius > 0 || topRightRadius > 0 || bottomLeftRadius > 0 || bottomRightRadius > 0) {
                float[] radii = new float[]{
                        topLeftRadius, topLeftRadius,
                        topRightRadius, topRightRadius,
                        bottomRightRadius, bottomRightRadius,
                        bottomLeftRadius, bottomLeftRadius
                };
                gd.setCornerRadii(radii);
            } else {
                gd.setCornerRadius(radius);
            }

            this.setBackground(gd);
        }
    }

    public void setBackgroungColor(@ColorInt int color) {
        GradientDrawable myGrad = (GradientDrawable) getBackground();
        myGrad.setColor(color);
    }
}
