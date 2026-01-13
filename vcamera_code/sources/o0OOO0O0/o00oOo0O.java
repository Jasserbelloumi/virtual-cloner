package o0OOO0O0;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Serializable;
import java.lang.Enum;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00oOo0O<E extends Enum<E>> implements Serializable {
    @NotNull
    private static final o00oOOo0 Companion = new o00oOOo0(null);
    private static final long serialVersionUID = 0;
    @NotNull
    private final Class<E> c;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }
    }

    public o00oOo0O(@NotNull E[] eArr) {
        o0ooO.o00oo0O0(eArr, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        Class<E> cls = (Class<E>) eArr.getClass().getComponentType();
        o0ooO.o00oo00O(cls);
        this.c = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.c.getEnumConstants();
        o0ooO.o00oo0OO(enumConstants, "c.enumConstants");
        return o00oOOoO.o00oOOoO(enumConstants);
    }
}
