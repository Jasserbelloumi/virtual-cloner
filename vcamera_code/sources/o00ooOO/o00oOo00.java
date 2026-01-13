package o00ooOO;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.R;
import o00oOooO.o0OOooO0;
/* loaded from: classes.dex */
public class o00oOo00 extends AppCompatImageView {

    /* renamed from: o00oo  reason: collision with root package name */
    public RectF f8818o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f8819o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public C0113o00oOo00 f8820o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public float f8821o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public float f8822o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public float f8823o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public Path f8824o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public LayerDrawable f8825o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public Drawable[] f8826o00ooO00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public ViewOutlineProvider f8827o0O0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends ViewOutlineProvider {
        public o00oOOo0() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = o00oOo00.this.getWidth();
            int height = o00oOo00.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (o00oOo00.this.f8823o00oo0o0 * Math.min(width, height)) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends ViewOutlineProvider {
        public o00oOOoO() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, o00oOo00.this.getWidth(), o00oOo00.this.getHeight(), o00oOo00.this.f8822o00oo0o);
        }
    }

    /* renamed from: o00ooOO.o00oOo00$o00oOo00  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0113o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public float[] f8830o00oOOo0 = new float[20];

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public ColorMatrix f8831o00oOOoO = new ColorMatrix();

        /* renamed from: o00oOo00  reason: collision with root package name */
        public ColorMatrix f8832o00oOo00 = new ColorMatrix();

        /* renamed from: o00oOooO  reason: collision with root package name */
        public float f8836o00oOooO = 1.0f;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public float f8833o00oOo0O = 1.0f;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public float f8834o00oOo0o = 1.0f;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public float f8835o00oOoO0 = 1.0f;

        public final void o00oOOo0(float f) {
            float[] fArr = this.f8830o00oOOo0;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public final void o00oOOoO(float f) {
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.f8830o00oOOo0;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public void o00oOo00(ImageView imageView) {
            boolean z;
            this.f8831o00oOOoO.reset();
            float f = this.f8833o00oOo0O;
            boolean z2 = true;
            if (f != 1.0f) {
                o00oOOoO(f);
                this.f8831o00oOOoO.set(this.f8830o00oOOo0);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.f8834o00oOo0o;
            if (f2 != 1.0f) {
                this.f8832o00oOo00.setScale(f2, f2, f2, 1.0f);
                this.f8831o00oOOoO.postConcat(this.f8832o00oOo00);
                z = true;
            }
            float f3 = this.f8835o00oOoO0;
            if (f3 != 1.0f) {
                o00oOooO(f3);
                this.f8832o00oOo00.set(this.f8830o00oOOo0);
                this.f8831o00oOOoO.postConcat(this.f8832o00oOo00);
                z = true;
            }
            float f4 = this.f8836o00oOooO;
            if (f4 != 1.0f) {
                o00oOOo0(f4);
                this.f8832o00oOo00.set(this.f8830o00oOOo0);
                this.f8831o00oOOoO.postConcat(this.f8832o00oOo00);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f8831o00oOOoO));
            } else {
                imageView.clearColorFilter();
            }
        }

        public final void o00oOooO(float f) {
            float log;
            float f2;
            if (f <= 0.0f) {
                f = 0.01f;
            }
            float f3 = (5000.0f / f) / 100.0f;
            if (f3 > 66.0f) {
                double d = f3 - 60.0f;
                f2 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                log = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
            } else {
                log = (((float) Math.log(f3)) * 99.4708f) - 161.11957f;
                f2 = 255.0f;
            }
            float log2 = f3 < 66.0f ? f3 > 19.0f ? (((float) Math.log(f3 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
            float min = Math.min(255.0f, Math.max(f2, 0.0f));
            float min2 = Math.min(255.0f, Math.max(log, 0.0f));
            float min3 = Math.min(255.0f, Math.max(log2, 0.0f));
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max((((float) Math.log(50.0f)) * 99.4708f) - 161.11957f, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log(40.0f)) * 138.51773f) - 305.0448f, 0.0f));
            float[] fArr = this.f8830o00oOOo0;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    public o00oOo00(Context context) {
        super(context);
        this.f8820o00oo0O0 = new C0113o00oOo00();
        this.f8819o00oo0O = true;
        this.f8821o00oo0Oo = 0.0f;
        this.f8823o00oo0o0 = 0.0f;
        this.f8822o00oo0o = Float.NaN;
        o00oOo0O(context, null);
    }

    public o00oOo00(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8820o00oo0O0 = new C0113o00oOo00();
        this.f8819o00oo0O = true;
        this.f8821o00oo0Oo = 0.0f;
        this.f8823o00oo0o0 = 0.0f;
        this.f8822o00oo0o = Float.NaN;
        o00oOo0O(context, attributeSet);
    }

    public o00oOo00(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8820o00oo0O0 = new C0113o00oOo00();
        this.f8819o00oo0O = true;
        this.f8821o00oo0Oo = 0.0f;
        this.f8823o00oo0o0 = 0.0f;
        this.f8822o00oo0o = Float.NaN;
        o00oOo0O(context, attributeSet);
    }

    private void setOverlay(boolean z) {
        this.f8819o00oo0O = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.f8820o00oo0O0.f8836o00oOooO;
    }

    public float getContrast() {
        return this.f8820o00oo0O0.f8834o00oOo0o;
    }

    public float getCrossfade() {
        return this.f8821o00oo0Oo;
    }

    public float getRound() {
        return this.f8822o00oo0o;
    }

    public float getRoundPercent() {
        return this.f8823o00oo0o0;
    }

    public float getSaturation() {
        return this.f8820o00oo0O0.f8833o00oOo0O;
    }

    public float getWarmth() {
        return this.f8820o00oo0O0.f8835o00oOoO0;
    }

    public final void o00oOo0O(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ImageFilterView_crossfade) {
                    this.f8821o00oo0Oo = obtainStyledAttributes.getFloat(index, 0.0f);
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
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f8819o00oo0O));
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f8826o00ooO00 = drawableArr;
                drawableArr[0] = getDrawable();
                this.f8826o00ooO00[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f8826o00ooO00);
                this.f8825o00ooO0 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f8821o00oo0Oo * 255.0f));
                super.setImageDrawable(this.f8825o00ooO0);
            }
        }
    }

    public void setBrightness(float f) {
        C0113o00oOo00 c0113o00oOo00 = this.f8820o00oo0O0;
        c0113o00oOo00.f8836o00oOooO = f;
        c0113o00oOo00.o00oOo00(this);
    }

    public void setContrast(float f) {
        C0113o00oOo00 c0113o00oOo00 = this.f8820o00oo0O0;
        c0113o00oOo00.f8834o00oOo0o = f;
        c0113o00oOo00.o00oOo00(this);
    }

    public void setCrossfade(float f) {
        this.f8821o00oo0Oo = f;
        if (this.f8826o00ooO00 != null) {
            if (!this.f8819o00oo0O) {
                this.f8825o00ooO0.getDrawable(0).setAlpha((int) ((1.0f - this.f8821o00oo0Oo) * 255.0f));
            }
            this.f8825o00ooO0.getDrawable(1).setAlpha((int) (this.f8821o00oo0Oo * 255.0f));
            super.setImageDrawable(this.f8825o00ooO0);
        }
    }

    @o0OOooO0(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f8822o00oo0o = f;
            float f2 = this.f8823o00oo0o0;
            this.f8823o00oo0o0 = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f8822o00oo0o != f;
        this.f8822o00oo0o = f;
        if (f != 0.0f) {
            if (this.f8824o00oo0oO == null) {
                this.f8824o00oo0oO = new Path();
            }
            if (this.f8818o00oo == null) {
                this.f8818o00oo = new RectF();
            }
            if (this.f8827o0O0o == null) {
                o00oOOoO o00ooooo2 = new o00oOOoO();
                this.f8827o0O0o = o00ooooo2;
                setOutlineProvider(o00ooooo2);
            }
            setClipToOutline(true);
            this.f8818o00oo.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f8824o00oo0oO.reset();
            Path path = this.f8824o00oo0oO;
            RectF rectF = this.f8818o00oo;
            float f3 = this.f8822o00oo0o;
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
        boolean z = this.f8823o00oo0o0 != f;
        this.f8823o00oo0o0 = f;
        if (f != 0.0f) {
            if (this.f8824o00oo0oO == null) {
                this.f8824o00oo0oO = new Path();
            }
            if (this.f8818o00oo == null) {
                this.f8818o00oo = new RectF();
            }
            if (this.f8827o0O0o == null) {
                o00oOOo0 o00oooo02 = new o00oOOo0();
                this.f8827o0O0o = o00oooo02;
                setOutlineProvider(o00oooo02);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f8823o00oo0o0) / 2.0f;
            this.f8818o00oo.set(0.0f, 0.0f, width, height);
            this.f8824o00oo0oO.reset();
            this.f8824o00oo0oO.addRoundRect(this.f8818o00oo, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        C0113o00oOo00 c0113o00oOo00 = this.f8820o00oo0O0;
        c0113o00oOo00.f8833o00oOo0O = f;
        c0113o00oOo00.o00oOo00(this);
    }

    public void setWarmth(float f) {
        C0113o00oOo00 c0113o00oOo00 = this.f8820o00oo0O0;
        c0113o00oOo00.f8835o00oOoO0 = f;
        c0113o00oOo00.o00oOo00(this);
    }
}
