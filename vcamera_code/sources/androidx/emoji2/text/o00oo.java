package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.emoji2.text.o00oo;
import androidx.emoji2.text.o00oo00O;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
import o00oooOo.oOOO000;
import o00oooOo.oOOO0O0;
import o0O000.o0O00OOO;
import o0O000O.o00oo0OO;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public class o00oo extends o00oo00O.o00oOo0O {

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final o00oOOoO f2660o00oOoOo = new o00oOOoO();

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final long f2661o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public long f2662o00oOOoO;

        public o00oOOo0(long j) {
            this.f2661o00oOOo0 = j;
        }

        @Override // androidx.emoji2.text.o00oo.o00oOo0O
        public long o00oOOo0() {
            if (this.f2662o00oOOoO == 0) {
                this.f2662o00oOOoO = SystemClock.uptimeMillis();
                return 0L;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.f2662o00oOOoO;
            if (uptimeMillis > this.f2661o00oOOo0) {
                return -1L;
            }
            return Math.min(Math.max(uptimeMillis, 1000L), this.f2661o00oOOo0 - uptimeMillis);
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0OO00OO
        public Typeface o00oOOo0(@oo0oO0 Context context, @oo0oO0 o00oo0OO.o00oOo00 o00ooo002) throws PackageManager.NameNotFoundException {
            return oOOO000.o00oOooO(context, null, new o00oo0OO.o00oOo00[]{o00ooo002}, 0);
        }

        @oo0oO0
        public o00oo0OO.o00oOOoO o00oOOoO(@oo0oO0 Context context, @oo0oO0 o0O000O.o00oo00O o00oo00o) throws PackageManager.NameNotFoundException {
            return o0O000O.o00oOoO.o00oOo0O(context, o00oo00o, null);
        }

        public void o00oOo00(@oo0oO0 Context context, @oo0oO0 Uri uri, @oo0oO0 ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void o00oOooO(@oo0oO0 Context context, @oo0oO0 ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 implements o00oo00O.o00oo0O0 {

        /* renamed from: o00oOooo  reason: collision with root package name */
        public static final String f2663o00oOooo = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Context f2664o00oOOo0;
        @oo0oO0

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o0O000O.o00oo00O f2665o00oOOoO;
        @oo0oO0

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final o00oOOoO f2666o00oOo00;
        @o0O0OOOo("mLock")
        @o0OO00OO

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public Handler f2667o00oOo0O;
        @o0O0OOOo("mLock")
        @o0OO00OO

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public Executor f2668o00oOo0o;
        @o0O0OOOo("mLock")
        @o0OO00OO

        /* renamed from: o00oOoO  reason: collision with root package name */
        public o00oOo0O f2669o00oOoO;
        @o0O0OOOo("mLock")
        @o0OO00OO

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public ThreadPoolExecutor f2670o00oOoO0;
        @o0O0OOOo("mLock")
        @o0OO00OO

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public o00oo00O.o00oo0O f2671o00oOoOO;
        @o0O0OOOo("mLock")
        @o0OO00OO

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public ContentObserver f2672o00oOoOo;
        @o0O0OOOo("mLock")
        @o0OO00OO

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public Runnable f2673o00oOoo0;
        @oo0oO0

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final Object f2674o00oOooO = new Object();

        /* loaded from: classes.dex */
        public class o00oOOo0 extends ContentObserver {
            public o00oOOo0(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                o00oOo00.this.o00oOooO();
            }
        }

        public o00oOo00(@oo0oO0 Context context, @oo0oO0 o0O000O.o00oo00O o00oo00o, @oo0oO0 o00oOOoO o00ooooo2) {
            ooOOOOoo.o00oo00O(context, "Context cannot be null");
            ooOOOOoo.o00oo00O(o00oo00o, "FontRequest cannot be null");
            this.f2664o00oOOo0 = context.getApplicationContext();
            this.f2665o00oOOoO = o00oo00o;
            this.f2666o00oOo00 = o00ooooo2;
        }

        @Override // androidx.emoji2.text.o00oo00O.o00oo0O0
        @o0OOooO0(19)
        public void o00oOOo0(@oo0oO0 o00oo00O.o00oo0O o00oo0o2) {
            ooOOOOoo.o00oo00O(o00oo0o2, "LoaderCallback cannot be null");
            synchronized (this.f2674o00oOooO) {
                this.f2671o00oOoOO = o00oo0o2;
            }
            o00oOooO();
        }

        public final void o00oOOoO() {
            synchronized (this.f2674o00oOooO) {
                this.f2671o00oOoOO = null;
                ContentObserver contentObserver = this.f2672o00oOoOo;
                if (contentObserver != null) {
                    this.f2666o00oOo00.o00oOooO(this.f2664o00oOOo0, contentObserver);
                    this.f2672o00oOoOo = null;
                }
                Handler handler = this.f2667o00oOo0O;
                if (handler != null) {
                    handler.removeCallbacks(this.f2673o00oOoo0);
                }
                this.f2667o00oOo0O = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2670o00oOoO0;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2668o00oOo0o = null;
                this.f2670o00oOoO0 = null;
            }
        }

        @o0OOooO0(19)
        @oO0Oo
        public void o00oOo00() {
            synchronized (this.f2674o00oOooO) {
                if (this.f2671o00oOoOO == null) {
                    return;
                }
                try {
                    o00oo0OO.o00oOo00 o00oOo0O2 = o00oOo0O();
                    int o00oOOoO2 = o00oOo0O2.o00oOOoO();
                    if (o00oOOoO2 == 2) {
                        synchronized (this.f2674o00oOooO) {
                            o00oOo0O o00ooo0o2 = this.f2669o00oOoO;
                            if (o00ooo0o2 != null) {
                                long o00oOOo02 = o00ooo0o2.o00oOOo0();
                                if (o00oOOo02 >= 0) {
                                    o00oOo0o(o00oOo0O2.o00oOooO(), o00oOOo02);
                                    return;
                                }
                            }
                        }
                    }
                    if (o00oOOoO2 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + o00oOOoO2 + ")");
                    }
                    o0O00OOO.o00oOOoO(f2663o00oOooo);
                    Typeface o00oOOo03 = this.f2666o00oOo00.o00oOOo0(this.f2664o00oOOo0, o00oOo0O2);
                    ByteBuffer o00oOo0o2 = oOOO0O0.o00oOo0o(this.f2664o00oOOo0, null, o00oOo0O2.o00oOooO());
                    if (o00oOo0o2 == null || o00oOOo03 == null) {
                        throw new RuntimeException("Unable to open file.");
                    }
                    o0O00000 o00oOo0O3 = o0O00000.o00oOo0O(o00oOOo03, o00oOo0o2);
                    o0O00OOO.o00oOOo0.o00oOOoO();
                    synchronized (this.f2674o00oOooO) {
                        o00oo00O.o00oo0O o00oo0o2 = this.f2671o00oOoOO;
                        if (o00oo0o2 != null) {
                            o00oo0o2.o00oOOoO(o00oOo0O3);
                        }
                    }
                    o00oOOoO();
                } catch (Throwable th) {
                    synchronized (this.f2674o00oOooO) {
                        o00oo00O.o00oo0O o00oo0o3 = this.f2671o00oOoOO;
                        if (o00oo0o3 != null) {
                            o00oo0o3.o00oOOo0(th);
                        }
                        o00oOOoO();
                    }
                }
            }
        }

        @oO0Oo
        public final o00oo0OO.o00oOo00 o00oOo0O() {
            try {
                o00oo0OO.o00oOOoO o00oOOoO2 = this.f2666o00oOo00.o00oOOoO(this.f2664o00oOOo0, this.f2665o00oOOoO);
                if (o00oOOoO2.o00oOo00() != 0) {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("fetchFonts failed (");
                    o00oOOo02.append(o00oOOoO2.o00oOo00());
                    o00oOOo02.append(")");
                    throw new RuntimeException(o00oOOo02.toString());
                }
                o00oo0OO.o00oOo00[] o00oOOoO3 = o00oOOoO2.o00oOOoO();
                if (o00oOOoO3 == null || o00oOOoO3.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return o00oOOoO3[0];
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        @o0OOooO0(19)
        @oO0Oo
        public final void o00oOo0o(Uri uri, long j) {
            synchronized (this.f2674o00oOooO) {
                Handler handler = this.f2667o00oOo0O;
                if (handler == null) {
                    handler = androidx.emoji2.text.o00oOo00.o00oOo0O();
                    this.f2667o00oOo0O = handler;
                }
                if (this.f2672o00oOoOo == null) {
                    o00oOOo0 o00oooo02 = new o00oOOo0(handler);
                    this.f2672o00oOoOo = o00oooo02;
                    this.f2666o00oOo00.o00oOo00(this.f2664o00oOOo0, uri, o00oooo02);
                }
                if (this.f2673o00oOoo0 == null) {
                    this.f2673o00oOoo0 = new Runnable() { // from class: androidx.emoji2.text.o00ooO
                        @Override // java.lang.Runnable
                        public final void run() {
                            o00oo.o00oOo00.this.o00oOooO();
                        }
                    };
                }
                handler.postDelayed(this.f2673o00oOoo0, j);
            }
        }

        public void o00oOoO(@o0OO00OO o00oOo0O o00ooo0o2) {
            synchronized (this.f2674o00oOooO) {
                this.f2669o00oOoO = o00ooo0o2;
            }
        }

        public void o00oOoO0(@oo0oO0 Executor executor) {
            synchronized (this.f2674o00oOooO) {
                this.f2668o00oOo0o = executor;
            }
        }

        @o0OOooO0(19)
        public void o00oOooO() {
            synchronized (this.f2674o00oOooO) {
                if (this.f2671o00oOoOO == null) {
                    return;
                }
                if (this.f2668o00oOo0o == null) {
                    ThreadPoolExecutor o00oOo002 = androidx.emoji2.text.o00oOo00.o00oOo00("emojiCompat");
                    this.f2670o00oOoO0 = o00oOo002;
                    this.f2668o00oOo0o = o00oOo002;
                }
                this.f2668o00oOo0o.execute(new Runnable() { // from class: androidx.emoji2.text.o00ooO0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00oo.o00oOo00.this.o00oOo00();
                    }
                });
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOo0O {
        public abstract long o00oOOo0();
    }

    public o00oo(@oo0oO0 Context context, @oo0oO0 o0O000O.o00oo00O o00oo00o) {
        super(new o00oOo00(context, o00oo00o, f2660o00oOoOo));
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public o00oo(@oo0oO0 Context context, @oo0oO0 o0O000O.o00oo00O o00oo00o, @oo0oO0 o00oOOoO o00ooooo2) {
        super(new o00oOo00(context, o00oo00o, o00ooooo2));
    }

    @oo0oO0
    @Deprecated
    public o00oo o00oOoo0(@o0OO00OO Handler handler) {
        if (handler == null) {
            return this;
        }
        o00oOooo(androidx.emoji2.text.o00oOo00.o00oOOoO(handler));
        return this;
    }

    @oo0oO0
    public o00oo o00oOooo(@oo0oO0 Executor executor) {
        ((o00oOo00) o00oOOo0()).o00oOoO0(executor);
        return this;
    }

    @oo0oO0
    public o00oo o00oo00O(@o0OO00OO o00oOo0O o00ooo0o2) {
        ((o00oOo00) o00oOOo0()).o00oOoO(o00ooo0o2);
        return this;
    }
}
