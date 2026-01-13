package multispace.multiapp.clone.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public class RoundMenuView extends View {

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final String f6826o00ooo0 = o00oo.o00oOOo0(new byte[]{-20, 115, 88, -73}, new byte[]{-120, Ascii.FS, 47, -39, -83, -67, -45, 55});

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final String f6827o00ooo0O = o00oo.o00oOOo0(new byte[]{2, -117}, new byte[]{119, -5, 44, 69, -90, 89, 111, 59});

    /* renamed from: o00oo  reason: collision with root package name */
    public int f6828o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f6829o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f6830o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public List<o00oo0> f6831o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f6832o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f6833o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f6834o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f6835o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public View.OnClickListener f6836o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public Bitmap f6837o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public o00oo00O f6838o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public float f6839o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public double f6840o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public int f6841o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public long f6842o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public boolean f6843o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public boolean f6844o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public int f6845o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public Toast f6846o00ooOoo;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public String f6847o00ooo00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f6848o0O0o;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements View.OnClickListener {
        public o00oOOo0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (RoundMenuView.this.f6838o00ooO0O != null) {
                RoundMenuView roundMenuView = RoundMenuView.this;
                roundMenuView.f6838o00ooO0O.o00oOOo0(view, roundMenuView.f6847o00ooo00, 4);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO implements View.OnClickListener {
        public o00oOOoO() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (RoundMenuView.this.f6838o00ooO0O != null) {
                RoundMenuView roundMenuView = RoundMenuView.this;
                roundMenuView.f6838o00ooO0O.o00oOOo0(view, roundMenuView.f6847o00ooo00, 3);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 implements View.OnClickListener {
        public o00oOo00() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (RoundMenuView.this.f6838o00ooO0O != null) {
                RoundMenuView roundMenuView = RoundMenuView.this;
                roundMenuView.f6838o00ooO0O.o00oOOo0(view, roundMenuView.f6847o00ooo00, 2);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo0O implements View.OnClickListener {
        public o00oOo0O() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (RoundMenuView.this.f6838o00ooO0O != null) {
                RoundMenuView roundMenuView = RoundMenuView.this;
                roundMenuView.f6838o00ooO0O.o00oOOo0(view, roundMenuView.f6847o00ooo00, 1);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOoO implements View.OnClickListener {
        public o00oOoO() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (RoundMenuView.this.f6838o00ooO0O != null) {
                RoundMenuView.this.f6838o00ooO0O.o00oOOo0(view, o00oo.o00oOOo0(new byte[]{-94, 114}, new byte[]{-41, 2, -37, -27, -46, -113, 35, 66}), 5);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class o00oo0 {

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public Bitmap f6858o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public View.OnClickListener f6859o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public Bitmap f6860o00oOoO0;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f6854o00oOOo0 = true;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f6855o00oOOoO = 0;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f6856o00oOo00 = 0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f6862o00oOooO = -16537100;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f6857o00oOo0O = 2;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public double f6861o00oOoOO = 0.6d;
    }

    /* loaded from: classes3.dex */
    public interface o00oo00O {
        void o00oOOo0(View view, String str, int i);
    }

    public RoundMenuView(Context context) {
        super(context);
        this.f6833o00oo0o0 = false;
        this.f6835o00ooO = -2;
        this.f6844o00ooOo0 = true;
        this.f6843o00ooOo = false;
        this.f6845o00ooOoO = -1;
        o00oOoOO();
    }

    public RoundMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6833o00oo0o0 = false;
        this.f6835o00ooO = -2;
        this.f6844o00ooOo0 = true;
        this.f6843o00ooOo = false;
        this.f6845o00ooOoO = -1;
        o00oOoOO();
    }

    public RoundMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6833o00oo0o0 = false;
        this.f6835o00ooO = -2;
        this.f6844o00ooOo0 = true;
        this.f6843o00ooOo = false;
        this.f6845o00ooOoO = -1;
        o00oOoOO();
    }

    public static Bitmap o00oOo0O(Drawable drawable) {
        Bitmap createBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            createBitmap = Bitmap.createBitmap(1, 1, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        } else {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Bitmap o00oOo0o(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(o00oOooO(25.0f), o00oOooO(25.0f), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static int o00oOoO(float f, float f2, float f3, float f4) {
        double d = (f2 - f2) / ((2.0f * f) - f);
        double d2 = (f4 - f2) / (f3 - f);
        double d3 = 180.0d;
        double atan = (Math.atan(Math.abs(d - d2) / ((d * d2) + 1.0d)) / 3.141592653589793d) * 180.0d;
        int i = (f3 > f ? 1 : (f3 == f ? 0 : -1));
        double d4 = 90.0d;
        if (i <= 0 || f4 >= f2) {
            if (i <= 0 || f4 <= f2) {
                int i2 = (f3 > f ? 1 : (f3 == f ? 0 : -1));
                d4 = 270.0d;
                if (i2 >= 0 || f4 <= f2) {
                    if (i2 >= 0 || f4 >= f2) {
                        if ((i == 0 && f4 < f2) || i != 0 || f4 <= f2) {
                            d3 = 0.0d;
                        }
                        return (int) d3;
                    }
                }
            }
            d3 = atan + d4;
            return (int) d3;
        }
        d3 = d4 - atan;
        return (int) d3;
    }

    public static double o00oOoO0(float f, float f2, float f3, float f4) {
        float f5 = f > f3 ? f - f3 : f3 - f;
        int i = (f2 > f4 ? 1 : (f2 == f4 ? 0 : -1));
        float f6 = f4 - f2;
        return Math.sqrt((f6 * f6) + (f5 * f5));
    }

    public static int o00oOooO(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public String getClickEvent() {
        return this.f6847o00ooo00;
    }

    public int getRotateFlag() {
        return this.f6845o00ooOoO;
    }

    public void o00oOo00(o00oo0 o00oo0Var) {
        if (o00oo0Var == null) {
            return;
        }
        if (this.f6831o00oo0Oo == null) {
            this.f6831o00oo0Oo = new ArrayList();
        }
        this.f6831o00oo0Oo.add(o00oo0Var);
        invalidate();
    }

    public final void o00oOoOO() {
        o00oo0 o00oo0Var = new o00oo0();
        o00oo0Var.f6856o00oOo00 = -7829368;
        o00oo0Var.f6858o00oOo0o = o00oOo0o(getResources().getDrawable(R.drawable.ic_arrow_right_blue));
        o00oo0Var.f6860o00oOoO0 = o00oOo0o(getResources().getDrawable(R.drawable.ic_blue_dort));
        o00oo0Var.f6859o00oOoO = new o00oOOo0();
        o00oOo00(o00oo0Var);
        o00oo0 o00oo0Var2 = new o00oo0();
        o00oo0Var2.f6856o00oOo00 = -7829368;
        o00oo0Var2.f6858o00oOo0o = o00oOo0o(getResources().getDrawable(R.drawable.ic_arrow_right_blue));
        o00oo0Var2.f6860o00oOoO0 = o00oOo0o(getResources().getDrawable(R.drawable.ic_blue_dort));
        o00oo0Var2.f6859o00oOoO = new o00oOOoO();
        o00oOo00(o00oo0Var2);
        o00oo0 o00oo0Var3 = new o00oo0();
        o00oo0Var3.f6856o00oOo00 = -7829368;
        o00oo0Var3.f6858o00oOo0o = o00oOo0o(getResources().getDrawable(R.drawable.ic_arrow_right_blue));
        o00oo0Var3.f6860o00oOoO0 = o00oOo0o(getResources().getDrawable(R.drawable.ic_blue_dort));
        o00oo0Var3.f6859o00oOoO = new o00oOo00();
        o00oOo00(o00oo0Var3);
        o00oo0 o00oo0Var4 = new o00oo0();
        o00oo0Var4.f6856o00oOo00 = -7829368;
        o00oo0Var4.f6858o00oOo0o = o00oOo0o(getResources().getDrawable(R.drawable.ic_arrow_right_blue));
        o00oo0Var4.f6860o00oOoO0 = o00oOo0o(getResources().getDrawable(R.drawable.ic_blue_dort));
        o00oo0Var4.f6859o00oOoO = new o00oOo0O();
        o00oOo00(o00oo0Var4);
        o00oOoo0(Color.parseColor(o00oo.o00oOOo0(new byte[]{oo0OOoo.f13516o00oOoO, -57, 104, 63, -95, 111, 90}, new byte[]{Ascii.RS, -127, 46, 89, -57, 9, 60, -120})), -7829368, Color.parseColor(o00oo.o00oOOo0(new byte[]{91, 67, -4, 66, 97, -40, -42}, new byte[]{120, 112, -67, 122, 36, -100, -110, -59})), 2, 0.33d, o00oOo0O(getResources().getDrawable(R.drawable.go_to_zero)), new o00oOoO());
    }

    public boolean o00oOoOo() {
        return this.f6844o00ooOo0;
    }

    public void o00oOoo0(int i, int i2, int i3, int i4, double d, Bitmap bitmap, View.OnClickListener onClickListener) {
        this.f6833o00oo0o0 = true;
        this.f6832o00oo0o = i;
        this.f6828o00oo = i2;
        this.f6834o00oo0oO = i3;
        this.f6848o0O0o = i4;
        this.f6840o00ooOO = d;
        this.f6837o00ooO00 = bitmap;
        this.f6836o00ooO0 = onClickListener;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        this.f6830o00oo0O0 = getWidth() / 2;
        this.f6829o00oo0O = getHeight() / 2;
        this.f6841o00ooOO0 = (int) ((getWidth() / 2) * this.f6840o00ooOO);
        int o00oOooO2 = o00oOooO(10.0f);
        o00oOooO(12.0f);
        float f = o00oOooO2;
        RectF rectF = new RectF(f, f, getWidth() - o00oOooO2, getHeight() - o00oOooO2);
        List<o00oo0> list = this.f6831o00oo0Oo;
        boolean z = true;
        if (list != null && list.size() > 0) {
            float size = 360 / this.f6831o00oo0Oo.size();
            this.f6839o00ooO0o = size / 2.0f;
            int i = 0;
            while (i < this.f6831o00oo0Oo.size()) {
                o00oo0 o00oo0Var = this.f6831o00oo0Oo.get(i);
                Paint paint = new Paint();
                paint.setAntiAlias(z);
                paint.setColor(this.f6835o00ooO == i ? o00oo0Var.f6856o00oOo00 : o00oo0Var.f6855o00oOOoO);
                float f2 = i * size;
                canvas.drawArc(rectF, this.f6839o00ooO0o + f2, size, true, paint);
                Paint paint2 = new Paint();
                paint2.setAntiAlias(z);
                paint2.setStrokeWidth(o00oo0Var.f6857o00oOo0O);
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setColor(o00oo0Var.f6862o00oOooO);
                canvas.drawArc(rectF, this.f6839o00ooO0o + f2, size, o00oo0Var.f6854o00oOOo0, paint2);
                Paint paint3 = new Paint();
                paint3.setStrokeWidth(o00oOooO(1.0f));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setColor(Color.parseColor(o00oo.o00oOOo0(new byte[]{104, 5, -100, 34, 63, Ascii.SUB, Ascii.SI}, new byte[]{75, 53, -81, 99, 6, 92, 59, 87})));
                canvas.drawArc(rectF, 0.0f, 360.0f, false, paint3);
                Matrix matrix = new Matrix();
                matrix.postTranslate((float) ((((getWidth() / 2) * o00oo0Var.f6861o00oOoOO) + this.f6830o00oo0O0) - (o00oo0Var.f6858o00oOo0o.getWidth() / 2)), this.f6829o00oo0O - (o00oo0Var.f6858o00oOo0o.getHeight() / 2));
                if (this.f6845o00ooOoO == i) {
                    matrix.postTranslate(-o00oOooO(10.0f), -o00oOooO(10.0f));
                    matrix.postRotate((i + 1) * size, this.f6830o00oo0O0, this.f6829o00oo0O);
                    bitmap = o00oo0Var.f6860o00oOoO0;
                } else {
                    matrix.postRotate((i + 1) * size, this.f6830o00oo0O0, this.f6829o00oo0O);
                    bitmap = o00oo0Var.f6858o00oOo0o;
                }
                canvas.drawBitmap(bitmap, matrix, null);
                i++;
                z = true;
            }
        }
        if (this.f6833o00oo0o0) {
            int i2 = this.f6830o00oo0O0;
            int i3 = this.f6841o00ooOO0;
            int i4 = this.f6829o00oo0O;
            RectF rectF2 = new RectF(i2 - i3, i4 - i3, i2 + i3, i4 + i3);
            Paint paint4 = new Paint();
            paint4.setAntiAlias(true);
            paint4.setStrokeWidth(this.f6848o0O0o);
            paint4.setColor(this.f6835o00ooO == -1 ? this.f6828o00oo : this.f6832o00oo0o);
            canvas.drawArc(rectF2, 0.0f, 360.0f, true, paint4);
            Paint paint5 = new Paint();
            paint5.setAntiAlias(true);
            paint5.setStrokeWidth(this.f6848o0O0o);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setColor(this.f6834o00oo0oO);
            canvas.drawArc(rectF2, 0.0f, 360.0f, true, paint5);
            Bitmap bitmap2 = this.f6837o00ooO00;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, this.f6830o00oo0O0 - (bitmap2.getWidth() / 2), this.f6829o00oo0O - (this.f6837o00ooO00.getHeight() / 2), (Paint) null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
        if (r8 != r7.f6835o00ooO) goto L15;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r0 = r8.getAction()
            r1 = -2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 == 0) goto L3b
            if (r0 == r2) goto Le
            goto Lad
        Le:
            int r8 = r7.f6835o00ooO
            if (r8 != r3) goto L15
            android.view.View$OnClickListener r4 = r7.f6836o00ooO0
            goto L2b
        L15:
            if (r8 < 0) goto L2b
            java.util.List<multispace.multiapp.clone.widget.RoundMenuView$o00oo0> r0 = r7.f6831o00oo0Oo
            int r0 = r0.size()
            if (r8 >= r0) goto L2b
            java.util.List<multispace.multiapp.clone.widget.RoundMenuView$o00oo0> r8 = r7.f6831o00oo0Oo
            int r0 = r7.f6835o00ooO
            java.lang.Object r8 = r8.get(r0)
            multispace.multiapp.clone.widget.RoundMenuView$o00oo0 r8 = (multispace.multiapp.clone.widget.RoundMenuView.o00oo0) r8
            android.view.View$OnClickListener r4 = r8.f6859o00oOoO
        L2b:
            if (r4 == 0) goto L34
            java.lang.String r8 = multispace.multiapp.clone.widget.RoundMenuView.f6827o00ooo0O
            r7.f6847o00ooo00 = r8
            r4.onClick(r7)
        L34:
            r7.f6835o00ooO = r1
        L36:
            r7.invalidate()
            goto Lad
        L3b:
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r5 = r0.getTime()
            r7.f6842o00ooOOo = r5
            float r0 = r8.getX()
            float r8 = r8.getY()
            int r5 = r7.f6830o00oo0O0
            float r5 = (float) r5
            int r6 = r7.f6829o00oo0O
            float r6 = (float) r6
            double r5 = o00oOoO0(r5, r6, r0, r8)
            int r5 = (int) r5
            int r6 = r7.f6841o00ooOO0
            if (r5 > r6) goto L62
            r7.f6835o00ooO = r3
            android.view.View$OnClickListener r4 = r7.f6836o00ooO0
            goto L99
        L62:
            int r6 = r7.getWidth()
            int r6 = r6 / 2
            if (r5 > r6) goto L97
            java.util.List<multispace.multiapp.clone.widget.RoundMenuView$o00oo0> r1 = r7.f6831o00oo0Oo
            int r1 = r1.size()
            r4 = 360(0x168, float:5.04E-43)
            int r1 = r4 / r1
            float r1 = (float) r1
            int r5 = r7.f6830o00oo0O0
            float r5 = (float) r5
            int r6 = r7.f6829o00oo0O
            float r6 = (float) r6
            int r8 = o00oOoO(r5, r6, r0, r8)
            int r8 = r8 + r4
            int r8 = r8 + (-90)
            float r0 = r7.f6839o00ooO0o
            int r0 = (int) r0
            int r8 = r8 - r0
            int r8 = r8 % r4
            float r8 = (float) r8
            float r8 = r8 / r1
            int r8 = (int) r8
            r7.f6835o00ooO = r8
            java.util.List<multispace.multiapp.clone.widget.RoundMenuView$o00oo0> r0 = r7.f6831o00oo0Oo
            java.lang.Object r8 = r0.get(r8)
            multispace.multiapp.clone.widget.RoundMenuView$o00oo0 r8 = (multispace.multiapp.clone.widget.RoundMenuView.o00oo0) r8
            android.view.View$OnClickListener r4 = r8.f6859o00oOoO
            goto L99
        L97:
            r7.f6835o00ooO = r1
        L99:
            if (r4 == 0) goto La2
            java.lang.String r8 = multispace.multiapp.clone.widget.RoundMenuView.f6826o00ooo0
            r7.f6847o00ooo00 = r8
            r4.onClick(r7)
        La2:
            int r8 = r7.f6845o00ooOoO
            if (r8 == r3) goto L36
            if (r8 == r3) goto Lad
            int r0 = r7.f6835o00ooO
            if (r8 != r0) goto Lad
            goto L36
        Lad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: multispace.multiapp.clone.widget.RoundMenuView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setClickEvent(String str) {
        this.f6847o00ooo00 = str;
    }

    public void setOnMenuViewClickListener(o00oo00O o00oo00o) {
        this.f6838o00ooO0O = o00oo00o;
    }

    public void setPermission(boolean z) {
        this.f6843o00ooOo = z;
    }

    public void setRotateFlag(int i) {
        this.f6845o00ooOoO = i;
        invalidate();
    }

    public void setmEnableClick(boolean z) {
        this.f6844o00ooOo0 = z;
    }
}
