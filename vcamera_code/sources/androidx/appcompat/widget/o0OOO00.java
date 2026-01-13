package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class o0OOO00 extends o0OO00OO {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final WeakReference<Context> f1329o00oOOoO;

    public o0OOO00(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 Resources resources) {
        super(resources);
        this.f1329o00oOOoO = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable o00oOOo02 = o00oOOo0(i);
        Context context = this.f1329o00oOOoO.get();
        if (o00oOOo02 != null && context != null) {
            oo0ooO.o00oOoO().o00ooO00(context, i, o00oOOo02);
        }
        return o00oOOo02;
    }
}
