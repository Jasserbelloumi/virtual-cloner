package o0O0Oooo;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
/* loaded from: classes.dex */
public class oooOO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f12266o00oOOo0 = "a";

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static <T extends o0OO000o> T o00oOOo0(InputStream inputStream) {
        return (T) new o0OO000(inputStream, null).o0O000oo();
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static <T extends o0OO000o> T o00oOOoO(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).o00oOOo0();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    @o0OO00OO
    public static <T extends o0OO000o> T o00oOo00(@o00oOooO.oo0oO0 Bundle bundle, @o00oOooO.oo0oO0 String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(oooOO0.class.getClassLoader());
            return (T) o00oOOoO(bundle2.getParcelable(f12266o00oOOo0));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void o00oOo0O(@o00oOooO.oo0oO0 Bundle bundle, @o00oOooO.oo0oO0 String str, @o0OO00OO o0OO000o o0oo000o) {
        if (o0oo000o == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(f12266o00oOOo0, new ParcelImpl(o0oo000o));
        bundle.putParcelable(str, bundle2);
    }

    public static void o00oOo0o(@o00oOooO.oo0oO0 Bundle bundle, @o00oOooO.oo0oO0 String str, @o00oOooO.oo0oO0 List<? extends o0OO000o> list) {
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (o0OO000o o0oo000o : list) {
            arrayList.add(new ParcelImpl(o0oo000o));
        }
        bundle2.putParcelableArrayList(f12266o00oOOo0, arrayList);
        bundle.putParcelable(str, bundle2);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static Parcelable o00oOoO(o0OO000o o0oo000o) {
        return new ParcelImpl(o0oo000o);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static void o00oOoO0(o0OO000o o0oo000o, OutputStream outputStream) {
        o0OO000 o0oo000 = new o0OO000(null, outputStream);
        o0oo000.o0O0o0o(o0oo000o);
        o0oo000.o00oOOo0();
    }

    @o0OO00OO
    public static <T extends o0OO000o> List<T> o00oOooO(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(oooOO0.class.getClassLoader());
            Iterator it = bundle2.getParcelableArrayList(f12266o00oOOo0).iterator();
            while (it.hasNext()) {
                arrayList.add(o00oOOoO((Parcelable) it.next()));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
