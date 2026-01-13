package o0OOOOO0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
/* loaded from: classes3.dex */
public class o0OOO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ArrayList<Object> f13614o00oOOo0;

    public o0OOO0(int i) {
        this.f13614o00oOOo0 = new ArrayList<>(i);
    }

    public void o00oOOo0(Object obj) {
        this.f13614o00oOOo0.add(obj);
    }

    public void o00oOOoO(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f13614o00oOOo0;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f13614o00oOOo0, objArr);
            }
        } else if (obj instanceof Collection) {
            this.f13614o00oOOo0.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                this.f13614o00oOOo0.add(obj2);
            }
        } else if (!(obj instanceof Iterator)) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Don't know how to spread ");
            o00oOOo02.append(obj.getClass());
            throw new UnsupportedOperationException(o00oOOo02.toString());
        } else {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                this.f13614o00oOOo0.add(it.next());
            }
        }
    }

    public int o00oOo00() {
        return this.f13614o00oOOo0.size();
    }

    public Object[] o00oOooO(Object[] objArr) {
        return this.f13614o00oOOo0.toArray(objArr);
    }
}
