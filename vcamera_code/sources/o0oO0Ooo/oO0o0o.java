package o0oO0Ooo;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.o0O0000O;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class oO0o0o extends Editable.Factory {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final Object f16967o00oOOo0 = new Object();
    @o0O0OOOo("INSTANCE_LOCK")

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static volatile Editable.Factory f16968o00oOOoO;
    @o0OO00OO

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static Class<?> f16969o00oOo00;

    @SuppressLint({"PrivateApi"})
    public oO0o0o() {
        try {
            f16969o00oOo00 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, oO0o0o.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f16968o00oOOoO == null) {
            synchronized (f16967o00oOOo0) {
                if (f16968o00oOOoO == null) {
                    f16968o00oOOoO = new oO0o0o();
                }
            }
        }
        return f16968o00oOOoO;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@oo0oO0 CharSequence charSequence) {
        Class<?> cls = f16969o00oOo00;
        return cls != null ? o0O0000O.o00oOo00(cls, charSequence) : super.newEditable(charSequence);
    }
}
