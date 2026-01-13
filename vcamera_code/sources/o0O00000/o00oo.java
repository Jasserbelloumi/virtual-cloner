package o0O00000;

import android.annotation.SuppressLint;
import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO0;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O000.o00oOoO;
import o0O000.o00oo0O0;
import o0O00000.o00oOOo0;
import o0O00000.o00oo;
import o0O00000.o0O0oo0o;
import o0ooOoOO.o;
import o0ooOoOO.oO0Ooooo;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public final class o00oo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final long f10163o00oOOo0 = 30000;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final long f10164o00oOOoO = 10000;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final long f10165o00oOo00 = 5;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static Class<?> f10166o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static Method f10167o00oOo0o;
    @o0O0OOOo("sLocationListeners")

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final WeakHashMap<o0O0o, WeakReference<C0123o00oo>> f10168o00oOoO = new WeakHashMap<>();

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static Method f10169o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static Field f10170o00oOooO;

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static Class<?> f10171o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static Method f10172o00oOOoO;

        @o0O0O0Oo
        public static boolean o00oOOo0(LocationManager locationManager, String str, o0O0oo0o o0o0oo0o, o0O00000.o00oo0OO o00oo0oo, Looper looper) {
            try {
                if (f10171o00oOOo0 == null) {
                    f10171o00oOOo0 = Class.forName("android.location.LocationRequest");
                }
                if (f10172o00oOOoO == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f10171o00oOOo0, LocationListener.class, Looper.class);
                    f10172o00oOOoO = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest o00oOoOO2 = o0o0oo0o.o00oOoOO(str);
                if (o00oOoOO2 != null) {
                    f10172o00oOOoO.invoke(locationManager, o00oOoOO2, o00oo0oo, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        @o0O0O0Oo
        @o0OO0oO0(anyOf = {oo0oO0.o00oo0.f17346o00ooOoO, oo0oO0.o00oo0.f17344o00ooOo})
        public static boolean o00oOOoO(LocationManager locationManager, String str, o0O0oo0o o0o0oo0o, C0123o00oo c0123o00oo) {
            try {
                if (f10171o00oOOo0 == null) {
                    f10171o00oOOo0 = Class.forName("android.location.LocationRequest");
                }
                if (f10172o00oOOoO == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f10171o00oOOo0, LocationListener.class, Looper.class);
                    f10172o00oOOoO = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest o00oOoOO2 = o0o0oo0o.o00oOoOO(str);
                if (o00oOoOO2 != null) {
                    synchronized (o00oo.f10168o00oOoO) {
                        f10172o00oOOoO.invoke(locationManager, o00oOoOO2, c0123o00oo, Looper.getMainLooper());
                        o00oo.o00oo0O0(locationManager, c0123o00oo);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        @o0OO0oO0(oo0oO0.o00oo0.f17344o00ooOo)
        public static boolean o00oOOo0(@oo0oO0 LocationManager locationManager, @oo0oO0 GnssMeasurementsEvent.Callback callback, @oo0oO0 Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        @o0O0O0Oo
        @o0OO0oO0(anyOf = {oo0oO0.o00oo0.f17346o00ooOoO, oo0oO0.o00oo0.f17344o00ooOo})
        public static boolean o00oOOoO(LocationManager locationManager, Handler handler, Executor executor, o00oOOo0.AbstractC0121o00oOOo0 abstractC0121o00oOOo0) {
            ooOOOOoo.o00oOOo0(handler != null);
            androidx.collection.o00ooO0<Object, Object> o00ooo02 = o00oo0.f10177o00oOOo0;
            synchronized (o00ooo02) {
                o00ooO0 o00ooo03 = (o00ooO0) o00ooo02.get(abstractC0121o00oOOo0);
                if (o00ooo03 == null) {
                    o00ooo03 = new o00ooO0(abstractC0121o00oOOo0);
                } else {
                    o00ooo03.o00oOoOo();
                }
                o00ooo03.o00oOoOO(executor);
                if (locationManager.registerGnssStatusCallback(o00ooo03, handler)) {
                    o00ooo02.put(abstractC0121o00oOOo0, o00ooo03);
                    return true;
                }
                return false;
            }
        }

        @o0O0O0Oo
        public static void o00oOo00(@oo0oO0 LocationManager locationManager, @oo0oO0 GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        @o0O0O0Oo
        public static void o00oOooO(LocationManager locationManager, Object obj) {
            if (obj instanceof o00ooO0) {
                ((o00ooO0) obj).o00oOoOo();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static String o00oOOo0(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @o0O0O0Oo
        public static int o00oOOoO(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @o0O0O0Oo
        public static boolean o00oOo00(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    @o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static Class<?> f10173o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static Method f10174o00oOOoO;

        @o0O0O0Oo
        @o0OO0oO0(anyOf = {oo0oO0.o00oo0.f17346o00ooOoO, oo0oO0.o00oo0.f17344o00ooOo})
        public static void o00oOOo0(LocationManager locationManager, @oo0oO0 String str, @o0OO00OO o0O000.o00oOoO o00oooo2, @oo0oO0 Executor executor, @oo0oO0 final o<Location> oVar) {
            CancellationSignal cancellationSignal = o00oooo2 != null ? (CancellationSignal) o00oooo2.o00oOOoO() : null;
            Objects.requireNonNull(oVar);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new Consumer() { // from class: o0O00000.o0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    o.this.accept((Location) obj);
                }
            });
        }

        @o0O0O0Oo
        @o0OO0oO0(anyOf = {oo0oO0.o00oo0.f17346o00ooOoO, oo0oO0.o00oo0.f17344o00ooOo})
        public static boolean o00oOOoO(LocationManager locationManager, Handler handler, Executor executor, o00oOOo0.AbstractC0121o00oOOo0 abstractC0121o00oOOo0) {
            boolean registerGnssStatusCallback;
            androidx.collection.o00ooO0<Object, Object> o00ooo02 = o00oo0.f10177o00oOOo0;
            synchronized (o00ooo02) {
                o00oo0OO o00oo0oo = (o00oo0OO) o00ooo02.get(abstractC0121o00oOOo0);
                if (o00oo0oo == null) {
                    o00oo0oo = new o00oo0OO(abstractC0121o00oOOo0);
                }
                registerGnssStatusCallback = locationManager.registerGnssStatusCallback(executor, o00oo0oo);
                if (registerGnssStatusCallback) {
                    o00ooo02.put(abstractC0121o00oOOo0, o00oo0oo);
                    return true;
                }
                return false;
            }
        }

        @o0O0O0Oo
        public static boolean o00oOo00(LocationManager locationManager, String str, o0O0oo0o o0o0oo0o, Executor executor, o0O00000.o00oo0OO o00oo0oo) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (f10173o00oOOo0 == null) {
                        f10173o00oOOo0 = Class.forName("android.location.LocationRequest");
                    }
                    if (f10174o00oOOoO == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f10173o00oOOo0, Executor.class, LocationListener.class);
                        f10174o00oOOoO = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest o00oOoOO2 = o0o0oo0o.o00oOoOO(str);
                    if (o00oOoOO2 != null) {
                        f10174o00oOOoO.invoke(locationManager, o00oOoOO2, executor, o00oo0oo);
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    @o0OOooO0(31)
    /* loaded from: classes.dex */
    public static class o00oOoO {
        @o0O0O0Oo
        public static boolean o00oOOo0(LocationManager locationManager, @oo0oO0 String str) {
            boolean hasProvider;
            hasProvider = locationManager.hasProvider(str);
            return hasProvider;
        }

        @o0O0O0Oo
        @o0OO0oO0(oo0oO0.o00oo0.f17344o00ooOo)
        public static boolean o00oOOoO(@oo0oO0 LocationManager locationManager, @oo0oO0 Executor executor, @oo0oO0 GnssMeasurementsEvent.Callback callback) {
            boolean registerGnssMeasurementsCallback;
            registerGnssMeasurementsCallback = locationManager.registerGnssMeasurementsCallback(executor, callback);
            return registerGnssMeasurementsCallback;
        }

        @o0O0O0Oo
        @o0OO0oO0(anyOf = {oo0oO0.o00oo0.f17346o00ooOoO, oo0oO0.o00oo0.f17344o00ooOo})
        public static void o00oOo00(LocationManager locationManager, @oo0oO0 String str, @oo0oO0 LocationRequest locationRequest, @oo0oO0 Executor executor, @oo0oO0 LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* renamed from: o0O00000.o00oo$o00oo  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0123o00oo implements LocationListener {
        @o0OO00OO

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public volatile o0O0o f10175o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Executor f10176o00oOOoO;

        public C0123o00oo(@o0OO00OO o0O0o o0o0o, Executor executor) {
            this.f10175o00oOOo0 = o0o0o;
            this.f10176o00oOOoO = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oOoO(int i) {
            o0O0o o0o0o = this.f10175o00oOOo0;
            if (o0o0o == null) {
                return;
            }
            o0o0o.f10192o00oOOoO.onFlushComplete(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oOoOO(Location location) {
            o0O0o o0o0o = this.f10175o00oOOo0;
            if (o0o0o == null) {
                return;
            }
            o0o0o.f10192o00oOOoO.onLocationChanged(location);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oOoOo(List list) {
            o0O0o o0o0o = this.f10175o00oOOo0;
            if (o0o0o == null) {
                return;
            }
            o0o0o.f10192o00oOOoO.onLocationChanged(list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oOoo0(String str) {
            o0O0o o0o0o = this.f10175o00oOOo0;
            if (o0o0o == null) {
                return;
            }
            o0o0o.f10192o00oOOoO.onProviderDisabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oOooo(String str) {
            o0O0o o0o0o = this.f10175o00oOOo0;
            if (o0o0o == null) {
                return;
            }
            o0o0o.f10192o00oOOoO.onProviderEnabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oo00O(String str, int i, Bundle bundle) {
            o0O0o o0o0o = this.f10175o00oOOo0;
            if (o0o0o == null) {
                return;
            }
            o0o0o.f10192o00oOOoO.onStatusChanged(str, i, bundle);
        }

        public o0O0o o00oOoO0() {
            o0O0o o0o0o = this.f10175o00oOOo0;
            o0o0o.getClass();
            return o0o0o;
        }

        public void o00oo0() {
            this.f10175o00oOOo0 = null;
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i) {
            if (this.f10175o00oOOo0 == null) {
                return;
            }
            this.f10176o00oOOoO.execute(new Runnable() { // from class: o0O00000.o0O00O0o
                @Override // java.lang.Runnable
                public final void run() {
                    o00oo.C0123o00oo.this.o00oOoO(i);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@oo0oO0 final Location location) {
            if (this.f10175o00oOOo0 == null) {
                return;
            }
            this.f10176o00oOOoO.execute(new Runnable() { // from class: o0O00000.o0O00OOO
                @Override // java.lang.Runnable
                public final void run() {
                    o00oo.C0123o00oo.this.o00oOoOO(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@oo0oO0 final List<Location> list) {
            if (this.f10175o00oOOo0 == null) {
                return;
            }
            this.f10176o00oOOoO.execute(new Runnable() { // from class: o0O00000.o0O00O
                @Override // java.lang.Runnable
                public final void run() {
                    o00oo.C0123o00oo.this.o00oOoOo(list);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@oo0oO0 final String str) {
            if (this.f10175o00oOOo0 == null) {
                return;
            }
            this.f10176o00oOOoO.execute(new Runnable() { // from class: o0O00000.o0O00OO
                @Override // java.lang.Runnable
                public final void run() {
                    o00oo.C0123o00oo.this.o00oOoo0(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@oo0oO0 final String str) {
            if (this.f10175o00oOOo0 == null) {
                return;
            }
            this.f10176o00oOOoO.execute(new Runnable() { // from class: o0O00000.o0OoO00O
                @Override // java.lang.Runnable
                public final void run() {
                    o00oo.C0123o00oo.this.o00oOooo(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i, final Bundle bundle) {
            if (this.f10175o00oOOo0 == null) {
                return;
            }
            this.f10176o00oOOoO.execute(new Runnable() { // from class: o0O00000.o0oO0Ooo
                @Override // java.lang.Runnable
                public final void run() {
                    o00oo.C0123o00oo.this.o00oo00O(str, i, bundle);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0 {
        @o0O0OOOo("sGnssStatusListeners")

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final androidx.collection.o00ooO0<Object, Object> f10177o00oOOo0 = new androidx.collection.o00ooO0<>();
    }

    /* loaded from: classes.dex */
    public static final class o00oo00O implements LocationListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final LocationManager f10178o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Executor f10179o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Handler f10180o00oOo00 = new Handler(Looper.getMainLooper());
        @o0O0OOOo("this")

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public boolean f10181o00oOo0O;
        @o0OO00OO

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public Runnable f10182o00oOo0o;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public o<Location> f10183o00oOooO;

        public o00oo00O(LocationManager locationManager, Executor executor, o<Location> oVar) {
            this.f10178o00oOOo0 = locationManager;
            this.f10179o00oOOoO = executor;
            this.f10183o00oOooO = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oOo0o() {
            this.f10182o00oOo0o = null;
            onLocationChanged((Location) null);
        }

        @o0OO0oO0(anyOf = {oo0oO0.o00oo0.f17346o00ooOoO, oo0oO0.o00oo0.f17344o00ooOo})
        public void o00oOo00() {
            synchronized (this) {
                if (this.f10181o00oOo0O) {
                    return;
                }
                this.f10181o00oOo0O = true;
                o00oOooO();
            }
        }

        @SuppressLint({"MissingPermission"})
        public void o00oOoO0(long j) {
            synchronized (this) {
                if (this.f10181o00oOo0O) {
                    return;
                }
                Runnable runnable = new Runnable() { // from class: o0O00000.o0O000O
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00oo.o00oo00O.this.o00oOo0o();
                    }
                };
                this.f10182o00oOo0o = runnable;
                this.f10180o00oOo00.postDelayed(runnable, j);
            }
        }

        @o0OO0oO0(anyOf = {oo0oO0.o00oo0.f17346o00ooOoO, oo0oO0.o00oo0.f17344o00ooOo})
        public final void o00oOooO() {
            this.f10183o00oOooO = null;
            this.f10178o00oOOo0.removeUpdates(this);
            Runnable runnable = this.f10182o00oOo0o;
            if (runnable != null) {
                this.f10180o00oOo00.removeCallbacks(runnable);
                this.f10182o00oOo0o = null;
            }
        }

        @Override // android.location.LocationListener
        @o0OO0oO0(anyOf = {oo0oO0.o00oo0.f17346o00ooOoO, oo0oO0.o00oo0.f17344o00ooOo})
        public void onLocationChanged(@o0OO00OO final Location location) {
            synchronized (this) {
                if (this.f10181o00oOo0O) {
                    return;
                }
                this.f10181o00oOo0O = true;
                final o<Location> oVar = this.f10183o00oOooO;
                this.f10179o00oOOoO.execute(new Runnable() { // from class: o0O00000.o0OoOoOo
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.accept(location);
                    }
                });
                o00oOooO();
            }
        }

        @Override // android.location.LocationListener
        @o0OO0oO0(anyOf = {oo0oO0.o00oo0.f17346o00ooOoO, oo0oO0.o00oo0.f17344o00ooOo})
        public void onProviderDisabled(@oo0oO0 String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@oo0oO0 String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo0O implements Executor {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Handler f10184o00oo0O0;

        public o00oo0O(@oo0oO0 Handler handler) {
            handler.getClass();
            this.f10184o00oo0O0 = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@oo0oO0 Runnable runnable) {
            if (Looper.myLooper() == this.f10184o00oo0O0.getLooper()) {
                runnable.run();
                return;
            }
            Handler handler = this.f10184o00oo0O0;
            runnable.getClass();
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.f10184o00oo0O0 + " is shutting down");
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O0 implements GpsStatus.Listener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final LocationManager f10185o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o00oOOo0.AbstractC0121o00oOOo0 f10186o00oOOoO;
        @o0OO00OO

        /* renamed from: o00oOo00  reason: collision with root package name */
        public volatile Executor f10187o00oOo00;

        public o00oo0O0(LocationManager locationManager, o00oOOo0.AbstractC0121o00oOOo0 abstractC0121o00oOOo0) {
            ooOOOOoo.o00oOOoO(abstractC0121o00oOOo0 != null, "invalid null callback");
            this.f10185o00oOOo0 = locationManager;
            this.f10186o00oOOoO = abstractC0121o00oOOo0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oOo0O(Executor executor) {
            if (this.f10187o00oOo00 != executor) {
                return;
            }
            this.f10186o00oOOoO.o00oOo00();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oOo0o(Executor executor) {
            if (this.f10187o00oOo00 != executor) {
                return;
            }
            this.f10186o00oOOoO.o00oOooO();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oOoO(Executor executor, o0O00000.o00oOOo0 o00oooo02) {
            if (this.f10187o00oOo00 != executor) {
                return;
            }
            this.f10186o00oOOoO.o00oOOoO(o00oooo02);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oOoO0(Executor executor, int i) {
            if (this.f10187o00oOo00 != executor) {
                return;
            }
            this.f10186o00oOOoO.o00oOOo0(i);
        }

        public void o00oOoOO(Executor executor) {
            ooOOOOoo.o00oo0OO(this.f10187o00oOo00 == null, null);
            this.f10187o00oOo00 = executor;
        }

        public void o00oOoOo() {
            this.f10187o00oOo00 = null;
        }

        @Override // android.location.GpsStatus.Listener
        @o0OO0oO0(oo0oO0.o00oo0.f17344o00ooOo)
        public void onGpsStatusChanged(int i) {
            Runnable runnable;
            GpsStatus gpsStatus;
            final Executor executor = this.f10187o00oOo00;
            if (executor == null) {
                return;
            }
            if (i == 1) {
                runnable = new Runnable() { // from class: o0O00000.o0O000Oo
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00oo.o00oo0O0.this.o00oOo0O(executor);
                    }
                };
            } else if (i == 2) {
                runnable = new Runnable() { // from class: o0O00000.o0O000o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00oo.o00oo0O0.this.o00oOo0o(executor);
                    }
                };
            } else if (i == 3) {
                GpsStatus gpsStatus2 = this.f10185o00oOOo0.getGpsStatus(null);
                if (gpsStatus2 != null) {
                    final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                    executor.execute(new Runnable() { // from class: o0O00000.o0O00
                        @Override // java.lang.Runnable
                        public final void run() {
                            o00oo.o00oo0O0.this.o00oOoO0(executor, timeToFirstFix);
                        }
                    });
                    return;
                }
                return;
            } else if (i != 4 || (gpsStatus = this.f10185o00oOOo0.getGpsStatus(null)) == null) {
                return;
            } else {
                final o0O00000.o00oOoO o00oooo2 = new o0O00000.o00oOoO(gpsStatus);
                runnable = new Runnable() { // from class: o0O00000.o0O00O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00oo.o00oo0O0.this.o00oOoO(executor, o00oooo2);
                    }
                };
            }
            executor.execute(runnable);
        }
    }

    @o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oo0OO extends GnssStatus.Callback {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oOOo0.AbstractC0121o00oOOo0 f10188o00oOOo0;

        public o00oo0OO(o00oOOo0.AbstractC0121o00oOOo0 abstractC0121o00oOOo0) {
            ooOOOOoo.o00oOOoO(abstractC0121o00oOOo0 != null, "invalid null callback");
            this.f10188o00oOOo0 = abstractC0121o00oOOo0;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i) {
            this.f10188o00oOOo0.o00oOOo0(i);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f10188o00oOOo0.o00oOOoO(new o0O00000.o00oOOoO(gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.f10188o00oOOo0.o00oOo00();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.f10188o00oOOo0.o00oOooO();
        }
    }

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00ooO0 extends GnssStatus.Callback {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oOOo0.AbstractC0121o00oOOo0 f10189o00oOOo0;
        @o0OO00OO

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public volatile Executor f10190o00oOOoO;

        public o00ooO0(o00oOOo0.AbstractC0121o00oOOo0 abstractC0121o00oOOo0) {
            ooOOOOoo.o00oOOoO(abstractC0121o00oOOo0 != null, "invalid null callback");
            this.f10189o00oOOo0 = abstractC0121o00oOOo0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oOo0O(Executor executor, int i) {
            if (this.f10190o00oOOoO != executor) {
                return;
            }
            this.f10189o00oOOo0.o00oOOo0(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o00oOo0o(Executor executor, GnssStatus gnssStatus) {
            if (this.f10190o00oOOoO != executor) {
                return;
            }
            this.f10189o00oOOo0.o00oOOoO(new o0O00000.o00oOOoO(gnssStatus));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oOoO(Executor executor) {
            if (this.f10190o00oOOoO != executor) {
                return;
            }
            this.f10189o00oOOo0.o00oOooO();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oOoO0(Executor executor) {
            if (this.f10190o00oOOoO != executor) {
                return;
            }
            this.f10189o00oOOo0.o00oOo00();
        }

        public void o00oOoOO(Executor executor) {
            ooOOOOoo.o00oOOoO(executor != null, "invalid null executor");
            ooOOOOoo.o00oo0OO(this.f10190o00oOOoO == null, null);
            this.f10190o00oOOoO = executor;
        }

        public void o00oOoOo() {
            this.f10190o00oOOoO = null;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i) {
            final Executor executor = this.f10190o00oOOoO;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: o0O00000.o0O0O0O
                @Override // java.lang.Runnable
                public final void run() {
                    o00oo.o00ooO0.this.o00oOo0O(executor, i);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.f10190o00oOOoO;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: o0O00000.o0O00oO0
                @Override // java.lang.Runnable
                public final void run() {
                    o00oo.o00ooO0.this.o00oOo0o(executor, gnssStatus);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final Executor executor = this.f10190o00oOOoO;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: o0O00000.o0O00o00
                @Override // java.lang.Runnable
                public final void run() {
                    o00oo.o00ooO0.this.o00oOoO0(executor);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final Executor executor = this.f10190o00oOOoO;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: o0O00000.o0oO0O0o
                @Override // java.lang.Runnable
                public final void run() {
                    o00oo.o00ooO0.this.o00oOoO(executor);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class o0O0o {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f10191o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o0O00000.o00oo0OO f10192o00oOOoO;

        public o0O0o(String str, o0O00000.o00oo0OO o00oo0oo) {
            this.f10191o00oOOo0 = (String) oO0Ooooo.o00oOo0O(str, "invalid null provider");
            this.f10192o00oOOoO = (o0O00000.o00oo0OO) oO0Ooooo.o00oOo0O(o00oo0oo, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (obj instanceof o0O0o) {
                o0O0o o0o0o = (o0O0o) obj;
                return this.f10191o00oOOo0.equals(o0o0o.f10191o00oOOo0) && this.f10192o00oOOoO.equals(o0o0o.f10192o00oOOoO);
            }
            return false;
        }

        public int hashCode() {
            return oO0Ooooo.o00oOOo0.o00oOOoO(this.f10191o00oOOo0, this.f10192o00oOOoO);
        }
    }

    @o0OO0oO0(anyOf = {oo0oO0.o00oo0.f17346o00ooOoO, oo0oO0.o00oo0.f17344o00ooOo})
    public static void o00oOo00(@oo0oO0 LocationManager locationManager, @oo0oO0 String str, @o0OO00OO o0O000.o00oOoO o00oooo2, @oo0oO0 Executor executor, @oo0oO0 final o<Location> oVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            o00oOo0O.o00oOOo0(locationManager, str, o00oooo2, executor, oVar);
            return;
        }
        if (o00oooo2 != null) {
            o00oooo2.o00oOo0O();
        }
        final Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - o0O00000.o00oo00O.o00oOo00(lastKnownLocation) < 10000) {
            executor.execute(new Runnable() { // from class: o0O00000.o00oo0O
                @Override // java.lang.Runnable
                public final void run() {
                    o.this.accept(lastKnownLocation);
                }
            });
            return;
        }
        final o00oo00O o00oo00o = new o00oo00O(locationManager, executor, oVar);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, o00oo00o, Looper.getMainLooper());
        if (o00oooo2 != null) {
            o00oooo2.o00oOooO(new o00oOoO.o00oOOoO() { // from class: o0O00000.o0O0o
                @Override // o0O000.o00oOoO.o00oOOoO
                public final void onCancel() {
                    o00oo.o00oo00O.this.o00oOo00();
                }
            });
        }
        o00oo00o.o00oOoO0(30000L);
    }

    public static int o00oOo0O(@oo0oO0 LocationManager locationManager) {
        return o00oOo00.o00oOOoO(locationManager);
    }

    public static boolean o00oOo0o(@oo0oO0 LocationManager locationManager, @oo0oO0 String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return o00oOoO.o00oOOo0(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            return locationManager.getProvider(str) != null;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean o00oOoO0(@oo0oO0 LocationManager locationManager) {
        return o00oOo00.o00oOo00(locationManager);
    }

    public static /* synthetic */ Boolean o00oOoOO(LocationManager locationManager, o00oo0O0 o00oo0o02) throws Exception {
        return Boolean.valueOf(locationManager.addGpsStatusListener(o00oo0o02));
    }

    @o0OOooO0(24)
    @o0OO0oO0(oo0oO0.o00oo0.f17344o00ooOo)
    public static boolean o00oOoOo(@oo0oO0 LocationManager locationManager, @oo0oO0 GnssMeasurementsEvent.Callback callback, @oo0oO0 Handler handler) {
        return Build.VERSION.SDK_INT != 30 ? o00oOOoO.o00oOOo0(locationManager, callback, handler) : o00oOooo(locationManager, new o00oo0O0.o00oOOo0(handler), callback);
    }

    @o0OOooO0(30)
    @o0OO0oO0(oo0oO0.o00oo0.f17344o00ooOo)
    public static boolean o00oOoo0(@oo0oO0 LocationManager locationManager, @oo0oO0 Executor executor, @oo0oO0 GnssMeasurementsEvent.Callback callback) {
        return Build.VERSION.SDK_INT > 30 ? o00oOoO.o00oOOoO(locationManager, executor, callback) : o00oOooo(locationManager, executor, callback);
    }

    @o0OO00OO
    public static String o00oOooO(@oo0oO0 LocationManager locationManager) {
        return o00oOo00.o00oOOo0(locationManager);
    }

    @o0OOooO0(30)
    public static boolean o00oOooo(@oo0oO0 LocationManager locationManager, @oo0oO0 Executor executor, @oo0oO0 GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT == 30) {
            try {
                if (f10166o00oOo0O == null) {
                    f10166o00oOo0O = Class.forName("android.location.GnssRequest$Builder");
                }
                if (f10167o00oOo0o == null) {
                    Method declaredMethod = f10166o00oOo0O.getDeclaredMethod("build", new Class[0]);
                    f10167o00oOo0o = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                if (f10169o00oOoO0 == null) {
                    Method declaredMethod2 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", Class.forName("android.location.GnssRequest"), Executor.class, GnssMeasurementsEvent.Callback.class);
                    f10169o00oOoO0 = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                Object invoke = f10169o00oOoO0.invoke(locationManager, f10167o00oOo0o.invoke(f10166o00oOo0O.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]), executor, callback);
                if (invoke != null) {
                    return ((Boolean) invoke).booleanValue();
                }
                return false;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                return false;
            }
        }
        throw new IllegalStateException();
    }

    @o0OO0oO0(oo0oO0.o00oo0.f17344o00ooOo)
    public static boolean o00oo0(@oo0oO0 LocationManager locationManager, @oo0oO0 Executor executor, @oo0oO0 o00oOOo0.AbstractC0121o00oOOo0 abstractC0121o00oOOo0) {
        if (Build.VERSION.SDK_INT >= 30) {
            return o00oo00O(locationManager, null, executor, abstractC0121o00oOOo0);
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return o00oo00O(locationManager, new Handler(myLooper), executor, abstractC0121o00oOOo0);
    }

    @o0OO0oO0(oo0oO0.o00oo0.f17344o00ooOo)
    public static boolean o00oo00O(LocationManager locationManager, Handler handler, Executor executor, o00oOOo0.AbstractC0121o00oOOo0 abstractC0121o00oOOo0) {
        return Build.VERSION.SDK_INT >= 30 ? o00oOo0O.o00oOOoO(locationManager, handler, executor, abstractC0121o00oOOo0) : o00oOOoO.o00oOOoO(locationManager, handler, executor, abstractC0121o00oOOo0);
    }

    @o0OO0oO0(anyOf = {oo0oO0.o00oo0.f17346o00ooOoO, oo0oO0.o00oo0.f17344o00ooOo})
    public static void o00oo0O(@oo0oO0 LocationManager locationManager, @oo0oO0 o0O00000.o00oo0OO o00oo0oo) {
        WeakHashMap<o0O0o, WeakReference<C0123o00oo>> weakHashMap = f10168o00oOoO;
        synchronized (weakHashMap) {
            ArrayList arrayList = null;
            for (WeakReference<C0123o00oo> weakReference : weakHashMap.values()) {
                C0123o00oo c0123o00oo = weakReference.get();
                if (c0123o00oo != null) {
                    o0O0o o00oOoO02 = c0123o00oo.o00oOoO0();
                    if (o00oOoO02.f10192o00oOOoO == o00oo0oo) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(o00oOoO02);
                        c0123o00oo.o00oo0();
                        locationManager.removeUpdates(c0123o00oo);
                    }
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f10168o00oOoO.remove((o0O0o) it.next());
                }
            }
        }
        locationManager.removeUpdates(o00oo0oo);
    }

    @o0O0OOOo("sLocationListeners")
    @o0OO0oO0(anyOf = {oo0oO0.o00oo0.f17346o00ooOoO, oo0oO0.o00oo0.f17344o00ooOo})
    public static void o00oo0O0(LocationManager locationManager, C0123o00oo c0123o00oo) {
        WeakReference<C0123o00oo> put = f10168o00oOoO.put(c0123o00oo.o00oOoO0(), new WeakReference<>(c0123o00oo));
        C0123o00oo c0123o00oo2 = put != null ? put.get() : null;
        if (c0123o00oo2 != null) {
            c0123o00oo2.o00oo0();
            locationManager.removeUpdates(c0123o00oo2);
        }
    }

    @o0OO0oO0(oo0oO0.o00oo0.f17344o00ooOo)
    public static boolean o00oo0OO(@oo0oO0 LocationManager locationManager, @oo0oO0 o00oOOo0.AbstractC0121o00oOOo0 abstractC0121o00oOOo0, @oo0oO0 Handler handler) {
        return Build.VERSION.SDK_INT >= 30 ? o00oo0(locationManager, new o00oo0O0.o00oOOo0(handler), abstractC0121o00oOOo0) : o00oo0(locationManager, new o00oo0O(handler), abstractC0121o00oOOo0);
    }

    @o0OO0oO0(anyOf = {oo0oO0.o00oo0.f17346o00ooOoO, oo0oO0.o00oo0.f17344o00ooOo})
    public static void o00oo0Oo(@oo0oO0 LocationManager locationManager, @oo0oO0 String str, @oo0oO0 o0O0oo0o o0o0oo0o, @oo0oO0 Executor executor, @oo0oO0 o0O00000.o00oo0OO o00oo0oo) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            o0o0oo0o.getClass();
            o00oOoO.o00oOo00(locationManager, str, o0O0oo0o.o00oOOoO.o00oOOo0(o0o0oo0o), executor, o00oo0oo);
        } else if (i < 30 || !o00oOo0O.o00oOo00(locationManager, str, o0o0oo0o, executor, o00oo0oo)) {
            C0123o00oo c0123o00oo = new C0123o00oo(new o0O0o(str, o00oo0oo), executor);
            if (o00oOOo0.o00oOOoO(locationManager, str, o0o0oo0o, c0123o00oo)) {
                return;
            }
            synchronized (f10168o00oOoO) {
                locationManager.requestLocationUpdates(str, o0o0oo0o.f10238o00oOOoO, o0o0oo0o.f10241o00oOo0o, c0123o00oo, Looper.getMainLooper());
                o00oo0O0(locationManager, c0123o00oo);
            }
        }
    }

    @o0OOooO0(24)
    public static void o00oo0o(@oo0oO0 LocationManager locationManager, @oo0oO0 GnssMeasurementsEvent.Callback callback) {
        o00oOOoO.o00oOo00(locationManager, callback);
    }

    @o0OO0oO0(anyOf = {oo0oO0.o00oo0.f17346o00ooOoO, oo0oO0.o00oo0.f17344o00ooOo})
    public static void o00oo0o0(@oo0oO0 LocationManager locationManager, @oo0oO0 String str, @oo0oO0 o0O0oo0o o0o0oo0o, @oo0oO0 o0O00000.o00oo0OO o00oo0oo, @oo0oO0 Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            o0o0oo0o.getClass();
            o00oOoO.o00oOo00(locationManager, str, o0O0oo0o.o00oOOoO.o00oOOo0(o0o0oo0o), new o00oo0O0.o00oOOo0(new Handler(looper)), o00oo0oo);
        } else if (o00oOOo0.o00oOOo0(locationManager, str, o0o0oo0o, o00oo0oo, looper)) {
        } else {
            locationManager.requestLocationUpdates(str, o0o0oo0o.f10238o00oOOoO, o0o0oo0o.f10241o00oOo0o, o00oo0oo, looper);
        }
    }

    public static void o00oo0oO(@oo0oO0 LocationManager locationManager, @oo0oO0 o00oOOo0.AbstractC0121o00oOOo0 abstractC0121o00oOOo0) {
        androidx.collection.o00ooO0<Object, Object> o00ooo02 = o00oo0.f10177o00oOOo0;
        synchronized (o00ooo02) {
            Object remove = o00ooo02.remove(abstractC0121o00oOOo0);
            if (remove != null) {
                o00oOOoO.o00oOooO(locationManager, remove);
            }
        }
    }
}
