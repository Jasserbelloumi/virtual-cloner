package o0O0o0Oo;

import java.util.List;
import o0O0OO.o00oOOoO;
@o00oOOoO
/* loaded from: classes.dex */
public interface o00oo0O0 {
    @o0O0OO.o0O000o0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
    List<String> o00oOOo0(String str);

    @o0O0OO.o0O000o0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
    boolean o00oOOoO(String str);

    @o0O0OO.o0O0000O(onConflict = 5)
    void o00oOo00(o00oo0OO o00oo0oo);

    @o0O0OO.o0O000o0("SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id")
    List<String> o00oOo0O(String str);

    @o0O0OO.o0O000o0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
    boolean o00oOooO(String str);
}
