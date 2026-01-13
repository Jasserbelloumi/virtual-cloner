package o0O000;

import android.os.LocaleList;
import java.util.Locale;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(24)
/* loaded from: classes.dex */
public final class o0O00000 implements o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final LocaleList f10118o00oOOo0;

    public o0O00000(Object obj) {
        this.f10118o00oOOo0 = (LocaleList) obj;
    }

    public boolean equals(Object obj) {
        return this.f10118o00oOOo0.equals(((o0) obj).o00oOo00());
    }

    @Override // o0O000.o0
    public Locale get(int i) {
        return this.f10118o00oOOo0.get(i);
    }

    public int hashCode() {
        return this.f10118o00oOOo0.hashCode();
    }

    @Override // o0O000.o0
    public boolean isEmpty() {
        return this.f10118o00oOOo0.isEmpty();
    }

    @Override // o0O000.o0
    public int o00oOOo0(Locale locale) {
        return this.f10118o00oOOo0.indexOf(locale);
    }

    @Override // o0O000.o0
    public String o00oOOoO() {
        return this.f10118o00oOOo0.toLanguageTags();
    }

    @Override // o0O000.o0
    public Object o00oOo00() {
        return this.f10118o00oOOo0;
    }

    @Override // o0O000.o0
    @o0OO00OO
    public Locale o00oOooO(@oo0oO0 String[] strArr) {
        return this.f10118o00oOOo0.getFirstMatch(strArr);
    }

    @Override // o0O000.o0
    public int size() {
        return this.f10118o00oOOo0.size();
    }

    public String toString() {
        return this.f10118o00oOOo0.toString();
    }
}
