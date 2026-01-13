package com.google.android.gms.maps.model;

import com.google.android.gms.maps.model.StampStyle;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class TextureStyle extends StampStyle {

    /* loaded from: classes2.dex */
    public static final class Builder extends StampStyle.Builder<Builder> {
        private Builder() {
        }

        public /* synthetic */ Builder(zzx zzxVar) {
        }

        @oo0oO0
        public TextureStyle build() {
            return new TextureStyle(this.zza, null);
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        @oo0oO0
        public final /* bridge */ /* synthetic */ Builder self() {
            return this;
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        @oo0oO0
        /* renamed from: self  reason: avoid collision after fix types in other method */
        public Builder self2() {
            return this;
        }
    }

    public /* synthetic */ TextureStyle(BitmapDescriptor bitmapDescriptor, zzy zzyVar) {
        super(bitmapDescriptor);
    }

    @oo0oO0
    public static Builder newBuilder(@oo0oO0 BitmapDescriptor bitmapDescriptor) {
        return new Builder(null).stamp(bitmapDescriptor);
    }
}
