package o00oooo;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.WeakHashMap;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oo0O {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final WeakHashMap<Context, o00oo0O> f9881o00oOOoO = new WeakHashMap<>();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f9882o00oOo00 = "android.hardware.display.category.PRESENTATION";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f9883o00oOOo0;

    @o0OOooO0(17)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static Display o00oOOo0(DisplayManager displayManager, int i) {
            return displayManager.getDisplay(i);
        }

        @o0O0O0Oo
        public static Display[] o00oOOoO(DisplayManager displayManager) {
            return displayManager.getDisplays();
        }
    }

    public o00oo0O(Context context) {
        this.f9883o00oOOo0 = context;
    }

    @oo0oO0
    public static o00oo0O o00oOooO(@oo0oO0 Context context) {
        o00oo0O o00oo0o2;
        WeakHashMap<Context, o00oo0O> weakHashMap = f9881o00oOOoO;
        synchronized (weakHashMap) {
            o00oo0o2 = weakHashMap.get(context);
            if (o00oo0o2 == null) {
                o00oo0o2 = new o00oo0O(context);
                weakHashMap.put(context, o00oo0o2);
            }
        }
        return o00oo0o2;
    }

    @o0OO00OO
    public Display o00oOOo0(int i) {
        return o00oOOo0.o00oOOo0((DisplayManager) this.f9883o00oOOo0.getSystemService("display"), i);
    }

    @oo0oO0
    public Display[] o00oOOoO() {
        return o00oOOo0.o00oOOoO((DisplayManager) this.f9883o00oOOo0.getSystemService("display"));
    }

    @oo0oO0
    public Display[] o00oOo00(@o0OO00OO String str) {
        return o00oOOo0.o00oOOoO((DisplayManager) this.f9883o00oOOo0.getSystemService("display"));
    }
}
