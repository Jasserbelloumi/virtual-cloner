package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NotificationUtil;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00ooOoo.oO0O0OO;
import o00ooOoo.oOo000Oo;
import o0O0O0o0.o00oOOo0;
/* loaded from: classes.dex */
public class PlayerNotificationManager {
    private static final String ACTION_DISMISS = "com.google.android.exoplayer.dismiss";
    public static final String ACTION_FAST_FORWARD = "com.google.android.exoplayer.ffwd";
    public static final String ACTION_NEXT = "com.google.android.exoplayer.next";
    public static final String ACTION_PAUSE = "com.google.android.exoplayer.pause";
    public static final String ACTION_PLAY = "com.google.android.exoplayer.play";
    public static final String ACTION_PREVIOUS = "com.google.android.exoplayer.prev";
    public static final String ACTION_REWIND = "com.google.android.exoplayer.rewind";
    public static final String ACTION_STOP = "com.google.android.exoplayer.stop";
    public static final String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 0;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 1;
    private static int instanceIdCounter;
    private int badgeIconType;
    @o0OO00OO
    private oOo000Oo.o00oo0 builder;
    @o0OO00OO
    private List<oOo000Oo.o00oOOoO> builderActions;
    private final String channelId;
    private int color;
    private boolean colorized;
    private final Context context;
    private int currentNotificationTag;
    @o0OO00OO
    private final CustomActionReceiver customActionReceiver;
    private final Map<String, oOo000Oo.o00oOOoO> customActions;
    private int defaults;
    private final PendingIntent dismissPendingIntent;
    @o0OO00OO
    private String groupKey;
    private final int instanceId;
    private final IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private final Handler mainHandler;
    private final MediaDescriptionAdapter mediaDescriptionAdapter;
    @o0OO00OO
    private MediaSessionCompat.Token mediaSessionToken;
    private final NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;
    @o0OO00OO
    private final NotificationListener notificationListener;
    private final oO0O0OO notificationManager;
    private final Map<String, oOo000Oo.o00oOOoO> playbackActions;
    @o0OO00OO
    private Player player;
    private final Player.Listener playerListener;
    private int priority;
    @o0O0O0o0
    private int smallIconResourceId;
    private boolean useChronometer;
    private boolean useFastForwardAction;
    private boolean useFastForwardActionInCompactView;
    private boolean useNextAction;
    private boolean useNextActionInCompactView;
    private boolean usePlayPauseActions;
    private boolean usePreviousAction;
    private boolean usePreviousActionInCompactView;
    private boolean useRewindAction;
    private boolean useRewindActionInCompactView;
    private boolean useStopAction;
    private int visibility;

    /* loaded from: classes.dex */
    public final class BitmapCallback {
        private final int notificationTag;

        private BitmapCallback(int i) {
            this.notificationTag = i;
        }

        public void onBitmap(Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.postUpdateNotificationBitmap(bitmap, this.notificationTag);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Builder {
        public int channelDescriptionResourceId;
        public final String channelId;
        public int channelImportance;
        public int channelNameResourceId;
        public final Context context;
        @o0OO00OO
        public CustomActionReceiver customActionReceiver;
        public int fastForwardActionIconResourceId;
        @o0OO00OO
        public String groupKey;
        public MediaDescriptionAdapter mediaDescriptionAdapter;
        public int nextActionIconResourceId;
        public final int notificationId;
        @o0OO00OO
        public NotificationListener notificationListener;
        public int pauseActionIconResourceId;
        public int playActionIconResourceId;
        public int previousActionIconResourceId;
        public int rewindActionIconResourceId;
        public int smallIconResourceId;
        public int stopActionIconResourceId;

        public Builder(Context context, @o0O0o00O(from = 1) int i, String str) {
            Assertions.checkArgument(i > 0);
            this.context = context;
            this.notificationId = i;
            this.channelId = str;
            this.channelImportance = 2;
            this.mediaDescriptionAdapter = new DefaultMediaDescriptionAdapter(null);
            this.smallIconResourceId = R.drawable.exo_notification_small_icon;
            this.playActionIconResourceId = R.drawable.exo_notification_play;
            this.pauseActionIconResourceId = R.drawable.exo_notification_pause;
            this.stopActionIconResourceId = R.drawable.exo_notification_stop;
            this.rewindActionIconResourceId = R.drawable.exo_notification_rewind;
            this.fastForwardActionIconResourceId = R.drawable.exo_notification_fastforward;
            this.previousActionIconResourceId = R.drawable.exo_notification_previous;
            this.nextActionIconResourceId = R.drawable.exo_notification_next;
        }

        @Deprecated
        public Builder(Context context, int i, String str, MediaDescriptionAdapter mediaDescriptionAdapter) {
            this(context, i, str);
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        }

        public PlayerNotificationManager build() {
            int i = this.channelNameResourceId;
            if (i != 0) {
                NotificationUtil.createNotificationChannel(this.context, this.channelId, i, this.channelDescriptionResourceId, this.channelImportance);
            }
            return new PlayerNotificationManager(this.context, this.channelId, this.notificationId, this.mediaDescriptionAdapter, this.notificationListener, this.customActionReceiver, this.smallIconResourceId, this.playActionIconResourceId, this.pauseActionIconResourceId, this.stopActionIconResourceId, this.rewindActionIconResourceId, this.fastForwardActionIconResourceId, this.previousActionIconResourceId, this.nextActionIconResourceId, this.groupKey);
        }

        public Builder setChannelDescriptionResourceId(int i) {
            this.channelDescriptionResourceId = i;
            return this;
        }

        public Builder setChannelImportance(int i) {
            this.channelImportance = i;
            return this;
        }

        public Builder setChannelNameResourceId(int i) {
            this.channelNameResourceId = i;
            return this;
        }

        public Builder setCustomActionReceiver(CustomActionReceiver customActionReceiver) {
            this.customActionReceiver = customActionReceiver;
            return this;
        }

        public Builder setFastForwardActionIconResourceId(int i) {
            this.fastForwardActionIconResourceId = i;
            return this;
        }

        public Builder setGroup(String str) {
            this.groupKey = str;
            return this;
        }

        public Builder setMediaDescriptionAdapter(MediaDescriptionAdapter mediaDescriptionAdapter) {
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
            return this;
        }

        public Builder setNextActionIconResourceId(int i) {
            this.nextActionIconResourceId = i;
            return this;
        }

        public Builder setNotificationListener(NotificationListener notificationListener) {
            this.notificationListener = notificationListener;
            return this;
        }

        public Builder setPauseActionIconResourceId(int i) {
            this.pauseActionIconResourceId = i;
            return this;
        }

        public Builder setPlayActionIconResourceId(int i) {
            this.playActionIconResourceId = i;
            return this;
        }

        public Builder setPreviousActionIconResourceId(int i) {
            this.previousActionIconResourceId = i;
            return this;
        }

        public Builder setRewindActionIconResourceId(int i) {
            this.rewindActionIconResourceId = i;
            return this;
        }

        public Builder setSmallIconResourceId(int i) {
            this.smallIconResourceId = i;
            return this;
        }

        public Builder setStopActionIconResourceId(int i) {
            this.stopActionIconResourceId = i;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface CustomActionReceiver {
        Map<String, oOo000Oo.o00oOOoO> createCustomActions(Context context, int i);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    /* loaded from: classes.dex */
    public interface MediaDescriptionAdapter {
        @o0OO00OO
        PendingIntent createCurrentContentIntent(Player player);

        @o0OO00OO
        CharSequence getCurrentContentText(Player player);

        CharSequence getCurrentContentTitle(Player player);

        @o0OO00OO
        Bitmap getCurrentLargeIcon(Player player, BitmapCallback bitmapCallback);

        @o0OO00OO
        default CharSequence getCurrentSubText(Player player) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        private NotificationBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Player player = PlayerNotificationManager.this.player;
            if (player != null && PlayerNotificationManager.this.isNotificationStarted && intent.getIntExtra(PlayerNotificationManager.EXTRA_INSTANCE_ID, PlayerNotificationManager.this.instanceId) == PlayerNotificationManager.this.instanceId) {
                String action = intent.getAction();
                if (PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                    if (player.getPlaybackState() == 1) {
                        player.prepare();
                    } else if (player.getPlaybackState() == 4) {
                        player.seekToDefaultPosition(player.getCurrentMediaItemIndex());
                    }
                    player.play();
                } else if (PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    player.pause();
                } else if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    player.seekToPrevious();
                } else if (PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    player.seekBack();
                } else if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                    player.seekForward();
                } else if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    player.seekToNext();
                } else if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    player.stop(true);
                } else if (PlayerNotificationManager.ACTION_DISMISS.equals(action)) {
                    PlayerNotificationManager.this.stopNotification(true);
                } else if (action == null || PlayerNotificationManager.this.customActionReceiver == null || !PlayerNotificationManager.this.customActions.containsKey(action)) {
                } else {
                    PlayerNotificationManager.this.customActionReceiver.onCustomAction(player, action, intent);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface NotificationListener {
        default void onNotificationCancelled(int i, boolean z) {
        }

        default void onNotificationPosted(int i, Notification notification, boolean z) {
        }
    }

    /* loaded from: classes.dex */
    public class PlayerListener implements Player.Listener {
        private PlayerListener() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                PlayerNotificationManager.this.postStartOrUpdateNotification();
            }
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Priority {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Visibility {
    }

    public PlayerNotificationManager(Context context, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter, @o0OO00OO NotificationListener notificationListener, @o0OO00OO CustomActionReceiver customActionReceiver, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @o0OO00OO String str2) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.channelId = str;
        this.notificationId = i;
        this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        this.notificationListener = notificationListener;
        this.customActionReceiver = customActionReceiver;
        this.smallIconResourceId = i2;
        this.groupKey = str2;
        int i10 = instanceIdCounter;
        instanceIdCounter = i10 + 1;
        this.instanceId = i10;
        this.mainHandler = Util.createHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.exoplayer2.ui.o00oOoO
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean handleMessage;
                handleMessage = PlayerNotificationManager.this.handleMessage(message);
                return handleMessage;
            }
        });
        this.notificationManager = oO0O0OO.o00oo0O0(applicationContext);
        this.playerListener = new PlayerListener();
        this.notificationBroadcastReceiver = new NotificationBroadcastReceiver();
        this.intentFilter = new IntentFilter();
        this.usePreviousAction = true;
        this.useNextAction = true;
        this.usePlayPauseActions = true;
        this.useRewindAction = true;
        this.useFastForwardAction = true;
        this.colorized = true;
        this.useChronometer = true;
        this.color = 0;
        this.defaults = 0;
        this.priority = -1;
        this.badgeIconType = 1;
        this.visibility = 1;
        Map<String, oOo000Oo.o00oOOoO> createPlaybackActions = createPlaybackActions(applicationContext, i10, i3, i4, i5, i6, i7, i8, i9);
        this.playbackActions = createPlaybackActions;
        for (String str3 : createPlaybackActions.keySet()) {
            this.intentFilter.addAction(str3);
        }
        Map<String, oOo000Oo.o00oOOoO> createCustomActions = customActionReceiver != null ? customActionReceiver.createCustomActions(applicationContext, this.instanceId) : Collections.emptyMap();
        this.customActions = createCustomActions;
        for (String str4 : createCustomActions.keySet()) {
            this.intentFilter.addAction(str4);
        }
        this.dismissPendingIntent = createBroadcastIntent(ACTION_DISMISS, applicationContext, this.instanceId);
        this.intentFilter.addAction(ACTION_DISMISS);
    }

    private static PendingIntent createBroadcastIntent(String str, Context context, int i) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra(EXTRA_INSTANCE_ID, i);
        return PendingIntent.getBroadcast(context, i, intent, Util.SDK_INT >= 23 ? 201326592 : C.BUFFER_FLAG_FIRST_SAMPLE);
    }

    private static Map<String, oOo000Oo.o00oOOoO> createPlaybackActions(Context context, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION_PLAY, new oOo000Oo.o00oOOoO(i2, context.getString(R.string.exo_controls_play_description), createBroadcastIntent(ACTION_PLAY, context, i)));
        hashMap.put(ACTION_PAUSE, new oOo000Oo.o00oOOoO(i3, context.getString(R.string.exo_controls_pause_description), createBroadcastIntent(ACTION_PAUSE, context, i)));
        hashMap.put(ACTION_STOP, new oOo000Oo.o00oOOoO(i4, context.getString(R.string.exo_controls_stop_description), createBroadcastIntent(ACTION_STOP, context, i)));
        hashMap.put(ACTION_REWIND, new oOo000Oo.o00oOOoO(i5, context.getString(R.string.exo_controls_rewind_description), createBroadcastIntent(ACTION_REWIND, context, i)));
        hashMap.put(ACTION_FAST_FORWARD, new oOo000Oo.o00oOOoO(i6, context.getString(R.string.exo_controls_fastforward_description), createBroadcastIntent(ACTION_FAST_FORWARD, context, i)));
        hashMap.put(ACTION_PREVIOUS, new oOo000Oo.o00oOOoO(i7, context.getString(R.string.exo_controls_previous_description), createBroadcastIntent(ACTION_PREVIOUS, context, i)));
        hashMap.put(ACTION_NEXT, new oOo000Oo.o00oOOoO(i8, context.getString(R.string.exo_controls_next_description), createBroadcastIntent(ACTION_NEXT, context, i)));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            Player player = this.player;
            if (player != null) {
                startOrUpdateNotification(player, null);
            }
        } else if (i != 1) {
            return false;
        } else {
            Player player2 = this.player;
            if (player2 != null && this.isNotificationStarted && this.currentNotificationTag == message.arg1) {
                startOrUpdateNotification(player2, (Bitmap) message.obj);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postStartOrUpdateNotification() {
        if (this.mainHandler.hasMessages(0)) {
            return;
        }
        this.mainHandler.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postUpdateNotificationBitmap(Bitmap bitmap, int i) {
        this.mainHandler.obtainMessage(1, i, -1, bitmap).sendToTarget();
    }

    private static void setLargeIcon(oOo000Oo.o00oo0 o00oo0Var, @o0OO00OO Bitmap bitmap) {
        o00oo0Var.o0OoOoOO(bitmap);
    }

    private boolean shouldShowPauseButton(Player player) {
        return (player.getPlaybackState() == 4 || player.getPlaybackState() == 1 || !player.getPlayWhenReady()) ? false : true;
    }

    private void startOrUpdateNotification(Player player, @o0OO00OO Bitmap bitmap) {
        boolean ongoing = getOngoing(player);
        oOo000Oo.o00oo0 createNotification = createNotification(player, this.builder, ongoing, bitmap);
        this.builder = createNotification;
        boolean z = false;
        if (createNotification == null) {
            stopNotification(false);
            return;
        }
        Notification o00oOoO2 = createNotification.o00oOoO();
        this.notificationManager.o00ooOO(null, this.notificationId, o00oOoO2);
        if (!this.isNotificationStarted) {
            this.context.registerReceiver(this.notificationBroadcastReceiver, this.intentFilter);
        }
        NotificationListener notificationListener = this.notificationListener;
        if (notificationListener != null) {
            int i = this.notificationId;
            if (ongoing || !this.isNotificationStarted) {
                z = true;
            }
            notificationListener.onNotificationPosted(i, o00oOoO2, z);
        }
        this.isNotificationStarted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopNotification(boolean z) {
        if (this.isNotificationStarted) {
            this.isNotificationStarted = false;
            this.mainHandler.removeMessages(0);
            this.notificationManager.o00oOo00(null, this.notificationId);
            this.context.unregisterReceiver(this.notificationBroadcastReceiver);
            NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationCancelled(this.notificationId, z);
            }
        }
    }

    @o0OO00OO
    public oOo000Oo.o00oo0 createNotification(Player player, @o0OO00OO oOo000Oo.o00oo0 o00oo0Var, boolean z, @o0OO00OO Bitmap bitmap) {
        if (player.getPlaybackState() == 1 && player.getCurrentTimeline().isEmpty()) {
            this.builderActions = null;
            return null;
        }
        List<String> actions = getActions(player);
        ArrayList arrayList = new ArrayList(actions.size());
        for (int i = 0; i < actions.size(); i++) {
            String str = actions.get(i);
            oOo000Oo.o00oOOoO o00ooooo2 = (this.playbackActions.containsKey(str) ? this.playbackActions : this.customActions).get(str);
            if (o00ooooo2 != null) {
                arrayList.add(o00ooooo2);
            }
        }
        if (o00oo0Var == null || !arrayList.equals(this.builderActions)) {
            o00oo0Var = new oOo000Oo.o00oo0(this.context, this.channelId);
            this.builderActions = arrayList;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                o00oo0Var.o00oOOoO((oOo000Oo.o00oOOoO) arrayList.get(i2));
            }
        }
        o00oOOo0.o00oOoO o00oooo2 = new o00oOOo0.o00oOoO();
        MediaSessionCompat.Token token = this.mediaSessionToken;
        if (token != null) {
            o00oooo2.f11244o00oOo0o = token;
        }
        o00oooo2.f11243o00oOo0O = getActionIndicesForCompactView(actions, player);
        o00oooo2.f11245o00oOoO = this.dismissPendingIntent;
        o00oo0Var.o0O0oo0o(o00oooo2);
        o00oo0Var.o0(this.dismissPendingIntent);
        o00oo0Var.o00ooOOo(this.badgeIconType).o0O00O0(z).o00ooo00(this.color).o00ooo0(this.colorized).o0O00o0O(this.smallIconResourceId).o0O0OO0(this.visibility).o0O00O0o(this.priority).o00ooooo(this.defaults);
        if (Util.SDK_INT < 21 || !this.useChronometer || !player.isPlaying() || player.isPlayingAd() || player.isCurrentMediaItemDynamic() || player.getPlaybackParameters().speed != 1.0f) {
            o00oo0Var.o0O00Ooo(false).o0O0O0oo(false);
        } else {
            o00oo0Var.o0O0OO0O(System.currentTimeMillis() - player.getContentPosition()).o0O00Ooo(true).o0O0O0oo(true);
        }
        o00oo0Var.o00oooOo(this.mediaDescriptionAdapter.getCurrentContentTitle(player));
        o00oo0Var.o00oooOO(this.mediaDescriptionAdapter.getCurrentContentText(player));
        o00oo0Var.o0O0O0Oo(this.mediaDescriptionAdapter.getCurrentSubText(player));
        if (bitmap == null) {
            MediaDescriptionAdapter mediaDescriptionAdapter = this.mediaDescriptionAdapter;
            int i3 = this.currentNotificationTag + 1;
            this.currentNotificationTag = i3;
            bitmap = mediaDescriptionAdapter.getCurrentLargeIcon(player, new BitmapCallback(i3));
        }
        setLargeIcon(o00oo0Var, bitmap);
        o00oo0Var.o00oooO(this.mediaDescriptionAdapter.createCurrentContentIntent(player));
        String str2 = this.groupKey;
        if (str2 != null) {
            o00oo0Var.o0O000O(str2);
        }
        o00oo0Var.o0OoO00O(true);
        return o00oo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int[] getActionIndicesForCompactView(java.util.List<java.lang.String> r7, com.google.android.exoplayer2.Player r8) {
        /*
            r6 = this;
            java.lang.String r0 = "com.google.android.exoplayer.pause"
            int r0 = r7.indexOf(r0)
            java.lang.String r1 = "com.google.android.exoplayer.play"
            int r1 = r7.indexOf(r1)
            boolean r2 = r6.usePreviousActionInCompactView
            r3 = -1
            if (r2 == 0) goto L18
            java.lang.String r2 = "com.google.android.exoplayer.prev"
        L13:
            int r2 = r7.indexOf(r2)
            goto L20
        L18:
            boolean r2 = r6.useRewindActionInCompactView
            if (r2 == 0) goto L1f
            java.lang.String r2 = "com.google.android.exoplayer.rewind"
            goto L13
        L1f:
            r2 = r3
        L20:
            boolean r4 = r6.useNextActionInCompactView
            if (r4 == 0) goto L2b
            java.lang.String r4 = "com.google.android.exoplayer.next"
        L26:
            int r7 = r7.indexOf(r4)
            goto L33
        L2b:
            boolean r4 = r6.useFastForwardActionInCompactView
            if (r4 == 0) goto L32
            java.lang.String r4 = "com.google.android.exoplayer.ffwd"
            goto L26
        L32:
            r7 = r3
        L33:
            r4 = 3
            int[] r4 = new int[r4]
            r5 = 0
            if (r2 == r3) goto L3c
            r4[r5] = r2
            r5 = 1
        L3c:
            boolean r8 = r6.shouldShowPauseButton(r8)
            if (r0 == r3) goto L4a
            if (r8 == 0) goto L4a
            int r8 = r5 + 1
            r4[r5] = r0
        L48:
            r5 = r8
            goto L53
        L4a:
            if (r1 == r3) goto L53
            if (r8 != 0) goto L53
            int r8 = r5 + 1
            r4[r5] = r1
            goto L48
        L53:
            if (r7 == r3) goto L5a
            int r8 = r5 + 1
            r4[r5] = r7
            r5 = r8
        L5a:
            int[] r7 = java.util.Arrays.copyOf(r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerNotificationManager.getActionIndicesForCompactView(java.util.List, com.google.android.exoplayer2.Player):int[]");
    }

    public List<String> getActions(Player player) {
        boolean isCommandAvailable = player.isCommandAvailable(7);
        boolean isCommandAvailable2 = player.isCommandAvailable(11);
        boolean isCommandAvailable3 = player.isCommandAvailable(12);
        boolean isCommandAvailable4 = player.isCommandAvailable(9);
        ArrayList arrayList = new ArrayList();
        if (this.usePreviousAction && isCommandAvailable) {
            arrayList.add(ACTION_PREVIOUS);
        }
        if (this.useRewindAction && isCommandAvailable2) {
            arrayList.add(ACTION_REWIND);
        }
        if (this.usePlayPauseActions) {
            arrayList.add(shouldShowPauseButton(player) ? ACTION_PAUSE : ACTION_PLAY);
        }
        if (this.useFastForwardAction && isCommandAvailable3) {
            arrayList.add(ACTION_FAST_FORWARD);
        }
        if (this.useNextAction && isCommandAvailable4) {
            arrayList.add(ACTION_NEXT);
        }
        CustomActionReceiver customActionReceiver = this.customActionReceiver;
        if (customActionReceiver != null) {
            arrayList.addAll(customActionReceiver.getCustomActions(player));
        }
        if (this.useStopAction) {
            arrayList.add(ACTION_STOP);
        }
        return arrayList;
    }

    public boolean getOngoing(Player player) {
        int playbackState = player.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && player.getPlayWhenReady();
    }

    public final void invalidate() {
        if (this.isNotificationStarted) {
            postStartOrUpdateNotification();
        }
    }

    public final void setBadgeIconType(int i) {
        if (this.badgeIconType == i) {
            return;
        }
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException();
        }
        this.badgeIconType = i;
        invalidate();
    }

    public final void setColor(int i) {
        if (this.color != i) {
            this.color = i;
            invalidate();
        }
    }

    public final void setColorized(boolean z) {
        if (this.colorized != z) {
            this.colorized = z;
            invalidate();
        }
    }

    public final void setDefaults(int i) {
        if (this.defaults != i) {
            this.defaults = i;
            invalidate();
        }
    }

    public final void setMediaSessionToken(MediaSessionCompat.Token token) {
        if (Util.areEqual(this.mediaSessionToken, token)) {
            return;
        }
        this.mediaSessionToken = token;
        invalidate();
    }

    public final void setPlayer(@o0OO00OO Player player) {
        boolean z = true;
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.getApplicationLooper() != Looper.getMainLooper()) {
            z = false;
        }
        Assertions.checkArgument(z);
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.playerListener);
            if (player == null) {
                stopNotification(false);
            }
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.playerListener);
            postStartOrUpdateNotification();
        }
    }

    public final void setPriority(int i) {
        if (this.priority == i) {
            return;
        }
        if (i != -2 && i != -1 && i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException();
        }
        this.priority = i;
        invalidate();
    }

    public final void setSmallIcon(@o0O0O0o0 int i) {
        if (this.smallIconResourceId != i) {
            this.smallIconResourceId = i;
            invalidate();
        }
    }

    public final void setUseChronometer(boolean z) {
        if (this.useChronometer != z) {
            this.useChronometer = z;
            invalidate();
        }
    }

    public final void setUseFastForwardAction(boolean z) {
        if (this.useFastForwardAction != z) {
            this.useFastForwardAction = z;
            invalidate();
        }
    }

    public final void setUseFastForwardActionInCompactView(boolean z) {
        if (this.useFastForwardActionInCompactView != z) {
            this.useFastForwardActionInCompactView = z;
            if (z) {
                this.useNextActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseNextAction(boolean z) {
        if (this.useNextAction != z) {
            this.useNextAction = z;
            invalidate();
        }
    }

    public final void setUseNextActionInCompactView(boolean z) {
        if (this.useNextActionInCompactView != z) {
            this.useNextActionInCompactView = z;
            if (z) {
                this.useFastForwardActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUsePlayPauseActions(boolean z) {
        if (this.usePlayPauseActions != z) {
            this.usePlayPauseActions = z;
            invalidate();
        }
    }

    public final void setUsePreviousAction(boolean z) {
        if (this.usePreviousAction != z) {
            this.usePreviousAction = z;
            invalidate();
        }
    }

    public final void setUsePreviousActionInCompactView(boolean z) {
        if (this.usePreviousActionInCompactView != z) {
            this.usePreviousActionInCompactView = z;
            if (z) {
                this.useRewindActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseRewindAction(boolean z) {
        if (this.useRewindAction != z) {
            this.useRewindAction = z;
            invalidate();
        }
    }

    public final void setUseRewindActionInCompactView(boolean z) {
        if (this.useRewindActionInCompactView != z) {
            this.useRewindActionInCompactView = z;
            if (z) {
                this.usePreviousActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseStopAction(boolean z) {
        if (this.useStopAction == z) {
            return;
        }
        this.useStopAction = z;
        invalidate();
    }

    public final void setVisibility(int i) {
        if (this.visibility == i) {
            return;
        }
        if (i != -1 && i != 0 && i != 1) {
            throw new IllegalStateException();
        }
        this.visibility = i;
        invalidate();
    }
}
