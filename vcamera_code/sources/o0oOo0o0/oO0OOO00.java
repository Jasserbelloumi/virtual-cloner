package o0oOo0o0;

import androidx.lifecycle.o0O0OOOo;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0ooO;
import o0OOO0.o0;
import o0OOO0.o00oo00O;
import o0OOO0oo.oo0OOoo;
import o0OOOOO0.o0ooO;
import o0OOo00O.o0O0oo00;
import o0OOoO0.o00oo;
import o0OOoOO.o0O000O;
import o0OOoOo.o0O00O0;
import o0Oo0O0O.o0O00000;
import o0Oo0oo0.o0OO0o00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lo0oOo0o0/oO0OOO00;", "Lo0Oo0O0O/o0O00000;", "Lo0OO0o/oO0Ooooo;", "getInstalledModule", "", FirebaseAnalytics.Param.SOURCE, "installModule", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "unInstallModule", "cleanModule", "Lo0OOoOo/o0O00O0;", "repo", "Lo0OOoOo/o0O00O0;", "Landroidx/lifecycle/o0O0OOOo;", "", "Lo0OOoOO/o0O000O;", "appsLiveData", "Landroidx/lifecycle/o0O0OOOo;", "getAppsLiveData", "()Landroidx/lifecycle/o0O0OOOo;", "resultLiveData", "getResultLiveData", "<init>", "(Lo0OOoOo/o0O00O0;)V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class oO0OOO00 extends o0O00000 {
    @NotNull
    private final o0O0OOOo<List<o0O000O>> appsLiveData;
    @NotNull
    private final o0O00O0 repo;
    @NotNull
    private final o0O0OOOo<String> resultLiveData;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o00oo00O(c = "multispace.multiapp.clone.view.pro.xp.XpViewModel$cleanModule$1", f = "XpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0 implements o0OOOO.o0O00000<o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ String $packageName;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(String str, o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$packageName = str;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOOo0(this.$packageName, o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0O0oo00 o0o0oo00, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOo0) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                oo0ooO.o00oo0(obj);
                oO0OOO00.this.repo.o00oOOo0(this.$packageName, oO0OOO00.this.getResultLiveData());
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o00oo.o00oOOo0(new byte[]{3, -24, 100, -104, -100, -56, -99, -64, 71, -5, 109, -121, -55, -47, -105, -57, SignedBytes.MAX_POWER_OF_TWO, -21, 109, -110, -45, -50, -105, -64, 71, -32, 102, -126, -45, -41, -105, -57, SignedBytes.MAX_POWER_OF_TWO, -2, 97, Byte.MIN_VALUE, -44, -100, -111, -113, Ascii.DC2, -26, 125, Byte.MIN_VALUE, -43, -46, -105}, new byte[]{96, -119, 8, -12, -68, -68, -14, -32}));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o00oo00O(c = "multispace.multiapp.clone.view.pro.xp.XpViewModel$getInstalledModule$1", f = "XpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0 implements o0OOOO.o0O00000<o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public int label;

        public o00oOOoO(o0OO.o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOOoO(o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0O0oo00 o0o0oo00, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOoO) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                oo0ooO.o00oo0(obj);
                oO0OOO00.this.repo.o00oOOoO(oO0OOO00.this.getAppsLiveData());
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o00oo.o00oOOo0(new byte[]{-77, -93, 88, -37, -118, 65, -116, Ascii.VT, -9, -80, 81, -60, -33, 88, -122, Ascii.FF, -16, -96, 81, -47, -59, 71, -122, Ascii.VT, -9, -85, 90, -63, -59, 94, -122, Ascii.FF, -16, -75, 93, -61, -62, Ascii.NAK, Byte.MIN_VALUE, 68, -94, -83, 65, -61, -61, 91, -122}, new byte[]{-48, -62, 52, -73, -86, 53, -29, 43}));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o00oo00O(c = "multispace.multiapp.clone.view.pro.xp.XpViewModel$installModule$1", f = "XpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0 implements o0OOOO.o0O00000<o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ String $source;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(String str, o0OO.o00oOo0O<? super o00oOo00> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$source = str;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOo00(this.$source, o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0O0oo00 o0o0oo00, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOo00) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                oo0ooO.o00oo0(obj);
                oO0OOO00.this.repo.o00oOo00(this.$source, oO0OOO00.this.getResultLiveData());
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o00oo.o00oOOo0(new byte[]{71, -47, -78, -28, -31, -7, 1, -57, 3, -62, -69, -5, -76, -32, Ascii.VT, -64, 4, -46, -69, -18, -82, -1, Ascii.VT, -57, 3, -39, -80, -2, -82, -26, Ascii.VT, -64, 4, -57, -73, -4, -87, -83, Ascii.CR, -120, 86, -33, -85, -4, -88, -29, Ascii.VT}, new byte[]{36, -80, -34, -120, -63, -115, 110, -25}));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o00oo00O(c = "multispace.multiapp.clone.view.pro.xp.XpViewModel$unInstallModule$1", f = "XpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0 implements o0OOOO.o0O00000<o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ String $packageName;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo0O(String str, o0OO.o00oOo0O<? super o00oOo0O> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$packageName = str;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOo0O(this.$packageName, o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0O0oo00 o0o0oo00, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOo0O) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                oo0ooO.o00oo0(obj);
                oO0OOO00.this.repo.o00oOooO(this.$packageName, oO0OOO00.this.getResultLiveData());
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o00oo.o00oOOo0(new byte[]{-39, 92, 93, 86, -89, -18, -41, -47, -99, 79, 84, 73, -14, -9, -35, -42, -102, 95, 84, 92, -24, -24, -35, -47, -99, 84, 95, 76, -24, -15, -35, -42, -102, 74, 88, 78, -17, -70, -37, -98, -56, 82, 68, 78, -18, -12, -35}, new byte[]{-70, oo0OOoo.f13516o00oOoO, 49, 58, -121, -102, -72, -15}));
        }
    }

    public oO0OOO00(@NotNull o0O00O0 o0o00o0) {
        o0ooO.o00oo0O0(o0o00o0, o00oo.o00oOOo0(new byte[]{-83, 36, o0OO0o00.f16655o00oOoOO, -79}, new byte[]{-33, 65, 81, -34, -106, -21, 70, Ascii.NAK}));
        this.repo = o0o00o0;
        this.appsLiveData = new o0O0OOOo<>();
        this.resultLiveData = new o0O0OOOo<>();
    }

    public final void cleanModule(@NotNull String str) {
        o0ooO.o00oo0O0(str, o00oo.o00oOOo0(new byte[]{117, 0, -115, -120, -70, 124, 69, 36, 100, Ascii.FF, -117}, new byte[]{5, 97, -18, -29, -37, Ascii.ESC, 32, 106}));
        launchOnUI(new o00oOOo0(str, null));
    }

    @NotNull
    public final o0O0OOOo<List<o0O000O>> getAppsLiveData() {
        return this.appsLiveData;
    }

    public final void getInstalledModule() {
        launchOnUI(new o00oOOoO(null));
    }

    @NotNull
    public final o0O0OOOo<String> getResultLiveData() {
        return this.resultLiveData;
    }

    public final void installModule(@NotNull String str) {
        o0ooO.o00oo0O0(str, o00oo.o00oOOo0(new byte[]{93, SignedBytes.MAX_POWER_OF_TWO, 1, 2, Ascii.FF, -120}, new byte[]{46, 47, 116, 112, 111, -19, Byte.MIN_VALUE, -97}));
        launchOnUI(new o00oOo00(str, null));
    }

    public final void unInstallModule(@NotNull String str) {
        o0ooO.o00oo0O0(str, o00oo.o00oOOo0(new byte[]{-109, 111, Ascii.CR, -86, 87, -64, 55, 43, -126, 99, Ascii.VT}, new byte[]{-29, Ascii.SO, 110, -63, 54, -89, 82, 101}));
        launchOnUI(new o00oOo0O(str, null));
    }
}
