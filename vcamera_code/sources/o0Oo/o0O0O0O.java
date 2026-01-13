package o0Oo;

import android.support.v4.media.session.PlaybackStateCompat;
import javax.annotation.Nullable;
/* loaded from: classes3.dex */
public final class o0O0O0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final long f15499o00oOOo0 = 65536;
    @Nullable

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static o0O00oO0 f15500o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static long f15501o00oOo00;

    public static void o00oOOo0(o0O00oO0 o0o00oo0) {
        if (o0o00oo0.f15496o00oOo0o != null || o0o00oo0.f15497o00oOoO0 != null) {
            throw new IllegalArgumentException();
        }
        if (o0o00oo0.f15498o00oOooO) {
            return;
        }
        synchronized (o0O0O0O.class) {
            long j = f15501o00oOo00;
            if (j + PlaybackStateCompat.ACTION_PLAY_FROM_URI > 65536) {
                return;
            }
            f15501o00oOo00 = j + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            o0o00oo0.f15496o00oOo0o = f15500o00oOOoO;
            o0o00oo0.f15494o00oOo00 = 0;
            o0o00oo0.f15493o00oOOoO = 0;
            f15500o00oOOoO = o0o00oo0;
        }
    }

    public static o0O00oO0 o00oOOoO() {
        synchronized (o0O0O0O.class) {
            o0O00oO0 o0o00oo0 = f15500o00oOOoO;
            if (o0o00oo0 != null) {
                f15500o00oOOoO = o0o00oo0.f15496o00oOo0o;
                o0o00oo0.f15496o00oOo0o = null;
                f15501o00oOo00 -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return o0o00oo0;
            }
            return new o0O00oO0();
        }
    }
}
