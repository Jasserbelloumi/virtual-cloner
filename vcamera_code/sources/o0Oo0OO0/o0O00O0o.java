package o0Oo0OO0;

import androidx.lifecycle.o0O0OOOo;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
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
import o0OOoOO.o0O0000O;
import o0Oo0O0O.o0O00000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0017"}, d2 = {"Lo0Oo0OO0/o0O00O0o;", "Lo0Oo0O0O/o0O00000;", "Lo0OO0o/oO0Ooooo;", "getInstalledUser", "", "userID", "installGms", "uninstallGms", "Lo0OOoOo/o0O00;", "mRepo", "Lo0OOoOo/o0O00;", "Landroidx/lifecycle/o0O0OOOo;", "", "Lo0OOoOO/o0O00000;", "mInstalledLiveData", "Landroidx/lifecycle/o0O0OOOo;", "getMInstalledLiveData", "()Landroidx/lifecycle/o0O0OOOo;", "Lo0OOoOO/o0O0000O;", "mUpdateInstalledLiveData", "getMUpdateInstalledLiveData", "<init>", "(Lo0OOoOo/o0O00;)V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class o0O00O0o extends o0O00000 {
    @NotNull
    private final o0O0OOOo<List<o0OOoOO.o0O00000>> mInstalledLiveData;
    @NotNull
    private final o0OOoOo.o0O00 mRepo;
    @NotNull
    private final o0O0OOOo<o0O0000O> mUpdateInstalledLiveData;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o00oo00O(c = "multispace.multiapp.clone.view.gms.GmsViewModel$getInstalledUser$1", f = "GmsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0 implements o0OOOO.o0O00000<o0O0oo00, o00oOo0O<? super oO0Ooooo>, Object> {
        public int label;

        public o00oOOo0(o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            return new o00oOOo0(o00ooo0o2);
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
                o0O00O0o.this.mRepo.o00oOOo0(o0O00O0o.this.getMInstalledLiveData());
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o00oo.o00oOOo0(new byte[]{-46, 87, 72, -47, -15, 7, SignedBytes.MAX_POWER_OF_TWO, 88, -106, 68, 65, -50, -92, Ascii.RS, 74, 95, -111, 84, 65, -37, -66, 1, 74, 88, -106, 95, 74, -53, -66, Ascii.CAN, 74, 95, -111, 65, 77, -55, -71, 83, 76, Ascii.ETB, -61, 89, 81, -55, -72, Ascii.GS, 74}, new byte[]{-79, 54, 36, -67, -47, 115, 47, 120}));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o00oo00O(c = "multispace.multiapp.clone.view.gms.GmsViewModel$installGms$1", f = "GmsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0 implements o0OOOO.o0O00000<o0O0oo00, o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ int $userID;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(int i, o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$userID = i;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            return new o00oOOoO(this.$userID, o00ooo0o2);
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
                o0O00O0o.this.mRepo.o00oOOoO(this.$userID, o0O00O0o.this.getMUpdateInstalledLiveData());
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o00oo.o00oOOo0(new byte[]{96, -59, -21, 69, 120, -114, 3, 106, 36, -42, -30, 90, 45, -105, 9, 109, 35, -58, -30, 79, 55, -120, 9, 106, 36, -51, -23, 95, 55, -111, 9, 109, 35, -45, -18, 93, 48, -38, Ascii.SI, 37, 113, -53, -14, 93, 49, -108, 9}, new byte[]{3, -92, -121, 41, 88, -6, 108, 74}));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o00oo00O(c = "multispace.multiapp.clone.view.gms.GmsViewModel$uninstallGms$1", f = "GmsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0 implements o0OOOO.o0O00000<o0O0oo00, o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ int $userID;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(int i, o00oOo0O<? super o00oOo00> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$userID = i;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            return new o00oOo00(this.$userID, o00ooo0o2);
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
                o0O00O0o.this.mRepo.o00oOo00(this.$userID, o0O00O0o.this.getMUpdateInstalledLiveData());
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o00oo.o00oOOo0(new byte[]{Ascii.ESC, -40, 81, 113, -18, 69, -111, 70, 95, -53, 88, 110, -69, 92, -101, 65, 88, -37, 88, 123, -95, 67, -101, 70, 95, -48, 83, 107, -95, 90, -101, 65, 88, -50, 84, 105, -90, 17, -99, 9, 10, -42, 72, 105, -89, 95, -101}, new byte[]{120, -71, oo0OOoo.f13516o00oOoO, Ascii.GS, -50, 49, -2, 102}));
        }
    }

    public o0O00O0o(@NotNull o0OOoOo.o0O00 o0o00) {
        o0ooO.o00oo0O0(o0o00, o00oo.o00oOOo0(new byte[]{-89, -58, -30, -59, -78}, new byte[]{-54, -108, -121, -75, -35, -8, -64, 36}));
        this.mRepo = o0o00;
        this.mInstalledLiveData = new o0O0OOOo<>();
        this.mUpdateInstalledLiveData = new o0O0OOOo<>();
    }

    public final void getInstalledUser() {
        launchOnUI(new o00oOOo0(null));
    }

    @NotNull
    public final o0O0OOOo<List<o0OOoOO.o0O00000>> getMInstalledLiveData() {
        return this.mInstalledLiveData;
    }

    @NotNull
    public final o0O0OOOo<o0O0000O> getMUpdateInstalledLiveData() {
        return this.mUpdateInstalledLiveData;
    }

    public final void installGms(int i) {
        launchOnUI(new o00oOOoO(i, null));
    }

    public final void uninstallGms(int i) {
        launchOnUI(new o00oOo00(i, null));
    }
}
