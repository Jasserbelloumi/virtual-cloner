package o0O0OOoO;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import o00oOooO.o0OOooO0;
/* loaded from: classes.dex */
public interface o00oo extends Closeable {
    long getPageSize();

    int getVersion();

    boolean isOpen();

    void o0();

    int o00oOoOO(String str, String str2, Object[] objArr);

    void o00oOoOo();

    List<Pair<String, String>> o00oo00O();

    void o00oo0O0(String str) throws SQLException;

    @o0OOooO0(api = 16)
    void o00oo0OO();

    boolean o00oo0Oo();

    boolean o00ooo00();

    void o00ooo0O();

    void o00ooo0o(String str, Object[] objArr) throws SQLException;

    void o00oooO();

    long o00oooOO(long j);

    void o00ooooO(SQLiteTransactionListener sQLiteTransactionListener);

    boolean o00ooooo();

    boolean o0O0000O(int i);

    void o0O000Oo(Locale locale);

    String o0O000o();

    boolean o0O00OoO(long j);

    Cursor o0O00o0O(String str, Object[] objArr);

    Cursor o0O00o0o(o0 o0Var);

    void o0O00oO0(int i);

    boolean o0O0O0oo();

    @o0OOooO0(api = 16)
    Cursor o0O0OOO(o0 o0Var, CancellationSignal cancellationSignal);

    @o0OOooO0(api = 16)
    void o0O0OOO0(boolean z);

    long o0O0OOo();

    int o0O0OOoO(String str, int i, ContentValues contentValues, String str2, Object[] objArr);

    boolean o0O0Oo0O();

    Cursor o0O0Oo0o(String str);

    void o0O0o0OO(SQLiteTransactionListener sQLiteTransactionListener);

    boolean o0O0o0Oo();

    void o0O0oO0O(long j);

    @o0OOooO0(api = 16)
    boolean o0O0oo0O();

    o0O0000O o0O0oo0o(String str);

    long oo0OOoo(String str, int i, ContentValues contentValues) throws SQLException;

    void oooOO0(int i);
}
