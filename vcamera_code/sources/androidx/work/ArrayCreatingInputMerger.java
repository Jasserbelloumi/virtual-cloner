package androidx.work;

import androidx.work.o00oOOoO;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o00ooO;
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends o00ooO {
    @Override // o0O0Ooo0.o00ooO
    @oo0oO0
    public o00oOOoO o00oOOoO(@oo0oO0 List<o00oOOoO> list) {
        o00oOOoO.o00oOOo0 o00oooo02 = new o00oOOoO.o00oOOo0();
        HashMap hashMap = new HashMap();
        for (o00oOOoO o00ooooo2 : list) {
            for (Map.Entry<String, Object> entry : o00ooooo2.o00ooO00().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = hashMap.get(key);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        value = cls2.isArray() ? o00oOooO(obj, value) : o00oOo0O(obj, value);
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        value = o00oOo00(obj, value);
                    } else if (!cls.isArray() || !cls.getComponentType().equals(cls2)) {
                        throw new IllegalArgumentException();
                    } else {
                        value = o00oOo00(value, obj);
                    }
                } else if (!cls.isArray()) {
                    value = o00oOo0o(value);
                }
                hashMap.put(key, value);
            }
        }
        o00oooo02.o00oOooO(hashMap);
        return o00oooo02.o00oOOo0();
    }

    public final Object o00oOo00(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }

    public final Object o00oOo0O(Object obj, Object obj2) {
        Object newInstance = Array.newInstance(obj.getClass(), 2);
        Array.set(newInstance, 0, obj);
        Array.set(newInstance, 1, obj2);
        return newInstance;
    }

    public final Object o00oOo0o(Object obj) {
        Object newInstance = Array.newInstance(obj.getClass(), 1);
        Array.set(newInstance, 0, obj);
        return newInstance;
    }

    public final Object o00oOooO(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        return newInstance;
    }
}
