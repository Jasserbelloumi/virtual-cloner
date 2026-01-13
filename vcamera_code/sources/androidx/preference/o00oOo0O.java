package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.oo0oO0;
import o0O0OO.o0O00O0o;
/* loaded from: classes.dex */
public final class o00oOo0O extends Preference {

    /* renamed from: o0O00O0  reason: collision with root package name */
    public long f3804o0O00O0;

    public o00oOo0O(@oo0oO0 Context context, List<Preference> list, long j) {
        super(context, null);
        o0oOo0O0();
        o0O0o0oO(list);
        this.f3804o0O00O0 = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public long o00oo0o0() {
        return this.f3804o0O00O0;
    }

    @Override // androidx.preference.Preference
    public void o0O000o0(@oo0oO0 o0O000Oo o0o000oo) {
        super.o0O000o0(o0o000oo);
        o0o000oo.o00oOo0o(false);
    }

    public final void o0O0o0oO(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        for (Preference preference : list) {
            CharSequence o00ooo0o2 = preference.o00ooo0o();
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(o00ooo0o2)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.o00ooO0O())) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(o00ooo0o2)) {
                str = str == null ? o00ooo0o2 : this.f3698o00oo0O0.getString(R.string.summary_collapsed_preference_list, str, o00ooo0o2);
            }
        }
        o0O0Ooo0(str);
    }

    public final void o0oOo0O0() {
        this.f3728o0O0000O = R.layout.expand_button;
        o0O0OOO0(R.drawable.ic_arrow_down_24dp);
        o0O0OooO(R.string.expand_button_title);
        o0O0Oo0o(o0O00O0o.f11320o00oo00O);
    }
}
