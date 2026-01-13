package o0oOoo00;

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
import o0OOoOO.o00ooO0;
import o0OOoOo.o0OoO00O;
import o0Oo0O0O.o0O00000;
import o0Oo0oo0.o0OO0o00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lo0oOoo00/o0O000o0;", "Lo0Oo0O0O/o0O00000;", "", "modulePkg", "", "from", "Lo0OO0o/oO0Ooooo;", "getAllVmInstallList", "Lo0OOoOo/o0OoO00O;", "repo", "Lo0OOoOo/o0OoO00O;", "Landroidx/lifecycle/o0O0OOOo;", "", "Lo0OOoOO/o00ooO0;", "appsLiveData", "Landroidx/lifecycle/o0O0OOOo;", "getAppsLiveData", "()Landroidx/lifecycle/o0O0OOOo;", "<init>", "(Lo0OOoOo/o0OoO00O;)V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class o0O000o0 extends o0O00000 {
    @NotNull
    private final o0O0OOOo<List<o00ooO0>> appsLiveData;
    @NotNull
    private final o0OoO00O repo;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o00oo00O(c = "multispace.multiapp.clone.view.pro.xpsetting.XpSettingsViewModel$getAllVmInstallList$1", f = "XpSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0 implements o0OOOO.o0O00000<o0O0oo00, o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ int $from;
        public final /* synthetic */ String $modulePkg;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(String str, int i, o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$modulePkg = str;
            this.$from = i;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            return new o00oOOo0(this.$modulePkg, this.$from, o00ooo0o2);
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
                o0O000o0.this.repo.o00oOOo0(this.$modulePkg, o0O000o0.this.getAppsLiveData(), this.$from);
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o00oo.o00oOOo0(new byte[]{126, -122, 47, 82, -7, Ascii.SI, 43, Byte.MAX_VALUE, 58, -107, 38, 77, -84, Ascii.SYN, o0OO0o00.f16655o00oOoOO, 120, oo0OOoo.f13516o00oOoO, -123, 38, 88, -74, 9, o0OO0o00.f16655o00oOoOO, Byte.MAX_VALUE, 58, -114, 45, 72, -74, Ascii.DLE, o0OO0o00.f16655o00oOoOO, 120, oo0OOoo.f13516o00oOoO, -112, 42, 74, -79, 91, 39, 48, 111, -120, 54, 74, -80, Ascii.NAK, o0OO0o00.f16655o00oOoOO}, new byte[]{Ascii.GS, -25, 67, 62, -39, 123, 68, 95}));
        }
    }

    public o0O000o0(@NotNull o0OoO00O o0ooo00o) {
        o0ooO.o00oo0O0(o0ooo00o, o00oo.o00oOOo0(new byte[]{56, 42, -2, -60}, new byte[]{74, 79, -114, -85, -45, 60, 90, 37}));
        this.repo = o0ooo00o;
        this.appsLiveData = new o0O0OOOo<>();
    }

    public final void getAllVmInstallList(@Nullable String str, int i) {
        launchOnUI(new o00oOOo0(str, i, null));
    }

    @NotNull
    public final o0O0OOOo<List<o00ooO0>> getAppsLiveData() {
        return this.appsLiveData;
    }
}
