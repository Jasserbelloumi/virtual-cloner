package o0O0OOoO;

import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class o0O0o implements o0 {
    @o0OO00OO

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Object[] f11538o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final String f11539o00oo0O0;

    public o0O0o(String str) {
        this(str, null);
    }

    public o0O0o(String str, @o0OO00OO Object[] objArr) {
        this.f11539o00oo0O0 = str;
        this.f11538o00oo0O = objArr;
    }

    public static void o00oOo00(o00ooO o00ooo, int i, Object obj) {
        long j;
        int byteValue;
        double doubleValue;
        if (obj == null) {
            o00ooo.o0O0o00(i);
        } else if (obj instanceof byte[]) {
            o00ooo.o0OooO0(i, (byte[]) obj);
        } else {
            if (obj instanceof Float) {
                doubleValue = ((Float) obj).floatValue();
            } else if (!(obj instanceof Double)) {
                if (obj instanceof Long) {
                    j = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        byteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        byteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        byteValue = ((Byte) obj).byteValue();
                    } else if (obj instanceof String) {
                        o00ooo.o0O0O0O(i, (String) obj);
                        return;
                    } else if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                    } else {
                        j = ((Boolean) obj).booleanValue() ? 1L : 0L;
                    }
                    j = byteValue;
                }
                o00ooo.o0O0OOOo(i, j);
                return;
            } else {
                doubleValue = ((Double) obj).doubleValue();
            }
            o00ooo.o00ooO(i, doubleValue);
        }
    }

    public static void o00oOooO(o00ooO o00ooo, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            o00oOo00(o00ooo, i, obj);
        }
    }

    @Override // o0O0OOoO.o0
    public int o00oOOo0() {
        Object[] objArr = this.f11538o00oo0O;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    @Override // o0O0OOoO.o0
    public String o00oOOoO() {
        return this.f11539o00oo0O0;
    }

    @Override // o0O0OOoO.o0
    public void o00oOo0O(o00ooO o00ooo) {
        o00oOooO(o00ooo, this.f11538o00oo0O);
    }
}
