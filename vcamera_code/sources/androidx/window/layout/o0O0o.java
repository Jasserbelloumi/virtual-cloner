package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.o00oo;
import androidx.window.layout.o00ooO0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/o0O0o;", "", "Landroid/app/Activity;", "activity", "Landroidx/window/extensions/layout/FoldingFeature;", "oemFeature", "Landroidx/window/layout/o00oo;", "o00oOOo0", "(Landroid/app/Activity;Landroidx/window/extensions/layout/FoldingFeature;)Landroidx/window/layout/o00oo;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "info", "Landroidx/window/layout/o0O00;", o0OO000o.o00oOOoO.f12961o00oOo00, "(Landroid/app/Activity;Landroidx/window/extensions/layout/WindowLayoutInfo;)Landroidx/window/layout/o0O00;", "Lo0O0OoO/o00oo0;", "bounds", "", "o00oOo00", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o0O0o {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0O0o f5541o00oOOo0 = new o0O0o();

    @Nullable
    public final o00oo o00oOOo0(@NotNull Activity activity, @NotNull FoldingFeature foldingFeature) {
        o00ooO0.o00oOOoO o00oOOo02;
        o00oo.o00oOo00 o00ooo002;
        o0ooO.o00oo0O0(activity, "activity");
        o0ooO.o00oo0O0(foldingFeature, "oemFeature");
        int type = foldingFeature.getType();
        if (type == 1) {
            o00oOOo02 = o00ooO0.o00oOOoO.f5509o00oOOoO.o00oOOo0();
        } else if (type != 2) {
            return null;
        } else {
            o00oOOo02 = o00ooO0.o00oOOoO.f5509o00oOOoO.o00oOOoO();
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            o00ooo002 = o00oo.o00oOo00.f5490o00oOo00;
        } else if (state != 2) {
            return null;
        } else {
            o00ooo002 = o00oo.o00oOo00.f5491o00oOooO;
        }
        Rect bounds = foldingFeature.getBounds();
        o0ooO.o00oo0OO(bounds, "oemFeature.bounds");
        if (o00oOo00(activity, new o0O0OoO.o00oo0(bounds))) {
            Rect bounds2 = foldingFeature.getBounds();
            o0ooO.o00oo0OO(bounds2, "oemFeature.bounds");
            return new o00ooO0(new o0O0OoO.o00oo0(bounds2), o00oOOo02, o00ooo002);
        }
        return null;
    }

    @NotNull
    public final o0O00 o00oOOoO(@NotNull Activity activity, @NotNull WindowLayoutInfo windowLayoutInfo) {
        o00oo o00ooVar;
        o0ooO.o00oo0O0(activity, "activity");
        o0ooO.o00oo0O0(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        o0ooO.o00oo0OO(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                o0O0o o0o0o = f5541o00oOOo0;
                o0ooO.o00oo0OO(foldingFeature, "feature");
                o00ooVar = o0o0o.o00oOOo0(activity, foldingFeature);
            } else {
                o00ooVar = null;
            }
            if (o00ooVar != null) {
                arrayList.add(o00ooVar);
            }
        }
        return new o0O00(arrayList);
    }

    public final boolean o00oOo00(Activity activity, o0O0OoO.o00oo0 o00oo0Var) {
        Rect o00oOOo02 = o0O00O0o.f5539o00oOOoO.o00oOo00(activity).o00oOOo0();
        if (o00oo0Var.o00oOoO()) {
            return false;
        }
        if (o00oo0Var.f11960o00oOo00 - o00oo0Var.f11958o00oOOo0 == o00oOOo02.width() || o00oo0Var.f11961o00oOooO - o00oo0Var.f11959o00oOOoO == o00oOOo02.height()) {
            if (o00oo0Var.f11960o00oOo00 - o00oo0Var.f11958o00oOOo0 >= o00oOOo02.width() || o00oo0Var.f11961o00oOooO - o00oo0Var.f11959o00oOOoO >= o00oOOo02.height()) {
                return (o00oo0Var.f11960o00oOo00 - o00oo0Var.f11958o00oOOo0 == o00oOOo02.width() && o00oo0Var.f11961o00oOooO - o00oo0Var.f11959o00oOOoO == o00oOOo02.height()) ? false : true;
            }
            return false;
        }
        return false;
    }
}
