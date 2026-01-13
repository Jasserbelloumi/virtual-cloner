package o00ooO00;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.o00oOOo0;
import java.util.HashMap;
import java.util.HashSet;
/* loaded from: classes.dex */
public abstract class o00oo0 {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static int f8111o00oOo0o = -1;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f8112o00oOoO = "elevation";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f8113o00oOoO0 = "alpha";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f8114o00oOoOO = "rotation";

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f8115o00oOoOo = "rotationX";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f8116o00oOoo0 = "rotationY";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f8117o00oOooo = "transformPivotX";

    /* renamed from: o00oo  reason: collision with root package name */
    public static final String f8118o00oo = "progress";

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f8119o00oo0 = "transitionPathRotate";

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final String f8120o00oo00O = "transformPivotY";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f8121o00oo0O = "wavePeriod";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f8122o00oo0O0 = "scaleY";

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final String f8123o00oo0OO = "scaleX";

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String f8124o00oo0Oo = "waveOffset";

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f8125o00oo0o = "translationX";

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f8126o00oo0o0 = "waveVariesBy";

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f8127o00oo0oO = "translationY";

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final String f8128o00ooO00 = "CUSTOM";

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final String f8129o0O0o = "translationZ";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f8130o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f8131o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public String f8132o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public HashMap<String, o00oOOo0> f8133o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f8134o00oOooO;

    public o00oo0() {
        int i = f8111o00oOo0o;
        this.f8130o00oOOo0 = i;
        this.f8131o00oOOoO = i;
        this.f8132o00oOo00 = null;
    }

    public abstract void o00oOOo0(HashMap<String, o0OoO00O> hashMap);

    public abstract void o00oOOoO(HashSet<String> hashSet);

    public abstract void o00oOo00(Context context, AttributeSet attributeSet);

    public void o00oOo0O(HashMap<String, Integer> hashMap) {
    }

    public abstract void o00oOo0o(String str, Object obj);

    public float o00oOoO(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public boolean o00oOoO0(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    public int o00oOoOO(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    public boolean o00oOooO(String str) {
        String str2 = this.f8132o00oOo00;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }
}
