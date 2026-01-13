package o00ooOO;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.o0OoOoOo;
import androidx.constraintlayout.widget.R;
import o00oOooO.o0OOooO0;
import o00ooOO.o00oOo00;
/* loaded from: classes.dex */
public class o00oOOoO extends o0OoOoOo {

    /* renamed from: o00oo  reason: collision with root package name */
    public Drawable[] f8806o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public float f8807o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00oOo00.C0113o00oOo00 f8808o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public float f8809o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public Path f8810o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public float f8811o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public ViewOutlineProvider f8812o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public boolean f8813o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public LayerDrawable f8814o00ooO00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public RectF f8815o0O0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends ViewOutlineProvider {
        public o00oOOo0() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = o00oOOoO.this.getWidth();
            int height = o00oOOoO.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (o00oOOoO.this.f8809o00oo0Oo * Math.min(width, height)) / 2.0f);
        }
    }

    /* renamed from: o00ooOO.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0112o00oOOoO extends ViewOutlineProvider {
        public C0112o00oOOoO() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, o00oOOoO.this.getWidth(), o00oOOoO.this.getHeight(), o00oOOoO.this.f8811o00oo0o0);
        }
    }

    public o00oOOoO(Context context) {
        super(context);
        this.f8808o00oo0O0 = new o00oOo00.C0113o00oOo00();
        this.f8807o00oo0O = 0.0f;
        this.f8809o00oo0Oo = 0.0f;
        this.f8811o00oo0o0 = Float.NaN;
        this.f8813o00ooO0 = true;
        o00oOo00(context, null);
    }

    public o00oOOoO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8808o00oo0O0 = new o00oOo00.C0113o00oOo00();
        this.f8807o00oo0O = 0.0f;
        this.f8809o00oo0Oo = 0.0f;
        this.f8811o00oo0o0 = Float.NaN;
        this.f8813o00ooO0 = true;
        o00oOo00(context, attributeSet);
    }

    public o00oOOoO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8808o00oo0O0 = new o00oOo00.C0113o00oOo00();
        this.f8807o00oo0O = 0.0f;
        this.f8809o00oo0Oo = 0.0f;
        this.f8811o00oo0o0 = Float.NaN;
        this.f8813o00ooO0 = true;
        o00oOo00(context, attributeSet);
    }

    private void setOverlay(boolean z) {
        this.f8813o00ooO0 = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.f8808o00oo0O0.f8834o00oOo0o;
    }

    public float getCrossfade() {
        return this.f8807o00oo0O;
    }

    public float getRound() {
        return this.f8811o00oo0o0;
    }

    public float getRoundPercent() {
        return this.f8809o00oo0Oo;
    }

    public float getSaturation() {
        return this.f8808o00oo0O0.f8833o00oOo0O;
    }

    public float getWarmth() {
        return this.f8808o00oo0O0.f8835o00oOoO0;
    }

    public final void o00oOo00(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ImageFilterView_crossfade) {
                    this.f8807o00oo0O = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == R.styleable.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f8813o00ooO0));
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f8806o00oo = drawableArr;
                drawableArr[0] = getDrawable();
                this.f8806o00oo[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f8806o00oo);
                this.f8814o00ooO00 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f8807o00oo0O * 255.0f));
                super.setImageDrawable(this.f8814o00ooO00);
            }
        }
    }

    public void setBrightness(float f) {
        o00oOo00.C0113o00oOo00 c0113o00oOo00 = this.f8808o00oo0O0;
        c0113o00oOo00.f8836o00oOooO = f;
        c0113o00oOo00.o00oOo00(this);
    }

    public void setContrast(float f) {
        o00oOo00.C0113o00oOo00 c0113o00oOo00 = this.f8808o00oo0O0;
        c0113o00oOo00.f8834o00oOo0o = f;
        c0113o00oOo00.o00oOo00(this);
    }

    public void setCrossfade(float f) {
        this.f8807o00oo0O = f;
        if (this.f8806o00oo != null) {
            if (!this.f8813o00ooO0) {
                this.f8814o00ooO00.getDrawable(0).setAlpha((int) ((1.0f - this.f8807o00oo0O) * 255.0f));
            }
            this.f8814o00ooO00.getDrawable(1).setAlpha((int) (this.f8807o00oo0O * 255.0f));
            super.setImageDrawable(this.f8814o00ooO00);
        }
    }

    @o0OOooO0(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f8811o00oo0o0 = f;
            float f2 = this.f8809o00oo0Oo;
            this.f8809o00oo0Oo = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f8811o00oo0o0 != f;
        this.f8811o00oo0o0 = f;
        if (f != 0.0f) {
            if (this.f8810o00oo0o == null) {
                this.f8810o00oo0o = new Path();
            }
            if (this.f8815o0O0o == null) {
                this.f8815o0O0o = new RectF();
            }
            if (this.f8812o00oo0oO == null) {
                C0112o00oOOoO c0112o00oOOoO = new C0112o00oOOoO();
                this.f8812o00oo0oO = c0112o00oOOoO;
                setOutlineProvider(c0112o00oOOoO);
            }
            setClipToOutline(true);
            this.f8815o0O0o.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f8810o00oo0o.reset();
            Path path = this.f8810o00oo0o;
            RectF rectF = this.f8815o0O0o;
            float f3 = this.f8811o00oo0o0;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @o0OOooO0(21)
    public void setRoundPercent(float f) {
        boolean z = this.f8809o00oo0Oo != f;
        this.f8809o00oo0Oo = f;
        if (f != 0.0f) {
            if (this.f8810o00oo0o == null) {
                this.f8810o00oo0o = new Path();
            }
            if (this.f8815o0O0o == null) {
                this.f8815o0O0o = new RectF();
            }
            if (this.f8812o00oo0oO == null) {
                o00oOOo0 o00oooo02 = new o00oOOo0();
                this.f8812o00oo0oO = o00oooo02;
                setOutlineProvider(o00oooo02);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f8809o00oo0Oo) / 2.0f;
            this.f8815o0O0o.set(0.0f, 0.0f, width, height);
            this.f8810o00oo0o.reset();
            this.f8810o00oo0o.addRoundRect(this.f8815o0O0o, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        o00oOo00.C0113o00oOo00 c0113o00oOo00 = this.f8808o00oo0O0;
        c0113o00oOo00.f8833o00oOo0O = f;
        c0113o00oOo00.o00oOo00(this);
    }

    public void setWarmth(float f) {
        o00oOo00.C0113o00oOo00 c0113o00oOo00 = this.f8808o00oo0O0;
        c0113o00oOo00.f8835o00oOoO0 = f;
        c0113o00oOo00.o00oOo00(this);
    }
}
