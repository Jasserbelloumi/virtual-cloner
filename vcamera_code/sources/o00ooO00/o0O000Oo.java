package o00ooO00;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.o00oo00O;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooO.o00oOo0O;
import o00ooO.o00oOoO;
import o00ooO00.o0O00;
import o0O000oo.o0O0oo0o;
/* loaded from: classes.dex */
public class o0O000Oo extends ConstraintLayout implements o0O0oo0o {

    /* renamed from: o0O0O0o  reason: collision with root package name */
    public static final int f8447o0O0O0o = 0;

    /* renamed from: o0O0O0oO  reason: collision with root package name */
    public static final int f8448o0O0O0oO = 1;

    /* renamed from: o0O0O0oo  reason: collision with root package name */
    public static final int f8449o0O0O0oo = 2;

    /* renamed from: o0O0OO  reason: collision with root package name */
    public static final String f8450o0O0OO = "MotionLayout";

    /* renamed from: o0O0OO0  reason: collision with root package name */
    public static final int f8451o0O0OO0 = 4;

    /* renamed from: o0O0OO0O  reason: collision with root package name */
    public static final int f8452o0O0OO0O = 5;

    /* renamed from: o0O0OOO  reason: collision with root package name */
    public static boolean f8453o0O0OOO = false;

    /* renamed from: o0O0OOO0  reason: collision with root package name */
    public static final boolean f8454o0O0OOO0 = false;

    /* renamed from: o0O0OOOo  reason: collision with root package name */
    public static final int f8455o0O0OOOo = 0;

    /* renamed from: o0O0OOo  reason: collision with root package name */
    public static final int f8456o0O0OOo = 1;

    /* renamed from: o0O0OOoO  reason: collision with root package name */
    public static final int f8457o0O0OOoO = 2;

    /* renamed from: o0O0OOoo  reason: collision with root package name */
    public static final int f8458o0O0OOoo = 50;

    /* renamed from: o0O0Oo  reason: collision with root package name */
    public static final float f8459o0O0Oo = 1.0E-5f;

    /* renamed from: o0O0Oo0  reason: collision with root package name */
    public static final int f8460o0O0Oo0 = 1;

    /* renamed from: o0O0Oo0O  reason: collision with root package name */
    public static final int f8461o0O0Oo0O = 2;

    /* renamed from: o0O0Oo0o  reason: collision with root package name */
    public static final int f8462o0O0Oo0o = 3;

    /* renamed from: o0OooO0  reason: collision with root package name */
    public static final int f8463o0OooO0 = 0;

    /* renamed from: o0ooO  reason: collision with root package name */
    public static final int f8464o0ooO = 3;

    /* renamed from: o0  reason: collision with root package name */
    public int f8465o0;

    /* renamed from: o00oo  reason: collision with root package name */
    public int f8466o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Interpolator f8467o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o0O00 f8468o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public float f8469o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f8470o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f8471o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f8472o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public float f8473o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public HashMap<View, o0O000> f8474o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public boolean f8475o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public long f8476o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public float f8477o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public long f8478o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public float f8479o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public float f8480o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public boolean f8481o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public boolean f8482o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public boolean f8483o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public o00oo0O0 f8484o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public float f8485o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public float f8486o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public int f8487o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public o00oOo0O f8488o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public boolean f8489o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public o00oo.o00oo0OO f8490o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public o00oOo00 f8491o00oooOo;

    /* renamed from: o00oooo  reason: collision with root package name */
    public boolean f8492o00oooo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public o00ooO00.o00oo00O f8493o00oooo0;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public int f8494o00ooooO;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public int f8495o00ooooo;

    /* renamed from: o0O00  reason: collision with root package name */
    public float f8496o0O00;

    /* renamed from: o0O000  reason: collision with root package name */
    public float f8497o0O000;

    /* renamed from: o0O00000  reason: collision with root package name */
    public int f8498o0O00000;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public boolean f8499o0O0000O;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public float f8500o0O0000o;

    /* renamed from: o0O000O  reason: collision with root package name */
    public long f8501o0O000O;

    /* renamed from: o0O000Oo  reason: collision with root package name */
    public boolean f8502o0O000Oo;

    /* renamed from: o0O000o  reason: collision with root package name */
    public ArrayList<o00oo0O0> f8503o0O000o;

    /* renamed from: o0O000o0  reason: collision with root package name */
    public ArrayList<o0O000O> f8504o0O000o0;

    /* renamed from: o0O000oo  reason: collision with root package name */
    public long f8505o0O000oo;

    /* renamed from: o0O00O  reason: collision with root package name */
    public boolean f8506o0O00O;

    /* renamed from: o0O00O0  reason: collision with root package name */
    public int f8507o0O00O0;

    /* renamed from: o0O00O0o  reason: collision with root package name */
    public boolean f8508o0O00O0o;

    /* renamed from: o0O00OO  reason: collision with root package name */
    public int f8509o0O00OO;

    /* renamed from: o0O00OOO  reason: collision with root package name */
    public int f8510o0O00OOO;

    /* renamed from: o0O00Oo  reason: collision with root package name */
    public int f8511o0O00Oo;

    /* renamed from: o0O00OoO  reason: collision with root package name */
    public int f8512o0O00OoO;

    /* renamed from: o0O00Ooo  reason: collision with root package name */
    public int f8513o0O00Ooo;

    /* renamed from: o0O00o  reason: collision with root package name */
    public o00oo0OO f8514o0O00o;

    /* renamed from: o0O00o00  reason: collision with root package name */
    public float f8515o0O00o00;

    /* renamed from: o0O00o0O  reason: collision with root package name */
    public o00ooO00.o00oo0O0 f8516o0O00o0O;

    /* renamed from: o0O00o0o  reason: collision with root package name */
    public boolean f8517o0O00o0o;

    /* renamed from: o0O00oO0  reason: collision with root package name */
    public o00oo0O f8518o0O00oO0;

    /* renamed from: o0O0O0O  reason: collision with root package name */
    public o00oOoO f8519o0O0O0O;

    /* renamed from: o0O0O0Oo  reason: collision with root package name */
    public View f8520o0O0O0Oo;

    /* renamed from: o0O0O0o0  reason: collision with root package name */
    public ArrayList<Integer> f8521o0O0O0o0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f8522o0O0o;

    /* renamed from: o0O0oo0o  reason: collision with root package name */
    public RectF f8523o0O0oo0o;

    /* renamed from: o0OoO00O  reason: collision with root package name */
    public float f8524o0OoO00O;

    /* renamed from: o0OoOoOO  reason: collision with root package name */
    public ArrayList<o0O000O> f8525o0OoOoOO;

    /* renamed from: o0OoOoOo  reason: collision with root package name */
    public float f8526o0OoOoOo;

    /* renamed from: o0oO0O0o  reason: collision with root package name */
    public boolean f8527o0oO0O0o;

    /* renamed from: o0oO0Ooo  reason: collision with root package name */
    public int f8528o0oO0Ooo;

    /* renamed from: o0ooOoOO  reason: collision with root package name */
    public int f8529o0ooOoOO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ View f8531o00oo0O0;

        public o00oOOo0(View view) {
            this.f8531o00oo0O0 = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8531o00oo0O0.setNestedScrollingEnabled(true);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f8532o00oOOo0;

        static {
            int[] iArr = new int[o00oo0O.values().length];
            f8532o00oOOo0 = iArr;
            try {
                iArr[o00oo0O.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8532o00oOOo0[o00oo0O.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8532o00oOOo0[o00oo0O.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8532o00oOOo0[o00oo0O.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends o0OoOoOo {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public float f8533o00oOOo0 = 0.0f;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public float f8534o00oOOoO = 0.0f;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public float f8535o00oOo00;

        public o00oOo00() {
        }

        @Override // o00ooO00.o0OoOoOo, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = this.f8533o00oOOo0;
            if (f2 > 0.0f) {
                float f3 = this.f8535o00oOo00;
                if (f2 / f3 < f) {
                    f = f2 / f3;
                }
                o0O000Oo.this.f8469o00oo0Oo = f2 - (f3 * f);
                return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.f8534o00oOOoO;
            }
            float f4 = this.f8535o00oOo00;
            if ((-f2) / f4 < f) {
                f = (-f2) / f4;
            }
            o0O000Oo.this.f8469o00oo0Oo = (f4 * f) + f2;
            return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.f8534o00oOOoO;
        }

        @Override // o00ooO00.o0OoOoOo
        public float o00oOOo0() {
            return o0O000Oo.this.f8469o00oo0Oo;
        }

        public void o00oOOoO(float f, float f2, float f3) {
            this.f8533o00oOOo0 = f;
            this.f8534o00oOOoO = f2;
            this.f8535o00oOo00 = f3;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O {

        /* renamed from: o0O0o  reason: collision with root package name */
        public static final int f8537o0O0o = 16;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public float[] f8538o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int[] f8539o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public float[] f8540o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public Paint f8541o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public Paint f8542o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public Paint f8543o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public Paint f8544o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public Paint f8545o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public float[] f8546o00oOoOo;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public Path f8548o00oOooO;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f8552o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public DashPathEffect f8553o00oo0O0;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public int f8556o00oo0o;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public final int f8547o00oOoo0 = -21965;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public final int f8549o00oOooo = -2067046;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public final int f8551o00oo00O = -13391360;

        /* renamed from: o00oo0  reason: collision with root package name */
        public final int f8550o00oo0 = 1996488704;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public final int f8554o00oo0OO = 10;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public Rect f8555o00oo0Oo = new Rect();

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public boolean f8557o00oo0o0 = false;

        public o00oOo0O() {
            this.f8556o00oo0o = 1;
            Paint paint = new Paint();
            this.f8541o00oOo0O = paint;
            paint.setAntiAlias(true);
            this.f8541o00oOo0O.setColor(-21965);
            this.f8541o00oOo0O.setStrokeWidth(2.0f);
            this.f8541o00oOo0O.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f8542o00oOo0o = paint2;
            paint2.setAntiAlias(true);
            this.f8542o00oOo0o.setColor(-2067046);
            this.f8542o00oOo0o.setStrokeWidth(2.0f);
            this.f8542o00oOo0o.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f8544o00oOoO0 = paint3;
            paint3.setAntiAlias(true);
            this.f8544o00oOoO0.setColor(-13391360);
            this.f8544o00oOoO0.setStrokeWidth(2.0f);
            this.f8544o00oOoO0.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f8543o00oOoO = paint4;
            paint4.setAntiAlias(true);
            this.f8543o00oOoO.setColor(-13391360);
            this.f8543o00oOoO.setTextSize(o0O000Oo.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f8546o00oOoOo = new float[8];
            Paint paint5 = new Paint();
            this.f8545o00oOoOO = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f8553o00oo0O0 = dashPathEffect;
            this.f8544o00oOoO0.setPathEffect(dashPathEffect);
            this.f8540o00oOo00 = new float[100];
            this.f8539o00oOOoO = new int[50];
            if (this.f8557o00oo0o0) {
                this.f8541o00oOo0O.setStrokeWidth(8.0f);
                this.f8545o00oOoOO.setStrokeWidth(8.0f);
                this.f8542o00oOo0o.setStrokeWidth(8.0f);
                this.f8556o00oo0o = 4;
            }
        }

        public void o00oOOo0(Canvas canvas, HashMap<View, o0O000> hashMap, int i, int i2) {
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            canvas.save();
            if (!o0O000Oo.this.isInEditMode() && (i2 & 1) == 2) {
                String str = o0O000Oo.this.getContext().getResources().getResourceName(o0O000Oo.this.f8472o00oo0oO) + ":" + o0O000Oo.this.getProgress();
                canvas.drawText(str, 10.0f, o0O000Oo.this.getHeight() - 30, this.f8543o00oOoO);
                canvas.drawText(str, 11.0f, o0O000Oo.this.getHeight() - 29, this.f8541o00oOo0O);
            }
            for (o0O000 o0o000 : hashMap.values()) {
                int o00oOooo2 = o0o000.o00oOooo();
                if (i2 > 0 && o00oOooo2 == 0) {
                    o00oOooo2 = 1;
                }
                if (o00oOooo2 != 0) {
                    this.f8552o00oo0O = o0o000.o00oOo0O(this.f8540o00oOo00, this.f8539o00oOOoO);
                    if (o00oOooo2 >= 1) {
                        int i3 = i / 16;
                        float[] fArr = this.f8538o00oOOo0;
                        if (fArr == null || fArr.length != i3 * 2) {
                            this.f8538o00oOOo0 = new float[i3 * 2];
                            this.f8548o00oOooO = new Path();
                        }
                        int i4 = this.f8556o00oo0o;
                        canvas.translate(i4, i4);
                        this.f8541o00oOo0O.setColor(1996488704);
                        this.f8545o00oOoOO.setColor(1996488704);
                        this.f8542o00oOo0o.setColor(1996488704);
                        this.f8544o00oOoO0.setColor(1996488704);
                        o0o000.o00oOo0o(this.f8538o00oOOo0, i3);
                        o00oOOoO(canvas, o00oOooo2, this.f8552o00oo0O, o0o000);
                        this.f8541o00oOo0O.setColor(-21965);
                        this.f8542o00oOo0o.setColor(-2067046);
                        this.f8545o00oOoOO.setColor(-2067046);
                        this.f8544o00oOoO0.setColor(-13391360);
                        int i5 = this.f8556o00oo0o;
                        canvas.translate(-i5, -i5);
                        o00oOOoO(canvas, o00oOooo2, this.f8552o00oo0O, o0o000);
                        if (o00oOooo2 == 5) {
                            o00oOoOo(canvas, o0o000);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void o00oOOoO(Canvas canvas, int i, int i2, o0O000 o0o000) {
            if (i == 4) {
                o00oOooO(canvas);
            }
            if (i == 2) {
                o00oOoO0(canvas);
            }
            if (i == 3) {
                o00oOo0O(canvas);
            }
            o00oOo00(canvas);
            o00oOoo0(canvas, i, i2, o0o000);
        }

        public final void o00oOo00(Canvas canvas) {
            canvas.drawLines(this.f8538o00oOOo0, this.f8541o00oOo0O);
        }

        public final void o00oOo0O(Canvas canvas) {
            float[] fArr = this.f8538o00oOOo0;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f8544o00oOoO0);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f8544o00oOoO0);
        }

        public final void o00oOo0o(Canvas canvas, float f, float f2) {
            float[] fArr = this.f8538o00oOOo0;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("");
            o00oOOo02.append(((int) (((min2 * 100.0f) / Math.abs(f5 - f3)) + 0.5d)) / 100.0f);
            String sb = o00oOOo02.toString();
            o00oo00O(sb, this.f8543o00oOoO);
            canvas.drawText(sb, ((min2 / 2.0f) - (this.f8555o00oo0Oo.width() / 2)) + min, f2 - 20.0f, this.f8543o00oOoO);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f8544o00oOoO0);
            StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("");
            o00oOOo03.append(((int) (((max2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
            String sb2 = o00oOOo03.toString();
            o00oo00O(sb2, this.f8543o00oOoO);
            canvas.drawText(sb2, f + 5.0f, max - ((max2 / 2.0f) - (this.f8555o00oo0Oo.height() / 2)), this.f8543o00oOoO);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f8544o00oOoO0);
        }

        public final void o00oOoO(Canvas canvas, float f, float f2) {
            float[] fArr = this.f8538o00oOOo0;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("");
            o00oOOo02.append(((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            String sb = o00oOOo02.toString();
            o00oo00O(sb, this.f8543o00oOoO);
            canvas.drawTextOnPath(sb, path, (hypot2 / 2.0f) - (this.f8555o00oo0Oo.width() / 2), -20.0f, this.f8543o00oOoO);
            canvas.drawLine(f, f2, f10, f11, this.f8544o00oOoO0);
        }

        public final void o00oOoO0(Canvas canvas) {
            float[] fArr = this.f8538o00oOOo0;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f8544o00oOoO0);
        }

        public final void o00oOoOO(Canvas canvas, float f, float f2, int i, int i2) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("");
            o00oOOo02.append(((int) ((((f - (i / 2)) * 100.0f) / (o0O000Oo.this.getWidth() - i)) + 0.5d)) / 100.0f);
            String sb = o00oOOo02.toString();
            o00oo00O(sb, this.f8543o00oOoO);
            canvas.drawText(sb, ((f / 2.0f) - (this.f8555o00oo0Oo.width() / 2)) + 0.0f, f2 - 20.0f, this.f8543o00oOoO);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.f8544o00oOoO0);
            StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("");
            o00oOOo03.append(((int) ((((f2 - (i2 / 2)) * 100.0f) / (o0O000Oo.this.getHeight() - i2)) + 0.5d)) / 100.0f);
            String sb2 = o00oOOo03.toString();
            o00oo00O(sb2, this.f8543o00oOoO);
            canvas.drawText(sb2, f + 5.0f, 0.0f - ((f2 / 2.0f) - (this.f8555o00oo0Oo.height() / 2)), this.f8543o00oOoO);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.f8544o00oOoO0);
        }

        public final void o00oOoOo(Canvas canvas, o0O000 o0o000) {
            this.f8548o00oOooO.reset();
            for (int i = 0; i <= 50; i++) {
                o0o000.o00oOoO0(i / 50, this.f8546o00oOoOo, 0);
                Path path = this.f8548o00oOooO;
                float[] fArr = this.f8546o00oOoOo;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f8548o00oOooO;
                float[] fArr2 = this.f8546o00oOoOo;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f8548o00oOooO;
                float[] fArr3 = this.f8546o00oOoOo;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f8548o00oOooO;
                float[] fArr4 = this.f8546o00oOoOo;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f8548o00oOooO.close();
            }
            this.f8541o00oOo0O.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f8548o00oOooO, this.f8541o00oOo0O);
            canvas.translate(-2.0f, -2.0f);
            this.f8541o00oOo0O.setColor(o0.o00oOOo0.f6865o00oOo00);
            canvas.drawPath(this.f8548o00oOooO, this.f8541o00oOo0O);
        }

        public final void o00oOoo0(Canvas canvas, int i, int i2, o0O000 o0o000) {
            int i3;
            int i4;
            int i5;
            float f;
            float f2;
            View view = o0o000.f8347o00oOOo0;
            if (view != null) {
                i3 = view.getWidth();
                i4 = o0o000.f8347o00oOOo0.getHeight();
            } else {
                i3 = 0;
                i4 = 0;
            }
            for (int i6 = 1; i6 < i2 - 1; i6++) {
                if (i != 4 || this.f8539o00oOOoO[i6 - 1] != 0) {
                    float[] fArr = this.f8540o00oOo00;
                    int i7 = i6 * 2;
                    float f3 = fArr[i7];
                    float f4 = fArr[i7 + 1];
                    this.f8548o00oOooO.reset();
                    this.f8548o00oOooO.moveTo(f3, f4 + 10.0f);
                    this.f8548o00oOooO.lineTo(f3 + 10.0f, f4);
                    this.f8548o00oOooO.lineTo(f3, f4 - 10.0f);
                    this.f8548o00oOooO.lineTo(f3 - 10.0f, f4);
                    this.f8548o00oOooO.close();
                    int i8 = i6 - 1;
                    o0o000.o00oo0OO(i8);
                    if (i == 4) {
                        int i9 = this.f8539o00oOOoO[i8];
                        if (i9 == 1) {
                            o00oOoO(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (i9 == 2) {
                            o00oOo0o(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (i9 == 3) {
                            i5 = 3;
                            f = f4;
                            f2 = f3;
                            o00oOoOO(canvas, f3 - 0.0f, f4 - 0.0f, i3, i4);
                            canvas.drawPath(this.f8548o00oOooO, this.f8545o00oOoOO);
                        }
                        i5 = 3;
                        f = f4;
                        f2 = f3;
                        canvas.drawPath(this.f8548o00oOooO, this.f8545o00oOoOO);
                    } else {
                        i5 = 3;
                        f = f4;
                        f2 = f3;
                    }
                    if (i == 2) {
                        o00oOoO(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == i5) {
                        o00oOo0o(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 6) {
                        o00oOoOO(canvas, f2 - 0.0f, f - 0.0f, i3, i4);
                    }
                    canvas.drawPath(this.f8548o00oOooO, this.f8545o00oOoOO);
                }
            }
            float[] fArr2 = this.f8538o00oOOo0;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f8542o00oOo0o);
                float[] fArr3 = this.f8538o00oOOo0;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f8542o00oOo0o);
            }
        }

        public final void o00oOooO(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.f8552o00oo0O; i++) {
                int i2 = this.f8539o00oOOoO[i];
                if (i2 == 1) {
                    z = true;
                }
                if (i2 == 2) {
                    z2 = true;
                }
            }
            if (z) {
                o00oOoO0(canvas);
            }
            if (z2) {
                o00oOo0O(canvas);
            }
        }

        public final void o00oOooo(Canvas canvas, float f, float f2, float f3, float f4) {
            canvas.drawRect(f, f2, f3, f4, this.f8544o00oOoO0);
            canvas.drawLine(f, f2, f3, f4, this.f8544o00oOoO0);
        }

        public void o00oo00O(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f8555o00oo0Oo);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f8562o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f8563o00oOo0o;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o00ooO.o00oo00O f8559o00oOOo0 = new o00ooO.o00oo00O();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o00ooO.o00oo00O f8560o00oOOoO = new o00ooO.o00oo00O();

        /* renamed from: o00oOo00  reason: collision with root package name */
        public androidx.constraintlayout.widget.o00oOoO f8561o00oOo00 = null;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public androidx.constraintlayout.widget.o00oOoO f8565o00oOooO = null;

        public o00oOoO() {
        }

        public void o00oOOo0() {
            int childCount = o0O000Oo.this.getChildCount();
            o0O000Oo.this.f8474o00ooO0.clear();
            for (int i = 0; i < childCount; i++) {
                View childAt = o0O000Oo.this.getChildAt(i);
                o0O000Oo.this.f8474o00ooO0.put(childAt, new o0O000(childAt));
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = o0O000Oo.this.getChildAt(i2);
                o0O000 o0o000 = o0O000Oo.this.f8474o00ooO0.get(childAt2);
                if (o0o000 != null) {
                    if (this.f8561o00oOo00 != null) {
                        o00ooO.o00oOoO o00oOo0o2 = o00oOo0o(this.f8559o00oOOo0, childAt2);
                        if (o00oOo0o2 != null) {
                            o0o000.o00ooOo(o00oOo0o2, this.f8561o00oOo00);
                        } else if (o0O000Oo.this.f8487o00ooo0O != 0) {
                            o00ooO00.o00oOoO.o00oOoO0();
                            o00ooO00.o00oOoO.o00oOoo0(childAt2);
                            childAt2.getClass();
                        }
                    }
                    if (this.f8565o00oOooO != null) {
                        o00ooO.o00oOoO o00oOo0o3 = o00oOo0o(this.f8560o00oOOoO, childAt2);
                        if (o00oOo0o3 != null) {
                            o0o000.o00ooOO(o00oOo0o3, this.f8565o00oOooO);
                        } else if (o0O000Oo.this.f8487o00ooo0O != 0) {
                            o00ooO00.o00oOoO.o00oOoO0();
                            o00ooO00.o00oOoO.o00oOoo0(childAt2);
                            childAt2.getClass();
                        }
                    }
                }
            }
        }

        public void o00oOOoO(o00ooO.o00oo00O o00oo00o, o00ooO.o00oo00O o00oo00o2) {
            ArrayList<o00ooO.o00oOoO> oo0oO02 = o00oo00o.oo0oO0();
            HashMap<o00ooO.o00oOoO, o00ooO.o00oOoO> hashMap = new HashMap<>();
            hashMap.put(o00oo00o, o00oo00o2);
            o00oo00o2.oo0oO0().clear();
            o00oo00o2.o00oo0(o00oo00o, hashMap);
            Iterator<o00ooO.o00oOoO> it = oo0oO02.iterator();
            while (it.hasNext()) {
                o00ooO.o00oOoO next = it.next();
                o00ooO.o00oOoO o00oooo02 = next instanceof o00ooO.o00oOOo0 ? new o00ooO.o00oOOo0() : next instanceof o00ooO.o00oo0OO ? new o00ooO.o00oo0OO() : next instanceof o00ooO.o00oo0 ? new o00ooO.o00oo0() : next instanceof o00ooO.o00oo0O0 ? new o00ooO.o00oo0O() : new o00ooO.o00oOoO();
                o00oo00o2.o00oOOo0(o00oooo02);
                hashMap.put(next, o00oooo02);
            }
            Iterator<o00ooO.o00oOoO> it2 = oo0oO02.iterator();
            while (it2.hasNext()) {
                o00ooO.o00oOoO next2 = it2.next();
                hashMap.get(next2).o00oo0(next2, hashMap);
            }
        }

        public final void o00oOo00(String str, o00ooO.o00oo00O o00oo00o) {
            androidx.appcompat.widget.o00oOo0O.o00oOOo0(str, " ").append(o00ooO00.o00oOoO.o00oOoo0((View) o00oo00o.o00oo()));
            o00oo00o.toString();
            int size = o00oo00o.oo0oO0().size();
            for (int i = 0; i < size; i++) {
                o00ooO.o00oOoO o00oooo2 = o00oo00o.oo0oO0().get(i);
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("");
                o00oOOo02.append(o00oooo2.f7703o00ooo0.f7634o00oOo0o != null ? RequestConfiguration.MAX_AD_CONTENT_RATING_T : "_");
                StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo02.toString());
                o00oOOo03.append(o00oooo2.f7706o00ooo0o.f7634o00oOo0o != null ? "B" : "_");
                android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo03.toString()).append(o00oooo2.f7704o00ooo00.f7634o00oOo0o != null ? "L" : "_");
                o00ooO.o00oOo0O o00ooo0o2 = o00oooo2.f7705o00ooo0O.f7634o00oOo0o;
                View view = (View) o00oooo2.o00oo();
                String o00oOoo02 = o00ooO00.o00oOoO.o00oOoo0(view);
                if (view instanceof TextView) {
                    StringBuilder o00oOOo04 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(o00oOoo02, "(");
                    o00oOOo04.append((Object) ((TextView) view).getText());
                    o00oOOo04.append(")");
                }
                o00oooo2.toString();
            }
        }

        public final void o00oOo0O(String str, o00ooO.o00oOoO o00oooo2) {
            String str2;
            String str3;
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(" ");
            String str4 = "__";
            if (o00oooo2.f7703o00ooo0.f7634o00oOo0o != null) {
                StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0(RequestConfiguration.MAX_AD_CONTENT_RATING_T);
                o00oOOo03.append(o00oooo2.f7703o00ooo0.f7634o00oOo0o.f7633o00oOo0O == o00oOo0O.o00oOOoO.TOP ? RequestConfiguration.MAX_AD_CONTENT_RATING_T : "B");
                str2 = o00oOOo03.toString();
            } else {
                str2 = "__";
            }
            o00oOOo02.append(str2);
            StringBuilder o00oOOo04 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo02.toString());
            if (o00oooo2.f7706o00ooo0o.f7634o00oOo0o != null) {
                StringBuilder o00oOOo05 = android.support.v4.media.o00oOo0O.o00oOOo0("B");
                o00oOOo05.append(o00oooo2.f7706o00ooo0o.f7634o00oOo0o.f7633o00oOo0O == o00oOo0O.o00oOOoO.TOP ? RequestConfiguration.MAX_AD_CONTENT_RATING_T : "B");
                str3 = o00oOOo05.toString();
            } else {
                str3 = "__";
            }
            o00oOOo04.append(str3);
            StringBuilder o00oOOo06 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo04.toString());
            if (o00oooo2.f7704o00ooo00.f7634o00oOo0o != null) {
                StringBuilder o00oOOo07 = android.support.v4.media.o00oOo0O.o00oOOo0("L");
                o00oOOo07.append(o00oooo2.f7704o00ooo00.f7634o00oOo0o.f7633o00oOo0O == o00oOo0O.o00oOOoO.LEFT ? "L" : "R");
                str4 = o00oOOo07.toString();
            }
            o00oOOo06.append(str4);
            if (o00oooo2.f7705o00ooo0O.f7634o00oOo0o != null) {
                android.support.v4.media.o00oOo0O.o00oOOo0("R").append(o00oooo2.f7705o00ooo0O.f7634o00oOo0o.f7633o00oOo0O == o00oOo0O.o00oOOoO.LEFT ? "L" : "R");
            }
            o00oooo2.toString();
        }

        public o00ooO.o00oOoO o00oOo0o(o00ooO.o00oo00O o00oo00o, View view) {
            if (o00oo00o.o00oo() == view) {
                return o00oo00o;
            }
            ArrayList<o00ooO.o00oOoO> oo0oO02 = o00oo00o.oo0oO0();
            int size = oo0oO02.size();
            for (int i = 0; i < size; i++) {
                o00ooO.o00oOoO o00oooo2 = oo0oO02.get(i);
                if (o00oooo2.o00oo() == view) {
                    return o00oooo2;
                }
            }
            return null;
        }

        public boolean o00oOoO(int i, int i2) {
            return (i == this.f8562o00oOo0O && i2 == this.f8563o00oOo0o) ? false : true;
        }

        public void o00oOoO0(o00ooO.o00oo00O o00oo00o, androidx.constraintlayout.widget.o00oOoO o00oooo2, androidx.constraintlayout.widget.o00oOoO o00oooo3) {
            this.f8561o00oOo00 = o00oooo2;
            this.f8565o00oOooO = o00oooo3;
            this.f8559o00oOOo0 = new o00ooO.o00oo00O();
            this.f8560o00oOOoO = new o00ooO.o00oo00O();
            this.f8559o00oOOo0.o0OOO0o0(o0O000Oo.this.mLayoutWidget.o0OO0oOO());
            this.f8560o00oOOoO.o0OOO0o0(o0O000Oo.this.mLayoutWidget.o0OO0oOO());
            this.f8559o00oOOo0.o0OO00Oo();
            this.f8560o00oOOoO.o0OO00Oo();
            o00oOOoO(o0O000Oo.this.mLayoutWidget, this.f8559o00oOOo0);
            o00oOOoO(o0O000Oo.this.mLayoutWidget, this.f8560o00oOOoO);
            if (o0O000Oo.this.f8479o00ooOO0 > 0.5d) {
                if (o00oooo2 != null) {
                    o00oOooo(this.f8559o00oOOo0, o00oooo2);
                }
                o00oOooo(this.f8560o00oOOoO, o00oooo3);
            } else {
                o00oOooo(this.f8560o00oOOoO, o00oooo3);
                if (o00oooo2 != null) {
                    o00oOooo(this.f8559o00oOOo0, o00oooo2);
                }
            }
            this.f8559o00oOOo0.o0OOOOoO(o0O000Oo.this.isRtl());
            this.f8559o00oOOo0.o0OOOO0();
            this.f8560o00oOOoO.o0OOOOoO(o0O000Oo.this.isRtl());
            this.f8560o00oOOoO.o0OOOO0();
            ViewGroup.LayoutParams layoutParams = o0O000Oo.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    o00ooO.o00oo00O o00oo00o2 = this.f8559o00oOOo0;
                    o00oOoO.o00oOOoO o00ooooo2 = o00oOoO.o00oOOoO.WRAP_CONTENT;
                    o00oo00o2.o0O0o0OO(o00ooooo2);
                    this.f8560o00oOOoO.o0O0o0OO(o00ooooo2);
                }
                if (layoutParams.height == -2) {
                    o00ooO.o00oo00O o00oo00o3 = this.f8559o00oOOo0;
                    o00oOoO.o00oOOoO o00ooooo3 = o00oOoO.o00oOOoO.WRAP_CONTENT;
                    o00oo00o3.o0O0oOoo(o00ooooo3);
                    this.f8560o00oOOoO.o0O0oOoo(o00ooooo3);
                }
            }
        }

        public void o00oOoOO(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            o0O000Oo o0o000oo = o0O000Oo.this;
            o0o000oo.f8512o0O00OoO = mode;
            o0o000oo.f8513o0O00Ooo = mode2;
            int optimizationLevel = o0o000oo.getOptimizationLevel();
            o0O000Oo o0o000oo2 = o0O000Oo.this;
            if (o0o000oo2.f8470o00oo0o == o0o000oo2.getStartState()) {
                o0O000Oo.this.resolveSystem(this.f8560o00oOOoO, optimizationLevel, i, i2);
                if (this.f8561o00oOo00 != null) {
                    o0O000Oo.this.resolveSystem(this.f8559o00oOOo0, optimizationLevel, i, i2);
                }
            } else {
                if (this.f8561o00oOo00 != null) {
                    o0O000Oo.this.resolveSystem(this.f8559o00oOOo0, optimizationLevel, i, i2);
                }
                o0O000Oo.this.resolveSystem(this.f8560o00oOOoO, optimizationLevel, i, i2);
            }
            boolean z = false;
            if (((o0O000Oo.this.getParent() instanceof o0O000Oo) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                o0O000Oo o0o000oo3 = o0O000Oo.this;
                o0o000oo3.f8512o0O00OoO = mode;
                o0o000oo3.f8513o0O00Ooo = mode2;
                if (o0o000oo3.f8470o00oo0o == o0o000oo3.getStartState()) {
                    o0O000Oo.this.resolveSystem(this.f8560o00oOOoO, optimizationLevel, i, i2);
                    if (this.f8561o00oOo00 != null) {
                        o0O000Oo.this.resolveSystem(this.f8559o00oOOo0, optimizationLevel, i, i2);
                    }
                } else {
                    if (this.f8561o00oOo00 != null) {
                        o0O000Oo.this.resolveSystem(this.f8559o00oOOo0, optimizationLevel, i, i2);
                    }
                    o0O000Oo.this.resolveSystem(this.f8560o00oOOoO, optimizationLevel, i, i2);
                }
                o0O000Oo.this.f8509o0O00OO = this.f8559o00oOOo0.o0OoO00O();
                o0O000Oo.this.f8510o0O00OOO = this.f8559o00oOOo0.o00ooOO();
                o0O000Oo.this.f8511o0O00Oo = this.f8560o00oOOoO.o0OoO00O();
                o0O000Oo.this.f8528o0oO0Ooo = this.f8560o00oOOoO.o00ooOO();
                o0O000Oo o0o000oo4 = o0O000Oo.this;
                o0o000oo4.f8506o0O00O = (o0o000oo4.f8509o0O00OO == o0o000oo4.f8511o0O00Oo && o0o000oo4.f8510o0O00OOO == o0o000oo4.f8528o0oO0Ooo) ? false : true;
            }
            o0O000Oo o0o000oo5 = o0O000Oo.this;
            int i3 = o0o000oo5.f8509o0O00OO;
            int i4 = o0o000oo5.f8510o0O00OOO;
            int i5 = o0o000oo5.f8512o0O00OoO;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                i3 = (int) ((o0o000oo5.f8515o0O00o00 * (o0o000oo5.f8511o0O00Oo - i3)) + i3);
            }
            int i6 = o0o000oo5.f8513o0O00Ooo;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                i4 = (int) ((o0o000oo5.f8515o0O00o00 * (o0o000oo5.f8528o0oO0Ooo - i4)) + i4);
            }
            boolean z2 = this.f8559o00oOOo0.o0OOO0() || this.f8560o00oOOoO.o0OOO0();
            if (this.f8559o00oOOo0.o0OOO00() || this.f8560o00oOOoO.o0OOO00()) {
                z = true;
            }
            o0O000Oo.this.resolveMeasuredDimension(i, i2, i3, i4, z2, z);
        }

        public void o00oOoOo() {
            o00oOoOO(o0O000Oo.this.f8522o0O0o, o0O000Oo.this.f8466o00oo);
            o0O000Oo.this.o0OoOoOO();
        }

        public void o00oOoo0(int i, int i2) {
            this.f8562o00oOo0O = i;
            this.f8563o00oOo0o = i2;
        }

        public final void o00oOooO(String str, ConstraintLayout.o00oOOoO o00ooooo2) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(" ");
            o00oOOo02.append(o00ooooo2.f1809o00oo0O != -1 ? "SS" : "__");
            StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo02.toString());
            o00oOOo03.append(o00ooooo2.f1810o00oo0O0 != -1 ? "|SE" : "|__");
            StringBuilder o00oOOo04 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo03.toString());
            o00oOOo04.append(o00ooooo2.f1812o00oo0Oo != -1 ? "|ES" : "|__");
            StringBuilder o00oOOo05 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo04.toString());
            o00oOOo05.append(o00ooooo2.f1814o00oo0o0 != -1 ? "|EE" : "|__");
            StringBuilder o00oOOo06 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo05.toString());
            o00oOOo06.append(o00ooooo2.f1804o00oOooO != -1 ? "|LL" : "|__");
            StringBuilder o00oOOo07 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo06.toString());
            o00oOOo07.append(o00ooooo2.f1797o00oOo0O != -1 ? "|LR" : "|__");
            StringBuilder o00oOOo08 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo07.toString());
            o00oOOo08.append(o00ooooo2.f1798o00oOo0o != -1 ? "|RL" : "|__");
            StringBuilder o00oOOo09 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo08.toString());
            o00oOOo09.append(o00ooooo2.f1800o00oOoO0 != -1 ? "|RR" : "|__");
            StringBuilder o00oOOo010 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo09.toString());
            o00oOOo010.append(o00ooooo2.f1799o00oOoO != -1 ? "|TT" : "|__");
            StringBuilder o00oOOo011 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo010.toString());
            o00oOOo011.append(o00ooooo2.f1801o00oOoOO != -1 ? "|TB" : "|__");
            android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo011.toString()).append(o00ooooo2.f1802o00oOoOo != -1 ? "|BT" : "|__");
        }

        public final void o00oOooo(o00ooO.o00oo00O o00oo00o, androidx.constraintlayout.widget.o00oOoO o00oooo2) {
            SparseArray<o00ooO.o00oOoO> sparseArray = new SparseArray<>();
            o00oo00O.o00oOOo0 o00oooo02 = new o00oo00O.o00oOOo0(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, o00oo00o);
            sparseArray.put(o0O000Oo.this.getId(), o00oo00o);
            Iterator<o00ooO.o00oOoO> it = o00oo00o.oo0oO0().iterator();
            while (it.hasNext()) {
                o00ooO.o00oOoO next = it.next();
                sparseArray.put(((View) next.o00oo()).getId(), next);
            }
            Iterator<o00ooO.o00oOoO> it2 = o00oo00o.oo0oO0().iterator();
            while (it2.hasNext()) {
                o00ooO.o00oOoO next2 = it2.next();
                View view = (View) next2.o00oo();
                o00oooo2.o00oo0OO(view.getId(), o00oooo02);
                next2.o0O0ooOO(o00oooo2.o0O00O(view.getId()));
                next2.o0O0o00(o00oooo2.o0ooOoOO(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.o00oOOoO) {
                    o00oooo2.o00oo00O((androidx.constraintlayout.widget.o00oOOoO) view, next2, o00oooo02, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).o00ooO0();
                    }
                }
                o00oooo02.resolveLayoutDirection(o0O000Oo.this.getLayoutDirection());
                o0O000Oo.this.applyConstraintsFromLayoutParams(false, view, next2, o00oooo02, sparseArray);
                next2.o0O0ooO0(o00oooo2.o0O00O0o(view.getId()) == 1 ? view.getVisibility() : o00oooo2.o0OoO00O(view.getId()));
            }
            Iterator<o00ooO.o00oOoO> it3 = o00oo00o.oo0oO0().iterator();
            while (it3.hasNext()) {
                o00ooO.o00oOoO next3 = it3.next();
                if (next3 instanceof o00ooO.o00ooO0) {
                    o00ooO.o00oo0O0 o00oo0o02 = (o00ooO.o00oo0O0) next3;
                    ((androidx.constraintlayout.widget.o00oOOoO) next3.o00oo()).o00ooO00(o00oo00o, o00oo0o02, sparseArray);
                    ((o00ooO.o00ooO0) o00oo0o02).o0OO00OO();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0 implements o00oo00O {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static o00oo0 f8566o00oOOoO = new o00oo0();

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public VelocityTracker f8567o00oOOo0;

        public static o00oo0 o00oOoOO() {
            f8566o00oOOoO.f8567o00oOOo0 = VelocityTracker.obtain();
            return f8566o00oOOoO;
        }

        @Override // o00ooO00.o0O000Oo.o00oo00O
        public void clear() {
            VelocityTracker velocityTracker = this.f8567o00oOOo0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // o00ooO00.o0O000Oo.o00oo00O
        public float o00oOOo0(int i) {
            if (this.f8567o00oOOo0 != null) {
                return o00oOOo0(i);
            }
            return 0.0f;
        }

        @Override // o00ooO00.o0O000Oo.o00oo00O
        public void o00oOOoO(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f8567o00oOOo0;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // o00ooO00.o0O000Oo.o00oo00O
        public float o00oOo00() {
            VelocityTracker velocityTracker = this.f8567o00oOOo0;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // o00ooO00.o0O000Oo.o00oo00O
        public void o00oOo0O(int i, float f) {
            VelocityTracker velocityTracker = this.f8567o00oOOo0;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i, f);
            }
        }

        @Override // o00ooO00.o0O000Oo.o00oo00O
        public float o00oOo0o(int i) {
            VelocityTracker velocityTracker = this.f8567o00oOOo0;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i);
            }
            return 0.0f;
        }

        @Override // o00ooO00.o0O000Oo.o00oo00O
        public void o00oOoO(int i) {
            VelocityTracker velocityTracker = this.f8567o00oOOo0;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        @Override // o00ooO00.o0O000Oo.o00oo00O
        public void o00oOoO0() {
            VelocityTracker velocityTracker = this.f8567o00oOOo0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f8567o00oOOo0 = null;
            }
        }

        @Override // o00ooO00.o0O000Oo.o00oo00O
        public float o00oOooO() {
            VelocityTracker velocityTracker = this.f8567o00oOOo0;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oo00O {
        void clear();

        float o00oOOo0(int i);

        void o00oOOoO(MotionEvent motionEvent);

        float o00oOo00();

        void o00oOo0O(int i, float f);

        float o00oOo0o(int i);

        void o00oOoO(int i);

        void o00oOoO0();

        float o00oOooO();
    }

    /* loaded from: classes.dex */
    public enum o00oo0O {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* loaded from: classes.dex */
    public interface o00oo0O0 {
        void o00oOOo0(o0O000Oo o0o000oo, int i);

        void o00oOOoO(o0O000Oo o0o000oo, int i, int i2);

        void o00oOo00(o0O000Oo o0o000oo, int i, int i2, float f);

        void o00oOooO(o0O000Oo o0o000oo, int i, boolean z, float f);
    }

    /* loaded from: classes.dex */
    public class o00oo0OO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public float f8568o00oOOo0 = Float.NaN;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public float f8569o00oOOoO = Float.NaN;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f8570o00oOo00 = -1;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f8576o00oOooO = -1;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final String f8571o00oOo0O = "motion.progress";

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final String f8572o00oOo0o = "motion.velocity";

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public final String f8574o00oOoO0 = "motion.StartState";

        /* renamed from: o00oOoO  reason: collision with root package name */
        public final String f8573o00oOoO = "motion.EndState";

        public o00oo0OO() {
        }

        public void o00oOOo0() {
            int i = this.f8570o00oOo00;
            if (i != -1 || this.f8576o00oOooO != -1) {
                if (i == -1) {
                    o0O000Oo.this.o0O000oo(this.f8576o00oOooO);
                } else {
                    int i2 = this.f8576o00oOooO;
                    if (i2 == -1) {
                        o0O000Oo.this.setState(i, -1, -1);
                    } else {
                        o0O000Oo.this.o0O000Oo(i, i2);
                    }
                }
                o0O000Oo.this.setState(o00oo0O.SETUP);
            }
            if (Float.isNaN(this.f8569o00oOOoO)) {
                if (Float.isNaN(this.f8568o00oOOo0)) {
                    return;
                }
                o0O000Oo.this.setProgress(this.f8568o00oOOo0);
                return;
            }
            o0O000Oo.this.o0OoOoOo(this.f8568o00oOOo0, this.f8569o00oOOoO);
            this.f8568o00oOOo0 = Float.NaN;
            this.f8569o00oOOoO = Float.NaN;
            this.f8570o00oOo00 = -1;
            this.f8576o00oOooO = -1;
        }

        public Bundle o00oOOoO() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f8568o00oOOo0);
            bundle.putFloat("motion.velocity", this.f8569o00oOOoO);
            bundle.putInt("motion.StartState", this.f8570o00oOo00);
            bundle.putInt("motion.EndState", this.f8576o00oOooO);
            return bundle;
        }

        public void o00oOo00() {
            this.f8576o00oOooO = o0O000Oo.this.f8472o00oo0oO;
            o0O000Oo o0o000oo = o0O000Oo.this;
            this.f8570o00oOo00 = o0o000oo.f8471o00oo0o0;
            this.f8569o00oOOoO = o0o000oo.getVelocity();
            this.f8568o00oOOo0 = o0O000Oo.this.getProgress();
        }

        public void o00oOo0O(float f) {
            this.f8568o00oOOo0 = f;
        }

        public void o00oOo0o(int i) {
            this.f8570o00oOo00 = i;
        }

        public void o00oOoO(float f) {
            this.f8569o00oOOoO = f;
        }

        public void o00oOoO0(Bundle bundle) {
            this.f8568o00oOOo0 = bundle.getFloat("motion.progress");
            this.f8569o00oOOoO = bundle.getFloat("motion.velocity");
            this.f8570o00oOo00 = bundle.getInt("motion.StartState");
            this.f8576o00oOooO = bundle.getInt("motion.EndState");
        }

        public void o00oOooO(int i) {
            this.f8576o00oOooO = i;
        }
    }

    public o0O000Oo(@oo0oO0 Context context) {
        super(context);
        this.f8469o00oo0Oo = 0.0f;
        this.f8471o00oo0o0 = -1;
        this.f8470o00oo0o = -1;
        this.f8472o00oo0oO = -1;
        this.f8522o0O0o = 0;
        this.f8466o00oo = 0;
        this.f8475o00ooO00 = true;
        this.f8474o00ooO0 = new HashMap<>();
        this.f8476o00ooO0O = 0L;
        this.f8477o00ooO0o = 1.0f;
        this.f8473o00ooO = 0.0f;
        this.f8479o00ooOO0 = 0.0f;
        this.f8480o00ooOOo = 0.0f;
        this.f8481o00ooOo = false;
        this.f8483o00ooOoO = false;
        this.f8487o00ooo0O = 0;
        this.f8489o00oooO = false;
        this.f8490o00oooOO = new o00oo.o00oo0OO();
        this.f8491o00oooOo = new o00oOo00();
        this.f8492o00oooo = true;
        this.f8499o0O0000O = false;
        this.f8502o0O000Oo = false;
        this.f8525o0OoOoOO = null;
        this.f8504o0O000o0 = null;
        this.f8503o0O000o = null;
        this.f8529o0ooOoOO = 0;
        this.f8505o0O000oo = -1L;
        this.f8496o0O00 = 0.0f;
        this.f8507o0O00O0 = 0;
        this.f8524o0OoO00O = 0.0f;
        this.f8508o0O00O0o = false;
        this.f8506o0O00O = false;
        this.f8516o0O00o0O = new o00ooO00.o00oo0O0();
        this.f8517o0O00o0o = false;
        this.f8518o0O00oO0 = o00oo0O.UNDEFINED;
        this.f8519o0O0O0O = new o00oOoO();
        this.f8527o0oO0O0o = false;
        this.f8523o0O0oo0o = new RectF();
        this.f8520o0O0O0Oo = null;
        this.f8521o0O0O0o0 = new ArrayList<>();
        o00oooo(null);
    }

    public o0O000Oo(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8469o00oo0Oo = 0.0f;
        this.f8471o00oo0o0 = -1;
        this.f8470o00oo0o = -1;
        this.f8472o00oo0oO = -1;
        this.f8522o0O0o = 0;
        this.f8466o00oo = 0;
        this.f8475o00ooO00 = true;
        this.f8474o00ooO0 = new HashMap<>();
        this.f8476o00ooO0O = 0L;
        this.f8477o00ooO0o = 1.0f;
        this.f8473o00ooO = 0.0f;
        this.f8479o00ooOO0 = 0.0f;
        this.f8480o00ooOOo = 0.0f;
        this.f8481o00ooOo = false;
        this.f8483o00ooOoO = false;
        this.f8487o00ooo0O = 0;
        this.f8489o00oooO = false;
        this.f8490o00oooOO = new o00oo.o00oo0OO();
        this.f8491o00oooOo = new o00oOo00();
        this.f8492o00oooo = true;
        this.f8499o0O0000O = false;
        this.f8502o0O000Oo = false;
        this.f8525o0OoOoOO = null;
        this.f8504o0O000o0 = null;
        this.f8503o0O000o = null;
        this.f8529o0ooOoOO = 0;
        this.f8505o0O000oo = -1L;
        this.f8496o0O00 = 0.0f;
        this.f8507o0O00O0 = 0;
        this.f8524o0OoO00O = 0.0f;
        this.f8508o0O00O0o = false;
        this.f8506o0O00O = false;
        this.f8516o0O00o0O = new o00ooO00.o00oo0O0();
        this.f8517o0O00o0o = false;
        this.f8518o0O00oO0 = o00oo0O.UNDEFINED;
        this.f8519o0O0O0O = new o00oOoO();
        this.f8527o0oO0O0o = false;
        this.f8523o0O0oo0o = new RectF();
        this.f8520o0O0O0Oo = null;
        this.f8521o0O0O0o0 = new ArrayList<>();
        o00oooo(attributeSet);
    }

    public o0O000Oo(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8469o00oo0Oo = 0.0f;
        this.f8471o00oo0o0 = -1;
        this.f8470o00oo0o = -1;
        this.f8472o00oo0oO = -1;
        this.f8522o0O0o = 0;
        this.f8466o00oo = 0;
        this.f8475o00ooO00 = true;
        this.f8474o00ooO0 = new HashMap<>();
        this.f8476o00ooO0O = 0L;
        this.f8477o00ooO0o = 1.0f;
        this.f8473o00ooO = 0.0f;
        this.f8479o00ooOO0 = 0.0f;
        this.f8480o00ooOOo = 0.0f;
        this.f8481o00ooOo = false;
        this.f8483o00ooOoO = false;
        this.f8487o00ooo0O = 0;
        this.f8489o00oooO = false;
        this.f8490o00oooOO = new o00oo.o00oo0OO();
        this.f8491o00oooOo = new o00oOo00();
        this.f8492o00oooo = true;
        this.f8499o0O0000O = false;
        this.f8502o0O000Oo = false;
        this.f8525o0OoOoOO = null;
        this.f8504o0O000o0 = null;
        this.f8503o0O000o = null;
        this.f8529o0ooOoOO = 0;
        this.f8505o0O000oo = -1L;
        this.f8496o0O00 = 0.0f;
        this.f8507o0O00O0 = 0;
        this.f8524o0OoO00O = 0.0f;
        this.f8508o0O00O0o = false;
        this.f8506o0O00O = false;
        this.f8516o0O00o0O = new o00ooO00.o00oo0O0();
        this.f8517o0O00o0o = false;
        this.f8518o0O00oO0 = o00oo0O.UNDEFINED;
        this.f8519o0O0O0O = new o00oOoO();
        this.f8527o0oO0O0o = false;
        this.f8523o0O0oo0o = new RectF();
        this.f8520o0O0O0Oo = null;
        this.f8521o0O0O0o0 = new ArrayList<>();
        o00oooo(attributeSet);
    }

    public static boolean o0O00O0o(float f, float f2, float f3) {
        if (f > 0.0f) {
            float f4 = f / f3;
            return ((f * f4) - (((f3 * f4) * f4) / 2.0f)) + f2 > 1.0f;
        }
        float f5 = (-f) / f3;
        return ((((f3 * f5) * f5) / 2.0f) + (f * f5)) + f2 < 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatchDraw(android.graphics.Canvas r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooO00.o0O000Oo.dispatchDraw(android.graphics.Canvas):void");
    }

    public int[] getConstraintSetIds() {
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 == null) {
            return null;
        }
        return o0o00.o00oo0();
    }

    public int getCurrentState() {
        return this.f8470o00oo0o;
    }

    public ArrayList<o0O00.o00oOOoO> getDefinedTransitions() {
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 == null) {
            return null;
        }
        return o0o00.o00oo0OO();
    }

    public o00ooO00.o00oo00O getDesignTool() {
        if (this.f8493o00oooo0 == null) {
            this.f8493o00oooo0 = new o00ooO00.o00oo00O(this);
        }
        return this.f8493o00oooo0;
    }

    public int getEndState() {
        return this.f8472o00oo0oO;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f8479o00ooOO0;
    }

    public int getStartState() {
        return this.f8471o00oo0o0;
    }

    public float getTargetPosition() {
        return this.f8480o00ooOOo;
    }

    public Bundle getTransitionState() {
        if (this.f8514o0O00o == null) {
            this.f8514o0O00o = new o00oo0OO();
        }
        this.f8514o0O00o.o00oOo00();
        return this.f8514o0O00o.o00oOOoO();
    }

    public long getTransitionTimeMs() {
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 != null) {
            this.f8477o00ooO0o = o0o00.o00oo0O0() / 1000.0f;
        }
        return this.f8477o00ooO0o * 1000.0f;
    }

    public float getVelocity() {
        return this.f8469o00oo0Oo;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i) {
        if (i == 0) {
            this.f8468o00oo0O0 = null;
            return;
        }
        try {
            this.f8468o00oo0O0 = new o0O00(getContext(), this, i);
            if (isAttachedToWindow()) {
                this.f8468o00oo0O0.o0(this);
                this.f8519o0O0O0O.o00oOoO0(this.mLayoutWidget, this.f8468o00oo0O0.o00oOoo0(this.f8471o00oo0o0), this.f8468o00oo0O0.o00oOoo0(this.f8472o00oo0oO));
                o0O000();
                this.f8468o00oo0O0.o0O000O(isRtl());
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e);
        }
    }

    public o00oo00O o0() {
        return o00oo0.o00oOoOO();
    }

    public void o00oo(float f) {
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 == null) {
            return;
        }
        float f2 = this.f8479o00ooOO0;
        float f3 = this.f8473o00ooO;
        if (f2 != f3 && this.f8482o00ooOo0) {
            this.f8479o00ooOO0 = f3;
        }
        float f4 = this.f8479o00ooOO0;
        if (f4 == f) {
            return;
        }
        this.f8489o00oooO = false;
        this.f8480o00ooOOo = f;
        this.f8477o00ooO0o = o0o00.o00oo0O0() / 1000.0f;
        setProgress(this.f8480o00ooOOo);
        this.f8467o00oo0O = this.f8468o00oo0O0.o00oo0o();
        this.f8482o00ooOo0 = false;
        this.f8476o00ooO0O = getNanoTime();
        this.f8481o00ooOo = true;
        this.f8473o00ooO = f4;
        this.f8479o00ooOO0 = f4;
        invalidate();
    }

    public final void o00ooO() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            o00ooO00.o00oOoO.o00oOoO0();
            o00ooO00.o00oOoO.o00oOoo0(this);
            o00ooO00.o00oOoO.o00oOoOO(getContext(), this.f8470o00oo0o);
            o00ooO00.o00oOoO.o00oOoo0(childAt);
            childAt.getLeft();
            childAt.getTop();
        }
    }

    public final void o00ooO0(int i, androidx.constraintlayout.widget.o00oOoO o00oooo2) {
        o00ooO00.o00oOoO.o00oOoOO(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (o00oooo2.o0O000o0(childAt.getId()) == null) {
                o00ooO00.o00oOoO.o00oOoo0(childAt);
            }
        }
        int[] o0O000oo2 = o00oooo2.o0O000oo();
        for (int i3 = 0; i3 < o0O000oo2.length; i3++) {
            int i4 = o0O000oo2[i3];
            o00ooO00.o00oOoO.o00oOoOO(getContext(), i4);
            findViewById(o0O000oo2[i3]);
            o00oooo2.o0ooOoOO(i4);
            o00oooo2.o0O00O(i4);
        }
    }

    public final void o00ooO00() {
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 == null) {
            return;
        }
        int o00ooOO2 = o0o00.o00ooOO();
        o0O00 o0o002 = this.f8468o00oo0O0;
        o00ooO0(o00ooOO2, o0o002.o00oOoo0(o0o002.o00ooOO()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<o0O00.o00oOOoO> it = this.f8468o00oo0O0.o00oo0OO().iterator();
        while (it.hasNext()) {
            o0O00.o00oOOoO next = it.next();
            o0O00.o00oOOoO o00ooooo2 = this.f8468o00oo0O0.f8279o00oOo00;
            o00ooO0O(next);
            int o00ooOo2 = next.o00ooOo();
            int o00ooO0O2 = next.o00ooO0O();
            o00ooO00.o00oOoO.o00oOoOO(getContext(), o00ooOo2);
            o00ooO00.o00oOoO.o00oOoOO(getContext(), o00ooO0O2);
            sparseIntArray.get(o00ooOo2);
            sparseIntArray2.get(o00ooO0O2);
            sparseIntArray.put(o00ooOo2, o00ooO0O2);
            sparseIntArray2.put(o00ooO0O2, o00ooOo2);
            this.f8468o00oo0O0.o00oOoo0(o00ooOo2);
            this.f8468o00oo0O0.o00oOoo0(o00ooO0O2);
        }
    }

    public final void o00ooO0O(o0O00.o00oOOoO o00ooooo2) {
        o00ooooo2.o00oo0oO(getContext());
        o00ooooo2.o00ooO0();
        o00ooooo2.o00ooOo();
        o00ooooo2.o00ooO0O();
    }

    public final void o00ooO0o() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            o0O000 o0o000 = this.f8474o00ooO0.get(childAt);
            if (o0o000 != null) {
                o0o000.o00ooOo0(childAt);
            }
        }
    }

    public void o00ooOO(int i, boolean z) {
        boolean z2;
        o0O00.o00oOOoO o00oooOO2 = o00oooOO(i);
        if (z) {
            z2 = true;
        } else {
            o0O00 o0o00 = this.f8468o00oo0O0;
            if (o00oooOO2 == o0o00.f8279o00oOo00) {
                Iterator<o0O00.o00oOOoO> it = o0o00.o00ooOo(this.f8470o00oo0o).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    o0O00.o00oOOoO next = it.next();
                    if (next.o00ooOoo()) {
                        this.f8468o00oo0O0.f8279o00oOo00 = next;
                        break;
                    }
                }
            }
            z2 = false;
        }
        o00oooOO2.o00ooo0o(z2);
    }

    public void o00ooOO0(boolean z) {
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 == null) {
            return;
        }
        o0o00.o00oOoOO(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0205, code lost:
        if (r1 != r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0208, code lost:
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0209, code lost:
        r22.f8470o00oo0o = r2;
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0215, code lost:
        if (r1 != r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00ooOOo(boolean r23) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooO00.o0O000Oo.o00ooOOo(boolean):void");
    }

    public final void o00ooOo() {
        ArrayList<o00oo0O0> arrayList;
        if ((this.f8484o00ooOoo == null && ((arrayList = this.f8503o0O000o) == null || arrayList.isEmpty())) || this.f8524o0OoO00O == this.f8473o00ooO) {
            return;
        }
        if (this.f8507o0O00O0 != -1) {
            o00oo0O0 o00oo0o02 = this.f8484o00ooOoo;
            if (o00oo0o02 != null) {
                o00oo0o02.o00oOOoO(this, this.f8471o00oo0o0, this.f8472o00oo0oO);
            }
            ArrayList<o00oo0O0> arrayList2 = this.f8503o0O000o;
            if (arrayList2 != null) {
                Iterator<o00oo0O0> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().o00oOOoO(this, this.f8471o00oo0o0, this.f8472o00oo0oO);
                }
            }
            this.f8508o0O00O0o = true;
        }
        this.f8507o0O00O0 = -1;
        float f = this.f8473o00ooO;
        this.f8524o0OoO00O = f;
        o00oo0O0 o00oo0o03 = this.f8484o00ooOoo;
        if (o00oo0o03 != null) {
            o00oo0o03.o00oOo00(this, this.f8471o00oo0o0, this.f8472o00oo0oO, f);
        }
        ArrayList<o00oo0O0> arrayList3 = this.f8503o0O000o;
        if (arrayList3 != null) {
            Iterator<o00oo0O0> it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().o00oOo00(this, this.f8471o00oo0o0, this.f8472o00oo0oO, this.f8473o00ooO);
            }
        }
        this.f8508o0O00O0o = true;
    }

    public final void o00ooOo0() {
        boolean z;
        float signum = Math.signum(this.f8480o00ooOOo - this.f8479o00ooOO0);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f8467o00oo0O;
        float f = this.f8479o00ooOO0 + (!(interpolator instanceof o00oo.o00oo0OO) ? ((((float) (nanoTime - this.f8478o00ooOO)) * signum) * 1.0E-9f) / this.f8477o00ooO0o : 0.0f);
        if (this.f8482o00ooOo0) {
            f = this.f8480o00ooOOo;
        }
        int i = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i <= 0 || f < this.f8480o00ooOOo) && (signum > 0.0f || f > this.f8480o00ooOOo)) {
            z = false;
        } else {
            f = this.f8480o00ooOOo;
            z = true;
        }
        if (interpolator != null && !z) {
            f = this.f8489o00oooO ? interpolator.getInterpolation(((float) (nanoTime - this.f8476o00ooO0O)) * 1.0E-9f) : interpolator.getInterpolation(f);
        }
        if ((i > 0 && f >= this.f8480o00ooOOo) || (signum <= 0.0f && f <= this.f8480o00ooOOo)) {
            f = this.f8480o00ooOOo;
        }
        this.f8515o0O00o00 = f;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            o0O000 o0o000 = this.f8474o00ooO0.get(childAt);
            if (o0o000 != null) {
                o0o000.o00ooO0(childAt, f, nanoTime2, this.f8516o0O00o0O);
            }
        }
        if (this.f8506o0O00O) {
            requestLayout();
        }
    }

    public void o00ooOoO() {
        int i;
        ArrayList<Integer> arrayList;
        ArrayList<o00oo0O0> arrayList2;
        if ((this.f8484o00ooOoo != null || ((arrayList2 = this.f8503o0O000o) != null && !arrayList2.isEmpty())) && this.f8507o0O00O0 == -1) {
            this.f8507o0O00O0 = this.f8470o00oo0o;
            if (this.f8521o0O0O0o0.isEmpty()) {
                i = -1;
            } else {
                i = this.f8521o0O0O0o0.get(arrayList.size() - 1).intValue();
            }
            int i2 = this.f8470o00oo0o;
            if (i != i2 && i2 != -1) {
                this.f8521o0O0O0o0.add(Integer.valueOf(i2));
            }
        }
        o0O0000O();
    }

    public final void o00ooOoo(o0O000Oo o0o000oo, int i, int i2) {
        o00oo0O0 o00oo0o02 = this.f8484o00ooOoo;
        if (o00oo0o02 != null) {
            o00oo0o02.o00oOOoO(this, i, i2);
        }
        ArrayList<o00oo0O0> arrayList = this.f8503o0O000o;
        if (arrayList != null) {
            Iterator<o00oo0O0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().o00oOOoO(o0o000oo, i, i2);
            }
        }
    }

    public void o00ooo0(int i, float f, float f2, float f3, float[] fArr) {
        HashMap<View, o0O000> hashMap = this.f8474o00ooO0;
        View viewById = getViewById(i);
        o0O000 o0o000 = hashMap.get(viewById);
        if (o0o000 == null) {
            if (viewById == null) {
                return;
            }
            viewById.getContext().getResources().getResourceName(i);
            return;
        }
        o0o000.o00oOoo0(f, f2, f3, fArr);
        float y = viewById.getY();
        this.f8486o00ooo00 = f;
        this.f8485o00ooo0 = y;
    }

    public void o00ooo00(int i, boolean z, float f) {
        o00oo0O0 o00oo0o02 = this.f8484o00ooOoo;
        if (o00oo0o02 != null) {
            o00oo0o02.o00oOooO(this, i, z, f);
        }
        ArrayList<o00oo0O0> arrayList = this.f8503o0O000o;
        if (arrayList != null) {
            Iterator<o00oo0O0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().o00oOooO(this, i, z, f);
            }
        }
    }

    public androidx.constraintlayout.widget.o00oOoO o00ooo0O(int i) {
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 == null) {
            return null;
        }
        return o0o00.o00oOoo0(i);
    }

    public String o00ooo0o(int i) {
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 == null) {
            return null;
        }
        return o0o00.o00ooo0o(i);
    }

    public void o00oooO(boolean z) {
        this.f8487o00ooo0O = z ? 2 : 1;
        invalidate();
    }

    public o0O00.o00oOOoO o00oooOO(int i) {
        return this.f8468o00oo0O0.o00ooOOo(i);
    }

    public void o00oooOo(View view, float f, float f2, float[] fArr, int i) {
        float f3;
        float f4 = this.f8469o00oo0Oo;
        float f5 = this.f8479o00ooOO0;
        if (this.f8467o00oo0O != null) {
            float signum = Math.signum(this.f8480o00ooOOo - f5);
            float interpolation = this.f8467o00oo0O.getInterpolation(this.f8479o00ooOO0 + 1.0E-5f);
            float interpolation2 = this.f8467o00oo0O.getInterpolation(this.f8479o00ooOO0);
            f4 = (((interpolation - interpolation2) / 1.0E-5f) * signum) / this.f8477o00ooO0o;
            f3 = interpolation2;
        } else {
            f3 = f5;
        }
        Interpolator interpolator = this.f8467o00oo0O;
        if (interpolator instanceof o0OoOoOo) {
            f4 = ((o0OoOoOo) interpolator).o00oOOo0();
        }
        o0O000 o0o000 = this.f8474o00ooO0.get(view);
        if ((i & 1) == 0) {
            o0o000.o00oo0o0(f3, view.getWidth(), view.getHeight(), f, f2, fArr);
        } else {
            o0o000.o00oOoo0(f3, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * f4;
            fArr[1] = fArr[1] * f4;
        }
    }

    public final void o00oooo(AttributeSet attributeSet) {
        o0O00 o0o00;
        int i;
        f8453o0O0OOO = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.MotionLayout_layoutDescription) {
                    this.f8468o00oo0O0 = new o0O00(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == R.styleable.MotionLayout_currentState) {
                    this.f8470o00oo0o = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == R.styleable.MotionLayout_motionProgress) {
                    this.f8480o00ooOOo = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f8481o00ooOo = true;
                } else if (index == R.styleable.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == R.styleable.MotionLayout_showPaths) {
                    if (this.f8487o00ooo0O == 0) {
                        i = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                        this.f8487o00ooo0O = i;
                    }
                } else if (index == R.styleable.MotionLayout_motionDebug) {
                    i = obtainStyledAttributes.getInt(index, 0);
                    this.f8487o00ooo0O = i;
                }
            }
            obtainStyledAttributes.recycle();
            if (!z) {
                this.f8468o00oo0O0 = null;
            }
        }
        if (this.f8487o00ooo0O != 0) {
            o00ooO00();
        }
        if (this.f8470o00oo0o != -1 || (o0o00 = this.f8468o00oo0O0) == null) {
            return;
        }
        this.f8470o00oo0o = o0o00.o00ooOO();
        this.f8471o00oo0o0 = this.f8468o00oo0O0.o00ooOO();
        this.f8472o00oo0oO = this.f8468o00oo0O0.o00oo0O();
    }

    public final boolean o00oooo0(float f, float f2, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (o00oooo0(view.getLeft() + f, view.getTop() + f2, viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        this.f8523o0O0oo0o.set(view.getLeft() + f, view.getTop() + f2, f + view.getRight(), f2 + view.getBottom());
        if (motionEvent.getAction() == 0) {
            if (this.f8523o0O0oo0o.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent)) {
                return true;
            }
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean o00ooooO() {
        return this.f8475o00ooO00;
    }

    public int o00ooooo(String str) {
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 == null) {
            return 0;
        }
        return o0o00.o00ooo0O(str);
    }

    public void o0O00(int i, int i2, int i3) {
        androidx.constraintlayout.widget.o00oo0O0 o00oo0o02;
        int o00oOOo02;
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 != null && (o00oo0o02 = o0o00.f8278o00oOOoO) != null && (o00oOOo02 = o00oo0o02.o00oOOo0(this.f8470o00oo0o, i, i2, i3)) != -1) {
            i = o00oOOo02;
        }
        int i4 = this.f8470o00oo0o;
        if (i4 == i) {
            return;
        }
        if (this.f8471o00oo0o0 == i) {
            o00oo(0.0f);
        } else if (this.f8472o00oo0oO == i) {
            o00oo(1.0f);
        } else {
            this.f8472o00oo0oO = i;
            if (i4 != -1) {
                o0O000Oo(i4, i);
                o00oo(1.0f);
                this.f8479o00ooOO0 = 0.0f;
                o0O000o();
                return;
            }
            this.f8489o00oooO = false;
            this.f8480o00ooOOo = 1.0f;
            this.f8473o00ooO = 0.0f;
            this.f8479o00ooOO0 = 0.0f;
            this.f8478o00ooOO = getNanoTime();
            this.f8476o00ooO0O = getNanoTime();
            this.f8482o00ooOo0 = false;
            this.f8467o00oo0O = null;
            this.f8477o00ooO0o = this.f8468o00oo0O0.o00oo0O0() / 1000.0f;
            this.f8471o00oo0o0 = -1;
            this.f8468o00oo0O0.o0OoOoOo(-1, this.f8472o00oo0oO);
            this.f8468o00oo0O0.o00ooOO();
            int childCount = getChildCount();
            this.f8474o00ooO0.clear();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                this.f8474o00ooO0.put(childAt, new o0O000(childAt));
            }
            this.f8481o00ooOo = true;
            this.f8519o0O0O0O.o00oOoO0(this.mLayoutWidget, null, this.f8468o00oo0O0.o00oOoo0(i));
            o0O000();
            this.f8519o0O0O0O.o00oOOo0();
            o00ooO0o();
            int width = getWidth();
            int height = getHeight();
            for (int i6 = 0; i6 < childCount; i6++) {
                o0O000 o0o000 = this.f8474o00ooO0.get(getChildAt(i6));
                this.f8468o00oo0O0.o0O0o(o0o000);
                o0o000.o00ooOoo(width, height, this.f8477o00ooO0o, getNanoTime());
            }
            float o00ooOO02 = this.f8468o00oo0O0.o00ooOO0();
            if (o00ooOO02 != 0.0f) {
                float f = Float.MAX_VALUE;
                float f2 = -3.4028235E38f;
                for (int i7 = 0; i7 < childCount; i7++) {
                    o0O000 o0o0002 = this.f8474o00ooO0.get(getChildAt(i7));
                    float o00oo02 = o0o0002.o00oo0() + o0o0002.o00oo00O();
                    f = Math.min(f, o00oo02);
                    f2 = Math.max(f2, o00oo02);
                }
                for (int i8 = 0; i8 < childCount; i8++) {
                    o0O000 o0o0003 = this.f8474o00ooO0.get(getChildAt(i8));
                    float o00oo00O2 = o0o0003.o00oo00O();
                    float o00oo03 = o0o0003.o00oo0();
                    o0o0003.f8361o00oo00O = 1.0f / (1.0f - o00ooOO02);
                    o0o0003.f8358o00oOooo = o00ooOO02 - ((((o00oo00O2 + o00oo03) - f) * o00ooOO02) / (f2 - f));
                }
            }
            this.f8473o00ooO = 0.0f;
            this.f8479o00ooOO0 = 0.0f;
            this.f8481o00ooOo = true;
            invalidate();
        }
    }

    public void o0O000() {
        this.f8519o0O0O0O.o00oOoOo();
        invalidate();
    }

    public void o0O00000() {
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 == null) {
            return;
        }
        if (o0o00.o00oOoO0(this, this.f8470o00oo0o)) {
            requestLayout();
            return;
        }
        int i = this.f8470o00oo0o;
        if (i != -1) {
            this.f8468o00oo0O0.o00oOo0O(this, i);
        }
        if (this.f8468o00oo0O0.o0O000o()) {
            this.f8468o00oo0O0.o0OoOoOO();
        }
    }

    public final void o0O0000O() {
        ArrayList<o00oo0O0> arrayList;
        if (this.f8484o00ooOoo == null && ((arrayList = this.f8503o0O000o) == null || arrayList.isEmpty())) {
            return;
        }
        this.f8508o0O00O0o = false;
        Iterator<Integer> it = this.f8521o0O0O0o0.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            o00oo0O0 o00oo0o02 = this.f8484o00ooOoo;
            if (o00oo0o02 != null) {
                o00oo0o02.o00oOOo0(this, next.intValue());
            }
            ArrayList<o00oo0O0> arrayList2 = this.f8503o0O000o;
            if (arrayList2 != null) {
                Iterator<o00oo0O0> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().o00oOOo0(this, next.intValue());
                }
            }
        }
        this.f8521o0O0O0o0.clear();
    }

    @Deprecated
    public void o0O0000o() {
        o0O000();
    }

    public boolean o0O000O(o00oo0O0 o00oo0o02) {
        ArrayList<o00oo0O0> arrayList = this.f8503o0O000o;
        if (arrayList == null) {
            return false;
        }
        return arrayList.remove(o00oo0o02);
    }

    public void o0O000Oo(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f8514o0O00o == null) {
                this.f8514o0O00o = new o00oo0OO();
            }
            this.f8514o0O00o.o00oOo0o(i);
            this.f8514o0O00o.o00oOooO(i2);
            return;
        }
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 != null) {
            this.f8471o00oo0o0 = i;
            this.f8472o00oo0oO = i2;
            o0o00.o0OoOoOo(i, i2);
            this.f8519o0O0O0O.o00oOoO0(this.mLayoutWidget, this.f8468o00oo0O0.o00oOoo0(i), this.f8468o00oo0O0.o00oOoo0(i2));
            o0O000();
            this.f8479o00ooOO0 = 0.0f;
            o0ooOoOO();
        }
    }

    public void o0O000o() {
        o00oo(1.0f);
    }

    public void o0O000o0(int i, float f, float f2) {
        Interpolator interpolator;
        if (this.f8468o00oo0O0 == null || this.f8479o00ooOO0 == f) {
            return;
        }
        this.f8489o00oooO = true;
        this.f8476o00ooO0O = getNanoTime();
        float o00oo0O02 = this.f8468o00oo0O0.o00oo0O0() / 1000.0f;
        this.f8477o00ooO0o = o00oo0O02;
        this.f8480o00ooOOo = f;
        this.f8481o00ooOo = true;
        if (i != 0 && i != 1 && i != 2) {
            if (i != 4) {
                if (i == 5) {
                    if (!o0O00O0o(f2, this.f8479o00ooOO0, this.f8468o00oo0O0.o00oo())) {
                        this.f8490o00oooOO.o00oOo00(this.f8479o00ooOO0, f, f2, this.f8477o00ooO0o, this.f8468o00oo0O0.o00oo(), this.f8468o00oo0O0.o00ooO00());
                        this.f8469o00oo0Oo = 0.0f;
                    }
                }
                this.f8482o00ooOo0 = false;
                this.f8476o00ooO0O = getNanoTime();
                invalidate();
            }
            this.f8491o00oooOo.o00oOOoO(f2, this.f8479o00ooOO0, this.f8468o00oo0O0.o00oo());
            interpolator = this.f8491o00oooOo;
            this.f8467o00oo0O = interpolator;
            this.f8482o00ooOo0 = false;
            this.f8476o00ooO0O = getNanoTime();
            invalidate();
        }
        if (i == 1) {
            f = 0.0f;
        } else if (i == 2) {
            f = 1.0f;
        }
        this.f8490o00oooOO.o00oOo00(this.f8479o00ooOO0, f, f2, o00oo0O02, this.f8468o00oo0O0.o00oo(), this.f8468o00oo0O0.o00ooO00());
        int i2 = this.f8470o00oo0o;
        this.f8480o00ooOOo = f;
        this.f8470o00oo0o = i2;
        interpolator = this.f8490o00oooOO;
        this.f8467o00oo0O = interpolator;
        this.f8482o00ooOo0 = false;
        this.f8476o00ooO0O = getNanoTime();
        invalidate();
    }

    public void o0O000oo(int i) {
        if (isAttachedToWindow()) {
            o0O00(i, -1, -1);
            return;
        }
        if (this.f8514o0O00o == null) {
            this.f8514o0O00o = new o00oo0OO();
        }
        this.f8514o0O00o.o00oOooO(i);
    }

    public void o0O00O0() {
        this.f8519o0O0O0O.o00oOoO0(this.mLayoutWidget, this.f8468o00oo0O0.o00oOoo0(this.f8471o00oo0o0), this.f8468o00oo0O0.o00oOoo0(this.f8472o00oo0oO));
        o0O000();
    }

    public void o0O0o(o00oo0O0 o00oo0o02) {
        if (this.f8503o0O000o == null) {
            this.f8503o0O000o = new ArrayList<>();
        }
        this.f8503o0O000o.add(o00oo0o02);
    }

    public void o0OoO00O(int i, androidx.constraintlayout.widget.o00oOoO o00oooo2) {
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 != null) {
            o0o00.o0O0000O(i, o00oooo2);
        }
        o0O00O0();
        if (this.f8470o00oo0o == i) {
            o00oooo2.o00oOooo(this);
        }
    }

    public final void o0OoOoOO() {
        int childCount = getChildCount();
        this.f8519o0O0O0O.o00oOOo0();
        boolean z = true;
        this.f8481o00ooOo = true;
        int width = getWidth();
        int height = getHeight();
        int o00oOoOo2 = this.f8468o00oo0O0.o00oOoOo();
        int i = 0;
        if (o00oOoOo2 != -1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                o0O000 o0o000 = this.f8474o00ooO0.get(getChildAt(i2));
                if (o0o000 != null) {
                    o0o000.o00ooOOo(o00oOoOo2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            o0O000 o0o0002 = this.f8474o00ooO0.get(getChildAt(i3));
            if (o0o0002 != null) {
                this.f8468o00oo0O0.o0O0o(o0o0002);
                o0o0002.o00ooOoo(width, height, this.f8477o00ooO0o, getNanoTime());
            }
        }
        float o00ooOO02 = this.f8468o00oo0O0.o00ooOO0();
        if (o00ooOO02 != 0.0f) {
            boolean z2 = ((double) o00ooOO02) < 0.0d;
            float abs = Math.abs(o00ooOO02);
            float f = -3.4028235E38f;
            float f2 = Float.MAX_VALUE;
            float f3 = -3.4028235E38f;
            float f4 = Float.MAX_VALUE;
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    z = false;
                    break;
                }
                o0O000 o0o0003 = this.f8474o00ooO0.get(getChildAt(i4));
                if (!Float.isNaN(o0o0003.f8356o00oOoo0)) {
                    break;
                }
                float o00oo00O2 = o0o0003.o00oo00O();
                float o00oo02 = o0o0003.o00oo0();
                float f5 = z2 ? o00oo02 - o00oo00O2 : o00oo02 + o00oo00O2;
                f4 = Math.min(f4, f5);
                f3 = Math.max(f3, f5);
                i4++;
            }
            if (!z) {
                while (i < childCount) {
                    o0O000 o0o0004 = this.f8474o00ooO0.get(getChildAt(i));
                    float o00oo00O3 = o0o0004.o00oo00O();
                    float o00oo03 = o0o0004.o00oo0();
                    float f6 = z2 ? o00oo03 - o00oo00O3 : o00oo03 + o00oo00O3;
                    o0o0004.f8361o00oo00O = 1.0f / (1.0f - abs);
                    o0o0004.f8358o00oOooo = abs - (((f6 - f4) * abs) / (f3 - f4));
                    i++;
                }
                return;
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                o0O000 o0o0005 = this.f8474o00ooO0.get(getChildAt(i5));
                if (!Float.isNaN(o0o0005.f8356o00oOoo0)) {
                    f2 = Math.min(f2, o0o0005.f8356o00oOoo0);
                    f = Math.max(f, o0o0005.f8356o00oOoo0);
                }
            }
            while (i < childCount) {
                o0O000 o0o0006 = this.f8474o00ooO0.get(getChildAt(i));
                if (!Float.isNaN(o0o0006.f8356o00oOoo0)) {
                    o0o0006.f8361o00oo00O = 1.0f / (1.0f - abs);
                    float f7 = o0o0006.f8356o00oOoo0;
                    o0o0006.f8358o00oOooo = abs - (z2 ? ((f - f7) / (f - f2)) * abs : ((f7 - f2) * abs) / (f - f2));
                }
                i++;
            }
        }
    }

    public void o0OoOoOo(float f, float f2) {
        if (isAttachedToWindow()) {
            setProgress(f);
            setState(o00oo0O.MOVING);
            this.f8469o00oo0Oo = f2;
            o00oo(1.0f);
            return;
        }
        if (this.f8514o0O00o == null) {
            this.f8514o0O00o = new o00oo0OO();
        }
        this.f8514o0O00o.o00oOo0O(f);
        this.f8514o0O00o.o00oOoO(f2);
    }

    public void o0ooOoOO() {
        o00oo(0.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        o0O00.o00oOOoO o00ooooo2;
        int i;
        super.onAttachedToWindow();
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 != null && (i = this.f8470o00oo0o) != -1) {
            androidx.constraintlayout.widget.o00oOoO o00oOoo02 = o0o00.o00oOoo0(i);
            this.f8468o00oo0O0.o0(this);
            if (o00oOoo02 != null) {
                o00oOoo02.o00oOooo(this);
            }
            this.f8471o00oo0o0 = this.f8470o00oo0o;
        }
        o0O00000();
        o00oo0OO o00oo0oo = this.f8514o0O00o;
        if (o00oo0oo != null) {
            o00oo0oo.o00oOOo0();
            return;
        }
        o0O00 o0o002 = this.f8468o00oo0O0;
        if (o0o002 == null || (o00ooooo2 = o0o002.f8279o00oOo00) == null || o00ooooo2.o00ooO00() != 4) {
            return;
        }
        o0O000o();
        setState(o00oo0O.SETUP);
        setState(o00oo0O.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        o0O00.o00oOOoO o00ooooo2;
        o0O00O o00ooOoO2;
        int o00oo00O2;
        RectF o00oOooo2;
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 != null && this.f8475o00ooO00 && (o00ooooo2 = o0o00.f8279o00oOo00) != null && o00ooooo2.o00ooOoo() && (o00ooOoO2 = o00ooooo2.o00ooOoO()) != null && ((motionEvent.getAction() != 0 || (o00oOooo2 = o00ooOoO2.o00oOooo(this, new RectF())) == null || o00oOooo2.contains(motionEvent.getX(), motionEvent.getY())) && (o00oo00O2 = o00ooOoO2.o00oo00O()) != -1)) {
            View view = this.f8520o0O0O0Oo;
            if (view == null || view.getId() != o00oo00O2) {
                this.f8520o0O0O0Oo = findViewById(o00oo00O2);
            }
            View view2 = this.f8520o0O0O0Oo;
            if (view2 != null) {
                this.f8523o0O0oo0o.set(view2.getLeft(), this.f8520o0O0O0Oo.getTop(), this.f8520o0O0O0Oo.getRight(), this.f8520o0O0O0Oo.getBottom());
                if (this.f8523o0O0oo0o.contains(motionEvent.getX(), motionEvent.getY()) && !o00oooo0(0.0f, 0.0f, this.f8520o0O0O0Oo, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f8517o0O00o0o = true;
        try {
            if (this.f8468o00oo0O0 == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.f8465o0 != i5 || this.f8498o0O00000 != i6) {
                o0O000();
                o00ooOOo(true);
            }
            this.f8465o0 = i5;
            this.f8498o0O00000 = i6;
            this.f8494o00ooooO = i5;
            this.f8495o00ooooo = i6;
        } finally {
            this.f8517o0O00o0o = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f8468o00oo0O0 == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z = false;
        boolean z2 = (this.f8522o0O0o == i && this.f8466o00oo == i2) ? false : true;
        if (this.f8527o0oO0O0o) {
            this.f8527o0oO0O0o = false;
            o0O00000();
            o0O0000O();
            z2 = true;
        }
        if (this.mDirtyHierarchy) {
            z2 = true;
        }
        this.f8522o0O0o = i;
        this.f8466o00oo = i2;
        int o00ooOO2 = this.f8468o00oo0O0.o00ooOO();
        int o00oo0O2 = this.f8468o00oo0O0.o00oo0O();
        if ((z2 || this.f8519o0O0O0O.o00oOoO(o00ooOO2, o00oo0O2)) && this.f8471o00oo0o0 != -1) {
            super.onMeasure(i, i2);
            this.f8519o0O0O0O.o00oOoO0(this.mLayoutWidget, this.f8468o00oo0O0.o00oOoo0(o00ooOO2), this.f8468o00oo0O0.o00oOoo0(o00oo0O2));
            this.f8519o0O0O0O.o00oOoOo();
            this.f8519o0O0O0O.o00oOoo0(o00ooOO2, o00oo0O2);
        } else {
            z = true;
        }
        if (this.f8506o0O00O || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int o0OoO00O2 = this.mLayoutWidget.o0OoO00O() + getPaddingRight() + getPaddingLeft();
            int o00ooOO3 = this.mLayoutWidget.o00ooOO() + paddingBottom;
            int i5 = this.f8512o0O00OoO;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                o0OoO00O2 = (int) ((this.f8515o0O00o00 * (this.f8511o0O00Oo - i3)) + this.f8509o0O00OO);
                requestLayout();
            }
            int i6 = this.f8513o0O00Ooo;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                o00ooOO3 = (int) ((this.f8515o0O00o00 * (this.f8528o0oO0Ooo - i4)) + this.f8510o0O00OOO);
                requestLayout();
            }
            setMeasuredDimension(o0OoO00O2, o00ooOO3);
        }
        o00ooOo0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // o0O000oo.o0oO0O0o
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        o0O00.o00oOOoO o00ooooo2;
        o0O00O o00ooOoO2;
        int o00oo00O2;
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 == null || (o00ooooo2 = o0o00.f8279o00oOo00) == null || !o00ooooo2.o00ooOoo()) {
            return;
        }
        o0O00.o00oOOoO o00ooooo3 = this.f8468o00oo0O0.f8279o00oOo00;
        if (o00ooooo3 == null || !o00ooooo3.o00ooOoo() || (o00ooOoO2 = o00ooooo3.o00ooOoO()) == null || (o00oo00O2 = o00ooOoO2.o00oo00O()) == -1 || view.getId() == o00oo00O2) {
            o0O00 o0o002 = this.f8468o00oo0O0;
            if (o0o002 != null && o0o002.o00ooO0()) {
                float f = this.f8473o00ooO;
                if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(-1)) {
                    return;
                }
            }
            if (o00ooooo3.o00ooOoO() != null && (this.f8468o00oo0O0.f8279o00oOo00.o00ooOoO().o00oOo0O() & 1) != 0) {
                float o00ooO0o2 = this.f8468o00oo0O0.o00ooO0o(i, i2);
                float f2 = this.f8479o00ooOO0;
                if ((f2 <= 0.0f && o00ooO0o2 < 0.0f) || (f2 >= 1.0f && o00ooO0o2 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new o00oOOo0(view));
                    return;
                }
            }
            float f3 = this.f8473o00ooO;
            long nanoTime = getNanoTime();
            float f4 = i;
            this.f8500o0O0000o = f4;
            float f5 = i2;
            this.f8497o0O000 = f5;
            this.f8526o0OoOoOo = (float) ((nanoTime - this.f8501o0O000O) * 1.0E-9d);
            this.f8501o0O000O = nanoTime;
            this.f8468o00oo0O0.o00oooo0(f4, f5);
            if (f3 != this.f8473o00ooO) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            o00ooOOo(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f8499o0O0000O = true;
        }
    }

    @Override // o0O000oo.o0oO0O0o
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // o0O000oo.o0O0oo0o
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f8499o0O0000O || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f8499o0O0000O = false;
    }

    @Override // o0O000oo.o0oO0O0o
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 != null) {
            o0o00.o0O000O(isRtl());
        }
    }

    @Override // o0O000oo.o0oO0O0o
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        o0O00.o00oOOoO o00ooooo2;
        o0O00 o0o00 = this.f8468o00oo0O0;
        return (o0o00 == null || (o00ooooo2 = o0o00.f8279o00oOo00) == null || o00ooooo2.o00ooOoO() == null || (this.f8468o00oo0O0.f8279o00oOo00.o00ooOoO().o00oOo0O() & 2) != 0) ? false : true;
    }

    @Override // o0O000oo.o0oO0O0o
    public void onStopNestedScroll(View view, int i) {
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 == null) {
            return;
        }
        float f = this.f8500o0O0000o;
        float f2 = this.f8526o0OoOoOo;
        o0o00.o00oooo(f / f2, this.f8497o0O000 / f2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 != null && this.f8475o00ooO00 && o0o00.o0O000o()) {
            o0O00.o00oOOoO o00ooooo2 = this.f8468o00oo0O0.f8279o00oOo00;
            if (o00ooooo2 == null || o00ooooo2.o00ooOoo()) {
                this.f8468o00oo0O0.o00ooooO(motionEvent, getCurrentState(), this);
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof o0O000O) {
            o0O000O o0o000o = (o0O000O) view;
            if (this.f8503o0O000o == null) {
                this.f8503o0O000o = new ArrayList<>();
            }
            this.f8503o0O000o.add(o0o000o);
            if (o0o000o.o00ooO0o()) {
                if (this.f8525o0OoOoOO == null) {
                    this.f8525o0OoOoOO = new ArrayList<>();
                }
                this.f8525o0OoOoOO.add(o0o000o);
            }
            if (o0o000o.o00ooO0O()) {
                if (this.f8504o0O000o0 == null) {
                    this.f8504o0O000o0 = new ArrayList<>();
                }
                this.f8504o0O000o0.add(o0o000o);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<o0O000O> arrayList = this.f8525o0OoOoOO;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<o0O000O> arrayList2 = this.f8504o0O000o0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        o0O00 o0o00;
        o0O00.o00oOOoO o00ooooo2;
        if (this.f8506o0O00O || this.f8470o00oo0o != -1 || (o0o00 = this.f8468o00oo0O0) == null || (o00ooooo2 = o0o00.f8279o00oOo00) == null || o00ooooo2.o00ooOO0() != 0) {
            super.requestLayout();
        }
    }

    public void setDebugMode(int i) {
        this.f8487o00ooo0O = i;
        invalidate();
    }

    public void setInteractionEnabled(boolean z) {
        this.f8475o00ooO00 = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.f8468o00oo0O0 != null) {
            setState(o00oo0O.MOVING);
            Interpolator o00oo0o2 = this.f8468o00oo0O0.o00oo0o();
            if (o00oo0o2 != null) {
                setProgress(o00oo0o2.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<o0O000O> arrayList = this.f8504o0O000o0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f8504o0O000o0.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<o0O000O> arrayList = this.f8525o0OoOoOO;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f8525o0OoOoOO.get(i).setProgress(f);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r4.f8479o00ooOO0 == 0.0f) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        r0 = o00ooO00.o0O000Oo.o00oo0O.FINISHED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r4.f8479o00ooOO0 == 1.0f) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setProgress(float r5) {
        /*
            r4 = this;
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 < 0) goto L9
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
        L9:
            boolean r3 = r4.isAttachedToWindow()
            if (r3 != 0) goto L20
            o00ooO00.o0O000Oo$o00oo0OO r0 = r4.f8514o0O00o
            if (r0 != 0) goto L1a
            o00ooO00.o0O000Oo$o00oo0OO r0 = new o00ooO00.o0O000Oo$o00oo0OO
            r0.<init>()
            r4.f8514o0O00o = r0
        L1a:
            o00ooO00.o0O000Oo$o00oo0OO r0 = r4.f8514o0O00o
            r0.o00oOo0O(r5)
            return
        L20:
            if (r1 > 0) goto L2f
            int r1 = r4.f8471o00oo0o0
            r4.f8470o00oo0o = r1
            float r1 = r4.f8479o00ooOO0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L46
        L2c:
            o00ooO00.o0O000Oo$o00oo0O r0 = o00ooO00.o0O000Oo.o00oo0O.FINISHED
            goto L43
        L2f:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 < 0) goto L3e
            int r0 = r4.f8472o00oo0oO
            r4.f8470o00oo0o = r0
            float r0 = r4.f8479o00ooOO0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L46
            goto L2c
        L3e:
            r0 = -1
            r4.f8470o00oo0o = r0
            o00ooO00.o0O000Oo$o00oo0O r0 = o00ooO00.o0O000Oo.o00oo0O.MOVING
        L43:
            r4.setState(r0)
        L46:
            o00ooO00.o0O00 r0 = r4.f8468o00oo0O0
            if (r0 != 0) goto L4b
            return
        L4b:
            r0 = 1
            r4.f8482o00ooOo0 = r0
            r4.f8480o00ooOOo = r5
            r4.f8473o00ooO = r5
            r1 = -1
            r4.f8478o00ooOO = r1
            r4.f8476o00ooO0O = r1
            r5 = 0
            r4.f8467o00oo0O = r5
            r4.f8481o00ooOo = r0
            r4.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooO00.o0O000Oo.setProgress(float):void");
    }

    public void setScene(o0O00 o0o00) {
        this.f8468o00oo0O0 = o0o00;
        o0o00.o0O000O(isRtl());
        o0O000();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i, int i2, int i3) {
        setState(o00oo0O.SETUP);
        this.f8470o00oo0o = i;
        this.f8471o00oo0o0 = -1;
        this.f8472o00oo0oO = -1;
        androidx.constraintlayout.widget.o00oOo00 o00ooo002 = this.mConstraintLayoutSpec;
        if (o00ooo002 != null) {
            o00ooo002.o00oOo0O(i, i2, i3);
            return;
        }
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 != null) {
            o0o00.o00oOoo0(i).o00oOooo(this);
        }
    }

    public void setState(o00oo0O o00oo0o2) {
        o00oo0O o00oo0o3 = o00oo0O.FINISHED;
        if (o00oo0o2 == o00oo0o3 && this.f8470o00oo0o == -1) {
            return;
        }
        o00oo0O o00oo0o4 = this.f8518o0O00oO0;
        this.f8518o0O00oO0 = o00oo0o2;
        o00oo0O o00oo0o5 = o00oo0O.MOVING;
        if (o00oo0o4 == o00oo0o5 && o00oo0o2 == o00oo0o5) {
            o00ooOo();
        }
        int i = o00oOOoO.f8532o00oOOo0[o00oo0o4.ordinal()];
        if (i == 1 || i == 2) {
            if (o00oo0o2 == o00oo0o5) {
                o00ooOo();
            }
            if (o00oo0o2 != o00oo0o3) {
                return;
            }
        } else if (i != 3 || o00oo0o2 != o00oo0o3) {
            return;
        }
        o00ooOoO();
    }

    public void setTransition(int i) {
        if (this.f8468o00oo0O0 != null) {
            o0O00.o00oOOoO o00oooOO2 = o00oooOO(i);
            this.f8471o00oo0o0 = o00oooOO2.o00ooOo();
            this.f8472o00oo0oO = o00oooOO2.o00ooO0O();
            if (!isAttachedToWindow()) {
                if (this.f8514o0O00o == null) {
                    this.f8514o0O00o = new o00oo0OO();
                }
                this.f8514o0O00o.o00oOo0o(this.f8471o00oo0o0);
                this.f8514o0O00o.o00oOooO(this.f8472o00oo0oO);
                return;
            }
            float f = Float.NaN;
            int i2 = this.f8470o00oo0o;
            if (i2 == this.f8471o00oo0o0) {
                f = 0.0f;
            } else if (i2 == this.f8472o00oo0oO) {
                f = 1.0f;
            }
            this.f8468o00oo0O0.o0O000Oo(o00oooOO2);
            this.f8519o0O0O0O.o00oOoO0(this.mLayoutWidget, this.f8468o00oo0O0.o00oOoo0(this.f8471o00oo0o0), this.f8468o00oo0O0.o00oOoo0(this.f8472o00oo0oO));
            o0O000();
            this.f8479o00ooOO0 = Float.isNaN(f) ? 0.0f : f;
            if (!Float.isNaN(f)) {
                setProgress(f);
                return;
            }
            o00ooO00.o00oOoO.o00oOoO0();
            o0ooOoOO();
        }
    }

    public void setTransition(o0O00.o00oOOoO o00ooooo2) {
        this.f8468o00oo0O0.o0O000Oo(o00ooooo2);
        setState(o00oo0O.SETUP);
        float f = this.f8470o00oo0o == this.f8468o00oo0O0.o00oo0O() ? 1.0f : 0.0f;
        this.f8479o00ooOO0 = f;
        this.f8473o00ooO = f;
        this.f8480o00ooOOo = f;
        this.f8478o00ooOO = o00ooooo2.o00ooo00(1) ? -1L : getNanoTime();
        int o00ooOO2 = this.f8468o00oo0O0.o00ooOO();
        int o00oo0O2 = this.f8468o00oo0O0.o00oo0O();
        if (o00ooOO2 == this.f8471o00oo0o0 && o00oo0O2 == this.f8472o00oo0oO) {
            return;
        }
        this.f8471o00oo0o0 = o00ooOO2;
        this.f8472o00oo0oO = o00oo0O2;
        this.f8468o00oo0O0.o0OoOoOo(o00ooOO2, o00oo0O2);
        this.f8519o0O0O0O.o00oOoO0(this.mLayoutWidget, this.f8468o00oo0O0.o00oOoo0(this.f8471o00oo0o0), this.f8468o00oo0O0.o00oOoo0(this.f8472o00oo0oO));
        this.f8519o0O0O0O.o00oOoo0(this.f8471o00oo0o0, this.f8472o00oo0oO);
        this.f8519o0O0O0O.o00oOoOo();
        o0O000();
    }

    public void setTransitionDuration(int i) {
        o0O00 o0o00 = this.f8468o00oo0O0;
        if (o0o00 == null) {
            return;
        }
        o0o00.o0O0000o(i);
    }

    public void setTransitionListener(o00oo0O0 o00oo0o02) {
        this.f8484o00ooOoo = o00oo0o02;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f8514o0O00o == null) {
            this.f8514o0O00o = new o00oo0OO();
        }
        this.f8514o0O00o.o00oOoO0(bundle);
        if (isAttachedToWindow()) {
            this.f8514o0O00o.o00oOOo0();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return o00ooO00.o00oOoO.o00oOoOO(context, this.f8471o00oo0o0) + "->" + o00ooO00.o00oOoO.o00oOoOO(context, this.f8472o00oo0oO) + " (pos:" + this.f8479o00ooOO0 + " Dpos/Dt:" + this.f8469o00oo0Oo;
    }
}
