package o0O0o0Oo;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import o0O0OO.o0O0O0O;
import o0O0OOOo.o00oOo00;
/* loaded from: classes.dex */
public final class o0O000 implements o0O0000O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0OO.o0O00O0o f12384o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0OO.o00oo0O<o0O00000> f12385o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0O0O0O f12386o00oOo00;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O0OO.o00oo0O<o0O00000> {
        public o00oOOo0(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // o0O0OO.o00oo0O
        /* renamed from: o00oo0Oo */
        public void o00oOoO0(o0O0OOoO.o0O0000O o0o0000o, o0O00000 o0o00000) {
            String str = o0o00000.f12389o00oOOo0;
            if (str == null) {
                o0o0000o.o0O0o00(1);
            } else {
                o0o0000o.o0O0O0O(1, str);
            }
            o0o0000o.o0O0OOOo(2, o0o00000.f12390o00oOOoO);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o0O0O0O {
        public o00oOOoO(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public o0O000(o0O0OO.o0O00O0o o0o00o0o) {
        this.f12384o00oOOo0 = o0o00o0o;
        this.f12385o00oOOoO = new o00oOOo0(o0o00o0o);
        this.f12386o00oOo00 = new o00oOOoO(o0o00o0o);
    }

    @Override // o0O0o0Oo.o0O0000O
    public void o00oOOo0(o0O00000 o0o00000) {
        this.f12384o00oOOo0.o00oOOoO();
        this.f12384o00oOOo0.o00oOo00();
        try {
            this.f12385o00oOOoO.o00oOoOO(o0o00000);
            this.f12384o00oOOo0.o00ooO0o();
        } finally {
            this.f12384o00oOOo0.o00oOoOO();
        }
    }

    @Override // o0O0o0Oo.o0O0000O
    public o0O00000 o00oOOoO(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12384o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o00oOo00.o00oOooO(this.f12384o00oOOo0, o00oOo0o2, false, null);
        try {
            return o00oOooO2.moveToFirst() ? new o0O00000(o00oOooO2.getString(o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "work_spec_id")), o00oOooO2.getInt(o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "system_id"))) : null;
        } finally {
            o00oOooO2.close();
            o00oOo0o2.release();
        }
    }

    @Override // o0O0o0Oo.o0O0000O
    public List<String> o00oOo00() {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f12384o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o00oOo00.o00oOooO(this.f12384o00oOOo0, o00oOo0o2, false, null);
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

    @Override // o0O0o0Oo.o0O0000O
    public void o00oOooO(String str) {
        this.f12384o00oOOo0.o00oOOoO();
        o0O0OOoO.o0O0000O o00oOOo02 = this.f12386o00oOo00.o00oOOo0();
        if (str == null) {
            o00oOOo02.o0O0o00(1);
        } else {
            o00oOOo02.o0O0O0O(1, str);
        }
        this.f12384o00oOOo0.o00oOo00();
        try {
            o00oOOo02.o00oo0oO();
            this.f12384o00oOOo0.o00ooO0o();
        } finally {
            this.f12384o00oOOo0.o00oOoOO();
            this.f12386o00oOo00.o00oOo0o(o00oOOo02);
        }
    }
}
