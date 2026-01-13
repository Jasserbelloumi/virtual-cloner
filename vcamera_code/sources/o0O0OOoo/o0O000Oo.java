package o0O0OOoo;

import android.database.sqlite.SQLiteProgram;
import o0O0OOoO.o00ooO;
/* loaded from: classes.dex */
public class o0O000Oo implements o00ooO {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final SQLiteProgram f11559o00oo0O0;

    public o0O000Oo(SQLiteProgram sQLiteProgram) {
        this.f11559o00oo0O0 = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11559o00oo0O0.close();
    }

    @Override // o0O0OOoO.o00ooO
    public void o00ooO(int i, double d) {
        this.f11559o00oo0O0.bindDouble(i, d);
    }

    @Override // o0O0OOoO.o00ooO
    public void o0O0O0O(int i, String str) {
        this.f11559o00oo0O0.bindString(i, str);
    }

    @Override // o0O0OOoO.o00ooO
    public void o0O0OOOo(int i, long j) {
        this.f11559o00oo0O0.bindLong(i, j);
    }

    @Override // o0O0OOoO.o00ooO
    public void o0O0o00(int i) {
        this.f11559o00oo0O0.bindNull(i);
    }

    @Override // o0O0OOoO.o00ooO
    public void o0O0oO() {
        this.f11559o00oo0O0.clearBindings();
    }

    @Override // o0O0OOoO.o00ooO
    public void o0OooO0(int i, byte[] bArr) {
        this.f11559o00oo0O0.bindBlob(i, bArr);
    }
}
