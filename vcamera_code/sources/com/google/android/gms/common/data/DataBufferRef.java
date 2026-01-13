package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public abstract class DataBufferRef {
    @oo0oO0
    @KeepForSdk
    public final DataHolder mDataHolder;
    @KeepForSdk
    public int mDataRow;
    private int zaa;

    @KeepForSdk
    public DataBufferRef(@oo0oO0 DataHolder dataHolder, int i) {
        this.mDataHolder = (DataHolder) Preconditions.checkNotNull(dataHolder);
        zaa(i);
    }

    @KeepForSdk
    public void copyToBuffer(@oo0oO0 String str, @oo0oO0 CharArrayBuffer charArrayBuffer) {
        this.mDataHolder.zac(str, this.mDataRow, this.zaa, charArrayBuffer);
    }

    @KeepForSdk
    public boolean equals(@o0OO00OO Object obj) {
        if (obj instanceof DataBufferRef) {
            DataBufferRef dataBufferRef = (DataBufferRef) obj;
            if (Objects.equal(Integer.valueOf(dataBufferRef.mDataRow), Integer.valueOf(this.mDataRow)) && Objects.equal(Integer.valueOf(dataBufferRef.zaa), Integer.valueOf(this.zaa)) && dataBufferRef.mDataHolder == this.mDataHolder) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public boolean getBoolean(@oo0oO0 String str) {
        return this.mDataHolder.getBoolean(str, this.mDataRow, this.zaa);
    }

    @oo0oO0
    @KeepForSdk
    public byte[] getByteArray(@oo0oO0 String str) {
        return this.mDataHolder.getByteArray(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public int getDataRow() {
        return this.mDataRow;
    }

    @KeepForSdk
    public double getDouble(@oo0oO0 String str) {
        return this.mDataHolder.zaa(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public float getFloat(@oo0oO0 String str) {
        return this.mDataHolder.zab(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public int getInteger(@oo0oO0 String str) {
        return this.mDataHolder.getInteger(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public long getLong(@oo0oO0 String str) {
        return this.mDataHolder.getLong(str, this.mDataRow, this.zaa);
    }

    @oo0oO0
    @KeepForSdk
    public String getString(@oo0oO0 String str) {
        return this.mDataHolder.getString(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public boolean hasColumn(@oo0oO0 String str) {
        return this.mDataHolder.hasColumn(str);
    }

    @KeepForSdk
    public boolean hasNull(@oo0oO0 String str) {
        return this.mDataHolder.hasNull(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.mDataRow), Integer.valueOf(this.zaa), this.mDataHolder);
    }

    @KeepForSdk
    public boolean isDataValid() {
        return !this.mDataHolder.isClosed();
    }

    @o0OO00OO
    @KeepForSdk
    public Uri parseUri(@oo0oO0 String str) {
        String string = this.mDataHolder.getString(str, this.mDataRow, this.zaa);
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final void zaa(int i) {
        boolean z = false;
        if (i >= 0 && i < this.mDataHolder.getCount()) {
            z = true;
        }
        Preconditions.checkState(z);
        this.mDataRow = i;
        this.zaa = this.mDataHolder.getWindowIndex(i);
    }
}
