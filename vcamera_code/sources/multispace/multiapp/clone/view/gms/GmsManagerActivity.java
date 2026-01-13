package multispace.multiapp.clone.view.gms;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Switch;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import multispace.multiapp.clone.view.base.BaseActivity;
import multispace.multiapp.clone.view.base.LoadingActivity;
import multispace.multiapp.clone.view.gms.GmsManagerActivity;
import o0O0o0oo.o0OooO0;
import o0O0oo0O.o0OO00OO;
import o0OO0o.o0O00oO0;
import o0OO0o.o0oO0Ooo;
import o0OO0o.oO0Ooooo;
import o0OOO0oo.oo0OOoo;
import o0OOOO.o0O0000O;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import o0OOoOO.o0O00000;
import o0OOoo0.o0;
import o0Oo0OO0.o0O000o0;
import o0Oo0OO0.o0O00O0o;
import o0Oo0oo0.o0OO0o00;
import o0ooO0O0.oO0O0O0;
import o0ooO0O0.oO0OOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import virtual.camera.app.R;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lmultispace/multiapp/clone/view/gms/GmsManagerActivity;", "Lmultispace/multiapp/clone/view/base/LoadingActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lo0OO0o/oO0Ooooo;", "onCreate", "o0O0OOoO", "o0O0OOo", "", "userID", "Landroid/widget/Switch;", "checkbox", "o0O0Oo0", "o0O0Oo0O", "Lo0Oo0OO0/o0O00O0o;", "o00ooooo", "Lo0Oo0OO0/o0O00O0o;", "viewModel", "Lo0O0o0oo/o0OooO0;", "Lo0OOoOO/o0O00000;", "o0", "Lo0O0o0oo/o0OooO0;", "mAdapter", "Lo0OOoo0/o0;", "o0O00000", "Lo0OO0o/o0oO0Ooo;", "o0O0OOOo", "()Lo0OOoo0/o0;", "viewBinding", "<init>", "()V", "o0O0000O", "o00oOOo0", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class GmsManagerActivity extends LoadingActivity {
    @NotNull

    /* renamed from: o0O0000O  reason: collision with root package name */
    public static final o00oOOo0 f6719o0O0000O = new o00oOOo0(null);

    /* renamed from: o0  reason: collision with root package name */
    public o0OooO0<o0O00000> f6720o0;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public o0O00O0o f6721o00ooooo;
    @NotNull

    /* renamed from: o0O00000  reason: collision with root package name */
    public final o0oO0Ooo f6722o0O00000 = o0O00oO0.o00oOo00(new o00oOoO(this));

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lmultispace/multiapp/clone/view/gms/GmsManagerActivity$o00oOOo0;", "", "Landroid/content/Context;", "context", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "<init>", "()V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        public final void o00oOOo0(@NotNull Context context) {
            o0ooO.o00oo0O0(context, o00oo.o00oOOo0(new byte[]{-31, -50, 44, 42, -63, 1, 72}, new byte[]{-126, -95, 66, 94, -92, 121, 60, -3}));
            context.startActivity(new Intent(context, GmsManagerActivity.class));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/view/View;", "view", "Lo0OOoOO/o0O00000;", "item", "", "<anonymous parameter 2>", "Lo0OO0o/oO0Ooooo;", "invoke", "(Landroid/view/View;Lo0OOoOO/o0O00000;I)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0O0OO implements o0O0000O<View, o0O00000, Integer, oO0Ooooo> {
        public o00oOOoO() {
            super(3);
        }

        @Override // o0OOOO.o0O0000O
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(View view, o0O00000 o0o00000, Integer num) {
            invoke(view, o0o00000, num.intValue());
            return oO0Ooooo.f13240o00oOOo0;
        }

        public final void invoke(@NotNull View view, @NotNull o0O00000 o0o00000, int i) {
            o0ooO.o00oo0O0(view, o00oo.o00oOOo0(new byte[]{7, 76, -95, -116}, new byte[]{113, 37, -60, -5, -52, 111, Byte.MAX_VALUE, -120}));
            o0ooO.o00oo0O0(o0o00000, o00oo.o00oOOo0(new byte[]{-26, Ascii.SUB, -30, 105}, new byte[]{-113, 110, -121, 4, -16, Ascii.GS, -80, 3}));
            Switch r4 = (Switch) view.findViewById(R.id.checkbox);
            if (o0o00000.f14898o00oOo00) {
                GmsManagerActivity gmsManagerActivity = GmsManagerActivity.this;
                int i2 = o0o00000.f14896o00oOOo0;
                o0ooO.o00oo0OO(r4, o00oo.o00oOOo0(new byte[]{91, 54, -44, 111, -33, 102, 79, 46}, new byte[]{56, 94, -79, Ascii.FF, -76, 4, 32, 86}));
                gmsManagerActivity.o0O0Oo0O(i2, r4);
                return;
            }
            GmsManagerActivity gmsManagerActivity2 = GmsManagerActivity.this;
            int i3 = o0o00000.f14896o00oOOo0;
            o0ooO.o00oo0OO(r4, o00oo.o00oOOo0(new byte[]{72, Byte.MAX_VALUE, 4, 8, -14, -68, -50, -25}, new byte[]{43, Ascii.ETB, 97, 107, -103, -34, -95, -97}));
            gmsManagerActivity2.o0O0Oo0(i3, r4);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "it", "Lo0OO0o/oO0Ooooo;", "invoke", "(Lo0O0oo0O/o0OO00OO;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0O0OO implements o0OOOO.o00oo<o0OO00OO, oO0Ooooo> {
        public final /* synthetic */ int $userID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(int i) {
            super(1);
            this.$userID = i;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(o0OO00OO o0oo00oo) {
            invoke2(o0oo00oo);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull o0OO00OO o0oo00oo) {
            o0ooO.o00oo0O0(o0oo00oo, o00oo.o00oOOo0(new byte[]{oo0OOoo.f13516o00oOoO, -87}, new byte[]{84, -35, -103, 69, 38, 92, 113, -37}));
            GmsManagerActivity.this.o0O0O0oo();
            o0O00O0o o0o00o0o = GmsManagerActivity.this.f6721o00ooooo;
            if (o0o00o0o == null) {
                o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{105, -36, -66, -87, 45, -28, -102, 100, 115}, new byte[]{Ascii.US, -75, -37, -34, 96, -117, -2, 1}));
                o0o00o0o = null;
            }
            o0o00o0o.installGms(this.$userID);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "it", "Lo0OO0o/oO0Ooooo;", "invoke", "(Lo0O0oo0O/o0OO00OO;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0O0OO implements o0OOOO.o00oo<o0OO00OO, oO0Ooooo> {
        public final /* synthetic */ Switch $checkbox;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo0O(Switch r1) {
            super(1);
            this.$checkbox = r1;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(o0OO00OO o0oo00oo) {
            invoke2(o0oo00oo);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull o0OO00OO o0oo00oo) {
            o0ooO.o00oo0O0(o0oo00oo, o00oo.o00oOOo0(new byte[]{107, 60}, new byte[]{2, 72, -19, -66, -36, 78, -109, -1}));
            Switch r3 = this.$checkbox;
            r3.setChecked(!r3.isChecked());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo0O0OoO0/o00oOo00;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "invoke", "()Lo0O0OoO0/o00oOo00;", "o0ooO0O0/oO0o0000$o00oOOo0", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOoO extends o0O0OO implements o0OOOO.o00oOOo0<o0> {
        public final /* synthetic */ Activity $this_inflate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOoO(Activity activity) {
            super(0);
            this.$this_inflate = activity;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final o0 invoke() {
            LayoutInflater layoutInflater = this.$this_inflate.getLayoutInflater();
            o0ooO.o00oo0OO(layoutInflater, o00oo.o00oOOo0(new byte[]{-108, -92, 82, -61, 82, -91, 39, 126, -98, -87, 74, -40, 66, -93}, new byte[]{-8, -59, 43, -84, 39, -47, 110, Ascii.DLE}));
            Object invoke = o0.class.getMethod(o00oo.o00oOOo0(new byte[]{-92, -6, -99, Ascii.SO, 101, -62, -92}, new byte[]{-51, -108, -5, 98, 4, -74, -63, -84}), LayoutInflater.class).invoke(null, layoutInflater);
            if (invoke != null) {
                return (o0) invoke;
            }
            throw new NullPointerException(o00oo.o00oOOo0(new byte[]{-100, -20, 52, 79, -117, 8, 40, -45, -100, -10, 44, 3, -55, Ascii.SO, 105, -34, -109, -22, 44, 3, -33, 4, 105, -45, -99, -9, 117, 77, -34, 7, 37, -99, -122, -32, 40, 70, -117, 6, 60, -47, -122, -16, 43, 83, -54, 8, 44, -109, -97, -20, 52, 87, -62, 10, 57, -51, -36, -6, 52, 76, -59, Ascii.SO, 103, -39, -109, -19, 57, 65, -62, 5, 45, -44, -100, -2, 118, 98, -56, Ascii.US, 32, -53, -101, -19, o0OO0o00.f16655o00oOoOO, 100, -58, Ascii.CAN, Ascii.VT, -44, -100, -3, 49, 77, -52}, new byte[]{-14, -103, 88, 35, -85, 107, 73, -67}));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "it", "Lo0OO0o/oO0Ooooo;", "invoke", "(Lo0O0oo0O/o0OO00OO;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oo0 extends o0O0OO implements o0OOOO.o00oo<o0OO00OO, oO0Ooooo> {
        public final /* synthetic */ Switch $checkbox;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo0(Switch r1) {
            super(1);
            this.$checkbox = r1;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(o0OO00OO o0oo00oo) {
            invoke2(o0oo00oo);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull o0OO00OO o0oo00oo) {
            o0ooO.o00oo0O0(o0oo00oo, o00oo.o00oOOo0(new byte[]{Ascii.CAN, -81}, new byte[]{113, -37, -126, -104, 59, 54, -31, -91}));
            Switch r3 = this.$checkbox;
            r3.setChecked(!r3.isChecked());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "it", "Lo0OO0o/oO0Ooooo;", "invoke", "(Lo0O0oo0O/o0OO00OO;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oo00O extends o0O0OO implements o0OOOO.o00oo<o0OO00OO, oO0Ooooo> {
        public final /* synthetic */ int $userID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo00O(int i) {
            super(1);
            this.$userID = i;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(o0OO00OO o0oo00oo) {
            invoke2(o0oo00oo);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull o0OO00OO o0oo00oo) {
            o0ooO.o00oo0O0(o0oo00oo, o00oo.o00oOOo0(new byte[]{-49, 117}, new byte[]{-90, 1, 1, 46, -29, -71, -35, 32}));
            GmsManagerActivity.this.o0O0O0oo();
            o0O00O0o o0o00o0o = GmsManagerActivity.this.f6721o00ooooo;
            if (o0o00o0o == null) {
                o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-99, 60, -51, -89, 98, 59, 120, -8, -121}, new byte[]{-21, 85, -88, -48, 47, 84, Ascii.FS, -99}));
                o0o00o0o = null;
            }
            o0o00o0o.uninstallGms(this.$userID);
        }
    }

    public static final void o0O0OOoo(GmsManagerActivity gmsManagerActivity, List list) {
        o0ooO.o00oo0O0(gmsManagerActivity, o00oo.o00oOOo0(new byte[]{-38, -78, 98, -94, -88, -19}, new byte[]{-82, -38, Ascii.VT, -47, -116, -35, 49, -122}));
        gmsManagerActivity.o0O0O0oO();
        o0OooO0<o0O00000> o0oooo0 = gmsManagerActivity.f6720o0;
        if (o0oooo0 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-76, 76, -103, -18, 98, -116, Byte.MIN_VALUE, Ascii.SI}, new byte[]{-39, Ascii.CR, -3, -113, Ascii.DC2, -8, -27, 125}));
            o0oooo0 = null;
        }
        o0OooO0.o0O0O0oO(o0oooo0, list, false, false, 6, null);
    }

    public static final void o0OooO0(GmsManagerActivity gmsManagerActivity, o0OOoOO.o0O0000O o0o0000o) {
        o0OooO0<o0O00000> o0oooo0;
        o0ooO.o00oo0O0(gmsManagerActivity, o00oo.o00oOOo0(new byte[]{87, -19, 10, -30, 123, 65}, new byte[]{35, -123, 99, -111, 95, 113, 9, 8}));
        if (o0o0000o == null) {
            return;
        }
        o0OooO0<o0O00000> o0oooo02 = gmsManagerActivity.f6720o0;
        if (o0oooo02 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{116, 88, -35, -94, -105, 39, Ascii.ETB, 70}, new byte[]{Ascii.EM, Ascii.EM, -71, -61, -25, 83, 114, 52}));
            o0oooo02 = null;
        }
        ArrayList<o0O00000> arrayList = o0oooo02.f12660o00oOOoO;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            o0O00000 o0o00000 = arrayList.get(i);
            if (o0o00000.f14896o00oOOo0 == o0o0000o.f14899o00oOOo0) {
                if (o0o0000o.f14900o00oOOoO) {
                    o0o00000.f14898o00oOo00 = !o0o00000.f14898o00oOo00;
                }
                o0OooO0<o0O00000> o0oooo03 = gmsManagerActivity.f6720o0;
                if (o0oooo03 == null) {
                    o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-48, -85, Byte.MIN_VALUE, -33, 54, 68, -60, -28}, new byte[]{-67, -22, -28, -66, 70, 48, -95, -106}));
                    o0oooo0 = null;
                } else {
                    o0oooo0 = o0oooo03;
                }
                o0OooO0.o0oO0Ooo(o0oooo0, i, o0o00000, false, 4, null);
            } else {
                i++;
            }
        }
        gmsManagerActivity.o0O0O0oO();
        if (o0o0000o.f14900o00oOOoO) {
            oO0OOO0.o00oOooO(gmsManagerActivity, o0o0000o.f14901o00oOo00);
            return;
        }
        o0OO00OO o0oo00oo = new o0OO00OO(gmsManagerActivity, null, 2, null);
        o0OO00OO.o0OoOoOO(o0oo00oo, Integer.valueOf((int) R.string.gms_manager), null, 2, null);
        o0OO00OO.o00ooOoo(o0oo00oo, null, o0o0000o.f14901o00oOo00, null, 5, null);
        o0OO00OO.o00oooo0(o0oo00oo, Integer.valueOf((int) R.string.done), null, null, 6, null);
        o0oo00oo.show();
    }

    public final o0 o0O0OOOo() {
        return (o0) this.f6722o0O00000.getValue();
    }

    public final void o0O0OOo() {
        o0OooO0 o0oooo0 = new o0OooO0(this, new o0O000o0());
        RecyclerView recyclerView = o0O0OOOo().recyclerView;
        o0ooO.o00oo0OO(recyclerView, o00oo.o00oOOo0(new byte[]{46, -84, 63, -59, 5, 100, -91, 17, 49, -85, oo0OOoo.f13516o00oOoO, -100, 53, 104, -88, Ascii.FF, 59, -87, 63, -64, 17, 100, -82, 2}, new byte[]{88, -59, 90, -78, 71, Ascii.CR, -53, 117}));
        this.f6720o0 = o0oooo0.o00ooOo(recyclerView).o0O0O0Oo(new o00oOOoO());
        o0O0OOOo().recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public final void o0O0OOoO() {
        oO0O0O0.f17114o00oOOo0.getClass();
        this.f6721o00ooooo = new o0O00O0o(oO0O0O0.f17119o00oOooO);
        o0O0O0oo();
        o0O00O0o o0o00o0o = this.f6721o00ooooo;
        o0O00O0o o0o00o0o2 = null;
        if (o0o00o0o == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{56, -96, -83, 3, 110, 17, -42, 7, 34}, new byte[]{78, -55, -56, 116, 35, 126, -78, 98}));
            o0o00o0o = null;
        }
        o0o00o0o.getMInstalledLiveData().o00oOoo0(this, new androidx.lifecycle.o0OooO0() { // from class: o0Oo0OO0.o0O00O0
            @Override // androidx.lifecycle.o0OooO0
            public final void onChanged(Object obj) {
                GmsManagerActivity.o0O0OOoo(GmsManagerActivity.this, (List) obj);
            }
        });
        o0O00O0o o0o00o0o3 = this.f6721o00ooooo;
        if (o0o00o0o3 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-17, 73, -70, 2, -2, -95, Ascii.NAK, 52, -11}, new byte[]{-103, 32, -33, 117, -77, -50, 113, 81}));
            o0o00o0o3 = null;
        }
        o0o00o0o3.getMUpdateInstalledLiveData().o00oOoo0(this, new androidx.lifecycle.o0OooO0() { // from class: o0Oo0OO0.o0OoO00O
            @Override // androidx.lifecycle.o0OooO0
            public final void onChanged(Object obj) {
                GmsManagerActivity.o0OooO0(GmsManagerActivity.this, (o0OOoOO.o0O0000O) obj);
            }
        });
        o0O00O0o o0o00o0o4 = this.f6721o00ooooo;
        if (o0o00o0o4 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{Ascii.ETB, -4, Ascii.NAK, 19, -38, 43, 41, -24, Ascii.CR}, new byte[]{97, -107, 112, 100, -105, 68, 77, -115}));
        } else {
            o0o00o0o2 = o0o00o0o4;
        }
        o0o00o0o2.getInstalledUser();
    }

    public final void o0O0Oo0(int i, Switch r9) {
        o0OO00OO o0oo00oo = new o0OO00OO(this, null, 2, null);
        o0OO00OO.o0OoOoOO(o0oo00oo, Integer.valueOf((int) R.string.enable_gms), null, 2, null);
        o0OO00OO.o00ooOoo(o0oo00oo, Integer.valueOf((int) R.string.enable_gms_hint), null, null, 6, null);
        o0OO00OO.o00oooo0(o0oo00oo, Integer.valueOf((int) R.string.done), null, new o00oOo00(i), 2, null);
        o0OO00OO.o00ooo0(o0oo00oo, Integer.valueOf((int) R.string.cancel), null, new o00oOo0O(r9), 2, null);
        o0oo00oo.show();
    }

    public final void o0O0Oo0O(int i, Switch r9) {
        o0OO00OO o0oo00oo = new o0OO00OO(this, null, 2, null);
        o0OO00OO.o0OoOoOO(o0oo00oo, Integer.valueOf((int) R.string.disable_gms), null, 2, null);
        o0OO00OO.o00ooOoo(o0oo00oo, Integer.valueOf((int) R.string.disable_gms_hint), null, null, 6, null);
        o0OO00OO.o00oooo0(o0oo00oo, Integer.valueOf((int) R.string.done), null, new o00oo00O(i), 2, null);
        o0OO00OO.o00ooo0(o0oo00oo, Integer.valueOf((int) R.string.cancel), null, new o00oo0(r9), 2, null);
        o0oo00oo.show();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o0O0OOOo().getRoot());
        MaterialToolbar materialToolbar = o0O0OOOo().toolbarLayout.toolbar;
        o0ooO.o00oo0OO(materialToolbar, o00oo.o00oOOo0(new byte[]{-98, -49, 123, 110, 70, -80, 113, 96, -127, -56, 121, 55, 112, -74, 112, 104, -118, -57, 108, 85, 101, -96, 112, 113, -100, -120, 106, 118, 107, -75, 125, 101, -102}, new byte[]{-24, -90, Ascii.RS, Ascii.EM, 4, -39, Ascii.US, 4}));
        BaseActivity.o0O0O0Oo(this, materialToolbar, R.string.gms_manager, true, null, 8, null);
        o0O0OOoO();
        o0O0OOo();
    }
}
