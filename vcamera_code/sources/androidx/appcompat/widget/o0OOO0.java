package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import o00oOooO.o0OO0oO;
import o00ooo0o.o0O0OO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0OOO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f1326o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final TypedArray f1327o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public TypedValue f1328o00oOo00;

    @o00oOooO.o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static int o00oOOo0(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOOoO(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    public o0OOO0(Context context, TypedArray typedArray) {
        this.f1326o00oOOo0 = context;
        this.f1327o00oOOoO = typedArray;
    }

    public static o0OOO0 o00ooOOo(Context context, int i, int[] iArr) {
        return new o0OOO0(context, context.obtainStyledAttributes(i, iArr));
    }

    public static o0OOO0 o00ooOo(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new o0OOO0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static o0OOO0 o00ooOo0(Context context, AttributeSet attributeSet, int[] iArr) {
        return new o0OOO0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public boolean o00oOOo0(int i, boolean z) {
        return this.f1327o00oOOoO.getBoolean(i, z);
    }

    @o00oOooO.o0OOooO0(21)
    public int o00oOOoO() {
        return o00oOOo0.o00oOOo0(this.f1327o00oOOoO);
    }

    public int o00oOo00(int i, int i2) {
        return this.f1327o00oOOoO.getColor(i, i2);
    }

    public float o00oOo0O(int i, float f) {
        return this.f1327o00oOOoO.getDimension(i, f);
    }

    public int o00oOo0o(int i, int i2) {
        return this.f1327o00oOOoO.getDimensionPixelOffset(i, i2);
    }

    public Drawable o00oOoO(int i) {
        int resourceId;
        return (!this.f1327o00oOOoO.hasValue(i) || (resourceId = this.f1327o00oOOoO.getResourceId(i, 0)) == 0) ? this.f1327o00oOOoO.getDrawable(i) : o00oOo0o.o00oOo00.o00oOOoO(this.f1326o00oOOo0, resourceId);
    }

    public int o00oOoO0(int i, int i2) {
        return this.f1327o00oOOoO.getDimensionPixelSize(i, i2);
    }

    public Drawable o00oOoOO(int i) {
        int resourceId;
        if (!this.f1327o00oOOoO.hasValue(i) || (resourceId = this.f1327o00oOOoO.getResourceId(i, 0)) == 0) {
            return null;
        }
        return o00ooO.o00oOOoO().o00oOooO(this.f1326o00oOOo0, resourceId, true);
    }

    public float o00oOoOo(int i, float f) {
        return this.f1327o00oOOoO.getFloat(i, f);
    }

    @o00oOooO.o0OO00OO
    public Typeface o00oOoo0(@o00oOooO.o0OOOO00 int i, int i2, @o00oOooO.o0OO00OO o0O0OO.o00oo0 o00oo0Var) {
        int resourceId = this.f1327o00oOOoO.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1328o00oOo00 == null) {
            this.f1328o00oOo00 = new TypedValue();
        }
        return o00ooo0o.o0O0OO.o00oOoo0(this.f1326o00oOOo0, resourceId, this.f1328o00oOo00, i2, o00oo0Var);
    }

    public ColorStateList o00oOooO(int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!this.f1327o00oOOoO.hasValue(i) || (resourceId = this.f1327o00oOOoO.getResourceId(i, 0)) == 0 || (colorStateList = o00ooo0.o0.getColorStateList(this.f1326o00oOOo0, resourceId)) == null) ? this.f1327o00oOOoO.getColorStateList(i) : colorStateList;
    }

    public float o00oOooo(int i, int i2, int i3, float f) {
        return this.f1327o00oOOoO.getFraction(i, i2, i3, f);
    }

    public String o00oo(int i) {
        return this.f1327o00oOOoO.getString(i);
    }

    public int o00oo0() {
        return this.f1327o00oOOoO.getIndexCount();
    }

    public int o00oo00O(int i) {
        return this.f1327o00oOOoO.getIndex(i);
    }

    public int o00oo0O(int i, int i2) {
        return this.f1327o00oOOoO.getLayoutDimension(i, i2);
    }

    public int o00oo0O0(int i, int i2) {
        return this.f1327o00oOOoO.getInteger(i, i2);
    }

    public int o00oo0OO(int i, int i2) {
        return this.f1327o00oOOoO.getInt(i, i2);
    }

    public int o00oo0Oo(int i, String str) {
        return this.f1327o00oOOoO.getLayoutDimension(i, str);
    }

    public String o00oo0o() {
        return this.f1327o00oOOoO.getPositionDescription();
    }

    public String o00oo0o0(int i) {
        return this.f1327o00oOOoO.getNonResourceString(i);
    }

    public int o00oo0oO(int i, int i2) {
        return this.f1327o00oOOoO.getResourceId(i, i2);
    }

    public TypedArray o00ooO() {
        return this.f1327o00oOOoO;
    }

    public CharSequence[] o00ooO0(int i) {
        return this.f1327o00oOOoO.getTextArray(i);
    }

    public CharSequence o00ooO00(int i) {
        return this.f1327o00oOOoO.getText(i);
    }

    public int o00ooO0O(int i) {
        return o00oOOo0.o00oOOoO(this.f1327o00oOOoO, i);
    }

    public boolean o00ooO0o(int i, TypedValue typedValue) {
        return this.f1327o00oOOoO.getValue(i, typedValue);
    }

    public int o00ooOO() {
        return this.f1327o00oOOoO.length();
    }

    public boolean o00ooOO0(int i) {
        return this.f1327o00oOOoO.hasValue(i);
    }

    public TypedValue o00ooOoO(int i) {
        return this.f1327o00oOOoO.peekValue(i);
    }

    public void o00ooOoo() {
        this.f1327o00oOOoO.recycle();
    }

    public Resources o0O0o() {
        return this.f1327o00oOOoO.getResources();
    }
}
