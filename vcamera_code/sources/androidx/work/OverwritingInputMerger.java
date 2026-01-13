package androidx.work;

import androidx.work.o00oOOoO;
import java.util.HashMap;
import java.util.List;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o00ooO;
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends o00ooO {
    @Override // o0O0Ooo0.o00ooO
    @oo0oO0
    public o00oOOoO o00oOOoO(@oo0oO0 List<o00oOOoO> list) {
        o00oOOoO.o00oOOo0 o00oooo02 = new o00oOOoO.o00oOOo0();
        HashMap hashMap = new HashMap();
        for (o00oOOoO o00ooooo2 : list) {
            hashMap.putAll(o00ooooo2.o00ooO00());
        }
        o00oooo02.o00oOooO(hashMap);
        return o00oooo02.o00oOOo0();
    }
}
