package o00ooOO0;

import android.support.v4.media.o00oOo0O;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class o0O000Oo implements o0O000 {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f8889o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f8891o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o0O00o00 f8895o00oOooO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o0O000 f8885o00oOOo0 = null;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public boolean f8886o00oOOoO = false;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f8887o00oOo00 = false;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o00oOOo0 f8888o00oOo0O = o00oOOo0.UNKNOWN;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f8890o00oOoO = 1;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public o0O000o0 f8892o00oOoOO = null;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public boolean f8893o00oOoOo = false;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public List<o0O000> f8894o00oOoo0 = new ArrayList();

    /* renamed from: o00oOooo  reason: collision with root package name */
    public List<o0O000Oo> f8896o00oOooo = new ArrayList();

    /* loaded from: classes.dex */
    public enum o00oOOo0 {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public o0O000Oo(o0O00o00 o0o00o00) {
        this.f8895o00oOooO = o0o00o00;
    }

    @Override // o00ooOO0.o0O000
    public void o00oOOo0(o0O000 o0o000) {
        for (o0O000Oo o0o000oo : this.f8896o00oOooo) {
            if (!o0o000oo.f8893o00oOoOo) {
                return;
            }
        }
        this.f8887o00oOo00 = true;
        o0O000 o0o0002 = this.f8885o00oOOo0;
        if (o0o0002 != null) {
            o0o0002.o00oOOo0(this);
        }
        if (this.f8886o00oOOoO) {
            this.f8895o00oOooO.o00oOOo0(this);
            return;
        }
        o0O000Oo o0o000oo2 = null;
        int i = 0;
        for (o0O000Oo o0o000oo3 : this.f8896o00oOooo) {
            if (!(o0o000oo3 instanceof o0O000o0)) {
                i++;
                o0o000oo2 = o0o000oo3;
            }
        }
        if (o0o000oo2 != null && i == 1 && o0o000oo2.f8893o00oOoOo) {
            o0O000o0 o0o000o0 = this.f8892o00oOoOO;
            if (o0o000o0 != null) {
                if (!o0o000o0.f8893o00oOoOo) {
                    return;
                }
                this.f8889o00oOo0o = this.f8890o00oOoO * o0o000o0.f8891o00oOoO0;
            }
            o00oOo0O(o0o000oo2.f8891o00oOoO0 + this.f8889o00oOo0o);
        }
        o0O000 o0o0003 = this.f8885o00oOOo0;
        if (o0o0003 != null) {
            o0o0003.o00oOOo0(this);
        }
    }

    public void o00oOOoO(o0O000 o0o000) {
        this.f8894o00oOoo0.add(o0o000);
        if (this.f8893o00oOoOo) {
            o0o000.o00oOOo0(o0o000);
        }
    }

    public void o00oOo00() {
        this.f8896o00oOooo.clear();
        this.f8894o00oOoo0.clear();
        this.f8893o00oOoOo = false;
        this.f8891o00oOoO0 = 0;
        this.f8887o00oOo00 = false;
        this.f8886o00oOOoO = false;
    }

    public void o00oOo0O(int i) {
        if (this.f8893o00oOoOo) {
            return;
        }
        this.f8893o00oOoOo = true;
        this.f8891o00oOoO0 = i;
        for (o0O000 o0o000 : this.f8894o00oOoo0) {
            o0o000.o00oOOo0(o0o000);
        }
    }

    public String o00oOooO() {
        StringBuilder o00oOOo02;
        String str;
        String o00ooO02 = this.f8895o00oOooO.f8917o00oOOoO.o00ooO0();
        o00oOOo0 o00oooo02 = this.f8888o00oOo0O;
        if (o00oooo02 == o00oOOo0.LEFT || o00oooo02 == o00oOOo0.RIGHT) {
            o00oOOo02 = o00oOo0O.o00oOOo0(o00ooO02);
            str = "_HORIZONTAL";
        } else {
            o00oOOo02 = o00oOo0O.o00oOOo0(o00ooO02);
            str = "_VERTICAL";
        }
        o00oOOo02.append(str);
        StringBuilder o00oOOo03 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(o00oOOo02.toString(), ":");
        o00oOOo03.append(this.f8888o00oOo0O.name());
        return o00oOOo03.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8895o00oOooO.f8917o00oOOoO.o00ooO0());
        sb.append(":");
        sb.append(this.f8888o00oOo0O);
        sb.append("(");
        sb.append(this.f8893o00oOoOo ? Integer.valueOf(this.f8891o00oOoO0) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f8896o00oOooo.size());
        sb.append(":d=");
        sb.append(this.f8894o00oOoo0.size());
        sb.append(">");
        return sb.toString();
    }
}
