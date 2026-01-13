package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.window.layout.o00oo0O0;
import androidx.window.layout.o0O00000;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0o0000;
import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0ooO;
import o0ooOoOO.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0003\u000b\n\u001fB\u0013\b\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010\u0014J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003R$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Landroidx/window/layout/o0O00000;", "Landroidx/window/layout/o0O000;", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Lo0ooOoOO/o;", "Landroidx/window/layout/o0O00;", "callback", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOOo0", "", "o00oOoOo", "o00oOo0o", "Landroidx/window/layout/o00oo0O0;", "Landroidx/window/layout/o00oo0O0;", "o00oOoO0", "()Landroidx/window/layout/o00oo0O0;", "o00oOoo0", "(Landroidx/window/layout/o00oo0O0;)V", "windowExtension", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/layout/o0O00000$o00oOo00;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "o00oOoO", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks$annotations", "()V", "windowLayoutChangeCallbacks", "<init>", "o00oOo00", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o0O00000 implements o0O000 {
    @Nullable

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static volatile o0O00000 f5515o00oOo0O = null;
    @NotNull

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f5517o00oOoO0 = "WindowServer";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final boolean f5518o00oOooO = false;
    @o0O0OOOo("globalLock")
    @o0o0000
    @Nullable

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oo0O0 f5519o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final CopyOnWriteArrayList<o00oOo00> f5520o00oOOoO = new CopyOnWriteArrayList<>();
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final o00oOOo0 f5514o00oOo00 = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final ReentrantLock f5516o00oOo0o = new ReentrantLock();

    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\b\u0010\r\u001a\u00020\fH\u0007R\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/window/layout/o0O00000$o00oOOo0;", "", "Landroid/content/Context;", "context", "Landroidx/window/layout/o0O00000;", "o00oOOo0", "Landroidx/window/layout/o00oo0O0;", o0OO000o.o00oOOoO.f12961o00oOo00, "Lo0O0OoO/o00ooO;", "sidecarVersion", "", "o00oOo00", "Lo0OO0o/oO0Ooooo;", "o00oOooO", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "globalInstance", "Landroidx/window/layout/o0O00000;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
        }

        @NotNull
        public final o0O00000 o00oOOo0(@NotNull Context context) {
            o0ooO.o00oo0O0(context, "context");
            if (o0O00000.f5515o00oOo0O == null) {
                ReentrantLock reentrantLock = o0O00000.f5516o00oOo0o;
                reentrantLock.lock();
                try {
                    if (o0O00000.f5515o00oOo0O == null) {
                        o0O00000.f5515o00oOo0O = new o0O00000(o0O00000.f5514o00oOo00.o00oOOoO(context));
                    }
                    oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
                } finally {
                    reentrantLock.unlock();
                }
            }
            o0O00000 o0o00000 = o0O00000.f5515o00oOo0O;
            o0ooO.o00oo00O(o0o00000);
            return o0o00000;
        }

        @Nullable
        public final o00oo0O0 o00oOOoO(@NotNull Context context) {
            o0ooO.o00oo0O0(context, "context");
            try {
                if (o00oOo00(SidecarCompat.f5455o00oOo0o.o00oOo00())) {
                    SidecarCompat sidecarCompat = new SidecarCompat(context);
                    if (sidecarCompat.o00oOooO()) {
                        return sidecarCompat;
                    }
                    return null;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        @o0o0000
        public final boolean o00oOo00(@Nullable o0O0OoO.o00ooO o00ooo) {
            if (o00ooo == null) {
                return false;
            }
            o0O0OoO.o00ooO.f11973o00oo0oO.getClass();
            return o00ooo.compareTo(o0O0OoO.o00ooO.o00oOo0O()) >= 0;
        }

        @o0o0000
        public final void o00oOooO() {
            o0O00000.f5515o00oOo0O = null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\n"}, d2 = {"Landroidx/window/layout/o0O00000$o00oOOoO;", "Landroidx/window/layout/o00oo0O0$o00oOOo0;", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/o0O00;", "newLayout", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "<init>", "(Landroidx/window/layout/o0O00000;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    @o0o0000
    /* loaded from: classes.dex */
    public final class o00oOOoO implements o00oo0O0.o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0O00000 f5521o00oOOo0;

        public o00oOOoO(o0O00000 o0o00000) {
            o0ooO.o00oo0O0(o0o00000, "this$0");
            this.f5521o00oOOo0 = o0o00000;
        }

        @Override // androidx.window.layout.o00oo0O0.o00oOOo0
        @SuppressLint({"SyntheticAccessor"})
        public void o00oOOo0(@NotNull Activity activity, @NotNull o0O00 o0o00) {
            o0ooO.o00oo0O0(activity, "activity");
            o0ooO.o00oo0O0(o0o00, "newLayout");
            Iterator<o00oOo00> it = this.f5521o00oOOo0.f5520o00oOOoO.iterator();
            while (it.hasNext()) {
                o00oOo00 next = it.next();
                if (o0ooO.o00oOoO0(next.f5522o00oOOo0, activity)) {
                    next.o00oOOoO(o0o00);
                }
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/window/layout/o0O00000$o00oOo00;", "", "Landroidx/window/layout/o0O00;", "newLayoutInfo", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "Landroid/app/Activity;", "o00oOOo0", "Landroid/app/Activity;", "o00oOooO", "()Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "executor", "Lo0ooOoOO/o;", "o00oOo00", "Lo0ooOoOO/o;", "o00oOo0O", "()Lo0ooOoOO/o;", "callback", "Landroidx/window/layout/o0O00;", "o00oOo0o", "()Landroidx/window/layout/o0O00;", "o00oOoO0", "(Landroidx/window/layout/o0O00;)V", "lastInfo", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Lo0ooOoOO/o;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOo00 {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Activity f5522o00oOOo0;
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Executor f5523o00oOOoO;
        @NotNull

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final o<o0O00> f5524o00oOo00;
        @Nullable

        /* renamed from: o00oOooO  reason: collision with root package name */
        public o0O00 f5525o00oOooO;

        public o00oOo00(@NotNull Activity activity, @NotNull Executor executor, @NotNull o<o0O00> oVar) {
            o0ooO.o00oo0O0(activity, "activity");
            o0ooO.o00oo0O0(executor, "executor");
            o0ooO.o00oo0O0(oVar, "callback");
            this.f5522o00oOOo0 = activity;
            this.f5523o00oOOoO = executor;
            this.f5524o00oOo00 = oVar;
        }

        public static final void o00oOo00(o00oOo00 o00ooo002, o0O00 o0o00) {
            o0ooO.o00oo0O0(o00ooo002, "this$0");
            o0ooO.o00oo0O0(o0o00, "$newLayoutInfo");
            o00ooo002.f5524o00oOo00.accept(o0o00);
        }

        public final void o00oOOoO(@NotNull final o0O00 o0o00) {
            o0ooO.o00oo0O0(o0o00, "newLayoutInfo");
            this.f5525o00oOooO = o0o00;
            this.f5523o00oOOoO.execute(new Runnable() { // from class: androidx.window.layout.o0O0000O
                @Override // java.lang.Runnable
                public final void run() {
                    o0O00000.o00oOo00.o00oOo00(o0O00000.o00oOo00.this, o0o00);
                }
            });
        }

        @NotNull
        public final o<o0O00> o00oOo0O() {
            return this.f5524o00oOo00;
        }

        @Nullable
        public final o0O00 o00oOo0o() {
            return this.f5525o00oOooO;
        }

        public final void o00oOoO0(@Nullable o0O00 o0o00) {
            this.f5525o00oOooO = o0o00;
        }

        @NotNull
        public final Activity o00oOooO() {
            return this.f5522o00oOOo0;
        }
    }

    @o0o0000
    public o0O00000(@Nullable o00oo0O0 o00oo0o02) {
        this.f5519o00oOOo0 = o00oo0o02;
        o00oo0O0 o00oo0o03 = this.f5519o00oOOo0;
        if (o00oo0o03 == null) {
            return;
        }
        o00oo0o03.o00oOOo0(new o00oOOoO(this));
    }

    @o0o0000
    public static /* synthetic */ void o00oOoOO() {
    }

    @Override // androidx.window.layout.o0O000
    public void o00oOOo0(@NotNull o<o0O00> oVar) {
        o0ooO.o00oo0O0(oVar, "callback");
        synchronized (f5516o00oOo0o) {
            if (this.f5519o00oOOo0 == null) {
                return;
            }
            ArrayList<o00oOo00> arrayList = new ArrayList();
            Iterator<o00oOo00> it = this.f5520o00oOOoO.iterator();
            while (it.hasNext()) {
                o00oOo00 next = it.next();
                if (next.f5524o00oOo00 == oVar) {
                    o0ooO.o00oo0OO(next, "callbackWrapper");
                    arrayList.add(next);
                }
            }
            this.f5520o00oOOoO.removeAll(arrayList);
            for (o00oOo00 o00ooo002 : arrayList) {
                o00oOo0o(o00ooo002.f5522o00oOOo0);
            }
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
        }
    }

    @Override // androidx.window.layout.o0O000
    public void o00oOOoO(@NotNull Activity activity, @NotNull Executor executor, @NotNull o<o0O00> oVar) {
        o0O00 o0o00;
        Object obj;
        o0ooO.o00oo0O0(activity, "activity");
        o0ooO.o00oo0O0(executor, "executor");
        o0ooO.o00oo0O0(oVar, "callback");
        ReentrantLock reentrantLock = f5516o00oOo0o;
        reentrantLock.lock();
        try {
            o00oo0O0 o00oo0o02 = this.f5519o00oOOo0;
            if (o00oo0o02 == null) {
                oVar.accept(new o0O00(o0OO0oO.o0ooO.INSTANCE));
                return;
            }
            boolean o00oOoOo2 = o00oOoOo(activity);
            o00oOo00 o00ooo002 = new o00oOo00(activity, executor, oVar);
            this.f5520o00oOOoO.add(o00ooo002);
            if (o00oOoOo2) {
                Iterator<T> it = this.f5520o00oOOoO.iterator();
                while (true) {
                    o0o00 = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (o0ooO.o00oOoO0(activity, ((o00oOo00) obj).f5522o00oOOo0)) {
                        break;
                    }
                }
                o00oOo00 o00ooo003 = (o00oOo00) obj;
                if (o00ooo003 != null) {
                    o0o00 = o00ooo003.f5525o00oOooO;
                }
                if (o0o00 != null) {
                    o00ooo002.o00oOOoO(o0o00);
                }
            } else {
                o00oo0o02.o00oOOoO(activity);
            }
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
        } finally {
            reentrantLock.unlock();
        }
    }

    @o0O0OOOo("sLock")
    public final void o00oOo0o(Activity activity) {
        o00oo0O0 o00oo0o02;
        CopyOnWriteArrayList<o00oOo00> copyOnWriteArrayList = this.f5520o00oOOoO;
        boolean z = false;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (o0ooO.o00oOoO0(((o00oOo00) it.next()).f5522o00oOOo0, activity)) {
                    z = true;
                    break;
                }
            }
        }
        if (z || (o00oo0o02 = this.f5519o00oOOo0) == null) {
            return;
        }
        o00oo0o02.o00oOo00(activity);
    }

    @NotNull
    public final CopyOnWriteArrayList<o00oOo00> o00oOoO() {
        return this.f5520o00oOOoO;
    }

    @Nullable
    public final o00oo0O0 o00oOoO0() {
        return this.f5519o00oOOo0;
    }

    public final boolean o00oOoOo(Activity activity) {
        CopyOnWriteArrayList<o00oOo00> copyOnWriteArrayList = this.f5520o00oOOoO;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (o00oOo00 o00ooo002 : copyOnWriteArrayList) {
            if (o0ooO.o00oOoO0(o00ooo002.f5522o00oOOo0, activity)) {
                return true;
            }
        }
        return false;
    }

    public final void o00oOoo0(@Nullable o00oo0O0 o00oo0o02) {
        this.f5519o00oOOo0 = o00oo0o02;
    }
}
