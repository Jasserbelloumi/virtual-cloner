package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public class o00oo0 extends o00oo0O {

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final String f3839o00ooOoo = "MultiSelectListPreferenceDialogFragment.values";

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final String f3840o00ooo0 = "MultiSelectListPreferenceDialogFragment.entries";

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final String f3841o00ooo00 = "MultiSelectListPreferenceDialogFragment.changed";

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final String f3842o00ooo0O = "MultiSelectListPreferenceDialogFragment.entryValues";

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public Set<String> f3843o00ooOOo = new HashSet();

    /* renamed from: o00ooOo  reason: collision with root package name */
    public CharSequence[] f3844o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public boolean f3845o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public CharSequence[] f3846o00ooOoO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements DialogInterface.OnMultiChoiceClickListener {
        public o00oOOo0() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            boolean z2;
            boolean remove;
            o00oo0 o00oo0Var = o00oo0.this;
            if (z) {
                z2 = o00oo0Var.f3845o00ooOo0;
                remove = o00oo0Var.f3843o00ooOOo.add(o00oo0Var.f3846o00ooOoO[i].toString());
            } else {
                z2 = o00oo0Var.f3845o00ooOo0;
                remove = o00oo0Var.f3843o00ooOOo.remove(o00oo0Var.f3846o00ooOoO[i].toString());
            }
            o00oo0Var.f3845o00ooOo0 = remove | z2;
        }
    }

    @oo0oO0
    @Deprecated
    public static o00oo0 o00oOoOO(String str) {
        o00oo0 o00oo0Var = new o00oo0();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        o00oo0Var.setArguments(bundle);
        return o00oo0Var;
    }

    @Override // androidx.preference.o00oo0O
    @Deprecated
    public void o00oOo0O(boolean z) {
        MultiSelectListPreference o00oOoO2 = o00oOoO();
        if (z && this.f3845o00ooOo0) {
            Set<String> set = this.f3843o00ooOOo;
            if (o00oOoO2.o00oOooO(set)) {
                o00oOoO2.o0O(set);
            }
        }
        this.f3845o00ooOo0 = false;
    }

    @Override // androidx.preference.o00oo0O
    public void o00oOo0o(@oo0oO0 AlertDialog.Builder builder) {
        int length = this.f3846o00ooOoO.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f3843o00ooOOo.contains(this.f3846o00ooOoO[i].toString());
        }
        builder.setMultiChoiceItems(this.f3844o00ooOo, zArr, new o00oOOo0());
    }

    public final MultiSelectListPreference o00oOoO() {
        return (MultiSelectListPreference) o00oOOo0();
    }

    @Override // androidx.preference.o00oo0O, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f3843o00ooOOo.clear();
            this.f3843o00ooOOo.addAll(bundle.getStringArrayList(f3839o00ooOoo));
            this.f3845o00ooOo0 = bundle.getBoolean(f3841o00ooo00, false);
            this.f3844o00ooOo = bundle.getCharSequenceArray(f3840o00ooo0);
            this.f3846o00ooOoO = bundle.getCharSequenceArray(f3842o00ooo0O);
            return;
        }
        MultiSelectListPreference o00oOoO2 = o00oOoO();
        if (o00oOoO2.o0O0oo0() == null || o00oOoO2.o0O0oo() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f3843o00ooOOo.clear();
        this.f3843o00ooOOo.addAll(o00oOoO2.o0O0ooOO());
        this.f3845o00ooOo0 = false;
        this.f3844o00ooOo = o00oOoO2.o0O0oo0();
        this.f3846o00ooOoO = o00oOoO2.o0O0oo();
    }

    @Override // androidx.preference.o00oo0O, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@oo0oO0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList(f3839o00ooOoo, new ArrayList<>(this.f3843o00ooOOo));
        bundle.putBoolean(f3841o00ooo00, this.f3845o00ooOo0);
        bundle.putCharSequenceArray(f3840o00ooo0, this.f3844o00ooOo);
        bundle.putCharSequenceArray(f3842o00ooo0O, this.f3846o00ooOoO);
    }
}
