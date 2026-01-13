package o0O0OO;

import android.content.Context;
import o00oOooO.oo0oO0;
import o0O0OO.o0O00O0o;
/* loaded from: classes.dex */
public class o0OoO00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f11397o00oOOo0 = "ROOM";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f11398o00oOOoO = "room_master_table";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f11399o00oOo00 = "_CursorConverter";

    @oo0oO0
    public static <T extends o0O00O0o> o0O00O0o.o00oOOo0<T> o00oOOo0(@oo0oO0 Context context, @oo0oO0 Class<T> cls, @oo0oO0 String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new o0O00O0o.o00oOOo0<>(context, cls, str);
    }

    @oo0oO0
    public static <T, C> T o00oOOoO(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str3 = canonicalName.replace('.', '_') + str;
        try {
            if (name.isEmpty()) {
                str2 = str3;
            } else {
                str2 = name + "." + str3;
            }
            return (T) Class.forName(str2).newInstance();
        } catch (ClassNotFoundException unused) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("cannot find implementation for ");
            o00oOOo02.append(cls.getCanonicalName());
            o00oOOo02.append(". ");
            o00oOOo02.append(str3);
            o00oOOo02.append(" does not exist");
            throw new RuntimeException(o00oOOo02.toString());
        } catch (IllegalAccessException unused2) {
            StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("Cannot access the constructor");
            o00oOOo03.append(cls.getCanonicalName());
            throw new RuntimeException(o00oOOo03.toString());
        } catch (InstantiationException unused3) {
            StringBuilder o00oOOo04 = android.support.v4.media.o00oOo0O.o00oOOo0("Failed to create an instance of ");
            o00oOOo04.append(cls.getCanonicalName());
            throw new RuntimeException(o00oOOo04.toString());
        }
    }

    @oo0oO0
    public static <T extends o0O00O0o> o0O00O0o.o00oOOo0<T> o00oOo00(@oo0oO0 Context context, @oo0oO0 Class<T> cls) {
        return new o0O00O0o.o00oOOo0<>(context, cls, null);
    }
}
