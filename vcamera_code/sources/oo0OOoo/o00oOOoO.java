package oo0OOoo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import o00oOooO.o0O00O;
import o00oOooO.o0O00OOO;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
/* loaded from: classes.dex */
public class o00oOOoO extends androidx.viewpager.widget.o00oOOo0 {

    /* renamed from: o0O000  reason: collision with root package name */
    public static final int f17233o0O000 = 3;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public static final String f17234o0O0000o = "PagerTabStrip";

    /* renamed from: o0O000O  reason: collision with root package name */
    public static final int f17235o0O000O = 6;

    /* renamed from: o0O000Oo  reason: collision with root package name */
    public static final int f17236o0O000Oo = 32;

    /* renamed from: o0O000o  reason: collision with root package name */
    public static final int f17237o0O000o = 32;

    /* renamed from: o0O000o0  reason: collision with root package name */
    public static final int f17238o0O000o0 = 1;

    /* renamed from: o0OoOoOO  reason: collision with root package name */
    public static final int f17239o0OoOoOO = 64;

    /* renamed from: o0OoOoOo  reason: collision with root package name */
    public static final int f17240o0OoOoOo = 16;

    /* renamed from: o0  reason: collision with root package name */
    public float f17241o0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public int f17242o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public int f17243o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public int f17244o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public int f17245o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public int f17246o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public int f17247o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public final Paint f17248o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public final Rect f17249o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public int f17250o00oooOo;

    /* renamed from: o00oooo  reason: collision with root package name */
    public boolean f17251o00oooo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public boolean f17252o00oooo0;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public int f17253o00ooooO;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public boolean f17254o00ooooo;

    /* renamed from: o0O00000  reason: collision with root package name */
    public float f17255o0O00000;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public int f17256o0O0000O;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements View.OnClickListener {
        public o00oOOo0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = o00oOOoO.this.f5322o00oo0O0;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* renamed from: oo0OOoo.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0226o00oOOoO implements View.OnClickListener {
        public View$OnClickListenerC0226o00oOOoO() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = o00oOOoO.this.f5322o00oo0O0;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public o00oOOoO(@oo0oO0 Context context) {
        this(context, null);
    }

    public o00oOOoO(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f17248o00oooO = paint;
        this.f17249o00oooOO = new Rect();
        this.f17250o00oooOo = 255;
        this.f17252o00oooo0 = false;
        this.f17251o00oooo = false;
        int i = this.f5332o00ooOO0;
        this.f17242o00ooOoO = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f17243o00ooOoo = (int) ((3.0f * f) + 0.5f);
        this.f17245o00ooo00 = (int) ((6.0f * f) + 0.5f);
        this.f17244o00ooo0 = (int) (64.0f * f);
        this.f17247o00ooo0o = (int) ((16.0f * f) + 0.5f);
        this.f17253o00ooooO = (int) ((1.0f * f) + 0.5f);
        this.f17246o00ooo0O = (int) ((f * 32.0f) + 0.5f);
        this.f17256o0O0000O = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f5321o00oo0O.setFocusable(true);
        this.f5321o00oo0O.setOnClickListener(new o00oOOo0());
        this.f5325o00oo0o0.setFocusable(true);
        this.f5325o00oo0o0.setOnClickListener(new View$OnClickListenerC0226o00oOOoO());
        if (getBackground() == null) {
            this.f17252o00oooo0 = true;
        }
    }

    public boolean getDrawFullUnderline() {
        return this.f17252o00oooo0;
    }

    @Override // androidx.viewpager.widget.o00oOOo0
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f17246o00ooo0O);
    }

    @o0O00O
    public int getTabIndicatorColor() {
        return this.f17242o00ooOoO;
    }

    @Override // androidx.viewpager.widget.o00oOOo0
    public void o00oOooO(int i, float f, boolean z) {
        Rect rect = this.f17249o00oooOO;
        int height = getHeight();
        int left = this.f5323o00oo0Oo.getLeft() - this.f17247o00ooo0o;
        int right = this.f5323o00oo0Oo.getRight() + this.f17247o00ooo0o;
        int i2 = height - this.f17243o00ooOoo;
        rect.set(left, i2, right, height);
        super.o00oOooO(i, f, z);
        this.f17250o00oooOo = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f5323o00oo0Oo.getLeft() - this.f17247o00ooo0o, i2, this.f5323o00oo0Oo.getRight() + this.f17247o00ooo0o, height);
        invalidate(rect);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f5323o00oo0Oo.getLeft() - this.f17247o00ooo0o;
        int right = this.f5323o00oo0Oo.getRight() + this.f17247o00ooo0o;
        this.f17248o00oooO.setColor((this.f17250o00oooOo << 24) | (this.f17242o00ooOoO & 16777215));
        float f = height;
        canvas.drawRect(left, height - this.f17243o00ooOoo, right, f, this.f17248o00oooO);
        if (this.f17252o00oooo0) {
            this.f17248o00oooO.setColor((-16777216) | (this.f17242o00ooOoO & 16777215));
            canvas.drawRect(getPaddingLeft(), height - this.f17253o00ooooO, getWidth() - getPaddingRight(), f, this.f17248o00oooO);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewPager viewPager;
        int currentItem;
        int action = motionEvent.getAction();
        if (action == 0 || !this.f17254o00ooooo) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (action == 0) {
                this.f17241o0 = x;
                this.f17255o0O00000 = y;
                this.f17254o00ooooo = false;
            } else if (action == 1) {
                if (x < this.f5323o00oo0Oo.getLeft() - this.f17247o00ooo0o) {
                    viewPager = this.f5322o00oo0O0;
                    currentItem = viewPager.getCurrentItem() - 1;
                } else if (x > this.f5323o00oo0Oo.getRight() + this.f17247o00ooo0o) {
                    viewPager = this.f5322o00oo0O0;
                    currentItem = viewPager.getCurrentItem() + 1;
                }
                viewPager.setCurrentItem(currentItem);
            } else if (action == 2 && (Math.abs(x - this.f17241o0) > this.f17256o0O0000O || Math.abs(y - this.f17255o0O00000) > this.f17256o0O0000O)) {
                this.f17254o00ooooo = true;
            }
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundColor(@o0O00O int i) {
        super.setBackgroundColor(i);
        if (this.f17251o00oooo) {
            return;
        }
        this.f17252o00oooo0 = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f17251o00oooo) {
            return;
        }
        this.f17252o00oooo0 = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@o0O0O0o0 int i) {
        super.setBackgroundResource(i);
        if (this.f17251o00oooo) {
            return;
        }
        this.f17252o00oooo0 = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.f17252o00oooo0 = z;
        this.f17251o00oooo = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f17245o00ooo00;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(@o0O00O int i) {
        this.f17242o00ooOoO = i;
        this.f17248o00oooO.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(@o0O00OOO int i) {
        setTabIndicatorColor(o0.getColor(getContext(), i));
    }

    @Override // androidx.viewpager.widget.o00oOOo0
    public void setTextSpacing(int i) {
        int i2 = this.f17244o00ooo0;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }
}
