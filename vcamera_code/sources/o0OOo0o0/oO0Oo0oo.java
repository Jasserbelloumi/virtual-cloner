package o0OOo0o0;

import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u001a\u0010\u0007\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"", "propertyName", o00oOOoO.f12961o00oOo00, "", "o00oOOo0", "I", "()I", "AVAILABLE_PROCESSORS", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class oO0Oo0oo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f14661o00oOOo0 = Runtime.getRuntime().availableProcessors();

    public static final int o00oOOo0() {
        return f14661o00oOOo0;
    }

    @Nullable
    public static final String o00oOOoO(@NotNull String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
