package o00ooo0;

import android.content.ContentValues;
import kotlin.Metadata;
import o0OOOoo0.oOo0oooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lo0OO0o/o0O0o00;", "", "", "pairs", "Landroid/content/ContentValues;", "o00oOOo0", "([Lo0OO0o/o0O0o00;)Landroid/content/ContentValues;", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o00ooO {
    @NotNull
    public static final ContentValues o00oOOo0(@NotNull o0OO0o.o0O0o00<String, ? extends Object>... o0o0o00Arr) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00Arr, "pairs");
        ContentValues contentValues = new ContentValues(o0o0o00Arr.length);
        for (o0OO0o.o0O0o00<String, ? extends Object> o0o0o00 : o0o0o00Arr) {
            String component1 = o0o0o00.component1();
            Object component2 = o0o0o00.component2();
            if (component2 == null) {
                contentValues.putNull(component1);
            } else if (component2 instanceof String) {
                contentValues.put(component1, (String) component2);
            } else if (component2 instanceof Integer) {
                contentValues.put(component1, (Integer) component2);
            } else if (component2 instanceof Long) {
                contentValues.put(component1, (Long) component2);
            } else if (component2 instanceof Boolean) {
                contentValues.put(component1, (Boolean) component2);
            } else if (component2 instanceof Float) {
                contentValues.put(component1, (Float) component2);
            } else if (component2 instanceof Double) {
                contentValues.put(component1, (Double) component2);
            } else if (component2 instanceof byte[]) {
                contentValues.put(component1, (byte[]) component2);
            } else if (component2 instanceof Byte) {
                contentValues.put(component1, (Byte) component2);
            } else if (!(component2 instanceof Short)) {
                throw new IllegalArgumentException("Illegal value type " + component2.getClass().getCanonicalName() + " for key \"" + component1 + oOo0oooO.f13903o00oOOoO);
            } else {
                contentValues.put(component1, (Short) component2);
            }
        }
        return contentValues;
    }
}
