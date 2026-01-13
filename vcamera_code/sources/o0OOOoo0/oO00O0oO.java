package o0OOOoo0;

import java.util.LinkedHashMap;
import java.util.Map;
import o00ooO0.o00oOoO;
import o0OO0o.o0O00oO0;
import o0OO0o.o0oO0Ooo;
import o0OO0oO.oo0oO0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0OOO00;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public enum oO00O0oO {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);
    
    private final int value;
    @NotNull
    public static final o00oOOoO Companion = new o00oOOoO(null);
    @NotNull
    private static final o0oO0Ooo<Map<Integer, oO00O0oO>> directionalityMap$delegate = o0O00oO0.o00oOo00(o00oOOo0.INSTANCE);

    @o0OOO00({"SMAP\nCharDirectionality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,123:1\n8811#2,2:124\n9071#2,4:126\n*S KotlinDebug\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n*L\n118#1:124,2\n118#1:126,4\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0O0OO implements o0OOOO.o00oOOo0<Map<Integer, ? extends oO00O0oO>> {
        public static final o00oOOo0 INSTANCE = new o00oOOo0();

        public o00oOOo0() {
            super(0);
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final Map<Integer, ? extends oO00O0oO> invoke() {
            oO00O0oO[] values = oO00O0oO.values();
            int o00oOoOo2 = oo0oO0.o00oOoOo(values.length);
            if (o00oOoOo2 < 16) {
                o00oOoOo2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
            for (oO00O0oO oo00o0oo : values) {
                linkedHashMap.put(Integer.valueOf(oo00o0oo.getValue()), oo00o0oo);
            }
            return linkedHashMap;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO {
        public o00oOOoO() {
        }

        public o00oOOoO(o0O00 o0o00) {
        }

        public final Map<Integer, oO00O0oO> o00oOOo0() {
            return (Map) oO00O0oO.directionalityMap$delegate.getValue();
        }

        @NotNull
        public final oO00O0oO o00oOOoO(int i) {
            oO00O0oO oo00o0oo = o00oOOo0().get(Integer.valueOf(i));
            if (oo00o0oo != null) {
                return oo00o0oo;
            }
            throw new IllegalArgumentException(o00oOoO.o00oOOo0("Directionality #", i, " is not defined."));
        }
    }

    oO00O0oO(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
