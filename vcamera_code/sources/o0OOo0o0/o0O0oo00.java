package o0OOo0o0;

import androidx.concurrent.futures.o00oOo00;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOo00O.oO0o0o
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u0006R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lo0OOo0o0/o0O0oo00;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0o0/oO00000o;", "", "decision", "o00oOo0O", "(Ljava/lang/Object;)Ljava/lang/Object;", "affected", "o00oOoOO", "failure", "Lo0OO0o/oO0Ooooo;", "o00oOooO", "(Ljava/lang/Object;Ljava/lang/Object;)V", "o00oOo00", "o00oOo0o", "()Ljava/lang/Object;", "consensus", "", "o00oOoO", "()Z", "isDecided", "", "o00oOoO0", "()J", "opSequence", "o00oOOo0", "()Lo0OOo0o0/o0O0oo00;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class o0O0oo00<T> extends oO00000o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14572o00oOOo0 = AtomicReferenceFieldUpdater.newUpdater(o0O0oo00.class, Object.class, "_consensus");
    @NotNull
    private volatile /* synthetic */ Object _consensus = oooOO0.f14678o00oOOo0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0OOo0o0.oO00000o
    @NotNull
    public o0O0oo00<?> o00oOOo0() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0OOo0o0.oO00000o
    @Nullable
    public final Object o00oOo00(@Nullable Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == oooOO0.f14678o00oOOo0) {
            obj2 = o00oOo0O(o00oOoOO(obj));
        }
        o00oOooO(obj, obj2);
        return obj2;
    }

    @Nullable
    public final Object o00oOo0O(@Nullable Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = oooOO0.f14678o00oOOo0;
        return obj2 != obj3 ? obj2 : o00oOo00.o00oOOo0(f14572o00oOOo0, this, obj3, obj) ? obj : this._consensus;
    }

    @Nullable
    public final Object o00oOo0o() {
        return this._consensus;
    }

    public final boolean o00oOoO() {
        return this._consensus != oooOO0.f14678o00oOOo0;
    }

    public long o00oOoO0() {
        return 0L;
    }

    @Nullable
    public abstract Object o00oOoOO(T t);

    public abstract void o00oOooO(T t, @Nullable Object obj);
}
