package o0oO0Ooo;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.o00oo00O;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(19)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class oO0OoOO0 implements InputFilter {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final TextView f16958o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oo00O.AbstractC0018o00oo00O f16959o00oOOoO;

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o00oo00O.AbstractC0018o00oo00O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Reference<TextView> f16960o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Reference<oO0OoOO0> f16961o00oOOoO;

        public o00oOOo0(TextView textView, oO0OoOO0 oo0oooo0) {
            this.f16960o00oOOo0 = new WeakReference(textView);
            this.f16961o00oOOoO = new WeakReference(oo0oooo0);
        }

        @Override // androidx.emoji2.text.o00oo00O.AbstractC0018o00oo00O
        public void o00oOOoO() {
            CharSequence text;
            CharSequence o00oo0oO2;
            TextView textView = this.f16960o00oOOo0.get();
            if (o00oOo00(textView, this.f16961o00oOOoO.get()) && textView.isAttachedToWindow() && text != (o00oo0oO2 = o00oo00O.o00oOOoO().o00oo0oO((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(o00oo0oO2);
                int selectionEnd = Selection.getSelectionEnd(o00oo0oO2);
                textView.setText(o00oo0oO2);
                if (o00oo0oO2 instanceof Spannable) {
                    oO0OoOO0.o00oOOoO((Spannable) o00oo0oO2, selectionStart, selectionEnd);
                }
            }
        }

        public final boolean o00oOo00(@o0OO00OO TextView textView, @o0OO00OO InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public oO0OoOO0(@oo0oO0 TextView textView) {
        this.f16958o00oOOo0 = textView;
    }

    public static void o00oOOoO(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f16958o00oOOo0.isInEditMode()) {
            return charSequence;
        }
        int o00oOo0o2 = o00oo00O.o00oOOoO().o00oOo0o();
        if (o00oOo0o2 != 0) {
            boolean z = true;
            if (o00oOo0o2 == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f16958o00oOOo0.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return o00oo00O.o00oOOoO().o0O0o(charSequence, 0, charSequence.length());
            } else if (o00oOo0o2 != 3) {
                return charSequence;
            }
        }
        o00oo00O.o00oOOoO().o00ooO0(o00oOOo0());
        return charSequence;
    }

    public final o00oo00O.AbstractC0018o00oo00O o00oOOo0() {
        if (this.f16959o00oOOoO == null) {
            this.f16959o00oOOoO = new o00oOOo0(this.f16958o00oOOo0, this);
        }
        return this.f16959o00oOOoO;
    }
}
