package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import o00oOooO.o0OO0oO;
import o0O0Oooo.o0O0oo00;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(o0O0oo00 o0o0oo00) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2403o00oOOo0 = o0o0oo00.o00ooo0o(iconCompat.f2403o00oOOo0, 1);
        iconCompat.f2405o00oOo00 = o0o0oo00.o00oo0o(iconCompat.f2405o00oOo00, 2);
        iconCompat.f2412o00oOooO = o0o0oo00.o0O0000O(iconCompat.f2412o00oOooO, 3);
        iconCompat.f2406o00oOo0O = o0o0oo00.o00ooo0o(iconCompat.f2406o00oOo0O, 4);
        iconCompat.f2407o00oOo0o = o0o0oo00.o00ooo0o(iconCompat.f2407o00oOo0o, 5);
        iconCompat.f2409o00oOoO0 = (ColorStateList) o0o0oo00.o0O0000O(iconCompat.f2409o00oOoO0, 6);
        iconCompat.f2410o00oOoOO = o0o0oo00.o0O000o0(iconCompat.f2410o00oOoOO, 7);
        iconCompat.f2411o00oOoOo = o0o0oo00.o0O000o0(iconCompat.f2411o00oOoOo, 8);
        iconCompat.o00oOo0o();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, o0O0oo00 o0o0oo00) {
        o0o0oo00.o0OoO00O(true, true);
        iconCompat.o00oOoO0(o0o0oo00.o00oOoOO());
        int i = iconCompat.f2403o00oOOo0;
        if (-1 != i) {
            o0o0oo00.o0O0OOo(i, 1);
        }
        byte[] bArr = iconCompat.f2405o00oOo00;
        if (bArr != null) {
            o0o0oo00.o0O00o0o(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2412o00oOooO;
        if (parcelable != null) {
            o0o0oo00.o0O0OoO(parcelable, 3);
        }
        int i2 = iconCompat.f2406o00oOo0O;
        if (i2 != 0) {
            o0o0oo00.o0O0OOo(i2, 4);
        }
        int i3 = iconCompat.f2407o00oOo0o;
        if (i3 != 0) {
            o0o0oo00.o0O0OOo(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f2409o00oOoO0;
        if (colorStateList != null) {
            o0o0oo00.o0O0OoO(colorStateList, 6);
        }
        String str = iconCompat.f2410o00oOoOO;
        if (str != null) {
            o0o0oo00.o0O0o00o(str, 7);
        }
        String str2 = iconCompat.f2411o00oOoOo;
        if (str2 != null) {
            o0o0oo00.o0O0o00o(str2, 8);
        }
    }
}
