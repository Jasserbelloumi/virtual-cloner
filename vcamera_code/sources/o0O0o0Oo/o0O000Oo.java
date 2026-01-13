package o0O0o0Oo;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import o0O0OOOo.o00oOo00;
/* loaded from: classes.dex */
public final class o0O000Oo implements o0OoOoOo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0OO.o0O00O0o f12393o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0OO.o00oo0O<o0O000O> f12394o00oOOoO;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O0OO.o00oo0O<o0O000O> {
        public o00oOOo0(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // o0O0OO.o00oo0O
        /* renamed from: o00oo0Oo */
        public void o00oOoO0(o0O0OOoO.o0O0000O o0o0000o, o0O000O o0o000o) {
            String str = o0o000o.f12391o00oOOo0;
            if (str == null) {
                o0o0000o.o0O0o00(1);
            } else {
                o0o0000o.o0O0O0O(1, str);
            }
            String str2 = o0o000o.f12392o00oOOoO;
            if (str2 == null) {
                o0o0000o.o0O0o00(2);
            } else {
                o0o0000o.o0O0O0O(2, str2);
            }
        }
    }

    public o0O000Oo(o0O0OO.o0O00O0o o0o00o0o) {
        this.f12393o00oOOo0 = o0o00o0o;
        this.f12394o00oOOoO = new o00oOOo0(o0o00o0o);
    }

    @Override // o0O0o0Oo.o0OoOoOo
    public void o00oOOo0(o0O000O o0o000o) {
        this.f12393o00oOOo0.o00oOOoO();
        this.f12393o00oOOo0.o00oOo00();
        try {
            this.f12394o00oOOoO.o00oOoOO(o0o000o);
            this.f12393o00oOOo0.o00ooO0o();
        } finally {
            this.f12393o00oOOo0.o00oOoOO();
        }
    }

    @Override // o0O0o0Oo.o0OoOoOo
    public List<String> o00oOOoO(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12393o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o00oOo00.o00oOooO(this.f12393o00oOOo0, o00oOo0o2, false, null);
        try {
            ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
            while (o00oOooO2.moveToNext()) {
                arrayList.add(o00oOooO2.getString(0));
            }
            return arrayList;
        } finally {
            o00oOooO2.close();
            o00oOo0o2.release();
        }
    }

    @Override // o0O0o0Oo.o0OoOoOo
    public List<String> o00oOo00(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT work_spec_id FROM workname WHERE name=?", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12393o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o00oOo00.o00oOooO(this.f12393o00oOOo0, o00oOo0o2, false, null);
        try {
            ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
            while (o00oOooO2.moveToNext()) {
                arrayList.add(o00oOooO2.getString(0));
            }
            return arrayList;
        } finally {
            o00oOooO2.close();
            o00oOo0o2.release();
        }
    }
}
