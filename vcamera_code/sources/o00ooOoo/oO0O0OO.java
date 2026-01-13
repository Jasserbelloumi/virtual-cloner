package o00ooOoo;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO0;
import o00oOooO.oo0oO0;
import oo0oO0.o00oo0;
/* loaded from: classes.dex */
public final class oO0O0OO {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f9073o00oOo00 = "NotifManCompat";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f9074o00oOo0O = "OP_POST_NOTIFICATION";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f9075o00oOo0o = "android.support.useSideChannel";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f9076o00oOoO = 19;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f9077o00oOoO0 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f9078o00oOoOO = 1000;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f9079o00oOoOo = 6;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f9080o00oOoo0 = "enabled_notification_listeners";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f9081o00oOooO = "checkOpNoThrow";

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f9083o00oo = 5;
    @o0O0OOOo("sEnabledNotificationListenersLock")

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static String f9085o00oo00O = null;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f9086o00oo0O = -1000;
    @o0O0OOOo("sLock")

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static o00oOo0O f9087o00oo0O0 = null;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f9089o00oo0Oo = 0;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f9090o00oo0o = 2;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f9091o00oo0o0 = 1;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f9092o00oo0oO = 3;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f9093o0O0o = 4;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f9094o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final NotificationManager f9095o00oOOoO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final Object f9082o00oOooo = new Object();
    @o0O0OOOo("sEnabledNotificationListenersLock")

    /* renamed from: o00oo0  reason: collision with root package name */
    public static Set<String> f9084o00oo0 = new HashSet();

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final Object f9088o00oo0OO = new Object();

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f9096o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f9097o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final String f9098o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final boolean f9099o00oOooO;

        public o00oOOo0(String str) {
            this.f9096o00oOOo0 = str;
            this.f9097o00oOOoO = 0;
            this.f9098o00oOo00 = null;
            this.f9099o00oOooO = true;
        }

        public o00oOOo0(String str, int i, String str2) {
            this.f9096o00oOOo0 = str;
            this.f9097o00oOOoO = i;
            this.f9098o00oOo00 = str2;
            this.f9099o00oOooO = false;
        }

        @Override // o00ooOoo.oO0O0OO.o00oOoO
        public void o00oOOo0(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            if (this.f9099o00oOooO) {
                iNotificationSideChannel.cancelAll(this.f9096o00oOOo0);
            } else {
                iNotificationSideChannel.cancel(this.f9096o00oOOo0, this.f9097o00oOOoO, this.f9098o00oOo00);
            }
        }

        @oo0oO0
        public String toString() {
            return "CancelTask[packageName:" + this.f9096o00oOOo0 + ", id:" + this.f9097o00oOOoO + ", tag:" + this.f9098o00oOo00 + ", all:" + this.f9099o00oOooO + "]";
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO implements o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f9100o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f9101o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final String f9102o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final Notification f9103o00oOooO;

        public o00oOOoO(String str, int i, String str2, Notification notification) {
            this.f9100o00oOOo0 = str;
            this.f9101o00oOOoO = i;
            this.f9102o00oOo00 = str2;
            this.f9103o00oOooO = notification;
        }

        @Override // o00ooOoo.oO0O0OO.o00oOoO
        public void o00oOOo0(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.f9100o00oOOo0, this.f9101o00oOOoO, this.f9102o00oOo00, this.f9103o00oOooO);
        }

        @oo0oO0
        public String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:");
            sb.append(this.f9100o00oOOo0);
            sb.append(", id:");
            sb.append(this.f9101o00oOOoO);
            sb.append(", tag:");
            return android.support.v4.media.o00oOOoO.o00oOOo0(sb, this.f9102o00oOo00, "]");
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final ComponentName f9104o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final IBinder f9105o00oOOoO;

        public o00oOo00(ComponentName componentName, IBinder iBinder) {
            this.f9104o00oOOo0 = componentName;
            this.f9105o00oOOoO = iBinder;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O implements Handler.Callback, ServiceConnection {

        /* renamed from: o00oo  reason: collision with root package name */
        public static final int f9106o00oo = 2;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public static final int f9107o00oo0oO = 0;

        /* renamed from: o00ooO00  reason: collision with root package name */
        public static final int f9108o00ooO00 = 3;

        /* renamed from: o0O0o  reason: collision with root package name */
        public static final int f9109o0O0o = 1;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final HandlerThread f9110o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Context f9111o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final Handler f9112o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final Map<ComponentName, o00oOOo0> f9114o00oo0o0 = new HashMap();

        /* renamed from: o00oo0o  reason: collision with root package name */
        public Set<String> f9113o00oo0o = new HashSet();

        /* loaded from: classes.dex */
        public static class o00oOOo0 {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final ComponentName f9115o00oOOo0;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public INotificationSideChannel f9117o00oOo00;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public boolean f9116o00oOOoO = false;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public ArrayDeque<o00oOoO> f9119o00oOooO = new ArrayDeque<>();

            /* renamed from: o00oOo0O  reason: collision with root package name */
            public int f9118o00oOo0O = 0;

            public o00oOOo0(ComponentName componentName) {
                this.f9115o00oOOo0 = componentName;
            }
        }

        public o00oOo0O(Context context) {
            this.f9111o00oo0O0 = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f9110o00oo0O = handlerThread;
            handlerThread.start();
            this.f9112o00oo0Oo = new Handler(handlerThread.getLooper(), this);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                o00oOo00((o00oOoO) message.obj);
                return true;
            } else if (i == 1) {
                o00oOo00 o00ooo002 = (o00oOo00) message.obj;
                o00oOo0O(o00ooo002.f9104o00oOOo0, o00ooo002.f9105o00oOOoO);
                return true;
            } else if (i == 2) {
                o00oOo0o((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                o00oOooO((ComponentName) message.obj);
                return true;
            }
        }

        public final boolean o00oOOo0(o00oOOo0 o00oooo02) {
            if (o00oooo02.f9116o00oOOoO) {
                return true;
            }
            boolean bindService = this.f9111o00oo0O0.bindService(new Intent(oO0O0OO.f9077o00oOoO0).setComponent(o00oooo02.f9115o00oOOo0), this, 33);
            o00oooo02.f9116o00oOOoO = bindService;
            if (bindService) {
                o00oooo02.f9118o00oOo0O = 0;
            } else {
                Objects.toString(o00oooo02.f9115o00oOOo0);
                this.f9111o00oo0O0.unbindService(this);
            }
            return o00oooo02.f9116o00oOOoO;
        }

        public final void o00oOOoO(o00oOOo0 o00oooo02) {
            if (o00oooo02.f9116o00oOOoO) {
                this.f9111o00oo0O0.unbindService(this);
                o00oooo02.f9116o00oOOoO = false;
            }
            o00oooo02.f9117o00oOo00 = null;
        }

        public final void o00oOo00(o00oOoO o00oooo2) {
            o00oOoOo();
            for (o00oOOo0 o00oooo02 : this.f9114o00oo0o0.values()) {
                o00oooo02.f9119o00oOooO.add(o00oooo2);
                o00oOoO0(o00oooo02);
            }
        }

        public final void o00oOo0O(ComponentName componentName, IBinder iBinder) {
            o00oOOo0 o00oooo02 = this.f9114o00oo0o0.get(componentName);
            if (o00oooo02 != null) {
                o00oooo02.f9117o00oOo00 = INotificationSideChannel.Stub.asInterface(iBinder);
                o00oooo02.f9118o00oOo0O = 0;
                o00oOoO0(o00oooo02);
            }
        }

        public final void o00oOo0o(ComponentName componentName) {
            o00oOOo0 o00oooo02 = this.f9114o00oo0o0.get(componentName);
            if (o00oooo02 != null) {
                o00oOOoO(o00oooo02);
            }
        }

        public void o00oOoO(o00oOoO o00oooo2) {
            this.f9112o00oo0Oo.obtainMessage(0, o00oooo2).sendToTarget();
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
            if (android.util.Log.isLoggable(o00ooOoo.oO0O0OO.f9073o00oOo00, 3) == false) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void o00oOoO0(o00ooOoo.oO0O0OO.o00oOo0O.o00oOOo0 r5) {
            /*
                r4 = this;
                java.lang.String r0 = "NotifManCompat"
                r1 = 3
                boolean r2 = android.util.Log.isLoggable(r0, r1)
                if (r2 == 0) goto L13
                android.content.ComponentName r2 = r5.f9115o00oOOo0
                java.util.Objects.toString(r2)
                java.util.ArrayDeque<o00ooOoo.oO0O0OO$o00oOoO> r2 = r5.f9119o00oOooO
                r2.size()
            L13:
                java.util.ArrayDeque<o00ooOoo.oO0O0OO$o00oOoO> r2 = r5.f9119o00oOooO
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L1c
                return
            L1c:
                boolean r2 = r4.o00oOOo0(r5)
                if (r2 == 0) goto L5f
                android.support.v4.app.INotificationSideChannel r2 = r5.f9117o00oOo00
                if (r2 != 0) goto L27
                goto L5f
            L27:
                java.util.ArrayDeque<o00ooOoo.oO0O0OO$o00oOoO> r2 = r5.f9119o00oOooO
                java.lang.Object r2 = r2.peek()
                o00ooOoo.oO0O0OO$o00oOoO r2 = (o00ooOoo.oO0O0OO.o00oOoO) r2
                if (r2 != 0) goto L32
                goto L53
            L32:
                boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch: android.os.RemoteException -> L46 android.os.DeadObjectException -> L4c
                if (r3 == 0) goto L3b
                r2.toString()     // Catch: android.os.RemoteException -> L46 android.os.DeadObjectException -> L4c
            L3b:
                android.support.v4.app.INotificationSideChannel r3 = r5.f9117o00oOo00     // Catch: android.os.RemoteException -> L46 android.os.DeadObjectException -> L4c
                r2.o00oOOo0(r3)     // Catch: android.os.RemoteException -> L46 android.os.DeadObjectException -> L4c
                java.util.ArrayDeque<o00ooOoo.oO0O0OO$o00oOoO> r2 = r5.f9119o00oOooO     // Catch: android.os.RemoteException -> L46 android.os.DeadObjectException -> L4c
                r2.remove()     // Catch: android.os.RemoteException -> L46 android.os.DeadObjectException -> L4c
                goto L27
            L46:
                android.content.ComponentName r0 = r5.f9115o00oOOo0
                java.util.Objects.toString(r0)
                goto L53
            L4c:
                boolean r0 = android.util.Log.isLoggable(r0, r1)
                if (r0 == 0) goto L53
                goto L46
            L53:
                java.util.ArrayDeque<o00ooOoo.oO0O0OO$o00oOoO> r0 = r5.f9119o00oOooO
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L5e
                r4.o00oOoOO(r5)
            L5e:
                return
            L5f:
                r4.o00oOoOO(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o00ooOoo.oO0O0OO.o00oOo0O.o00oOoO0(o00ooOoo.oO0O0OO$o00oOo0O$o00oOOo0):void");
        }

        public final void o00oOoOO(o00oOOo0 o00oooo02) {
            if (this.f9112o00oo0Oo.hasMessages(3, o00oooo02.f9115o00oOOo0)) {
                return;
            }
            int i = o00oooo02.f9118o00oOo0O + 1;
            o00oooo02.f9118o00oOo0O = i;
            if (i <= 6) {
                this.f9112o00oo0Oo.sendMessageDelayed(this.f9112o00oo0Oo.obtainMessage(3, o00oooo02.f9115o00oOOo0), (1 << (i - 1)) * 1000);
                return;
            }
            o00oooo02.f9119o00oOooO.size();
            Objects.toString(o00oooo02.f9115o00oOOo0);
            o00oooo02.f9119o00oOooO.clear();
        }

        public final void o00oOoOo() {
            Set<String> o00oo0O2 = oO0O0OO.o00oo0O(this.f9111o00oo0O0);
            if (o00oo0O2.equals(this.f9113o00oo0o)) {
                return;
            }
            this.f9113o00oo0o = o00oo0O2;
            List<ResolveInfo> queryIntentServices = this.f9111o00oo0O0.getPackageManager().queryIntentServices(new Intent().setAction(oO0O0OO.f9077o00oOoO0), 0);
            HashSet hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (o00oo0O2.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        componentName.toString();
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ComponentName componentName2 = (ComponentName) it.next();
                if (!this.f9114o00oo0o0.containsKey(componentName2)) {
                    if (Log.isLoggable(oO0O0OO.f9073o00oOo00, 3)) {
                        Objects.toString(componentName2);
                    }
                    this.f9114o00oo0o0.put(componentName2, new o00oOOo0(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, o00oOOo0>> it2 = this.f9114o00oo0o0.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<ComponentName, o00oOOo0> next = it2.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable(oO0O0OO.f9073o00oOo00, 3)) {
                        Objects.toString(next.getKey());
                    }
                    o00oOOoO(next.getValue());
                    it2.remove();
                }
            }
        }

        public final void o00oOooO(ComponentName componentName) {
            o00oOOo0 o00oooo02 = this.f9114o00oo0o0.get(componentName);
            if (o00oooo02 != null) {
                o00oOoO0(o00oooo02);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(oO0O0OO.f9073o00oOo00, 3)) {
                Objects.toString(componentName);
            }
            this.f9112o00oo0Oo.obtainMessage(1, new o00oOo00(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(oO0O0OO.f9073o00oOo00, 3)) {
                Objects.toString(componentName);
            }
            this.f9112o00oo0Oo.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOoO {
        void o00oOOo0(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    public oO0O0OO(Context context) {
        this.f9094o00oOOo0 = context;
        this.f9095o00oOOoO = (NotificationManager) context.getSystemService("notification");
    }

    @oo0oO0
    public static Set<String> o00oo0O(@oo0oO0 Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f9082o00oOooo) {
            if (string != null) {
                if (!string.equals(f9085o00oo00O)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f9084o00oo0 = hashSet;
                    f9085o00oo00O = string;
                }
            }
            set = f9084o00oo0;
        }
        return set;
    }

    @oo0oO0
    public static oO0O0OO o00oo0O0(@oo0oO0 Context context) {
        return new oO0O0OO(context);
    }

    public static boolean o00ooOo0(Notification notification) {
        Bundle bundle = notification.extras;
        return bundle != null && bundle.getBoolean(f9075o00oOo0o);
    }

    public boolean o00oOOo0() {
        return this.f9095o00oOOoO.areNotificationsEnabled();
    }

    public void o00oOOoO(int i) {
        o00oOo00(null, i);
    }

    public void o00oOo00(@o0OO00OO String str, int i) {
        this.f9095o00oOOoO.cancel(str, i);
    }

    public void o00oOo0O(@oo0oO0 NotificationChannel notificationChannel) {
        this.f9095o00oOOoO.createNotificationChannel(notificationChannel);
    }

    public void o00oOo0o(@oo0oO0 oO00o000 oo00o000) {
        o00oOo0O(oo00o000.o00oo00O());
    }

    public void o00oOoO(@oo0oO0 oO00o00 oo00o00) {
        o00oOoO0(oo00o00.o00oOo0o());
    }

    public void o00oOoO0(@oo0oO0 NotificationChannelGroup notificationChannelGroup) {
        this.f9095o00oOOoO.createNotificationChannelGroup(notificationChannelGroup);
    }

    public void o00oOoOO(@oo0oO0 List<NotificationChannelGroup> list) {
        this.f9095o00oOOoO.createNotificationChannelGroups(list);
    }

    public void o00oOoOo(@oo0oO0 List<oO00o00> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (oO00o00 oo00o00 : list) {
            arrayList.add(oo00o00.o00oOo0o());
        }
        this.f9095o00oOOoO.createNotificationChannelGroups(arrayList);
    }

    public void o00oOoo0(@oo0oO0 List<NotificationChannel> list) {
        this.f9095o00oOOoO.createNotificationChannels(list);
    }

    public void o00oOooO() {
        this.f9095o00oOOoO.cancelAll();
    }

    public void o00oOooo(@oo0oO0 List<oO00o000> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (oO00o000 oo00o000 : list) {
            arrayList.add(oo00o000.o00oo00O());
        }
        this.f9095o00oOOoO.createNotificationChannels(arrayList);
    }

    @o0OO00OO
    public NotificationChannelGroup o00oo(@oo0oO0 String str) {
        return this.f9095o00oOOoO.getNotificationChannelGroup(str);
    }

    public void o00oo0(@oo0oO0 String str) {
        this.f9095o00oOOoO.deleteNotificationChannelGroup(str);
    }

    public void o00oo00O(@oo0oO0 String str) {
        this.f9095o00oOOoO.deleteNotificationChannel(str);
    }

    public void o00oo0OO(@oo0oO0 Collection<String> collection) {
        String parentChannelId;
        for (NotificationChannel notificationChannel : this.f9095o00oOOoO.getNotificationChannels()) {
            if (!collection.contains(notificationChannel.getId())) {
                if (Build.VERSION.SDK_INT >= 30) {
                    parentChannelId = notificationChannel.getParentChannelId();
                    if (collection.contains(parentChannelId)) {
                    }
                }
                this.f9095o00oOOoO.deleteNotificationChannel(notificationChannel.getId());
            }
        }
    }

    public int o00oo0Oo() {
        return this.f9095o00oOOoO.getImportance();
    }

    @o0OO00OO
    public NotificationChannel o00oo0o(@oo0oO0 String str, @oo0oO0 String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT >= 30) {
            notificationChannel = this.f9095o00oOOoO.getNotificationChannel(str, str2);
            return notificationChannel;
        }
        return o00oo0o0(str);
    }

    @o0OO00OO
    public NotificationChannel o00oo0o0(@oo0oO0 String str) {
        return this.f9095o00oOOoO.getNotificationChannel(str);
    }

    @o0OO00OO
    public oO00o000 o00oo0oO(@oo0oO0 String str) {
        NotificationChannel o00oo0o02 = o00oo0o0(str);
        if (o00oo0o02 != null) {
            return new oO00o000(o00oo0o02);
        }
        return null;
    }

    @oo0oO0
    public List<oO00o000> o00ooO() {
        List<NotificationChannel> o00ooO0o2 = o00ooO0o();
        if (o00ooO0o2.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(o00ooO0o2.size());
        for (NotificationChannel notificationChannel : o00ooO0o2) {
            arrayList.add(new oO00o000(notificationChannel));
        }
        return arrayList;
    }

    @oo0oO0
    public List<NotificationChannelGroup> o00ooO0() {
        return this.f9095o00oOOoO.getNotificationChannelGroups();
    }

    @o0OO00OO
    public oO00o00 o00ooO00(@oo0oO0 String str) {
        NotificationChannelGroup o00oo2 = o00oo(str);
        if (o00oo2 != null) {
            return new oO00o00(o00oo2);
        }
        return null;
    }

    @oo0oO0
    public List<oO00o00> o00ooO0O() {
        List<NotificationChannelGroup> o00ooO02 = o00ooO0();
        if (o00ooO02.isEmpty()) {
            return Collections.emptyList();
        }
        Collections.emptyList();
        ArrayList arrayList = new ArrayList(o00ooO02.size());
        for (NotificationChannelGroup notificationChannelGroup : o00ooO02) {
            arrayList.add(new oO00o00(notificationChannelGroup));
        }
        return arrayList;
    }

    @oo0oO0
    public List<NotificationChannel> o00ooO0o() {
        return this.f9095o00oOOoO.getNotificationChannels();
    }

    @o0OO0oO0(o00oo0.f17327o00oo0)
    public void o00ooOO(@o0OO00OO String str, int i, @oo0oO0 Notification notification) {
        if (!o00ooOo0(notification)) {
            this.f9095o00oOOoO.notify(str, i, notification);
            return;
        }
        o00ooOOo(new o00oOOoO(this.f9094o00oOOo0.getPackageName(), i, str, notification));
        this.f9095o00oOOoO.cancel(str, i);
    }

    @o0OO0oO0(o00oo0.f17327o00oo0)
    public void o00ooOO0(int i, @oo0oO0 Notification notification) {
        o00ooOO(null, i, notification);
    }

    public final void o00ooOOo(o00oOoO o00oooo2) {
        synchronized (f9088o00oo0OO) {
            if (f9087o00oo0O0 == null) {
                f9087o00oo0O0 = new o00oOo0O(this.f9094o00oOOo0.getApplicationContext());
            }
            f9087o00oo0O0.o00oOoO(o00oooo2);
        }
    }

    @o0OO00OO
    public oO00o000 o0O0o(@oo0oO0 String str, @oo0oO0 String str2) {
        NotificationChannel o00oo0o2 = o00oo0o(str, str2);
        if (o00oo0o2 != null) {
            return new oO00o000(o00oo0o2);
        }
        return null;
    }
}
