package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public class o00oOoO extends o00oo0O {

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final String f3805o00ooOoO = "ListPreferenceDialogFragment.index";

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final String f3806o00ooOoo = "ListPreferenceDialogFragment.entries";

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final String f3807o00ooo00 = "ListPreferenceDialogFragment.entryValues";

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public int f3808o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public CharSequence[] f3809o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public CharSequence[] f3810o00ooOo0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements DialogInterface.OnClickListener {
        public o00oOOo0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            o00oOoO o00oooo2 = o00oOoO.this;
            o00oooo2.f3808o00ooOOo = i;
            o00oooo2.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @oo0oO0
    @Deprecated
    public static o00oOoO o00oOoOO(String str) {
        o00oOoO o00oooo2 = new o00oOoO();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        o00oooo2.setArguments(bundle);
        return o00oooo2;
    }

    @Override // androidx.preference.o00oo0O
    @Deprecated
    public void o00oOo0O(boolean z) {
        int i;
        ListPreference o00oOoO2 = o00oOoO();
        if (!z || (i = this.f3808o00ooOOo) < 0) {
            return;
        }
        String charSequence = this.f3809o00ooOo[i].toString();
        if (o00oOoO2.o00oOooO(charSequence)) {
            o00oOoO2.o0OO000(charSequence);
        }
    }

    @Override // androidx.preference.o00oo0O
    public void o00oOo0o(@oo0oO0 AlertDialog.Builder builder) {
        builder.setSingleChoiceItems(this.f3810o00ooOo0, this.f3808o00ooOOo, new o00oOOo0());
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public final ListPreference o00oOoO() {
        return (ListPreference) o00oOOo0();
    }

    @Override // androidx.preference.o00oo0O, android.app.DialogFragment, android.app.Fragment
    public void onCreate(@o0OO00OO Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f3808o00ooOOo = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f3810o00ooOo0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f3809o00ooOo = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference o00oOoO2 = o00oOoO();
        if (o00oOoO2.o0O0oo0() == null || o00oOoO2.o0O0ooO0() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f3808o00ooOOo = o00oOoO2.o0O0oOoo(o00oOoO2.o0O0ooOO());
        this.f3810o00ooOo0 = o00oOoO2.o0O0oo0();
        this.f3809o00ooOo = o00oOoO2.o0O0ooO0();
    }

    @Override // androidx.preference.o00oo0O, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@oo0oO0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f3808o00ooOOo);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f3810o00ooOo0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f3809o00ooOo);
    }
}
