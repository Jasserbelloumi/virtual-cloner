package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.R;
import java.lang.ref.WeakReference;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f1012o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f1013o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public WeakReference<View> f1014o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public o00oOOo0 f1015o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public LayoutInflater f1016o00oo0o0;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        void o00oOOo0(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1013o00oo0O0 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewStubCompat, i, 0);
        this.f1012o00oo0O = obtainStyledAttributes.getResourceId(R.styleable.ViewStubCompat_android_inflatedId, -1);
        this.f1013o00oo0O0 = obtainStyledAttributes.getResourceId(R.styleable.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(R.styleable.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(@o00oOooO.oo0oO0 Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1012o00oo0O;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1016o00oo0o0;
    }

    public int getLayoutResource() {
        return this.f1013o00oo0O0;
    }

    public View o00oOOo0() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f1013o00oo0O0 != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f1016o00oo0o0;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f1013o00oo0O0, viewGroup, false);
                int i = this.f1012o00oo0O;
                if (i != -1) {
                    inflate.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f1014o00oo0Oo = new WeakReference<>(inflate);
                o00oOOo0 o00oooo02 = this.f1015o00oo0o;
                if (o00oooo02 != null) {
                    o00oooo02.o00oOOo0(this, inflate);
                }
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1012o00oo0O = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1016o00oo0o0 = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1013o00oo0O0 = i;
    }

    public void setOnInflateListener(o00oOOo0 o00oooo02) {
        this.f1015o00oo0o = o00oooo02;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1014o00oo0Oo;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            o00oOOo0();
        }
    }
}
