package org.osmdroid.views.overlay.simplefastpoint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.MotionEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o00oOoO0.o00oOoO;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.Overlay;
import org.osmdroid.views.overlay.simplefastpoint.SimpleFastPointOverlayOptions;
/* loaded from: classes3.dex */
public class SimpleFastPointOverlay extends Overlay {
    private OnClickListener clickListener;
    private boolean[][] gridBool;
    private int gridHei;
    private List<StyledLabelledPoint> gridIndex;
    private int gridWid;
    private boolean hasMoved;
    private final BoundingBox mBoundingBox;
    private final PointAdapter mPointList;
    private Integer mSelectedPoint;
    private final SimpleFastPointOverlayOptions mStyle;
    private int numLabels;
    private BoundingBox prevBoundingBox;
    private BoundingBox startBoundingBox;
    private Projection startProjection;
    private int viewHei;
    private int viewWid;

    /* renamed from: org.osmdroid.views.overlay.simplefastpoint.SimpleFastPointOverlay$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$osmdroid$views$overlay$simplefastpoint$SimpleFastPointOverlayOptions$RenderingAlgorithm;

        static {
            int[] iArr = new int[SimpleFastPointOverlayOptions.RenderingAlgorithm.values().length];
            $SwitchMap$org$osmdroid$views$overlay$simplefastpoint$SimpleFastPointOverlayOptions$RenderingAlgorithm = iArr;
            try {
                iArr[SimpleFastPointOverlayOptions.RenderingAlgorithm.MAXIMUM_OPTIMIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$simplefastpoint$SimpleFastPointOverlayOptions$RenderingAlgorithm[SimpleFastPointOverlayOptions.RenderingAlgorithm.MEDIUM_OPTIMIZATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$simplefastpoint$SimpleFastPointOverlayOptions$RenderingAlgorithm[SimpleFastPointOverlayOptions.RenderingAlgorithm.NO_OPTIMIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface OnClickListener {
        void onClick(PointAdapter pointAdapter, Integer num);
    }

    /* loaded from: classes3.dex */
    public interface PointAdapter extends Iterable<IGeoPoint> {
        IGeoPoint get(int i);

        boolean isLabelled();

        boolean isStyled();

        int size();
    }

    /* loaded from: classes3.dex */
    public class StyledLabelledPoint extends Point {
        private Paint mPointStyle;
        private Paint mTextStyle;
        private String mlabel;

        public StyledLabelledPoint(Point point, String str, Paint paint, Paint paint2) {
            super(point);
            this.mlabel = str;
            this.mPointStyle = paint;
            this.mTextStyle = paint2;
        }
    }

    public SimpleFastPointOverlay(PointAdapter pointAdapter) {
        this(pointAdapter, SimpleFastPointOverlayOptions.getDefaultStyle());
    }

    public SimpleFastPointOverlay(PointAdapter pointAdapter, SimpleFastPointOverlayOptions simpleFastPointOverlayOptions) {
        this.hasMoved = false;
        this.prevBoundingBox = new BoundingBox();
        this.mStyle = simpleFastPointOverlayOptions;
        this.mPointList = pointAdapter;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        for (IGeoPoint iGeoPoint : pointAdapter) {
            if (iGeoPoint != null) {
                d = (d == null || iGeoPoint.getLongitude() > d.doubleValue()) ? Double.valueOf(iGeoPoint.getLongitude()) : d;
                d4 = (d4 == null || iGeoPoint.getLongitude() < d4.doubleValue()) ? Double.valueOf(iGeoPoint.getLongitude()) : d4;
                d2 = (d2 == null || iGeoPoint.getLatitude() > d2.doubleValue()) ? Double.valueOf(iGeoPoint.getLatitude()) : d2;
                if (d3 == null || iGeoPoint.getLatitude() < d3.doubleValue()) {
                    d3 = Double.valueOf(iGeoPoint.getLatitude());
                }
            }
        }
        if (d != null) {
            this.mBoundingBox = new BoundingBox(d2.doubleValue(), d.doubleValue(), d3.doubleValue(), d4.doubleValue());
        } else {
            this.mBoundingBox = null;
        }
    }

    private void computeGrid(MapView mapView) {
        BoundingBox boundingBox = mapView.getBoundingBox();
        this.startBoundingBox = boundingBox;
        this.startProjection = mapView.getProjection();
        if (boundingBox.getLatNorth() == this.prevBoundingBox.getLatNorth() && boundingBox.getLatSouth() == this.prevBoundingBox.getLatSouth() && boundingBox.getLonWest() == this.prevBoundingBox.getLonWest() && boundingBox.getLonEast() == this.prevBoundingBox.getLonEast()) {
            return;
        }
        this.prevBoundingBox = new BoundingBox(boundingBox.getLatNorth(), boundingBox.getLonEast(), boundingBox.getLatSouth(), boundingBox.getLonWest());
        if (this.gridBool != null && this.viewHei == mapView.getHeight() && this.viewWid == mapView.getWidth()) {
            for (boolean[] zArr : this.gridBool) {
                Arrays.fill(zArr, false);
            }
        } else {
            updateGrid(mapView);
        }
        Point point = new Point();
        Projection projection = mapView.getProjection();
        this.gridIndex = new ArrayList();
        this.numLabels = 0;
        for (IGeoPoint iGeoPoint : this.mPointList) {
            if (iGeoPoint != null && iGeoPoint.getLatitude() > boundingBox.getLatSouth() && iGeoPoint.getLatitude() < boundingBox.getLatNorth() && iGeoPoint.getLongitude() > boundingBox.getLonWest() && iGeoPoint.getLongitude() < boundingBox.getLonEast()) {
                projection.toPixels(iGeoPoint, point);
                int floor = (int) Math.floor(point.x / this.mStyle.mCellSize);
                int floor2 = (int) Math.floor(point.y / this.mStyle.mCellSize);
                if (floor < this.gridWid && floor2 < this.gridHei && floor >= 0 && floor2 >= 0) {
                    boolean[] zArr2 = this.gridBool[floor];
                    if (!zArr2[floor2]) {
                        zArr2[floor2] = true;
                        this.gridIndex.add(new StyledLabelledPoint(point, this.mPointList.isLabelled() ? ((LabelledGeoPoint) iGeoPoint).getLabel() : null, this.mPointList.isStyled() ? ((StyledLabelledGeoPoint) iGeoPoint).getPointStyle() : null, this.mPointList.isStyled() ? ((StyledLabelledGeoPoint) iGeoPoint).getTextStyle() : null));
                        this.numLabels++;
                    }
                }
            }
        }
    }

    private void updateGrid(MapView mapView) {
        this.viewWid = mapView.getWidth();
        this.viewHei = mapView.getHeight();
        this.gridWid = ((int) Math.floor(this.viewWid / this.mStyle.mCellSize)) + 1;
        int floor = ((int) Math.floor(this.viewHei / this.mStyle.mCellSize)) + 1;
        this.gridHei = floor;
        this.gridBool = (boolean[][]) Array.newInstance(Boolean.TYPE, this.gridWid, floor);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, MapView mapView, boolean z) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        if (z) {
            return;
        }
        Point point = new Point();
        Projection projection = mapView.getProjection();
        if (this.mStyle.mPointStyle != null || this.mPointList.isStyled()) {
            int i = AnonymousClass1.$SwitchMap$org$osmdroid$views$overlay$simplefastpoint$SimpleFastPointOverlayOptions$RenderingAlgorithm[this.mStyle.mAlgorithm.ordinal()];
            if (i == 1) {
                if (this.gridBool == null || (!this.hasMoved && !mapView.isAnimating())) {
                    computeGrid(mapView);
                }
                GeoPoint geoPoint = new GeoPoint(this.startBoundingBox.getLatNorth(), this.startBoundingBox.getLonWest());
                GeoPoint geoPoint2 = new GeoPoint(this.startBoundingBox.getLatSouth(), this.startBoundingBox.getLonEast());
                Point pixels = projection.toPixels(geoPoint, null);
                Point pixels2 = projection.toPixels(geoPoint2, null);
                Point pixels3 = this.startProjection.toPixels(geoPoint2, null);
                Point point2 = new Point(pixels2.x - pixels3.x, pixels2.y - pixels3.y);
                Point point3 = new Point(point2.x - pixels.x, point2.y - pixels.y);
                SimpleFastPointOverlayOptions simpleFastPointOverlayOptions = this.mStyle;
                SimpleFastPointOverlayOptions.LabelPolicy labelPolicy = simpleFastPointOverlayOptions.mLabelPolicy;
                boolean z2 = (labelPolicy == SimpleFastPointOverlayOptions.LabelPolicy.DENSITY_THRESHOLD && this.numLabels <= simpleFastPointOverlayOptions.mMaxNShownLabels) || (labelPolicy == SimpleFastPointOverlayOptions.LabelPolicy.ZOOM_THRESHOLD && mapView.getZoomLevelDouble() >= ((double) this.mStyle.mMinZoomShowLabels));
                for (StyledLabelledPoint styledLabelledPoint : this.gridIndex) {
                    int i2 = ((Point) styledLabelledPoint).x;
                    int i3 = ((Point) styledLabelledPoint).y;
                    float f = ((point3.x * i2) / pixels3.x) + i2 + pixels.x;
                    float f2 = i3 + pixels.y + ((point3.y * i3) / pixels3.y);
                    boolean z3 = this.mPointList.isLabelled() && z2;
                    String str = styledLabelledPoint.mlabel;
                    Paint paint4 = (!this.mPointList.isStyled() || styledLabelledPoint.mPointStyle == null) ? this.mStyle.mPointStyle : styledLabelledPoint.mPointStyle;
                    if (!this.mPointList.isStyled() || (paint = styledLabelledPoint.mTextStyle) == null) {
                        paint = this.mStyle.mTextStyle;
                    }
                    drawPointAt(canvas, f, f2, z3, str, paint4, paint, mapView);
                    pixels = pixels;
                    point3 = point3;
                }
            } else if (i == 2) {
                if (this.gridBool != null && this.viewHei == mapView.getHeight() && this.viewWid == mapView.getWidth()) {
                    for (boolean[] zArr : this.gridBool) {
                        Arrays.fill(zArr, false);
                    }
                } else {
                    updateGrid(mapView);
                }
                boolean z4 = this.mStyle.mLabelPolicy == SimpleFastPointOverlayOptions.LabelPolicy.ZOOM_THRESHOLD && mapView.getZoomLevelDouble() >= ((double) this.mStyle.mMinZoomShowLabels);
                BoundingBox boundingBox = mapView.getBoundingBox();
                for (IGeoPoint iGeoPoint : this.mPointList) {
                    if (iGeoPoint != null && iGeoPoint.getLatitude() > boundingBox.getLatSouth() && iGeoPoint.getLatitude() < boundingBox.getLatNorth() && iGeoPoint.getLongitude() > boundingBox.getLonWest() && iGeoPoint.getLongitude() < boundingBox.getLonEast()) {
                        projection.toPixels(iGeoPoint, point);
                        int floor = (int) Math.floor(point.x / this.mStyle.mCellSize);
                        int floor2 = (int) Math.floor(point.y / this.mStyle.mCellSize);
                        if (floor < this.gridWid && floor2 < this.gridHei && floor >= 0 && floor2 >= 0) {
                            boolean[] zArr2 = this.gridBool[floor];
                            if (!zArr2[floor2]) {
                                zArr2[floor2] = true;
                                float f3 = point.x;
                                float f4 = point.y;
                                boolean z5 = this.mPointList.isLabelled() && z4;
                                String label = this.mPointList.isLabelled() ? ((LabelledGeoPoint) iGeoPoint).getLabel() : null;
                                if (this.mPointList.isStyled()) {
                                    StyledLabelledGeoPoint styledLabelledGeoPoint = (StyledLabelledGeoPoint) iGeoPoint;
                                    if (styledLabelledGeoPoint.getPointStyle() != null) {
                                        paint2 = styledLabelledGeoPoint.getPointStyle();
                                        Paint paint5 = paint2;
                                        if (this.mPointList.isStyled() || (r0 = ((StyledLabelledGeoPoint) iGeoPoint).getTextStyle()) == null) {
                                            Paint paint6 = this.mStyle.mTextStyle;
                                        }
                                        drawPointAt(canvas, f3, f4, z5, label, paint5, paint6, mapView);
                                    }
                                }
                                paint2 = this.mStyle.mPointStyle;
                                Paint paint52 = paint2;
                                if (this.mPointList.isStyled()) {
                                }
                                Paint paint62 = this.mStyle.mTextStyle;
                                drawPointAt(canvas, f3, f4, z5, label, paint52, paint62, mapView);
                            }
                        }
                    }
                }
            } else if (i == 3) {
                boolean z6 = this.mStyle.mLabelPolicy == SimpleFastPointOverlayOptions.LabelPolicy.ZOOM_THRESHOLD && mapView.getZoomLevelDouble() >= ((double) this.mStyle.mMinZoomShowLabels);
                BoundingBox boundingBox2 = mapView.getBoundingBox();
                for (IGeoPoint iGeoPoint2 : this.mPointList) {
                    if (iGeoPoint2 != null && iGeoPoint2.getLatitude() > boundingBox2.getLatSouth() && iGeoPoint2.getLatitude() < boundingBox2.getLatNorth() && iGeoPoint2.getLongitude() > boundingBox2.getLonWest() && iGeoPoint2.getLongitude() < boundingBox2.getLonEast()) {
                        projection.toPixels(iGeoPoint2, point);
                        float f5 = point.x;
                        float f6 = point.y;
                        boolean z7 = this.mPointList.isLabelled() && z6;
                        String label2 = this.mPointList.isLabelled() ? ((LabelledGeoPoint) iGeoPoint2).getLabel() : null;
                        if (this.mPointList.isStyled()) {
                            StyledLabelledGeoPoint styledLabelledGeoPoint2 = (StyledLabelledGeoPoint) iGeoPoint2;
                            if (styledLabelledGeoPoint2.getPointStyle() != null) {
                                paint3 = styledLabelledGeoPoint2.getPointStyle();
                                Paint paint7 = paint3;
                                if (this.mPointList.isStyled() || (r0 = ((StyledLabelledGeoPoint) iGeoPoint2).getTextStyle()) == null) {
                                    Paint paint8 = this.mStyle.mTextStyle;
                                }
                                drawPointAt(canvas, f5, f6, z7, label2, paint7, paint8, mapView);
                            }
                        }
                        paint3 = this.mStyle.mPointStyle;
                        Paint paint72 = paint3;
                        if (this.mPointList.isStyled()) {
                        }
                        Paint paint82 = this.mStyle.mTextStyle;
                        drawPointAt(canvas, f5, f6, z7, label2, paint72, paint82, mapView);
                    }
                }
            }
        }
        Integer num = this.mSelectedPoint;
        if (num == null || num.intValue() >= this.mPointList.size() || this.mPointList.get(this.mSelectedPoint.intValue()) == null || this.mStyle.mSelectedPointStyle == null) {
            return;
        }
        projection.toPixels(this.mPointList.get(this.mSelectedPoint.intValue()), point);
        SimpleFastPointOverlayOptions simpleFastPointOverlayOptions2 = this.mStyle;
        if (simpleFastPointOverlayOptions2.mSymbol == SimpleFastPointOverlayOptions.Shape.CIRCLE) {
            canvas.drawCircle(point.x, point.y, simpleFastPointOverlayOptions2.mSelectedCircleRadius, simpleFastPointOverlayOptions2.mSelectedPointStyle);
            return;
        }
        int i4 = point.x;
        float f7 = simpleFastPointOverlayOptions2.mSelectedCircleRadius;
        int i5 = point.y;
        canvas.drawRect(i4 - f7, i5 - f7, i4 + f7, i5 + f7, simpleFastPointOverlayOptions2.mSelectedPointStyle);
    }

    public void drawPointAt(Canvas canvas, float f, float f2, boolean z, String str, Paint paint, Paint paint2, MapView mapView) {
        canvas.save();
        canvas.rotate(-mapView.getMapOrientation(), f, f2);
        SimpleFastPointOverlayOptions simpleFastPointOverlayOptions = this.mStyle;
        SimpleFastPointOverlayOptions.Shape shape = simpleFastPointOverlayOptions.mSymbol;
        SimpleFastPointOverlayOptions.Shape shape2 = SimpleFastPointOverlayOptions.Shape.CIRCLE;
        float f3 = simpleFastPointOverlayOptions.mCircleRadius;
        if (shape == shape2) {
            canvas.drawCircle(f, f2, f3, paint);
        } else {
            canvas.drawRect(f - f3, f2 - f3, f + f3, f2 + f3, paint);
        }
        if (z && str != null) {
            canvas.drawText(str, f, (f2 - this.mStyle.mCircleRadius) - 5.0f, paint2);
        }
        canvas.restore();
    }

    public BoundingBox getBoundingBox() {
        return this.mBoundingBox;
    }

    public Integer getSelectedPoint() {
        return this.mSelectedPoint;
    }

    public SimpleFastPointOverlayOptions getStyle() {
        return this.mStyle;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapConfirmed(MotionEvent motionEvent, MapView mapView) {
        if (this.mStyle.mClickable) {
            Float f = null;
            int i = -1;
            Point point = new Point();
            Projection projection = mapView.getProjection();
            for (int i2 = 0; i2 < this.mPointList.size(); i2++) {
                if (this.mPointList.get(i2) != null) {
                    projection.toPixels(this.mPointList.get(i2), point);
                    if (Math.abs(motionEvent.getX() - point.x) <= 50.0f && Math.abs(motionEvent.getY() - point.y) <= 50.0f) {
                        float o00oOOo02 = o00oOoO.o00oOOo0(motionEvent.getY(), point.y, motionEvent.getY() - point.y, (motionEvent.getX() - point.x) * (motionEvent.getX() - point.x));
                        if (f == null || o00oOOo02 < f.floatValue()) {
                            f = Float.valueOf(o00oOOo02);
                            i = i2;
                        }
                    }
                }
            }
            if (f == null) {
                return false;
            }
            setSelectedPoint(Integer.valueOf(i));
            mapView.invalidate();
            OnClickListener onClickListener = this.clickListener;
            if (onClickListener != null) {
                onClickListener.onClick(this.mPointList, Integer.valueOf(i));
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onTouchEvent(MotionEvent motionEvent, MapView mapView) {
        if (this.mStyle.mAlgorithm != SimpleFastPointOverlayOptions.RenderingAlgorithm.MAXIMUM_OPTIMIZATION) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.startBoundingBox = mapView.getBoundingBox();
            this.startProjection = mapView.getProjection();
        } else if (action == 1) {
            this.hasMoved = false;
            this.startBoundingBox = mapView.getBoundingBox();
            this.startProjection = mapView.getProjection();
            mapView.invalidate();
        } else if (action == 2) {
            this.hasMoved = true;
        }
        return false;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.clickListener = onClickListener;
    }

    public void setSelectedPoint(Integer num) {
        this.mSelectedPoint = (num == null || num.intValue() < 0 || num.intValue() >= this.mPointList.size()) ? null : null;
    }
}
