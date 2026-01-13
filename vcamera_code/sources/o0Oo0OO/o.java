package o0Oo0OO;

import androidx.lifecycle.o0O0OOOo;
import com.google.common.base.Ascii;
import java.util.List;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0ooO;
import o0OOO0.o0;
import o0OOO0.o00oo00O;
import o0OOO0oo.oo0OOoo;
import o0OOOOO0.o0ooO;
import o0OOo00O.o0O0oo00;
import o0OOoO0.o00oo;
import o0OOoOO.o0O000;
import o0OOoOo.o0OoOoOo;
import o0Oo0O0O.o0O00000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0017"}, d2 = {"Lo0Oo0OO/o;", "Lo0Oo0O0O/o0O00000;", "Lo0OO0o/oO0Ooooo;", "previewInstalledList", "", "userID", "getInstallAppList", "getInstalledModules", "Lo0OOoOo/o0OoOoOo;", "repo", "Lo0OOoOo/o0OoOoOo;", "Landroidx/lifecycle/o0O0OOOo;", "", "Lo0OOoOO/o0O000;", "appsLiveData", "Landroidx/lifecycle/o0O0OOOo;", "getAppsLiveData", "()Landroidx/lifecycle/o0O0OOOo;", "", "loadingLiveData", "getLoadingLiveData", "<init>", "(Lo0OOoOo/o0OoOoOo;)V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class o extends o0O00000 {
    @NotNull
    private final o0O0OOOo<List<o0O000>> appsLiveData;
    @NotNull
    private final o0O0OOOo<Boolean> loadingLiveData;
    @NotNull
    private final o0OoOoOo repo;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o00oo00O(c = "multispace.multiapp.clone.view.list.ListViewModel$getInstallAppList$1", f = "ListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0 implements o0OOOO.o0O00000<o0O0oo00, o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ int $userID;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(int i, o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$userID = i;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            return new o00oOOo0(this.$userID, o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0O0oo00 o0o0oo00, @Nullable o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOo0) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                oo0ooO.o00oo0(obj);
                o.this.repo.o00oOOoO(this.$userID, o.this.getLoadingLiveData(), o.this.getAppsLiveData());
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o00oo.o00oOOo0(new byte[]{122, -123, 39, Ascii.SYN, 80, 82, 114, 118, 62, -106, 46, 9, 5, 75, 120, 113, 57, -122, 46, Ascii.FS, Ascii.US, 84, 120, 118, 62, -115, 37, Ascii.FF, Ascii.US, 77, 120, 113, 57, -109, 34, Ascii.SO, Ascii.CAN, 6, 126, 57, 107, -117, 62, Ascii.SO, Ascii.EM, 72, 120}, new byte[]{Ascii.EM, -28, 75, 122, 112, 38, Ascii.GS, 86}));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o00oo00O(c = "multispace.multiapp.clone.view.list.ListViewModel$getInstalledModules$1", f = "ListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0 implements o0OOOO.o0O00000<o0O0oo00, o00oOo0O<? super oO0Ooooo>, Object> {
        public int label;

        public o00oOOoO(o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            return new o00oOOoO(o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0O0oo00 o0o0oo00, @Nullable o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOoO) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                oo0ooO.o00oo0(obj);
                o.this.repo.o00oOo00(o.this.getLoadingLiveData(), o.this.getAppsLiveData());
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o00oo.o00oOOo0(new byte[]{59, 66, 75, -103, -78, Ascii.ETB, -15, -25, Byte.MAX_VALUE, 81, 66, -122, -25, Ascii.SO, -5, -32, 120, 65, 66, -109, -3, 17, -5, -25, Byte.MAX_VALUE, 74, 73, -125, -3, 8, -5, -32, 120, 84, 78, -127, -6, 67, -3, -88, 42, 76, 82, -127, -5, Ascii.CR, -5}, new byte[]{88, 35, 39, -11, -110, 99, -98, -57}));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o00oo00O(c = "multispace.multiapp.clone.view.list.ListViewModel$previewInstalledList$1", f = "ListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0 implements o0OOOO.o0O00000<o0O0oo00, o00oOo0O<? super oO0Ooooo>, Object> {
        public int label;

        public o00oOo00(o00oOo0O<? super o00oOo00> o00ooo0o2) {
            super(2, o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            return new o00oOo00(o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0O0oo00 o0o0oo00, @Nullable o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOo00) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                oo0ooO.o00oo0(obj);
                o.this.repo.o00oOoO();
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o00oo.o00oOOo0(new byte[]{44, -92, 0, Ascii.GS, 65, -42, -43, 82, 104, -73, 9, 2, Ascii.DC4, -49, -33, 85, 111, -89, 9, Ascii.ETB, Ascii.SO, -48, -33, 82, 104, -84, 2, 7, Ascii.SO, -55, -33, 85, 111, -78, 5, 5, 9, -126, -39, Ascii.GS, oo0OOoo.f13516o00oOoO, -86, Ascii.EM, 5, 8, -52, -33}, new byte[]{79, -59, 108, 113, 97, -94, -70, 114}));
        }
    }

    public o(@NotNull o0OoOoOo o0oooooo) {
        o0ooO.o00oo0O0(o0oooooo, o00oo.o00oOOo0(new byte[]{58, -52, 102, 37}, new byte[]{72, -87, Ascii.SYN, 74, -120, -55, -55, -56}));
        this.repo = o0oooooo;
        this.appsLiveData = new o0O0OOOo<>();
        this.loadingLiveData = new o0O0OOOo<>();
    }

    @NotNull
    public final o0O0OOOo<List<o0O000>> getAppsLiveData() {
        return this.appsLiveData;
    }

    public final void getInstallAppList(int i) {
        launchOnUI(new o00oOOo0(i, null));
    }

    public final void getInstalledModules() {
        launchOnUI(new o00oOOoO(null));
    }

    @NotNull
    public final o0O0OOOo<Boolean> getLoadingLiveData() {
        return this.loadingLiveData;
    }

    public final void previewInstalledList() {
        launchOnUI(new o00oOo00(null));
    }
}
