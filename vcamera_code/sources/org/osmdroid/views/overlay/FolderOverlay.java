package org.osmdroid.views.overlay;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import java.util.List;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.TileSystem;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
/* loaded from: classes3.dex */
public class FolderOverlay extends Overlay {
    public String mDescription;
    public String mName;
    public OverlayManager mOverlayManager;

    public FolderOverlay() {
        this.mOverlayManager = new DefaultOverlayManager(null);
        this.mName = "";
        this.mDescription = "";
    }

    @Deprecated
    public FolderOverlay(Context context) {
        this();
    }

    private void recalculateBounds() {
        double d = -1.7976931348623157E308d;
        double d2 = -1.7976931348623157E308d;
        double d3 = Double.MAX_VALUE;
        double d4 = Double.MAX_VALUE;
        for (Overlay overlay : this.mOverlayManager) {
            BoundingBox bounds = overlay.getBounds();
            d3 = Math.min(d3, bounds.getLatSouth());
            d4 = Math.min(d4, bounds.getLonWest());
            d = Math.max(d, bounds.getLatNorth());
            d2 = Math.max(d2, bounds.getLonEast());
        }
        if (d3 != Double.MAX_VALUE) {
            this.mBounds = new BoundingBox(d, d2, d3, d4);
            return;
        }
        TileSystem tileSystem = MapView.getTileSystem();
        this.mBounds = new BoundingBox(tileSystem.getMaxLatitude(), tileSystem.getMaxLongitude(), tileSystem.getMinLatitude(), tileSystem.getMinLongitude());
    }

    public boolean add(Overlay overlay) {
        boolean add = this.mOverlayManager.add(overlay);
        if (add) {
            recalculateBounds();
        }
        return add;
    }

    public void closeAllInfoWindows() {
        for (Overlay overlay : this.mOverlayManager) {
            if (overlay instanceof FolderOverlay) {
                ((FolderOverlay) overlay).closeAllInfoWindows();
            } else if (overlay instanceof OverlayWithIW) {
                ((OverlayWithIW) overlay).closeInfoWindow();
            }
        }
    }

    @Override // org.osmdroid.views.overlay.Overlay
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas, MapView mapView, boolean z) {
        if (z) {
            return;
        }
        this.mOverlayManager.onDraw(canvas, mapView);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas, Projection projection) {
        this.mOverlayManager.onDraw(canvas, projection);
    }

    public String getDescription() {
        return this.mDescription;
    }

    public List<Overlay> getItems() {
        return this.mOverlayManager;
    }

    public String getName() {
        return this.mName;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        OverlayManager overlayManager = this.mOverlayManager;
        if (overlayManager != null) {
            overlayManager.onDetach(mapView);
        }
        this.mOverlayManager = null;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onLongPress(MotionEvent motionEvent, MapView mapView) {
        if (isEnabled()) {
            return this.mOverlayManager.onLongPress(motionEvent, mapView);
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapConfirmed(MotionEvent motionEvent, MapView mapView) {
        if (isEnabled()) {
            return this.mOverlayManager.onSingleTapConfirmed(motionEvent, mapView);
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapUp(MotionEvent motionEvent, MapView mapView) {
        if (isEnabled()) {
            return this.mOverlayManager.onSingleTapUp(motionEvent, mapView);
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onTouchEvent(MotionEvent motionEvent, MapView mapView) {
        if (isEnabled()) {
            return this.mOverlayManager.onTouchEvent(motionEvent, mapView);
        }
        return false;
    }

    public boolean remove(Overlay overlay) {
        boolean remove = this.mOverlayManager.remove(overlay);
        if (remove) {
            recalculateBounds();
        }
        return remove;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setName(String str) {
        this.mName = str;
    }
}
