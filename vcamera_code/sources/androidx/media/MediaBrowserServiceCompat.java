package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.o00oOOoO;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00ooOoo.oO00O0o0;
import o0ooOoOO.oO0o0o;
/* loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final String f3497o00ooO = "search_results";

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final float f3498o00ooO0 = 1.0E-5f;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f3500o00ooO0O = "android.media.browse.MediaBrowserService";
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final String f3501o00ooO0o = "media_item";

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f3502o00ooOO = 2;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f3503o00ooOO0 = 1;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f3504o00ooOOo = 4;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f3505o00ooOo = 0;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f3506o00ooOo0 = -1;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f3507o00ooOoO = 1;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00oo0 f3509o00oo0O0;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public o00oo00O f3511o00oo0o;

    /* renamed from: o0O0o  reason: collision with root package name */
    public MediaSessionCompat.Token f3514o0O0o;

    /* renamed from: o00oo  reason: collision with root package name */
    public static final String f3496o00oo = "MBServiceCompat";

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final boolean f3499o00ooO00 = Log.isLoggable(f3496o00oo, 3);

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oo00O f3508o00oo0O = new o00oo00O(o00oOOoO.C0034o00oOOoO.f3648o00oOOoO, -1, -1, null, null);

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final ArrayList<o00oo00O> f3510o00oo0Oo = new ArrayList<>();

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final androidx.collection.o00oOOo0<IBinder, o00oo00O> f3512o00oo0o0 = new androidx.collection.o00oOOo0<>();

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final o0O000 f3513o00oo0oO = new o0O000();

    /* loaded from: classes.dex */
    public class o0 {

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ String f3516o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0O00000 f3517o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public final /* synthetic */ int f3518o00oo0Oo;

            /* renamed from: o00oo0o  reason: collision with root package name */
            public final /* synthetic */ Bundle f3519o00oo0o;

            /* renamed from: o00oo0o0  reason: collision with root package name */
            public final /* synthetic */ int f3520o00oo0o0;

            public o00oOOo0(o0O00000 o0o00000, String str, int i, int i2, Bundle bundle) {
                this.f3517o00oo0O0 = o0o00000;
                this.f3516o00oo0O = str;
                this.f3518o00oo0Oo = i;
                this.f3520o00oo0o0 = i2;
                this.f3519o00oo0o = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f3517o00oo0O0.asBinder();
                MediaBrowserServiceCompat.this.f3512o00oo0o0.remove(asBinder);
                o00oo00O o00oo00o = new o00oo00O(this.f3516o00oo0O, this.f3518o00oo0Oo, this.f3520o00oo0o0, this.f3519o00oo0o, this.f3517o00oo0O0);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f3511o00oo0o = o00oo00o;
                o00oOoO o00oOooo2 = mediaBrowserServiceCompat.o00oOooo(this.f3516o00oo0O, this.f3520o00oo0o0, this.f3519o00oo0o);
                o00oo00o.f3588o00oOoO = o00oOooo2;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.f3511o00oo0o = null;
                if (o00oOooo2 == null) {
                    try {
                        this.f3517o00oo0O0.o00oOOoO();
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                try {
                    mediaBrowserServiceCompat2.f3512o00oo0o0.put(asBinder, o00oo00o);
                    asBinder.linkToDeath(o00oo00o, 0);
                    MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.f3514o0O0o;
                    if (token != null) {
                        o0O00000 o0o00000 = this.f3517o00oo0O0;
                        o00oOoO o00oooo2 = o00oo00o.f3588o00oOoO;
                        o0o00000.o00oOo00(o00oooo2.f3570o00oOOo0, token, o00oooo2.f3571o00oOOoO);
                    }
                } catch (RemoteException unused2) {
                    MediaBrowserServiceCompat.this.f3512o00oo0o0.remove(asBinder);
                }
            }
        }

        /* loaded from: classes.dex */
        public class o00oOOoO implements Runnable {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0O00000 f3523o00oo0O0;

            public o00oOOoO(o0O00000 o0o00000) {
                this.f3523o00oo0O0 = o0o00000;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oo00O remove = MediaBrowserServiceCompat.this.f3512o00oo0o0.remove(this.f3523o00oo0O0.asBinder());
                if (remove != null) {
                    remove.f3587o00oOo0o.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        /* loaded from: classes.dex */
        public class o00oOo00 implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ String f3524o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0O00000 f3525o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public final /* synthetic */ IBinder f3526o00oo0Oo;

            /* renamed from: o00oo0o0  reason: collision with root package name */
            public final /* synthetic */ Bundle f3528o00oo0o0;

            public o00oOo00(o0O00000 o0o00000, String str, IBinder iBinder, Bundle bundle) {
                this.f3525o00oo0O0 = o0o00000;
                this.f3524o00oo0O = str;
                this.f3526o00oo0Oo = iBinder;
                this.f3528o00oo0o0 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oo00O o00oo00o = MediaBrowserServiceCompat.this.f3512o00oo0o0.get(this.f3525o00oo0O0.asBinder());
                if (o00oo00o == null) {
                    return;
                }
                MediaBrowserServiceCompat.this.o00oOOo0(this.f3524o00oo0O, o00oo00o, this.f3526o00oo0Oo, this.f3528o00oo0o0);
            }
        }

        /* loaded from: classes.dex */
        public class o00oOo0O implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ String f3529o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0O00000 f3530o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public final /* synthetic */ IBinder f3531o00oo0Oo;

            public o00oOo0O(o0O00000 o0o00000, String str, IBinder iBinder) {
                this.f3530o00oo0O0 = o0o00000;
                this.f3529o00oo0O = str;
                this.f3531o00oo0Oo = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oo00O o00oo00o = MediaBrowserServiceCompat.this.f3512o00oo0o0.get(this.f3530o00oo0O0.asBinder());
                if (o00oo00o == null) {
                    return;
                }
                MediaBrowserServiceCompat.this.o00oo(this.f3529o00oo0O, o00oo00o, this.f3531o00oo0Oo);
            }
        }

        /* loaded from: classes.dex */
        public class o00oOoO implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ String f3533o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0O00000 f3534o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public final /* synthetic */ ResultReceiver f3535o00oo0Oo;

            public o00oOoO(o0O00000 o0o00000, String str, ResultReceiver resultReceiver) {
                this.f3534o00oo0O0 = o0o00000;
                this.f3533o00oo0O = str;
                this.f3535o00oo0Oo = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oo00O o00oo00o = MediaBrowserServiceCompat.this.f3512o00oo0o0.get(this.f3534o00oo0O0.asBinder());
                if (o00oo00o == null) {
                    return;
                }
                MediaBrowserServiceCompat.this.o00oo0oO(this.f3533o00oo0O, o00oo00o, this.f3535o00oo0Oo);
            }
        }

        /* loaded from: classes.dex */
        public class o00oo0 implements Runnable {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0O00000 f3538o00oo0O0;

            public o00oo0(o0O00000 o0o00000) {
                this.f3538o00oo0O0 = o0o00000;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f3538o00oo0O0.asBinder();
                o00oo00O remove = MediaBrowserServiceCompat.this.f3512o00oo0o0.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        /* loaded from: classes.dex */
        public class o00oo00O implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ int f3539o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0O00000 f3540o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public final /* synthetic */ String f3541o00oo0Oo;

            /* renamed from: o00oo0o  reason: collision with root package name */
            public final /* synthetic */ Bundle f3542o00oo0o;

            /* renamed from: o00oo0o0  reason: collision with root package name */
            public final /* synthetic */ int f3543o00oo0o0;

            public o00oo00O(o0O00000 o0o00000, int i, String str, int i2, Bundle bundle) {
                this.f3540o00oo0O0 = o0o00000;
                this.f3539o00oo0O = i;
                this.f3541o00oo0Oo = str;
                this.f3543o00oo0o0 = i2;
                this.f3542o00oo0o = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oo00O o00oo00o;
                IBinder asBinder = this.f3540o00oo0O0.asBinder();
                MediaBrowserServiceCompat.this.f3512o00oo0o0.remove(asBinder);
                Iterator<o00oo00O> it = MediaBrowserServiceCompat.this.f3510o00oo0Oo.iterator();
                while (true) {
                    o00oo00o = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    o00oo00O next = it.next();
                    if (next.f3585o00oOo00 == this.f3539o00oo0O) {
                        if (TextUtils.isEmpty(this.f3541o00oo0Oo) || this.f3543o00oo0o0 <= 0) {
                            o00oo00o = new o00oo00O(next.f3583o00oOOo0, next.f3584o00oOOoO, next.f3585o00oOo00, this.f3542o00oo0o, this.f3540o00oo0O0);
                        }
                        it.remove();
                    }
                }
                if (o00oo00o == null) {
                    o00oo00o = new o00oo00O(this.f3541o00oo0Oo, this.f3543o00oo0o0, this.f3539o00oo0O, this.f3542o00oo0o, this.f3540o00oo0O0);
                }
                MediaBrowserServiceCompat.this.f3512o00oo0o0.put(asBinder, o00oo00o);
                try {
                    asBinder.linkToDeath(o00oo00o, 0);
                } catch (RemoteException unused) {
                }
            }
        }

        /* loaded from: classes.dex */
        public class o00oo0O0 implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ String f3545o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0O00000 f3546o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public final /* synthetic */ Bundle f3547o00oo0Oo;

            /* renamed from: o00oo0o0  reason: collision with root package name */
            public final /* synthetic */ ResultReceiver f3549o00oo0o0;

            public o00oo0O0(o0O00000 o0o00000, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f3546o00oo0O0 = o0o00000;
                this.f3545o00oo0O = str;
                this.f3547o00oo0Oo = bundle;
                this.f3549o00oo0o0 = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oo00O o00oo00o = MediaBrowserServiceCompat.this.f3512o00oo0o0.get(this.f3546o00oo0O0.asBinder());
                if (o00oo00o == null) {
                    Objects.toString(this.f3547o00oo0Oo);
                } else {
                    MediaBrowserServiceCompat.this.o00oo0o0(this.f3545o00oo0O, this.f3547o00oo0Oo, o00oo00o, this.f3549o00oo0o0);
                }
            }
        }

        /* loaded from: classes.dex */
        public class o00oo0OO implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ String f3550o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0O00000 f3551o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public final /* synthetic */ Bundle f3552o00oo0Oo;

            /* renamed from: o00oo0o0  reason: collision with root package name */
            public final /* synthetic */ ResultReceiver f3554o00oo0o0;

            public o00oo0OO(o0O00000 o0o00000, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f3551o00oo0O0 = o0o00000;
                this.f3550o00oo0O = str;
                this.f3552o00oo0Oo = bundle;
                this.f3554o00oo0o0 = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oo00O o00oo00o = MediaBrowserServiceCompat.this.f3512o00oo0o0.get(this.f3551o00oo0O0.asBinder());
                if (o00oo00o == null) {
                    return;
                }
                MediaBrowserServiceCompat.this.o0O0o(this.f3550o00oo0O, this.f3552o00oo0Oo, o00oo00o, this.f3554o00oo0o0);
            }
        }

        public o0() {
        }

        public void o00oOOo0(String str, IBinder iBinder, Bundle bundle, o0O00000 o0o00000) {
            MediaBrowserServiceCompat.this.f3513o00oo0oO.o00oOOo0(new o00oOo00(o0o00000, str, iBinder, bundle));
        }

        public void o00oOOoO(String str, int i, int i2, Bundle bundle, o0O00000 o0o00000) {
            if (MediaBrowserServiceCompat.this.o00oOoO0(str, i2)) {
                MediaBrowserServiceCompat.this.f3513o00oo0oO.o00oOOo0(new o00oOOo0(o0o00000, str, i, i2, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + str);
        }

        public void o00oOo00(o0O00000 o0o00000) {
            MediaBrowserServiceCompat.this.f3513o00oo0oO.o00oOOo0(new o00oOOoO(o0o00000));
        }

        public void o00oOo0O(o0O00000 o0o00000, String str, int i, int i2, Bundle bundle) {
            MediaBrowserServiceCompat.this.f3513o00oo0oO.o00oOOo0(new o00oo00O(o0o00000, i2, str, i, bundle));
        }

        public void o00oOo0o(String str, IBinder iBinder, o0O00000 o0o00000) {
            MediaBrowserServiceCompat.this.f3513o00oo0oO.o00oOOo0(new o00oOo0O(o0o00000, str, iBinder));
        }

        public void o00oOoO(String str, Bundle bundle, ResultReceiver resultReceiver, o0O00000 o0o00000) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f3513o00oo0oO.o00oOOo0(new o00oo0O0(o0o00000, str, bundle, resultReceiver));
        }

        public void o00oOoO0(String str, Bundle bundle, ResultReceiver resultReceiver, o0O00000 o0o00000) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f3513o00oo0oO.o00oOOo0(new o00oo0OO(o0o00000, str, bundle, resultReceiver));
        }

        public void o00oOoOO(o0O00000 o0o00000) {
            MediaBrowserServiceCompat.this.f3513o00oo0oO.o00oOOo0(new o00oo0(o0o00000));
        }

        public void o00oOooO(String str, ResultReceiver resultReceiver, o0O00000 o0o00000) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f3513o00oo0oO.o00oOOo0(new o00oOoO(o0o00000, str, resultReceiver));
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o00ooO0<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final /* synthetic */ o00oo00O f3555o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public final /* synthetic */ Bundle f3556o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public final /* synthetic */ String f3557o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public final /* synthetic */ Bundle f3558o00oOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(Object obj, o00oo00O o00oo00o, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f3555o00oOo0o = o00oo00o;
            this.f3557o00oOoO0 = str;
            this.f3556o00oOoO = bundle;
            this.f3558o00oOoOO = bundle2;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00ooO0
        /* renamed from: o00oOooo */
        public void o00oOoO0(@o0OO00OO List<MediaBrowserCompat.MediaItem> list) {
            if (MediaBrowserServiceCompat.this.f3512o00oo0o0.get(this.f3555o00oOo0o.f3587o00oOo0o.asBinder()) != this.f3555o00oOo0o) {
                if (MediaBrowserServiceCompat.f3499o00ooO00) {
                    String str = this.f3555o00oOo0o.f3583o00oOOo0;
                    return;
                }
                return;
            }
            if ((o00oOo00() & 1) != 0) {
                list = MediaBrowserServiceCompat.this.o00oOOoO(list, this.f3556o00oOoO);
            }
            try {
                this.f3555o00oOo0o.f3587o00oOo0o.o00oOOo0(this.f3557o00oOoO0, list, this.f3556o00oOoO, this.f3558o00oOoOO);
            } catch (RemoteException unused) {
                String str2 = this.f3555o00oOo0o.f3583o00oOOo0;
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o00ooO0<MediaBrowserCompat.MediaItem> {

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final /* synthetic */ ResultReceiver f3560o00oOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f3560o00oOo0o = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00ooO0
        /* renamed from: o00oOooo */
        public void o00oOoO0(@o0OO00OO MediaBrowserCompat.MediaItem mediaItem) {
            if ((o00oOo00() & 2) != 0) {
                this.f3560o00oOo0o.send(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaBrowserServiceCompat.f3501o00ooO0o, mediaItem);
            this.f3560o00oOo0o.send(0, bundle);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends o00ooO0<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final /* synthetic */ ResultReceiver f3562o00oOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f3562o00oOo0o = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00ooO0
        /* renamed from: o00oOooo */
        public void o00oOoO0(@o0OO00OO List<MediaBrowserCompat.MediaItem> list) {
            if ((o00oOo00() & 4) != 0 || list == null) {
                this.f3562o00oOo0o.send(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(MediaBrowserServiceCompat.f3497o00ooO, (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f3562o00oOo0o.send(0, bundle);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O extends o00ooO0<Bundle> {

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final /* synthetic */ ResultReceiver f3564o00oOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo0O(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f3564o00oOo0o = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00ooO0
        public void o00oOo0O(@o0OO00OO Bundle bundle) {
            this.f3564o00oOo0o.send(-1, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00ooO0
        public void o00oOo0o(@o0OO00OO Bundle bundle) {
            this.f3564o00oOo0o.send(1, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00ooO0
        /* renamed from: o00oOooo */
        public void o00oOoO0(@o0OO00OO Bundle bundle) {
            this.f3564o00oOo0o.send(0, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOoO {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final String f3566o00oOo00 = "android.service.media.extra.RECENT";

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final String f3567o00oOo0O = "android.service.media.extra.SUGGESTED";
        @Deprecated

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final String f3568o00oOo0o = "android.service.media.extra.SUGGESTION_KEYWORDS";

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final String f3569o00oOooO = "android.service.media.extra.OFFLINE";

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f3570o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Bundle f3571o00oOOoO;

        public o00oOoO(@oo0oO0 String str, @o0OO00OO Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.f3570o00oOOo0 = str;
            this.f3571o00oOOoO = bundle;
        }

        public Bundle o00oOo00() {
            return this.f3571o00oOOoO;
        }

        public String o00oOooO() {
            return this.f3570o00oOOo0;
        }
    }

    /* loaded from: classes.dex */
    public class o00oo implements o00oo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Messenger f3572o00oOOo0;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Runnable {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ MediaSessionCompat.Token f3575o00oo0O0;

            public o00oOOo0(MediaSessionCompat.Token token) {
                this.f3575o00oo0O0 = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<o00oo00O> it = MediaBrowserServiceCompat.this.f3512o00oo0o0.values().iterator();
                while (it.hasNext()) {
                    o00oo00O next = it.next();
                    try {
                        o0O00000 o0o00000 = next.f3587o00oOo0o;
                        o00oOoO o00oooo2 = next.f3588o00oOoO;
                        o0o00000.o00oOo00(o00oooo2.f3570o00oOOo0, this.f3575o00oo0O0, o00oooo2.f3571o00oOOoO);
                    } catch (RemoteException unused) {
                        String str = next.f3583o00oOOo0;
                        it.remove();
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public class o00oOOoO implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ Bundle f3576o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ String f3577o00oo0O0;

            public o00oOOoO(String str, Bundle bundle) {
                this.f3577o00oo0O0 = str;
                this.f3576o00oo0O = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (IBinder iBinder : MediaBrowserServiceCompat.this.f3512o00oo0o0.keySet()) {
                    androidx.collection.o00oOOo0<IBinder, o00oo00O> o00oooo02 = MediaBrowserServiceCompat.this.f3512o00oo0o0;
                    o00oo.this.o00oOoO(o00oooo02.get(iBinder), this.f3577o00oo0O0, this.f3576o00oo0O);
                }
            }
        }

        /* loaded from: classes.dex */
        public class o00oOo00 implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ String f3579o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o00oOOoO.C0034o00oOOoO f3580o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public final /* synthetic */ Bundle f3581o00oo0Oo;

            public o00oOo00(o00oOOoO.C0034o00oOOoO c0034o00oOOoO, String str, Bundle bundle) {
                this.f3580o00oo0O0 = c0034o00oOOoO;
                this.f3579o00oo0O = str;
                this.f3581o00oo0Oo = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < MediaBrowserServiceCompat.this.f3512o00oo0o0.size(); i++) {
                    o00oo00O o00oo02 = MediaBrowserServiceCompat.this.f3512o00oo0o0.o00oo0(i);
                    if (o00oo02.f3591o00oOooO.equals(this.f3580o00oo0O0)) {
                        o00oo.this.o00oOoO(o00oo02, this.f3579o00oo0O, this.f3581o00oo0Oo);
                        return;
                    }
                }
            }
        }

        public o00oo() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0
        public void o00oOOo0() {
            this.f3572o00oOOo0 = new Messenger(MediaBrowserServiceCompat.this.f3513o00oo0oO);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0
        public o00oOOoO.C0034o00oOOoO o00oOOoO() {
            o00oo00O o00oo00o = MediaBrowserServiceCompat.this.f3511o00oo0o;
            if (o00oo00o != null) {
                return o00oo00o.f3591o00oOooO;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0
        public void o00oOo00(@oo0oO0 String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f3513o00oo0oO.post(new o00oOOoO(str, bundle));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0
        public Bundle o00oOo0O() {
            o00oo00O o00oo00o = MediaBrowserServiceCompat.this.f3511o00oo0o;
            if (o00oo00o != null) {
                if (o00oo00o.f3586o00oOo0O == null) {
                    return null;
                }
                return new Bundle(MediaBrowserServiceCompat.this.f3511o00oo0o.f3586o00oOo0O);
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0
        public void o00oOo0o(@oo0oO0 o00oOOoO.C0034o00oOOoO c0034o00oOOoO, @oo0oO0 String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f3513o00oo0oO.post(new o00oOo00(c0034o00oOOoO, str, bundle));
        }

        public void o00oOoO(o00oo00O o00oo00o, String str, Bundle bundle) {
            List<oO0o0o<IBinder, Bundle>> list = o00oo00o.f3589o00oOoO0.get(str);
            if (list != null) {
                for (oO0o0o<IBinder, Bundle> oo0o0o : list) {
                    if (o0O0O0Oo.o00oOOoO.o00oOOoO(bundle, oo0o0o.f17228o00oOOoO)) {
                        MediaBrowserServiceCompat.this.o00oo0o(str, o00oo00o, oo0o0o.f17228o00oOOoO, bundle);
                    }
                }
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0
        public IBinder o00oOoO0(Intent intent) {
            if (MediaBrowserServiceCompat.f3500o00ooO0O.equals(intent.getAction())) {
                return this.f3572o00oOOo0.getBinder();
            }
            return null;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0
        public void o00oOooO(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.f3513o00oo0oO.post(new o00oOOo0(token));
        }
    }

    /* loaded from: classes.dex */
    public interface o00oo0 {
        void o00oOOo0();

        o00oOOoO.C0034o00oOOoO o00oOOoO();

        void o00oOo00(String str, Bundle bundle);

        Bundle o00oOo0O();

        void o00oOo0o(o00oOOoO.C0034o00oOOoO c0034o00oOOoO, String str, Bundle bundle);

        IBinder o00oOoO0(Intent intent);

        void o00oOooO(MediaSessionCompat.Token token);
    }

    /* loaded from: classes.dex */
    public class o00oo00O implements IBinder.DeathRecipient {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f3583o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f3584o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f3585o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final Bundle f3586o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final o0O00000 f3587o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public o00oOoO f3588o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public final HashMap<String, List<oO0o0o<IBinder, Bundle>>> f3589o00oOoO0 = new HashMap<>();

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final o00oOOoO.C0034o00oOOoO f3591o00oOooO;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Runnable {
            public o00oOOo0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oo00O o00oo00o = o00oo00O.this;
                MediaBrowserServiceCompat.this.f3512o00oo0o0.remove(o00oo00o.f3587o00oOo0o.asBinder());
            }
        }

        public o00oo00O(String str, int i, int i2, Bundle bundle, o0O00000 o0o00000) {
            this.f3583o00oOOo0 = str;
            this.f3584o00oOOoO = i;
            this.f3585o00oOo00 = i2;
            this.f3591o00oOooO = new o00oOOoO.C0034o00oOOoO(str, i, i2);
            this.f3586o00oOo0O = bundle;
            this.f3587o00oOo0o = o0o00000;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.f3513o00oo0oO.post(new o00oOOo0());
        }
    }

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public class o00oo0O extends o00oo0O0 {

        /* loaded from: classes.dex */
        public class o00oOOo0 extends o00ooO0<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: o00oOo0o  reason: collision with root package name */
            public final /* synthetic */ o00ooO f3594o00oOo0o;

            /* renamed from: o00oOoO0  reason: collision with root package name */
            public final /* synthetic */ Bundle f3596o00oOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOOo0(Object obj, o00ooO o00ooo, Bundle bundle) {
                super(obj);
                this.f3594o00oOo0o = o00ooo;
                this.f3596o00oOoO0 = bundle;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.o00ooO0
            public void o00oOOoO() {
                this.f3594o00oOo0o.o00oOOo0();
            }

            @Override // androidx.media.MediaBrowserServiceCompat.o00ooO0
            /* renamed from: o00oOooo */
            public void o00oOoO0(@o0OO00OO List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                o00ooO o00ooo;
                if (list == null) {
                    o00ooo = this.f3594o00oOo0o;
                    arrayList = null;
                } else {
                    if ((o00oOo00() & 1) != 0) {
                        list = MediaBrowserServiceCompat.this.o00oOOoO(list, this.f3596o00oOoO0);
                    }
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                    o00ooo = this.f3594o00oOo0o;
                }
                o00ooo.o00oOo00(arrayList);
            }
        }

        /* loaded from: classes.dex */
        public class o00oOOoO extends o00oo0O0.o00oOOoO {
            public o00oOOoO(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                o00oo0O o00oo0o2 = o00oo0O.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f3511o00oo0o = mediaBrowserServiceCompat.f3508o00oo0O;
                o00oo0o2.o00oo0O0(str, new o00ooO<>(result), bundle);
                MediaBrowserServiceCompat.this.f3511o00oo0o = null;
            }
        }

        public o00oo0O() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0O0, androidx.media.MediaBrowserServiceCompat.o00oo0OO, androidx.media.MediaBrowserServiceCompat.o00oo0
        public void o00oOOo0() {
            o00oOOoO o00ooooo2 = new o00oOOoO(MediaBrowserServiceCompat.this);
            this.f3603o00oOOoO = o00ooooo2;
            o00ooooo2.onCreate();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0OO, androidx.media.MediaBrowserServiceCompat.o00oo0
        public Bundle o00oOo0O() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            o00oo00O o00oo00o = mediaBrowserServiceCompat.f3511o00oo0o;
            if (o00oo00o != null) {
                if (o00oo00o == mediaBrowserServiceCompat.f3508o00oo0O) {
                    return this.f3603o00oOOoO.getBrowserRootHints();
                }
                if (o00oo00o.f3586o00oOo0O == null) {
                    return null;
                }
                return new Bundle(MediaBrowserServiceCompat.this.f3511o00oo0o.f3586o00oOo0O);
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0OO
        public void o00oOoo0(String str, Bundle bundle) {
            if (bundle != null) {
                this.f3603o00oOOoO.notifyChildrenChanged(str, bundle);
            } else {
                super.o00oOoo0(str, bundle);
            }
        }

        public void o00oo0O0(String str, o00ooO<List<Parcel>> o00ooo, Bundle bundle) {
            o00oOOo0 o00oooo02 = new o00oOOo0(str, o00ooo, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f3511o00oo0o = mediaBrowserServiceCompat.f3508o00oo0O;
            mediaBrowserServiceCompat.o00oo0(str, o00oooo02, bundle);
            MediaBrowserServiceCompat.this.f3511o00oo0o = null;
        }
    }

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public class o00oo0O0 extends o00oo0OO {

        /* loaded from: classes.dex */
        public class o00oOOo0 extends o00ooO0<MediaBrowserCompat.MediaItem> {

            /* renamed from: o00oOo0o  reason: collision with root package name */
            public final /* synthetic */ o00ooO f3599o00oOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOOo0(Object obj, o00ooO o00ooo) {
                super(obj);
                this.f3599o00oOo0o = o00ooo;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.o00ooO0
            public void o00oOOoO() {
                this.f3599o00oOo0o.o00oOOo0();
            }

            @Override // androidx.media.MediaBrowserServiceCompat.o00ooO0
            /* renamed from: o00oOooo */
            public void o00oOoO0(@o0OO00OO MediaBrowserCompat.MediaItem mediaItem) {
                Parcel obtain;
                o00ooO o00ooo;
                if (mediaItem == null) {
                    o00ooo = this.f3599o00oOo0o;
                    obtain = null;
                } else {
                    obtain = Parcel.obtain();
                    mediaItem.writeToParcel(obtain, 0);
                    o00ooo = this.f3599o00oOo0o;
                }
                o00ooo.o00oOo00(obtain);
            }
        }

        /* loaded from: classes.dex */
        public class o00oOOoO extends o00oo0OO.o00oOoO {
            public o00oOOoO(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                o00oo0O0.this.o00oo0OO(str, new o00ooO<>(result));
            }
        }

        public o00oo0O0() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0OO, androidx.media.MediaBrowserServiceCompat.o00oo0
        public void o00oOOo0() {
            o00oOOoO o00ooooo2 = new o00oOOoO(MediaBrowserServiceCompat.this);
            this.f3603o00oOOoO = o00ooooo2;
            o00ooooo2.onCreate();
        }

        public void o00oo0OO(String str, o00ooO<Parcel> o00ooo) {
            o00oOOo0 o00oooo02 = new o00oOOo0(str, o00ooo);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f3511o00oo0o = mediaBrowserServiceCompat.f3508o00oo0O;
            mediaBrowserServiceCompat.o00oo0OO(str, o00oooo02);
            MediaBrowserServiceCompat.this.f3511o00oo0o = null;
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public class o00oo0OO implements o00oo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final List<Bundle> f3602o00oOOo0 = new ArrayList();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public MediaBrowserService f3603o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public Messenger f3604o00oOo00;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Runnable {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ MediaSessionCompat.Token f3607o00oo0O0;

            public o00oOOo0(MediaSessionCompat.Token token) {
                this.f3607o00oo0O0 = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oo0OO.this.o00oo0(this.f3607o00oo0O0);
            }
        }

        /* loaded from: classes.dex */
        public class o00oOOoO extends o00ooO0<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: o00oOo0o  reason: collision with root package name */
            public final /* synthetic */ o00ooO f3608o00oOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOOoO(Object obj, o00ooO o00ooo) {
                super(obj);
                this.f3608o00oOo0o = o00ooo;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.o00ooO0
            public void o00oOOoO() {
                this.f3608o00oOo0o.o00oOOo0();
            }

            @Override // androidx.media.MediaBrowserServiceCompat.o00ooO0
            /* renamed from: o00oOooo */
            public void o00oOoO0(@o0OO00OO List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f3608o00oOo0o.o00oOo00(arrayList);
            }
        }

        /* loaded from: classes.dex */
        public class o00oOo00 implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ Bundle f3610o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ String f3611o00oo0O0;

            public o00oOo00(String str, Bundle bundle) {
                this.f3611o00oo0O0 = str;
                this.f3610o00oo0O = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (IBinder iBinder : MediaBrowserServiceCompat.this.f3512o00oo0o0.keySet()) {
                    androidx.collection.o00oOOo0<IBinder, o00oo00O> o00oooo02 = MediaBrowserServiceCompat.this.f3512o00oo0o0;
                    o00oo0OO.this.o00oOoOo(o00oooo02.get(iBinder), this.f3611o00oo0O0, this.f3610o00oo0O);
                }
            }
        }

        /* loaded from: classes.dex */
        public class o00oOo0O implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ String f3613o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o00oOOoO.C0034o00oOOoO f3614o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public final /* synthetic */ Bundle f3615o00oo0Oo;

            public o00oOo0O(o00oOOoO.C0034o00oOOoO c0034o00oOOoO, String str, Bundle bundle) {
                this.f3614o00oo0O0 = c0034o00oOOoO;
                this.f3613o00oo0O = str;
                this.f3615o00oo0Oo = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < MediaBrowserServiceCompat.this.f3512o00oo0o0.size(); i++) {
                    o00oo00O o00oo02 = MediaBrowserServiceCompat.this.f3512o00oo0o0.o00oo0(i);
                    if (o00oo02.f3591o00oOooO.equals(this.f3614o00oo0O0)) {
                        o00oo0OO.this.o00oOoOo(o00oo02, this.f3613o00oo0O, this.f3615o00oo0Oo);
                    }
                }
            }
        }

        @o0OOooO0(21)
        /* loaded from: classes.dex */
        public class o00oOoO extends MediaBrowserService {
            public o00oOoO(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            @SuppressLint({"SyntheticAccessor"})
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                o00oOoO o00oOooo2 = o00oo0OO.this.o00oOooo(str, i, bundle == null ? null : new Bundle(bundle));
                if (o00oOooo2 == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(o00oOooo2.f3570o00oOOo0, o00oOooo2.f3571o00oOOoO);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                o00oo0OO.this.o00oo00O(str, new o00ooO<>(result));
            }
        }

        public o00oo0OO() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0
        public void o00oOOo0() {
            o00oOoO o00oooo2 = new o00oOoO(MediaBrowserServiceCompat.this);
            this.f3603o00oOOoO = o00oooo2;
            o00oooo2.onCreate();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0
        public o00oOOoO.C0034o00oOOoO o00oOOoO() {
            o00oo00O o00oo00o = MediaBrowserServiceCompat.this.f3511o00oo0o;
            if (o00oo00o != null) {
                return o00oo00o.f3591o00oOooO;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0
        public void o00oOo00(String str, Bundle bundle) {
            o00oOoo0(str, bundle);
            o00oOoOO(str, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0
        public Bundle o00oOo0O() {
            if (this.f3604o00oOo00 == null) {
                return null;
            }
            o00oo00O o00oo00o = MediaBrowserServiceCompat.this.f3511o00oo0o;
            if (o00oo00o != null) {
                if (o00oo00o.f3586o00oOo0O == null) {
                    return null;
                }
                return new Bundle(MediaBrowserServiceCompat.this.f3511o00oo0o.f3586o00oOo0O);
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0
        public void o00oOo0o(o00oOOoO.C0034o00oOOoO c0034o00oOOoO, String str, Bundle bundle) {
            o00oOoO(c0034o00oOOoO, str, bundle);
        }

        public void o00oOoO(o00oOOoO.C0034o00oOOoO c0034o00oOOoO, String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f3513o00oo0oO.post(new o00oOo0O(c0034o00oOOoO, str, bundle));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0
        public IBinder o00oOoO0(Intent intent) {
            return this.f3603o00oOOoO.onBind(intent);
        }

        public void o00oOoOO(String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f3513o00oo0oO.post(new o00oOo00(str, bundle));
        }

        public void o00oOoOo(o00oo00O o00oo00o, String str, Bundle bundle) {
            List<oO0o0o<IBinder, Bundle>> list = o00oo00o.f3589o00oOoO0.get(str);
            if (list != null) {
                for (oO0o0o<IBinder, Bundle> oo0o0o : list) {
                    if (o0O0O0Oo.o00oOOoO.o00oOOoO(bundle, oo0o0o.f17228o00oOOoO)) {
                        MediaBrowserServiceCompat.this.o00oo0o(str, o00oo00o, oo0o0o.f17228o00oOOoO, bundle);
                    }
                }
            }
        }

        public void o00oOoo0(String str, Bundle bundle) {
            this.f3603o00oOOoO.notifyChildrenChanged(str);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0
        public void o00oOooO(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.f3513o00oo0oO.o00oOOo0(new o00oOOo0(token));
        }

        public o00oOoO o00oOooo(String str, int i, Bundle bundle) {
            int i2;
            Bundle bundle2;
            if (bundle == null || bundle.getInt(o0O0O0Oo.o00oOo00.f11204o00oo0O0, 0) == 0) {
                i2 = -1;
                bundle2 = null;
            } else {
                bundle.remove(o0O0O0Oo.o00oOo00.f11204o00oo0O0);
                this.f3604o00oOo00 = new Messenger(MediaBrowserServiceCompat.this.f3513o00oo0oO);
                bundle2 = new Bundle();
                bundle2.putInt(o0O0O0Oo.o00oOo00.f11206o00oo0Oo, 2);
                oO00O0o0.o00oOOo0.o00oOOoO(bundle2, o0O0O0Oo.o00oOo00.f11208o00oo0o0, this.f3604o00oOo00.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.f3514o0O0o;
                if (token != null) {
                    IMediaSession extraBinder = token.getExtraBinder();
                    oO00O0o0.o00oOOo0.o00oOOoO(bundle2, o0O0O0Oo.o00oOo00.f11207o00oo0o, extraBinder == null ? null : extraBinder.asBinder());
                } else {
                    this.f3602o00oOOo0.add(bundle2);
                }
                int i3 = bundle.getInt(o0O0O0Oo.o00oOo00.f11203o00oo0O, -1);
                bundle.remove(o0O0O0Oo.o00oOo00.f11203o00oo0O);
                i2 = i3;
            }
            o00oo00O o00oo00o = new o00oo00O(str, i2, i, bundle, null);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f3511o00oo0o = o00oo00o;
            o00oOoO o00oOooo2 = mediaBrowserServiceCompat.o00oOooo(str, i, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat2.f3511o00oo0o = null;
            if (o00oOooo2 == null) {
                return null;
            }
            if (this.f3604o00oOo00 != null) {
                mediaBrowserServiceCompat2.f3510o00oo0Oo.add(o00oo00o);
            }
            if (bundle2 == null) {
                bundle2 = o00oOooo2.f3571o00oOOoO;
            } else {
                Bundle bundle3 = o00oOooo2.f3571o00oOOoO;
                if (bundle3 != null) {
                    bundle2.putAll(bundle3);
                }
            }
            return new o00oOoO(o00oOooo2.f3570o00oOOo0, bundle2);
        }

        public void o00oo0(MediaSessionCompat.Token token) {
            if (!this.f3602o00oOOo0.isEmpty()) {
                IMediaSession extraBinder = token.getExtraBinder();
                if (extraBinder != null) {
                    for (Bundle bundle : this.f3602o00oOOo0) {
                        oO00O0o0.o00oOOo0.o00oOOoO(bundle, o0O0O0Oo.o00oOo00.f11207o00oo0o, extraBinder.asBinder());
                    }
                }
                this.f3602o00oOOo0.clear();
            }
            this.f3603o00oOOoO.setSessionToken((MediaSession.Token) token.getToken());
        }

        public void o00oo00O(String str, o00ooO<List<Parcel>> o00ooo) {
            o00oOOoO o00ooooo2 = new o00oOOoO(str, o00ooo);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f3511o00oo0o = mediaBrowserServiceCompat.f3508o00oo0O;
            mediaBrowserServiceCompat.o00oo00O(str, o00ooooo2);
            MediaBrowserServiceCompat.this.f3511o00oo0o = null;
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00ooO<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public MediaBrowserService.Result f3618o00oOOo0;

        public o00ooO(MediaBrowserService.Result result) {
            this.f3618o00oOOo0 = result;
        }

        public void o00oOOo0() {
            this.f3618o00oOOo0.detach();
        }

        public List<MediaBrowser.MediaItem> o00oOOoO(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void o00oOo00(T t) {
            if (t instanceof List) {
                this.f3618o00oOOo0.sendResult(o00oOOoO((List) t));
            } else if (!(t instanceof Parcel)) {
                this.f3618o00oOOo0.sendResult(null);
            } else {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.f3618o00oOOo0.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00ooO0<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Object f3619o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f3620o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f3621o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f3622o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f3623o00oOooO;

        public o00ooO0(Object obj) {
            this.f3619o00oOOo0 = obj;
        }

        public final void o00oOOo0(@o0OO00OO Bundle bundle) {
            if (bundle != null && bundle.containsKey(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS)) {
                float f = bundle.getFloat(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS);
                if (f < -1.0E-5f || f > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0]");
                }
            }
        }

        public void o00oOOoO() {
            if (this.f3620o00oOOoO) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("detach() called when detach() had already been called for: ");
                o00oOOo02.append(this.f3619o00oOOo0);
                throw new IllegalStateException(o00oOOo02.toString());
            } else if (this.f3621o00oOo00) {
                StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("detach() called when sendResult() had already been called for: ");
                o00oOOo03.append(this.f3619o00oOOo0);
                throw new IllegalStateException(o00oOOo03.toString());
            } else if (!this.f3623o00oOooO) {
                this.f3620o00oOOoO = true;
            } else {
                StringBuilder o00oOOo04 = android.support.v4.media.o00oOo0O.o00oOOo0("detach() called when sendError() had already been called for: ");
                o00oOOo04.append(this.f3619o00oOOo0);
                throw new IllegalStateException(o00oOOo04.toString());
            }
        }

        public int o00oOo00() {
            return this.f3622o00oOo0O;
        }

        public void o00oOo0O(@o0OO00OO Bundle bundle) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("It is not supported to send an error for ");
            o00oOOo02.append(this.f3619o00oOOo0);
            throw new UnsupportedOperationException(o00oOOo02.toString());
        }

        public void o00oOo0o(@o0OO00OO Bundle bundle) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("It is not supported to send an interim update for ");
            o00oOOo02.append(this.f3619o00oOOo0);
            throw new UnsupportedOperationException(o00oOOo02.toString());
        }

        public void o00oOoO(@o0OO00OO Bundle bundle) {
            if (this.f3621o00oOo00 || this.f3623o00oOooO) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("sendError() called when either sendResult() or sendError() had already been called for: ");
                o00oOOo02.append(this.f3619o00oOOo0);
                throw new IllegalStateException(o00oOOo02.toString());
            }
            this.f3623o00oOooO = true;
            o00oOo0O(bundle);
        }

        public void o00oOoO0(@o0OO00OO T t) {
        }

        public void o00oOoOO(@o0OO00OO Bundle bundle) {
            if (this.f3621o00oOo00 || this.f3623o00oOooO) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ");
                o00oOOo02.append(this.f3619o00oOOo0);
                throw new IllegalStateException(o00oOOo02.toString());
            }
            o00oOOo0(bundle);
            o00oOo0o(bundle);
        }

        public void o00oOoOo(@o0OO00OO T t) {
            if (this.f3621o00oOo00 || this.f3623o00oOooO) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("sendResult() called when either sendResult() or sendError() had already been called for: ");
                o00oOOo02.append(this.f3619o00oOOo0);
                throw new IllegalStateException(o00oOOo02.toString());
            }
            this.f3621o00oOo00 = true;
            o00oOoO0(t);
        }

        public void o00oOoo0(int i) {
            this.f3622o00oOo0O = i;
        }

        public boolean o00oOooO() {
            return this.f3620o00oOOoO || this.f3621o00oOo00 || this.f3623o00oOooO;
        }
    }

    /* loaded from: classes.dex */
    public final class o0O000 extends Handler {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0 f3624o00oOOo0;

        public o0O000() {
            this.f3624o00oOOo0 = new o0();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle(o0O0O0Oo.o00oOo00.f11197o00oOoo0);
                    MediaSessionCompat.ensureClassLoader(bundle);
                    this.f3624o00oOOo0.o00oOOoO(data.getString(o0O0O0Oo.o00oOo00.f11195o00oOoOO), data.getInt(o0O0O0Oo.o00oOo00.f11190o00oOo00), data.getInt(o0O0O0Oo.o00oOo00.f11189o00oOOoO), bundle, new o0O0000O(message.replyTo));
                    return;
                case 2:
                    this.f3624o00oOOo0.o00oOo00(new o0O0000O(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle(o0O0O0Oo.o00oOo00.f11194o00oOoO0);
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    this.f3624o00oOOo0.o00oOOo0(data.getString(o0O0O0Oo.o00oOo00.f11198o00oOooO), oO00O0o0.o00oOOo0.o00oOOo0(data, o0O0O0Oo.o00oOo00.f11188o00oOOo0), bundle2, new o0O0000O(message.replyTo));
                    return;
                case 4:
                    this.f3624o00oOOo0.o00oOo0o(data.getString(o0O0O0Oo.o00oOo00.f11198o00oOooO), oO00O0o0.o00oOOo0.o00oOOo0(data, o0O0O0Oo.o00oOo00.f11188o00oOOo0), new o0O0000O(message.replyTo));
                    return;
                case 5:
                    this.f3624o00oOOo0.o00oOooO(data.getString(o0O0O0Oo.o00oOo00.f11198o00oOooO), (ResultReceiver) data.getParcelable(o0O0O0Oo.o00oOo00.f11196o00oOoOo), new o0O0000O(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle(o0O0O0Oo.o00oOo00.f11197o00oOoo0);
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    this.f3624o00oOOo0.o00oOo0O(new o0O0000O(message.replyTo), data.getString(o0O0O0Oo.o00oOo00.f11195o00oOoOO), data.getInt(o0O0O0Oo.o00oOo00.f11190o00oOo00), data.getInt(o0O0O0Oo.o00oOo00.f11189o00oOOoO), bundle3);
                    return;
                case 7:
                    this.f3624o00oOOo0.o00oOoOO(new o0O0000O(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle(o0O0O0Oo.o00oOo00.f11199o00oOooo);
                    MediaSessionCompat.ensureClassLoader(bundle4);
                    this.f3624o00oOOo0.o00oOoO0(data.getString(o0O0O0Oo.o00oOo00.f11202o00oo00O), bundle4, (ResultReceiver) data.getParcelable(o0O0O0Oo.o00oOo00.f11196o00oOoOo), new o0O0000O(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle(o0O0O0Oo.o00oOo00.f11205o00oo0OO);
                    MediaSessionCompat.ensureClassLoader(bundle5);
                    this.f3624o00oOOo0.o00oOoO(data.getString(o0O0O0Oo.o00oOo00.f11201o00oo0), bundle5, (ResultReceiver) data.getParcelable(o0O0O0Oo.o00oOo00.f11196o00oOoOo), new o0O0000O(message.replyTo));
                    return;
                default:
                    message.toString();
                    return;
            }
        }

        public void o00oOOo0(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt(o0O0O0Oo.o00oOo00.f11189o00oOOoO, Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid <= 0) {
                if (!data.containsKey(o0O0O0Oo.o00oOo00.f11190o00oOo00)) {
                    callingPid = -1;
                }
                return super.sendMessageAtTime(message, j);
            }
            data.putInt(o0O0O0Oo.o00oOo00.f11190o00oOo00, callingPid);
            return super.sendMessageAtTime(message, j);
        }
    }

    /* loaded from: classes.dex */
    public interface o0O00000 {
        IBinder asBinder();

        void o00oOOo0(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        void o00oOOoO() throws RemoteException;

        void o00oOo00(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    /* loaded from: classes.dex */
    public static class o0O0000O implements o0O00000 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Messenger f3626o00oOOo0;

        public o0O0000O(Messenger messenger) {
            this.f3626o00oOOo0 = messenger;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o0O00000
        public IBinder asBinder() {
            return this.f3626o00oOOo0.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o0O00000
        public void o00oOOo0(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString(o0O0O0Oo.o00oOo00.f11198o00oOooO, str);
            bundle3.putBundle(o0O0O0Oo.o00oOo00.f11194o00oOoO0, bundle);
            bundle3.putBundle(o0O0O0Oo.o00oOo00.f11193o00oOoO, bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList(o0O0O0Oo.o00oOo00.f11191o00oOo0O, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            o00oOooO(3, bundle3);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o0O00000
        public void o00oOOoO() throws RemoteException {
            o00oOooO(2, null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o0O00000
        public void o00oOo00(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt(o0O0O0Oo.o00oOo00.f11206o00oo0Oo, 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString(o0O0O0Oo.o00oOo00.f11198o00oOooO, str);
            bundle2.putParcelable(o0O0O0Oo.o00oOo00.f11192o00oOo0o, token);
            bundle2.putBundle(o0O0O0Oo.o00oOo00.f11197o00oOoo0, bundle);
            o00oOooO(1, bundle2);
        }

        public final void o00oOooO(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f3626o00oOOo0.send(obtain);
        }
    }

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public class o0O0o extends o00oo0O {
        public o0O0o() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o00oo0OO, androidx.media.MediaBrowserServiceCompat.o00oo0
        public o00oOOoO.C0034o00oOOoO o00oOOoO() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            o00oo00O o00oo00o = mediaBrowserServiceCompat.f3511o00oo0o;
            if (o00oo00o != null) {
                return o00oo00o == mediaBrowserServiceCompat.f3508o00oo0O ? new o00oOOoO.C0034o00oOOoO(this.f3603o00oOOoO.getCurrentBrowserInfo()) : o00oo00o.f3591o00oOooO;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void o00oOOo0(String str, o00oo00O o00oo00o, IBinder iBinder, Bundle bundle) {
        List<oO0o0o<IBinder, Bundle>> list = o00oo00o.f3589o00oOoO0.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (oO0o0o<IBinder, Bundle> oo0o0o : list) {
            if (iBinder == oo0o0o.f17227o00oOOo0 && o0O0O0Oo.o00oOOoO.o00oOOo0(bundle, oo0o0o.f17228o00oOOoO)) {
                return;
            }
        }
        list.add(new oO0o0o<>(iBinder, bundle));
        o00oo00o.f3589o00oOoO0.put(str, list);
        o00oo0o(str, o00oo00o, bundle, null);
        this.f3511o00oo0o = o00oo00o;
        o00oo0O(str, bundle);
        this.f3511o00oo0o = null;
    }

    public List<MediaBrowserCompat.MediaItem> o00oOOoO(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int i4 = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return Collections.emptyList();
        }
        if (i4 > list.size()) {
            i4 = list.size();
        }
        return list.subList(i3, i4);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oOo00(Context context) {
        attachBaseContext(context);
    }

    @oo0oO0
    public final o00oOOoO.C0034o00oOOoO o00oOo0O() {
        return this.f3509o00oo0O0.o00oOOoO();
    }

    @o0OO00OO
    public MediaSessionCompat.Token o00oOo0o() {
        return this.f3514o0O0o;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oOoO(@oo0oO0 o00oOOoO.C0034o00oOOoO c0034o00oOOoO, @oo0oO0 String str, @oo0oO0 Bundle bundle) {
        if (c0034o00oOOoO == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        }
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        this.f3509o00oo0O0.o00oOo0o(c0034o00oOOoO, str, bundle);
    }

    public boolean o00oOoO0(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void o00oOoOO(@oo0oO0 String str) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        this.f3509o00oo0O0.o00oOo00(str, null);
    }

    public void o00oOoOo(@oo0oO0 String str, @oo0oO0 Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        this.f3509o00oo0O0.o00oOo00(str, bundle);
    }

    public void o00oOoo0(@oo0oO0 String str, Bundle bundle, @oo0oO0 o00ooO0<Bundle> o00ooo02) {
        o00ooo02.o00oOoO(null);
    }

    public final Bundle o00oOooO() {
        return this.f3509o00oo0O0.o00oOo0O();
    }

    @o0OO00OO
    public abstract o00oOoO o00oOooo(@oo0oO0 String str, int i, @o0OO00OO Bundle bundle);

    public boolean o00oo(String str, o00oo00O o00oo00o, IBinder iBinder) {
        boolean z = false;
        try {
            if (iBinder == null) {
                return o00oo00o.f3589o00oOoO0.remove(str) != null;
            }
            List<oO0o0o<IBinder, Bundle>> list = o00oo00o.f3589o00oOoO0.get(str);
            if (list != null) {
                Iterator<oO0o0o<IBinder, Bundle>> it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == it.next().f17227o00oOOo0) {
                        it.remove();
                        z = true;
                    }
                }
                if (list.size() == 0) {
                    o00oo00o.f3589o00oOoO0.remove(str);
                }
            }
            return z;
        } finally {
            this.f3511o00oo0o = o00oo00o;
            o00oo0Oo(str);
            this.f3511o00oo0o = null;
        }
    }

    public void o00oo0(@oo0oO0 String str, @oo0oO0 o00ooO0<List<MediaBrowserCompat.MediaItem>> o00ooo02, @oo0oO0 Bundle bundle) {
        o00ooo02.o00oOoo0(1);
        o00oo00O(str, o00ooo02);
    }

    public abstract void o00oo00O(@oo0oO0 String str, @oo0oO0 o00ooO0<List<MediaBrowserCompat.MediaItem>> o00ooo02);

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o00oo0O(String str, Bundle bundle) {
    }

    public void o00oo0O0(@oo0oO0 String str, Bundle bundle, @oo0oO0 o00ooO0<List<MediaBrowserCompat.MediaItem>> o00ooo02) {
        o00ooo02.o00oOoo0(4);
        o00ooo02.o00oOoOo(null);
    }

    public void o00oo0OO(String str, @oo0oO0 o00ooO0<MediaBrowserCompat.MediaItem> o00ooo02) {
        o00ooo02.o00oOoo0(2);
        o00ooo02.o00oOoOo(null);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o00oo0Oo(String str) {
    }

    public void o00oo0o(String str, o00oo00O o00oo00o, Bundle bundle, Bundle bundle2) {
        o00oOOo0 o00oooo02 = new o00oOOo0(str, o00oo00o, str, bundle, bundle2);
        this.f3511o00oo0o = o00oo00o;
        if (bundle == null) {
            o00oo00O(str, o00oooo02);
        } else {
            o00oo0(str, o00oooo02, bundle);
        }
        this.f3511o00oo0o = null;
        if (o00oooo02.o00oOooO()) {
            return;
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("onLoadChildren must call detach() or sendResult() before returning for package=");
        o00oOOo02.append(o00oo00o.f3583o00oOOo0);
        o00oOOo02.append(" id=");
        o00oOOo02.append(str);
        throw new IllegalStateException(o00oOOo02.toString());
    }

    public void o00oo0o0(String str, Bundle bundle, o00oo00O o00oo00o, ResultReceiver resultReceiver) {
        o00oOo0O o00ooo0o2 = new o00oOo0O(str, resultReceiver);
        this.f3511o00oo0o = o00oo00o;
        o00oOoo0(str, bundle, o00ooo0o2);
        this.f3511o00oo0o = null;
        if (o00ooo0o2.o00oOooO()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    public void o00oo0oO(String str, o00oo00O o00oo00o, ResultReceiver resultReceiver) {
        o00oOOoO o00ooooo2 = new o00oOOoO(str, resultReceiver);
        this.f3511o00oo0o = o00oo00o;
        o00oo0OO(str, o00ooooo2);
        this.f3511o00oo0o = null;
        if (!o00ooooo2.o00oOooO()) {
            throw new IllegalStateException(o00oOoOo.o00oo.o00oOOo0("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }

    public void o00ooO00(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f3514o0O0o != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f3514o0O0o = token;
        this.f3509o00oo0O0.o00oOooO(token);
    }

    public void o0O0o(String str, Bundle bundle, o00oo00O o00oo00o, ResultReceiver resultReceiver) {
        o00oOo00 o00ooo002 = new o00oOo00(str, resultReceiver);
        this.f3511o00oo0o = o00oo00o;
        o00oo0O0(str, bundle, o00ooo002);
        this.f3511o00oo0o = null;
        if (!o00ooo002.o00oOooO()) {
            throw new IllegalStateException(o00oOoOo.o00oo.o00oOOo0("onSearch must call detach() or sendResult() before returning for query=", str));
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f3509o00oo0O0.o00oOoO0(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        o0O0o o0o0o = new o0O0o();
        this.f3509o00oo0O0 = o0o0o;
        o0o0o.o00oOOo0();
    }
}
