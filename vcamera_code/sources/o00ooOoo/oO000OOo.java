package o00ooOoo;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class oO000OOo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f8987o00oOOo0 = "android.activity.usage_time";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f8988o00oOOoO = "android.usage_time_packages";

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 extends oO000OOo {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final ActivityOptions f8989o00oOo00;

        public o00oOOo0(ActivityOptions activityOptions) {
            this.f8989o00oOo00 = activityOptions;
        }

        @Override // o00ooOoo.oO000OOo
        public Rect o00oOOo0() {
            return o00oOoO.o00oOOo0(this.f8989o00oOo00);
        }

        @Override // o00ooOoo.oO000OOo
        public void o00oOoOo(@oo0oO0 PendingIntent pendingIntent) {
            o00oOo0O.o00oOo00(this.f8989o00oOo00, pendingIntent);
        }

        @Override // o00ooOoo.oO000OOo
        @oo0oO0
        public oO000OOo o00oOoo0(@o0OO00OO Rect rect) {
            return new o00oOOo0(o00oOoO.o00oOOoO(this.f8989o00oOo00, rect));
        }

        @Override // o00ooOoo.oO000OOo
        public Bundle o00oOooo() {
            return this.f8989o00oOo00.toBundle();
        }

        @Override // o00ooOoo.oO000OOo
        public void o00oo00O(@oo0oO0 oO000OOo oo000ooo) {
            if (oo000ooo instanceof o00oOOo0) {
                this.f8989o00oOo00.update(((o00oOOo0) oo000ooo).f8989o00oOo00);
            }
        }
    }

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static ActivityOptions o00oOOo0(Context context, int i, int i2) {
            return ActivityOptions.makeCustomAnimation(context, i, i2);
        }

        @o0O0O0Oo
        public static ActivityOptions o00oOOoO(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4);
        }

        @o0O0O0Oo
        public static ActivityOptions o00oOo00(View view, Bitmap bitmap, int i, int i2) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2);
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static ActivityOptions o00oOOo0(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        @o0O0O0Oo
        public static ActivityOptions o00oOOoO(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        @o0O0O0Oo
        public static ActivityOptions o00oOo00() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOo0O {
        @o0O0O0Oo
        public static ActivityOptions o00oOOo0() {
            return ActivityOptions.makeBasic();
        }

        @o0O0O0Oo
        public static ActivityOptions o00oOOoO(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4);
        }

        @o0O0O0Oo
        public static void o00oOo00(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOoO {
        @o0O0O0Oo
        public static Rect o00oOOo0(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        @o0O0O0Oo
        public static ActivityOptions o00oOOoO(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    @oo0oO0
    public static oO000OOo o00oOOoO() {
        return new o00oOOo0(o00oOo0O.o00oOOo0());
    }

    @oo0oO0
    public static oO000OOo o00oOo00(@oo0oO0 View view, int i, int i2, int i3, int i4) {
        return new o00oOOo0(o00oOo0O.o00oOOoO(view, i, i2, i3, i4));
    }

    @oo0oO0
    public static oO000OOo o00oOo0O(@oo0oO0 View view, int i, int i2, int i3, int i4) {
        return new o00oOOo0(o00oOOoO.o00oOOoO(view, i, i2, i3, i4));
    }

    @oo0oO0
    public static oO000OOo o00oOo0o(@oo0oO0 Activity activity, @oo0oO0 View view, @oo0oO0 String str) {
        return new o00oOOo0(o00oOo00.o00oOOo0(activity, view, str));
    }

    @oo0oO0
    public static oO000OOo o00oOoO() {
        return new o00oOOo0(o00oOo00.o00oOo00());
    }

    @oo0oO0
    public static oO000OOo o00oOoO0(@oo0oO0 Activity activity, @o0OO00OO o0ooOoOO.oO0o0o<View, String>... oo0o0oArr) {
        Pair[] pairArr = null;
        if (oo0o0oArr != null) {
            pairArr = new Pair[oo0o0oArr.length];
            for (int i = 0; i < oo0o0oArr.length; i++) {
                o0ooOoOO.oO0o0o<View, String> oo0o0o = oo0o0oArr[i];
                pairArr[i] = Pair.create(oo0o0o.f17227o00oOOo0, oo0o0o.f17228o00oOOoO);
            }
        }
        return new o00oOOo0(o00oOo00.o00oOOoO(activity, pairArr));
    }

    @oo0oO0
    public static oO000OOo o00oOoOO(@oo0oO0 View view, @oo0oO0 Bitmap bitmap, int i, int i2) {
        return new o00oOOo0(o00oOOoO.o00oOo00(view, bitmap, i, i2));
    }

    @oo0oO0
    public static oO000OOo o00oOooO(@oo0oO0 Context context, int i, int i2) {
        return new o00oOOo0(o00oOOoO.o00oOOo0(context, i, i2));
    }

    @o0OO00OO
    public Rect o00oOOo0() {
        return null;
    }

    public void o00oOoOo(@oo0oO0 PendingIntent pendingIntent) {
    }

    @oo0oO0
    public oO000OOo o00oOoo0(@o0OO00OO Rect rect) {
        return this;
    }

    @o0OO00OO
    public Bundle o00oOooo() {
        return null;
    }

    public void o00oo00O(@oo0oO0 oO000OOo oo000ooo) {
    }
}
