package o00ooOoo;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.collection.o00oOo00;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00ooOoo.oOo000Oo;
import o00ooo0.o0O0OO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class oO0O0 implements oO00OOO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f9033o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Notification.Builder f9034o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final oOo000Oo.o00oo0 f9035o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public RemoteViews f9036o00oOo0O;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f9038o00oOoO;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public RemoteViews f9040o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public RemoteViews f9041o00oOooO;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final List<Bundle> f9037o00oOo0o = new ArrayList();

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final Bundle f9039o00oOoO0 = new Bundle();

    public oO0O0(oOo000Oo.o00oo0 o00oo0Var) {
        int i;
        this.f9035o00oOo00 = o00oo0Var;
        this.f9033o00oOOo0 = o00oo0Var.f9308o00oOOo0;
        Notification.Builder builder = new Notification.Builder(o00oo0Var.f9308o00oOOo0, o00oo0Var.f9344o00ooo0O);
        this.f9034o00oOOoO = builder;
        Notification notification = o00oo0Var.f9307o0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, o00oo0Var.f9315o00oOoOO).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(o00oo0Var.f9311o00oOo0O).setContentText(o00oo0Var.f9312o00oOo0o).setContentInfo(o00oo0Var.f9317o00oOoo0).setContentIntent(o00oo0Var.f9314o00oOoO0).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(o00oo0Var.f9313o00oOoO, (notification.flags & 128) != 0).setLargeIcon(o00oo0Var.f9316o00oOoOo).setNumber(o00oo0Var.f9319o00oOooo).setProgress(o00oo0Var.f9329o00oo0oO, o00oo0Var.f9356o0O0o, o00oo0Var.f9320o00oo);
        builder.setSubText(o00oo0Var.f9326o00oo0Oo).setUsesChronometer(o00oo0Var.f9325o00oo0OO).setPriority(o00oo0Var.f9322o00oo00O);
        Iterator<oOo000Oo.o00oOOoO> it = o00oo0Var.f9309o00oOOoO.iterator();
        while (it.hasNext()) {
            o00oOOoO(it.next());
        }
        Bundle bundle = o00oo0Var.f9337o00ooOOo;
        if (bundle != null) {
            this.f9039o00oOoO0.putAll(bundle);
        }
        this.f9041o00oOooO = o00oo0Var.f9341o00ooOoo;
        this.f9036o00oOo0O = o00oo0Var.f9343o00ooo00;
        this.f9034o00oOOoO.setShowWhen(o00oo0Var.f9321o00oo0);
        this.f9034o00oOOoO.setLocalOnly(o00oo0Var.f9334o00ooO0o).setGroup(o00oo0Var.f9332o00ooO00).setGroupSummary(o00oo0Var.f9331o00ooO0).setSortKey(o00oo0Var.f9333o00ooO0O);
        this.f9038o00oOoO = o00oo0Var.f9350o00oooo0;
        this.f9034o00oOOoO.setCategory(o00oo0Var.f9335o00ooOO).setColor(o00oo0Var.f9339o00ooOo0).setVisibility(o00oo0Var.f9338o00ooOo).setPublicVersion(o00oo0Var.f9340o00ooOoO).setSound(notification.sound, notification.audioAttributes);
        ArrayList<String> arrayList = o00oo0Var.f9355o0O0000o;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (String str : arrayList) {
                this.f9034o00oOOoO.addPerson(str);
            }
        }
        this.f9040o00oOoOO = o00oo0Var.f9342o00ooo0;
        if (o00oo0Var.f9318o00oOooO.size() > 0) {
            Bundle bundle2 = o00oo0Var.o00oo0o().getBundle(oOo000Oo.o00oo0OO.f9382o00oOooO);
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i2 = 0; i2 < o00oo0Var.f9318o00oOooO.size(); i2++) {
                bundle4.putBundle(Integer.toString(i2), oO0O0O0.o00oOoOo(o00oo0Var.f9318o00oOooO.get(i2)));
            }
            bundle2.putBundle(oOo000Oo.o00oo0OO.f9377o00oOoO, bundle4);
            bundle3.putBundle(oOo000Oo.o00oo0OO.f9377o00oOoO, bundle4);
            o00oo0Var.o00oo0o().putBundle(oOo000Oo.o00oo0OO.f9382o00oOooO, bundle2);
            this.f9039o00oOoO0.putBundle(oOo000Oo.o00oo0OO.f9382o00oOooO, bundle3);
        }
        Icon icon = o00oo0Var.f9354o0O0000O;
        if (icon != null) {
            this.f9034o00oOOoO.setSmallIcon(icon);
        }
        this.f9034o00oOOoO.setExtras(o00oo0Var.f9337o00ooOOo).setRemoteInputHistory(o00oo0Var.f9327o00oo0o);
        RemoteViews remoteViews = o00oo0Var.f9341o00ooOoo;
        if (remoteViews != null) {
            this.f9034o00oOOoO.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = o00oo0Var.f9343o00ooo00;
        if (remoteViews2 != null) {
            this.f9034o00oOOoO.setCustomBigContentView(remoteViews2);
        }
        RemoteViews remoteViews3 = o00oo0Var.f9342o00ooo0;
        if (remoteViews3 != null) {
            this.f9034o00oOOoO.setCustomHeadsUpContentView(remoteViews3);
        }
        this.f9034o00oOOoO.setBadgeIconType(o00oo0Var.f9345o00ooo0o).setSettingsText(o00oo0Var.f9328o00oo0o0).setShortcutId(o00oo0Var.f9346o00oooO).setTimeoutAfter(o00oo0Var.f9348o00oooOo).setGroupAlertBehavior(o00oo0Var.f9350o00oooo0);
        if (o00oo0Var.f9336o00ooOO0) {
            this.f9034o00oOOoO.setColorized(o00oo0Var.f9330o00ooO);
        }
        if (!TextUtils.isEmpty(o00oo0Var.f9344o00ooo0O)) {
            this.f9034o00oOOoO.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator<ooOOO0Oo> it2 = o00oo0Var.f9310o00oOo00.iterator();
        while (it2.hasNext()) {
            this.f9034o00oOOoO.addPerson(it2.next().o00oOoo0());
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            this.f9034o00oOOoO.setAllowSystemGeneratedContextualActions(o00oo0Var.f9351o00ooooO);
            this.f9034o00oOOoO.setBubbleMetadata(oOo000Oo.o00oo00O.o00oOoo0(o00oo0Var.f9352o00ooooo));
            o0O0OO o0o0oo = o00oo0Var.f9347o00oooOO;
            if (o0o0oo != null) {
                this.f9034o00oOOoO.setLocusId(o0o0oo.f9618o00oOOoO);
            }
        }
        if (i3 >= 31 && (i = o00oo0Var.f9349o00oooo) != 0) {
            this.f9034o00oOOoO.setForegroundServiceBehavior(i);
        }
        if (o00oo0Var.f9353o0O00000) {
            if (this.f9035o00oOo00.f9331o00ooO0) {
                this.f9038o00oOoO = 2;
            } else {
                this.f9038o00oOoO = 1;
            }
            this.f9034o00oOOoO.setVibrate(null);
            this.f9034o00oOOoO.setSound(null);
            int i4 = notification.defaults & (-2) & (-3);
            notification.defaults = i4;
            this.f9034o00oOOoO.setDefaults(i4);
            if (TextUtils.isEmpty(this.f9035o00oOo00.f9332o00ooO00)) {
                this.f9034o00oOOoO.setGroup(oOo000Oo.f9235o0O0Oo0);
            }
            this.f9034o00oOOoO.setGroupAlertBehavior(this.f9038o00oOoO);
        }
    }

    @o0OO00OO
    public static List<String> o00oOo0O(@o0OO00OO List<String> list, @o0OO00OO List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        o00oOo00 o00ooo002 = new o00oOo00(list2.size() + list.size());
        o00ooo002.addAll(list);
        o00ooo002.addAll(list2);
        return new ArrayList(o00ooo002);
    }

    @o0OO00OO
    public static List<String> o00oOoO0(@o0OO00OO List<ooOOO0Oo> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ooOOO0Oo ooooo0oo : list) {
            arrayList.add(ooooo0oo.o00oOoOo());
        }
        return arrayList;
    }

    @Override // o00ooOoo.oO00OOO
    public Notification.Builder o00oOOo0() {
        return this.f9034o00oOOoO;
    }

    public final void o00oOOoO(oOo000Oo.o00oOOoO o00ooooo2) {
        IconCompat o00oOo0o2 = o00ooooo2.o00oOo0o();
        Notification.Action.Builder builder = new Notification.Action.Builder(o00oOo0o2 != null ? o00oOo0o2.o00ooo0() : null, o00ooooo2.o00oOoOo(), o00ooooo2.o00oOOo0());
        if (o00ooooo2.o00oOoO0() != null) {
            for (RemoteInput remoteInput : ooo0o.o00oOooO(o00ooooo2.o00oOoO0())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = o00ooooo2.o00oOooO() != null ? new Bundle(o00ooooo2.o00oOooO()) : new Bundle();
        bundle.putBoolean(oO0O0O0.f9044o00oOo00, o00ooooo2.o00oOOoO());
        int i = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(o00ooooo2.o00oOOoO());
        bundle.putInt(oOo000Oo.o00oOOoO.f9258o00ooO0, o00ooooo2.o00oOoO());
        builder.setSemanticAction(o00ooooo2.o00oOoO());
        if (i >= 29) {
            builder.setContextual(o00ooooo2.o00oOooo());
        }
        if (i >= 31) {
            builder.setAuthenticationRequired(o00ooooo2.o00oOoo0());
        }
        bundle.putBoolean(oOo000Oo.o00oOOoO.f9259o00ooO00, o00ooooo2.o00oOoOO());
        builder.addExtras(bundle);
        this.f9034o00oOOoO.addAction(builder.build());
    }

    public Notification o00oOo00() {
        Bundle bundle;
        RemoteViews o00ooO002;
        RemoteViews o0O0o2;
        oOo000Oo.o0O0000O o0o0000o = this.f9035o00oOo00.f9323o00oo0O;
        if (o0o0000o != null) {
            o0o0000o.o00oOOoO(this);
        }
        RemoteViews o00oo2 = o0o0000o != null ? o0o0000o.o00oo(this) : null;
        Notification o00oOooO2 = o00oOooO();
        if (o00oo2 != null || (o00oo2 = this.f9035o00oOo00.f9341o00ooOoo) != null) {
            o00oOooO2.contentView = o00oo2;
        }
        if (o0o0000o != null && (o0O0o2 = o0o0000o.o0O0o(this)) != null) {
            o00oOooO2.bigContentView = o0O0o2;
        }
        if (o0o0000o != null && (o00ooO002 = this.f9035o00oOo00.f9323o00oo0O.o00ooO00(this)) != null) {
            o00oOooO2.headsUpContentView = o00ooO002;
        }
        if (o0o0000o != null && (bundle = o00oOooO2.extras) != null) {
            o0o0000o.o00oOOo0(bundle);
        }
        return o00oOooO2;
    }

    public Context o00oOo0o() {
        return this.f9033o00oOOo0;
    }

    public final void o00oOoO(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    public Notification o00oOooO() {
        return this.f9034o00oOOoO.build();
    }
}
