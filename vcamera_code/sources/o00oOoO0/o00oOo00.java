package o00oOoO0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import o00oOooO.o0O00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00oooo0.o0O0O0Oo;
/* loaded from: classes.dex */
public class o00oOo00 extends Drawable implements Drawable.Callback {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final boolean f6921o00ooO = false;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final boolean f6922o00ooOO = true;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final String f6923o00ooOO0 = "DrawableContainerCompat";

    /* renamed from: o00oo  reason: collision with root package name */
    public boolean f6924o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Rect f6925o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00oOo0O f6926o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Drawable f6927o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public Drawable f6929o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public boolean f6930o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public long f6931o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public Runnable f6932o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public long f6933o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public C0102o00oOo00 f6934o00ooO0o;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f6928o00oo0o = 255;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f6935o0O0o = -1;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o00oOo00.this.o00oOOo0(true);
            o00oOo00.this.invalidateSelf();
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        public static boolean o00oOOo0(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void o00oOOoO(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources o00oOo00(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: o00oOoO0.o00oOo00$o00oOo00  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0102o00oOo00 implements Drawable.Callback {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public Drawable.Callback f6937o00oo0O0;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@oo0oO0 Drawable drawable) {
        }

        public Drawable.Callback o00oOOo0() {
            Drawable.Callback callback = this.f6937o00oo0O0;
            this.f6937o00oo0O0 = null;
            return callback;
        }

        public C0102o00oOo00 o00oOOoO(Drawable.Callback callback) {
            this.f6937o00oo0O0 = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@oo0oO0 Drawable drawable, @oo0oO0 Runnable runnable, long j) {
            Drawable.Callback callback = this.f6937o00oo0O0;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@oo0oO0 Drawable drawable, @oo0oO0 Runnable runnable) {
            Drawable.Callback callback = this.f6937o00oo0O0;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOo0O extends Drawable.ConstantState {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oOo00 f6938o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public Resources f6939o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f6940o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f6941o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f6942o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public int f6943o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public Drawable[] f6944o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public boolean f6945o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public boolean f6946o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public Rect f6947o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f6948o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public boolean f6949o00oOooo;

        /* renamed from: o00oo  reason: collision with root package name */
        public boolean f6950o00oo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public int f6951o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public boolean f6952o00oo00O;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f6953o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f6954o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public int f6955o00oo0OO;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f6956o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public boolean f6957o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public int f6958o00oo0o0;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public boolean f6959o00oo0oO;

        /* renamed from: o00ooO  reason: collision with root package name */
        public int f6960o00ooO;

        /* renamed from: o00ooO0  reason: collision with root package name */
        public boolean f6961o00ooO0;

        /* renamed from: o00ooO00  reason: collision with root package name */
        public boolean f6962o00ooO00;

        /* renamed from: o00ooO0O  reason: collision with root package name */
        public int f6963o00ooO0O;

        /* renamed from: o00ooO0o  reason: collision with root package name */
        public int f6964o00ooO0o;

        /* renamed from: o00ooOO  reason: collision with root package name */
        public ColorFilter f6965o00ooOO;

        /* renamed from: o00ooOO0  reason: collision with root package name */
        public boolean f6966o00ooOO0;

        /* renamed from: o00ooOOo  reason: collision with root package name */
        public boolean f6967o00ooOOo;

        /* renamed from: o00ooOo  reason: collision with root package name */
        public PorterDuff.Mode f6968o00ooOo;

        /* renamed from: o00ooOo0  reason: collision with root package name */
        public ColorStateList f6969o00ooOo0;

        /* renamed from: o00ooOoO  reason: collision with root package name */
        public boolean f6970o00ooOoO;

        /* renamed from: o00ooOoo  reason: collision with root package name */
        public boolean f6971o00ooOoo;

        /* renamed from: o0O0o  reason: collision with root package name */
        public boolean f6972o0O0o;

        public o00oOo0O(o00oOo0O o00ooo0o2, o00oOo00 o00ooo002, Resources resources) {
            this.f6945o00oOoOO = false;
            this.f6949o00oOooo = false;
            this.f6962o00ooO00 = true;
            this.f6964o00ooO0o = 0;
            this.f6960o00ooO = 0;
            this.f6938o00oOOo0 = o00ooo002;
            this.f6939o00oOOoO = resources != null ? resources : o00ooo0o2 != null ? o00ooo0o2.f6939o00oOOoO : null;
            int o00oOoO02 = o00oOo00.o00oOoO0(resources, o00ooo0o2 != null ? o00ooo0o2.f6940o00oOo00 : 0);
            this.f6940o00oOo00 = o00oOoO02;
            if (o00ooo0o2 == null) {
                this.f6944o00oOoO0 = new Drawable[10];
                this.f6943o00oOoO = 0;
                return;
            }
            this.f6948o00oOooO = o00ooo0o2.f6948o00oOooO;
            this.f6941o00oOo0O = o00ooo0o2.f6941o00oOo0O;
            this.f6972o0O0o = true;
            this.f6950o00oo = true;
            this.f6945o00oOoOO = o00ooo0o2.f6945o00oOoOO;
            this.f6949o00oOooo = o00ooo0o2.f6949o00oOooo;
            this.f6962o00ooO00 = o00ooo0o2.f6962o00ooO00;
            this.f6961o00ooO0 = o00ooo0o2.f6961o00ooO0;
            this.f6963o00ooO0O = o00ooo0o2.f6963o00ooO0O;
            this.f6964o00ooO0o = o00ooo0o2.f6964o00ooO0o;
            this.f6960o00ooO = o00ooo0o2.f6960o00ooO;
            this.f6966o00ooOO0 = o00ooo0o2.f6966o00ooOO0;
            this.f6965o00ooOO = o00ooo0o2.f6965o00ooOO;
            this.f6967o00ooOOo = o00ooo0o2.f6967o00ooOOo;
            this.f6969o00ooOo0 = o00ooo0o2.f6969o00ooOo0;
            this.f6968o00ooOo = o00ooo0o2.f6968o00ooOo;
            this.f6970o00ooOoO = o00ooo0o2.f6970o00ooOoO;
            this.f6971o00ooOoo = o00ooo0o2.f6971o00ooOoo;
            if (o00ooo0o2.f6940o00oOo00 == o00oOoO02) {
                if (o00ooo0o2.f6946o00oOoOo) {
                    this.f6947o00oOoo0 = o00ooo0o2.f6947o00oOoo0 != null ? new Rect(o00ooo0o2.f6947o00oOoo0) : null;
                    this.f6946o00oOoOo = true;
                }
                if (o00ooo0o2.f6952o00oo00O) {
                    this.f6951o00oo0 = o00ooo0o2.f6951o00oo0;
                    this.f6955o00oo0OO = o00ooo0o2.f6955o00oo0OO;
                    this.f6954o00oo0O0 = o00ooo0o2.f6954o00oo0O0;
                    this.f6953o00oo0O = o00ooo0o2.f6953o00oo0O;
                    this.f6952o00oo00O = true;
                }
            }
            if (o00ooo0o2.f6956o00oo0Oo) {
                this.f6958o00oo0o0 = o00ooo0o2.f6958o00oo0o0;
                this.f6956o00oo0Oo = true;
            }
            if (o00ooo0o2.f6957o00oo0o) {
                this.f6959o00oo0oO = o00ooo0o2.f6959o00oo0oO;
                this.f6957o00oo0o = true;
            }
            Drawable[] drawableArr = o00ooo0o2.f6944o00oOoO0;
            this.f6944o00oOoO0 = new Drawable[drawableArr.length];
            this.f6943o00oOoO = o00ooo0o2.f6943o00oOoO;
            SparseArray<Drawable.ConstantState> sparseArray = o00ooo0o2.f6942o00oOo0o;
            this.f6942o00oOo0o = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f6943o00oOoO);
            int i = this.f6943o00oOoO;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f6942o00oOo0o.put(i2, constantState);
                    } else {
                        this.f6944o00oOoO0[i2] = drawableArr[i2];
                    }
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0OOooO0(21)
        public boolean canApplyTheme() {
            int i = this.f6943o00oOoO;
            Drawable[] drawableArr = this.f6944o00oOoO0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f6942o00oOo0o.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (o0O0O0Oo.o00oOOoO.o00oOOoO(drawable)) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6948o00oOooO | this.f6941o00oOo0O;
        }

        public final int o00oOOo0(Drawable drawable) {
            int i = this.f6943o00oOoO;
            if (i >= this.f6944o00oOoO0.length) {
                o00oo0Oo(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f6938o00oOOo0);
            this.f6944o00oOoO0[i] = drawable;
            this.f6943o00oOoO++;
            this.f6941o00oOo0O = drawable.getChangingConfigurations() | this.f6941o00oOo0O;
            o00oo0o0();
            this.f6947o00oOoo0 = null;
            this.f6946o00oOoOo = false;
            this.f6952o00oo00O = false;
            this.f6972o0O0o = false;
            return i;
        }

        @o0OOooO0(21)
        public final void o00oOOoO(Resources.Theme theme) {
            if (theme != null) {
                o00oOo0o();
                int i = this.f6943o00oOoO;
                Drawable[] drawableArr = this.f6944o00oOoO0;
                for (int i2 = 0; i2 < i; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null && o0O0O0Oo.o00oOOoO.o00oOOoO(drawable)) {
                        o0O0O0Oo.o00oOOoO.o00oOOo0(drawableArr[i2], theme);
                        this.f6941o00oOo0O |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                o00ooOO0(theme.getResources());
            }
        }

        public boolean o00oOo00() {
            if (this.f6972o0O0o) {
                return this.f6950o00oo;
            }
            o00oOo0o();
            this.f6972o0O0o = true;
            int i = this.f6943o00oOoO;
            Drawable[] drawableArr = this.f6944o00oOoO0;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f6950o00oo = false;
                    return false;
                }
            }
            this.f6950o00oo = true;
            return true;
        }

        public void o00oOo0O() {
            this.f6952o00oo00O = true;
            o00oOo0o();
            int i = this.f6943o00oOoO;
            Drawable[] drawableArr = this.f6944o00oOoO0;
            this.f6955o00oo0OO = -1;
            this.f6951o00oo0 = -1;
            this.f6953o00oo0O = 0;
            this.f6954o00oo0O0 = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f6951o00oo0) {
                    this.f6951o00oo0 = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f6955o00oo0OO) {
                    this.f6955o00oo0OO = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f6954o00oo0O0) {
                    this.f6954o00oo0O0 = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f6953o00oo0O) {
                    this.f6953o00oo0O = minimumHeight;
                }
            }
        }

        public final void o00oOo0o() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f6942o00oOo0o;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f6944o00oOoO0[this.f6942o00oOo0o.keyAt(i)] = o00oo(this.f6942o00oOo0o.valueAt(i).newDrawable(this.f6939o00oOOoO));
                }
                this.f6942o00oOo0o = null;
            }
        }

        public final Drawable o00oOoO(int i) {
            int indexOfKey;
            Drawable drawable = this.f6944o00oOoO0[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f6942o00oOo0o;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable o00oo2 = o00oo(this.f6942o00oOo0o.valueAt(indexOfKey).newDrawable(this.f6939o00oOOoO));
            this.f6944o00oOoO0[i] = o00oo2;
            this.f6942o00oOo0o.removeAt(indexOfKey);
            if (this.f6942o00oOo0o.size() == 0) {
                this.f6942o00oOo0o = null;
            }
            return o00oo2;
        }

        public final int o00oOoO0() {
            return this.f6944o00oOoO0.length;
        }

        public final int o00oOoOO() {
            return this.f6943o00oOoO;
        }

        public final int o00oOoOo() {
            if (!this.f6952o00oo00O) {
                o00oOo0O();
            }
            return this.f6955o00oo0OO;
        }

        public final int o00oOoo0() {
            if (!this.f6952o00oo00O) {
                o00oOo0O();
            }
            return this.f6953o00oo0O;
        }

        public final void o00oOooO() {
            this.f6961o00ooO0 = false;
        }

        public final int o00oOooo() {
            if (!this.f6952o00oo00O) {
                o00oOo0O();
            }
            return this.f6954o00oo0O0;
        }

        public final Drawable o00oo(Drawable drawable) {
            o0O0O0Oo.o00oOo00.o00oOOoO(drawable, this.f6963o00ooO0O);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f6938o00oOOo0);
            return mutate;
        }

        public final int o00oo0() {
            if (!this.f6952o00oo00O) {
                o00oOo0O();
            }
            return this.f6951o00oo0;
        }

        public final Rect o00oo00O() {
            Rect rect = null;
            if (this.f6945o00oOoOO) {
                return null;
            }
            Rect rect2 = this.f6947o00oOoo0;
            if (rect2 != null || this.f6946o00oOoOo) {
                return rect2;
            }
            o00oOo0o();
            Rect rect3 = new Rect();
            int i = this.f6943o00oOoO;
            Drawable[] drawableArr = this.f6944o00oOoO0;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f6946o00oOoOo = true;
            this.f6947o00oOoo0 = rect;
            return rect;
        }

        public final int o00oo0O() {
            if (this.f6956o00oo0Oo) {
                return this.f6958o00oo0o0;
            }
            o00oOo0o();
            int i = this.f6943o00oOoO;
            Drawable[] drawableArr = this.f6944o00oOoO0;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f6958o00oo0o0 = opacity;
            this.f6956o00oo0Oo = true;
            return opacity;
        }

        public final int o00oo0O0() {
            return this.f6960o00ooO;
        }

        public final int o00oo0OO() {
            return this.f6964o00ooO0o;
        }

        public void o00oo0Oo(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f6944o00oOoO0;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f6944o00oOoO0 = drawableArr;
        }

        public final boolean o00oo0o() {
            return this.f6949o00oOooo;
        }

        public void o00oo0o0() {
            this.f6956o00oo0Oo = false;
            this.f6957o00oo0o = false;
        }

        public final boolean o00oo0oO() {
            if (this.f6957o00oo0o) {
                return this.f6959o00oo0oO;
            }
            o00oOo0o();
            int i = this.f6943o00oOoO;
            Drawable[] drawableArr = this.f6944o00oOoO0;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f6959o00oo0oO = z;
            this.f6957o00oo0o = true;
            return z;
        }

        public final void o00ooO(boolean z) {
            this.f6945o00oOoOO = z;
        }

        public final void o00ooO0(int i) {
            this.f6964o00ooO0o = i;
        }

        public final void o00ooO00(boolean z) {
            this.f6949o00oOooo = z;
        }

        public final void o00ooO0O(int i) {
            this.f6960o00ooO = i;
        }

        public final boolean o00ooO0o(int i, int i2) {
            int i3 = this.f6943o00oOoO;
            Drawable[] drawableArr = this.f6944o00oOoO0;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    boolean o00oOOoO2 = o0O0O0Oo.o00oOo00.o00oOOoO(drawable, i);
                    if (i4 == i2) {
                        z = o00oOOoO2;
                    }
                }
            }
            this.f6963o00ooO0O = i;
            return z;
        }

        public final void o00ooOO0(Resources resources) {
            if (resources != null) {
                this.f6939o00oOOoO = resources;
                int o00oOoO02 = o00oOo00.o00oOoO0(resources, this.f6940o00oOo00);
                int i = this.f6940o00oOo00;
                this.f6940o00oOo00 = o00oOoO02;
                if (i != o00oOoO02) {
                    this.f6952o00oo00O = false;
                    this.f6946o00oOoOo = false;
                }
            }
        }

        public void o0O0o() {
            int i = this.f6943o00oOoO;
            Drawable[] drawableArr = this.f6944o00oOoO0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f6961o00ooO0 = true;
        }
    }

    public static int o00oOoO0(@o0OO00OO Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    @o0OOooO0(21)
    public void applyTheme(@oo0oO0 Resources.Theme theme) {
        this.f6926o00oo0O0.o00oOOoO(theme);
    }

    @Override // android.graphics.drawable.Drawable
    @o0OOooO0(21)
    public boolean canApplyTheme() {
        return this.f6926o00oo0O0.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@oo0oO0 Canvas canvas) {
        Drawable drawable = this.f6927o00oo0Oo;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f6929o00oo0o0;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6928o00oo0o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f6926o00oo0O0.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f6926o00oo0O0.o00oOo00()) {
            this.f6926o00oo0O0.f6948o00oOooO = getChangingConfigurations();
            return this.f6926o00oo0O0;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    @oo0oO0
    public Drawable getCurrent() {
        return this.f6927o00oo0Oo;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@oo0oO0 Rect rect) {
        Rect rect2 = this.f6925o00oo0O;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f6926o00oo0O0.o00oo0o()) {
            return this.f6926o00oo0O0.o00oOoOo();
        }
        Drawable drawable = this.f6927o00oo0Oo;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f6926o00oo0O0.o00oo0o()) {
            return this.f6926o00oo0O0.o00oo0();
        }
        Drawable drawable = this.f6927o00oo0Oo;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f6926o00oo0O0.o00oo0o()) {
            return this.f6926o00oo0O0.o00oOoo0();
        }
        Drawable drawable = this.f6927o00oo0Oo;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f6926o00oo0O0.o00oo0o()) {
            return this.f6926o00oo0O0.o00oOooo();
        }
        Drawable drawable = this.f6927o00oo0Oo;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6927o00oo0Oo;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f6926o00oo0O0.o00oo0O();
    }

    @Override // android.graphics.drawable.Drawable
    @o0OOooO0(21)
    public void getOutline(@oo0oO0 Outline outline) {
        Drawable drawable = this.f6927o00oo0Oo;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@oo0oO0 Rect rect) {
        boolean padding;
        Rect o00oo00O2 = this.f6926o00oo0O0.o00oo00O();
        if (o00oo00O2 != null) {
            rect.set(o00oo00O2);
            padding = (o00oo00O2.right | ((o00oo00O2.left | o00oo00O2.top) | o00oo00O2.bottom)) != 0;
        } else {
            Drawable drawable = this.f6927o00oo0Oo;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (o00oOo0o()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@oo0oO0 Drawable drawable) {
        o00oOo0O o00ooo0o2 = this.f6926o00oo0O0;
        if (o00ooo0o2 != null) {
            o00ooo0o2.o00oo0o0();
        }
        if (drawable != this.f6927o00oo0Oo || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f6926o00oo0O0.f6966o00ooOO0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f6926o00oo0O0.o00oo0oO();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f6929o00oo0o0;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f6929o00oo0o0 = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f6927o00oo0Oo;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f6930o00oo0oO) {
                this.f6927o00oo0Oo.setAlpha(this.f6928o00oo0o);
            }
        }
        if (this.f6933o00ooO0O != 0) {
            this.f6933o00ooO0O = 0L;
            z = true;
        }
        if (this.f6931o00ooO0 != 0) {
            this.f6931o00ooO0 = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f6924o00oo && super.mutate() == this) {
            o00oOo0O o00oOo002 = o00oOo00();
            o00oOo002.o0O0o();
            o00oOoOO(o00oOo002);
            this.f6924o00oo = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oOOo0(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f6930o00oo0oO = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f6927o00oo0Oo
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L34
            long r9 = r13.f6931o00ooO0
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L36
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f6928o00oo0o
            r3.setAlpha(r9)
            goto L34
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            o00oOoO0.o00oOo00$o00oOo0O r10 = r13.f6926o00oo0O0
            int r10 = r10.f6964o00ooO0o
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f6928o00oo0o
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L37
        L34:
            r13.f6931o00ooO0 = r7
        L36:
            r3 = r6
        L37:
            android.graphics.drawable.Drawable r9 = r13.f6929o00oo0o0
            if (r9 == 0) goto L5d
            long r10 = r13.f6933o00ooO0O
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L5f
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4c
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f6929o00oo0o0 = r0
            goto L5d
        L4c:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            o00oOoO0.o00oOo00$o00oOo0O r4 = r13.f6926o00oo0O0
            int r4 = r4.f6960o00ooO
            int r3 = r3 / r4
            int r4 = r13.f6928o00oo0o
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L60
        L5d:
            r13.f6933o00ooO0O = r7
        L5f:
            r0 = r3
        L60:
            if (r14 == 0) goto L6c
            if (r0 == 0) goto L6c
            java.lang.Runnable r14 = r13.f6932o00ooO00
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00oOoO0.o00oOo00.o00oOOo0(boolean):void");
    }

    public void o00oOOoO() {
        this.f6926o00oo0O0.o00oOooO();
        this.f6924o00oo = false;
    }

    public o00oOo0O o00oOo00() {
        return this.f6926o00oo0O0;
    }

    public final void o00oOo0O(Drawable drawable) {
        if (this.f6934o00ooO0o == null) {
            this.f6934o00ooO0o = new C0102o00oOo00();
        }
        drawable.setCallback(this.f6934o00ooO0o.o00oOOoO(drawable.getCallback()));
        try {
            if (this.f6926o00oo0O0.f6964o00ooO0o <= 0 && this.f6930o00oo0oO) {
                drawable.setAlpha(this.f6928o00oo0o);
            }
            o00oOo0O o00ooo0o2 = this.f6926o00oo0O0;
            if (o00ooo0o2.f6967o00ooOOo) {
                drawable.setColorFilter(o00ooo0o2.f6965o00ooOO);
            } else {
                if (o00ooo0o2.f6970o00ooOoO) {
                    o0O0O0Oo.o00oOOoO.o00oOoO(drawable, o00ooo0o2.f6969o00ooOo0);
                }
                o00oOo0O o00ooo0o3 = this.f6926o00oo0O0;
                if (o00ooo0o3.f6971o00ooOoo) {
                    o0O0O0Oo.o00oOOoO.o00oOoOO(drawable, o00ooo0o3.f6968o00ooOo);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f6926o00oo0O0.f6962o00ooO00);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            o0O0O0Oo.o00oOo00.o00oOOoO(drawable, o0O0O0Oo.o00oOo00.o00oOOo0(this));
            o0O0O0Oo.o00oOOo0.o00oOo0O(drawable, this.f6926o00oo0O0.f6966o00ooOO0);
            Rect rect = this.f6925o00oo0O;
            if (rect != null) {
                o0O0O0Oo.o00oOOoO.o00oOo0o(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f6934o00ooO0o.o00oOOo0());
        }
    }

    public final boolean o00oOo0o() {
        return isAutoMirrored() && o0O0O0Oo.o00oOo00.o00oOOo0(this) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o00oOoO(int r10) {
        /*
            r9 = this;
            int r0 = r9.f6935o0O0o
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            o00oOoO0.o00oOo00$o00oOo0O r0 = r9.f6926o00oo0O0
            int r0 = r0.f6960o00ooO
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f6929o00oo0o0
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f6927o00oo0Oo
            if (r0 == 0) goto L29
            r9.f6929o00oo0o0 = r0
            o00oOoO0.o00oOo00$o00oOo0O r0 = r9.f6926o00oo0O0
            int r0 = r0.f6960o00ooO
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f6933o00ooO0O = r0
            goto L35
        L29:
            r9.f6929o00oo0o0 = r4
            r9.f6933o00ooO0O = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f6927o00oo0Oo
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            o00oOoO0.o00oOo00$o00oOo0O r0 = r9.f6926o00oo0O0
            int r1 = r0.f6943o00oOoO
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.o00oOoO(r10)
            r9.f6927o00oo0Oo = r0
            r9.f6935o0O0o = r10
            if (r0 == 0) goto L5a
            o00oOoO0.o00oOo00$o00oOo0O r10 = r9.f6926o00oo0O0
            int r10 = r10.f6964o00ooO0o
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f6931o00ooO0 = r2
        L51:
            r9.o00oOo0O(r0)
            goto L5a
        L55:
            r9.f6927o00oo0Oo = r4
            r10 = -1
            r9.f6935o0O0o = r10
        L5a:
            long r0 = r9.f6931o00ooO0
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f6933o00ooO0O
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f6932o00ooO00
            if (r10 != 0) goto L73
            o00oOoO0.o00oOo00$o00oOOo0 r10 = new o00oOoO0.o00oOo00$o00oOOo0
            r10.<init>()
            r9.f6932o00ooO00 = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.o00oOOo0(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o00oOoO0.o00oOo00.o00oOoO(int):boolean");
    }

    public void o00oOoOO(o00oOo0O o00ooo0o2) {
        this.f6926o00oo0O0 = o00ooo0o2;
        int i = this.f6935o0O0o;
        if (i >= 0) {
            Drawable o00oOoO2 = o00ooo0o2.o00oOoO(i);
            this.f6927o00oo0Oo = o00oOoO2;
            if (o00oOoO2 != null) {
                o00oOo0O(o00oOoO2);
            }
        }
        this.f6929o00oo0o0 = null;
    }

    public void o00oOoOo(int i) {
        o00oOoO(i);
    }

    public void o00oOoo0(int i) {
        this.f6926o00oo0O0.f6964o00ooO0o = i;
    }

    public int o00oOooO() {
        return this.f6935o0O0o;
    }

    public void o00oOooo(int i) {
        this.f6926o00oo0O0.f6960o00ooO = i;
    }

    public final void o00oo00O(Resources resources) {
        this.f6926o00oo0O0.o00ooOO0(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6929o00oo0o0;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f6927o00oo0Oo;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.f6926o00oo0O0.o00ooO0o(i, o00oOooO());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f6929o00oo0o0;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f6927o00oo0Oo;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@oo0oO0 int[] iArr) {
        Drawable drawable = this.f6929o00oo0o0;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f6927o00oo0Oo;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@oo0oO0 Drawable drawable, @oo0oO0 Runnable runnable, long j) {
        if (drawable != this.f6927o00oo0Oo || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f6930o00oo0oO && this.f6928o00oo0o == i) {
            return;
        }
        this.f6930o00oo0oO = true;
        this.f6928o00oo0o = i;
        Drawable drawable = this.f6927o00oo0Oo;
        if (drawable != null) {
            if (this.f6931o00ooO0 == 0) {
                drawable.setAlpha(i);
            } else {
                o00oOOo0(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        o00oOo0O o00ooo0o2 = this.f6926o00oo0O0;
        if (o00ooo0o2.f6966o00ooOO0 != z) {
            o00ooo0o2.f6966o00ooOO0 = z;
            Drawable drawable = this.f6927o00oo0Oo;
            if (drawable != null) {
                o0O0O0Oo.o00oOOo0.o00oOo0O(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        o00oOo0O o00ooo0o2 = this.f6926o00oo0O0;
        o00ooo0o2.f6967o00ooOOo = true;
        if (o00ooo0o2.f6965o00ooOO != colorFilter) {
            o00ooo0o2.f6965o00ooOO = colorFilter;
            Drawable drawable = this.f6927o00oo0Oo;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        o00oOo0O o00ooo0o2 = this.f6926o00oo0O0;
        if (o00ooo0o2.f6962o00ooO00 != z) {
            o00ooo0o2.f6962o00ooO00 = z;
            Drawable drawable = this.f6927o00oo0Oo;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f6927o00oo0Oo;
        if (drawable != null) {
            o0O0O0Oo.o00oOOoO.o00oOo0O(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f6925o00oo0O;
        if (rect == null) {
            this.f6925o00oo0O = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f6927o00oo0Oo;
        if (drawable != null) {
            o0O0O0Oo.o00oOOoO.o00oOo0o(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@o0O00O int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        o00oOo0O o00ooo0o2 = this.f6926o00oo0O0;
        o00ooo0o2.f6970o00ooOoO = true;
        if (o00ooo0o2.f6969o00ooOo0 != colorStateList) {
            o00ooo0o2.f6969o00ooOo0 = colorStateList;
            o0O0O0Oo.o00oOOoO.o00oOoO(this.f6927o00oo0Oo, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@oo0oO0 PorterDuff.Mode mode) {
        o00oOo0O o00ooo0o2 = this.f6926o00oo0O0;
        o00ooo0o2.f6971o00ooOoo = true;
        if (o00ooo0o2.f6968o00ooOo != mode) {
            o00ooo0o2.f6968o00ooOo = mode;
            o0O0O0Oo.o00oOOoO.o00oOoOO(this.f6927o00oo0Oo, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f6929o00oo0o0;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f6927o00oo0Oo;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@oo0oO0 Drawable drawable, @oo0oO0 Runnable runnable) {
        if (drawable != this.f6927o00oo0Oo || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
