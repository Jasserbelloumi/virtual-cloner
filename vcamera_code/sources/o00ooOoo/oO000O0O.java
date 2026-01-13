package o00ooOoo;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0OoOoO;
import o00oOooO.oo0OOoo;
import o00oOooO.oo0oO0;
import o00ooOoo.oO000O0O;
import o00ooOoo.oO0OOO0;
import o00ooo0.o0;
import o00ooo0.o0O0OO;
import o0O000.o00oOOo0;
/* loaded from: classes.dex */
public class oO000O0O extends o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static o00oo0O f8982o00oOOo0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ Activity f8983o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ String[] f8984o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ int f8985o00oo0Oo;

        public o00oOOo0(String[] strArr, Activity activity, int i) {
            this.f8984o00oo0O0 = strArr;
            this.f8983o00oo0O = activity;
            this.f8985o00oo0Oo = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f8984o00oo0O0.length];
            PackageManager packageManager = this.f8983o00oo0O.getPackageManager();
            String packageName = this.f8983o00oo0O.getPackageName();
            int length = this.f8984o00oo0O0.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f8984o00oo0O0[i], packageName);
            }
            ((o00oo0O0) this.f8983o00oo0O).onRequestPermissionsResult(this.f8985o00oo0Oo, this.f8984o00oo0O0, iArr);
        }
    }

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static void o00oOOo0(Activity activity) {
            activity.finishAffinity();
        }

        @o0O0O0Oo
        public static void o00oOOoO(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        @o0O0O0Oo
        public static void o00oOo00(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static void o00oOOo0(Activity activity) {
            activity.finishAfterTransition();
        }

        @o0O0O0Oo
        public static void o00oOOoO(Activity activity) {
            activity.postponeEnterTransition();
        }

        @o0O0O0Oo
        public static void o00oOo00(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @o0O0O0Oo
        public static void o00oOo0O(Activity activity) {
            activity.startPostponedEnterTransition();
        }

        @o0O0O0Oo
        public static void o00oOooO(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }
    }

    @o0OOooO0(22)
    /* loaded from: classes.dex */
    public static class o00oOo0O {
        @o0O0O0Oo
        public static Uri o00oOOo0(Activity activity) {
            return activity.getReferrer();
        }
    }

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOoO {
        @o0O0O0Oo
        public static void o00oOOo0(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @o0O0O0Oo
        public static void o00oOOoO(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        @o0O0O0Oo
        public static boolean o00oOo00(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oo extends SharedElementCallback {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final oO0OOO0 f8986o00oOOo0;

        public o00oo(oO0OOO0 oo0ooo0) {
            this.f8986o00oOOo0 = oo0ooo0;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f8986o00oOOo0.o00oOOoO(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f8986o00oOOo0.o00oOo00(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f8986o00oOOo0.o00oOooO(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f8986o00oOOo0.o00oOo0O(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f8986o00oOOo0.o00oOo0o(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f8986o00oOOo0.o00oOoO0(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @o0OOooO0(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f8986o00oOOo0.o00oOoO(list, list2, new oO0OOO0.o00oOOo0() { // from class: o00ooOoo.oO0OoOO0
                @Override // o00ooOoo.oO0OOO0.o00oOOo0
                public final void onSharedElementsReady() {
                    oO000O0O.o00oOoO.o00oOOo0(onSharedElementsReadyListener);
                }
            });
        }
    }

    @o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oo0 {
        @o0O0O0Oo
        public static Display o00oOOo0(ContextWrapper contextWrapper) {
            Display display;
            display = contextWrapper.getDisplay();
            return display;
        }

        @o0O0O0Oo
        public static void o00oOOoO(@oo0oO0 Activity activity, @o0OO00OO o0O0OO o0o0oo, @o0OO00OO Bundle bundle) {
            activity.setLocusContext(o0o0oo == null ? null : o0o0oo.f9618o00oOOoO, bundle);
        }
    }

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oo00O {
        @o0O0O0Oo
        public static <T> T o00oOOo0(Activity activity, int i) {
            return (T) activity.requireViewById(i);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oo0O {
        boolean o00oOOo0(@oo0oO0 Activity activity, @o0O0o00O(from = 0) int i, int i2, @o0OO00OO Intent intent);

        boolean o00oOOoO(@oo0oO0 Activity activity, @oo0oO0 String[] strArr, @o0O0o00O(from = 0) int i);
    }

    /* loaded from: classes.dex */
    public interface o00oo0O0 {
        void onRequestPermissionsResult(int i, @oo0oO0 String[] strArr, @oo0oO0 int[] iArr);
    }

    @o0OOooO0(31)
    /* loaded from: classes.dex */
    public static class o00oo0OO {
        @o0O0O0Oo
        public static boolean o00oOOo0(@oo0oO0 Activity activity) {
            boolean isLaunchedFromBubble;
            isLaunchedFromBubble = activity.isLaunchedFromBubble();
            return isLaunchedFromBubble;
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface o0O0o {
        void o00oOooo(int i);
    }

    public static void o00oOOoO(@oo0oO0 Activity activity) {
        o00oOOoO.o00oOOo0(activity);
    }

    public static void o00oOo00(@oo0oO0 Activity activity) {
        o00oOo00.o00oOOo0(activity);
    }

    @o0OO00OO
    public static Uri o00oOo0O(@oo0oO0 Activity activity) {
        return o00oOo0O.o00oOOo0(activity);
    }

    @Deprecated
    public static boolean o00oOo0o(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static /* synthetic */ void o00oOoO(Activity activity) {
        if (activity.isFinishing() || ooOOOOoo.o00oOoOO(activity)) {
            return;
        }
        activity.recreate();
    }

    public static boolean o00oOoO0(@oo0oO0 Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return o00oo0OO.o00oOOo0(activity);
        }
        if (i == 30) {
            return (o00oo0.o00oOOo0(activity) == null || o00oo0.o00oOOo0(activity).getDisplayId() == 0) ? false : true;
        } else if (i == 29) {
            return (activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) ? false : true;
        } else {
            return false;
        }
    }

    public static void o00oOoOO(@oo0oO0 Activity activity) {
        o00oOo00.o00oOOoO(activity);
    }

    public static void o00oOoOo(@oo0oO0 Activity activity) {
        activity.recreate();
    }

    @o0OO00OO
    public static o0O000oo.o00oo0O o00oOoo0(@oo0oO0 Activity activity, @oo0oO0 DragEvent dragEvent) {
        return o0O000oo.o00oo0O.o00oOOoO(activity, dragEvent);
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static o00oo0O o00oOooO() {
        return f8982o00oOOo0;
    }

    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public static void o00oOooo(@oo0oO0 Activity activity, @oo0oO0 String[] strArr, @o0O0o00O(from = 0) int i) {
        o00oo0O o00oo0o2 = f8982o00oOOo0;
        if (o00oo0o2 == null || !o00oo0o2.o00oOOoO(activity, strArr, i)) {
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (TextUtils.isEmpty(strArr[i2])) {
                    throw new IllegalArgumentException(android.support.v4.media.o00oOOoO.o00oOOo0(android.support.v4.media.o00oOo0O.o00oOOo0("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                }
                if (!o0O000.o00oOOo0.o00oOoo0() && TextUtils.equals(strArr[i2], oo0oO0.o00oo0.f17327o00oo0)) {
                    hashSet.add(Integer.valueOf(i2));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i3 = 0;
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    if (!hashSet.contains(Integer.valueOf(i4))) {
                        strArr2[i3] = strArr[i4];
                        i3++;
                    }
                }
            }
            if (activity instanceof o0O0o) {
                ((o0O0o) activity).o00oOooo(i);
            }
            o00oOoO.o00oOOoO(activity, strArr, i);
        }
    }

    public static void o00oo0(@oo0oO0 Activity activity, @o0OO00OO oO0OOO0 oo0ooo0) {
        o00oOo00.o00oOo00(activity, oo0ooo0 != null ? new o00oo(oo0ooo0) : null);
    }

    @oo0oO0
    public static <T extends View> T o00oo00O(@oo0oO0 Activity activity, @oo0OOoo int i) {
        return (T) o00oo00O.o00oOOo0(activity, i);
    }

    public static void o00oo0O(@o0OO00OO o00oo0O o00oo0o2) {
        f8982o00oOOo0 = o00oo0o2;
    }

    public static void o00oo0O0(@oo0oO0 Activity activity, @o0OO00OO o0O0OO o0o0oo, @o0OO00OO Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            o00oo0.o00oOOoO(activity, o0o0oo, bundle);
        }
    }

    public static void o00oo0OO(@oo0oO0 Activity activity, @o0OO00OO oO0OOO0 oo0ooo0) {
        o00oOo00.o00oOooO(activity, oo0ooo0 != null ? new o00oo(oo0ooo0) : null);
    }

    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public static boolean o00oo0Oo(@oo0oO0 Activity activity, @oo0oO0 String str) {
        if (o0O000.o00oOOo0.o00oOoo0() || !TextUtils.equals(oo0oO0.o00oo0.f17327o00oo0, str)) {
            return o00oOoO.o00oOo00(activity, str);
        }
        return false;
    }

    public static void o00oo0o(@oo0oO0 Activity activity, @oo0oO0 IntentSender intentSender, int i, @o0OO00OO Intent intent, int i2, int i3, int i4, @o0OO00OO Bundle bundle) throws IntentSender.SendIntentException {
        o00oOOoO.o00oOo00(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static void o00oo0o0(@oo0oO0 Activity activity, @oo0oO0 Intent intent, int i, @o0OO00OO Bundle bundle) {
        o00oOOoO.o00oOOoO(activity, intent, i, bundle);
    }

    public static void o00oo0oO(@oo0oO0 Activity activity) {
        o00oOo00.o00oOo0O(activity);
    }
}
