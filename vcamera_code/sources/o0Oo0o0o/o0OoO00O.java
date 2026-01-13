package o0Oo0o0o;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0Oo.o0;
import o0Oo.o00ooO;
import o0Oo.o0O00000;
import o0Oo.o0O0000O;
import o0Oo0Oo.oO00000o;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O;
import o0Oo0o0o.o0O00O0o;
import o0Oo0oO.oO0Ooooo;
/* loaded from: classes3.dex */
public final class o0OoO00O implements Closeable {

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f16531o00ooo0 = 16777216;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final ExecutorService f16532o00ooo00 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), oO0000O.o00ooO0("OkHttp Http2Connection", true));

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final /* synthetic */ boolean f16533o00ooo0O = false;

    /* renamed from: o00oo  reason: collision with root package name */
    public final ExecutorService f16534o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oo0O0 f16535o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final boolean f16536o00oo0O0;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f16538o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final String f16539o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f16540o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public long f16541o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public final o0O00o00 f16542o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public Map<Integer, o0oO0Ooo> f16543o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f16544o00ooO0O;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public final o0O00oO0 f16546o00ooOO;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public boolean f16548o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public final o0O00OO f16549o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public final Socket f16550o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public final o00oo0O f16551o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public final Set<Integer> f16552o00ooOoo;

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f16553o0O0o;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Map<Integer, o0O00O> f16537o00oo0Oo = new LinkedHashMap();

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public long f16545o00ooO0o = 0;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public o0O00oO0 f16547o00ooOO0 = new o0O00oO0();

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends oO00000o {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ int f16554o00oo0O;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o0OoOoOo f16555o00oo0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(String str, Object[] objArr, int i, o0OoOoOo o0oooooo) {
            super(str, objArr);
            this.f16554o00oo0O = i;
            this.f16555o00oo0Oo = o0oooooo;
        }

        @Override // o0Oo0Oo.oO00000o
        public void o00oOooo() {
            try {
                o0OoO00O.this.o0O0o00o(this.f16554o00oo0O, this.f16555o00oo0Oo);
            } catch (IOException unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO extends oO00000o {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ int f16557o00oo0O;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ long f16558o00oo0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f16557o00oo0O = i;
            this.f16558o00oo0Oo = j;
        }

        @Override // o0Oo0Oo.oO00000o
        public void o00oOooo() {
            try {
                o0OoO00O.this.f16549o00ooOo.o0O000(this.f16557o00oo0O, this.f16558o00oo0Oo);
            } catch (IOException unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 extends oO00000o {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ boolean f16560o00oo0O;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ int f16561o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public final /* synthetic */ o0oO0Ooo f16562o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ int f16563o00oo0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(String str, Object[] objArr, boolean z, int i, int i2, o0oO0Ooo o0oo0ooo) {
            super(str, objArr);
            this.f16560o00oo0O = z;
            this.f16561o00oo0Oo = i;
            this.f16563o00oo0o0 = i2;
            this.f16562o00oo0o = o0oo0ooo;
        }

        @Override // o0Oo0Oo.oO00000o
        public void o00oOooo() {
            try {
                o0OoO00O.this.o0O0OO0(this.f16560o00oo0O, this.f16561o00oo0Oo, this.f16563o00oo0o0, this.f16562o00oo0o);
            } catch (IOException unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo0O extends oO00000o {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ int f16565o00oo0O;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ List f16566o00oo0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo0O(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f16565o00oo0O = i;
            this.f16566o00oo0Oo = list;
        }

        @Override // o0Oo0Oo.oO00000o
        public void o00oOooo() {
            if (o0OoO00O.this.f16542o00ooO0.o00oOOoO(this.f16565o00oo0O, this.f16566o00oo0Oo)) {
                try {
                    o0OoO00O.this.f16549o00ooOo.o00ooO0O(this.f16565o00oo0O, o0OoOoOo.CANCEL);
                    synchronized (o0OoO00O.this) {
                        o0OoO00O.this.f16552o00ooOoo.remove(Integer.valueOf(this.f16565o00oo0O));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOoO extends oO00000o {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ int f16568o00oo0O;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ List f16569o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ boolean f16571o00oo0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOoO(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f16568o00oo0O = i;
            this.f16569o00oo0Oo = list;
            this.f16571o00oo0o0 = z;
        }

        @Override // o0Oo0Oo.oO00000o
        public void o00oOooo() {
            boolean o00oOo002 = o0OoO00O.this.f16542o00ooO0.o00oOo00(this.f16568o00oo0O, this.f16569o00oo0Oo, this.f16571o00oo0o0);
            if (o00oOo002) {
                try {
                    o0OoO00O.this.f16549o00ooOo.o00ooO0O(this.f16568o00oo0O, o0OoOoOo.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (o00oOo002 || this.f16571o00oo0o0) {
                synchronized (o0OoO00O.this) {
                    o0OoO00O.this.f16552o00ooOoo.remove(Integer.valueOf(this.f16568o00oo0O));
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0 extends oO00000o {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ int f16572o00oo0O;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o0OoOoOo f16573o00oo0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo0(String str, Object[] objArr, int i, o0OoOoOo o0oooooo) {
            super(str, objArr);
            this.f16572o00oo0O = i;
            this.f16573o00oo0Oo = o0oooooo;
        }

        @Override // o0Oo0Oo.oO00000o
        public void o00oOooo() {
            o0OoO00O.this.f16542o00ooO0.o00oOOo0(this.f16572o00oo0O, this.f16573o00oo0Oo);
            synchronized (o0OoO00O.this) {
                o0OoO00O.this.f16552o00ooOoo.remove(Integer.valueOf(this.f16572o00oo0O));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo00O extends oO00000o {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ int f16575o00oo0O;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o00ooO f16576o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public final /* synthetic */ boolean f16577o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ int f16578o00oo0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo00O(String str, Object[] objArr, int i, o00ooO o00ooo, int i2, boolean z) {
            super(str, objArr);
            this.f16575o00oo0O = i;
            this.f16576o00oo0Oo = o00ooo;
            this.f16578o00oo0o0 = i2;
            this.f16577o00oo0o = z;
        }

        @Override // o0Oo0Oo.oO00000o
        public void o00oOooo() {
            try {
                boolean o00oOooO2 = o0OoO00O.this.f16542o00ooO0.o00oOooO(this.f16575o00oo0O, this.f16576o00oo0Oo, this.f16578o00oo0o0, this.f16577o00oo0o);
                if (o00oOooO2) {
                    o0OoO00O.this.f16549o00ooOo.o00ooO0O(this.f16575o00oo0O, o0OoOoOo.CANCEL);
                }
                if (o00oOooO2 || this.f16577o00oo0o) {
                    synchronized (o0OoO00O.this) {
                        o0OoO00O.this.f16552o00ooOoo.remove(Integer.valueOf(this.f16575o00oo0O));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0O extends oO00000o implements o0O00O0o.o00oOOoO {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final o0O00O0o f16580o00oo0O;

        /* loaded from: classes3.dex */
        public class o00oOOo0 extends oO00000o {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ o0O00O f16582o00oo0O;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOOo0(String str, Object[] objArr, o0O00O o0o00o) {
                super(str, objArr);
                this.f16582o00oo0O = o0o00o;
            }

            @Override // o0Oo0Oo.oO00000o
            public void o00oOooo() {
                try {
                    o0OoO00O.this.f16535o00oo0O.o00oOo0o(this.f16582o00oo0O);
                } catch (IOException e) {
                    oO0Ooooo o00oOoO2 = oO0Ooooo.o00oOoO();
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Http2Connection.Listener failure for ");
                    o00oOOo02.append(o0OoO00O.this.f16539o00oo0o0);
                    o00oOoO2.o00oo00O(4, o00oOOo02.toString(), e);
                    try {
                        this.f16582o00oo0O.o00oOooO(o0OoOoOo.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* loaded from: classes3.dex */
        public class o00oOOoO extends oO00000o {
            public o00oOOoO(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // o0Oo0Oo.oO00000o
            public void o00oOooo() {
                o0OoO00O o0ooo00o = o0OoO00O.this;
                o0ooo00o.f16535o00oo0O.o00oOo0O(o0ooo00o);
            }
        }

        /* loaded from: classes3.dex */
        public class o00oOo00 extends oO00000o {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ o0O00oO0 f16585o00oo0O;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOo00(String str, Object[] objArr, o0O00oO0 o0o00oo0) {
                super(str, objArr);
                this.f16585o00oo0O = o0o00oo0;
            }

            @Override // o0Oo0Oo.oO00000o
            public void o00oOooo() {
                try {
                    o0OoO00O.this.f16549o00ooOo.o00oOOo0(this.f16585o00oo0O);
                } catch (IOException unused) {
                }
            }
        }

        public o00oo0O(o0O00O0o o0o00o0o) {
            super("OkHttp %s", o0OoO00O.this.f16539o00oo0o0);
            this.f16580o00oo0O = o0o00o0o;
        }

        @Override // o0Oo0o0o.o0O00O0o.o00oOOoO
        public void o00oOOo0(int i, o0OoOoOo o0oooooo) {
            if (o0OoO00O.this.o0O000(i)) {
                o0OoO00O.this.o00ooOoO(i, o0oooooo);
                return;
            }
            o0O00O o0O000o02 = o0OoO00O.this.o0O000o0(i);
            if (o0O000o02 != null) {
                o0O000o02.o00oo0o0(o0oooooo);
            }
        }

        @Override // o0Oo0o0o.o0O00O0o.o00oOOoO
        public void o00oOOoO(boolean z, int i, int i2, List<o0O000Oo> list) {
            if (o0OoO00O.this.o0O000(i)) {
                o0OoO00O.this.o00ooO0O(i, list, z);
                return;
            }
            synchronized (o0OoO00O.this) {
                o0OoO00O o0ooo00o = o0OoO00O.this;
                if (o0ooo00o.f16553o0O0o) {
                    return;
                }
                o0O00O o00oOo0o2 = o0ooo00o.o00oOo0o(i);
                if (o00oOo0o2 != null) {
                    o00oOo0o2.o00oo0Oo(list);
                    if (z) {
                        o00oOo0o2.o00oo0O();
                        return;
                    }
                    return;
                }
                o0OoO00O o0ooo00o2 = o0OoO00O.this;
                if (i <= o0ooo00o2.f16538o00oo0o) {
                    return;
                }
                if (i % 2 == o0ooo00o2.f16540o00oo0oO % 2) {
                    return;
                }
                o0O00O o0o00o = new o0O00O(i, o0OoO00O.this, false, z, list);
                o0OoO00O o0ooo00o3 = o0OoO00O.this;
                o0ooo00o3.f16538o00oo0o = i;
                o0ooo00o3.f16537o00oo0Oo.put(Integer.valueOf(i), o0o00o);
                o0OoO00O.f16532o00ooo00.execute(new o00oOOo0("OkHttp %s stream %d", new Object[]{o0OoO00O.this.f16539o00oo0o0, Integer.valueOf(i)}, o0o00o));
            }
        }

        @Override // o0Oo0o0o.o0O00O0o.o00oOOoO
        public void o00oOo00(int i, long j) {
            o0OoO00O o0ooo00o = o0OoO00O.this;
            if (i == 0) {
                synchronized (o0ooo00o) {
                    o0OoO00O o0ooo00o2 = o0OoO00O.this;
                    o0ooo00o2.f16541o00ooO += j;
                    o0ooo00o2.notifyAll();
                }
                return;
            }
            o0O00O o00oOo0o2 = o0ooo00o.o00oOo0o(i);
            if (o00oOo0o2 != null) {
                synchronized (o00oOo0o2) {
                    o00oOo0o2.o00oOOo0(j);
                }
            }
        }

        @Override // o0Oo0o0o.o0O00O0o.o00oOOoO
        public void o00oOo0O(int i, int i2, List<o0O000Oo> list) {
            o0OoO00O.this.o00ooO0o(i2, list);
        }

        @Override // o0Oo0o0o.o0O00O0o.o00oOOoO
        public void o00oOo0o(boolean z, int i, o0O00000 o0o00000, int i2) throws IOException {
            if (o0OoO00O.this.o0O000(i)) {
                o0OoO00O.this.o00ooO0(i, o0o00000, i2, z);
                return;
            }
            o0O00O o00oOo0o2 = o0OoO00O.this.o00oOo0o(i);
            if (o00oOo0o2 == null) {
                o0OoO00O.this.o0O0o0O(i, o0OoOoOo.PROTOCOL_ERROR);
                o0o00000.skip(i2);
                return;
            }
            o00oOo0o2.o00oo0O0(o0o00000, i2);
            if (z) {
                o00oOo0o2.o00oo0O();
            }
        }

        @Override // o0Oo0o0o.o0O00O0o.o00oOOoO
        public void o00oOoO(int i, o0OoOoOo o0oooooo, o0O0000O o0o0000o) {
            o0O00O[] o0o00oArr;
            o0o0000o.size();
            synchronized (o0OoO00O.this) {
                o0o00oArr = (o0O00O[]) o0OoO00O.this.f16537o00oo0Oo.values().toArray(new o0O00O[o0OoO00O.this.f16537o00oo0Oo.size()]);
                o0OoO00O.this.f16553o0O0o = true;
            }
            for (o0O00O o0o00o : o0o00oArr) {
                if (o0o00o.f16456o00oOo00 > i && o0o00o.o00oo00O()) {
                    o0o00o.o00oo0o0(o0OoOoOo.REFUSED_STREAM);
                    o0OoO00O.this.o0O000o0(o0o00o.f16456o00oOo00);
                }
            }
        }

        @Override // o0Oo0o0o.o0O00O0o.o00oOOoO
        public void o00oOoO0() {
        }

        @Override // o0Oo0o0o.o0O00O0o.o00oOOoO
        public void o00oOoOO(boolean z, int i, int i2) {
            if (!z) {
                o0OoO00O.this.o0O0Oo(true, i, i2, null);
                return;
            }
            o0oO0Ooo o0O000O2 = o0OoO00O.this.o0O000O(i);
            if (o0O000O2 != null) {
                o0O000O2.o00oOOoO();
            }
        }

        @Override // o0Oo0o0o.o0O00O0o.o00oOOoO
        public void o00oOoOo(int i, int i2, int i3, boolean z) {
        }

        @Override // o0Oo0o0o.o0O00O0o.o00oOOoO
        public void o00oOoo0(int i, String str, o0O0000O o0o0000o, String str2, int i2, long j) {
        }

        @Override // o0Oo0o0o.o0O00O0o.o00oOOoO
        public void o00oOooO(boolean z, o0O00oO0 o0o00oo0) {
            o0O00O[] o0o00oArr;
            long j;
            int i;
            synchronized (o0OoO00O.this) {
                int o00oOo0O2 = o0OoO00O.this.f16546o00ooOO.o00oOo0O();
                if (z) {
                    o0OoO00O.this.f16546o00ooOO.o00oOOo0();
                }
                o0OoO00O.this.f16546o00ooOO.o00oOoOo(o0o00oo0);
                o00oo00O(o0o00oo0);
                int o00oOo0O3 = o0OoO00O.this.f16546o00ooOO.o00oOo0O();
                o0o00oArr = null;
                if (o00oOo0O3 == -1 || o00oOo0O3 == o00oOo0O2) {
                    j = 0;
                } else {
                    j = o00oOo0O3 - o00oOo0O2;
                    o0OoO00O o0ooo00o = o0OoO00O.this;
                    if (!o0ooo00o.f16548o00ooOOo) {
                        o0ooo00o.o00oOOo0(j);
                        o0OoO00O.this.f16548o00ooOOo = true;
                    }
                    if (!o0OoO00O.this.f16537o00oo0Oo.isEmpty()) {
                        o0o00oArr = (o0O00O[]) o0OoO00O.this.f16537o00oo0Oo.values().toArray(new o0O00O[o0OoO00O.this.f16537o00oo0Oo.size()]);
                    }
                }
                o0OoO00O.f16532o00ooo00.execute(new o00oOOoO("OkHttp %s settings", o0OoO00O.this.f16539o00oo0o0));
            }
            if (o0o00oArr == null || j == 0) {
                return;
            }
            for (o0O00O o0o00o : o0o00oArr) {
                synchronized (o0o00o) {
                    o0o00o.o00oOOo0(j);
                }
            }
        }

        @Override // o0Oo0Oo.oO00000o
        public void o00oOooo() {
            o0OoOoOo o0oooooo;
            o0OoOoOo o0oooooo2 = o0OoOoOo.INTERNAL_ERROR;
            try {
                try {
                    this.f16580o00oo0O.o00oOo0O(this);
                    while (this.f16580o00oo0O.o00oOOoO(false, this)) {
                    }
                    o0oooooo = o0OoOoOo.NO_ERROR;
                    try {
                        try {
                            o0OoO00O.this.o00oOOoO(o0oooooo, o0OoOoOo.CANCEL);
                        } catch (IOException unused) {
                            o0OoOoOo o0oooooo3 = o0OoOoOo.PROTOCOL_ERROR;
                            o0OoO00O.this.o00oOOoO(o0oooooo3, o0oooooo3);
                            oO0000O.o00oOo00(this.f16580o00oo0O);
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            o0OoO00O.this.o00oOOoO(o0oooooo, o0oooooo2);
                        } catch (IOException unused2) {
                        }
                        oO0000O.o00oOo00(this.f16580o00oo0O);
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
                o0oooooo = o0oooooo2;
            } catch (Throwable th2) {
                th = th2;
                o0oooooo = o0oooooo2;
                o0OoO00O.this.o00oOOoO(o0oooooo, o0oooooo2);
                oO0000O.o00oOo00(this.f16580o00oo0O);
                throw th;
            }
            oO0000O.o00oOo00(this.f16580o00oo0O);
        }

        public final void o00oo00O(o0O00oO0 o0o00oo0) {
            o0OoO00O.f16532o00ooo00.execute(new o00oOo00("OkHttp %s ACK Settings", new Object[]{o0OoO00O.this.f16539o00oo0o0}, o0o00oo0));
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class o00oo0O0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final o00oo0O0 f16587o00oOOo0 = new o00oOOo0();

        /* loaded from: classes3.dex */
        public class o00oOOo0 extends o00oo0O0 {
            @Override // o0Oo0o0o.o0OoO00O.o00oo0O0
            public void o00oOo0o(o0O00O o0o00o) throws IOException {
                o0o00o.o00oOooO(o0OoOoOo.REFUSED_STREAM);
            }
        }

        public void o00oOo0O(o0OoO00O o0ooo00o) {
        }

        public abstract void o00oOo0o(o0O00O o0o00o) throws IOException;
    }

    /* loaded from: classes3.dex */
    public static class o00oo0OO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Socket f16588o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public String f16589o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public o0O00000 f16590o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public o00oo0O0 f16591o00oOo0O = o00oo0O0.f16587o00oOOo0;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public o0O00o00 f16592o00oOo0o = o0O00o00.f16520o00oOOo0;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public boolean f16593o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public o0 f16594o00oOooO;

        public o00oo0OO(boolean z) {
            this.f16593o00oOoO0 = z;
        }

        public o0OoO00O o00oOOo0() throws IOException {
            return new o0OoO00O(this);
        }

        public o00oo0OO o00oOOoO(o00oo0O0 o00oo0o02) {
            this.f16591o00oOo0O = o00oo0o02;
            return this;
        }

        public o00oo0OO o00oOo00(o0O00o00 o0o00o00) {
            this.f16592o00oOo0o = o0o00o00;
            return this;
        }

        public o00oo0OO o00oOo0O(Socket socket, String str, o0O00000 o0o00000, o0 o0Var) {
            this.f16588o00oOOo0 = socket;
            this.f16589o00oOOoO = str;
            this.f16590o00oOo00 = o0o00000;
            this.f16594o00oOooO = o0Var;
            return this;
        }

        public o00oo0OO o00oOooO(Socket socket) throws IOException {
            return o00oOo0O(socket, ((InetSocketAddress) socket.getRemoteSocketAddress()).getHostName(), new o0Oo.o0O00o00(o0Oo.o0O00O.o00oo0(socket)), new o0Oo.o0oO0Ooo(o0Oo.o0O00O.o00oOoOO(socket)));
        }
    }

    public o0OoO00O(o00oo0OO o00oo0oo) {
        o0O00oO0 o0o00oo0 = new o0O00oO0();
        this.f16546o00ooOO = o0o00oo0;
        this.f16548o00ooOOo = false;
        this.f16552o00ooOoo = new LinkedHashSet();
        this.f16542o00ooO0 = o00oo0oo.f16592o00oOo0o;
        boolean z = o00oo0oo.f16593o00oOoO0;
        this.f16536o00oo0O0 = z;
        this.f16535o00oo0O = o00oo0oo.f16591o00oOo0O;
        int i = z ? 1 : 2;
        this.f16540o00oo0oO = i;
        if (z) {
            this.f16540o00oo0oO = i + 2;
        }
        this.f16544o00ooO0O = z ? 1 : 2;
        if (z) {
            this.f16547o00ooOO0.o00oOoo0(7, 16777216);
        }
        String str = o00oo0oo.f16589o00oOOoO;
        this.f16539o00oo0o0 = str;
        this.f16534o00oo = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new oO0000O.o00oOOoO(oO0000O.o00oo00O("OkHttp %s Push Observer", str), true));
        o0o00oo0.o00oOoo0(7, 65535);
        o0o00oo0.o00oOoo0(5, 16384);
        this.f16541o00ooO = o0o00oo0.o00oOo0O();
        this.f16550o00ooOo0 = o00oo0oo.f16588o00oOOo0;
        this.f16549o00ooOo = new o0O00OO(o00oo0oo.f16594o00oOooO, z);
        this.f16551o00ooOoO = new o00oo0O(new o0O00O0o(o00oo0oo.f16590o00oOo00, z));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        o00oOOoO(o0OoOoOo.NO_ERROR, o0OoOoOo.CANCEL);
    }

    public void flush() throws IOException {
        this.f16549o00ooOo.flush();
    }

    public void o00oOOo0(long j) {
        this.f16541o00ooO += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public void o00oOOoO(o0OoOoOo o0oooooo, o0OoOoOo o0oooooo2) throws IOException {
        o0O00O[] o0o00oArr;
        o0oO0Ooo[] o0oo0oooArr = null;
        try {
            o0oO0Ooo(o0oooooo);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (this.f16537o00oo0Oo.isEmpty()) {
                o0o00oArr = null;
            } else {
                o0o00oArr = (o0O00O[]) this.f16537o00oo0Oo.values().toArray(new o0O00O[this.f16537o00oo0Oo.size()]);
                this.f16537o00oo0Oo.clear();
            }
            Map<Integer, o0oO0Ooo> map = this.f16543o00ooO00;
            if (map != null) {
                this.f16543o00ooO00 = null;
                o0oo0oooArr = (o0oO0Ooo[]) map.values().toArray(new o0oO0Ooo[this.f16543o00ooO00.size()]);
            }
        }
        if (o0o00oArr != null) {
            for (o0O00O o0o00o : o0o00oArr) {
                try {
                    o0o00o.o00oOooO(o0oooooo2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        if (o0oo0oooArr != null) {
            for (o0oO0Ooo o0oo0ooo : o0oo0oooArr) {
                o0oo0ooo.o00oOOo0();
            }
        }
        try {
            this.f16549o00ooOo.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f16550o00ooOo0.close();
        } catch (IOException e4) {
            e = e4;
        }
        if (e != null) {
            throw e;
        }
    }

    public o0O o00oOo0O() {
        return o0O.HTTP_2;
    }

    public synchronized o0O00O o00oOo0o(int i) {
        return this.f16537o00oo0Oo.get(Integer.valueOf(i));
    }

    public synchronized int o00oOoO() {
        return this.f16546o00ooOO.o00oOo0o(Integer.MAX_VALUE);
    }

    public synchronized boolean o00oOoO0() {
        return this.f16553o0O0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035 A[Catch: all -> 0x0067, TryCatch #1 {, blocks: (B:4:0x0006, B:21:0x0041, B:25:0x0050, B:22:0x0047, B:24:0x004b, B:29:0x0059, B:30:0x0060, B:5:0x0007, B:7:0x000b, B:9:0x001d, B:11:0x0025, B:16:0x002f, B:18:0x0035, B:19:0x003e, B:31:0x0061, B:32:0x0066), top: B:39:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o0Oo0o0o.o0O00O o00oOoo0(int r11, java.util.List<o0Oo0o0o.o0O000Oo> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            o0Oo0o0o.o0O00OO r7 = r10.f16549o00ooOo
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L6a
            boolean r0 = r10.f16553o0O0o     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L61
            int r8 = r10.f16540o00oo0oO     // Catch: java.lang.Throwable -> L67
            int r0 = r8 + 2
            r10.f16540o00oo0oO = r0     // Catch: java.lang.Throwable -> L67
            o0Oo0o0o.o0O00O r9 = new o0Oo0o0o.o0O00O     // Catch: java.lang.Throwable -> L67
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L67
            if (r13 == 0) goto L2e
            long r0 = r10.f16541o00ooO     // Catch: java.lang.Throwable -> L67
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L2e
            long r0 = r9.f16455o00oOOoO     // Catch: java.lang.Throwable -> L67
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L2c
            goto L2e
        L2c:
            r13 = 0
            goto L2f
        L2e:
            r13 = 1
        L2f:
            boolean r0 = r9.o00oo0()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L3e
            java.util.Map<java.lang.Integer, o0Oo0o0o.o0O00O> r0 = r10.f16537o00oo0Oo     // Catch: java.lang.Throwable -> L67
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L67
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L67
        L3e:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L67
            if (r11 != 0) goto L47
            o0Oo0o0o.o0O00OO r0 = r10.f16549o00ooOo     // Catch: java.lang.Throwable -> L6a
            r0.o00oooOo(r6, r8, r11, r12)     // Catch: java.lang.Throwable -> L6a
            goto L50
        L47:
            boolean r0 = r10.f16536o00oo0O0     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L59
            o0Oo0o0o.o0O00OO r0 = r10.f16549o00ooOo     // Catch: java.lang.Throwable -> L6a
            r0.o00ooO0(r11, r8, r12)     // Catch: java.lang.Throwable -> L6a
        L50:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6a
            if (r13 == 0) goto L58
            o0Oo0o0o.o0O00OO r11 = r10.f16549o00ooOo
            r11.flush()
        L58:
            return r9
        L59:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6a
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L6a
            throw r11     // Catch: java.lang.Throwable -> L6a
        L61:
            o0Oo0o0o.o0O000O r11 = new o0Oo0o0o.o0O000O     // Catch: java.lang.Throwable -> L67
            r11.<init>()     // Catch: java.lang.Throwable -> L67
            throw r11     // Catch: java.lang.Throwable -> L67
        L67:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L67
            throw r11     // Catch: java.lang.Throwable -> L6a
        L6a:
            r11 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6a
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o0Oo0o0o.o0OoO00O.o00oOoo0(int, java.util.List, boolean):o0Oo0o0o.o0O00O");
    }

    public o0O00O o00oOooo(List<o0O000Oo> list, boolean z) throws IOException {
        return o00oOoo0(0, list, z);
    }

    public synchronized int o00oo0() {
        return this.f16537o00oo0Oo.size();
    }

    public void o00ooO0(int i, o0O00000 o0o00000, int i2, boolean z) throws IOException {
        o00ooO o00ooo = new o00ooO();
        long j = i2;
        o0o00000.o0O00O0o(j);
        o0o00000.o0O0o000(o00ooo, j);
        if (o00ooo.f15434o00oo0O == j) {
            this.f16534o00oo.execute(new o00oo00O("OkHttp %s Push Data[%s]", new Object[]{this.f16539o00oo0o0, Integer.valueOf(i)}, i, o00ooo, i2, z));
            return;
        }
        throw new IOException(o00ooo.f15434o00oo0O + " != " + i2);
    }

    public o0oO0Ooo o00ooO00() throws IOException {
        int i;
        o0oO0Ooo o0oo0ooo = new o0oO0Ooo();
        synchronized (this) {
            if (this.f16553o0O0o) {
                throw new o0O000O();
            }
            i = this.f16544o00ooO0O;
            this.f16544o00ooO0O = i + 2;
            if (this.f16543o00ooO00 == null) {
                this.f16543o00ooO00 = new LinkedHashMap();
            }
            this.f16543o00ooO00.put(Integer.valueOf(i), o0oo0ooo);
        }
        o0O0OO0(false, i, 1330343787, o0oo0ooo);
        return o0oo0ooo;
    }

    public void o00ooO0O(int i, List<o0O000Oo> list, boolean z) {
        this.f16534o00oo.execute(new o00oOoO("OkHttp %s Push Headers[%s]", new Object[]{this.f16539o00oo0o0, Integer.valueOf(i)}, i, list, z));
    }

    public void o00ooO0o(int i, List<o0O000Oo> list) {
        synchronized (this) {
            if (this.f16552o00ooOoo.contains(Integer.valueOf(i))) {
                o0O0o0O(i, o0OoOoOo.PROTOCOL_ERROR);
                return;
            }
            this.f16552o00ooOoo.add(Integer.valueOf(i));
            this.f16534o00oo.execute(new o00oOo0O("OkHttp %s Push Request[%s]", new Object[]{this.f16539o00oo0o0, Integer.valueOf(i)}, i, list));
        }
    }

    public void o00ooOoO(int i, o0OoOoOo o0oooooo) {
        this.f16534o00oo.execute(new o00oo0("OkHttp %s Push Reset[%s]", new Object[]{this.f16539o00oo0o0, Integer.valueOf(i)}, i, o0oooooo));
    }

    public o0O00O o00oooOo(int i, List<o0O000Oo> list, boolean z) throws IOException {
        if (this.f16536o00oo0O0) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return o00oOoo0(i, list, z);
    }

    public boolean o0O000(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public synchronized o0oO0Ooo o0O000O(int i) {
        Map<Integer, o0oO0Ooo> map;
        map = this.f16543o00ooO00;
        return map != null ? map.remove(Integer.valueOf(i)) : null;
    }

    public synchronized o0O00O o0O000o0(int i) {
        o0O00O remove;
        remove = this.f16537o00oo0Oo.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public void o0O000oo(o0O00oO0 o0o00oo0) throws IOException {
        synchronized (this.f16549o00ooOo) {
            synchronized (this) {
                if (this.f16553o0O0o) {
                    throw new o0O000O();
                }
                this.f16547o00ooOO0.o00oOoOo(o0o00oo0);
                this.f16549o00ooOo.o00ooO0o(o0o00oo0);
            }
        }
    }

    public void o0O0O0Oo(boolean z) throws IOException {
        if (z) {
            this.f16549o00ooOo.o00oOOoO();
            this.f16549o00ooOo.o00ooO0o(this.f16547o00ooOO0);
            int o00oOo0O2 = this.f16547o00ooOO0.o00oOo0O();
            if (o00oOo0O2 != 65535) {
                this.f16549o00ooOo.o0O000(0, o00oOo0O2 - 65535);
            }
        }
        new Thread(this.f16551o00ooOoO).start();
    }

    public void o0O0OO0(boolean z, int i, int i2, o0oO0Ooo o0oo0ooo) throws IOException {
        synchronized (this.f16549o00ooOo) {
            if (o0oo0ooo != null) {
                o0oo0ooo.o00oOo0O();
            }
            this.f16549o00ooOo.o00ooO00(z, i, i2);
        }
    }

    public void o0O0Oo(boolean z, int i, int i2, o0oO0Ooo o0oo0ooo) {
        f16532o00ooo00.execute(new o00oOo00("OkHttp %s ping %08x%08x", new Object[]{this.f16539o00oo0o0, Integer.valueOf(i), Integer.valueOf(i2)}, z, i, i2, o0oo0ooo));
    }

    public void o0O0Oooo(int i, boolean z, List<o0O000Oo> list) throws IOException {
        this.f16549o00ooOo.o00ooOoO(z, i, list);
    }

    public void o0O0o00o(int i, o0OoOoOo o0oooooo) throws IOException {
        this.f16549o00ooOo.o00ooO0O(i, o0oooooo);
    }

    public void o0O0o0O(int i, o0OoOoOo o0oooooo) {
        f16532o00ooo00.execute(new o00oOOo0("OkHttp %s stream %d", new Object[]{this.f16539o00oo0o0, Integer.valueOf(i)}, i, o0oooooo));
    }

    public void o0O0o0oO(int i, long j) {
        f16532o00ooo00.execute(new o00oOOoO("OkHttp Window Update %s stream %d", new Object[]{this.f16539o00oo0o0, Integer.valueOf(i)}, i, j));
    }

    public void o0oO0O0o() throws IOException {
        o0O0O0Oo(true);
    }

    public void o0oO0Ooo(o0OoOoOo o0oooooo) throws IOException {
        synchronized (this.f16549o00ooOo) {
            synchronized (this) {
                if (this.f16553o0O0o) {
                    return;
                }
                this.f16553o0O0o = true;
                this.f16549o00ooOo.o00oOoO(this.f16538o00oo0o, o0oooooo, oO0000O.f15750o00oOOo0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f16549o00ooOo.f16511o00oo0o0);
        r6 = r2;
        r8.f16541o00ooO -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0ooO(int r9, boolean r10, o0Oo.o00ooO r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            o0Oo0o0o.o0O00OO r12 = r8.f16549o00ooOo
            r12.o00oOo0O(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L5e
            monitor-enter(r8)
        L12:
            long r4 = r8.f16541o00ooO     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L30
            java.util.Map<java.lang.Integer, o0Oo0o0o.o0O00O> r2 = r8.f16537o00oo0Oo     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            if (r2 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            throw r9     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
        L30:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L54
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L54
            o0Oo0o0o.o0O00OO r4 = r8.f16549o00ooOo     // Catch: java.lang.Throwable -> L54
            int r4 = r4.f16511o00oo0o0     // Catch: java.lang.Throwable -> L54
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L54
            long r4 = r8.f16541o00ooO     // Catch: java.lang.Throwable -> L54
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L54
            long r4 = r4 - r6
            r8.f16541o00ooO = r4     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            long r12 = r12 - r6
            o0Oo0o0o.o0O00OO r4 = r8.f16549o00ooOo
            if (r10 == 0) goto L4f
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = r3
        L50:
            r4.o00oOo0O(r5, r9, r11, r2)
            goto Ld
        L54:
            r9 = move-exception
            goto L5c
        L56:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L54
            r9.<init>()     // Catch: java.lang.Throwable -> L54
            throw r9     // Catch: java.lang.Throwable -> L54
        L5c:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            throw r9
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0Oo0o0o.o0OoO00O.o0ooO(int, boolean, o0Oo.o00ooO, long):void");
    }
}
