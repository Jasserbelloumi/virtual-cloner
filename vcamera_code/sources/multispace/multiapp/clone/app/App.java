package multispace.multiapp.clone.app;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import com.hack.opensdk.HackApplication;
import kotlin.Metadata;
import o0O0oooo.o0OO;
import o0OOO0oo.oo0OOoo;
import o0OOOO0o.o00ooO0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import o0OOoO0o.o0OO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0006\u0010\b\u001a\u00020\u0007¨\u0006\r"}, d2 = {"Lmultispace/multiapp/clone/app/App;", "Lcom/hack/opensdk/HackApplication;", "Landroid/content/Context;", TtmlNode.RUBY_BASE, "Lo0OO0o/oO0Ooooo;", "attachBaseContext", "onCreate", "", "o00oOo00", "<init>", "()V", "o00oo0Oo", "o00oOOo0", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class App extends HackApplication {
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final o00oOOo0 f6679o00oo0Oo = new o00oOOo0(null);
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static volatile Context f6680o00oo0o0;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lmultispace/multiapp/clone/app/App$o00oOOo0;", "", "Landroid/content/Context;", "o00oOOo0", "mContext", "Landroid/content/Context;", "<init>", "()V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @o00ooO0
        @NotNull
        public final Context o00oOOo0() {
            Context context = App.f6680o00oo0o0;
            if (context == null) {
                o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{104, 91, -112, -90, 117, 43, -10, -117}, new byte[]{5, Ascii.CAN, -1, -56, 1, 78, -114, -1}));
                return null;
            }
            return context;
        }
    }

    @o00ooO0
    @NotNull
    public static final Context o00oOOoO() {
        return f6679o00oo0Oo.o00oOOo0();
    }

    @Override // com.hack.opensdk.HackApplication, android.content.ContextWrapper
    public void attachBaseContext(@Nullable Context context) {
        super.attachBaseContext(context);
        o0ooO.o00oo00O(context);
        f6680o00oo0o0 = context;
    }

    public final boolean o00oOo00() {
        try {
            try {
                Object systemService = getSystemService(o00oo.o00oOOo0(new byte[]{-98, Ascii.DC4, 88, 117, -114, 10, 102, -20}, new byte[]{-1, 119, 44, Ascii.FS, -8, 99, Ascii.DC2, -107}));
                o0ooO.o00oo0(systemService, o00oo.o00oOOo0(new byte[]{-77, 111, -80, -34, -103, 105, 108, 87, -77, 117, -88, -110, -37, 111, 45, 90, -68, 105, -88, -110, -51, 101, 45, 87, -78, 116, -15, -36, -52, 102, 97, Ascii.EM, -87, 99, -84, -41, -103, 107, 99, 93, -81, 117, -75, -42, -105, 107, 125, 73, -13, 91, -65, -58, -48, 124, 100, 77, -92, 87, -67, -36, -40, 109, 104, 75}, new byte[]{-35, Ascii.SUB, -36, -78, -71, 10, Ascii.CR, 57}));
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) systemService).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == Process.myPid()) {
                        return runningAppProcessInfo.processName.equals(getPackageName());
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
        return true;
    }

    @Override // com.hack.opensdk.HackApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        if (o00oOo00()) {
            o00oo.o00oOOo0(new byte[]{-105, -110, -20, -28, 41}, new byte[]{-90, -93, -35, -43, Ascii.CAN, 56, -9, -7});
            o00oo.o00oOOo0(new byte[]{-40, -49, -125, 112, -17, 81, Ascii.CR, -104, -61, -45, -64, 88, -3, 75}, new byte[]{-79, -68, -93, oo0OOoo.f13516o00oOoO, -114, 56, 99, -56});
        } else {
            o00oo.o00oOOo0(new byte[]{-127, 35, 7, -69, 60}, new byte[]{-80, Ascii.DC2, 54, -118, Ascii.CR, -8, 120, 106});
            o00oo.o00oOOo0(new byte[]{-59, 43, -90, 66, -54, -34, -49, 79, -51, 49, -24, 124, -41, -59, -116, 103, -33, 43}, new byte[]{-84, 88, -122, 44, -91, -86, -17, 2});
        }
        o0OO.o0O0o(new o0OO0());
    }
}
