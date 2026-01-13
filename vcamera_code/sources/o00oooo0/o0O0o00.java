package o00oooo0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o0O0o00 extends Drawable.ConstantState {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f9904o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public Drawable.ConstantState f9905o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public ColorStateList f9906o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public PorterDuff.Mode f9907o00oOooO;

    public o0O0o00(@o0OO00OO o0O0o00 o0o0o00) {
        this.f9906o00oOo00 = null;
        this.f9907o00oOooO = oo0OOoo.f9910o0O0o;
        if (o0o0o00 != null) {
            this.f9904o00oOOo0 = o0o0o00.f9904o00oOOo0;
            this.f9905o00oOOoO = o0o0o00.f9905o00oOOoO;
            this.f9906o00oOo00 = o0o0o00.f9906o00oOo00;
            this.f9907o00oOooO = o0o0o00.f9907o00oOooO;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f9904o00oOOo0;
        Drawable.ConstantState constantState = this.f9905o00oOOoO;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @oo0oO0
    public Drawable newDrawable() {
        return new o0O0o000(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @oo0oO0
    public Drawable newDrawable(@o0OO00OO Resources resources) {
        return new o0O0o000(this, resources);
    }

    public boolean o00oOOo0() {
        return this.f9905o00oOOoO != null;
    }
}
