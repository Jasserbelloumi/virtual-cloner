package androidx.window.layout;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.window.layout.o00oo;
import androidx.window.layout.o00ooO0;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import o00oOooO.o0o0000;
import o0O0OoO.o00oo;
import o0OO0o.o0O0oo0o;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\u0012\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\tJ!\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0016\u001a\u00020\u00102\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\u001c\u0010\u0017\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0002R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/window/layout/o0;", "", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "sidecarDisplayFeatures", "Landroidx/window/sidecar/SidecarDeviceState;", "deviceState", "Landroidx/window/layout/o00oo0;", "o00oOo0o", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "extensionInfo", "state", "Landroidx/window/layout/o0O00;", "o00oOo0O", "first", "second", "", "o00oOOo0", "o00oOooO", "feature", "o00oOoO0", "(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)Landroidx/window/layout/o00oo0;", "o00oOo00", o0OO000o.o00oOOoO.f12961o00oOo00, "Lo0O0OoO/o00oo$o00oOOoO;", "Lo0O0OoO/o00oo$o00oOOoO;", "verificationMode", "<init>", "(Lo0O0OoO/o00oo$o00oOOoO;)V", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o0 {
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final o00oOOo0 f5475o00oOOoO = new o00oOOo0(null);

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f5476o00oOo00 = o0.class.getSimpleName();
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oo.o00oOOoO f5477o00oOOo0;

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0007J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0007R\u001c\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/window/layout/o0$o00oOOo0;", "", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "info", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "o00oOo00", "displayFeatures", "Lo0OO0o/oO0Ooooo;", "o00oOo0O", "Landroidx/window/sidecar/SidecarDeviceState;", "sidecarDeviceState", "", o0OO000o.o00oOOoO.f12961o00oOo00, "(Landroidx/window/sidecar/SidecarDeviceState;)I", "o00oOOo0", "posture", "o00oOooO", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
        }

        @o0o0000
        @SuppressLint({"BanUncheckedReflection"})
        public final int o00oOOo0(@NotNull SidecarDeviceState sidecarDeviceState) {
            o0ooO.o00oo0O0(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    if (invoke != null) {
                        return ((Integer) invoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final int o00oOOoO(@NotNull SidecarDeviceState sidecarDeviceState) {
            o0ooO.o00oo0O0(sidecarDeviceState, "sidecarDeviceState");
            int o00oOOo02 = o00oOOo0(sidecarDeviceState);
            if (o00oOOo02 < 0 || o00oOOo02 > 4) {
                return 0;
            }
            return o00oOOo02;
        }

        @o0o0000
        @SuppressLint({"BanUncheckedReflection"})
        @NotNull
        public final List<SidecarDisplayFeature> o00oOo00(@NotNull SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            o0ooO.o00oo0O0(sidecarWindowLayoutInfo, "info");
            try {
                try {
                    List<SidecarDisplayFeature> list = sidecarWindowLayoutInfo.displayFeatures;
                    return list == null ? o0OO0oO.o0O00O0o.o00ooOOo() : list;
                } catch (NoSuchFieldError unused) {
                    Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                    if (invoke != null) {
                        return (List) invoke;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return o0OO0oO.o0O00O0o.o00ooOOo();
            }
        }

        @o0o0000
        @SuppressLint({"BanUncheckedReflection"})
        public final void o00oOo0O(@NotNull SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @NotNull List<SidecarDisplayFeature> list) {
            o0ooO.o00oo0O0(sidecarWindowLayoutInfo, "info");
            o0ooO.o00oo0O0(list, "displayFeatures");
            try {
                try {
                    sidecarWindowLayoutInfo.displayFeatures = list;
                } catch (NoSuchFieldError unused) {
                    SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, list);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @o0o0000
        @SuppressLint({"BanUncheckedReflection"})
        public final void o00oOooO(@NotNull SidecarDeviceState sidecarDeviceState, int i) {
            o0ooO.o00oo0O0(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }

    @o0O0oo0o(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "invoke", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0O0OO implements o0OOOO.o00oo<SidecarDisplayFeature, Boolean> {
        public static final o00oOOoO INSTANCE = new o00oOOoO();

        public o00oOOoO() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final Boolean invoke(@NotNull SidecarDisplayFeature sidecarDisplayFeature) {
            o0ooO.o00oo0O0(sidecarDisplayFeature, "$this$require");
            boolean z = true;
            if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @o0O0oo0o(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "invoke", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class o00oOo00 extends o0O0OO implements o0OOOO.o00oo<SidecarDisplayFeature, Boolean> {
        public static final o00oOo00 INSTANCE = new o00oOo00();

        public o00oOo00() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final Boolean invoke(@NotNull SidecarDisplayFeature sidecarDisplayFeature) {
            o0ooO.o00oo0O0(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
        }
    }

    @o0O0oo0o(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "invoke", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class o00oOo0O extends o0O0OO implements o0OOOO.o00oo<SidecarDisplayFeature, Boolean> {
        public static final o00oOo0O INSTANCE = new o00oOo0O();

        public o00oOo0O() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final Boolean invoke(@NotNull SidecarDisplayFeature sidecarDisplayFeature) {
            o0ooO.o00oo0O0(sidecarDisplayFeature, "$this$require");
            boolean z = true;
            if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @o0O0oo0o(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "invoke", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class o00oOoO extends o0O0OO implements o0OOOO.o00oo<SidecarDisplayFeature, Boolean> {
        public static final o00oOoO INSTANCE = new o00oOoO();

        public o00oOoO() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final Boolean invoke(@NotNull SidecarDisplayFeature sidecarDisplayFeature) {
            o0ooO.o00oo0O0(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
        }
    }

    public o0() {
        this(null, 1, null);
    }

    public o0(@NotNull o00oo.o00oOOoO o00ooooo2) {
        o0ooO.o00oo0O0(o00ooooo2, "verificationMode");
        this.f5477o00oOOo0 = o00ooooo2;
    }

    public /* synthetic */ o0(o00oo.o00oOOoO o00ooooo2, int i, o0OOOOO0.o0O00 o0o00) {
        this((i & 1) != 0 ? o00oo.o00oOOoO.QUIET : o00ooooo2);
    }

    public final boolean o00oOOo0(@Nullable SidecarDeviceState sidecarDeviceState, @Nullable SidecarDeviceState sidecarDeviceState2) {
        if (o0ooO.o00oOoO0(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        o00oOOo0 o00oooo02 = f5475o00oOOoO;
        return o00oooo02.o00oOOoO(sidecarDeviceState) == o00oooo02.o00oOOoO(sidecarDeviceState2);
    }

    public final boolean o00oOOoO(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (o0ooO.o00oOoO0(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return o0ooO.o00oOoO0(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public final boolean o00oOo00(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (!o00oOOoO(list.get(i), list2.get(i))) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    @NotNull
    public final o0O00 o00oOo0O(@Nullable SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @NotNull SidecarDeviceState sidecarDeviceState) {
        o0ooO.o00oo0O0(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new o0O00(o0OO0oO.o0O00O0o.o00ooOOo());
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        o00oOOo0 o00oooo02 = f5475o00oOOoO;
        o00oooo02.o00oOooO(sidecarDeviceState2, o00oooo02.o00oOOoO(sidecarDeviceState));
        return new o0O00(o00oOo0o(o00oooo02.o00oOo00(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    @NotNull
    public final List<o00oo0> o00oOo0o(@NotNull List<SidecarDisplayFeature> list, @NotNull SidecarDeviceState sidecarDeviceState) {
        o0ooO.o00oo0O0(list, "sidecarDisplayFeatures");
        o0ooO.o00oo0O0(sidecarDeviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature sidecarDisplayFeature : list) {
            o00oo0 o00oOoO02 = o00oOoO0(sidecarDisplayFeature, sidecarDeviceState);
            if (o00oOoO02 != null) {
                arrayList.add(o00oOoO02);
            }
        }
        return arrayList;
    }

    @Nullable
    public final o00oo0 o00oOoO0(@NotNull SidecarDisplayFeature sidecarDisplayFeature, @NotNull SidecarDeviceState sidecarDeviceState) {
        o00ooO0.o00oOOoO o00oOOo02;
        o00oo.o00oOo00 o00ooo002;
        o0ooO.o00oo0O0(sidecarDisplayFeature, "feature");
        o0ooO.o00oo0O0(sidecarDeviceState, "deviceState");
        o00oo.o00oOOo0 o00oooo02 = o0O0OoO.o00oo.f11957o00oOOo0;
        String str = f5476o00oOo00;
        o0ooO.o00oo0OO(str, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) o00oo.o00oOOo0.o00oOOoO(o00oooo02, sidecarDisplayFeature, str, this.f5477o00oOOo0, null, 4, null).o00oOo00("Type must be either TYPE_FOLD or TYPE_HINGE", o00oOOoO.INSTANCE).o00oOo00("Feature bounds must not be 0", o00oOo00.INSTANCE).o00oOo00("TYPE_FOLD must have 0 area", o00oOo0O.INSTANCE).o00oOo00("Feature be pinned to either left or top", o00oOoO.INSTANCE).o00oOOo0();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            o00oOOo02 = o00ooO0.o00oOOoO.f5509o00oOOoO.o00oOOo0();
        } else if (type != 2) {
            return null;
        } else {
            o00oOOo02 = o00ooO0.o00oOOoO.f5509o00oOOoO.o00oOOoO();
        }
        int o00oOOoO2 = f5475o00oOOoO.o00oOOoO(sidecarDeviceState);
        if (o00oOOoO2 == 0 || o00oOOoO2 == 1) {
            return null;
        }
        if (o00oOOoO2 == 2) {
            o00ooo002 = o00oo.o00oOo00.f5491o00oOooO;
        } else if (o00oOOoO2 != 3 && o00oOOoO2 == 4) {
            return null;
        } else {
            o00ooo002 = o00oo.o00oOo00.f5490o00oOo00;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        o0ooO.o00oo0OO(rect, "feature.rect");
        return new o00ooO0(new o0O0OoO.o00oo0(rect), o00oOOo02, o00ooo002);
    }

    public final boolean o00oOooO(@Nullable SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @Nullable SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (o0ooO.o00oOoO0(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        o00oOOo0 o00oooo02 = f5475o00oOOoO;
        return o00oOo00(o00oooo02.o00oOo00(sidecarWindowLayoutInfo), o00oooo02.o00oOo00(sidecarWindowLayoutInfo2));
    }
}
