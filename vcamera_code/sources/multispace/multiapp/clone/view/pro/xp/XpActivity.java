package multispace.multiapp.clone.view.pro.xp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.o00oo0OO;
import androidx.appcompat.app.o00oOo0O;
import androidx.appcompat.widget.oo0oO0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Metadata;
import multispace.multiapp.clone.view.base.BaseActivity;
import multispace.multiapp.clone.view.base.LoadingActivity;
import multispace.multiapp.clone.view.list.ListActivity;
import multispace.multiapp.clone.view.pro.xp.XpActivity;
import o00oOo00.o00oOOoO;
import o0O0o0oo.o0OooO0;
import o0O0oo0O.o0OO00OO;
import o0O0oooo.o0OO;
import o0OO0o.o0O00oO0;
import o0OO0o.o0oO0Ooo;
import o0OO0o.oO0Ooooo;
import o0OOO0oo.oo0OOoo;
import o0OOOO.o0O0000O;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import o0OOoOO.o0O000O;
import o0OOoo0.o0O000o0;
import o0Oo0oo0.o0OO0o00;
import o0oOo0o0.oO00o000;
import o0oOo0o0.oO0OOO00;
import o0ooO0O0.oO0O0O0;
import o0ooO0O0.oO0OOO0;
import o0ooO0O0.oO0Oo0o0;
import o0ooO0O0.ooo0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import virtual.camera.app.R;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b*\u0010+J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000fH\u0002R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010)\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010%0%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006."}, d2 = {"Lmultispace/multiapp/clone/view/pro/xp/XpActivity;", "Lmultispace/multiapp/clone/view/base/LoadingActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lo0OO0o/oO0Ooooo;", "onCreate", "onStart", "onStop", "o0O0Ooo0", "oo0OOoo", "Lo0OOoOO/o0O000O;", "item", "o0O0OooO", "o0O0Oooo", "o0O0Oo0o", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "name", "o0O0Oo0", "o0O0o000", FirebaseAnalytics.Param.SOURCE, "o0O0OoO0", "Lo0OOoo0/o0O000o0;", "o00ooooo", "Lo0OO0o/o0oO0Ooo;", "o0O0Oo0O", "()Lo0OOoo0/o0O000o0;", "viewBinding", "Lo0oOo0o0/oO0OOO00;", "o0", "Lo0oOo0o0/oO0OOO00;", "viewModel", "Lo0O0o0oo/o0OooO0;", "o0O00000", "Lo0O0o0oo/o0OooO0;", "mAdapter", "Landroidx/activity/result/o00oo0OO;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "o0O0000O", "Landroidx/activity/result/o00oo0OO;", "apkPathResult", "<init>", "()V", "o0O0000o", "o00oOOo0", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class XpActivity extends LoadingActivity {
    @NotNull

    /* renamed from: o0O0000o  reason: collision with root package name */
    public static final o00oOOo0 f6790o0O0000o = new o00oOOo0(null);

    /* renamed from: o0  reason: collision with root package name */
    public oO0OOO00 f6791o0;
    @NotNull

    /* renamed from: o00ooooo  reason: collision with root package name */
    public final o0oO0Ooo f6792o00ooooo = o0O00oO0.o00oOo00(new o00oOoO(this));

    /* renamed from: o0O00000  reason: collision with root package name */
    public o0OooO0<o0O000O> f6793o0O00000;
    @NotNull

    /* renamed from: o0O0000O  reason: collision with root package name */
    public final o00oo0OO<Intent> f6794o0O0000O;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lmultispace/multiapp/clone/view/pro/xp/XpActivity$o00oOOo0;", "", "Landroid/content/Context;", "context", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "<init>", "()V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        public final void o00oOOo0(@NotNull Context context) {
            o0ooO.o00oo0O0(context, o00oo.o00oOOo0(new byte[]{-42, -83, Ascii.DC4, Ascii.DC4, 82, -95, -26}, new byte[]{-75, -62, 122, 96, 55, -39, -110, 59}));
            context.startActivity(new Intent(context, XpActivity.class));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "it", "Lo0OO0o/oO0Ooooo;", "invoke", "(Lo0O0oo0O/o0OO00OO;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0O0OO implements o0OOOO.o00oo<o0OO00OO, oO0Ooooo> {
        public final /* synthetic */ String $packageName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(String str) {
            super(1);
            this.$packageName = str;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(o0OO00OO o0oo00oo) {
            invoke2(o0oo00oo);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull o0OO00OO o0oo00oo) {
            o0ooO.o00oo0O0(o0oo00oo, o00oo.o00oOOo0(new byte[]{-56, -100}, new byte[]{-95, -24, -104, 94, -10, -8, -55, -30}));
            XpActivity.this.o0O0O0oo();
            oO0OOO00 oo0ooo00 = XpActivity.this.f6791o0;
            if (oo0ooo00 == null) {
                o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{o0OO0o00.f16655o00oOoOO, -121, -53, -124, 109, -20, -56, -75, 59}, new byte[]{87, -18, -82, -13, 32, -125, -84, -48}));
                oo0ooo00 = null;
            }
            oo0ooo00.cleanModule(this.$packageName);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/view/View;", "view", "Lo0OOoOO/o0O000O;", "item", "", "position", "Lo0OO0o/oO0Ooooo;", "invoke", "(Landroid/view/View;Lo0OOoOO/o0O000O;I)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0O0OO implements o0O0000O<View, o0O000O, Integer, oO0Ooooo> {
        public o00oOo00() {
            super(3);
        }

        @Override // o0OOOO.o0O0000O
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(View view, o0O000O o0o000o, Integer num) {
            invoke(view, o0o000o, num.intValue());
            return oO0Ooooo.f13240o00oOOo0;
        }

        public final void invoke(@NotNull View view, @NotNull o0O000O o0o000o, int i) {
            o0ooO.o00oo0O0(view, o00oo.o00oOOo0(new byte[]{-3, -119, Ascii.ESC, Ascii.DC2}, new byte[]{-117, -32, 126, 101, 69, -9, -29, -12}));
            o0ooO.o00oo0O0(o0o000o, o00oo.o00oOOo0(new byte[]{Ascii.ESC, -125, 120, -78}, new byte[]{114, -9, Ascii.GS, -33, -7, -44, 3, -60}));
            XpActivity.this.o0O0OooO(o0o000o);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/view/View;", "view", "Lo0OOoOO/o0O000O;", "item", "", "position", "Lo0OO0o/oO0Ooooo;", "invoke", "(Landroid/view/View;Lo0OOoOO/o0O000O;I)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0O0OO implements o0O0000O<View, o0O000O, Integer, oO0Ooooo> {
        public o00oOo0O() {
            super(3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-1$lambda-0  reason: not valid java name */
        public static final boolean m5invoke$lambda1$lambda0(XpActivity xpActivity, o0O000O o0o000o, MenuItem menuItem) {
            o0ooO.o00oo0O0(xpActivity, o00oo.o00oOOo0(new byte[]{-49, 123, 75, 46, -68, -108}, new byte[]{-69, 19, 34, 93, -104, -92, 7, -71}));
            o0ooO.o00oo0O0(o0o000o, o00oo.o00oOOo0(new byte[]{38, 48, 116, 65, 123}, new byte[]{2, 89, 0, 36, Ascii.SYN, -123, -63, -31}));
            switch (menuItem.getItemId()) {
                case R.id.app_clear /* 2131361873 */:
                    xpActivity.o0O0Oo0(o0o000o.f14904o00oOo00, o0o000o.f14902o00oOOo0);
                    return true;
                case R.id.app_desc /* 2131361874 */:
                default:
                    return true;
                case R.id.app_remove /* 2131361875 */:
                    xpActivity.o0O0o000(o0o000o.f14904o00oOo00);
                    return true;
                case R.id.app_start /* 2131361876 */:
                    xpActivity.o0O0OooO(o0o000o);
                    return true;
            }
        }

        @Override // o0OOOO.o0O0000O
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(View view, o0O000O o0o000o, Integer num) {
            invoke(view, o0o000o, num.intValue());
            return oO0Ooooo.f13240o00oOOo0;
        }

        public final void invoke(@NotNull View view, @NotNull final o0O000O o0o000o, int i) {
            o0ooO.o00oo0O0(view, o00oo.o00oOOo0(new byte[]{36, Byte.MAX_VALUE, -127, -92}, new byte[]{82, Ascii.SYN, -28, -45, 65, 120, 103, 55}));
            o0ooO.o00oo0O0(o0o000o, o00oo.o00oOOo0(new byte[]{Ascii.SI, 39, 65, -20}, new byte[]{102, 83, 36, -127, -4, -60, -95, Ascii.FF}));
            oo0oO0 oo0oo0 = new oo0oO0(XpActivity.this, view, 0);
            final XpActivity xpActivity = XpActivity.this;
            oo0oo0.o00oOoO0(R.menu.xp_menu);
            oo0oo0.f1565o00oOo0O = new oo0oO0.o00oOoO() { // from class: o0oOo0o0.oO00Oo0
                @Override // androidx.appcompat.widget.oo0oO0.o00oOoO
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean m5invoke$lambda1$lambda0;
                    m5invoke$lambda1$lambda0 = XpActivity.o00oOo0O.m5invoke$lambda1$lambda0(XpActivity.this, o0o000o, menuItem);
                    return m5invoke$lambda1$lambda0;
                }
            };
            oo0oo0.o00oOooo();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo0O0OoO0/o00oOo00;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "invoke", "()Lo0O0OoO0/o00oOo00;", "o0ooO0O0/oO0o0000$o00oOOo0", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOoO extends o0O0OO implements o0OOOO.o00oOOo0<o0O000o0> {
        public final /* synthetic */ Activity $this_inflate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOoO(Activity activity) {
            super(0);
            this.$this_inflate = activity;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final o0O000o0 invoke() {
            LayoutInflater layoutInflater = this.$this_inflate.getLayoutInflater();
            o0ooO.o00oo0OO(layoutInflater, o00oo.o00oOOo0(new byte[]{-111, 124, 1, 119, 52, -93, -9, -5, -101, 113, Ascii.EM, 108, 36, -91}, new byte[]{-3, Ascii.GS, 120, Ascii.CAN, 65, -41, -66, -107}));
            Object invoke = o0O000o0.class.getMethod(o00oo.o00oOOo0(new byte[]{122, SignedBytes.MAX_POWER_OF_TWO, -112, -79, 75, 104, 97}, new byte[]{19, 46, -10, -35, 42, Ascii.FS, 4, -53}), LayoutInflater.class).invoke(null, layoutInflater);
            if (invoke != null) {
                return (o0O000o0) invoke;
            }
            throw new NullPointerException(o00oo.o00oOOo0(new byte[]{SignedBytes.MAX_POWER_OF_TWO, Byte.MAX_VALUE, -85, Ascii.DLE, -98, 103, 36, -75, SignedBytes.MAX_POWER_OF_TWO, 101, -77, 92, -36, 97, 101, -72, 79, 121, -77, 92, -54, 107, 101, -75, 65, 100, -22, Ascii.DC2, -53, 104, 41, -5, 90, 115, -73, Ascii.EM, -98, 105, 48, -73, 90, 99, -76, Ascii.FF, -33, 103, 32, -11, 67, Byte.MAX_VALUE, -85, 8, -41, 101, 53, -85, 0, 105, -85, 19, -48, 97, 107, -65, 79, 126, -90, Ascii.RS, -41, 106, o0OO0o00.f16655o00oOoOO, -78, SignedBytes.MAX_POWER_OF_TWO, 109, -23, oo0OOoo.f13516o00oOoO, -35, 112, 44, -83, 71, 126, -66, 36, -50, 70, 44, -75, 74, 99, -87, Ascii.ESC}, new byte[]{46, 10, -57, 124, -66, 4, 69, -37}));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "it", "Lo0OO0o/oO0Ooooo;", "invoke", "(Lo0O0oo0O/o0OO00OO;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oo00O extends o0O0OO implements o0OOOO.o00oo<o0OO00OO, oO0Ooooo> {
        public final /* synthetic */ String $packageName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo00O(String str) {
            super(1);
            this.$packageName = str;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(o0OO00OO o0oo00oo) {
            invoke2(o0oo00oo);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull o0OO00OO o0oo00oo) {
            o0ooO.o00oo0O0(o0oo00oo, o00oo.o00oOOo0(new byte[]{Ascii.DLE, -116}, new byte[]{121, -8, -72, -53, 122, -29, 111, Ascii.FS}));
            XpActivity.this.o0O0O0oo();
            oO0OOO00 oo0ooo00 = XpActivity.this.f6791o0;
            if (oo0ooo00 == null) {
                o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{75, -102, -60, Ascii.FF, 43, -32, 39, -56, 81}, new byte[]{oo0OOoo.f13516o00oOoO, -13, -95, 123, 102, -113, 67, -83}));
                oo0ooo00 = null;
            }
            oo0ooo00.unInstallModule(this.$packageName);
        }
    }

    public XpActivity() {
        o00oo0OO<Intent> registerForActivityResult = registerForActivityResult(new o00oOOoO.o00ooO(), new androidx.activity.result.o00oOOo0() { // from class: o0oOo0o0.oO00OO
            @Override // androidx.activity.result.o00oOOo0
            public final void o00oOOo0(Object obj) {
                XpActivity.o0OooO0(XpActivity.this, (ActivityResult) obj);
            }
        });
        o0ooO.o00oo0OO(registerForActivityResult, o00oo.o00oOOo0(new byte[]{71, -106, -38, 39, -7, -1, Byte.MIN_VALUE, 85, 115, -100, -49, Ascii.SI, -23, -1, -116, 81, 92, -121, -60, Ascii.FS, -17, -8, -112, 75, -41, 115, Ascii.ESC, 68, Byte.MIN_VALUE, -85, -59, 7, Ascii.NAK, -45, -99, 110, -86, -85, -59, 7, Ascii.NAK, -114, -73, 110, -86, -85, -59, 7, Ascii.NAK, -45, -99, 51}, new byte[]{53, -13, -67, 78, -118, -117, -27, 39}));
        this.f6794o0O0000O = registerForActivityResult;
    }

    public static void o0O0OO(DialogInterface dialogInterface, int i) {
        try {
            dialogInterface.dismiss();
        } catch (Throwable unused) {
        }
    }

    public static final void o0O0Oo(XpActivity xpActivity, View view) {
        o0ooO.o00oo0O0(xpActivity, o00oo.o00oOOo0(new byte[]{-116, -57, -103, -96, -32, -22}, new byte[]{-8, -81, -16, -45, -60, -38, 58, 50}));
        Intent intent = new Intent(xpActivity, ListActivity.class);
        intent.putExtra(o00oo.o00oOOo0(new byte[]{-86, 68, -21, -39, -33, 39, 115, 90, -99, 90}, new byte[]{-59, 42, -121, -96, -116, 79, Ascii.FS, 45}), true);
        xpActivity.f6794o0O0000O.o00oOOoO(intent);
    }

    public static final void o0O0OoO(XpActivity xpActivity, List list) {
        o0ooO.o00oo0O0(xpActivity, o00oo.o00oOOo0(new byte[]{-13, -103, 3, 62, 51, -87}, new byte[]{-121, -15, 106, 77, Ascii.ETB, -103, -96, 56}));
        if (list == null || list.isEmpty()) {
            xpActivity.o0O0Oo0O().stateView.showEmpty();
            return;
        }
        o0OooO0<o0O000O> o0oooo0 = xpActivity.f6793o0O00000;
        if (o0oooo0 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{118, -112, -8, Ascii.NAK, -113, -110, 79, Ascii.CR}, new byte[]{Ascii.ESC, -47, -100, 116, -1, -26, 42, Byte.MAX_VALUE}));
            o0oooo0 = null;
        }
        o0OooO0.o0O0O0oO(o0oooo0, list, false, false, 6, null);
        xpActivity.o0O0Oo0O().stateView.showContent();
    }

    public static final void o0O0OoOo(XpActivity xpActivity, String str) {
        o0ooO.o00oo0O0(xpActivity, o00oo.o00oOOo0(new byte[]{-117, -1, -91, -59, -89, 47}, new byte[]{-1, -105, -52, -74, -125, Ascii.US, 65, -70}));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        xpActivity.o0O0O0oO();
        o0ooO.o00oo0OO(str, o00oo.o00oOOo0(new byte[]{-8, 100}, new byte[]{-111, Ascii.DLE, -3, -35, 103, -61, 8, -50}));
        oO0OOO0.o00oOooO(xpActivity, str);
        oO0OOO00 oo0ooo00 = xpActivity.f6791o0;
        if (oo0ooo00 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{97, -86, 55, 4, 112, 102, 90, -8, 123}, new byte[]{Ascii.ETB, -61, 82, 115, oo0OOoo.f13516o00oOoO, 9, 62, -99}));
            oo0ooo00 = null;
        }
        oo0ooo00.getInstalledModule();
    }

    public static final void o0O0Ooo(DialogInterface dialogInterface, int i) {
        try {
            dialogInterface.dismiss();
        } catch (Throwable unused) {
        }
    }

    public static final void o0OooO0(XpActivity xpActivity, ActivityResult activityResult) {
        Intent intent;
        String stringExtra;
        o0ooO.o00oo0O0(xpActivity, o00oo.o00oOOo0(new byte[]{SignedBytes.MAX_POWER_OF_TWO, 41, -65, 3, -13, -57}, new byte[]{52, 65, -42, 112, -41, -9, -118, -23}));
        if (activityResult.f74o00oo0O0 != -1 || (intent = activityResult.f73o00oo0O) == null || (stringExtra = intent.getStringExtra(o00oo.o00oOOo0(new byte[]{3, -62, 46, 84, -59, 80}, new byte[]{112, -83, 91, 38, -90, 53, -24, -35}))) == null) {
            return;
        }
        xpActivity.o0O0OoO0(stringExtra);
    }

    public final void o0O0Oo0(String str, String str2) {
        o0OO00OO o0oo00oo = new o0OO00OO(this, null, 2, null);
        o0OO00OO.o0OoOoOO(o0oo00oo, Integer.valueOf((int) R.string.app_clear), null, 2, null);
        o0OO00OO.o00ooOoo(o0oo00oo, null, ooo0o.o00oOOo0(R.string.app_clear_hint, str2), null, 4, null);
        o0OO00OO.o00oooo0(o0oo00oo, Integer.valueOf((int) R.string.yes), null, new o00oOOoO(str), 2, null);
        o0OO00OO.o00ooo0(o0oo00oo, Integer.valueOf((int) R.string.cancel), null, null, 6, null);
        o0oo00oo.show();
    }

    public final o0O000o0 o0O0Oo0O() {
        return (o0O000o0) this.f6792o00ooooo.getValue();
    }

    public final void o0O0Oo0o() {
        o0O0Oo0O().fab.setOnClickListener(new View.OnClickListener() { // from class: o0oOo0o0.oO00OOo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XpActivity.o0O0Oo(XpActivity.this, view);
            }
        });
    }

    public final void o0O0OoO0(String str) {
        o0O0O0oo();
        oO0OOO00 oo0ooo00 = this.f6791o0;
        if (oo0ooo00 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{54, 103, -75, 116, 49, Ascii.NAK, Ascii.CAN, -90, 44}, new byte[]{SignedBytes.MAX_POWER_OF_TWO, Ascii.SO, -48, 3, 124, 122, 124, -61}));
            oo0ooo00 = null;
        }
        oo0ooo00.installModule(str);
    }

    public final void o0O0Ooo0() {
        o00oOo0O.o00oOOo0 cancelable = new o00oOo0O.o00oOOo0(this).setCancelable(false);
        cancelable.setTitle(o00oo.o00oOOo0(new byte[]{109, -62, 50, -112, -102}, new byte[]{35, -83, 70, -11, -96, 79, 42, -37})).setMessage(o00oo.o00oOOo0(new byte[]{-118, -11, 122, -82, 114, -75, Ascii.DC2, -101, -79, -13, 63, -87, 117, -7, 8, -50, -86, -17, 122, -77, 105, -16, 81, -116, -90, -11, 59, -25, 114, -31, Ascii.DLE, -119, -90, -83, 55, -90, 120, -75, Ascii.US, -127, -73, -95, 56, -94, o0OO0o00.f16655o00oOoOO, -29, Ascii.DC4, -100, -70, -95, 41, -77, 96, -9, Ascii.GS, -117, -30, -95}, new byte[]{-61, -127, 90, -57, 1, -107, 113, -18}));
        cancelable.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: o0oOo0o0.oO00Oo00
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                XpActivity.o0O0OO(dialogInterface, i);
            }
        });
        cancelable.show();
    }

    public final void o0O0OooO(o0O000O o0o000o) {
        try {
            Intent o00oOoOO2 = o0OO.o00oOoOO(o0o000o.f14904o00oOo00, 0);
            if (o00oOoOO2 == null) {
                oO0Oo0o0.o00oOoO(o00oo.o00oOOo0(new byte[]{2, 85, 104, -92, -40, 6, 73, 43, Ascii.CR, 89, 60, Byte.MIN_VALUE, -49, 6, 83, 114}, new byte[]{76, 58, 72, -23, -71, 111, 39, Ascii.VT}));
                return;
            }
            o00oOoOO2.addFlags(2097152);
            o0OO.o00ooO0o(o00oOoOO2, 0);
        } catch (Throwable th) {
            o00oo.o00oOOo0(new byte[]{-90, 44, -18, -71, -87}, new byte[]{-105, Ascii.GS, -33, -120, -104, 76, 124, -2});
            o00oo.o00oOOo0(new byte[]{105, -8, -79, -102, -101, -79, 74, 125, 110, -93}, new byte[]{5, -103, -60, -12, -8, -39, Ascii.VT, Ascii.CR});
            th.toString();
            oO0Oo0o0.o00oOoO(o00oo.o00oOOo0(new byte[]{-34, 54, -14, 2, Ascii.ESC, -56, 99, -20, -39, 109}, new byte[]{-78, 87, -121, 108, 120, -96, 34, -100}) + th);
        }
    }

    public final void o0O0Oooo() {
        o0OooO0 o0oooo0 = new o0OooO0(this, new oO00o000());
        RecyclerView recyclerView = o0O0Oo0O().recyclerView;
        o0ooO.o00oo0OO(recyclerView, o00oo.o00oOOo0(new byte[]{116, 94, -55, 90, -87, 53, 52, 2, 107, 89, -53, 3, -103, 57, 57, Ascii.US, 97, 91, -55, 95, -67, 53, 63, 17}, new byte[]{2, 55, -84, 45, -21, 92, 90, 102}));
        this.f6793o0O00000 = o0oooo0.o00ooOo(recyclerView).o0O0O0Oo(new o00oOo00()).o0O0O0o0(new o00oOo0O());
        o0O0Oo0O().recyclerView.setLayoutManager(new LinearLayoutManager(this));
        o0O0Oo0O().stateView.showEmpty();
    }

    public final void o0O0o000(String str) {
        o0OO00OO o0oo00oo = new o0OO00OO(this, null, 2, null);
        o0OO00OO.o0OoOoOO(o0oo00oo, Integer.valueOf((int) R.string.uninstall_module), null, 2, null);
        o0OO00OO.o00ooOoo(o0oo00oo, Integer.valueOf((int) R.string.uninstall_module_hint), null, null, 6, null);
        o0OO00OO.o00oooo0(o0oo00oo, Integer.valueOf((int) R.string.yes), null, new o00oo00O(str), 2, null);
        o0OO00OO.o00ooo0(o0oo00oo, Integer.valueOf((int) R.string.cancel), null, null, 6, null);
        o0oo00oo.show();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o0O0Oo0O().getRoot());
        MaterialToolbar materialToolbar = o0O0Oo0O().toolbarLayout.toolbar;
        o0ooO.o00oo0OO(materialToolbar, o00oo.o00oOOo0(new byte[]{3, -16, -50, -105, 42, 62, -123, -18, Ascii.FS, -9, -52, -50, Ascii.FS, 56, -124, -26, Ascii.ETB, -8, -39, -84, 9, 46, -124, -1, 1, -73, -33, -113, 7, 59, -119, -21, 7}, new byte[]{117, -103, -85, -32, 104, 87, -21, -118}));
        BaseActivity.o0O0O0Oo(this, materialToolbar, R.string.module_list, true, null, 8, null);
        oO0O0O0.f17114o00oOOo0.getClass();
        this.f6791o0 = new oO0OOO00(oO0O0O0.f17116o00oOo00);
        o0O0Oooo();
        o0O0Oo0o();
        o0O0Ooo0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        oo0OOoo();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        oO0OOO00 oo0ooo00 = this.f6791o0;
        oO0OOO00 oo0ooo002 = null;
        if (oo0ooo00 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-49, 92, -79, -61, 52, -115, -71, 17, -43}, new byte[]{-71, 53, -44, -76, 121, -30, -35, 116}));
            oo0ooo00 = null;
        }
        oo0ooo00.getAppsLiveData().o00oo0Oo(null);
        oO0OOO00 oo0ooo003 = this.f6791o0;
        if (oo0ooo003 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{93, Byte.MIN_VALUE, 7, -105, 67, 100, 119, -96, 71}, new byte[]{43, -23, 98, -32, Ascii.SO, Ascii.VT, 19, -59}));
            oo0ooo003 = null;
        }
        oo0ooo003.getAppsLiveData().o00oo0O(this);
        oO0OOO00 oo0ooo004 = this.f6791o0;
        if (oo0ooo004 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-59, 76, -53, -19, -42, -28, 119, -47, -33}, new byte[]{-77, 37, -82, -102, -101, -117, 19, -76}));
            oo0ooo004 = null;
        }
        oo0ooo004.getResultLiveData().o00oo0Oo(null);
        oO0OOO00 oo0ooo005 = this.f6791o0;
        if (oo0ooo005 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-94, 72, -103, -101, -97, -69, Ascii.ESC, -11, -72}, new byte[]{-44, o0OO0o00.f16655o00oOoOO, -4, -20, -46, -44, Byte.MAX_VALUE, -112}));
        } else {
            oo0ooo002 = oo0ooo005;
        }
        oo0ooo002.getResultLiveData().o00oo0O(this);
    }

    public final void oo0OOoo() {
        o0O0Oo0O().stateView.showLoading();
        oO0OOO00 oo0ooo00 = this.f6791o0;
        oO0OOO00 oo0ooo002 = null;
        if (oo0ooo00 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{126, 79, 42, 83, -56, 37, -80, oo0OOoo.f13516o00oOoO, 100}, new byte[]{8, 38, 79, 36, -123, 74, -44, 88}));
            oo0ooo00 = null;
        }
        oo0ooo00.getInstalledModule();
        oO0OOO00 oo0ooo003 = this.f6791o0;
        if (oo0ooo003 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-93, Byte.MAX_VALUE, 49, 8, -21, Ascii.DC2, 10, -101, -71}, new byte[]{-43, Ascii.SYN, 84, Byte.MAX_VALUE, -90, 125, 110, -2}));
            oo0ooo003 = null;
        }
        oo0ooo003.getAppsLiveData().o00oOoo0(this, new androidx.lifecycle.o0OooO0() { // from class: o0oOo0o0.oO00OOO
            @Override // androidx.lifecycle.o0OooO0
            public final void onChanged(Object obj) {
                XpActivity.o0O0OoO(XpActivity.this, (List) obj);
            }
        });
        oO0OOO00 oo0ooo004 = this.f6791o0;
        if (oo0ooo004 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{89, 79, 60, -12, -10, -28, -19, 122, 67}, new byte[]{47, 38, 89, -125, -69, -117, -119, Ascii.US}));
        } else {
            oo0ooo002 = oo0ooo004;
        }
        oo0ooo002.getResultLiveData().o00oOoo0(this, new androidx.lifecycle.o0OooO0() { // from class: o0oOo0o0.oO00OOOo
            @Override // androidx.lifecycle.o0OooO0
            public final void onChanged(Object obj) {
                XpActivity.o0O0OoOo(XpActivity.this, (String) obj);
            }
        });
    }
}
