package androidx.lifecycle;

import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0OO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOO0o.o00oo0OO(name = "Transformations")
/* loaded from: classes.dex */
public final class o0OoOoO {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* loaded from: classes.dex */
    public static final class o00oOOo0<X> extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<X, oO0Ooooo> {
        public final /* synthetic */ o0OO0O0.o00oOOo0 $firstTime;
        public final /* synthetic */ o0O0OOO0<X> $outputLiveData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(o0O0OOO0<X> o0o0ooo0, o0OO0O0.o00oOOo0 o00oooo02) {
            super(1);
            this.$outputLiveData = o0o0ooo0;
            this.$firstTime = o00oooo02;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(Object obj) {
            invoke2((o00oOOo0<X>) obj);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(X x) {
            X o00oOo0o2 = this.$outputLiveData.o00oOo0o();
            if (this.$firstTime.element || ((o00oOo0o2 == null && x != null) || !(o00oOo0o2 == null || o0OOOOO0.o0ooO.o00oOoO0(o00oOo0o2, x)))) {
                this.$firstTime.element = false;
                this.$outputLiveData.o00oo0Oo(x);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* loaded from: classes.dex */
    public static final class o00oOOoO<X> extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<X, oO0Ooooo> {
        public final /* synthetic */ o0O0OOO0<Y> $result;
        public final /* synthetic */ o0OOOO.o00oo<X, Y> $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(o0O0OOO0<Y> o0o0ooo0, o0OOOO.o00oo<X, Y> o00ooVar) {
            super(1);
            this.$result = o0o0ooo0;
            this.$transform = o00ooVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(Object obj) {
            invoke2((o00oOOoO<X>) obj);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(X x) {
            this.$result.o00oo0Oo(this.$transform.invoke(x));
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOo00 extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<Object, oO0Ooooo> {
        public final /* synthetic */ o00oo0.o00oOOo0<Object, Object> $mapFunction;
        public final /* synthetic */ o0O0OOO0<Object> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(o0O0OOO0<Object> o0o0ooo0, o00oo0.o00oOOo0<Object, Object> o00oooo02) {
            super(1);
            this.$result = o0o0ooo0;
            this.$mapFunction = o00oooo02;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(Object obj) {
            invoke2(obj);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            this.$result.o00oo0Oo(this.$mapFunction.apply(obj));
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOo0O implements o0OooO0, o0OOOOO0.o0oO0Ooo {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo f3409o00oOOo0;

        public o00oOo0O(o0OOOO.o00oo o00ooVar) {
            o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "function");
            this.f3409o00oOOo0 = o00ooVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof o0OooO0) && (obj instanceof o0OOOOO0.o0oO0Ooo)) {
                return o0OOOOO0.o0ooO.o00oOoO0(this.f3409o00oOOo0, ((o0OOOOO0.o0oO0Ooo) obj).o00oOOo0());
            }
            return false;
        }

        public final int hashCode() {
            return this.f3409o00oOOo0.hashCode();
        }

        @Override // o0OOOOO0.o0oO0Ooo
        @NotNull
        public final o0OO0o.o0O000o0<?> o00oOOo0() {
            return this.f3409o00oOOo0;
        }

        @Override // androidx.lifecycle.o0OooO0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f3409o00oOOo0.invoke(obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* loaded from: classes.dex */
    public static final class o00oOoO<X> implements o0OooO0<X> {
        @Nullable

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public LiveData<Y> f3410o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<X, LiveData<Y>> f3411o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0<Y> f3412o00oOo00;

        /* JADX INFO: Add missing generic type declarations: [Y] */
        /* loaded from: classes.dex */
        public static final class o00oOOo0<Y> extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<Y, oO0Ooooo> {
            public final /* synthetic */ o0O0OOO0<Y> $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOOo0(o0O0OOO0<Y> o0o0ooo0) {
                super(1);
                this.$result = o0o0ooo0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o0OOOO.o00oo
            public /* bridge */ /* synthetic */ oO0Ooooo invoke(Object obj) {
                invoke2((o00oOOo0<Y>) obj);
                return oO0Ooooo.f13240o00oOOo0;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Y y) {
                this.$result.o00oo0Oo(y);
            }
        }

        public o00oOoO(o0OOOO.o00oo<X, LiveData<Y>> o00ooVar, o0O0OOO0<Y> o0o0ooo0) {
            this.f3411o00oOOoO = o00ooVar;
            this.f3412o00oOo00 = o0o0ooo0;
        }

        @Nullable
        public final LiveData<Y> o00oOOo0() {
            return this.f3410o00oOOo0;
        }

        public final void o00oOOoO(@Nullable LiveData<Y> liveData) {
            this.f3410o00oOOo0 = liveData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.o0OooO0
        public void onChanged(X x) {
            LiveData<Y> liveData = (LiveData) this.f3411o00oOOoO.invoke(x);
            Object obj = this.f3410o00oOOo0;
            if (obj == liveData) {
                return;
            }
            if (obj != null) {
                o0O0OOO0<Y> o0o0ooo0 = this.f3412o00oOo00;
                o0OOOOO0.o0ooO.o00oo00O(obj);
                o0o0ooo0.o00oo0o(obj);
            }
            this.f3410o00oOOo0 = liveData;
            if (liveData != 0) {
                o0O0OOO0<Y> o0o0ooo02 = this.f3412o00oOo00;
                o0OOOOO0.o0ooO.o00oo00O(liveData);
                o0o0ooo02.o00oo0o0(liveData, new o00oOo0O(new o00oOOo0(this.f3412o00oOo00)));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo00O implements o0OooO0<Object> {
        @Nullable

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public LiveData<Object> f3413o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ o00oo0.o00oOOo0<Object, LiveData<Object>> f3414o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0<Object> f3415o00oOo00;

        /* loaded from: classes.dex */
        public static final class o00oOOo0 extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<Object, oO0Ooooo> {
            public final /* synthetic */ o0O0OOO0<Object> $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOOo0(o0O0OOO0<Object> o0o0ooo0) {
                super(1);
                this.$result = o0o0ooo0;
            }

            @Override // o0OOOO.o00oo
            public /* bridge */ /* synthetic */ oO0Ooooo invoke(Object obj) {
                invoke2(obj);
                return oO0Ooooo.f13240o00oOOo0;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                this.$result.o00oo0Oo(obj);
            }
        }

        public o00oo00O(o00oo0.o00oOOo0<Object, LiveData<Object>> o00oooo02, o0O0OOO0<Object> o0o0ooo0) {
            this.f3414o00oOOoO = o00oooo02;
            this.f3415o00oOo00 = o0o0ooo0;
        }

        @Nullable
        public final LiveData<Object> o00oOOo0() {
            return this.f3413o00oOOo0;
        }

        public final void o00oOOoO(@Nullable LiveData<Object> liveData) {
            this.f3413o00oOOo0 = liveData;
        }

        @Override // androidx.lifecycle.o0OooO0
        public void onChanged(Object obj) {
            LiveData<Object> apply = this.f3414o00oOOoO.apply(obj);
            LiveData<Object> liveData = this.f3413o00oOOo0;
            if (liveData == apply) {
                return;
            }
            if (liveData != null) {
                o0O0OOO0<Object> o0o0ooo0 = this.f3415o00oOo00;
                o0OOOOO0.o0ooO.o00oo00O(liveData);
                o0o0ooo0.o00oo0o(liveData);
            }
            this.f3413o00oOOo0 = apply;
            if (apply != null) {
                o0O0OOO0<Object> o0o0ooo02 = this.f3415o00oOo00;
                o0OOOOO0.o0ooO.o00oo00O(apply);
                o0o0ooo02.o00oo0o0(apply, new o00oOo0O(new o00oOOo0(this.f3415o00oOo00)));
            }
        }
    }

    @o00oOooO.o0OoO00O
    @NotNull
    @o00oOooO.o0O
    @o0OOOO0o.o00oo0OO(name = "distinctUntilChanged")
    public static final <X> LiveData<X> o00oOOo0(@NotNull LiveData<X> liveData) {
        o0OOOOO0.o0ooO.o00oo0O0(liveData, "<this>");
        o0O0OOO0 o0o0ooo0 = new o0O0OOO0();
        o0OO0O0.o00oOOo0 o00oooo02 = new o0OO0O0.o00oOOo0();
        o00oooo02.element = true;
        if (liveData.o00oOoOo()) {
            o0o0ooo0.o00oo0Oo(liveData.o00oOo0o());
            o00oooo02.element = false;
        }
        o0o0ooo0.o00oo0o0(liveData, new o00oOo0O(new o00oOOo0(o0o0ooo0, o00oooo02)));
        return o0o0ooo0;
    }

    @o00oOooO.o0OoO00O
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @o00oOooO.o0O
    @o0OOOO0o.o00oo0OO(name = "map")
    public static final /* synthetic */ LiveData o00oOOoO(LiveData liveData, o00oo0.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(liveData, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "mapFunction");
        o0O0OOO0 o0o0ooo0 = new o0O0OOO0();
        o0o0ooo0.o00oo0o0(liveData, new o00oOo0O(new o00oOo00(o0o0ooo0, o00oooo02)));
        return o0o0ooo0;
    }

    @o00oOooO.o0OoO00O
    @NotNull
    @o00oOooO.o0O
    @o0OOOO0o.o00oo0OO(name = "map")
    public static final <X, Y> LiveData<Y> o00oOo00(@NotNull LiveData<X> liveData, @NotNull o0OOOO.o00oo<X, Y> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(liveData, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        o0O0OOO0 o0o0ooo0 = new o0O0OOO0();
        o0o0ooo0.o00oo0o0(liveData, new o00oOo0O(new o00oOOoO(o0o0ooo0, o00ooVar)));
        return o0o0ooo0;
    }

    @o00oOooO.o0OoO00O
    @NotNull
    @o00oOooO.o0O
    @o0OOOO0o.o00oo0OO(name = "switchMap")
    public static final <X, Y> LiveData<Y> o00oOo0O(@NotNull LiveData<X> liveData, @NotNull o0OOOO.o00oo<X, LiveData<Y>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(liveData, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        o0O0OOO0 o0o0ooo0 = new o0O0OOO0();
        o0o0ooo0.o00oo0o0(liveData, new o00oOoO(o00ooVar, o0o0ooo0));
        return o0o0ooo0;
    }

    @o00oOooO.o0OoO00O
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @o00oOooO.o0O
    @o0OOOO0o.o00oo0OO(name = "switchMap")
    public static final /* synthetic */ LiveData o00oOooO(LiveData liveData, o00oo0.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(liveData, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "switchMapFunction");
        o0O0OOO0 o0o0ooo0 = new o0O0OOO0();
        o0o0ooo0.o00oo0o0(liveData, new o00oo00O(o00oooo02, o0o0ooo0));
        return o0o0ooo0;
    }
}
