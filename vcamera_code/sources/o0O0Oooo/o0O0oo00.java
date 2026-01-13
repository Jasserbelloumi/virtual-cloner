package o0O0Oooo;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.support.v4.media.o00oOoO;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.collection.o00oOo00;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class o0O0oo00 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f12216o00oOo0O = -1;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f12217o00oOo0o = -2;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f12218o00oOoO = -4;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f12219o00oOoO0 = -3;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f12220o00oOoOO = -5;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f12221o00oOoOo = -6;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f12222o00oOoo0 = -7;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f12223o00oOooO = "VersionedParcel";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f12224o00oOooo = -9;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f12225o00oo0 = 2;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f12226o00oo00O = 1;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f12227o00oo0O = 5;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f12228o00oo0O0 = 4;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f12229o00oo0OO = 3;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f12230o00oo0Oo = 7;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f12231o00oo0o0 = 8;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final androidx.collection.o00oOOo0<String, Method> f12232o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final androidx.collection.o00oOOo0<String, Method> f12233o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final androidx.collection.o00oOOo0<String, Class> f12234o00oOo00;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends ObjectInputStream {
        public o00oOOo0(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends RuntimeException {
        public o00oOOoO(Throwable th) {
            super(th);
        }
    }

    public o0O0oo00(androidx.collection.o00oOOo0<String, Method> o00oooo02, androidx.collection.o00oOOo0<String, Method> o00oooo03, androidx.collection.o00oOOo0<String, Class> o00oooo04) {
        this.f12232o00oOOo0 = o00oooo02;
        this.f12233o00oOOoO = o00oooo03;
        this.f12234o00oOo00 = o00oooo04;
    }

    @o00oOooO.oo0oO0
    public static Throwable o00oOo0o(@o00oOooO.oo0oO0 Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> o0(Map<K, V> map, int i) {
        if (o00ooOo0(i)) {
            int o00ooo0O2 = o00ooo0O();
            if (o00ooo0O2 < 0) {
                return null;
            }
            androidx.collection.o00oOOo0 o00oooo02 = new androidx.collection.o00oOOo0();
            if (o00ooo0O2 == 0) {
                return o00oooo02;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            o00ooO00(arrayList);
            o00ooO00(arrayList2);
            for (int i2 = 0; i2 < o00ooo0O2; i2++) {
                o00oooo02.put(arrayList.get(i2), arrayList2.get(i2));
            }
            return o00oooo02;
        }
        return map;
    }

    public abstract void o00oOOo0();

    public final Exception o00oOOoO(int i, String str) {
        switch (i) {
            case f12224o00oOooo /* -9 */:
                return (Exception) o0O00000();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i + " msg " + str);
            case f12222o00oOoo0 /* -7 */:
                return new UnsupportedOperationException(str);
            case f12221o00oOoOo /* -6 */:
                return new NetworkOnMainThreadException();
            case -5:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    public abstract o0O0oo00 o00oOo00();

    public final Method o00oOo0O(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f12232o00oOOo0.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, o0O0oo00.class.getClassLoader()).getDeclaredMethod("read", o0O0oo00.class);
            this.f12232o00oOOo0.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method o00oOoO(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f12233o00oOOoO.get(cls.getName());
        if (method == null) {
            Class o00oOooO2 = o00oOooO(cls);
            System.currentTimeMillis();
            Method declaredMethod = o00oOooO2.getDeclaredMethod("write", cls, o0O0oo00.class);
            this.f12233o00oOOoO.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final <T> int o00oOoO0(T t) {
        if (t instanceof String) {
            return 4;
        }
        if (t instanceof Parcelable) {
            return 2;
        }
        if (t instanceof o0OO000o) {
            return 1;
        }
        if (t instanceof Serializable) {
            return 3;
        }
        if (t instanceof IBinder) {
            return 5;
        }
        if (t instanceof Integer) {
            return 7;
        }
        if (t instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t.getClass().getName() + " cannot be VersionedParcelled");
    }

    public boolean o00oOoOO() {
        return false;
    }

    public <T> T[] o00oOoOo(T[] tArr) {
        int o00ooo0O2 = o00ooo0O();
        if (o00ooo0O2 < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(o00ooo0O2);
        if (o00ooo0O2 != 0) {
            int o00ooo0O3 = o00ooo0O();
            if (o00ooo0O2 < 0) {
                return null;
            }
            if (o00ooo0O3 == 1) {
                while (o00ooo0O2 > 0) {
                    arrayList.add(o0O000oo());
                    o00ooo0O2--;
                }
            } else if (o00ooo0O3 == 2) {
                while (o00ooo0O2 > 0) {
                    arrayList.add(o0O00000());
                    o00ooo0O2--;
                }
            } else if (o00ooo0O3 == 3) {
                while (o00ooo0O2 > 0) {
                    arrayList.add(o0O0000o());
                    o00ooo0O2--;
                }
            } else if (o00ooo0O3 == 4) {
                while (o00ooo0O2 > 0) {
                    arrayList.add(o0OoOoOO());
                    o00ooo0O2--;
                }
            } else if (o00ooo0O3 == 5) {
                while (o00ooo0O2 > 0) {
                    arrayList.add(o0O000o());
                    o00ooo0O2--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public <T> T[] o00oOoo0(T[] tArr, int i) {
        return !o00ooOo0(i) ? tArr : (T[]) o00oOoOo(tArr);
    }

    public final Class o00oOooO(Class<? extends o0OO000o> cls) throws ClassNotFoundException {
        Class cls2 = this.f12234o00oOo00.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f12234o00oOo00.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public abstract boolean o00oOooo();

    public CharSequence o00oo(CharSequence charSequence, int i) {
        return !o00ooOo0(i) ? charSequence : o0O0o();
    }

    public boolean[] o00oo0() {
        int o00ooo0O2 = o00ooo0O();
        if (o00ooo0O2 < 0) {
            return null;
        }
        boolean[] zArr = new boolean[o00ooo0O2];
        for (int i = 0; i < o00ooo0O2; i++) {
            zArr[i] = o00ooo0O() != 0;
        }
        return zArr;
    }

    public boolean o00oo00O(boolean z, int i) {
        return !o00ooOo0(i) ? z : o00oOooo();
    }

    public Bundle o00oo0O(Bundle bundle, int i) {
        return !o00ooOo0(i) ? bundle : o00oo0O0();
    }

    public abstract Bundle o00oo0O0();

    public boolean[] o00oo0OO(boolean[] zArr, int i) {
        return !o00ooOo0(i) ? zArr : o00oo0();
    }

    public byte o00oo0Oo(byte b, int i) {
        return !o00ooOo0(i) ? b : (byte) (o00ooo0O() & 255);
    }

    public byte[] o00oo0o(byte[] bArr, int i) {
        return !o00ooOo0(i) ? bArr : o00oo0o0();
    }

    public abstract byte[] o00oo0o0();

    public char[] o00oo0oO(char[] cArr, int i) {
        if (o00ooOo0(i)) {
            int o00ooo0O2 = o00ooo0O();
            if (o00ooo0O2 < 0) {
                return null;
            }
            char[] cArr2 = new char[o00ooo0O2];
            for (int i2 = 0; i2 < o00ooo0O2; i2++) {
                cArr2[i2] = (char) o00ooo0O();
            }
            return cArr2;
        }
        return cArr;
    }

    public double[] o00ooO(double[] dArr, int i) {
        return !o00ooOo0(i) ? dArr : o00ooO0o();
    }

    public abstract double o00ooO0();

    public final <T, S extends Collection<T>> S o00ooO00(S s) {
        int o00ooo0O2 = o00ooo0O();
        if (o00ooo0O2 < 0) {
            return null;
        }
        if (o00ooo0O2 != 0) {
            int o00ooo0O3 = o00ooo0O();
            if (o00ooo0O2 < 0) {
                return null;
            }
            if (o00ooo0O3 == 1) {
                while (o00ooo0O2 > 0) {
                    s.add(o0O000oo());
                    o00ooo0O2--;
                }
            } else if (o00ooo0O3 == 2) {
                while (o00ooo0O2 > 0) {
                    s.add(o0O00000());
                    o00ooo0O2--;
                }
            } else if (o00ooo0O3 == 3) {
                while (o00ooo0O2 > 0) {
                    s.add(o0O0000o());
                    o00ooo0O2--;
                }
            } else if (o00ooo0O3 == 4) {
                while (o00ooo0O2 > 0) {
                    s.add(o0OoOoOO());
                    o00ooo0O2--;
                }
            } else if (o00ooo0O3 == 5) {
                while (o00ooo0O2 > 0) {
                    s.add(o0O000o());
                    o00ooo0O2--;
                }
            }
        }
        return s;
    }

    public double o00ooO0O(double d, int i) {
        return !o00ooOo0(i) ? d : o00ooO0();
    }

    public double[] o00ooO0o() {
        int o00ooo0O2 = o00ooo0O();
        if (o00ooo0O2 < 0) {
            return null;
        }
        double[] dArr = new double[o00ooo0O2];
        for (int i = 0; i < o00ooo0O2; i++) {
            dArr[i] = o00ooO0();
        }
        return dArr;
    }

    public Exception o00ooOO(Exception exc, int i) {
        int o00ooOOo2;
        return (o00ooOo0(i) && (o00ooOOo2 = o00ooOOo()) != 0) ? o00ooOO0(o00ooOOo2, o0OoOoOO()) : exc;
    }

    public final Exception o00ooOO0(int i, String str) {
        return o00oOOoO(i, str);
    }

    public final int o00ooOOo() {
        return o00ooo0O();
    }

    public abstract float o00ooOo();

    public abstract boolean o00ooOo0(int i);

    public float o00ooOoO(float f, int i) {
        return !o00ooOo0(i) ? f : o00ooOo();
    }

    public float[] o00ooOoo() {
        int o00ooo0O2 = o00ooo0O();
        if (o00ooo0O2 < 0) {
            return null;
        }
        float[] fArr = new float[o00ooo0O2];
        for (int i = 0; i < o00ooo0O2; i++) {
            fArr[i] = o00ooOo();
        }
        return fArr;
    }

    public <T extends o0OO000o> T o00ooo0(String str, o0O0oo00 o0o0oo00) {
        try {
            return (T) o00oOo0O(str).invoke(null, o0o0oo00);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public float[] o00ooo00(float[] fArr, int i) {
        return !o00ooOo0(i) ? fArr : o00ooOoo();
    }

    public abstract int o00ooo0O();

    public int o00ooo0o(int i, int i2) {
        return !o00ooOo0(i2) ? i : o00ooo0O();
    }

    public int[] o00oooO() {
        int o00ooo0O2 = o00ooo0O();
        if (o00ooo0O2 < 0) {
            return null;
        }
        int[] iArr = new int[o00ooo0O2];
        for (int i = 0; i < o00ooo0O2; i++) {
            iArr[i] = o00ooo0O();
        }
        return iArr;
    }

    public int[] o00oooOO(int[] iArr, int i) {
        return !o00ooOo0(i) ? iArr : o00oooO();
    }

    public <T> List<T> o00oooOo(List<T> list, int i) {
        return !o00ooOo0(i) ? list : (List) o00ooO00(new ArrayList());
    }

    public long o00oooo(long j, int i) {
        return !o00ooOo0(i) ? j : o00oooo0();
    }

    public abstract long o00oooo0();

    public long[] o00ooooO() {
        int o00ooo0O2 = o00ooo0O();
        if (o00ooo0O2 < 0) {
            return null;
        }
        long[] jArr = new long[o00ooo0O2];
        for (int i = 0; i < o00ooo0O2; i++) {
            jArr[i] = o00oooo0();
        }
        return jArr;
    }

    public long[] o00ooooo(long[] jArr, int i) {
        return !o00ooOo0(i) ? jArr : o00ooooO();
    }

    public <T extends o0OO000o> T o0O00(T t, int i) {
        return !o00ooOo0(i) ? t : (T) o0O000oo();
    }

    public <T> Set<T> o0O000(Set<T> set, int i) {
        return !o00ooOo0(i) ? set : (Set) o00ooO00(new o00oOo00());
    }

    public abstract <T extends Parcelable> T o0O00000();

    public <T extends Parcelable> T o0O0000O(T t, int i) {
        return !o00ooOo0(i) ? t : (T) o0O00000();
    }

    public Serializable o0O0000o() {
        String o0OoOoOO2 = o0OoOoOO();
        if (o0OoOoOO2 == null) {
            return null;
        }
        try {
            return (Serializable) new o00oOOo0(new ByteArrayInputStream(o00oo0o0())).readObject();
        } catch (IOException e) {
            throw new RuntimeException(o00oOoO.o00oOOo0("VersionedParcelable encountered IOException reading a Serializable object (name = ", o0OoOoOO2, ")"), e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(o00oOoO.o00oOOo0("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = ", o0OoOoOO2, ")"), e2);
        }
    }

    @o0OOooO0(api = 21)
    public Size o0O000O(Size size, int i) {
        if (o00ooOo0(i)) {
            if (o00oOooo()) {
                return new Size(o00ooo0O(), o00ooo0O());
            }
            return null;
        }
        return size;
    }

    public SparseBooleanArray o0O000Oo(SparseBooleanArray sparseBooleanArray, int i) {
        if (o00ooOo0(i)) {
            int o00ooo0O2 = o00ooo0O();
            if (o00ooo0O2 < 0) {
                return null;
            }
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(o00ooo0O2);
            for (int i2 = 0; i2 < o00ooo0O2; i2++) {
                sparseBooleanArray2.put(o00ooo0O(), o00oOooo());
            }
            return sparseBooleanArray2;
        }
        return sparseBooleanArray;
    }

    public abstract IBinder o0O000o();

    public String o0O000o0(String str, int i) {
        return !o00ooOo0(i) ? str : o0OoOoOO();
    }

    public <T extends o0OO000o> T o0O000oo() {
        String o0OoOoOO2 = o0OoOoOO();
        if (o0OoOoOO2 == null) {
            return null;
        }
        return (T) o00ooo0(o0OoOoOO2, o00oOo00());
    }

    public <T> void o0O00O(T[] tArr, int i) {
        o0O00O0(i);
        o0O00O0o(tArr);
    }

    public abstract void o0O00O0(int i);

    public <T> void o0O00O0o(T[] tArr) {
        if (tArr == null) {
            o0O0OOOo(-1);
            return;
        }
        int length = tArr.length;
        o0O0OOOo(length);
        if (length > 0) {
            int i = 0;
            int o00oOoO02 = o00oOoO0(tArr[0]);
            o0O0OOOo(o00oOoO02);
            if (o00oOoO02 == 1) {
                while (i < length) {
                    o0O0o0o((o0OO000o) tArr[i]);
                    i++;
                }
            } else if (o00oOoO02 == 2) {
                while (i < length) {
                    oo0OOoo((Parcelable) tArr[i]);
                    i++;
                }
            } else if (o00oOoO02 == 3) {
                while (i < length) {
                    o0O0OoOo((Serializable) tArr[i]);
                    i++;
                }
            } else if (o00oOoO02 == 4) {
                while (i < length) {
                    o0O0o00O((String) tArr[i]);
                    i++;
                }
            } else if (o00oOoO02 != 5) {
            } else {
                while (i < length) {
                    o0O0o0((IBinder) tArr[i]);
                    i++;
                }
            }
        }
    }

    public abstract void o0O00OO(boolean z);

    public void o0O00OOO(boolean z, int i) {
        o0O00O0(i);
        o0O00OO(z);
    }

    public void o0O00Oo(boolean[] zArr) {
        if (zArr == null) {
            o0O0OOOo(-1);
            return;
        }
        o0O0OOOo(zArr.length);
        for (boolean z : zArr) {
            o0O0OOOo(z ? 1 : 0);
        }
    }

    public abstract void o0O00OoO(Bundle bundle);

    public void o0O00Ooo(Bundle bundle, int i) {
        o0O00O0(i);
        o0O00OoO(bundle);
    }

    public abstract void o0O00o(byte[] bArr, int i, int i2);

    public void o0O00o00(byte b, int i) {
        o0O00O0(i);
        o0O0OOOo(b);
    }

    public abstract void o0O00o0O(byte[] bArr);

    public void o0O00o0o(byte[] bArr, int i) {
        o0O00O0(i);
        o0O00o0O(bArr);
    }

    public void o0O00oO0(byte[] bArr, int i, int i2, int i3) {
        o0O00O0(i3);
        o0O00o(bArr, i, i2);
    }

    public void o0O0O0O(char[] cArr, int i) {
        o0O00O0(i);
        if (cArr == null) {
            o0O0OOOo(-1);
            return;
        }
        o0O0OOOo(cArr.length);
        for (char c : cArr) {
            o0O0OOOo(c);
        }
    }

    public final <T> void o0O0O0Oo(Collection<T> collection) {
        if (collection == null) {
            o0O0OOOo(-1);
            return;
        }
        int size = collection.size();
        o0O0OOOo(size);
        if (size > 0) {
            int o00oOoO02 = o00oOoO0(collection.iterator().next());
            o0O0OOOo(o00oOoO02);
            switch (o00oOoO02) {
                case 1:
                    for (T t : collection) {
                        o0O0o0o(t);
                    }
                    return;
                case 2:
                    for (T t2 : collection) {
                        oo0OOoo(t2);
                    }
                    return;
                case 3:
                    for (T t3 : collection) {
                        o0O0OoOo(t3);
                    }
                    return;
                case 4:
                    for (T t4 : collection) {
                        o0O0o00O(t4);
                    }
                    return;
                case 5:
                    for (T t5 : collection) {
                        o0O0o0(t5);
                    }
                    return;
                case 6:
                default:
                    return;
                case 7:
                    for (T t6 : collection) {
                        o0O0OOOo(t6.intValue());
                    }
                    return;
                case 8:
                    for (T t7 : collection) {
                        o0O0OO0O(t7.floatValue());
                    }
                    return;
            }
        }
    }

    public abstract void o0O0O0o(double d);

    public final <T> void o0O0O0o0(Collection<T> collection, int i) {
        o0O00O0(i);
        o0O0O0Oo(collection);
    }

    public void o0O0O0oO(double d, int i) {
        o0O00O0(i);
        o0O0O0o(d);
    }

    public void o0O0O0oo(double[] dArr) {
        if (dArr == null) {
            o0O0OOOo(-1);
            return;
        }
        o0O0OOOo(dArr.length);
        for (double d : dArr) {
            o0O0O0o(d);
        }
    }

    public void o0O0OO(float f, int i) {
        o0O00O0(i);
        o0O0OO0O(f);
    }

    public void o0O0OO0(Exception exc, int i) {
        o0O00O0(i);
        if (exc == null) {
            o0O0OoO0();
            return;
        }
        int i2 = 0;
        if ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            i2 = -9;
        } else if (exc instanceof SecurityException) {
            i2 = -1;
        } else if (exc instanceof BadParcelableException) {
            i2 = -2;
        } else if (exc instanceof IllegalArgumentException) {
            i2 = -3;
        } else if (exc instanceof NullPointerException) {
            i2 = -4;
        } else if (exc instanceof IllegalStateException) {
            i2 = -5;
        } else if (exc instanceof NetworkOnMainThreadException) {
            i2 = -6;
        } else if (exc instanceof UnsupportedOperationException) {
            i2 = -7;
        }
        o0O0OOOo(i2);
        if (i2 == 0) {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
        o0O0o00O(exc.getMessage());
        if (i2 != -9) {
            return;
        }
        oo0OOoo((Parcelable) exc);
    }

    public abstract void o0O0OO0O(float f);

    public void o0O0OOO(float[] fArr, int i) {
        o0O00O0(i);
        o0O0OOO0(fArr);
    }

    public void o0O0OOO0(float[] fArr) {
        if (fArr == null) {
            o0O0OOOo(-1);
            return;
        }
        o0O0OOOo(fArr.length);
        for (float f : fArr) {
            o0O0OO0O(f);
        }
    }

    public abstract void o0O0OOOo(int i);

    public void o0O0OOo(int i, int i2) {
        o0O00O0(i2);
        o0O0OOOo(i);
    }

    public void o0O0OOoO(int[] iArr) {
        if (iArr == null) {
            o0O0OOOo(-1);
            return;
        }
        o0O0OOOo(iArr.length);
        for (int i : iArr) {
            o0O0OOOo(i);
        }
    }

    public void o0O0OOoo(int[] iArr, int i) {
        o0O00O0(i);
        o0O0OOoO(iArr);
    }

    public void o0O0Oo(long[] jArr, int i) {
        o0O00O0(i);
        o0O0Oo0o(jArr);
    }

    public abstract void o0O0Oo0(long j);

    public void o0O0Oo0O(long j, int i) {
        o0O00O0(i);
        o0O0Oo0(j);
    }

    public void o0O0Oo0o(long[] jArr) {
        if (jArr == null) {
            o0O0OOOo(-1);
            return;
        }
        o0O0OOOo(jArr.length);
        for (long j : jArr) {
            o0O0Oo0(j);
        }
    }

    public void o0O0OoO(Parcelable parcelable, int i) {
        o0O00O0(i);
        oo0OOoo(parcelable);
    }

    public void o0O0OoO0() {
        o0O0OOOo(0);
    }

    public final void o0O0OoOo(Serializable serializable) {
        if (serializable == null) {
            o0O0o00O(null);
            return;
        }
        String name = serializable.getClass().getName();
        o0O0o00O(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            o0O00o0O(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(o00oOoO.o00oOOo0("VersionedParcelable encountered IOException writing serializable object (name = ", name, ")"), e);
        }
    }

    public <T> void o0O0Ooo(Set<T> set, int i) {
        o0O0O0o0(set, i);
    }

    public void o0O0Ooo0(Serializable serializable, int i) {
        o0O00O0(i);
        o0O0OoOo(serializable);
    }

    @o0OOooO0(api = 21)
    public void o0O0OooO(Size size, int i) {
        o0O00O0(i);
        o0O00OO(size != null);
        if (size != null) {
            o0O0OOOo(size.getWidth());
            o0O0OOOo(size.getHeight());
        }
    }

    public <K, V> void o0O0Oooo(Map<K, V> map, int i) {
        o0O00O0(i);
        if (map == null) {
            o0O0OOOo(-1);
            return;
        }
        int size = map.size();
        o0O0OOOo(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        o0O0O0Oo(arrayList);
        o0O0O0Oo(arrayList2);
    }

    public abstract CharSequence o0O0o();

    public abstract void o0O0o0(IBinder iBinder);

    public void o0O0o00(SparseBooleanArray sparseBooleanArray, int i) {
        o0O00O0(i);
        if (sparseBooleanArray == null) {
            o0O0OOOo(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        o0O0OOOo(size);
        for (int i2 = 0; i2 < size; i2++) {
            o0O0OOOo(sparseBooleanArray.keyAt(i2));
            o0O00OO(sparseBooleanArray.valueAt(i2));
        }
    }

    @o0OOooO0(api = 21)
    public void o0O0o000(SizeF sizeF, int i) {
        o0O00O0(i);
        o0O00OO(sizeF != null);
        if (sizeF != null) {
            o0O0OO0O(sizeF.getWidth());
            o0O0OO0O(sizeF.getHeight());
        }
    }

    public abstract void o0O0o00O(String str);

    public void o0O0o00o(String str, int i) {
        o0O00O0(i);
        o0O0o00O(str);
    }

    public void o0O0o0O(IBinder iBinder, int i) {
        o0O00O0(i);
        o0O0o0(iBinder);
    }

    public abstract void o0O0o0OO(IInterface iInterface);

    public void o0O0o0Oo(IInterface iInterface, int i) {
        o0O00O0(i);
        o0O0o0OO(iInterface);
    }

    public void o0O0o0o(o0OO000o o0oo000o) {
        if (o0oo000o == null) {
            o0O0o00O(null);
            return;
        }
        o0O0o0oO(o0oo000o);
        o0O0oo00 o00oOo002 = o00oOo00();
        o0O0o0o0(o0oo000o, o00oOo002);
        o00oOo002.o00oOOo0();
    }

    public <T extends o0OO000o> void o0O0o0o0(T t, o0O0oo00 o0o0oo00) {
        try {
            o00oOoO(t.getClass()).invoke(null, t, o0o0oo00);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0O0o0oO(o0OO000o o0oo000o) {
        try {
            o0O0o00O(o00oOooO(o0oo000o.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(o0oo000o.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    public void o0O0oo0o(CharSequence charSequence, int i) {
        o0O00O0(i);
        o0oO0O0o(charSequence);
    }

    public void o0OoO00O(boolean z, boolean z2) {
    }

    public abstract String o0OoOoOO();

    @o0OOooO0(api = 21)
    public SizeF o0OoOoOo(SizeF sizeF, int i) {
        if (o00ooOo0(i)) {
            if (o00oOooo()) {
                return new SizeF(o00ooOo(), o00ooOo());
            }
            return null;
        }
        return sizeF;
    }

    public <T> void o0OooO0(List<T> list, int i) {
        o0O0O0o0(list, i);
    }

    public abstract void o0oO0O0o(CharSequence charSequence);

    public void o0oO0Ooo(boolean[] zArr, int i) {
        o0O00O0(i);
        o0O00Oo(zArr);
    }

    public void o0oOo0O0(o0OO000o o0oo000o, int i) {
        o0O00O0(i);
        o0O0o0o(o0oo000o);
    }

    public void o0ooO(double[] dArr, int i) {
        o0O00O0(i);
        o0O0O0oo(dArr);
    }

    public IBinder o0ooOoOO(IBinder iBinder, int i) {
        return !o00ooOo0(i) ? iBinder : o0O000o();
    }

    public abstract void oo0OOoo(Parcelable parcelable);
}
