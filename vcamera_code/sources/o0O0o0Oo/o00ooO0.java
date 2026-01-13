package o0O0o0Oo;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.preference.Preference;
import java.util.concurrent.Callable;
import o0O0OOOo.o00oOo00;
/* loaded from: classes.dex */
public final class o00ooO0 implements o00oo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0OO.o0O00O0o f12379o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0OO.o00oo0O<o0O0o> f12380o00oOOoO;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O0OO.o00oo0O<o0O0o> {
        public o00oOOo0(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // o0O0OO.o00oo0O
        /* renamed from: o00oo0Oo */
        public void o00oOoO0(o0O0OOoO.o0O0000O o0o0000o, o0O0o o0o0o) {
            String str = o0o0o.f12457o00oOOo0;
            if (str == null) {
                o0o0000o.o0O0o00(1);
            } else {
                o0o0000o.o0O0O0O(1, str);
            }
            Long l = o0o0o.f12458o00oOOoO;
            if (l == null) {
                o0o0000o.o0O0o00(2);
            } else {
                o0o0000o.o0O0OOOo(2, l.longValue());
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Callable<Long> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0O0OO.o0O00OOO f12382o00oOOo0;

        public o00oOOoO(o0O0OO.o0O00OOO o0o00ooo) {
            this.f12382o00oOOo0 = o0o00ooo;
        }

        public void finalize() {
            this.f12382o00oOOo0.release();
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: o00oOOo0 */
        public Long call() throws Exception {
            Long l = null;
            Cursor o00oOooO2 = o00oOo00.o00oOooO(o00ooO0.this.f12379o00oOOo0, this.f12382o00oOOo0, false, null);
            try {
                if (o00oOooO2.moveToFirst() && !o00oOooO2.isNull(0)) {
                    l = Long.valueOf(o00oOooO2.getLong(0));
                }
                return l;
            } finally {
                o00oOooO2.close();
            }
        }
    }

    public o00ooO0(o0O0OO.o0O00O0o o0o00o0o) {
        this.f12379o00oOOo0 = o0o00o0o;
        this.f12380o00oOOoO = new o00oOOo0(o0o00o0o);
    }

    @Override // o0O0o0Oo.o00oo
    public LiveData<Long> o00oOOo0(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        return this.f12379o00oOOo0.o00oOooo().o00oOo0O(new String[]{Preference.f3693o0O00}, false, new o00oOOoO(o00oOo0o2));
    }

    @Override // o0O0o0Oo.o00oo
    public void o00oOOoO(o0O0o o0o0o) {
        this.f12379o00oOOo0.o00oOOoO();
        this.f12379o00oOOo0.o00oOo00();
        try {
            this.f12380o00oOOoO.o00oOoOO(o0o0o);
            this.f12379o00oOOo0.o00ooO0o();
        } finally {
            this.f12379o00oOOo0.o00oOoOO();
        }
    }

    @Override // o0O0o0Oo.o00oo
    public Long o00oOo00(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12379o00oOOo0.o00oOOoO();
        Long l = null;
        Cursor o00oOooO2 = o00oOo00.o00oOooO(this.f12379o00oOOo0, o00oOo0o2, false, null);
        try {
            if (o00oOooO2.moveToFirst() && !o00oOooO2.isNull(0)) {
                l = Long.valueOf(o00oOooO2.getLong(0));
            }
            return l;
        } finally {
            o00oOooO2.close();
            o00oOo0o2.release();
        }
    }
}
