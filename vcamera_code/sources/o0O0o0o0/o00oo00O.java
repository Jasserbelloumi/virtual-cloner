package o0O0o0o0;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.o0O0OOO0;
import androidx.lifecycle.o0OooO0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oo00O {

    /* JADX INFO: Add missing generic type declarations: [In] */
    /* loaded from: classes.dex */
    public class o00oOOo0<In> implements o0OooO0<In> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Out f12547o00oOOo0 = null;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ oO00O0oO f12548o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ Object f12549o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f12550o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ o00oo0.o00oOOo0 f12551o00oOooO;

        /* renamed from: o0O0o0o0.o00oo00O$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0156o00oOOo0 implements Runnable {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ Object f12553o00oo0O0;

            public RunnableC0156o00oOOo0(Object obj) {
                this.f12553o00oo0O0 = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, Out] */
            @Override // java.lang.Runnable
            public void run() {
                o0O0OOO0 o0o0ooo0;
                synchronized (o00oOOo0.this.f12549o00oOo00) {
                    ?? apply = o00oOOo0.this.f12551o00oOooO.apply(this.f12553o00oo0O0);
                    o00oOOo0 o00oooo02 = o00oOOo0.this;
                    Out out = o00oooo02.f12547o00oOOo0;
                    if (out == 0 && apply != 0) {
                        o00oooo02.f12547o00oOOo0 = apply;
                        o0o0ooo0 = o00oooo02.f12550o00oOo0O;
                    } else if (out != 0 && !out.equals(apply)) {
                        o00oOOo0 o00oooo03 = o00oOOo0.this;
                        o00oooo03.f12547o00oOOo0 = apply;
                        o0o0ooo0 = o00oooo03.f12550o00oOo0O;
                    }
                    o0o0ooo0.o00oo0OO(apply);
                }
            }
        }

        public o00oOOo0(oO00O0oO oo00o0oo, Object obj, o00oo0.o00oOOo0 o00oooo02, o0O0OOO0 o0o0ooo0) {
            this.f12548o00oOOoO = oo00o0oo;
            this.f12549o00oOo00 = obj;
            this.f12551o00oOooO = o00oooo02;
            this.f12550o00oOo0O = o0o0ooo0;
        }

        @Override // androidx.lifecycle.o0OooO0
        public void onChanged(@o0OO00OO In in) {
            this.f12548o00oOOoO.o00oOOoO(new RunnableC0156o00oOOo0(in));
        }
    }

    public static <In, Out> LiveData<Out> o00oOOo0(@oo0oO0 LiveData<In> liveData, @oo0oO0 o00oo0.o00oOOo0<In, Out> o00oooo02, @oo0oO0 oO00O0oO oo00o0oo) {
        Object obj = new Object();
        o0O0OOO0 o0o0ooo0 = new o0O0OOO0();
        o0o0ooo0.o00oo0o0(liveData, new o00oOOo0(oo00o0oo, obj, o00oooo02, o0o0ooo0));
        return o0o0ooo0;
    }
}
