package org.osmdroid.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes3.dex */
public class MapTileAreaList implements MapTileContainer, IterableWithSize<Long> {
    private final List<MapTileArea> mList = new ArrayList();

    @Override // org.osmdroid.util.MapTileContainer
    public boolean contains(long j) {
        for (MapTileArea mapTileArea : this.mList) {
            if (mapTileArea.contains(j)) {
                return true;
            }
        }
        return false;
    }

    public List<MapTileArea> getList() {
        return this.mList;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return new Iterator<Long>() { // from class: org.osmdroid.util.MapTileAreaList.1
            private Iterator<Long> mCurrent;
            private int mIndex;

            private Iterator<Long> getCurrent() {
                Iterator<Long> it = this.mCurrent;
                if (it != null) {
                    return it;
                }
                if (this.mIndex < MapTileAreaList.this.mList.size()) {
                    List list = MapTileAreaList.this.mList;
                    int i = this.mIndex;
                    this.mIndex = i + 1;
                    Iterator<Long> it2 = ((MapTileArea) list.get(i)).iterator();
                    this.mCurrent = it2;
                    return it2;
                }
                return null;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Iterator<Long> current = getCurrent();
                return current != null && current.hasNext();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public Long next() {
                long longValue = getCurrent().next().longValue();
                if (!getCurrent().hasNext()) {
                    this.mCurrent = null;
                }
                return Long.valueOf(longValue);
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // org.osmdroid.util.IterableWithSize
    public int size() {
        int i = 0;
        for (MapTileArea mapTileArea : this.mList) {
            i += mapTileArea.size();
        }
        return i;
    }
}
