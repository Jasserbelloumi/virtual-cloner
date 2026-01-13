package oo0OOoo;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class o00oOOo0 {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f17229o00oOo00 = -1;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f17230o00oOooO = -2;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final DataSetObservable f17231o00oOOo0 = new DataSetObservable();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public DataSetObserver f17232o00oOOoO;

    @Deprecated
    public void o00oOOo0(@oo0oO0 View view, int i, @oo0oO0 Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void o00oOOoO(@oo0oO0 ViewGroup viewGroup, int i, @oo0oO0 Object obj) {
        o00oOOo0(viewGroup, i, obj);
    }

    @Deprecated
    public void o00oOo00(@oo0oO0 View view) {
    }

    public abstract int o00oOo0O();

    public int o00oOo0o(@oo0oO0 Object obj) {
        return -1;
    }

    public float o00oOoO(int i) {
        return 1.0f;
    }

    @o0OO00OO
    public CharSequence o00oOoO0(int i) {
        return null;
    }

    @oo0oO0
    @Deprecated
    public Object o00oOoOO(@oo0oO0 View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @oo0oO0
    public Object o00oOoOo(@oo0oO0 ViewGroup viewGroup, int i) {
        return o00oOoOO(viewGroup, i);
    }

    public abstract boolean o00oOoo0(@oo0oO0 View view, @oo0oO0 Object obj);

    public void o00oOooO(@oo0oO0 ViewGroup viewGroup) {
        o00oOo00(viewGroup);
    }

    public void o00oOooo() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f17232o00oOOoO;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f17231o00oOOo0.notifyChanged();
    }

    public void o00oo0(@o0OO00OO Parcelable parcelable, @o0OO00OO ClassLoader classLoader) {
    }

    public void o00oo00O(@oo0oO0 DataSetObserver dataSetObserver) {
        this.f17231o00oOOo0.registerObserver(dataSetObserver);
    }

    public void o00oo0O(@oo0oO0 ViewGroup viewGroup, int i, @oo0oO0 Object obj) {
        o00oo0O0(viewGroup, i, obj);
    }

    @Deprecated
    public void o00oo0O0(@oo0oO0 View view, int i, @oo0oO0 Object obj) {
    }

    @o0OO00OO
    public Parcelable o00oo0OO() {
        return null;
    }

    public void o00oo0Oo(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f17232o00oOOoO = dataSetObserver;
        }
    }

    public void o00oo0o(@oo0oO0 ViewGroup viewGroup) {
        o00oo0o0(viewGroup);
    }

    @Deprecated
    public void o00oo0o0(@oo0oO0 View view) {
    }

    public void o00oo0oO(@oo0oO0 DataSetObserver dataSetObserver) {
        this.f17231o00oOOo0.unregisterObserver(dataSetObserver);
    }
}
