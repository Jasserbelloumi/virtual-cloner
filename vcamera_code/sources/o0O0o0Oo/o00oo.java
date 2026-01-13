package o0O0o0Oo;

import androidx.lifecycle.LiveData;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OO.o00oOOoO;
@o00oOOoO
/* loaded from: classes.dex */
public interface o00oo {
    @oo0oO0
    @o0O0OO.o0O000o0("SELECT long_value FROM Preference where `key`=:key")
    LiveData<Long> o00oOOo0(@oo0oO0 String str);

    @o0O0OO.o0O0000O(onConflict = 1)
    void o00oOOoO(@oo0oO0 o0O0o o0o0o);

    @o0OO00OO
    @o0O0OO.o0O000o0("SELECT long_value FROM Preference where `key`=:key")
    Long o00oOo00(@oo0oO0 String str);
}
