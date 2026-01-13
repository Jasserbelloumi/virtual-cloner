package o0O00;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00ooO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final AccessibilityRecord f10095o00oOOo0;

    @o0OOooO0(15)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static int o00oOOo0(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        @o0O0O0Oo
        public static int o00oOOoO(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        @o0O0O0Oo
        public static void o00oOo00(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        @o0O0O0Oo
        public static void o00oOooO(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static void o00oOOo0(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    @Deprecated
    public o00ooO0(Object obj) {
        this.f10095o00oOOo0 = (AccessibilityRecord) obj;
    }

    public static int o00oOoOo(@oo0oO0 AccessibilityRecord accessibilityRecord) {
        return o00oOOo0.o00oOOo0(accessibilityRecord);
    }

    public static int o00oOooo(@oo0oO0 AccessibilityRecord accessibilityRecord) {
        return o00oOOo0.o00oOOoO(accessibilityRecord);
    }

    @Deprecated
    public static o00ooO0 o00ooO0O() {
        return new o00ooO0(AccessibilityRecord.obtain());
    }

    @Deprecated
    public static o00ooO0 o00ooO0o(o00ooO0 o00ooo02) {
        return new o00ooO0(AccessibilityRecord.obtain(o00ooo02.f10095o00oOOo0));
    }

    public static void o00oooO(@oo0oO0 AccessibilityRecord accessibilityRecord, int i) {
        o00oOOo0.o00oOo00(accessibilityRecord, i);
    }

    public static void o00oooOo(@oo0oO0 AccessibilityRecord accessibilityRecord, int i) {
        o00oOOo0.o00oOooO(accessibilityRecord, i);
    }

    public static void o0O000(@oo0oO0 AccessibilityRecord accessibilityRecord, @o0OO00OO View view, int i) {
        o00oOOoO.o00oOOo0(accessibilityRecord, view, i);
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00ooO0) {
            AccessibilityRecord accessibilityRecord = this.f10095o00oOOo0;
            AccessibilityRecord accessibilityRecord2 = ((o00ooO0) obj).f10095o00oOOo0;
            return accessibilityRecord == null ? accessibilityRecord2 == null : accessibilityRecord.equals(accessibilityRecord2);
        }
        return false;
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f10095o00oOOo0;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public void o0(int i) {
        this.f10095o00oOOo0.setScrollY(i);
    }

    @Deprecated
    public int o00oOOo0() {
        return this.f10095o00oOOo0.getAddedCount();
    }

    @Deprecated
    public CharSequence o00oOOoO() {
        return this.f10095o00oOOo0.getBeforeText();
    }

    @Deprecated
    public CharSequence o00oOo00() {
        return this.f10095o00oOOo0.getClassName();
    }

    @Deprecated
    public int o00oOo0O() {
        return this.f10095o00oOOo0.getCurrentItemIndex();
    }

    @Deprecated
    public int o00oOo0o() {
        return this.f10095o00oOOo0.getFromIndex();
    }

    @Deprecated
    public int o00oOoO() {
        return this.f10095o00oOOo0.getItemCount();
    }

    @Deprecated
    public Object o00oOoO0() {
        return this.f10095o00oOOo0;
    }

    @Deprecated
    public int o00oOoOO() {
        return o00oOOo0.o00oOOo0(this.f10095o00oOOo0);
    }

    @Deprecated
    public int o00oOoo0() {
        return o00oOOo0.o00oOOoO(this.f10095o00oOOo0);
    }

    @Deprecated
    public CharSequence o00oOooO() {
        return this.f10095o00oOOo0.getContentDescription();
    }

    @Deprecated
    public boolean o00oo() {
        return this.f10095o00oOOo0.isFullScreen();
    }

    @Deprecated
    public int o00oo0() {
        return this.f10095o00oOOo0.getRemovedCount();
    }

    @Deprecated
    public Parcelable o00oo00O() {
        return this.f10095o00oOOo0.getParcelableData();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public o00oo0O o00oo0O() {
        return o00oo0O.o0OO0o00(this.f10095o00oOOo0.getSource());
    }

    @Deprecated
    public int o00oo0O0() {
        return this.f10095o00oOOo0.getScrollY();
    }

    @Deprecated
    public int o00oo0OO() {
        return this.f10095o00oOOo0.getScrollX();
    }

    @Deprecated
    public List<CharSequence> o00oo0Oo() {
        return this.f10095o00oOOo0.getText();
    }

    @Deprecated
    public int o00oo0o() {
        return this.f10095o00oOOo0.getWindowId();
    }

    @Deprecated
    public int o00oo0o0() {
        return this.f10095o00oOOo0.getToIndex();
    }

    @Deprecated
    public boolean o00oo0oO() {
        return this.f10095o00oOOo0.isChecked();
    }

    @Deprecated
    public void o00ooO() {
        this.f10095o00oOOo0.recycle();
    }

    @Deprecated
    public boolean o00ooO0() {
        return this.f10095o00oOOo0.isScrollable();
    }

    @Deprecated
    public boolean o00ooO00() {
        return this.f10095o00oOOo0.isPassword();
    }

    @Deprecated
    public void o00ooOO(CharSequence charSequence) {
        this.f10095o00oOOo0.setBeforeText(charSequence);
    }

    @Deprecated
    public void o00ooOO0(int i) {
        this.f10095o00oOOo0.setAddedCount(i);
    }

    @Deprecated
    public void o00ooOOo(boolean z) {
        this.f10095o00oOOo0.setChecked(z);
    }

    @Deprecated
    public void o00ooOo(CharSequence charSequence) {
        this.f10095o00oOOo0.setContentDescription(charSequence);
    }

    @Deprecated
    public void o00ooOo0(CharSequence charSequence) {
        this.f10095o00oOOo0.setClassName(charSequence);
    }

    @Deprecated
    public void o00ooOoO(int i) {
        this.f10095o00oOOo0.setCurrentItemIndex(i);
    }

    @Deprecated
    public void o00ooOoo(boolean z) {
        this.f10095o00oOOo0.setEnabled(z);
    }

    @Deprecated
    public void o00ooo0(boolean z) {
        this.f10095o00oOOo0.setFullScreen(z);
    }

    @Deprecated
    public void o00ooo00(int i) {
        this.f10095o00oOOo0.setFromIndex(i);
    }

    @Deprecated
    public void o00ooo0O(int i) {
        this.f10095o00oOOo0.setItemCount(i);
    }

    @Deprecated
    public void o00ooo0o(int i) {
        o00oOOo0.o00oOo00(this.f10095o00oOOo0, i);
    }

    @Deprecated
    public void o00oooOO(int i) {
        o00oOOo0.o00oOooO(this.f10095o00oOOo0, i);
    }

    @Deprecated
    public void o00oooo(boolean z) {
        this.f10095o00oOOo0.setPassword(z);
    }

    @Deprecated
    public void o00oooo0(Parcelable parcelable) {
        this.f10095o00oOOo0.setParcelableData(parcelable);
    }

    @Deprecated
    public void o00ooooO(int i) {
        this.f10095o00oOOo0.setRemovedCount(i);
    }

    @Deprecated
    public void o00ooooo(int i) {
        this.f10095o00oOOo0.setScrollX(i);
    }

    @Deprecated
    public void o0O00000(boolean z) {
        this.f10095o00oOOo0.setScrollable(z);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public void o0O0000O(View view) {
        this.f10095o00oOOo0.setSource(view);
    }

    @Deprecated
    public void o0O0000o(View view, int i) {
        o00oOOoO.o00oOOo0(this.f10095o00oOOo0, view, i);
    }

    @Deprecated
    public void o0O000O(int i) {
        this.f10095o00oOOo0.setToIndex(i);
    }

    @Deprecated
    public boolean o0O0o() {
        return this.f10095o00oOOo0.isEnabled();
    }
}
