package androidx.work;

import android.annotation.SuppressLint;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O0OO.o0O0O0o0;
import o0O0Ooo0.o0O00000;
/* loaded from: classes.dex */
public final class o00oOOoO {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f5762o00oOOoO = o0O00000.o00oOo0o("Data");

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final o00oOOoO f5763o00oOo00 = new o00oOOo0().o00oOOo0();
    @SuppressLint({"MinMaxConstant"})

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f5764o00oOooO = 10240;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Map<String, Object> f5765o00oOOo0;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Map<String, Object> f5766o00oOOo0 = new HashMap();

        @oo0oO0
        public o00oOOoO o00oOOo0() {
            o00oOOoO o00ooooo2 = new o00oOOoO(this.f5766o00oOOo0);
            o00oOOoO.o00ooOo0(o00ooooo2);
            return o00ooooo2;
        }

        @oo0oO0
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        public o00oOOo0 o00oOOoO(@oo0oO0 String str, @o0OO00OO Object obj) {
            if (obj == null) {
                this.f5766o00oOOo0.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f5766o00oOOo0.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f5766o00oOOo0.put(str, o00oOOoO.o00oOOo0((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f5766o00oOOo0.put(str, o00oOOoO.o00oOOoO((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f5766o00oOOo0.put(str, o00oOOoO.o00oOo0O((int[]) obj));
                } else if (cls == long[].class) {
                    this.f5766o00oOOo0.put(str, o00oOOoO.o00oOo0o((long[]) obj));
                } else if (cls == float[].class) {
                    this.f5766o00oOOo0.put(str, o00oOOoO.o00oOooO((float[]) obj));
                } else if (cls != double[].class) {
                    throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                } else {
                    this.f5766o00oOOo0.put(str, o00oOOoO.o00oOo00((double[]) obj));
                }
            }
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOo00(@oo0oO0 o00oOOoO o00ooooo2) {
            o00oOooO(o00ooooo2.f5765o00oOOo0);
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOo0O(@oo0oO0 String str, boolean z) {
            this.f5766o00oOOo0.put(str, Boolean.valueOf(z));
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOo0o(@oo0oO0 String str, @oo0oO0 boolean[] zArr) {
            this.f5766o00oOOo0.put(str, o00oOOoO.o00oOOo0(zArr));
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOoO(@oo0oO0 String str, @oo0oO0 byte[] bArr) {
            this.f5766o00oOOo0.put(str, o00oOOoO.o00oOOoO(bArr));
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOoO0(@oo0oO0 String str, byte b) {
            this.f5766o00oOOo0.put(str, Byte.valueOf(b));
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOoOO(@oo0oO0 String str, double d) {
            this.f5766o00oOOo0.put(str, Double.valueOf(d));
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOoOo(@oo0oO0 String str, @oo0oO0 double[] dArr) {
            this.f5766o00oOOo0.put(str, o00oOOoO.o00oOo00(dArr));
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOoo0(@oo0oO0 String str, float f) {
            this.f5766o00oOOo0.put(str, Float.valueOf(f));
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOooO(@oo0oO0 Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                o00oOOoO(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOooo(@oo0oO0 String str, @oo0oO0 float[] fArr) {
            this.f5766o00oOOo0.put(str, o00oOOoO.o00oOooO(fArr));
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oo0(@oo0oO0 String str, @oo0oO0 int[] iArr) {
            this.f5766o00oOOo0.put(str, o00oOOoO.o00oOo0O(iArr));
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oo00O(@oo0oO0 String str, int i) {
            this.f5766o00oOOo0.put(str, Integer.valueOf(i));
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oo0O(@oo0oO0 String str, @o0OO00OO String str2) {
            this.f5766o00oOOo0.put(str, str2);
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oo0O0(@oo0oO0 String str, @oo0oO0 long[] jArr) {
            this.f5766o00oOOo0.put(str, o00oOOoO.o00oOo0o(jArr));
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oo0OO(@oo0oO0 String str, long j) {
            this.f5766o00oOOo0.put(str, Long.valueOf(j));
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oo0Oo(@oo0oO0 String str, @oo0oO0 String[] strArr) {
            this.f5766o00oOOo0.put(str, strArr);
            return this;
        }
    }

    public o00oOOoO() {
    }

    public o00oOOoO(@oo0oO0 o00oOOoO o00ooooo2) {
        this.f5765o00oOOo0 = new HashMap(o00ooooo2.f5765o00oOOo0);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o00oOOoO(@oo0oO0 Map<String, ?> map) {
        this.f5765o00oOOo0 = new HashMap(map);
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static Boolean[] o00oOOo0(@oo0oO0 boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static Byte[] o00oOOoO(@oo0oO0 byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static Double[] o00oOo00(@oo0oO0 double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static Integer[] o00oOo0O(@oo0oO0 int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static Long[] o00oOo0o(@oo0oO0 long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static double[] o00oOoO(@oo0oO0 Double[] dArr) {
        double[] dArr2 = new double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = dArr[i].doubleValue();
        }
        return dArr2;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static byte[] o00oOoO0(@oo0oO0 Byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[i].byteValue();
        }
        return bArr2;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static float[] o00oOoOO(@oo0oO0 Float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = fArr[i].floatValue();
        }
        return fArr2;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static int[] o00oOoOo(@oo0oO0 Integer[] numArr) {
        int[] iArr = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static long[] o00oOoo0(@oo0oO0 Long[] lArr) {
        long[] jArr = new long[lArr.length];
        for (int i = 0; i < lArr.length; i++) {
            jArr[i] = lArr[i].longValue();
        }
        return jArr;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static Float[] o00oOooO(@oo0oO0 float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static boolean[] o00oOooo(@oo0oO0 Boolean[] boolArr) {
        boolean[] zArr = new boolean[boolArr.length];
        for (int i = 0; i < boolArr.length; i++) {
            zArr[i] = boolArr[i].booleanValue();
        }
        return zArr;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x002c -> B:33:0x002c). Please submit an issue!!! */
    @o0O0O0o0
    @oo0oO0
    public static o00oOOoO o00oo00O(@oo0oO0 byte[] bArr) {
        ObjectInputStream objectInputStream;
        Throwable th;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap hashMap = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException unused) {
            }
            try {
                for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                    hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                }
                objectInputStream.close();
            } catch (IOException | ClassNotFoundException unused2) {
                objectInputStream2 = objectInputStream;
                if (objectInputStream2 != null) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th = th2;
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                try {
                    byteArrayInputStream.close();
                } catch (IOException unused4) {
                }
                throw th;
            }
        } catch (IOException | ClassNotFoundException unused5) {
        } catch (Throwable th3) {
            objectInputStream = null;
            th = th3;
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException unused6) {
            return new o00oOOoO(hashMap);
        }
    }

    @o0O0O0o0
    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static byte[] o00ooOo0(@oo0oO0 o00oOOoO o00ooooo2) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            objectOutputStream.writeInt(o00ooooo2.o00ooOO());
            for (Map.Entry<String, Object> entry : o00ooooo2.f5765o00oOOo0.entrySet()) {
                objectOutputStream.writeUTF(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException unused2) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused3) {
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException unused4) {
            objectOutputStream2 = objectOutputStream;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException unused5) {
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused6) {
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException unused7) {
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused8) {
            }
            throw th;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || o00oOOoO.class != obj.getClass()) {
            return false;
        }
        o00oOOoO o00ooooo2 = (o00oOOoO) obj;
        Set<String> keySet = this.f5765o00oOOo0.keySet();
        if (keySet.equals(o00ooooo2.f5765o00oOOo0.keySet())) {
            for (String str : keySet) {
                Object obj2 = this.f5765o00oOOo0.get(str);
                Object obj3 = o00ooooo2.f5765o00oOOo0.get(str);
                if (obj2 == null || obj3 == null) {
                    if (obj2 == obj3) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                } else if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                    continue;
                } else {
                    z = obj2.equals(obj3);
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5765o00oOOo0.hashCode() * 31;
    }

    @o0OO00OO
    public int[] o00oo(@oo0oO0 String str) {
        Object obj = this.f5765o00oOOo0.get(str);
        if (obj instanceof Integer[]) {
            return o00oOoOo((Integer[]) obj);
        }
        return null;
    }

    public boolean o00oo0(@oo0oO0 String str, boolean z) {
        Object obj = this.f5765o00oOOo0.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    @o0OO00OO
    public byte[] o00oo0O(@oo0oO0 String str) {
        Object obj = this.f5765o00oOOo0.get(str);
        if (obj instanceof Byte[]) {
            return o00oOoO0((Byte[]) obj);
        }
        return null;
    }

    public byte o00oo0O0(@oo0oO0 String str, byte b) {
        Object obj = this.f5765o00oOOo0.get(str);
        return obj instanceof Byte ? ((Byte) obj).byteValue() : b;
    }

    @o0OO00OO
    public boolean[] o00oo0OO(@oo0oO0 String str) {
        Object obj = this.f5765o00oOOo0.get(str);
        if (obj instanceof Boolean[]) {
            return o00oOooo((Boolean[]) obj);
        }
        return null;
    }

    public double o00oo0Oo(@oo0oO0 String str, double d) {
        Object obj = this.f5765o00oOOo0.get(str);
        return obj instanceof Double ? ((Double) obj).doubleValue() : d;
    }

    public float o00oo0o(@oo0oO0 String str, float f) {
        Object obj = this.f5765o00oOOo0.get(str);
        return obj instanceof Float ? ((Float) obj).floatValue() : f;
    }

    @o0OO00OO
    public double[] o00oo0o0(@oo0oO0 String str) {
        Object obj = this.f5765o00oOOo0.get(str);
        if (obj instanceof Double[]) {
            return o00oOoO((Double[]) obj);
        }
        return null;
    }

    @o0OO00OO
    public float[] o00oo0oO(@oo0oO0 String str) {
        Object obj = this.f5765o00oOOo0.get(str);
        if (obj instanceof Float[]) {
            return o00oOoOO((Float[]) obj);
        }
        return null;
    }

    @o0OO00OO
    public String[] o00ooO(@oo0oO0 String str) {
        Object obj = this.f5765o00oOOo0.get(str);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    public long o00ooO0(@oo0oO0 String str, long j) {
        Object obj = this.f5765o00oOOo0.get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j;
    }

    @oo0oO0
    public Map<String, Object> o00ooO00() {
        return Collections.unmodifiableMap(this.f5765o00oOOo0);
    }

    @o0OO00OO
    public long[] o00ooO0O(@oo0oO0 String str) {
        Object obj = this.f5765o00oOOo0.get(str);
        if (obj instanceof Long[]) {
            return o00oOoo0((Long[]) obj);
        }
        return null;
    }

    @o0OO00OO
    public String o00ooO0o(@oo0oO0 String str) {
        Object obj = this.f5765o00oOOo0.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public int o00ooOO() {
        return this.f5765o00oOOo0.size();
    }

    public <T> boolean o00ooOO0(@oo0oO0 String str, @oo0oO0 Class<T> cls) {
        Object obj = this.f5765o00oOOo0.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    @oo0oO0
    public byte[] o00ooOOo() {
        return o00ooOo0(this);
    }

    public int o0O0o(@oo0oO0 String str, int i) {
        Object obj = this.f5765o00oOOo0.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i;
    }

    @oo0oO0
    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f5765o00oOOo0.isEmpty()) {
            for (String str : this.f5765o00oOOo0.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f5765o00oOOo0.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
