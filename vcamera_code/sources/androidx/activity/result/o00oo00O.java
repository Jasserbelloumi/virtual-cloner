package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import o00ooOoo.oO000OOo;
import o0OO0o.o0O00oO0;
import o0OO0o.o0oO0Ooo;
import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B1\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0004H\u0016J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u000bH\u0016R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R'\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014¨\u0006 "}, d2 = {"Landroidx/activity/result/o00oo00O;", "I", "O", "Landroidx/activity/result/o00oo0OO;", "Lo0OO0o/oO0Ooooo;", "input", "Lo00ooOoo/oO000OOo;", "options", "o00oOoOO", "(Lo0OO0o/oO0Ooooo;Lo00ooOoo/oO000OOo;)V", "o00oOooO", "Lo00oOo00/o00oOOo0;", "o00oOOo0", "Landroidx/activity/result/o00oo0OO;", "o00oOoO0", "()Landroidx/activity/result/o00oo0OO;", "launcher", o0OO000o.o00oOOoO.f12961o00oOo00, "Lo00oOo00/o00oOOo0;", "o00oOo0O", "()Lo00oOo00/o00oOOo0;", "callerContract", "o00oOo00", "Ljava/lang/Object;", "o00oOo0o", "()Ljava/lang/Object;", "callerInput", "Lo0OO0o/o0oO0Ooo;", "o00oOoO", "resultContract", "<init>", "(Landroidx/activity/result/o00oo0OO;Lo00oOo00/o00oOOo0;Ljava/lang/Object;)V", "activity-ktx_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o00oo00O<I, O> extends o00oo0OO<oO0Ooooo> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oo0OO<I> f114o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oOo00.o00oOOo0<I, O> f115o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final I f116o00oOo00;
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0oO0Ooo f117o00oOooO;

    @Metadata(bv = {}, d1 = {"\u0000\u000b\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "O", "androidx/activity/result/o00oo00O$o00oOOo0$o00oOOo0", "invoke", "()Landroidx/activity/result/o00oo00O$o00oOOo0$o00oOOo0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0O0OO implements o0OOOO.o00oOOo0<C0003o00oOOo0> {
        public final /* synthetic */ o00oo00O<I, O> this$0;

        @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/activity/result/o00oo00O$o00oOOo0$o00oOOo0", "Lo00oOo00/o00oOOo0;", "Lo0OO0o/oO0Ooooo;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "(Landroid/content/Context;Lo0OO0o/oO0Ooooo;)Landroid/content/Intent;", "", "resultCode", "intent", "o00oOo00", "(ILandroid/content/Intent;)Ljava/lang/Object;", "activity-ktx_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: androidx.activity.result.o00oo00O$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0003o00oOOo0 extends o00oOo00.o00oOOo0<oO0Ooooo, O> {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final /* synthetic */ o00oo00O<I, O> f118o00oOOo0;

            public C0003o00oOOo0(o00oo00O<I, O> o00oo00o) {
                this.f118o00oOOo0 = o00oo00o;
            }

            @Override // o00oOo00.o00oOOo0
            public O o00oOo00(int i, @Nullable Intent intent) {
                return this.f118o00oOOo0.f115o00oOOoO.o00oOo00(i, intent);
            }

            @Override // o00oOo00.o00oOOo0
            @NotNull
            /* renamed from: o00oOooO */
            public Intent o00oOOo0(@NotNull Context context, @NotNull oO0Ooooo oo0ooooo) {
                o0ooO.o00oo0O0(context, "context");
                o0ooO.o00oo0O0(oo0ooooo, "input");
                o00oo00O<I, O> o00oo00o = this.f118o00oOOo0;
                return o00oo00o.f115o00oOOoO.o00oOOo0(context, o00oo00o.f116o00oOo00);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(o00oo00O<I, O> o00oo00o) {
            super(0);
            this.this$0 = o00oo00o;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final C0003o00oOOo0 invoke() {
            return new C0003o00oOOo0(this.this$0);
        }
    }

    public o00oo00O(@NotNull o00oo0OO<I> o00oo0oo, @NotNull o00oOo00.o00oOOo0<I, O> o00oooo02, I i) {
        o0ooO.o00oo0O0(o00oo0oo, "launcher");
        o0ooO.o00oo0O0(o00oooo02, "callerContract");
        this.f114o00oOOo0 = o00oo0oo;
        this.f115o00oOOoO = o00oooo02;
        this.f116o00oOo00 = i;
        this.f117o00oOooO = o0O00oO0.o00oOo00(new o00oOOo0(this));
    }

    @Override // androidx.activity.result.o00oo0OO
    @NotNull
    public o00oOo00.o00oOOo0<oO0Ooooo, ?> o00oOOo0() {
        return (o00oOo00.o00oOOo0<oO0Ooooo, O>) o00oOoO();
    }

    @NotNull
    public final o00oOo00.o00oOOo0<I, O> o00oOo0O() {
        return this.f115o00oOOoO;
    }

    public final I o00oOo0o() {
        return this.f116o00oOo00;
    }

    @NotNull
    public final o00oOo00.o00oOOo0<oO0Ooooo, O> o00oOoO() {
        return (o00oOo00.o00oOOo0) this.f117o00oOooO.getValue();
    }

    @NotNull
    public final o00oo0OO<I> o00oOoO0() {
        return this.f114o00oOOo0;
    }

    @Override // androidx.activity.result.o00oo0OO
    /* renamed from: o00oOoOO */
    public void o00oOo00(@NotNull oO0Ooooo oo0ooooo, @Nullable oO000OOo oo000ooo) {
        o0ooO.o00oo0O0(oo0ooooo, "input");
        this.f114o00oOOo0.o00oOo00(this.f116o00oOo00, oo000ooo);
    }

    @Override // androidx.activity.result.o00oo0OO
    public void o00oOooO() {
        this.f114o00oOOo0.o00oOooO();
    }
}
