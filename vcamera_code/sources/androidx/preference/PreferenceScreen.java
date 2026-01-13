package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.o0O000O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: o0O00o00  reason: collision with root package name */
    public boolean f3752o0O00o00;

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet, o0O0o00.o00oOOo0(context, R.attr.preferenceScreenStyle, 16842891), 0);
        this.f3752o0O00o00 = true;
    }

    @Override // androidx.preference.Preference
    public void o0O000o() {
        o0O000O.o00oOOoO o00oOoOo2;
        if (this.f3708o00ooOO != null || this.f3710o00ooOOo != null || o0O0oO0O() == 0 || (o00oOoOo2 = this.f3697o00oo0O.o00oOoOo()) == null) {
            return;
        }
        o00oOoOo2.o00oOOo0(this);
    }

    @Override // androidx.preference.PreferenceGroup
    public boolean o0O0oO() {
        return false;
    }

    public void o0O0oo(boolean z) {
        if (this.f3745o0O00OOO) {
            throw new IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
        }
        this.f3752o0O00o00 = z;
    }

    public boolean o0O0ooO0() {
        return this.f3752o0O00o00;
    }
}
