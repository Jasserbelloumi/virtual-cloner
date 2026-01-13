package o00oooO;

import android.database.Cursor;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¨\u0006\u0015"}, d2 = {"Landroid/database/Cursor;", "", FirebaseAnalytics.Param.INDEX, "", "o00oOOo0", "", o00oOOoO.f12961o00oOo00, "(Landroid/database/Cursor;I)Ljava/lang/Double;", "", "o00oOo00", "(Landroid/database/Cursor;I)Ljava/lang/Float;", "o00oOooO", "(Landroid/database/Cursor;I)Ljava/lang/Integer;", "", "o00oOo0O", "(Landroid/database/Cursor;I)Ljava/lang/Long;", "", "o00oOo0o", "(Landroid/database/Cursor;I)Ljava/lang/Short;", "", "o00oOoO0", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o00oo0 {
    @Nullable
    public static final byte[] o00oOOo0(@NotNull Cursor cursor, int i) {
        o0ooO.o00oo0O0(cursor, "<this>");
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getBlob(i);
    }

    @Nullable
    public static final Double o00oOOoO(@NotNull Cursor cursor, int i) {
        o0ooO.o00oo0O0(cursor, "<this>");
        if (cursor.isNull(i)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i));
    }

    @Nullable
    public static final Float o00oOo00(@NotNull Cursor cursor, int i) {
        o0ooO.o00oo0O0(cursor, "<this>");
        if (cursor.isNull(i)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i));
    }

    @Nullable
    public static final Long o00oOo0O(@NotNull Cursor cursor, int i) {
        o0ooO.o00oo0O0(cursor, "<this>");
        if (cursor.isNull(i)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i));
    }

    @Nullable
    public static final Short o00oOo0o(@NotNull Cursor cursor, int i) {
        o0ooO.o00oo0O0(cursor, "<this>");
        if (cursor.isNull(i)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i));
    }

    @Nullable
    public static final String o00oOoO0(@NotNull Cursor cursor, int i) {
        o0ooO.o00oo0O0(cursor, "<this>");
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }

    @Nullable
    public static final Integer o00oOooO(@NotNull Cursor cursor, int i) {
        o0ooO.o00oo0O0(cursor, "<this>");
        if (cursor.isNull(i)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i));
    }
}
