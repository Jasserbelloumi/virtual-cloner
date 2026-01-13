package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00ooO0 extends RecyclerView.o0 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f4475o00oOo0O = 1;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f4476o00oOo0o = "DividerItem";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int[] f4477o00oOoO0 = {16843284};

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f4478o00oOooO = 0;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Drawable f4479o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f4480o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Rect f4481o00oOo00 = new Rect();

    public o00ooO0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4477o00oOoO0);
        this.f4479o00oOOo0 = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        o00oOoOo(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0O00OOO o0o00ooo) {
        Drawable drawable = this.f4479o00oOOo0;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f4480o00oOOoO == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    public final void o00oOo0o(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f4481o00oOo00);
            int round = Math.round(childAt.getTranslationX()) + this.f4481o00oOo00.right;
            this.f4479o00oOOo0.setBounds(round - this.f4479o00oOOo0.getIntrinsicWidth(), i, round, height);
            this.f4479o00oOOo0.draw(canvas);
        }
        canvas.restore();
    }

    @o0OO00OO
    public Drawable o00oOoO() {
        return this.f4479o00oOOo0;
    }

    public final void o00oOoO0(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f4481o00oOo00);
            int round = Math.round(childAt.getTranslationY()) + this.f4481o00oOo00.bottom;
            this.f4479o00oOOo0.setBounds(i, round - this.f4479o00oOOo0.getIntrinsicHeight(), width, round);
            this.f4479o00oOOo0.draw(canvas);
        }
        canvas.restore();
    }

    public void o00oOoOO(@oo0oO0 Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f4479o00oOOo0 = drawable;
    }

    public void o00oOoOo(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f4480o00oOOoO = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0O00OOO o0o00ooo) {
        if (recyclerView.getLayoutManager() == null || this.f4479o00oOOo0 == null) {
            return;
        }
        if (this.f4480o00oOOoO == 1) {
            o00oOoO0(canvas, recyclerView);
        } else {
            o00oOo0o(canvas, recyclerView);
        }
    }
}
