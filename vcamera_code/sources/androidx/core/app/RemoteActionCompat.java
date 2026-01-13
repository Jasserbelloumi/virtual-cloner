package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O0Oooo.o0OO000o;
/* loaded from: classes.dex */
public final class RemoteActionCompat implements o0OO000o {
    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public IconCompat f2353o00oOOo0;
    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public CharSequence f2354o00oOOoO;
    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00oOo00  reason: collision with root package name */
    public CharSequence f2355o00oOo00;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public boolean f2356o00oOo0O;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f2357o00oOo0o;
    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00oOooO  reason: collision with root package name */
    public PendingIntent f2358o00oOooO;

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static RemoteAction o00oOOo0(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        @o0O0O0Oo
        public static PendingIntent o00oOOoO(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        @o0O0O0Oo
        public static CharSequence o00oOo00(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        @o0O0O0Oo
        public static CharSequence o00oOo0O(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        @o0O0O0Oo
        public static boolean o00oOo0o(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        @o0O0O0Oo
        public static void o00oOoO0(RemoteAction remoteAction, boolean z) {
            remoteAction.setEnabled(z);
        }

        @o0O0O0Oo
        public static Icon o00oOooO(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }
    }

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static void o00oOOo0(RemoteAction remoteAction, boolean z) {
            remoteAction.setShouldShowIcon(z);
        }

        @o0O0O0Oo
        public static boolean o00oOOoO(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@oo0oO0 RemoteActionCompat remoteActionCompat) {
        remoteActionCompat.getClass();
        this.f2353o00oOOo0 = remoteActionCompat.f2353o00oOOo0;
        this.f2354o00oOOoO = remoteActionCompat.f2354o00oOOoO;
        this.f2355o00oOo00 = remoteActionCompat.f2355o00oOo00;
        this.f2358o00oOooO = remoteActionCompat.f2358o00oOooO;
        this.f2356o00oOo0O = remoteActionCompat.f2356o00oOo0O;
        this.f2357o00oOo0o = remoteActionCompat.f2357o00oOo0o;
    }

    @o0OOooO0(26)
    @oo0oO0
    public static RemoteActionCompat o00oOo0o(@oo0oO0 RemoteAction remoteAction) {
        remoteAction.getClass();
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.o00oOooo(o00oOOo0.o00oOooO(remoteAction)), o00oOOo0.o00oOo0O(remoteAction), o00oOOo0.o00oOo00(remoteAction), o00oOOo0.o00oOOoO(remoteAction));
        remoteActionCompat.f2356o00oOo0O = o00oOOo0.o00oOo0o(remoteAction);
        remoteActionCompat.f2357o00oOo0o = o00oOOoO.o00oOOoO(remoteAction);
        return remoteActionCompat;
    }

    @oo0oO0
    public CharSequence o00oOoO() {
        return this.f2355o00oOo00;
    }

    @oo0oO0
    public PendingIntent o00oOoO0() {
        return this.f2358o00oOooO;
    }

    @oo0oO0
    public IconCompat o00oOoOO() {
        return this.f2353o00oOOo0;
    }

    @oo0oO0
    public CharSequence o00oOoOo() {
        return this.f2354o00oOOoO;
    }

    public boolean o00oOoo0() {
        return this.f2356o00oOo0O;
    }

    public void o00oOooo(boolean z) {
        this.f2356o00oOo0O = z;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean o00oo0() {
        return this.f2357o00oOo0o;
    }

    public void o00oo00O(boolean z) {
        this.f2357o00oOo0o = z;
    }

    @o0OOooO0(26)
    @oo0oO0
    public RemoteAction o00oo0OO() {
        RemoteAction o00oOOo02 = o00oOOo0.o00oOOo0(this.f2353o00oOOo0.o00ooo0(), this.f2354o00oOOoO, this.f2355o00oOo00, this.f2358o00oOooO);
        o00oOOo0.o00oOoO0(o00oOOo02, this.f2356o00oOo0O);
        o00oOOoO.o00oOOo0(o00oOOo02, this.f2357o00oOo0o);
        return o00oOOo02;
    }

    public RemoteActionCompat(@oo0oO0 IconCompat iconCompat, @oo0oO0 CharSequence charSequence, @oo0oO0 CharSequence charSequence2, @oo0oO0 PendingIntent pendingIntent) {
        iconCompat.getClass();
        this.f2353o00oOOo0 = iconCompat;
        charSequence.getClass();
        this.f2354o00oOOoO = charSequence;
        charSequence2.getClass();
        this.f2355o00oOo00 = charSequence2;
        pendingIntent.getClass();
        this.f2358o00oOooO = pendingIntent;
        this.f2356o00oOo0O = true;
        this.f2357o00oOo0o = true;
    }
}
