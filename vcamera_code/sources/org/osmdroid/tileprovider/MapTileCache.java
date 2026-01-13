package org.osmdroid.tileprovider;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.osmdroid.config.Configuration;
import org.osmdroid.util.MapTileArea;
import org.osmdroid.util.MapTileAreaComputer;
import org.osmdroid.util.MapTileAreaList;
import org.osmdroid.util.MapTileContainer;
import org.osmdroid.util.MapTileList;
/* loaded from: classes3.dex */
public class MapTileCache {
    private final MapTileAreaList mAdditionalMapTileList;
    private boolean mAutoEnsureCapacity;
    private final HashMap<Long, Drawable> mCachedTiles;
    private int mCapacity;
    private final List<MapTileAreaComputer> mComputers;
    private final MapTileList mGC;
    private final MapTileArea mMapTileArea;
    private final MapTilePreCache mPreCache;
    private final List<MapTileContainer> mProtectors;
    private boolean mStressedMemory;
    private TileRemovedListener mTileRemovedListener;

    /* loaded from: classes3.dex */
    public interface TileRemovedListener {
        void onTileRemoved(long j);
    }

    public MapTileCache() {
        this(Configuration.getInstance().getCacheMapTileCount());
    }

    public MapTileCache(int i) {
        this.mCachedTiles = new HashMap<>();
        this.mMapTileArea = new MapTileArea();
        this.mAdditionalMapTileList = new MapTileAreaList();
        this.mGC = new MapTileList();
        this.mComputers = new ArrayList();
        this.mProtectors = new ArrayList();
        ensureCapacity(i);
        this.mPreCache = new MapTilePreCache(this);
    }

    private void populateSyncCachedTiles(MapTileList mapTileList) {
        synchronized (this.mCachedTiles) {
            mapTileList.ensureCapacity(this.mCachedTiles.size());
            mapTileList.clear();
            for (Long l : this.mCachedTiles.keySet()) {
                mapTileList.put(l.longValue());
            }
        }
    }

    private void refreshAdditionalLists() {
        MapTileArea mapTileArea;
        int i = 0;
        for (MapTileAreaComputer mapTileAreaComputer : this.mComputers) {
            if (i < this.mAdditionalMapTileList.getList().size()) {
                mapTileArea = this.mAdditionalMapTileList.getList().get(i);
            } else {
                mapTileArea = new MapTileArea();
                this.mAdditionalMapTileList.getList().add(mapTileArea);
            }
            mapTileAreaComputer.computeFromSource(this.mMapTileArea, mapTileArea);
            i++;
        }
        while (i < this.mAdditionalMapTileList.getList().size()) {
            this.mAdditionalMapTileList.getList().remove(this.mAdditionalMapTileList.getList().size() - 1);
        }
    }

    private boolean shouldKeepTile(long j) {
        if (this.mMapTileArea.contains(j) || this.mAdditionalMapTileList.contains(j)) {
            return true;
        }
        for (MapTileContainer mapTileContainer : this.mProtectors) {
            if (mapTileContainer.contains(j)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        MapTileList mapTileList = new MapTileList();
        populateSyncCachedTiles(mapTileList);
        for (int i = 0; i < mapTileList.getSize(); i++) {
            remove(mapTileList.get(i));
        }
        this.mCachedTiles.clear();
    }

    public boolean containsTile(long j) {
        boolean containsKey;
        synchronized (this.mCachedTiles) {
            containsKey = this.mCachedTiles.containsKey(Long.valueOf(j));
        }
        return containsKey;
    }

    public boolean ensureCapacity(int i) {
        if (this.mCapacity < i) {
            this.mCapacity = i;
            return true;
        }
        return false;
    }

    public void garbageCollection() {
        int i;
        int size = this.mCachedTiles.size();
        if (this.mStressedMemory) {
            i = Integer.MAX_VALUE;
        } else {
            i = size - this.mCapacity;
            if (i <= 0) {
                return;
            }
        }
        refreshAdditionalLists();
        if (this.mAutoEnsureCapacity) {
            if (ensureCapacity(this.mAdditionalMapTileList.size() + this.mMapTileArea.size()) && !this.mStressedMemory && (i = size - this.mCapacity) <= 0) {
                return;
            }
        }
        populateSyncCachedTiles(this.mGC);
        for (int i2 = 0; i2 < this.mGC.getSize(); i2++) {
            long j = this.mGC.get(i2);
            if (!shouldKeepTile(j)) {
                remove(j);
                i--;
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public MapTileAreaList getAdditionalMapTileList() {
        return this.mAdditionalMapTileList;
    }

    public Drawable getMapTile(long j) {
        Drawable drawable;
        synchronized (this.mCachedTiles) {
            drawable = this.mCachedTiles.get(Long.valueOf(j));
        }
        return drawable;
    }

    public MapTileArea getMapTileArea() {
        return this.mMapTileArea;
    }

    public MapTilePreCache getPreCache() {
        return this.mPreCache;
    }

    public List<MapTileAreaComputer> getProtectedTileComputers() {
        return this.mComputers;
    }

    public List<MapTileContainer> getProtectedTileContainers() {
        return this.mProtectors;
    }

    public int getSize() {
        return this.mCachedTiles.size();
    }

    public TileRemovedListener getTileRemovedListener() {
        return this.mTileRemovedListener;
    }

    public void maintenance() {
        garbageCollection();
        this.mPreCache.fill();
    }

    public void putTile(long j, Drawable drawable) {
        if (drawable != null) {
            synchronized (this.mCachedTiles) {
                this.mCachedTiles.put(Long.valueOf(j), drawable);
            }
        }
    }

    public void remove(long j) {
        Drawable remove;
        synchronized (this.mCachedTiles) {
            remove = this.mCachedTiles.remove(Long.valueOf(j));
        }
        if (getTileRemovedListener() != null) {
            getTileRemovedListener().onTileRemoved(j);
        }
        BitmapPool.getInstance().asyncRecycle(remove);
    }

    public void setAutoEnsureCapacity(boolean z) {
        this.mAutoEnsureCapacity = z;
    }

    public void setStressedMemory(boolean z) {
        this.mStressedMemory = z;
    }

    public void setTileRemovedListener(TileRemovedListener tileRemovedListener) {
        this.mTileRemovedListener = tileRemovedListener;
    }
}
