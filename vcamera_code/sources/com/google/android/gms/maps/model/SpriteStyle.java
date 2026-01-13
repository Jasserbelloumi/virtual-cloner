package com.google.android.gms.maps.model;

import com.google.android.gms.maps.model.StampStyle;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class SpriteStyle extends StampStyle {

    /* loaded from: classes2.dex */
    public static final class Builder extends StampStyle.Builder<Builder> {
        private Builder() {
        }

        public /* synthetic */ Builder(zzn zznVar) {
        }

        @oo0oO0
        public SpriteStyle build() {
            return new SpriteStyle(this.zza);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        @oo0oO0
        public Builder self() {
            return this;
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        @oo0oO0
        public final /* bridge */ /* synthetic */ Builder self() {
            return this;
        }
    }

    public SpriteStyle(@oo0oO0 BitmapDescriptor bitmapDescriptor) {
        super(bitmapDescriptor);
    }

    @oo0oO0
    public static Builder newBuilder(@oo0oO0 BitmapDescriptor bitmapDescriptor) {
        return new Builder(null).stamp(bitmapDescriptor);
    }
}
