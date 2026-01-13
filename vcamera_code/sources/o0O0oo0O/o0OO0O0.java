package o0O0oo0O;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import o0OOOOO0.o0O00;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lo0O0oo0O/o0OO0O0;", "", "", FirebaseAnalytics.Param.INDEX, "I", "getIndex", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "o00oOOo0", "POSITIVE", "NEGATIVE", "NEUTRAL", "core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public enum o0OO0O0 {
    POSITIVE(0),
    NEGATIVE(1),
    NEUTRAL(2);
    
    public static final o00oOOo0 Companion = new o00oOOo0(null);
    private final int index;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lo0O0oo0O/o0OO0O0$o00oOOo0;", "", "", FirebaseAnalytics.Param.INDEX, "Lo0O0oo0O/o0OO0O0;", "o00oOOo0", "<init>", "()V", "core"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @NotNull
        public final o0OO0O0 o00oOOo0(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return o0OO0O0.NEUTRAL;
                    }
                    throw new IndexOutOfBoundsException(i + " is not an action button index.");
                }
                return o0OO0O0.NEGATIVE;
            }
            return o0OO0O0.POSITIVE;
        }
    }

    o0OO0O0(int i) {
        this.index = i;
    }

    public final int getIndex() {
        return this.index;
    }
}
