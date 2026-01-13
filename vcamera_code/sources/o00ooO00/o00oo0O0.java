package o00ooO00;

import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public class o00oo0O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public HashMap<Object, HashMap<String, float[]>> f8187o00oOOo0 = new HashMap<>();

    public float o00oOOo0(Object obj, String str, int i) {
        if (this.f8187o00oOOo0.containsKey(obj)) {
            HashMap<String, float[]> hashMap = this.f8187o00oOOo0.get(obj);
            if (hashMap.containsKey(str)) {
                float[] fArr = hashMap.get(str);
                if (fArr.length > i) {
                    return fArr[i];
                }
                return Float.NaN;
            }
            return Float.NaN;
        }
        return Float.NaN;
    }

    public void o00oOOoO(Object obj, String str, int i, float f) {
        HashMap<String, float[]> hashMap;
        if (this.f8187o00oOOo0.containsKey(obj)) {
            hashMap = this.f8187o00oOOo0.get(obj);
            if (hashMap.containsKey(str)) {
                float[] fArr = hashMap.get(str);
                if (fArr.length <= i) {
                    fArr = Arrays.copyOf(fArr, i + 1);
                }
                fArr[i] = f;
                hashMap.put(str, fArr);
                return;
            }
            float[] fArr2 = new float[i + 1];
            fArr2[i] = f;
            hashMap.put(str, fArr2);
        } else {
            hashMap = new HashMap<>();
            float[] fArr3 = new float[i + 1];
            fArr3[i] = f;
            hashMap.put(str, fArr3);
        }
        this.f8187o00oOOo0.put(obj, hashMap);
    }
}
