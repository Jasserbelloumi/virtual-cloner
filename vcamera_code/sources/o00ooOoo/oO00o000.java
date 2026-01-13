package o00ooOoo;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class oO00o000 {

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final boolean f9011o00oo0o = true;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f9012o00oo0o0 = "miscellaneous";

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f9013o00oo0oO = 0;
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f9014o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public CharSequence f9015o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f9016o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public String f9017o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f9018o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public AudioAttributes f9019o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public Uri f9020o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public boolean f9021o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public int f9022o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public boolean f9023o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public String f9024o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public long[] f9025o00oOooo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public String f9026o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public String f9027o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f9028o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f9029o00oo0O0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public boolean f9030o00oo0OO;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f9031o00oo0Oo;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final oO00o000 f9032o00oOOo0;

        public o00oOOo0(@oo0oO0 String str, int i) {
            this.f9032o00oOOo0 = new oO00o000(str, i);
        }

        @oo0oO0
        public oO00o000 o00oOOo0() {
            return this.f9032o00oOOo0;
        }

        @oo0oO0
        public o00oOOo0 o00oOOoO(@oo0oO0 String str, @oo0oO0 String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                oO00o000 oo00o000 = this.f9032o00oOOo0;
                oo00o000.f9027o00oo00O = str;
                oo00o000.f9026o00oo0 = str2;
            }
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOo00(@o0OO00OO String str) {
            this.f9032o00oOOo0.f9024o00oOooO = str;
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOo0O(int i) {
            this.f9032o00oOOo0.f9016o00oOo00 = i;
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOo0o(int i) {
            this.f9032o00oOOo0.f9022o00oOoOo = i;
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOoO(@o0OO00OO CharSequence charSequence) {
            this.f9032o00oOOo0.f9015o00oOOoO = charSequence;
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOoO0(boolean z) {
            this.f9032o00oOOo0.f9021o00oOoOO = z;
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOoOO(boolean z) {
            this.f9032o00oOOo0.f9018o00oOo0o = z;
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOoOo(@o0OO00OO Uri uri, @o0OO00OO AudioAttributes audioAttributes) {
            oO00o000 oo00o000 = this.f9032o00oOOo0;
            oo00o000.f9020o00oOoO0 = uri;
            oo00o000.f9019o00oOoO = audioAttributes;
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOoo0(boolean z) {
            this.f9032o00oOOo0.f9023o00oOoo0 = z;
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOooO(@o0OO00OO String str) {
            this.f9032o00oOOo0.f9017o00oOo0O = str;
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOooo(@o0OO00OO long[] jArr) {
            oO00o000 oo00o000 = this.f9032o00oOOo0;
            oo00o000.f9023o00oOoo0 = jArr != null && jArr.length > 0;
            oo00o000.f9025o00oOooo = jArr;
            return this;
        }
    }

    @o0OOooO0(26)
    public oO00o000(@oo0oO0 NotificationChannel notificationChannel) {
        this(notificationChannel.getId(), notificationChannel.getImportance());
        boolean isImportantConversation;
        boolean canBubble;
        String parentChannelId;
        String conversationId;
        this.f9015o00oOOoO = notificationChannel.getName();
        this.f9024o00oOooO = notificationChannel.getDescription();
        this.f9017o00oOo0O = notificationChannel.getGroup();
        this.f9018o00oOo0o = notificationChannel.canShowBadge();
        this.f9020o00oOoO0 = notificationChannel.getSound();
        this.f9019o00oOoO = notificationChannel.getAudioAttributes();
        this.f9021o00oOoOO = notificationChannel.shouldShowLights();
        this.f9022o00oOoOo = notificationChannel.getLightColor();
        this.f9023o00oOoo0 = notificationChannel.shouldVibrate();
        this.f9025o00oOooo = notificationChannel.getVibrationPattern();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            parentChannelId = notificationChannel.getParentChannelId();
            this.f9027o00oo00O = parentChannelId;
            conversationId = notificationChannel.getConversationId();
            this.f9026o00oo0 = conversationId;
        }
        this.f9030o00oo0OO = notificationChannel.canBypassDnd();
        this.f9029o00oo0O0 = notificationChannel.getLockscreenVisibility();
        if (i >= 29) {
            canBubble = notificationChannel.canBubble();
            this.f9028o00oo0O = canBubble;
        }
        if (i >= 30) {
            isImportantConversation = notificationChannel.isImportantConversation();
            this.f9031o00oo0Oo = isImportantConversation;
        }
    }

    public oO00o000(@oo0oO0 String str, int i) {
        this.f9018o00oOo0o = true;
        this.f9020o00oOoO0 = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f9022o00oOoOo = 0;
        str.getClass();
        this.f9014o00oOOo0 = str;
        this.f9016o00oOo00 = i;
        this.f9019o00oOoO = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public boolean o00oOOo0() {
        return this.f9028o00oo0O;
    }

    public boolean o00oOOoO() {
        return this.f9030o00oo0OO;
    }

    public boolean o00oOo00() {
        return this.f9018o00oOo0o;
    }

    @o0OO00OO
    public String o00oOo0O() {
        return this.f9026o00oo0;
    }

    @o0OO00OO
    public String o00oOo0o() {
        return this.f9024o00oOooO;
    }

    @oo0oO0
    public String o00oOoO() {
        return this.f9014o00oOOo0;
    }

    @o0OO00OO
    public String o00oOoO0() {
        return this.f9017o00oOo0O;
    }

    public int o00oOoOO() {
        return this.f9016o00oOo00;
    }

    public int o00oOoOo() {
        return this.f9022o00oOoOo;
    }

    public int o00oOoo0() {
        return this.f9029o00oo0O0;
    }

    @o0OO00OO
    public AudioAttributes o00oOooO() {
        return this.f9019o00oOoO;
    }

    @o0OO00OO
    public CharSequence o00oOooo() {
        return this.f9015o00oOOoO;
    }

    @o0OO00OO
    public String o00oo0() {
        return this.f9027o00oo00O;
    }

    public NotificationChannel o00oo00O() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        NotificationChannel notificationChannel = new NotificationChannel(this.f9014o00oOOo0, this.f9015o00oOOoO, this.f9016o00oOo00);
        notificationChannel.setDescription(this.f9024o00oOooO);
        notificationChannel.setGroup(this.f9017o00oOo0O);
        notificationChannel.setShowBadge(this.f9018o00oOo0o);
        notificationChannel.setSound(this.f9020o00oOoO0, this.f9019o00oOoO);
        notificationChannel.enableLights(this.f9021o00oOoOO);
        notificationChannel.setLightColor(this.f9022o00oOoOo);
        notificationChannel.setVibrationPattern(this.f9025o00oOooo);
        notificationChannel.enableVibration(this.f9023o00oOoo0);
        if (i >= 30 && (str = this.f9027o00oo00O) != null && (str2 = this.f9026o00oo0) != null) {
            notificationChannel.setConversationId(str, str2);
        }
        return notificationChannel;
    }

    public boolean o00oo0O() {
        return this.f9031o00oo0Oo;
    }

    @o0OO00OO
    public long[] o00oo0O0() {
        return this.f9025o00oOooo;
    }

    @o0OO00OO
    public Uri o00oo0OO() {
        return this.f9020o00oOoO0;
    }

    public boolean o00oo0Oo() {
        return this.f9021o00oOoOO;
    }

    @oo0oO0
    public o00oOOo0 o00oo0o() {
        o00oOOo0 o00oooo02 = new o00oOOo0(this.f9014o00oOOo0, this.f9016o00oOo00);
        CharSequence charSequence = this.f9015o00oOOoO;
        oO00o000 oo00o000 = o00oooo02.f9032o00oOOo0;
        oo00o000.f9015o00oOOoO = charSequence;
        oo00o000.f9024o00oOooO = this.f9024o00oOooO;
        oo00o000.f9017o00oOo0O = this.f9017o00oOo0O;
        oo00o000.f9018o00oOo0o = this.f9018o00oOo0o;
        return o00oooo02.o00oOoOo(this.f9020o00oOoO0, this.f9019o00oOoO).o00oOoO0(this.f9021o00oOoOO).o00oOo0o(this.f9022o00oOoOo).o00oOoo0(this.f9023o00oOoo0).o00oOooo(this.f9025o00oOooo).o00oOOoO(this.f9027o00oo00O, this.f9026o00oo0);
    }

    public boolean o00oo0o0() {
        return this.f9023o00oOoo0;
    }
}
