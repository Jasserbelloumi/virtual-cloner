package o00ooo0;

import android.content.LocusId;
import android.os.Build;
import android.support.v4.media.o00oOo0O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public final class o0O0OO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f9617o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final LocusId f9618o00oOOoO;

    @o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @oo0oO0
        public static LocusId o00oOOo0(@oo0oO0 String str) {
            return new LocusId(str);
        }

        @oo0oO0
        public static String o00oOOoO(@oo0oO0 LocusId locusId) {
            return locusId.getId();
        }
    }

    public o0O0OO(@oo0oO0 String str) {
        this.f9617o00oOOo0 = (String) ooOOOOoo.o00oo0O(str, "id cannot be empty");
        this.f9618o00oOOoO = Build.VERSION.SDK_INT >= 29 ? o00oOOo0.o00oOOo0(str) : null;
    }

    @o0OOooO0(29)
    @oo0oO0
    public static o0O0OO o00oOooO(@oo0oO0 LocusId locusId) {
        ooOOOOoo.o00oo00O(locusId, "locusId cannot be null");
        return new o0O0OO((String) ooOOOOoo.o00oo0O(o00oOOo0.o00oOOoO(locusId), "id cannot be empty"));
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o0O0OO.class == obj.getClass()) {
            String str = this.f9617o00oOOo0;
            String str2 = ((o0O0OO) obj).f9617o00oOOo0;
            return str == null ? str2 == null : str.equals(str2);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9617o00oOOo0;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @oo0oO0
    public String o00oOOo0() {
        return this.f9617o00oOOo0;
    }

    @oo0oO0
    public final String o00oOOoO() {
        int length = this.f9617o00oOOo0.length();
        return length + "_chars";
    }

    @o0OOooO0(29)
    @oo0oO0
    public LocusId o00oOo00() {
        return this.f9618o00oOOoO;
    }

    @oo0oO0
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("LocusIdCompat[");
        o00oOOo02.append(o00oOOoO());
        o00oOOo02.append("]");
        return o00oOOo02.toString();
    }
}
