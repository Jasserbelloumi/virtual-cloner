package o0O0o0Oo;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import o0O0OOOo.o00oOo00;
/* loaded from: classes.dex */
public final class o00oo0O implements o00oo0O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0OO.o0O00O0o f12374o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0OO.o00oo0O<o00oo0OO> f12375o00oOOoO;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O0OO.o00oo0O<o00oo0OO> {
        public o00oOOo0(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // o0O0OO.o00oo0O
        /* renamed from: o00oo0Oo */
        public void o00oOoO0(o0O0OOoO.o0O0000O o0o0000o, o00oo0OO o00oo0oo) {
            String str = o00oo0oo.f12377o00oOOo0;
            if (str == null) {
                o0o0000o.o0O0o00(1);
            } else {
                o0o0000o.o0O0O0O(1, str);
            }
            String str2 = o00oo0oo.f12378o00oOOoO;
            if (str2 == null) {
                o0o0000o.o0O0o00(2);
            } else {
                o0o0000o.o0O0O0O(2, str2);
            }
        }
    }

    public o00oo0O(o0O0OO.o0O00O0o o0o00o0o) {
        this.f12374o00oOOo0 = o0o00o0o;
        this.f12375o00oOOoO = new o00oOOo0(o0o00o0o);
    }

    @Override // o0O0o0Oo.o00oo0O0
    public List<String> o00oOOo0(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12374o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o00oOo00.o00oOooO(this.f12374o00oOOo0, o00oOo0o2, false, null);
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

    @Override // o0O0o0Oo.o00oo0O0
    public boolean o00oOOoO(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12374o00oOOo0.o00oOOoO();
        boolean z = false;
        Cursor o00oOooO2 = o00oOo00.o00oOooO(this.f12374o00oOOo0, o00oOo0o2, false, null);
        try {
            if (o00oOooO2.moveToFirst()) {
                z = o00oOooO2.getInt(0) != 0;
            }
            return z;
        } finally {
            o00oOooO2.close();
            o00oOo0o2.release();
        }
    }

    @Override // o0O0o0Oo.o00oo0O0
    public void o00oOo00(o00oo0OO o00oo0oo) {
        this.f12374o00oOOo0.o00oOOoO();
        this.f12374o00oOOo0.o00oOo00();
        try {
            this.f12375o00oOOoO.o00oOoOO(o00oo0oo);
            this.f12374o00oOOo0.o00ooO0o();
        } finally {
            this.f12374o00oOOo0.o00oOoOO();
        }
    }

    @Override // o0O0o0Oo.o00oo0O0
    public List<String> o00oOo0O(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT prerequisite_id FROM dependency WHERE work_spec_id=?", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12374o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o00oOo00.o00oOooO(this.f12374o00oOOo0, o00oOo0o2, false, null);
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

    @Override // o0O0o0Oo.o00oo0O0
    public boolean o00oOooO(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12374o00oOOo0.o00oOOoO();
        boolean z = false;
        Cursor o00oOooO2 = o00oOo00.o00oOooO(this.f12374o00oOOo0, o00oOo0o2, false, null);
        try {
            if (o00oOooO2.moveToFirst()) {
                z = o00oOooO2.getInt(0) != 0;
            }
            return z;
        } finally {
            o00oOooO2.close();
            o00oOo0o2.release();
        }
    }
}
