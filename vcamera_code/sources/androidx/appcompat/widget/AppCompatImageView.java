package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import o00oOooO.o0OO0oO;
/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements o0O000oo.oo0OOoo, androidx.core.widget.o0O00O0o {
    private final o00oo0 mBackgroundTintHelper;
    private boolean mHasLevel;
    private final o0O000Oo mImageHelper;

    public AppCompatImageView(@o00oOooO.oo0oO0 Context context) {
        this(context, null);
    }

    public AppCompatImageView(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        super(o0OO0oO.o00oOOoO(context), attributeSet, i);
        this.mHasLevel = false;
        o0OO0o.o00oOOo0(this, getContext());
        o00oo0 o00oo0Var = new o00oo0(this);
        this.mBackgroundTintHelper = o00oo0Var;
        o00oo0Var.o00oOo0O(attributeSet, i);
        o0O000Oo o0o000oo = new o0O000Oo(this);
        this.mImageHelper = o0o000oo;
        o0o000oo.o00oOoO0(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOOoO();
        }
        o0O000Oo o0o000oo = this.mImageHelper;
        if (o0o000oo != null) {
            o0o000oo.o00oOo00();
        }
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            return o00oo0Var.o00oOo00();
        }
        return null;
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            return o00oo0Var.o00oOooO();
        }
        return null;
    }

    @Override // androidx.core.widget.o0O00O0o
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        o0O000Oo o0o000oo = this.mImageHelper;
        if (o0o000oo != null) {
            return o0o000oo.o00oOooO();
        }
        return null;
    }

    @Override // androidx.core.widget.o0O00O0o
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        o0O000Oo o0o000oo = this.mImageHelper;
        if (o0o000oo != null) {
            return o0o000oo.o00oOo0O();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.o00oOo0o() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@o00oOooO.o0OO00OO Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOo0o(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@o00oOooO.o0O0O0o0 int i) {
        super.setBackgroundResource(i);
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoO0(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        o0O000Oo o0o000oo = this.mImageHelper;
        if (o0o000oo != null) {
            o0o000oo.o00oOo00();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@o00oOooO.o0OO00OO Drawable drawable) {
        o0O000Oo o0o000oo = this.mImageHelper;
        if (o0o000oo != null && drawable != null && !this.mHasLevel) {
            o0o000oo.o00oOoO(drawable);
        }
        super.setImageDrawable(drawable);
        o0O000Oo o0o000oo2 = this.mImageHelper;
        if (o0o000oo2 != null) {
            o0o000oo2.o00oOo00();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.o00oOOoO();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@o00oOooO.o0O0O0o0 int i) {
        o0O000Oo o0o000oo = this.mImageHelper;
        if (o0o000oo != null) {
            o0o000oo.o00oOoOO(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(@o00oOooO.o0OO00OO Uri uri) {
        super.setImageURI(uri);
        o0O000Oo o0o000oo = this.mImageHelper;
        if (o0o000oo != null) {
            o0o000oo.o00oOo00();
        }
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@o00oOooO.o0OO00OO ColorStateList colorStateList) {
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoOO(colorStateList);
        }
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoOo(mode);
        }
    }

    @Override // androidx.core.widget.o0O00O0o
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@o00oOooO.o0OO00OO ColorStateList colorStateList) {
        o0O000Oo o0o000oo = this.mImageHelper;
        if (o0o000oo != null) {
            o0o000oo.o00oOoo0(colorStateList);
        }
    }

    @Override // androidx.core.widget.o0O00O0o
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        o0O000Oo o0o000oo = this.mImageHelper;
        if (o0o000oo != null) {
            o0o000oo.o00oOooo(mode);
        }
    }
}
