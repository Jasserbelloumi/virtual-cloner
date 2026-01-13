package o0OO0ooO;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o0OOO0OO.o00oo00O;
import o0OOOO.o00oOOo0;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
@o00oo0OO(name = "LocksKt")
@o0OOO00({"SMAP\nLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Locks.kt\nkotlin/concurrent/LocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes3.dex */
public final class o0O0o00 {
    @o00oo00O
    public static final <T> T o00oOOo0(ReentrantReadWriteLock reentrantReadWriteLock, o00oOOo0<? extends T> o00oooo02) {
        o0ooO.o00oo0O0(reentrantReadWriteLock, "<this>");
        o0ooO.o00oo0O0(o00oooo02, "action");
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            return o00oooo02.invoke();
        } finally {
            readLock.unlock();
        }
    }

    @o00oo00O
    public static final <T> T o00oOOoO(Lock lock, o00oOOo0<? extends T> o00oooo02) {
        o0ooO.o00oo0O0(lock, "<this>");
        o0ooO.o00oo0O0(o00oooo02, "action");
        lock.lock();
        try {
            return o00oooo02.invoke();
        } finally {
            lock.unlock();
        }
    }

    @o00oo00O
    public static final <T> T o00oOo00(ReentrantReadWriteLock reentrantReadWriteLock, o00oOOo0<? extends T> o00oooo02) {
        o0ooO.o00oo0O0(reentrantReadWriteLock, "<this>");
        o0ooO.o00oo0O0(o00oooo02, "action");
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return o00oooo02.invoke();
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }
}
