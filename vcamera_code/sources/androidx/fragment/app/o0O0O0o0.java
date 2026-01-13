package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import o00oOooO.oo0oO0;
import o00ooOoo.oO0OOO0;
/* loaded from: classes.dex */
public class o0O0O0o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0O0OO0 f3097o00oOOo0 = new o0ooO();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final o0O0OO0 f3098o00oOOoO = o00oOo00();

    public static void o00oOOo0(Fragment fragment, Fragment fragment2, boolean z, androidx.collection.o00oOOo0<String, View> o00oooo02, boolean z2) {
        oO0OOO0 enterTransitionCallback = z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = o00oooo02 == null ? 0 : o00oooo02.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(o00oooo02.o00oOoOo(i));
                arrayList.add(o00oooo02.o00oo0(i));
            }
            if (z2) {
                enterTransitionCallback.o00oOoO0(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.o00oOo0o(arrayList2, arrayList, null);
            }
        }
    }

    public static String o00oOOoO(androidx.collection.o00oOOo0<String, String> o00oooo02, String str) {
        int size = o00oooo02.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(o00oooo02.o00oo0(i))) {
                return o00oooo02.o00oOoOo(i);
            }
        }
        return null;
    }

    public static o0O0OO0 o00oOo00() {
        try {
            return (o0O0OO0) androidx.transition.o00oo0O.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void o00oOo0O(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    public static boolean o00oOo0o() {
        return (f3097o00oOOo0 == null && f3098o00oOOoO == null) ? false : true;
    }

    public static void o00oOooO(@oo0oO0 androidx.collection.o00oOOo0<String, String> o00oooo02, @oo0oO0 androidx.collection.o00oOOo0<String, View> o00oooo03) {
        for (int size = o00oooo02.size() - 1; size >= 0; size--) {
            if (!o00oooo03.containsKey(o00oooo02.o00oo0(size))) {
                o00oooo02.o00oOooo(size);
            }
        }
    }
}
