package o0ooO0O0;

import java.math.BigDecimal;
/* loaded from: classes3.dex */
public class oO0O000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public BigDecimal f17064o00oOOo0;

    public oO0O000(BigDecimal bigDecimal) {
        this.f17064o00oOOo0 = bigDecimal;
    }

    public static oO0O000 o00oo0(String str) {
        return new oO0O000(new BigDecimal(str));
    }

    public static oO0O000 o00oo00O(double d) {
        return new oO0O000(new BigDecimal(Double.toString(d)));
    }

    public oO0O000 o00oOOo0(double d) {
        this.f17064o00oOOo0 = this.f17064o00oOOo0.add(new BigDecimal(Double.toString(d)));
        return this;
    }

    public oO0O000 o00oOOoO(String str) {
        this.f17064o00oOOo0 = this.f17064o00oOOo0.add(new BigDecimal(str));
        return this;
    }

    public oO0O000 o00oOo00(double d) {
        return o00oOooO(d, 4);
    }

    public oO0O000 o00oOo0O(String str) {
        return o00oOooO(Double.valueOf(str).doubleValue(), 4);
    }

    public double o00oOo0o() {
        return this.f17064o00oOOo0.doubleValue();
    }

    public String o00oOoO(int i) {
        return this.f17064o00oOOo0.setScale(i, 4).toPlainString();
    }

    public String o00oOoO0() {
        return this.f17064o00oOOo0.toPlainString();
    }

    public oO0O000 o00oOoOO(double d) {
        this.f17064o00oOOo0 = this.f17064o00oOOo0.multiply(new BigDecimal(Double.toString(d)));
        return this;
    }

    public oO0O000 o00oOoOo(String str) {
        this.f17064o00oOOo0 = this.f17064o00oOOo0.multiply(new BigDecimal(str));
        return this;
    }

    public oO0O000 o00oOoo0(double d) {
        this.f17064o00oOOo0 = this.f17064o00oOOo0.subtract(new BigDecimal(Double.toString(d)));
        return this;
    }

    public oO0O000 o00oOooO(double d, int i) {
        this.f17064o00oOOo0 = this.f17064o00oOOo0.divide(new BigDecimal(Double.toString(d)), i, 4);
        return this;
    }

    public oO0O000 o00oOooo(String str) {
        this.f17064o00oOOo0 = this.f17064o00oOOo0.subtract(new BigDecimal(str));
        return this;
    }
}
