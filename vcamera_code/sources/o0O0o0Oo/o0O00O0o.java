package o0O0o0Oo;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import java.util.List;
import o00oOooO.oo0oO0;
import o0O0OO.o00oOOoO;
import o0O0OO.o0O0oo0o;
import o0O0Ooo0.o0OoO00O;
import o0O0o0Oo.o0OoO00O;
@o00oOOoO
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public interface o0O00O0o {
    @o0O0OO.o0O000o0("DELETE FROM workspec WHERE id=:id")
    void o00oOOo0(String str);

    @o0O0OO.o0O000o0("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
    void o00oOOoO();

    @o0O0OO.o0O000o0("SELECT * FROM workspec WHERE period_start_time >= :startingAt AND state IN (2, 3, 5) ORDER BY period_start_time DESC")
    List<o0OoO00O> o00oOo00(long j);

    @o0O0OO.o0O000o0("SELECT * FROM workspec WHERE id IN (:ids)")
    o0OoO00O[] o00oOo0O(List<String> list);

    @o0O0OO.o0O000o0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<String> o00oOo0o(@oo0oO0 String str);

    @o0O0OO.o0O000o0("SELECT state FROM workspec WHERE id=:id")
    o0OoO00O.o00oOOo0 o00oOoO(String str);

    @o0O0oo0o
    @o0O0OO.o0O000o0("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=:id")
    o0OoO00O.o00oOo00 o00oOoO0(String str);

    @o0O0OO.o0O000o0("SELECT * FROM workspec WHERE id=:id")
    o0OoO00O o00oOoOO(String str);

    @o0O0OO.o0O000o0("SELECT schedule_requested_at FROM workspec WHERE id=:id")
    LiveData<Long> o00oOoOo(@oo0oO0 String str);

    @o0O0OO.o0O000o0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    List<String> o00oOoo0(@oo0oO0 String str);

    @o0O0OO.o0O000o0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    List<o0OoO00O> o00oOooO();

    @o0O0OO.o0O000o0("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    List<androidx.work.o00oOOoO> o00oOooo(String str);

    @o0O0oo0o
    @o0O0OO.o0O000o0("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    LiveData<List<o0OoO00O.o00oOo00>> o00oo(String str);

    @o0O0OO.o0O000o0("SELECT * FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT :maxLimit")
    List<o0OoO00O> o00oo0(int i);

    @o0O0oo0o
    @o0O0OO.o0O000o0("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<o0OoO00O.o00oOo00> o00oo00O(String str);

    @o0O0OO.o0O000o0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<o0OoO00O.o00oOOoO> o00oo0O(String str);

    @o0O0OO.o0O000o0("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int o00oo0O0(@oo0oO0 String str, long j);

    @o0O0OO.o0O000o0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int o00oo0OO();

    @o0O0OO.o0O000o0("UPDATE workspec SET state=:state WHERE id IN (:ids)")
    int o00oo0Oo(o0OoO00O.o00oOOo0 o00oooo02, String... strArr);

    @o0O0OO.o0O0000O(onConflict = 5)
    void o00oo0o(o0OoO00O o0ooo00o);

    @o0O0OO.o0O000o0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))")
    List<o0OoO00O> o00oo0o0(int i);

    @o0O0OO.o0O000o0("UPDATE workspec SET output=:output WHERE id=:id")
    void o00oo0oO(String str, androidx.work.o00oOOoO o00ooooo2);

    @o0O0OO.o0O000o0("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int o00ooO(String str);

    @o0O0oo0o
    @o0O0OO.o0O000o0("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    LiveData<List<o0OoO00O.o00oOo00>> o00ooO0(String str);

    @o0O0OO.o0O000o0("SELECT * FROM workspec WHERE state=1")
    List<o0OoO00O> o00ooO00();

    @o0O0OO.o0O000o0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    List<String> o00ooO0O();

    @o0O0OO.o0O000o0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")
    boolean o00ooO0o();

    @o0O0oo0o
    @o0O0OO.o0O000o0("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (:ids)")
    LiveData<List<o0OoO00O.o00oOo00>> o00ooOO(List<String> list);

    @o0O0oo0o
    @o0O0OO.o0O000o0("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    List<o0OoO00O.o00oOo00> o00ooOO0(String str);

    @o0O0OO.o0O000o0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int o00ooOOo(String str);

    @o0O0oo0o
    @o0O0OO.o0O000o0("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (:ids)")
    List<o0OoO00O.o00oOo00> o00ooOo(List<String> list);

    @o0O0OO.o0O000o0("UPDATE workspec SET period_start_time=:periodStartTime WHERE id=:id")
    void o00ooOo0(String str, long j);

    @o0O0OO.o0O000o0("SELECT id FROM workspec")
    List<String> o00ooOoO();

    @o0O0oo0o
    @o0O0OO.o0O000o0("SELECT id FROM workspec")
    LiveData<List<String>> o0O0o();
}
