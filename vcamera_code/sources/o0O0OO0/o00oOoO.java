package o0O0OO0;
/* loaded from: classes.dex */
public enum o00oOoO {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    
    private final long mValue;

    o00oOoO(long j) {
        this.mValue = j;
    }

    public static o00oOoO fromValue(long j) {
        o00oOoO[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].getValue() == j) {
                return values[i];
            }
        }
        throw new IllegalArgumentException(o00oOo0O.o00oOOo0("Unsupported FileSection Type ", j));
    }

    public long getValue() {
        return this.mValue;
    }
}
