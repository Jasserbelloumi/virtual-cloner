package o0O00000;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import java.util.Iterator;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class o00oOoO extends o00oOOo0 {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f10147o00oo = 200;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f10148o00oo0 = 0;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f10149o00oo0O = 64;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f10150o00oo0O0 = 33;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f10151o00oo0OO = 32;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f10152o00oo0Oo = -87;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f10153o00oo0o = 24;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f10154o00oo0o0 = 64;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f10155o00oo0oO = 193;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f10156o00ooO00 = 35;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f10157o0O0o = 200;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final GpsStatus f10158o00oOoOO;
    @o0O0OOOo("mWrapped")

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public int f10159o00oOoOo;
    @o0O0OOOo("mWrapped")

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public Iterator<GpsSatellite> f10160o00oOoo0;
    @o0O0OOOo("mWrapped")

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f10161o00oOooo;
    @o0O0OOOo("mWrapped")

    /* renamed from: o00oo00O  reason: collision with root package name */
    public GpsSatellite f10162o00oo00O;

    public o00oOoO(GpsStatus gpsStatus) {
        gpsStatus.getClass();
        this.f10158o00oOoOO = gpsStatus;
        this.f10159o00oOoOo = -1;
        this.f10160o00oOoo0 = gpsStatus.getSatellites().iterator();
        this.f10161o00oOooo = -1;
        this.f10162o00oo00O = null;
    }

    public static int o00oo0O0(int i) {
        if (i <= 0 || i > 32) {
            if (i < 33 || i > 64) {
                if (i <= 64 || i > 88) {
                    if (i <= 200 || i > 235) {
                        return (i < 193 || i > 200) ? 0 : 4;
                    }
                    return 5;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static int o00oo0Oo(int i) {
        int o00oo0O02 = o00oo0O0(i);
        return o00oo0O02 != 2 ? o00oo0O02 != 3 ? o00oo0O02 != 5 ? i : i - 200 : i - 64 : i + 87;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00oOoO) {
            return this.f10158o00oOoOO.equals(((o00oOoO) obj).f10158o00oOoOO);
        }
        return false;
    }

    public int hashCode() {
        return this.f10158o00oOoOO.hashCode();
    }

    @Override // o0O00000.o00oOOo0
    public float o00oOOo0(int i) {
        return o00oo0O(i).getAzimuth();
    }

    @Override // o0O00000.o00oOOo0
    public float o00oOOoO(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o0O00000.o00oOOo0
    public float o00oOo00(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o0O00000.o00oOOo0
    public int o00oOo0O(int i) {
        return o00oo0O0(o00oo0O(i).getPrn());
    }

    @Override // o0O00000.o00oOOo0
    public float o00oOo0o(int i) {
        return o00oo0O(i).getElevation();
    }

    @Override // o0O00000.o00oOOo0
    public int o00oOoO(int i) {
        return o00oo0Oo(o00oo0O(i).getPrn());
    }

    @Override // o0O00000.o00oOOo0
    public int o00oOoO0() {
        int i;
        synchronized (this.f10158o00oOoOO) {
            if (this.f10159o00oOoOo == -1) {
                for (GpsSatellite gpsSatellite : this.f10158o00oOoOO.getSatellites()) {
                    this.f10159o00oOoOo++;
                }
                this.f10159o00oOoOo++;
            }
            i = this.f10159o00oOoOo;
        }
        return i;
    }

    @Override // o0O00000.o00oOOo0
    public boolean o00oOoOO(int i) {
        return o00oo0O(i).hasAlmanac();
    }

    @Override // o0O00000.o00oOOo0
    public boolean o00oOoOo(int i) {
        return false;
    }

    @Override // o0O00000.o00oOOo0
    public boolean o00oOoo0(int i) {
        return false;
    }

    @Override // o0O00000.o00oOOo0
    public float o00oOooO(int i) {
        return o00oo0O(i).getSnr();
    }

    @Override // o0O00000.o00oOOo0
    public boolean o00oOooo(int i) {
        return o00oo0O(i).hasEphemeris();
    }

    @Override // o0O00000.o00oOOo0
    public boolean o00oo00O(int i) {
        return o00oo0O(i).usedInFix();
    }

    public final GpsSatellite o00oo0O(int i) {
        GpsSatellite gpsSatellite;
        synchronized (this.f10158o00oOoOO) {
            if (i < this.f10161o00oOooo) {
                this.f10160o00oOoo0 = this.f10158o00oOoOO.getSatellites().iterator();
                this.f10161o00oOooo = -1;
            }
            while (true) {
                int i2 = this.f10161o00oOooo;
                if (i2 >= i) {
                    break;
                }
                this.f10161o00oOooo = i2 + 1;
                if (!this.f10160o00oOoo0.hasNext()) {
                    this.f10162o00oo00O = null;
                    break;
                }
                this.f10162o00oo00O = this.f10160o00oOoo0.next();
            }
            gpsSatellite = this.f10162o00oo00O;
        }
        gpsSatellite.getClass();
        return gpsSatellite;
    }
}
