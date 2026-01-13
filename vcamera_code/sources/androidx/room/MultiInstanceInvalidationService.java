package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.room.o00oOOoO;
import java.util.HashMap;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f4785o00oo0O0 = 0;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final HashMap<Integer, String> f4784o00oo0O = new HashMap<>();

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final RemoteCallbackList<androidx.room.o00oOOo0> f4786o00oo0Oo = new o00oOOo0();

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o00oOOoO.o00oOOo0 f4787o00oo0o0 = new o00oOOoO();

    /* loaded from: classes.dex */
    public class o00oOOo0 extends RemoteCallbackList<androidx.room.o00oOOo0> {
        public o00oOOo0() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: o00oOOo0 */
        public void onCallbackDied(androidx.room.o00oOOo0 o00oooo02, Object obj) {
            MultiInstanceInvalidationService.this.f4784o00oo0O.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o00oOOoO.o00oOOo0 {
        public o00oOOoO() {
        }

        @Override // androidx.room.o00oOOoO
        public void broadcastInvalidation(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f4786o00oo0Oo) {
                String str = MultiInstanceInvalidationService.this.f4784o00oo0O.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f4786o00oo0Oo.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.f4786o00oo0Oo.getBroadcastCookie(i2)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.f4784o00oo0O.get(Integer.valueOf(intValue));
                    if (i != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.f4786o00oo0Oo.getBroadcastItem(i2).onInvalidation(strArr);
                        } catch (RemoteException unused) {
                        }
                    }
                }
                MultiInstanceInvalidationService.this.f4786o00oo0Oo.finishBroadcast();
            }
        }

        @Override // androidx.room.o00oOOoO
        public int registerCallback(androidx.room.o00oOOo0 o00oooo02, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f4786o00oo0Oo) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f4785o00oo0O0 + 1;
                multiInstanceInvalidationService.f4785o00oo0O0 = i;
                if (multiInstanceInvalidationService.f4786o00oo0Oo.register(o00oooo02, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f4784o00oo0O.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f4785o00oo0O0--;
                return 0;
            }
        }

        @Override // androidx.room.o00oOOoO
        public void unregisterCallback(androidx.room.o00oOOo0 o00oooo02, int i) {
            synchronized (MultiInstanceInvalidationService.this.f4786o00oo0Oo) {
                MultiInstanceInvalidationService.this.f4786o00oo0Oo.unregister(o00oooo02);
                MultiInstanceInvalidationService.this.f4784o00oo0O.remove(Integer.valueOf(i));
            }
        }
    }

    @Override // android.app.Service
    @o0OO00OO
    public IBinder onBind(Intent intent) {
        return this.f4787o00oo0o0;
    }
}
