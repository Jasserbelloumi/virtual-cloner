package o0O0o0Oo;

import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0OO.o00oOOoO;
@o00oOOoO
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public interface o0O00 {
    @o0O0OO.o0O000o0("DELETE from WorkProgress where work_spec_id=:workSpecId")
    void o00oOOo0(@oo0oO0 String str);

    @o0O0OO.o0O0000O(onConflict = 1)
    void o00oOOoO(@oo0oO0 o0O000o0 o0o000o0);

    @o0OO00OO
    @o0O0OO.o0O000o0("SELECT progress FROM WorkProgress WHERE work_spec_id=:workSpecId")
    androidx.work.o00oOOoO o00oOo00(@oo0oO0 String str);

    @oo0oO0
    @o0O0OO.o0O000o0("SELECT progress FROM WorkProgress WHERE work_spec_id IN (:workSpecIds)")
    List<androidx.work.o00oOOoO> o00oOo0O(@oo0oO0 List<String> list);

    @o0O0OO.o0O000o0("DELETE FROM WorkProgress")
    void o00oOooO();
}
