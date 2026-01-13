package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.room.o00oOOo0;
import androidx.room.o00oOOoO;
import androidx.room.o00oOo00;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oOo0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f4833o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f4834o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f4835o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o00oOo00.AbstractC0046o00oOo00 f4836o00oOo0O;
    @o0OO00OO

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public androidx.room.o00oOOoO f4837o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final Executor f4839o00oOoO0;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final ServiceConnection f4841o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public final Runnable f4842o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final androidx.room.o00oOo00 f4843o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public final Runnable f4844o00oOooo;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public final Runnable f4845o00oo00O;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final androidx.room.o00oOOo0 f4838o00oOoO = new o00oOOo0();

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final AtomicBoolean f4840o00oOoOO = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o00oOOo0.AbstractBinderC0043o00oOOo0 {

        /* renamed from: androidx.room.o00oOo0O$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0047o00oOOo0 implements Runnable {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ String[] f4848o00oo0O0;

            public RunnableC0047o00oOOo0(String[] strArr) {
                this.f4848o00oo0O0 = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oOo0O.this.f4843o00oOooO.o00oOoO(this.f4848o00oo0O0);
            }
        }

        public o00oOOo0() {
        }

        @Override // androidx.room.o00oOOo0
        public void onInvalidation(String[] strArr) {
            o00oOo0O.this.f4839o00oOoO0.execute(new RunnableC0047o00oOOo0(strArr));
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements ServiceConnection {
        public o00oOOoO() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            o00oOo0O.this.f4837o00oOo0o = o00oOOoO.o00oOOo0.asInterface(iBinder);
            o00oOo0O o00ooo0o2 = o00oOo0O.this;
            o00ooo0o2.f4839o00oOoO0.execute(o00ooo0o2.f4842o00oOoo0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            o00oOo0O o00ooo0o2 = o00oOo0O.this;
            o00ooo0o2.f4839o00oOoO0.execute(o00ooo0o2.f4844o00oOooo);
            o00oOo0O.this.f4837o00oOo0o = null;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Runnable {
        public o00oOo00() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                o00oOo0O o00ooo0o2 = o00oOo0O.this;
                androidx.room.o00oOOoO o00ooooo2 = o00ooo0o2.f4837o00oOo0o;
                if (o00ooooo2 != null) {
                    o00ooo0o2.f4835o00oOo00 = o00ooooo2.registerCallback(o00ooo0o2.f4838o00oOoO, o00ooo0o2.f4834o00oOOoO);
                    o00oOo0O o00ooo0o3 = o00oOo0O.this;
                    o00ooo0o3.f4843o00oOooO.o00oOOo0(o00ooo0o3.f4836o00oOo0O);
                }
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: androidx.room.o00oOo0O$o00oOo0O  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0048o00oOo0O implements Runnable {
        public RunnableC0048o00oOo0O() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o00oOo0O o00ooo0o2 = o00oOo0O.this;
            o00ooo0o2.f4843o00oOooO.o00oOoo0(o00ooo0o2.f4836o00oOo0O);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO implements Runnable {
        public o00oOoO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o00oOo0O o00ooo0o2 = o00oOo0O.this;
            o00ooo0o2.f4843o00oOooO.o00oOoo0(o00ooo0o2.f4836o00oOo0O);
            try {
                o00oOo0O o00ooo0o3 = o00oOo0O.this;
                androidx.room.o00oOOoO o00ooooo2 = o00ooo0o3.f4837o00oOo0o;
                if (o00ooooo2 != null) {
                    o00ooooo2.unregisterCallback(o00ooo0o3.f4838o00oOoO, o00ooo0o3.f4835o00oOo00);
                }
            } catch (RemoteException unused) {
            }
            o00oOo0O o00ooo0o4 = o00oOo0O.this;
            o00ooo0o4.f4833o00oOOo0.unbindService(o00ooo0o4.f4841o00oOoOo);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O extends o00oOo00.AbstractC0046o00oOo00 {
        public o00oo00O(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.o00oOo00.AbstractC0046o00oOo00
        public boolean o00oOOo0() {
            return true;
        }

        @Override // androidx.room.o00oOo00.AbstractC0046o00oOo00
        public void o00oOOoO(@oo0oO0 Set<String> set) {
            if (o00oOo0O.this.f4840o00oOoOO.get()) {
                return;
            }
            try {
                o00oOo0O o00ooo0o2 = o00oOo0O.this;
                androidx.room.o00oOOoO o00ooooo2 = o00ooo0o2.f4837o00oOo0o;
                if (o00ooooo2 != null) {
                    o00ooooo2.broadcastInvalidation(o00ooo0o2.f4835o00oOo00, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException unused) {
            }
        }
    }

    public o00oOo0O(Context context, String str, androidx.room.o00oOo00 o00ooo002, Executor executor) {
        o00oOOoO o00ooooo2 = new o00oOOoO();
        this.f4841o00oOoOo = o00ooooo2;
        this.f4842o00oOoo0 = new o00oOo00();
        this.f4844o00oOooo = new RunnableC0048o00oOo0O();
        this.f4845o00oo00O = new o00oOoO();
        Context applicationContext = context.getApplicationContext();
        this.f4833o00oOOo0 = applicationContext;
        this.f4834o00oOOoO = str;
        this.f4843o00oOooO = o00ooo002;
        this.f4839o00oOoO0 = executor;
        this.f4836o00oOo0O = new o00oo00O((String[]) o00ooo002.f4805o00oOOo0.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, MultiInstanceInvalidationService.class), o00ooooo2, 1);
    }

    public void o00oOOo0() {
        if (this.f4840o00oOoOO.compareAndSet(false, true)) {
            this.f4839o00oOoO0.execute(this.f4845o00oo00O);
        }
    }
}
