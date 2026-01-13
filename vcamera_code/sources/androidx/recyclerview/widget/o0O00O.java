package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class o0O00O {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f4589o00oOo0O = 0;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f4590o00oOo0o = 1;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f4591o00oOooO = Integer.MIN_VALUE;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final RecyclerView.o0O00000 f4592o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f4593o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Rect f4594o00oOo00;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O00O {
        public o00oOOo0(RecyclerView.o0O00000 o0o00000) {
            super(o0o00000);
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oOo0O(View view) {
            RecyclerView.o0O0000O o0o0000o = (RecyclerView.o0O0000O) view.getLayoutParams();
            return this.f4592o00oOOo0.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) o0o0000o).leftMargin + ((ViewGroup.MarginLayoutParams) o0o0000o).rightMargin;
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oOo0o(View view) {
            RecyclerView.o0O0000O o0o0000o = (RecyclerView.o0O0000O) view.getLayoutParams();
            return this.f4592o00oOOo0.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) o0o0000o).topMargin + ((ViewGroup.MarginLayoutParams) o0o0000o).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oOoO() {
            return this.f4592o00oOOo0.getWidth();
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oOoO0(View view) {
            return this.f4592o00oOOo0.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.o0O0000O) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oOoOO() {
            return this.f4592o00oOOo0.getWidth() - this.f4592o00oOOo0.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oOoOo() {
            return this.f4592o00oOOo0.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oOooO(View view) {
            return this.f4592o00oOOo0.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.o0O0000O) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oOooo() {
            return this.f4592o00oOOo0.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oo0() {
            return this.f4592o00oOOo0.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oo00O() {
            return this.f4592o00oOOo0.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oo0O(View view) {
            this.f4592o00oOOo0.getTransformedBoundingBox(view, true, this.f4594o00oOo00);
            return this.f4594o00oOo00.right;
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oo0OO() {
            return (this.f4592o00oOOo0.getWidth() - this.f4592o00oOOo0.getPaddingLeft()) - this.f4592o00oOOo0.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oo0Oo(View view) {
            this.f4592o00oOOo0.getTransformedBoundingBox(view, true, this.f4594o00oOo00);
            return this.f4594o00oOo00.left;
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public void o00oo0o(int i) {
            this.f4592o00oOOo0.offsetChildrenHorizontal(i);
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public void o00oo0o0(View view, int i) {
            view.offsetLeftAndRight(i);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o0O00O {
        public o00oOOoO(RecyclerView.o0O00000 o0o00000) {
            super(o0o00000);
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oOo0O(View view) {
            RecyclerView.o0O0000O o0o0000o = (RecyclerView.o0O0000O) view.getLayoutParams();
            return this.f4592o00oOOo0.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) o0o0000o).topMargin + ((ViewGroup.MarginLayoutParams) o0o0000o).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oOo0o(View view) {
            RecyclerView.o0O0000O o0o0000o = (RecyclerView.o0O0000O) view.getLayoutParams();
            return this.f4592o00oOOo0.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) o0o0000o).leftMargin + ((ViewGroup.MarginLayoutParams) o0o0000o).rightMargin;
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oOoO() {
            return this.f4592o00oOOo0.getHeight();
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oOoO0(View view) {
            return this.f4592o00oOOo0.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.o0O0000O) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oOoOO() {
            return this.f4592o00oOOo0.getHeight() - this.f4592o00oOOo0.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oOoOo() {
            return this.f4592o00oOOo0.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oOooO(View view) {
            return this.f4592o00oOOo0.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.o0O0000O) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oOooo() {
            return this.f4592o00oOOo0.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oo0() {
            return this.f4592o00oOOo0.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oo00O() {
            return this.f4592o00oOOo0.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oo0O(View view) {
            this.f4592o00oOOo0.getTransformedBoundingBox(view, true, this.f4594o00oOo00);
            return this.f4594o00oOo00.bottom;
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oo0OO() {
            return (this.f4592o00oOOo0.getHeight() - this.f4592o00oOOo0.getPaddingTop()) - this.f4592o00oOOo0.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public int o00oo0Oo(View view) {
            this.f4592o00oOOo0.getTransformedBoundingBox(view, true, this.f4594o00oOo00);
            return this.f4594o00oOo00.top;
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public void o00oo0o(int i) {
            this.f4592o00oOOo0.offsetChildrenVertical(i);
        }

        @Override // androidx.recyclerview.widget.o0O00O
        public void o00oo0o0(View view, int i) {
            view.offsetTopAndBottom(i);
        }
    }

    public o0O00O(RecyclerView.o0O00000 o0o00000) {
        this.f4593o00oOOoO = Integer.MIN_VALUE;
        this.f4594o00oOo00 = new Rect();
        this.f4592o00oOOo0 = o0o00000;
    }

    public /* synthetic */ o0O00O(RecyclerView.o0O00000 o0o00000, o00oOOo0 o00oooo02) {
        this(o0o00000);
    }

    public static o0O00O o00oOOo0(RecyclerView.o0O00000 o0o00000) {
        return new o00oOOo0(o0o00000);
    }

    public static o0O00O o00oOOoO(RecyclerView.o0O00000 o0o00000, int i) {
        if (i != 0) {
            if (i == 1) {
                return new o00oOOoO(o0o00000);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new o00oOOo0(o0o00000);
    }

    public static o0O00O o00oOo00(RecyclerView.o0O00000 o0o00000) {
        return new o00oOOoO(o0o00000);
    }

    public abstract int o00oOo0O(View view);

    public abstract int o00oOo0o(View view);

    public abstract int o00oOoO();

    public abstract int o00oOoO0(View view);

    public abstract int o00oOoOO();

    public abstract int o00oOoOo();

    public RecyclerView.o0O00000 o00oOoo0() {
        return this.f4592o00oOOo0;
    }

    public abstract int o00oOooO(View view);

    public abstract int o00oOooo();

    public abstract int o00oo0();

    public abstract int o00oo00O();

    public abstract int o00oo0O(View view);

    public int o00oo0O0() {
        if (Integer.MIN_VALUE == this.f4593o00oOOoO) {
            return 0;
        }
        return o00oo0OO() - this.f4593o00oOOoO;
    }

    public abstract int o00oo0OO();

    public abstract int o00oo0Oo(View view);

    public abstract void o00oo0o(int i);

    public abstract void o00oo0o0(View view, int i);

    public void o00oo0oO() {
        this.f4593o00oOOoO = o00oo0OO();
    }
}
