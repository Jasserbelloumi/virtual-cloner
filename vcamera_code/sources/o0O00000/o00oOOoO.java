package o0O00000;

import android.location.GnssStatus;
import android.os.Build;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
@o0OOooO0(24)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class o00oOOoO extends o0O00000.o00oOOo0 {

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final GnssStatus f10146o00oOoOO;

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static float o00oOOo0(GnssStatus gnssStatus, int i) {
            return gnssStatus.getCarrierFrequencyHz(i);
        }

        @o0O0O0Oo
        public static boolean o00oOOoO(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasCarrierFrequencyHz(i);
        }
    }

    @o0OOooO0(30)
    /* renamed from: o0O00000.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0122o00oOOoO {
        @o0O0O0Oo
        public static float o00oOOo0(GnssStatus gnssStatus, int i) {
            float basebandCn0DbHz;
            basebandCn0DbHz = gnssStatus.getBasebandCn0DbHz(i);
            return basebandCn0DbHz;
        }

        @o0O0O0Oo
        public static boolean o00oOOoO(GnssStatus gnssStatus, int i) {
            boolean hasBasebandCn0DbHz;
            hasBasebandCn0DbHz = gnssStatus.hasBasebandCn0DbHz(i);
            return hasBasebandCn0DbHz;
        }
    }

    public o00oOOoO(Object obj) {
        GnssStatus gnssStatus = (GnssStatus) obj;
        gnssStatus.getClass();
        this.f10146o00oOoOO = gnssStatus;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00oOOoO) {
            return this.f10146o00oOoOO.equals(((o00oOOoO) obj).f10146o00oOoOO);
        }
        return false;
    }

    public int hashCode() {
        return this.f10146o00oOoOO.hashCode();
    }

    @Override // o0O00000.o00oOOo0
    public float o00oOOo0(int i) {
        return this.f10146o00oOoOO.getAzimuthDegrees(i);
    }

    @Override // o0O00000.o00oOOo0
    public float o00oOOoO(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0122o00oOOoO.o00oOOo0(this.f10146o00oOoOO, i);
        }
        throw new UnsupportedOperationException();
    }

    @Override // o0O00000.o00oOOo0
    public float o00oOo00(int i) {
        return o00oOOo0.o00oOOo0(this.f10146o00oOoOO, i);
    }

    @Override // o0O00000.o00oOOo0
    public int o00oOo0O(int i) {
        return this.f10146o00oOoOO.getConstellationType(i);
    }

    @Override // o0O00000.o00oOOo0
    public float o00oOo0o(int i) {
        return this.f10146o00oOoOO.getElevationDegrees(i);
    }

    @Override // o0O00000.o00oOOo0
    public int o00oOoO(int i) {
        return this.f10146o00oOoOO.getSvid(i);
    }

    @Override // o0O00000.o00oOOo0
    public int o00oOoO0() {
        return this.f10146o00oOoOO.getSatelliteCount();
    }

    @Override // o0O00000.o00oOOo0
    public boolean o00oOoOO(int i) {
        return this.f10146o00oOoOO.hasAlmanacData(i);
    }

    @Override // o0O00000.o00oOOo0
    public boolean o00oOoOo(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0122o00oOOoO.o00oOOoO(this.f10146o00oOoOO, i);
        }
        return false;
    }

    @Override // o0O00000.o00oOOo0
    public boolean o00oOoo0(int i) {
        return o00oOOo0.o00oOOoO(this.f10146o00oOoOO, i);
    }

    @Override // o0O00000.o00oOOo0
    public float o00oOooO(int i) {
        return this.f10146o00oOoOO.getCn0DbHz(i);
    }

    @Override // o0O00000.o00oOOo0
    public boolean o00oOooo(int i) {
        return this.f10146o00oOoOO.hasEphemerisData(i);
    }

    @Override // o0O00000.o00oOOo0
    public boolean o00oo00O(int i) {
        return this.f10146o00oOoOO.usedInFix(i);
    }
}
