package o00oOoO0;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.appcompat.resources.R;
import androidx.appcompat.widget.oo0ooO;
import androidx.collection.o00oo0OO;
import androidx.collection.o00ooO;
import java.io.IOException;
import o00oOoO.o00oOOo0;
import o00oOoO0.o00oOo00;
import o00oOoO0.o00oo0;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
import o00oooo0.o0O0OOOo;
import o0O0Oo.o0O0OOO;
import o0O0Oo.o0O0o00O;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class o00oOOoO extends o00oOoO0.o00oo0 implements o0O0OOOo {

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final String f6899o00oooO = o00oOOoO.class.getSimpleName();

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final String f6900o00oooOO = "transition";

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static final String f6901o00oooOo = "item";

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final String f6902o00oooo = ": <transition> tag requires 'fromId' & 'toId' attributes";

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final String f6903o00oooo0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final String f6904o00ooooO = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public o00oOo00 f6905o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public int f6906o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public o00oo0 f6907o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public int f6908o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public boolean f6909o00ooo0o;

    /* renamed from: o00oOoO0.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0101o00oOOoO extends o00oo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Animatable f6910o00oOOo0;

        public C0101o00oOOoO(Animatable animatable) {
            super(null);
            this.f6910o00oOOo0 = animatable;
        }

        @Override // o00oOoO0.o00oOOoO.o00oo0
        public void o00oOo00() {
            this.f6910o00oOOo0.start();
        }

        @Override // o00oOoO0.o00oOOoO.o00oo0
        public void o00oOooO() {
            this.f6910o00oOOo0.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 extends o00oo0.o00oOOo0 {

        /* renamed from: o00ooo0o  reason: collision with root package name */
        public static final long f6911o00ooo0o = 4294967296L;

        /* renamed from: o00oooO  reason: collision with root package name */
        public static final long f6912o00oooO = 8589934592L;

        /* renamed from: o00ooo0  reason: collision with root package name */
        public o00oo0OO<Long> f6913o00ooo0;

        /* renamed from: o00ooo0O  reason: collision with root package name */
        public o00ooO<Integer> f6914o00ooo0O;

        public o00oOo00(@o0OO00OO o00oOo00 o00ooo002, @oo0oO0 o00oOOoO o00ooooo2, @o0OO00OO Resources resources) {
            super(o00ooo002, o00ooooo2, resources);
            o00ooO<Integer> o00ooo;
            if (o00ooo002 != null) {
                this.f6913o00ooo0 = o00ooo002.f6913o00ooo0;
                o00ooo = o00ooo002.f6914o00ooo0O;
            } else {
                this.f6913o00ooo0 = new o00oo0OO<>();
                o00ooo = new o00ooO<>();
            }
            this.f6914o00ooo0O = o00ooo;
        }

        public static long o00ooOoO(int i, int i2) {
            return i2 | (i << 32);
        }

        @Override // o00oOoO0.o00oo0.o00oOOo0, android.graphics.drawable.Drawable.ConstantState
        @oo0oO0
        public Drawable newDrawable() {
            return new o00oOOoO(this, null);
        }

        @Override // o00oOoO0.o00oo0.o00oOOo0, android.graphics.drawable.Drawable.ConstantState
        @oo0oO0
        public Drawable newDrawable(Resources resources) {
            return new o00oOOoO(this, resources);
        }

        public int o00ooOo(int i, int i2, @oo0oO0 Drawable drawable, boolean z) {
            int o00oOOo02 = super.o00oOOo0(drawable);
            long o00ooOoO2 = o00ooOoO(i, i2);
            long j = z ? f6912o00oooO : 0L;
            long j2 = o00oOOo02;
            this.f6913o00ooo0.o00oOOoO(o00ooOoO2, Long.valueOf(j2 | j));
            if (z) {
                this.f6913o00ooo0.o00oOOoO(o00ooOoO(i2, i), Long.valueOf(f6911o00ooo0o | j2 | j));
            }
            return o00oOOo02;
        }

        public int o00ooOo0(@oo0oO0 int[] iArr, @oo0oO0 Drawable drawable, int i) {
            int o00ooOO2 = super.o00ooOO(iArr, drawable);
            this.f6914o00ooo0O.o00oo0Oo(o00ooOO2, Integer.valueOf(i));
            return o00ooOO2;
        }

        public int o00ooOoo(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f6914o00ooo0O.o00oo00O(i, 0).intValue();
        }

        public int o00ooo0(int i, int i2) {
            return (int) this.f6913o00ooo0.o00oo00O(o00ooOoO(i, i2), -1L).longValue();
        }

        public int o00ooo00(@oo0oO0 int[] iArr) {
            int o00ooOOo2 = super.o00ooOOo(iArr);
            return o00ooOOo2 >= 0 ? o00ooOOo2 : super.o00ooOOo(StateSet.WILD_CARD);
        }

        public boolean o00ooo0O(int i, int i2) {
            return (this.f6913o00ooo0.o00oo00O(o00ooOoO(i, i2), -1L).longValue() & f6911o00ooo0o) != 0;
        }

        public boolean o00ooo0o(int i, int i2) {
            return (this.f6913o00ooo0.o00oo00O(o00ooOoO(i, i2), -1L).longValue() & f6912o00oooO) != 0;
        }

        @Override // o00oOoO0.o00oo0.o00oOOo0, o00oOoO0.o00oOo00.o00oOo0O
        public void o0O0o() {
            this.f6913o00ooo0 = this.f6913o00ooo0.clone();
            this.f6914o00ooo0O = this.f6914o00ooo0O.clone();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O extends o00oo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0O0OOO f6915o00oOOo0;

        public o00oOo0O(o0O0OOO o0o0ooo) {
            super(null);
            this.f6915o00oOOo0 = o0o0ooo;
        }

        @Override // o00oOoO0.o00oOOoO.o00oo0
        public void o00oOo00() {
            this.f6915o00oOOo0.start();
        }

        @Override // o00oOoO0.o00oOOoO.o00oo0
        public void o00oOooO() {
            this.f6915o00oOOo0.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO extends o00oo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final ObjectAnimator f6916o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final boolean f6917o00oOOoO;

        public o00oOoO(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super(null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            o00oo00O o00oo00o = new o00oo00O(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            o00oOOo0.o00oOOoO.o00oOOo0(ofInt, true);
            ofInt.setDuration(o00oo00o.f6920o00oOo00);
            ofInt.setInterpolator(o00oo00o);
            this.f6917o00oOOoO = z2;
            this.f6916o00oOOo0 = ofInt;
        }

        @Override // o00oOoO0.o00oOOoO.o00oo0
        public boolean o00oOOo0() {
            return this.f6917o00oOOoO;
        }

        @Override // o00oOoO0.o00oOOoO.o00oo0
        public void o00oOOoO() {
            this.f6916o00oOOo0.reverse();
        }

        @Override // o00oOoO0.o00oOOoO.o00oo0
        public void o00oOo00() {
            this.f6916o00oOOo0.start();
        }

        @Override // o00oOoO0.o00oOOoO.o00oo0
        public void o00oOooO() {
            this.f6916o00oOOo0.cancel();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo0 {
        public o00oo0() {
        }

        public o00oo0(o00oOOo0 o00oooo02) {
        }

        public boolean o00oOOo0() {
            return false;
        }

        public void o00oOOoO() {
        }

        public abstract void o00oOo00();

        public abstract void o00oOooO();
    }

    /* loaded from: classes.dex */
    public static class o00oo00O implements TimeInterpolator {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int[] f6918o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f6919o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f6920o00oOo00;

        public o00oo00O(AnimationDrawable animationDrawable, boolean z) {
            o00oOOoO(animationDrawable, z);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f6920o00oOo00) + 0.5f);
            int i2 = this.f6919o00oOOoO;
            int[] iArr = this.f6918o00oOOo0;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f6920o00oOo00 : 0.0f);
        }

        public int o00oOOo0() {
            return this.f6920o00oOo00;
        }

        public int o00oOOoO(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f6919o00oOOoO = numberOfFrames;
            int[] iArr = this.f6918o00oOOo0;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f6918o00oOOo0 = new int[numberOfFrames];
            }
            int[] iArr2 = this.f6918o00oOOo0;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f6920o00oOo00 = i;
            return i;
        }
    }

    public o00oOOoO() {
        this(null, null);
    }

    public o00oOOoO(@o0OO00OO o00oOo00 o00ooo002, @o0OO00OO Resources resources) {
        super(null);
        this.f6906o00ooo0 = -1;
        this.f6908o00ooo0O = -1;
        o00oOoOO(new o00oOo00(o00ooo002, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    private void o00oo(@oo0oO0 Context context, @oo0oO0 Resources resources, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 AttributeSet attributeSet, @o0OO00OO Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    o00ooOOo(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals(f6900o00oooOO)) {
                    o00ooOo0(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    @o0OO00OO
    public static o00oOOoO o00ooO(@oo0oO0 Context context, @o0O0O0o0 int i, @o0OO00OO Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return o00ooOO0(context, resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    private void o00ooO00(TypedArray typedArray) {
        o00oOo00 o00ooo002 = this.f6905o00ooOoo;
        o00ooo002.f6948o00oOooO |= o00oOOo0.o00oOo00.o00oOOoO(typedArray);
        o00ooo002.o00ooO(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_variablePadding, o00ooo002.f6945o00oOoOO));
        o00ooo002.o00ooO00(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_constantSize, o00ooo002.f6949o00oOooo));
        o00ooo002.o00ooO0(typedArray.getInt(R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, o00ooo002.f6964o00ooO0o));
        o00ooo002.o00ooO0O(typedArray.getInt(R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, o00ooo002.f6960o00ooO));
        setDither(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_dither, o00ooo002.f6962o00ooO00));
    }

    @oo0oO0
    public static o00oOOoO o00ooOO0(@oo0oO0 Context context, @oo0oO0 Resources resources, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 AttributeSet attributeSet, @o0OO00OO Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            o00oOOoO o00ooooo2 = new o00oOOoO();
            o00ooooo2.o0O0o(context, resources, xmlPullParser, attributeSet, theme);
            return o00ooooo2;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // o00oOoO0.o00oo0, o00oOoO0.o00oOo00, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // o00oOoO0.o00oOo00, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        o00oo0 o00oo0Var = this.f6907o00ooo00;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOooO();
            this.f6907o00ooo00 = null;
            o00oOoO(this.f6906o00ooo0);
            this.f6906o00ooo0 = -1;
            this.f6908o00ooo0O = -1;
        }
    }

    @Override // o00oOoO0.o00oo0, o00oOoO0.o00oOo00, android.graphics.drawable.Drawable
    @oo0oO0
    public Drawable mutate() {
        if (!this.f6909o00ooo0o && super.mutate() == this) {
            this.f6905o00ooOoo.o0O0o();
            this.f6909o00ooo0o = true;
        }
        return this;
    }

    @Override // o00oOoO0.o00oo0, o00oOoO0.o00oOo00
    public void o00oOOoO() {
        super.o00oOOoO();
        this.f6909o00ooo0o = false;
    }

    @Override // o00oOoO0.o00oo0, o00oOoO0.o00oOo00
    public void o00oOoOO(@oo0oO0 o00oOo00.o00oOo0O o00ooo0o2) {
        super.o00oOoOO(o00ooo0o2);
        if (o00ooo0o2 instanceof o00oOo00) {
            this.f6905o00ooOoo = (o00oOo00) o00ooo0o2;
        }
    }

    public void o00ooO0(@oo0oO0 int[] iArr, @oo0oO0 Drawable drawable, int i) {
        drawable.getClass();
        this.f6905o00ooOoo.o00ooOo0(iArr, drawable, i);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void o00ooO0O(int i, int i2, @oo0oO0 T t, boolean z) {
        t.getClass();
        this.f6905o00ooOoo.o00ooOo(i, i2, t, z);
    }

    @Override // o00oOoO0.o00oo0
    /* renamed from: o00ooO0o */
    public o00oOo00 o00oo0OO() {
        return new o00oOo00(this.f6905o00ooOoo, this, null);
    }

    public final void o00ooOO() {
        onStateChange(getState());
    }

    public final int o00ooOOo(@oo0oO0 Context context, @oo0oO0 Resources resources, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 AttributeSet attributeSet, @o0OO00OO Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray o00oo0o02 = o0O0o00.o00oo0o0(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableItem);
        int resourceId = o00oo0o02.getResourceId(R.styleable.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = o00oo0o02.getResourceId(R.styleable.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable o00oOoOo2 = resourceId2 > 0 ? oo0ooO.o00oOoO().o00oOoOo(context, resourceId2) : null;
        o00oo0o02.recycle();
        int[] o00oo0O02 = o00oo0O0(attributeSet);
        if (o00oOoOo2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f6904o00ooooO);
            }
            o00oOoOo2 = xmlPullParser.getName().equals(o0O0o00O.f11670o00ooOOo) ? o0O0o00O.o00oOo00(resources, xmlPullParser, attributeSet, theme) : o00oOOo0.o00oOo00.o00oOOo0(resources, xmlPullParser, attributeSet, theme);
        }
        if (o00oOoOo2 != null) {
            return this.f6905o00ooOoo.o00ooOo0(o00oo0O02, o00oOoOo2, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f6904o00ooooO);
    }

    public final boolean o00ooOo(int i) {
        int o00oOooO2;
        int o00ooo02;
        o00oo0 c0101o00oOOoO;
        o00oo0 o00oo0Var = this.f6907o00ooo00;
        if (o00oo0Var == null) {
            o00oOooO2 = o00oOooO();
        } else if (i == this.f6906o00ooo0) {
            return true;
        } else {
            if (i == this.f6908o00ooo0O && o00oo0Var.o00oOOo0()) {
                o00oo0Var.o00oOOoO();
                this.f6906o00ooo0 = this.f6908o00ooo0O;
                this.f6908o00ooo0O = i;
                return true;
            }
            o00oOooO2 = this.f6906o00ooo0;
            o00oo0Var.o00oOooO();
        }
        this.f6907o00ooo00 = null;
        this.f6908o00ooo0O = -1;
        this.f6906o00ooo0 = -1;
        o00oOo00 o00ooo002 = this.f6905o00ooOoo;
        int o00ooOoo2 = o00ooo002.o00ooOoo(o00oOooO2);
        int o00ooOoo3 = o00ooo002.o00ooOoo(i);
        if (o00ooOoo3 == 0 || o00ooOoo2 == 0 || (o00ooo02 = o00ooo002.o00ooo0(o00ooOoo2, o00ooOoo3)) < 0) {
            return false;
        }
        boolean o00ooo0o2 = o00ooo002.o00ooo0o(o00ooOoo2, o00ooOoo3);
        o00oOoO(o00ooo02);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            c0101o00oOOoO = new o00oOoO((AnimationDrawable) current, o00ooo002.o00ooo0O(o00ooOoo2, o00ooOoo3), o00ooo0o2);
        } else if (!(current instanceof o0O0OOO)) {
            if (current instanceof Animatable) {
                c0101o00oOOoO = new C0101o00oOOoO((Animatable) current);
            }
            return false;
        } else {
            c0101o00oOOoO = new o00oOo0O((o0O0OOO) current);
        }
        c0101o00oOOoO.o00oOo00();
        this.f6907o00ooo00 = c0101o00oOOoO;
        this.f6908o00ooo0O = o00oOooO2;
        this.f6906o00ooo0 = i;
        return true;
    }

    public final int o00ooOo0(@oo0oO0 Context context, @oo0oO0 Resources resources, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 AttributeSet attributeSet, @o0OO00OO Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray o00oo0o02 = o0O0o00.o00oo0o0(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableTransition);
        int resourceId = o00oo0o02.getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = o00oo0o02.getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = o00oo0o02.getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable o00oOoOo2 = resourceId3 > 0 ? oo0ooO.o00oOoO().o00oOoOo(context, resourceId3) : null;
        boolean z = o00oo0o02.getBoolean(R.styleable.AnimatedStateListDrawableTransition_android_reversible, false);
        o00oo0o02.recycle();
        if (o00oOoOo2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f6903o00oooo0);
            }
            o00oOoOo2 = xmlPullParser.getName().equals(o0O0OOO.f11639o00ooO0) ? o0O0OOO.o00oOo00(context, resources, xmlPullParser, attributeSet, theme) : o00oOOo0.o00oOo00.o00oOOo0(resources, xmlPullParser, attributeSet, theme);
        }
        if (o00oOoOo2 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f6903o00oooo0);
        } else if (resourceId == -1 || resourceId2 == -1) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f6902o00oooo);
        } else {
            return this.f6905o00ooOoo.o00ooOo(resourceId, resourceId2, o00oOoOo2, z);
        }
    }

    @Override // o00oOoO0.o00oo0
    public void o0O0o(@oo0oO0 Context context, @oo0oO0 Resources resources, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 AttributeSet attributeSet, @o0OO00OO Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray o00oo0o02 = o0O0o00.o00oo0o0(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableCompat);
        setVisible(o00oo0o02.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        o00ooO00(o00oo0o02);
        o00oo00O(resources);
        o00oo0o02.recycle();
        o00oo(context, resources, xmlPullParser, attributeSet, theme);
        o00ooOO();
    }

    @Override // o00oOoO0.o00oo0, o00oOoO0.o00oOo00, android.graphics.drawable.Drawable
    public boolean onStateChange(@oo0oO0 int[] iArr) {
        int o00ooo002 = this.f6905o00ooOoo.o00ooo00(iArr);
        boolean z = o00ooo002 != o00oOooO() && (o00ooOo(o00ooo002) || o00oOoO(o00ooo002));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // o00oOoO0.o00oOo00, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        o00oo0 o00oo0Var = this.f6907o00ooo00;
        if (o00oo0Var != null && (visible || z2)) {
            if (z) {
                o00oo0Var.o00oOo00();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
