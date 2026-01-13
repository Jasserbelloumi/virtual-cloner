package o0O0o0Oo;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import o0O0OO.o0O0O0O;
import o0O0OOOo.o00oo0;
/* loaded from: classes.dex */
public final class o0O00O0 implements o0O00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0OO.o0O00O0o f12427o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0OO.o00oo0O<o0O000o0> f12428o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0O0O0O f12429o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0O0O0O f12430o00oOooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O0OO.o00oo0O<o0O000o0> {
        public o00oOOo0(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // o0O0OO.o00oo0O
        /* renamed from: o00oo0Oo */
        public void o00oOoO0(o0O0OOoO.o0O0000O o0o0000o, o0O000o0 o0o000o0) {
            String str = o0o000o0.f12396o00oOOo0;
            if (str == null) {
                o0o0000o.o0O0o00(1);
            } else {
                o0o0000o.o0O0O0O(1, str);
            }
            byte[] o00ooOo02 = androidx.work.o00oOOoO.o00ooOo0(o0o000o0.f12397o00oOOoO);
            if (o00ooOo02 == null) {
                o0o0000o.o0O0o00(2);
            } else {
                o0o0000o.o0OooO0(2, o00ooOo02);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o0O0O0O {
        public o00oOOoO(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends o0O0O0O {
        public o00oOo00(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o0O00O0(o0O0OO.o0O00O0o o0o00o0o) {
        this.f12427o00oOOo0 = o0o00o0o;
        this.f12428o00oOOoO = new o00oOOo0(o0o00o0o);
        this.f12429o00oOo00 = new o00oOOoO(o0o00o0o);
        this.f12430o00oOooO = new o00oOo00(o0o00o0o);
    }

    @Override // o0O0o0Oo.o0O00
    public void o00oOOo0(String str) {
        this.f12427o00oOOo0.o00oOOoO();
        o0O0OOoO.o0O0000O o00oOOo02 = this.f12429o00oOo00.o00oOOo0();
        if (str == null) {
            o00oOOo02.o0O0o00(1);
        } else {
            o00oOOo02.o0O0O0O(1, str);
        }
        this.f12427o00oOOo0.o00oOo00();
        try {
            o00oOOo02.o00oo0oO();
            this.f12427o00oOOo0.o00ooO0o();
        } finally {
            this.f12427o00oOOo0.o00oOoOO();
            this.f12429o00oOo00.o00oOo0o(o00oOOo02);
        }
    }

    @Override // o0O0o0Oo.o0O00
    public void o00oOOoO(o0O000o0 o0o000o0) {
        this.f12427o00oOOo0.o00oOOoO();
        this.f12427o00oOOo0.o00oOo00();
        try {
            this.f12428o00oOOoO.o00oOoOO(o0o000o0);
            this.f12427o00oOOo0.o00ooO0o();
        } finally {
            this.f12427o00oOOo0.o00oOoOO();
        }
    }

    @Override // o0O0o0Oo.o0O00
    public androidx.work.o00oOOoO o00oOo00(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12427o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12427o00oOOo0, o00oOo0o2, false, null);
        try {
            return o00oOooO2.moveToFirst() ? androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(0)) : null;
        } finally {
            o00oOooO2.close();
            o00oOo0o2.release();
        }
    }

    @Override // o0O0o0Oo.o0O00
    public List<androidx.work.o00oOOoO> o00oOo0O(List<String> list) {
        StringBuilder o00oOo002 = o00oo0.o00oOo00();
        o00oOo002.append("SELECT progress FROM WorkProgress WHERE work_spec_id IN (");
        int size = list.size();
        o00oo0.o00oOOo0(o00oOo002, size);
        o00oOo002.append(")");
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o(o00oOo002.toString(), size + 0);
        int i = 1;
        for (String str : list) {
            if (str == null) {
                o00oOo0o2.o0O0o00(i);
            } else {
                o00oOo0o2.o0O0O0O(i, str);
            }
            i++;
        }
        this.f12427o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12427o00oOOo0, o00oOo0o2, false, null);
        try {
            ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
            while (o00oOooO2.moveToNext()) {
                arrayList.add(androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(0)));
            }
            return arrayList;
        } finally {
            o00oOooO2.close();
            o00oOo0o2.release();
        }
    }

    @Override // o0O0o0Oo.o0O00
    public void o00oOooO() {
        this.f12427o00oOOo0.o00oOOoO();
        o0O0OOoO.o0O0000O o00oOOo02 = this.f12430o00oOooO.o00oOOo0();
        this.f12427o00oOOo0.o00oOo00();
        try {
            o00oOOo02.o00oo0oO();
            this.f12427o00oOOo0.o00ooO0o();
        } finally {
            this.f12427o00oOOo0.o00oOoOO();
            this.f12430o00oOooO.o00oOo0o(o00oOOo02);
        }
    }
}
