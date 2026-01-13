package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class o0O0O0O extends RecyclerView.o0O000O {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final float f4634o00oOooO = 100.0f;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public RecyclerView f4635o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public Scroller f4636o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final RecyclerView.o0O000Oo f4637o00oOo00 = new o00oOOo0();

    /* loaded from: classes.dex */
    public class o00oOOo0 extends RecyclerView.o0O000Oo {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f4638o00oOOo0 = false;

        public o00oOOo0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0O000Oo
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f4638o00oOOo0) {
                this.f4638o00oOOo0 = false;
                o0O0O0O.this.o00oOooo();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0O000Oo
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f4638o00oOOo0 = true;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o0OoOoOo {
        public o00oOOoO(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.o0OoOoOo
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.o0OoOoOo, androidx.recyclerview.widget.RecyclerView.o0O00OO
        public void onTargetFound(View view, RecyclerView.o0O00OOO o0o00ooo, RecyclerView.o0O00OO.o00oOOo0 o00oooo02) {
            o0O0O0O o0o0o0o = o0O0O0O.this;
            RecyclerView recyclerView = o0o0o0o.f4635o00oOOo0;
            if (recyclerView == null) {
                return;
            }
            int[] o00oOo002 = o0o0o0o.o00oOo00(recyclerView.getLayoutManager(), view);
            int i = o00oOo002[0];
            int i2 = o00oOo002[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (calculateTimeForDeceleration > 0) {
                o00oooo02.o00oOooo(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O000O
    public boolean o00oOOo0(int i, int i2) {
        RecyclerView.o0O00000 layoutManager = this.f4635o00oOOo0.getLayoutManager();
        if (layoutManager == null || this.f4635o00oOOo0.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f4635o00oOOo0.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && o00oOoo0(layoutManager, i, i2);
    }

    public void o00oOOoO(@o0OO00OO RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f4635o00oOOo0;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            o00oOoO0();
        }
        this.f4635o00oOOo0 = recyclerView;
        if (recyclerView != null) {
            o00oOoOo();
            this.f4636o00oOOoO = new Scroller(this.f4635o00oOOo0.getContext(), new DecelerateInterpolator());
            o00oOooo();
        }
    }

    @o0OO00OO
    public abstract int[] o00oOo00(@oo0oO0 RecyclerView.o0O00000 o0o00000, @oo0oO0 View view);

    @o0OO00OO
    public RecyclerView.o0O00OO o00oOo0O(@oo0oO0 RecyclerView.o0O00000 o0o00000) {
        return o00oOo0o(o0o00000);
    }

    @o0OO00OO
    @Deprecated
    public o0OoOoOo o00oOo0o(@oo0oO0 RecyclerView.o0O00000 o0o00000) {
        if (o0o00000 instanceof RecyclerView.o0O00OO.o00oOOoO) {
            return new o00oOOoO(this.f4635o00oOOo0.getContext());
        }
        return null;
    }

    @o0OO00OO
    public abstract View o00oOoO(RecyclerView.o0O00000 o0o00000);

    public final void o00oOoO0() {
        this.f4635o00oOOo0.removeOnScrollListener(this.f4637o00oOo00);
        this.f4635o00oOOo0.setOnFlingListener(null);
    }

    public abstract int o00oOoOO(RecyclerView.o0O00000 o0o00000, int i, int i2);

    public final void o00oOoOo() throws IllegalStateException {
        if (this.f4635o00oOOo0.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f4635o00oOOo0.addOnScrollListener(this.f4637o00oOo00);
        this.f4635o00oOOo0.setOnFlingListener(this);
    }

    public final boolean o00oOoo0(@oo0oO0 RecyclerView.o0O00000 o0o00000, int i, int i2) {
        RecyclerView.o0O00OO o00oOo0O2;
        int o00oOoOO2;
        if (!(o0o00000 instanceof RecyclerView.o0O00OO.o00oOOoO) || (o00oOo0O2 = o00oOo0O(o0o00000)) == null || (o00oOoOO2 = o00oOoOO(o0o00000, i, i2)) == -1) {
            return false;
        }
        o00oOo0O2.setTargetPosition(o00oOoOO2);
        o0o00000.startSmoothScroll(o00oOo0O2);
        return true;
    }

    public int[] o00oOooO(int i, int i2) {
        this.f4636o00oOOoO.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f4636o00oOOoO.getFinalX(), this.f4636o00oOOoO.getFinalY()};
    }

    public void o00oOooo() {
        RecyclerView.o0O00000 layoutManager;
        View o00oOoO2;
        RecyclerView recyclerView = this.f4635o00oOOo0;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (o00oOoO2 = o00oOoO(layoutManager)) == null) {
            return;
        }
        int[] o00oOo002 = o00oOo00(layoutManager, o00oOoO2);
        int i = o00oOo002[0];
        if (i == 0 && o00oOo002[1] == 0) {
            return;
        }
        this.f4635o00oOOo0.smoothScrollBy(i, o00oOo002[1]);
    }
}
