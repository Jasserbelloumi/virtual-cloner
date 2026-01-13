package o00oo0O0;

import android.app.PendingIntent;
import android.net.Uri;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public class o00oOOo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f7391o00oOOo0;
    @o0OO00OO

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final PendingIntent f7392o00oOOoO;
    @o0O0O0o0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f7393o00oOo00;
    @o0OO00OO

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public Runnable f7394o00oOo0O;
    @o0OO00OO

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Uri f7395o00oOooO;

    public o00oOOo0(@oo0oO0 String str, @oo0oO0 PendingIntent pendingIntent) {
        this(str, pendingIntent, 0);
    }

    public o00oOOo0(@oo0oO0 String str, @oo0oO0 PendingIntent pendingIntent, @o0O0O0o0 int i) {
        this.f7391o00oOOo0 = str;
        this.f7392o00oOOoO = pendingIntent;
        this.f7393o00oOo00 = i;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public o00oOOo0(@oo0oO0 String str, @oo0oO0 PendingIntent pendingIntent, @oo0oO0 Uri uri) {
        this.f7391o00oOOo0 = str;
        this.f7392o00oOOoO = pendingIntent;
        this.f7395o00oOooO = uri;
    }

    public o00oOOo0(@oo0oO0 String str, @oo0oO0 Runnable runnable) {
        this.f7391o00oOOo0 = str;
        this.f7392o00oOOoO = null;
        this.f7394o00oOo0O = runnable;
    }

    @oo0oO0
    public PendingIntent o00oOOo0() {
        PendingIntent pendingIntent = this.f7392o00oOOoO;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    public int o00oOOoO() {
        return this.f7393o00oOo00;
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public Uri o00oOo00() {
        return this.f7395o00oOooO;
    }

    @oo0oO0
    public String o00oOo0O() {
        return this.f7391o00oOOo0;
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public Runnable o00oOooO() {
        return this.f7394o00oOo0O;
    }
}
