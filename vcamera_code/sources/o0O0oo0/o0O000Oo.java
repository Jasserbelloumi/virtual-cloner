package o0O0oo0;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOO0o.o00ooO0;
import o0OOOOO0.o0ooO;
import o0OOOOoo.o0O00O0o;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Lo0O0oo0/o0O000Oo;", "", "", "dp", "Landroid/content/Context;", "context", o00oOOoO.f12961o00oOo00, "", "o00oOOo0", "<init>", "()V", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0O000Oo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0O000Oo f12752o00oOOo0 = new o0O000Oo();

    @o00ooO0
    public static final float o00oOOo0(float f, @NotNull Context context) {
        o0ooO.o00oo0O0(context, "context");
        Resources resources = context.getResources();
        o0ooO.o00oo0OO(resources, "context.resources");
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    @o00ooO0
    public static final int o00oOOoO(int i, @NotNull Context context) {
        o0ooO.o00oo0O0(context, "context");
        Resources resources = context.getResources();
        o0ooO.o00oo0OO(resources, "context.resources");
        return o0O00O0o.o0O0OOOo(TypedValue.applyDimension(1, i, resources.getDisplayMetrics()));
    }
}
