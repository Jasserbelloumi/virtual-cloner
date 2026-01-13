package o0OOO0oo;

import o0OO0o.o0OO00o0;
import o0OO0oO.o0O00000;
import o0OOOOO0.o0OOO00;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,647:1\n13654#2,3:648\n13654#2,3:651\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n*L\n582#1:648,3\n601#1:651,3\n*E\n"})
/* loaded from: classes3.dex */
public final class o0O0o00 {
    @NotNull

    /* renamed from: o00oOOo0 */
    public static final byte[] f13500o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO */
    public static final int[] f13501o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00 */
    public static final byte[] f13502o00oOo00;
    @NotNull

    /* renamed from: o00oOooO */
    public static final int[] f13503o00oOooO;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f13500o00oOOo0 = bArr;
        int[] iArr = new int[256];
        int i = 0;
        o0O00000.o0OOO0O0(iArr, -1, 0, 0, 6, null);
        iArr[61] = -2;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            iArr[bArr[i2]] = i3;
            i2++;
            i3++;
        }
        f13501o00oOOoO = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f13502o00oOo00 = bArr2;
        int[] iArr2 = new int[256];
        o0O00000.o0OOO0O0(iArr2, -1, 0, 0, 6, null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i4 = 0;
        while (i < length2) {
            iArr2[bArr2[i]] = i4;
            i++;
            i4++;
        }
        f13503o00oOooO = iArr2;
    }

    public static final /* synthetic */ int[] o00oOOo0() {
        return f13501o00oOOoO;
    }

    public static final /* synthetic */ byte[] o00oOOoO() {
        return f13500o00oOOo0;
    }

    public static final /* synthetic */ int[] o00oOo00() {
        return f13503o00oOooO;
    }

    @o0oOo0O0
    public static /* synthetic */ void o00oOo0O() {
    }

    public static /* synthetic */ void o00oOo0o() {
    }

    public static /* synthetic */ void o00oOoO() {
    }

    @o0oOo0O0
    public static /* synthetic */ void o00oOoO0() {
    }

    @o0oOo0O0
    @o0OO00o0(version = "1.8")
    public static final boolean o00oOoOO(int i) {
        return (i >= 0 && i < f13501o00oOOoO.length) && f13501o00oOOoO[i] != -1;
    }

    public static final /* synthetic */ byte[] o00oOooO() {
        return f13502o00oOo00;
    }
}
