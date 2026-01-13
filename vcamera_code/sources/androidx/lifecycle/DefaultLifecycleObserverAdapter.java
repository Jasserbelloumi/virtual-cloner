package androidx.lifecycle;

import androidx.lifecycle.o0O00;
import com.google.firebase.analytics.FirebaseAnalytics;
import o00ooOoo.oOo000Oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements o0O00OOO {
    @Nullable

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0O00OOO f3220o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oo f3221o00oo0O0;

    /* loaded from: classes.dex */
    public /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f3222o00oOOo0;

        static {
            int[] iArr = new int[o0O00.o00oOOo0.values().length];
            try {
                iArr[o0O00.o00oOOo0.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0O00.o00oOOo0.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o0O00.o00oOOo0.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o0O00.o00oOOo0.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o0O00.o00oOOo0.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o0O00.o00oOOo0.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o0O00.o00oOOo0.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f3222o00oOOo0 = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(@NotNull o00oo o00ooVar, @Nullable o0O00OOO o0o00ooo) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultLifecycleObserver");
        this.f3221o00oo0O0 = o00ooVar;
        this.f3220o00oo0O = o0o00ooo;
    }

    @Override // androidx.lifecycle.o0O00OOO
    public void o00oOOoO(@NotNull o0O0O0O o0o0o0o, @NotNull o0O00.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, FirebaseAnalytics.Param.SOURCE);
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, oOo000Oo.f9217o0O00o0o);
        switch (o00oOOo0.f3222o00oOOo0[o00oooo02.ordinal()]) {
            case 1:
                this.f3221o00oo0O0.o00oOOo0(o0o0o0o);
                break;
            case 2:
                this.f3221o00oo0O0.o00oOoOo(o0o0o0o);
                break;
            case 3:
                this.f3221o00oo0O0.o00oOo0o(o0o0o0o);
                break;
            case 4:
                this.f3221o00oo0O0.o00oOoO0(o0o0o0o);
                break;
            case 5:
                this.f3221o00oo0O0.o00oOoO(o0o0o0o);
                break;
            case 6:
                this.f3221o00oo0O0.o00oOoOO(o0o0o0o);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        o0O00OOO o0o00ooo = this.f3220o00oo0O;
        if (o0o00ooo != null) {
            o0o00ooo.o00oOOoO(o0o0o0o, o00oooo02);
        }
    }
}
