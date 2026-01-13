package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O00Oo.o0OoOoOo;
@o0OOooO0(19)
@o00oOooO.o0O000O
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oo0O0 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f2747o00oOo0O = 1;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f2748o00oOo0o = 2;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final ThreadLocal<o0OoOoOo> f2749o00oOoO0 = new ThreadLocal<>();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f2750o00oOooO = 0;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f2751o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O00000 f2752o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public volatile int f2753o00oOo00 = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface o00oOOo0 {
    }

    public o00oo0O0(@oo0oO0 o0O00000 o0o00000, @o0O0o00O(from = 0) int i) {
        this.f2752o00oOOoO = o0o00000;
        this.f2751o00oOOo0 = i;
    }

    public void o00oOOo0(@oo0oO0 Canvas canvas, float f, float f2, @oo0oO0 Paint paint) {
        Typeface typeface = this.f2752o00oOOoO.f2763o00oOooO;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(this.f2752o00oOOoO.f2761o00oOOoO, this.f2751o00oOOo0 * 2, 2, f, f2, paint);
        paint.setTypeface(typeface2);
    }

    public int o00oOOoO(int i) {
        return o00oOoO().o00ooOo0(i);
    }

    public int o00oOo00() {
        return o00oOoO().o00ooOoo();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int o00oOo0O() {
        return this.f2753o00oOo00;
    }

    public short o00oOo0o() {
        return o00oOoO().o00ooooO();
    }

    public final o0OoOoOo o00oOoO() {
        ThreadLocal<o0OoOoOo> threadLocal = f2749o00oOoO0;
        o0OoOoOo o0oooooo = threadLocal.get();
        if (o0oooooo == null) {
            o0oooooo = new o0OoOoOo();
            threadLocal.set(o0oooooo);
        }
        this.f2752o00oOOoO.f2760o00oOOo0.o00ooo00(o0oooooo, this.f2751o00oOOo0);
        return o0oooooo;
    }

    public int o00oOoO0() {
        return o00oOoO().o00ooooo();
    }

    public short o00oOoOO() {
        return o00oOoO().o0();
    }

    @oo0oO0
    public Typeface o00oOoOo() {
        return this.f2752o00oOOoO.f2763o00oOooO;
    }

    public short o00oOoo0() {
        return o00oOoO().o0O0000o();
    }

    public short o00oOooO() {
        return o00oOoO().o00ooo0O();
    }

    public boolean o00oOooo() {
        return o00oOoO().o00oooOO();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void o00oo0(boolean z) {
        this.f2753o00oOo00 = z ? 2 : 1;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.TESTS})
    public void o00oo00O() {
        this.f2753o00oOo00 = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(o00oOoO0()));
        sb.append(", codepoints:");
        int o00oOo002 = o00oOo00();
        for (int i = 0; i < o00oOo002; i++) {
            sb.append(Integer.toHexString(o00oOOoO(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
