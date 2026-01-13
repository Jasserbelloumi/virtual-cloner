package o0OOoOo;

import androidx.lifecycle.o0O0OOOo;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import multispace.multiapp.clone.bean.LocationInfo;
import o0O0oooo.o0OO;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import o0OOoOO.o00ooO0;
import o0OOooOo.o0O;
import o0OOooo.o0O00OOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lo0OOoOo/o0OoO00O;", "", "", "xpModulePkg", "Landroidx/lifecycle/o0O0OOOo;", "", "Lo0OOoOO/o00ooO0;", "appsLiveData", "", "from", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "Lo0OOoOo/o0OoOoOo;", "Lo0OOoOo/o0OoOoOo;", "appsRepository", "<init>", "()V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class o0OoO00O {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0OoOoOo f14911o00oOOo0 = new o0OoOoOo();

    public final void o00oOOo0(@Nullable String str, @NotNull o0O0OOOo<List<o00ooO0>> o0o0oooo, int i) {
        o0ooO.o00oo0O0(o0o0oooo, o00oo.o00oOOo0(new byte[]{-14, -39, 83, -13, -6, 66, -91, -117, -41, -56, 87, -31}, new byte[]{-109, -87, 35, Byte.MIN_VALUE, -74, 43, -45, -18}));
        o0O0OOOo<List<o00ooO0>> o0o0oooo2 = new o0O0OOOo<>();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int[] o00oOo0o2 = o0OO.o00oOo0o();
        o0ooO.o00oo0OO(o00oOo0o2, o00oo.o00oOOo0(new byte[]{114, -108, 6, 69, 10, 95, 37, -41, 116, -109, Ascii.RS, 97, 41, 77, 41, -55, 70, -127, 19, 103, Ascii.EM, Ascii.SYN, 101}, new byte[]{Ascii.NAK, -15, 114, 4, 124, 62, 76, -69}));
        for (int i2 : o00oOo0o2) {
            List<o00ooO0> o00oOo0O2 = this.f14911o00oOOo0.o00oOo0O(i2, o0o0oooo2);
            if (!o00oOo0O2.isEmpty()) {
                for (o00ooO0 o00ooo02 : o00oOo0O2) {
                    if (!hashSet.contains(o00ooo02.f14888o00oOo00)) {
                        hashSet.add(o00ooo02.f14888o00oOo00);
                        if (!o0Oo00oO.o0O000Oo.f15676o00oOOo0.contains(o00ooo02.f14888o00oOo00)) {
                            if (i == 1) {
                                HashSet<String> o00oOooO2 = o0O00OOO.o00oOo00().o00oOooO(str);
                                if (o00oOooO2 != null && o00oOooO2.contains(o00ooo02.f14888o00oOo00)) {
                                    o00ooo02.f14889o00oOo0O = true;
                                    arrayList.add(0, o00ooo02);
                                }
                                arrayList.add(o00ooo02);
                            } else if (i == 2) {
                                LocationInfo o00oOOoO2 = o0O.o00oOo00().o00oOOoO(o00ooo02.f14888o00oOo00);
                                if (o00oOOoO2 != null && o00oOOoO2.o00oOo0O()) {
                                    arrayList.add(0, o00ooo02);
                                }
                                arrayList.add(o00ooo02);
                            }
                        }
                    }
                }
            }
        }
        o0o0oooo.o00oo0OO(arrayList);
    }
}
