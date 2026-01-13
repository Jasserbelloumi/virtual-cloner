package o0OOooo0;

import java.util.Enumeration;
import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
public class oO0OO00<E> implements Enumeration<E> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Enumeration<E>[] f15414o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f15415o00oOOoO = 0;

    public oO0OO00(Enumeration<E>[] enumerationArr) {
        this.f15414o00oOOo0 = enumerationArr;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return o00oOOo0();
    }

    @Override // java.util.Enumeration
    public E nextElement() {
        if (o00oOOo0()) {
            return this.f15414o00oOOo0[this.f15415o00oOOoO].nextElement();
        }
        throw new NoSuchElementException();
    }

    public final boolean o00oOOo0() {
        while (true) {
            int i = this.f15415o00oOOoO;
            Enumeration<E>[] enumerationArr = this.f15414o00oOOo0;
            if (i >= enumerationArr.length) {
                return false;
            }
            Enumeration<E> enumeration = enumerationArr[i];
            if (enumeration != null && enumeration.hasMoreElements()) {
                return true;
            }
            this.f15415o00oOOoO++;
        }
    }
}
