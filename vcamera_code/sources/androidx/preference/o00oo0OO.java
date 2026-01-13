package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.o00oOo0O;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oo0OO extends o0O0o {

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final String f3870o00ooOoo = "MultiSelectListPreferenceDialogFragmentCompat.values";

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final String f3871o00ooo0 = "MultiSelectListPreferenceDialogFragmentCompat.entries";

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final String f3872o00ooo00 = "MultiSelectListPreferenceDialogFragmentCompat.changed";

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final String f3873o00ooo0O = "MultiSelectListPreferenceDialogFragmentCompat.entryValues";

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public Set<String> f3874o00ooOOo = new HashSet();

    /* renamed from: o00ooOo  reason: collision with root package name */
    public CharSequence[] f3875o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public boolean f3876o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public CharSequence[] f3877o00ooOoO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements DialogInterface.OnMultiChoiceClickListener {
        public o00oOOo0() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            boolean z2;
            boolean remove;
            o00oo0OO o00oo0oo = o00oo0OO.this;
            if (z) {
                z2 = o00oo0oo.f3876o00ooOo0;
                remove = o00oo0oo.f3874o00ooOOo.add(o00oo0oo.f3877o00ooOoO[i].toString());
            } else {
                z2 = o00oo0oo.f3876o00ooOo0;
                remove = o00oo0oo.f3874o00ooOOo.remove(o00oo0oo.f3877o00ooOoO[i].toString());
            }
            o00oo0oo.f3876o00ooOo0 = remove | z2;
        }
    }

    @oo0oO0
    public static o00oo0OO o00oo0OO(String str) {
        o00oo0OO o00oo0oo = new o00oo0OO();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        o00oo0oo.setArguments(bundle);
        return o00oo0oo;
    }

    @Override // androidx.preference.o0O0o
    public void o00oOoOo(boolean z) {
        if (z && this.f3876o00ooOo0) {
            MultiSelectListPreference o00oo02 = o00oo0();
            if (o00oo02.o00oOooO(this.f3874o00ooOOo)) {
                o00oo02.o0O(this.f3874o00ooOOo);
            }
        }
        this.f3876o00ooOo0 = false;
    }

    @Override // androidx.preference.o0O0o
    public void o00oOoo0(@oo0oO0 o00oOo0O.o00oOOo0 o00oooo02) {
        int length = this.f3877o00ooOoO.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f3874o00ooOOo.contains(this.f3877o00ooOoO[i].toString());
        }
        o00oooo02.setMultiChoiceItems(this.f3875o00ooOo, zArr, new o00oOOo0());
    }

    public final MultiSelectListPreference o00oo0() {
        return (MultiSelectListPreference) o00oOo0o();
    }

    @Override // androidx.preference.o0O0o, androidx.fragment.app.o00oOo00, androidx.fragment.app.Fragment
    public void onCreate(@o0OO00OO Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f3874o00ooOOo.clear();
            this.f3874o00ooOOo.addAll(bundle.getStringArrayList(f3870o00ooOoo));
            this.f3876o00ooOo0 = bundle.getBoolean(f3872o00ooo00, false);
            this.f3875o00ooOo = bundle.getCharSequenceArray(f3871o00ooo0);
            this.f3877o00ooOoO = bundle.getCharSequenceArray(f3873o00ooo0O);
            return;
        }
        MultiSelectListPreference o00oo02 = o00oo0();
        if (o00oo02.o0O0oo0() == null || o00oo02.o0O0oo() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f3874o00ooOOo.clear();
        this.f3874o00ooOOo.addAll(o00oo02.o0O0ooOO());
        this.f3876o00ooOo0 = false;
        this.f3875o00ooOo = o00oo02.o0O0oo0();
        this.f3877o00ooOoO = o00oo02.o0O0oo();
    }

    @Override // androidx.preference.o0O0o, androidx.fragment.app.o00oOo00, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@oo0oO0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList(f3870o00ooOoo, new ArrayList<>(this.f3874o00ooOOo));
        bundle.putBoolean(f3872o00ooo00, this.f3876o00ooOo0);
        bundle.putCharSequenceArray(f3871o00ooo0, this.f3875o00ooOo);
        bundle.putCharSequenceArray(f3873o00ooo0O, this.f3877o00ooOoO);
    }
}
