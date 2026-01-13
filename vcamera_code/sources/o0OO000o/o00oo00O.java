package o0OO000o;
/* loaded from: classes2.dex */
public abstract class o00oo00O<T> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public T f12972o00oOOo0;

    public abstract T o00oOOo0();

    public final T o00oOOoO() {
        T t;
        synchronized (this) {
            if (this.f12972o00oOOo0 == null) {
                this.f12972o00oOOo0 = o00oOOo0();
            }
            t = this.f12972o00oOOo0;
        }
        return t;
    }
}
