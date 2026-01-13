package org.osmdroid.util;

import android.graphics.Rect;
/* loaded from: classes3.dex */
public abstract class TileLooper {
    private boolean horizontalWrapEnabled;
    public int mTileZoomLevel;
    public final Rect mTiles;
    private boolean verticalWrapEnabled;

    public TileLooper() {
        this(false, false);
    }

    public TileLooper(boolean z, boolean z2) {
        this.mTiles = new Rect();
        this.horizontalWrapEnabled = z;
        this.verticalWrapEnabled = z2;
    }

    public void finaliseLoop() {
    }

    public abstract void handleTile(long j, int i, int i2);

    public void initialiseLoop() {
    }

    public boolean isHorizontalWrapEnabled() {
        return this.horizontalWrapEnabled;
    }

    public boolean isVerticalWrapEnabled() {
        return this.verticalWrapEnabled;
    }

    public void loop(double d, RectL rectL) {
        TileSystem.getTileFromMercator(rectL, TileSystem.getTileSize(d), this.mTiles);
        this.mTileZoomLevel = TileSystem.getInputTileZoomLevel(d);
        initialiseLoop();
        int i = 1 << this.mTileZoomLevel;
        int i2 = this.mTiles.left;
        while (true) {
            Rect rect = this.mTiles;
            if (i2 > rect.right) {
                finaliseLoop();
                return;
            }
            for (int i3 = rect.top; i3 <= this.mTiles.bottom; i3++) {
                if ((this.horizontalWrapEnabled || (i2 >= 0 && i2 < i)) && (this.verticalWrapEnabled || (i3 >= 0 && i3 < i))) {
                    handleTile(MapTileIndex.getTileIndex(this.mTileZoomLevel, MyMath.mod(i2, i), MyMath.mod(i3, i)), i2, i3);
                }
            }
            i2++;
        }
    }

    public void setHorizontalWrapEnabled(boolean z) {
        this.horizontalWrapEnabled = z;
    }

    public void setVerticalWrapEnabled(boolean z) {
        this.verticalWrapEnabled = z;
    }
}
