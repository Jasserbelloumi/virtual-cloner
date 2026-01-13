package o00ooO00;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.o00oOOoO;
import o00ooO00.o0O000Oo;
/* loaded from: classes.dex */
public class o0O000O extends o00oOOoO implements o00oOo00, o0O000Oo.o00oo0O0 {

    /* renamed from: o00ooO  reason: collision with root package name */
    public View[] f8443o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public boolean f8444o00ooO0;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public boolean f8445o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public float f8446o00ooO0o;

    public o0O000O(Context context) {
        super(context);
        this.f8444o00ooO0 = false;
        this.f8445o00ooO0O = false;
    }

    public o0O000O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8444o00ooO0 = false;
        this.f8445o00ooO0O = false;
        o00oo0OO(attributeSet);
    }

    public o0O000O(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8444o00ooO0 = false;
        this.f8445o00ooO0O = false;
        o00oo0OO(attributeSet);
    }

    @Override // o00ooO00.o00oOo00
    public float getProgress() {
        return this.f8446o00ooO0o;
    }

    @Override // o00ooO00.o0O000Oo.o00oo0O0
    public void o00oOOo0(o0O000Oo o0o000oo, int i) {
    }

    @Override // o00ooO00.o0O000Oo.o00oo0O0
    public void o00oOOoO(o0O000Oo o0o000oo, int i, int i2) {
    }

    @Override // o00ooO00.o0O000Oo.o00oo0O0
    public void o00oOo00(o0O000Oo o0o000oo, int i, int i2, float f) {
    }

    @Override // o00ooO00.o0O000Oo.o00oo0O0
    public void o00oOooO(o0O000Oo o0o000oo, int i, boolean z, float f) {
    }

    @Override // androidx.constraintlayout.widget.o00oOOoO
    public void o00oo0OO(AttributeSet attributeSet) {
        super.o00oo0OO(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.MotionHelper_onShow) {
                    this.f8444o00ooO0 = obtainStyledAttributes.getBoolean(index, this.f8444o00ooO0);
                } else if (index == R.styleable.MotionHelper_onHide) {
                    this.f8445o00ooO0O = obtainStyledAttributes.getBoolean(index, this.f8445o00ooO0O);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void o00ooO(View view, float f) {
    }

    public boolean o00ooO0O() {
        return this.f8445o00ooO0O;
    }

    public boolean o00ooO0o() {
        return this.f8444o00ooO0;
    }

    @Override // o00ooO00.o00oOo00
    public void setProgress(float f) {
        this.f8446o00ooO0o = f;
        int i = 0;
        if (this.f1931o00oo0O > 0) {
            this.f8443o00ooO = o00oo0((ConstraintLayout) getParent());
            while (i < this.f1931o00oo0O) {
                o00ooO(this.f8443o00ooO[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof o0O000O)) {
                o00ooO(childAt, f);
            }
            i++;
        }
    }
}
