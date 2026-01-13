package o0OOo00o;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import o0OO.o00oOOo0;
import o0OO.o00oo0;
import o0OOo00O.o0O0o00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lo0OOo00o/ooOOO0Oo;", "Lo0OO/o00oOOo0;", "Lo0OOo00O/o0O0o00;", "Lo0OO/o00oo0;", "context", "", "exception", "Lo0OO0o/oO0Ooooo;", "o0O0oOO0", "Ljava/lang/reflect/Method;", "oo0oOOo", "", "_preHandler", "Ljava/lang/Object;", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ooOOO0Oo extends o00oOOo0 implements o0O0o00 {
    @Nullable
    private volatile Object _preHandler;

    public ooOOO0Oo() {
        super(o0O0o00.f14011o00oOoO0);
        this._preHandler = this;
    }

    @Override // o0OOo00O.o0O0o00
    public void o0O0oOO0(@NotNull o00oo0 o00oo0Var, @NotNull Throwable th) {
    }

    public final Method oo0oOOo() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z = true;
                }
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }
}
