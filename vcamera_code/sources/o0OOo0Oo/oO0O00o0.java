package o0OOo0Oo;

import kotlin.Metadata;
import o0OOo0O0.o0O000;
import o0OOo0OO.oO000O0;
import o0OOo0OO.oO000Oo0;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lo0OOo0Oo/oO0O00o0;", "Lo0OOo0OO/oO000Oo0;", "", "Lo0OOo0OO/oO000O0;", "delta", "", "o0O000oo", "o0ooOoOO", "()Ljava/lang/Integer;", "value", "initialValue", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0O00o0 extends oO000O0<Integer> implements oO000Oo0<Integer> {
    public oO0O00o0(int i) {
        super(1, Integer.MAX_VALUE, o0O000.DROP_OLDEST);
        o00oOOoO(Integer.valueOf(i));
    }

    public final boolean o0O000oo(int i) {
        boolean o00oOOoO2;
        synchronized (this) {
            o00oOOoO2 = o00oOOoO(Integer.valueOf(o00oooo().intValue() + i));
        }
        return o00oOOoO2;
    }

    @Override // o0OOo0OO.oO000Oo0
    @NotNull
    /* renamed from: o0ooOoOO */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(o00oooo().intValue());
        }
        return valueOf;
    }
}
