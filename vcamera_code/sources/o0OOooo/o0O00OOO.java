package o0OOooo;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.util.AtomicFile;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import multispace.multiapp.clone.app.App;
import multispace.multiapp.clone.manager.xp.XposedConfig;
import o0O0oooo.o0OO;
import o0OOoO0.o00oo;
import o0ooO0O0.oO0O000o;
import o0ooO0O0.oO0oO000;
/* loaded from: classes3.dex */
public class o0O00OOO {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static o0O00OOO f15410o00oOooO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public XposedConfig f15411o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Object f15412o00oOOoO = new Object();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Map<String, o0O00OO> f15413o00oOo00 = new HashMap();

    public o0O00OOO() {
        o00oOoO();
    }

    public static o0O00OOO o00oOo00() {
        if (f15410o00oOooO == null) {
            synchronized (o0O00OOO.class) {
                if (f15410o00oOooO == null) {
                    f15410o00oOooO = new o0O00OOO();
                }
            }
        }
        return f15410o00oOooO;
    }

    public final void o00oOOo0(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public List<o0O00OO> o00oOOoO() {
        ArrayList arrayList;
        o0O00OO o00oOooO2;
        List<String> o00oOoO2 = o0OO.o00oOoO(0, 0);
        if (o00oOoO2.isEmpty()) {
            return new ArrayList();
        }
        synchronized (this.f15413o00oOo00) {
            for (String str : o00oOoO2) {
                PackageInfo o00oOoOo2 = o0OO.o00oOoOo(str, 0, 128);
                if (!this.f15413o00oOo00.containsKey(o00oOoOo2.packageName) && (o00oOooO2 = oO0oO000.o00oOooO(o00oOoOo2.applicationInfo)) != null) {
                    this.f15413o00oOo00.put(o00oOoOo2.packageName, o00oOooO2);
                }
            }
            arrayList = new ArrayList(this.f15413o00oOo00.values());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o0O00OO o0o00oo = (o0O00OO) it.next();
                o0o00oo.f15408o00oOo0O = o00oOo0o(o0o00oo.f15405o00oOOo0);
            }
        }
        return arrayList;
    }

    public final File o00oOo0O() {
        return new File(App.o00oOOoO().getFilesDir(), o00oo.o00oOOo0(new byte[]{-122, -120, -12, -40, -101, -77, -63, -82, -101, -89, -56, -38, -102, -79}, new byte[]{-2, -8, -85, -75, -12, -41, -76, -62}));
    }

    public boolean o00oOo0o(String str) {
        boolean z;
        synchronized (this.f15412o00oOOoO) {
            Boolean bool = this.f15411o00oOOo0.f6690o00oo0O.get(str);
            z = bool != null && bool.booleanValue();
        }
        return z;
    }

    public final void o00oOoO() {
        File o00oOo0O2 = o00oOo0O();
        if (!o00oOo0O2.exists()) {
            this.f15411o00oOOo0 = new XposedConfig();
            o00oOoo0();
            return;
        }
        Parcel parcel = null;
        try {
            try {
                parcel = oO0O000o.o00ooO00(o00oOo0O2);
                this.f15411o00oOOo0 = new XposedConfig(parcel);
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

    public boolean o00oOoO0() {
        boolean z;
        synchronized (this.f15412o00oOOoO) {
            z = this.f15411o00oOOo0.f6691o00oo0O0;
        }
        return z;
    }

    public void o00oOoOO(String str) {
        synchronized (this.f15413o00oOo00) {
            this.f15413o00oOo00.remove(str);
        }
        synchronized (this.f15412o00oOOoO) {
            this.f15411o00oOOo0.f6690o00oo0O.put(str, Boolean.FALSE);
            this.f15411o00oOOo0.f6692o00oo0Oo.put(str, new HashSet<>());
            o00oOoo0();
        }
    }

    public void o00oOoOo(String str) {
        synchronized (this.f15413o00oOo00) {
            this.f15413o00oOo00.remove(str);
        }
        synchronized (this.f15412o00oOOoO) {
            this.f15411o00oOOo0.f6690o00oo0O.remove(str);
            this.f15411o00oOOo0.f6692o00oo0Oo.remove(str);
            o00oOoo0();
        }
    }

    public final void o00oOoo0() {
        Parcel obtain = Parcel.obtain();
        AtomicFile atomicFile = new AtomicFile(o00oOo0O());
        FileOutputStream fileOutputStream = null;
        try {
            try {
                this.f15411o00oOOo0.writeToParcel(obtain, 0);
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

    public HashSet<String> o00oOooO(String str) {
        synchronized (this.f15412o00oOOoO) {
            if (o0OO.o00oOoOo(str, 0, 0) == null) {
                return new HashSet<>();
            }
            HashSet<String> hashSet = this.f15411o00oOOo0.f6692o00oo0Oo.get(str);
            if (hashSet == null) {
                return new HashSet<>();
            }
            return hashSet;
        }
    }

    public void o00oOooo(String str, HashSet<String> hashSet) {
        synchronized (this.f15412o00oOOoO) {
            if (o0OO.o00oOoOo(str, 0, 0) == null) {
                return;
            }
            HashSet<String> hashSet2 = this.f15411o00oOOo0.f6692o00oo0Oo.get(str);
            if (hashSet2 == null) {
                hashSet2 = new HashSet<>();
                this.f15411o00oOOo0.f6692o00oo0Oo.put(str, hashSet2);
            }
            hashSet2.clear();
            hashSet2.addAll(hashSet);
            o00oOoo0();
        }
    }

    public void o00oo0(boolean z) {
        synchronized (this.f15412o00oOOoO) {
            this.f15411o00oOOo0.f6691o00oo0O0 = z;
            o00oOoo0();
        }
    }

    public void o00oo00O(String str, boolean z) {
        synchronized (this.f15412o00oOOoO) {
            if (o0OO.o00oOoOo(str, 0, 0) == null) {
                return;
            }
            this.f15411o00oOOo0.f6690o00oo0O.put(str, Boolean.valueOf(z));
            o00oOoo0();
        }
    }
}
