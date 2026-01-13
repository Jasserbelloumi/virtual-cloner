package o0oO0Ooo;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.o00oo00O;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
@o0OOooO0(19)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class ooOOOOoo implements TextWatcher {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final boolean f16970o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final EditText f16971o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public o00oo00O.AbstractC0018o00oo00O f16972o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f16974o00oo0o0 = Integer.MAX_VALUE;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f16973o00oo0o = 0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public boolean f16975o00oo0oO = true;

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o00oo00O.AbstractC0018o00oo00O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Reference<EditText> f16976o00oOOo0;

        public o00oOOo0(EditText editText) {
            this.f16976o00oOOo0 = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.o00oo00O.AbstractC0018o00oo00O
        public void o00oOOoO() {
            ooOOOOoo.o00oOo0O(this.f16976o00oOOo0.get(), 1);
        }
    }

    public ooOOOOoo(EditText editText, boolean z) {
        this.f16971o00oo0O0 = editText;
        this.f16970o00oo0O = z;
    }

    public static void o00oOo0O(@o0OO00OO EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            o00oo00O.o00oOOoO().o00oo0oO(editableText);
            oO0OoOO0.o00oOOoO(editableText, selectionStart, selectionEnd);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public int o00oOOo0() {
        return this.f16973o00oo0o;
    }

    public final o00oo00O.AbstractC0018o00oo00O o00oOOoO() {
        if (this.f16972o00oo0Oo == null) {
            this.f16972o00oo0Oo = new o00oOOo0(this.f16971o00oo0O0);
        }
        return this.f16972o00oo0Oo;
    }

    public int o00oOo00() {
        return this.f16974o00oo0o0;
    }

    public void o00oOo0o(int i) {
        this.f16973o00oo0o = i;
    }

    public void o00oOoO(int i) {
        this.f16974o00oo0o0 = i;
    }

    public void o00oOoO0(boolean z) {
        if (this.f16975o00oo0oO != z) {
            if (this.f16972o00oo0Oo != null) {
                o00oo00O.o00oOOoO().o00ooOO0(this.f16972o00oo0Oo);
            }
            this.f16975o00oo0oO = z;
            if (z) {
                o00oOo0O(this.f16971o00oo0O0, o00oo00O.o00oOOoO().o00oOo0o());
            }
        }
    }

    public final boolean o00oOoOO() {
        return (this.f16975o00oo0oO && (this.f16970o00oo0O || o00oo00O.o00oo0())) ? false : true;
    }

    public boolean o00oOooO() {
        return this.f16975o00oo0oO;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f16971o00oo0O0.isInEditMode() || o00oOoOO() || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int o00oOo0o2 = o00oo00O.o00oOOoO().o00oOo0o();
        if (o00oOo0o2 != 0) {
            if (o00oOo0o2 == 1) {
                o00oo00O.o00oOOoO().o00ooO00((Spannable) charSequence, i, i + i3, this.f16974o00oo0o0, this.f16973o00oo0o);
                return;
            } else if (o00oOo0o2 != 3) {
                return;
            }
        }
        o00oo00O.o00oOOoO().o00ooO0(o00oOOoO());
    }
}
