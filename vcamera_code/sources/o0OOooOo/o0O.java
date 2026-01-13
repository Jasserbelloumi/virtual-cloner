package o0OOooOo;

import android.os.Parcel;
import android.util.AtomicFile;
import com.google.common.base.Ascii;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import multispace.multiapp.clone.app.App;
import multispace.multiapp.clone.bean.LocationInfo;
import multispace.multiapp.clone.manager.gps.LocationConfig;
import o0O0oooo.o0OO;
import o0OOoO0.o00oo;
import o0ooO0O0.oO0O000o;
/* loaded from: classes3.dex */
public class o0O {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static o0O f15402o00oOo00;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public LocationConfig f15403o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Object f15404o00oOOoO = new Object();

    public o0O() {
        o00oOoO0();
    }

    public static o0O o00oOo00() {
        if (f15402o00oOo00 == null) {
            synchronized (o0O.class) {
                if (f15402o00oOo00 == null) {
                    f15402o00oOo00 = new o0O();
                }
            }
        }
        return f15402o00oOo00;
    }

    public final void o00oOOo0(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public LocationInfo o00oOOoO(String str) {
        synchronized (this.f15404o00oOOoO) {
            if (o0OO.o00oOoOo(str, 0, 0) == null) {
                return null;
            }
            return this.f15403o00oOOo0.f6688o00oo0O.get(str);
        }
    }

    public boolean o00oOo0O(String str) {
        boolean z;
        synchronized (this.f15404o00oOOoO) {
            LocationInfo locationInfo = this.f15403o00oOOo0.f6688o00oo0O.get(str);
            z = locationInfo != null && locationInfo.o00oOo0O();
        }
        return z;
    }

    public boolean o00oOo0o() {
        boolean z;
        synchronized (this.f15404o00oOOoO) {
            z = this.f15403o00oOOo0.f6689o00oo0O0;
        }
        return z;
    }

    public void o00oOoO(String str) {
        synchronized (this.f15404o00oOOoO) {
            if (o0OO.o00oOoOo(str, 0, 0) != null) {
                return;
            }
            this.f15403o00oOOo0.f6688o00oo0O.remove(str);
            o00oOoOO();
        }
    }

    public final void o00oOoO0() {
        File o00oOooO2 = o00oOooO();
        if (!o00oOooO2.exists()) {
            this.f15403o00oOOo0 = new LocationConfig();
            o00oOoOO();
            return;
        }
        Parcel parcel = null;
        try {
            try {
                parcel = oO0O000o.o00ooO00(o00oOooO2);
                this.f15403o00oOOo0 = new LocationConfig(parcel);
                if (parcel == null) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (parcel == null) {
                    return;
                }
            }
            parcel.recycle();
        } catch (Throwable th) {
            if (parcel != null) {
                parcel.recycle();
            }
            throw th;
        }
    }

    public final void o00oOoOO() {
        Parcel obtain = Parcel.obtain();
        AtomicFile atomicFile = new AtomicFile(o00oOooO());
        FileOutputStream fileOutputStream = null;
        try {
            try {
                this.f15403o00oOOo0.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                fileOutputStream = atomicFile.startWrite();
                oO0O000o.o00ooOO(obtain, fileOutputStream);
                atomicFile.finishWrite(fileOutputStream);
            } catch (Exception unused) {
                atomicFile.failWrite(fileOutputStream);
            }
        } finally {
            obtain.recycle();
            o00oOOo0(fileOutputStream);
        }
    }

    public void o00oOoOo(String str, boolean z) {
        synchronized (this.f15404o00oOOoO) {
            if (o0OO.o00oOoOo(str, 0, 0) == null) {
                return;
            }
            if (this.f15403o00oOOo0.f6688o00oo0O.get(str) == null) {
                return;
            }
            this.f15403o00oOOo0.f6688o00oo0O.get(str).o00oOo0o(z);
            o00oOoOO();
        }
    }

    public void o00oOoo0(String str, LocationInfo locationInfo) {
        synchronized (this.f15404o00oOOoO) {
            if (o0OO.o00oOoOo(str, 0, 0) == null) {
                return;
            }
            this.f15403o00oOOo0.f6688o00oo0O.put(str, locationInfo);
            o00oOoOO();
        }
    }

    public final File o00oOooO() {
        return new File(App.o00oOOoO().getFilesDir(), o00oo.o00oOOo0(new byte[]{53, -55, 54, 77, 123, -40, -45, -46, 62, -36, Ascii.SUB, 113, 121, -39, -47}, new byte[]{82, -71, 69, Ascii.DC2, Ascii.SYN, -73, -73, -89}));
    }

    public void o00oOooo(boolean z) {
        synchronized (this.f15404o00oOOoO) {
            this.f15403o00oOOo0.f6689o00oo0O0 = z;
            o00oOoOO();
        }
    }
}
