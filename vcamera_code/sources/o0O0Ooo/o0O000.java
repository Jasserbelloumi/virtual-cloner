package o0O0Ooo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.o0O0OOOo;
import com.google.common.util.concurrent.ListenableFuture;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0O000O;
import o0O0o0o.o00ooO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0O000 implements o0O0Ooo0.o0O000O {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0O0OOOo<o0O000O.o00oOOoO> f12055o00oOo00 = new o0O0OOOo<>();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o00ooO<o0O000O.o00oOOoO.o00oOo00> f12056o00oOooO = o00ooO.o00oo0oO();

    public o0O000() {
        o00oOOo0(o0O0Ooo0.o0O000O.f12173o00oOOoO);
    }

    @Override // o0O0Ooo0.o0O000O
    @oo0oO0
    public ListenableFuture<o0O000O.o00oOOoO.o00oOo00> getResult() {
        return this.f12056o00oOooO;
    }

    @Override // o0O0Ooo0.o0O000O
    @oo0oO0
    public LiveData<o0O000O.o00oOOoO> getState() {
        return this.f12055o00oOo00;
    }

    public void o00oOOo0(@oo0oO0 o0O000O.o00oOOoO o00ooooo2) {
        this.f12055o00oOo00.o00oo0OO(o00ooooo2);
        if (o00ooooo2 instanceof o0O000O.o00oOOoO.o00oOo00) {
            this.f12056o00oOooO.o00oo0O0((o0O000O.o00oOOoO.o00oOo00) o00ooooo2);
        } else if (o00ooooo2 instanceof o0O000O.o00oOOoO.o00oOOo0) {
            this.f12056o00oOooO.o00oo0O(((o0O000O.o00oOOoO.o00oOOo0) o00ooooo2).f12174o00oOOo0);
        }
    }
}
