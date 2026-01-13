package multispace.multiapp.clone.view.list;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.result.o00oo0OO;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ferfalk.simplesearchview.SimpleSearchView;
import com.github.nukc.stateview.StateView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import multispace.multiapp.clone.view.base.BaseActivity;
import multispace.multiapp.clone.view.list.ListActivity;
import o00oOo00.o00oOOoO;
import o00oOoOo.o00ooO0;
import o0O0o0oo.o0OooO0;
import o0OO0o.o0O00oO0;
import o0OO0o.o0oO0Ooo;
import o0OO0o.oO0Ooooo;
import o0OOO0oo.oo0OOoo;
import o0OOOO.o0O0000O;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import o0OOOoo0.oO0O0;
import o0OOoO0.o00oo;
import o0OOoOO.o0O000;
import o0OOoo0.o0O00000;
import o0Oo00oo.o0O000o0;
import o0Oo0OO.o;
import o0Oo0OO.o0oo0000;
import o0Oo0oo0.o0OO0o00;
import o0ooO0O0.oO0O0O0;
import o0ooO0O0.oOo00o0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import virtual.camera.app.R;
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 02\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b.\u0010/J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0014J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0011H\u0002R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010-\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u00110\u00110)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00062"}, d2 = {"Lmultispace/multiapp/clone/view/list/ListActivity;", "Lmultispace/multiapp/clone/view/base/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lo0OO0o/oO0Ooooo;", "onCreate", "onBackPressed", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "Landroid/view/Menu;", o00ooO0.f7024o00oOo0o, "onCreateOptionsMenu", "onStop", "o0O0OOO", "o0O0OOOo", "", "newText", "o0O0OO0O", FirebaseAnalytics.Param.SOURCE, "o0O0OO", "Lo0OOoo0/o0O00000;", "o00ooooO", "Lo0OO0o/o0oO0Ooo;", "o0O0OOO0", "()Lo0OOoo0/o0O00000;", "viewBinding", "Lo0O0o0oo/o0OooO0;", "Lo0OOoOO/o0O000;", "o00ooooo", "Lo0O0o0oo/o0OooO0;", "mAdapter", "Lo0Oo0OO/o;", "o0", "Lo0Oo0OO/o;", "viewModel", "", "o0O00000", "Ljava/util/List;", "appList", "Landroidx/activity/result/o00oo0OO;", "kotlin.jvm.PlatformType", "o0O0000O", "Landroidx/activity/result/o00oo0OO;", "openDocumentedResult", "<init>", "()V", "o0O0000o", "o00oOOo0", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class ListActivity extends BaseActivity {
    @NotNull

    /* renamed from: o0O0000o  reason: collision with root package name */
    public static final o00oOOo0 f6723o0O0000o = new o00oOOo0(null);

    /* renamed from: o0  reason: collision with root package name */
    public o f6724o0;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public o0OooO0<o0O000> f6726o00ooooo;
    @NotNull

    /* renamed from: o0O0000O  reason: collision with root package name */
    public final o00oo0OO<String> f6728o0O0000O;
    @NotNull

    /* renamed from: o00ooooO  reason: collision with root package name */
    public final o0oO0Ooo f6725o00ooooO = o0O00oO0.o00oOo00(new o00oOo0O(this));
    @NotNull

    /* renamed from: o0O00000  reason: collision with root package name */
    public List<o0O000> f6727o0O00000 = new ArrayList();

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lmultispace/multiapp/clone/view/list/ListActivity$o00oOOo0;", "", "Landroid/content/Context;", "context", "", "onlyShowXp", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "<init>", "()V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        public final void o00oOOo0(@NotNull Context context, boolean z) {
            o0ooO.o00oo0O0(context, o00oo.o00oOOo0(new byte[]{-17, -49, 112, 57, Ascii.FS, -73, 68}, new byte[]{-116, -96, Ascii.RS, 77, 121, -49, 48, -41}));
            Intent intent = new Intent(context, ListActivity.class);
            intent.putExtra(o00oo.o00oOOo0(new byte[]{47, 40, -83, -37, 87, 114, 83, 53, Ascii.CAN, 54}, new byte[]{SignedBytes.MAX_POWER_OF_TWO, 70, -63, -94, 4, Ascii.SUB, 60, 66}), z);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"multispace/multiapp/clone/view/list/ListActivity$o00oOOoO", "Lcom/ferfalk/simplesearchview/SimpleSearchView$o00oOOoO;", "", "newText", "", "o00oOOo0", "o00oOo00", SearchIntents.EXTRA_QUERY, o0OO000o.o00oOOoO.f12961o00oOo00, "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO implements SimpleSearchView.o00oOOoO {
        public o00oOOoO() {
        }

        @Override // com.ferfalk.simplesearchview.SimpleSearchView.o00oOOoO
        public boolean o00oOOo0(@NotNull String str) {
            o0ooO.o00oo0O0(str, o00oo.o00oOOo0(new byte[]{87, -64, 119, -55, 35, -3, -54}, new byte[]{57, -91, 0, -99, 70, -123, -66, 85}));
            ListActivity.this.o0O0OO0O(str);
            return true;
        }

        @Override // com.ferfalk.simplesearchview.SimpleSearchView.o00oOOoO
        public boolean o00oOOoO(@NotNull String str) {
            o0ooO.o00oo0O0(str, o00oo.o00oOOo0(new byte[]{-54, 99, -112, -21, 75}, new byte[]{-69, Ascii.SYN, -11, -103, 50, 123, 7, 78}));
            return true;
        }

        @Override // com.ferfalk.simplesearchview.SimpleSearchView.o00oOOoO
        public boolean o00oOo00() {
            return true;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "Lo0OOoOO/o0O000;", "item", "", "<anonymous parameter 2>", "Lo0OO0o/oO0Ooooo;", "invoke", "(Landroid/view/View;Lo0OOoOO/o0O000;I)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0O0OO implements o0O0000O<View, o0O000, Integer, oO0Ooooo> {
        public o00oOo00() {
            super(3);
        }

        @Override // o0OOOO.o0O0000O
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(View view, o0O000 o0o000, Integer num) {
            invoke(view, o0o000, num.intValue());
            return oO0Ooooo.f13240o00oOOo0;
        }

        public final void invoke(@NotNull View view, @NotNull o0O000 o0o000, int i) {
            o0ooO.o00oo0O0(view, o00oo.o00oOOo0(new byte[]{-10, 77, oo0OOoo.f13516o00oOoO, -35, -13, Byte.MAX_VALUE, Ascii.VT, 8, -65, 95, 115, -62, -4, 116, 7, 10, -81, 88, 54, -64, -67, 54, 88}, new byte[]{-54, 44, 83, -78, -99, 6, 102, 103}));
            o0ooO.o00oo0O0(o0o000, o00oo.o00oOOo0(new byte[]{5, -30, 41, -25}, new byte[]{108, -106, 76, -118, -47, 70, -43, 115}));
            ListActivity.this.o0O0OO(o0o000.f14893o00oOo00);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo0O0OoO0/o00oOo00;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "invoke", "()Lo0O0OoO0/o00oOo00;", "o0ooO0O0/oO0o0000$o00oOOo0", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0O0OO implements o0OOOO.o00oOOo0<o0O00000> {
        public final /* synthetic */ Activity $this_inflate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo0O(Activity activity) {
            super(0);
            this.$this_inflate = activity;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final o0O00000 invoke() {
            LayoutInflater layoutInflater = this.$this_inflate.getLayoutInflater();
            o0ooO.o00oo0OO(layoutInflater, o00oo.o00oOOo0(new byte[]{-112, Ascii.FF, -87, -95, -29, -120, -28, 83, -102, 1, -79, -70, -13, -114}, new byte[]{-4, 109, -48, -50, -106, -4, -83, oo0OOoo.f13516o00oOoO}));
            Object invoke = o0O00000.class.getMethod(o00oo.o00oOOo0(new byte[]{0, -3, -59, 79, 51, -115, -94}, new byte[]{105, -109, -93, 35, 82, -7, -57, Ascii.SYN}), LayoutInflater.class).invoke(null, layoutInflater);
            if (invoke != null) {
                return (o0O00000) invoke;
            }
            throw new NullPointerException(o00oo.o00oOOo0(new byte[]{Ascii.VT, -56, -7, -119, 67, -90, -84, -38, Ascii.VT, -46, -31, -59, 1, -96, -19, -41, 4, -50, -31, -59, Ascii.ETB, -86, -19, -38, 10, -45, -72, -117, Ascii.SYN, -87, -95, -108, 17, -60, -27, Byte.MIN_VALUE, 67, -88, -72, -40, 17, -44, -26, -107, 2, -90, -88, -102, 8, -56, -7, -111, 10, -92, -67, -60, 75, -34, -7, -118, Ascii.CR, -96, -29, -48, 4, -55, -12, -121, 10, -85, -87, -35, Ascii.VT, -38, -69, -92, 0, -79, -92, -62, Ascii.FF, -55, -20, -87, 10, -74, -71, -10, Ascii.FF, -45, -15, -116, Ascii.CR, -94}, new byte[]{101, -67, -107, -27, 99, -59, -51, -76}));
        }
    }

    public ListActivity() {
        o00oo0OO<String> registerForActivityResult = registerForActivityResult(new o00oOOoO.o00oOo0O(), new androidx.activity.result.o00oOOo0() { // from class: o0Oo0OO.oO0Oo
            @Override // androidx.activity.result.o00oOOo0
            public final void o00oOOo0(Object obj) {
                ListActivity.o0O0OOoo(ListActivity.this, (Uri) obj);
            }
        });
        o0ooO.o00oo0OO(registerForActivityResult, o00oo.o00oOOo0(new byte[]{52, -40, 54, -91, -2, Ascii.SUB, -124, Ascii.FF, 0, -46, 35, -115, -18, Ascii.SUB, -120, 8, 47, -55, 40, -98, -24, Ascii.GS, -108, Ascii.DC2, -92, oo0OOoo.f13516o00oOoO, -9, -97, -7, Ascii.FS, -120, Ascii.DLE, o0OO0o00.f16655o00oOoOO, -107, 120, -27, -121, 78, -63, 94, 102, -99, 113, -20, -83, 19, -21, 94, 102, -99, 113, -79}, new byte[]{70, -67, 81, -52, -115, 110, -31, 126}));
        this.f6728o0O0000O = registerForActivityResult;
    }

    public static final void o0O0OOo(ListActivity listActivity, Boolean bool) {
        o0ooO.o00oo0O0(listActivity, o00oo.o00oOOo0(new byte[]{-61, -1, -69, Ascii.CR, 40, -65}, new byte[]{-73, -105, -46, 126, Ascii.FF, -113, -116, 123}));
        o0ooO.o00oo0OO(bool, o00oo.o00oOOo0(new byte[]{17, -127}, new byte[]{120, -11, -122, -54, -82, -58, oo0OOoo.f13516o00oOoO, Byte.MIN_VALUE}));
        boolean booleanValue = bool.booleanValue();
        StateView stateView = listActivity.o0O0OOO0().stateView;
        if (booleanValue) {
            stateView.showLoading();
        } else {
            stateView.showContent();
        }
    }

    public static final void o0O0OOoO(ListActivity listActivity, List list) {
        o0ooO.o00oo0O0(listActivity, o00oo.o00oOOo0(new byte[]{115, 91, -19, 118, -19, 52}, new byte[]{7, 51, -124, 5, -55, 4, -41, -41}));
        if (list != null) {
            listActivity.f6727o0O00000 = list;
            listActivity.o0O0OOO0().searchView.o00ooOO("", false);
            listActivity.o0O0OO0O("");
            if (!(!list.isEmpty())) {
                listActivity.o0O0OOO0().stateView.showEmpty();
                return;
            }
            listActivity.o0O0OOO0().stateView.showContent();
            o oVar = listActivity.f6724o0;
            if (oVar == null) {
                o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-82, 83, 46, 78, 117, -63, -31, -17, -76}, new byte[]{-40, 58, 75, 57, 56, -82, -123, -118}));
                oVar = null;
            }
            oVar.previewInstalledList();
        }
    }

    public static final void o0O0OOoo(ListActivity listActivity, Uri uri) {
        o0ooO.o00oo0O0(listActivity, o00oo.o00oOOo0(new byte[]{-112, -7, -58, 87, 65, 81}, new byte[]{-28, -111, -81, 36, 101, 97, 87, 117}));
        if (uri != null) {
            String uri2 = uri.toString();
            o0ooO.o00oo0OO(uri2, o00oo.o00oOOo0(new byte[]{-42, -124, -114, 116, -24, -7, -33, 122, -42, -98, -57, 40, -82}, new byte[]{-65, -16, -96, 0, -121, -86, -85, 8}));
            listActivity.o0O0OO(uri2);
        }
    }

    public final void o0O0OO(String str) {
        getIntent().putExtra(o00oo.o00oOOo0(new byte[]{-66, 55, 57, Ascii.SI, -18, -40}, new byte[]{-51, 88, 76, 125, -115, -67, 76, Ascii.US}), str);
        setResult(-1, getIntent());
        Object systemService = getSystemService(o00oo.o00oOOo0(new byte[]{90, Ascii.US, 74, oo0OOoo.f13516o00oOoO, -105, -26, 34, 7, 71, Ascii.EM, 85, 44}, new byte[]{51, 113, 58, 72, -29, -71, 79, 98}));
        o0ooO.o00oo0(systemService, o00oo.o00oOOo0(new byte[]{37, 87, -25, 116, 98, -34, 117, 34, 37, 77, -1, 56, 32, -40, 52, 47, 42, 81, -1, 56, 54, -46, 52, 34, 36, 76, -90, 118, 55, -47, 120, 108, 63, 91, -5, 125, 98, -36, 122, 40, 57, 77, -30, 124, 108, -53, 125, 41, 60, Ascii.FF, -30, 118, 50, -56, 96, o0OO0o00.f16655o00oOoOO, 46, 86, -29, 119, 38, -109, 93, 34, 59, 87, -1, 85, 39, -55, 124, 35, 47, 111, -22, 118, 35, -38, 113, 62}, new byte[]{75, 34, -117, Ascii.CAN, 66, -67, Ascii.DC4, 76}));
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View peekDecorView = getWindow().peekDecorView();
        if (peekDecorView != null) {
            inputMethodManager.hideSoftInputFromWindow(peekDecorView.getWindowToken(), 0);
        }
        finish();
    }

    public final void o0O0OO0O(String str) {
        List<o0O000> list = this.f6727o0O00000;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            o0O000 o0o000 = (o0O000) obj;
            if (oO0O0.o0OOOoOo(o0o000.f14893o00oOo00, str, true) | oO0O0.o0OOOoOo(o0o000.f14891o00oOOo0, str, true)) {
                arrayList.add(obj);
            }
        }
        o0OooO0<o0O000> o0oooo0 = this.f6726o00ooooo;
        if (o0oooo0 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-101, Ascii.EM, -103, -10, 6, Ascii.ESC, 56, -52}, new byte[]{-10, 88, -3, -105, 118, 111, 93, -66}));
            o0oooo0 = null;
        }
        o0OooO0.o0O0O0oO(o0oooo0, arrayList, false, false, 6, null);
    }

    public final void o0O0OOO() {
        o0O0OOO0().searchView.setOnQueryTextListener(new o00oOOoO());
    }

    public final o0O00000 o0O0OOO0() {
        return (o0O00000) this.f6725o00ooooO.getValue();
    }

    public final void o0O0OOOo() {
        MaterialToolbar materialToolbar;
        int i;
        oO0O0O0.f17114o00oOOo0.getClass();
        this.f6724o0 = new o(oO0O0O0.f17115o00oOOoO);
        boolean booleanExtra = getIntent().getBooleanExtra(o00oo.o00oOOo0(new byte[]{115, -115, -118, 44, 122, 35, 3, 106, 68, -109}, new byte[]{Ascii.FS, -29, -26, 85, 41, 75, 108, Ascii.GS}), false);
        int intExtra = getIntent().getIntExtra(o00oo.o00oOOo0(new byte[]{-9, -52, 38, -90, -35, Ascii.VT}, new byte[]{-126, -65, 67, -44, -108, 79, -110, 119}), 0);
        o oVar = this.f6724o0;
        o oVar2 = null;
        if (oVar == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-35, -33, 60, 58, 105, 89, -70, 96, -57}, new byte[]{-85, -74, 89, 77, 36, 54, -34, 5}));
            oVar = null;
        }
        oVar.previewInstalledList();
        if (booleanExtra) {
            o oVar3 = this.f6724o0;
            if (oVar3 == null) {
                o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-74, Ascii.US, 48, -114, Ascii.FF, 53, 111, 95, -84}, new byte[]{-64, 118, 85, -7, 65, 90, Ascii.VT, 58}));
                oVar3 = null;
            }
            oVar3.getInstalledModules();
            materialToolbar = o0O0OOO0().toolbarLayout.toolbar;
            i = R.string.installed_module;
        } else {
            o oVar4 = this.f6724o0;
            if (oVar4 == null) {
                o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{91, Ascii.GS, o0OO0o00.f16655o00oOoOO, -8, 97, -41, -86, 106, 65}, new byte[]{45, 116, 68, -113, 44, -72, -50, Ascii.SI}));
                oVar4 = null;
            }
            oVar4.getInstallAppList(intExtra);
            materialToolbar = o0O0OOO0().toolbarLayout.toolbar;
            i = R.string.installed_app;
        }
        materialToolbar.setTitle(i);
        o oVar5 = this.f6724o0;
        if (oVar5 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-87, 90, Byte.MIN_VALUE, -51, 91, Ascii.FS, -54, -121, -77}, new byte[]{-33, 51, -27, -70, Ascii.SYN, 115, -82, -30}));
            oVar5 = null;
        }
        oVar5.getLoadingLiveData().o00oOoo0(this, new androidx.lifecycle.o0OooO0() { // from class: o0Oo0OO.o0OOo000
            @Override // androidx.lifecycle.o0OooO0
            public final void onChanged(Object obj) {
                ListActivity.o0O0OOo(ListActivity.this, (Boolean) obj);
            }
        });
        o oVar6 = this.f6724o0;
        if (oVar6 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{80, 88, -28, 52, 72, -9, 122, -93, 74}, new byte[]{38, 49, -127, 67, 5, -104, Ascii.RS, -58}));
        } else {
            oVar2 = oVar6;
        }
        oVar2.getAppsLiveData().o00oOoo0(this, new androidx.lifecycle.o0OooO0() { // from class: o0Oo0OO.o0o0000
            @Override // androidx.lifecycle.o0OooO0
            public final void onChanged(Object obj) {
                ListActivity.o0O0OOoO(ListActivity.this, (List) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!o0O0OOO0().searchView.f5837o00oo0oO) {
            super.onBackPressed();
            return;
        }
        SimpleSearchView simpleSearchView = o0O0OOO0().searchView;
        o0ooO.o00oo0OO(simpleSearchView, o00oo.o00oOOo0(new byte[]{-72, -48, -78, -26, -56, 5, -79, -124, -89, -41, -80, -65, -7, 9, -66, -110, -83, -47, -127, -8, -17, Ascii.ESC}, new byte[]{-50, -71, -41, -111, -118, 108, -33, -32}));
        SimpleSearchView.o00oo0(simpleSearchView, false, 1, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o0O0OOO0().getRoot());
        MaterialToolbar materialToolbar = o0O0OOO0().toolbarLayout.toolbar;
        o0ooO.o00oo0OO(materialToolbar, o00oo.o00oOOo0(new byte[]{121, -50, -60, -22, 71, 35, -76, -68, 102, -55, -58, -77, 113, 37, -75, -76, 109, -58, -45, -47, 100, 51, -75, -83, 123, -119, -43, -14, 106, 38, -72, -71, 125}, new byte[]{Ascii.SI, -89, -95, -99, 5, 74, -38, -40}));
        BaseActivity.o0O0O0Oo(this, materialToolbar, R.string.installed_app, true, null, 8, null);
        o0OooO0 o0oooo0 = new o0OooO0(this, new o0oo0000());
        RecyclerView recyclerView = o0O0OOO0().recyclerView;
        o0ooO.o00oo0OO(recyclerView, o00oo.o00oOOo0(new byte[]{Ascii.EM, -86, 74, 90, -55, -103, 37, 53, 6, -83, 72, 3, -7, -107, 40, 40, Ascii.FF, -81, 74, 95, -35, -103, 46, 38}, new byte[]{111, -61, 47, 45, -117, -16, 75, 81}));
        this.f6726o00ooooo = o0oooo0.o00ooOo(recyclerView).o0O0O0Oo(new o00oOo00());
        o0O0OOO0().recyclerView.setLayoutManager(new LinearLayoutManager(this));
        o0O0OOO();
        o0O0OOOo();
        o0O000o0.o00oOo00().o00oOoo0(o00oo.o00oOOo0(new byte[]{-7, 125, -29, -51, 88, -126, 87, 102, -29, 67, -4, -5, 78, -104}, new byte[]{-111, Ascii.FS, -112, -110, oo0OOoo.f13516o00oOoO, -20, 35, 3}), Boolean.TRUE);
        oOo00o0o.o00oOooO(this);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@Nullable Menu menu) {
        getMenuInflater().inflate(R.menu.menu_list, menu);
        o0ooO.o00oo00O(menu);
        MenuItem findItem = menu.findItem(R.id.list_search);
        SimpleSearchView simpleSearchView = o0O0OOO0().searchView;
        o0ooO.o00oo0OO(findItem, o00oo.o00oOOo0(new byte[]{-89, 48, -7, 52}, new byte[]{-50, 68, -100, 89, 39, -47, -42, 63}));
        simpleSearchView.setMenuItem(findItem);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        o0ooO.o00oo0O0(menuItem, o00oo.o00oOOo0(new byte[]{-124, -67, 65, 51}, new byte[]{-19, -55, 36, 94, -76, 42, -18, -69}));
        if (menuItem.getItemId() == R.id.list_choose) {
            this.f6728o0O0000O.o00oOOoO(o00oo.o00oOOo0(new byte[]{54, 54, -13, -100, -106, 109, 101, -67, 62, 41, -19, -33, -119, 96, 96, -25, 54, 40, -25, -126, -112, 103, 96, -25, 39, 39, -32, -101, -98, 105, 97, -28, 54, 52, -32, -104, -106, 120, 97}, new byte[]{87, 70, -125, -16, -1, Ascii.SO, 4, -55}));
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        o oVar = this.f6724o0;
        o oVar2 = null;
        if (oVar == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{Ascii.DC2, -113, 38, 40, -70, -115, 87, -78, 8}, new byte[]{100, -26, 67, 95, -9, -30, 51, -41}));
            oVar = null;
        }
        oVar.getLoadingLiveData().o00oo0OO(Boolean.TRUE);
        o oVar3 = this.f6724o0;
        if (oVar3 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{66, -48, 94, 40, 110, 59, -62, -33, 88}, new byte[]{52, -71, 59, 95, 35, 84, -90, -70}));
            oVar3 = null;
        }
        oVar3.getLoadingLiveData().o00oo0O(this);
        o oVar4 = this.f6724o0;
        if (oVar4 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{90, -50, -80, 120, 105, -20, -79, -101, SignedBytes.MAX_POWER_OF_TWO}, new byte[]{44, -89, -43, Ascii.SI, 36, -125, -43, -2}));
            oVar4 = null;
        }
        oVar4.getAppsLiveData().o00oo0OO(null);
        o oVar5 = this.f6724o0;
        if (oVar5 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{Ascii.SO, -33, 78, 17, 17, 85, 8, -100, Ascii.DC4}, new byte[]{120, -74, 43, 102, 92, 58, 108, -7}));
        } else {
            oVar2 = oVar5;
        }
        oVar2.getAppsLiveData().o00oo0O(this);
    }
}
