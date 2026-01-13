package org.osmdroid.views.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import org.osmdroid.util.RectL;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.Overlay;
import org.osmdroid.views.overlay.OverlayItem;
/* loaded from: classes3.dex */
public abstract class ItemizedOverlay<Item extends OverlayItem> extends Overlay implements Overlay.Snappable {
    private Rect itemRect;
    private final Point mCurScreenCoords;
    public final Drawable mDefaultMarker;
    public boolean mDrawFocusedItem;
    public int mDrawnItemsLimit;
    private Item mFocusedItem;
    private boolean[] mInternalItemDisplayedList;
    private final ArrayList<Item> mInternalItemList;
    private final Rect mMarkerRect;
    private OnFocusChangeListener mOnFocusChangeListener;
    private final Rect mOrientedMarkerRect;
    private boolean mPendingFocusChangedEvent;
    private final Rect mRect;
    private Rect screenRect;

    /* renamed from: org.osmdroid.views.overlay.ItemizedOverlay$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace;

        static {
            int[] iArr = new int[OverlayItem.HotspotPlace.values().length];
            $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace = iArr;
            try {
                iArr[OverlayItem.HotspotPlace.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.LEFT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.UPPER_LEFT_CORNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.LOWER_LEFT_CORNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.BOTTOM_CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.TOP_CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.RIGHT_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.UPPER_RIGHT_CORNER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.LOWER_RIGHT_CORNER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface OnFocusChangeListener {
        void onFocusChanged(ItemizedOverlay<?> itemizedOverlay, OverlayItem overlayItem);
    }

    @Deprecated
    public ItemizedOverlay(Context context, Drawable drawable) {
        this(drawable);
    }

    public ItemizedOverlay(Drawable drawable) {
        this.mDrawnItemsLimit = Integer.MAX_VALUE;
        this.mRect = new Rect();
        this.mMarkerRect = new Rect();
        this.mOrientedMarkerRect = new Rect();
        this.mCurScreenCoords = new Point();
        this.mDrawFocusedItem = true;
        this.mPendingFocusChangedEvent = false;
        this.itemRect = new Rect();
        this.screenRect = new Rect();
        if (drawable == null) {
            throw new IllegalArgumentException("You must pass a default marker to ItemizedOverlay.");
        }
        this.mDefaultMarker = drawable;
        this.mInternalItemList = new ArrayList<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (r8 != 6) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.drawable.Drawable boundToHotspot(android.graphics.drawable.Drawable r7, org.osmdroid.views.overlay.OverlayItem.HotspotPlace r8) {
        /*
            r6 = this;
            if (r8 != 0) goto L4
            org.osmdroid.views.overlay.OverlayItem$HotspotPlace r8 = org.osmdroid.views.overlay.OverlayItem.HotspotPlace.BOTTOM_CENTER
        L4:
            int r0 = r7.getIntrinsicWidth()
            int r1 = r7.getIntrinsicHeight()
            int[] r2 = org.osmdroid.views.overlay.ItemizedOverlay.AnonymousClass1.$SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace
            int r3 = r8.ordinal()
            r3 = r2[r3]
            r4 = 0
            r5 = 2
            switch(r3) {
                case 5: goto L1d;
                case 6: goto L1d;
                case 7: goto L1d;
                case 8: goto L1b;
                case 9: goto L1b;
                case 10: goto L1b;
                default: goto L19;
            }
        L19:
            r3 = r4
            goto L1f
        L1b:
            int r3 = -r0
            goto L1f
        L1d:
            int r3 = -r0
            int r3 = r3 / r5
        L1f:
            int r8 = r8.ordinal()
            r8 = r2[r8]
            if (r8 == r5) goto L3b
            r2 = 8
            if (r8 == r2) goto L3b
            r2 = 10
            if (r8 == r2) goto L39
            r2 = 4
            if (r8 == r2) goto L39
            r2 = 5
            if (r8 == r2) goto L3b
            r2 = 6
            if (r8 == r2) goto L39
            goto L3e
        L39:
            int r4 = -r1
            goto L3e
        L3b:
            int r8 = -r1
            int r4 = r8 / 2
        L3e:
            int r0 = r0 + r3
            int r1 = r1 + r4
            r7.setBounds(r3, r4, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.views.overlay.ItemizedOverlay.boundToHotspot(android.graphics.drawable.Drawable, org.osmdroid.views.overlay.OverlayItem$HotspotPlace):android.graphics.drawable.Drawable");
    }

    public Rect calculateItemRect(Item item, Point point, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        OverlayItem.HotspotPlace markerHotspot = item.getMarkerHotspot();
        if (markerHotspot == null) {
            markerHotspot = OverlayItem.HotspotPlace.BOTTOM_CENTER;
        }
        int i = (this.mDrawFocusedItem && this.mFocusedItem == item) ? 4 : 0;
        Drawable defaultMarker = item.getMarker(i) == null ? getDefaultMarker(i) : item.getMarker(i);
        int intrinsicWidth = defaultMarker.getIntrinsicWidth();
        int intrinsicHeight = defaultMarker.getIntrinsicHeight();
        switch (AnonymousClass1.$SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[markerHotspot.ordinal()]) {
            case 1:
            case 5:
                int i2 = point.x;
                int i3 = intrinsicWidth / 2;
                int i4 = point.y;
                int i5 = intrinsicHeight / 2;
                rect.set(i2 - i3, i4 - i5, i2 + i3, i4 + i5);
                break;
            case 2:
                int i6 = point.x;
                int i7 = point.y;
                int i8 = intrinsicHeight / 2;
                rect.set(i6, i7 - i8, intrinsicWidth + i6, i7 + i8);
                break;
            case 3:
                int i9 = point.x;
                int i10 = point.y;
                rect.set(i9, i10, intrinsicWidth + i9, intrinsicHeight + i10);
                break;
            case 4:
                int i11 = point.x;
                int i12 = point.y;
                rect.set(i11, i12 - intrinsicHeight, intrinsicWidth + i11, i12);
                break;
            case 6:
                int i13 = point.x;
                int i14 = intrinsicWidth / 2;
                int i15 = point.y;
                rect.set(i13 - i14, i15 - intrinsicHeight, i13 + i14, i15);
                break;
            case 7:
                int i16 = point.x;
                int i17 = intrinsicWidth / 2;
                int i18 = point.y;
                rect.set(i16 - i17, i18, i16 + i17, intrinsicHeight + i18);
                break;
            case 8:
                int i19 = point.x;
                int i20 = point.y;
                int i21 = intrinsicHeight / 2;
                rect.set(i19 - intrinsicWidth, i20 - i21, i19, i20 + i21);
                break;
            case 9:
                int i22 = point.x;
                int i23 = point.y;
                rect.set(i22 - intrinsicWidth, i23, i22, intrinsicHeight + i23);
                break;
            case 10:
                int i24 = point.x;
                int i25 = point.y;
                rect.set(i24 - intrinsicWidth, i25 - intrinsicHeight, i24, i25);
                break;
        }
        return rect;
    }

    public abstract Item createItem(int i);

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        OnFocusChangeListener onFocusChangeListener;
        if (this.mPendingFocusChangedEvent && (onFocusChangeListener = this.mOnFocusChangeListener) != null) {
            onFocusChangeListener.onFocusChanged(this, this.mFocusedItem);
        }
        this.mPendingFocusChangedEvent = false;
        int min = Math.min(this.mInternalItemList.size(), this.mDrawnItemsLimit);
        boolean[] zArr = this.mInternalItemDisplayedList;
        if (zArr == null || zArr.length != min) {
            this.mInternalItemDisplayedList = new boolean[min];
        }
        for (int i = min - 1; i >= 0; i--) {
            Item item = getItem(i);
            if (item != null) {
                projection.toPixels(item.getPoint(), this.mCurScreenCoords);
                calculateItemRect(item, this.mCurScreenCoords, this.itemRect);
                this.mInternalItemDisplayedList[i] = onDrawItem(canvas, item, this.mCurScreenCoords, projection);
            }
        }
    }

    public Drawable getDefaultMarker(int i) {
        OverlayItem.setState(this.mDefaultMarker, i);
        return this.mDefaultMarker;
    }

    public List<Item> getDisplayedItems() {
        ArrayList arrayList = new ArrayList();
        if (this.mInternalItemDisplayedList == null) {
            return arrayList;
        }
        int i = 0;
        while (true) {
            boolean[] zArr = this.mInternalItemDisplayedList;
            if (i >= zArr.length) {
                return arrayList;
            }
            if (zArr[i]) {
                arrayList.add(getItem(i));
            }
            i++;
        }
    }

    public int getDrawnItemsLimit() {
        return this.mDrawnItemsLimit;
    }

    public Item getFocus() {
        return this.mFocusedItem;
    }

    public final Item getItem(int i) {
        try {
            return this.mInternalItemList.get(i);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public boolean hitTest(Item item, Drawable drawable, int i, int i2) {
        return drawable.getBounds().contains(i, i2);
    }

    public boolean isEventOnItem(Item item, int i, int i2, MapView mapView) {
        int i3 = 0;
        if (item == null) {
            return false;
        }
        mapView.getProjection().toPixels(item.getPoint(), this.mCurScreenCoords);
        if (this.mDrawFocusedItem && this.mFocusedItem == item) {
            i3 = 4;
        }
        Drawable marker = item.getMarker(i3);
        if (marker == null) {
            marker = getDefaultMarker(i3);
        }
        boundToHotspot(marker, item.getMarkerHotspot());
        marker.copyBounds(this.mRect);
        Rect rect = this.mRect;
        Point point = this.mCurScreenCoords;
        rect.offset(point.x, point.y);
        Rect rect2 = this.mRect;
        Point point2 = this.mCurScreenCoords;
        RectL.getBounds(rect2, point2.x, point2.y, -mapView.getMapOrientation(), this.mOrientedMarkerRect);
        return this.mOrientedMarkerRect.contains(i, i2);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
    }

    public boolean onDrawItem(Canvas canvas, Item item, Point point, Projection projection) {
        int i = (this.mDrawFocusedItem && this.mFocusedItem == item) ? 4 : 0;
        Drawable defaultMarker = item.getMarker(i) == null ? getDefaultMarker(i) : item.getMarker(i);
        boundToHotspot(defaultMarker, item.getMarkerHotspot());
        Point point2 = this.mCurScreenCoords;
        int i2 = point2.x;
        int i3 = point2.y;
        defaultMarker.copyBounds(this.mRect);
        this.mMarkerRect.set(this.mRect);
        this.mRect.offset(i2, i3);
        RectL.getBounds(this.mRect, i2, i3, projection.getOrientation(), this.mOrientedMarkerRect);
        boolean intersects = Rect.intersects(this.mOrientedMarkerRect, canvas.getClipBounds());
        if (intersects) {
            if (projection.getOrientation() != 0.0f) {
                canvas.save();
                canvas.rotate(-projection.getOrientation(), i2, i3);
            }
            defaultMarker.setBounds(this.mRect);
            defaultMarker.draw(canvas);
            if (projection.getOrientation() != 0.0f) {
                canvas.restore();
            }
            defaultMarker.setBounds(this.mMarkerRect);
        }
        return intersects;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapConfirmed(MotionEvent motionEvent, MapView mapView) {
        int size = size();
        int round = Math.round(motionEvent.getX());
        int round2 = Math.round(motionEvent.getY());
        for (int i = 0; i < size; i++) {
            if (isEventOnItem(getItem(i), round, round2, mapView) && onTap(i)) {
                return true;
            }
        }
        return super.onSingleTapConfirmed(motionEvent, mapView);
    }

    public boolean onTap(int i) {
        return false;
    }

    public final void populate() {
        int size = size();
        this.mInternalItemList.clear();
        this.mInternalItemList.ensureCapacity(size);
        for (int i = 0; i < size; i++) {
            this.mInternalItemList.add(createItem(i));
        }
        this.mInternalItemDisplayedList = null;
    }

    public void setDrawFocusedItem(boolean z) {
        this.mDrawFocusedItem = z;
    }

    public void setDrawnItemsLimit(int i) {
        this.mDrawnItemsLimit = i;
    }

    public void setFocus(Item item) {
        this.mPendingFocusChangedEvent = item != this.mFocusedItem;
        this.mFocusedItem = item;
    }

    public void setOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.mOnFocusChangeListener = onFocusChangeListener;
    }

    public abstract int size();
}
