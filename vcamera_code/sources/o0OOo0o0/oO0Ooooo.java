package o0OOo0o0;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import o00oOoOo.o00oo;
import o0OO.o00oOo0O;
import o0OO000o.o00oOOoO;
import o0OO0o.o0O0o00;
import o0OO0o.oo0oO0;
import o0OOO0.o00oOoO;
import o0OOOOO0.o0ooO;
import o0OOOoo0.oO0O00o0;
import o0OOo00O.o0OooO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a.\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0004\u001a;\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0010\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00180\u0017\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010\u001d\u001a\u00020\u001c2\u0010\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00182\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0000H\u0080Hø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\"\u0010\"\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\"\u0010\u0004\u001a!\u0010#\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b#\u0010\u0004\u001a\u001e\u0010$\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002\u001a\u0014\u0010'\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010&\u001a\u00020%H\u0007\u001a\u0010\u0010)\u001a\u00020(*\u00060\u0012j\u0002`\u0013H\u0000\u001a%\u0010,\u001a\u00020+*\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00182\u0006\u0010*\u001a\u00020%H\u0002¢\u0006\u0004\b,\u0010-\u001a\u001c\u0010/\u001a\u00020(*\u00060\u0012j\u0002`\u00132\n\u0010.\u001a\u00060\u0012j\u0002`\u0013H\u0002\u001a\u0014\u00100\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0000\"\u0014\u00103\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00102\"\u0014\u00105\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00102\"\u001c\u00108\u001a\n 6*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00102\"\u001c\u00109\u001a\n 6*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00102*\f\b\u0000\u0010:\"\u00020\n2\u00020\n*\f\b\u0000\u0010;\"\u00020\u00122\u00020\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"", "E", "exception", "o00oo0O0", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "o00oo0Oo", "Lo0OO/o00oOo0O;", "continuation", "o00oo0O", "(Ljava/lang/Throwable;Lo0OO/o00oOo0O;)Ljava/lang/Throwable;", "Lo0OOO0/o00oOoO;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "o00oo0OO", "(Ljava/lang/Throwable;Lo0OOO0/o00oOoO;)Ljava/lang/Throwable;", "o00oo0o0", "cause", "result", "Ljava/util/ArrayDeque;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "resultStackTrace", "o00oOo0o", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "Lo0OO0o/o0O0o00;", "", "o00oOo0O", "(Ljava/lang/Throwable;)Lo0OO0o/o0O0o00;", "recoveredStacktrace", "Lo0OO0o/oO0Ooooo;", "o00oOooo", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "", "o00oo00O", "(Ljava/lang/Throwable;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o00oo0o", "o00oo0oO", "o00oOoO0", "", "message", "o00oOooO", "", "o00oOoo0", "methodName", "", "o00oOoOO", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "e", "o00oOoO", "o00oOoOo", "o00oOOo0", "Ljava/lang/String;", "baseContinuationImplClass", o00oOOoO.f12961o00oOo00, "stackTraceRecoveryClass", "kotlin.jvm.PlatformType", "o00oOo00", "baseContinuationImplClassName", "stackTraceRecoveryClassName", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0Ooooo {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f14662o00oOOo0 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f14663o00oOOoO = "kotlinx.coroutines.internal.StackTraceRecoveryKt";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f14664o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f14665o00oOooO;

    static {
        Object m7constructorimpl;
        Object m7constructorimpl2;
        try {
            oo0oO0.o00oOOo0 o00oooo02 = o0OO0o.oo0oO0.Companion;
            m7constructorimpl = o0OO0o.oo0oO0.m7constructorimpl(Class.forName("o0OOO0.o00oOOo0").getCanonicalName());
        } catch (Throwable th) {
            oo0oO0.o00oOOo0 o00oooo03 = o0OO0o.oo0oO0.Companion;
            m7constructorimpl = o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oo0ooO.o00oOOo0(th));
        }
        if (o0OO0o.oo0oO0.m10exceptionOrNullimpl(m7constructorimpl) != null) {
            m7constructorimpl = f14662o00oOOo0;
        }
        f14664o00oOo00 = (String) m7constructorimpl;
        try {
            oo0oO0.o00oOOo0 o00oooo04 = o0OO0o.oo0oO0.Companion;
            m7constructorimpl2 = o0OO0o.oo0oO0.m7constructorimpl(oO0Ooooo.class.getCanonicalName());
        } catch (Throwable th2) {
            oo0oO0.o00oOOo0 o00oooo05 = o0OO0o.oo0oO0.Companion;
            m7constructorimpl2 = o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oo0ooO.o00oOOo0(th2));
        }
        if (o0OO0o.oo0oO0.m10exceptionOrNullimpl(m7constructorimpl2) != null) {
            m7constructorimpl2 = f14663o00oOOoO;
        }
        f14665o00oOooO = (String) m7constructorimpl2;
    }

    public static /* synthetic */ void o00oOOo0() {
    }

    public static /* synthetic */ void o00oOOoO() {
    }

    public static final <E extends Throwable> o0O0o00<E, StackTraceElement[]> o00oOo0O(E e) {
        o0O0o00<E, StackTraceElement[]> o0o0o00;
        boolean z;
        Throwable cause = e.getCause();
        if (cause == null || !o0ooO.o00oOoO0(cause.getClass(), e.getClass())) {
            o0o0o00 = new o0O0o00<>(e, new StackTraceElement[0]);
        } else {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (o00oOoo0(stackTrace[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return new o0O0o00<>(cause, stackTrace);
            }
            o0o0o00 = new o0O0o00<>(e, new StackTraceElement[0]);
        }
        return o0o0o00;
    }

    public static final <E extends Throwable> E o00oOo0o(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(o00oOooO("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        int o00oOoOO2 = o00oOoOO(stackTrace, f14664o00oOo00);
        int i = 0;
        if (o00oOoOO2 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e2.setStackTrace((StackTraceElement[]) array);
                return e2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + o00oOoOO2];
        for (int i2 = 0; i2 < o00oOoOO2; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i + o00oOoOO2] = it.next();
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    public static final boolean o00oOoO(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && o0ooO.o00oOoO0(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && o0ooO.o00oOoO0(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && o0ooO.o00oOoO0(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    public static final ArrayDeque<StackTraceElement> o00oOoO0(o00oOoO o00oooo2) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = o00oooo2.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            o00oooo2 = o00oooo2.getCallerFrame();
            if (o00oooo2 == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = o00oooo2.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    public static final int o00oOoOO(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (o0ooO.o00oOoO0(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    public static final void o00oOoOo(@NotNull Throwable th, @NotNull Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean o00oOoo0(@NotNull StackTraceElement stackTraceElement) {
        return oO0O00o0.o0OOO0O(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
    }

    @o0OOo00O.oO0o0o
    @NotNull
    public static final StackTraceElement o00oOooO(@NotNull String str) {
        return new StackTraceElement(o00oo.o00oOOo0("\b\b\b(", str), "\b", "\b", -1);
    }

    public static final void o00oOooo(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (o00oOoo0(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 > length2) {
            return;
        }
        while (true) {
            if (o00oOoO(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i2) {
                return;
            }
            length2--;
        }
    }

    public static final Object o00oo0(Throwable th, o00oOo0O<?> o00ooo0o2) {
        throw th;
    }

    @Nullable
    public static final Object o00oo00O(@NotNull Throwable th, @NotNull o00oOo0O<?> o00ooo0o2) {
        throw th;
    }

    @NotNull
    public static final <E extends Throwable> E o00oo0O(@NotNull E e, @NotNull o00oOo0O<?> o00ooo0o2) {
        return e;
    }

    @NotNull
    public static final <E extends Throwable> E o00oo0O0(@NotNull E e) {
        return e;
    }

    public static final <E extends Throwable> E o00oo0OO(E e, o00oOoO o00oooo2) {
        o0O0o00 o00oOo0O2 = o00oOo0O(e);
        Throwable th = (Throwable) o00oOo0O2.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) o00oOo0O2.component2();
        Throwable o00oo0o02 = o00oo0o0(th);
        if (o00oo0o02 == null) {
            return e;
        }
        ArrayDeque<StackTraceElement> o00oOoO02 = o00oOoO0(o00oooo2);
        if (o00oOoO02.isEmpty()) {
            return e;
        }
        if (th != e) {
            o00oOooo(stackTraceElementArr, o00oOoO02);
        }
        return (E) o00oOo0o(th, o00oo0o02, o00oOoO02);
    }

    public static final <E extends Throwable> E o00oo0Oo(E e) {
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int o00oOoOO2 = o00oOoOO(stackTrace, f14665o00oOooO);
        int i = o00oOoOO2 + 1;
        int o00oOoOO3 = o00oOoOO(stackTrace, f14664o00oOo00);
        int i2 = 0;
        int i3 = (length - o00oOoOO2) - (o00oOoOO3 == -1 ? 0 : length - o00oOoOO3);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i3];
        while (i2 < i3) {
            stackTraceElementArr[i2] = i2 == 0 ? o00oOooO("Coroutine boundary") : stackTrace[(i + i2) - 1];
            i2++;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    @NotNull
    public static final <E extends Throwable> E o00oo0o(@NotNull E e) {
        return e;
    }

    public static final <E extends Throwable> E o00oo0o0(E e) {
        E e2 = (E) o0OO0.o00oOoO(e);
        if (e2 == null) {
            return null;
        }
        if ((e instanceof o0OooO0) || o0ooO.o00oOoO0(e2.getMessage(), e.getMessage())) {
            return e2;
        }
        return null;
    }

    @NotNull
    public static final <E extends Throwable> E o00oo0oO(@NotNull E e) {
        E e2 = (E) e.getCause();
        if (e2 != null && o0ooO.o00oOoO0(e2.getClass(), e.getClass())) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (o00oOoo0(stackTrace[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return e2;
            }
        }
        return e;
    }
}
