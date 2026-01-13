package o00ooOoo;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class oO00o00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f9005o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public CharSequence f9006o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public String f9007o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public List<oO00o000> f9008o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f9009o00oOooO;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final oO00o00 f9010o00oOOo0;

        public o00oOOo0(@oo0oO0 String str) {
            this.f9010o00oOOo0 = new oO00o00(str);
        }

        @oo0oO0
        public oO00o00 o00oOOo0() {
            return this.f9010o00oOOo0;
        }

        @oo0oO0
        public o00oOOo0 o00oOOoO(@o0OO00OO String str) {
            this.f9010o00oOOo0.f9007o00oOo00 = str;
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOo00(@o0OO00OO CharSequence charSequence) {
            this.f9010o00oOOo0.f9006o00oOOoO = charSequence;
            return this;
        }
    }

    @o0OOooO0(28)
    public oO00o00(@oo0oO0 NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    @o0OOooO0(26)
    public oO00o00(@oo0oO0 NotificationChannelGroup notificationChannelGroup, @oo0oO0 List<NotificationChannel> list) {
        this(notificationChannelGroup.getId());
        this.f9006o00oOOoO = notificationChannelGroup.getName();
        this.f9007o00oOo00 = notificationChannelGroup.getDescription();
        this.f9009o00oOooO = notificationChannelGroup.isBlocked();
        this.f9008o00oOo0O = o00oOOoO(notificationChannelGroup.getChannels());
    }

    public oO00o00(@oo0oO0 String str) {
        this.f9008o00oOo0O = Collections.emptyList();
        str.getClass();
        this.f9005o00oOOo0 = str;
    }

    @oo0oO0
    public List<oO00o000> o00oOOo0() {
        return this.f9008o00oOo0O;
    }

    @o0OOooO0(26)
    public final List<oO00o000> o00oOOoO(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : list) {
            if (this.f9005o00oOOo0.equals(notificationChannel.getGroup())) {
                arrayList.add(new oO00o000(notificationChannel));
            }
        }
        return arrayList;
    }

    @o0OO00OO
    public String o00oOo00() {
        return this.f9007o00oOo00;
    }

    @o0OO00OO
    public CharSequence o00oOo0O() {
        return this.f9006o00oOOoO;
    }

    public NotificationChannelGroup o00oOo0o() {
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(this.f9005o00oOOo0, this.f9006o00oOOoO);
        notificationChannelGroup.setDescription(this.f9007o00oOo00);
        return notificationChannelGroup;
    }

    @oo0oO0
    public o00oOOo0 o00oOoO() {
        o00oOOo0 o00oooo02 = new o00oOOo0(this.f9005o00oOOo0);
        CharSequence charSequence = this.f9006o00oOOoO;
        oO00o00 oo00o00 = o00oooo02.f9010o00oOOo0;
        oo00o00.f9006o00oOOoO = charSequence;
        oo00o00.f9007o00oOo00 = this.f9007o00oOo00;
        return o00oooo02;
    }

    public boolean o00oOoO0() {
        return this.f9009o00oOooO;
    }

    @oo0oO0
    public String o00oOooO() {
        return this.f9005o00oOOo0;
    }
}
