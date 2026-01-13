package o00oOoO0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.resources.R;
import androidx.appcompat.widget.oo0ooO;
import java.io.IOException;
import o00oOoO.o00oOOo0;
import o00oOoO0.o00oOo00;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class o00oo0 extends o00oOo00 {

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final String f6974o00ooOo = "StateListDrawableCompat";

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final boolean f6975o00ooOoO = false;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public o00oOOo0 f6976o00ooOOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public boolean f6977o00ooOo0;

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o00oOo00.o00oOo0O {

        /* renamed from: o00ooo00  reason: collision with root package name */
        public int[][] f6978o00ooo00;

        public o00oOOo0(o00oOOo0 o00oooo02, o00oo0 o00oo0Var, Resources resources) {
            super(o00oooo02, o00oo0Var, resources);
            if (o00oooo02 != null) {
                this.f6978o00ooo00 = o00oooo02.f6978o00ooo00;
            } else {
                this.f6978o00ooo00 = new int[o00oOoO0()];
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @oo0oO0
        public Drawable newDrawable() {
            return new o00oo0(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @oo0oO0
        public Drawable newDrawable(Resources resources) {
            return new o00oo0(this, resources);
        }

        @Override // o00oOoO0.o00oOo00.o00oOo0O
        public void o00oo0Oo(int i, int i2) {
            super.o00oo0Oo(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.f6978o00ooo00, 0, iArr, 0, i);
            this.f6978o00ooo00 = iArr;
        }

        public int o00ooOO(int[] iArr, Drawable drawable) {
            int o00oOOo02 = o00oOOo0(drawable);
            this.f6978o00ooo00[o00oOOo02] = iArr;
            return o00oOOo02;
        }

        public int o00ooOOo(int[] iArr) {
            int[][] iArr2 = this.f6978o00ooo00;
            int o00oOoOO2 = o00oOoOO();
            for (int i = 0; i < o00oOoOO2; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // o00oOoO0.o00oOo00.o00oOo0O
        public void o0O0o() {
            int[][] iArr = this.f6978o00ooo00;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.f6978o00ooo00[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.f6978o00ooo00 = iArr2;
        }
    }

    public o00oo0() {
        this(null, null);
    }

    public o00oo0(@o0OO00OO o00oOOo0 o00oooo02) {
        if (o00oooo02 != null) {
            o00oOoOO(o00oooo02);
        }
    }

    public o00oo0(o00oOOo0 o00oooo02, Resources resources) {
        o00oOoOO(new o00oOOo0(o00oooo02, this, resources));
        onStateChange(getState());
    }

    @Override // o00oOoO0.o00oOo00, android.graphics.drawable.Drawable
    @o0OOooO0(21)
    public void applyTheme(@oo0oO0 Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // o00oOoO0.o00oOo00, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // o00oOoO0.o00oOo00, android.graphics.drawable.Drawable
    @oo0oO0
    public Drawable mutate() {
        if (!this.f6977o00ooOo0 && super.mutate() == this) {
            this.f6976o00ooOOo.o0O0o();
            this.f6977o00ooOo0 = true;
        }
        return this;
    }

    @Override // o00oOoO0.o00oOo00
    public void o00oOOoO() {
        super.o00oOOoO();
        this.f6977o00ooOo0 = false;
    }

    @Override // o00oOoO0.o00oOo00
    public void o00oOoOO(@oo0oO0 o00oOo00.o00oOo0O o00ooo0o2) {
        super.o00oOoOO(o00ooo0o2);
        if (o00ooo0o2 instanceof o00oOOo0) {
            this.f6976o00ooOOo = (o00oOOo0) o00ooo0o2;
        }
    }

    public final void o00oo(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        o00oOOo0 o00oooo02 = this.f6976o00ooOOo;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray o00oo0o02 = o0O0o00.o00oo0o0(resources, theme, attributeSet, R.styleable.StateListDrawableItem);
                int resourceId = o00oo0o02.getResourceId(R.styleable.StateListDrawableItem_android_drawable, -1);
                Drawable o00oOoOo2 = resourceId > 0 ? oo0ooO.o00oOoO().o00oOoOo(context, resourceId) : null;
                o00oo0o02.recycle();
                int[] o00oo0O02 = o00oo0O0(attributeSet);
                if (o00oOoOo2 == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + o00oOOoO.f6904o00ooooO);
                    }
                    o00oOoOo2 = o00oOOo0.o00oOo00.o00oOOo0(resources, xmlPullParser, attributeSet, theme);
                }
                o00oooo02.o00ooOO(o00oo0O02, o00oOoOo2);
            }
        }
    }

    public void o00oo0(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f6976o00ooOOo.o00ooOO(iArr, drawable);
            onStateChange(getState());
        }
    }

    public int o00oo0O() {
        return this.f6976o00ooOOo.o00oOoOO();
    }

    public int[] o00oo0O0(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // o00oOoO0.o00oOo00
    /* renamed from: o00oo0OO */
    public o00oOOo0 o00oOo00() {
        return new o00oOOo0(this.f6976o00ooOOo, this, null);
    }

    public Drawable o00oo0Oo(int i) {
        return this.f6976o00ooOOo.o00oOoO(i);
    }

    public o00oOOo0 o00oo0o() {
        return this.f6976o00ooOOo;
    }

    public int o00oo0o0(int[] iArr) {
        return this.f6976o00ooOOo.o00ooOOo(iArr);
    }

    public int[] o00oo0oO(int i) {
        return this.f6976o00ooOOo.f6978o00ooo00[i];
    }

    public final void o00ooO00(TypedArray typedArray) {
        o00oOOo0 o00oooo02 = this.f6976o00ooOOo;
        o00oooo02.f6948o00oOooO |= o00oOOo0.o00oOo00.o00oOOoO(typedArray);
        o00oooo02.f6945o00oOoOO = typedArray.getBoolean(R.styleable.StateListDrawable_android_variablePadding, o00oooo02.f6945o00oOoOO);
        o00oooo02.f6949o00oOooo = typedArray.getBoolean(R.styleable.StateListDrawable_android_constantSize, o00oooo02.f6949o00oOooo);
        o00oooo02.f6964o00ooO0o = typedArray.getInt(R.styleable.StateListDrawable_android_enterFadeDuration, o00oooo02.f6964o00ooO0o);
        o00oooo02.f6960o00ooO = typedArray.getInt(R.styleable.StateListDrawable_android_exitFadeDuration, o00oooo02.f6960o00ooO);
        o00oooo02.f6962o00ooO00 = typedArray.getBoolean(R.styleable.StateListDrawable_android_dither, o00oooo02.f6962o00ooO00);
    }

    public void o0O0o(@oo0oO0 Context context, @oo0oO0 Resources resources, @oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 AttributeSet attributeSet, @o0OO00OO Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray o00oo0o02 = o0O0o00.o00oo0o0(resources, theme, attributeSet, R.styleable.StateListDrawable);
        setVisible(o00oo0o02.getBoolean(R.styleable.StateListDrawable_android_visible, true), true);
        o00ooO00(o00oo0o02);
        o00oo00O(resources);
        o00oo0o02.recycle();
        o00oo(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    @Override // o00oOoO0.o00oOo00, android.graphics.drawable.Drawable
    public boolean onStateChange(@oo0oO0 int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int o00ooOOo2 = this.f6976o00ooOOo.o00ooOOo(iArr);
        if (o00ooOOo2 < 0) {
            o00ooOOo2 = this.f6976o00ooOOo.o00ooOOo(StateSet.WILD_CARD);
        }
        return o00oOoO(o00ooOOo2) || onStateChange;
    }
}
