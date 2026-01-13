package o0ooOoOO;

import android.annotation.SuppressLint;
import java.util.Objects;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public interface oO00O0o0<T> {
    @SuppressLint({"MissingNullability"})
    static <T> oO00O0o0<T> isEqual(@SuppressLint({"MissingNullability"}) final Object obj) {
        return obj == null ? new oO00O0o0() { // from class: o0ooOoOO.oO000Oo0
            @Override // o0ooOoOO.oO00O0o0
            public final boolean test(Object obj2) {
                return Objects.isNull(obj2);
            }
        } : new oO00O0o0() { // from class: o0ooOoOO.oO000Oo
            @Override // o0ooOoOO.oO00O0o0
            public final boolean test(Object obj2) {
                return obj.equals(obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean o00oOOoO(Object obj) {
        return !test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean o00oOo00(oO00O0o0 oo00o0o0, Object obj) {
        return test(obj) || oo00o0o0.test(obj);
    }

    @SuppressLint({"MissingNullability"})
    static <T> oO00O0o0<T> o00oOooo(@SuppressLint({"MissingNullability"}) oO00O0o0<? super T> oo00o0o0) {
        Objects.requireNonNull(oo00o0o0);
        return (oO00O0o0<? super T>) oo00o0o0.negate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean o00oo00O(oO00O0o0 oo00o0o0, Object obj) {
        return test(obj) && oo00o0o0.test(obj);
    }

    @SuppressLint({"MissingNullability"})
    default oO00O0o0<T> negate() {
        return new oO00O0o0() { // from class: o0ooOoOO.oO0O0OoO
            @Override // o0ooOoOO.oO00O0o0
            public final boolean test(Object obj) {
                boolean o00oOOoO2;
                o00oOOoO2 = oO00O0o0.this.o00oOOoO(obj);
                return o00oOOoO2;
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    default oO00O0o0<T> o00oOo0o(@SuppressLint({"MissingNullability"}) final oO00O0o0<? super T> oo00o0o0) {
        Objects.requireNonNull(oo00o0o0);
        return new oO00O0o0() { // from class: o0ooOoOO.oO000o00
            @Override // o0ooOoOO.oO00O0o0
            public final boolean test(Object obj) {
                boolean o00oo00O2;
                o00oo00O2 = oO00O0o0.this.o00oo00O(oo00o0o0, obj);
                return o00oo00O2;
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    default oO00O0o0<T> o00oOooO(@SuppressLint({"MissingNullability"}) final oO00O0o0<? super T> oo00o0o0) {
        Objects.requireNonNull(oo00o0o0);
        return new oO00O0o0() { // from class: o0ooOoOO.oO0OOo0o
            @Override // o0ooOoOO.oO00O0o0
            public final boolean test(Object obj) {
                boolean o00oOo002;
                o00oOo002 = oO00O0o0.this.o00oOo00(oo00o0o0, obj);
                return o00oOo002;
            }
        };
    }

    boolean test(T t);
}
