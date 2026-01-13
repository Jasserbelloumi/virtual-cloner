package o00ooO00;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.R;
import androidx.core.widget.NestedScrollView;
import o00ooO00.o0O000Oo;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class o0O00O {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final boolean f8605o00oo = false;

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f8606o00ooO = 2;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f8609o00ooO0O = 0;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f8610o00ooO0o = 1;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f8611o00ooOO = 4;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f8612o00ooOO0 = 3;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f8613o00ooOOo = 5;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f8614o00ooOo = 1;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f8615o00ooOo0 = 0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f8616o00ooOoO = 2;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final int f8617o00ooOoo = 3;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f8618o00ooo0 = 5;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f8619o00ooo00 = 4;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final int f8620o00ooo0O = 6;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final int f8621o00ooo0o = 1;

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final int f8622o00oooO = 2;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final String f8623o0O0o = "TouchResponse";

    /* renamed from: o00oo0  reason: collision with root package name */
    public float f8636o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public float f8637o00oo00O;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public final o0O000Oo f8640o00oo0OO;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final float[][] f8608o00ooO00 = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final float[][] f8607o00ooO0 = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f8624o00oOOo0 = 0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f8625o00oOOoO = 0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f8626o00oOo00 = 0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f8634o00oOooO = -1;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f8627o00oOo0O = -1;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f8628o00oOo0o = -1;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public float f8630o00oOoO0 = 0.5f;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public float f8629o00oOoO = 0.5f;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public float f8631o00oOoOO = 0.0f;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public float f8632o00oOoOo = 1.0f;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public boolean f8633o00oOoo0 = false;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public float[] f8635o00oOooo = new float[2];

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public float f8639o00oo0O0 = 4.0f;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public float f8638o00oo0O = 1.2f;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f8641o00oo0Oo = true;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public float f8643o00oo0o0 = 1.0f;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f8642o00oo0o = 0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public float f8644o00oo0oO = 10.0f;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements View.OnTouchListener {
        public o00oOOo0() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements NestedScrollView.o00oOo00 {
        public o00oOOoO() {
        }

        @Override // androidx.core.widget.NestedScrollView.o00oOo00
        public void o00oOOo0(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    public o0O00O(Context context, o0O000Oo o0o000oo, XmlPullParser xmlPullParser) {
        this.f8640o00oo0OO = o0o000oo;
        o00oOo00(context, Xml.asAttributeSet(xmlPullParser));
    }

    public float o00oOOo0(float f, float f2) {
        return (f2 * this.f8632o00oOoOo) + (f * this.f8631o00oOoOO);
    }

    public final void o00oOOoO(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == R.styleable.OnSwipe_touchAnchorId) {
                this.f8634o00oOooO = typedArray.getResourceId(index, this.f8634o00oOooO);
            } else if (index == R.styleable.OnSwipe_touchAnchorSide) {
                int i2 = typedArray.getInt(index, this.f8624o00oOOo0);
                this.f8624o00oOOo0 = i2;
                float[] fArr = f8608o00ooO00[i2];
                this.f8629o00oOoO = fArr[0];
                this.f8630o00oOoO0 = fArr[1];
            } else if (index == R.styleable.OnSwipe_dragDirection) {
                int i3 = typedArray.getInt(index, this.f8625o00oOOoO);
                this.f8625o00oOOoO = i3;
                float[] fArr2 = f8607o00ooO0[i3];
                this.f8631o00oOoOO = fArr2[0];
                this.f8632o00oOoOo = fArr2[1];
            } else if (index == R.styleable.OnSwipe_maxVelocity) {
                this.f8639o00oo0O0 = typedArray.getFloat(index, this.f8639o00oo0O0);
            } else if (index == R.styleable.OnSwipe_maxAcceleration) {
                this.f8638o00oo0O = typedArray.getFloat(index, this.f8638o00oo0O);
            } else if (index == R.styleable.OnSwipe_moveWhenScrollAtTop) {
                this.f8641o00oo0Oo = typedArray.getBoolean(index, this.f8641o00oo0Oo);
            } else if (index == R.styleable.OnSwipe_dragScale) {
                this.f8643o00oo0o0 = typedArray.getFloat(index, this.f8643o00oo0o0);
            } else if (index == R.styleable.OnSwipe_dragThreshold) {
                this.f8644o00oo0oO = typedArray.getFloat(index, this.f8644o00oo0oO);
            } else if (index == R.styleable.OnSwipe_touchRegionId) {
                this.f8627o00oOo0O = typedArray.getResourceId(index, this.f8627o00oOo0O);
            } else if (index == R.styleable.OnSwipe_onTouchUp) {
                this.f8626o00oOo00 = typedArray.getInt(index, this.f8626o00oOo00);
            } else if (index == R.styleable.OnSwipe_nestedScrollFlags) {
                this.f8642o00oo0o = typedArray.getInteger(index, 0);
            } else if (index == R.styleable.OnSwipe_limitBoundsTo) {
                this.f8628o00oOo0o = typedArray.getResourceId(index, 0);
            }
        }
    }

    public final void o00oOo00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OnSwipe);
        o00oOOoO(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public int o00oOo0O() {
        return this.f8642o00oo0o;
    }

    public RectF o00oOo0o(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f8628o00oOo0o;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public float o00oOoO() {
        return this.f8638o00oo0O;
    }

    public int o00oOoO0() {
        return this.f8628o00oOo0o;
    }

    public float o00oOoOO() {
        return this.f8639o00oo0O0;
    }

    public boolean o00oOoOo() {
        return this.f8641o00oo0Oo;
    }

    public float o00oOoo0(float f, float f2) {
        this.f8640o00oo0OO.o00ooo0(this.f8634o00oOooO, this.f8640o00oo0OO.getProgress(), this.f8629o00oOoO, this.f8630o00oOoO0, this.f8635o00oOooo);
        float f3 = this.f8631o00oOoOO;
        if (f3 != 0.0f) {
            float[] fArr = this.f8635o00oOooo;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.f8635o00oOooo;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.f8632o00oOoOo) / fArr2[1];
    }

    public int o00oOooO() {
        return this.f8634o00oOooO;
    }

    public RectF o00oOooo(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f8627o00oOo0O;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public void o00oo(float f, float f2) {
        this.f8637o00oo00O = f;
        this.f8636o00oo0 = f2;
        this.f8633o00oOoo0 = false;
    }

    public void o00oo0(MotionEvent motionEvent, o0O000Oo.o00oo00O o00oo00o, int i, o0O00 o0o00) {
        int i2;
        o00oo00o.o00oOOoO(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f8637o00oo00O = motionEvent.getRawX();
            this.f8636o00oo0 = motionEvent.getRawY();
            this.f8633o00oOoo0 = false;
        } else if (action == 1) {
            this.f8633o00oOoo0 = false;
            o00oo00o.o00oOoO(1000);
            float o00oOooO2 = o00oo00o.o00oOooO();
            float o00oOo002 = o00oo00o.o00oOo00();
            float progress = this.f8640o00oo0OO.getProgress();
            int i3 = this.f8634o00oOooO;
            if (i3 != -1) {
                this.f8640o00oo0OO.o00ooo0(i3, progress, this.f8629o00oOoO, this.f8630o00oOoO0, this.f8635o00oOooo);
            } else {
                float min = Math.min(this.f8640o00oo0OO.getWidth(), this.f8640o00oo0OO.getHeight());
                float[] fArr = this.f8635o00oOooo;
                fArr[1] = this.f8632o00oOoOo * min;
                fArr[0] = min * this.f8631o00oOoOO;
            }
            float f = this.f8631o00oOoOO;
            float[] fArr2 = this.f8635o00oOooo;
            float f2 = f != 0.0f ? o00oOooO2 / fArr2[0] : o00oOo002 / fArr2[1];
            float f3 = !Float.isNaN(f2) ? (f2 / 3.0f) + progress : progress;
            if (f3 != 0.0f && f3 != 1.0f && (i2 = this.f8626o00oOo00) != 3) {
                this.f8640o00oo0OO.o0O000o0(i2, ((double) f3) < 0.5d ? 0.0f : 1.0f, f2);
                if (0.0f < progress && 1.0f > progress) {
                    return;
                }
            } else if (0.0f < f3 && 1.0f > f3) {
                return;
            }
            this.f8640o00oo0OO.setState(o0O000Oo.o00oo0O.FINISHED);
        } else if (action != 2) {
        } else {
            float rawY = motionEvent.getRawY() - this.f8636o00oo0;
            float rawX = motionEvent.getRawX() - this.f8637o00oo00O;
            if (Math.abs((this.f8632o00oOoOo * rawY) + (this.f8631o00oOoOO * rawX)) > this.f8644o00oo0oO || this.f8633o00oOoo0) {
                float progress2 = this.f8640o00oo0OO.getProgress();
                if (!this.f8633o00oOoo0) {
                    this.f8633o00oOoo0 = true;
                    this.f8640o00oo0OO.setProgress(progress2);
                }
                int i4 = this.f8634o00oOooO;
                if (i4 != -1) {
                    this.f8640o00oo0OO.o00ooo0(i4, progress2, this.f8629o00oOoO, this.f8630o00oOoO0, this.f8635o00oOooo);
                } else {
                    float min2 = Math.min(this.f8640o00oo0OO.getWidth(), this.f8640o00oo0OO.getHeight());
                    float[] fArr3 = this.f8635o00oOooo;
                    fArr3[1] = this.f8632o00oOoOo * min2;
                    fArr3[0] = min2 * this.f8631o00oOoOO;
                }
                float f4 = this.f8631o00oOoOO;
                float[] fArr4 = this.f8635o00oOooo;
                if (Math.abs(((this.f8632o00oOoOo * fArr4[1]) + (f4 * fArr4[0])) * this.f8643o00oo0o0) < 0.01d) {
                    float[] fArr5 = this.f8635o00oOooo;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                float max = Math.max(Math.min(progress2 + (this.f8631o00oOoOO != 0.0f ? rawX / this.f8635o00oOooo[0] : rawY / this.f8635o00oOooo[1]), 1.0f), 0.0f);
                if (max != this.f8640o00oo0OO.getProgress()) {
                    this.f8640o00oo0OO.setProgress(max);
                    o00oo00o.o00oOoO(1000);
                    this.f8640o00oo0OO.f8469o00oo0Oo = this.f8631o00oOoOO != 0.0f ? o00oo00o.o00oOooO() / this.f8635o00oOooo[0] : o00oo00o.o00oOo00() / this.f8635o00oOooo[1];
                } else {
                    this.f8640o00oo0OO.f8469o00oo0Oo = 0.0f;
                }
                this.f8637o00oo00O = motionEvent.getRawX();
                this.f8636o00oo0 = motionEvent.getRawY();
            }
        }
    }

    public int o00oo00O() {
        return this.f8627o00oOo0O;
    }

    public void o00oo0O(int i) {
        this.f8634o00oOooO = i;
    }

    public void o00oo0O0(float f, float f2) {
        this.f8633o00oOoo0 = false;
        float progress = this.f8640o00oo0OO.getProgress();
        this.f8640o00oo0OO.o00ooo0(this.f8634o00oOooO, progress, this.f8629o00oOoO, this.f8630o00oOoO0, this.f8635o00oOooo);
        float f3 = this.f8631o00oOoOO;
        float[] fArr = this.f8635o00oOooo;
        float f4 = f3 != 0.0f ? (f * f3) / fArr[0] : (f2 * this.f8632o00oOoOo) / fArr[1];
        if (!Float.isNaN(f4)) {
            progress += f4 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z = progress != 1.0f;
            int i = this.f8626o00oOo00;
            if ((i != 3) && z) {
                this.f8640o00oo0OO.o0O000o0(i, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f4);
            }
        }
    }

    public void o00oo0OO(float f, float f2) {
        float progress = this.f8640o00oo0OO.getProgress();
        if (!this.f8633o00oOoo0) {
            this.f8633o00oOoo0 = true;
            this.f8640o00oo0OO.setProgress(progress);
        }
        this.f8640o00oo0OO.o00ooo0(this.f8634o00oOooO, progress, this.f8629o00oOoO, this.f8630o00oOoO0, this.f8635o00oOooo);
        float f3 = this.f8631o00oOoOO;
        float[] fArr = this.f8635o00oOooo;
        if (Math.abs((this.f8632o00oOoOo * fArr[1]) + (f3 * fArr[0])) < 0.01d) {
            float[] fArr2 = this.f8635o00oOooo;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f4 = this.f8631o00oOoOO;
        float max = Math.max(Math.min(progress + (f4 != 0.0f ? (f * f4) / this.f8635o00oOooo[0] : (f2 * this.f8632o00oOoOo) / this.f8635o00oOooo[1]), 1.0f), 0.0f);
        if (max != this.f8640o00oo0OO.getProgress()) {
            this.f8640o00oo0OO.setProgress(max);
        }
    }

    public void o00oo0Oo(float f, float f2) {
        this.f8637o00oo00O = f;
        this.f8636o00oo0 = f2;
    }

    public void o00oo0o(float f) {
        this.f8639o00oo0O0 = f;
    }

    public void o00oo0o0(float f) {
        this.f8638o00oo0O = f;
    }

    public void o00oo0oO(boolean z) {
        if (z) {
            float[][] fArr = f8607o00ooO0;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f8608o00ooO00;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f8607o00ooO0;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f8608o00ooO00;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f8608o00ooO00[this.f8624o00oOOo0];
        this.f8629o00oOoO = fArr5[0];
        this.f8630o00oOoO0 = fArr5[1];
        float[] fArr6 = f8607o00ooO0[this.f8625o00oOOoO];
        this.f8631o00oOoOO = fArr6[0];
        this.f8632o00oOoOo = fArr6[1];
    }

    public void o00ooO00() {
        View view;
        int i = this.f8634o00oOooO;
        if (i != -1) {
            view = this.f8640o00oo0OO.findViewById(i);
            if (view == null) {
                o00oOoO.o00oOoOO(this.f8640o00oo0OO.getContext(), this.f8634o00oOooO);
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new o00oOOo0());
            nestedScrollView.setOnScrollChangeListener(new o00oOOoO());
        }
    }

    public void o0O0o(float f, float f2) {
        this.f8629o00oOoO = f;
        this.f8630o00oOoO0 = f2;
    }

    public String toString() {
        return this.f8631o00oOoOO + " , " + this.f8632o00oOoOo;
    }
}
