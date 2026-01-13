package o0O0OO;

import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class o00oo0O0<T> extends o0O0O0O {
    public o00oo0O0(o0O00O0o o0o00o0o) {
        super(o0o00o0o);
    }

    public final int o00oOoO(T t) {
        o0O0OOoO.o0O0000O o00oOOo02 = o00oOOo0();
        try {
            o00oOoO0(o00oOOo02, t);
            return o00oOOo02.o00oo0oO();
        } finally {
            o00oOo0o(o00oOOo02);
        }
    }

    public abstract void o00oOoO0(o0O0OOoO.o0O0000O o0o0000o, T t);

    public final int o00oOoOO(Iterable<? extends T> iterable) {
        o0O0OOoO.o0O0000O o00oOOo02 = o00oOOo0();
        int i = 0;
        try {
            for (T t : iterable) {
                o00oOoO0(o00oOOo02, t);
                i += o00oOOo02.o00oo0oO();
            }
            return i;
        } finally {
            o00oOo0o(o00oOOo02);
        }
    }

    public final int o00oOoOo(T[] tArr) {
        o0O0OOoO.o0O0000O o00oOOo02 = o00oOOo0();
        try {
            int i = 0;
            for (T t : tArr) {
                o00oOoO0(o00oOOo02, t);
                i += o00oOOo02.o00oo0oO();
            }
            return i;
        } finally {
            o00oOo0o(o00oOOo02);
        }
    }

    @Override // o0O0OO.o0O0O0O
    public abstract String o00oOooO();
}
