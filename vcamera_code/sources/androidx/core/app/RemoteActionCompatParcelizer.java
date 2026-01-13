package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import o00oOooO.o0OO0oO;
import o0O0Oooo.o0O0oo00;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(o0O0oo00 o0o0oo00) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2353o00oOOo0 = (IconCompat) o0o0oo00.o0O00(remoteActionCompat.f2353o00oOOo0, 1);
        remoteActionCompat.f2354o00oOOoO = o0o0oo00.o00oo(remoteActionCompat.f2354o00oOOoO, 2);
        remoteActionCompat.f2355o00oOo00 = o0o0oo00.o00oo(remoteActionCompat.f2355o00oOo00, 3);
        remoteActionCompat.f2358o00oOooO = (PendingIntent) o0o0oo00.o0O0000O(remoteActionCompat.f2358o00oOooO, 4);
        remoteActionCompat.f2356o00oOo0O = o0o0oo00.o00oo00O(remoteActionCompat.f2356o00oOo0O, 5);
        remoteActionCompat.f2357o00oOo0o = o0o0oo00.o00oo00O(remoteActionCompat.f2357o00oOo0o, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, o0O0oo00 o0o0oo00) {
        o0o0oo00.o0OoO00O(false, false);
        o0o0oo00.o0oOo0O0(remoteActionCompat.f2353o00oOOo0, 1);
        o0o0oo00.o0O0oo0o(remoteActionCompat.f2354o00oOOoO, 2);
        o0o0oo00.o0O0oo0o(remoteActionCompat.f2355o00oOo00, 3);
        o0o0oo00.o0O0OoO(remoteActionCompat.f2358o00oOooO, 4);
        o0o0oo00.o0O00OOO(remoteActionCompat.f2356o00oOo0O, 5);
        o0o0oo00.o0O00OOO(remoteActionCompat.f2357o00oOo0o, 6);
    }
}
