package o00ooOoo;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o00oOooO.o0OOooO0;
import o00ooOoo.oOo000Oo;
@o0OOooO0(16)
/* loaded from: classes.dex */
public class oO0O0O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9042o00oOOo0 = "NotificationCompat";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f9043o00oOOoO = "android.support.dataRemoteInputs";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f9044o00oOo00 = "android.support.allowGeneratedReplies";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f9045o00oOo0O = "title";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f9046o00oOo0o = "actionIntent";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f9047o00oOoO = "remoteInputs";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f9048o00oOoO0 = "extras";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f9049o00oOoOO = "dataOnlyRemoteInputs";

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f9050o00oOoOo = "resultKey";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f9051o00oOoo0 = "label";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f9052o00oOooO = "icon";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f9053o00oOooo = "choices";

    /* renamed from: o00oo  reason: collision with root package name */
    public static Field f9054o00oo = null;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f9055o00oo0 = "allowedDataTypes";

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final String f9056o00oo00O = "allowFreeFormInput";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f9058o00oo0O0 = "showsUserInterface";

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final String f9059o00oo0OO = "semanticAction";

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static Field f9060o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static boolean f9062o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static Field f9063o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static boolean f9064o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static Field f9065o00ooO00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static Field f9066o0O0o;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final Object f9057o00oo0O = new Object();

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final Object f9061o00oo0o = new Object();

    public static SparseArray<Bundle> o00oOOo0(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static boolean o00oOOoO() {
        if (f9064o00ooO0) {
            return false;
        }
        try {
            if (f9063o00oo0oO == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                f9066o0O0o = cls.getDeclaredField("icon");
                f9054o00oo = cls.getDeclaredField(f9045o00oOo0O);
                f9065o00ooO00 = cls.getDeclaredField(f9046o00oOo0o);
                Field declaredField = Notification.class.getDeclaredField(oOo000Oo.o0O000.f9434o00ooO0);
                f9063o00oo0oO = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException | NoSuchFieldException unused) {
            f9064o00ooO0 = true;
        }
        return true ^ f9064o00ooO0;
    }

    public static ooo0o o00oOo00(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f9055o00oo0);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new ooo0o(bundle.getString(f9050o00oOoOo), bundle.getCharSequence(f9051o00oOoo0), bundle.getCharSequenceArray(f9053o00oOooo), bundle.getBoolean(f9056o00oo00O), 0, bundle.getBundle("extras"), hashSet);
    }

    public static oOo000Oo.o00oOOoO o00oOo0O(Notification notification, int i) {
        SparseArray sparseParcelableArray;
        synchronized (f9061o00oo0o) {
            try {
                try {
                    Object[] o00oOoO2 = o00oOoO(notification);
                    if (o00oOoO2 != null) {
                        Object obj = o00oOoO2[i];
                        Bundle o00oOoo02 = o00oOoo0(notification);
                        return o00oOooo(f9066o0O0o.getInt(obj), (CharSequence) f9054o00oo.get(obj), (PendingIntent) f9065o00ooO00.get(obj), (o00oOoo02 == null || (sparseParcelableArray = o00oOoo02.getSparseParcelableArray(oO0O0O00.f9070o00oOo0O)) == null) ? null : (Bundle) sparseParcelableArray.get(i));
                    }
                } catch (IllegalAccessException unused) {
                    f9064o00ooO0 = true;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int o00oOo0o(Notification notification) {
        int length;
        synchronized (f9061o00oo0o) {
            Object[] o00oOoO2 = o00oOoO(notification);
            length = o00oOoO2 != null ? o00oOoO2.length : 0;
        }
        return length;
    }

    public static Object[] o00oOoO(Notification notification) {
        synchronized (f9061o00oo0o) {
            if (o00oOOoO()) {
                try {
                    return (Object[]) f9063o00oo0oO.get(notification);
                } catch (IllegalAccessException unused) {
                    f9064o00ooO0 = true;
                    return null;
                }
            }
            return null;
        }
    }

    public static oOo000Oo.o00oOOoO o00oOoO0(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new oOo000Oo.o00oOOoO(bundle.getInt("icon"), bundle.getCharSequence(f9045o00oOo0O), (PendingIntent) bundle.getParcelable(f9046o00oOo0o), bundle.getBundle("extras"), o00oOooO(o00oOoOO(bundle, f9047o00oOoO)), o00oOooO(o00oOoOO(bundle, f9049o00oOoOO)), bundle2 != null ? bundle2.getBoolean(f9044o00oOo00, false) : false, bundle.getInt(f9059o00oo0OO), bundle.getBoolean(f9058o00oo0O0), false, false);
    }

    public static Bundle[] o00oOoOO(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    public static Bundle o00oOoOo(oOo000Oo.o00oOOoO o00ooooo2) {
        Bundle bundle = new Bundle();
        IconCompat o00oOo0o2 = o00ooooo2.o00oOo0o();
        bundle.putInt("icon", o00oOo0o2 != null ? o00oOo0o2.o00ooO0() : 0);
        bundle.putCharSequence(f9045o00oOo0O, o00ooooo2.o00oOoOo());
        bundle.putParcelable(f9046o00oOo0o, o00ooooo2.o00oOOo0());
        Bundle bundle2 = o00ooooo2.o00oOooO() != null ? new Bundle(o00ooooo2.o00oOooO()) : new Bundle();
        bundle2.putBoolean(f9044o00oOo00, o00ooooo2.o00oOOoO());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray(f9047o00oOoO, o00oo0(o00ooooo2.o00oOoO0()));
        bundle.putBoolean(f9058o00oo0O0, o00ooooo2.o00oOoOO());
        bundle.putInt(f9059o00oo0OO, o00ooooo2.o00oOoO());
        return bundle;
    }

    public static Bundle o00oOoo0(Notification notification) {
        synchronized (f9057o00oo0O) {
            if (f9062o00oo0o0) {
                return null;
            }
            try {
                if (f9060o00oo0Oo == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        f9062o00oo0o0 = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f9060o00oo0Oo = declaredField;
                }
                Bundle bundle = (Bundle) f9060o00oo0Oo.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f9060o00oo0Oo.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
                f9062o00oo0o0 = true;
                return null;
            }
        }
    }

    public static ooo0o[] o00oOooO(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        ooo0o[] ooo0oVarArr = new ooo0o[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            ooo0oVarArr[i] = o00oOo00(bundleArr[i]);
        }
        return ooo0oVarArr;
    }

    public static oOo000Oo.o00oOOoO o00oOooo(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        ooo0o[] ooo0oVarArr;
        ooo0o[] ooo0oVarArr2;
        boolean z;
        if (bundle != null) {
            ooo0oVarArr = o00oOooO(o00oOoOO(bundle, oO0O0O00.f9071o00oOo0o));
            ooo0oVarArr2 = o00oOooO(o00oOoOO(bundle, f9043o00oOOoO));
            z = bundle.getBoolean(f9044o00oOo00);
        } else {
            ooo0oVarArr = null;
            ooo0oVarArr2 = null;
            z = false;
        }
        return new oOo000Oo.o00oOOoO(i, charSequence, pendingIntent, bundle, ooo0oVarArr, ooo0oVarArr2, z, 0, true, false, false);
    }

    public static Bundle[] o00oo0(ooo0o[] ooo0oVarArr) {
        if (ooo0oVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[ooo0oVarArr.length];
        for (int i = 0; i < ooo0oVarArr.length; i++) {
            bundleArr[i] = o00oo00O(ooo0oVarArr[i]);
        }
        return bundleArr;
    }

    public static Bundle o00oo00O(ooo0o ooo0oVar) {
        Bundle bundle = new Bundle();
        bundle.putString(f9050o00oOoOo, ooo0oVar.f9555o00oOOo0);
        bundle.putCharSequence(f9051o00oOoo0, ooo0oVar.f9556o00oOOoO);
        bundle.putCharSequenceArray(f9053o00oOooo, ooo0oVar.f9557o00oOo00);
        bundle.putBoolean(f9056o00oo00O, ooo0oVar.f9561o00oOooO);
        bundle.putBundle("extras", ooo0oVar.f9559o00oOo0o);
        Set<String> set = ooo0oVar.f9560o00oOoO0;
        if (set != null && !set.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(set.size());
            for (String str : set) {
                arrayList.add(str);
            }
            bundle.putStringArrayList(f9055o00oo0, arrayList);
        }
        return bundle;
    }

    public static Bundle o00oo0OO(Notification.Builder builder, oOo000Oo.o00oOOoO o00ooooo2) {
        IconCompat o00oOo0o2 = o00ooooo2.o00oOo0o();
        builder.addAction(o00oOo0o2 != null ? o00oOo0o2.o00ooO0() : 0, o00ooooo2.o00oOoOo(), o00ooooo2.o00oOOo0());
        Bundle bundle = new Bundle(o00ooooo2.o00oOooO());
        if (o00ooooo2.o00oOoO0() != null) {
            bundle.putParcelableArray(oO0O0O00.f9071o00oOo0o, o00oo0(o00ooooo2.o00oOoO0()));
        }
        if (o00ooooo2.o00oOo00() != null) {
            bundle.putParcelableArray(f9043o00oOOoO, o00oo0(o00ooooo2.o00oOo00()));
        }
        bundle.putBoolean(f9044o00oOo00, o00ooooo2.o00oOOoO());
        return bundle;
    }
}
