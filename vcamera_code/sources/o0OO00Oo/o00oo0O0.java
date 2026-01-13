package o0OO00Oo;

import android.app.Application;
/* loaded from: classes2.dex */
public class o00oo0O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final Application f13001o00oOOo0;

    static {
        Application application;
        Throwable th;
        try {
            try {
                application = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, new Object[0]);
                if (application == null) {
                    try {
                        throw new IllegalStateException("Static initialization of Applications must be on main thread.");
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        try {
                            application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                            e.printStackTrace();
                        }
                        f13001o00oOOo0 = application;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                f13001o00oOOo0 = application;
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            application = null;
        } catch (Throwable th3) {
            application = null;
            th = th3;
            f13001o00oOOo0 = application;
            throw th;
        }
        f13001o00oOOo0 = application;
    }

    public static Application o00oOOo0() {
        return f13001o00oOOo0;
    }
}
