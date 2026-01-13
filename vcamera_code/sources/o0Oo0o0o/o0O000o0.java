package o0Oo0o0o;

import android.support.v4.media.o00oOo0O;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o00oo0o0.o00oo0;
import o0Oo.o00ooO;
import o0Oo.o0O00000;
import o0Oo.o0O0000O;
import o0Oo.o0O0O0Oo;
import org.osmdroid.tileprovider.modules.SqlTileWriter;
/* loaded from: classes3.dex */
public final class o0O000o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f16427o00oOOo0 = 15;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f16428o00oOOoO = 31;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f16429o00oOo00 = 63;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final o0O000Oo[] f16430o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final Map<o0O0000O, Integer> f16431o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f16432o00oOooO = 127;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final List<o0O000Oo> f16433o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o0O00000 f16434o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f16435o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public o0O000Oo[] f16436o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f16437o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public int f16438o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f16439o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f16440o00oOooO;

        public o00oOOo0(int i, int i2, o0O0O0Oo o0o0o0oo) {
            this.f16433o00oOOo0 = new ArrayList();
            o0O000Oo[] o0o000ooArr = new o0O000Oo[8];
            this.f16436o00oOo0O = o0o000ooArr;
            this.f16437o00oOo0o = o0o000ooArr.length - 1;
            this.f16439o00oOoO0 = 0;
            this.f16438o00oOoO = 0;
            this.f16435o00oOo00 = i;
            this.f16440o00oOooO = i2;
            this.f16434o00oOOoO = o0Oo.o0O00O.o00oOooO(o0o0o0oo);
        }

        public o00oOOo0(int i, o0O0O0Oo o0o0o0oo) {
            this(i, i, o0o0o0oo);
        }

        public final void o00oOOo0() {
            int i = this.f16440o00oOooO;
            int i2 = this.f16438o00oOoO;
            if (i < i2) {
                if (i == 0) {
                    o00oOOoO();
                } else {
                    o00oOooO(i2 - i);
                }
            }
        }

        public final void o00oOOoO() {
            Arrays.fill(this.f16436o00oOo0O, (Object) null);
            this.f16437o00oOo0o = this.f16436o00oOo0O.length - 1;
            this.f16439o00oOoO0 = 0;
            this.f16438o00oOoO = 0;
        }

        public final int o00oOo00(int i) {
            return this.f16437o00oOo0o + 1 + i;
        }

        public List<o0O000Oo> o00oOo0O() {
            ArrayList arrayList = new ArrayList(this.f16433o00oOOo0);
            this.f16433o00oOOo0.clear();
            return arrayList;
        }

        public final o0O0000O o00oOo0o(int i) {
            o0O000Oo o0o000oo;
            if (o00oOoO(i)) {
                o0o000oo = o0O000o0.f16430o00oOo0O[i];
            } else {
                o0o000oo = this.f16436o00oOo0O[this.f16437o00oOo0o + 1 + (i - o0O000o0.f16430o00oOo0O.length)];
            }
            return o0o000oo.f16424o00oOOo0;
        }

        public final boolean o00oOoO(int i) {
            return i >= 0 && i <= o0O000o0.f16430o00oOo0O.length - 1;
        }

        public final void o00oOoO0(int i, o0O000Oo o0o000oo) {
            this.f16433o00oOOo0.add(o0o000oo);
            int i2 = o0o000oo.f16426o00oOo00;
            if (i != -1) {
                i2 -= this.f16436o00oOo0O[(this.f16437o00oOo0o + 1) + i].f16426o00oOo00;
            }
            int i3 = this.f16440o00oOooO;
            if (i2 > i3) {
                o00oOOoO();
                return;
            }
            int o00oOooO2 = o00oOooO((this.f16438o00oOoO + i2) - i3);
            if (i == -1) {
                int i4 = this.f16439o00oOoO0 + 1;
                o0O000Oo[] o0o000ooArr = this.f16436o00oOo0O;
                if (i4 > o0o000ooArr.length) {
                    o0O000Oo[] o0o000ooArr2 = new o0O000Oo[o0o000ooArr.length * 2];
                    System.arraycopy(o0o000ooArr, 0, o0o000ooArr2, o0o000ooArr.length, o0o000ooArr.length);
                    this.f16437o00oOo0o = this.f16436o00oOo0O.length - 1;
                    this.f16436o00oOo0O = o0o000ooArr2;
                }
                int i5 = this.f16437o00oOo0o;
                this.f16437o00oOo0o = i5 - 1;
                this.f16436o00oOo0O[i5] = o0o000oo;
                this.f16439o00oOoO0++;
            } else {
                this.f16436o00oOo0O[this.f16437o00oOo0o + 1 + i + o00oOooO2 + i] = o0o000oo;
            }
            this.f16438o00oOoO += i2;
        }

        public int o00oOoOO() {
            return this.f16440o00oOooO;
        }

        public final int o00oOoOo() throws IOException {
            return this.f16434o00oOOoO.readByte() & 255;
        }

        public o0O0000O o00oOoo0() throws IOException {
            int o00oOoOo2 = o00oOoOo();
            boolean z = (o00oOoOo2 & 128) == 128;
            int o00oo02 = o00oo0(o00oOoOo2, 127);
            return z ? o0O0000O.of(o0O00OOO.o00oOo0o().o00oOo00(this.f16434o00oOOoO.o0ooOoOO(o00oo02))) : this.f16434o00oOOoO.o0O00o(o00oo02);
        }

        public final int o00oOooO(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f16436o00oOo0O.length;
                while (true) {
                    length--;
                    i2 = this.f16437o00oOo0o;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f16436o00oOo0O[length].f16426o00oOo00;
                    i -= i4;
                    this.f16438o00oOoO -= i4;
                    this.f16439o00oOoO0--;
                    i3++;
                }
                o0O000Oo[] o0o000ooArr = this.f16436o00oOo0O;
                System.arraycopy(o0o000ooArr, i2 + 1, o0o000ooArr, i2 + 1 + i3, this.f16439o00oOoO0);
                this.f16437o00oOo0o += i3;
            }
            return i3;
        }

        public void o00oOooo() throws IOException {
            while (!this.f16434o00oOOoO.o0O0O0oO()) {
                int readByte = this.f16434o00oOOoO.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    o00oo00O(o00oo0(readByte, 127) - 1);
                } else if (readByte == 64) {
                    o00oo0O0();
                } else if ((readByte & 64) == 64) {
                    o00oo0OO(o00oo0(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int o00oo02 = o00oo0(readByte, 31);
                    this.f16440o00oOooO = o00oo02;
                    if (o00oo02 < 0 || o00oo02 > this.f16435o00oOo00) {
                        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Invalid dynamic table size update ");
                        o00oOOo02.append(this.f16440o00oOooO);
                        throw new IOException(o00oOOo02.toString());
                    }
                    o00oOOo0();
                } else if (readByte == 16 || readByte == 0) {
                    o00oo0Oo();
                } else {
                    o00oo0O(o00oo0(readByte, 15) - 1);
                }
            }
        }

        public int o00oo0(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int o00oOoOo2 = o00oOoOo();
                if ((o00oOoOo2 & 128) == 0) {
                    return i2 + (o00oOoOo2 << i4);
                }
                i2 += (o00oOoOo2 & 127) << i4;
                i4 += 7;
            }
        }

        public final void o00oo00O(int i) throws IOException {
            if (o00oOoO(i)) {
                this.f16433o00oOOo0.add(o0O000o0.f16430o00oOo0O[i]);
                return;
            }
            int length = this.f16437o00oOo0o + 1 + (i - o0O000o0.f16430o00oOo0O.length);
            if (length >= 0) {
                o0O000Oo[] o0o000ooArr = this.f16436o00oOo0O;
                if (length <= o0o000ooArr.length - 1) {
                    this.f16433o00oOOo0.add(o0o000ooArr[length]);
                    return;
                }
            }
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Header index too large ");
            o00oOOo02.append(i + 1);
            throw new IOException(o00oOOo02.toString());
        }

        public final void o00oo0O(int i) throws IOException {
            this.f16433o00oOOo0.add(new o0O000Oo(o00oOo0o(i), o00oOoo0()));
        }

        public final void o00oo0O0() throws IOException {
            o00oOoO0(-1, new o0O000Oo(o0O000o0.o00oOOo0(o00oOoo0()), o00oOoo0()));
        }

        public final void o00oo0OO(int i) throws IOException {
            o00oOoO0(-1, new o0O000Oo(o00oOo0o(i), o00oOoo0()));
        }

        public final void o00oo0Oo() throws IOException {
            this.f16433o00oOOo0.add(new o0O000Oo(o0O000o0.o00oOOo0(o00oOoo0()), o00oOoo0()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO {

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static final int f16441o00oOoo0 = 4096;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public static final int f16442o00oOooo = 16384;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00ooO f16443o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final boolean f16444o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f16445o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f16446o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f16447o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public int f16448o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public o0O000Oo[] f16449o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public int f16450o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public int f16451o00oOoOo;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f16452o00oOooO;

        public o00oOOoO(int i, boolean z, o00ooO o00ooo) {
            this.f16445o00oOo00 = Integer.MAX_VALUE;
            o0O000Oo[] o0o000ooArr = new o0O000Oo[8];
            this.f16449o00oOoO0 = o0o000ooArr;
            this.f16448o00oOoO = o0o000ooArr.length - 1;
            this.f16450o00oOoOO = 0;
            this.f16451o00oOoOo = 0;
            this.f16446o00oOo0O = i;
            this.f16447o00oOo0o = i;
            this.f16444o00oOOoO = z;
            this.f16443o00oOOo0 = o00ooo;
        }

        public o00oOOoO(o00ooO o00ooo) {
            this(4096, true, o00ooo);
        }

        public final void o00oOOo0() {
            int i = this.f16447o00oOo0o;
            int i2 = this.f16451o00oOoOo;
            if (i < i2) {
                if (i == 0) {
                    o00oOOoO();
                } else {
                    o00oOo00(i2 - i);
                }
            }
        }

        public final void o00oOOoO() {
            Arrays.fill(this.f16449o00oOoO0, (Object) null);
            this.f16448o00oOoO = this.f16449o00oOoO0.length - 1;
            this.f16450o00oOoOO = 0;
            this.f16451o00oOoOo = 0;
        }

        public final int o00oOo00(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f16449o00oOoO0.length;
                while (true) {
                    length--;
                    i2 = this.f16448o00oOoO;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f16449o00oOoO0[length].f16426o00oOo00;
                    i -= i4;
                    this.f16451o00oOoOo -= i4;
                    this.f16450o00oOoOO--;
                    i3++;
                }
                o0O000Oo[] o0o000ooArr = this.f16449o00oOoO0;
                System.arraycopy(o0o000ooArr, i2 + 1, o0o000ooArr, i2 + 1 + i3, this.f16450o00oOoOO);
                o0O000Oo[] o0o000ooArr2 = this.f16449o00oOoO0;
                int i5 = this.f16448o00oOoO;
                Arrays.fill(o0o000ooArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.f16448o00oOoO += i3;
            }
            return i3;
        }

        public void o00oOo0O(int i) {
            this.f16446o00oOo0O = i;
            int min = Math.min(i, 16384);
            int i2 = this.f16447o00oOo0o;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.f16445o00oOo00 = Math.min(this.f16445o00oOo00, min);
            }
            this.f16452o00oOooO = true;
            this.f16447o00oOo0o = min;
            o00oOOo0();
        }

        public void o00oOo0o(o0O0000O o0o0000o) throws IOException {
            int size;
            int i;
            if (!this.f16444o00oOOoO || o0O00OOO.o00oOo0o().o00oOo0O(o0o0000o) >= o0o0000o.size()) {
                size = o0o0000o.size();
                i = 0;
            } else {
                o00ooO o00ooo = new o00ooO();
                o0O00OOO.f16515o00oOooO.o00oOooO(o0o0000o, o00ooo);
                o0o0000o = o00ooo.o0O0Ooo();
                size = o0o0000o.size();
                i = 128;
            }
            o00oOoO(size, 127, i);
            this.f16443o00oOOo0.o0O0OO0O(o0o0000o);
        }

        public void o00oOoO(int i, int i2, int i3) {
            int i4;
            o00ooO o00ooo;
            if (i < i2) {
                o00ooo = this.f16443o00oOOo0;
                i4 = i | i3;
            } else {
                this.f16443o00oOOo0.writeByte(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f16443o00oOOo0.writeByte(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                o00ooo = this.f16443o00oOOo0;
            }
            o00ooo.writeByte(i4);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void o00oOoO0(java.util.List<o0Oo0o0o.o0O000Oo> r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o0Oo0o0o.o0O000o0.o00oOOoO.o00oOoO0(java.util.List):void");
        }

        public final void o00oOooO(o0O000Oo o0o000oo) {
            int i = o0o000oo.f16426o00oOo00;
            int i2 = this.f16447o00oOo0o;
            if (i > i2) {
                o00oOOoO();
                return;
            }
            o00oOo00((this.f16451o00oOoOo + i) - i2);
            int i3 = this.f16450o00oOoOO + 1;
            o0O000Oo[] o0o000ooArr = this.f16449o00oOoO0;
            if (i3 > o0o000ooArr.length) {
                o0O000Oo[] o0o000ooArr2 = new o0O000Oo[o0o000ooArr.length * 2];
                System.arraycopy(o0o000ooArr, 0, o0o000ooArr2, o0o000ooArr.length, o0o000ooArr.length);
                this.f16448o00oOoO = this.f16449o00oOoO0.length - 1;
                this.f16449o00oOoO0 = o0o000ooArr2;
            }
            int i4 = this.f16448o00oOoO;
            this.f16448o00oOoO = i4 - 1;
            this.f16449o00oOoO0[i4] = o0o000oo;
            this.f16450o00oOoOO++;
            this.f16451o00oOoOo += i;
        }
    }

    static {
        o0O0000O o0o0000o = o0O000Oo.f16419o00oOo0o;
        o0O0000O o0o0000o2 = o0O000Oo.f16421o00oOoO0;
        o0O0000O o0o0000o3 = o0O000Oo.f16420o00oOoO;
        o0O0000O o0o0000o4 = o0O000Oo.f16418o00oOo0O;
        f16430o00oOo0O = new o0O000Oo[]{new o0O000Oo(o0O000Oo.f16422o00oOoOO, ""), new o0O000Oo(o0o0000o, o00oo0.f7537o00oOoOO), new o0O000Oo(o0o0000o, o00oo0.f7538o00oOoOo), new o0O000Oo(o0o0000o2, "/"), new o0O000Oo(o0o0000o2, "/index.html"), new o0O000Oo(o0o0000o3, "http"), new o0O000Oo(o0o0000o3, "https"), new o0O000Oo(o0o0000o4, "200"), new o0O000Oo(o0o0000o4, "204"), new o0O000Oo(o0o0000o4, "206"), new o0O000Oo(o0o0000o4, "304"), new o0O000Oo(o0o0000o4, "400"), new o0O000Oo(o0o0000o4, "404"), new o0O000Oo(o0o0000o4, "500"), new o0O000Oo("accept-charset", ""), new o0O000Oo("accept-encoding", "gzip, deflate"), new o0O000Oo("accept-language", ""), new o0O000Oo("accept-ranges", ""), new o0O000Oo("accept", ""), new o0O000Oo("access-control-allow-origin", ""), new o0O000Oo("age", ""), new o0O000Oo("allow", ""), new o0O000Oo("authorization", ""), new o0O000Oo("cache-control", ""), new o0O000Oo("content-disposition", ""), new o0O000Oo("content-encoding", ""), new o0O000Oo("content-language", ""), new o0O000Oo("content-length", ""), new o0O000Oo("content-location", ""), new o0O000Oo("content-range", ""), new o0O000Oo("content-type", ""), new o0O000Oo("cookie", ""), new o0O000Oo("date", ""), new o0O000Oo("etag", ""), new o0O000Oo("expect", ""), new o0O000Oo(SqlTileWriter.COLUMN_EXPIRES, ""), new o0O000Oo("from", ""), new o0O000Oo("host", ""), new o0O000Oo("if-match", ""), new o0O000Oo("if-modified-since", ""), new o0O000Oo("if-none-match", ""), new o0O000Oo("if-range", ""), new o0O000Oo("if-unmodified-since", ""), new o0O000Oo("last-modified", ""), new o0O000Oo("link", ""), new o0O000Oo(FirebaseAnalytics.Param.LOCATION, ""), new o0O000Oo("max-forwards", ""), new o0O000Oo("proxy-authenticate", ""), new o0O000Oo("proxy-authorization", ""), new o0O000Oo(SessionDescription.ATTR_RANGE, ""), new o0O000Oo("referer", ""), new o0O000Oo("refresh", ""), new o0O000Oo("retry-after", ""), new o0O000Oo("server", ""), new o0O000Oo("set-cookie", ""), new o0O000Oo("strict-transport-security", ""), new o0O000Oo("transfer-encoding", ""), new o0O000Oo("user-agent", ""), new o0O000Oo("vary", ""), new o0O000Oo("via", ""), new o0O000Oo("www-authenticate", "")};
        f16431o00oOo0o = o00oOOoO();
    }

    public static o0O0000O o00oOOo0(o0O0000O o0o0000o) throws IOException {
        int size = o0o0000o.size();
        for (int i = 0; i < size; i++) {
            byte b = o0o0000o.getByte(i);
            if (b >= 65 && b <= 90) {
                StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("PROTOCOL_ERROR response malformed: mixed case name: ");
                o00oOOo02.append(o0o0000o.utf8());
                throw new IOException(o00oOOo02.toString());
            }
        }
        return o0o0000o;
    }

    public static Map<o0O0000O, Integer> o00oOOoO() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f16430o00oOo0O.length);
        int i = 0;
        while (true) {
            o0O000Oo[] o0o000ooArr = f16430o00oOo0O;
            if (i >= o0o000ooArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(o0o000ooArr[i].f16424o00oOOo0)) {
                linkedHashMap.put(o0o000ooArr[i].f16424o00oOOo0, Integer.valueOf(i));
            }
            i++;
        }
    }
}
