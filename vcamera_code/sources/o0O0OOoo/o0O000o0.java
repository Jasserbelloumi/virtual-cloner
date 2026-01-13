package o0O0OOoo;

import android.database.sqlite.SQLiteStatement;
import o0O0OOoO.o0O0000O;
/* loaded from: classes.dex */
public class o0O000o0 extends o0O000Oo implements o0O0000O {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final SQLiteStatement f11560o00oo0O;

    public o0O000o0(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f11560o00oo0O = sQLiteStatement;
    }

    @Override // o0O0OOoO.o0O0000O
    public void execute() {
        this.f11560o00oo0O.execute();
    }

    @Override // o0O0OOoO.o0O0000O
    public int o00oo0oO() {
        return this.f11560o00oo0O.executeUpdateDelete();
    }

    @Override // o0O0OOoO.o0O0000O
    public String o00oooo() {
        return this.f11560o00oo0O.simpleQueryForString();
    }

    @Override // o0O0OOoO.o0O0000O
    public long o0O00OO() {
        return this.f11560o00oo0O.executeInsert();
    }

    @Override // o0O0OOoO.o0O0000O
    public long o0O00o00() {
        return this.f11560o00oo0O.simpleQueryForLong();
    }
}
