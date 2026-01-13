package o0O0OO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class o00oo0O<T> extends o0O0O0O {
    public o00oo0O(o0O00O0o o0o00o0o) {
        super(o0o00o0o);
    }

    public final void o00oOoO(Iterable<? extends T> iterable) {
        o0O0OOoO.o0O0000O o00oOOo02 = o00oOOo0();
        try {
            for (T t : iterable) {
                o00oOoO0(o00oOOo02, t);
                o00oOOo02.o0O00OO();
            }
        } finally {
            o00oOo0o(o00oOOo02);
        }
    }

    public abstract void o00oOoO0(o0O0OOoO.o0O0000O o0o0000o, T t);

    public final void o00oOoOO(T t) {
        o0O0OOoO.o0O0000O o00oOOo02 = o00oOOo0();
        try {
            o00oOoO0(o00oOOo02, t);
            o00oOOo02.o0O00OO();
        } finally {
            o00oOo0o(o00oOOo02);
        }
    }

    public final void o00oOoOo(T[] tArr) {
        o0O0OOoO.o0O0000O o00oOOo02 = o00oOOo0();
        try {
            for (T t : tArr) {
                o00oOoO0(o00oOOo02, t);
                o00oOOo02.o0O00OO();
            }
        } finally {
            o00oOo0o(o00oOOo02);
        }
    }

    public final long o00oOoo0(T t) {
        o0O0OOoO.o0O0000O o00oOOo02 = o00oOOo0();
        try {
            o00oOoO0(o00oOOo02, t);
            return o00oOOo02.o0O00OO();
        } finally {
            o00oOo0o(o00oOOo02);
        }
    }

    public final long[] o00oOooo(Collection<? extends T> collection) {
        o0O0OOoO.o0O0000O o00oOOo02 = o00oOOo0();
        try {
            long[] jArr = new long[collection.size()];
            int i = 0;
            for (T t : collection) {
                o00oOoO0(o00oOOo02, t);
                jArr[i] = o00oOOo02.o0O00OO();
                i++;
            }
            return jArr;
        } finally {
            o00oOo0o(o00oOOo02);
        }
    }

    public final Long[] o00oo0(Collection<? extends T> collection) {
        o0O0OOoO.o0O0000O o00oOOo02 = o00oOOo0();
        try {
            Long[] lArr = new Long[collection.size()];
            int i = 0;
            for (T t : collection) {
                o00oOoO0(o00oOOo02, t);
                lArr[i] = Long.valueOf(o00oOOo02.o0O00OO());
                i++;
            }
            return lArr;
        } finally {
            o00oOo0o(o00oOOo02);
        }
    }

    public final long[] o00oo00O(T[] tArr) {
        o0O0OOoO.o0O0000O o00oOOo02 = o00oOOo0();
        try {
            long[] jArr = new long[tArr.length];
            int i = 0;
            for (T t : tArr) {
                o00oOoO0(o00oOOo02, t);
                jArr[i] = o00oOOo02.o0O00OO();
                i++;
            }
            return jArr;
        } finally {
            o00oOo0o(o00oOOo02);
        }
    }

    public final List<Long> o00oo0O(T[] tArr) {
        o0O0OOoO.o0O0000O o00oOOo02 = o00oOOo0();
        try {
            ArrayList arrayList = new ArrayList(tArr.length);
            int i = 0;
            for (T t : tArr) {
                o00oOoO0(o00oOOo02, t);
                arrayList.add(i, Long.valueOf(o00oOOo02.o0O00OO()));
                i++;
            }
            return arrayList;
        } finally {
            o00oOo0o(o00oOOo02);
        }
    }

    public final List<Long> o00oo0O0(Collection<? extends T> collection) {
        o0O0OOoO.o0O0000O o00oOOo02 = o00oOOo0();
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            int i = 0;
            for (T t : collection) {
                o00oOoO0(o00oOOo02, t);
                arrayList.add(i, Long.valueOf(o00oOOo02.o0O00OO()));
                i++;
            }
            return arrayList;
        } finally {
            o00oOo0o(o00oOOo02);
        }
    }

    public final Long[] o00oo0OO(T[] tArr) {
        o0O0OOoO.o0O0000O o00oOOo02 = o00oOOo0();
        try {
            Long[] lArr = new Long[tArr.length];
            int i = 0;
            for (T t : tArr) {
                o00oOoO0(o00oOOo02, t);
                lArr[i] = Long.valueOf(o00oOOo02.o0O00OO());
                i++;
            }
            return lArr;
        } finally {
            o00oOo0o(o00oOOo02);
        }
    }
}
