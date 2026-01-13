package androidx.preference;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0ooO;
import o0OOOoO0.oO000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002\u001a\u0015\u0010\f\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002\u001a\u0015\u0010\u000e\u001a\u00020\r*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0086\n\u001a\r\u0010\u0010\u001a\u00020\u000b*\u00020\u0002H\u0086\b\u001a\r\u0010\u0011\u001a\u00020\u000b*\u00020\u0002H\u0086\b\u001a3\u0010\u0016\u001a\u00020\r*\u00020\u00022!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u0012H\u0086\bø\u0001\u0000\u001aH\u0010\u0018\u001a\u00020\r*\u00020\u000226\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u0017H\u0086\bø\u0001\u0000\u001a\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019*\u00020\u0002H\u0086\u0002\"\u0016\u0010\u001d\u001a\u00020\u0007*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00000\u001e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"Landroidx/preference/Preference;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/preference/PreferenceGroup;", "", "key", "o00oOo0O", "(Landroidx/preference/PreferenceGroup;Ljava/lang/CharSequence;)Landroidx/preference/Preference;", "", FirebaseAnalytics.Param.INDEX, "o00oOooO", "preference", "", "o00oOOo0", "Lo0OO0o/oO0Ooooo;", "o00oOooo", "o00oOoo0", "o00oOoO", "o00oOoOO", "Lkotlin/Function1;", "Lo0OO0o/o0O0o00O;", "name", "action", o0OO000o.o00oOOoO.f12961o00oOo00, "Lkotlin/Function2;", "o00oOo00", "", "o00oOoOo", "o00oOoO0", "(Landroidx/preference/PreferenceGroup;)I", "size", "Lo0OOOoO0/oO000;", "o00oOo0o", "(Landroidx/preference/PreferenceGroup;)Lo0OOOoO0/oO000;", "children", "preference-ktx_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o0 {

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¨\u0006\u0005"}, d2 = {"androidx/preference/o0$o00oOOo0", "Lo0OOOoO0/oO000;", "Landroidx/preference/Preference;", "", "iterator", "preference-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements oO000<Preference> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ PreferenceGroup f3787o00oOOo0;

        public o00oOOo0(PreferenceGroup preferenceGroup) {
            this.f3787o00oOOo0 = preferenceGroup;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<Preference> iterator() {
            return o0.o00oOoOo(this.f3787o00oOOo0);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/preference/o0$o00oOOoO", "", "Landroidx/preference/Preference;", "", "hasNext", "o00oOOo0", "Lo0OO0o/oO0Ooooo;", "remove", "", "o00oo0O0", "I", FirebaseAnalytics.Param.INDEX, "preference-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOoO implements Iterator<Preference>, o0OOOOO.o00oOo0O {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ PreferenceGroup f3788o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f3789o00oo0O0;

        public o00oOOoO(PreferenceGroup preferenceGroup) {
            this.f3788o00oo0O = preferenceGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3789o00oo0O0 < this.f3788o00oo0O.o0O0oO0O();
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: o00oOOo0 */
        public Preference next() {
            PreferenceGroup preferenceGroup = this.f3788o00oo0O;
            int i = this.f3789o00oo0O0;
            this.f3789o00oo0O0 = i + 1;
            Preference o0O0oO02 = preferenceGroup.o0O0oO0(i);
            o0ooO.o00oo0OO(o0O0oO02, "getPreference(index++)");
            return o0O0oO02;
        }

        @Override // java.util.Iterator
        public void remove() {
            PreferenceGroup preferenceGroup = this.f3788o00oo0O;
            int i = this.f3789o00oo0O0 - 1;
            this.f3789o00oo0O0 = i;
            preferenceGroup.o0O0oOOO(preferenceGroup.o0O0oO0(i));
        }
    }

    public static final boolean o00oOOo0(@NotNull PreferenceGroup preferenceGroup, @NotNull Preference preference) {
        o0ooO.o00oo0O0(preferenceGroup, "<this>");
        o0ooO.o00oo0O0(preference, "preference");
        int o0O0oO0O2 = preferenceGroup.o0O0oO0O();
        int i = 0;
        while (i < o0O0oO0O2) {
            int i2 = i + 1;
            if (o0ooO.o00oOoO0(preferenceGroup.o0O0oO0(i), preference)) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    public static final void o00oOOoO(@NotNull PreferenceGroup preferenceGroup, @NotNull o0OOOO.o00oo<? super Preference, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(preferenceGroup, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "action");
        int o0O0oO0O2 = preferenceGroup.o0O0oO0O();
        for (int i = 0; i < o0O0oO0O2; i++) {
            o00ooVar.invoke(o00oOooO(preferenceGroup, i));
        }
    }

    public static final void o00oOo00(@NotNull PreferenceGroup preferenceGroup, @NotNull o0OOOO.o0O00000<? super Integer, ? super Preference, oO0Ooooo> o0o00000) {
        o0ooO.o00oo0O0(preferenceGroup, "<this>");
        o0ooO.o00oo0O0(o0o00000, "action");
        int o0O0oO0O2 = preferenceGroup.o0O0oO0O();
        for (int i = 0; i < o0O0oO0O2; i++) {
            o0o00000.invoke(Integer.valueOf(i), o00oOooO(preferenceGroup, i));
        }
    }

    @Nullable
    public static final <T extends Preference> T o00oOo0O(@NotNull PreferenceGroup preferenceGroup, @NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(preferenceGroup, "<this>");
        o0ooO.o00oo0O0(charSequence, "key");
        return (T) preferenceGroup.o0O0o0oo(charSequence);
    }

    @NotNull
    public static final oO000<Preference> o00oOo0o(@NotNull PreferenceGroup preferenceGroup) {
        o0ooO.o00oo0O0(preferenceGroup, "<this>");
        return new o00oOOo0(preferenceGroup);
    }

    public static final boolean o00oOoO(@NotNull PreferenceGroup preferenceGroup) {
        o0ooO.o00oo0O0(preferenceGroup, "<this>");
        return preferenceGroup.o0O0oO0O() == 0;
    }

    public static final int o00oOoO0(@NotNull PreferenceGroup preferenceGroup) {
        o0ooO.o00oo0O0(preferenceGroup, "<this>");
        return preferenceGroup.o0O0oO0O();
    }

    public static final boolean o00oOoOO(@NotNull PreferenceGroup preferenceGroup) {
        o0ooO.o00oo0O0(preferenceGroup, "<this>");
        return preferenceGroup.o0O0oO0O() != 0;
    }

    @NotNull
    public static final Iterator<Preference> o00oOoOo(@NotNull PreferenceGroup preferenceGroup) {
        o0ooO.o00oo0O0(preferenceGroup, "<this>");
        return new o00oOOoO(preferenceGroup);
    }

    public static final void o00oOoo0(@NotNull PreferenceGroup preferenceGroup, @NotNull Preference preference) {
        o0ooO.o00oo0O0(preferenceGroup, "<this>");
        o0ooO.o00oo0O0(preference, "preference");
        preferenceGroup.o0O0oOOO(preference);
    }

    @NotNull
    public static final Preference o00oOooO(@NotNull PreferenceGroup preferenceGroup, int i) {
        o0ooO.o00oo0O0(preferenceGroup, "<this>");
        Preference o0O0oO02 = preferenceGroup.o0O0oO0(i);
        o0ooO.o00oo0OO(o0O0oO02, "getPreference(index)");
        return o0O0oO02;
    }

    public static final void o00oOooo(@NotNull PreferenceGroup preferenceGroup, @NotNull Preference preference) {
        o0ooO.o00oo0O0(preferenceGroup, "<this>");
        o0ooO.o00oo0O0(preference, "preference");
        preferenceGroup.o0O0o0oO(preference);
    }
}
