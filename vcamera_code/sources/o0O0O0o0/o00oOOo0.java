package o0O0O0o0;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.media.R;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00ooOoo.oO00OOO;
import o00ooOoo.oOo000Oo;
/* loaded from: classes.dex */
public class o00oOOo0 {

    @o0OOooO0(15)
    /* renamed from: o0O0O0o0.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0148o00oOOo0 {
        @o0O0O0Oo
        public static void o00oOOo0(RemoteViews remoteViews, int i, CharSequence charSequence) {
            remoteViews.setContentDescription(i, charSequence);
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static Notification.MediaStyle o00oOOo0() {
            return new Notification.MediaStyle();
        }

        @o0O0O0Oo
        public static Notification.MediaStyle o00oOOoO(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
            if (iArr != null) {
                o00oOo0O(mediaStyle, iArr);
            }
            if (token != null) {
                o00oOo00(mediaStyle, (MediaSession.Token) token.getToken());
            }
            return mediaStyle;
        }

        @o0O0O0Oo
        public static void o00oOo00(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
            mediaStyle.setMediaSession(token);
        }

        @o0O0O0Oo
        public static void o00oOo0O(Notification.MediaStyle mediaStyle, int... iArr) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }

        @o0O0O0Oo
        public static void o00oOooO(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
            builder.setStyle(mediaStyle);
        }
    }

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static Notification.DecoratedMediaCustomViewStyle o00oOOo0() {
            return new Notification.DecoratedMediaCustomViewStyle();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O extends o00oOoO {
        @Override // o0O0O0o0.o00oOOo0.o00oOoO, o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public void o00oOOoO(oO00OOO oo00ooo) {
            o00oOOoO.o00oOooO(oo00ooo.o00oOOo0(), o00oOOoO.o00oOOoO(o00oOo00.o00oOOo0(), this.f11243o00oOo0O, this.f11244o00oOo0o));
        }

        @Override // o0O0O0o0.o00oOOo0.o00oOoO, o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public RemoteViews o00oo(oO00OOO oo00ooo) {
            return null;
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public RemoteViews o00ooO00(oO00OOO oo00ooo) {
            return null;
        }

        @Override // o0O0O0o0.o00oOOo0.o00oOoO
        public int o00ooOO(int i) {
            return i <= 3 ? R.layout.notification_template_big_media_narrow_custom : R.layout.notification_template_big_media_custom;
        }

        @Override // o0O0O0o0.o00oOOo0.o00oOoO
        public int o00ooOOo() {
            return this.f9472o00oOOo0.o00oo0o0() != null ? R.layout.notification_template_media_custom : R.layout.notification_template_media;
        }

        public final void o00ooo0(RemoteViews remoteViews) {
            remoteViews.setInt(R.id.status_bar_latest_event_content, "setBackgroundColor", this.f9472o00oOOo0.o00oo0Oo() != 0 ? this.f9472o00oOOo0.o00oo0Oo() : this.f9472o00oOOo0.f9308o00oOOo0.getResources().getColor(R.color.notification_material_background_media_default_color));
        }

        @Override // o0O0O0o0.o00oOOo0.o00oOoO, o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public RemoteViews o0O0o(oO00OOO oo00ooo) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO extends oOo000Oo.o0O0000O {

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f11241o00oOoOO = 3;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f11242o00oOoOo = 5;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int[] f11243o00oOo0O = null;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public MediaSessionCompat.Token f11244o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public PendingIntent f11245o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public boolean f11246o00oOoO0;

        public o00oOoO() {
        }

        public o00oOoO(oOo000Oo.o00oo0 o00oo0Var) {
            o00ooO0O(o00oo0Var);
        }

        public static MediaSessionCompat.Token o00ooOo0(Notification notification) {
            Parcelable parcelable;
            Bundle bundle = notification.extras;
            if (bundle == null || (parcelable = bundle.getParcelable(oOo000Oo.f9241o0OoOoOO)) == null) {
                return null;
            }
            return MediaSessionCompat.Token.fromToken(parcelable);
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public void o00oOOoO(oO00OOO oo00ooo) {
            o00oOOoO.o00oOooO(oo00ooo.o00oOOo0(), o00oOOoO.o00oOOoO(o00oOOoO.o00oOOo0(), this.f11243o00oOo0O, this.f11244o00oOo0o));
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public RemoteViews o00oo(oO00OOO oo00ooo) {
            return null;
        }

        public RemoteViews o00ooO() {
            RemoteViews o00oOo002 = o00oOo00(false, o00ooOOo(), true);
            int size = this.f9472o00oOOo0.f9309o00oOOoO.size();
            int[] iArr = this.f11243o00oOo0O;
            int min = iArr == null ? 0 : Math.min(iArr.length, 3);
            o00oOo002.removeAllViews(R.id.media_actions);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    if (i >= size) {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i), Integer.valueOf(size - 1)));
                    }
                    o00oOo002.addView(R.id.media_actions, o00ooOO0(this.f9472o00oOOo0.f9309o00oOOoO.get(this.f11243o00oOo0O[i])));
                }
            }
            if (this.f11246o00oOoO0) {
                o00oOo002.setViewVisibility(R.id.end_padder, 8);
                int i2 = R.id.cancel_action;
                o00oOo002.setViewVisibility(i2, 0);
                o00oOo002.setOnClickPendingIntent(i2, this.f11245o00oOoO);
                o00oOo002.setInt(i2, "setAlpha", this.f9472o00oOOo0.f9308o00oOOo0.getResources().getInteger(R.integer.cancel_button_image_alpha));
            } else {
                o00oOo002.setViewVisibility(R.id.end_padder, 0);
                o00oOo002.setViewVisibility(R.id.cancel_action, 8);
            }
            return o00oOo002;
        }

        public RemoteViews o00ooO0o() {
            int min = Math.min(this.f9472o00oOOo0.f9309o00oOOoO.size(), 5);
            RemoteViews o00oOo002 = o00oOo00(false, o00ooOO(min), false);
            o00oOo002.removeAllViews(R.id.media_actions);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    o00oOo002.addView(R.id.media_actions, o00ooOO0(this.f9472o00oOOo0.f9309o00oOOoO.get(i)));
                }
            }
            if (this.f11246o00oOoO0) {
                int i2 = R.id.cancel_action;
                o00oOo002.setViewVisibility(i2, 0);
                o00oOo002.setInt(i2, "setAlpha", this.f9472o00oOOo0.f9308o00oOOo0.getResources().getInteger(R.integer.cancel_button_image_alpha));
                o00oOo002.setOnClickPendingIntent(i2, this.f11245o00oOoO);
            } else {
                o00oOo002.setViewVisibility(R.id.cancel_action, 8);
            }
            return o00oOo002;
        }

        public int o00ooOO(int i) {
            return i <= 3 ? R.layout.notification_template_big_media_narrow : R.layout.notification_template_big_media;
        }

        public final RemoteViews o00ooOO0(oOo000Oo.o00oOOoO o00ooooo2) {
            boolean z = o00ooooo2.o00oOOo0() == null;
            RemoteViews remoteViews = new RemoteViews(this.f9472o00oOOo0.f9308o00oOOo0.getPackageName(), R.layout.notification_media_action);
            int i = R.id.action0;
            remoteViews.setImageViewResource(i, o00ooooo2.o00oOo0O());
            if (!z) {
                remoteViews.setOnClickPendingIntent(i, o00ooooo2.o00oOOo0());
            }
            C0148o00oOOo0.o00oOOo0(remoteViews, i, o00ooooo2.o00oOoOo());
            return remoteViews;
        }

        public int o00ooOOo() {
            return R.layout.notification_template_media;
        }

        public o00oOoO o00ooOo(PendingIntent pendingIntent) {
            this.f11245o00oOoO = pendingIntent;
            return this;
        }

        public o00oOoO o00ooOoO(MediaSessionCompat.Token token) {
            this.f11244o00oOo0o = token;
            return this;
        }

        public o00oOoO o00ooOoo(int... iArr) {
            this.f11243o00oOo0O = iArr;
            return this;
        }

        public o00oOoO o00ooo00(boolean z) {
            return this;
        }

        @Override // o00ooOoo.oOo000Oo.o0O0000O
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public RemoteViews o0O0o(oO00OOO oo00ooo) {
            return null;
        }
    }
}
