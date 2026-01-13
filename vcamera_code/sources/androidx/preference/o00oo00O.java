package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.o00oOo0O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oo00O extends o0O0o {

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final String f3848o00ooOoO = "ListPreferenceDialogFragment.index";

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final String f3849o00ooOoo = "ListPreferenceDialogFragment.entries";

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final String f3850o00ooo00 = "ListPreferenceDialogFragment.entryValues";

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public int f3851o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public CharSequence[] f3852o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public CharSequence[] f3853o00ooOo0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements DialogInterface.OnClickListener {
        public o00oOOo0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            o00oo00O o00oo00o = o00oo00O.this;
            o00oo00o.f3851o00ooOOo = i;
            o00oo00o.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @oo0oO0
    public static o00oo00O o00oo0OO(String str) {
        o00oo00O o00oo00o = new o00oo00O();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        o00oo00o.setArguments(bundle);
        return o00oo00o;
    }

    @Override // androidx.preference.o0O0o
    public void o00oOoOo(boolean z) {
        int i;
        if (!z || (i = this.f3851o00ooOOo) < 0) {
            return;
        }
        String charSequence = this.f3852o00ooOo[i].toString();
        ListPreference o00oo02 = o00oo0();
        if (o00oo02.o00oOooO(charSequence)) {
            o00oo02.o0OO000(charSequence);
        }
    }

    @Override // androidx.preference.o0O0o
    public void o00oOoo0(@oo0oO0 o00oOo0O.o00oOOo0 o00oooo02) {
        o00oooo02.setSingleChoiceItems(this.f3853o00ooOo0, this.f3851o00ooOOo, new o00oOOo0());
        o00oooo02.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public final ListPreference o00oo0() {
        return (ListPreference) o00oOo0o();
    }

    @Override // androidx.preference.o0O0o, androidx.fragment.app.o00oOo00, androidx.fragment.app.Fragment
    public void onCreate(@o0OO00OO Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f3851o00ooOOo = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f3853o00ooOo0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f3852o00ooOo = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference o00oo02 = o00oo0();
        if (o00oo02.o0O0oo0() == null || o00oo02.o0O0ooO0() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f3851o00ooOOo = o00oo02.o0O0oOoo(o00oo02.o0O0ooOO());
        this.f3853o00ooOo0 = o00oo02.o0O0oo0();
        this.f3852o00ooOo = o00oo02.o0O0ooO0();
    }

    @Override // androidx.preference.o0O0o, androidx.fragment.app.o00oOo00, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@oo0oO0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f3851o00ooOOo);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f3853o00ooOo0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f3852o00ooOo);
    }
}
