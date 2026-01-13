package o0Oo0ooo;

import com.google.common.net.HttpHeaders;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o00ooOO0.o0O000O;
import o0Oo.o0;
import o0Oo.o0O00000;
import o0Oo.o0O0000O;
import o0Oo.o0O00O;
import o0Oo0Oo.oO00000;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O;
import o0Oo0Oo0.o0O00o00;
import o0Oo0Oo0.o0O00oO0;
import o0Oo0Oo0.o0O0oo00;
import o0Oo0Oo0.o0OO0;
import o0Oo0Oo0.o0OO000o;
import o0Oo0Oo0.o0OO00o;
import o0Oo0Oo0.oo0ooO;
import o0Oo0Ooo.oO0Oo;
import o0Oo0ooo.oO000O0;
/* loaded from: classes3.dex */
public final class oO0000o0 implements o0OO00o, oO000O0.o00oOOo0 {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final long f16700o00oo = 60000;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final List<o0O> f16701o00oo0oO = Collections.singletonList(o0O.HTTP_1_1);

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final /* synthetic */ boolean f16702o00ooO00 = false;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final long f16703o0O0o = 16777216;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0OO000o f16704o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0OO0 f16705o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Random f16706o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o0O00o00 f16707o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final Runnable f16708o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public oO000O0O f16709o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public oO000O0 f16710o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public ScheduledExecutorService f16711o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public o00oo0 f16712o00oOoOo;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final String f16714o00oOooO;

    /* renamed from: o00oo0  reason: collision with root package name */
    public boolean f16716o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public long f16717o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public String f16718o00oo0O;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public ScheduledFuture<?> f16720o00oo0OO;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f16721o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f16722o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f16723o00oo0o0;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public final ArrayDeque<o0O0000O> f16713o00oOoo0 = new ArrayDeque<>();

    /* renamed from: o00oOooo  reason: collision with root package name */
    public final ArrayDeque<Object> f16715o00oOooo = new ArrayDeque<>();

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f16719o00oo0O0 = -1;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                try {
                } catch (IOException e) {
                    oO0000o0.this.o00oo0OO(e, null);
                    return;
                }
            } while (oO0000o0.this.o00ooO0());
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO implements o0O00oO0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0OO000o f16725o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ int f16726o00oOOoO;

        public o00oOOoO(o0OO000o o0oo000o, int i) {
            this.f16725o00oOOo0 = o0oo000o;
            this.f16726o00oOOoO = i;
        }

        @Override // o0Oo0Oo0.o0O00oO0
        public void o00oOOo0(o0O00o00 o0o00o00, oo0ooO oo0ooo) {
            try {
                oO0000o0.this.o00oOooo(oo0ooo);
                oO0Oo o00oo0OO2 = oO00000.f15748o00oOOo0.o00oo0OO(o0o00o00);
                o00oo0OO2.o00oOoOo();
                o00oo0 o00oo0o02 = o00oo0OO2.o00oOooO().o00oo0o0(o00oo0OO2);
                try {
                    oO0000o0 oo0000o0 = oO0000o0.this;
                    oo0000o0.f16705o00oOOoO.o00oOo0o(oo0000o0, oo0ooo);
                    oO0000o0.this.o00oo0O0("OkHttp WebSocket " + this.f16725o00oOOo0.f16086o00oOOo0.o00oooO(), this.f16726o00oOOoO, o00oo0o02);
                    o00oo0OO2.o00oOooO().f16298o00oOo0O.setSoTimeout(0);
                    oO0000o0.this.o00oo0O();
                } catch (Exception e) {
                    oO0000o0.this.o00oo0OO(e, null);
                }
            } catch (ProtocolException e2) {
                oO0000o0.this.o00oo0OO(e2, oo0ooo);
                oO0000O.o00oOo00(oo0ooo);
            }
        }

        @Override // o0Oo0Oo0.o0O00oO0
        public void o00oOOoO(o0O00o00 o0o00o00, IOException iOException) {
            oO0000o0.this.o00oo0OO(iOException, null);
        }
    }

    /* loaded from: classes3.dex */
    public final class o00oOo00 implements Runnable {
        public o00oOo00() {
        }

        @Override // java.lang.Runnable
        public void run() {
            oO0000o0.this.cancel();
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f16729o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o0O0000O f16730o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final long f16731o00oOo00;

        public o00oOo0O(int i, o0O0000O o0o0000o, long j) {
            this.f16729o00oOOo0 = i;
            this.f16730o00oOOoO = o0o0000o;
            this.f16731o00oOo00 = j;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f16732o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o0O0000O f16733o00oOOoO;

        public o00oOoO(int i, o0O0000O o0o0000o) {
            this.f16732o00oOOo0 = i;
            this.f16733o00oOOoO = o0o0000o;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class o00oo0 implements Closeable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final o0O00000 f16734o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final boolean f16735o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final o0 f16736o00oo0Oo;

        public o00oo0(boolean z, o0O00000 o0o00000, o0 o0Var) {
            this.f16735o00oo0O0 = z;
            this.f16734o00oo0O = o0o00000;
            this.f16736o00oo0Oo = o0Var;
        }
    }

    /* loaded from: classes3.dex */
    public final class o00oo00O implements Runnable {
        public o00oo00O() {
        }

        @Override // java.lang.Runnable
        public void run() {
            oO0000o0.this.o00ooO0O();
        }
    }

    public oO0000o0(o0OO000o o0oo000o, o0OO0 o0oo0, Random random) {
        if (!o00oo0o0.o00oo0.f7537o00oOoOO.equals(o0oo000o.f16087o00oOOoO)) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Request must be GET: ");
            o00oOOo02.append(o0oo000o.f16087o00oOOoO);
            throw new IllegalArgumentException(o00oOOo02.toString());
        }
        this.f16704o00oOOo0 = o0oo000o;
        this.f16705o00oOOoO = o0oo0;
        this.f16706o00oOo00 = random;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f16714o00oOooO = o0O0000O.of(bArr).base64();
        this.f16708o00oOo0o = new o00oOOo0();
    }

    @Override // o0Oo0Oo0.o0OO00o
    public void cancel() {
        this.f16707o00oOo0O.cancel();
    }

    @Override // o0Oo0Oo0.o0OO00o
    public o0OO000o o00oOOo0() {
        return this.f16704o00oOOo0;
    }

    @Override // o0Oo0Oo0.o0OO00o
    public boolean o00oOOoO(String str) {
        if (str != null) {
            return o00oo(o0O0000O.encodeUtf8(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    @Override // o0Oo0ooo.oO000O0.o00oOOo0
    public void o00oOo00(String str) throws IOException {
        this.f16705o00oOOoO.o00oOooO(this, str);
    }

    @Override // o0Oo0Oo0.o0OO00o
    public boolean o00oOo0O(o0O0000O o0o0000o) {
        if (o0o0000o != null) {
            return o00oo(o0o0000o, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    @Override // o0Oo0Oo0.o0OO00o
    public synchronized long o00oOo0o() {
        return this.f16717o00oo00O;
    }

    @Override // o0Oo0ooo.oO000O0.o00oOOo0
    public synchronized void o00oOoO(o0O0000O o0o0000o) {
        if (!this.f16721o00oo0Oo && (!this.f16716o00oo0 || !this.f16715o00oOooo.isEmpty())) {
            this.f16713o00oOoo0.add(o0o0000o);
            o0O0o();
            this.f16723o00oo0o0++;
        }
    }

    @Override // o0Oo0Oo0.o0OO00o
    public boolean o00oOoO0(int i, String str) {
        return o00oo00O(i, str, 60000L);
    }

    @Override // o0Oo0ooo.oO000O0.o00oOOo0
    public void o00oOoOO(o0O0000O o0o0000o) throws IOException {
        this.f16705o00oOOoO.o00oOo0O(this, o0o0000o);
    }

    @Override // o0Oo0ooo.oO000O0.o00oOOo0
    public void o00oOoOo(int i, String str) {
        o00oo0 o00oo0Var;
        if (i == -1) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            if (this.f16719o00oo0O0 != -1) {
                throw new IllegalStateException("already closed");
            }
            this.f16719o00oo0O0 = i;
            this.f16718o00oo0O = str;
            o00oo0Var = null;
            if (this.f16716o00oo0 && this.f16715o00oOooo.isEmpty()) {
                o00oo0 o00oo0Var2 = this.f16712o00oOoOo;
                this.f16712o00oOoOo = null;
                ScheduledFuture<?> scheduledFuture = this.f16720o00oo0OO;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f16711o00oOoOO.shutdown();
                o00oo0Var = o00oo0Var2;
            }
        }
        try {
            this.f16705o00oOOoO.o00oOOoO(this, i, str);
            if (o00oo0Var != null) {
                this.f16705o00oOOoO.o00oOOo0(this, i, str);
            }
        } finally {
            oO0000O.o00oOo00(o00oo0Var);
        }
    }

    public void o00oOoo0(int i, TimeUnit timeUnit) throws InterruptedException {
        this.f16711o00oOoOO.awaitTermination(i, timeUnit);
    }

    @Override // o0Oo0ooo.oO000O0.o00oOOo0
    public synchronized void o00oOooO(o0O0000O o0o0000o) {
        this.f16722o00oo0o++;
    }

    public void o00oOooo(oo0ooO oo0ooo) throws ProtocolException {
        if (oo0ooo.f16171o00oo0Oo != 101) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Expected HTTP 101 response but was '");
            o00oOOo02.append(oo0ooo.f16171o00oo0Oo);
            o00oOOo02.append(" ");
            throw new ProtocolException(android.support.v4.media.o00oOOoO.o00oOOo0(o00oOOo02, oo0ooo.f16173o00oo0o0, "'"));
        }
        String o00oOooo2 = oo0ooo.o00oOooo("Connection", null);
        if (!HttpHeaders.UPGRADE.equalsIgnoreCase(o00oOooo2)) {
            throw new ProtocolException(android.support.v4.media.o00oOoO.o00oOOo0("Expected 'Connection' header value 'Upgrade' but was '", o00oOooo2, "'"));
        }
        String o00oOooo3 = oo0ooo.o00oOooo(HttpHeaders.UPGRADE, null);
        if (!"websocket".equalsIgnoreCase(o00oOooo3)) {
            throw new ProtocolException(android.support.v4.media.o00oOoO.o00oOOo0("Expected 'Upgrade' header value 'websocket' but was '", o00oOooo3, "'"));
        }
        String o00oOooo4 = oo0ooo.o00oOooo(HttpHeaders.SEC_WEBSOCKET_ACCEPT, null);
        String base64 = o0O0000O.encodeUtf8(this.f16714o00oOooO + oO000.f16676o00oOOo0).sha1().base64();
        if (!base64.equals(o00oOooo4)) {
            throw new ProtocolException(o0O000O.o00oOOo0("Expected 'Sec-WebSocket-Accept' header value '", base64, "' but was '", o00oOooo4, "'"));
        }
    }

    public final synchronized boolean o00oo(o0O0000O o0o0000o, int i) {
        if (!this.f16721o00oo0Oo && !this.f16716o00oo0) {
            if (this.f16717o00oo00O + o0o0000o.size() > f16703o0O0o) {
                o00oOoO0(1001, null);
                return false;
            }
            this.f16717o00oo00O += o0o0000o.size();
            this.f16715o00oOooo.add(new o00oOoO(i, o0o0000o));
            o0O0o();
            return true;
        }
        return false;
    }

    public void o00oo0(o0O0oo00 o0o0oo00) {
        o0O0oo00.o00oOOoO o0O0o2 = o0o0oo00.o00oo().o0O0o(f16701o00oo0oO);
        o0O0o2.getClass();
        o0O0oo00 o0o0oo002 = new o0O0oo00(o0O0o2);
        int i = o0o0oo002.f15934o00oooOo;
        o0OO000o o0oo000o = this.f16704o00oOOo0;
        o0oo000o.getClass();
        o0OO000o.o00oOOo0 o00oooo02 = new o0OO000o.o00oOOo0(o0oo000o);
        o00oooo02.f16094o00oOo00.o00oOoOO(HttpHeaders.UPGRADE, "websocket");
        o00oooo02.f16094o00oOo00.o00oOoOO("Connection", HttpHeaders.UPGRADE);
        o00oooo02.f16094o00oOo00.o00oOoOO(HttpHeaders.SEC_WEBSOCKET_KEY, this.f16714o00oOooO);
        o00oooo02.f16094o00oOo00.o00oOoOO(HttpHeaders.SEC_WEBSOCKET_VERSION, "13");
        o0OO000o o00oOOoO2 = o00oooo02.o00oOOoO();
        o0O00o00 o00oOoo02 = oO00000.f15748o00oOOo0.o00oOoo0(o0o0oo002, o00oOOoO2);
        this.f16707o00oOo0O = o00oOoo02;
        o00oOoo02.o00oOoO(new o00oOOoO(o00oOOoO2, i));
    }

    public synchronized boolean o00oo00O(int i, String str, long j) {
        oO000.o00oOooO(i);
        o0O0000O o0o0000o = null;
        if (str != null) {
            o0o0000o = o0O0000O.encodeUtf8(str);
            if (o0o0000o.size() > 123) {
                throw new IllegalArgumentException("reason.size() > 123: " + str);
            }
        }
        if (!this.f16721o00oo0Oo && !this.f16716o00oo0) {
            this.f16716o00oo0 = true;
            this.f16715o00oOooo.add(new o00oOo0O(i, o0o0000o, j));
            o0O0o();
            return true;
        }
        return false;
    }

    public void o00oo0O() throws IOException {
        while (this.f16719o00oo0O0 == -1) {
            this.f16710o00oOoO0.o00oOOo0();
        }
    }

    public void o00oo0O0(String str, long j, o00oo0 o00oo0Var) throws IOException {
        synchronized (this) {
            this.f16712o00oOoOo = o00oo0Var;
            this.f16709o00oOoO = new oO000O0O(o00oo0Var.f16735o00oo0O0, o00oo0Var.f16736o00oo0Oo, this.f16706o00oOo00);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, oO0000O.o00ooO0(str, false));
            this.f16711o00oOoOO = scheduledThreadPoolExecutor;
            if (j != 0) {
                scheduledThreadPoolExecutor.scheduleAtFixedRate(new o00oo00O(), j, j, TimeUnit.MILLISECONDS);
            }
            if (!this.f16715o00oOooo.isEmpty()) {
                o0O0o();
            }
        }
        this.f16710o00oOoO0 = new oO000O0(o00oo0Var.f16735o00oo0O0, o00oo0Var.f16734o00oo0O, this);
    }

    public void o00oo0OO(Exception exc, oo0ooO oo0ooo) {
        synchronized (this) {
            if (this.f16721o00oo0Oo) {
                return;
            }
            this.f16721o00oo0Oo = true;
            o00oo0 o00oo0Var = this.f16712o00oOoOo;
            this.f16712o00oOoOo = null;
            ScheduledFuture<?> scheduledFuture = this.f16720o00oo0OO;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledExecutorService scheduledExecutorService = this.f16711o00oOoOO;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            try {
                this.f16705o00oOOoO.o00oOo00(this, exc, oo0ooo);
            } finally {
                oO0000O.o00oOo00(o00oo0Var);
            }
        }
    }

    public synchronized int o00oo0Oo() {
        return this.f16723o00oo0o0;
    }

    public synchronized int o00oo0o() {
        return this.f16722o00oo0o;
    }

    public synchronized boolean o00oo0o0(o0O0000O o0o0000o) {
        boolean z;
        if (!this.f16721o00oo0Oo && (!this.f16716o00oo0 || !this.f16715o00oOooo.isEmpty())) {
            this.f16713o00oOoo0.add(o0o0000o);
            o0O0o();
            z = true;
        }
        z = false;
        return z;
    }

    public boolean o00oo0oO() throws IOException {
        try {
            this.f16710o00oOoO0.o00oOOo0();
            return this.f16719o00oo0O0 == -1;
        } catch (Exception e) {
            o00oo0OO(e, null);
            return false;
        }
    }

    public boolean o00ooO0() throws IOException {
        o00oo0 o00oo0Var;
        String str;
        synchronized (this) {
            if (this.f16721o00oo0Oo) {
                return false;
            }
            oO000O0O oo000o0o = this.f16709o00oOoO;
            o0O0000O poll = this.f16713o00oOoo0.poll();
            int i = -1;
            o00oOoO o00oooo2 = null;
            if (poll == null) {
                Object poll2 = this.f16715o00oOooo.poll();
                if (poll2 instanceof o00oOo0O) {
                    int i2 = this.f16719o00oo0O0;
                    str = this.f16718o00oo0O;
                    if (i2 != -1) {
                        o00oo0 o00oo0Var2 = this.f16712o00oOoOo;
                        this.f16712o00oOoOo = null;
                        this.f16711o00oOoOO.shutdown();
                        o00oooo2 = poll2;
                        i = i2;
                        o00oo0Var = o00oo0Var2;
                    } else {
                        this.f16720o00oo0OO = this.f16711o00oOoOO.schedule(new o00oOo00(), ((o00oOo0O) poll2).f16731o00oOo00, TimeUnit.MILLISECONDS);
                        i = i2;
                        o00oo0Var = null;
                    }
                } else if (poll2 == null) {
                    return false;
                } else {
                    o00oo0Var = null;
                    str = null;
                }
                o00oooo2 = poll2;
            } else {
                o00oo0Var = null;
                str = null;
            }
            try {
                if (poll != null) {
                    oo000o0o.o00oOo0o(poll);
                } else if (o00oooo2 instanceof o00oOoO) {
                    o0O0000O o0o0000o = o00oooo2.f16733o00oOOoO;
                    o0 o00oOo002 = o0O00O.o00oOo00(oo000o0o.o00oOOo0(o00oooo2.f16732o00oOOo0, o0o0000o.size()));
                    o00oOo002.o0O0OO0O(o0o0000o);
                    o00oOo002.close();
                    synchronized (this) {
                        this.f16717o00oo00O -= o0o0000o.size();
                    }
                } else if (!(o00oooo2 instanceof o00oOo0O)) {
                    throw new AssertionError();
                } else {
                    o00oOo0O o00ooo0o2 = (o00oOo0O) o00oooo2;
                    oo000o0o.o00oOOoO(o00ooo0o2.f16729o00oOOo0, o00ooo0o2.f16730o00oOOoO);
                    if (o00oo0Var != null) {
                        this.f16705o00oOOoO.o00oOOo0(this, i, str);
                    }
                }
                return true;
            } finally {
                oO0000O.o00oOo00(o00oo0Var);
            }
        }
    }

    public void o00ooO00() throws InterruptedException {
        ScheduledFuture<?> scheduledFuture = this.f16720o00oo0OO;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f16711o00oOoOO.shutdown();
        this.f16711o00oOoOO.awaitTermination(10L, TimeUnit.SECONDS);
    }

    public void o00ooO0O() {
        synchronized (this) {
            if (this.f16721o00oo0Oo) {
                return;
            }
            oO000O0O oo000o0o = this.f16709o00oOoO;
            try {
                oo000o0o.o00oOo0O(o0O0000O.EMPTY);
            } catch (IOException e) {
                o00oo0OO(e, null);
            }
        }
    }

    public final void o0O0o() {
        ScheduledExecutorService scheduledExecutorService = this.f16711o00oOoOO;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.f16708o00oOo0o);
        }
    }
}
