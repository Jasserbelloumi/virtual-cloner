package o0OOo0OO;

import androidx.concurrent.futures.o00oOo00;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO0o.oo0oO0;
import o0OOO0.o00oo0OO;
import o0OOO00o.o00oOOo0;
import o0OOOOO0.o0ooO;
import o0OOo00O.o0O00;
import o0OOo0Oo.oO00OO;
import o0OOo0Oo.oO00OO0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lo0OOo0OO/oO0O0OoO;", "Lo0OOo0Oo/oO00OO;", "Lo0OOo0OO/oO000Oo;", "flow", "", "o00oOo00", "(Lo0OOo0OO/oO000Oo;)Z", "", "Lo0OO/o00oOo0O;", "Lo0OO0o/oO0Ooooo;", "o00oOo0O", "(Lo0OOo0OO/oO000Oo;)[Lo0OO/o00oOo0O;", "o00oOo0o", "()V", "o00oOoO0", "()Z", "o00oOooO", "(Lo0OO/o00oOo0O;)Ljava/lang/Object;", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0O0OoO extends oO00OO<oO000Oo<?>> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14481o00oOOo0 = AtomicReferenceFieldUpdater.newUpdater(oO0O0OoO.class, Object.class, "_state");
    @NotNull
    public volatile /* synthetic */ Object _state = null;

    @Override // o0OOo0Oo.oO00OO
    public o00oOo0O[] o00oOOoO(oO000Oo<?> oo000oo) {
        this._state = null;
        return oO00OO0O.f14521o00oOOo0;
    }

    @Override // o0OOo0Oo.oO00OO
    /* renamed from: o00oOo00 */
    public boolean o00oOOo0(@NotNull oO000Oo<?> oo000oo) {
        o0OOo0o0.oO0o0o oo0o0o;
        if (this._state != null) {
            return false;
        }
        oo0o0o = oO000o00.f14475o00oOOo0;
        this._state = oo0o0o;
        return true;
    }

    @NotNull
    public o00oOo0O<o0OO0o.oO0Ooooo>[] o00oOo0O(@NotNull oO000Oo<?> oo000oo) {
        this._state = null;
        return oO00OO0O.f14521o00oOOo0;
    }

    public final void o00oOo0o() {
        o0OOo0o0.oO0o0o oo0o0o;
        while (true) {
            Object obj = this._state;
            if (obj == null) {
                return;
            }
            oo0o0o = oO000o00.f14476o00oOOoO;
            if (obj == oo0o0o) {
                return;
            }
            o0OOo0o0.oO0o0o oo0o0o2 = oO000o00.f14475o00oOOo0;
            if (obj == oo0o0o2) {
                if (o00oOo00.o00oOOo0(f14481o00oOOo0, this, obj, oO000o00.f14476o00oOOoO)) {
                    return;
                }
            } else if (o00oOo00.o00oOOo0(f14481o00oOOo0, this, obj, oo0o0o2)) {
                oo0oO0.o00oOOo0 o00oooo02 = o0OO0o.oo0oO0.Companion;
                ((o0O00) obj).resumeWith(o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oO0Ooooo.f13240o00oOOo0));
                return;
            }
        }
    }

    public final boolean o00oOoO0() {
        o0OOo0o0.oO0o0o oo0o0o;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14481o00oOOo0;
        oo0o0o = oO000o00.f14475o00oOOo0;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, oo0o0o);
        o0ooO.o00oo00O(andSet);
        return andSet == oO000o00.f14476o00oOOoO;
    }

    @Nullable
    public final Object o00oOooO(@NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        o0OOo0o0.oO0o0o oo0o0o;
        o0O00 o0o00 = new o0O00(o0OOO00o.o00oOo00.o00oOooO(o00ooo0o2), 1);
        o0o00.o00ooo00();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14481o00oOOo0;
        oo0o0o = oO000o00.f14475o00oOOo0;
        if (!o00oOo00.o00oOOo0(atomicReferenceFieldUpdater, this, oo0o0o, o0o00)) {
            oo0oO0.o00oOOo0 o00oooo02 = o0OO0o.oo0oO0.Companion;
            o0o00.resumeWith(o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oO0Ooooo.f13240o00oOOo0));
        }
        Object o00ooO002 = o0o00.o00ooO00();
        o00oOOo0 o00oooo03 = o00oOOo0.COROUTINE_SUSPENDED;
        if (o00ooO002 == o00oooo03) {
            o00oo0OO.o00oOo00(o00ooo0o2);
        }
        return o00ooO002 == o00oooo03 ? o00ooO002 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
    }
}
