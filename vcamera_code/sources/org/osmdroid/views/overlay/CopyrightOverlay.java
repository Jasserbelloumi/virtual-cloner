package org.osmdroid.views.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
/* loaded from: classes3.dex */
public class CopyrightOverlay extends Overlay {
    public final DisplayMetrics dm;
    private String mCopyrightNotice;
    private Paint paint;
    public int xOffset = 10;
    public int yOffset = 10;
    public boolean alignBottom = true;
    public boolean alignRight = false;

    public CopyrightOverlay(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.dm = displayMetrics;
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.paint.setTextSize(displayMetrics.density * 12.0f);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, MapView mapView, boolean z) {
        setCopyrightNotice(mapView.getTileProvider().getTileSource().getCopyrightNotice());
        draw(canvas, mapView.getProjection());
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        float f;
        Paint paint;
        Paint.Align align;
        String str = this.mCopyrightNotice;
        if (str == null || str.length() == 0) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (this.alignRight) {
            f = width - this.xOffset;
            paint = this.paint;
            align = Paint.Align.RIGHT;
        } else {
            f = this.xOffset;
            paint = this.paint;
            align = Paint.Align.LEFT;
        }
        paint.setTextAlign(align);
        float textSize = this.alignBottom ? height - this.yOffset : this.paint.getTextSize() + this.yOffset;
        projection.save(canvas, false, false);
        canvas.drawText(this.mCopyrightNotice, f, textSize, this.paint);
        projection.restore(canvas, false);
    }

    public void setAlignBottom(boolean z) {
        this.alignBottom = z;
    }

    public void setAlignRight(boolean z) {
        this.alignRight = z;
    }

    public void setCopyrightNotice(String str) {
        this.mCopyrightNotice = str;
    }

    public void setOffset(int i, int i2) {
        this.xOffset = i;
        this.yOffset = i2;
    }

    public void setTextColor(int i) {
        this.paint.setColor(i);
    }

    public void setTextSize(int i) {
        this.paint.setTextSize(this.dm.density * i);
    }
}
