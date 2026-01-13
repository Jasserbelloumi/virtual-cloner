package o0OOo0o0;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOO.o00oo;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00062\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR:\u0010\u000f\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lo0OOo0o0/oOo00OO0;", "Lo0OOo0o0/o0OO00o0;", "Ljava/lang/Class;", "", "key", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "o00oOOo0", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", o00oOOoO.f12961o00oOo00, "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "cacheLock", "Ljava/util/WeakHashMap;", "o00oOo00", "Ljava/util/WeakHashMap;", "exceptionCtors", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oOo00OO0 extends o0OO00o0 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final oOo00OO0 f14667o00oOOo0 = new oOo00OO0();
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final ReentrantReadWriteLock f14668o00oOOoO = new ReentrantReadWriteLock();
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final WeakHashMap<Class<? extends Throwable>, o00oo<Throwable, Throwable>> f14669o00oOo00 = new WeakHashMap<>();

    @Override // o0OOo0o0.o0OO00o0
    @NotNull
    public o00oo<Throwable, Throwable> o00oOOo0(@NotNull Class<? extends Throwable> cls) {
        o00oo<Throwable, Throwable> o00oOOoO2;
        ReentrantReadWriteLock reentrantReadWriteLock = f14668o00oOOoO;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            o00oo<Throwable, Throwable> o00ooVar = f14669o00oOo00.get(cls);
            if (o00ooVar != null) {
                return o00ooVar;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, o00oo<Throwable, Throwable>> weakHashMap = f14669o00oOo00;
                o00oo<Throwable, Throwable> o00ooVar2 = weakHashMap.get(cls);
                if (o00ooVar2 != null) {
                    return o00ooVar2;
                }
                o00oOOoO2 = o0OO0.o00oOOoO(cls);
                weakHashMap.put(cls, o00oOOoO2);
                while (i < readHoldCount) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
                return o00oOOoO2;
            } finally {
                while (i < readHoldCount) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
