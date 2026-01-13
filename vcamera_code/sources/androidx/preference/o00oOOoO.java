package androidx.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public class o00oOOoO extends o00oo0O {

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final String f3794o00ooOo = "EditTextPreferenceDialogFragment.text";

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public EditText f3795o00ooOOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public CharSequence f3796o00ooOo0;

    @oo0oO0
    @Deprecated
    public static o00oOOoO o00oOoOO(String str) {
        o00oOOoO o00ooooo2 = new o00oOOoO();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        o00ooooo2.setArguments(bundle);
        return o00ooooo2;
    }

    @Override // androidx.preference.o00oo0O
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public boolean o00oOOoO() {
        return true;
    }

    @Override // androidx.preference.o00oo0O
    public void o00oOo00(@oo0oO0 View view) {
        super.o00oOo00(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.f3795o00ooOOo = editText;
        editText.requestFocus();
        EditText editText2 = this.f3795o00ooOOo;
        if (editText2 == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.f3796o00ooOo0);
        EditText editText3 = this.f3795o00ooOOo;
        editText3.setSelection(editText3.getText().length());
    }

    @Override // androidx.preference.o00oo0O
    @Deprecated
    public void o00oOo0O(boolean z) {
        if (z) {
            String obj = this.f3795o00ooOOo.getText().toString();
            if (o00oOoO().o00oOooO(obj)) {
                o00oOoO().o0O0ooO0(obj);
            }
        }
    }

    public final EditTextPreference o00oOoO() {
        return (EditTextPreference) o00oOOo0();
    }

    @Override // androidx.preference.o00oo0O, android.app.DialogFragment, android.app.Fragment
    public void onCreate(@o0OO00OO Bundle bundle) {
        super.onCreate(bundle);
        this.f3796o00ooOo0 = bundle == null ? o00oOoO().o0O0oo0() : bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
    }

    @Override // androidx.preference.o00oo0O, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@oo0oO0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f3796o00ooOo0);
    }
}
