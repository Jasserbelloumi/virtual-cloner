package o0OO0oO;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import o00ooOoo.oO00O0oO;
import org.jetbrains.annotations.NotNull;
@o0OOOOO0.o0OOO00({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3420:1\n14166#2,14:3421\n14189#2,14:3435\n14212#2,14:3449\n14235#2,14:3463\n14258#2,14:3477\n14281#2,14:3491\n14304#2,14:3505\n14327#2,14:3519\n14350#2,14:3533\n16752#2,14:3547\n16775#2,14:3561\n16798#2,14:3575\n16821#2,14:3589\n16844#2,14:3603\n16867#2,14:3617\n16890#2,14:3631\n16913#2,14:3645\n16936#2,14:3659\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n*L\n2812#1:3421,14\n2819#1:3435,14\n2826#1:3449,14\n2833#1:3463,14\n2840#1:3477,14\n2847#1:3491,14\n2854#1:3505,14\n2861#1:3519,14\n2868#1:3533,14\n3010#1:3547,14\n3017#1:3561,14\n3024#1:3575,14\n3031#1:3589,14\n3038#1:3603,14\n3045#1:3617,14\n3052#1:3631,14\n3059#1:3645,14\n3066#1:3659,14\n*E\n"})
/* loaded from: classes3.dex */
public class o0O00000 extends o00ooO {

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0OO0oO.o00oOo00<Byte> implements RandomAccess {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ byte[] f13322o00oo0O0;

        public o00oOOo0(byte[] bArr) {
            this.f13322o00oo0O0 = bArr;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return o00oOOo0(((Number) obj).byteValue());
            }
            return false;
        }

        @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
        public int getSize() {
            return this.f13322o00oo0O0.length;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return o00oOo00(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public boolean isEmpty() {
            return this.f13322o00oo0O0.length == 0;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return o00oOooO(((Number) obj).byteValue());
            }
            return -1;
        }

        public boolean o00oOOo0(byte b) {
            return o0O000O.o0ooooOo(this.f13322o00oo0O0, b);
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        @NotNull
        /* renamed from: o00oOOoO */
        public Byte get(int i) {
            return Byte.valueOf(this.f13322o00oo0O0[i]);
        }

        public int o00oOo00(byte b) {
            return o0O000O.oOO0o0OO(this.f13322o00oo0O0, b);
        }

        public int o00oOooO(byte b) {
            return o0O000O.oOOOoOO0(this.f13322o00oo0O0, b);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0OO0oO.o00oOo00<Short> implements RandomAccess {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ short[] f13323o00oo0O0;

        public o00oOOoO(short[] sArr) {
            this.f13323o00oo0O0 = sArr;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Short) {
                return o00oOOo0(((Number) obj).shortValue());
            }
            return false;
        }

        @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
        public int getSize() {
            return this.f13323o00oo0O0.length;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Short) {
                return o00oOo00(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public boolean isEmpty() {
            return this.f13323o00oo0O0.length == 0;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Short) {
                return o00oOooO(((Number) obj).shortValue());
            }
            return -1;
        }

        public boolean o00oOOo0(short s) {
            return o0O000O.oO00000(this.f13323o00oo0O0, s);
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        @NotNull
        /* renamed from: o00oOOoO */
        public Short get(int i) {
            return Short.valueOf(this.f13323o00oo0O0[i]);
        }

        public int o00oOo00(short s) {
            return o0O000O.oOO0oO00(this.f13323o00oo0O0, s);
        }

        public int o00oOooO(short s) {
            return o0O000O.oOOOoo0(this.f13323o00oo0O0, s);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0OO0oO.o00oOo00<Integer> implements RandomAccess {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ int[] f13324o00oo0O0;

        public o00oOo00(int[] iArr) {
            this.f13324o00oo0O0 = iArr;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return o00oOOo0(((Number) obj).intValue());
            }
            return false;
        }

        @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
        public int getSize() {
            return this.f13324o00oo0O0.length;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return o00oOo00(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public boolean isEmpty() {
            return this.f13324o00oo0O0.length == 0;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return o00oOooO(((Number) obj).intValue());
            }
            return -1;
        }

        public boolean o00oOOo0(int i) {
            return o0O000O.o0oooooO(this.f13324o00oo0O0, i);
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        @NotNull
        /* renamed from: o00oOOoO */
        public Integer get(int i) {
            return Integer.valueOf(this.f13324o00oo0O0[i]);
        }

        public int o00oOo00(int i) {
            return o0O000O.oOO0o0o(this.f13324o00oo0O0, i);
        }

        public int o00oOooO(int i) {
            return o0O000O.oOOOoOo0(this.f13324o00oo0O0, i);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0OO0oO.o00oOo00<Long> implements RandomAccess {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ long[] f13325o00oo0O0;

        public o00oOo0O(long[] jArr) {
            this.f13325o00oo0O0 = jArr;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Long) {
                return o00oOOo0(((Number) obj).longValue());
            }
            return false;
        }

        @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
        public int getSize() {
            return this.f13325o00oo0O0.length;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Long) {
                return o00oOo00(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public boolean isEmpty() {
            return this.f13325o00oo0O0.length == 0;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return o00oOooO(((Number) obj).longValue());
            }
            return -1;
        }

        public boolean o00oOOo0(long j) {
            return o0O000O.o0oooooo(this.f13325o00oo0O0, j);
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        @NotNull
        /* renamed from: o00oOOoO */
        public Long get(int i) {
            return Long.valueOf(this.f13325o00oo0O0[i]);
        }

        public int o00oOo00(long j) {
            return o0O000O.oOO0o0oO(this.f13325o00oo0O0, j);
        }

        public int o00oOooO(long j) {
            return o0O000O.oOOOoOo(this.f13325o00oo0O0, j);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3420:1\n12794#2,2:3421\n1687#2,6:3423\n1795#2,6:3429\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n*L\n199#1:3421,2\n201#1:3423,6\n202#1:3429,6\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOoO extends o0OO0oO.o00oOo00<Float> implements RandomAccess {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ float[] f13326o00oo0O0;

        public o00oOoO(float[] fArr) {
            this.f13326o00oo0O0 = fArr;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return o00oOOo0(((Number) obj).floatValue());
            }
            return false;
        }

        @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
        public int getSize() {
            return this.f13326o00oo0O0.length;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return o00oOo00(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public boolean isEmpty() {
            return this.f13326o00oo0O0.length == 0;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return o00oOooO(((Number) obj).floatValue());
            }
            return -1;
        }

        public boolean o00oOOo0(float f) {
            for (float f2 : this.f13326o00oo0O0) {
                if (Float.floatToIntBits(f2) == Float.floatToIntBits(f)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        @NotNull
        /* renamed from: o00oOOoO */
        public Float get(int i) {
            return Float.valueOf(this.f13326o00oo0O0[i]);
        }

        public int o00oOo00(float f) {
            float[] fArr = this.f13326o00oo0O0;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                if (Float.floatToIntBits(fArr[i]) == Float.floatToIntBits(f)) {
                    return i;
                }
            }
            return -1;
        }

        public int o00oOooO(float f) {
            float[] fArr = this.f13326o00oo0O0;
            int length = fArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f)) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oo0 extends o0OO0oO.o00oOo00<Boolean> implements RandomAccess {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ boolean[] f13327o00oo0O0;

        public o00oo0(boolean[] zArr) {
            this.f13327o00oo0O0 = zArr;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Boolean) {
                return o00oOOo0(((Boolean) obj).booleanValue());
            }
            return false;
        }

        @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
        public int getSize() {
            return this.f13327o00oo0O0.length;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Boolean) {
                return o00oOo00(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public boolean isEmpty() {
            return this.f13327o00oo0O0.length == 0;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Boolean) {
                return o00oOooO(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        public boolean o00oOOo0(boolean z) {
            return o0O000O.oO00000o(this.f13327o00oo0O0, z);
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        @NotNull
        /* renamed from: o00oOOoO */
        public Boolean get(int i) {
            return Boolean.valueOf(this.f13327o00oo0O0[i]);
        }

        public int o00oOo00(boolean z) {
            return o0O000O.oOO0oO0(this.f13327o00oo0O0, z);
        }

        public int o00oOooO(boolean z) {
            return o0O000O.oOOOoo0O(this.f13327o00oo0O0, z);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3420:1\n12804#2,2:3421\n1699#2,6:3423\n1807#2,6:3429\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n213#1:3421,2\n215#1:3423,6\n216#1:3429,6\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oo00O extends o0OO0oO.o00oOo00<Double> implements RandomAccess {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ double[] f13328o00oo0O0;

        public o00oo00O(double[] dArr) {
            this.f13328o00oo0O0 = dArr;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Double) {
                return o00oOOo0(((Number) obj).doubleValue());
            }
            return false;
        }

        @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
        public int getSize() {
            return this.f13328o00oo0O0.length;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Double) {
                return o00oOo00(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public boolean isEmpty() {
            return this.f13328o00oo0O0.length == 0;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return o00oOooO(((Number) obj).doubleValue());
            }
            return -1;
        }

        public boolean o00oOOo0(double d) {
            double[] dArr = this.f13328o00oo0O0;
            int length = dArr.length;
            for (int i = 0; i < length; i++) {
                if (Double.doubleToLongBits(dArr[i]) == Double.doubleToLongBits(d)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        @NotNull
        /* renamed from: o00oOOoO */
        public Double get(int i) {
            return Double.valueOf(this.f13328o00oo0O0[i]);
        }

        public int o00oOo00(double d) {
            double[] dArr = this.f13328o00oo0O0;
            int length = dArr.length;
            for (int i = 0; i < length; i++) {
                if (Double.doubleToLongBits(dArr[i]) == Double.doubleToLongBits(d)) {
                    return i;
                }
            }
            return -1;
        }

        public int o00oOooO(double d) {
            double[] dArr = this.f13328o00oo0O0;
            int length = dArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d)) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oo0OO extends o0OO0oO.o00oOo00<Character> implements RandomAccess {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ char[] f13329o00oo0O0;

        public o00oo0OO(char[] cArr) {
            this.f13329o00oo0O0 = cArr;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Character) {
                return o00oOOo0(((Character) obj).charValue());
            }
            return false;
        }

        @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
        public int getSize() {
            return this.f13329o00oo0O0.length;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Character) {
                return o00oOo00(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public boolean isEmpty() {
            return this.f13329o00oo0O0.length == 0;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return o00oOooO(((Character) obj).charValue());
            }
            return -1;
        }

        public boolean o00oOOo0(char c) {
            return o0O000O.o0ooooo0(this.f13329o00oo0O0, c);
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        @NotNull
        /* renamed from: o00oOOoO */
        public Character get(int i) {
            return Character.valueOf(this.f13329o00oo0O0[i]);
        }

        public int o00oOo00(char c) {
            return o0O000O.oOO0o0Oo(this.f13329o00oo0O0, c);
        }

        public int o00oOooO(char c) {
            return o0O000O.oOOOoOO(this.f13329o00oo0O0, c);
        }
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ boolean o0(byte[] bArr, byte[] bArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bArr2, "other");
        return Arrays.equals(bArr, bArr2);
    }

    public static final int o00oo(@NotNull byte[] bArr, byte b, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return Arrays.binarySearch(bArr, i, i2, b);
    }

    @NotNull
    public static final List<Byte> o00oo0(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return new o00oOOo0(bArr);
    }

    @NotNull
    public static final List<Float> o00oo0O(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return new o00oOoO(fArr);
    }

    @NotNull
    public static final List<Double> o00oo0O0(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return new o00oo00O(dArr);
    }

    @NotNull
    public static final List<Character> o00oo0OO(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return new o00oo0OO(cArr);
    }

    @NotNull
    public static final List<Integer> o00oo0Oo(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return new o00oOo00(iArr);
    }

    @NotNull
    public static final <T> List<T> o00oo0o(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        List<T> asList = Arrays.asList(tArr);
        o0OOOOO0.o0ooO.o00oo0OO(asList, "asList(this)");
        return asList;
    }

    @NotNull
    public static final List<Long> o00oo0o0(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return new o00oOo0O(jArr);
    }

    @NotNull
    public static final List<Short> o00oo0oO(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return new o00oOOoO(sArr);
    }

    public static final int o00ooO(@NotNull long[] jArr, long j, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return Arrays.binarySearch(jArr, i, i2, j);
    }

    public static final int o00ooO0(@NotNull double[] dArr, double d, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return Arrays.binarySearch(dArr, i, i2, d);
    }

    public static final int o00ooO00(@NotNull char[] cArr, char c, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return Arrays.binarySearch(cArr, i, i2, c);
    }

    public static final int o00ooO0O(@NotNull float[] fArr, float f, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return Arrays.binarySearch(fArr, i, i2, f);
    }

    public static final int o00ooO0o(@NotNull int[] iArr, int i, int i2, int i3) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return Arrays.binarySearch(iArr, i2, i3, i);
    }

    public static final <T> int o00ooOO(@NotNull T[] tArr, T t, @NotNull Comparator<? super T> comparator, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return Arrays.binarySearch(tArr, i, i2, t, comparator);
    }

    public static final <T> int o00ooOO0(@NotNull T[] tArr, T t, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return Arrays.binarySearch(tArr, i, i2, t);
    }

    public static final int o00ooOOo(@NotNull short[] sArr, short s, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return Arrays.binarySearch(sArr, i, i2, s);
    }

    public static /* synthetic */ int o00ooOo(char[] cArr, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        return o00ooO00(cArr, c, i, i2);
    }

    public static /* synthetic */ int o00ooOo0(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return o00oo(bArr, b, i, i2);
    }

    public static /* synthetic */ int o00ooOoO(double[] dArr, double d, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        return o00ooO0(dArr, d, i, i2);
    }

    public static /* synthetic */ int o00ooOoo(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        return o00ooO0O(fArr, f, i, i2);
    }

    public static /* synthetic */ int o00ooo0(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        return o00ooO(jArr, j, i, i2);
    }

    public static /* synthetic */ int o00ooo00(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        return o00ooO0o(iArr, i, i2, i3);
    }

    public static /* synthetic */ int o00ooo0O(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        return o00ooOO0(objArr, obj, i, i2);
    }

    public static /* synthetic */ int o00ooo0o(Object[] objArr, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        return o00ooOO(objArr, obj, comparator, i, i2);
    }

    public static /* synthetic */ int o00oooO(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        return o00ooOOo(sArr, s, i, i2);
    }

    @o0OOO0OO.o00oo0OO
    @o0OOO0OO.o00oo00O
    @o0OOOO0o.o00oo0OO(name = "contentDeepEqualsInline")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <T> boolean o00oooOO(T[] tArr, T[] tArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(tArr2, "other");
        return o00ooO.o00oOoO0(tArr, tArr2);
    }

    @o0OOOO0o.o00oo0OO(name = "contentDeepEqualsNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> boolean o00oooOo(T[] tArr, T[] tArr2) {
        return o0OOO0OO.o00ooO0.o00oOOo0(1, 3, 0) ? o00ooO.o00oOoO0(tArr, tArr2) : Arrays.deepEquals(tArr, tArr2);
    }

    @o0OOOO0o.o00oo0OO(name = "contentDeepHashCodeNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> int o00oooo(T[] tArr) {
        return o0OOO0OO.o00ooO0.o00oOOo0(1, 3, 0) ? Arrays.deepHashCode(tArr) : Arrays.deepHashCode(tArr);
    }

    @o0OOO0OO.o00oo0OO
    @o0OOO0OO.o00oo00O
    @o0OOOO0o.o00oo0OO(name = "contentDeepHashCodeInline")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <T> int o00oooo0(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return Arrays.deepHashCode(tArr);
    }

    @o0OOO0OO.o00oo0OO
    @o0OOO0OO.o00oo00O
    @o0OOOO0o.o00oo0OO(name = "contentDeepToStringInline")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final <T> String o00ooooO(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return o00ooO.o00oOoO(tArr);
    }

    @o0OOOO0o.o00oo0OO(name = "contentDeepToStringNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> String o00ooooo(T[] tArr) {
        if (o0OOO0OO.o00ooO0.o00oOOo0(1, 3, 0)) {
            return o00ooO.o00oOoO(tArr);
        }
        String deepToString = Arrays.deepToString(tArr);
        o0OOOOO0.o0ooO.o00oo0OO(deepToString, "deepToString(this)");
        return deepToString;
    }

    @NotNull
    @o0OO0o.o0O
    @o0OOOO0o.o00oo0OO(name = "copyOfRange")
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final <T> T[] o0O(@NotNull T[] tArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o00ooO0.o00oOo00(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        o0OOOOO0.o0ooO.o00oo0OO(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    @o0OOOO0o.o00oo0OO(name = "contentEqualsNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final boolean o0O00(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ boolean o0O000(int[] iArr, int[] iArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iArr2, "other");
        return Arrays.equals(iArr, iArr2);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ boolean o0O00000(char[] cArr, char[] cArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(cArr2, "other");
        return Arrays.equals(cArr, cArr2);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ boolean o0O0000O(double[] dArr, double[] dArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(dArr2, "other");
        return Arrays.equals(dArr, dArr2);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ boolean o0O0000o(float[] fArr, float[] fArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(fArr2, "other");
        return Arrays.equals(fArr, fArr2);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ boolean o0O000O(long[] jArr, long[] jArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(jArr2, "other");
        return Arrays.equals(jArr, jArr2);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ boolean o0O000Oo(short[] sArr, short[] sArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(sArr2, "other");
        return Arrays.equals(sArr, sArr2);
    }

    @o0OOOO0o.o00oo0OO(name = "contentEqualsNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final boolean o0O000o(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @o0OOOO0o.o00oo0OO(name = "contentEqualsNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final boolean o0O000o0(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @o0OOOO0o.o00oo0OO(name = "contentEqualsNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final boolean o0O000oo(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    @o0OOOO0o.o00oo0OO(name = "contentEqualsNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final boolean o0O00O(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @o0OOOO0o.o00oo0OO(name = "contentEqualsNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final boolean o0O00O0(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    @o0OOOO0o.o00oo0OO(name = "contentEqualsNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final boolean o0O00O0o(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ int o0O00OO(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return Arrays.hashCode(bArr);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ int o0O00OOO(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return Arrays.hashCode(cArr);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ int o0O00Oo(double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return Arrays.hashCode(dArr);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ int o0O00OoO(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return Arrays.hashCode(iArr);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ int o0O00Ooo(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return Arrays.hashCode(jArr);
    }

    @o0OOOO0o.o00oo0OO(name = "contentHashCodeNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int o0O00o(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ <T> int o0O00o00(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return Arrays.hashCode(tArr);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ int o0O00o0O(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return Arrays.hashCode(sArr);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ int o0O00o0o(boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return Arrays.hashCode(zArr);
    }

    @o0OOOO0o.o00oo0OO(name = "contentHashCodeNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int o0O00oO0(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    @o0OOOO0o.o00oo0OO(name = "contentHashCodeNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int o0O0O0O(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    @o0OOOO0o.o00oo0OO(name = "contentHashCodeNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int o0O0O0Oo(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @o0OOOO0o.o00oo0OO(name = "contentHashCodeNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int o0O0O0o(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @o0OOOO0o.o00oo0OO(name = "contentHashCodeNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> int o0O0O0o0(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @o0OOOO0o.o00oo0OO(name = "contentHashCodeNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int o0O0O0oO(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ String o0O0O0oo(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        String arrays = Arrays.toString(bArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ String o0O0OO(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        String arrays = Arrays.toString(iArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ String o0O0OO0(double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        String arrays = Arrays.toString(dArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ String o0O0OO0O(float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        String arrays = Arrays.toString(fArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ <T> String o0O0OOO(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        String arrays = Arrays.toString(tArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ String o0O0OOO0(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        String arrays = Arrays.toString(jArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ String o0O0OOOo(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        String arrays = Arrays.toString(sArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ String o0O0OOo(boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        String arrays = Arrays.toString(zArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @o0OOOO0o.o00oo0OO(name = "contentToStringNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final String o0O0OOoO(byte[] bArr) {
        String arrays = Arrays.toString(bArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @o0OOOO0o.o00oo0OO(name = "contentToStringNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final String o0O0OOoo(char[] cArr) {
        String arrays = Arrays.toString(cArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @o0OOOO0o.o00oo0OO(name = "contentToStringNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> String o0O0Oo(T[] tArr) {
        String arrays = Arrays.toString(tArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @o0OOOO0o.o00oo0OO(name = "contentToStringNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final String o0O0Oo0(float[] fArr) {
        String arrays = Arrays.toString(fArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @o0OOOO0o.o00oo0OO(name = "contentToStringNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final String o0O0Oo0O(int[] iArr) {
        String arrays = Arrays.toString(iArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @o0OOOO0o.o00oo0OO(name = "contentToStringNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final String o0O0Oo0o(long[] jArr) {
        String arrays = Arrays.toString(jArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final char[] o0O0OoO(@NotNull char[] cArr, @NotNull char[] cArr2, int i, int i2, int i3) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(cArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
        return cArr2;
    }

    @o0OOOO0o.o00oo0OO(name = "contentToStringNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final String o0O0OoO0(boolean[] zArr) {
        String arrays = Arrays.toString(zArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final double[] o0O0OoOo(@NotNull double[] dArr, @NotNull double[] dArr2, int i, int i2, int i3) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(dArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(dArr, i2, dArr2, i, i3 - i2);
        return dArr2;
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final int[] o0O0Ooo(@NotNull int[] iArr, @NotNull int[] iArr2, int i, int i2, int i3) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final float[] o0O0Ooo0(@NotNull float[] fArr, @NotNull float[] fArr2, int i, int i2, int i3) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(fArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final long[] o0O0OooO(@NotNull long[] jArr, @NotNull long[] jArr2, int i, int i2, int i3) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(jArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    @o0OOOO0o.o00oo0OO(name = "contentToStringNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final String o0O0Oooo(short[] sArr) {
        String arrays = Arrays.toString(sArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @NotNull
    public static final List<Boolean> o0O0o(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return new o00oo0(zArr);
    }

    public static /* synthetic */ char[] o0O0o0(char[] cArr, char[] cArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = cArr.length;
        }
        return o0O0OoO(cArr, cArr2, i, i2, i3);
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final short[] o0O0o00(@NotNull short[] sArr, @NotNull short[] sArr2, int i, int i2, int i3) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(sArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(sArr, i2, sArr2, i, i3 - i2);
        return sArr2;
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final <T> T[] o0O0o000(@NotNull T[] tArr, @NotNull T[] tArr2, int i, int i2, int i3) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(tArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final boolean[] o0O0o00O(@NotNull boolean[] zArr, @NotNull boolean[] zArr2, int i, int i2, int i3) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(zArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(zArr, i2, zArr2, i, i3 - i2);
        return zArr2;
    }

    public static /* synthetic */ byte[] o0O0o00o(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return oo0OOoo(bArr, bArr2, i, i2, i3);
    }

    public static /* synthetic */ double[] o0O0o0O(double[] dArr, double[] dArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = dArr.length;
        }
        return o0O0OoOo(dArr, dArr2, i, i2, i3);
    }

    public static /* synthetic */ float[] o0O0o0OO(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        return o0O0Ooo0(fArr, fArr2, i, i2, i3);
    }

    public static /* synthetic */ int[] o0O0o0Oo(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return o0O0Ooo(iArr, iArr2, i, i2, i3);
    }

    public static /* synthetic */ Object[] o0O0o0o(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return o0O0o000(objArr, objArr2, i, i2, i3);
    }

    public static /* synthetic */ long[] o0O0o0o0(long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jArr.length;
        }
        return o0O0OooO(jArr, jArr2, i, i2, i3);
    }

    public static /* synthetic */ boolean[] o0O0o0oO(boolean[] zArr, boolean[] zArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = zArr.length;
        }
        return o0O0o00O(zArr, zArr2, i, i2, i3);
    }

    @o0OOO0OO.o00oo00O
    public static final byte[] o0O0o0oo(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @o0OOO0OO.o00oo00O
    public static final float[] o0O0oO(float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @o0OOO0OO.o00oo00O
    public static final char[] o0O0oO0(char[] cArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, i);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @o0OOO0OO.o00oo00O
    public static final double[] o0O0oO0O(double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @o0OOO0OO.o00oo00O
    public static final double[] o0O0oO0o(double[] dArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, i);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @o0OOO0OO.o00oo00O
    public static final int[] o0O0oOO(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @o0OOO0OO.o00oo00O
    public static final float[] o0O0oOO0(float[] fArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, i);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @o0OOO0OO.o00oo00O
    public static final long[] o0O0oOOO(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T[] o0O0oOo(T[] tArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        o0OOOOO0.o0ooO.o00oo0OO(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    @o0OOO0OO.o00oo00O
    public static final long[] o0O0oOo0(long[] jArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, i);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @o0OOO0OO.o00oo00O
    public static final short[] o0O0oOoO(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @o0OOO0OO.o00oo00O
    public static final short[] o0O0oOoo(short[] sArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, i);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @o0OOO0OO.o00oo00O
    public static final boolean[] o0O0oo(boolean[] zArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, i);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @o0OOO0OO.o00oo00O
    public static final boolean[] o0O0oo0(boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, zArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @o0OOO0OO.o00oo00O
    public static final int[] o0O0oo00(int[] iArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, i);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @o0OOO0OO.o00oo00O
    public static final byte[] o0O0oo0O(byte[] bArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, i);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @o0OOOO0o.o00oo0OO(name = "contentHashCodeNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int o0O0oo0o(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @NotNull
    @o0OO0o.o0O
    @o0OOOO0o.o00oo0OO(name = "copyOfRange")
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final byte[] o0O0ooO0(@NotNull byte[] bArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o00ooO0.o00oOo00(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        o0OOOOO0.o0ooO.o00oo0OO(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @NotNull
    @o0OO0o.o0O
    @o0OOOO0o.o00oo0OO(name = "copyOfRange")
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final char[] o0O0ooOO(@NotNull char[] cArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o00ooO0.o00oOo00(i2, cArr.length);
        char[] copyOfRange = Arrays.copyOfRange(cArr, i, i2);
        o0OOOOO0.o0ooO.o00oo0OO(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @NotNull
    @o0OO0o.o0O
    @o0OOOO0o.o00oo0OO(name = "copyOfRange")
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final float[] o0O0ooo(@NotNull float[] fArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o00ooO0.o00oOo00(i2, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i, i2);
        o0OOOOO0.o0ooO.o00oo0OO(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @NotNull
    @o0OO0o.o0O
    @o0OOOO0o.o00oo0OO(name = "copyOfRange")
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final double[] o0O0ooo0(@NotNull double[] dArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o00ooO0.o00oOo00(i2, dArr.length);
        double[] copyOfRange = Arrays.copyOfRange(dArr, i, i2);
        o0OOOOO0.o0ooO.o00oo0OO(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @NotNull
    @o0OO0o.o0O
    @o0OOOO0o.o00oo0OO(name = "copyOfRange")
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final int[] o0O0oooO(@NotNull int[] iArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o00ooO0.o00oOo00(i2, iArr.length);
        int[] copyOfRange = Arrays.copyOfRange(iArr, i, i2);
        o0OOOOO0.o0ooO.o00oo0OO(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @NotNull
    @o0OO0o.o0O
    @o0OOOO0o.o00oo0OO(name = "copyOfRange")
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final long[] o0O0oooo(@NotNull long[] jArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o00ooO0.o00oOo00(i2, jArr.length);
        long[] copyOfRange = Arrays.copyOfRange(jArr, i, i2);
        o0OOOOO0.o0ooO.o00oo0OO(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static /* synthetic */ void o0OO(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        o0OO0o(bArr, b, i, i2);
    }

    @o0OOOO0o.o00oo0OO(name = "copyOfRangeInline")
    @o0OOO0OO.o00oo00O
    public static final boolean[] o0OO0(boolean[] zArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        if (o0OOO0OO.o00ooO0.o00oOOo0(1, 3, 0)) {
            return o0OO000o(zArr, i, i2);
        }
        if (i2 <= zArr.length) {
            boolean[] copyOfRange = Arrays.copyOfRange(zArr, i, i2);
            o0OOOOO0.o0ooO.o00oo0OO(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("toIndex: ", i2, ", size: ");
        o00oOOo02.append(zArr.length);
        throw new IndexOutOfBoundsException(o00oOOo02.toString());
    }

    @NotNull
    @o0OO0o.o0O
    @o0OOOO0o.o00oo0OO(name = "copyOfRange")
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final short[] o0OO000(@NotNull short[] sArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o00ooO0.o00oOo00(i2, sArr.length);
        short[] copyOfRange = Arrays.copyOfRange(sArr, i, i2);
        o0OOOOO0.o0ooO.o00oo0OO(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @NotNull
    @o0OO0o.o0O
    @o0OOOO0o.o00oo0OO(name = "copyOfRange")
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final boolean[] o0OO000o(@NotNull boolean[] zArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o00ooO0.o00oOo00(i2, zArr.length);
        boolean[] copyOfRange = Arrays.copyOfRange(zArr, i, i2);
        o0OOOOO0.o0ooO.o00oo0OO(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @o0OOOO0o.o00oo0OO(name = "copyOfRangeInline")
    @o0OOO0OO.o00oo00O
    public static final double[] o0OO00OO(double[] dArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (o0OOO0OO.o00ooO0.o00oOOo0(1, 3, 0)) {
            return o0O0ooo0(dArr, i, i2);
        }
        if (i2 <= dArr.length) {
            double[] copyOfRange = Arrays.copyOfRange(dArr, i, i2);
            o0OOOOO0.o0ooO.o00oo0OO(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("toIndex: ", i2, ", size: ");
        o00oOOo02.append(dArr.length);
        throw new IndexOutOfBoundsException(o00oOOo02.toString());
    }

    @o0OOOO0o.o00oo0OO(name = "copyOfRangeInline")
    @o0OOO0OO.o00oo00O
    public static final int[] o0OO00Oo(int[] iArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (o0OOO0OO.o00ooO0.o00oOOo0(1, 3, 0)) {
            return o0O0oooO(iArr, i, i2);
        }
        if (i2 <= iArr.length) {
            int[] copyOfRange = Arrays.copyOfRange(iArr, i, i2);
            o0OOOOO0.o0ooO.o00oo0OO(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("toIndex: ", i2, ", size: ");
        o00oOOo02.append(iArr.length);
        throw new IndexOutOfBoundsException(o00oOOo02.toString());
    }

    @o0OOOO0o.o00oo0OO(name = "copyOfRangeInline")
    @o0OOO0OO.o00oo00O
    public static final short[] o0OO00o(short[] sArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (o0OOO0OO.o00ooO0.o00oOOo0(1, 3, 0)) {
            return o0OO000(sArr, i, i2);
        }
        if (i2 <= sArr.length) {
            short[] copyOfRange = Arrays.copyOfRange(sArr, i, i2);
            o0OOOOO0.o0ooO.o00oo0OO(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("toIndex: ", i2, ", size: ");
        o00oOOo02.append(sArr.length);
        throw new IndexOutOfBoundsException(o00oOOo02.toString());
    }

    @o0OOOO0o.o00oo0OO(name = "copyOfRangeInline")
    @o0OOO0OO.o00oo00O
    public static final long[] o0OO00o0(long[] jArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (o0OOO0OO.o00ooO0.o00oOOo0(1, 3, 0)) {
            return o0O0oooo(jArr, i, i2);
        }
        if (i2 <= jArr.length) {
            long[] copyOfRange = Arrays.copyOfRange(jArr, i, i2);
            o0OOOOO0.o0ooO.o00oo0OO(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("toIndex: ", i2, ", size: ");
        o00oOOo02.append(jArr.length);
        throw new IndexOutOfBoundsException(o00oOOo02.toString());
    }

    @o0OOOO0o.o00oo0OO(name = "copyOfRangeInline")
    @o0OOO0OO.o00oo00O
    public static final float[] o0OO00oo(float[] fArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (o0OOO0OO.o00ooO0.o00oOOo0(1, 3, 0)) {
            return o0O0ooo(fArr, i, i2);
        }
        if (i2 <= fArr.length) {
            float[] copyOfRange = Arrays.copyOfRange(fArr, i, i2);
            o0OOOOO0.o0ooO.o00oo0OO(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("toIndex: ", i2, ", size: ");
        o00oOOo02.append(fArr.length);
        throw new IndexOutOfBoundsException(o00oOOo02.toString());
    }

    @o0OOO0OO.o00oo00O
    public static final byte o0OO0O0(byte[] bArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return bArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final char o0OO0O0O(char[] cArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return cArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final double o0OO0OoO(double[] dArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return dArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final int o0OO0Ooo(int[] iArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return iArr[i];
    }

    public static final void o0OO0o(@NotNull byte[] bArr, byte b, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        Arrays.fill(bArr, i, i2, b);
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T o0OO0o0(T[] tArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return tArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final long o0OO0o00(long[] jArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return jArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final short o0OO0o0O(short[] sArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return sArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final boolean o0OO0o0o(boolean[] zArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return zArr[i];
    }

    public static final void o0OO0oO(@NotNull double[] dArr, double d, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        Arrays.fill(dArr, i, i2, d);
    }

    public static final void o0OO0oO0(@NotNull char[] cArr, char c, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        Arrays.fill(cArr, i, i2, c);
    }

    public static final void o0OO0oOO(@NotNull float[] fArr, float f, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        Arrays.fill(fArr, i, i2, f);
    }

    public static final void o0OO0oOo(@NotNull long[] jArr, long j, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        Arrays.fill(jArr, i, i2, j);
    }

    public static final <T> void o0OO0oo0(@NotNull T[] tArr, T t, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    public static final void o0OO0ooO(@NotNull short[] sArr, short s, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        Arrays.fill(sArr, i, i2, s);
    }

    public static final void o0OO0ooo(@NotNull boolean[] zArr, boolean z, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        Arrays.fill(zArr, i, i2, z);
    }

    public static /* synthetic */ void o0OOO0(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        o0OO0oOO(fArr, f, i, i2);
    }

    public static /* synthetic */ void o0OOO00(char[] cArr, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        o0OO0oO0(cArr, c, i, i2);
    }

    public static /* synthetic */ void o0OOO00o(double[] dArr, double d, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        o0OO0oO(dArr, d, i, i2);
    }

    public static /* synthetic */ void o0OOO0O(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        o0OO0oOo(jArr, j, i, i2);
    }

    public static /* synthetic */ void o0OOO0O0(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        o0OOoooO(iArr, i, i2, i3);
    }

    public static /* synthetic */ void o0OOO0OO(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        o0OO0oo0(objArr, obj, i, i2);
    }

    public static /* synthetic */ void o0OOO0Oo(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        o0OO0ooO(sArr, s, i, i2);
    }

    public static /* synthetic */ void o0OOO0o0(boolean[] zArr, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = zArr.length;
        }
        o0OO0ooo(zArr, z, i, i2);
    }

    @NotNull
    public static final <R> List<R> o0OOO0oO(@NotNull Object[] objArr, @NotNull Class<R> cls) {
        o0OOOOO0.o0ooO.o00oo0O0(objArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(cls, "klass");
        return (List) o0OOO0oo(objArr, new ArrayList(), cls);
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C o0OOO0oo(@NotNull Object[] objArr, @NotNull C c, @NotNull Class<R> cls) {
        o0OOOOO0.o0ooO.o00oo0O0(objArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(cls, "klass");
        for (Object obj : objArr) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxOrNull()", imports = {}))
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ Double o0OOOO(Double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return o0O000O.oOoOOOoO(dArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Comparable o0OOOO0(Comparable[] comparableArr) {
        o0OOOOO0.o0ooO.o00oo0O0(comparableArr, "<this>");
        return o0O000O.oOoOOOOo(comparableArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Character o0OOOO00(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return o0O000O.oOoOOOOO(cArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Double o0OOOO0o(double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return o0O000O.oOoOOOo(dArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxOrNull()", imports = {}))
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ Float o0OOOOO(Float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return o0O000O.oOoOOOoo(fArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Float o0OOOOO0(float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return o0O000O.oOooOooO(fArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Integer o0OOOOOO(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return o0O000O.oOoOOo00(iArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Long o0OOOOOo(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return o0O000O.oOoOOo0(jArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Short o0OOOOo(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return o0O000O.oOoOOo0o(sArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Byte o0OOOOoO(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return o0O000O.oOoOOOO(bArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean o0OOOOoo(boolean[] zArr, o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int oOO00O0O = o0O000O.oOO00O0O(zArr);
        if (oOO00O0O != 0) {
            R invoke = o00ooVar.invoke(Boolean.valueOf(z));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO00O0O);
            while (o00oOOo02.hasNext()) {
                boolean z2 = zArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(Boolean.valueOf(z2));
                if (invoke.compareTo(invoke2) < 0) {
                    z = z2;
                    invoke = invoke2;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer o0OOOo(int[] iArr, o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int oOO000oo = o0O000O.oOO000oo(iArr);
        if (oOO000oo != 0) {
            R invoke = o00ooVar.invoke(Integer.valueOf(i));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO000oo);
            while (o00oOOo02.hasNext()) {
                int i2 = iArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(Integer.valueOf(i2));
                if (invoke.compareTo(invoke2) < 0) {
                    i = i2;
                    invoke = invoke2;
                }
            }
        }
        return Integer.valueOf(i);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character o0OOOo0(char[] cArr, o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        int oOO000o0 = o0O000O.oOO000o0(cArr);
        if (oOO000o0 != 0) {
            R invoke = o00ooVar.invoke(Character.valueOf(c));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO000o0);
            while (o00oOOo02.hasNext()) {
                char c2 = cArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(Character.valueOf(c2));
                if (invoke.compareTo(invoke2) < 0) {
                    c = c2;
                    invoke = invoke2;
                }
            }
        }
        return Character.valueOf(c);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte o0OOOo00(byte[] bArr, o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        int oOO000Oo = o0O000O.oOO000Oo(bArr);
        if (oOO000Oo != 0) {
            R invoke = o00ooVar.invoke(Byte.valueOf(b));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO000Oo);
            while (o00oOOo02.hasNext()) {
                byte b2 = bArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(Byte.valueOf(b2));
                if (invoke.compareTo(invoke2) < 0) {
                    b = b2;
                    invoke = invoke2;
                }
            }
        }
        return Byte.valueOf(b);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Double o0OOOo0O(double[] dArr, o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        int oOO000o = o0O000O.oOO000o(dArr);
        if (oOO000o != 0) {
            R invoke = o00ooVar.invoke(Double.valueOf(d));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO000o);
            while (o00oOOo02.hasNext()) {
                double d2 = dArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(Double.valueOf(d2));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                    d = d2;
                }
            }
        }
        return Double.valueOf(d);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Float o0OOOo0o(float[] fArr, o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        int oOO000oO = o0O000O.oOO000oO(fArr);
        if (oOO000oO != 0) {
            R invoke = o00ooVar.invoke(Float.valueOf(f));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO000oO);
            while (o00oOOo02.hasNext()) {
                float f2 = fArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(Float.valueOf(f2));
                if (invoke.compareTo(invoke2) < 0) {
                    f = f2;
                    invoke = invoke2;
                }
            }
        }
        return Float.valueOf(f);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T o0OOOoO(T[] tArr, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int oOO00O00 = o0O000O.oOO00O00(tArr);
        if (oOO00O00 != 0) {
            R invoke = o00ooVar.invoke(t);
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO00O00);
            while (o00oOOo02.hasNext()) {
                T t2 = tArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(t2);
                if (invoke.compareTo(invoke2) < 0) {
                    t = t2;
                    invoke = invoke2;
                }
            }
        }
        return t;
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Long o0OOOoO0(long[] jArr, o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int oOO00 = o0O000O.oOO00(jArr);
        if (oOO00 != 0) {
            R invoke = o00ooVar.invoke(Long.valueOf(j));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO00);
            while (o00oOOo02.hasNext()) {
                long j2 = jArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(Long.valueOf(j2));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                    j = j2;
                }
            }
        }
        return Long.valueOf(j);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Short o0OOOoOo(short[] sArr, o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int oOO00O0 = o0O000O.oOO00O0(sArr);
        if (oOO00O0 != 0) {
            R invoke = o00ooVar.invoke(Short.valueOf(s));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO00O0);
            while (o00oOOo02.hasNext()) {
                short s2 = sArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(Short.valueOf(s2));
                if (invoke.compareTo(invoke2) < 0) {
                    s = s2;
                    invoke = invoke2;
                }
            }
        }
        return Short.valueOf(s);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Byte o0OOOoo(byte[] bArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oOoOo0(bArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Boolean o0OOOoo0(boolean[] zArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oOoOo00O(zArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character o0OOOooO(char[] cArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oOoOoo0O(cArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Double o0OOOooo(double[] dArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oOoOo0O0(dArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Integer o0OOo00(int[] iArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.ooOOO0oo(iArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Float o0OOo000(float[] fArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oOoOo0O(fArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Long o0OOo00O(long[] jArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oOooo0Oo(jArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object o0OOo00o(Object[] objArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(objArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oOooo0oo(objArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Character o0OOo0O(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return o0O000O.oOooo0(cArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Short o0OOo0O0(short[] sArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oOoOo0OO(sArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Comparable o0OOo0OO(Comparable[] comparableArr) {
        o0OOOOO0.o0ooO.o00oo0O0(comparableArr, "<this>");
        return o0O000O.oOooo0O(comparableArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Double o0OOo0Oo(double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return o0O000O.oOooo0OO(dArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Float o0OOo0o(float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return o0O000O.oOoooO00(fArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minOrNull()", imports = {}))
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ Double o0OOo0o0(Double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return o0O000O.oOooo0o0(dArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minOrNull()", imports = {}))
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ Float o0OOo0oO(Float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return o0O000O.oOoooO0(fArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Integer o0OOo0oo(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return o0O000O.oOoooO0O(iArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character o0OOoO(char[] cArr, o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        int oOO000o0 = o0O000O.oOO000o0(cArr);
        if (oOO000o0 != 0) {
            R invoke = o00ooVar.invoke(Character.valueOf(c));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO000o0);
            while (o00oOOo02.hasNext()) {
                char c2 = cArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(Character.valueOf(c2));
                if (invoke.compareTo(invoke2) > 0) {
                    c = c2;
                    invoke = invoke2;
                }
            }
        }
        return Character.valueOf(c);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Short o0OOoO0(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return o0O000O.oOoooOO0(sArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Long o0OOoO00(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return o0O000O.oOoooO0o(jArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean o0OOoO0O(boolean[] zArr, o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int oOO00O0O = o0O000O.oOO00O0O(zArr);
        if (oOO00O0O != 0) {
            R invoke = o00ooVar.invoke(Boolean.valueOf(z));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO00O0O);
            while (o00oOOo02.hasNext()) {
                boolean z2 = zArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(Boolean.valueOf(z2));
                if (invoke.compareTo(invoke2) > 0) {
                    z = z2;
                    invoke = invoke2;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte o0OOoO0o(byte[] bArr, o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        int oOO000Oo = o0O000O.oOO000Oo(bArr);
        if (oOO000Oo != 0) {
            R invoke = o00ooVar.invoke(Byte.valueOf(b));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO000Oo);
            while (o00oOOo02.hasNext()) {
                byte b2 = bArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(Byte.valueOf(b2));
                if (invoke.compareTo(invoke2) > 0) {
                    b = b2;
                    invoke = invoke2;
                }
            }
        }
        return Byte.valueOf(b);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Double o0OOoOO(double[] dArr, o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        int oOO000o = o0O000O.oOO000o(dArr);
        if (oOO000o != 0) {
            R invoke = o00ooVar.invoke(Double.valueOf(d));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO000o);
            while (o00oOOo02.hasNext()) {
                double d2 = dArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(Double.valueOf(d2));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                    d = d2;
                }
            }
        }
        return Double.valueOf(d);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Float o0OOoOOO(float[] fArr, o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        int oOO000oO = o0O000O.oOO000oO(fArr);
        if (oOO000oO != 0) {
            R invoke = o00ooVar.invoke(Float.valueOf(f));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO000oO);
            while (o00oOOo02.hasNext()) {
                float f2 = fArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(Float.valueOf(f2));
                if (invoke.compareTo(invoke2) > 0) {
                    f = f2;
                    invoke = invoke2;
                }
            }
        }
        return Float.valueOf(f);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Long o0OOoOo(long[] jArr, o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int oOO00 = o0O000O.oOO00(jArr);
        if (oOO00 != 0) {
            R invoke = o00ooVar.invoke(Long.valueOf(j));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO00);
            while (o00oOOo02.hasNext()) {
                long j2 = jArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(Long.valueOf(j2));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                    j = j2;
                }
            }
        }
        return Long.valueOf(j);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer o0OOoOo0(int[] iArr, o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int oOO000oo = o0O000O.oOO000oo(iArr);
        if (oOO000oo != 0) {
            R invoke = o00ooVar.invoke(Integer.valueOf(i));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO000oo);
            while (o00oOOo02.hasNext()) {
                int i2 = iArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(Integer.valueOf(i2));
                if (invoke.compareTo(invoke2) > 0) {
                    i = i2;
                    invoke = invoke2;
                }
            }
        }
        return Integer.valueOf(i);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Byte o0OOoo(byte[] bArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oo0000OO(bArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T o0OOoo0(T[] tArr, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int oOO00O00 = o0O000O.oOO00O00(tArr);
        if (oOO00O00 != 0) {
            R invoke = o00ooVar.invoke(t);
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO00O00);
            while (o00oOOo02.hasNext()) {
                T t2 = tArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(t2);
                if (invoke.compareTo(invoke2) > 0) {
                    t = t2;
                    invoke = invoke2;
                }
            }
        }
        return t;
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Short o0OOoo0O(short[] sArr, o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int oOO00O0 = o0O000O.oOO00O0(sArr);
        if (oOO00O0 != 0) {
            R invoke = o00ooVar.invoke(Short.valueOf(s));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO00O0);
            while (o00oOOo02.hasNext()) {
                short s2 = sArr[o00oOOo02.nextInt()];
                R invoke2 = o00ooVar.invoke(Short.valueOf(s2));
                if (invoke.compareTo(invoke2) > 0) {
                    s = s2;
                    invoke = invoke2;
                }
            }
        }
        return Short.valueOf(s);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Boolean o0OOoo0o(boolean[] zArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oo0000O(zArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character o0OOooO(char[] cArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oo0000Oo(cArr, comparator);
    }

    @o0OOO0OO.o00oo00O
    public static final float o0OOooO0(float[] fArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return fArr[i];
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Double o0OOooOO(double[] dArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oo0000o0(dArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Float o0OOooOo(float[] fArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oo0000o(fArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Long o0OOooo(long[] jArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oo0000oo(jArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Integer o0OOooo0(int[] iArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oo0000oO(iArr, comparator);
    }

    public static final void o0OOoooO(@NotNull int[] iArr, int i, int i2, int i3) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    public static final void o0Oo(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    @NotNull
    public static final byte[] o0Oo0(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Short o0Oo00o(short[] sArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oo000O0(sArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object o0Oo00o0(Object[] objArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(objArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O000O.oo000(objArr, comparator);
    }

    @NotNull
    public static final byte[] o0Oo00oO(@NotNull byte[] bArr, byte b) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + 1);
        copyOf[length] = b;
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final byte[] o0Oo00oo(@NotNull byte[] bArr, @NotNull Collection<Byte> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, collection.size() + length);
        for (Byte b : collection) {
            copyOf[length] = b.byteValue();
            length++;
        }
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final double[] o0Oo0O(@NotNull double[] dArr, @NotNull Collection<Double> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, collection.size() + length);
        for (Double d : collection) {
            copyOf[length] = d.doubleValue();
            length++;
        }
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final char[] o0Oo0O0(@NotNull char[] cArr, @NotNull char[] cArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(cArr2, "elements");
        int length = cArr.length;
        int length2 = cArr2.length;
        char[] copyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(cArr2, 0, copyOf, length, length2);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final char[] o0Oo0O00(@NotNull char[] cArr, @NotNull Collection<Character> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        int length = cArr.length;
        char[] copyOf = Arrays.copyOf(cArr, collection.size() + length);
        for (Character ch : collection) {
            copyOf[length] = ch.charValue();
            length++;
        }
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final double[] o0Oo0O0O(@NotNull double[] dArr, double d) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, length + 1);
        copyOf[length] = d;
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final float[] o0Oo0OO(@NotNull float[] fArr, float f) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, length + 1);
        copyOf[length] = f;
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final double[] o0Oo0OO0(@NotNull double[] dArr, @NotNull double[] dArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(dArr2, "elements");
        int length = dArr.length;
        int length2 = dArr2.length;
        double[] copyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(dArr2, 0, copyOf, length, length2);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final int[] o0Oo0OOO(@NotNull int[] iArr, @NotNull Collection<Integer> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, collection.size() + length);
        for (Integer num : collection) {
            copyOf[length] = num.intValue();
            length++;
        }
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final long[] o0Oo0OOo(@NotNull long[] jArr, @NotNull Collection<Long> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, collection.size() + length);
        for (Long l : collection) {
            copyOf[length] = l.longValue();
            length++;
        }
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final <T> T[] o0Oo0Oo(@NotNull T[] tArr, T t) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        o0OOOOO0.o0ooO.o00oo0OO(tArr2, "result");
        return tArr2;
    }

    @NotNull
    public static final long[] o0Oo0Oo0(@NotNull long[] jArr, @NotNull long[] jArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(jArr2, "elements");
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] copyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, copyOf, length, length2);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final <T> T[] o0Oo0OoO(@NotNull T[] tArr, @NotNull Collection<? extends T> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, collection.size() + length);
        for (T t : collection) {
            tArr2[length] = t;
            length++;
        }
        o0OOOOO0.o0ooO.o00oo0OO(tArr2, "result");
        return tArr2;
    }

    @NotNull
    public static final short[] o0Oo0Ooo(@NotNull short[] sArr, @NotNull Collection<Short> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        int length = sArr.length;
        short[] copyOf = Arrays.copyOf(sArr, collection.size() + length);
        for (Short sh : collection) {
            copyOf[length] = sh.shortValue();
            length++;
        }
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final short[] o0Oo0o00(@NotNull short[] sArr, short s) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        int length = sArr.length;
        short[] copyOf = Arrays.copyOf(sArr, length + 1);
        copyOf[length] = s;
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final short[] o0Oo0o0O(@NotNull short[] sArr, @NotNull short[] sArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(sArr2, "elements");
        int length = sArr.length;
        int length2 = sArr2.length;
        short[] copyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(sArr2, 0, copyOf, length, length2);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final boolean[] o0Oo0o0o(@NotNull boolean[] zArr, @NotNull Collection<Boolean> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, collection.size() + length);
        for (Boolean bool : collection) {
            copyOf[length] = bool.booleanValue();
            length++;
        }
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final boolean[] o0Oo0oO(@NotNull boolean[] zArr, @NotNull boolean[] zArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(zArr2, "elements");
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, copyOf, length, length2);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final boolean[] o0Oo0oO0(@NotNull boolean[] zArr, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
        copyOf[length] = z;
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final <T> T[] o0Oo0oOo(@NotNull T[] tArr, @NotNull T[] tArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(tArr2, "elements");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        o0OOOOO0.o0ooO.o00oo0OO(tArr3, "result");
        return tArr3;
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T[] o0Oo0oo0(T[] tArr, T t) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return (T[]) o0Oo0Oo(tArr, t);
    }

    public static final void o0Oo0ooO(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    public static final void o0Oo0ooo(@NotNull byte[] bArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        Arrays.sort(bArr, i, i2);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T extends Comparable<? super T>> void o0OoO(@NotNull T[] tArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        Arrays.sort(tArr, i, i2);
    }

    public static final void o0OoO0(@NotNull double[] dArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        Arrays.sort(dArr, i, i2);
    }

    public static final void o0OoO000(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    @o0OOOO0o.o00oo0OO(name = "contentEqualsNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> boolean o0OoO00O(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    public static final void o0OoO0OO(@NotNull float[] fArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        Arrays.sort(fArr, i, i2);
    }

    public static final void o0OoO0Oo(@NotNull int[] iArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        Arrays.sort(iArr, i, i2);
    }

    public static final void o0OoO0o0(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    public static final void o0OoO0oO(@NotNull long[] jArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        Arrays.sort(jArr, i, i2);
    }

    @o0OOO0OO.o00oo00O
    public static final <T extends Comparable<? super T>> void o0OoO0oo(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OoOO00(tArr);
    }

    public static final void o0OoOO(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    public static final <T> void o0OoOO00(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void o0OoOO0o(@NotNull T[] tArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        Arrays.sort(tArr, i, i2);
    }

    public static /* synthetic */ void o0OoOOO(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        o0OooOoo(cArr, i, i2);
    }

    public static /* synthetic */ void o0OoOOO0(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        o0Oo0ooo(bArr, i, i2);
    }

    public static /* synthetic */ void o0OoOOOO(double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = dArr.length;
        }
        o0OoO0(dArr, i, i2);
    }

    public static /* synthetic */ void o0OoOOOo(float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = fArr.length;
        }
        o0OoO0OO(fArr, i, i2);
    }

    public static /* synthetic */ void o0OoOOo(long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = jArr.length;
        }
        o0OoO0oO(jArr, i, i2);
    }

    public static /* synthetic */ void o0OoOOo0(int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = iArr.length;
        }
        o0OoO0Oo(iArr, i, i2);
    }

    public static final void o0OoOOoO(@NotNull short[] sArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        Arrays.sort(sArr, i, i2);
    }

    public static final <T> void o0OoOo(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        Arrays.sort(tArr, i, i2, comparator);
    }

    public static /* synthetic */ void o0OoOo00(Comparable[] comparableArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = comparableArr.length;
        }
        o0OoO(comparableArr, i, i2);
    }

    public static /* synthetic */ void o0OoOo0O(Object[] objArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = objArr.length;
        }
        o0OoOO0o(objArr, i, i2);
    }

    public static final <T> void o0OoOo0o(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    @o0OOOO0o.o00oo0OO(name = "copyOfRangeInline")
    @o0OOO0OO.o00oo00O
    public static final <T> T[] o0OoOoO(T[] tArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (o0OOO0OO.o00ooO0.o00oOOo0(1, 3, 0)) {
            return (T[]) o0O(tArr, i, i2);
        }
        if (i2 <= tArr.length) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
            o0OOOOO0.o0ooO.o00oo0OO(tArr2, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return tArr2;
        }
        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("toIndex: ", i2, ", size: ");
        o00oOOo02.append(tArr.length);
        throw new IndexOutOfBoundsException(o00oOOo02.toString());
    }

    public static /* synthetic */ void o0OoOoO0(Object[] objArr, Comparator comparator, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        o0OoOo(objArr, comparator, i, i2);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ boolean o0OoOoOO(boolean[] zArr, boolean[] zArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(zArr2, "other");
        return Arrays.equals(zArr, zArr2);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ <T> boolean o0OoOoOo(T[] tArr, T[] tArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(tArr2, "other");
        return Arrays.equals(tArr, tArr2);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigDecimal")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final BigDecimal o0OoOoo(char[] cArr, o0OOOO.o00oo<? super Character, ? extends BigDecimal> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (char c : cArr) {
            valueOf = valueOf.add(o00ooVar.invoke(Character.valueOf(c)));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigDecimal")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final BigDecimal o0OoOoo0(byte[] bArr, o0OOOO.o00oo<? super Byte, ? extends BigDecimal> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (byte b : bArr) {
            valueOf = valueOf.add(o00ooVar.invoke(Byte.valueOf(b)));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigDecimal")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final BigDecimal o0OoOooO(double[] dArr, o0OOOO.o00oo<? super Double, ? extends BigDecimal> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (double d : dArr) {
            valueOf = valueOf.add(o00ooVar.invoke(Double.valueOf(d)));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @NotNull
    public static final SortedSet<Double> o0Ooo(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return (SortedSet) o0O000O.ooOoooOO(dArr, new TreeSet());
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigInteger")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final BigInteger o0Ooo0(byte[] bArr, o0OOOO.o00oo<? super Byte, ? extends BigInteger> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (byte b : bArr) {
            valueOf = valueOf.add(o00ooVar.invoke(Byte.valueOf(b)));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigDecimal")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final BigDecimal o0Ooo00(int[] iArr, o0OOOO.o00oo<? super Integer, ? extends BigDecimal> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (int i : iArr) {
            valueOf = valueOf.add(o00ooVar.invoke(Integer.valueOf(i)));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigDecimal")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final BigDecimal o0Ooo000(float[] fArr, o0OOOO.o00oo<? super Float, ? extends BigDecimal> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (float f : fArr) {
            valueOf = valueOf.add(o00ooVar.invoke(Float.valueOf(f)));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigDecimal")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final BigDecimal o0Ooo00O(long[] jArr, o0OOOO.o00oo<? super Long, ? extends BigDecimal> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (long j : jArr) {
            valueOf = valueOf.add(o00ooVar.invoke(Long.valueOf(j)));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigDecimal")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final BigDecimal o0Ooo00o(boolean[] zArr, o0OOOO.o00oo<? super Boolean, ? extends BigDecimal> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (boolean z : zArr) {
            valueOf = valueOf.add(o00ooVar.invoke(Boolean.valueOf(z)));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigInteger")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final BigInteger o0Ooo0O(double[] dArr, o0OOOO.o00oo<? super Double, ? extends BigInteger> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (double d : dArr) {
            valueOf = valueOf.add(o00ooVar.invoke(Double.valueOf(d)));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigInteger")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final BigInteger o0Ooo0O0(char[] cArr, o0OOOO.o00oo<? super Character, ? extends BigInteger> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (char c : cArr) {
            valueOf = valueOf.add(o00ooVar.invoke(Character.valueOf(c)));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigInteger")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> BigInteger o0Ooo0Oo(T[] tArr, o0OOOO.o00oo<? super T, ? extends BigInteger> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (T t : tArr) {
            valueOf = valueOf.add(o00ooVar.invoke(t));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigInteger")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final BigInteger o0Ooo0o(boolean[] zArr, o0OOOO.o00oo<? super Boolean, ? extends BigInteger> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (boolean z : zArr) {
            valueOf = valueOf.add(o00ooVar.invoke(Boolean.valueOf(z)));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigInteger")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final BigInteger o0Ooo0o0(short[] sArr, o0OOOO.o00oo<? super Short, ? extends BigInteger> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (short s : sArr) {
            valueOf = valueOf.add(o00ooVar.invoke(Short.valueOf(s)));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @NotNull
    public static final SortedSet<Byte> o0Ooo0oO(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return (SortedSet) o0O000O.ooOoooO0(bArr, new TreeSet());
    }

    @NotNull
    public static final SortedSet<Character> o0Ooo0oo(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return (SortedSet) o0O000O.ooOoooO(cArr, new TreeSet());
    }

    @o0OOOO0o.o00oo0OO(name = "contentToStringNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final String o0OooO0(double[] dArr) {
        String arrays = Arrays.toString(dArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Byte o0OooOo(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return o0O000O.oOooo00o(bArr);
    }

    public static final void o0OooOoo(@NotNull char[] cArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        Arrays.sort(cArr, i, i2);
    }

    @NotNull
    public static final SortedSet<Long> o0Oooo(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return (SortedSet) o0O000O.oooO0000(jArr, new TreeSet());
    }

    @NotNull
    public static final SortedSet<Float> o0Oooo0(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return (SortedSet) o0O000O.ooo0oooo(fArr, new TreeSet());
    }

    @NotNull
    public static final SortedSet<Integer> o0Oooo0o(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return (SortedSet) o0O000O.oooO0oo0(iArr, new TreeSet());
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> o0OoooO(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return (SortedSet) o0O000O.oooO000(tArr, new TreeSet());
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigInteger")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final BigInteger o0OoooO0(int[] iArr, o0OOOO.o00oo<? super Integer, ? extends BigInteger> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (int i : iArr) {
            valueOf = valueOf.add(o00ooVar.invoke(Integer.valueOf(i)));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @NotNull
    public static final <T> SortedSet<T> o0OoooOO(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return (SortedSet) o0O000O.oooO000(tArr, new TreeSet(comparator));
    }

    @NotNull
    public static final SortedSet<Short> o0OoooOo(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return (SortedSet) o0O000O.oooO00o0(sArr, new TreeSet());
    }

    @NotNull
    public static final Boolean[] o0Ooooo(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    @NotNull
    public static final SortedSet<Boolean> o0Ooooo0(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return (SortedSet) o0O000O.oooO000O(zArr, new TreeSet());
    }

    @NotNull
    public static final Byte[] o0OooooO(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    @NotNull
    public static final Integer[] o0o000(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    @NotNull
    public static final Character[] o0o0000(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            chArr[i] = Character.valueOf(cArr[i]);
        }
        return chArr;
    }

    @NotNull
    public static final Float[] o0o0000o(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    @NotNull
    public static final Short[] o0o000O(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            shArr[i] = Short.valueOf(sArr[i]);
        }
        return shArr;
    }

    @NotNull
    public static final Long[] o0o000O0(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    @NotNull
    public static final Double[] o0o0o00O(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    public static final void o0oO0O00(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    @o0OOOO0o.o00oo0OO(name = "contentHashCodeNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int o0oO0O0o(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ int o0oO0Ooo(float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return Arrays.hashCode(fArr);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigDecimal")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> BigDecimal o0oOO0Oo(T[] tArr, o0OOOO.o00oo<? super T, ? extends BigDecimal> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (T t : tArr) {
            valueOf = valueOf.add(o00ooVar.invoke(t));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigInteger")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final BigInteger o0oOOO0o(long[] jArr, o0OOOO.o00oo<? super Long, ? extends BigInteger> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (long j : jArr) {
            valueOf = valueOf.add(o00ooVar.invoke(Long.valueOf(j)));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigInteger")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final BigInteger o0oOOOoo(float[] fArr, o0OOOO.o00oo<? super Float, ? extends BigInteger> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (float f : fArr) {
            valueOf = valueOf.add(o00ooVar.invoke(Float.valueOf(f)));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @NotNull
    public static final int[] o0oOo000(@NotNull int[] iArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i;
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    public static /* synthetic */ short[] o0oOo0O0(short[] sArr, short[] sArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sArr.length;
        }
        return o0O0o00(sArr, sArr2, i, i2, i3);
    }

    @NotNull
    public static final int[] o0oOo0o0(@NotNull int[] iArr, @NotNull int[] iArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigDecimal")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final BigDecimal o0oOoOoo(short[] sArr, o0OOOO.o00oo<? super Short, ? extends BigDecimal> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (short s : sArr) {
            valueOf = valueOf.add(o00ooVar.invoke(Short.valueOf(s)));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @NotNull
    public static final long[] o0oOoo00(@NotNull long[] jArr, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, length + 1);
        copyOf[length] = j;
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final float[] o0oOooO0(@NotNull float[] fArr, @NotNull Collection<Float> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, collection.size() + length);
        for (Float f : collection) {
            copyOf[length] = f.floatValue();
            length++;
        }
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ String o0ooO(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        String arrays = Arrays.toString(cArr);
        o0OOOOO0.o0ooO.o00oo0OO(arrays, "toString(this)");
        return arrays;
    }

    @NotNull
    public static final char[] o0ooO0O0(@NotNull char[] cArr, char c) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        int length = cArr.length;
        char[] copyOf = Arrays.copyOf(cArr, length + 1);
        copyOf[length] = c;
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    public static final void o0ooOOO0(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    @NotNull
    public static final float[] o0ooOOOO(@NotNull float[] fArr, @NotNull float[] fArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(fArr2, "elements");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, copyOf, length, length2);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "result");
        return copyOf;
    }

    public static /* synthetic */ void o0ooOOoo(short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = sArr.length;
        }
        o0OoOOoO(sArr, i, i2);
    }

    @o0OOOO0o.o00oo0OO(name = "contentEqualsNullable")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final boolean o0ooOoOO(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final byte[] oo0OOoo(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i, int i2, int i3) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    @o0OOOO0o.o00oo0OO(name = "copyOfRangeInline")
    @o0OOO0OO.o00oo00O
    public static final byte[] oo0oO0(byte[] bArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (o0OOO0OO.o00ooO0.o00oOOo0(1, 3, 0)) {
            return o0O0ooO0(bArr, i, i2);
        }
        if (i2 <= bArr.length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
            o0OOOOO0.o0ooO.o00oo0OO(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("toIndex: ", i2, ", size: ");
        o00oOOo02.append(bArr.length);
        throw new IndexOutOfBoundsException(o00oOOo02.toString());
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T[] oo0oOOo(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(tArr2, "copyOf(this, size)");
        return tArr2;
    }

    @o0OOOO0o.o00oo0OO(name = "copyOfRangeInline")
    @o0OOO0OO.o00oo00O
    public static final char[] oo0ooO(char[] cArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (o0OOO0OO.o00ooO0.o00oOOo0(1, 3, 0)) {
            return o0O0ooOO(cArr, i, i2);
        }
        if (i2 <= cArr.length) {
            char[] copyOfRange = Arrays.copyOfRange(cArr, i, i2);
            o0OOOOO0.o0ooO.o00oo0OO(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("toIndex: ", i2, ", size: ");
        o00oOOo02.append(cArr.length);
        throw new IndexOutOfBoundsException(o00oOOo02.toString());
    }

    @o0OOO0OO.o00oo00O
    public static final char[] oooOO0(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        return copyOf;
    }
}
