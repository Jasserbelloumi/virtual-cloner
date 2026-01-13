package org.osmdroid.views.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.Locale;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.library.R;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.constants.GeoConstants;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
/* loaded from: classes3.dex */
public class ScaleBarOverlay extends Overlay implements GeoConstants {
    private static final Rect sTextBoundsRect = new Rect();
    private boolean adjustLength;
    public boolean alignBottom;
    public boolean alignRight;
    private Paint barPaint;
    public final Path barPath;
    private Paint bgPaint;
    private boolean centred;
    private Context context;
    private double lastLatitude;
    private double lastZoomLevel;
    public boolean latitudeBar;
    public final Rect latitudeBarRect;
    public boolean longitudeBar;
    public final Rect longitudeBarRect;
    private int mMapHeight;
    private MapView mMapView;
    private int mMapWidth;
    private float maxLength;
    public double minZoom;
    public int screenHeight;
    public int screenWidth;
    private Paint textPaint;
    public UnitsOfMeasure unitsOfMeasure;
    public int xOffset;
    public float xdpi;
    public int yOffset;
    public float ydpi;

    /* renamed from: org.osmdroid.views.overlay.ScaleBarOverlay$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$osmdroid$views$overlay$ScaleBarOverlay$UnitsOfMeasure;

        static {
            int[] iArr = new int[UnitsOfMeasure.values().length];
            $SwitchMap$org$osmdroid$views$overlay$ScaleBarOverlay$UnitsOfMeasure = iArr;
            try {
                iArr[UnitsOfMeasure.metric.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$ScaleBarOverlay$UnitsOfMeasure[UnitsOfMeasure.imperial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$ScaleBarOverlay$UnitsOfMeasure[UnitsOfMeasure.nautical.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum UnitsOfMeasure {
        metric,
        imperial,
        nautical
    }

    public ScaleBarOverlay(Context context, int i, int i2) {
        this(null, context, i, i2);
    }

    public ScaleBarOverlay(MapView mapView) {
        this(mapView, mapView.getContext(), 0, 0);
    }

    private ScaleBarOverlay(MapView mapView, Context context, int i, int i2) {
        float f;
        this.xOffset = 10;
        this.yOffset = 10;
        this.minZoom = 0.0d;
        this.unitsOfMeasure = UnitsOfMeasure.metric;
        this.latitudeBar = true;
        this.longitudeBar = false;
        this.alignBottom = false;
        this.alignRight = false;
        this.barPath = new Path();
        this.latitudeBarRect = new Rect();
        this.longitudeBarRect = new Rect();
        this.lastZoomLevel = -1.0d;
        this.lastLatitude = 0.0d;
        this.centred = false;
        this.adjustLength = false;
        this.mMapView = mapView;
        this.context = context;
        this.mMapWidth = i;
        this.mMapHeight = i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Paint paint = new Paint();
        this.barPaint = paint;
        paint.setColor(-16777216);
        this.barPaint.setAntiAlias(true);
        this.barPaint.setStyle(Paint.Style.STROKE);
        this.barPaint.setAlpha(255);
        this.barPaint.setStrokeWidth(displayMetrics.density * 2.0f);
        String str = null;
        this.bgPaint = null;
        Paint paint2 = new Paint();
        this.textPaint = paint2;
        paint2.setColor(-16777216);
        this.textPaint.setAntiAlias(true);
        this.textPaint.setStyle(Paint.Style.FILL);
        this.textPaint.setAlpha(255);
        this.textPaint.setTextSize(displayMetrics.density * 10.0f);
        this.xdpi = displayMetrics.xdpi;
        this.ydpi = displayMetrics.ydpi;
        this.screenWidth = displayMetrics.widthPixels;
        this.screenHeight = displayMetrics.heightPixels;
        try {
            str = (String) Build.class.getField("MANUFACTURER").get(null);
        } catch (Exception unused) {
        }
        if (!"motorola".equals(str) || !"DROIDX".equals(Build.MODEL)) {
            if ("motorola".equals(str) && "Droid".equals(Build.MODEL)) {
                f = 264.0f;
                this.xdpi = 264.0f;
            }
            this.maxLength = 2.54f;
        }
        WindowManager windowManager = (WindowManager) this.context.getSystemService("window");
        if (windowManager == null || windowManager.getDefaultDisplay().getOrientation() <= 0) {
            this.xdpi = (float) (this.screenWidth / 2.1d);
            f = (float) (this.screenHeight / 3.75d);
        } else {
            this.xdpi = (float) (this.screenWidth / 3.75d);
            f = (float) (this.screenHeight / 2.1d);
        }
        this.ydpi = f;
        this.maxLength = 2.54f;
    }

    private double adjustScaleBarLength(double d) {
        double d2;
        UnitsOfMeasure unitsOfMeasure = this.unitsOfMeasure;
        boolean z = true;
        long j = 0;
        if (unitsOfMeasure == UnitsOfMeasure.imperial) {
            if (d >= 321.8688d) {
                d2 = d / 1609.344d;
                z = false;
            }
            d2 = d * 3.2808399d;
        } else {
            if (unitsOfMeasure == UnitsOfMeasure.nautical) {
                if (d >= 370.4d) {
                    d2 = d / 1852.0d;
                }
                d2 = d * 3.2808399d;
            } else {
                d2 = d;
            }
            z = false;
        }
        while (d2 >= 10.0d) {
            j++;
            d2 /= 10.0d;
        }
        while (true) {
            if (d2 >= 1.0d || d2 <= 0.0d) {
                break;
            }
            j--;
            d2 *= 10.0d;
        }
        double d3 = d2 >= 2.0d ? d2 < 5.0d ? 2.0d : 5.0d : 1.0d;
        if (z) {
            d3 /= 3.2808399d;
        } else {
            UnitsOfMeasure unitsOfMeasure2 = this.unitsOfMeasure;
            if (unitsOfMeasure2 == UnitsOfMeasure.imperial) {
                d3 *= 1609.344d;
            } else if (unitsOfMeasure2 == UnitsOfMeasure.nautical) {
                d3 *= 1852.0d;
            }
        }
        return Math.pow(10.0d, j) * d3;
    }

    private void drawLatitudeText(Canvas canvas, Projection projection) {
        int i = (int) (this.maxLength * ((int) (this.xdpi / 2.54d)));
        int i2 = i / 2;
        double distanceToAsDouble = ((GeoPoint) projection.fromPixels((this.screenWidth / 2) - i2, this.yOffset, null)).distanceToAsDouble(projection.fromPixels((this.screenWidth / 2) + i2, this.yOffset, null));
        double adjustScaleBarLength = this.adjustLength ? adjustScaleBarLength(distanceToAsDouble) : distanceToAsDouble;
        int i3 = (int) ((i * adjustScaleBarLength) / distanceToAsDouble);
        String scaleBarLengthText = scaleBarLengthText(adjustScaleBarLength);
        Paint paint = this.textPaint;
        int length = scaleBarLengthText.length();
        Rect rect = sTextBoundsRect;
        paint.getTextBounds(scaleBarLengthText, 0, length, rect);
        int height = (int) (rect.height() / 5.0d);
        float width = (i3 / 2) - (rect.width() / 2);
        if (this.alignRight) {
            width += this.screenWidth - i3;
        }
        canvas.drawText(scaleBarLengthText, width, this.alignBottom ? this.screenHeight - (height * 2) : rect.height() + height, this.textPaint);
    }

    private void drawLongitudeText(Canvas canvas, Projection projection) {
        int i = (int) (this.maxLength * ((int) (this.ydpi / 2.54d)));
        int i2 = i / 2;
        double distanceToAsDouble = ((GeoPoint) projection.fromPixels(this.screenWidth / 2, (this.screenHeight / 2) - i2, null)).distanceToAsDouble(projection.fromPixels(this.screenWidth / 2, (this.screenHeight / 2) + i2, null));
        double adjustScaleBarLength = this.adjustLength ? adjustScaleBarLength(distanceToAsDouble) : distanceToAsDouble;
        int i3 = (int) ((i * adjustScaleBarLength) / distanceToAsDouble);
        String scaleBarLengthText = scaleBarLengthText(adjustScaleBarLength);
        Paint paint = this.textPaint;
        int length = scaleBarLengthText.length();
        Rect rect = sTextBoundsRect;
        paint.getTextBounds(scaleBarLengthText, 0, length, rect);
        int height = (int) (rect.height() / 5.0d);
        float height2 = this.alignRight ? this.screenWidth - (height * 2) : rect.height() + height;
        float width = (rect.width() / 2) + (i3 / 2);
        if (this.alignBottom) {
            width += this.screenHeight - i3;
        }
        canvas.save();
        canvas.rotate(-90.0f, height2, width);
        canvas.drawText(scaleBarLengthText, height2, width, this.textPaint);
        canvas.restore();
    }

    private String getConvertedScaleString(double d, GeoConstants.UnitOfMeasure unitOfMeasure, String str) {
        return getScaleString(this.context, String.format(Locale.getDefault(), str, Double.valueOf(d / unitOfMeasure.getConversionFactorToMeters())), unitOfMeasure);
    }

    private int getMapHeight() {
        MapView mapView = this.mMapView;
        return mapView != null ? mapView.getHeight() : this.mMapHeight;
    }

    private int getMapWidth() {
        MapView mapView = this.mMapView;
        return mapView != null ? mapView.getWidth() : this.mMapWidth;
    }

    public static String getScaleString(Context context, String str, GeoConstants.UnitOfMeasure unitOfMeasure) {
        return context.getString(R.string.format_distance_value_unit, str, context.getString(unitOfMeasure.getStringResId()));
    }

    public void disableScaleBar() {
        setEnabled(false);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        Paint paint;
        double zoomLevel = projection.getZoomLevel();
        if (zoomLevel < this.minZoom) {
            return;
        }
        Rect intrinsicScreenRect = projection.getIntrinsicScreenRect();
        int width = intrinsicScreenRect.width();
        int height = intrinsicScreenRect.height();
        boolean z = (height == this.screenHeight && width == this.screenWidth) ? false : true;
        this.screenHeight = height;
        this.screenWidth = width;
        IGeoPoint fromPixels = projection.fromPixels(width / 2, height / 2, null);
        if (zoomLevel != this.lastZoomLevel || fromPixels.getLatitude() != this.lastLatitude || z) {
            this.lastZoomLevel = zoomLevel;
            this.lastLatitude = fromPixels.getLatitude();
            rebuildBarPath(projection);
        }
        int i = this.xOffset;
        int i2 = this.yOffset;
        if (this.alignBottom) {
            i2 *= -1;
        }
        if (this.alignRight) {
            i *= -1;
        }
        if (this.centred && this.latitudeBar) {
            i += (-this.latitudeBarRect.width()) / 2;
        }
        if (this.centred && this.longitudeBar) {
            i2 += (-this.longitudeBarRect.height()) / 2;
        }
        projection.save(canvas, false, true);
        canvas.translate(i, i2);
        if (this.latitudeBar && (paint = this.bgPaint) != null) {
            canvas.drawRect(this.latitudeBarRect, paint);
        }
        if (this.longitudeBar && this.bgPaint != null) {
            int height2 = this.latitudeBar ? this.latitudeBarRect.height() : 0;
            Rect rect = this.longitudeBarRect;
            canvas.drawRect(rect.left, rect.top + height2, rect.right, rect.bottom, this.bgPaint);
        }
        canvas.drawPath(this.barPath, this.barPaint);
        if (this.latitudeBar) {
            drawLatitudeText(canvas, projection);
        }
        if (this.longitudeBar) {
            drawLongitudeText(canvas, projection);
        }
        projection.restore(canvas, true);
    }

    public void drawLatitudeScale(boolean z) {
        this.latitudeBar = z;
        this.lastZoomLevel = -1.0d;
    }

    public void drawLongitudeScale(boolean z) {
        this.longitudeBar = z;
        this.lastZoomLevel = -1.0d;
    }

    public void enableScaleBar() {
        setEnabled(true);
    }

    public Paint getBarPaint() {
        return this.barPaint;
    }

    public Paint getTextPaint() {
        return this.textPaint;
    }

    public UnitsOfMeasure getUnitsOfMeasure() {
        return this.unitsOfMeasure;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        this.context = null;
        this.mMapView = null;
        this.barPaint = null;
        this.bgPaint = null;
        this.textPaint = null;
    }

    public void rebuildBarPath(Projection projection) {
        int i;
        float f = this.maxLength;
        int i2 = (int) (((int) (this.xdpi / 2.54d)) * f);
        int i3 = (int) (f * ((int) (this.ydpi / 2.54d)));
        int i4 = i2 / 2;
        double distanceToAsDouble = ((GeoPoint) projection.fromPixels((this.screenWidth / 2) - i4, this.yOffset, null)).distanceToAsDouble(projection.fromPixels((this.screenWidth / 2) + i4, this.yOffset, null));
        double adjustScaleBarLength = this.adjustLength ? adjustScaleBarLength(distanceToAsDouble) : distanceToAsDouble;
        int i5 = (int) ((i2 * adjustScaleBarLength) / distanceToAsDouble);
        int i6 = i3 / 2;
        double distanceToAsDouble2 = ((GeoPoint) projection.fromPixels(this.screenWidth / 2, (this.screenHeight / 2) - i6, null)).distanceToAsDouble(projection.fromPixels(this.screenWidth / 2, (this.screenHeight / 2) + i6, null));
        double adjustScaleBarLength2 = this.adjustLength ? adjustScaleBarLength(distanceToAsDouble2) : distanceToAsDouble2;
        int i7 = (int) ((i3 * adjustScaleBarLength2) / distanceToAsDouble2);
        String scaleBarLengthText = scaleBarLengthText(adjustScaleBarLength);
        Rect rect = new Rect();
        int i8 = 0;
        this.textPaint.getTextBounds(scaleBarLengthText, 0, scaleBarLengthText.length(), rect);
        int height = (int) (rect.height() / 5.0d);
        String scaleBarLengthText2 = scaleBarLengthText(adjustScaleBarLength2);
        Rect rect2 = new Rect();
        this.textPaint.getTextBounds(scaleBarLengthText2, 0, scaleBarLengthText2.length(), rect2);
        int height2 = (int) (rect2.height() / 5.0d);
        int height3 = rect.height();
        int height4 = rect2.height();
        this.barPath.rewind();
        if (this.alignBottom) {
            height *= -1;
            height3 *= -1;
            i = getMapHeight();
            i7 = i - i7;
        } else {
            i = 0;
        }
        if (this.alignRight) {
            height2 *= -1;
            height4 *= -1;
            i8 = getMapWidth();
            i5 = i8 - i5;
        }
        if (this.latitudeBar) {
            float f2 = i5;
            int i9 = (height * 2) + height3 + i;
            float f3 = i9;
            this.barPath.moveTo(f2, f3);
            float f4 = i;
            this.barPath.lineTo(f2, f4);
            float f5 = i8;
            this.barPath.lineTo(f5, f4);
            if (!this.longitudeBar) {
                this.barPath.lineTo(f5, f3);
            }
            this.latitudeBarRect.set(i8, i, i5, i9);
        }
        if (this.longitudeBar) {
            if (!this.latitudeBar) {
                float f6 = i;
                this.barPath.moveTo((height2 * 2) + i8 + height4, f6);
                this.barPath.lineTo(i8, f6);
            }
            float f7 = i7;
            this.barPath.lineTo(i8, f7);
            int i10 = (height2 * 2) + height4 + i8;
            this.barPath.lineTo(i10, f7);
            this.longitudeBarRect.set(i8, i, i10, i7);
        }
    }

    public String scaleBarLengthText(double d) {
        int i = AnonymousClass1.$SwitchMap$org$osmdroid$views$overlay$ScaleBarOverlay$UnitsOfMeasure[this.unitsOfMeasure.ordinal()];
        return i != 2 ? i != 3 ? d >= 5000.0d ? getConvertedScaleString(d, GeoConstants.UnitOfMeasure.kilometer, "%.0f") : d >= 200.0d ? getConvertedScaleString(d, GeoConstants.UnitOfMeasure.kilometer, "%.1f") : d >= 20.0d ? getConvertedScaleString(d, GeoConstants.UnitOfMeasure.meter, "%.0f") : getConvertedScaleString(d, GeoConstants.UnitOfMeasure.meter, "%.2f") : d >= 9260.0d ? getConvertedScaleString(d, GeoConstants.UnitOfMeasure.nauticalMile, "%.0f") : d >= 370.4d ? getConvertedScaleString(d, GeoConstants.UnitOfMeasure.nauticalMile, "%.1f") : getConvertedScaleString(d, GeoConstants.UnitOfMeasure.foot, "%.0f") : d >= 8046.72d ? getConvertedScaleString(d, GeoConstants.UnitOfMeasure.statuteMile, "%.0f") : d >= 321.8688d ? getConvertedScaleString(d, GeoConstants.UnitOfMeasure.statuteMile, "%.1f") : getConvertedScaleString(d, GeoConstants.UnitOfMeasure.foot, "%.0f");
    }

    public void setAlignBottom(boolean z) {
        this.centred = false;
        this.alignBottom = z;
        this.lastZoomLevel = -1.0d;
    }

    public void setAlignRight(boolean z) {
        this.centred = false;
        this.alignRight = z;
        this.lastZoomLevel = -1.0d;
    }

    public void setBackgroundPaint(Paint paint) {
        this.bgPaint = paint;
        this.lastZoomLevel = -1.0d;
    }

    public void setBarPaint(Paint paint) {
        if (paint == null) {
            throw new IllegalArgumentException("pBarPaint argument cannot be null");
        }
        this.barPaint = paint;
        this.lastZoomLevel = -1.0d;
    }

    public void setCentred(boolean z) {
        this.centred = z;
        this.alignBottom = !z;
        this.alignRight = !z;
        this.lastZoomLevel = -1.0d;
    }

    public void setEnableAdjustLength(boolean z) {
        this.adjustLength = z;
        this.lastZoomLevel = -1.0d;
    }

    public void setLineWidth(float f) {
        this.barPaint.setStrokeWidth(f);
    }

    public void setMaxLength(float f) {
        this.maxLength = f;
        this.lastZoomLevel = -1.0d;
    }

    public void setMinZoom(double d) {
        this.minZoom = d;
    }

    public void setScaleBarOffset(int i, int i2) {
        this.xOffset = i;
        this.yOffset = i2;
    }

    public void setTextPaint(Paint paint) {
        if (paint == null) {
            throw new IllegalArgumentException("pTextPaint argument cannot be null");
        }
        this.textPaint = paint;
        this.lastZoomLevel = -1.0d;
    }

    public void setTextSize(float f) {
        this.textPaint.setTextSize(f);
    }

    public void setUnitsOfMeasure(UnitsOfMeasure unitsOfMeasure) {
        this.unitsOfMeasure = unitsOfMeasure;
        this.lastZoomLevel = -1.0d;
    }
}
