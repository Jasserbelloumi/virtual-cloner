package o0OOo0o0;

import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOO.o00oo;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0007*\u0001\b\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00062\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lo0OOo0o0/o0O;", "Lo0OOo0o0/o0OO00o0;", "Ljava/lang/Class;", "", "key", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "o00oOOo0", "o0OOo0o0/o0O$o00oOOo0", o00oOOoO.f12961o00oOo00, "Lo0OOo0o0/o0O$o00oOOo0;", "cache", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@IgnoreJRERequirement
/* loaded from: classes3.dex */
public final class o0O extends o0OO00o0 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0O f14567o00oOOo0 = new o0O();
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final o00oOOo0 f14568o00oOOoO = new o00oOOo0();

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00040\u0001J(\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00042\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H\u0014¨\u0006\b"}, d2 = {"o0OOo0o0/o0O$o00oOOo0", "Ljava/lang/ClassValue;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", "Ljava/lang/Class;", "type", o00oOOoO.f12961o00oOo00, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends ClassValue<o00oo<? super Throwable, ? extends Throwable>> {
        @NotNull
        /* renamed from: o00oOOoO */
        public o00oo<Throwable, Throwable> o00oOOo0(@Nullable Class<?> cls) {
            o00oo<Throwable, Throwable> o00oOOoO2;
            if (cls != null) {
                o00oOOoO2 = o0OO0.o00oOOoO(cls);
                return o00oOOoO2;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
        }
    }

    @Override // o0OOo0o0.o0OO00o0
    @NotNull
    public o00oo<Throwable, Throwable> o00oOOo0(@NotNull Class<? extends Throwable> cls) {
        return (o00oo) f14568o00oOOoO.get(cls);
    }
}
