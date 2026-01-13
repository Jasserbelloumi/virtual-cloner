package o0Oo0O0;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.oo0oO0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.nukc.stateview.StateView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import multispace.multiapp.clone.view.base.LoadingActivity;
import multispace.multiapp.clone.view.main.MainActivity;
import multispace.multiapp.clone.view.pay.PayActivity;
import o0O0o0oo.o0OooO0;
import o0O0oo0O.o0OO00OO;
import o0O0oooo.o0OO;
import o0OO0o.o0O00oO0;
import o0OO0o.o0O0o00;
import o0OO0o.o0oO0Ooo;
import o0OO0o.oO0Ooooo;
import o0OOO0oo.oo0OOoo;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import o0OOoo.oo0ooO;
import o0OOoo0.o0O00O0;
import o0Oo0O0.o0;
import o0Oo0oo0.o0OO0o00;
import o0ooO0O0.oO0O00oO;
import o0ooO0O0.oO0O0O0;
import o0ooO0O0.oO0O0O0o;
import o0ooO0O0.oO0OOO0;
import o0ooO0O0.oOo00o0o;
import o0ooO0O0.oOo00ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import virtual.camera.app.R;
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 /2\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\bL\u0010MJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\u0012\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J$\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\"2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010&\u001a\u00020\u0002H\u0016J\u0006\u0010'\u001a\u00020\u0002J\b\u0010(\u001a\u00020\u0002H\u0016J\u000e\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)J\b\u0010,\u001a\u00020\u0002H\u0016R\"\u00103\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0013088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u0016\u0010K\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010J¨\u0006O"}, d2 = {"Lo0Oo0O0/o0;", "Lo0OOoo/oo0ooO;", "Lo0OO0o/oO0Ooooo;", "o00ooOoO", "Landroid/graphics/Point;", "point", "Landroid/view/MotionEvent;", "e", "", "o00ooo0", "o00oooo", "o00ooO00", "o00ooo00", "", "fromPosition", "toPosition", "o00ooo0O", "o00oooOo", "o00ooO", "Lo0OOoOO/o00ooO0;", "info", "o0", "o00ooooo", "o00oo", "o00oooOO", "o00ooooO", "o00ooO0o", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "onStart", "o00oooO", "onStop", "", FirebaseAnalytics.Param.SOURCE, "o00ooOo", "onResume", "o00oo0O", "I", "o00ooO0", "()I", "o00oooo0", "(I)V", "userID", "Lo0Oo0O0/o0O000;", "o00oo0Oo", "Lo0Oo0O0/o0O000;", "viewModel", "Lo0O0o0oo/o0OooO0;", "o00oo0o0", "Lo0O0o0oo/o0OooO0;", "mAdapter", "Lo0OOoo0/o0O00O0;", "o00oo0o", "Lo0OO0o/o0oO0Ooo;", "o00ooO0O", "()Lo0OOoo0/o0O00O0;", "viewBinding", "Landroidx/appcompat/widget/oo0oO0;", "o00oo0oO", "Landroidx/appcompat/widget/oo0oO0;", "popupMenu", "o0O0o", "Z", "mHasAppWaitForLaunch", "mWaitLaunchAppUid", "Ljava/lang/String;", "mWaitLaunchAppPkg", "<init>", "()V", "o00oOOo0", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class o0 extends oo0ooO {
    @NotNull

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final o00oOOo0 f15696o00ooO0 = new o00oOOo0(null);

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f15698o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public o0O000 f15699o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public o0OooO0<o0OOoOO.o00ooO0> f15701o00oo0o0;
    @Nullable

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public oo0oO0 f15702o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f15704o0O0o;
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final o0oO0Ooo f15700o00oo0o = o0O00oO0.o00oOo00(new o00oo00O(this));

    /* renamed from: o00oo  reason: collision with root package name */
    public int f15697o00oo = -1;
    @NotNull

    /* renamed from: o00ooO00  reason: collision with root package name */
    public String f15703o00ooO00 = "";

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lo0Oo0O0/o0$o00oOOo0;", "", "", "userID", "Lo0Oo0O0/o0;", "o00oOOo0", "<init>", "()V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @NotNull
        public final o0 o00oOOo0(int i) {
            o0 o0Var = new o0();
            o0Var.setArguments(o0O000.o00oOo0O.o00oOOoO(new o0O0o00(o0OOoO0.o00oo.o00oOOo0(new byte[]{78, -65, -96, -47, -57, Ascii.SI}, new byte[]{59, -52, -59, -93, -114, 75, -41, -43}), Integer.valueOf(i))));
            return o0Var;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "it", "Lo0OO0o/oO0Ooooo;", "invoke", "(Lo0O0oo0O/o0OO00OO;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0O0OO implements o0OOOO.o00oo<o0OO00OO, oO0Ooooo> {
        public final /* synthetic */ o0OOoOO.o00ooO0 $info;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(o0OOoOO.o00ooO0 o00ooo02) {
            super(1);
            this.$info = o00ooo02;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(o0OO00OO o0oo00oo) {
            invoke2(o0oo00oo);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull o0OO00OO o0oo00oo) {
            o0ooO.o00oo0O0(o0oo00oo, o0OOoO0.o00oo.o00oOOo0(new byte[]{2, -95}, new byte[]{107, -43, -86, -18, 63, -79, 48, 48}));
            o0.this.o00ooooO();
            o0OO.o00oo0o0(o0.this.f15698o00oo0O, this.$info.f14888o00oOo00, "");
            o0O000 o0o000 = o0.this.f15699o00oo0Oo;
            if (o0o000 == null) {
                o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-4, -9, -3, 113, -123, -33, Byte.MIN_VALUE, -86, -26}, new byte[]{-118, -98, -104, 6, -56, -80, -28, -49}));
                o0o000 = null;
            }
            o0o000.clearApkData(this.$info.f14888o00oOo00, o0.this.f15698o00oo0O);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "Lo0OOoOO/o00ooO0;", "data", "", "<anonymous parameter 2>", "Lo0OO0o/oO0Ooooo;", "invoke", "(Landroid/view/View;Lo0OOoOO/o00ooO0;I)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0O0OO implements o0OOOO.o0O0000O<View, o0OOoOO.o00ooO0, Integer, oO0Ooooo> {
        public o00oOo00() {
            super(3);
        }

        @Override // o0OOOO.o0O0000O
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(View view, o0OOoOO.o00ooO0 o00ooo02, Integer num) {
            invoke(view, o00ooo02, num.intValue());
            return oO0Ooooo.f13240o00oOOo0;
        }

        public final void invoke(@NotNull View view, @NotNull o0OOoOO.o00ooO0 o00ooo02, int i) {
            o0ooO.o00oo0O0(view, o0OOoO0.o00oo.o00oOOo0(new byte[]{94, 95, -105, 93, -94, -67, 70, Ascii.DLE, Ascii.ETB, 77, -39, 66, -83, -74, 74, Ascii.DC2, 7, 74, -100, SignedBytes.MAX_POWER_OF_TWO, -20, -12, Ascii.NAK}, new byte[]{98, 62, -7, 50, -52, -60, 43, Byte.MAX_VALUE}));
            o0ooO.o00oo0O0(o00ooo02, o0OOoO0.o00oo.o00oOOo0(new byte[]{58, 53, -121, -31}, new byte[]{94, 84, -13, Byte.MIN_VALUE, Ascii.CAN, 66, 57, -98}));
            if (!o0Oo00o0.o0.o00oOoO().o00oOoo0()) {
                o0 o0Var = o0.this;
                if (o0Var.f15698o00oo0O >= 2) {
                    PayActivity.o0oO0O0o(o0Var.f14919o00oo0O0);
                    return;
                }
            }
            if (!o0Oo00o0.o0.o00oOoO().o00oOoo0() && oOo00o0o.o00oOoO0(o0.this.f14919o00oo0O0)) {
                o0 o0Var2 = o0.this;
                o0Var2.f15697o00oo = o0Var2.f15698o00oo0O;
                o0Var2.f15703o00ooO00 = o00ooo02.f14888o00oOo00;
                o0Var2.f15704o0O0o = true;
                return;
            }
            o0.this.o00ooooO();
            oOo00ooO.o00oOOo0(o00ooo02.f14888o00oOo00, o0.this.f15698o00oo0O);
            o0O000 o0o000 = o0.this.f15699o00oo0Oo;
            if (o0o000 == null) {
                o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{41, 47, 56, -19, 17, -63, 53, 114, 51}, new byte[]{95, 70, 93, -102, 92, -82, 81, Ascii.ETB}));
                o0o000 = null;
            }
            o0o000.launchApk(o00ooo02.f14888o00oOo00, o0.this.f15698o00oo0O);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "from", o0O0000o.o00oOo0O.f10276o00oOooO, "Lo0OO0o/oO0Ooooo;", "invoke", "(II)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0O0OO implements o0OOOO.o0O00000<Integer, Integer, oO0Ooooo> {
        public o00oOo0O() {
            super(2);
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(Integer num, Integer num2) {
            invoke(num.intValue(), num2.intValue());
            return oO0Ooooo.f13240o00oOOo0;
        }

        public final void invoke(int i, int i2) {
            o0.this.o00ooo0O(i, i2);
            o0O000 o0o000 = o0.this.f15699o00oo0Oo;
            if (o0o000 == null) {
                o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-64, 3, -45, 121, -67, -121, Ascii.US, 113, -38}, new byte[]{-74, 106, -74, Ascii.SO, -16, -24, 123, Ascii.DC4}));
                o0o000 = null;
            }
            o0o000.getUpdateSortLiveData().o00oo0OO(Boolean.TRUE);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/view/View;", "view", "Lo0OOoOO/o00ooO0;", "data", "", "<anonymous parameter 2>", "Lo0OO0o/oO0Ooooo;", "invoke", "(Landroid/view/View;Lo0OOoOO/o00ooO0;I)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOoO extends o0O0OO implements o0OOOO.o0O0000O<View, o0OOoOO.o00ooO0, Integer, oO0Ooooo> {
        public o00oOoO() {
            super(3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-1$lambda-0  reason: not valid java name */
        public static final boolean m20invoke$lambda1$lambda0(o0OOoOO.o00ooO0 o00ooo02, o0 o0Var, MenuItem menuItem) {
            o0ooO.o00oo0O0(o00ooo02, o0OOoO0.o00oo.o00oOOo0(new byte[]{-34, 62, 8, -82, -13}, new byte[]{-6, 90, 105, -38, -110, -37, -97, -79}));
            o0ooO.o00oo0O0(o0Var, o0OOoO0.o00oo.o00oOOo0(new byte[]{117, 83, 96, -77, -40, 77}, new byte[]{1, 59, 9, -64, -4, 125, Ascii.SUB, 75}));
            int itemId = menuItem.getItemId();
            if (itemId == R.id.app_clear) {
                o0Var.o00oo(o00ooo02);
                return true;
            } else if (itemId != R.id.app_remove) {
                if (itemId != R.id.app_stop) {
                    return true;
                }
                o0Var.o00ooooo(o00ooo02);
                return true;
            } else if (o00ooo02.f14889o00oOo0O) {
                oO0OOO0.o00oOo00(R.string.uninstall_module_toast);
                return true;
            } else {
                o0Var.o0(o00ooo02);
                return true;
            }
        }

        @Override // o0OOOO.o0O0000O
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(View view, o0OOoOO.o00ooO0 o00ooo02, Integer num) {
            invoke(view, o00ooo02, num.intValue());
            return oO0Ooooo.f13240o00oOOo0;
        }

        public final void invoke(@NotNull View view, @NotNull final o0OOoOO.o00ooO0 o00ooo02, int i) {
            o0ooO.o00oo0O0(view, o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.ESC, 77, Ascii.VT, -1}, new byte[]{109, 36, 110, -120, -119, -125, 17, 122}));
            o0ooO.o00oo0O0(o00ooo02, o0OOoO0.o00oo.o00oOOo0(new byte[]{108, -92, -70, 126}, new byte[]{8, -59, -50, Ascii.US, 120, 2, 82, -70}));
            o0 o0Var = o0.this;
            oo0oO0 oo0oo0 = new oo0oO0(o0Var.f14919o00oo0O0, view, 0);
            final o0 o0Var2 = o0.this;
            oo0oo0.o00oOoO0(R.menu.app_menu);
            oo0oo0.f1565o00oOo0O = new oo0oO0.o00oOoO() { // from class: o0Oo0O0.o0O00000
                @Override // androidx.appcompat.widget.oo0oO0.o00oOoO
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean m20invoke$lambda1$lambda0;
                    m20invoke$lambda1$lambda0 = o0.o00oOoO.m20invoke$lambda1$lambda0(o0OOoOO.o00ooO0.this, o0Var2, menuItem);
                    return m20invoke$lambda1$lambda0;
                }
            };
            oo0oo0.o00oOooo();
            o0Var.f15702o00oo0oO = oo0oo0;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "it", "Lo0OO0o/oO0Ooooo;", "invoke", "(Lo0O0oo0O/o0OO00OO;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oo0 extends o0O0OO implements o0OOOO.o00oo<o0OO00OO, oO0Ooooo> {
        public final /* synthetic */ o0OOoOO.o00ooO0 $info;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo0(o0OOoOO.o00ooO0 o00ooo02) {
            super(1);
            this.$info = o00ooo02;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(o0OO00OO o0oo00oo) {
            invoke2(o0oo00oo);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull o0OO00OO o0oo00oo) {
            o0ooO.o00oo0O0(o0oo00oo, o0OOoO0.o00oo.o00oOOo0(new byte[]{43, Ascii.SYN}, new byte[]{66, 98, -26, 42, -25, -41, -9, 108}));
            o0OO.o00oo0o0(o0.this.f15698o00oo0O, this.$info.f14888o00oOo00, "");
            String string = o0.this.getString(R.string.is_stop, this.$info.f14886o00oOOo0);
            o0ooO.o00oo0OO(string, o0OOoO0.o00oo.o00oOOo0(new byte[]{-54, 105, 66, -25, -101, -27, Ascii.DC2, Ascii.CR, -54, 36, 100, -102, -100, -29, 9, 10, -61, 107, Ascii.CAN, -35, -100, -56, 8, Ascii.ETB, -62, 124, Ascii.SUB, -35, -127, -15, Ascii.DC4, 77, -61, 109, 91, -47, -58}, new byte[]{-83, Ascii.FF, 54, -76, -17, -105, 123, 99}));
            oO0OOO0.o00oOo0O(string);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo0O0OoO0/o00oOo00;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "invoke", "()Lo0O0OoO0/o00oOo00;", "o0ooO0O0/oO0o0000$o00oOOoO", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oo00O extends o0O0OO implements o0OOOO.o00oOOo0<o0O00O0> {
        public final /* synthetic */ Fragment $this_inflate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo00O(Fragment fragment) {
            super(0);
            this.$this_inflate = fragment;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final o0O00O0 invoke() {
            LayoutInflater layoutInflater = this.$this_inflate.getLayoutInflater();
            o0ooO.o00oo0OO(layoutInflater, o0OOoO0.o00oo.o00oOOo0(new byte[]{72, -103, -54, -36, -6, 55, 126, -3, 66, -108, -46, -57, -22, 49}, new byte[]{36, -8, -77, -77, -113, 67, 55, -109}));
            Object invoke = o0O00O0.class.getMethod(o0OOoO0.o00oo.o00oOOo0(new byte[]{-111, 48, 46, 103, 10, -111, 77}, new byte[]{-8, 94, 72, Ascii.VT, 107, -27, 40, -100}), LayoutInflater.class).invoke(null, layoutInflater);
            if (invoke != null) {
                return (o0O00O0) invoke;
            }
            throw new NullPointerException(o0OOoO0.o00oo.o00oOOo0(new byte[]{74, -98, 17, 74, -19, 74, -6, -108, 74, -124, 9, 6, -81, 76, -69, -103, 69, -104, 9, 6, -71, 70, -69, -108, 75, -123, 80, 72, -72, 69, -9, -38, 80, -110, Ascii.CR, 67, -19, 68, -18, -106, 80, -126, Ascii.SO, 86, -84, 74, -2, -44, 73, -98, 17, 82, -92, 72, -21, -118, 10, -120, 17, 73, -93, 76, -75, -98, 69, -97, Ascii.FS, 68, -92, 71, -1, -109, 74, -116, 83, 96, -65, 72, -4, -105, 65, -123, 9, 103, -67, 89, -24, -72, 77, -123, Ascii.EM, 79, -93, 78}, new byte[]{36, -21, 125, 38, -51, 41, -101, -6}));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "it", "Lo0OO0o/oO0Ooooo;", "invoke", "(Lo0O0oo0O/o0OO00OO;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oo0OO extends o0O0OO implements o0OOOO.o00oo<o0OO00OO, oO0Ooooo> {
        public final /* synthetic */ o0OOoOO.o00ooO0 $info;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo0OO(o0OOoOO.o00ooO0 o00ooo02) {
            super(1);
            this.$info = o00ooo02;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(o0OO00OO o0oo00oo) {
            invoke2(o0oo00oo);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull o0OO00OO o0oo00oo) {
            o0ooO.o00oo0O0(o0oo00oo, o0OOoO0.o00oo.o00oOOo0(new byte[]{95, Ascii.SO}, new byte[]{54, 122, 119, -75, -5, Ascii.GS, -56, -55}));
            o0.this.o00ooooO();
            o0O000 o0o000 = o0.this.f15699o00oo0Oo;
            if (o0o000 == null) {
                o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-60, Ascii.DC2, -65, -25, -103, -91, 8, -9, -34}, new byte[]{-78, 123, -38, -112, -44, -54, 108, -110}));
                o0o000 = null;
            }
            o0o000.unInstall(this.$info.f14888o00oOo00, o0.this.f15698o00oo0O);
        }
    }

    public static final void o00ooOO(o0 o0Var, String str) {
        o0ooO.o00oo0O0(o0Var, o0OOoO0.o00oo.o00oOOo0(new byte[]{94, 73, Ascii.CAN, 19, 47, -12}, new byte[]{42, o0OO0o00.f16655o00oOoOO, 113, 96, Ascii.VT, -60, -77, 79}));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        o0Var.o00ooO0o();
        Activity activity = o0Var.f14919o00oo0O0;
        o0ooO.o00oo0OO(activity, o0OOoO0.o00oo.o00oOOo0(new byte[]{35, 76, 49, 56, 68, -124, 80, -29, 45, 93, 60, 42, 70, -106, 92, -67, 109}, new byte[]{68, 41, 69, 121, 39, -16, 57, -107}));
        o0ooO.o00oo0OO(str, o0OOoO0.o00oo.o00oOOo0(new byte[]{-68, -98}, new byte[]{-43, -22, -94, -70, -59, 9, Ascii.FS, Ascii.CAN}));
        oO0OOO0.o00oOooO(activity, str);
        o0O000 o0o000 = o0Var.f15699o00oo0Oo;
        if (o0o000 == null) {
            o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{82, Ascii.DC4, -20, 59, -4, -65, 78, 35, 72}, new byte[]{36, 125, -119, 76, -79, -48, 42, 70}));
            o0o000 = null;
        }
        o0o000.getInstalledApps(o0Var.f15698o00oo0O);
        o0Var.o00oooOO();
    }

    public static final void o00ooOO0(o0 o0Var, List list) {
        o0ooO.o00oo0O0(o0Var, o0OOoO0.o00oo.o00oOOo0(new byte[]{84, 97, Ascii.ETB, 83, 92, 123}, new byte[]{32, 9, 126, 32, 120, 75, -94, 120}));
        if (list != null) {
            o0OooO0<o0OOoOO.o00ooO0> o0oooo0 = o0Var.f15701o00oo0o0;
            if (o0oooo0 == null) {
                o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{19, 109, 3, 58, -38, 113, Ascii.NAK, -114}, new byte[]{126, 44, 103, 91, -86, 5, 112, -4}));
                o0oooo0 = null;
            }
            o0OooO0.o0O0O0oO(o0oooo0, list, false, false, 6, null);
            boolean isEmpty = list.isEmpty();
            StateView stateView = o0Var.o00ooO0O().stateView;
            if (isEmpty) {
                stateView.showEmpty();
            } else {
                stateView.showContent();
            }
        }
    }

    public static final void o00ooOOo(o0 o0Var, Boolean bool) {
        o0ooO.o00oo0O0(o0Var, o0OOoO0.o00oo.o00oOOo0(new byte[]{-49, -30, -39, Ascii.VT, -10, -66}, new byte[]{-69, -118, -80, 120, -46, -114, 94, -127}));
        if (bool != null) {
            bool.booleanValue();
            o0Var.o00ooO0o();
            if (bool.booleanValue()) {
                return;
            }
            oO0OOO0.o00oOo00(R.string.start_fail);
        }
    }

    public static final void o00ooOo0(o0 o0Var, Boolean bool) {
        o0ooO.o00oo0O0(o0Var, o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.FF, Ascii.ETB, 55, 50, -120, -34}, new byte[]{120, Byte.MAX_VALUE, 94, 65, -84, -18, 63, 60}));
        if (o0Var.f15701o00oo0o0 != null) {
            o0O000 o0o000 = o0Var.f15699o00oo0Oo;
            o0OooO0<o0OOoOO.o00ooO0> o0oooo0 = null;
            if (o0o000 == null) {
                o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{98, Ascii.DC4, -126, -10, 43, 45, Ascii.GS, -3, 120}, new byte[]{Ascii.DC4, 125, -25, -127, 102, 66, 121, -104}));
                o0o000 = null;
            }
            int i = o0Var.f15698o00oo0O;
            o0OooO0<o0OOoOO.o00ooO0> o0oooo02 = o0Var.f15701o00oo0o0;
            if (o0oooo02 == null) {
                o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{87, -36, 84, -79, -73, Ascii.RS, 6, -125}, new byte[]{58, -99, 48, -48, -57, 106, 99, -15}));
            } else {
                o0oooo0 = o0oooo02;
            }
            o0o000.updateApkOrder(i, o0oooo0.f12660o00oOOoO);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
        if (r6 != 3) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean o00ooOoo(android.graphics.Point r4, o0Oo0O0.o0 r5, android.view.View r6, android.view.MotionEvent r7) {
        /*
            r6 = 6
            byte[] r0 = new byte[r6]
            r0 = {x009a: FILL_ARRAY_DATA  , data: [-34, 42, 87, -42, 38, -107} // fill-array
            r1 = 8
            byte[] r2 = new byte[r1]
            r2 = {x00a2: FILL_ARRAY_DATA  , data: [-6, 90, 56, -65, 72, -31, -98, -1} // fill-array
            java.lang.String r0 = o0OOoO0.o00oo.o00oOOo0(r0, r2)
            o0OOOOO0.o0ooO.o00oo0O0(r4, r0)
            byte[] r6 = new byte[r6]
            r6 = {x00aa: FILL_ARRAY_DATA  , data: [-66, 63, -128, 103, 49, 31} // fill-array
            byte[] r0 = new byte[r1]
            r0 = {x00b2: FILL_ARRAY_DATA  , data: [-54, 87, -23, 20, 21, 47, -57, 28} // fill-array
            java.lang.String r6 = o0OOoO0.o00oo.o00oOOo0(r6, r0)
            o0OOOOO0.o0ooO.o00oo0O0(r5, r6)
            int r6 = r7.getAction()
            r0 = 1
            r2 = 0
            if (r6 == r0) goto L92
            r3 = 2
            if (r6 == r3) goto L34
            r7 = 3
            if (r6 == r7) goto L92
            goto L98
        L34:
            int r6 = r4.x
            if (r6 != 0) goto L4a
            int r6 = r4.y
            if (r6 != 0) goto L4a
            float r6 = r7.getRawX()
            int r6 = (int) r6
            r4.x = r6
            float r6 = r7.getRawY()
            int r6 = (int) r6
            r4.y = r6
        L4a:
            boolean r6 = r5.o00ooo00()
            if (r6 == 0) goto L6b
            byte[] r6 = new byte[r0]
            r3 = -120(0xffffffffffffff88, float:NaN)
            r6[r2] = r3
            byte[] r3 = new byte[r1]
            r3 = {x00ba: FILL_ARRAY_DATA  , data: [-19, -102, 11, -99, 20, -63, -15, -69} // fill-array
            java.lang.String r6 = o0OOoO0.o00oo.o00oOOo0(r6, r3)
            o0OOOOO0.o0ooO.o00oo0OO(r7, r6)
            boolean r6 = r5.o00ooo0(r4, r7)
            if (r6 == 0) goto L6b
            r5.o00ooO00(r4, r7)
        L6b:
            androidx.appcompat.widget.oo0oO0 r6 = r5.f15702o00oo0oO
            if (r6 == 0) goto L98
            byte[] r6 = new byte[r0]
            r0 = 14
            r6[r2] = r0
            byte[] r0 = new byte[r1]
            r0 = {x00c2: FILL_ARRAY_DATA  , data: [107, 68, -40, -27, -21, -38, 99, -117} // fill-array
            java.lang.String r6 = o0OOoO0.o00oo.o00oOOo0(r6, r0)
            o0OOOOO0.o0ooO.o00oo0OO(r7, r6)
            boolean r4 = r5.o00ooo0(r4, r7)
            if (r4 == 0) goto L98
            androidx.appcompat.widget.oo0oO0 r4 = r5.f15702o00oo0oO
            if (r4 == 0) goto L8e
            r4.o00oOOo0()
        L8e:
            r4 = 0
            r5.f15702o00oo0oO = r4
            goto L98
        L92:
            r4.set(r2, r2)
            r5.o00oooo()
        L98:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o0Oo0O0.o0.o00ooOoo(android.graphics.Point, o0Oo0O0.o0, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final void o00ooo0o(o0 o0Var) {
        o0ooO.o00oo0O0(o0Var, o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.GS, Ascii.ETB, 93, -62, 39, 90}, new byte[]{105, Byte.MAX_VALUE, 52, -79, 3, 106, -1, -73}));
        o0Var.o00ooooO();
        oOo00ooO.o00oOOo0(o0Var.f15703o00ooO00, o0Var.f15698o00oo0O);
        oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{-107, 66, 76, 90, 109, -28, -39, 97, -54, Ascii.GS, 95, 5, 63, -79, -44, 99, -50, 48, Ascii.SI, 2}, new byte[]{-90, 113, Byte.MAX_VALUE, 105, 94, -60, -70, 0}));
        o0O000 o0o000 = o0Var.f15699o00oo0Oo;
        if (o0o000 == null) {
            o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-46, -37, -36, -85, 44, -74, -61, -25, -56}, new byte[]{-92, -78, -71, -36, 97, -39, -89, -126}));
            o0o000 = null;
        }
        o0o000.launchApk(o0Var.f15703o00ooO00, o0Var.f15697o00oo);
        o0Var.f15704o0O0o = false;
    }

    public final void o0(o0OOoOO.o00ooO0 o00ooo02) {
        Activity activity = this.f14919o00oo0O0;
        o0ooO.o00oo0OO(activity, o0OOoO0.o00oo.o00oOOo0(new byte[]{49, Ascii.RS, -56, 46, -85, 43, 56, -13, 63, Ascii.SI, -59, 60, -87, 57, 52, -83, Byte.MAX_VALUE}, new byte[]{86, 123, -68, 111, -56, 95, 81, -123}));
        o0OO00OO o0oo00oo = new o0OO00OO(activity, null, 2, null);
        o0OO00OO.o0OoOoOO(o0oo00oo, Integer.valueOf((int) R.string.uninstall_app), null, 2, null);
        o0OO00OO.o00ooOoo(o0oo00oo, null, getString(R.string.uninstall_app_hint, o00ooo02.f14886o00oOOo0), null, 5, null);
        o0OO00OO.o00oooo0(o0oo00oo, Integer.valueOf((int) R.string.done), null, new o00oo0OO(o00ooo02), 2, null);
        o0OO00OO.o00ooo0(o0oo00oo, Integer.valueOf((int) R.string.cancel), null, null, 6, null);
        o0oo00oo.show();
    }

    public final void o00oo(o0OOoOO.o00ooO0 o00ooo02) {
        Activity activity = this.f14919o00oo0O0;
        o0ooO.o00oo0OO(activity, o0OOoO0.o00oo.o00oOOo0(new byte[]{-15, Byte.MIN_VALUE, 107, 67, Byte.MIN_VALUE, 6, 34, 82, -1, -111, 102, 81, -126, Ascii.DC4, 46, Ascii.FF, -65}, new byte[]{-106, -27, Ascii.US, 2, -29, 114, 75, 36}));
        o0OO00OO o0oo00oo = new o0OO00OO(activity, null, 2, null);
        o0OO00OO.o0OoOoOO(o0oo00oo, Integer.valueOf((int) R.string.app_clear), null, 2, null);
        o0OO00OO.o00ooOoo(o0oo00oo, null, getString(R.string.app_clear_hint, o00ooo02.f14886o00oOOo0), null, 5, null);
        o0OO00OO.o00oooo0(o0oo00oo, Integer.valueOf((int) R.string.done), null, new o00oOOoO(o00ooo02), 2, null);
        o0OO00OO.o00ooo0(o0oo00oo, Integer.valueOf((int) R.string.cancel), null, null, 6, null);
        o0oo00oo.show();
    }

    public final void o00ooO() {
        o00ooO0O().stateView.showLoading();
        o0O000 o0o000 = this.f15699o00oo0Oo;
        o0O000 o0o0002 = null;
        if (o0o000 == null) {
            o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{65, -35, 65, 97, 94, -25, -82, -11, 91}, new byte[]{55, -76, 36, Ascii.SYN, 19, -120, -54, -112}));
            o0o000 = null;
        }
        o0o000.getInstalledApps(this.f15698o00oo0O);
        o0O000 o0o0003 = this.f15699o00oo0Oo;
        if (o0o0003 == null) {
            o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-117, -34, 57, Ascii.DLE, -92, 81, Ascii.SO, -110, -111}, new byte[]{-3, -73, 92, 103, -23, 62, 106, -9}));
            o0o0003 = null;
        }
        o0o0003.getAppsLiveData().o00oOoo0(getViewLifecycleOwner(), new androidx.lifecycle.o0OooO0() { // from class: o0Oo0O0.o0O0o
            @Override // androidx.lifecycle.o0OooO0
            public final void onChanged(Object obj) {
                o0.o00ooOO0(o0.this, (List) obj);
            }
        });
        o0O000 o0o0004 = this.f15699o00oo0Oo;
        if (o0o0004 == null) {
            o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.EM, -1, -72, -23, 76, 55, 101, -103, 3}, new byte[]{111, -106, -35, -98, 1, 88, 1, -4}));
            o0o0004 = null;
        }
        o0o0004.getResultLiveData().o00oOoo0(getViewLifecycleOwner(), new androidx.lifecycle.o0OooO0() { // from class: o0Oo0O0.o00oo
            @Override // androidx.lifecycle.o0OooO0
            public final void onChanged(Object obj) {
                o0.o00ooOO(o0.this, (String) obj);
            }
        });
        o0O000 o0o0005 = this.f15699o00oo0Oo;
        if (o0o0005 == null) {
            o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-105, -9, 103, -59, 10, -124, 37, 62, -115}, new byte[]{-31, -98, 2, -78, 71, -21, 65, 91}));
            o0o0005 = null;
        }
        o0o0005.getLaunchLiveData().o00oOoo0(getViewLifecycleOwner(), new androidx.lifecycle.o0OooO0() { // from class: o0Oo0O0.o00ooO0
            @Override // androidx.lifecycle.o0OooO0
            public final void onChanged(Object obj) {
                o0.o00ooOOo(o0.this, (Boolean) obj);
            }
        });
        o0O000 o0o0006 = this.f15699o00oo0Oo;
        if (o0o0006 == null) {
            o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{93, 75, -69, 119, 85, 99, -30, 104, 71}, new byte[]{43, 34, -34, 0, Ascii.CAN, Ascii.FF, -122, Ascii.CR}));
        } else {
            o0o0002 = o0o0006;
        }
        o0o0002.getUpdateSortLiveData().o00oOoo0(getViewLifecycleOwner(), new androidx.lifecycle.o0OooO0() { // from class: o0Oo0O0.o00ooO
            @Override // androidx.lifecycle.o0OooO0
            public final void onChanged(Object obj) {
                o0.o00ooOo0(o0.this, (Boolean) obj);
            }
        });
    }

    public final int o00ooO0() {
        return this.f15698o00oo0O;
    }

    public final void o00ooO00(Point point, MotionEvent motionEvent) {
        Activity activity = this.f14919o00oo0O0;
        o0ooO.o00oo0(activity, o0OOoO0.o00oo.o00oOOo0(new byte[]{Byte.MAX_VALUE, 32, -52, -100, 102, 119, -2, -46, Byte.MAX_VALUE, 58, -44, -48, 36, 113, -65, -33, 112, 38, -44, -48, 50, 123, -65, -46, 126, 59, -115, -98, 51, 120, -13, -100, 101, 44, -48, -107, 102, 121, -22, -48, 101, 60, -45, Byte.MIN_VALUE, 39, 119, -6, -110, 124, 32, -52, -124, 47, 117, -17, -52, 63, 54, -52, -97, 40, 113, -79, -54, 120, 48, -41, -34, 43, 117, -10, -46, 63, Ascii.CAN, -63, -103, 40, 85, -4, -56, 120, 35, -55, -124, 63}, new byte[]{17, 85, -96, -16, 70, Ascii.DC4, -97, -68}));
        ((MainActivity) activity).o0O0Ooo0(false);
    }

    public final o0O00O0 o00ooO0O() {
        return (o0O00O0) this.f15700o00oo0o.getValue();
    }

    public final void o00ooO0o() {
        Activity activity = this.f14919o00oo0O0;
        if (activity instanceof LoadingActivity) {
            o0ooO.o00oo0(activity, o0OOoO0.o00oo.o00oOOo0(new byte[]{-37, 38, 98, 65, -11, -55, -117, -80, -37, 60, 122, Ascii.CR, -73, -49, -54, -67, -44, 32, 122, Ascii.CR, -95, -59, -54, -80, -38, oo0OOoo.f13516o00oOoO, 35, 67, -96, -58, -122, -2, -63, 42, 126, 72, -11, -57, -97, -78, -63, 58, 125, 93, -76, -55, -113, -16, -40, 38, 98, 89, -68, -53, -102, -82, -101, 48, 98, 66, -69, -49, -60, -88, -36, 54, 121, 3, -73, -53, -103, -69, -101, Ascii.US, 97, 76, -79, -61, -124, -71, -12, 48, 122, 68, -93, -61, -98, -89}, new byte[]{-75, 83, Ascii.SO, 45, -43, -86, -22, -34}));
            ((LoadingActivity) activity).o0O0O0oO();
        }
    }

    public final void o00ooOo(@NotNull String str) {
        o0ooO.o00oo0O0(str, o0OOoO0.o00oo.o00oOOo0(new byte[]{79, -96, -117, -115, 80, 62}, new byte[]{60, -49, -2, -1, 51, 91, 87, -53}));
        o00ooooO();
        o0O000 o0o000 = this.f15699o00oo0Oo;
        if (o0o000 == null) {
            o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{81, 108, 63, 101, -81, 74, -77, -100, 75}, new byte[]{39, 5, 90, Ascii.DC2, -30, 37, -41, -7}));
            o0o000 = null;
        }
        o0o000.install(str, this.f15698o00oo0O);
    }

    public final void o00ooOoO() {
        final Point point = new Point();
        o00ooO0O().recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: o0Oo0O0.o00oo0O0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean o00ooOoo2;
                o00ooOoo2 = o0.o00ooOoo(point, this, view, motionEvent);
                return o00ooOoo2;
            }
        });
    }

    public final boolean o00ooo0(Point point, MotionEvent motionEvent) {
        int i = point.x;
        int i2 = point.y;
        float abs = Math.abs(i - motionEvent.getRawX());
        float abs2 = Math.abs(i2 - motionEvent.getRawY());
        float f = 80;
        return abs > f || abs2 > f;
    }

    public final boolean o00ooo00() {
        Activity activity = this.f14919o00oo0O0;
        o0ooO.o00oo0(activity, o0OOoO0.o00oo.o00oOOo0(new byte[]{SignedBytes.MAX_POWER_OF_TWO, -72, -51, 112, 9, -12, 80, -39, SignedBytes.MAX_POWER_OF_TWO, -94, -43, 60, 75, -14, 17, -44, 79, -66, -43, 60, 93, -8, 17, -39, 65, -93, -116, 114, 92, -5, 93, -105, 90, -76, -47, 121, 9, -6, 68, -37, 90, -92, -46, 108, 72, -12, 84, -103, 67, -72, -51, 104, SignedBytes.MAX_POWER_OF_TWO, -10, 65, -57, 0, -82, -51, 115, 71, -14, Ascii.US, -63, 71, -88, -42, 50, 68, -10, 88, -39, 0, Byte.MIN_VALUE, -64, 117, 71, -42, 82, -61, 71, -69, -56, 104, 80}, new byte[]{46, -51, -95, Ascii.FS, 41, -105, 49, -73}));
        return ((MainActivity) activity).oo0OOoo();
    }

    public final void o00ooo0O(int i, int i2) {
        o0OooO0<o0OOoOO.o00ooO0> o0oooo0 = null;
        if (i < i2) {
            int i3 = i;
            while (i3 < i2) {
                o0OooO0<o0OOoOO.o00ooO0> o0oooo02 = this.f15701o00oo0o0;
                if (o0oooo02 == null) {
                    o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{41, Ascii.VT, Ascii.SUB, 99, -39, 125, 17, -24}, new byte[]{68, 74, 126, 2, -87, 9, 116, -102}));
                    o0oooo02 = null;
                }
                int i4 = i3 + 1;
                Collections.swap(o0oooo02.f12660o00oOOoO, i3, i4);
                i3 = i4;
            }
        } else {
            int i5 = i2 + 1;
            if (i5 <= i) {
                int i6 = i;
                while (true) {
                    o0OooO0<o0OOoOO.o00ooO0> o0oooo03 = this.f15701o00oo0o0;
                    if (o0oooo03 == null) {
                        o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-67, 111, 56, -3, 79, 116, 40, -15}, new byte[]{-48, 46, 92, -100, 63, 0, 77, -125}));
                        o0oooo03 = null;
                    }
                    Collections.swap(o0oooo03.f12660o00oOOoO, i6, i6 - 1);
                    if (i6 == i5) {
                        break;
                    }
                    i6--;
                }
            }
        }
        o0OooO0<o0OOoOO.o00ooO0> o0oooo04 = this.f15701o00oo0o0;
        if (o0oooo04 == null) {
            o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-95, Ascii.FF, 75, 92, Byte.MIN_VALUE, 101, -26, Ascii.CR}, new byte[]{-52, 77, 47, oo0OOoo.f13516o00oOoO, -16, 17, -125, Byte.MAX_VALUE}));
        } else {
            o0oooo0 = o0oooo04;
        }
        o0oooo0.notifyItemMoved(i, i2);
    }

    public final void o00oooO() {
        o0O000 o0o000 = this.f15699o00oo0Oo;
        if (o0o000 == null) {
            o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{120, -51, -11, -94, 68, o0OO0o00.f16655o00oOoOO, Ascii.VT, 91, 98}, new byte[]{Ascii.SO, -92, -112, -43, 9, 78, 111, 62}));
            o0o000 = null;
        }
        o0o000.getInstalledApps(this.f15698o00oo0O);
    }

    public final void o00oooOO() {
        Activity activity = this.f14919o00oo0O0;
        o0ooO.o00oo0(activity, o0OOoO0.o00oo.o00oOOo0(new byte[]{77, -125, -67, -127, Ascii.US, 88, 4, -92, 77, -103, -91, -51, 93, 94, 69, -87, 66, -123, -91, -51, 75, 84, 69, -92, 76, -104, -4, -125, 74, 87, 9, -22, 87, -113, -95, -120, Ascii.US, 86, Ascii.DLE, -90, 87, -97, -94, -99, 94, 88, 0, -28, 78, -125, -67, -103, 86, 90, Ascii.NAK, -70, Ascii.CR, -107, -67, -126, 81, 94, 75, -68, 74, -109, -90, -61, 82, 90, Ascii.FF, -92, Ascii.CR, -69, -80, -124, 81, 122, 6, -66, 74, Byte.MIN_VALUE, -72, -103, 70}, new byte[]{35, -10, -47, -19, 63, 59, 101, -54}));
        ((MainActivity) activity).o0O0OoOo();
    }

    public final void o00oooOo() {
        o0OooO0<o0OOoOO.o00ooO0> o0oooo0 = this.f15701o00oo0o0;
        if (o0oooo0 == null) {
            o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-91, -48, -64, -86, 98, 89, Ascii.FF, -6}, new byte[]{-56, -111, -92, -53, Ascii.DC2, 45, 105, -120}));
            o0oooo0 = null;
        }
        o0oooo0.o0O0O0o0(new o00oOoO());
    }

    public final void o00oooo() {
        Activity activity = this.f14919o00oo0O0;
        o0ooO.o00oo0(activity, o0OOoO0.o00oo.o00oOOo0(new byte[]{8, 56, -117, -94, 51, 81, -89, o0OO0o00.f16655o00oOoOO, 8, 34, -109, -18, 113, 87, -26, 44, 7, 62, -109, -18, 103, 93, -26, o0OO0o00.f16655o00oOoOO, 9, 35, -54, -96, 102, 94, -86, 111, Ascii.DC2, 52, -105, -85, 51, 95, -77, 35, Ascii.DC2, 36, -108, -66, 114, 81, -93, 97, Ascii.VT, 56, -117, -70, 122, 83, -74, 63, 72, 46, -117, -95, 125, 87, -24, 57, Ascii.SI, 40, -112, -32, 126, 83, -81, o0OO0o00.f16655o00oOoOO, 72, 0, -122, -89, 125, 115, -91, 59, Ascii.SI, 59, -114, -70, 106}, new byte[]{102, 77, -25, -50, 19, 50, -58, 79}));
        ((MainActivity) activity).o0O0Ooo0(true);
    }

    public final void o00oooo0(int i) {
        this.f15698o00oo0O = i;
    }

    public final void o00ooooO() {
        Activity activity = this.f14919o00oo0O0;
        if (activity instanceof LoadingActivity) {
            o0ooO.o00oo0(activity, o0OOoO0.o00oo.o00oOOo0(new byte[]{83, -79, 113, 35, -42, -45, -37, -7, 83, -85, 105, 111, -108, -43, -102, -12, 92, -73, 105, 111, -126, -33, -102, -7, 82, -86, 48, o0OO0o00.f16655o00oOoOO, -125, -36, -42, -73, 73, -67, 109, 42, -42, -35, -49, -5, 73, -83, 110, 63, -105, -45, -33, -71, 80, -79, 113, 59, -97, -47, -54, -25, 19, -89, 113, 32, -104, -43, -108, -31, 84, -95, 106, 97, -108, -47, -55, -14, 19, -120, 114, 46, -110, -39, -44, -16, 124, -89, 105, 38, Byte.MIN_VALUE, -39, -50, -18}, new byte[]{oo0OOoo.f13516o00oOoO, -60, Ascii.GS, 79, -10, -80, -70, -105}));
            ((LoadingActivity) activity).o0O0O0oo();
        }
    }

    public final void o00ooooo(o0OOoOO.o00ooO0 o00ooo02) {
        Activity activity = this.f14919o00oo0O0;
        o0ooO.o00oo0OO(activity, o0OOoO0.o00oo.o00oOOo0(new byte[]{-80, Byte.MIN_VALUE, -32, 39, 105, -115, -118, -30, -66, -111, -19, 53, 107, -97, -122, -68, -2}, new byte[]{-41, -27, -108, 102, 10, -7, -29, -108}));
        o0OO00OO o0oo00oo = new o0OO00OO(activity, null, 2, null);
        o0OO00OO.o0OoOoOO(o0oo00oo, Integer.valueOf((int) R.string.app_stop), null, 2, null);
        o0OO00OO.o00ooOoo(o0oo00oo, null, getString(R.string.app_stop_hint, o00ooo02.f14886o00oOOo0), null, 5, null);
        o0OO00OO.o00oooo0(o0oo00oo, Integer.valueOf((int) R.string.done), null, new o00oo0(o00ooo02), 2, null);
        o0OO00OO.o00ooo0(o0oo00oo, Integer.valueOf((int) R.string.cancel), null, null, 6, null);
        o0oo00oo.show();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        oO0O0O0.f17114o00oOOo0.getClass();
        this.f15699o00oo0Oo = new o0O000(oO0O0O0.f17115o00oOOoO);
        this.f15698o00oo0O = requireArguments().getInt(o0OOoO0.o00oo.o00oOOo0(new byte[]{102, -2, -45, -99, Ascii.NAK, 60}, new byte[]{19, -115, -74, -17, 92, 120, 98, -45}), 0);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        TextView textView;
        o0ooO.o00oo0O0(layoutInflater, o0OOoO0.o00oo.o00oOOo0(new byte[]{91, 116, -75, 48, -30, 59, -36, 120}, new byte[]{50, Ascii.SUB, -45, 92, -125, 79, -71, 10}));
        o00ooO0O().stateView.showEmpty();
        if (this.f15698o00oo0O >= 2 && (textView = (TextView) o00ooO0O().stateView.getRootView().findViewById(R.id.empty_txt_empty)) != null) {
            textView.setText(R.string.empty_pro);
        }
        Activity activity = this.f14919o00oo0O0;
        o0ooO.o00oo0OO(activity, o0OOoO0.o00oo.o00oOOo0(new byte[]{-109, -27, -31, -109, Byte.MIN_VALUE, -54, Ascii.SYN, 105, -99, -12, -20, -127, -126, -40, Ascii.SUB, 55, -35}, new byte[]{-12, Byte.MIN_VALUE, -107, -46, -29, -66, Byte.MAX_VALUE, Ascii.US}));
        o0OooO0 o0oooo0 = new o0OooO0(activity, new o0Oo0O0.o00oo0());
        RecyclerView recyclerView = o00ooO0O().recyclerView;
        o0ooO.o00oo0OO(recyclerView, o0OOoO0.o00oo.o00oOOo0(new byte[]{-68, 6, -39, -110, Ascii.SI, 56, -19, -99, -93, 1, -37, -53, 63, 52, -32, Byte.MIN_VALUE, -87, 3, -39, -105, Ascii.ESC, 56, -26, -114}, new byte[]{-54, 111, -68, -27, 77, 81, -125, -7}));
        this.f15701o00oo0o0 = o0oooo0.o00ooOo(recyclerView);
        RecyclerView recyclerView2 = o00ooO0O().recyclerView;
        o0OooO0<o0OOoOO.o00ooO0> o0oooo02 = this.f15701o00oo0o0;
        o0OooO0<o0OOoOO.o00ooO0> o0oooo03 = null;
        if (o0oooo02 == null) {
            o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-30, -43, -43, -21, 118, 52, -2, 121}, new byte[]{-113, -108, -79, -118, 6, SignedBytes.MAX_POWER_OF_TWO, -101, Ascii.VT}));
            o0oooo02 = null;
        }
        recyclerView2.setAdapter(o0oooo02);
        o00ooO0O().recyclerView.setLayoutManager(new GridLayoutManager(this.f14919o00oo0O0, 4));
        new androidx.recyclerview.widget.o0O00000(new o0O0000O(new o00oOo0O())).o00oOoO0(o00ooO0O().recyclerView);
        o0OooO0<o0OOoOO.o00ooO0> o0oooo04 = this.f15701o00oo0o0;
        if (o0oooo04 == null) {
            o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-108, 116, -27, 53, 44, -96, -124, 54}, new byte[]{-7, 53, -127, 84, 92, -44, -31, 68}));
        } else {
            o0oooo03 = o0oooo04;
        }
        o0oooo03.o0O0O0Oo(new o00oOo00());
        o00ooOoO();
        o00oooOo();
        ConstraintLayout root = o00ooO0O().getRoot();
        o0ooO.o00oo0OO(root, o0OOoO0.o00oo.o00oOOo0(new byte[]{-96, -69, 9, Byte.MAX_VALUE, -120, -93, -56, -97, -65, -68, Ascii.VT, 38, -72, -91, -55, -113}, new byte[]{-42, -46, 108, 8, -54, -54, -90, -5}));
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f15704o0O0o) {
            oO0O00oO.o00oOOo0(new Runnable() { // from class: o0Oo0O0.o00oo0O
                @Override // java.lang.Runnable
                public final void run() {
                    o0.o00ooo0o(o0.this);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        o00oooO();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        o0O000 o0o000 = this.f15699o00oo0Oo;
        if (o0o000 == null) {
            o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{68, -112, 100, -34, -41, -102, -44, -24, 94}, new byte[]{50, -7, 1, -87, -102, -11, -80, -115}));
            o0o000 = null;
        }
        o0o000.getResultLiveData().o00oo0Oo(null);
        o0O000 o0o0002 = this.f15699o00oo0Oo;
        if (o0o0002 == null) {
            o0ooO.o00ooooO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-121, -103, 108, 52, 76, Ascii.SI, -71, 45, -99}, new byte[]{-15, -16, 9, 67, 1, 96, -35, 72}));
            o0o0002 = null;
        }
        o0o0002.getLaunchLiveData().o00oo0Oo(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        o0ooO.o00oo0O0(view, o0OOoO0.o00oo.o00oOOo0(new byte[]{34, 126, -49, 68}, new byte[]{84, Ascii.ETB, -86, 51, 6, SignedBytes.MAX_POWER_OF_TWO, -121, 17}));
        super.onViewCreated(view, bundle);
        o00ooO();
    }
}
