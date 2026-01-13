package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import o00oOooO.o0OO0oO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public abstract class o0O00 {
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public AtomicReference<Object> f3328o00oOOo0 = new AtomicReference<>();

    /* loaded from: classes.dex */
    public enum o00oOOo0 {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        @NotNull
        public static final C0023o00oOOo0 Companion = new C0023o00oOOo0(null);

        /* renamed from: androidx.lifecycle.o0O00$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0023o00oOOo0 {

            /* renamed from: androidx.lifecycle.o0O00$o00oOOo0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0024o00oOOo0 {

                /* renamed from: o00oOOo0  reason: collision with root package name */
                public static final /* synthetic */ int[] f3329o00oOOo0;

                static {
                    int[] iArr = new int[o00oOOoO.values().length];
                    try {
                        iArr[o00oOOoO.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[o00oOOoO.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[o00oOOoO.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[o00oOOoO.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[o00oOOoO.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f3329o00oOOo0 = iArr;
                }
            }

            public C0023o00oOOo0() {
            }

            public C0023o00oOOo0(o0OOOOO0.o0O00 o0o00) {
            }

            @o0OOOO0o.o00ooO0
            @Nullable
            public final o00oOOo0 o00oOOo0(@NotNull o00oOOoO o00ooooo2) {
                o0OOOOO0.o0ooO.o00oo0O0(o00ooooo2, "state");
                int i = C0024o00oOOo0.f3329o00oOOo0[o00ooooo2.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return o00oOOo0.ON_PAUSE;
                    }
                    return o00oOOo0.ON_STOP;
                }
                return o00oOOo0.ON_DESTROY;
            }

            @o0OOOO0o.o00ooO0
            @Nullable
            public final o00oOOo0 o00oOOoO(@NotNull o00oOOoO o00ooooo2) {
                o0OOOOO0.o0ooO.o00oo0O0(o00ooooo2, "state");
                int i = C0024o00oOOo0.f3329o00oOOo0[o00ooooo2.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            return null;
                        }
                        return o00oOOo0.ON_DESTROY;
                    }
                    return o00oOOo0.ON_PAUSE;
                }
                return o00oOOo0.ON_STOP;
            }

            @o0OOOO0o.o00ooO0
            @Nullable
            public final o00oOOo0 o00oOo00(@NotNull o00oOOoO o00ooooo2) {
                o0OOOOO0.o0ooO.o00oo0O0(o00ooooo2, "state");
                int i = C0024o00oOOo0.f3329o00oOOo0[o00ooooo2.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 5) {
                            return null;
                        }
                        return o00oOOo0.ON_CREATE;
                    }
                    return o00oOOo0.ON_RESUME;
                }
                return o00oOOo0.ON_START;
            }

            @o0OOOO0o.o00ooO0
            @Nullable
            public final o00oOOo0 o00oOooO(@NotNull o00oOOoO o00ooooo2) {
                o0OOOOO0.o0ooO.o00oo0O0(o00ooooo2, "state");
                int i = C0024o00oOOo0.f3329o00oOOo0[o00ooooo2.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return o00oOOo0.ON_RESUME;
                    }
                    return o00oOOo0.ON_START;
                }
                return o00oOOo0.ON_CREATE;
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class o00oOOoO {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public static final /* synthetic */ int[] f3330o00oOOo0;

            static {
                int[] iArr = new int[o00oOOo0.values().length];
                try {
                    iArr[o00oOOo0.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o00oOOo0.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[o00oOOo0.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[o00oOOo0.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[o00oOOo0.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[o00oOOo0.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[o00oOOo0.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f3330o00oOOo0 = iArr;
            }
        }

        @o0OOOO0o.o00ooO0
        @Nullable
        public static final o00oOOo0 downFrom(@NotNull o00oOOoO o00ooooo2) {
            return Companion.o00oOOo0(o00ooooo2);
        }

        @o0OOOO0o.o00ooO0
        @Nullable
        public static final o00oOOo0 downTo(@NotNull o00oOOoO o00ooooo2) {
            return Companion.o00oOOoO(o00ooooo2);
        }

        @o0OOOO0o.o00ooO0
        @Nullable
        public static final o00oOOo0 upFrom(@NotNull o00oOOoO o00ooooo2) {
            return Companion.o00oOo00(o00ooooo2);
        }

        @o0OOOO0o.o00ooO0
        @Nullable
        public static final o00oOOo0 upTo(@NotNull o00oOOoO o00ooooo2) {
            return Companion.o00oOooO(o00ooooo2);
        }

        @NotNull
        public final o00oOOoO getTargetState() {
            switch (o00oOOoO.f3330o00oOOo0[ordinal()]) {
                case 1:
                case 2:
                    return o00oOOoO.CREATED;
                case 3:
                case 4:
                    return o00oOOoO.STARTED;
                case 5:
                    return o00oOOoO.RESUMED;
                case 6:
                    return o00oOOoO.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* loaded from: classes.dex */
    public enum o00oOOoO {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(@NotNull o00oOOoO o00ooooo2) {
            o0OOOOO0.o0ooO.o00oo0O0(o00ooooo2, "state");
            return compareTo(o00ooooo2) >= 0;
        }
    }

    @o00oOooO.o0O
    public abstract void o00oOOo0(@NotNull o0O00oO0 o0o00oo0);

    @o00oOooO.o0O
    @NotNull
    public abstract o00oOOoO o00oOOoO();

    @NotNull
    public final AtomicReference<Object> o00oOo00() {
        return this.f3328o00oOOo0;
    }

    public final void o00oOo0O(@NotNull AtomicReference<Object> atomicReference) {
        o0OOOOO0.o0ooO.o00oo0O0(atomicReference, "<set-?>");
        this.f3328o00oOOo0 = atomicReference;
    }

    @o00oOooO.o0O
    public abstract void o00oOooO(@NotNull o0O00oO0 o0o00oo0);
}
