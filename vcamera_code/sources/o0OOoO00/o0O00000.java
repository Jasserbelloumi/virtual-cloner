package o0OOoO00;

import android.support.v4.media.o00oOo0O;
import com.google.common.util.concurrent.o00oOOo0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import o0OOo0o0.oO000O0;
import o0OOo0o0.oO0o0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\t\u0010\nJ,\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lo0OOoO00/o0O00000;", "Lo0OOo0o0/oO000O0;", "", FirebaseAnalytics.Param.INDEX, "", "o00oo0oO", "(I)Ljava/lang/Object;", "value", "Lo0OO0o/oO0Ooooo;", "o00oo", "(ILjava/lang/Object;)V", "expected", "", "o00oo0o", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "o0O0o", "(ILjava/lang/Object;)Ljava/lang/Object;", "o00oo0o0", "(I)V", "", "toString", "()Ljava/lang/String;", "o00oo0O0", "()I", "maxSlots", "", "id", "prev", "pointers", "<init>", "(JLo0OOoO00/o0O00000;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0O00000 extends oO000O0<o0O00000> {
    @NotNull

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f14810o00oOo0O;

    public o0O00000(long j, @Nullable o0O00000 o0o00000, int i) {
        super(j, o0o00000, i);
        int i2;
        i2 = o0.f14792o00oOo0o;
        this.f14810o00oOo0O = new AtomicReferenceArray(i2);
    }

    public final void o00oo(int i, @Nullable Object obj) {
        this.f14810o00oOo0O.set(i, obj);
    }

    @Override // o0OOo0o0.oO000O0
    public int o00oo0O0() {
        int i;
        i = o0.f14792o00oOo0o;
        return i;
    }

    public final boolean o00oo0o(int i, @Nullable Object obj, @Nullable Object obj2) {
        return o00oOOo0.o00oOOo0(this.f14810o00oOo0O, i, obj, obj2);
    }

    public final void o00oo0o0(int i) {
        oO0o0o oo0o0o;
        oo0o0o = o0.f14791o00oOo0O;
        this.f14810o00oOo0O.set(i, oo0o0o);
        o00oo0O();
    }

    @Nullable
    public final Object o00oo0oO(int i) {
        return this.f14810o00oOo0O.get(i);
    }

    @Nullable
    public final Object o0O0o(int i, @Nullable Object obj) {
        return this.f14810o00oOo0O.getAndSet(i, obj);
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("SemaphoreSegment[id=");
        o00oOOo02.append(this.f14647o00oOo00);
        o00oOOo02.append(", hashCode=");
        o00oOOo02.append(hashCode());
        o00oOOo02.append(']');
        return o00oOOo02.toString();
    }
}
