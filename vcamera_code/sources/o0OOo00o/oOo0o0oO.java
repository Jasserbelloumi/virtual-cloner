package o0OOo00o;

import android.os.Looper;
import java.util.List;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOo00O.oO00OO;
import o0OOo0o0.o0o0000;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lo0OOo00o/oOo0o0oO;", "Lo0OOo0o0/o0o0000;", "", "allFactories", "Lo0OOo00O/oO00OO;", o00oOOoO.f12961o00oOo00, "", "o00oOOo0", "", "o00oOo00", "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oOo0o0oO implements o0o0000 {
    @Override // o0OOo0o0.o0o0000
    @NotNull
    public String o00oOOo0() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // o0OOo0o0.o0o0000
    @NotNull
    public oO00OO o00oOOoO(@NotNull List<? extends o0o0000> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new ooo0o(oO0OO0O.o00oOooO(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // o0OOo0o0.o0o0000
    public int o00oOo00() {
        return 1073741823;
    }
}
