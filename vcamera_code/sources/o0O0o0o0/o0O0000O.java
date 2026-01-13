package o0O0o0o0;

import android.content.Context;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.WeakHashMap;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0O0000O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f12587o00oOOo0 = o0O0Ooo0.o0O00000.o00oOo0o("WakeLocks");

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f12588o00oOOoO = new WeakHashMap<>();

    public static void o00oOOo0() {
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f12588o00oOOoO;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                o0O0Ooo0.o0O00000.o00oOo00().o00oOoO(f12587o00oOOo0, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    public static PowerManager.WakeLock o00oOOoO(@oo0oO0 Context context, @oo0oO0 String str) {
        String o00oOOo02 = o00oOoOo.o00oo.o00oOOo0("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, o00oOOo02);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f12588o00oOOoO;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, o00oOOo02);
        }
        return newWakeLock;
    }
}
