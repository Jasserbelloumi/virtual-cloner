package o0OOoO;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import kotlin.Metadata;
import o0OO0o.o0O0oo0o;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lo0OOoO/o0OO000;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lo0OO0o/oO0Ooooo;", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivityDestroyed", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public interface o0OO000 extends Application.ActivityLifecycleCallbacks {

    @o0O0oo0o(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public static void o00oOOo0(@NotNull o0OO000 o0oo000, @NotNull Activity activity, @Nullable Bundle bundle) {
            o0ooO.o00oo0O0(activity, o00oo.o00oOOo0(new byte[]{Ascii.RS, Ascii.DC2, -34, 98, -58, 60, -109, 85}, new byte[]{Byte.MAX_VALUE, 113, -86, Ascii.VT, -80, 85, -25, 44}));
        }

        public static void o00oOOoO(@NotNull o0OO000 o0oo000, @NotNull Activity activity) {
            o0ooO.o00oo0O0(activity, o00oo.o00oOOo0(new byte[]{-117, 95, 77, 124, -100, -32, 88, SignedBytes.MAX_POWER_OF_TWO}, new byte[]{-22, 60, 57, Ascii.NAK, -22, -119, 44, 57}));
        }

        public static void o00oOo00(@NotNull o0OO000 o0oo000, @NotNull Activity activity) {
            o0ooO.o00oo0O0(activity, o00oo.o00oOOo0(new byte[]{-26, 40, 71, -27, 69, -59, 81, 117}, new byte[]{-121, 75, 51, -116, 51, -84, 37, Ascii.FF}));
        }

        public static void o00oOo0O(@NotNull o0OO000 o0oo000, @NotNull Activity activity) {
            o0ooO.o00oo0O0(activity, o00oo.o00oOOo0(new byte[]{-58, 90, -66, -29, -80, 53, -105, 107}, new byte[]{-89, 57, -54, -118, -58, 92, -29, Ascii.DC2}));
        }

        public static void o00oOo0o(@NotNull o0OO000 o0oo000, @NotNull Activity activity) {
            o0ooO.o00oo0O0(activity, o00oo.o00oOOo0(new byte[]{-17, -9, -127, -47, 74, -46, -5, -36}, new byte[]{-114, -108, -11, -72, 60, -69, -113, -91}));
        }

        public static void o00oOooO(@NotNull o0OO000 o0oo000, @NotNull Activity activity) {
            o0ooO.o00oo0O0(activity, o00oo.o00oOOo0(new byte[]{-55, 93, 0, Ascii.DC2, 117, 99, 44, -96}, new byte[]{-88, 62, 116, 123, 3, 10, 88, -39}));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityDestroyed(@NotNull Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityPaused(@NotNull Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityResumed(@NotNull Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityStarted(@NotNull Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityStopped(@NotNull Activity activity);
}
