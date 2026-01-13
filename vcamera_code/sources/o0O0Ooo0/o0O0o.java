package o0O0Ooo0;

import android.app.Notification;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o0O0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f12197o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final int f12198o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Notification f12199o00oOo00;

    public o0O0o(int i, @oo0oO0 Notification notification) {
        this(i, notification, 0);
    }

    public o0O0o(int i, @oo0oO0 Notification notification, int i2) {
        this.f12197o00oOOo0 = i;
        this.f12199o00oOo00 = notification;
        this.f12198o00oOOoO = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0O0o.class != obj.getClass()) {
            return false;
        }
        o0O0o o0o0o = (o0O0o) obj;
        if (this.f12197o00oOOo0 == o0o0o.f12197o00oOOo0 && this.f12198o00oOOoO == o0o0o.f12198o00oOOoO) {
            return this.f12199o00oOo00.equals(o0o0o.f12199o00oOo00);
        }
        return false;
    }

    public int hashCode() {
        return this.f12199o00oOo00.hashCode() + (((this.f12197o00oOOo0 * 31) + this.f12198o00oOOoO) * 31);
    }

    public int o00oOOo0() {
        return this.f12198o00oOOoO;
    }

    @oo0oO0
    public Notification o00oOOoO() {
        return this.f12199o00oOo00;
    }

    public int o00oOo00() {
        return this.f12197o00oOOo0;
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f12197o00oOOo0 + ", mForegroundServiceType=" + this.f12198o00oOOoO + ", mNotification=" + this.f12199o00oOo00 + '}';
    }
}
