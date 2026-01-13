package o00ooOoo;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Notification$BubbleMetadata;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.core.R;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o00oOooO.o0O00O;
import o00oOooO.o0O00oO0;
import o00oOooO.o0O0O0O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00ooOoo.ooOOO0Oo;
import o00ooOoo.ooo0o;
import o00ooo0.o0O0OO;
import o00ooo0O.o0OoO00O;
import o0OoOoOO.o0OO000o;
/* loaded from: classes.dex */
public class oOo000Oo {
    @SuppressLint({"ActionValue"})

    /* renamed from: o0  reason: collision with root package name */
    public static final String f9150o0 = "android.pictureContentDescription";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9151o00oOOo0 = "android.intent.category.NOTIFICATION_PREFERENCES";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f9152o00oOOoO = "android.intent.extra.CHANNEL_ID";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f9153o00oOo00 = "android.intent.extra.CHANNEL_GROUP_ID";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f9154o00oOo0O = "android.intent.extra.NOTIFICATION_ID";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f9155o00oOo0o = -1;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f9156o00oOoO = 2;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f9157o00oOoO0 = 1;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f9158o00oOoOO = 4;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f9159o00oOoOo = -1;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f9160o00oOoo0 = 1;
    @SuppressLint({"ActionValue"})

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f9161o00oOooO = "android.intent.extra.NOTIFICATION_TAG";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f9162o00oOooo = 2;

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f9163o00oo = -1;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f9164o00oo0 = 8;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f9165o00oo00O = 4;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f9166o00oo0O = 64;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f9167o00oo0O0 = 32;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f9168o00oo0OO = 16;
    @Deprecated

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f9169o00oo0Oo = 128;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f9170o00oo0o = 512;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f9171o00oo0o0 = 256;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f9172o00oo0oO = 4096;
    @SuppressLint({"ActionValue"})

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final String f9173o00ooO = "android.title.big";

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f9174o00ooO0 = 1;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f9175o00ooO00 = -2;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f9176o00ooO0O = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final String f9177o00ooO0o = "android.title";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final String f9178o00ooOO = "android.subText";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final String f9179o00ooOO0 = "android.text";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final String f9180o00ooOOo = "android.remoteInputHistory";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final String f9181o00ooOo = "android.summaryText";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final String f9182o00ooOo0 = "android.infoText";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final String f9183o00ooOoO = "android.bigText";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final String f9184o00ooOoo = "android.icon";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final String f9185o00ooo0 = "android.largeIcon.big";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final String f9186o00ooo00 = "android.largeIcon";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final String f9187o00ooo0O = "android.progress";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final String f9188o00ooo0o = "android.progressMax";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final String f9189o00oooO = "android.progressIndeterminate";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final String f9190o00oooOO = "android.showChronometer";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static final String f9191o00oooOo = "android.chronometerCountDown";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final String f9192o00oooo = "android.showWhen";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final String f9193o00oooo0 = "android.colorized";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final String f9194o00ooooO = "android.picture";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static final String f9195o00ooooo = "android.pictureIcon";
    @SuppressLint({"ActionValue"})

    /* renamed from: o0O00  reason: collision with root package name */
    public static final String f9196o0O00 = "android.messages";

    /* renamed from: o0O000  reason: collision with root package name */
    public static final String f9197o0O000 = "androidx.core.app.extra.COMPAT_TEMPLATE";
    @SuppressLint({"ActionValue"})

    /* renamed from: o0O00000  reason: collision with root package name */
    public static final String f9198o0O00000 = "android.showBigPictureWhenCollapsed";
    @SuppressLint({"ActionValue"})

    /* renamed from: o0O0000O  reason: collision with root package name */
    public static final String f9199o0O0000O = "android.textLines";
    @SuppressLint({"ActionValue"})

    /* renamed from: o0O0000o  reason: collision with root package name */
    public static final String f9200o0O0000o = "android.template";
    @SuppressLint({"ActionValue"})
    @Deprecated

    /* renamed from: o0O000O  reason: collision with root package name */
    public static final String f9201o0O000O = "android.people";
    @SuppressLint({"ActionValue"})

    /* renamed from: o0O000Oo  reason: collision with root package name */
    public static final String f9202o0O000Oo = "android.backgroundImageUri";
    @SuppressLint({"ActionValue"})

    /* renamed from: o0O000o  reason: collision with root package name */
    public static final String f9203o0O000o = "android.selfDisplayName";
    @SuppressLint({"ActionValue"})

    /* renamed from: o0O000o0  reason: collision with root package name */
    public static final String f9204o0O000o0 = "android.compactActions";
    @SuppressLint({"ActionValue"})

    /* renamed from: o0O000oo  reason: collision with root package name */
    public static final String f9205o0O000oo = "android.conversationTitle";
    @SuppressLint({"ActionValue"})

    /* renamed from: o0O00O  reason: collision with root package name */
    public static final String f9206o0O00O = "android.audioContents";
    @SuppressLint({"ActionValue"})

    /* renamed from: o0O00O0  reason: collision with root package name */
    public static final String f9207o0O00O0 = "android.messages.historic";
    @SuppressLint({"ActionValue"})

    /* renamed from: o0O00O0o  reason: collision with root package name */
    public static final String f9208o0O00O0o = "android.hiddenConversationTitle";
    @o0O00O

    /* renamed from: o0O00OO  reason: collision with root package name */
    public static final int f9209o0O00OO = 0;

    /* renamed from: o0O00OOO  reason: collision with root package name */
    public static final int f9210o0O00OOO = 1;

    /* renamed from: o0O00Oo  reason: collision with root package name */
    public static final int f9211o0O00Oo = 0;

    /* renamed from: o0O00OoO  reason: collision with root package name */
    public static final String f9212o0O00OoO = "call";

    /* renamed from: o0O00Ooo  reason: collision with root package name */
    public static final String f9213o0O00Ooo = "navigation";

    /* renamed from: o0O00o  reason: collision with root package name */
    public static final String f9214o0O00o = "promo";

    /* renamed from: o0O00o00  reason: collision with root package name */
    public static final String f9215o0O00o00 = "msg";

    /* renamed from: o0O00o0O  reason: collision with root package name */
    public static final String f9216o0O00o0O = "email";

    /* renamed from: o0O00o0o  reason: collision with root package name */
    public static final String f9217o0O00o0o = "event";

    /* renamed from: o0O00oO0  reason: collision with root package name */
    public static final String f9218o0O00oO0 = "alarm";

    /* renamed from: o0O0O0O  reason: collision with root package name */
    public static final String f9219o0O0O0O = "progress";

    /* renamed from: o0O0O0Oo  reason: collision with root package name */
    public static final String f9220o0O0O0Oo = "transport";

    /* renamed from: o0O0O0o  reason: collision with root package name */
    public static final String f9221o0O0O0o = "service";

    /* renamed from: o0O0O0o0  reason: collision with root package name */
    public static final String f9222o0O0O0o0 = "sys";

    /* renamed from: o0O0O0oO  reason: collision with root package name */
    public static final String f9223o0O0O0oO = "reminder";

    /* renamed from: o0O0O0oo  reason: collision with root package name */
    public static final String f9224o0O0O0oo = "recommendation";

    /* renamed from: o0O0OO  reason: collision with root package name */
    public static final String f9225o0O0OO = "stopwatch";

    /* renamed from: o0O0OO0  reason: collision with root package name */
    public static final String f9226o0O0OO0 = "workout";

    /* renamed from: o0O0OO0O  reason: collision with root package name */
    public static final String f9227o0O0OO0O = "location_sharing";

    /* renamed from: o0O0OOO  reason: collision with root package name */
    public static final int f9228o0O0OOO = 0;

    /* renamed from: o0O0OOO0  reason: collision with root package name */
    public static final String f9229o0O0OOO0 = "missed_call";

    /* renamed from: o0O0OOOo  reason: collision with root package name */
    public static final int f9230o0O0OOOo = 1;

    /* renamed from: o0O0OOo  reason: collision with root package name */
    public static final int f9231o0O0OOo = 2;

    /* renamed from: o0O0OOoO  reason: collision with root package name */
    public static final int f9232o0O0OOoO = 0;

    /* renamed from: o0O0OOoo  reason: collision with root package name */
    public static final int f9233o0O0OOoo = 1;

    /* renamed from: o0O0Oo  reason: collision with root package name */
    public static final int f9234o0O0Oo = 2;

    /* renamed from: o0O0Oo0  reason: collision with root package name */
    public static final String f9235o0O0Oo0 = "silent";

    /* renamed from: o0O0Oo0O  reason: collision with root package name */
    public static final int f9236o0O0Oo0O = 0;

    /* renamed from: o0O0Oo0o  reason: collision with root package name */
    public static final int f9237o0O0Oo0o = 1;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f9238o0O0o = 0;

    /* renamed from: o0O0oo0o  reason: collision with root package name */
    public static final String f9239o0O0oo0o = "err";
    @SuppressLint({"ActionValue"})

    /* renamed from: o0OoO00O  reason: collision with root package name */
    public static final String f9240o0OoO00O = "android.isGroupConversation";
    @SuppressLint({"ActionValue"})

    /* renamed from: o0OoOoOO  reason: collision with root package name */
    public static final String f9241o0OoOoOO = "android.mediaSession";
    @SuppressLint({"ActionValue"})

    /* renamed from: o0OoOoOo  reason: collision with root package name */
    public static final String f9242o0OoOoOo = "android.people.list";

    /* renamed from: o0OooO0  reason: collision with root package name */
    public static final int f9243o0OooO0 = 2;

    /* renamed from: o0oO0O0o  reason: collision with root package name */
    public static final String f9244o0oO0O0o = "social";

    /* renamed from: o0oO0Ooo  reason: collision with root package name */
    public static final int f9245o0oO0Ooo = -1;

    /* renamed from: o0ooO  reason: collision with root package name */
    public static final String f9246o0ooO = "status";
    @SuppressLint({"ActionValue"})

    /* renamed from: o0ooOoOO  reason: collision with root package name */
    public static final String f9247o0ooOoOO = "android.messagingStyleUser";

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o0 {
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oo  reason: collision with root package name */
        public static final int f9248o00oo = 10;

        /* renamed from: o00oo0  reason: collision with root package name */
        public static final int f9249o00oo0 = 1;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public static final int f9250o00oo00O = 0;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static final int f9251o00oo0O = 4;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final int f9252o00oo0O0 = 3;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public static final int f9253o00oo0OO = 2;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final int f9254o00oo0Oo = 5;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public static final int f9255o00oo0o = 7;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public static final int f9256o00oo0o0 = 6;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public static final int f9257o00oo0oO = 8;

        /* renamed from: o00ooO0  reason: collision with root package name */
        public static final String f9258o00ooO0 = "android.support.action.semanticAction";

        /* renamed from: o00ooO00  reason: collision with root package name */
        public static final String f9259o00ooO00 = "android.support.action.showsUserInterface";

        /* renamed from: o0O0o  reason: collision with root package name */
        public static final int f9260o0O0o = 9;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Bundle f9261o00oOOo0;
        @o0OO00OO

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public IconCompat f9262o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final ooo0o[] f9263o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public boolean f9264o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public boolean f9265o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public final boolean f9266o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public final int f9267o00oOoO0;
        @Deprecated

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public int f9268o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public CharSequence f9269o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public PendingIntent f9270o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final ooo0o[] f9271o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public boolean f9272o00oOooo;

        /* loaded from: classes.dex */
        public static final class o00oOOo0 {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final IconCompat f9273o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public final CharSequence f9274o00oOOoO;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public final PendingIntent f9275o00oOo00;

            /* renamed from: o00oOo0O  reason: collision with root package name */
            public final Bundle f9276o00oOo0O;

            /* renamed from: o00oOo0o  reason: collision with root package name */
            public ArrayList<ooo0o> f9277o00oOo0o;

            /* renamed from: o00oOoO  reason: collision with root package name */
            public boolean f9278o00oOoO;

            /* renamed from: o00oOoO0  reason: collision with root package name */
            public int f9279o00oOoO0;

            /* renamed from: o00oOoOO  reason: collision with root package name */
            public boolean f9280o00oOoOO;

            /* renamed from: o00oOoOo  reason: collision with root package name */
            public boolean f9281o00oOoOo;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public boolean f9282o00oOooO;

            public o00oOOo0(int i, @o0OO00OO CharSequence charSequence, @o0OO00OO PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.o00oo(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public o00oOOo0(@o0OO00OO IconCompat iconCompat, @o0OO00OO CharSequence charSequence, @o0OO00OO PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public o00oOOo0(@o0OO00OO IconCompat iconCompat, @o0OO00OO CharSequence charSequence, @o0OO00OO PendingIntent pendingIntent, @oo0oO0 Bundle bundle, @o0OO00OO ooo0o[] ooo0oVarArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.f9282o00oOooO = true;
                this.f9278o00oOoO = true;
                this.f9273o00oOOo0 = iconCompat;
                this.f9274o00oOOoO = o00oo0.o00ooO0o(charSequence);
                this.f9275o00oOo00 = pendingIntent;
                this.f9276o00oOo0O = bundle;
                this.f9277o00oOo0o = ooo0oVarArr == null ? null : new ArrayList<>(Arrays.asList(ooo0oVarArr));
                this.f9282o00oOooO = z;
                this.f9279o00oOoO0 = i;
                this.f9278o00oOoO = z2;
                this.f9280o00oOoOO = z3;
                this.f9281o00oOoOo = z4;
            }

            public o00oOOo0(@oo0oO0 o00oOOoO o00ooooo2) {
                this(o00ooooo2.o00oOo0o(), o00ooooo2.f9269o00oOoOo, o00ooooo2.f9270o00oOoo0, new Bundle(o00ooooo2.f9261o00oOOo0), o00ooooo2.o00oOoO0(), o00ooooo2.o00oOOoO(), o00ooooo2.o00oOoO(), o00ooooo2.f9265o00oOo0o, o00ooooo2.o00oOooo(), o00ooooo2.o00oOoo0());
            }

            @o0OOooO0(19)
            @oo0oO0
            @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
            public static o00oOOo0 o00oOo0o(@oo0oO0 Notification.Action action) {
                boolean isAuthenticationRequired;
                boolean isContextual;
                o00oOOo0 o00oooo02 = action.getIcon() != null ? new o00oOOo0(IconCompat.o00oOooo(action.getIcon()), action.title, action.actionIntent) : new o00oOOo0(action.icon, action.title, action.actionIntent);
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs != null && remoteInputs.length != 0) {
                    for (RemoteInput remoteInput : remoteInputs) {
                        o00oooo02.o00oOOoO(ooo0o.o00oOOoO.o00oOo00(remoteInput));
                    }
                }
                int i = Build.VERSION.SDK_INT;
                o00oooo02.f9282o00oOooO = action.getAllowGeneratedReplies();
                o00oooo02.f9279o00oOoO0 = action.getSemanticAction();
                if (i >= 29) {
                    isContextual = action.isContextual();
                    o00oooo02.f9280o00oOoOO = isContextual;
                }
                if (i >= 31) {
                    isAuthenticationRequired = action.isAuthenticationRequired();
                    o00oooo02.f9281o00oOoOo = isAuthenticationRequired;
                }
                return o00oooo02;
            }

            @oo0oO0
            public o00oOOo0 o00oOOo0(@o0OO00OO Bundle bundle) {
                if (bundle != null) {
                    this.f9276o00oOo0O.putAll(bundle);
                }
                return this;
            }

            @oo0oO0
            public o00oOOo0 o00oOOoO(@o0OO00OO ooo0o ooo0oVar) {
                if (this.f9277o00oOo0o == null) {
                    this.f9277o00oOo0o = new ArrayList<>();
                }
                if (ooo0oVar != null) {
                    this.f9277o00oOo0o.add(ooo0oVar);
                }
                return this;
            }

            @oo0oO0
            public o00oOOoO o00oOo00() {
                o00oOooO();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<ooo0o> arrayList3 = this.f9277o00oOo0o;
                if (arrayList3 != null) {
                    Iterator<ooo0o> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        ooo0o next = it.next();
                        if (next.o00oo0Oo()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                ooo0o[] ooo0oVarArr = arrayList.isEmpty() ? null : (ooo0o[]) arrayList.toArray(new ooo0o[arrayList.size()]);
                return new o00oOOoO(this.f9273o00oOOo0, this.f9274o00oOOoO, this.f9275o00oOo00, this.f9276o00oOo0O, arrayList2.isEmpty() ? null : (ooo0o[]) arrayList2.toArray(new ooo0o[arrayList2.size()]), ooo0oVarArr, this.f9282o00oOooO, this.f9279o00oOoO0, this.f9278o00oOoO, this.f9280o00oOoOO, this.f9281o00oOoOo);
            }

            @oo0oO0
            public o00oOOo0 o00oOo0O(@oo0oO0 InterfaceC0114o00oOOoO interfaceC0114o00oOOoO) {
                interfaceC0114o00oOOoO.o00oOOo0(this);
                return this;
            }

            @oo0oO0
            public o00oOOo0 o00oOoO(boolean z) {
                this.f9282o00oOooO = z;
                return this;
            }

            @oo0oO0
            public Bundle o00oOoO0() {
                return this.f9276o00oOo0O;
            }

            @oo0oO0
            public o00oOOo0 o00oOoOO(boolean z) {
                this.f9281o00oOoOo = z;
                return this;
            }

            @oo0oO0
            public o00oOOo0 o00oOoOo(boolean z) {
                this.f9280o00oOoOO = z;
                return this;
            }

            @oo0oO0
            public o00oOOo0 o00oOoo0(int i) {
                this.f9279o00oOoO0 = i;
                return this;
            }

            public final void o00oOooO() {
                if (this.f9280o00oOoOO && this.f9275o00oOo00 == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            @oo0oO0
            public o00oOOo0 o00oOooo(boolean z) {
                this.f9278o00oOoO = z;
                return this;
            }
        }

        /* renamed from: o00ooOoo.oOo000Oo$o00oOOoO$o00oOOoO  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0114o00oOOoO {
            @oo0oO0
            o00oOOo0 o00oOOo0(@oo0oO0 o00oOOo0 o00oooo02);
        }

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface o00oOo00 {
        }

        /* loaded from: classes.dex */
        public static final class o00oOo0O implements InterfaceC0114o00oOOoO {

            /* renamed from: o00oOo0O  reason: collision with root package name */
            public static final String f9283o00oOo0O = "android.wearable.EXTENSIONS";

            /* renamed from: o00oOo0o  reason: collision with root package name */
            public static final String f9284o00oOo0o = "flags";

            /* renamed from: o00oOoO  reason: collision with root package name */
            public static final String f9285o00oOoO = "confirmLabel";

            /* renamed from: o00oOoO0  reason: collision with root package name */
            public static final String f9286o00oOoO0 = "inProgressLabel";

            /* renamed from: o00oOoOO  reason: collision with root package name */
            public static final String f9287o00oOoOO = "cancelLabel";

            /* renamed from: o00oOoOo  reason: collision with root package name */
            public static final int f9288o00oOoOo = 1;

            /* renamed from: o00oOoo0  reason: collision with root package name */
            public static final int f9289o00oOoo0 = 2;

            /* renamed from: o00oOooo  reason: collision with root package name */
            public static final int f9290o00oOooo = 4;

            /* renamed from: o00oo00O  reason: collision with root package name */
            public static final int f9291o00oo00O = 1;

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public int f9292o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public CharSequence f9293o00oOOoO;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public CharSequence f9294o00oOo00;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public CharSequence f9295o00oOooO;

            public o00oOo0O() {
                this.f9292o00oOOo0 = 1;
            }

            public o00oOo0O(@oo0oO0 o00oOOoO o00ooooo2) {
                this.f9292o00oOOo0 = 1;
                Bundle bundle = o00ooooo2.o00oOooO().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.f9292o00oOOo0 = bundle.getInt("flags", 1);
                    this.f9293o00oOOoO = bundle.getCharSequence(f9286o00oOoO0);
                    this.f9294o00oOo00 = bundle.getCharSequence(f9285o00oOoO);
                    this.f9295o00oOooO = bundle.getCharSequence(f9287o00oOoOO);
                }
            }

            @Override // o00ooOoo.oOo000Oo.o00oOOoO.InterfaceC0114o00oOOoO
            @oo0oO0
            public o00oOOo0 o00oOOo0(@oo0oO0 o00oOOo0 o00oooo02) {
                Bundle bundle = new Bundle();
                int i = this.f9292o00oOOo0;
                if (i != 1) {
                    bundle.putInt("flags", i);
                }
                CharSequence charSequence = this.f9293o00oOOoO;
                if (charSequence != null) {
                    bundle.putCharSequence(f9286o00oOoO0, charSequence);
                }
                CharSequence charSequence2 = this.f9294o00oOo00;
                if (charSequence2 != null) {
                    bundle.putCharSequence(f9285o00oOoO, charSequence2);
                }
                CharSequence charSequence3 = this.f9295o00oOooO;
                if (charSequence3 != null) {
                    bundle.putCharSequence(f9287o00oOoOO, charSequence3);
                }
                o00oooo02.f9276o00oOo0O.putBundle("android.wearable.EXTENSIONS", bundle);
                return o00oooo02;
            }

            @oo0oO0
            /* renamed from: o00oOOoO */
            public o00oOo0O clone() {
                o00oOo0O o00ooo0o2 = new o00oOo0O();
                o00ooo0o2.f9292o00oOOo0 = this.f9292o00oOOo0;
                o00ooo0o2.f9293o00oOOoO = this.f9293o00oOOoO;
                o00ooo0o2.f9294o00oOo00 = this.f9294o00oOo00;
                o00ooo0o2.f9295o00oOooO = this.f9295o00oOooO;
                return o00ooo0o2;
            }

            @o0OO00OO
            @Deprecated
            public CharSequence o00oOo00() {
                return this.f9295o00oOooO;
            }

            public boolean o00oOo0O() {
                return (this.f9292o00oOOo0 & 4) != 0;
            }

            public boolean o00oOo0o() {
                return (this.f9292o00oOOo0 & 2) != 0;
            }

            public boolean o00oOoO() {
                return (this.f9292o00oOOo0 & 1) != 0;
            }

            @o0OO00OO
            @Deprecated
            public CharSequence o00oOoO0() {
                return this.f9293o00oOOoO;
            }

            @oo0oO0
            public o00oOo0O o00oOoOO(boolean z) {
                o00oOooo(1, z);
                return this;
            }

            @oo0oO0
            @Deprecated
            public o00oOo0O o00oOoOo(@o0OO00OO CharSequence charSequence) {
                this.f9295o00oOooO = charSequence;
                return this;
            }

            @oo0oO0
            @Deprecated
            public o00oOo0O o00oOoo0(@o0OO00OO CharSequence charSequence) {
                this.f9294o00oOo00 = charSequence;
                return this;
            }

            @o0OO00OO
            @Deprecated
            public CharSequence o00oOooO() {
                return this.f9294o00oOo00;
            }

            public final void o00oOooo(int i, boolean z) {
                int i2;
                if (z) {
                    i2 = i | this.f9292o00oOOo0;
                } else {
                    i2 = (~i) & this.f9292o00oOOo0;
                }
                this.f9292o00oOOo0 = i2;
            }

            @oo0oO0
            public o00oOo0O o00oo0(boolean z) {
                o00oOooo(2, z);
                return this;
            }

            @oo0oO0
            public o00oOo0O o00oo00O(boolean z) {
                o00oOooo(4, z);
                return this;
            }

            @oo0oO0
            @Deprecated
            public o00oOo0O o00oo0OO(@o0OO00OO CharSequence charSequence) {
                this.f9293o00oOOoO = charSequence;
                return this;
            }
        }

        public o00oOOoO(int i, @o0OO00OO CharSequence charSequence, @o0OO00OO PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.o00oo(null, "", i) : null, charSequence, pendingIntent);
        }

        public o00oOOoO(int i, @o0OO00OO CharSequence charSequence, @o0OO00OO PendingIntent pendingIntent, @o0OO00OO Bundle bundle, @o0OO00OO ooo0o[] ooo0oVarArr, @o0OO00OO ooo0o[] ooo0oVarArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this(i != 0 ? IconCompat.o00oo(null, "", i) : null, charSequence, pendingIntent, bundle, ooo0oVarArr, ooo0oVarArr2, z, i2, z2, z3, z4);
        }

        public o00oOOoO(@o0OO00OO IconCompat iconCompat, @o0OO00OO CharSequence charSequence, @o0OO00OO PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (ooo0o[]) null, (ooo0o[]) null, true, 0, true, false, false);
        }

        public o00oOOoO(@o0OO00OO IconCompat iconCompat, @o0OO00OO CharSequence charSequence, @o0OO00OO PendingIntent pendingIntent, @o0OO00OO Bundle bundle, @o0OO00OO ooo0o[] ooo0oVarArr, @o0OO00OO ooo0o[] ooo0oVarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f9265o00oOo0o = true;
            this.f9262o00oOOoO = iconCompat;
            if (iconCompat != null && iconCompat.o00ooO() == 2) {
                this.f9268o00oOoOO = iconCompat.o00ooO0();
            }
            this.f9269o00oOoOo = o00oo0.o00ooO0o(charSequence);
            this.f9270o00oOoo0 = pendingIntent;
            this.f9261o00oOOo0 = bundle == null ? new Bundle() : bundle;
            this.f9263o00oOo00 = ooo0oVarArr;
            this.f9271o00oOooO = ooo0oVarArr2;
            this.f9264o00oOo0O = z;
            this.f9267o00oOoO0 = i;
            this.f9265o00oOo0o = z2;
            this.f9266o00oOoO = z3;
            this.f9272o00oOooo = z4;
        }

        @o0OO00OO
        public PendingIntent o00oOOo0() {
            return this.f9270o00oOoo0;
        }

        public boolean o00oOOoO() {
            return this.f9264o00oOo0O;
        }

        @o0OO00OO
        public ooo0o[] o00oOo00() {
            return this.f9271o00oOooO;
        }

        @Deprecated
        public int o00oOo0O() {
            return this.f9268o00oOoOO;
        }

        @o0OO00OO
        public IconCompat o00oOo0o() {
            int i;
            if (this.f9262o00oOOoO == null && (i = this.f9268o00oOoOO) != 0) {
                this.f9262o00oOOoO = IconCompat.o00oo(null, "", i);
            }
            return this.f9262o00oOOoO;
        }

        public int o00oOoO() {
            return this.f9267o00oOoO0;
        }

        @o0OO00OO
        public ooo0o[] o00oOoO0() {
            return this.f9263o00oOo00;
        }

        public boolean o00oOoOO() {
            return this.f9265o00oOo0o;
        }

        @o0OO00OO
        public CharSequence o00oOoOo() {
            return this.f9269o00oOoOo;
        }

        public boolean o00oOoo0() {
            return this.f9272o00oOooo;
        }

        @oo0oO0
        public Bundle o00oOooO() {
            return this.f9261o00oOOo0;
        }

        public boolean o00oOooo() {
            return this.f9266o00oOoO;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oOo00 {
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O extends o0O0000O {

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final String f9296o00oOoOo = "androidx.core.app.NotificationCompat$BigPictureStyle";

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public IconCompat f9297o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public IconCompat f9298o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public CharSequence f9299o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public boolean f9300o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public boolean f9301o00oOoOO;

        @o0OOooO0(16)
        /* loaded from: classes.dex */
        public static class o00oOOo0 {
            private o00oOOo0() {
            }

            @o0OOooO0(16)
            public static void o00oOOo0(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            @o0OOooO0(16)
            public static void o00oOOoO(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        @o0OOooO0(23)
        /* loaded from: classes.dex */
        public static class o00oOOoO {
            private o00oOOoO() {
            }

            @o0OOooO0(23)
            public static void o00oOOo0(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @o0OOooO0(31)
        /* loaded from: classes.dex */
        public static class o00oOo00 {
            private o00oOo00() {
            }

            @o0OOooO0(31)
            public static void o00oOOo0(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @o0OOooO0(31)
            public static void o00oOOoO(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @o0OOooO0(31)
            public static void o00oOo00(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        public o00oOo0O() {
        }

        public o00oOo0O(@o0OO00OO o00oo0 o00oo0Var) {
            o00ooO0O(o00oo0Var);
        }

        @o0OO00OO
        public static IconCompat o00ooO0o(@o0OO00OO Parcelable parcelable) {
            if (parcelable != null) {
                if (parcelable instanceof Icon) {
                    return IconCompat.o00oOooo((Icon) parcelable);
                }
                if (parcelable instanceof Bitmap) {
                    return IconCompat.o00oo0Oo((Bitmap) parcelable);
                }
                return null;
            }
            return null;
        }

        @o0OO00OO
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public static IconCompat o00ooOOo(@o0OO00OO Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(oOo000Oo.f9194o00ooooO);
            return parcelable != null ? o00ooO0o(parcelable) : o00ooO0o(bundle.getParcelable(oOo000Oo.f9195o00ooooo));
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00oOOoO(oO00OOO oo00ooo) {
            int i = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(oo00ooo.o00oOOo0()).setBigContentTitle(this.f9473o00oOOoO);
            IconCompat iconCompat = this.f9297o00oOo0O;
            if (iconCompat != null) {
                if (i >= 31) {
                    o00oOo00.o00oOOo0(bigContentTitle, this.f9297o00oOo0O.o00ooo0O(oo00ooo instanceof oO0O0 ? ((oO0O0) oo00ooo).o00oOo0o() : null));
                } else if (iconCompat.o00ooO() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f9297o00oOo0O.o00ooO00());
                }
            }
            if (this.f9300o00oOoO0) {
                if (this.f9298o00oOo0o == null) {
                    o00oOOo0.o00oOOo0(bigContentTitle, null);
                } else {
                    o00oOOoO.o00oOOo0(bigContentTitle, this.f9298o00oOo0o.o00ooo0O(oo00ooo instanceof oO0O0 ? ((oO0O0) oo00ooo).o00oOo0o() : null));
                }
            }
            if (this.f9475o00oOooO) {
                o00oOOo0.o00oOOoO(bigContentTitle, this.f9474o00oOo00);
            }
            if (i >= 31) {
                o00oOo00.o00oOo00(bigContentTitle, this.f9301o00oOoOO);
                o00oOo00.o00oOOoO(bigContentTitle, this.f9299o00oOoO);
            }
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00oOoO0(@oo0oO0 Bundle bundle) {
            super.o00oOoO0(bundle);
            bundle.remove(oOo000Oo.f9185o00ooo0);
            bundle.remove(oOo000Oo.f9194o00ooooO);
            bundle.remove(oOo000Oo.f9195o00ooooo);
            bundle.remove(oOo000Oo.f9198o0O00000);
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @oo0oO0
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public String o00oo0o() {
            return f9296o00oOoOo;
        }

        @oo0oO0
        public o00oOo0O o00ooO(@o0OO00OO Bitmap bitmap) {
            this.f9298o00oOo0o = bitmap == null ? null : IconCompat.o00oo0Oo(bitmap);
            this.f9300o00oOoO0 = true;
            return this;
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00ooO0(@oo0oO0 Bundle bundle) {
            super.o00ooO0(bundle);
            if (bundle.containsKey(oOo000Oo.f9185o00ooo0)) {
                this.f9298o00oOo0o = o00ooO0o(bundle.getParcelable(oOo000Oo.f9185o00ooo0));
                this.f9300o00oOoO0 = true;
            }
            this.f9297o00oOo0O = o00ooOOo(bundle);
            this.f9301o00oOoOO = bundle.getBoolean(oOo000Oo.f9198o0O00000);
        }

        @o0OOooO0(31)
        @oo0oO0
        public o00oOo0O o00ooOO(@o0OO00OO Icon icon) {
            this.f9297o00oOo0O = IconCompat.o00oOooo(icon);
            return this;
        }

        @oo0oO0
        public o00oOo0O o00ooOO0(@o0OO00OO Bitmap bitmap) {
            this.f9297o00oOo0O = bitmap == null ? null : IconCompat.o00oo0Oo(bitmap);
            return this;
        }

        @o0OOooO0(31)
        @oo0oO0
        public o00oOo0O o00ooOo(@o0OO00OO CharSequence charSequence) {
            this.f9299o00oOoO = charSequence;
            return this;
        }

        @oo0oO0
        public o00oOo0O o00ooOo0(@o0OO00OO CharSequence charSequence) {
            this.f9473o00oOOoO = o00oo0.o00ooO0o(charSequence);
            return this;
        }

        @oo0oO0
        public o00oOo0O o00ooOoO(@o0OO00OO CharSequence charSequence) {
            this.f9474o00oOo00 = o00oo0.o00ooO0o(charSequence);
            this.f9475o00oOooO = true;
            return this;
        }

        @o0OOooO0(31)
        @oo0oO0
        public o00oOo0O o00ooOoo(boolean z) {
            this.f9301o00oOoOO = z;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO extends o0O0000O {

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final String f9302o00oOo0o = "androidx.core.app.NotificationCompat$BigTextStyle";

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public CharSequence f9303o00oOo0O;

        public o00oOoO() {
        }

        public o00oOoO(@o0OO00OO o00oo0 o00oo0Var) {
            o00ooO0O(o00oo0Var);
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00oOOo0(@oo0oO0 Bundle bundle) {
            super.o00oOOo0(bundle);
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00oOOoO(oO00OOO oo00ooo) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(oo00ooo.o00oOOo0()).setBigContentTitle(this.f9473o00oOOoO).bigText(this.f9303o00oOo0O);
            if (this.f9475o00oOooO) {
                bigText.setSummaryText(this.f9474o00oOo00);
            }
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00oOoO0(@oo0oO0 Bundle bundle) {
            super.o00oOoO0(bundle);
            bundle.remove(oOo000Oo.f9183o00ooOoO);
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @oo0oO0
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public String o00oo0o() {
            return f9302o00oOo0o;
        }

        @oo0oO0
        public o00oOoO o00ooO(@o0OO00OO CharSequence charSequence) {
            this.f9473o00oOOoO = o00oo0.o00ooO0o(charSequence);
            return this;
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00ooO0(@oo0oO0 Bundle bundle) {
            super.o00ooO0(bundle);
            this.f9303o00oOo0O = bundle.getCharSequence(oOo000Oo.f9183o00ooOoO);
        }

        @oo0oO0
        public o00oOoO o00ooO0o(@o0OO00OO CharSequence charSequence) {
            this.f9303o00oOo0O = o00oo0.o00ooO0o(charSequence);
            return this;
        }

        @oo0oO0
        public o00oOoO o00ooOO0(@o0OO00OO CharSequence charSequence) {
            this.f9474o00oOo00 = o00oo0.o00ooO0o(charSequence);
            this.f9475o00oOooO = true;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo extends o0O0000O {

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final String f9304o00oOo0o = "androidx.core.app.NotificationCompat$InboxStyle";

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public ArrayList<CharSequence> f9305o00oOo0O = new ArrayList<>();

        public o00oo() {
        }

        public o00oo(@o0OO00OO o00oo0 o00oo0Var) {
            o00ooO0O(o00oo0Var);
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00oOOoO(oO00OOO oo00ooo) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(oo00ooo.o00oOOo0()).setBigContentTitle(this.f9473o00oOOoO);
            if (this.f9475o00oOooO) {
                bigContentTitle.setSummaryText(this.f9474o00oOo00);
            }
            Iterator<CharSequence> it = this.f9305o00oOo0O.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00oOoO0(@oo0oO0 Bundle bundle) {
            super.o00oOoO0(bundle);
            bundle.remove(oOo000Oo.f9199o0O0000O);
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @oo0oO0
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public String o00oo0o() {
            return f9304o00oOo0o;
        }

        @oo0oO0
        public o00oo o00ooO(@o0OO00OO CharSequence charSequence) {
            this.f9473o00oOOoO = o00oo0.o00ooO0o(charSequence);
            return this;
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00ooO0(@oo0oO0 Bundle bundle) {
            super.o00ooO0(bundle);
            this.f9305o00oOo0O.clear();
            if (bundle.containsKey(oOo000Oo.f9199o0O0000O)) {
                Collections.addAll(this.f9305o00oOo0O, bundle.getCharSequenceArray(oOo000Oo.f9199o0O0000O));
            }
        }

        @oo0oO0
        public o00oo o00ooO0o(@o0OO00OO CharSequence charSequence) {
            if (charSequence != null) {
                this.f9305o00oOo0O.add(o00oo0.o00ooO0o(charSequence));
            }
            return this;
        }

        @oo0oO0
        public o00oo o00ooOO0(@o0OO00OO CharSequence charSequence) {
            this.f9474o00oOo00 = o00oo0.o00ooO0o(charSequence);
            this.f9475o00oOooO = true;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0 {

        /* renamed from: o0O000  reason: collision with root package name */
        public static final int f9306o0O000 = 5120;

        /* renamed from: o0  reason: collision with root package name */
        public Notification f9307o0;
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Context f9308o00oOOo0;
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public ArrayList<o00oOOoO> f9309o00oOOoO;
        @oo0oO0
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

        /* renamed from: o00oOo00  reason: collision with root package name */
        public ArrayList<ooOOO0Oo> f9310o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public CharSequence f9311o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public CharSequence f9312o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public PendingIntent f9313o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public PendingIntent f9314o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public RemoteViews f9315o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public Bitmap f9316o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public CharSequence f9317o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public ArrayList<o00oOOoO> f9318o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public int f9319o00oOooo;

        /* renamed from: o00oo  reason: collision with root package name */
        public boolean f9320o00oo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public boolean f9321o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public int f9322o00oo00O;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public o0O0000O f9323o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public boolean f9324o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public boolean f9325o00oo0OO;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public CharSequence f9326o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public CharSequence[] f9327o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public CharSequence f9328o00oo0o0;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public int f9329o00oo0oO;

        /* renamed from: o00ooO  reason: collision with root package name */
        public boolean f9330o00ooO;

        /* renamed from: o00ooO0  reason: collision with root package name */
        public boolean f9331o00ooO0;

        /* renamed from: o00ooO00  reason: collision with root package name */
        public String f9332o00ooO00;

        /* renamed from: o00ooO0O  reason: collision with root package name */
        public String f9333o00ooO0O;

        /* renamed from: o00ooO0o  reason: collision with root package name */
        public boolean f9334o00ooO0o;

        /* renamed from: o00ooOO  reason: collision with root package name */
        public String f9335o00ooOO;

        /* renamed from: o00ooOO0  reason: collision with root package name */
        public boolean f9336o00ooOO0;

        /* renamed from: o00ooOOo  reason: collision with root package name */
        public Bundle f9337o00ooOOo;

        /* renamed from: o00ooOo  reason: collision with root package name */
        public int f9338o00ooOo;

        /* renamed from: o00ooOo0  reason: collision with root package name */
        public int f9339o00ooOo0;

        /* renamed from: o00ooOoO  reason: collision with root package name */
        public Notification f9340o00ooOoO;

        /* renamed from: o00ooOoo  reason: collision with root package name */
        public RemoteViews f9341o00ooOoo;

        /* renamed from: o00ooo0  reason: collision with root package name */
        public RemoteViews f9342o00ooo0;

        /* renamed from: o00ooo00  reason: collision with root package name */
        public RemoteViews f9343o00ooo00;

        /* renamed from: o00ooo0O  reason: collision with root package name */
        public String f9344o00ooo0O;

        /* renamed from: o00ooo0o  reason: collision with root package name */
        public int f9345o00ooo0o;

        /* renamed from: o00oooO  reason: collision with root package name */
        public String f9346o00oooO;

        /* renamed from: o00oooOO  reason: collision with root package name */
        public o0O0OO f9347o00oooOO;

        /* renamed from: o00oooOo  reason: collision with root package name */
        public long f9348o00oooOo;

        /* renamed from: o00oooo  reason: collision with root package name */
        public int f9349o00oooo;

        /* renamed from: o00oooo0  reason: collision with root package name */
        public int f9350o00oooo0;

        /* renamed from: o00ooooO  reason: collision with root package name */
        public boolean f9351o00ooooO;

        /* renamed from: o00ooooo  reason: collision with root package name */
        public o00oo00O f9352o00ooooo;

        /* renamed from: o0O00000  reason: collision with root package name */
        public boolean f9353o0O00000;

        /* renamed from: o0O0000O  reason: collision with root package name */
        public Icon f9354o0O0000O;
        @Deprecated

        /* renamed from: o0O0000o  reason: collision with root package name */
        public ArrayList<String> f9355o0O0000o;

        /* renamed from: o0O0o  reason: collision with root package name */
        public int f9356o0O0o;

        @Deprecated
        public o00oo0(@oo0oO0 Context context) {
            this(context, (String) null);
        }

        @o0OOooO0(19)
        public o00oo0(@oo0oO0 Context context, @oo0oO0 Notification notification) {
            this(context, notification.getChannelId());
            Bundle bundle = notification.extras;
            o0O0000O o00oo0o02 = o0O0000O.o00oo0o0(notification);
            o00oooOo(oOo000Oo.o00oo00O(notification)).o00oooOO(oOo000Oo.o00oOooo(notification)).o00ooo0o(oOo000Oo.o00oOoo0(notification)).o0O0O0Oo(oOo000Oo.o00ooOO(notification)).o0O00Oo(notification.getSettingsText()).o0O0oo0o(o00oo0o02).o00oooO(notification.contentIntent).o0O000O(notification.getGroup()).o0O000Oo(oOo000Oo.o00ooOoO(notification)).o0ooOoOO(oOo000Oo.o00oo0o(notification)).o0O0OO0O(notification.when).o0O00Ooo(oOo000Oo.o00ooO(notification)).o0O0O0oo(oOo000Oo.o00ooOo0(notification)).o00ooOO(oOo000Oo.o00oOo0O(notification)).o0OoO00O(oOo000Oo.o00oo(notification)).o0O00O0(oOo000Oo.o0O0o(notification)).o0O000o(oOo000Oo.o00oo0o0(notification)).o0OoOoOO(notification.largeIcon).o00ooOOo(notification.getBadgeIconType()).o00ooOo(notification.category).o00ooOo0(oOo000Oo.o00oOoO0(notification)).o0O00(notification.number).o0O0O0o0(notification.tickerText).o00oooO(notification.contentIntent).o0(notification.deleteIntent).o0O000(notification.fullScreenIntent, oOo000Oo.o00oo0O(notification)).o0oO0O0o(notification.sound, notification.audioStreamType).o0ooO(notification.vibrate).o0O000o0(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).o00ooooo(notification.defaults).o0O00O0o(notification.priority).o00ooo00(notification.color).o0O0OO0(notification.visibility).o0O00OO(notification.publicVersion).o0O00oO0(notification.getSortKey()).o0O0O0oO(notification.getTimeoutAfter()).o0oO0Ooo(notification.getShortcutId()).o0O00O(bundle.getInt(oOo000Oo.f9188o00ooo0o), bundle.getInt(oOo000Oo.f9187o00ooo0O), bundle.getBoolean(oOo000Oo.f9189o00oooO)).o00ooOO0(oOo000Oo.o00oOooO(notification)).o0O00o0o(notification.icon, notification.iconLevel).o00oOo00(o00oo0oO(notification, o00oo0o02));
            this.f9354o0O0000O = notification.getSmallIcon();
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    o00oOOoO(o00oOOoO.o00oOOo0.o00oOo0o(action).o00oOo00());
                }
            }
            List<o00oOOoO> o00oo0Oo2 = oOo000Oo.o00oo0Oo(notification);
            if (!o00oo0Oo2.isEmpty()) {
                for (o00oOOoO o00ooooo2 : o00oo0Oo2) {
                    o00oOo0O(o00ooooo2);
                }
            }
            String[] stringArray = notification.extras.getStringArray(oOo000Oo.f9201o0O000O);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    o00oOo0o(str);
                }
            }
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(oOo000Oo.f9242o0OoOoOo);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    o00oOoO0(ooOOO0Oo.o00oOOoO.o00oOOo0((Person) it.next()));
                }
            }
            if (bundle.containsKey(oOo000Oo.f9191o00oooOo)) {
                o00ooOoo(bundle.getBoolean(oOo000Oo.f9191o00oooOo));
            }
            if (bundle.containsKey(oOo000Oo.f9193o00oooo0)) {
                o00ooo0(bundle.getBoolean(oOo000Oo.f9193o00oooo0));
            }
        }

        public o00oo0(@oo0oO0 Context context, @oo0oO0 String str) {
            this.f9309o00oOOoO = new ArrayList<>();
            this.f9310o00oOo00 = new ArrayList<>();
            this.f9318o00oOooO = new ArrayList<>();
            this.f9321o00oo0 = true;
            this.f9334o00ooO0o = false;
            this.f9339o00ooOo0 = 0;
            this.f9338o00ooOo = 0;
            this.f9345o00ooo0o = 0;
            this.f9350o00oooo0 = 0;
            this.f9349o00oooo = 0;
            Notification notification = new Notification();
            this.f9307o0 = notification;
            this.f9308o00oOOo0 = context;
            this.f9344o00ooo0O = str;
            notification.when = System.currentTimeMillis();
            this.f9307o0.audioStreamType = -1;
            this.f9322o00oo00O = 0;
            this.f9355o0O0000o = new ArrayList<>();
            this.f9351o00ooooO = true;
        }

        @o0OOooO0(19)
        @o0OO00OO
        public static Bundle o00oo0oO(@oo0oO0 Notification notification, @o0OO00OO o0O0000O o0o0000o) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(oOo000Oo.f9177o00ooO0o);
            bundle.remove(oOo000Oo.f9179o00ooOO0);
            bundle.remove(oOo000Oo.f9182o00ooOo0);
            bundle.remove(oOo000Oo.f9178o00ooOO);
            bundle.remove(oOo000Oo.f9152o00oOOoO);
            bundle.remove(oOo000Oo.f9153o00oOo00);
            bundle.remove(oOo000Oo.f9192o00oooo);
            bundle.remove(oOo000Oo.f9187o00ooo0O);
            bundle.remove(oOo000Oo.f9188o00ooo0o);
            bundle.remove(oOo000Oo.f9189o00oooO);
            bundle.remove(oOo000Oo.f9191o00oooOo);
            bundle.remove(oOo000Oo.f9193o00oooo0);
            bundle.remove(oOo000Oo.f9242o0OoOoOo);
            bundle.remove(oOo000Oo.f9201o0O000O);
            bundle.remove(oO0O0O00.f9072o00oOooO);
            bundle.remove(oO0O0O00.f9068o00oOOoO);
            bundle.remove(oO0O0O00.f9069o00oOo00);
            bundle.remove(oO0O0O00.f9067o00oOOo0);
            bundle.remove(oO0O0O00.f9070o00oOo0O);
            Bundle bundle2 = bundle.getBundle(o00oo0OO.f9382o00oOooO);
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove(o00oo0OO.f9377o00oOoO);
                bundle.putBundle(o00oo0OO.f9382o00oOooO, bundle3);
            }
            if (o0o0000o != null) {
                o0o0000o.o00oOoO0(bundle);
            }
            return bundle;
        }

        @o0OO00OO
        public static CharSequence o00ooO0o(@o0OO00OO CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, f9306o0O000) : charSequence;
        }

        @oo0oO0
        public o00oo0 o0(@o0OO00OO PendingIntent pendingIntent) {
            this.f9307o0.deleteIntent = pendingIntent;
            return this;
        }

        @oo0oO0
        public o00oo0 o00oOOo0(int i, @o0OO00OO CharSequence charSequence, @o0OO00OO PendingIntent pendingIntent) {
            this.f9309o00oOOoO.add(new o00oOOoO(i, charSequence, pendingIntent));
            return this;
        }

        @oo0oO0
        public o00oo0 o00oOOoO(@o0OO00OO o00oOOoO o00ooooo2) {
            if (o00ooooo2 != null) {
                this.f9309o00oOOoO.add(o00ooooo2);
            }
            return this;
        }

        @oo0oO0
        public o00oo0 o00oOo00(@o0OO00OO Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f9337o00ooOOo;
                if (bundle2 == null) {
                    this.f9337o00ooOOo = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        @o0OOooO0(21)
        @oo0oO0
        public o00oo0 o00oOo0O(@o0OO00OO o00oOOoO o00ooooo2) {
            if (o00ooooo2 != null) {
                this.f9318o00oOooO.add(o00ooooo2);
            }
            return this;
        }

        @oo0oO0
        @Deprecated
        public o00oo0 o00oOo0o(@o0OO00OO String str) {
            if (str != null && !str.isEmpty()) {
                this.f9355o0O0000o.add(str);
            }
            return this;
        }

        @oo0oO0
        public Notification o00oOoO() {
            return new oO0O0(this).o00oOo00();
        }

        @oo0oO0
        public o00oo0 o00oOoO0(@o0OO00OO ooOOO0Oo ooooo0oo) {
            if (ooooo0oo != null) {
                this.f9310o00oOo00.add(ooooo0oo);
            }
            return this;
        }

        @oo0oO0
        public o00oo0 o00oOoOO() {
            this.f9309o00oOOoO.clear();
            return this;
        }

        @oo0oO0
        public o00oo0 o00oOoOo() {
            this.f9318o00oOooO.clear();
            Bundle bundle = this.f9337o00ooOOo.getBundle(o00oo0OO.f9382o00oOooO);
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove(o00oo0OO.f9377o00oOoO);
                this.f9337o00ooOOo.putBundle(o00oo0OO.f9382o00oOooO, bundle2);
            }
            return this;
        }

        @oo0oO0
        public o00oo0 o00oOoo0() {
            this.f9310o00oOo00.clear();
            this.f9355o0O0000o.clear();
            return this;
        }

        @o0OOooO0(21)
        @oo0oO0
        public o00oo0 o00oOooO(int i, @o0OO00OO CharSequence charSequence, @o0OO00OO PendingIntent pendingIntent) {
            this.f9318o00oOooO.add(new o00oOOoO(i, charSequence, pendingIntent));
            return this;
        }

        @o0OO00OO
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews o00oOooo() {
            RemoteViews o0O0o2;
            if (this.f9343o00ooo00 == null || !o0O0OO()) {
                oO0O0 oo0o0 = new oO0O0(this);
                o0O0000O o0o0000o = this.f9323o00oo0O;
                return (o0o0000o == null || (o0O0o2 = o0o0000o.o0O0o(oo0o0)) == null) ? Notification.Builder.recoverBuilder(this.f9308o00oOOo0, oo0o0.o00oOo00()).createBigContentView() : o0O0o2;
            }
            return this.f9343o00ooo00;
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public RemoteViews o00oo() {
            return this.f9342o00ooo0;
        }

        @o0OO00OO
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews o00oo0() {
            RemoteViews o00ooO002;
            if (this.f9342o00ooo0 == null || !o0O0OO()) {
                oO0O0 oo0o0 = new oO0O0(this);
                o0O0000O o0o0000o = this.f9323o00oo0O;
                return (o0o0000o == null || (o00ooO002 = o0o0000o.o00ooO00(oo0o0)) == null) ? Notification.Builder.recoverBuilder(this.f9308o00oOOo0, oo0o0.o00oOo00()).createHeadsUpContentView() : o00ooO002;
            }
            return this.f9342o00ooo0;
        }

        @o0OO00OO
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews o00oo00O() {
            RemoteViews o00oo2;
            if (this.f9341o00ooOoo == null || !o0O0OO()) {
                oO0O0 oo0o0 = new oO0O0(this);
                o0O0000O o0o0000o = this.f9323o00oo0O;
                return (o0o0000o == null || (o00oo2 = o0o0000o.o00oo(oo0o0)) == null) ? Notification.Builder.recoverBuilder(this.f9308o00oOOo0, oo0o0.o00oOo00()).createContentView() : o00oo2;
            }
            return this.f9341o00ooOoo;
        }

        @o0OO00OO
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public o00oo00O o00oo0O() {
            return this.f9352o00ooooo;
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public RemoteViews o00oo0O0() {
            return this.f9343o00ooo00;
        }

        @oo0oO0
        public o00oo0 o00oo0OO(@oo0oO0 o00oo0O o00oo0o2) {
            o00oo0o2.o00oOOo0(this);
            return this;
        }

        @o0O00O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public int o00oo0Oo() {
            return this.f9339o00ooOo0;
        }

        @oo0oO0
        public Bundle o00oo0o() {
            if (this.f9337o00ooOOo == null) {
                this.f9337o00ooOOo = new Bundle();
            }
            return this.f9337o00ooOOo;
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public RemoteViews o00oo0o0() {
            return this.f9341o00ooOoo;
        }

        @o0OO00OO
        public final Bitmap o00ooO(@o0OO00OO Bitmap bitmap) {
            return bitmap;
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public int o00ooO0() {
            return this.f9322o00oo00O;
        }

        @oo0oO0
        @Deprecated
        public Notification o00ooO00() {
            return o00oOoO();
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public long o00ooO0O() {
            if (this.f9321o00oo0) {
                return this.f9307o0.when;
            }
            return 0L;
        }

        @oo0oO0
        public o00oo0 o00ooOO(boolean z) {
            o0O0000O(16, z);
            return this;
        }

        @oo0oO0
        public o00oo0 o00ooOO0(boolean z) {
            this.f9351o00ooooO = z;
            return this;
        }

        @oo0oO0
        public o00oo0 o00ooOOo(int i) {
            this.f9345o00ooo0o = i;
            return this;
        }

        @oo0oO0
        public o00oo0 o00ooOo(@o0OO00OO String str) {
            this.f9335o00ooOO = str;
            return this;
        }

        @oo0oO0
        public o00oo0 o00ooOo0(@o0OO00OO o00oo00O o00oo00o) {
            this.f9352o00ooooo = o00oo00o;
            return this;
        }

        @oo0oO0
        public o00oo0 o00ooOoO(@oo0oO0 String str) {
            this.f9344o00ooo0O = str;
            return this;
        }

        @o0OOooO0(24)
        @oo0oO0
        public o00oo0 o00ooOoo(boolean z) {
            this.f9324o00oo0O0 = z;
            o00oo0o().putBoolean(oOo000Oo.f9191o00oooOo, z);
            return this;
        }

        @oo0oO0
        public o00oo0 o00ooo0(boolean z) {
            this.f9330o00ooO = z;
            this.f9336o00ooOO0 = true;
            return this;
        }

        @oo0oO0
        public o00oo0 o00ooo00(@o0O00O int i) {
            this.f9339o00ooOo0 = i;
            return this;
        }

        @oo0oO0
        public o00oo0 o00ooo0O(@o0OO00OO RemoteViews remoteViews) {
            this.f9307o0.contentView = remoteViews;
            return this;
        }

        @oo0oO0
        public o00oo0 o00ooo0o(@o0OO00OO CharSequence charSequence) {
            this.f9317o00oOoo0 = o00ooO0o(charSequence);
            return this;
        }

        @oo0oO0
        public o00oo0 o00oooO(@o0OO00OO PendingIntent pendingIntent) {
            this.f9314o00oOoO0 = pendingIntent;
            return this;
        }

        @oo0oO0
        public o00oo0 o00oooOO(@o0OO00OO CharSequence charSequence) {
            this.f9312o00oOo0o = o00ooO0o(charSequence);
            return this;
        }

        @oo0oO0
        public o00oo0 o00oooOo(@o0OO00OO CharSequence charSequence) {
            this.f9311o00oOo0O = o00ooO0o(charSequence);
            return this;
        }

        @oo0oO0
        public o00oo0 o00oooo(@o0OO00OO RemoteViews remoteViews) {
            this.f9341o00ooOoo = remoteViews;
            return this;
        }

        @oo0oO0
        public o00oo0 o00oooo0(@o0OO00OO RemoteViews remoteViews) {
            this.f9343o00ooo00 = remoteViews;
            return this;
        }

        @oo0oO0
        public o00oo0 o00ooooO(@o0OO00OO RemoteViews remoteViews) {
            this.f9342o00ooo0 = remoteViews;
            return this;
        }

        @oo0oO0
        public o00oo0 o00ooooo(int i) {
            Notification notification = this.f9307o0;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @oo0oO0
        public o00oo0 o0O00(int i) {
            this.f9319o00oOooo = i;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O000(@o0OO00OO PendingIntent pendingIntent, boolean z) {
            this.f9313o00oOoO = pendingIntent;
            o0O0000O(128, z);
            return this;
        }

        @oo0oO0
        public o00oo0 o0O00000(@o0OO00OO Bundle bundle) {
            this.f9337o00ooOOo = bundle;
            return this;
        }

        public final void o0O0000O(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.f9307o0;
                i2 = i | notification.flags;
            } else {
                notification = this.f9307o0;
                i2 = (~i) & notification.flags;
            }
            notification.flags = i2;
        }

        @oo0oO0
        public o00oo0 o0O0000o(int i) {
            this.f9349o00oooo = i;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O000O(@o0OO00OO String str) {
            this.f9332o00ooO00 = str;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O000Oo(boolean z) {
            this.f9331o00ooO0 = z;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O000o(boolean z) {
            this.f9334o00ooO0o = z;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O000o0(@o0O00O int i, int i2, int i3) {
            Notification notification = this.f9307o0;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        @oo0oO0
        @Deprecated
        public o00oo0 o0O000oo() {
            this.f9353o0O00000 = true;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O00O(int i, int i2, boolean z) {
            this.f9329o00oo0oO = i;
            this.f9356o0O0o = i2;
            this.f9320o00oo = z;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O00O0(boolean z) {
            o0O0000O(2, z);
            return this;
        }

        @oo0oO0
        public o00oo0 o0O00O0o(int i) {
            this.f9322o00oo00O = i;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O00OO(@o0OO00OO Notification notification) {
            this.f9340o00ooOoO = notification;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O00OOO(@o0OO00OO CharSequence[] charSequenceArr) {
            this.f9327o00oo0o = charSequenceArr;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O00Oo(@o0OO00OO CharSequence charSequence) {
            this.f9328o00oo0o0 = o00ooO0o(charSequence);
            return this;
        }

        @oo0oO0
        public o00oo0 o0O00OoO(@o0OO00OO o0OoO00O o0ooo00o) {
            o0O0OO o0o0oo;
            if (o0ooo00o == null) {
                return this;
            }
            this.f9346o00oooO = o0ooo00o.o00oOoo0();
            if (this.f9347o00oooOO == null) {
                if (o0ooo00o.o00oo0OO() != null) {
                    o0o0oo = o0ooo00o.o00oo0OO();
                } else if (o0ooo00o.o00oOoo0() != null) {
                    o0o0oo = new o0O0OO(o0ooo00o.o00oOoo0());
                }
                this.f9347o00oooOO = o0o0oo;
            }
            if (this.f9311o00oOo0O == null) {
                o00oooOo(o0ooo00o.o00oo());
            }
            return this;
        }

        @oo0oO0
        public o00oo0 o0O00Ooo(boolean z) {
            this.f9321o00oo0 = z;
            return this;
        }

        @o0OOooO0(23)
        @oo0oO0
        public o00oo0 o0O00o(@oo0oO0 IconCompat iconCompat) {
            this.f9354o0O0000O = iconCompat.o00ooo0O(this.f9308o00oOOo0);
            return this;
        }

        @oo0oO0
        public o00oo0 o0O00o00(boolean z) {
            this.f9353o0O00000 = z;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O00o0O(int i) {
            this.f9307o0.icon = i;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O00o0o(int i, int i2) {
            Notification notification = this.f9307o0;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O00oO0(@o0OO00OO String str) {
            this.f9333o00ooO0O = str;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O0O0O(@o0OO00OO Uri uri) {
            Notification notification = this.f9307o0;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        @oo0oO0
        public o00oo0 o0O0O0Oo(@o0OO00OO CharSequence charSequence) {
            this.f9326o00oo0Oo = o00ooO0o(charSequence);
            return this;
        }

        @oo0oO0
        @Deprecated
        public o00oo0 o0O0O0o(@o0OO00OO CharSequence charSequence, @o0OO00OO RemoteViews remoteViews) {
            this.f9307o0.tickerText = o00ooO0o(charSequence);
            this.f9315o00oOoOO = remoteViews;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O0O0o0(@o0OO00OO CharSequence charSequence) {
            this.f9307o0.tickerText = o00ooO0o(charSequence);
            return this;
        }

        @oo0oO0
        public o00oo0 o0O0O0oO(long j) {
            this.f9348o00oooOo = j;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O0O0oo(boolean z) {
            this.f9325o00oo0OO = z;
            return this;
        }

        public final boolean o0O0OO() {
            o0O0000O o0o0000o = this.f9323o00oo0O;
            return o0o0000o == null || !o0o0000o.o00oo0Oo();
        }

        @oo0oO0
        public o00oo0 o0O0OO0(int i) {
            this.f9338o00ooOo = i;
            return this;
        }

        @oo0oO0
        public o00oo0 o0O0OO0O(long j) {
            this.f9307o0.when = j;
            return this;
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public int o0O0o() {
            return this.f9349o00oooo;
        }

        @oo0oO0
        public o00oo0 o0O0oo0o(@o0OO00OO o0O0000O o0o0000o) {
            if (this.f9323o00oo0O != o0o0000o) {
                this.f9323o00oo0O = o0o0000o;
                if (o0o0000o != null) {
                    o0o0000o.o00ooO0O(this);
                }
            }
            return this;
        }

        @oo0oO0
        public o00oo0 o0OoO00O(boolean z) {
            o0O0000O(8, z);
            return this;
        }

        @oo0oO0
        public o00oo0 o0OoOoOO(@o0OO00OO Bitmap bitmap) {
            this.f9316o00oOoOo = o00ooO(bitmap);
            return this;
        }

        @oo0oO0
        public o00oo0 o0OoOoOo(int i) {
            this.f9350o00oooo0 = i;
            return this;
        }

        @oo0oO0
        public o00oo0 o0oO0O0o(@o0OO00OO Uri uri, int i) {
            Notification notification = this.f9307o0;
            notification.sound = uri;
            notification.audioStreamType = i;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i).build();
            return this;
        }

        @oo0oO0
        public o00oo0 o0oO0Ooo(@o0OO00OO String str) {
            this.f9346o00oooO = str;
            return this;
        }

        @oo0oO0
        public o00oo0 o0ooO(@o0OO00OO long[] jArr) {
            this.f9307o0.vibrate = jArr;
            return this;
        }

        @oo0oO0
        public o00oo0 o0ooOoOO(@o0OO00OO o0O0OO o0o0oo) {
            this.f9347o00oooOO = o0o0oo;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo00O {

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f9357o00oOoO = 1;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f9358o00oOoOO = 2;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public PendingIntent f9359o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public PendingIntent f9360o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public IconCompat f9361o00oOo00;
        @o0O00oO0

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f9362o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f9363o00oOo0o;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public String f9364o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f9365o00oOooO;

        @o0OOooO0(29)
        /* loaded from: classes.dex */
        public static class o00oOOo0 {
            private o00oOOo0() {
            }

            @o0OOooO0(29)
            @o0OO00OO
            public static o00oo00O o00oOOo0(@o0OO00OO Notification$BubbleMetadata notification$BubbleMetadata) {
                if (notification$BubbleMetadata == null || notification$BubbleMetadata.getIntent() == null) {
                    return null;
                }
                o00oOo00 o00ooo002 = new o00oOo00(notification$BubbleMetadata.getIntent(), IconCompat.o00oOooo(notification$BubbleMetadata.getIcon()));
                o00ooo002.o00oOo0o(1, notification$BubbleMetadata.getAutoExpandBubble());
                o00ooo002.f9370o00oOo0o = notification$BubbleMetadata.getDeleteIntent();
                o00ooo002.o00oOo0o(2, notification$BubbleMetadata.isNotificationSuppressed());
                if (notification$BubbleMetadata.getDesiredHeight() != 0) {
                    o00ooo002.o00oOooO(notification$BubbleMetadata.getDesiredHeight());
                }
                if (notification$BubbleMetadata.getDesiredHeightResId() != 0) {
                    o00ooo002.o00oOo0O(notification$BubbleMetadata.getDesiredHeightResId());
                }
                return o00ooo002.o00oOOo0();
            }

            @o0OOooO0(29)
            @o0OO00OO
            public static Notification$BubbleMetadata o00oOOoO(@o0OO00OO o00oo00O o00oo00o) {
                if (o00oo00o == null || o00oo00o.f9359o00oOOo0 == null) {
                    return null;
                }
                Notification$BubbleMetadata.Builder suppressNotification = new Notification$BubbleMetadata.Builder().setIcon(o00oo00o.f9361o00oOo00.o00ooo0()).setIntent(o00oo00o.f9359o00oOOo0).setDeleteIntent(o00oo00o.f9360o00oOOoO).setAutoExpandBubble(o00oo00o.o00oOOoO()).setSuppressNotification(o00oo00o.o00oOoOO());
                int i = o00oo00o.f9365o00oOooO;
                if (i != 0) {
                    suppressNotification.setDesiredHeight(i);
                }
                int i2 = o00oo00o.f9362o00oOo0O;
                if (i2 != 0) {
                    suppressNotification.setDesiredHeightResId(i2);
                }
                return suppressNotification.build();
            }
        }

        @o0OOooO0(30)
        /* loaded from: classes.dex */
        public static class o00oOOoO {
            private o00oOOoO() {
            }

            @o0OOooO0(30)
            @o0OO00OO
            public static o00oo00O o00oOOo0(@o0OO00OO Notification$BubbleMetadata notification$BubbleMetadata) {
                String shortcutId;
                o00oOo00 o00ooo002;
                String shortcutId2;
                if (notification$BubbleMetadata == null) {
                    return null;
                }
                shortcutId = notification$BubbleMetadata.getShortcutId();
                if (shortcutId != null) {
                    shortcutId2 = notification$BubbleMetadata.getShortcutId();
                    o00ooo002 = new o00oOo00(shortcutId2);
                } else {
                    o00ooo002 = new o00oOo00(notification$BubbleMetadata.getIntent(), IconCompat.o00oOooo(notification$BubbleMetadata.getIcon()));
                }
                o00ooo002.o00oOo0o(1, notification$BubbleMetadata.getAutoExpandBubble());
                o00ooo002.f9370o00oOo0o = notification$BubbleMetadata.getDeleteIntent();
                o00ooo002.o00oOo0o(2, notification$BubbleMetadata.isNotificationSuppressed());
                if (notification$BubbleMetadata.getDesiredHeight() != 0) {
                    o00ooo002.o00oOooO(notification$BubbleMetadata.getDesiredHeight());
                }
                if (notification$BubbleMetadata.getDesiredHeightResId() != 0) {
                    o00ooo002.o00oOo0O(notification$BubbleMetadata.getDesiredHeightResId());
                }
                return o00ooo002.o00oOOo0();
            }

            @o0OOooO0(30)
            @o0OO00OO
            public static Notification$BubbleMetadata o00oOOoO(@o0OO00OO o00oo00O o00oo00o) {
                if (o00oo00o == null) {
                    return null;
                }
                Notification$BubbleMetadata.Builder builder = o00oo00o.f9364o00oOoO0 != null ? new Notification$BubbleMetadata.Builder(o00oo00o.f9364o00oOoO0) : new Notification$BubbleMetadata.Builder(o00oo00o.f9359o00oOOo0, o00oo00o.f9361o00oOo00.o00ooo0());
                builder.setDeleteIntent(o00oo00o.f9360o00oOOoO).setAutoExpandBubble(o00oo00o.o00oOOoO()).setSuppressNotification(o00oo00o.o00oOoOO());
                int i = o00oo00o.f9365o00oOooO;
                if (i != 0) {
                    builder.setDesiredHeight(i);
                }
                int i2 = o00oo00o.f9362o00oOo0O;
                if (i2 != 0) {
                    builder.setDesiredHeightResId(i2);
                }
                return builder.build();
            }
        }

        /* loaded from: classes.dex */
        public static final class o00oOo00 {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public PendingIntent f9366o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public IconCompat f9367o00oOOoO;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public int f9368o00oOo00;

            /* renamed from: o00oOo0O  reason: collision with root package name */
            public int f9369o00oOo0O;

            /* renamed from: o00oOo0o  reason: collision with root package name */
            public PendingIntent f9370o00oOo0o;

            /* renamed from: o00oOoO0  reason: collision with root package name */
            public String f9371o00oOoO0;
            @o0O00oO0

            /* renamed from: o00oOooO  reason: collision with root package name */
            public int f9372o00oOooO;

            @Deprecated
            public o00oOo00() {
            }

            public o00oOo00(@oo0oO0 PendingIntent pendingIntent, @oo0oO0 IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.f9366o00oOOo0 = pendingIntent;
                this.f9367o00oOOoO = iconCompat;
            }

            @o0OOooO0(30)
            public o00oOo00(@oo0oO0 String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.f9371o00oOoO0 = str;
            }

            @oo0oO0
            @SuppressLint({"SyntheticAccessor"})
            public o00oo00O o00oOOo0() {
                String str = this.f9371o00oOoO0;
                if (str == null && this.f9366o00oOOo0 == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f9367o00oOOoO == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                o00oo00O o00oo00o = new o00oo00O(this.f9366o00oOOo0, this.f9370o00oOo0o, this.f9367o00oOOoO, this.f9368o00oOo00, this.f9372o00oOooO, this.f9369o00oOo0O, str);
                o00oo00o.f9363o00oOo0o = this.f9369o00oOo0O;
                return o00oo00o;
            }

            @oo0oO0
            public o00oOo00 o00oOOoO(boolean z) {
                o00oOo0o(1, z);
                return this;
            }

            @oo0oO0
            public o00oOo00 o00oOo00(@o0OO00OO PendingIntent pendingIntent) {
                this.f9370o00oOo0o = pendingIntent;
                return this;
            }

            @oo0oO0
            public o00oOo00 o00oOo0O(@o0O00oO0 int i) {
                this.f9372o00oOooO = i;
                this.f9368o00oOo00 = 0;
                return this;
            }

            @oo0oO0
            public final o00oOo00 o00oOo0o(int i, boolean z) {
                int i2;
                if (z) {
                    i2 = i | this.f9369o00oOo0O;
                } else {
                    i2 = (~i) & this.f9369o00oOo0O;
                }
                this.f9369o00oOo0O = i2;
                return this;
            }

            @oo0oO0
            public o00oOo00 o00oOoO(@oo0oO0 PendingIntent pendingIntent) {
                if (this.f9371o00oOoO0 == null) {
                    if (pendingIntent != null) {
                        this.f9366o00oOOo0 = pendingIntent;
                        return this;
                    }
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            @oo0oO0
            public o00oOo00 o00oOoO0(@oo0oO0 IconCompat iconCompat) {
                if (this.f9371o00oOoO0 == null) {
                    if (iconCompat != null) {
                        this.f9367o00oOOoO = iconCompat;
                        return this;
                    }
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            @oo0oO0
            public o00oOo00 o00oOoOO(boolean z) {
                o00oOo0o(2, z);
                return this;
            }

            @oo0oO0
            public o00oOo00 o00oOooO(@o0O0O0O(unit = 0) int i) {
                this.f9368o00oOo00 = Math.max(i, 0);
                this.f9372o00oOooO = 0;
                return this;
            }
        }

        public o00oo00O(@o0OO00OO PendingIntent pendingIntent, @o0OO00OO PendingIntent pendingIntent2, @o0OO00OO IconCompat iconCompat, int i, @o0O00oO0 int i2, int i3, @o0OO00OO String str) {
            this.f9359o00oOOo0 = pendingIntent;
            this.f9361o00oOo00 = iconCompat;
            this.f9365o00oOooO = i;
            this.f9362o00oOo0O = i2;
            this.f9360o00oOOoO = pendingIntent2;
            this.f9363o00oOo0o = i3;
            this.f9364o00oOoO0 = str;
        }

        @o0OO00OO
        public static o00oo00O o00oOOo0(@o0OO00OO Notification$BubbleMetadata notification$BubbleMetadata) {
            if (notification$BubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return o00oOOoO.o00oOOo0(notification$BubbleMetadata);
            }
            if (i == 29) {
                return o00oOOo0.o00oOOo0(notification$BubbleMetadata);
            }
            return null;
        }

        @o0OO00OO
        public static Notification$BubbleMetadata o00oOoo0(@o0OO00OO o00oo00O o00oo00o) {
            if (o00oo00o == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return o00oOOoO.o00oOOoO(o00oo00o);
            }
            if (i == 29) {
                return o00oOOo0.o00oOOoO(o00oo00o);
            }
            return null;
        }

        public boolean o00oOOoO() {
            return (this.f9363o00oOo0o & 1) != 0;
        }

        @o0OO00OO
        public PendingIntent o00oOo00() {
            return this.f9360o00oOOoO;
        }

        @o0O00oO0
        public int o00oOo0O() {
            return this.f9362o00oOo0O;
        }

        @o0OO00OO
        @SuppressLint({"InvalidNullConversion"})
        public IconCompat o00oOo0o() {
            return this.f9361o00oOo00;
        }

        @o0OO00OO
        public String o00oOoO() {
            return this.f9364o00oOoO0;
        }

        @o0OO00OO
        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent o00oOoO0() {
            return this.f9359o00oOOo0;
        }

        public boolean o00oOoOO() {
            return (this.f9363o00oOo0o & 2) != 0;
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00oOoOo(int i) {
            this.f9363o00oOo0o = i;
        }

        @o0O0O0O(unit = 0)
        public int o00oOooO() {
            return this.f9365o00oOooO;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oo0O {
        @oo0oO0
        o00oo0 o00oOOo0(@oo0oO0 o00oo0 o00oo0Var);
    }

    /* loaded from: classes.dex */
    public static class o00oo0O0 extends o0O0000O {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final String f9373o00oOo0O = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f9374o00oOo0o = 3;

        public static List<o00oOOoO> o00ooOO0(List<o00oOOoO> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (o00oOOoO o00ooooo2 : list) {
                if (!o00ooooo2.o00oOooo()) {
                    arrayList.add(o00ooooo2);
                }
            }
            return arrayList;
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00oOOoO(oO00OOO oo00ooo) {
            oo00ooo.o00oOOo0().setStyle(new Notification.DecoratedCustomViewStyle());
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public RemoteViews o00oo(oO00OOO oo00ooo) {
            return null;
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public boolean o00oo0Oo() {
            return true;
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @oo0oO0
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public String o00oo0o() {
            return f9373o00oOo0O;
        }

        public final RemoteViews o00ooO(o00oOOoO o00ooooo2) {
            boolean z = o00ooooo2.f9270o00oOoo0 == null;
            RemoteViews remoteViews = new RemoteViews(this.f9472o00oOOo0.f9308o00oOOo0.getPackageName(), z ? R.layout.notification_action_tombstone : R.layout.notification_action);
            IconCompat o00oOo0o2 = o00ooooo2.o00oOo0o();
            if (o00oOo0o2 != null) {
                remoteViews.setImageViewBitmap(R.id.action_image, o00oo0OO(o00oOo0o2, this.f9472o00oOOo0.f9308o00oOOo0.getResources().getColor(R.color.notification_action_color_filter)));
            }
            remoteViews.setTextViewText(R.id.action_text, o00ooooo2.f9269o00oOoOo);
            if (!z) {
                remoteViews.setOnClickPendingIntent(R.id.action_container, o00ooooo2.f9270o00oOoo0);
            }
            remoteViews.setContentDescription(R.id.action_container, o00ooooo2.f9269o00oOoOo);
            return remoteViews;
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public RemoteViews o00ooO00(oO00OOO oo00ooo) {
            return null;
        }

        public final RemoteViews o00ooO0o(RemoteViews remoteViews, boolean z) {
            int min;
            boolean z2 = true;
            RemoteViews o00oOo002 = o00oOo00(true, R.layout.notification_template_custom_big, false);
            o00oOo002.removeAllViews(R.id.actions);
            List<o00oOOoO> o00ooOO02 = o00ooOO0(this.f9472o00oOOo0.f9309o00oOOoO);
            if (!z || o00ooOO02 == null || (min = Math.min(o00ooOO02.size(), 3)) <= 0) {
                z2 = false;
            } else {
                for (int i = 0; i < min; i++) {
                    o00oOo002.addView(R.id.actions, o00ooO(o00ooOO02.get(i)));
                }
            }
            int i2 = z2 ? 0 : 8;
            o00oOo002.setViewVisibility(R.id.actions, i2);
            o00oOo002.setViewVisibility(R.id.action_divider, i2);
            o00oOo0O(o00oOo002, remoteViews);
            return o00oOo002;
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public RemoteViews o0O0o(oO00OOO oo00ooo) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo0OO implements o00oo0O {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final String f9375o00oOo0O = "large_icon";

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final String f9376o00oOo0o = "car_conversation";
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final String f9377o00oOoO = "invisible_actions";

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final String f9378o00oOoO0 = "app_color";

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final String f9379o00oOoOO = "author";

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final String f9380o00oOoOo = "text";

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static final String f9381o00oOoo0 = "messages";
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final String f9382o00oOooO = "android.car.EXTENSIONS";

        /* renamed from: o00oOooo  reason: collision with root package name */
        public static final String f9383o00oOooo = "remote_input";

        /* renamed from: o00oo0  reason: collision with root package name */
        public static final String f9384o00oo0 = "on_read";

        /* renamed from: o00oo00O  reason: collision with root package name */
        public static final String f9385o00oo00O = "on_reply";

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final String f9386o00oo0O0 = "timestamp";

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public static final String f9387o00oo0OO = "participants";

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Bitmap f9388o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o00oOOo0 f9389o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f9390o00oOo00;

        @Deprecated
        /* loaded from: classes.dex */
        public static class o00oOOo0 {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final String[] f9391o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public final ooo0o f9392o00oOOoO;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public final PendingIntent f9393o00oOo00;

            /* renamed from: o00oOo0O  reason: collision with root package name */
            public final String[] f9394o00oOo0O;

            /* renamed from: o00oOo0o  reason: collision with root package name */
            public final long f9395o00oOo0o;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public final PendingIntent f9396o00oOooO;

            /* renamed from: o00ooOoo.oOo000Oo$o00oo0OO$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0115o00oOOo0 {

                /* renamed from: o00oOOo0  reason: collision with root package name */
                public final List<String> f9397o00oOOo0 = new ArrayList();

                /* renamed from: o00oOOoO  reason: collision with root package name */
                public final String f9398o00oOOoO;

                /* renamed from: o00oOo00  reason: collision with root package name */
                public ooo0o f9399o00oOo00;

                /* renamed from: o00oOo0O  reason: collision with root package name */
                public PendingIntent f9400o00oOo0O;

                /* renamed from: o00oOo0o  reason: collision with root package name */
                public long f9401o00oOo0o;

                /* renamed from: o00oOooO  reason: collision with root package name */
                public PendingIntent f9402o00oOooO;

                public C0115o00oOOo0(@oo0oO0 String str) {
                    this.f9398o00oOOoO = str;
                }

                @oo0oO0
                public C0115o00oOOo0 o00oOOo0(@o0OO00OO String str) {
                    if (str != null) {
                        this.f9397o00oOOo0.add(str);
                    }
                    return this;
                }

                @oo0oO0
                public o00oOOo0 o00oOOoO() {
                    List<String> list = this.f9397o00oOOo0;
                    return new o00oOOo0((String[]) list.toArray(new String[list.size()]), this.f9399o00oOo00, this.f9400o00oOo0O, this.f9402o00oOooO, new String[]{this.f9398o00oOOoO}, this.f9401o00oOo0o);
                }

                @oo0oO0
                public C0115o00oOOo0 o00oOo00(long j) {
                    this.f9401o00oOo0o = j;
                    return this;
                }

                @oo0oO0
                public C0115o00oOOo0 o00oOo0O(@o0OO00OO PendingIntent pendingIntent, @o0OO00OO ooo0o ooo0oVar) {
                    this.f9399o00oOo00 = ooo0oVar;
                    this.f9400o00oOo0O = pendingIntent;
                    return this;
                }

                @oo0oO0
                public C0115o00oOOo0 o00oOooO(@o0OO00OO PendingIntent pendingIntent) {
                    this.f9402o00oOooO = pendingIntent;
                    return this;
                }
            }

            public o00oOOo0(@o0OO00OO String[] strArr, @o0OO00OO ooo0o ooo0oVar, @o0OO00OO PendingIntent pendingIntent, @o0OO00OO PendingIntent pendingIntent2, @o0OO00OO String[] strArr2, long j) {
                this.f9391o00oOOo0 = strArr;
                this.f9392o00oOOoO = ooo0oVar;
                this.f9396o00oOooO = pendingIntent2;
                this.f9393o00oOo00 = pendingIntent;
                this.f9394o00oOo0O = strArr2;
                this.f9395o00oOo0o = j;
            }

            public long o00oOOo0() {
                return this.f9395o00oOo0o;
            }

            @o0OO00OO
            public String[] o00oOOoO() {
                return this.f9391o00oOOo0;
            }

            @o0OO00OO
            public String o00oOo00() {
                String[] strArr = this.f9394o00oOo0O;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @o0OO00OO
            public PendingIntent o00oOo0O() {
                return this.f9396o00oOooO;
            }

            @o0OO00OO
            public ooo0o o00oOo0o() {
                return this.f9392o00oOOoO;
            }

            @o0OO00OO
            public PendingIntent o00oOoO0() {
                return this.f9393o00oOo00;
            }

            @o0OO00OO
            public String[] o00oOooO() {
                return this.f9394o00oOo0O;
            }
        }

        public o00oo0OO() {
            this.f9390o00oOo00 = 0;
        }

        public o00oo0OO(@oo0oO0 Notification notification) {
            this.f9390o00oOo00 = 0;
            Bundle bundle = notification.extras;
            Bundle bundle2 = bundle == null ? null : bundle.getBundle(f9382o00oOooO);
            if (bundle2 != null) {
                this.f9388o00oOOo0 = (Bitmap) bundle2.getParcelable(f9375o00oOo0O);
                this.f9390o00oOo00 = bundle2.getInt(f9378o00oOoO0, 0);
                this.f9389o00oOOoO = o00oOo0o(bundle2.getBundle(f9376o00oOo0o));
            }
        }

        @o0OOooO0(21)
        public static Bundle o00oOOoO(@oo0oO0 o00oOOo0 o00oooo02) {
            Bundle bundle = new Bundle();
            String str = (o00oooo02.o00oOooO() == null || o00oooo02.o00oOooO().length <= 1) ? null : o00oooo02.o00oOooO()[0];
            int length = o00oooo02.o00oOOoO().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i = 0; i < length; i++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", o00oooo02.o00oOOoO()[i]);
                bundle2.putString(f9379o00oOoOO, str);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray(f9381o00oOoo0, parcelableArr);
            ooo0o o00oOo0o2 = o00oooo02.o00oOo0o();
            if (o00oOo0o2 != null) {
                bundle.putParcelable(f9383o00oOooo, new RemoteInput.Builder(o00oOo0o2.f9555o00oOOo0).setLabel(o00oOo0o2.f9556o00oOOoO).setChoices(o00oOo0o2.f9557o00oOo00).setAllowFreeFormInput(o00oOo0o2.f9561o00oOooO).addExtras(o00oOo0o2.f9559o00oOo0o).build());
            }
            bundle.putParcelable(f9385o00oo00O, o00oooo02.o00oOoO0());
            bundle.putParcelable(f9384o00oo0, o00oooo02.o00oOo0O());
            bundle.putStringArray(f9387o00oo0OO, o00oooo02.o00oOooO());
            bundle.putLong(f9386o00oo0O0, o00oooo02.o00oOOo0());
            return bundle;
        }

        @o0OOooO0(21)
        public static o00oOOo0 o00oOo0o(@o0OO00OO Bundle bundle) {
            String[] strArr;
            boolean z;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(f9381o00oOoo0);
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int i = 0; i < length; i++) {
                    Parcelable parcelable = parcelableArray[i];
                    if (parcelable instanceof Bundle) {
                        String string = ((Bundle) parcelable).getString("text");
                        strArr2[i] = string;
                        if (string != null) {
                        }
                    }
                    z = false;
                    break;
                }
                z = true;
                if (!z) {
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f9384o00oo0);
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable(f9385o00oo00O);
            RemoteInput remoteInput = (RemoteInput) bundle.getParcelable(f9383o00oOooo);
            String[] stringArray = bundle.getStringArray(f9387o00oo0OO);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            return new o00oOOo0(strArr, remoteInput != null ? new ooo0o(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? remoteInput.getEditChoicesBeforeSending() : 0, remoteInput.getExtras(), null) : null, pendingIntent2, pendingIntent, stringArray, bundle.getLong(f9386o00oo0O0));
        }

        @Override // o00ooOoo.oOo000Oo.o00oo0O
        @oo0oO0
        public o00oo0 o00oOOo0(@oo0oO0 o00oo0 o00oo0Var) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f9388o00oOOo0;
            if (bitmap != null) {
                bundle.putParcelable(f9375o00oOo0O, bitmap);
            }
            int i = this.f9390o00oOo00;
            if (i != 0) {
                bundle.putInt(f9378o00oOoO0, i);
            }
            o00oOOo0 o00oooo02 = this.f9389o00oOOoO;
            if (o00oooo02 != null) {
                bundle.putBundle(f9376o00oOo0o, o00oOOoO(o00oooo02));
            }
            o00oo0Var.o00oo0o().putBundle(f9382o00oOooO, bundle);
            return o00oo0Var;
        }

        @o0O00O
        public int o00oOo00() {
            return this.f9390o00oOo00;
        }

        @o0OO00OO
        @Deprecated
        public o00oOOo0 o00oOo0O() {
            return this.f9389o00oOOoO;
        }

        @oo0oO0
        public o00oo0OO o00oOoO(@o0OO00OO Bitmap bitmap) {
            this.f9388o00oOOo0 = bitmap;
            return this;
        }

        @oo0oO0
        public o00oo0OO o00oOoO0(@o0O00O int i) {
            this.f9390o00oOo00 = i;
            return this;
        }

        @oo0oO0
        @Deprecated
        public o00oo0OO o00oOoOO(@o0OO00OO o00oOOo0 o00oooo02) {
            this.f9389o00oOOoO = o00oooo02;
            return this;
        }

        @o0OO00OO
        public Bitmap o00oOooO() {
            return this.f9388o00oOOo0;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00ooO {
    }

    /* loaded from: classes.dex */
    public static class o00ooO0 extends o0O0000O {

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final String f9403o00oOoOo = "androidx.core.app.NotificationCompat$MessagingStyle";

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static final int f9404o00oOoo0 = 25;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final List<o00oOOo0> f9405o00oOo0O = new ArrayList();

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final List<o00oOOo0> f9406o00oOo0o = new ArrayList();
        @o0OO00OO

        /* renamed from: o00oOoO  reason: collision with root package name */
        public CharSequence f9407o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public ooOOO0Oo f9408o00oOoO0;
        @o0OO00OO

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public Boolean f9409o00oOoOO;

        /* loaded from: classes.dex */
        public static final class o00oOOo0 {

            /* renamed from: o00oOoO  reason: collision with root package name */
            public static final String f9410o00oOoO = "time";

            /* renamed from: o00oOoO0  reason: collision with root package name */
            public static final String f9411o00oOoO0 = "text";

            /* renamed from: o00oOoOO  reason: collision with root package name */
            public static final String f9412o00oOoOO = "sender";

            /* renamed from: o00oOoOo  reason: collision with root package name */
            public static final String f9413o00oOoOo = "type";

            /* renamed from: o00oOoo0  reason: collision with root package name */
            public static final String f9414o00oOoo0 = "uri";

            /* renamed from: o00oOooo  reason: collision with root package name */
            public static final String f9415o00oOooo = "extras";

            /* renamed from: o00oo0  reason: collision with root package name */
            public static final String f9416o00oo0 = "sender_person";

            /* renamed from: o00oo00O  reason: collision with root package name */
            public static final String f9417o00oo00O = "person";

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final CharSequence f9418o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public final long f9419o00oOOoO;
            @o0OO00OO

            /* renamed from: o00oOo00  reason: collision with root package name */
            public final ooOOO0Oo f9420o00oOo00;
            @o0OO00OO

            /* renamed from: o00oOo0O  reason: collision with root package name */
            public String f9421o00oOo0O;
            @o0OO00OO

            /* renamed from: o00oOo0o  reason: collision with root package name */
            public Uri f9422o00oOo0o;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public Bundle f9423o00oOooO;

            /* JADX WARN: Illegal instructions before constructor call */
            @java.lang.Deprecated
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public o00oOOo0(@o00oOooO.o0OO00OO java.lang.CharSequence r2, long r3, @o00oOooO.o0OO00OO java.lang.CharSequence r5) {
                /*
                    r1 = this;
                    o00ooOoo.ooOOO0Oo$o00oOo00 r0 = new o00ooOoo.ooOOO0Oo$o00oOo00
                    r0.<init>()
                    r0.f9520o00oOOo0 = r5
                    o00ooOoo.ooOOO0Oo r5 = new o00ooOoo.ooOOO0Oo
                    r5.<init>(r0)
                    r1.<init>(r2, r3, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o00ooOoo.oOo000Oo.o00ooO0.o00oOOo0.<init>(java.lang.CharSequence, long, java.lang.CharSequence):void");
            }

            public o00oOOo0(@o0OO00OO CharSequence charSequence, long j, @o0OO00OO ooOOO0Oo ooooo0oo) {
                this.f9423o00oOooO = new Bundle();
                this.f9418o00oOOo0 = charSequence;
                this.f9419o00oOOoO = j;
                this.f9420o00oOo00 = ooooo0oo;
            }

            @oo0oO0
            public static Bundle[] o00oOOo0(@oo0oO0 List<o00oOOo0> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).o00oo00O();
                }
                return bundleArr;
            }

            @o0OO00OO
            public static o00oOOo0 o00oOo0O(@oo0oO0 Bundle bundle) {
                ooOOO0Oo ooooo0oo;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey(f9417o00oo00O)) {
                            ooooo0oo = ooOOO0Oo.o00oOOoO(bundle.getBundle(f9417o00oo00O));
                        } else if (bundle.containsKey(f9416o00oo0)) {
                            ooooo0oo = ooOOO0Oo.o00oOOoO.o00oOOo0((Person) bundle.getParcelable(f9416o00oo0));
                        } else if (bundle.containsKey(f9412o00oOoOO)) {
                            ooOOO0Oo.o00oOo00 o00ooo002 = new ooOOO0Oo.o00oOo00();
                            o00ooo002.f9520o00oOOo0 = bundle.getCharSequence(f9412o00oOoOO);
                            ooooo0oo = new ooOOO0Oo(o00ooo002);
                        } else {
                            ooooo0oo = null;
                        }
                        o00oOOo0 o00oooo02 = new o00oOOo0(bundle.getCharSequence("text"), bundle.getLong("time"), ooooo0oo);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            o00oooo02.f9421o00oOo0O = bundle.getString("type");
                            o00oooo02.f9422o00oOo0o = (Uri) bundle.getParcelable("uri");
                        }
                        if (bundle.containsKey("extras")) {
                            o00oooo02.f9423o00oOooO.putAll(bundle.getBundle("extras"));
                        }
                        return o00oooo02;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @oo0oO0
            public static List<o00oOOo0> o00oOo0o(@oo0oO0 Parcelable[] parcelableArr) {
                o00oOOo0 o00oOo0O2;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (o00oOo0O2 = o00oOo0O((Bundle) parcelable)) != null) {
                        arrayList.add(o00oOo0O2);
                    }
                }
                return arrayList;
            }

            @o0OO00OO
            public String o00oOOoO() {
                return this.f9421o00oOo0O;
            }

            @o0OO00OO
            public Uri o00oOo00() {
                return this.f9422o00oOo0o;
            }

            @o0OO00OO
            @Deprecated
            public CharSequence o00oOoO() {
                ooOOO0Oo ooooo0oo = this.f9420o00oOo00;
                if (ooooo0oo == null) {
                    return null;
                }
                return ooooo0oo.o00oOo0o();
            }

            @o0OO00OO
            public ooOOO0Oo o00oOoO0() {
                return this.f9420o00oOo00;
            }

            @o0OO00OO
            public CharSequence o00oOoOO() {
                return this.f9418o00oOOo0;
            }

            public long o00oOoOo() {
                return this.f9419o00oOOoO;
            }

            @oo0oO0
            public o00oOOo0 o00oOoo0(@o0OO00OO String str, @o0OO00OO Uri uri) {
                this.f9421o00oOo0O = str;
                this.f9422o00oOo0o = uri;
                return this;
            }

            @oo0oO0
            public Bundle o00oOooO() {
                return this.f9423o00oOooO;
            }

            @o0OOooO0(24)
            @oo0oO0
            @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
            public Notification.MessagingStyle.Message o00oOooo() {
                ooOOO0Oo ooooo0oo = this.f9420o00oOo00;
                Notification.MessagingStyle.Message message = new Notification.MessagingStyle.Message(this.f9418o00oOOo0, this.f9419o00oOOoO, ooooo0oo == null ? null : ooooo0oo.o00oOoo0());
                String str = this.f9421o00oOo0O;
                if (str != null) {
                    message.setData(str, this.f9422o00oOo0o);
                }
                return message;
            }

            @oo0oO0
            public final Bundle o00oo00O() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f9418o00oOOo0;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f9419o00oOOoO);
                ooOOO0Oo ooooo0oo = this.f9420o00oOo00;
                if (ooooo0oo != null) {
                    bundle.putCharSequence(f9412o00oOoOO, ooooo0oo.o00oOo0o());
                    bundle.putParcelable(f9416o00oo0, this.f9420o00oOo00.o00oOoo0());
                }
                String str = this.f9421o00oOo0O;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f9422o00oOo0o;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f9423o00oOooO;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }
        }

        public o00ooO0() {
        }

        @Deprecated
        public o00ooO0(@oo0oO0 CharSequence charSequence) {
            ooOOO0Oo.o00oOo00 o00ooo002 = new ooOOO0Oo.o00oOo00();
            o00ooo002.f9520o00oOOo0 = charSequence;
            this.f9408o00oOoO0 = new ooOOO0Oo(o00ooo002);
        }

        public o00ooO0(@oo0oO0 ooOOO0Oo ooooo0oo) {
            if (TextUtils.isEmpty(ooooo0oo.o00oOo0o())) {
                throw new IllegalArgumentException("User's name must not be empty.");
            }
            this.f9408o00oOoO0 = ooooo0oo;
        }

        @o0OO00OO
        public static o00ooO0 o00ooOOo(@oo0oO0 Notification notification) {
            o0O0000O o00oo0o02 = o0O0000O.o00oo0o0(notification);
            if (o00oo0o02 instanceof o00ooO0) {
                return (o00ooO0) o00oo0o02;
            }
            return null;
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        public void o00oOOo0(@oo0oO0 Bundle bundle) {
            super.o00oOOo0(bundle);
            bundle.putCharSequence(oOo000Oo.f9203o0O000o, this.f9408o00oOoO0.o00oOo0o());
            bundle.putBundle(oOo000Oo.f9247o0ooOoOO, this.f9408o00oOoO0.o00oo00O());
            bundle.putCharSequence(oOo000Oo.f9208o0O00O0o, this.f9407o00oOoO);
            if (this.f9407o00oOoO != null && this.f9409o00oOoOO.booleanValue()) {
                bundle.putCharSequence(oOo000Oo.f9205o0O000oo, this.f9407o00oOoO);
            }
            if (!this.f9405o00oOo0O.isEmpty()) {
                bundle.putParcelableArray(oOo000Oo.f9196o0O00, o00oOOo0.o00oOOo0(this.f9405o00oOo0O));
            }
            if (!this.f9406o00oOo0o.isEmpty()) {
                bundle.putParcelableArray(oOo000Oo.f9207o0O00O0, o00oOOo0.o00oOOo0(this.f9406o00oOo0o));
            }
            Boolean bool = this.f9409o00oOoOO;
            if (bool != null) {
                bundle.putBoolean(oOo000Oo.f9240o0OoO00O, bool.booleanValue());
            }
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00oOOoO(oO00OOO oo00ooo) {
            o00oooo0(o00ooo0o());
            Notification.MessagingStyle messagingStyle = new Notification.MessagingStyle(this.f9408o00oOoO0.o00oOoo0());
            for (o00oOOo0 o00oooo02 : this.f9405o00oOo0O) {
                messagingStyle.addMessage(o00oooo02.o00oOooo());
            }
            for (o00oOOo0 o00oooo03 : this.f9406o00oOo0o) {
                messagingStyle.addHistoricMessage(o00oooo03.o00oOooo());
            }
            this.f9409o00oOoOO.booleanValue();
            messagingStyle.setConversationTitle(this.f9407o00oOoO);
            messagingStyle.setGroupConversation(this.f9409o00oOoOO.booleanValue());
            messagingStyle.setBuilder(oo00ooo.o00oOOo0());
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00oOoO0(@oo0oO0 Bundle bundle) {
            super.o00oOoO0(bundle);
            bundle.remove(oOo000Oo.f9247o0ooOoOO);
            bundle.remove(oOo000Oo.f9203o0O000o);
            bundle.remove(oOo000Oo.f9205o0O000oo);
            bundle.remove(oOo000Oo.f9208o0O00O0o);
            bundle.remove(oOo000Oo.f9196o0O00);
            bundle.remove(oOo000Oo.f9207o0O00O0);
            bundle.remove(oOo000Oo.f9240o0OoO00O);
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @oo0oO0
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public String o00oo0o() {
            return f9403o00oOoOo;
        }

        @oo0oO0
        @Deprecated
        public o00ooO0 o00ooO(@o0OO00OO CharSequence charSequence, long j, @o0OO00OO CharSequence charSequence2) {
            List<o00oOOo0> list = this.f9405o00oOo0O;
            ooOOO0Oo.o00oOo00 o00ooo002 = new ooOOO0Oo.o00oOo00();
            o00ooo002.f9520o00oOOo0 = charSequence2;
            list.add(new o00oOOo0(charSequence, j, new ooOOO0Oo(o00ooo002)));
            if (this.f9405o00oOo0O.size() > 25) {
                this.f9405o00oOo0O.remove(0);
            }
            return this;
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00ooO0(@oo0oO0 Bundle bundle) {
            super.o00ooO0(bundle);
            this.f9405o00oOo0O.clear();
            if (bundle.containsKey(oOo000Oo.f9247o0ooOoOO)) {
                this.f9408o00oOoO0 = ooOOO0Oo.o00oOOoO(bundle.getBundle(oOo000Oo.f9247o0ooOoOO));
            } else {
                ooOOO0Oo.o00oOo00 o00ooo002 = new ooOOO0Oo.o00oOo00();
                o00ooo002.f9520o00oOOo0 = bundle.getString(oOo000Oo.f9203o0O000o);
                this.f9408o00oOoO0 = new ooOOO0Oo(o00ooo002);
            }
            CharSequence charSequence = bundle.getCharSequence(oOo000Oo.f9205o0O000oo);
            this.f9407o00oOoO = charSequence;
            if (charSequence == null) {
                this.f9407o00oOoO = bundle.getCharSequence(oOo000Oo.f9208o0O00O0o);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(oOo000Oo.f9196o0O00);
            if (parcelableArray != null) {
                this.f9405o00oOo0O.addAll(o00oOOo0.o00oOo0o(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(oOo000Oo.f9207o0O00O0);
            if (parcelableArray2 != null) {
                this.f9406o00oOo0o.addAll(o00oOOo0.o00oOo0o(parcelableArray2));
            }
            if (bundle.containsKey(oOo000Oo.f9240o0OoO00O)) {
                this.f9409o00oOoOO = Boolean.valueOf(bundle.getBoolean(oOo000Oo.f9240o0OoO00O));
            }
        }

        @oo0oO0
        public o00ooO0 o00ooO0o(@o0OO00OO o00oOOo0 o00oooo02) {
            if (o00oooo02 != null) {
                this.f9406o00oOo0o.add(o00oooo02);
                if (this.f9406o00oOo0o.size() > 25) {
                    this.f9406o00oOo0o.remove(0);
                }
            }
            return this;
        }

        @oo0oO0
        public o00ooO0 o00ooOO(@o0OO00OO o00oOOo0 o00oooo02) {
            if (o00oooo02 != null) {
                this.f9405o00oOo0O.add(o00oooo02);
                if (this.f9405o00oOo0O.size() > 25) {
                    this.f9405o00oOo0O.remove(0);
                }
            }
            return this;
        }

        @oo0oO0
        public o00ooO0 o00ooOO0(@o0OO00OO CharSequence charSequence, long j, @o0OO00OO ooOOO0Oo ooooo0oo) {
            o00ooOO(new o00oOOo0(charSequence, j, ooooo0oo));
            return this;
        }

        @o0OO00OO
        public CharSequence o00ooOo() {
            return this.f9407o00oOoO;
        }

        @o0OO00OO
        public final o00oOOo0 o00ooOo0() {
            List<o00oOOo0> list;
            for (int size = this.f9405o00oOo0O.size() - 1; size >= 0; size--) {
                o00oOOo0 o00oooo02 = this.f9405o00oOo0O.get(size);
                ooOOO0Oo ooooo0oo = o00oooo02.f9420o00oOo00;
                if (ooooo0oo != null && !TextUtils.isEmpty(ooooo0oo.o00oOo0o())) {
                    return o00oooo02;
                }
            }
            if (this.f9405o00oOo0O.isEmpty()) {
                return null;
            }
            return this.f9405o00oOo0O.get(list.size() - 1);
        }

        @oo0oO0
        public List<o00oOOo0> o00ooOoO() {
            return this.f9406o00oOo0o;
        }

        @oo0oO0
        public List<o00oOOo0> o00ooOoo() {
            return this.f9405o00oOo0O;
        }

        @o0OO00OO
        @Deprecated
        public CharSequence o00ooo0() {
            return this.f9408o00oOoO0.o00oOo0o();
        }

        @oo0oO0
        public ooOOO0Oo o00ooo00() {
            return this.f9408o00oOoO0;
        }

        public final boolean o00ooo0O() {
            for (int size = this.f9405o00oOo0O.size() - 1; size >= 0; size--) {
                ooOOO0Oo ooooo0oo = this.f9405o00oOo0O.get(size).f9420o00oOo00;
                if (ooooo0oo != null && ooooo0oo.o00oOo0o() == null) {
                    return true;
                }
            }
            return false;
        }

        public boolean o00ooo0o() {
            o00oo0 o00oo0Var = this.f9472o00oOOo0;
            if (o00oo0Var != null && o00oo0Var.f9308o00oOOo0.getApplicationInfo().targetSdkVersion < 28 && this.f9409o00oOoOO == null) {
                return this.f9407o00oOoO != null;
            }
            Boolean bool = this.f9409o00oOoOO;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @oo0oO0
        public final TextAppearanceSpan o00oooO(int i) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
        }

        public final CharSequence o00oooOO(@oo0oO0 o00oOOo0 o00oooo02) {
            o0OO000o o00oOo002 = o0OO000o.o00oOo00();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i = -16777216;
            ooOOO0Oo ooooo0oo = o00oooo02.f9420o00oOo00;
            String o00oOo0o2 = ooooo0oo == null ? "" : ooooo0oo.o00oOo0o();
            if (TextUtils.isEmpty(o00oOo0o2)) {
                o00oOo0o2 = this.f9408o00oOoO0.o00oOo0o();
                if (this.f9472o00oOOo0.o00oo0Oo() != 0) {
                    i = this.f9472o00oOOo0.o00oo0Oo();
                }
            }
            CharSequence o00oo00O2 = o00oOo002.o00oo00O(o00oOo0o2);
            spannableStringBuilder.append(o00oo00O2);
            spannableStringBuilder.setSpan(o00oooO(i), spannableStringBuilder.length() - o00oo00O2.length(), spannableStringBuilder.length(), 33);
            CharSequence charSequence = o00oooo02.f9418o00oOOo0;
            spannableStringBuilder.append((CharSequence) "  ").append(o00oOo002.o00oo00O(charSequence != null ? charSequence : ""));
            return spannableStringBuilder;
        }

        @oo0oO0
        public o00ooO0 o00oooOo(@o0OO00OO CharSequence charSequence) {
            this.f9407o00oOoO = charSequence;
            return this;
        }

        @oo0oO0
        public o00ooO0 o00oooo0(boolean z) {
            this.f9409o00oOoOO = Boolean.valueOf(z);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class o0O000 implements o00oo0O {

        /* renamed from: o0  reason: collision with root package name */
        public static final int f9424o0 = 8388613;
        @Deprecated

        /* renamed from: o00oo  reason: collision with root package name */
        public static final int f9425o00oo = -1;
        @Deprecated

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static final int f9426o00oo0O = 1;
        @Deprecated

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final int f9427o00oo0O0 = 0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public static final int f9428o00oo0OO = -1;
        @Deprecated

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final int f9429o00oo0Oo = 2;
        @Deprecated

        /* renamed from: o00oo0o  reason: collision with root package name */
        public static final int f9430o00oo0o = 4;
        @Deprecated

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public static final int f9431o00oo0o0 = 3;
        @Deprecated

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public static final int f9432o00oo0oO = 5;

        /* renamed from: o00ooO  reason: collision with root package name */
        public static final String f9433o00ooO = "pages";

        /* renamed from: o00ooO0  reason: collision with root package name */
        public static final String f9434o00ooO0 = "actions";

        /* renamed from: o00ooO00  reason: collision with root package name */
        public static final String f9435o00ooO00 = "android.wearable.EXTENSIONS";

        /* renamed from: o00ooO0O  reason: collision with root package name */
        public static final String f9436o00ooO0O = "flags";

        /* renamed from: o00ooO0o  reason: collision with root package name */
        public static final String f9437o00ooO0o = "displayIntent";

        /* renamed from: o00ooOO  reason: collision with root package name */
        public static final String f9438o00ooOO = "contentIcon";

        /* renamed from: o00ooOO0  reason: collision with root package name */
        public static final String f9439o00ooOO0 = "background";

        /* renamed from: o00ooOOo  reason: collision with root package name */
        public static final String f9440o00ooOOo = "contentIconGravity";

        /* renamed from: o00ooOo  reason: collision with root package name */
        public static final String f9441o00ooOo = "customSizePreset";

        /* renamed from: o00ooOo0  reason: collision with root package name */
        public static final String f9442o00ooOo0 = "contentActionIndex";

        /* renamed from: o00ooOoO  reason: collision with root package name */
        public static final String f9443o00ooOoO = "customContentHeight";

        /* renamed from: o00ooOoo  reason: collision with root package name */
        public static final String f9444o00ooOoo = "gravity";

        /* renamed from: o00ooo0  reason: collision with root package name */
        public static final String f9445o00ooo0 = "dismissalId";

        /* renamed from: o00ooo00  reason: collision with root package name */
        public static final String f9446o00ooo00 = "hintScreenTimeout";

        /* renamed from: o00ooo0O  reason: collision with root package name */
        public static final String f9447o00ooo0O = "bridgeTag";

        /* renamed from: o00ooo0o  reason: collision with root package name */
        public static final int f9448o00ooo0o = 1;

        /* renamed from: o00oooO  reason: collision with root package name */
        public static final int f9449o00oooO = 2;

        /* renamed from: o00oooOO  reason: collision with root package name */
        public static final int f9450o00oooOO = 4;

        /* renamed from: o00oooOo  reason: collision with root package name */
        public static final int f9451o00oooOo = 8;

        /* renamed from: o00oooo  reason: collision with root package name */
        public static final int f9452o00oooo = 32;

        /* renamed from: o00oooo0  reason: collision with root package name */
        public static final int f9453o00oooo0 = 16;

        /* renamed from: o00ooooO  reason: collision with root package name */
        public static final int f9454o00ooooO = 64;

        /* renamed from: o00ooooo  reason: collision with root package name */
        public static final int f9455o00ooooo = 1;

        /* renamed from: o0O00000  reason: collision with root package name */
        public static final int f9456o0O00000 = 80;
        @Deprecated

        /* renamed from: o0O0o  reason: collision with root package name */
        public static final int f9457o0O0o = 0;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public ArrayList<o00oOOoO> f9458o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f9459o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public PendingIntent f9460o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public Bitmap f9461o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f9462o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public int f9463o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f9464o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public int f9465o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public int f9466o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public int f9467o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public ArrayList<Notification> f9468o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public int f9469o00oOooo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public String f9470o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public String f9471o00oo00O;

        public o0O000() {
            this.f9458o00oOOo0 = new ArrayList<>();
            this.f9459o00oOOoO = 1;
            this.f9468o00oOooO = new ArrayList<>();
            this.f9464o00oOoO0 = 8388613;
            this.f9463o00oOoO = -1;
            this.f9465o00oOoOO = 0;
            this.f9467o00oOoo0 = 80;
        }

        public o0O000(@oo0oO0 Notification notification) {
            this.f9458o00oOOo0 = new ArrayList<>();
            this.f9459o00oOOoO = 1;
            this.f9468o00oOooO = new ArrayList<>();
            this.f9464o00oOoO0 = 8388613;
            this.f9463o00oOoO = -1;
            this.f9465o00oOoOO = 0;
            this.f9467o00oOoo0 = 80;
            Bundle bundle = notification.extras;
            Bundle bundle2 = bundle != null ? bundle.getBundle("android.wearable.EXTENSIONS") : null;
            if (bundle2 != null) {
                ArrayList parcelableArrayList = bundle2.getParcelableArrayList(f9434o00ooO0);
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    o00oOOoO[] o00oooooArr = new o00oOOoO[size];
                    for (int i = 0; i < size; i++) {
                        o00oooooArr[i] = oOo000Oo.o00oOOoO((Notification.Action) parcelableArrayList.get(i));
                    }
                    Collections.addAll(this.f9458o00oOOo0, o00oooooArr);
                }
                this.f9459o00oOOoO = bundle2.getInt("flags", 1);
                this.f9460o00oOo00 = (PendingIntent) bundle2.getParcelable(f9437o00ooO0o);
                Notification[] o00oo0oO2 = oOo000Oo.o00oo0oO(bundle2, f9433o00ooO);
                if (o00oo0oO2 != null) {
                    Collections.addAll(this.f9468o00oOooO, o00oo0oO2);
                }
                this.f9461o00oOo0O = (Bitmap) bundle2.getParcelable(f9439o00ooOO0);
                this.f9462o00oOo0o = bundle2.getInt(f9438o00ooOO);
                this.f9464o00oOoO0 = bundle2.getInt(f9440o00ooOOo, 8388613);
                this.f9463o00oOoO = bundle2.getInt(f9442o00ooOo0, -1);
                this.f9465o00oOoOO = bundle2.getInt(f9441o00ooOo, 0);
                this.f9466o00oOoOo = bundle2.getInt(f9443o00ooOoO);
                this.f9467o00oOoo0 = bundle2.getInt(f9444o00ooOoo, 80);
                this.f9469o00oOooo = bundle2.getInt(f9446o00ooo00);
                this.f9471o00oo00O = bundle2.getString(f9445o00ooo0);
                this.f9470o00oo0 = bundle2.getString(f9447o00ooo0O);
            }
        }

        @o0OOooO0(20)
        public static Notification.Action o00oOoOO(o00oOOoO o00ooooo2) {
            int i = Build.VERSION.SDK_INT;
            IconCompat o00oOo0o2 = o00ooooo2.o00oOo0o();
            Notification.Action.Builder builder = new Notification.Action.Builder(o00oOo0o2 == null ? null : o00oOo0o2.o00ooo0(), o00ooooo2.o00oOoOo(), o00ooooo2.o00oOOo0());
            Bundle bundle = o00ooooo2.o00oOooO() != null ? new Bundle(o00ooooo2.o00oOooO()) : new Bundle();
            bundle.putBoolean(oO0O0O0.f9044o00oOo00, o00ooooo2.o00oOOoO());
            builder.setAllowGeneratedReplies(o00ooooo2.o00oOOoO());
            if (i >= 31) {
                builder.setAuthenticationRequired(o00ooooo2.o00oOoo0());
            }
            builder.addExtras(bundle);
            ooo0o[] o00oOoO02 = o00ooooo2.o00oOoO0();
            if (o00oOoO02 != null) {
                for (RemoteInput remoteInput : ooo0o.o00oOooO(o00oOoO02)) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            return builder.build();
        }

        @oo0oO0
        @Deprecated
        public o0O000 o0(boolean z) {
            o00oooO(4, z);
            return this;
        }

        @Override // o00ooOoo.oOo000Oo.o00oo0O
        @oo0oO0
        public o00oo0 o00oOOo0(@oo0oO0 o00oo0 o00oo0Var) {
            Bundle bundle = new Bundle();
            if (!this.f9458o00oOOo0.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f9458o00oOOo0.size());
                Iterator<o00oOOoO> it = this.f9458o00oOOo0.iterator();
                while (it.hasNext()) {
                    arrayList.add(o00oOoOO(it.next()));
                }
                bundle.putParcelableArrayList(f9434o00ooO0, arrayList);
            }
            int i = this.f9459o00oOOoO;
            if (i != 1) {
                bundle.putInt("flags", i);
            }
            PendingIntent pendingIntent = this.f9460o00oOo00;
            if (pendingIntent != null) {
                bundle.putParcelable(f9437o00ooO0o, pendingIntent);
            }
            if (!this.f9468o00oOooO.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.f9468o00oOooO;
                bundle.putParcelableArray(f9433o00ooO, (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f9461o00oOo0O;
            if (bitmap != null) {
                bundle.putParcelable(f9439o00ooOO0, bitmap);
            }
            int i2 = this.f9462o00oOo0o;
            if (i2 != 0) {
                bundle.putInt(f9438o00ooOO, i2);
            }
            int i3 = this.f9464o00oOoO0;
            if (i3 != 8388613) {
                bundle.putInt(f9440o00ooOOo, i3);
            }
            int i4 = this.f9463o00oOoO;
            if (i4 != -1) {
                bundle.putInt(f9442o00ooOo0, i4);
            }
            int i5 = this.f9465o00oOoOO;
            if (i5 != 0) {
                bundle.putInt(f9441o00ooOo, i5);
            }
            int i6 = this.f9466o00oOoOo;
            if (i6 != 0) {
                bundle.putInt(f9443o00ooOoO, i6);
            }
            int i7 = this.f9467o00oOoo0;
            if (i7 != 80) {
                bundle.putInt(f9444o00ooOoo, i7);
            }
            int i8 = this.f9469o00oOooo;
            if (i8 != 0) {
                bundle.putInt(f9446o00ooo00, i8);
            }
            String str = this.f9471o00oo00O;
            if (str != null) {
                bundle.putString(f9445o00ooo0, str);
            }
            String str2 = this.f9470o00oo0;
            if (str2 != null) {
                bundle.putString(f9447o00ooo0O, str2);
            }
            o00oo0Var.o00oo0o().putBundle("android.wearable.EXTENSIONS", bundle);
            return o00oo0Var;
        }

        @oo0oO0
        public o0O000 o00oOOoO(@oo0oO0 o00oOOoO o00ooooo2) {
            this.f9458o00oOOo0.add(o00ooooo2);
            return this;
        }

        @oo0oO0
        public o0O000 o00oOo00(@oo0oO0 List<o00oOOoO> list) {
            this.f9458o00oOOo0.addAll(list);
            return this;
        }

        @oo0oO0
        @Deprecated
        public o0O000 o00oOo0O(@oo0oO0 List<Notification> list) {
            this.f9468o00oOooO.addAll(list);
            return this;
        }

        @oo0oO0
        public o0O000 o00oOo0o() {
            this.f9458o00oOOo0.clear();
            return this;
        }

        @oo0oO0
        /* renamed from: o00oOoO */
        public o0O000 clone() {
            o0O000 o0o000 = new o0O000();
            o0o000.f9458o00oOOo0 = new ArrayList<>(this.f9458o00oOOo0);
            o0o000.f9459o00oOOoO = this.f9459o00oOOoO;
            o0o000.f9460o00oOo00 = this.f9460o00oOo00;
            o0o000.f9468o00oOooO = new ArrayList<>(this.f9468o00oOooO);
            o0o000.f9461o00oOo0O = this.f9461o00oOo0O;
            o0o000.f9462o00oOo0o = this.f9462o00oOo0o;
            o0o000.f9464o00oOoO0 = this.f9464o00oOoO0;
            o0o000.f9463o00oOoO = this.f9463o00oOoO;
            o0o000.f9465o00oOoOO = this.f9465o00oOoOO;
            o0o000.f9466o00oOoOo = this.f9466o00oOoOo;
            o0o000.f9467o00oOoo0 = this.f9467o00oOoo0;
            o0o000.f9469o00oOooo = this.f9469o00oOooo;
            o0o000.f9471o00oo00O = this.f9471o00oo00O;
            o0o000.f9470o00oo0 = this.f9470o00oo0;
            return o0o000;
        }

        @oo0oO0
        @Deprecated
        public o0O000 o00oOoO0() {
            this.f9468o00oOooO.clear();
            return this;
        }

        @oo0oO0
        public List<o00oOOoO> o00oOoOo() {
            return this.f9458o00oOOo0;
        }

        @o0OO00OO
        @Deprecated
        public Bitmap o00oOoo0() {
            return this.f9461o00oOo0O;
        }

        @oo0oO0
        @Deprecated
        public o0O000 o00oOooO(@oo0oO0 Notification notification) {
            this.f9468o00oOooO.add(notification);
            return this;
        }

        @o0OO00OO
        public String o00oOooo() {
            return this.f9470o00oo0;
        }

        @Deprecated
        public boolean o00oo() {
            return (this.f9459o00oOOoO & 16) != 0;
        }

        @Deprecated
        public int o00oo0() {
            return this.f9462o00oOo0o;
        }

        public int o00oo00O() {
            return this.f9463o00oOoO;
        }

        @Deprecated
        public int o00oo0O() {
            return this.f9466o00oOoOo;
        }

        public boolean o00oo0O0() {
            return (this.f9459o00oOOoO & 1) != 0;
        }

        @Deprecated
        public int o00oo0OO() {
            return this.f9464o00oOoO0;
        }

        @Deprecated
        public int o00oo0Oo() {
            return this.f9465o00oOoOO;
        }

        @o0OO00OO
        @Deprecated
        public PendingIntent o00oo0o() {
            return this.f9460o00oOo00;
        }

        @o0OO00OO
        public String o00oo0o0() {
            return this.f9471o00oo00O;
        }

        @Deprecated
        public int o00oo0oO() {
            return this.f9467o00oOoo0;
        }

        @oo0oO0
        @Deprecated
        public List<Notification> o00ooO() {
            return this.f9468o00oOooO;
        }

        @Deprecated
        public boolean o00ooO0() {
            return (this.f9459o00oOOoO & 2) != 0;
        }

        public boolean o00ooO00() {
            return (this.f9459o00oOOoO & 64) != 0;
        }

        @Deprecated
        public int o00ooO0O() {
            return this.f9469o00oOooo;
        }

        @Deprecated
        public boolean o00ooO0o() {
            return (this.f9459o00oOOoO & 4) != 0;
        }

        @oo0oO0
        @Deprecated
        public o0O000 o00ooOO(@o0OO00OO Bitmap bitmap) {
            this.f9461o00oOo0O = bitmap;
            return this;
        }

        public boolean o00ooOO0() {
            return (this.f9459o00oOOoO & 8) != 0;
        }

        @oo0oO0
        public o0O000 o00ooOOo(@o0OO00OO String str) {
            this.f9470o00oo0 = str;
            return this;
        }

        @oo0oO0
        @Deprecated
        public o0O000 o00ooOo(int i) {
            this.f9462o00oOo0o = i;
            return this;
        }

        @oo0oO0
        public o0O000 o00ooOo0(int i) {
            this.f9463o00oOoO = i;
            return this;
        }

        @oo0oO0
        @Deprecated
        public o0O000 o00ooOoO(int i) {
            this.f9464o00oOoO0 = i;
            return this;
        }

        @oo0oO0
        public o0O000 o00ooOoo(boolean z) {
            o00oooO(1, z);
            return this;
        }

        @oo0oO0
        @Deprecated
        public o0O000 o00ooo0(int i) {
            this.f9465o00oOoOO = i;
            return this;
        }

        @oo0oO0
        @Deprecated
        public o0O000 o00ooo00(int i) {
            this.f9466o00oOoOo = i;
            return this;
        }

        @oo0oO0
        public o0O000 o00ooo0O(@o0OO00OO String str) {
            this.f9471o00oo00O = str;
            return this;
        }

        @oo0oO0
        @Deprecated
        public o0O000 o00ooo0o(@o0OO00OO PendingIntent pendingIntent) {
            this.f9460o00oOo00 = pendingIntent;
            return this;
        }

        public final void o00oooO(int i, boolean z) {
            int i2;
            if (z) {
                i2 = i | this.f9459o00oOOoO;
            } else {
                i2 = (~i) & this.f9459o00oOOoO;
            }
            this.f9459o00oOOoO = i2;
        }

        @oo0oO0
        @Deprecated
        public o0O000 o00oooOO(int i) {
            this.f9467o00oOoo0 = i;
            return this;
        }

        @oo0oO0
        @Deprecated
        public o0O000 o00oooOo(boolean z) {
            o00oooO(32, z);
            return this;
        }

        @oo0oO0
        public o0O000 o00oooo(boolean z) {
            o00oooO(64, z);
            return this;
        }

        @oo0oO0
        @Deprecated
        public o0O000 o00oooo0(boolean z) {
            o00oooO(16, z);
            return this;
        }

        @oo0oO0
        @Deprecated
        public o0O000 o00ooooO(boolean z) {
            o00oooO(2, z);
            return this;
        }

        @oo0oO0
        @Deprecated
        public o0O000 o00ooooo(int i) {
            this.f9469o00oOooo = i;
            return this;
        }

        @oo0oO0
        public o0O000 o0O00000(boolean z) {
            o00oooO(8, z);
            return this;
        }

        @Deprecated
        public boolean o0O0o() {
            return (this.f9459o00oOOoO & 32) != 0;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o0O00000 {
    }

    /* loaded from: classes.dex */
    public static abstract class o0O0000O {
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o00oo0 f9472o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public CharSequence f9473o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public CharSequence f9474o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f9475o00oOooO = false;

        public static float o00oOoO(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        @o0OO00OO
        public static o0O0000O o00oOoOO(@o0OO00OO String str) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -716705180:
                        if (str.equals(o00oo0O0.f9373o00oOo0O)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -171946061:
                        if (str.equals(o00oOo0O.f9296o00oOoOo)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 912942987:
                        if (str.equals(o00oo.f9304o00oOo0o)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 919595044:
                        if (str.equals(o00oOoO.f9302o00oOo0o)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 2090799565:
                        if (str.equals(o00ooO0.f9403o00oOoOo)) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new o00oo0O0();
                    case 1:
                        return new o00oOo0O();
                    case 2:
                        return new o00oo();
                    case 3:
                        return new o00oOoO();
                    case 4:
                        return new o00ooO0();
                    default:
                        return null;
                }
            }
            return null;
        }

        @o0OO00OO
        public static o0O0000O o00oOoOo(@o0OO00OO String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new o00oOo0O();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new o00oOoO();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new o00oo();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new o00ooO0();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new o00oo0O0();
            }
            return null;
        }

        @o0OO00OO
        public static o0O0000O o00oOoo0(@oo0oO0 Bundle bundle) {
            o0O0000O o00oOoOO2 = o00oOoOO(bundle.getString(oOo000Oo.f9197o0O000));
            return o00oOoOO2 != null ? o00oOoOO2 : (bundle.containsKey(oOo000Oo.f9203o0O000o) || bundle.containsKey(oOo000Oo.f9247o0ooOoOO)) ? new o00ooO0() : (bundle.containsKey(oOo000Oo.f9194o00ooooO) || bundle.containsKey(oOo000Oo.f9195o00ooooo)) ? new o00oOo0O() : bundle.containsKey(oOo000Oo.f9183o00ooOoO) ? new o00oOoO() : bundle.containsKey(oOo000Oo.f9199o0O0000O) ? new o00oo() : o00oOoOo(bundle.getString(oOo000Oo.f9200o0O0000o));
        }

        @o0OO00OO
        public static o0O0000O o00oOooo(@oo0oO0 Bundle bundle) {
            o0O0000O o00oOoo02 = o00oOoo0(bundle);
            if (o00oOoo02 == null) {
                return null;
            }
            try {
                o00oOoo02.o00ooO0(bundle);
                return o00oOoo02;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @o0OO00OO
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public static o0O0000O o00oo0o0(@oo0oO0 Notification notification) {
            Bundle bundle = notification.extras;
            if (bundle == null) {
                return null;
            }
            return o00oOooo(bundle);
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00oOOo0(@oo0oO0 Bundle bundle) {
            if (this.f9475o00oOooO) {
                bundle.putCharSequence(oOo000Oo.f9181o00ooOo, this.f9474o00oOo00);
            }
            CharSequence charSequence = this.f9473o00oOOoO;
            if (charSequence != null) {
                bundle.putCharSequence(oOo000Oo.f9173o00ooO, charSequence);
            }
            String o00oo0o2 = o00oo0o();
            if (o00oo0o2 != null) {
                bundle.putString(oOo000Oo.f9197o0O000, o00oo0o2);
            }
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00oOOoO(oO00OOO oo00ooo) {
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x018a  */
        @o00oOooO.oo0oO0
        @o00oOooO.o0OO0oO({o00oOooO.o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.widget.RemoteViews o00oOo00(boolean r12, int r13, boolean r14) {
            /*
                Method dump skipped, instructions count: 399
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o00ooOoo.oOo000Oo.o0O0000O.o00oOo00(boolean, int, boolean):android.widget.RemoteViews");
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00oOo0O(RemoteViews remoteViews, RemoteViews remoteViews2) {
            o00oo0oO(remoteViews);
            int i = R.id.notification_main_column;
            remoteViews.removeAllViews(i);
            remoteViews.addView(i, remoteViews2.clone());
            remoteViews.setViewVisibility(i, 0);
            remoteViews.setViewPadding(R.id.notification_main_column_container, 0, o00oOo0o(), 0, 0);
        }

        public final int o00oOo0o() {
            Resources resources = this.f9472o00oOOo0.f9308o00oOOo0.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
            float o00oOoO2 = (o00oOoO(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round((o00oOoO2 * dimensionPixelSize2) + ((1.0f - o00oOoO2) * dimensionPixelSize));
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00oOoO0(@oo0oO0 Bundle bundle) {
            bundle.remove(oOo000Oo.f9181o00ooOo);
            bundle.remove(oOo000Oo.f9173o00ooO);
            bundle.remove(oOo000Oo.f9197o0O000);
        }

        @o0OO00OO
        public Notification o00oOooO() {
            o00oo0 o00oo0Var = this.f9472o00oOOo0;
            if (o00oo0Var != null) {
                return o00oo0Var.o00oOoO();
            }
            return null;
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public RemoteViews o00oo(oO00OOO oo00ooo) {
            return null;
        }

        public final Bitmap o00oo0(int i, int i2, int i3) {
            return o00oo0O0(IconCompat.o0O0o(this.f9472o00oOOo0.f9308o00oOOo0, i), i2, i3);
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public Bitmap o00oo00O(int i, int i2) {
            return o00oo0(i, i2, 0);
        }

        public final Bitmap o00oo0O(int i, int i2, int i3, int i4) {
            int i5 = R.drawable.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap o00oo02 = o00oo0(i5, i4, i2);
            Canvas canvas = new Canvas(o00oo02);
            Drawable mutate = this.f9472o00oOOo0.f9308o00oOOo0.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return o00oo02;
        }

        public final Bitmap o00oo0O0(@oo0oO0 IconCompat iconCompat, int i, int i2) {
            Drawable o00ooOOo2 = iconCompat.o00ooOOo(this.f9472o00oOOo0.f9308o00oOOo0);
            int intrinsicWidth = i2 == 0 ? o00ooOOo2.getIntrinsicWidth() : i2;
            if (i2 == 0) {
                i2 = o00ooOOo2.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
            o00ooOOo2.setBounds(0, 0, intrinsicWidth, i2);
            if (i != 0) {
                o00ooOOo2.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            o00ooOOo2.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        public Bitmap o00oo0OO(@oo0oO0 IconCompat iconCompat, int i) {
            return o00oo0O0(iconCompat, i, 0);
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public boolean o00oo0Oo() {
            return false;
        }

        @o0OO00OO
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public String o00oo0o() {
            return null;
        }

        public final void o00oo0oO(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(R.id.title, 8);
            remoteViews.setViewVisibility(R.id.text2, 8);
            remoteViews.setViewVisibility(R.id.text, 8);
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public void o00ooO0(@oo0oO0 Bundle bundle) {
            if (bundle.containsKey(oOo000Oo.f9181o00ooOo)) {
                this.f9474o00oOo00 = bundle.getCharSequence(oOo000Oo.f9181o00ooOo);
                this.f9475o00oOooO = true;
            }
            this.f9473o00oOOoO = bundle.getCharSequence(oOo000Oo.f9173o00ooO);
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public RemoteViews o00ooO00(oO00OOO oo00ooo) {
            return null;
        }

        public void o00ooO0O(@o0OO00OO o00oo0 o00oo0Var) {
            if (this.f9472o00oOOo0 != o00oo0Var) {
                this.f9472o00oOOo0 = o00oo0Var;
                if (o00oo0Var != null) {
                    o00oo0Var.o0O0oo0o(this);
                }
            }
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public RemoteViews o0O0o(oO00OOO oo00ooo) {
            return null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o0O0o {
    }

    @o0OO00OO
    public static o00oOOoO o00oOOo0(@oo0oO0 Notification notification, int i) {
        return o00oOOoO(notification.actions[i]);
    }

    @o0OOooO0(20)
    @oo0oO0
    public static o00oOOoO o00oOOoO(@oo0oO0 Notification.Action action) {
        ooo0o[] ooo0oVarArr;
        int i;
        int editChoicesBeforeSending;
        boolean z;
        int i2;
        boolean isContextual;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs == null) {
            ooo0oVarArr = null;
        } else {
            ooo0o[] ooo0oVarArr2 = new ooo0o[remoteInputs.length];
            for (int i3 = 0; i3 < remoteInputs.length; i3++) {
                RemoteInput remoteInput = remoteInputs[i3];
                String resultKey = remoteInput.getResultKey();
                CharSequence label = remoteInput.getLabel();
                CharSequence[] choices = remoteInput.getChoices();
                boolean allowFreeFormInput = remoteInput.getAllowFreeFormInput();
                if (Build.VERSION.SDK_INT >= 29) {
                    editChoicesBeforeSending = remoteInput.getEditChoicesBeforeSending();
                    i = editChoicesBeforeSending;
                } else {
                    i = 0;
                }
                ooo0oVarArr2[i3] = new ooo0o(resultKey, label, choices, allowFreeFormInput, i, remoteInput.getExtras(), null);
            }
            ooo0oVarArr = ooo0oVarArr2;
        }
        int i4 = Build.VERSION.SDK_INT;
        boolean z2 = action.getExtras().getBoolean(oO0O0O0.f9044o00oOo00) || action.getAllowGeneratedReplies();
        boolean z3 = action.getExtras().getBoolean(o00oOOoO.f9259o00ooO00, true);
        int semanticAction = action.getSemanticAction();
        if (i4 >= 29) {
            isContextual = action.isContextual();
            z = isContextual;
        } else {
            z = false;
        }
        boolean isAuthenticationRequired = i4 >= 31 ? action.isAuthenticationRequired() : false;
        if (action.getIcon() != null || (i2 = action.icon) == 0) {
            return new o00oOOoO(action.getIcon() != null ? IconCompat.o00oo00O(action.getIcon()) : null, action.title, action.actionIntent, action.getExtras(), ooo0oVarArr, (ooo0o[]) null, z2, semanticAction, z3, z, isAuthenticationRequired);
        }
        return new o00oOOoO(i2, action.title, action.actionIntent, action.getExtras(), ooo0oVarArr, (ooo0o[]) null, z2, semanticAction, z3, z, isAuthenticationRequired);
    }

    public static int o00oOo00(@oo0oO0 Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean o00oOo0O(@oo0oO0 Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int o00oOo0o(@oo0oO0 Notification notification) {
        return notification.getBadgeIconType();
    }

    @o0OO00OO
    public static String o00oOoO(@oo0oO0 Notification notification) {
        return notification.category;
    }

    @o0OO00OO
    public static o00oo00O o00oOoO0(@oo0oO0 Notification notification) {
        Notification$BubbleMetadata bubbleMetadata;
        if (Build.VERSION.SDK_INT >= 29) {
            bubbleMetadata = notification.getBubbleMetadata();
            return o00oo00O.o00oOOo0(bubbleMetadata);
        }
        return null;
    }

    @o0OO00OO
    public static String o00oOoOO(@oo0oO0 Notification notification) {
        return notification.getChannelId();
    }

    public static int o00oOoOo(@oo0oO0 Notification notification) {
        return notification.color;
    }

    @o0OOooO0(19)
    @o0OO00OO
    public static CharSequence o00oOoo0(@oo0oO0 Notification notification) {
        return notification.extras.getCharSequence(f9182o00ooOo0);
    }

    public static boolean o00oOooO(@oo0oO0 Notification notification) {
        boolean allowSystemGeneratedContextualActions;
        if (Build.VERSION.SDK_INT >= 29) {
            allowSystemGeneratedContextualActions = notification.getAllowSystemGeneratedContextualActions();
            return allowSystemGeneratedContextualActions;
        }
        return false;
    }

    @o0OOooO0(19)
    @o0OO00OO
    public static CharSequence o00oOooo(@oo0oO0 Notification notification) {
        return notification.extras.getCharSequence(f9179o00ooOO0);
    }

    public static boolean o00oo(@oo0oO0 Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @o0OO00OO
    public static Bundle o00oo0(@oo0oO0 Notification notification) {
        return notification.extras;
    }

    @o0OOooO0(19)
    @o0OO00OO
    public static CharSequence o00oo00O(@oo0oO0 Notification notification) {
        return notification.extras.getCharSequence(f9177o00ooO0o);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static boolean o00oo0O(@oo0oO0 Notification notification) {
        return (notification.flags & 128) != 0;
    }

    public static int o00oo0O0(@oo0oO0 Notification notification) {
        return notification.getGroupAlertBehavior();
    }

    @o0OO00OO
    public static String o00oo0OO(@oo0oO0 Notification notification) {
        return notification.getGroup();
    }

    @o0OOooO0(21)
    @oo0oO0
    public static List<o00oOOoO> o00oo0Oo(@oo0oO0 Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle(o00oo0OO.f9382o00oOooO);
        if (bundle2 != null && (bundle = bundle2.getBundle(o00oo0OO.f9377o00oOoO)) != null) {
            for (int i = 0; i < bundle.size(); i++) {
                arrayList.add(oO0O0O0.o00oOoO0(bundle.getBundle(Integer.toString(i))));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        r3 = r3.getLocusId();
     */
    @o00oOooO.o0OO00OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o00ooo0.o0O0OO o00oo0o(@o00oOooO.oo0oO0 android.app.Notification r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 29
            if (r0 < r2) goto L12
            android.content.LocusId r3 = o00ooOoo.oO00o00O.o00oOOo0(r3)
            if (r3 != 0) goto Le
            goto L12
        Le:
            o00ooo0.o0O0OO r1 = o00ooo0.o0O0OO.o00oOooO(r3)
        L12:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooOoo.oOo000Oo.o00oo0o(android.app.Notification):o00ooo0.o0O0OO");
    }

    public static boolean o00oo0o0(@oo0oO0 Notification notification) {
        return (notification.flags & 256) != 0;
    }

    @oo0oO0
    public static Notification[] o00oo0oO(@oo0oO0 Bundle bundle, @oo0oO0 String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            notificationArr[i] = (Notification) parcelableArray[i];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    @o0OOooO0(19)
    public static boolean o00ooO(@oo0oO0 Notification notification) {
        return notification.extras.getBoolean(f9192o00oooo);
    }

    @o0OO00OO
    public static Notification o00ooO0(@oo0oO0 Notification notification) {
        return notification.publicVersion;
    }

    @oo0oO0
    public static List<ooOOO0Oo> o00ooO00(@oo0oO0 Notification notification) {
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(f9242o0OoOoOo);
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(ooOOO0Oo.o00oOOoO.o00oOOo0((Person) it.next()));
            }
        }
        return arrayList;
    }

    @o0OO00OO
    public static CharSequence o00ooO0O(@oo0oO0 Notification notification) {
        return notification.getSettingsText();
    }

    @o0OO00OO
    public static String o00ooO0o(@oo0oO0 Notification notification) {
        return notification.getShortcutId();
    }

    @o0OOooO0(19)
    @o0OO00OO
    public static CharSequence o00ooOO(@oo0oO0 Notification notification) {
        return notification.extras.getCharSequence(f9178o00ooOO);
    }

    @o0OO00OO
    public static String o00ooOO0(@oo0oO0 Notification notification) {
        return notification.getSortKey();
    }

    public static long o00ooOOo(@oo0oO0 Notification notification) {
        return notification.getTimeoutAfter();
    }

    public static int o00ooOo(@oo0oO0 Notification notification) {
        return notification.visibility;
    }

    @o0OOooO0(19)
    public static boolean o00ooOo0(@oo0oO0 Notification notification) {
        return notification.extras.getBoolean(f9190o00oooOO);
    }

    public static boolean o00ooOoO(@oo0oO0 Notification notification) {
        return (notification.flags & 512) != 0;
    }

    public static boolean o0O0o(@oo0oO0 Notification notification) {
        return (notification.flags & 2) != 0;
    }
}
