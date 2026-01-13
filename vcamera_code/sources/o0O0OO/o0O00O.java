package o0O0OO;

import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0O00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f11312o00oOOo0 = "room_master_table";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f11313o00oOOoO = "room_master_table";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f11314o00oOo00 = "id";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f11315o00oOo0O = "42";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f11316o00oOo0o = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f11317o00oOoO0 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f11318o00oOooO = "identity_hash";

    public static String o00oOOo0(String str) {
        return android.support.v4.media.o00oOoO.o00oOOo0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", str, "')");
    }
}
