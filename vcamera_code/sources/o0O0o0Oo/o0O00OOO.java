package o0O0o0Oo;

import java.util.List;
import o0O0OO.o00oOOoO;
@o00oOOoO
/* loaded from: classes.dex */
public interface o0O00OOO {
    @o0O0OO.o0O000o0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    List<String> o00oOOo0(String str);

    @o0O0OO.o0O0000O(onConflict = 5)
    void o00oOOoO(o0O00OO o0o00oo);

    @o0O0OO.o0O000o0("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    List<String> o00oOo00(String str);
}
