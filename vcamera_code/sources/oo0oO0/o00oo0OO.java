package oo0oO0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class o00oo0OO {
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o00oo0O f17369o00oOOo0;

    static {
        f17369o00oOOo0 = o00oOo00.o00oOo0o() ? new o0O000o0() : o00oOo00.o00oOo0O() ? new o0O000Oo() : o00oOo00.o00oOooO() ? new o0O000O() : o00oOo00.o00oOo00() ? new o0O0000O() : new o0();
    }

    public static boolean o00oOOo0(List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                if (o0O00O.o00oo0O0(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<String> o00oOOoO(@oo0oO0 Context context, @oo0oO0 List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (!o00oOoO0(context, str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static List<String> o00oOo00(@oo0oO0 List<String> list, @oo0oO0 int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == -1) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    public static List<String> o00oOo0O(@oo0oO0 List<String> list, @oo0oO0 int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == 0) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    public static Intent o00oOo0o(@oo0oO0 Context context, @oo0oO0 String str) {
        return f17369o00oOOo0.o00oOo00(context, str);
    }

    public static boolean o00oOoO(@oo0oO0 Context context, @oo0oO0 List<String> list) {
        if (list.isEmpty()) {
            return false;
        }
        for (String str : list) {
            if (!o00oOoO0(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean o00oOoO0(@oo0oO0 Context context, @oo0oO0 String str) {
        return f17369o00oOOo0.o00oOOo0(context, str);
    }

    public static boolean o00oOoOO(@oo0oO0 Activity activity, @oo0oO0 String str) {
        return f17369o00oOOo0.o00oOOoO(activity, str);
    }

    public static boolean o00oOoOo(@oo0oO0 Activity activity, @oo0oO0 List<String> list) {
        for (String str : list) {
            if (o00oOoOO(activity, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean o00oOoo0(@oo0oO0 String str) {
        return o0O00O.o00oo0O0(str);
    }

    public static List<String> o00oOooO(@oo0oO0 Context context, @oo0oO0 List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (o00oOoO0(context, str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
