package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.o0O000O;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o00oo;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00ooO extends RecyclerView.o00oo0OO<o0O000Oo> implements Preference.o00oOOoO, PreferenceGroup.o00oOo00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final PreferenceGroup f3879o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public List<Preference> f3880o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public List<Preference> f3881o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final List<o00oOo0O> f3884o00oOooO;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final Runnable f3883o00oOo0o = new o00oOOo0();

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final Handler f3882o00oOo0O = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o00ooO.this.o00ooOO();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o00oo.o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ List f3886o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ List f3887o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ o0O000O.o00oOo0O f3888o00oOo00;

        public o00oOOoO(List list, List list2, o0O000O.o00oOo0O o00ooo0o2) {
            this.f3886o00oOOo0 = list;
            this.f3887o00oOOoO = list2;
            this.f3888o00oOo00 = o00ooo0o2;
        }

        @Override // androidx.recyclerview.widget.o00oo.o00oOOoO
        public boolean o00oOOo0(int i, int i2) {
            return this.f3888o00oOo00.o00oOOo0((Preference) this.f3886o00oOOo0.get(i), (Preference) this.f3887o00oOOoO.get(i2));
        }

        @Override // androidx.recyclerview.widget.o00oo.o00oOOoO
        public boolean o00oOOoO(int i, int i2) {
            return this.f3888o00oOo00.o00oOOoO((Preference) this.f3886o00oOOo0.get(i), (Preference) this.f3887o00oOOoO.get(i2));
        }

        @Override // androidx.recyclerview.widget.o00oo.o00oOOoO
        public int o00oOo0O() {
            return this.f3886o00oOOo0.size();
        }

        @Override // androidx.recyclerview.widget.o00oo.o00oOOoO
        public int o00oOooO() {
            return this.f3887o00oOOoO.size();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Preference.o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ PreferenceGroup f3890o00oOOo0;

        public o00oOo00(PreferenceGroup preferenceGroup) {
            this.f3890o00oOOo0 = preferenceGroup;
        }

        @Override // androidx.preference.Preference.o00oOo0O
        public boolean o00oOOo0(@oo0oO0 Preference preference) {
            this.f3890o00oOOo0.o0O0oOo(Integer.MAX_VALUE);
            o00ooO.this.o00oOooo(preference);
            PreferenceGroup.o00oOOoO oooOO02 = this.f3890o00oOOo0.oooOO0();
            if (oooOO02 != null) {
                oooOO02.o00oOOo0();
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f3892o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f3893o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public String f3894o00oOo00;

        public o00oOo0O(@oo0oO0 Preference preference) {
            this.f3894o00oOo00 = preference.getClass().getName();
            this.f3892o00oOOo0 = preference.o0O0o();
            this.f3893o00oOOoO = preference.o00oooO();
        }

        public boolean equals(Object obj) {
            if (obj instanceof o00oOo0O) {
                o00oOo0O o00ooo0o2 = (o00oOo0O) obj;
                return this.f3892o00oOOo0 == o00ooo0o2.f3892o00oOOo0 && this.f3893o00oOOoO == o00ooo0o2.f3893o00oOOoO && TextUtils.equals(this.f3894o00oOo00, o00ooo0o2.f3894o00oOo00);
            }
            return false;
        }

        public int hashCode() {
            return this.f3894o00oOo00.hashCode() + ((((527 + this.f3892o00oOOo0) * 31) + this.f3893o00oOOoO) * 31);
        }
    }

    public o00ooO(@oo0oO0 PreferenceGroup preferenceGroup) {
        this.f3879o00oOOo0 = preferenceGroup;
        preferenceGroup.o0OooO0(this);
        this.f3880o00oOOoO = new ArrayList();
        this.f3881o00oOo00 = new ArrayList();
        this.f3884o00oOooO = new ArrayList();
        setHasStableIds(preferenceGroup instanceof PreferenceScreen ? ((PreferenceScreen) preferenceGroup).f3752o0O00o00 : true);
        o00ooOO();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public int getItemCount() {
        return this.f3881o00oOo00.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public long getItemId(int i) {
        if (hasStableIds()) {
            return o00ooO0O(i).o00oo0o0();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public int getItemViewType(int i) {
        o00oOo0O o00ooo0o2 = new o00oOo0O(o00ooO0O(i));
        int indexOf = this.f3884o00oOooO.indexOf(o00ooo0o2);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f3884o00oOooO.size();
        this.f3884o00oOooO.add(o00ooo0o2);
        return size;
    }

    @Override // androidx.preference.PreferenceGroup.o00oOo00
    public int o00oOo0O(@oo0oO0 Preference preference) {
        int size = this.f3881o00oOo00.size();
        for (int i = 0; i < size; i++) {
            Preference preference2 = this.f3881o00oOo00.get(i);
            if (preference2 != null && preference2.equals(preference)) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference.o00oOOoO
    public void o00oOoO0(@oo0oO0 Preference preference) {
        int indexOf = this.f3881o00oOo00.indexOf(preference);
        if (indexOf != -1) {
            notifyItemChanged(indexOf, preference);
        }
    }

    @Override // androidx.preference.Preference.o00oOOoO
    public void o00oOooO(@oo0oO0 Preference preference) {
        o00oOooo(preference);
    }

    @Override // androidx.preference.Preference.o00oOOoO
    public void o00oOooo(@oo0oO0 Preference preference) {
        this.f3882o00oOo0O.removeCallbacks(this.f3883o00oOo0o);
        this.f3882o00oOo0O.post(this.f3883o00oOo0o);
    }

    public final androidx.preference.o00oOo0O o00oo(PreferenceGroup preferenceGroup, List<Preference> list) {
        androidx.preference.o00oOo0O o00ooo0o2 = new androidx.preference.o00oOo0O(preferenceGroup.o00oo00O(), list, preferenceGroup.o00oo0o0());
        o00ooo0o2.f3734o0O0o = new o00oOo00(preferenceGroup);
        return o00ooo0o2;
    }

    @Override // androidx.preference.PreferenceGroup.o00oOo00
    public int o00oo0o0(@oo0oO0 String str) {
        int size = this.f3881o00oOo00.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, this.f3881o00oOo00.get(i).o00oo0oO())) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o00ooO */
    public void onBindViewHolder(@oo0oO0 o0O000Oo o0o000oo, int i) {
        Preference o00ooO0O2 = o00ooO0O(i);
        o0o000oo.o00oOo0O();
        o00ooO0O2.o0O000o0(o0o000oo);
    }

    public final void o00ooO0(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.o0O0oo0();
        int o0O0oO0O2 = preferenceGroup.o0O0oO0O();
        for (int i = 0; i < o0O0oO0O2; i++) {
            Preference o0O0oO02 = preferenceGroup.o0O0oO0(i);
            list.add(o0O0oO02);
            o00oOo0O o00ooo0o2 = new o00oOo0O(o0O0oO02);
            if (!this.f3884o00oOooO.contains(o00ooo0o2)) {
                this.f3884o00oOooO.add(o00ooo0o2);
            }
            if (o0O0oO02 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) o0O0oO02;
                if (preferenceGroup2.o0O0oO()) {
                    o00ooO0(list, preferenceGroup2);
                }
            }
            o0O0oO02.o0OooO0(this);
        }
    }

    public final List<Preference> o00ooO00(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int o0O0oO0O2 = preferenceGroup.o0O0oO0O();
        int i = 0;
        for (int i2 = 0; i2 < o0O0oO0O2; i2++) {
            Preference o0O0oO02 = preferenceGroup.o0O0oO0(i2);
            if (o0O0oO02.o0O0000O()) {
                if (!o00ooO0o(preferenceGroup) || i < preferenceGroup.o0O0oo0O()) {
                    arrayList.add(o0O0oO02);
                } else {
                    arrayList2.add(o0O0oO02);
                }
                if (o0O0oO02 instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) o0O0oO02;
                    if (!preferenceGroup2.o0O0oO()) {
                        continue;
                    } else if (o00ooO0o(preferenceGroup) && o00ooO0o(preferenceGroup2)) {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    } else {
                        for (Preference preference : o00ooO00(preferenceGroup2)) {
                            if (!o00ooO0o(preferenceGroup) || i < preferenceGroup.o0O0oo0O()) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (o00ooO0o(preferenceGroup) && i > preferenceGroup.o0O0oo0O()) {
            arrayList.add(o00oo(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    @o0OO00OO
    public Preference o00ooO0O(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return this.f3881o00oOo00.get(i);
    }

    public final boolean o00ooO0o(PreferenceGroup preferenceGroup) {
        return preferenceGroup.o0O0oo0O() != Integer.MAX_VALUE;
    }

    public void o00ooOO() {
        for (Preference preference : this.f3880o00oOOoO) {
            preference.o0OooO0(null);
        }
        ArrayList arrayList = new ArrayList(this.f3880o00oOOoO.size());
        this.f3880o00oOOoO = arrayList;
        o00ooO0(arrayList, this.f3879o00oOOo0);
        List<Preference> list = this.f3881o00oOo00;
        List<Preference> o00ooO002 = o00ooO00(this.f3879o00oOOo0);
        this.f3881o00oOo00 = o00ooO002;
        o0O000O o00ooOoO2 = this.f3879o00oOOo0.o00ooOoO();
        if (o00ooOoO2 == null || o00ooOoO2.o00oOooo() == null) {
            notifyDataSetChanged();
        } else {
            androidx.recyclerview.widget.o00oo.o00oOOoO(new o00oOOoO(list, o00ooO002, o00ooOoO2.o00oOooo())).o00oOo0O(this);
        }
        for (Preference preference2 : this.f3880o00oOOoO) {
            preference2.o00oOo0O();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    @oo0oO0
    /* renamed from: o00ooOO0 */
    public o0O000Oo onCreateViewHolder(@oo0oO0 ViewGroup viewGroup, int i) {
        o00oOo0O o00ooo0o2 = this.f3884o00oOooO.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, R.styleable.BackgroundStyle);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = o00oOo0o.o00oOo00.o00oOOoO(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(o00ooo0o2.f3892o00oOOo0, viewGroup, false);
        if (inflate.getBackground() == null) {
            o0O0o00O.o0O0ooo0(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = o00ooo0o2.f3893o00oOOoO;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new o0O000Oo(inflate);
    }
}
