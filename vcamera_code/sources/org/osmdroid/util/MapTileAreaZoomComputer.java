package org.osmdroid.util;
/* loaded from: classes3.dex */
public class MapTileAreaZoomComputer implements MapTileAreaComputer {
    private final int mZoomDelta;

    public MapTileAreaZoomComputer(int i) {
        this.mZoomDelta = i;
    }

    @Override // org.osmdroid.util.MapTileAreaComputer
    public MapTileArea computeFromSource(MapTileArea mapTileArea, MapTileArea mapTileArea2) {
        int i;
        int top;
        int right;
        int bottom;
        if (mapTileArea2 == null) {
            mapTileArea2 = new MapTileArea();
        }
        if (mapTileArea.size() == 0) {
            mapTileArea2.reset();
            return mapTileArea2;
        }
        int zoom = mapTileArea.getZoom();
        int i2 = this.mZoomDelta;
        int i3 = zoom + i2;
        if (i3 < 0 || i3 > MapTileIndex.mMaxZoomLevel) {
            mapTileArea2.reset();
            return mapTileArea2;
        }
        int left = mapTileArea.getLeft();
        if (i2 <= 0) {
            i = left >> (-this.mZoomDelta);
            top = mapTileArea.getTop() >> (-this.mZoomDelta);
            right = mapTileArea.getRight() >> (-this.mZoomDelta);
            bottom = mapTileArea.getBottom() >> (-this.mZoomDelta);
        } else {
            i = left << this.mZoomDelta;
            top = mapTileArea.getTop() << this.mZoomDelta;
            right = ((mapTileArea.getRight() + 1) << this.mZoomDelta) - 1;
            bottom = ((mapTileArea.getBottom() + 1) << this.mZoomDelta) - 1;
        }
        mapTileArea2.set(i3, i, top, right, bottom);
        return mapTileArea2;
    }
}
