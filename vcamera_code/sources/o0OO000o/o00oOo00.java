package o0OO000o;

import android.content.ComponentName;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import java.util.Map;
import o0OO000o.o00oOoO;
/* loaded from: classes2.dex */
public class o00oOo00 {
    public static String o00oOOo0(Intent intent) {
        if (intent == null) {
            return null;
        }
        ComponentName component = intent.getComponent();
        return component != null ? component.getPackageName() : intent.getPackage();
    }

    public static boolean o00oOOoO(Intent intent) {
        return intent != null && intent.getAction() != null && TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") && intent.hasCategory("android.intent.category.HOME");
    }

    public static String o00oOo00(Intent intent) {
        if (intent != null) {
            StringBuilder sb = new StringBuilder();
            if (intent.getExtras() != null) {
                sb.append(o00oOooO(intent.getExtras()));
            }
            return sb.toString();
        }
        return null;
    }

    public static String o00oOooO(Bundle bundle) {
        String o00oOo002;
        if (bundle != null) {
            bundle.setClassLoader(o00oOo00.class.getClassLoader());
            bundle.containsKey("test");
            ArrayMap arrayMap = (ArrayMap) new o00oOoO.o00oOOo0(BaseBundle.class, false, "mMap").o00oOOo0(bundle);
            if (arrayMap != null) {
                StringBuilder sb = new StringBuilder("{<- ");
                for (Map.Entry entry : arrayMap.entrySet()) {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("[");
                    o00oOOo02.append((String) entry.getKey());
                    sb.append(o00oOOo02.toString());
                    sb.append(":");
                    Object value = entry.getValue();
                    if (value instanceof Bundle) {
                        o00oOo002 = o00oOooO((Bundle) value);
                    } else if (value instanceof Intent) {
                        o00oOo002 = o00oOo00((Intent) value);
                    } else {
                        sb.append(value);
                        sb.append("]");
                    }
                    sb.append(o00oOo002);
                    sb.append("]");
                }
                sb.append(" ->}");
                return sb.toString();
            }
            return null;
        }
        return null;
    }
}
