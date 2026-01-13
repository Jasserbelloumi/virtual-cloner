package org.osmdroid.views.overlay.gestures;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.IOverlayMenuProvider;
import org.osmdroid.views.overlay.Overlay;
import org.osmdroid.views.overlay.gestures.RotationGestureDetector;
/* loaded from: classes3.dex */
public class RotationGestureOverlay extends Overlay implements RotationGestureDetector.RotationListener, IOverlayMenuProvider {
    private static final int MENU_ENABLED = Overlay.getSafeMenuId();
    private static final int MENU_ROTATE_CCW = Overlay.getSafeMenuId();
    private static final int MENU_ROTATE_CW = Overlay.getSafeMenuId();
    private static final boolean SHOW_ROTATE_MENU_ITEMS = false;
    public float currentAngle;
    public final long deltaTime;
    private MapView mMapView;
    private boolean mOptionsMenuEnabled;
    private final RotationGestureDetector mRotationDetector;
    public long timeLastSet;

    @Deprecated
    public RotationGestureOverlay(Context context, MapView mapView) {
        this(mapView);
    }

    public RotationGestureOverlay(MapView mapView) {
        this.mOptionsMenuEnabled = true;
        this.timeLastSet = 0L;
        this.deltaTime = 25L;
        this.currentAngle = 0.0f;
        this.mMapView = mapView;
        this.mRotationDetector = new RotationGestureDetector(this);
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean isOptionsMenuEnabled() {
        return this.mOptionsMenuEnabled;
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onCreateOptionsMenu(Menu menu, int i, MapView mapView) {
        menu.add(0, MENU_ENABLED + i, 0, "Enable rotation").setIcon(17301569);
        return true;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        this.mMapView = null;
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onOptionsItemSelected(MenuItem menuItem, int i, MapView mapView) {
        MapView mapView2;
        float mapOrientation;
        if (menuItem.getItemId() != MENU_ENABLED + i) {
            if (menuItem.getItemId() == MENU_ROTATE_CCW + i) {
                mapView2 = this.mMapView;
                mapOrientation = mapView2.getMapOrientation() - 10.0f;
            } else if (menuItem.getItemId() == MENU_ROTATE_CW + i) {
                mapView2 = this.mMapView;
                mapOrientation = mapView2.getMapOrientation() + 10.0f;
            }
            mapView2.setMapOrientation(mapOrientation);
        } else if (!isEnabled()) {
            setEnabled(true);
            return true;
        } else {
            this.mMapView.setMapOrientation(0.0f);
            setEnabled(false);
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onPrepareOptionsMenu(Menu menu, int i, MapView mapView) {
        menu.findItem(MENU_ENABLED + i).setTitle(isEnabled() ? "Disable rotation" : "Enable rotation");
        return false;
    }

    @Override // org.osmdroid.views.overlay.gestures.RotationGestureDetector.RotationListener
    public void onRotate(float f) {
        this.currentAngle += f;
        if (System.currentTimeMillis() - 25 > this.timeLastSet) {
            this.timeLastSet = System.currentTimeMillis();
            MapView mapView = this.mMapView;
            mapView.setMapOrientation(mapView.getMapOrientation() + this.currentAngle);
        }
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onTouchEvent(MotionEvent motionEvent, MapView mapView) {
        this.mRotationDetector.onTouch(motionEvent);
        return super.onTouchEvent(motionEvent, mapView);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void setEnabled(boolean z) {
        this.mRotationDetector.setEnabled(z);
        super.setEnabled(z);
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public void setOptionsMenuEnabled(boolean z) {
        this.mOptionsMenuEnabled = z;
    }
}
