package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.Metadata;
import o00oOooO.o0OO0oO;
import o0OOOOO0.o0OOooO0;
import o0OOOOO0.o0ooO;
import o0OOo0OO.o0OO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/o0O000O;", "", "Landroid/app/Activity;", "activity", "Lo0OOo0OO/o0OO00o;", "Landroidx/window/layout/o0O00;", "o00oOo00", "o00oOOo0", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface o0O000O {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o00oOOo0 f5528o00oOOo0 = o00oOOo0.f5529o00oOOo0;

    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\u000bH\u0007R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/window/layout/o0O000O$o00oOOo0;", "", "Landroid/content/Context;", "context", "Landroidx/window/layout/o0O000O;", "o00oOOo0", "Landroidx/window/layout/o0O000;", "o00oOooO", "(Landroid/content/Context;)Landroidx/window/layout/o0O000;", "Landroidx/window/layout/o0OoOoOo;", "overridingDecorator", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOo00", "", "Z", "DEBUG", "", "Ljava/lang/String;", "TAG", "Landroidx/window/layout/o0OoOoOo;", "decorator", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final boolean f5530o00oOOoO = false;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ o00oOOo0 f5529o00oOOo0 = new o00oOOo0();
        @Nullable

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final String f5531o00oOo00 = o0OOooO0.o00oOooO(o0O000O.class).o00oo0oO();
        @NotNull

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static o0OoOoOo f5532o00oOooO = o00oo0OO.f5502o00oOOo0;

        @o0OOOO0o.o00oo0OO(name = "getOrCreate")
        @o0OOOO0o.o00ooO0
        @NotNull
        public final o0O000O o00oOOo0(@NotNull Context context) {
            o0ooO.o00oo0O0(context, "context");
            return f5532o00oOooO.o00oOOo0(new o0O000Oo(o0O00O0o.f5539o00oOOoO, o00oOooO(context)));
        }

        @o0OOOO0o.o00ooO0
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        public final void o00oOOoO(@NotNull o0OoOoOo o0oooooo) {
            o0ooO.o00oo0O0(o0oooooo, "overridingDecorator");
            f5532o00oOooO = o0oooooo;
        }

        @o0OOOO0o.o00ooO0
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        public final void o00oOo00() {
            f5532o00oOooO = o00oo0OO.f5502o00oOOo0;
        }

        @NotNull
        public final o0O000 o00oOooO(@NotNull Context context) {
            o0ooO.o00oo0O0(context, "context");
            o00oo0O o00oo0o2 = null;
            try {
                WindowLayoutComponent o00oo00O2 = o00ooO.f5503o00oOOo0.o00oo00O();
                if (o00oo00O2 != null) {
                    o00oo0o2 = new o00oo0O(o00oo00O2);
                }
            } catch (Throwable unused) {
            }
            return o00oo0o2 == null ? o0O00000.f5514o00oOo00.o00oOOo0(context) : o00oo0o2;
        }
    }

    @o0OOOO0o.o00ooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    static void o00oOOo0(@NotNull o0OoOoOo o0oooooo) {
        f5528o00oOOo0.o00oOOoO(o0oooooo);
    }

    @o0OOOO0o.o00oo0OO(name = "getOrCreate")
    @o0OOOO0o.o00ooO0
    @NotNull
    static o0O000O o00oOOoO(@NotNull Context context) {
        return f5528o00oOOo0.o00oOOo0(context);
    }

    @o0OOOO0o.o00ooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    static void reset() {
        f5528o00oOOo0.getClass();
        o00oOOo0.f5532o00oOooO = o00oo0OO.f5502o00oOOo0;
    }

    @NotNull
    o0OO00o<o0O00> o00oOo00(@NotNull Activity activity);
}
