package o0O0Oo;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import o00oOoOo.o00oo;
import o00oOooO.o0O00O;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0oo0o;
import o00oooOo.oOO0O0O0;
import o00oooo0.o0O0O0Oo;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class o0O0o00O extends o0O0o00 {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final String f11665o00ooO = "clip-path";

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f11666o00ooO0O = "VectorDrawableCompat";

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final PorterDuff.Mode f11667o00ooO0o = PorterDuff.Mode.SRC_IN;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final String f11668o00ooOO = "path";

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final String f11669o00ooOO0 = "group";

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final String f11670o00ooOOo = "vector";

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f11671o00ooOo = 1;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f11672o00ooOo0 = 0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f11673o00ooOoO = 2;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final int f11674o00ooOoo = 0;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f11675o00ooo0 = 2;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f11676o00ooo00 = 1;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final int f11677o00ooo0O = 2048;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final boolean f11678o00ooo0o = false;

    /* renamed from: o00oo  reason: collision with root package name */
    public final float[] f11679o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o00oo0OO f11680o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public PorterDuffColorFilter f11681o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f11682o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public ColorFilter f11683o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public boolean f11684o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public final Rect f11685o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final Matrix f11686o00ooO00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public Drawable.ConstantState f11687o0O0o;

    /* loaded from: classes.dex */
    public static class o00oOOoO extends o00oo00O {
        public o00oOOoO() {
        }

        public o00oOOoO(o00oOOoO o00ooooo2) {
            super(o00ooooo2);
        }

        @Override // o0O0Oo.o0O0o00O.o00oo00O
        public boolean o00oOo0O() {
            return true;
        }

        public void o00oOoOO(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (o00ooo0o.o0O0o00.o00oo0Oo(xmlPullParser, "pathData")) {
                TypedArray o00oo0o02 = o00ooo0o.o0O0o00.o00oo0o0(resources, theme, attributeSet, o0O0OO.f11595o00ooOoo);
                o00oOoOo(o00oo0o02, xmlPullParser);
                o00oo0o02.recycle();
            }
        }

        public final void o00oOoOo(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f11732o00oOOoO = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f11731o00oOOo0 = oOO0O0O0.o00oOooO(string2);
            }
            this.f11733o00oOo00 = o00ooo0o.o0O0o00.o00oOoo0(typedArray, xmlPullParser, "fillType", 2, 0);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 extends o00oo00O {

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int[] f11688o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public float f11689o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public o0O0oo0o f11690o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public o0O0oo0o f11691o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public float f11692o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public float f11693o00oOoo0;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public float f11694o00oOooo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public float f11695o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public float f11696o00oo00O;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public float f11697o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public Paint.Join f11698o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public Paint.Cap f11699o00oo0OO;

        public o00oOo00() {
            this.f11689o00oOoO = 0.0f;
            this.f11692o00oOoOo = 1.0f;
            this.f11693o00oOoo0 = 1.0f;
            this.f11694o00oOooo = 0.0f;
            this.f11696o00oo00O = 1.0f;
            this.f11695o00oo0 = 0.0f;
            this.f11699o00oo0OO = Paint.Cap.BUTT;
            this.f11698o00oo0O0 = Paint.Join.MITER;
            this.f11697o00oo0O = 4.0f;
        }

        public o00oOo00(o00oOo00 o00ooo002) {
            super(o00ooo002);
            this.f11689o00oOoO = 0.0f;
            this.f11692o00oOoOo = 1.0f;
            this.f11693o00oOoo0 = 1.0f;
            this.f11694o00oOooo = 0.0f;
            this.f11696o00oo00O = 1.0f;
            this.f11695o00oo0 = 0.0f;
            this.f11699o00oo0OO = Paint.Cap.BUTT;
            this.f11698o00oo0O0 = Paint.Join.MITER;
            this.f11697o00oo0O = 4.0f;
            this.f11688o00oOo0o = o00ooo002.f11688o00oOo0o;
            this.f11690o00oOoO0 = o00ooo002.f11690o00oOoO0;
            this.f11689o00oOoO = o00ooo002.f11689o00oOoO;
            this.f11692o00oOoOo = o00ooo002.f11692o00oOoOo;
            this.f11691o00oOoOO = o00ooo002.f11691o00oOoOO;
            this.f11733o00oOo00 = o00ooo002.f11733o00oOo00;
            this.f11693o00oOoo0 = o00ooo002.f11693o00oOoo0;
            this.f11694o00oOooo = o00ooo002.f11694o00oOooo;
            this.f11696o00oo00O = o00ooo002.f11696o00oo00O;
            this.f11695o00oo0 = o00ooo002.f11695o00oo0;
            this.f11699o00oo0OO = o00ooo002.f11699o00oo0OO;
            this.f11698o00oo0O0 = o00ooo002.f11698o00oo0O0;
            this.f11697o00oo0O = o00ooo002.f11697o00oo0O;
        }

        public float getFillAlpha() {
            return this.f11693o00oOoo0;
        }

        @o0O00O
        public int getFillColor() {
            return this.f11691o00oOoOO.f9773o00oOo00;
        }

        public float getStrokeAlpha() {
            return this.f11692o00oOoOo;
        }

        @o0O00O
        public int getStrokeColor() {
            return this.f11690o00oOoO0.f9773o00oOo00;
        }

        public float getStrokeWidth() {
            return this.f11689o00oOoO;
        }

        public float getTrimPathEnd() {
            return this.f11696o00oo00O;
        }

        public float getTrimPathOffset() {
            return this.f11695o00oo0;
        }

        public float getTrimPathStart() {
            return this.f11694o00oOooo;
        }

        @Override // o0O0Oo.o0O0o00O.o00oOoO
        public boolean o00oOOo0() {
            return this.f11691o00oOoOO.o00oOoOO() || this.f11690o00oOoO0.o00oOoOO();
        }

        @Override // o0O0Oo.o0O0o00O.o00oOoO
        public boolean o00oOOoO(int[] iArr) {
            return this.f11690o00oOoO0.o00oOoOo(iArr) | this.f11691o00oOoOO.o00oOoOo(iArr);
        }

        @Override // o0O0Oo.o0O0o00O.o00oo00O
        public void o00oOo00(Resources.Theme theme) {
        }

        public final Paint.Cap o00oOoOO(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        public final Paint.Join o00oOoOo(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        public void o00oOoo0(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray o00oo0o02 = o00ooo0o.o0O0o00.o00oo0o0(resources, theme, attributeSet, o0O0OO.f11581o00oo0o);
            o00oOooo(o00oo0o02, xmlPullParser, theme);
            o00oo0o02.recycle();
        }

        @Override // o0O0Oo.o0O0o00O.o00oo00O
        public boolean o00oOooO() {
            return this.f11688o00oOo0o != null;
        }

        public final void o00oOooo(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f11688o00oOo0o = null;
            if (o00ooo0o.o0O0o00.o00oo0Oo(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f11732o00oOOoO = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f11731o00oOOo0 = oOO0O0O0.o00oOooO(string2);
                }
                this.f11691o00oOoOO = o00ooo0o.o0O0o00.o00oOoOO(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f11693o00oOoo0 = o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, "fillAlpha", 12, this.f11693o00oOoo0);
                this.f11699o00oo0OO = o00oOoOO(o00ooo0o.o0O0o00.o00oOoo0(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f11699o00oo0OO);
                this.f11698o00oo0O0 = o00oOoOo(o00ooo0o.o0O0o00.o00oOoo0(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f11698o00oo0O0);
                this.f11697o00oo0O = o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f11697o00oo0O);
                this.f11690o00oOoO0 = o00ooo0o.o0O0o00.o00oOoOO(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f11692o00oOoOo = o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, "strokeAlpha", 11, this.f11692o00oOoOo);
                this.f11689o00oOoO = o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, "strokeWidth", 4, this.f11689o00oOoO);
                this.f11696o00oo00O = o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, "trimPathEnd", 6, this.f11696o00oo00O);
                this.f11695o00oo0 = o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, "trimPathOffset", 7, this.f11695o00oo0);
                this.f11694o00oOooo = o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, "trimPathStart", 5, this.f11694o00oOooo);
                this.f11733o00oOo00 = o00ooo0o.o0O0o00.o00oOoo0(typedArray, xmlPullParser, "fillType", 13, this.f11733o00oOo00);
            }
        }

        public void setFillAlpha(float f) {
            this.f11693o00oOoo0 = f;
        }

        public void setFillColor(int i) {
            this.f11691o00oOoOO.f9773o00oOo00 = i;
        }

        public void setStrokeAlpha(float f) {
            this.f11692o00oOoOo = f;
        }

        public void setStrokeColor(int i) {
            this.f11690o00oOoO0.f9773o00oOo00 = i;
        }

        public void setStrokeWidth(float f) {
            this.f11689o00oOoO = f;
        }

        public void setTrimPathEnd(float f) {
            this.f11696o00oo00O = f;
        }

        public void setTrimPathOffset(float f) {
            this.f11695o00oo0 = f;
        }

        public void setTrimPathStart(float f) {
            this.f11694o00oOooo = f;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOoO {
        public o00oOoO() {
        }

        public boolean o00oOOo0() {
            return false;
        }

        public boolean o00oOOoO(int[] iArr) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static final Matrix f11713o00oo0O = new Matrix();

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Path f11714o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Path f11715o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Matrix f11716o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public Paint f11717o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public PathMeasure f11718o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public final o00oOo0O f11719o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f11720o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public float f11721o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public float f11722o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public float f11723o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public Paint f11724o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public float f11725o00oOooo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public String f11726o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public int f11727o00oo00O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final androidx.collection.o00oOOo0<String, Object> f11728o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public Boolean f11729o00oo0OO;

        public o00oo0() {
            this.f11716o00oOo00 = new Matrix();
            this.f11721o00oOoOO = 0.0f;
            this.f11722o00oOoOo = 0.0f;
            this.f11723o00oOoo0 = 0.0f;
            this.f11725o00oOooo = 0.0f;
            this.f11727o00oo00O = 255;
            this.f11726o00oo0 = null;
            this.f11729o00oo0OO = null;
            this.f11728o00oo0O0 = new androidx.collection.o00oOOo0<>();
            this.f11719o00oOoO = new o00oOo0O();
            this.f11714o00oOOo0 = new Path();
            this.f11715o00oOOoO = new Path();
        }

        public o00oo0(o00oo0 o00oo0Var) {
            this.f11716o00oOo00 = new Matrix();
            this.f11721o00oOoOO = 0.0f;
            this.f11722o00oOoOo = 0.0f;
            this.f11723o00oOoo0 = 0.0f;
            this.f11725o00oOooo = 0.0f;
            this.f11727o00oo00O = 255;
            this.f11726o00oo0 = null;
            this.f11729o00oo0OO = null;
            androidx.collection.o00oOOo0<String, Object> o00oooo02 = new androidx.collection.o00oOOo0<>();
            this.f11728o00oo0O0 = o00oooo02;
            this.f11719o00oOoO = new o00oOo0O(o00oo0Var.f11719o00oOoO, o00oooo02);
            this.f11714o00oOOo0 = new Path(o00oo0Var.f11714o00oOOo0);
            this.f11715o00oOOoO = new Path(o00oo0Var.f11715o00oOOoO);
            this.f11721o00oOoOO = o00oo0Var.f11721o00oOoOO;
            this.f11722o00oOoOo = o00oo0Var.f11722o00oOoOo;
            this.f11723o00oOoo0 = o00oo0Var.f11723o00oOoo0;
            this.f11725o00oOooo = o00oo0Var.f11725o00oOooo;
            this.f11720o00oOoO0 = o00oo0Var.f11720o00oOoO0;
            this.f11727o00oo00O = o00oo0Var.f11727o00oo00O;
            this.f11726o00oo0 = o00oo0Var.f11726o00oo0;
            String str = o00oo0Var.f11726o00oo0;
            if (str != null) {
                o00oooo02.put(str, this);
            }
            this.f11729o00oo0OO = o00oo0Var.f11729o00oo0OO;
        }

        public static float o00oOOo0(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f11727o00oo00O;
        }

        public void o00oOOoO(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            o00oOo00(this.f11719o00oOoO, f11713o00oo0O, canvas, i, i2, colorFilter);
        }

        public final void o00oOo00(o00oOo0O o00ooo0o2, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            o00ooo0o2.f11700o00oOOo0.set(matrix);
            o00ooo0o2.f11700o00oOOo0.preConcat(o00ooo0o2.f11708o00oOoOo);
            canvas.save();
            for (int i3 = 0; i3 < o00ooo0o2.f11701o00oOOoO.size(); i3++) {
                o00oOoO o00oooo2 = o00ooo0o2.f11701o00oOOoO.get(i3);
                if (o00oooo2 instanceof o00oOo0O) {
                    o00oOo00((o00oOo0O) o00oooo2, o00ooo0o2.f11700o00oOOo0, canvas, i, i2, colorFilter);
                } else if (o00oooo2 instanceof o00oo00O) {
                    o00oOooO(o00ooo0o2, (o00oo00O) o00oooo2, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public final float o00oOo0O(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float f = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(f) / max;
            }
            return 0.0f;
        }

        public boolean o00oOo0o() {
            if (this.f11729o00oo0OO == null) {
                this.f11729o00oo0OO = Boolean.valueOf(this.f11719o00oOoO.o00oOOo0());
            }
            return this.f11729o00oo0OO.booleanValue();
        }

        public boolean o00oOoO0(int[] iArr) {
            return this.f11719o00oOoO.o00oOOoO(iArr);
        }

        public final void o00oOooO(o00oOo0O o00ooo0o2, o00oo00O o00oo00o, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f11723o00oOoo0;
            float f2 = i2 / this.f11725o00oOooo;
            float min = Math.min(f, f2);
            Matrix matrix = o00ooo0o2.f11700o00oOOo0;
            this.f11716o00oOo00.set(matrix);
            this.f11716o00oOo00.postScale(f, f2);
            float o00oOo0O2 = o00oOo0O(matrix);
            if (o00oOo0O2 == 0.0f) {
                return;
            }
            o00oo00o.o00oOoO(this.f11714o00oOOo0);
            Path path = this.f11714o00oOOo0;
            this.f11715o00oOOoO.reset();
            if (o00oo00o.o00oOo0O()) {
                this.f11715o00oOOoO.setFillType(o00oo00o.f11733o00oOo00 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f11715o00oOOoO.addPath(path, this.f11716o00oOo00);
                canvas.clipPath(this.f11715o00oOOoO);
                return;
            }
            o00oOo00 o00ooo002 = (o00oOo00) o00oo00o;
            float f3 = o00ooo002.f11694o00oOooo;
            if (f3 != 0.0f || o00ooo002.f11696o00oo00O != 1.0f) {
                float f4 = o00ooo002.f11695o00oo0;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (o00ooo002.f11696o00oo00O + f4) % 1.0f;
                if (this.f11718o00oOo0o == null) {
                    this.f11718o00oOo0o = new PathMeasure();
                }
                this.f11718o00oOo0o.setPath(this.f11714o00oOOo0, false);
                float length = this.f11718o00oOo0o.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f11718o00oOo0o.getSegment(f7, length, path, true);
                    this.f11718o00oOo0o.getSegment(0.0f, f8, path, true);
                } else {
                    this.f11718o00oOo0o.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f11715o00oOOoO.addPath(path, this.f11716o00oOo00);
            if (o00ooo002.f11691o00oOoOO.o00oOooo()) {
                o0O0oo0o o0o0oo0o = o00ooo002.f11691o00oOoOO;
                if (this.f11717o00oOo0O == null) {
                    Paint paint = new Paint(1);
                    this.f11717o00oOo0O = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f11717o00oOo0O;
                if (o0o0oo0o.o00oOoO()) {
                    Shader shader = o0o0oo0o.f9771o00oOOo0;
                    shader.setLocalMatrix(this.f11716o00oOo00);
                    paint2.setShader(shader);
                    paint2.setAlpha(Math.round(o00ooo002.f11693o00oOoo0 * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(o0O0o00O.o00oOOo0(o0o0oo0o.f9773o00oOo00, o00ooo002.f11693o00oOoo0));
                }
                paint2.setColorFilter(colorFilter);
                this.f11715o00oOOoO.setFillType(o00ooo002.f11733o00oOo00 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f11715o00oOOoO, paint2);
            }
            if (o00ooo002.f11690o00oOoO0.o00oOooo()) {
                o0O0oo0o o0o0oo0o2 = o00ooo002.f11690o00oOoO0;
                if (this.f11724o00oOooO == null) {
                    Paint paint3 = new Paint(1);
                    this.f11724o00oOooO = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f11724o00oOooO;
                Paint.Join join = o00ooo002.f11698o00oo0O0;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = o00ooo002.f11699o00oo0OO;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(o00ooo002.f11697o00oo0O);
                if (o0o0oo0o2.o00oOoO()) {
                    Shader shader2 = o0o0oo0o2.f9771o00oOOo0;
                    shader2.setLocalMatrix(this.f11716o00oOo00);
                    paint4.setShader(shader2);
                    paint4.setAlpha(Math.round(o00ooo002.f11692o00oOoOo * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(o0O0o00O.o00oOOo0(o0o0oo0o2.f9773o00oOo00, o00ooo002.f11692o00oOoOo));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(o00ooo002.f11689o00oOoO * min * o00oOo0O2);
                canvas.drawPath(this.f11715o00oOOoO, paint4);
            }
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f11727o00oo00O = i;
        }
    }

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oo0O0 extends Drawable.ConstantState {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Drawable.ConstantState f11735o00oOOo0;

        public o00oo0O0(Drawable.ConstantState constantState) {
            this.f11735o00oOOo0 = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f11735o00oOOo0.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11735o00oOOo0.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            o0O0o00O o0o0o00o = new o0O0o00O();
            o0o0o00o.f11659o00oo0O0 = (VectorDrawable) this.f11735o00oOOo0.newDrawable();
            return o0o0o00o;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            o0O0o00O o0o0o00o = new o0O0o00O();
            o0o0o00o.f11659o00oo0O0 = (VectorDrawable) this.f11735o00oOOo0.newDrawable(resources);
            return o0o0o00o;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            o0O0o00O o0o0o00o = new o0O0o00O();
            o0o0o00o.f11659o00oo0O0 = (VectorDrawable) this.f11735o00oOOo0.newDrawable(resources, theme);
            return o0o0o00o;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0OO extends Drawable.ConstantState {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f11736o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o00oo0 f11737o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public ColorStateList f11738o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public boolean f11739o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public Bitmap f11740o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public ColorStateList f11741o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int[] f11742o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public PorterDuff.Mode f11743o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public int f11744o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public boolean f11745o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public PorterDuff.Mode f11746o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public boolean f11747o00oOooo;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public Paint f11748o00oo00O;

        public o00oo0OO() {
            this.f11738o00oOo00 = null;
            this.f11746o00oOooO = o0O0o00O.f11667o00ooO0o;
            this.f11737o00oOOoO = new o00oo0();
        }

        public o00oo0OO(o00oo0OO o00oo0oo) {
            this.f11738o00oOo00 = null;
            this.f11746o00oOooO = o0O0o00O.f11667o00ooO0o;
            if (o00oo0oo != null) {
                this.f11736o00oOOo0 = o00oo0oo.f11736o00oOOo0;
                o00oo0 o00oo0Var = new o00oo0(o00oo0oo.f11737o00oOOoO);
                this.f11737o00oOOoO = o00oo0Var;
                if (o00oo0oo.f11737o00oOOoO.f11717o00oOo0O != null) {
                    o00oo0Var.f11717o00oOo0O = new Paint(o00oo0oo.f11737o00oOOoO.f11717o00oOo0O);
                }
                if (o00oo0oo.f11737o00oOOoO.f11724o00oOooO != null) {
                    this.f11737o00oOOoO.f11724o00oOooO = new Paint(o00oo0oo.f11737o00oOOoO.f11724o00oOooO);
                }
                this.f11738o00oOo00 = o00oo0oo.f11738o00oOo00;
                this.f11746o00oOooO = o00oo0oo.f11746o00oOooO;
                this.f11739o00oOo0O = o00oo0oo.f11739o00oOo0O;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11736o00oOOo0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @oo0oO0
        public Drawable newDrawable() {
            return new o0O0o00O(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @oo0oO0
        public Drawable newDrawable(Resources resources) {
            return new o0O0o00O(this);
        }

        public boolean o00oOOo0(int i, int i2) {
            return i == this.f11740o00oOo0o.getWidth() && i2 == this.f11740o00oOo0o.getHeight();
        }

        public boolean o00oOOoO() {
            return !this.f11747o00oOooo && this.f11741o00oOoO == this.f11738o00oOo00 && this.f11743o00oOoOO == this.f11746o00oOooO && this.f11745o00oOoo0 == this.f11739o00oOo0O && this.f11744o00oOoOo == this.f11737o00oOOoO.getRootAlpha();
        }

        public void o00oOo00(int i, int i2) {
            if (this.f11740o00oOo0o == null || !o00oOOo0(i, i2)) {
                this.f11740o00oOo0o = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f11747o00oOooo = true;
            }
        }

        public Paint o00oOo0O(ColorFilter colorFilter) {
            if (o00oOo0o() || colorFilter != null) {
                if (this.f11748o00oo00O == null) {
                    Paint paint = new Paint();
                    this.f11748o00oo00O = paint;
                    paint.setFilterBitmap(true);
                }
                this.f11748o00oo00O.setAlpha(this.f11737o00oOOoO.getRootAlpha());
                this.f11748o00oo00O.setColorFilter(colorFilter);
                return this.f11748o00oo00O;
            }
            return null;
        }

        public boolean o00oOo0o() {
            return this.f11737o00oOOoO.getRootAlpha() < 255;
        }

        public boolean o00oOoO(int[] iArr) {
            boolean o00oOoO02 = this.f11737o00oOOoO.o00oOoO0(iArr);
            this.f11747o00oOooo |= o00oOoO02;
            return o00oOoO02;
        }

        public boolean o00oOoO0() {
            return this.f11737o00oOOoO.o00oOo0o();
        }

        public void o00oOoOO() {
            this.f11741o00oOoO = this.f11738o00oOo00;
            this.f11743o00oOoOO = this.f11746o00oOooO;
            this.f11744o00oOoOo = this.f11737o00oOOoO.getRootAlpha();
            this.f11745o00oOoo0 = this.f11739o00oOo0O;
            this.f11747o00oOooo = false;
        }

        public void o00oOoOo(int i, int i2) {
            this.f11740o00oOo0o.eraseColor(0);
            this.f11737o00oOOoO.o00oOOoO(new Canvas(this.f11740o00oOo0o), i, i2, null);
        }

        public void o00oOooO(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f11740o00oOo0o, (Rect) null, rect, o00oOo0O(colorFilter));
        }
    }

    public o0O0o00O() {
        this.f11684o00oo0oO = true;
        this.f11679o00oo = new float[9];
        this.f11686o00ooO00 = new Matrix();
        this.f11685o00ooO0 = new Rect();
        this.f11680o00oo0O = new o00oo0OO();
    }

    public o0O0o00O(@oo0oO0 o00oo0OO o00oo0oo) {
        this.f11684o00oo0oO = true;
        this.f11679o00oo = new float[9];
        this.f11686o00ooO00 = new Matrix();
        this.f11685o00ooO0 = new Rect();
        this.f11680o00oo0O = o00oo0oo;
        this.f11681o00oo0Oo = o00oOooo(this.f11681o00oo0Oo, o00oo0oo.f11738o00oOo00, o00oo0oo.f11746o00oOooO);
    }

    public static int o00oOOo0(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    @o0OO00OO
    public static o0O0o00O o00oOOoO(@oo0oO0 Resources resources, @o0O0O0o0 int i, @o0OO00OO Resources.Theme theme) {
        o0O0o00O o0o0o00o = new o0O0o00O();
        o0o0o00o.f11659o00oo0O0 = o00ooo0o.o0O0OO.o00oOoO0(resources, i, theme);
        o0o0o00o.f11687o0O0o = new o00oo0O0(o0o0o00o.f11659o00oo0O0.getConstantState());
        return o0o0o00o;
    }

    public static o0O0o00O o00oOo00(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        o0O0o00O o0o0o00o = new o0O0o00O();
        o0o0o00o.inflate(resources, xmlPullParser, attributeSet, theme);
        return o0o0o00o;
    }

    public static PorterDuff.Mode o00oOoO(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            o0O0O0Oo.o00oOOoO.o00oOOoO(drawable);
            return false;
        }
        return false;
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f11685o00ooO0);
        if (this.f11685o00ooO0.width() <= 0 || this.f11685o00ooO0.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f11683o00oo0o0;
        if (colorFilter == null) {
            colorFilter = this.f11681o00oo0Oo;
        }
        canvas.getMatrix(this.f11686o00ooO00);
        this.f11686o00ooO00.getValues(this.f11679o00oo);
        float abs = Math.abs(this.f11679o00oo[0]);
        float abs2 = Math.abs(this.f11679o00oo[4]);
        float abs3 = Math.abs(this.f11679o00oo[1]);
        float abs4 = Math.abs(this.f11679o00oo[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f11685o00ooO0.width() * abs));
        int min2 = Math.min(2048, (int) (this.f11685o00ooO0.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f11685o00ooO0;
        canvas.translate(rect.left, rect.top);
        if (o00oOoO0()) {
            canvas.translate(this.f11685o00ooO0.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f11685o00ooO0.offsetTo(0, 0);
        this.f11680o00oo0O.o00oOo00(min, min2);
        if (!this.f11684o00oo0oO) {
            this.f11680o00oo0O.o00oOoOo(min, min2);
        } else if (!this.f11680o00oo0O.o00oOOoO()) {
            this.f11680o00oo0O.o00oOoOo(min, min2);
            this.f11680o00oo0O.o00oOoOO();
        }
        this.f11680o00oo0O.o00oOooO(canvas, colorFilter, this.f11685o00ooO0);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? o0O0O0Oo.o00oOOo0.o00oOOo0(drawable) : this.f11680o00oo0O.f11737o00oOOoO.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11680o00oo0O.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? o0O0O0Oo.o00oOOoO.o00oOo00(drawable) : this.f11683o00oo0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f11659o00oo0O0 != null) {
            return new o00oo0O0(this.f11659o00oo0O0.getConstantState());
        }
        this.f11680o00oo0O.f11736o00oOOo0 = getChangingConfigurations();
        return this.f11680o00oo0O;
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f11680o00oo0O.f11737o00oOOoO.f11722o00oOoOo;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f11680o00oo0O.f11737o00oOOoO.f11721o00oOoOO;
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            o0O0O0Oo.o00oOOoO.o00oOooO(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o00oo0OO o00oo0oo = this.f11680o00oo0O;
        o00oo0oo.f11737o00oOOoO = new o00oo0();
        TypedArray o00oo0o02 = o00ooo0o.o0O0o00.o00oo0o0(resources, theme, attributeSet, o0O0OO.f11562o00oOOo0);
        o00oOoo0(o00oo0o02, xmlPullParser, theme);
        o00oo0o02.recycle();
        o00oo0oo.f11736o00oOOo0 = getChangingConfigurations();
        o00oo0oo.f11747o00oOooo = true;
        o00oOo0o(resources, xmlPullParser, attributeSet, theme);
        this.f11681o00oo0Oo = o00oOooo(this.f11681o00oo0Oo, o00oo0oo.f11738o00oOo00, o00oo0oo.f11746o00oOooO);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? o0O0O0Oo.o00oOOo0.o00oOooO(drawable) : this.f11680o00oo0O.f11739o00oOo0O;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        o00oo0OO o00oo0oo;
        ColorStateList colorStateList;
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((o00oo0oo = this.f11680o00oo0O) != null && (o00oo0oo.o00oOoO0() || ((colorStateList = this.f11680o00oo0O.f11738o00oOo00) != null && colorStateList.isStateful())));
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f11682o00oo0o && super.mutate() == this) {
            this.f11680o00oo0O = new o00oo0OO(this.f11680o00oo0O);
            this.f11682o00oo0o = true;
        }
        return this;
    }

    public Object o00oOo0O(String str) {
        return this.f11680o00oo0O.f11737o00oOOoO.f11728o00oo0O0.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o00oOo0o(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        o00oOOoO o00ooooo2;
        o00oo0OO o00oo0oo = this.f11680o00oo0O;
        o00oo0 o00oo0Var = o00oo0oo.f11737o00oOOoO;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(o00oo0Var.f11719o00oOoO);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                o00oOo0O o00ooo0o2 = (o00oOo0O) arrayDeque.peek();
                if ("path".equals(name)) {
                    o00oOo00 o00ooo002 = new o00oOo00();
                    o00ooo002.o00oOoo0(resources, attributeSet, theme, xmlPullParser);
                    o00ooo0o2.f11701o00oOOoO.add(o00ooo002);
                    if (o00ooo002.getPathName() != null) {
                        o00oo0Var.f11728o00oo0O0.put(o00ooo002.getPathName(), o00ooo002);
                    }
                    z = false;
                    o00ooooo2 = o00ooo002;
                } else if (f11665o00ooO.equals(name)) {
                    o00oOOoO o00ooooo3 = new o00oOOoO();
                    o00ooooo3.o00oOoOO(resources, attributeSet, theme, xmlPullParser);
                    o00ooo0o2.f11701o00oOOoO.add(o00ooooo3);
                    String pathName = o00ooooo3.getPathName();
                    o00ooooo2 = o00ooooo3;
                    if (pathName != null) {
                        o00oo0Var.f11728o00oo0O0.put(o00ooooo3.getPathName(), o00ooooo3);
                        o00ooooo2 = o00ooooo3;
                    }
                } else if ("group".equals(name)) {
                    o00oOo0O o00ooo0o3 = new o00oOo0O();
                    o00ooo0o3.o00oOo00(resources, attributeSet, theme, xmlPullParser);
                    o00ooo0o2.f11701o00oOOoO.add(o00ooo0o3);
                    arrayDeque.push(o00ooo0o3);
                    if (o00ooo0o3.getGroupName() != null) {
                        o00oo0Var.f11728o00oo0O0.put(o00ooo0o3.getGroupName(), o00ooo0o3);
                    }
                    i = o00oo0oo.f11736o00oOOo0;
                    i2 = o00ooo0o3.f11709o00oOoo0;
                    o00oo0oo.f11736o00oOOo0 = i2 | i;
                }
                i = o00oo0oo.f11736o00oOOo0;
                i2 = o00ooooo2.f11734o00oOooO;
                o00oo0oo.f11736o00oOOo0 = i2 | i;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public final boolean o00oOoO0() {
        return isAutoMirrored() && o0O0O0Oo.o00oOo00.o00oOOo0(this) == 1;
    }

    public final void o00oOoOO(o00oOo0O o00ooo0o2, int i) {
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            str = o00oo.o00oOOo0(str, "    ");
        }
        o00ooo0o2.getGroupName();
        o00ooo0o2.getLocalMatrix().toString();
        for (int i3 = 0; i3 < o00ooo0o2.f11701o00oOOoO.size(); i3++) {
            o00oOoO o00oooo2 = o00ooo0o2.f11701o00oOOoO.get(i3);
            if (o00oooo2 instanceof o00oOo0O) {
                o00oOoOO((o00oOo0O) o00oooo2, i + 1);
            } else {
                ((o00oo00O) o00oooo2).o00oOoO0(i + 1);
            }
        }
    }

    public void o00oOoOo(boolean z) {
        this.f11684o00oo0oO = z;
    }

    public final void o00oOoo0(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        o00oo0OO o00oo0oo = this.f11680o00oo0O;
        o00oo0 o00oo0Var = o00oo0oo.f11737o00oOOoO;
        o00oo0oo.f11746o00oOooO = o00oOoO(o00ooo0o.o0O0o00.o00oOoo0(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList o00oOoO02 = o00ooo0o.o0O0o00.o00oOoO0(typedArray, xmlPullParser, theme, "tint", 1);
        if (o00oOoO02 != null) {
            o00oo0oo.f11738o00oOo00 = o00oOoO02;
        }
        o00oo0oo.f11739o00oOo0O = o00ooo0o.o0O0o00.o00oOo0O(typedArray, xmlPullParser, "autoMirrored", 5, o00oo0oo.f11739o00oOo0O);
        o00oo0Var.f11723o00oOoo0 = o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, "viewportWidth", 7, o00oo0Var.f11723o00oOoo0);
        float o00oOoOo2 = o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, "viewportHeight", 8, o00oo0Var.f11725o00oOooo);
        o00oo0Var.f11725o00oOooo = o00oOoOo2;
        if (o00oo0Var.f11723o00oOoo0 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (o00oOoOo2 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            o00oo0Var.f11721o00oOoOO = typedArray.getDimension(3, o00oo0Var.f11721o00oOoOO);
            float dimension = typedArray.getDimension(2, o00oo0Var.f11722o00oOoOo);
            o00oo0Var.f11722o00oOoOo = dimension;
            if (o00oo0Var.f11721o00oOoOO <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                o00oo0Var.setAlpha(o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, o00ooO00.o00oo0.f8113o00oOoO0, 4, o00oo0Var.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    o00oo0Var.f11726o00oo0 = string;
                    o00oo0Var.f11728o00oo0O0.put(string, o00oo0Var);
                }
            }
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public float o00oOooO() {
        o00oo0 o00oo0Var;
        o00oo0OO o00oo0oo = this.f11680o00oo0O;
        if (o00oo0oo == null || (o00oo0Var = o00oo0oo.f11737o00oOOoO) == null) {
            return 1.0f;
        }
        float f = o00oo0Var.f11721o00oOoOO;
        if (f != 0.0f) {
            float f2 = o00oo0Var.f11722o00oOoOo;
            if (f2 != 0.0f) {
                float f3 = o00oo0Var.f11725o00oOooo;
                if (f3 != 0.0f) {
                    float f4 = o00oo0Var.f11723o00oOoo0;
                    if (f4 == 0.0f) {
                        return 1.0f;
                    }
                    return Math.min(f4 / f, f3 / f2);
                }
                return 1.0f;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public PorterDuffColorFilter o00oOooo(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        o00oo0OO o00oo0oo = this.f11680o00oo0O;
        ColorStateList colorStateList = o00oo0oo.f11738o00oOo00;
        if (colorStateList != null && (mode = o00oo0oo.f11746o00oOooO) != null) {
            this.f11681o00oo0Oo = o00oOooo(this.f11681o00oo0Oo, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (o00oo0oo.o00oOoO0() && o00oo0oo.o00oOoO(iArr)) {
            invalidateSelf();
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f11680o00oo0O.f11737o00oOOoO.getRootAlpha() != i) {
            this.f11680o00oo0O.f11737o00oOOoO.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            o0O0O0Oo.o00oOOo0.o00oOo0O(drawable, z);
        } else {
            this.f11680o00oo0O.f11739o00oOo0O = z;
        }
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f11683o00oo0o0 = colorFilter;
        invalidateSelf();
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, o00oooo0.o0O0OOOo
    public void setTint(int i) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            o0O0O0Oo.o00oOOoO.o00oOoO0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, o00oooo0.o0O0OOOo
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            o0O0O0Oo.o00oOOoO.o00oOoO(drawable, colorStateList);
            return;
        }
        o00oo0OO o00oo0oo = this.f11680o00oo0O;
        if (o00oo0oo.f11738o00oOo00 != colorStateList) {
            o00oo0oo.f11738o00oOo00 = colorStateList;
            this.f11681o00oo0Oo = o00oOooo(this.f11681o00oo0Oo, colorStateList, o00oo0oo.f11746o00oOooO);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, o00oooo0.o0O0OOOo
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            o0O0O0Oo.o00oOOoO.o00oOoOO(drawable, mode);
            return;
        }
        o00oo0OO o00oo0oo = this.f11680o00oo0O;
        if (o00oo0oo.f11746o00oOooO != mode) {
            o00oo0oo.f11746o00oOooO = mode;
            this.f11681o00oo0Oo = o00oOooo(this.f11681o00oo0Oo, o00oo0oo.f11738o00oOo00, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O extends o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Matrix f11700o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final ArrayList<o00oOoO> f11701o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public float f11702o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public float f11703o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public float f11704o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public float f11705o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public float f11706o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public float f11707o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public final Matrix f11708o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public int f11709o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public float f11710o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public int[] f11711o00oOooo;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public String f11712o00oo00O;

        public o00oOo0O() {
            this.f11700o00oOOo0 = new Matrix();
            this.f11701o00oOOoO = new ArrayList<>();
            this.f11702o00oOo00 = 0.0f;
            this.f11710o00oOooO = 0.0f;
            this.f11703o00oOo0O = 0.0f;
            this.f11704o00oOo0o = 1.0f;
            this.f11706o00oOoO0 = 1.0f;
            this.f11705o00oOoO = 0.0f;
            this.f11707o00oOoOO = 0.0f;
            this.f11708o00oOoOo = new Matrix();
            this.f11712o00oo00O = null;
        }

        public String getGroupName() {
            return this.f11712o00oo00O;
        }

        public Matrix getLocalMatrix() {
            return this.f11708o00oOoOo;
        }

        public float getPivotX() {
            return this.f11710o00oOooO;
        }

        public float getPivotY() {
            return this.f11703o00oOo0O;
        }

        public float getRotation() {
            return this.f11702o00oOo00;
        }

        public float getScaleX() {
            return this.f11704o00oOo0o;
        }

        public float getScaleY() {
            return this.f11706o00oOoO0;
        }

        public float getTranslateX() {
            return this.f11705o00oOoO;
        }

        public float getTranslateY() {
            return this.f11707o00oOoOO;
        }

        @Override // o0O0Oo.o0O0o00O.o00oOoO
        public boolean o00oOOo0() {
            for (int i = 0; i < this.f11701o00oOOoO.size(); i++) {
                if (this.f11701o00oOOoO.get(i).o00oOOo0()) {
                    return true;
                }
            }
            return false;
        }

        @Override // o0O0Oo.o0O0o00O.o00oOoO
        public boolean o00oOOoO(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f11701o00oOOoO.size(); i++) {
                z |= this.f11701o00oOOoO.get(i).o00oOOoO(iArr);
            }
            return z;
        }

        public void o00oOo00(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray o00oo0o02 = o00ooo0o.o0O0o00.o00oo0o0(resources, theme, attributeSet, o0O0OO.f11571o00oOoo0);
            o00oOo0O(o00oo0o02, xmlPullParser);
            o00oo0o02.recycle();
        }

        public final void o00oOo0O(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f11711o00oOooo = null;
            this.f11702o00oOo00 = o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, o00ooO00.o00oo0.f8114o00oOoOO, 5, this.f11702o00oOo00);
            this.f11710o00oOooO = typedArray.getFloat(1, this.f11710o00oOooO);
            this.f11703o00oOo0O = typedArray.getFloat(2, this.f11703o00oOo0O);
            this.f11704o00oOo0o = o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, o00ooO00.o00oo0.f8123o00oo0OO, 3, this.f11704o00oOo0o);
            this.f11706o00oOoO0 = o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, o00ooO00.o00oo0.f8122o00oo0O0, 4, this.f11706o00oOoO0);
            this.f11705o00oOoO = o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, "translateX", 6, this.f11705o00oOoO);
            this.f11707o00oOoOO = o00ooo0o.o0O0o00.o00oOoOo(typedArray, xmlPullParser, "translateY", 7, this.f11707o00oOoOO);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f11712o00oo00O = string;
            }
            o00oOooO();
        }

        public final void o00oOooO() {
            this.f11708o00oOoOo.reset();
            this.f11708o00oOoOo.postTranslate(-this.f11710o00oOooO, -this.f11703o00oOo0O);
            this.f11708o00oOoOo.postScale(this.f11704o00oOo0o, this.f11706o00oOoO0);
            this.f11708o00oOoOo.postRotate(this.f11702o00oOo00, 0.0f, 0.0f);
            this.f11708o00oOoOo.postTranslate(this.f11705o00oOoO + this.f11710o00oOooO, this.f11707o00oOoOO + this.f11703o00oOo0O);
        }

        public void setPivotX(float f) {
            if (f != this.f11710o00oOooO) {
                this.f11710o00oOooO = f;
                o00oOooO();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f11703o00oOo0O) {
                this.f11703o00oOo0O = f;
                o00oOooO();
            }
        }

        public void setRotation(float f) {
            if (f != this.f11702o00oOo00) {
                this.f11702o00oOo00 = f;
                o00oOooO();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f11704o00oOo0o) {
                this.f11704o00oOo0o = f;
                o00oOooO();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f11706o00oOoO0) {
                this.f11706o00oOoO0 = f;
                o00oOooO();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f11705o00oOoO) {
                this.f11705o00oOoO = f;
                o00oOooO();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f11707o00oOoOO) {
                this.f11707o00oOoOO = f;
                o00oOooO();
            }
        }

        public o00oOo0O(o00oOo0O o00ooo0o2, androidx.collection.o00oOOo0<String, Object> o00oooo02) {
            o00oo00O o00ooooo2;
            this.f11700o00oOOo0 = new Matrix();
            this.f11701o00oOOoO = new ArrayList<>();
            this.f11702o00oOo00 = 0.0f;
            this.f11710o00oOooO = 0.0f;
            this.f11703o00oOo0O = 0.0f;
            this.f11704o00oOo0o = 1.0f;
            this.f11706o00oOoO0 = 1.0f;
            this.f11705o00oOoO = 0.0f;
            this.f11707o00oOoOO = 0.0f;
            Matrix matrix = new Matrix();
            this.f11708o00oOoOo = matrix;
            this.f11712o00oo00O = null;
            this.f11702o00oOo00 = o00ooo0o2.f11702o00oOo00;
            this.f11710o00oOooO = o00ooo0o2.f11710o00oOooO;
            this.f11703o00oOo0O = o00ooo0o2.f11703o00oOo0O;
            this.f11704o00oOo0o = o00ooo0o2.f11704o00oOo0o;
            this.f11706o00oOoO0 = o00ooo0o2.f11706o00oOoO0;
            this.f11705o00oOoO = o00ooo0o2.f11705o00oOoO;
            this.f11707o00oOoOO = o00ooo0o2.f11707o00oOoOO;
            this.f11711o00oOooo = o00ooo0o2.f11711o00oOooo;
            String str = o00ooo0o2.f11712o00oo00O;
            this.f11712o00oo00O = str;
            this.f11709o00oOoo0 = o00ooo0o2.f11709o00oOoo0;
            if (str != null) {
                o00oooo02.put(str, this);
            }
            matrix.set(o00ooo0o2.f11708o00oOoOo);
            ArrayList<o00oOoO> arrayList = o00ooo0o2.f11701o00oOOoO;
            for (int i = 0; i < arrayList.size(); i++) {
                o00oOoO o00oooo2 = arrayList.get(i);
                if (o00oooo2 instanceof o00oOo0O) {
                    this.f11701o00oOOoO.add(new o00oOo0O((o00oOo0O) o00oooo2, o00oooo02));
                } else {
                    if (o00oooo2 instanceof o00oOo00) {
                        o00ooooo2 = new o00oOo00((o00oOo00) o00oooo2);
                    } else if (!(o00oooo2 instanceof o00oOOoO)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        o00ooooo2 = new o00oOOoO((o00oOOoO) o00oooo2);
                    }
                    this.f11701o00oOOoO.add(o00ooooo2);
                    String str2 = o00ooooo2.f11732o00oOOoO;
                    if (str2 != null) {
                        o00oooo02.put(str2, o00ooooo2);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo00O extends o00oOoO {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f11730o00oOo0O = 0;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public oOO0O0O0.o00oOOoO[] f11731o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public String f11732o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f11733o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f11734o00oOooO;

        public o00oo00O() {
            this.f11731o00oOOo0 = null;
            this.f11733o00oOo00 = 0;
        }

        public oOO0O0O0.o00oOOoO[] getPathData() {
            return this.f11731o00oOOo0;
        }

        public String getPathName() {
            return this.f11732o00oOOoO;
        }

        public void o00oOo00(Resources.Theme theme) {
        }

        public boolean o00oOo0O() {
            return false;
        }

        public String o00oOo0o(oOO0O0O0.o00oOOoO[] o00oooooArr) {
            String str = " ";
            for (int i = 0; i < o00oooooArr.length; i++) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(str);
                o00oOOo02.append(o00oooooArr[i].f9805o00oOOo0);
                o00oOOo02.append(":");
                str = o00oOOo02.toString();
                for (float f : o00oooooArr[i].f9806o00oOOoO) {
                    StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0(str);
                    o00oOOo03.append(f);
                    o00oOOo03.append(",");
                    str = o00oOOo03.toString();
                }
            }
            return str;
        }

        public void o00oOoO(Path path) {
            path.reset();
            oOO0O0O0.o00oOOoO[] o00oooooArr = this.f11731o00oOOo0;
            if (o00oooooArr != null) {
                oOO0O0O0.o00oOOoO.o00oOo0O(o00oooooArr, path);
            }
        }

        public void o00oOoO0(int i) {
            String str = "";
            for (int i2 = 0; i2 < i; i2++) {
                str = o00oo.o00oOOo0(str, "    ");
            }
            o00oOo0o(this.f11731o00oOOo0);
        }

        public boolean o00oOooO() {
            return false;
        }

        public void setPathData(oOO0O0O0.o00oOOoO[] o00oooooArr) {
            if (oOO0O0O0.o00oOOoO(this.f11731o00oOOo0, o00oooooArr)) {
                oOO0O0O0.o00oOoo0(this.f11731o00oOOo0, o00oooooArr);
            } else {
                this.f11731o00oOOo0 = oOO0O0O0.o00oOo0o(o00oooooArr);
            }
        }

        public o00oo00O(o00oo00O o00oo00o) {
            this.f11731o00oOOo0 = null;
            this.f11733o00oOo00 = 0;
            this.f11732o00oOOoO = o00oo00o.f11732o00oOOoO;
            this.f11734o00oOooO = o00oo00o.f11734o00oOooO;
            this.f11731o00oOOo0 = oOO0O0O0.o00oOo0o(o00oo00o.f11731o00oOOo0);
        }
    }
}
