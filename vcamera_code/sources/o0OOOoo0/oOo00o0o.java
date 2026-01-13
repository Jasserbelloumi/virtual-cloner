package o0OOOoo0;

import o0OOOOO0.o0O00;
/* loaded from: classes3.dex */
public enum oOo00o0o implements oO00Oo00 {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    UNIX_LINES(1, 0, 2, null),
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    CANON_EQ(128, 0, 2, null);
    
    private final int mask;
    private final int value;

    oOo00o0o(int i, int i2) {
        this.value = i;
        this.mask = i2;
    }

    /* synthetic */ oOo00o0o(int i, int i2, int i3, o0O00 o0o00) {
        this(i, (i3 & 2) != 0 ? i : i2);
    }

    @Override // o0OOOoo0.oO00Oo00
    public int getMask() {
        return this.mask;
    }

    @Override // o0OOOoo0.oO00Oo00
    public int getValue() {
        return this.value;
    }
}
