package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
/* loaded from: classes.dex */
public interface o0OO0oO0 extends SpinnerAdapter {

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Context f1323o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final LayoutInflater f1324o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public LayoutInflater f1325o00oOo00;

        public o00oOOo0(@o00oOooO.oo0oO0 Context context) {
            this.f1323o00oOOo0 = context;
            this.f1324o00oOOoO = LayoutInflater.from(context);
        }

        @o00oOooO.oo0oO0
        public LayoutInflater o00oOOo0() {
            LayoutInflater layoutInflater = this.f1325o00oOo00;
            return layoutInflater != null ? layoutInflater : this.f1324o00oOOoO;
        }

        @o00oOooO.o0OO00OO
        public Resources.Theme o00oOOoO() {
            LayoutInflater layoutInflater = this.f1325o00oOo00;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void o00oOo00(@o00oOooO.o0OO00OO Resources.Theme theme) {
            this.f1325o00oOo00 = theme == null ? null : theme.equals(this.f1323o00oOOo0.getTheme()) ? this.f1324o00oOOoO : LayoutInflater.from(new o00oOoOo.o00oo0O0(this.f1323o00oOOo0, theme));
        }
    }

    @o00oOooO.o0OO00OO
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@o00oOooO.o0OO00OO Resources.Theme theme);
}
