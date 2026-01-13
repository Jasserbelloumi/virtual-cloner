package com.google.android.gms.maps.model;

import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface TileProvider {
    @oo0oO0
    public static final Tile NO_TILE = new Tile(-1, -1, null);

    @o0OO00OO
    Tile getTile(int i, int i2, int i3);
}
