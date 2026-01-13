package o0O0o0Oo;

import java.util.List;
import o00oOooO.oo0oO0;
import o0O0OO.o00oOOoO;
@o00oOOoO
/* loaded from: classes.dex */
public interface o0OoOoOo {
    @o0O0OO.o0O0000O(onConflict = 5)
    void o00oOOo0(o0O000O o0o000o);

    @oo0oO0
    @o0O0OO.o0O000o0("SELECT name FROM workname WHERE work_spec_id=:workSpecId")
    List<String> o00oOOoO(@oo0oO0 String str);

    @o0O0OO.o0O000o0("SELECT work_spec_id FROM workname WHERE name=:name")
    List<String> o00oOo00(String str);
}
