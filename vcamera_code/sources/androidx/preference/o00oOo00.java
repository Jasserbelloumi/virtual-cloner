package androidx.preference;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oOo00 extends o0O0o {

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final String f3797o00ooOoo = "EditTextPreferenceDialogFragment.text";

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f3798o00ooo00 = 1000;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public EditText f3799o00ooOOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public CharSequence f3801o00ooOo0;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public final Runnable f3800o00ooOo = new o00oOOo0();

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public long f3802o00ooOoO = -1;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o00oOo00.this.o00oo0O();
        }
    }

    @oo0oO0
    public static o00oOo00 o00oo0O0(String str) {
        o00oOo00 o00ooo002 = new o00oOo00();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        o00ooo002.setArguments(bundle);
        return o00ooo002;
    }

    @Override // androidx.preference.o0O0o
    public void o00oOoO(@oo0oO0 View view) {
        super.o00oOoO(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.f3799o00ooOOo = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f3799o00ooOOo.setText(this.f3801o00ooOo0);
        EditText editText2 = this.f3799o00ooOOo;
        editText2.setSelection(editText2.getText().length());
        if (o00oo0().o0O0oOoo() != null) {
            o00oo0().o0O0oOoo().o00oOOo0(this.f3799o00ooOOo);
        }
    }

    @Override // androidx.preference.o0O0o
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public boolean o00oOoO0() {
        return true;
    }

    @Override // androidx.preference.o0O0o
    public void o00oOoOo(boolean z) {
        if (z) {
            String obj = this.f3799o00ooOOo.getText().toString();
            EditTextPreference o00oo02 = o00oo0();
            if (o00oo02.o00oOooO(obj)) {
                o00oo02.o0O0ooO0(obj);
            }
        }
    }

    public final EditTextPreference o00oo0() {
        return (EditTextPreference) o00oOo0o();
    }

    @Override // androidx.preference.o0O0o
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o00oo00O() {
        o00oo0Oo(true);
        o00oo0O();
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o00oo0O() {
        if (o00oo0OO()) {
            EditText editText = this.f3799o00ooOOo;
            if (editText == null || !editText.isFocused()) {
                o00oo0Oo(false);
            } else if (((InputMethodManager) this.f3799o00ooOOo.getContext().getSystemService("input_method")).showSoftInput(this.f3799o00ooOOo, 0)) {
                o00oo0Oo(false);
            } else {
                this.f3799o00ooOOo.removeCallbacks(this.f3800o00ooOo);
                this.f3799o00ooOOo.postDelayed(this.f3800o00ooOo, 50L);
            }
        }
    }

    public final boolean o00oo0OO() {
        long j = this.f3802o00ooOoO;
        return j != -1 && j + 1000 > SystemClock.currentThreadTimeMillis();
    }

    public final void o00oo0Oo(boolean z) {
        this.f3802o00ooOoO = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // androidx.preference.o0O0o, androidx.fragment.app.o00oOo00, androidx.fragment.app.Fragment
    public void onCreate(@o0OO00OO Bundle bundle) {
        super.onCreate(bundle);
        this.f3801o00ooOo0 = bundle == null ? o00oo0().o0O0oo0() : bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
    }

    @Override // androidx.preference.o0O0o, androidx.fragment.app.o00oOo00, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@oo0oO0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f3801o00ooOo0);
    }
}
