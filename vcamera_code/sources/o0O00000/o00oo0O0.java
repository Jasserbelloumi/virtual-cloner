package o0O00000;

import android.location.LocationManager;
import java.util.concurrent.Callable;
import o0O00000.o00oo;
/* loaded from: classes.dex */
public final /* synthetic */ class o00oo0O0 implements Callable {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final /* synthetic */ LocationManager f10202o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final /* synthetic */ o00oo.o00oo0O0 f10203o00oOOoO;

    public /* synthetic */ o00oo0O0(LocationManager locationManager, o00oo.o00oo0O0 o00oo0o02) {
        this.f10202o00oOOo0 = locationManager;
        this.f10203o00oOOoO = o00oo0o02;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean o00oOoOO2;
        o00oOoOO2 = o00oo.o00oOoOO(this.f10202o00oOOo0, this.f10203o00oOOoO);
        return o00oOoOO2;
    }
}
