package multispace.multiapp.clone.view.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.o00oo0OO;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import multispace.multiapp.clone.activity.AboutActivity;
import multispace.multiapp.clone.app.App;
import multispace.multiapp.clone.view.base.BaseActivity;
import multispace.multiapp.clone.view.base.LoadingActivity;
import multispace.multiapp.clone.view.list.ListActivity;
import multispace.multiapp.clone.view.main.MainActivity;
import multispace.multiapp.clone.view.pay.PayActivity;
import o00oOo00.o00oOOoO;
import o00oOoOo.o00ooO0;
import o0O0oO.o0oOo0O0;
import o0O0oo0O.o0OO00OO;
import o0O0oooo.o0OO;
import o0OO0o.o0O00oO0;
import o0OO0o.o0oO0Ooo;
import o0OO0o.oO0Ooooo;
import o0OO0oO.o0O000O;
import o0OO0oO.o0O00o00;
import o0OOO0oo.oo0OOoo;
import o0OOOO.o0O00000;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import o0OOoO0o.o0OO00o;
import o0OOoOo0.ooOOO0Oo;
import o0OOoo0.o0O0000O;
import o0OOooO.o0O00O0o;
import o0OOooOO.o0O0oo00;
import o0Oo0O0.o0;
import o0Oo0oo0.o0OO0o00;
import o0oOooO0.oOooo;
import o0ooO0O0.oO0O;
import o0ooO0O0.oOo00o0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import virtual.camera.app.R;
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 72\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b5\u00106J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0004J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0006\u0010\u0012\u001a\u00020\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00104\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u000100000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00069"}, d2 = {"Lmultispace/multiapp/clone/view/main/MainActivity;", "Lmultispace/multiapp/clone/view/base/LoadingActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lo0OO0o/oO0Ooooo;", "onCreate", "", "show", "o0O0Ooo0", "oo0OOoo", "o0O0OoOo", "Landroid/view/Menu;", o00ooO0.f7024o00oOo0o, "onCreateOptionsMenu", "onPrepareOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "o0O0OoO", "o0O0Oo", "o0O0OoO0", "o0O0Oo0O", "", "userId", "o0O0Ooo", "Lo0OOoo0/o0O0000O;", "o00ooooo", "Lo0OO0o/o0oO0Ooo;", "o0O0Oo0", "()Lo0OOoo0/o0O0000O;", "viewBinding", "Lo0oOooO0/oOooo;", "o0", "Lo0oOooO0/oOooo;", "mViewPagerAdapter", "", "Lo0Oo0O0/o0;", "o0O00000", "Ljava/util/List;", "fragmentList", "o0O0000O", "I", "currentUser", "Landroidx/appcompat/app/AppCompatActivity;", "o0O0000o", "Landroidx/appcompat/app/AppCompatActivity;", "mActivity", "Landroidx/activity/result/o00oo0OO;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "o0O000", "Landroidx/activity/result/o00oo0OO;", "apkPathResult", "<init>", "()V", "o0O000O", "o00oOOo0", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class MainActivity extends LoadingActivity {
    @NotNull

    /* renamed from: o0O000O  reason: collision with root package name */
    public static final o00oOOo0 f6730o0O000O = new o00oOOo0(null);

    /* renamed from: o0  reason: collision with root package name */
    public oOooo f6731o0;
    @NotNull

    /* renamed from: o0O000  reason: collision with root package name */
    public final o00oo0OO<Intent> f6733o0O000;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public int f6735o0O0000O;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public AppCompatActivity f6736o0O0000o;
    @NotNull

    /* renamed from: o00ooooo  reason: collision with root package name */
    public final o0oO0Ooo f6732o00ooooo = o0O00oO0.o00oOo00(new o00oo00O(this));
    @NotNull

    /* renamed from: o0O00000  reason: collision with root package name */
    public final List<o0> f6734o0O00000 = new ArrayList();

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lmultispace/multiapp/clone/view/main/MainActivity$o00oOOo0;", "", "Landroid/content/Context;", "context", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "<init>", "()V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        public final void o00oOOo0(@NotNull Context context) {
            o0ooO.o00oo0O0(context, o00oo.o00oOOo0(new byte[]{10, -21, 102, -40, 123, 116, 108}, new byte[]{105, -124, 8, -84, Ascii.RS, Ascii.FF, Ascii.CAN, 63}));
            context.startActivity(new Intent(context, MainActivity.class));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "it", "Lo0OO0o/oO0Ooooo;", "invoke", "(Lo0O0oo0O/o0OO00OO;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0O0OO implements o0OOOO.o00oo<o0OO00OO, oO0Ooooo> {
        public o00oOOoO() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(o0OO00OO o0oo00oo) {
            invoke2(o0oo00oo);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull o0OO00OO o0oo00oo) {
            o0ooO.o00oo0O0(o0oo00oo, o00oo.o00oOOo0(new byte[]{-22, 100}, new byte[]{-125, Ascii.DLE, 68, -7, 35, -55, -89, -14}));
            MainActivity.this.startActivity(new Intent(o00oo.o00oOOo0(new byte[]{-61, -33, Ascii.GS, -70, 83, Ascii.SUB, -36, 53, -47, -44, Ascii.CR, -68, 85, Ascii.GS, -33, 104, -116, -16, 41, -104, 112, 58, -5, 90, -10, -8, 54, -122, 99, 32, -3, 79, -10, -8, 55, -113, 111}, new byte[]{-94, -79, 121, -56, 60, 115, -72, Ascii.ESC})));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "<anonymous parameter 0>", "", "input", "Lo0OO0o/oO0Ooooo;", "invoke", "(Lo0O0oo0O/o0OO00OO;Ljava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0O0OO implements o0O00000<o0OO00OO, CharSequence, oO0Ooooo> {
        public o00oOo00() {
            super(2);
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(o0OO00OO o0oo00oo, CharSequence charSequence) {
            invoke2(o0oo00oo, charSequence);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull o0OO00OO o0oo00oo, @NotNull CharSequence charSequence) {
            o0ooO.o00oo0O0(o0oo00oo, o00oo.o00oOOo0(new byte[]{-110, -52, 100, -7, -39, 1, -53, 70, -37, -34, 42, -26, -42, 10, -57, 68, -53, -39, 111, -28, -105, 72, -104}, new byte[]{-82, -83, 10, -106, -73, 120, -90, 41}));
            o0ooO.o00oo0O0(charSequence, o00oo.o00oOOo0(new byte[]{Ascii.FF, 82, -80, 108, 125}, new byte[]{101, 60, -64, Ascii.EM, 9, -27, 126, 96}));
            SharedPreferences o00oOOo02 = o0OO00o.o00oOOo0();
            MainActivity mainActivity = MainActivity.this;
            SharedPreferences.Editor edit = o00oOOo02.edit();
            o0ooO.o00oo0OO(edit, o00oo.o00oOOo0(new byte[]{67, -55, Ascii.FS, -96, o0OO0o00.f16655o00oOoOO, -86}, new byte[]{38, -83, 117, -44, 78, -40, 99, Ascii.SI}));
            edit.putString(o00oo.o00oOOo0(new byte[]{109, Ascii.DLE, -105, -49, 52, -1}, new byte[]{63, 117, -6, -82, 70, -108, Ascii.VT, 19}) + mainActivity.f6735o0O0000O, charSequence.toString());
            mainActivity.o0O0Oo0().toolbarLayout.toolbar.setSubtitle(charSequence);
            edit.apply();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"multispace/multiapp/clone/view/main/MainActivity$o00oOo0O", "Landroidx/viewpager2/widget/ViewPager2$o00oo0O;", "", "position", "Lo0OO0o/oO0Ooooo;", "onPageSelected", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends ViewPager2.o00oo0O {
        public o00oOo0O() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oo0O
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            MainActivity mainActivity = MainActivity.this;
            mainActivity.f6735o0O0000O = ((o0) mainActivity.f6734o0O00000.get(i)).f15698o00oo0O;
            MainActivity mainActivity2 = MainActivity.this;
            mainActivity2.o0O0Ooo(mainActivity2.f6735o0O0000O);
            MainActivity.this.o0O0Ooo0(true);
            AppCompatActivity appCompatActivity = MainActivity.this.f6736o0O0000o;
            if (appCompatActivity == null) {
                o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{39, Byte.MAX_VALUE, 70, -118, -82, 103, -80, -66, 51}, new byte[]{74, 62, 37, -2, -57, 17, -39, -54}));
                appCompatActivity = null;
            }
            oOo00o0o.o00oOoO(appCompatActivity);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"multispace/multiapp/clone/view/main/MainActivity$o00oOoO", "Lo0OOooO/o0O00O0o$o0O00000;", "Lo0OO0o/oO0Ooooo;", "o00oOo00", "o00oOOo0", o0OO000o.o00oOOoO.f12961o00oOo00, "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOoO implements o0O00O0o.o0O00000 {
        public o00oOoO() {
        }

        @Override // o0OOooO.o0O00O0o.o0O00000
        public void o00oOOo0() {
        }

        @Override // o0OOooO.o0O00O0o.o0O00000
        public void o00oOOoO() {
            MainActivity.this.o0O0OoO();
        }

        @Override // o0OOooO.o0O00O0o.o0O00000
        public void o00oOo00() {
            MainActivity.this.o0O0OoO();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo0O0OoO0/o00oOo00;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "invoke", "()Lo0O0OoO0/o00oOo00;", "o0ooO0O0/oO0o0000$o00oOOo0", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oo00O extends o0O0OO implements o0OOOO.o00oOOo0<o0O0000O> {
        public final /* synthetic */ Activity $this_inflate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo00O(Activity activity) {
            super(0);
            this.$this_inflate = activity;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final o0O0000O invoke() {
            LayoutInflater layoutInflater = this.$this_inflate.getLayoutInflater();
            o0ooO.o00oo0OO(layoutInflater, o00oo.o00oOOo0(new byte[]{96, -56, 113, -106, 94, -119, -36, -96, 106, -59, 105, -115, 78, -113}, new byte[]{Ascii.FF, -87, 8, -7, 43, -3, -107, -50}));
            Object invoke = o0O0000O.class.getMethod(o00oo.o00oOOo0(new byte[]{94, Ascii.EM, 119, 5, 60, -119, -57}, new byte[]{55, 119, 17, 105, 93, -3, -94, 122}), LayoutInflater.class).invoke(null, layoutInflater);
            if (invoke != null) {
                return (o0O0000O) invoke;
            }
            throw new NullPointerException(o00oo.o00oOOo0(new byte[]{46, 5, -36, -11, -64, Ascii.SI, 98, 110, 46, Ascii.US, -60, -71, -126, 9, 35, 99, o0OO0o00.f16655o00oOoOO, 3, -60, -71, -108, 3, 35, 110, 47, Ascii.RS, -99, -9, -107, 0, 111, 32, 52, 9, -64, -4, -64, 1, 118, 108, 52, Ascii.EM, -61, -23, -127, Ascii.SI, 102, 46, 45, 5, -36, -19, -119, Ascii.CR, 115, 112, 110, 19, -36, -10, -114, 9, 45, 100, o0OO0o00.f16655o00oOoOO, 4, -47, -5, -119, 2, 103, 105, 46, Ascii.ETB, -98, -40, -125, Ascii.CAN, 106, 118, 41, 4, -55, -44, -127, 5, 109, 66, 41, Ascii.RS, -44, -16, -114, Ascii.VT}, new byte[]{SignedBytes.MAX_POWER_OF_TWO, 112, -80, -103, -32, 108, 3, 0}));
        }
    }

    public MainActivity() {
        o00oo0OO<Intent> registerForActivityResult = registerForActivityResult(new o00oOOoO.o00ooO(), new androidx.activity.result.o00oOOo0() { // from class: o0oOooO0.oO0Oo0o0
            @Override // androidx.activity.result.o00oOOo0
            public final void o00oOOo0(Object obj) {
                MainActivity.o0OooO0(MainActivity.this, (ActivityResult) obj);
            }
        });
        o0ooO.o00oo0OO(registerForActivityResult, o00oo.o00oOOo0(new byte[]{-118, -26, 103, -95, 19, -113, Ascii.DC4, 5, -66, -20, 114, -119, 3, -113, Ascii.CAN, 1, -111, -9, 121, -102, 5, -120, 4, Ascii.ESC, Ascii.SUB, 3, -90, -62, 106, -37, 81, 87, -40, -93, 32, -24, SignedBytes.MAX_POWER_OF_TWO, -37, 81, 87, -40, -2, 10, -24, SignedBytes.MAX_POWER_OF_TWO, -37, 81, 87, -40, -93, 32, -75}, new byte[]{-8, -125, 0, -56, 96, -5, 113, 119}));
        this.f6733o0O000 = registerForActivityResult;
    }

    public static final void o0O0Oo0o(MainActivity mainActivity, View view) {
        o0ooO.o00oo0O0(mainActivity, o00oo.o00oOOo0(new byte[]{-45, 84, 41, SignedBytes.MAX_POWER_OF_TWO, -10, -82}, new byte[]{-89, 60, SignedBytes.MAX_POWER_OF_TWO, 51, -46, -98, 88, -51}));
        List<ApplicationInfo> installedApplications = App.f6679o00oo0Oo.o00oOOo0().getPackageManager().getInstalledApplications(0);
        o0ooO.o00oo0OO(installedApplications, o00oo.o00oOOo0(new byte[]{0, -26, Ascii.SO, 96, 50, -92, -101, -79, 46, -8, 10, 43, 45, -75, -57, -37, 111, -15, Ascii.ESC, 58, 5, -96, -116, -103, -93, Ascii.SYN, -40, 58, Ascii.FS, -81, -100, -122, 32, -6, Ascii.DC2, 43, 49, Byte.MIN_VALUE, -97, -126, 45, -1, Ascii.GS, 47, o0OO0o00.f16655o00oOoOO, -88, Byte.MIN_VALUE, -100, 50, -66, 78, 103}, new byte[]{65, -106, 126, 78, 85, -63, -17, -14}));
        if (installedApplications.size() <= 1) {
            o0OO00OO o0oo00oo = new o0OO00OO(mainActivity, null, 2, null);
            o0OO00OO.o0OoOoOO(o0oo00oo, Integer.valueOf((int) R.string.no_permission), null, 2, null);
            o0OO00OO.o00ooOoo(o0oo00oo, null, mainActivity.getString(R.string.no_permission_query_packages), null, 5, null);
            o0OO00OO.o00oooo0(o0oo00oo, Integer.valueOf((int) R.string.action_goto), null, new o00oOOoO(), 2, null);
            o0OO00OO.o00ooo0(o0oo00oo, Integer.valueOf((int) R.string.cancel), null, null, 6, null);
            o0oo00oo.show();
            return;
        }
        int currentItem = mainActivity.o0O0Oo0().viewPager.getCurrentItem();
        if (currentItem >= 2 && !o0Oo00o0.o0.o00oOoO().o00oOoo0()) {
            PayActivity.o0oO0O0o(mainActivity);
            return;
        }
        Intent intent = new Intent(mainActivity, ListActivity.class);
        intent.putExtra(o00oo.o00oOOo0(new byte[]{Ascii.CR, -73, -121, -95, 112, -26}, new byte[]{120, -60, -30, -45, 57, -94, 87, -116}), currentItem);
        mainActivity.f6733o0O000.o00oOOoO(intent);
    }

    public static final void o0O0Oooo(MainActivity mainActivity, View view) {
        o0ooO.o00oo0O0(mainActivity, o00oo.o00oOOo0(new byte[]{-21, -68, -62, 86, 111, -38}, new byte[]{-97, -44, -85, 37, 75, -22, 126, 65}));
        o0OO00OO o0oo00oo = new o0OO00OO(mainActivity, null, 2, null);
        Integer valueOf = Integer.valueOf((int) R.string.userRemark);
        o0OO00OO.o0OoOoOO(o0oo00oo, valueOf, null, 2, null);
        o0oOo0O0.o00oOooO(o0oo00oo, null, valueOf, mainActivity.o0O0Oo0().toolbarLayout.toolbar.getSubtitle(), null, 0, null, false, false, new o00oOo00(), 249, null);
        o0OO00OO.o00oooo0(o0oo00oo, Integer.valueOf((int) R.string.done), null, null, 6, null);
        o0OO00OO.o00ooo0(o0oo00oo, Integer.valueOf((int) R.string.cancel), null, null, 6, null);
        o0oo00oo.show();
    }

    public static final void o0OooO0(MainActivity mainActivity, ActivityResult activityResult) {
        Intent intent;
        o0ooO.o00oo0O0(mainActivity, o00oo.o00oOOo0(new byte[]{-35, -94, -65, -72, -66, 47}, new byte[]{-87, -54, -42, -53, -102, Ascii.US, Ascii.CR, -73}));
        if (activityResult.f74o00oo0O0 != -1 || (intent = activityResult.f73o00oo0O) == null) {
            return;
        }
        int intExtra = intent.getIntExtra(o00oo.o00oOOo0(new byte[]{Ascii.SUB, -41, -79, 9, 105, -22}, new byte[]{111, -92, -44, 123, 32, -82, Ascii.SUB, 51}), 0);
        String stringExtra = intent.getStringExtra(o00oo.o00oOOo0(new byte[]{-75, 113, -23, -116, -22, 42}, new byte[]{-58, Ascii.RS, -100, -2, -119, 79, Ascii.SYN, Ascii.CAN}));
        if (stringExtra != null) {
            mainActivity.f6734o0O00000.get(intExtra).o00ooOo(stringExtra);
        }
    }

    public final void o0O0Oo() {
        o0O0Ooo(0);
        o0O0Oo0().toolbarLayout.toolbar.getChildAt(1).setOnClickListener(new View.OnClickListener() { // from class: o0oOooO0.oO0oO000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.o0O0Oooo(MainActivity.this, view);
            }
        });
    }

    public final o0O0000O o0O0Oo0() {
        return (o0O0000O) this.f6732o00ooooo.getValue();
    }

    public final void o0O0Oo0O() {
        o0O0Oo0().fab.setOnClickListener(new View.OnClickListener() { // from class: o0oOooO0.oO0o0000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.o0O0Oo0o(MainActivity.this, view);
            }
        });
    }

    public final void o0O0OoO() {
        this.f6734o0O00000.get(this.f6735o0O0000O).o00oooO();
    }

    public final void o0O0OoO0() {
        int[] o00oOo0o2 = o0OO.o00oOo0o();
        o0ooO.o00oo0OO(o00oOo0o2, o00oo.o00oOOo0(new byte[]{91, 34, -79, 97, -89, -6, -112, 40}, new byte[]{46, 81, -44, 19, -21, -109, -29, 92}));
        for (int i : o00oOo0o2) {
            this.f6734o0O00000.add(o0.f15696o00ooO0.o00oOOo0(i));
        }
        Integer oO0OoO = o0O000O.oO0OoO(o00oOo0o2);
        this.f6735o0O0000O = oO0OoO != null ? oO0OoO.intValue() : 0;
        if (ooOOO0Oo.o00oOOo0() || (ooOOO0Oo.o00oOo00() && o00oOo0o2.length == 0)) {
            this.f6734o0O00000.add(o0.f15696o00ooO0.o00oOOo0(o00oOo0o2.length));
        }
        oOooo ooooo = new oOooo(this);
        this.f6731o0 = ooooo;
        ooooo.o00oooo0(this.f6734o0O00000);
        ViewPager2 viewPager2 = o0O0Oo0().viewPager;
        oOooo ooooo2 = this.f6731o0;
        if (ooooo2 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-127, -107, 35, -101, 92, -90, 4, 74, -119, -79, Ascii.VT, -102, 74, -122, 17, 72, -98}, new byte[]{-20, -61, 74, -2, 43, -10, 101, 45}));
            ooooo2 = null;
        }
        viewPager2.setAdapter(ooooo2);
        WormDotsIndicator wormDotsIndicator = o0O0Oo0().dotsIndicator;
        ViewPager2 viewPager22 = o0O0Oo0().viewPager;
        o0ooO.o00oo0OO(viewPager22, o00oo.o00oOOo0(new byte[]{108, -35, 40, 65, 42, -105, 63, 90, 115, -38, 42, Ascii.CAN, Ascii.RS, -105, 52, 73, 74, -43, 42, 83, Ascii.SUB}, new byte[]{Ascii.SUB, -76, 77, 54, 104, -2, 81, 62}));
        wormDotsIndicator.setViewPager2(viewPager22);
        o0O0Oo0().viewPager.o00oo0(new o00oOo0O());
    }

    public final void o0O0OoOo() {
        int[] o00oOo0o2 = o0OO.o00oOo0o();
        if (this.f6734o0O00000.size() == o00oOo0o2.length) {
            if (ooOOO0Oo.o00oOOo0() || (!ooOOO0Oo.o00oOo00() && ooOOO0Oo.o00oOooO())) {
                List<o0> list = this.f6734o0O00000;
                list.add(o0.f15696o00ooO0.o00oOOo0(list.size()));
            }
        } else if (this.f6734o0O00000.size() > o00oOo0o2.length + 1) {
            o0O00o00.o0O0OOOo(this.f6734o0O00000);
        }
        oOooo ooooo = this.f6731o0;
        if (ooooo == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{102, 97, -113, -101, 97, Ascii.CR, 76, -115, 110, 69, -89, -102, 119, 45, 89, -113, 121}, new byte[]{Ascii.VT, 55, -26, -2, Ascii.SYN, 93, 45, -22}));
            ooooo = null;
        }
        ooooo.notifyDataSetChanged();
    }

    public final void o0O0Ooo(int i) {
        SharedPreferences o00oOOo02 = o0OO00o.o00oOOo0();
        String str = o00oo.o00oOOo0(new byte[]{91, -121, -17, 37, 17, 111}, new byte[]{9, -30, -126, 68, 99, 4, -93, -45}) + i;
        StringBuilder sb = new StringBuilder();
        sb.append(o00oo.o00oOOo0(new byte[]{-55, Ascii.ESC, -15, 75, 119, 79}, new byte[]{-102, 107, -112, 40, Ascii.DC2, 111, 41, -62}));
        boolean z = true;
        int i2 = i + 1;
        sb.append(i2);
        String string = o00oOOo02.getString(str, sb.toString());
        if (string != null && string.length() != 0) {
            z = false;
        }
        if (z) {
            string = o00oo.o00oOOo0(new byte[]{-98, 80, -122, -79, -52, Ascii.CAN}, new byte[]{-51, 32, -25, -46, -87, 56, -119, -2}) + i2;
        }
        o0O0Oo0().toolbarLayout.toolbar.setSubtitle(string);
    }

    public final void o0O0Ooo0(boolean z) {
        (z ? o0O0Oo0().fab.animate().translationY(0.0f).alpha(1.0f) : o0O0Oo0().fab.animate().translationY(oO0O.o00oOOoO(120.0f, App.f6679o00oo0Oo.o00oOOo0())).alpha(0.0f)).setDuration(200L).start();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o0O0Oo0().getRoot());
        MaterialToolbar materialToolbar = o0O0Oo0().toolbarLayout.toolbar;
        o0ooO.o00oo0OO(materialToolbar, o00oo.o00oOOo0(new byte[]{-55, -55, 94, 82, -32, oo0OOoo.f13516o00oOoO, 35, 97, -42, -50, 92, Ascii.VT, -42, 59, 34, 105, -35, -63, 73, 105, -61, 45, 34, 112, -53, -114, 79, 74, -51, 56, 47, 100, -51}, new byte[]{-65, -96, 59, 37, -94, 84, 77, 5}));
        BaseActivity.o0O0O0Oo(this, materialToolbar, R.string.app_name, false, null, 12, null);
        o0O0OoO0();
        o0O0Oo0O();
        o0O0Oo();
        this.f6736o0O0000o = this;
        oOo00o0o.o00oOo0O(this);
        AppCompatActivity appCompatActivity = null;
        if (o0O0oo00.o00oOOo0().o00oOooO()) {
            AppCompatActivity appCompatActivity2 = this.f6736o0O0000o;
            if (appCompatActivity2 == null) {
                o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{113, 1, -101, 39, -81, 98, 17, -3, 101}, new byte[]{Ascii.FS, SignedBytes.MAX_POWER_OF_TWO, -8, 83, -58, Ascii.DC4, 120, -119}));
            } else {
                appCompatActivity = appCompatActivity2;
            }
            AboutActivity.o0O0O0oO(appCompatActivity);
        } else if (ooOOO0Oo.o00oOo00()) {
            AppCompatActivity appCompatActivity3 = this.f6736o0O0000o;
            if (appCompatActivity3 == null) {
                o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-59, 43, -112, -110, -77, 49, -27, Ascii.FS, -47}, new byte[]{-88, 106, -13, -26, -38, 71, -116, 104}));
            } else {
                appCompatActivity = appCompatActivity3;
            }
            o0O00O0o.o00oOoO(appCompatActivity);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@Nullable Menu menu) {
        MenuItem findItem;
        MenuItem findItem2;
        MenuItem findItem3;
        getMenuInflater().inflate(R.menu.menu_main, menu);
        if (ooOOO0Oo.o00oOOo0()) {
            if (menu != null && (findItem3 = menu.findItem(R.id.vc_setting)) != null) {
                findItem3.setVisible(false);
            }
            if (menu != null && (findItem2 = menu.findItem(R.id.vc_github)) != null) {
                findItem2.setVisible(false);
            }
            if (menu == null || (findItem = menu.findItem(R.id.switch_version)) == null) {
                return true;
            }
            findItem.setVisible(false);
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x06b3 A[Catch: all -> 0x0748, TryCatch #0 {all -> 0x0748, blocks: (B:62:0x0156, B:64:0x0178, B:65:0x0284, B:69:0x040b, B:71:0x06b3, B:73:0x0703, B:66:0x028d, B:68:0x0293), top: B:91:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0702  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull android.view.MenuItem r28) {
        /*
            Method dump skipped, instructions count: 2076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: multispace.multiapp.clone.view.main.MainActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(@Nullable Menu menu) {
        MenuItem findItem;
        String o00oOOo02;
        if (ooOOO0Oo.o00oOo00()) {
            if (o0OOoo0O.oO0Ooooo.o00oOOo0()) {
                if (menu != null && (findItem = menu.findItem(R.id.switch_version)) != null) {
                    o00oOOo02 = o00oo.o00oOOo0(new byte[]{43, -96, 83, 124, 38, -4, -3, -16, Ascii.ETB, -9, 116, 103, 55, -7, -68, -24}, new byte[]{120, -41, 58, 8, 69, -108, -35, -124});
                    findItem.setTitle(o00oOOo02);
                }
            } else if (menu != null && (findItem = menu.findItem(R.id.switch_version)) != null) {
                o00oOOo02 = o00oo.o00oOOo0(new byte[]{65, -46, Ascii.ETB, 80, -102, 125, 82, -80, 125, -123, 46, 86, -106}, new byte[]{Ascii.DC2, -91, 126, 36, -7, Ascii.NAK, 114, -60});
                findItem.setTitle(o00oOOo02);
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public final boolean oo0OOoo() {
        if (o0O0Oo0().fab.getVisibility() == 0) {
            if (o0O0Oo0().fab.getAlpha() == 1.0f) {
                return true;
            }
        }
        return false;
    }
}
