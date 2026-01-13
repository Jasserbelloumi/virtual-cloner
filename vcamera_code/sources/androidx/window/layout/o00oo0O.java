package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Metadata;
import o00oOooO.o0O0OOOo;
import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0ooO;
import o0ooOoOO.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/window/layout/o00oo0O;", "Landroidx/window/layout/o0O000;", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Lo0ooOoOO/o;", "Landroidx/window/layout/o0O00;", "callback", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOOo0", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "extensionWindowBackendLock", "", "Landroidx/window/layout/o00oo0O$o00oOOo0;", "o00oOo00", "Ljava/util/Map;", "activityToListeners", "o00oOooO", "listenerToActivity", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;)V", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o00oo0O implements o0O000 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final WindowLayoutComponent f5494o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final ReentrantLock f5495o00oOOoO;
    @o0O0OOOo("lock")
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Map<Activity, o00oOOo0> f5496o00oOo00;
    @o0O0OOOo("lock")
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Map<o<o0O00>, Activity> f5497o00oOooO;

    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0006\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\n\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/window/layout/o00oo0O$o00oOOo0;", "Ljava/util/function/Consumer;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "Lo0ooOoOO/o;", "Landroidx/window/layout/o0O00;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOooO", "", "o00oOo00", "Landroid/app/Activity;", "o00oo0O0", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/locks/ReentrantLock;", "o00oo0O", "Ljava/util/concurrent/locks/ReentrantLock;", "multicastConsumerLock", "o00oo0Oo", "Landroidx/window/layout/o0O00;", "lastKnownValue", "", "o00oo0o0", "Ljava/util/Set;", "registeredListeners", "<init>", "(Landroid/app/Activity;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    @SuppressLint({"NewApi"})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements Consumer<WindowLayoutInfo> {
        @NotNull

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final ReentrantLock f5498o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Activity f5499o00oo0O0;
        @o0O0OOOo("lock")
        @Nullable

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public o0O00 f5500o00oo0Oo;
        @o0O0OOOo("lock")
        @NotNull

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final Set<o<o0O00>> f5501o00oo0o0;

        public o00oOOo0(@NotNull Activity activity) {
            o0ooO.o00oo0O0(activity, "activity");
            this.f5499o00oo0O0 = activity;
            this.f5498o00oo0O = new ReentrantLock();
            this.f5501o00oo0o0 = new LinkedHashSet();
        }

        @Override // java.util.function.Consumer
        /* renamed from: o00oOOo0 */
        public void accept(@NotNull WindowLayoutInfo windowLayoutInfo) {
            o0ooO.o00oo0O0(windowLayoutInfo, "value");
            ReentrantLock reentrantLock = this.f5498o00oo0O;
            reentrantLock.lock();
            try {
                this.f5500o00oo0Oo = o0O0o.f5541o00oOOo0.o00oOOoO(this.f5499o00oo0O0, windowLayoutInfo);
                Iterator<T> it = this.f5501o00oo0o0.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).accept(this.f5500o00oo0Oo);
                }
                oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void o00oOOoO(@NotNull o<o0O00> oVar) {
            o0ooO.o00oo0O0(oVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            ReentrantLock reentrantLock = this.f5498o00oo0O;
            reentrantLock.lock();
            try {
                o0O00 o0o00 = this.f5500o00oo0Oo;
                if (o0o00 != null) {
                    oVar.accept(o0o00);
                }
                this.f5501o00oo0o0.add(oVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean o00oOo00() {
            return this.f5501o00oo0o0.isEmpty();
        }

        public final void o00oOooO(@NotNull o<o0O00> oVar) {
            o0ooO.o00oo0O0(oVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            ReentrantLock reentrantLock = this.f5498o00oo0O;
            reentrantLock.lock();
            try {
                this.f5501o00oo0o0.remove(oVar);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public o00oo0O(@NotNull WindowLayoutComponent windowLayoutComponent) {
        o0ooO.o00oo0O0(windowLayoutComponent, "component");
        this.f5494o00oOOo0 = windowLayoutComponent;
        this.f5495o00oOOoO = new ReentrantLock();
        this.f5496o00oOo00 = new LinkedHashMap();
        this.f5497o00oOooO = new LinkedHashMap();
    }

    @Override // androidx.window.layout.o0O000
    public void o00oOOo0(@NotNull o<o0O00> oVar) {
        o0ooO.o00oo0O0(oVar, "callback");
        ReentrantLock reentrantLock = this.f5495o00oOOoO;
        reentrantLock.lock();
        try {
            Activity activity = this.f5497o00oOooO.get(oVar);
            if (activity == null) {
                return;
            }
            o00oOOo0 o00oooo02 = this.f5496o00oOo00.get(activity);
            if (o00oooo02 == null) {
                return;
            }
            o00oooo02.o00oOooO(oVar);
            if (o00oooo02.o00oOo00()) {
                this.f5494o00oOOo0.removeWindowLayoutInfoListener(o00oooo02);
            }
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.o0O000
    public void o00oOOoO(@NotNull Activity activity, @NotNull Executor executor, @NotNull o<o0O00> oVar) {
        oO0Ooooo oo0ooooo;
        o0ooO.o00oo0O0(activity, "activity");
        o0ooO.o00oo0O0(executor, "executor");
        o0ooO.o00oo0O0(oVar, "callback");
        ReentrantLock reentrantLock = this.f5495o00oOOoO;
        reentrantLock.lock();
        try {
            o00oOOo0 o00oooo02 = this.f5496o00oOo00.get(activity);
            if (o00oooo02 == null) {
                oo0ooooo = null;
            } else {
                o00oooo02.o00oOOoO(oVar);
                this.f5497o00oOooO.put(oVar, activity);
                oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            }
            if (oo0ooooo == null) {
                o00oOOo0 o00oooo03 = new o00oOOo0(activity);
                this.f5496o00oOo00.put(activity, o00oooo03);
                this.f5497o00oOooO.put(oVar, activity);
                o00oooo03.o00oOOoO(oVar);
                this.f5494o00oOOo0.addWindowLayoutInfoListener(activity, o00oooo03);
            }
            oO0Ooooo oo0ooooo2 = oO0Ooooo.f13240o00oOOo0;
        } finally {
            reentrantLock.unlock();
        }
    }
}
