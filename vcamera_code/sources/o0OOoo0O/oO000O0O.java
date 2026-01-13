package o0OOoo0O;

import com.google.common.base.Ascii;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public enum oO000O0O {
    I420(o00oo.o00oOOo0(new byte[]{89, 34, 62, 19}, new byte[]{Ascii.DLE, Ascii.SYN, Ascii.FF, 35, 9, -18, 97, 34})),
    NV21(o00oo.o00oOOo0(new byte[]{60, Byte.MIN_VALUE, Ascii.DC2, 75}, new byte[]{114, -42, 32, 122, -21, 105, Ascii.SO, 105})),
    JPEG(o00oo.o00oOOo0(new byte[]{-91, 121, Byte.MIN_VALUE, 107}, new byte[]{-17, 41, -59, 44, 117, 81, -112, -109}));
    
    private final String friendlyName;

    oO000O0O(String str) {
        this.friendlyName = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.friendlyName;
    }
}
