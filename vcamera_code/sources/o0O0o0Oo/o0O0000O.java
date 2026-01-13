package o0O0o0Oo;

import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OO.o00oOOoO;
@o00oOOoO
/* loaded from: classes.dex */
public interface o0O0000O {
    @o0O0OO.o0O0000O(onConflict = 1)
    void o00oOOo0(@oo0oO0 o0O00000 o0o00000);

    @o0OO00OO
    @o0O0OO.o0O000o0("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId")
    o0O00000 o00oOOoO(@oo0oO0 String str);

    @oo0oO0
    @o0O0OO.o0O000o0("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    List<String> o00oOo00();

    @o0O0OO.o0O000o0("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void o00oOooO(@oo0oO0 String str);
}
