package o0Oo0o0o;

import o0Oo.o0O0000O;
import o0Oo0Oo.oO0000O;
/* loaded from: classes3.dex */
public final class o0O000Oo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0000O f16424o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0000O f16425o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final int f16426o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final o0O0000O f16423o00oOooO = o0O0000O.encodeUtf8(":");

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final o0O0000O f16418o00oOo0O = o0O0000O.encodeUtf8(":status");

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final o0O0000O f16419o00oOo0o = o0O0000O.encodeUtf8(":method");

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final o0O0000O f16421o00oOoO0 = o0O0000O.encodeUtf8(":path");

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final o0O0000O f16420o00oOoO = o0O0000O.encodeUtf8(":scheme");

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final o0O0000O f16422o00oOoOO = o0O0000O.encodeUtf8(":authority");

    public o0O000Oo(String str, String str2) {
        this(o0O0000O.encodeUtf8(str), o0O0000O.encodeUtf8(str2));
    }

    public o0O000Oo(o0O0000O o0o0000o, String str) {
        this(o0o0000o, o0O0000O.encodeUtf8(str));
    }

    public o0O000Oo(o0O0000O o0o0000o, o0O0000O o0o0000o2) {
        this.f16424o00oOOo0 = o0o0000o;
        this.f16425o00oOOoO = o0o0000o2;
        this.f16426o00oOo00 = o0o0000o2.size() + o0o0000o.size() + 32;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o0O000Oo) {
            o0O000Oo o0o000oo = (o0O000Oo) obj;
            return this.f16424o00oOOo0.equals(o0o000oo.f16424o00oOOo0) && this.f16425o00oOOoO.equals(o0o000oo.f16425o00oOOoO);
        }
        return false;
    }

    public int hashCode() {
        return this.f16425o00oOOoO.hashCode() + ((this.f16424o00oOOo0.hashCode() + 527) * 31);
    }

    public String toString() {
        return oO0000O.o00oo00O("%s: %s", this.f16424o00oOOo0.utf8(), this.f16425o00oOOoO.utf8());
    }
}
