package o0O0Ooo0;

import androidx.work.o00oOOoO;
import java.util.List;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class o00ooO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f12166o00oOOo0 = o0O00000.o00oOo0o("InputMerger");

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static o00ooO o00oOOo0(String str) {
        try {
            return (o00ooO) Class.forName(str).newInstance();
        } catch (Exception e) {
            o0O00000.o00oOo00().o00oOOoO(f12166o00oOOo0, o00oOoOo.o00oo.o00oOOo0("Trouble instantiating + ", str), e);
            return null;
        }
    }

    @oo0oO0
    public abstract o00oOOoO o00oOOoO(@oo0oO0 List<o00oOOoO> list);
}
