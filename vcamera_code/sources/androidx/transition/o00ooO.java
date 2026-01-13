package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00oOooO.oooOO0;
/* loaded from: classes.dex */
public class o00ooO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Context f5092o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f5093o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public ViewGroup f5094o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public Runnable f5095o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public Runnable f5096o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public View f5097o00oOooO;

    public o00ooO(@oo0oO0 ViewGroup viewGroup) {
        this.f5093o00oOOoO = -1;
        this.f5094o00oOo00 = viewGroup;
    }

    public o00ooO(ViewGroup viewGroup, int i, Context context) {
        this.f5092o00oOOo0 = context;
        this.f5094o00oOo00 = viewGroup;
        this.f5093o00oOOoO = i;
    }

    public o00ooO(@oo0oO0 ViewGroup viewGroup, @oo0oO0 View view) {
        this.f5093o00oOOoO = -1;
        this.f5094o00oOo00 = viewGroup;
        this.f5097o00oOooO = view;
    }

    @o0OO00OO
    public static o00ooO o00oOo00(@oo0oO0 ViewGroup viewGroup) {
        return (o00ooO) viewGroup.getTag(R.id.transition_current_scene);
    }

    public static void o00oOoO0(@oo0oO0 ViewGroup viewGroup, @o0OO00OO o00ooO o00ooo) {
        viewGroup.setTag(R.id.transition_current_scene, o00ooo);
    }

    @oo0oO0
    public static o00ooO o00oOooO(@oo0oO0 ViewGroup viewGroup, @oooOO0 int i, @oo0oO0 Context context) {
        int i2 = R.id.transition_scene_layoutid_cache;
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(i2);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(i2, sparseArray);
        }
        o00ooO o00ooo = (o00ooO) sparseArray.get(i);
        if (o00ooo != null) {
            return o00ooo;
        }
        o00ooO o00ooo2 = new o00ooO(viewGroup, i, context);
        sparseArray.put(i, o00ooo2);
        return o00ooo2;
    }

    public void o00oOOo0() {
        if (this.f5093o00oOOoO > 0 || this.f5097o00oOooO != null) {
            o00oOo0O().removeAllViews();
            if (this.f5093o00oOOoO > 0) {
                LayoutInflater.from(this.f5092o00oOOo0).inflate(this.f5093o00oOOoO, this.f5094o00oOo00);
            } else {
                this.f5094o00oOo00.addView(this.f5097o00oOooO);
            }
        }
        Runnable runnable = this.f5095o00oOo0O;
        if (runnable != null) {
            runnable.run();
        }
        o00oOoO0(this.f5094o00oOo00, this);
    }

    public void o00oOOoO() {
        Runnable runnable;
        if (o00oOo00(this.f5094o00oOo00) != this || (runnable = this.f5096o00oOo0o) == null) {
            return;
        }
        runnable.run();
    }

    @oo0oO0
    public ViewGroup o00oOo0O() {
        return this.f5094o00oOo00;
    }

    public boolean o00oOo0o() {
        return this.f5093o00oOOoO > 0;
    }

    public void o00oOoO(@o0OO00OO Runnable runnable) {
        this.f5095o00oOo0O = runnable;
    }

    public void o00oOoOO(@o0OO00OO Runnable runnable) {
        this.f5096o00oOo0o = runnable;
    }
}
