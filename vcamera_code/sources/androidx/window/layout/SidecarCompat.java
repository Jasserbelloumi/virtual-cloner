package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.o00oo0O0;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0o0000;
import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 '2\u00020\u0001:\u0005\u0005\n(\u000e)B\u001d\b\u0007\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\"\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0017J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006*"}, d2 = {"Landroidx/window/layout/SidecarCompat;", "Landroidx/window/layout/o00oo0O0;", "Landroidx/window/layout/o00oo0O0$o00oOOo0;", "extensionCallback", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/o0O00;", "o00oOoOO", o0OO000o.o00oOOoO.f12961o00oOo00, "Landroid/os/IBinder;", "windowToken", "o00oOoOo", "o00oOo00", "", "o00oOooO", "o00oOoo0", "o00oOooo", "Landroidx/window/sidecar/SidecarInterface;", "Landroidx/window/sidecar/SidecarInterface;", "o00oOoO", "()Landroidx/window/sidecar/SidecarInterface;", "sidecar", "Landroidx/window/layout/o0;", "Landroidx/window/layout/o0;", "sidecarAdapter", "", "Ljava/util/Map;", "windowListenerRegisteredContexts", "Landroid/content/ComponentCallbacks;", "componentCallbackMap", "o00oOo0O", "Landroidx/window/layout/o00oo0O0$o00oOOo0;", "<init>", "(Landroidx/window/sidecar/SidecarInterface;Landroidx/window/layout/o0;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "o00oOo0o", "DistinctSidecarElementCallback", "TranslatingCallback", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SidecarCompat implements o00oo0O0 {
    @NotNull

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final o00oOOo0 f5455o00oOo0o = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f5456o00oOoO0 = "SidecarCompat";
    @Nullable

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final SidecarInterface f5457o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0 f5458o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Map<IBinder, Activity> f5459o00oOo00;
    @Nullable

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o00oo0O0.o00oOOo0 f5460o00oOo0O;
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Map<Activity, ComponentCallbacks> f5461o00oOooO;

    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lo0OO0o/oO0Ooooo;", "onDeviceStateChanged", "Landroid/os/IBinder;", "token", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "Landroidx/window/layout/o0;", "o00oOOo0", "Landroidx/window/layout/o0;", "sidecarAdapter", o0OO000o.o00oOOoO.f12961o00oOo00, "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "callbackInterface", "Ljava/util/concurrent/locks/ReentrantLock;", "o00oOo00", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "o00oOooO", "Landroidx/window/sidecar/SidecarDeviceState;", "lastDeviceState", "Ljava/util/WeakHashMap;", "o00oOo0O", "Ljava/util/WeakHashMap;", "mActivityWindowLayoutInfo", "<init>", "(Landroidx/window/layout/o0;Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0 f5462o00oOOo0;
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final SidecarInterface.SidecarCallback f5463o00oOOoO;
        @NotNull

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final ReentrantLock f5464o00oOo00;
        @o0O0OOOo("mLock")
        @NotNull

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final WeakHashMap<IBinder, SidecarWindowLayoutInfo> f5465o00oOo0O;
        @o0O0OOOo("lock")
        @Nullable

        /* renamed from: o00oOooO  reason: collision with root package name */
        public SidecarDeviceState f5466o00oOooO;

        public DistinctSidecarElementCallback(@NotNull o0 o0Var, @NotNull SidecarInterface.SidecarCallback sidecarCallback) {
            o0ooO.o00oo0O0(o0Var, "sidecarAdapter");
            o0ooO.o00oo0O0(sidecarCallback, "callbackInterface");
            this.f5462o00oOOo0 = o0Var;
            this.f5463o00oOOoO = sidecarCallback;
            this.f5464o00oOo00 = new ReentrantLock();
            this.f5465o00oOo0O = new WeakHashMap<>();
        }

        public void onDeviceStateChanged(@NotNull SidecarDeviceState sidecarDeviceState) {
            o0ooO.o00oo0O0(sidecarDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.f5464o00oOo00;
            reentrantLock.lock();
            try {
                if (this.f5462o00oOOo0.o00oOOo0(this.f5466o00oOooO, sidecarDeviceState)) {
                    return;
                }
                this.f5466o00oOooO = sidecarDeviceState;
                this.f5463o00oOOoO.onDeviceStateChanged(sidecarDeviceState);
                oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(@NotNull IBinder iBinder, @NotNull SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            o0ooO.o00oo0O0(iBinder, "token");
            o0ooO.o00oo0O0(sidecarWindowLayoutInfo, "newLayout");
            synchronized (this.f5464o00oOo00) {
                if (this.f5462o00oOOo0.o00oOooO(this.f5465o00oOo0O.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f5465o00oOo0O.put(iBinder, sidecarWindowLayoutInfo);
                this.f5463o00oOOoO.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¨\u0006\r"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lo0OO0o/oO0Ooooo;", "onDeviceStateChanged", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "<init>", "(Landroidx/window/layout/SidecarCompat;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ SidecarCompat f5467o00oOOo0;

        public TranslatingCallback(SidecarCompat sidecarCompat) {
            o0ooO.o00oo0O0(sidecarCompat, "this$0");
            this.f5467o00oOOo0 = sidecarCompat;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(@NotNull SidecarDeviceState sidecarDeviceState) {
            SidecarInterface o00oOoO2;
            o0ooO.o00oo0O0(sidecarDeviceState, "newDeviceState");
            Collection<Activity> values = this.f5467o00oOOo0.f5459o00oOo00.values();
            SidecarCompat sidecarCompat = this.f5467o00oOOo0;
            for (Activity activity : values) {
                IBinder o00oOOo02 = SidecarCompat.f5455o00oOo0o.o00oOOo0(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (o00oOOo02 != null && (o00oOoO2 = sidecarCompat.o00oOoO()) != null) {
                    sidecarWindowLayoutInfo = o00oOoO2.getWindowLayoutInfo(o00oOOo02);
                }
                o00oo0O0.o00oOOo0 o00oooo02 = sidecarCompat.f5460o00oOo0O;
                if (o00oooo02 != null) {
                    o00oooo02.o00oOOo0(activity, sidecarCompat.f5458o00oOOoO.o00oOo0O(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@NotNull IBinder iBinder, @NotNull SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            o0ooO.o00oo0O0(iBinder, "windowToken");
            o0ooO.o00oo0O0(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) this.f5467o00oOOo0.f5459o00oOo00.get(iBinder);
            if (activity == null) {
                return;
            }
            o0 o0Var = this.f5467o00oOOo0.f5458o00oOOoO;
            SidecarInterface o00oOoO2 = this.f5467o00oOOo0.o00oOoO();
            SidecarDeviceState deviceState = o00oOoO2 == null ? null : o00oOoO2.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            o0O00 o00oOo0O2 = o0Var.o00oOo0O(sidecarWindowLayoutInfo, deviceState);
            o00oo0O0.o00oOOo0 o00oooo02 = this.f5467o00oOOo0.f5460o00oOo0O;
            if (o00oooo02 == null) {
                return;
            }
            o00oooo02.o00oOOo0(activity, o00oOo0O2);
        }
    }

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/SidecarCompat$o00oOOo0;", "", "Landroid/content/Context;", "context", "Landroidx/window/sidecar/SidecarInterface;", o0OO000o.o00oOOoO.f12961o00oOo00, "(Landroid/content/Context;)Landroidx/window/sidecar/SidecarInterface;", "Landroid/app/Activity;", "activity", "Landroid/os/IBinder;", "o00oOOo0", "(Landroid/app/Activity;)Landroid/os/IBinder;", "Lo0O0OoO/o00ooO;", "o00oOo00", "()Lo0O0OoO/o00ooO;", "sidecarVersion", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
        }

        @Nullable
        public final IBinder o00oOOo0(@Nullable Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        @Nullable
        public final SidecarInterface o00oOOoO(@NotNull Context context) {
            o0ooO.o00oo0O0(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        @Nullable
        public final o0O0OoO.o00ooO o00oOo00() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return o0O0OoO.o00ooO.f11973o00oo0oO.o00oOo0O(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/SidecarCompat$o00oOOoO;", "Landroidx/window/layout/o00oo0O0$o00oOOo0;", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/o0O00;", "newLayout", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "Landroidx/window/layout/o00oo0O0$o00oOOo0;", "callbackInterface", "Ljava/util/concurrent/locks/ReentrantLock;", o0OO000o.o00oOOoO.f12961o00oOo00, "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/WeakHashMap;", "o00oOo00", "Ljava/util/WeakHashMap;", "activityWindowLayoutInfo", "<init>", "(Landroidx/window/layout/o00oo0O0$o00oOOo0;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOoO implements o00oo0O0.o00oOOo0 {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oo0O0.o00oOOo0 f5468o00oOOo0;
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final ReentrantLock f5469o00oOOoO;
        @o0O0OOOo("mLock")
        @NotNull

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final WeakHashMap<Activity, o0O00> f5470o00oOo00;

        public o00oOOoO(@NotNull o00oo0O0.o00oOOo0 o00oooo02) {
            o0ooO.o00oo0O0(o00oooo02, "callbackInterface");
            this.f5468o00oOOo0 = o00oooo02;
            this.f5469o00oOOoO = new ReentrantLock();
            this.f5470o00oOo00 = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.o00oo0O0.o00oOOo0
        public void o00oOOo0(@NotNull Activity activity, @NotNull o0O00 o0o00) {
            o0ooO.o00oo0O0(activity, "activity");
            o0ooO.o00oo0O0(o0o00, "newLayout");
            ReentrantLock reentrantLock = this.f5469o00oOOoO;
            reentrantLock.lock();
            try {
                if (o0ooO.o00oOoO0(o0o00, this.f5470o00oOo00.get(activity))) {
                    return;
                }
                this.f5470o00oOo00.put(activity, o0o00);
                reentrantLock.unlock();
                this.f5468o00oOOo0.o00oOOo0(activity, o0o00);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/SidecarCompat$o00oOo00;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lo0OO0o/oO0Ooooo;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroidx/window/layout/SidecarCompat;", "o00oo0O0", "Landroidx/window/layout/SidecarCompat;", "sidecarCompat", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "kotlin.jvm.PlatformType", "o00oo0O", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "activity", "<init>", "(Landroidx/window/layout/SidecarCompat;Landroid/app/Activity;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOo00 implements View.OnAttachStateChangeListener {
        @NotNull

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final WeakReference<Activity> f5471o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final SidecarCompat f5472o00oo0O0;

        public o00oOo00(@NotNull SidecarCompat sidecarCompat, @NotNull Activity activity) {
            o0ooO.o00oo0O0(sidecarCompat, "sidecarCompat");
            o0ooO.o00oo0O0(activity, "activity");
            this.f5472o00oo0O0 = sidecarCompat;
            this.f5471o00oo0O = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            o0ooO.o00oo0O0(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.f5471o00oo0O.get();
            IBinder o00oOOo02 = SidecarCompat.f5455o00oOo0o.o00oOOo0(activity);
            if (activity == null || o00oOOo02 == null) {
                return;
            }
            this.f5472o00oo0O0.o00oOoOo(o00oOOo02, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            o0ooO.o00oo0O0(view, "view");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"androidx/window/layout/SidecarCompat$o00oOo0O", "Landroid/content/ComponentCallbacks;", "Landroid/content/res/Configuration;", "newConfig", "Lo0OO0o/oO0Ooooo;", "onConfigurationChanged", "onLowMemory", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOo0O implements ComponentCallbacks {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ Activity f5473o00oo0O;

        public o00oOo0O(Activity activity) {
            this.f5473o00oo0O = activity;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@NotNull Configuration configuration) {
            o0ooO.o00oo0O0(configuration, "newConfig");
            o00oo0O0.o00oOOo0 o00oooo02 = SidecarCompat.this.f5460o00oOo0O;
            if (o00oooo02 == null) {
                return;
            }
            Activity activity = this.f5473o00oo0O;
            o00oooo02.o00oOOo0(activity, SidecarCompat.this.o00oOoOO(activity));
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(@NotNull Context context) {
        this(f5455o00oOo0o.o00oOOoO(context), new o0(null, 1, null));
        o0ooO.o00oo0O0(context, "context");
    }

    @o0o0000
    public SidecarCompat(@o0o0000 @Nullable SidecarInterface sidecarInterface, @NotNull o0 o0Var) {
        o0ooO.o00oo0O0(o0Var, "sidecarAdapter");
        this.f5457o00oOOo0 = sidecarInterface;
        this.f5458o00oOOoO = o0Var;
        this.f5459o00oOo00 = new LinkedHashMap();
        this.f5461o00oOooO = new LinkedHashMap();
    }

    @Override // androidx.window.layout.o00oo0O0
    public void o00oOOo0(@NotNull o00oo0O0.o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(o00oooo02, "extensionCallback");
        this.f5460o00oOo0O = new o00oOOoO(o00oooo02);
        SidecarInterface sidecarInterface = this.f5457o00oOOo0;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.f5458o00oOOoO, new TranslatingCallback(this)));
    }

    @Override // androidx.window.layout.o00oo0O0
    public void o00oOOoO(@NotNull Activity activity) {
        o0ooO.o00oo0O0(activity, "activity");
        IBinder o00oOOo02 = f5455o00oOo0o.o00oOOo0(activity);
        if (o00oOOo02 != null) {
            o00oOoOo(o00oOOo02, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new o00oOo00(this, activity));
    }

    @Override // androidx.window.layout.o00oo0O0
    public void o00oOo00(@NotNull Activity activity) {
        SidecarInterface sidecarInterface;
        o0ooO.o00oo0O0(activity, "activity");
        IBinder o00oOOo02 = f5455o00oOo0o.o00oOOo0(activity);
        if (o00oOOo02 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f5457o00oOOo0;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(o00oOOo02);
        }
        o00oOooo(activity);
        boolean z = this.f5459o00oOo00.size() == 1;
        this.f5459o00oOo00.remove(o00oOOo02);
        if (!z || (sidecarInterface = this.f5457o00oOOo0) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    @Nullable
    public final SidecarInterface o00oOoO() {
        return this.f5457o00oOOo0;
    }

    @o0o0000
    @NotNull
    public final o0O00 o00oOoOO(@NotNull Activity activity) {
        o0ooO.o00oo0O0(activity, "activity");
        IBinder o00oOOo02 = f5455o00oOo0o.o00oOOo0(activity);
        if (o00oOOo02 == null) {
            return new o0O00(o0OO0oO.o0O00O0o.o00ooOOo());
        }
        SidecarInterface sidecarInterface = this.f5457o00oOOo0;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(o00oOOo02);
        o0 o0Var = this.f5458o00oOOoO;
        SidecarInterface sidecarInterface2 = this.f5457o00oOOo0;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return o0Var.o00oOo0O(windowLayoutInfo, deviceState);
    }

    public final void o00oOoOo(@NotNull IBinder iBinder, @NotNull Activity activity) {
        SidecarInterface sidecarInterface;
        o0ooO.o00oo0O0(iBinder, "windowToken");
        o0ooO.o00oo0O0(activity, "activity");
        this.f5459o00oOo00.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f5457o00oOOo0;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.f5459o00oOo00.size() == 1 && (sidecarInterface = this.f5457o00oOOo0) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        o00oo0O0.o00oOOo0 o00oooo02 = this.f5460o00oOo0O;
        if (o00oooo02 != null) {
            o00oooo02.o00oOOo0(activity, o00oOoOO(activity));
        }
        o00oOoo0(activity);
    }

    public final void o00oOoo0(Activity activity) {
        if (this.f5461o00oOooO.get(activity) == null) {
            o00oOo0O o00ooo0o2 = new o00oOo0O(activity);
            this.f5461o00oOooO.put(activity, o00ooo0o2);
            activity.registerComponentCallbacks(o00ooo0o2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6 A[Catch: all -> 0x019a, TRY_LEAVE, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016a A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0176 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0182 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    @Override // androidx.window.layout.o00oo0O0
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o00oOooO() {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.o00oOooO():boolean");
    }

    public final void o00oOooo(Activity activity) {
        activity.unregisterComponentCallbacks(this.f5461o00oOooO.get(activity));
        this.f5461o00oOooO.remove(activity);
    }
}
