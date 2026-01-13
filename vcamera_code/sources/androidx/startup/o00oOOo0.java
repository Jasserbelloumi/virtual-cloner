package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0Oo0O.o00oOo00;
import o0OooO0.o0O0OOO;
import o0OooO0.o0O0OOO0;
/* loaded from: classes.dex */
public final class o00oOOo0 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static volatile o00oOOo0 f4937o00oOo0O = null;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final Object f4938o00oOo0o = new Object();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f4939o00oOooO = "Startup";
    @oo0oO0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Context f4942o00oOo00;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Set<Class<? extends o0O0OOO0<?>>> f4941o00oOOoO = new HashSet();
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Map<Class<?>, Object> f4940o00oOOo0 = new HashMap();

    public o00oOOo0(@oo0oO0 Context context) {
        this.f4942o00oOo00 = context.getApplicationContext();
    }

    @oo0oO0
    public static o00oOOo0 o00oOo0O(@oo0oO0 Context context) {
        if (f4937o00oOo0O == null) {
            synchronized (f4938o00oOo0o) {
                if (f4937o00oOo0O == null) {
                    f4937o00oOo0O = new o00oOOo0(context);
                }
            }
        }
        return f4937o00oOo0O;
    }

    public static void o00oOoO(@oo0oO0 o00oOOo0 o00oooo02) {
        synchronized (f4938o00oOo0o) {
            f4937o00oOo0O = o00oooo02;
        }
    }

    public void o00oOOo0() {
        try {
            try {
                Trace.beginSection(f4939o00oOooO);
                o00oOOoO(this.f4942o00oOo00.getPackageManager().getProviderInfo(new ComponentName(this.f4942o00oOo00.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e) {
                throw new o0O0OOO(e);
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o00oOOoO(@o0OO00OO Bundle bundle) {
        String string = this.f4942o00oOo00.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (o0O0OOO0.class.isAssignableFrom(cls)) {
                            this.f4941o00oOOoO.add(cls);
                        }
                    }
                }
                for (Class<? extends o0O0OOO0<?>> cls2 : this.f4941o00oOOoO) {
                    o00oOooO(cls2, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new o0O0OOO(e);
            }
        }
    }

    @oo0oO0
    public <T> T o00oOo00(@oo0oO0 Class<? extends o0O0OOO0<?>> cls) {
        T t;
        synchronized (f4938o00oOo0o) {
            t = (T) this.f4940o00oOOo0.get(cls);
            if (t == null) {
                t = (T) o00oOooO(cls, new HashSet());
            }
        }
        return t;
    }

    @oo0oO0
    public <T> T o00oOo0o(@oo0oO0 Class<? extends o0O0OOO0<T>> cls) {
        return (T) o00oOo00(cls);
    }

    public boolean o00oOoO0(@oo0oO0 Class<? extends o0O0OOO0<?>> cls) {
        return this.f4941o00oOOoO.contains(cls);
    }

    @oo0oO0
    public final <T> T o00oOooO(@oo0oO0 Class<? extends o0O0OOO0<?>> cls, @oo0oO0 Set<Class<?>> set) {
        T t;
        if (o00oOo00.o00oOoO()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f4940o00oOOo0.containsKey(cls)) {
            t = (T) this.f4940o00oOOo0.get(cls);
        } else {
            set.add(cls);
            o0O0OOO0<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            List<Class<? extends o0O0OOO0<?>>> dependencies = newInstance.dependencies();
            if (!dependencies.isEmpty()) {
                for (Class<? extends o0O0OOO0<?>> cls2 : dependencies) {
                    if (!this.f4940o00oOOo0.containsKey(cls2)) {
                        o00oOooO(cls2, set);
                    }
                }
            }
            t = (T) newInstance.o00oOOo0(this.f4942o00oOo00);
            set.remove(cls);
            this.f4940o00oOOo0.put(cls, t);
        }
        return t;
    }
}
