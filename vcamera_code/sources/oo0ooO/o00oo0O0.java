package oo0ooO;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
/* loaded from: classes2.dex */
public final class o00oo0O0 implements ComponentCallbacks {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o00oOOo0 f17421o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f17422o00oo0O0;

    /* loaded from: classes2.dex */
    public interface o00oOOo0 {
        default void o00oOOo0(int i) {
        }
    }

    public o00oo0O0(Configuration configuration) {
        this.f17422o00oo0O0 = configuration.orientation;
    }

    public void o00oOOo0(Context context, o00oOOo0 o00oooo02) {
        context.getApplicationContext().registerComponentCallbacks(this);
        this.f17421o00oo0O = o00oooo02;
    }

    public void o00oOOoO(Context context) {
        context.getApplicationContext().unregisterComponentCallbacks(this);
        this.f17421o00oo0O = null;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        int i = this.f17422o00oo0O0;
        int i2 = configuration.orientation;
        if (i == i2) {
            return;
        }
        this.f17422o00oo0O0 = i2;
        o00oOOo0 o00oooo02 = this.f17421o00oo0O;
        if (o00oooo02 == null) {
            return;
        }
        o00oooo02.o00oOOo0(i2);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
