package o0Oo0O0;

import androidx.lifecycle.o0O0OOOo;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0ooO;
import o0OOO0oo.oo0OOoo;
import o0OOOOO0.o0ooO;
import o0OOo00O.o0O0oo00;
import o0OOoOo.o0OoOoOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J\u001c\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00158\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00158\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019¨\u0006#"}, d2 = {"Lo0Oo0O0/o0O000;", "Lo0Oo0O0O/o0O00000;", "", "userId", "Lo0OO0o/oO0Ooooo;", "getInstalledApps", "", FirebaseAnalytics.Param.SOURCE, "userID", "install", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "unInstall", "clearApkData", "launchApk", "", "Lo0OOoOO/o00ooO0;", "dataList", "updateApkOrder", "Lo0OOoOo/o0OoOoOo;", "repo", "Lo0OOoOo/o0OoOoOo;", "Landroidx/lifecycle/o0O0OOOo;", "appsLiveData", "Landroidx/lifecycle/o0O0OOOo;", "getAppsLiveData", "()Landroidx/lifecycle/o0O0OOOo;", "resultLiveData", "getResultLiveData", "", "launchLiveData", "getLaunchLiveData", "updateSortLiveData", "getUpdateSortLiveData", "<init>", "(Lo0OOoOo/o0OoOoOo;)V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class o0O000 extends o0Oo0O0O.o0O00000 {
    @NotNull
    private final o0O0OOOo<List<o0OOoOO.o00ooO0>> appsLiveData;
    @NotNull
    private final o0O0OOOo<Boolean> launchLiveData;
    @NotNull
    private final o0OoOoOo repo;
    @NotNull
    private final o0O0OOOo<String> resultLiveData;
    @NotNull
    private final o0O0OOOo<Boolean> updateSortLiveData;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o0OOO0.o00oo00O(c = "multispace.multiapp.clone.view.apps.AppsViewModel$clearApkData$1", f = "AppsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ String $packageName;
        public final /* synthetic */ int $userID;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(String str, int i, o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$packageName = str;
            this.$userID = i;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOOo0(this.$packageName, this.$userID, o00ooo0o2);
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
                o0O000.this.repo.o00oOOo0(this.$packageName, this.$userID, o0O000.this.getResultLiveData());
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o0OOoO0.o00oo.o00oOOo0(new byte[]{-104, 74, 58, 84, -43, -68, -59, oo0OOoo.f13516o00oOoO, -36, 89, 51, 75, Byte.MIN_VALUE, -91, -49, 58, -37, 73, 51, 94, -102, -70, -49, oo0OOoo.f13516o00oOoO, -36, 66, 56, 78, -102, -93, -49, 58, -37, 92, 63, 76, -99, -24, -55, 114, -119, 68, 35, 76, -100, -90, -49}, new byte[]{-5, 43, 86, 56, -11, -56, -86, Ascii.GS}));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o0OOO0.o00oo00O(c = "multispace.multiapp.clone.view.apps.AppsViewModel$getInstalledApps$1", f = "AppsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0OOO0.o0 implements o0OOOO.o0O00000<o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ int $userId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(int i, o0OO.o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$userId = i;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOOoO(this.$userId, o00ooo0o2);
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
                o0O000.this.repo.o00oOo0O(this.$userId, o0O000.this.getAppsLiveData());
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o0OOoO0.o00oo.o00oOOo0(new byte[]{76, -117, -96, -19, -95, 97, 8, -52, 8, -104, -87, -14, -12, 120, 2, -53, Ascii.SI, -120, -87, -25, -18, 103, 2, -52, 8, -125, -94, -9, -18, 126, 2, -53, Ascii.SI, -99, -91, -11, -23, 53, 4, -125, 93, -123, -71, -11, -24, 123, 2}, new byte[]{47, -22, -52, -127, -127, Ascii.NAK, 103, -20}));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o0OOO0.o00oo00O(c = "multispace.multiapp.clone.view.apps.AppsViewModel$install$1", f = "AppsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ String $source;
        public final /* synthetic */ int $userID;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(String str, int i, o0OO.o00oOo0O<? super o00oOo00> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$source = str;
            this.$userID = i;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOo00(this.$source, this.$userID, o00ooo0o2);
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
                o0O000.this.repo.o00oOo0o(this.$source, this.$userID, o0O000.this.getResultLiveData());
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o0OOoO0.o00oo.o00oOOo0(new byte[]{81, -20, -39, 119, 8, 67, 115, -111, Ascii.NAK, -1, -48, 104, 93, 90, 121, -106, Ascii.DC2, -17, -48, 125, 71, 69, 121, -111, Ascii.NAK, -28, -37, 109, 71, 92, 121, -106, Ascii.DC2, -6, -36, 111, SignedBytes.MAX_POWER_OF_TWO, Ascii.ETB, Byte.MAX_VALUE, -34, SignedBytes.MAX_POWER_OF_TWO, -30, -64, 111, 65, 89, 121}, new byte[]{50, -115, -75, Ascii.ESC, 40, 55, Ascii.FS, -79}));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o0OOO0.o00oo00O(c = "multispace.multiapp.clone.view.apps.AppsViewModel$launchApk$1", f = "AppsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0OOO0.o0 implements o0OOOO.o0O00000<o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ String $packageName;
        public final /* synthetic */ int $userID;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo0O(String str, int i, o0OO.o00oOo0O<? super o00oOo0O> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$packageName = str;
            this.$userID = i;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOo0O(this.$packageName, this.$userID, o00ooo0o2);
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
                o0O000.this.repo.o00oOoO0(this.$packageName, this.$userID, o0O000.this.getLaunchLiveData());
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o0OOoO0.o00oo.o00oOOo0(new byte[]{-122, 44, 113, 104, -88, -92, 94, 108, -62, 63, 120, 119, -3, -67, 84, 107, -59, 47, 120, 98, -25, -94, 84, 108, -62, 36, 115, 114, -25, -69, 84, 107, -59, 58, 116, 112, -32, -16, 82, 35, -105, 34, 104, 112, -31, -66, 84}, new byte[]{-27, 77, Ascii.GS, 4, -120, -48, 49, 76}));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o0OOO0.o00oo00O(c = "multispace.multiapp.clone.view.apps.AppsViewModel$unInstall$1", f = "AppsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOoO extends o0OOO0.o0 implements o0OOOO.o0O00000<o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ String $packageName;
        public final /* synthetic */ int $userID;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOoO(String str, int i, o0OO.o00oOo0O<? super o00oOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$packageName = str;
            this.$userID = i;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOoO(this.$packageName, this.$userID, o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0O0oo00 o0o0oo00, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOoO) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                oo0ooO.o00oo0(obj);
                o0O000.this.repo.o00oOoOo(this.$packageName, this.$userID, o0O000.this.getResultLiveData());
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o0OOoO0.o00oo.o00oOOo0(new byte[]{-49, -29, 37, 41, -39, -12, 102, -59, -117, -16, 44, 54, -116, -19, 108, -62, -116, -32, 44, 35, -106, -14, 108, -59, -117, -21, 39, 51, -106, -21, 108, -62, -116, -11, 32, 49, -111, -96, 106, -118, -34, -19, 60, 49, -112, -18, 108}, new byte[]{-84, -126, 73, 69, -7, Byte.MIN_VALUE, 9, -27}));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o0OOO0.o00oo00O(c = "multispace.multiapp.clone.view.apps.AppsViewModel$updateApkOrder$1", f = "AppsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oo00O extends o0OOO0.o0 implements o0OOOO.o0O00000<o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ List<o0OOoOO.o00ooO0> $dataList;
        public final /* synthetic */ int $userID;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo00O(int i, List<o0OOoOO.o00ooO0> list, o0OO.o00oOo0O<? super o00oo00O> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$userID = i;
            this.$dataList = list;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oo00O(this.$userID, this.$dataList, o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0O0oo00 o0o0oo00, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oo00O) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                oo0ooO.o00oo0(obj);
                o0O000.this.repo.o00oOoo0(this.$userID, this.$dataList);
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o0OOoO0.o00oo.o00oOOo0(new byte[]{86, Ascii.SYN, -76, 96, oo0OOoo.f13516o00oOoO, 46, -98, -13, Ascii.DC2, 5, -67, Byte.MAX_VALUE, 104, 55, -108, -12, Ascii.NAK, Ascii.NAK, -67, 106, 114, 40, -108, -13, Ascii.DC2, Ascii.RS, -74, 122, 114, 49, -108, -12, Ascii.NAK, 0, -79, 120, 117, 122, -110, -68, 71, Ascii.CAN, -83, 120, 116, 52, -108}, new byte[]{53, 119, -40, Ascii.FF, Ascii.GS, 90, -15, -45}));
        }
    }

    public o0O000(@NotNull o0OoOoOo o0oooooo) {
        o0ooO.o00oo0O0(o0oooooo, o0OOoO0.o00oo.o00oOOo0(new byte[]{-16, 50, -20, -20}, new byte[]{-126, 87, -100, -125, 72, -62, -83, Ascii.NAK}));
        this.repo = o0oooooo;
        this.appsLiveData = new o0O0OOOo<>();
        this.resultLiveData = new o0O0OOOo<>();
        this.launchLiveData = new o0O0OOOo<>();
        this.updateSortLiveData = new o0O0OOOo<>();
    }

    public final void clearApkData(@NotNull String str, int i) {
        o0ooO.o00oo0O0(str, o0OOoO0.o00oo.o00oOOo0(new byte[]{-80, -8, -103, 84, Ascii.DC4, -20, 65, 46, -95, -12, -97}, new byte[]{-64, -103, -6, 63, 117, -117, 36, 96}));
        launchOnUI(new o00oOOo0(str, i, null));
    }

    @NotNull
    public final o0O0OOOo<List<o0OOoOO.o00ooO0>> getAppsLiveData() {
        return this.appsLiveData;
    }

    public final void getInstalledApps(int i) {
        launchOnUI(new o00oOOoO(i, null));
    }

    @NotNull
    public final o0O0OOOo<Boolean> getLaunchLiveData() {
        return this.launchLiveData;
    }

    @NotNull
    public final o0O0OOOo<String> getResultLiveData() {
        return this.resultLiveData;
    }

    @NotNull
    public final o0O0OOOo<Boolean> getUpdateSortLiveData() {
        return this.updateSortLiveData;
    }

    public final void install(@NotNull String str, int i) {
        o0ooO.o00oo0O0(str, o0OOoO0.o00oo.o00oOOo0(new byte[]{32, 114, Byte.MIN_VALUE, -52, -57, Ascii.FS}, new byte[]{83, Ascii.GS, -11, -66, -92, 121, 89, -121}));
        launchOnUI(new o00oOo00(str, i, null));
    }

    public final void launchApk(@NotNull String str, int i) {
        o0ooO.o00oo0O0(str, o0OOoO0.o00oo.o00oOOo0(new byte[]{-39, 108, -82, 19, 52, 42, Ascii.US, Ascii.CAN, -56, 96, -88}, new byte[]{-87, Ascii.CR, -51, 120, 85, 77, 122, 86}));
        launchOnUI(new o00oOo0O(str, i, null));
    }

    public final void unInstall(@NotNull String str, int i) {
        o0ooO.o00oo0O0(str, o0OOoO0.o00oo.o00oOOo0(new byte[]{-34, -69, -20, -89, Ascii.RS, -18, 103, 84, -49, -73, -22}, new byte[]{-82, -38, -113, -52, Byte.MAX_VALUE, -119, 2, Ascii.SUB}));
        launchOnUI(new o00oOoO(str, i, null));
    }

    public final void updateApkOrder(int i, @NotNull List<o0OOoOO.o00ooO0> list) {
        o0ooO.o00oo0O0(list, o0OOoO0.o00oo.o00oOOo0(new byte[]{-11, -34, Ascii.GS, 116, -43, 35, -77, 97}, new byte[]{-111, -65, 105, Ascii.NAK, -103, 74, -64, Ascii.NAK}));
        launchOnUI(new o00oo00O(i, list, null));
    }
}
