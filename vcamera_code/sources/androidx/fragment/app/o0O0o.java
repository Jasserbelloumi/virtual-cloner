package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.o0OO0oO;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public class o0O0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00ooO0<?> f3128o00oOOo0;

    public o0O0o(o00ooO0<?> o00ooo02) {
        this.f3128o00oOOo0 = o00ooo02;
    }

    @oo0oO0
    public static o0O0o o00oOOoO(@oo0oO0 o00ooO0<?> o00ooo02) {
        return new o0O0o((o00ooO0) ooOOOOoo.o00oo00O(o00ooo02, "callbacks == null"));
    }

    public void o00oOOo0(@o0OO00OO Fragment fragment) {
        o00ooO0<?> o00ooo02 = this.f3128o00oOOo0;
        o00ooo02.f3037o00oo0o.o00oo0o0(o00ooo02, o00ooo02, fragment);
    }

    public void o00oOo00() {
        this.f3128o00oOOo0.f3037o00oo0o.o00ooOo0();
    }

    public boolean o00oOo0O(@oo0oO0 MenuItem menuItem) {
        return this.f3128o00oOOo0.f3037o00oo0o.o00ooOoo(menuItem);
    }

    public void o00oOo0o() {
        this.f3128o00oOOo0.f3037o00oo0o.o00ooo00();
    }

    public void o00oOoO() {
        this.f3128o00oOOo0.f3037o00oo0o.o00ooo0O();
    }

    @Deprecated
    public boolean o00oOoO0(@oo0oO0 Menu menu, @oo0oO0 MenuInflater menuInflater) {
        return this.f3128o00oOOo0.f3037o00oo0o.o00ooo0(menu, menuInflater);
    }

    public void o00oOoOO() {
        this.f3128o00oOOo0.f3037o00oo0o.o00ooo0o();
    }

    @Deprecated
    public void o00oOoOo() {
        this.f3128o00oOOo0.f3037o00oo0o.o00oooO(true);
    }

    @Deprecated
    public void o00oOoo0(boolean z) {
        this.f3128o00oOOo0.f3037o00oo0o.o00oooOO(z, true);
    }

    @Deprecated
    public void o00oOooO(@oo0oO0 Configuration configuration) {
        this.f3128o00oOOo0.f3037o00oo0o.o00ooOoO(configuration, true);
    }

    @Deprecated
    public boolean o00oOooo(@oo0oO0 MenuItem menuItem) {
        return this.f3128o00oOOo0.f3037o00oo0o.o00oooo(menuItem);
    }

    @Deprecated
    public void o00oo() {
    }

    public void o00oo0() {
        this.f3128o00oOOo0.f3037o00oo0o.o0();
    }

    @Deprecated
    public void o00oo00O(@oo0oO0 Menu menu) {
        this.f3128o00oOOo0.f3037o00oo0o.o00ooooO(menu);
    }

    @Deprecated
    public void o00oo0O() {
    }

    @Deprecated
    public boolean o00oo0O0(@oo0oO0 Menu menu) {
        return this.f3128o00oOOo0.f3037o00oo0o.o0O0000O(menu);
    }

    @Deprecated
    public void o00oo0OO(boolean z) {
        this.f3128o00oOOo0.f3037o00oo0o.o0O00000(z, true);
    }

    public void o00oo0Oo() {
        this.f3128o00oOOo0.f3037o00oo0o.o0O000();
    }

    public void o00oo0o() {
        this.f3128o00oOOo0.f3037o00oo0o.o0O000Oo();
    }

    public void o00oo0o0() {
        this.f3128o00oOOo0.f3037o00oo0o.o0O000O();
    }

    @Deprecated
    public void o00oo0oO() {
    }

    @oo0oO0
    public List<Fragment> o00ooO(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.f3128o00oOOo0.f3037o00oo0o.o0O0oo0o();
    }

    @Deprecated
    public void o00ooO0(@oo0oO0 String str, @o0OO00OO FileDescriptor fileDescriptor, @oo0oO0 PrintWriter printWriter, @o0OO00OO String[] strArr) {
    }

    @Deprecated
    public void o00ooO00(boolean z) {
    }

    public boolean o00ooO0O() {
        return this.f3128o00oOOo0.f3037o00oo0o.o0OoO00O(true);
    }

    @o0OO00OO
    public Fragment o00ooO0o(@oo0oO0 String str) {
        return this.f3128o00oOOo0.f3037o00oo0o.o0O00o0O(str);
    }

    @oo0oO0
    public FragmentManager o00ooOO() {
        return this.f3128o00oOOo0.f3037o00oo0o;
    }

    public int o00ooOO0() {
        return this.f3128o00oOOo0.f3037o00oo0o.o0oO0O0o();
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    public o0O0O0O.o00oOOo0 o00ooOOo() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    @o0OO00OO
    public View o00ooOo(@o0OO00OO View view, @oo0oO0 String str, @oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        return this.f3128o00oOOo0.f3037o00oo0o.o0O0OOO().onCreateView(view, str, context, attributeSet);
    }

    public void o00ooOo0() {
        this.f3128o00oOOo0.f3037o00oo0o.o0O0o0oO();
    }

    @Deprecated
    public void o00ooOoO() {
    }

    @Deprecated
    public void o00ooOoo(@o0OO00OO Parcelable parcelable, @o0OO00OO o0O00O0o o0o00o0o) {
        this.f3128o00oOOo0.f3037o00oo0o.o0O0ooo0(parcelable, o0o00o0o);
    }

    @Deprecated
    public void o00ooo0(@SuppressLint({"UnknownNullness"}) androidx.collection.o00ooO0<String, o0O0O0O.o00oOOo0> o00ooo02) {
    }

    @Deprecated
    public void o00ooo00(@o0OO00OO Parcelable parcelable, @o0OO00OO List<Fragment> list) {
        this.f3128o00oOOo0.f3037o00oo0o.o0O0ooo0(parcelable, new o0O00O0o(list, null, null));
    }

    @Deprecated
    public void o00ooo0O(@o0OO00OO Parcelable parcelable) {
        o00ooO0<?> o00ooo02 = this.f3128o00oOOo0;
        if (!(o00ooo02 instanceof o0OO0oO)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        o00ooo02.f3037o00oo0o.o0O0oooo(parcelable);
    }

    @o0OO00OO
    @Deprecated
    public androidx.collection.o00ooO0<String, o0O0O0O.o00oOOo0> o00ooo0o() {
        return null;
    }

    @o0OO00OO
    @Deprecated
    public o0O00O0o o00oooO() {
        return this.f3128o00oOOo0.f3037o00oo0o.o0OO000();
    }

    @o0OO00OO
    @Deprecated
    public List<Fragment> o00oooOO() {
        o0O00O0o o0OO0002 = this.f3128o00oOOo0.f3037o00oo0o.o0OO000();
        if (o0OO0002 == null || o0OO0002.o00oOOoO() == null) {
            return null;
        }
        return new ArrayList(o0OO0002.o00oOOoO());
    }

    @o0OO00OO
    @Deprecated
    public Parcelable o00oooOo() {
        return this.f3128o00oOOo0.f3037o00oo0o.oo0oO0();
    }

    @Deprecated
    public void o0O0o() {
    }
}
