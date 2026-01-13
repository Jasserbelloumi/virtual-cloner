package o0Oo0Oo;
/* loaded from: classes3.dex */
public abstract class oO00000o implements Runnable {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final String f15749o00oo0O0;

    public oO00000o(String str, Object... objArr) {
        this.f15749o00oo0O0 = oO0000O.o00oo00O(str, objArr);
    }

    public abstract void o00oOooo();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f15749o00oo0O0);
        try {
            o00oOooo();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
