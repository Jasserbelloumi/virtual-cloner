package multispace.multiapp.clone.view.pro.location;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.List;
import kotlin.Metadata;
import multispace.multiapp.clone.view.base.BaseActivity;
import multispace.multiapp.clone.view.base.LoadingActivity;
import multispace.multiapp.clone.view.pro.location.LocationSettingActivity;
import multispace.multiapp.clone.view.pro.location.map.MapActivity;
import o0O0o0oo.o0OooO0;
import o0OO0o.o0O00oO0;
import o0OO0o.o0oO0Ooo;
import o0OO0o.oO0Ooooo;
import o0OOO0oo.oo0OOoo;
import o0OOOO.o0O0000O;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import o0OOoOO.o00ooO0;
import o0Oo0oo0.o0OO0o00;
import o0oOo000.o00oo00O;
import o0oOoo00.o0O000o0;
import o0ooO0O0.oO0O0O0;
import o0ooO0O0.oO0Oo0o0;
import oo0oO0.o00oOoO;
import oo0oO0.o0O00OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import virtual.camera.app.R;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lmultispace/multiapp/clone/view/pro/location/LocationSettingActivity;", "Lmultispace/multiapp/clone/view/base/LoadingActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lo0OO0o/oO0Ooooo;", "onCreate", "onResume", "onDestroy", "o0O0OOo", "o0O0OOOo", "o0O0OOO", "Lo0OOoOO/o00ooO0;", "item", "o0O0OOO0", "Lo0OOoo0/o0O000o0;", "o00ooooo", "Lo0OO0o/o0oO0Ooo;", "o0O0OO", "()Lo0OOoo0/o0O000o0;", "viewBinding", "Lo0oOoo00/o0O000o0;", "o0", "Lo0oOoo00/o0O000o0;", "viewModel", "Lo0O0o0oo/o0OooO0;", "o0O00000", "Lo0O0o0oo/o0OooO0;", "mAdapter", "<init>", "()V", "o0O0000O", "o00oOOo0", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class LocationSettingActivity extends LoadingActivity {
    @NotNull

    /* renamed from: o0O0000O  reason: collision with root package name */
    public static final o00oOOo0 f6757o0O0000O = new o00oOOo0(null);

    /* renamed from: o0  reason: collision with root package name */
    public o0O000o0 f6758o0;
    @NotNull

    /* renamed from: o00ooooo  reason: collision with root package name */
    public final o0oO0Ooo f6759o00ooooo = o0O00oO0.o00oOo00(new o00oOo0O(this));

    /* renamed from: o0O00000  reason: collision with root package name */
    public o0OooO0<o00ooO0> f6760o0O00000;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lmultispace/multiapp/clone/view/pro/location/LocationSettingActivity$o00oOOo0;", "", "Landroid/content/Context;", "context", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "<init>", "()V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        public final void o00oOOo0(@NotNull Context context) {
            o0ooO.o00oo0O0(context, o00oo.o00oOOo0(new byte[]{-50, 9, 40, 115, -89, 71, Ascii.DC2}, new byte[]{-83, 102, 70, 7, -62, 63, 102, 122}));
            context.startActivity(new Intent(context, LocationSettingActivity.class));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"multispace/multiapp/clone/view/pro/location/LocationSettingActivity$o00oOOoO", "Loo0oO0/o00oOoO;", "", "", "permissions", "", "allGranted", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "", "doNotAskAgain", "o00oOOo0", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO implements o00oOoO {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ o00ooO0 f6762o00oOOoO;

        public o00oOOoO(o00ooO0 o00ooo02) {
            this.f6762o00oOOoO = o00ooo02;
        }

        @Override // oo0oO0.o00oOoO
        public void o00oOOo0(@NotNull List<String> list, boolean z) {
            o0ooO.o00oo0O0(list, o00oo.o00oOOo0(new byte[]{123, 94, -115, 57, 7, 117, 86, -56, 100, 85, -116}, new byte[]{Ascii.VT, 59, -1, 84, 110, 6, 37, -95}));
            oO0Oo0o0.o00oOOoO(R.string.permission_content);
        }

        @Override // oo0oO0.o00oOoO
        public void o00oOOoO(@NotNull List<String> list, boolean z) {
            o0ooO.o00oo0O0(list, o00oo.o00oOOo0(new byte[]{102, 59, 100, -8, 66, -29, 9, -24, 121, 48, 101}, new byte[]{Ascii.SYN, 94, Ascii.SYN, -107, 43, -112, 122, -127}));
            Intent intent = new Intent(LocationSettingActivity.this, MapActivity.class);
            intent.putExtra(o00oo.o00oOOo0(new byte[]{-57, 91, -38, -98, -77, -62, 59}, new byte[]{-90, 43, -86, -63, -61, -87, 92, -59}), this.f6762o00oOOoO.f14888o00oOo00);
            LocationSettingActivity.this.startActivity(intent);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/view/View;", "view", "Lo0OOoOO/o00ooO0;", "item", "", "position", "Lo0OO0o/oO0Ooooo;", "invoke", "(Landroid/view/View;Lo0OOoOO/o00ooO0;I)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0O0OO implements o0O0000O<View, o00ooO0, Integer, oO0Ooooo> {
        public o00oOo00() {
            super(3);
        }

        @Override // o0OOOO.o0O0000O
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(View view, o00ooO0 o00ooo02, Integer num) {
            invoke(view, o00ooo02, num.intValue());
            return oO0Ooooo.f13240o00oOOo0;
        }

        public final void invoke(@NotNull View view, @NotNull o00ooO0 o00ooo02, int i) {
            o0ooO.o00oo0O0(view, o00oo.o00oOOo0(new byte[]{-25, -54, 125, -40}, new byte[]{-111, -93, Ascii.CAN, -81, -103, 79, 121, -78}));
            o0ooO.o00oo0O0(o00ooo02, o00oo.o00oOOo0(new byte[]{-64, Ascii.SI, -100, -113}, new byte[]{-87, 123, -7, -30, 7, 109, 122, 92}));
            LocationSettingActivity.this.o0O0OOO0(o00ooo02);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo0O0OoO0/o00oOo00;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "invoke", "()Lo0O0OoO0/o00oOo00;", "o0ooO0O0/oO0o0000$o00oOOo0", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0O0OO implements o0OOOO.o00oOOo0<o0OOoo0.o0O000o0> {
        public final /* synthetic */ Activity $this_inflate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo0O(Activity activity) {
            super(0);
            this.$this_inflate = activity;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final o0OOoo0.o0O000o0 invoke() {
            LayoutInflater layoutInflater = this.$this_inflate.getLayoutInflater();
            o0ooO.o00oo0OO(layoutInflater, o00oo.o00oOOo0(new byte[]{122, -48, Ascii.GS, 36, -125, 112, 102, 38, 112, -35, 5, 63, -109, 118}, new byte[]{Ascii.SYN, -79, 100, 75, -10, 4, 47, 72}));
            Object invoke = o0OOoo0.o0O000o0.class.getMethod(o00oo.o00oOOo0(new byte[]{36, -60, 34, -78, 68, -43, 7}, new byte[]{77, -86, 68, -34, 37, -95, 98, 72}), LayoutInflater.class).invoke(null, layoutInflater);
            if (invoke != null) {
                return (o0OOoo0.o0O000o0) invoke;
            }
            throw new NullPointerException(o00oo.o00oOOo0(new byte[]{104, 38, 59, 118, -120, -86, -6, -50, 104, 60, 35, 58, -54, -84, -69, -61, 103, 32, 35, 58, -36, -90, -69, -50, 105, oo0OOoo.f13516o00oOoO, 122, 116, -35, -91, -9, Byte.MIN_VALUE, 114, 42, 39, Byte.MAX_VALUE, -120, -92, -18, -52, 114, 58, 36, 106, -55, -86, -2, -114, 107, 38, 59, 110, -63, -88, -21, -48, 40, 48, 59, 117, -58, -84, -75, -60, 103, 39, 54, 120, -63, -89, -1, -55, 104, 52, 121, 91, -53, -67, -14, -42, 111, 39, 46, 66, -40, -117, -14, -50, 98, 58, 57, 125}, new byte[]{6, 83, 87, Ascii.SUB, -88, -55, -101, -96}));
        }
    }

    public static final void o0O0OOoO(LocationSettingActivity locationSettingActivity, List list) {
        o0ooO.o00oo0O0(locationSettingActivity, o00oo.o00oOOo0(new byte[]{119, -17, 100, -12, -33, -66}, new byte[]{3, -121, Ascii.CR, -121, -5, -114, 109, 92}));
        if (list == null || list.isEmpty()) {
            locationSettingActivity.o0O0OO().stateView.showEmpty();
            return;
        }
        o0OooO0<o00ooO0> o0oooo0 = locationSettingActivity.f6760o0O00000;
        if (o0oooo0 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-55, -39, -96, -33, 106, -40, -39, 44}, new byte[]{-92, -104, -60, -66, Ascii.SUB, -84, -68, 94}));
            o0oooo0 = null;
        }
        o0OooO0.o0O0O0oO(o0oooo0, list, false, false, 6, null);
        locationSettingActivity.o0O0OO().stateView.showContent();
    }

    public final o0OOoo0.o0O000o0 o0O0OO() {
        return (o0OOoo0.o0O000o0) this.f6759o00ooooo.getValue();
    }

    public final void o0O0OOO() {
        o0O0OO().fab.setVisibility(8);
    }

    public final void o0O0OOO0(o00ooO0 o00ooo02) {
        new o0O00OO(this).o00oo0O(o00oo.o00oOOo0(new byte[]{-26, 52, -68, -87, 78, -21, 91, -101, -9, 63, -86, -74, 72, -15, 76, -36, -24, 52, -10, -102, 98, -63, 122, -26, -44, 5, -98, -110, 111, -57, 96, -7, -56, Ascii.EM, -103, -113, 104, -51, 113}, new byte[]{-121, 90, -40, -37, o0OO0o00.f16655o00oOoOO, -126, 63, -75})).o00oo0o0(new o00oOOoO(o00ooo02));
    }

    public final void o0O0OOOo() {
        o0OooO0 o0oooo0 = new o0OooO0(this, new o00oo00O());
        RecyclerView recyclerView = o0O0OO().recyclerView;
        o0ooO.o00oo0OO(recyclerView, o00oo.o00oOOo0(new byte[]{-126, SignedBytes.MAX_POWER_OF_TWO, 49, 92, -115, -121, -54, -69, -99, 71, 51, 5, -67, -117, -57, -90, -105, 69, 49, 89, -103, -121, -63, -88}, new byte[]{-12, 41, 84, 43, -49, -18, -92, -33}));
        this.f6760o0O00000 = o0oooo0.o00ooOo(recyclerView).o0O0O0Oo(new o00oOo00());
        o0O0OO().recyclerView.setLayoutManager(new LinearLayoutManager(this));
        o0O0OO().stateView.showEmpty();
    }

    public final void o0O0OOo() {
        o0O0OO().stateView.showLoading();
        o0O000o0 o0o000o0 = this.f6758o0;
        o0O000o0 o0o000o02 = null;
        if (o0o000o0 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{9, 50, -83, -51, 114, -43, 58, -38, 19}, new byte[]{Byte.MAX_VALUE, 91, -56, -70, 63, -70, 94, -65}));
            o0o000o0 = null;
        }
        o0o000o0.getAllVmInstallList("", 2);
        o0O000o0 o0o000o03 = this.f6758o0;
        if (o0o000o03 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-94, -106, Ascii.ETB, -4, 62, -67, -105, -16, -72}, new byte[]{-44, -1, 114, -117, 115, -46, -13, -107}));
        } else {
            o0o000o02 = o0o000o03;
        }
        o0o000o02.getAppsLiveData().o00oOoo0(this, new androidx.lifecycle.o0OooO0() { // from class: o0oOo000.o00oOo0O
            @Override // androidx.lifecycle.o0OooO0
            public final void onChanged(Object obj) {
                LocationSettingActivity.o0O0OOoO(LocationSettingActivity.this, (List) obj);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o0O0OO().getRoot());
        MaterialToolbar materialToolbar = o0O0OO().toolbarLayout.toolbar;
        o0ooO.o00oo0OO(materialToolbar, o00oo.o00oOOo0(new byte[]{-28, 44, -109, 81, 6, -65, 41, 97, -5, 43, -111, 8, 48, -71, 40, 105, -16, 36, -124, 106, 37, -81, 40, 112, -26, 107, -126, 73, 43, -70, 37, 100, -32}, new byte[]{-110, 69, -10, 38, 68, -42, 71, 5}));
        BaseActivity.o0O0O0Oo(this, materialToolbar, R.string.location_manager, true, null, 8, null);
        oO0O0O0.f17114o00oOOo0.getClass();
        this.f6758o0 = new o0O000o0(oO0O0O0.f17118o00oOo0o);
        o0O0OOOo();
        o0O0OOO();
        o0O0OOo();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        o0O000o0 o0o000o0 = this.f6758o0;
        o0O000o0 o0o000o02 = null;
        if (o0o000o0 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-56, -121, 0, -79, Ascii.SYN, -75, 58, -104, -46}, new byte[]{-66, -18, 101, -58, 91, -38, 94, -3}));
            o0o000o0 = null;
        }
        o0o000o0.getAppsLiveData().o00oo0Oo(null);
        o0O000o0 o0o000o03 = this.f6758o0;
        if (o0o000o03 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-98, 100, 119, -123, 82, -49, 103, -86, -124}, new byte[]{-24, Ascii.CR, Ascii.DC2, -14, Ascii.US, -96, 3, -49}));
        } else {
            o0o000o02 = o0o000o03;
        }
        o0o000o02.getAppsLiveData().o00oo0O(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        o0OooO0<o00ooO0> o0oooo0 = this.f6760o0O00000;
        if (o0oooo0 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{83, -94, 99, -27, -66, -112, -102, -104}, new byte[]{62, -29, 7, -124, -50, -28, -1, -22}));
            o0oooo0 = null;
        }
        o0oooo0.notifyDataSetChanged();
    }
}
