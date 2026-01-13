package multispace.multiapp.clone.view.pro.xpsetting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import multispace.multiapp.clone.view.base.BaseActivity;
import multispace.multiapp.clone.view.base.LoadingActivity;
import multispace.multiapp.clone.view.pro.xpsetting.XpSettingActivity;
import o0O000oo.o0OO0;
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
import o0OOooo.o0O00OOO;
import o0Oo0oo0.o0OO0o00;
import o0oOoo00.o0O000o0;
import o0oOoo00.o0OoOoOo;
import o0ooO0O0.oO0O0O0;
import o0ooO0O0.oO0Oo0o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import virtual.camera.app.R;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lmultispace/multiapp/clone/view/pro/xpsetting/XpSettingActivity;", "Lmultispace/multiapp/clone/view/base/LoadingActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lo0OO0o/oO0Ooooo;", "onCreate", "onResume", "onDestroy", "o0O0OOo", "o0O0OOOo", "o0O0OOO", "Lo0OOoo0/o0O000o0;", "o00ooooo", "Lo0OO0o/o0oO0Ooo;", "o0O0OOO0", "()Lo0OOoo0/o0O000o0;", "viewBinding", "Lo0oOoo00/o0O000o0;", "o0", "Lo0oOoo00/o0O000o0;", "viewModel", "Lo0O0o0oo/o0OooO0;", "Lo0OOoOO/o00ooO0;", "o0O00000", "Lo0O0o0oo/o0OooO0;", "mAdapter", "", "o0O0000O", "Ljava/lang/String;", "mXpModulePkg", "<init>", "()V", "o0O0000o", "o00oOOo0", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class XpSettingActivity extends LoadingActivity {
    @NotNull

    /* renamed from: o0O0000o  reason: collision with root package name */
    public static final o00oOOo0 f6795o0O0000o = new o00oOOo0(null);

    /* renamed from: o0  reason: collision with root package name */
    public o0O000o0 f6796o0;

    /* renamed from: o0O00000  reason: collision with root package name */
    public o0OooO0<o00ooO0> f6798o0O00000;
    @NotNull

    /* renamed from: o00ooooo  reason: collision with root package name */
    public final o0oO0Ooo f6797o00ooooo = o0O00oO0.o00oOo00(new o00oOo00(this));
    @Nullable

    /* renamed from: o0O0000O  reason: collision with root package name */
    public String f6799o0O0000O = "";

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lmultispace/multiapp/clone/view/pro/xpsetting/XpSettingActivity$o00oOOo0;", "", "Landroid/content/Context;", "context", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "<init>", "()V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        public final void o00oOOo0(@NotNull Context context) {
            o0ooO.o00oo0O0(context, o00oo.o00oOOo0(new byte[]{96, 56, -108, 66, 62, -126, 125}, new byte[]{3, 87, -6, 54, 91, -6, 9, 43}));
            context.startActivity(new Intent(context, XpSettingActivity.class));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/view/View;", "view", "Lo0OOoOO/o00ooO0;", "item", "", "position", "Lo0OO0o/oO0Ooooo;", "invoke", "(Landroid/view/View;Lo0OOoOO/o00ooO0;I)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0O0OO implements o0O0000O<View, o00ooO0, Integer, oO0Ooooo> {
        public o00oOOoO() {
            super(3);
        }

        @Override // o0OOOO.o0O0000O
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(View view, o00ooO0 o00ooo02, Integer num) {
            invoke(view, o00ooo02, num.intValue());
            return oO0Ooooo.f13240o00oOOo0;
        }

        public final void invoke(@NotNull View view, @NotNull o00ooO0 o00ooo02, int i) {
            o0ooO.o00oo0O0(view, o00oo.o00oOOo0(new byte[]{-36, Ascii.SYN, -3, 96}, new byte[]{-86, Byte.MAX_VALUE, -104, Ascii.ETB, -71, -45, Ascii.SO, -93}));
            o0ooO.o00oo0O0(o00ooo02, o00oo.o00oOOo0(new byte[]{55, 95, 9, Ascii.EM}, new byte[]{94, 43, 108, 116, -23, 3, Ascii.NAK, -28}));
            RecyclerView recyclerView = XpSettingActivity.this.o0O0OOO0().recyclerView;
            o0ooO.o00oo0OO(recyclerView, o00oo.o00oOOo0(new byte[]{53, 4, 56, 53, 42, 71, 94, Ascii.ETB, 42, 3, 58, 108, Ascii.SUB, 75, 83, 10, 32, 1, 56, 48, 62, 71, 85, 4}, new byte[]{67, 109, 93, 66, 104, 46, 48, 115}));
            View findViewById = o0OO0.o00oOooO(recyclerView, i).findViewById(R.id.enable);
            o0ooO.o00oo0OO(findViewById, o00oo.o00oOOo0(new byte[]{0, 114, -104, -44, -114, -6, -59, -18, Ascii.US, 117, -102, -115, -66, -10, -56, -13, Ascii.NAK, 119, -104, -47, -102, -6, -50, -3, -108, -101, 91, -59, -91, -3, -49, -36, Ascii.US, 126, -118, -31, -75, -38, -49, -94, 36, 53, -108, -57, -30, -10, -59, -21, Ascii.DC4, 119, -104, -118}, new byte[]{118, Ascii.ESC, -3, -93, -52, -109, -85, -118}));
            CheckBox checkBox = (CheckBox) findViewById;
            checkBox.setChecked(!checkBox.isChecked());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo0O0OoO0/o00oOo00;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "invoke", "()Lo0O0OoO0/o00oOo00;", "o0ooO0O0/oO0o0000$o00oOOo0", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0O0OO implements o0OOOO.o00oOOo0<o0OOoo0.o0O000o0> {
        public final /* synthetic */ Activity $this_inflate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(Activity activity) {
            super(0);
            this.$this_inflate = activity;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final o0OOoo0.o0O000o0 invoke() {
            LayoutInflater layoutInflater = this.$this_inflate.getLayoutInflater();
            o0ooO.o00oo0OO(layoutInflater, o00oo.o00oOOo0(new byte[]{39, -17, -110, 70, SignedBytes.MAX_POWER_OF_TWO, 52, 35, 108, 45, -30, -118, 93, 80, 50}, new byte[]{75, -114, -21, 41, 53, SignedBytes.MAX_POWER_OF_TWO, 106, 2}));
            Object invoke = o0OOoo0.o0O000o0.class.getMethod(o00oo.o00oOOo0(new byte[]{39, -127, -4, -84, -54, Ascii.FS, 84}, new byte[]{78, -17, -102, -64, -85, 104, 49, 91}), LayoutInflater.class).invoke(null, layoutInflater);
            if (invoke != null) {
                return (o0OOoo0.o0O000o0) invoke;
            }
            throw new NullPointerException(o00oo.o00oOOo0(new byte[]{108, 95, 97, -49, 7, -81, -6, 72, 108, 69, 121, -125, 69, -87, -69, 69, 99, 89, 121, -125, 83, -93, -69, 72, 109, 68, 32, -51, 82, -96, -9, 6, 118, 83, 125, -58, 7, -95, -18, 74, 118, 67, 126, -45, 70, -81, -2, 8, 111, 95, 97, -41, 78, -83, -21, 86, 44, 73, 97, -52, 73, -87, -75, 66, 99, 94, 108, -63, 78, -94, -1, 79, 108, 77, 35, -30, 68, -72, -14, 80, 107, 94, 116, -5, 87, -114, -14, 72, 102, 67, 99, -60}, new byte[]{2, 42, Ascii.CR, -93, 39, -52, -101, 38}));
        }
    }

    public static final void o0O0OOoO(XpSettingActivity xpSettingActivity, List list) {
        o0ooO.o00oo0O0(xpSettingActivity, o00oo.o00oOOo0(new byte[]{48, 92, 98, 35, -40, 107}, new byte[]{68, 52, Ascii.VT, 80, -4, 91, -51, 0}));
        if (list == null || list.isEmpty()) {
            xpSettingActivity.o0O0OOO0().stateView.showEmpty();
            return;
        }
        o0OooO0<o00ooO0> o0oooo0 = xpSettingActivity.f6798o0O00000;
        if (o0oooo0 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{Byte.MAX_VALUE, 110, -56, 34, 60, -124, -53, -111}, new byte[]{Ascii.DC2, 47, -84, 67, 76, -16, -82, -29}));
            o0oooo0 = null;
        }
        o0OooO0.o0O0O0oO(o0oooo0, list, false, false, 6, null);
        xpSettingActivity.o0O0OOO0().stateView.showContent();
    }

    public static final void o0O0OOoo(XpSettingActivity xpSettingActivity, View view) {
        o0ooO.o00oo0O0(xpSettingActivity, o00oo.o00oOOo0(new byte[]{-96, -106, 77, 79, 62, 78}, new byte[]{-44, -2, 36, 60, Ascii.SUB, 126, -80, Ascii.SO}));
        HashSet<String> hashSet = new HashSet<>();
        o0O000o0 o0o000o0 = xpSettingActivity.f6796o0;
        if (o0o000o0 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-72, 106, -88, 102, -23, 70, 69, -46, -94}, new byte[]{-50, 3, -51, 17, -92, 41, o0OO0o00.f16655o00oOoOO, -73}));
            o0o000o0 = null;
        }
        List<o00ooO0> o00oOo0o2 = o0o000o0.getAppsLiveData().o00oOo0o();
        if (o00oOo0o2 != null) {
            for (o00ooO0 o00ooo02 : o00oOo0o2) {
                if (o00ooo02.f14889o00oOo0O) {
                    hashSet.add(o00ooo02.f14888o00oOo00);
                }
            }
        }
        o0O00OOO.o00oOo00().o00oOooo(xpSettingActivity.f6799o0O0000O, hashSet);
        oO0Oo0o0.o00oOoO(o00oo.o00oOOo0(new byte[]{Ascii.DC2, -103, 51, Ascii.ETB, Ascii.RS}, new byte[]{97, -8, 69, 114, 62, 117, -110, 91}) + hashSet.size() + o00oo.o00oOOo0(new byte[]{102, -46, 6, 121, -16, 93, Ascii.ESC, 120, 40, -42, 88}, new byte[]{70, -77, 118, 9, -125, 125, Byte.MAX_VALUE, Ascii.ETB}));
        o00oo.o00oOOo0(new byte[]{-97, -76, -83, -97, 3}, new byte[]{-82, -123, -100, -82, 50, -62, 2, -84});
        o00oo.o00oOOo0(new byte[]{-107, -51, 118, 17, 10}, new byte[]{-26, -84, 0, 116, 42, 121, 48, Ascii.SUB});
        hashSet.size();
        o00oo.o00oOOo0(new byte[]{-18, 57, -82, 110, -83, -72, 82, -26, -96, oo0OOoo.f13516o00oOoO, -16}, new byte[]{-50, 88, -34, Ascii.RS, -34, -104, 54, -119});
    }

    public final void o0O0OOO() {
        o0O0OOO0().fab.setVisibility(8);
    }

    public final o0OOoo0.o0O000o0 o0O0OOO0() {
        return (o0OOoo0.o0O000o0) this.f6797o00ooooo.getValue();
    }

    public final void o0O0OOOo() {
        o0OooO0 o0oooo0 = new o0OooO0(this, new o0OoOoOo());
        RecyclerView recyclerView = o0O0OOO0().recyclerView;
        o0ooO.o00oo0OO(recyclerView, o00oo.o00oOOo0(new byte[]{-16, 10, -24, -45, 45, -78, 109, 35, -17, Ascii.CR, -22, -118, Ascii.GS, -66, 96, 62, -27, Ascii.SI, -24, -42, 57, -78, 102, 48}, new byte[]{-122, 99, -115, -92, 111, -37, 3, 71}));
        this.f6798o0O00000 = o0oooo0.o00ooOo(recyclerView).o0O0O0Oo(new o00oOOoO());
        o0O0OOO0().recyclerView.setLayoutManager(new LinearLayoutManager(this));
        o0O0OOO0().stateView.showEmpty();
    }

    public final void o0O0OOo() {
        o0O0OOO0().stateView.showLoading();
        o0O000o0 o0o000o0 = this.f6796o0;
        o0O000o0 o0o000o02 = null;
        if (o0o000o0 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{60, 100, -21, 36, 126, -47, 42, -100, 38}, new byte[]{74, Ascii.CR, -114, 83, 51, -66, 78, -7}));
            o0o000o0 = null;
        }
        o0o000o0.getAllVmInstallList(this.f6799o0O0000O, 1);
        o0O000o0 o0o000o03 = this.f6796o0;
        if (o0o000o03 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-87, Ascii.DLE, -112, -75, 55, -98, -28, oo0OOoo.f13516o00oOoO, -77}, new byte[]{-33, 121, -11, -62, 122, -15, Byte.MIN_VALUE, 88}));
        } else {
            o0o000o02 = o0o000o03;
        }
        o0o000o02.getAppsLiveData().o00oOoo0(this, new androidx.lifecycle.o0OooO0() { // from class: o0oOoo00.o0O0000O
            @Override // androidx.lifecycle.o0OooO0
            public final void onChanged(Object obj) {
                XpSettingActivity.o0O0OOoO(XpSettingActivity.this, (List) obj);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o0O0OOO0().getRoot());
        MaterialToolbar materialToolbar = o0O0OOO0().toolbarLayout.toolbar;
        o0ooO.o00oo0OO(materialToolbar, o00oo.o00oOOo0(new byte[]{-101, -126, 124, -31, -26, -37, 81, -98, -124, -123, 126, -72, -48, -35, 80, -106, -113, -118, 107, -38, -59, -53, 80, -113, -103, -59, 109, -7, -53, -34, 93, -101, -97}, new byte[]{-19, -21, Ascii.EM, -106, -92, -78, 63, -6}));
        BaseActivity.o0O0O0Oo(this, materialToolbar, R.string.xp_module_setting, true, null, 8, null);
        o0O0OOO0().btnApply.setVisibility(0);
        o0O0OOO0().btnApply.setOnClickListener(new View.OnClickListener() { // from class: o0oOoo00.o0O000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XpSettingActivity.o0O0OOoo(XpSettingActivity.this, view);
            }
        });
        oO0O0O0.f17114o00oOOo0.getClass();
        this.f6796o0 = new o0O000o0(oO0O0O0.f17118o00oOo0o);
        this.f6799o0O0000O = getIntent().getStringExtra(o00oo.o00oOOo0(new byte[]{Ascii.CR, -90, 57, -17, 56, -90, 52, 71, 42, -90, 63, -25}, new byte[]{117, -42, 84, Byte.MIN_VALUE, 92, -45, 88, 34}));
        o0O0OOOo();
        o0O0OOO();
        o0O0OOo();
        if (TextUtils.isEmpty(this.f6799o0O0000O)) {
            oO0Oo0o0.o00oOoO(o00oo.o00oOOo0(new byte[]{58, 99, -99, -75, -126, 17, -28, 86, Ascii.CR, 119, -121, -86, -126, 85, -76, 122, 1, 120, -109, -95, -126, 85, -86, 122, Ascii.SI, 118, -46, -81, -108, 85, -86, 110, Ascii.SO, Byte.MAX_VALUE, -36}, new byte[]{98, 19, -14, -58, -25, 117, -60, Ascii.ESC}));
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        o0O000o0 o0o000o0 = this.f6796o0;
        o0O000o0 o0o000o02 = null;
        if (o0o000o0 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-123, -31, -22, -1, 44, -42, -20, -53, -97}, new byte[]{-13, -120, -113, -120, 97, -71, -120, -82}));
            o0o000o0 = null;
        }
        o0o000o0.getAppsLiveData().o00oo0Oo(null);
        o0O000o0 o0o000o03 = this.f6796o0;
        if (o0o000o03 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{17, 74, -48, 94, 76, 55, -38, 70, Ascii.VT}, new byte[]{103, 35, -75, 41, 1, 88, -66, 35}));
        } else {
            o0o000o02 = o0o000o03;
        }
        o0o000o02.getAppsLiveData().o00oo0O(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        o0OooO0<o00ooO0> o0oooo0 = this.f6798o0O00000;
        if (o0oooo0 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-85, -11, 96, 82, -100, -97, Ascii.SI, 117}, new byte[]{-58, -76, 4, 51, -20, -21, 106, 7}));
            o0oooo0 = null;
        }
        o0oooo0.notifyDataSetChanged();
    }
}
