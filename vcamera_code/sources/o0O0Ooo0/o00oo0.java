package o0O0Ooo0;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class o00oo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Set<o00oOOo0> f12144o00oOOo0 = new HashSet();

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Uri f12145o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final boolean f12146o00oOOoO;

        public o00oOOo0(@oo0oO0 Uri uri, boolean z) {
            this.f12145o00oOOo0 = uri;
            this.f12146o00oOOoO = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || o00oOOo0.class != obj.getClass()) {
                return false;
            }
            o00oOOo0 o00oooo02 = (o00oOOo0) obj;
            return this.f12146o00oOOoO == o00oooo02.f12146o00oOOoO && this.f12145o00oOOo0.equals(o00oooo02.f12145o00oOOo0);
        }

        public int hashCode() {
            return (this.f12145o00oOOo0.hashCode() * 31) + (this.f12146o00oOOoO ? 1 : 0);
        }

        @oo0oO0
        public Uri o00oOOo0() {
            return this.f12145o00oOOo0;
        }

        public boolean o00oOOoO() {
            return this.f12146o00oOOoO;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00oo0.class != obj.getClass()) {
            return false;
        }
        return this.f12144o00oOOo0.equals(((o00oo0) obj).f12144o00oOOo0);
    }

    public int hashCode() {
        return this.f12144o00oOOo0.hashCode();
    }

    public void o00oOOo0(@oo0oO0 Uri uri, boolean z) {
        this.f12144o00oOOo0.add(new o00oOOo0(uri, z));
    }

    @oo0oO0
    public Set<o00oOOo0> o00oOOoO() {
        return this.f12144o00oOOo0;
    }

    public int o00oOo00() {
        return this.f12144o00oOOo0.size();
    }
}
