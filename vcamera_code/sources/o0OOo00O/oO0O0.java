package o0OOo00O;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lo0OOo00O/oO0O0;", "U", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0o0/oO000;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lo0OO0o/oO0Ooooo;", "run", "", "o0O0Oo0o", "()Ljava/lang/String;", "", "o00oo0o0", "J", "time", "Lo0OO/o00oOo0O;", "uCont", "<init>", "(JLo0OO/o00oOo0O;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0O0<U, T extends U> extends o0OOo0o0.oO000<T> implements Runnable {
    @o0OOOO0o.o00oOoO

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final long f14093o00oo0o0;

    public oO0O0(long j, @NotNull o00oOo0O<? super U> o00ooo0o2) {
        super(o00ooo0o2.getContext(), o00ooo0o2);
        this.f14093o00oo0o0 = j;
    }

    @Override // o0OOo00O.o00oOoO, o0OOo00O.oOo00OO0
    @NotNull
    public String o0O0Oo0o() {
        return oo0ooO.o00oOOo0(this) + "(timeMillis=" + this.f14093o00oo0o0 + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        o0OoOoOO(oO0O0O00.o00oOOo0(this.f14093o00oo0o0, this));
    }
}
