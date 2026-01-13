package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: o0O00o  reason: collision with root package name */
    public final ArrayAdapter f3672o0O00o;

    /* renamed from: o0O00o0o  reason: collision with root package name */
    public final Context f3673o0O00o0o;

    /* renamed from: o0O00oO0  reason: collision with root package name */
    public Spinner f3674o0O00oO0;

    /* renamed from: o0O0O0O  reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f3675o0O0O0O;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements AdapterView.OnItemSelectedListener {
        public o00oOOo0() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.o0O0ooO0()[i].toString();
                if (charSequence.equals(DropDownPreference.this.o0O0ooOO()) || !DropDownPreference.this.o00oOooO(charSequence)) {
                    return;
                }
                DropDownPreference.this.o0OO000(charSequence);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(@oo0oO0 Context context) {
        this(context, null);
    }

    public DropDownPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.dropdownPreferenceStyle, 0);
    }

    public DropDownPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3675o0O0O0O = new o00oOOo0();
        this.f3673o0O00o0o = context;
        this.f3672o0O00o = oo0oO0();
        o0OO00OO();
    }

    @Override // androidx.preference.Preference
    public void o0O0000o() {
        super.o0O0000o();
        ArrayAdapter arrayAdapter = this.f3672o0O00o;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void o0O000o() {
        this.f3674o0O00oO0.performClick();
    }

    @Override // androidx.preference.Preference
    public void o0O000o0(@oo0oO0 o0O000Oo o0o000oo) {
        Spinner spinner = (Spinner) o0o000oo.itemView.findViewById(R.id.spinner);
        this.f3674o0O00oO0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f3672o0O00o);
        this.f3674o0O00oO0.setOnItemSelectedListener(this.f3675o0O0O0O);
        this.f3674o0O00oO0.setSelection(oo0ooO(o0O0ooOO()));
        super.o0O000o0(o0o000oo);
    }

    @Override // androidx.preference.ListPreference
    public void o0O0oooO(@oo0oO0 CharSequence[] charSequenceArr) {
        this.f3682o0O00Oo = charSequenceArr;
        o0OO00OO();
    }

    @Override // androidx.preference.ListPreference
    public void o0OO000o(int i) {
        o0OO000(o0O0ooO0()[i].toString());
    }

    public final void o0OO00OO() {
        this.f3672o0O00o.clear();
        if (o0O0oo0() != null) {
            for (CharSequence charSequence : o0O0oo0()) {
                this.f3672o0O00o.add(charSequence.toString());
            }
        }
    }

    @oo0oO0
    public ArrayAdapter oo0oO0() {
        return new ArrayAdapter(this.f3673o0O00o0o, 17367049);
    }

    public final int oo0ooO(String str) {
        CharSequence[] o0O0ooO02 = o0O0ooO0();
        if (str == null || o0O0ooO02 == null) {
            return -1;
        }
        for (int length = o0O0ooO02.length - 1; length >= 0; length--) {
            if (TextUtils.equals(o0O0ooO02[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }
}
