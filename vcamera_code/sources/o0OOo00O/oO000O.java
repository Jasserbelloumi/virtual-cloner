package o0OOo00O;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u001a1\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\f\"\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OO/o00oo0;", "context", "Lkotlin/Function0;", "block", o00oOOoO.f12961o00oOo00, "(Lo0OO/o00oo0;Lo0OOOO/o00oOOo0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "coroutineContext", "o00oOooO", "(Lo0OO/o00oo0;Lo0OOOO/o00oOOo0;)Ljava/lang/Object;", "", "o00oOOo0", "I", "WORKING", "FINISHED", "o00oOo00", "INTERRUPTING", "INTERRUPTED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO000O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f14065o00oOOo0 = 0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f14066o00oOOoO = 1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f14067o00oOo00 = 2;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f14068o00oOooO = 3;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo00O/o0O0oo00;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> extends o0OOO0.o0 implements o0OOOO.o0O00000<o0O0oo00, o00oOo0O<? super T>, Object> {
        public final /* synthetic */ o0OOOO.o00oOOo0<T> $block;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(o0OOOO.o00oOOo0<? extends T> o00oooo02, o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$block = o00oooo02;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            o00oOOo0 o00oooo02 = new o00oOOo0(this.$block, o00ooo0o2);
            o00oooo02.L$0 = obj;
            return o00oooo02;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(o0O0oo00 o0o0oo00, Object obj) {
            return invoke(o0o0oo00, (o00oOo0O) ((o00oOo0O) obj));
        }

        @Nullable
        public final Object invoke(@NotNull o0O0oo00 o0o0oo00, @Nullable o00oOo0O<? super T> o00ooo0o2) {
            return ((o00oOOo0) create(o0o0oo00, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                return oO000O.o00oOooO(((o0O0oo00) this.L$0).o0O000O(), this.$block);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Nullable
    public static final <T> Object o00oOOoO(@NotNull o0OO.o00oo0 o00oo0Var, @NotNull o0OOOO.o00oOOo0<? extends T> o00oooo02, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        return o0O00000.o00oOoO0(o00oo0Var, new o00oOOo0(o00oooo02, null), o00ooo0o2);
    }

    public static /* synthetic */ Object o00oOo00(o0OO.o00oo0 o00oo0Var, o0OOOO.o00oOOo0 o00oooo02, o00oOo0O o00ooo0o2, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OO.o00oo0O0.INSTANCE;
        }
        return o00oOOoO(o00oo0Var, o00oooo02, o00ooo0o2);
    }

    public static final <T> T o00oOooO(o0OO.o00oo0 o00oo0Var, o0OOOO.o00oOOo0<? extends T> o00oooo02) {
        try {
            oO0O00oO oo0o00oo = new oO0O00oO(oO00O0o0.o00ooO0O(o00oo0Var));
            oo0o00oo.o00oOooO();
            T invoke = o00oooo02.invoke();
            oo0o00oo.o00oOOo0();
            return invoke;
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
