package org.osmdroid.views.overlay.mylocation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import org.osmdroid.library.R;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.Overlay;
/* loaded from: classes3.dex */
public class SimpleLocationOverlay extends Overlay {
    public Point PERSON_HOTSPOT;
    public Bitmap PERSON_ICON;
    public GeoPoint mLocation;
    public final Paint mPaint;
    private final Point screenCoords;

    @Deprecated
    public SimpleLocationOverlay(Context context) {
        this(((BitmapDrawable) context.getResources().getDrawable(R.drawable.person)).getBitmap());
    }

    public SimpleLocationOverlay(Bitmap bitmap) {
        this.mPaint = new Paint();
        this.PERSON_HOTSPOT = new Point(24, 39);
        this.screenCoords = new Point();
        this.PERSON_ICON = bitmap;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        GeoPoint geoPoint = this.mLocation;
        if (geoPoint != null) {
            projection.toPixels(geoPoint, this.screenCoords);
            Bitmap bitmap = this.PERSON_ICON;
            Point point = this.screenCoords;
            int i = point.x;
            Point point2 = this.PERSON_HOTSPOT;
            canvas.drawBitmap(bitmap, i - point2.x, point.y - point2.y, this.mPaint);
        }
    }

    public GeoPoint getMyLocation() {
        return this.mLocation;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
    }

    public void setLocation(GeoPoint geoPoint) {
        this.mLocation = geoPoint;
    }

    public void setPersonIcon(Bitmap bitmap, Point point) {
        this.PERSON_ICON = bitmap;
        this.PERSON_HOTSPOT = point;
    }
}
