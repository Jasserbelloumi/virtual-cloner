package o0O000;

import android.os.PersistableBundle;
import kotlin.Metadata;
import o00oOooO.o0OOooO0;
import o0OOOOO0.o0ooO;
import o0OOOoo0.oOo0oooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOooO0(21)
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\u000e"}, d2 = {"Lo0O000/o0OoO00O;", "", "", "capacity", "Landroid/os/PersistableBundle;", "o00oOOo0", "persistableBundle", "", "key", "value", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "<init>", "()V", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o0OoO00O {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0OoO00O f10136o00oOOo0 = new o0OoO00O();

    @o00oOooO.o0O0O0Oo
    @o0OOOO0o.o00ooO0
    @NotNull
    public static final PersistableBundle o00oOOo0(int i) {
        return new PersistableBundle(i);
    }

    @o00oOooO.o0O0O0Oo
    @o0OOOO0o.o00ooO0
    public static final void o00oOOoO(@NotNull PersistableBundle persistableBundle, @Nullable String str, @Nullable Object obj) {
        String str2;
        o0ooO.o00oo0O0(persistableBundle, "persistableBundle");
        if (obj == null) {
            str2 = null;
        } else if (obj instanceof Boolean) {
            o0O00O0o.o00oOOo0(persistableBundle, str, ((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof Double) {
            persistableBundle.putDouble(str, ((Number) obj).doubleValue());
            return;
        } else if (obj instanceof Integer) {
            persistableBundle.putInt(str, ((Number) obj).intValue());
            return;
        } else if (obj instanceof Long) {
            persistableBundle.putLong(str, ((Number) obj).longValue());
            return;
        } else if (!(obj instanceof String)) {
            if (obj instanceof boolean[]) {
                o0O00O0o.o00oOOoO(persistableBundle, str, (boolean[]) obj);
                return;
            } else if (obj instanceof double[]) {
                persistableBundle.putDoubleArray(str, (double[]) obj);
                return;
            } else if (obj instanceof int[]) {
                persistableBundle.putIntArray(str, (int[]) obj);
                return;
            } else if (obj instanceof long[]) {
                persistableBundle.putLongArray(str, (long[]) obj);
                return;
            } else if (!(obj instanceof Object[])) {
                String canonicalName = obj.getClass().getCanonicalName();
                throw new IllegalArgumentException("Illegal value type " + canonicalName + " for key \"" + str + oOo0oooO.f13903o00oOOoO);
            } else {
                Class<?> componentType = obj.getClass().getComponentType();
                o0ooO.o00oo00O(componentType);
                if (String.class.isAssignableFrom(componentType)) {
                    o0ooO.o00oo0(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    persistableBundle.putStringArray(str, (String[]) obj);
                    return;
                }
                String canonicalName2 = componentType.getCanonicalName();
                throw new IllegalArgumentException("Illegal value array type " + canonicalName2 + " for key \"" + str + oOo0oooO.f13903o00oOOoO);
            }
        } else {
            str2 = (String) obj;
        }
        persistableBundle.putString(str, str2);
    }
}
