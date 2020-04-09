package com.example.user.gamecircles;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Square {
    float left, right, top, bottom, R, cx, cy;
    int color;

    public void coordinates(float dx, float dy) {
        this.left = dx - 80;
        this.right = dx + 80;
        this.top = dy - 80;
        this.bottom = dy + 80;
        this.cx = dx;
        this.cy = dy;
        double cis = 2;
        this.R = (float) (160 * Math.sqrt(cis) / 2);
    }

    public Square(float x, float y, int color) {
        this.color = color;
        coordinates(x, y);
    }

    public void draw(Canvas canvas) {
        Paint p = new Paint();
        p.setColor(color);
        canvas.drawRect(left, top, right, bottom, p);
    }

    public boolean InSquare(float point_x, float point_y, float rad) {
        float d = (float)Math.sqrt((point_x - this.cx) * (point_x - this.cx) + (point_y - this.cy) * (point_y - this.cy));
        if (d <= R + rad) {
            return true;
        }
        return false;
    }
}
