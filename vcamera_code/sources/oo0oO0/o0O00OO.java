package oo0oO0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class o0O00OO {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f17396o00oOo0O = 1025;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static o00oOo0O f17397o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static Boolean f17398o00oOoO0;
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public List<String> f17399o00oOOo0 = new ArrayList();
    @o0OO00OO

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Context f17400o00oOOoO;
    @o0OO00OO

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oOo0O f17401o00oOo00;
    @o0OO00OO

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Boolean f17402o00oOooO;

    /* loaded from: classes2.dex */
    public static class o00oOOo0 implements o00oOo0O {
    }

    public o0O00OO(@o0OO00OO Context context) {
        this.f17400o00oOOoO = context;
    }

    public static void o0(@oo0oO0 Fragment fragment, @oo0oO0 List<String> list, @o0OO00OO o00oo00O o00oo00o) {
        FragmentActivity activity = fragment.getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        if (list.isEmpty()) {
            fragment.startActivity(o0O00O.o00oOoOo(activity));
        } else {
            o0OoO00O.o00oOOoO(activity, (ArrayList) list, o00oo00o);
        }
    }

    public static boolean o00oOOo0(@oo0oO0 List<String> list) {
        return o00oo0OO.o00oOOo0(list);
    }

    public static boolean o00oOOoO(@oo0oO0 String... strArr) {
        return o00oo0OO.o00oOOo0(o0O00O.o00oOOoO(strArr));
    }

    public static List<String> o00oOo00(@oo0oO0 Context context, @oo0oO0 List<String> list) {
        return o00oo0OO.o00oOOoO(context, list);
    }

    public static List<String> o00oOo0O(@oo0oO0 Context context, @oo0oO0 String[]... strArr) {
        return o00oo0OO.o00oOOoO(context, o0O00O.o00oOo00(strArr));
    }

    public static o00oOo0O o00oOo0o() {
        if (f17397o00oOo0o == null) {
            f17397o00oOo0o = new o00oOOo0();
        }
        return f17397o00oOo0o;
    }

    public static boolean o00oOoOO(@oo0oO0 Context context, @oo0oO0 List<String> list) {
        return o00oo0OO.o00oOoO(context, list);
    }

    public static boolean o00oOoOo(@oo0oO0 Context context, @oo0oO0 String... strArr) {
        return o00oo0OO.o00oOoO(context, o0O00O.o00oOOoO(strArr));
    }

    public static boolean o00oOoo0(@oo0oO0 Context context, @oo0oO0 String[]... strArr) {
        return o00oo0OO.o00oOoO(context, o0O00O.o00oOo00(strArr));
    }

    public static List<String> o00oOooO(@oo0oO0 Context context, @oo0oO0 String... strArr) {
        return o00oo0OO.o00oOOoO(context, o0O00O.o00oOOoO(strArr));
    }

    public static boolean o00oOooo(@oo0oO0 Activity activity, @oo0oO0 List<String> list) {
        return o00oo0OO.o00oOoOo(activity, list);
    }

    public static void o00oo(@oo0oO0 Activity activity) {
        o00ooO0(activity, new ArrayList(0));
    }

    public static boolean o00oo0(@oo0oO0 Activity activity, @oo0oO0 String[]... strArr) {
        return o00oo0OO.o00oOoOo(activity, o0O00O.o00oOo00(strArr));
    }

    public static boolean o00oo00O(@oo0oO0 Activity activity, @oo0oO0 String... strArr) {
        return o00oo0OO.o00oOoOo(activity, o0O00O.o00oOOoO(strArr));
    }

    public static boolean o00oo0OO(@oo0oO0 String str) {
        return o00oo0OO.o00oOoo0(str);
    }

    public static void o00oo0oO(boolean z) {
        f17398o00oOoO0 = Boolean.valueOf(z);
    }

    public static void o00ooO(@oo0oO0 Activity activity, @oo0oO0 String... strArr) {
        o00ooO0(activity, o0O00O.o00oOOoO(strArr));
    }

    public static void o00ooO0(@oo0oO0 Activity activity, @oo0oO0 List<String> list) {
        o00ooO0O(activity, list, 1025);
    }

    public static void o00ooO00(@oo0oO0 Activity activity, @oo0oO0 String str, @o0OO00OO o00oo00O o00oo00o) {
        o00ooO0o(activity, o0O00O.o00oOOoO(str), o00oo00o);
    }

    public static void o00ooO0O(@oo0oO0 Activity activity, @oo0oO0 List<String> list, int i) {
        activity.startActivityForResult(o0O00O.o00oOooo(activity, list), i);
    }

    public static void o00ooO0o(@oo0oO0 Activity activity, @oo0oO0 List<String> list, @o0OO00OO o00oo00O o00oo00o) {
        if (list.isEmpty()) {
            activity.startActivity(o0O00O.o00oOoOo(activity));
        } else {
            o0OoO00O.o00oOOoO(activity, (ArrayList) list, o00oo00o);
        }
    }

    public static void o00ooOO(@oo0oO0 Activity activity, @oo0oO0 String[]... strArr) {
        o00ooO0(activity, o0O00O.o00oOo00(strArr));
    }

    public static void o00ooOO0(@oo0oO0 Activity activity, @oo0oO0 String[] strArr, @o0OO00OO o00oo00O o00oo00o) {
        o00ooO0o(activity, o0O00O.o00oOo00(strArr), o00oo00o);
    }

    public static void o00ooOOo(@oo0oO0 android.app.Fragment fragment) {
        o00ooOo(fragment, new ArrayList(0));
    }

    public static void o00ooOo(@oo0oO0 android.app.Fragment fragment, @oo0oO0 List<String> list) {
        o00ooOoO(fragment, list, 1025);
    }

    public static void o00ooOo0(@oo0oO0 android.app.Fragment fragment, @oo0oO0 String str, @o0OO00OO o00oo00O o00oo00o) {
        o00ooOoo(fragment, o0O00O.o00oOOoO(str), o00oo00o);
    }

    public static void o00ooOoO(@oo0oO0 android.app.Fragment fragment, @oo0oO0 List<String> list, int i) {
        Activity activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        if (list.isEmpty()) {
            fragment.startActivity(o0O00O.o00oOoOo(activity));
        } else {
            fragment.startActivityForResult(o0O00O.o00oOooo(activity, list), i);
        }
    }

    public static void o00ooOoo(@oo0oO0 android.app.Fragment fragment, @oo0oO0 List<String> list, @o0OO00OO o00oo00O o00oo00o) {
        Activity activity = fragment.getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        if (list.isEmpty()) {
            fragment.startActivity(o0O00O.o00oOoOo(activity));
        } else {
            o0OoO00O.o00oOOoO(activity, (ArrayList) list, o00oo00o);
        }
    }

    public static void o00ooo0(@oo0oO0 android.app.Fragment fragment, @oo0oO0 String[] strArr, @o0OO00OO o00oo00O o00oo00o) {
        o00ooOoo(fragment, o0O00O.o00oOo00(strArr), o00oo00o);
    }

    public static void o00ooo00(@oo0oO0 android.app.Fragment fragment, @oo0oO0 String... strArr) {
        o00ooOo(fragment, o0O00O.o00oOOoO(strArr));
    }

    public static void o00ooo0O(@oo0oO0 android.app.Fragment fragment, @oo0oO0 String[]... strArr) {
        o00ooOo(fragment, o0O00O.o00oOo00(strArr));
    }

    public static void o00ooo0o(@oo0oO0 Context context) {
        o00oooO(context, new ArrayList(0));
    }

    public static void o00oooO(@oo0oO0 Context context, @oo0oO0 List<String> list) {
        Activity o00oOoO02 = o0O00O.o00oOoO0(context);
        if (o00oOoO02 != null) {
            o00ooO0(o00oOoO02, list);
            return;
        }
        Intent o00oOooo2 = o0O00O.o00oOooo(context, list);
        if (!(context instanceof Activity)) {
            o00oOooo2.addFlags(268435456);
        }
        context.startActivity(o00oOooo2);
    }

    public static void o00oooOO(@oo0oO0 Context context, @oo0oO0 String... strArr) {
        o00oooO(context, o0O00O.o00oOOoO(strArr));
    }

    public static void o00oooOo(@oo0oO0 Context context, @oo0oO0 String[]... strArr) {
        o00oooO(context, o0O00O.o00oOo00(strArr));
    }

    public static void o00oooo(@oo0oO0 Fragment fragment, @oo0oO0 String str, @o0OO00OO o00oo00O o00oo00o) {
        o0(fragment, o0O00O.o00oOOoO(str), o00oo00o);
    }

    public static void o00oooo0(@oo0oO0 Fragment fragment) {
        o00ooooO(fragment, new ArrayList());
    }

    public static void o00ooooO(@oo0oO0 Fragment fragment, @oo0oO0 List<String> list) {
        o00ooooo(fragment, list, 1025);
    }

    public static void o00ooooo(@oo0oO0 Fragment fragment, @oo0oO0 List<String> list, int i) {
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        if (list.isEmpty()) {
            fragment.startActivity(o0O00O.o00oOoOo(activity));
        } else {
            fragment.startActivityForResult(o0O00O.o00oOooo(activity, list), i);
        }
    }

    public static void o0O00000(@oo0oO0 Fragment fragment, @oo0oO0 String... strArr) {
        o00ooooO(fragment, o0O00O.o00oOOoO(strArr));
    }

    public static void o0O0000O(@oo0oO0 Fragment fragment, @oo0oO0 String[] strArr, @o0OO00OO o00oo00O o00oo00o) {
        o0(fragment, o0O00O.o00oOo00(strArr), o00oo00o);
    }

    public static void o0O0000o(@oo0oO0 Fragment fragment, @oo0oO0 String[]... strArr) {
        o00ooooO(fragment, o0O00O.o00oOo00(strArr));
    }

    public static o0O00OO o0O000O(@oo0oO0 android.app.Fragment fragment) {
        return new o0O00OO(fragment.getActivity());
    }

    public static o0O00OO o0O000Oo(@oo0oO0 Fragment fragment) {
        return new o0O00OO(fragment.getActivity());
    }

    public static void o0O0o(o00oOo0O o00ooo0o2) {
        f17397o00oOo0o = o00ooo0o2;
    }

    public static o0O00OO o0OoOoOo(@oo0oO0 Context context) {
        return new o0O00OO(context);
    }

    public final boolean o00oOoO(@oo0oO0 Context context) {
        if (this.f17402o00oOooO == null) {
            if (f17398o00oOoO0 == null) {
                f17398o00oOoO0 = Boolean.valueOf(o0O00O.o00oo0(context));
            }
            this.f17402o00oOooO = f17398o00oOoO0;
        }
        return this.f17402o00oOooO.booleanValue();
    }

    public o0O00OO o00oOoO0(@o0OO00OO o00oOo0O o00ooo0o2) {
        this.f17401o00oOo00 = o00ooo0o2;
        return this;
    }

    public o0O00OO o00oo0O(@o0OO00OO String... strArr) {
        return o00oo0O0(o0O00O.o00oOOoO(strArr));
    }

    public o0O00OO o00oo0O0(@o0OO00OO List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                if (!o0O00O.o00oOo0O(this.f17399o00oOOo0, str)) {
                    this.f17399o00oOOo0.add(str);
                }
            }
        }
        return this;
    }

    public o0O00OO o00oo0Oo(@o0OO00OO String[]... strArr) {
        return o00oo0O0(o0O00O.o00oOo00(strArr));
    }

    public boolean o00oo0o() {
        Context context = this.f17400o00oOOoO;
        if (context == null) {
            return false;
        }
        List<String> list = this.f17399o00oOOo0;
        if (!list.isEmpty() && o00oOo00.o00oOo0o()) {
            try {
                if (list.size() == 1) {
                    context.revokeSelfPermissionOnKill(list.get(0));
                } else {
                    context.revokeSelfPermissionsOnKill(list);
                }
                return true;
            } catch (IllegalArgumentException e) {
                if (o00oOoO(context)) {
                    throw e;
                }
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public void o00oo0o0(@o0OO00OO o00oOoO o00oooo2) {
        if (this.f17400o00oOOoO == null) {
            return;
        }
        if (this.f17401o00oOo00 == null) {
            this.f17401o00oOo00 = o00oOo0o();
        }
        Context context = this.f17400o00oOOoO;
        o00oOo0O o00ooo0o2 = this.f17401o00oOo00;
        ArrayList arrayList = new ArrayList(this.f17399o00oOOo0);
        boolean o00oOoO2 = o00oOoO(context);
        Activity o00oOoO02 = o0O00O.o00oOoO0(context);
        if (o00oo0O0.o00oOOo0(o00oOoO02, o00oOoO2) && o00oo0O0.o00oOoOo(arrayList, o00oOoO2)) {
            if (o00oOoO2) {
                oo0oO0.o00oOOo0 o00oOoOO2 = o0O00O.o00oOoOO(context);
                o00oo0O0.o00oOoO0(context, arrayList);
                o00oo0O0.o00oOooo(context, arrayList, o00oOoOO2);
                o00oo0O0.o00oOOoO(arrayList);
                o00oo0O0.o00oOo00(arrayList);
                o00oo0O0.o00oOoo0(o00oOoO02, arrayList, o00oOoOO2);
                o00oo0O0.o00oOoOO(arrayList, o00oOoOO2);
                o00oo0O0.o00oOoO(arrayList, o00oOoOO2);
                o00oo0O0.o00oo00O(context, arrayList);
                o00oo0O0.o00oOo0o(context, arrayList, o00oOoOO2);
            }
            o00oo0O0.o00oo0(arrayList);
            if (!o00oo0OO.o00oOoO(context, arrayList)) {
                o00ooo0o2.o00oOOoO(o00oOoO02, arrayList, o00oooo2);
            } else if (o00oooo2 != null) {
                o00ooo0o2.o00oOo00(o00oOoO02, arrayList, arrayList, true, o00oooo2);
                o00ooo0o2.o00oOOo0(o00oOoO02, arrayList, true, o00oooo2);
            }
        }
    }

    public o0O00OO o0O000() {
        this.f17402o00oOooO = Boolean.FALSE;
        return this;
    }
}
