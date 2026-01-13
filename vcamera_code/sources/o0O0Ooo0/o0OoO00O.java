package o0O0Ooo0;

import android.support.v4.media.o00oOo0O;
import androidx.work.o00oOOoO;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o0OoO00O {
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public UUID f12200o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOOo0 f12201o00oOOoO;
    @oo0oO0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oOOoO f12202o00oOo00;
    @oo0oO0

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o00oOOoO f12203o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f12204o00oOo0o;
    @oo0oO0

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Set<String> f12205o00oOooO;

    /* loaded from: classes.dex */
    public enum o00oOOo0 {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o0OoO00O(@oo0oO0 UUID uuid, @oo0oO0 o00oOOo0 o00oooo02, @oo0oO0 o00oOOoO o00ooooo2, @oo0oO0 List<String> list, @oo0oO0 o00oOOoO o00ooooo3, int i) {
        this.f12200o00oOOo0 = uuid;
        this.f12201o00oOOoO = o00oooo02;
        this.f12202o00oOo00 = o00ooooo2;
        this.f12205o00oOooO = new HashSet(list);
        this.f12203o00oOo0O = o00ooooo3;
        this.f12204o00oOo0o = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0OoO00O.class != obj.getClass()) {
            return false;
        }
        o0OoO00O o0ooo00o = (o0OoO00O) obj;
        if (this.f12204o00oOo0o == o0ooo00o.f12204o00oOo0o && this.f12200o00oOOo0.equals(o0ooo00o.f12200o00oOOo0) && this.f12201o00oOOoO == o0ooo00o.f12201o00oOOoO && this.f12202o00oOo00.equals(o0ooo00o.f12202o00oOo00) && this.f12205o00oOooO.equals(o0ooo00o.f12205o00oOooO)) {
            return this.f12203o00oOo0O.equals(o0ooo00o.f12203o00oOo0O);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f12201o00oOOoO.hashCode();
        int hashCode2 = this.f12202o00oOo00.hashCode();
        int hashCode3 = this.f12205o00oOooO.hashCode();
        return ((this.f12203o00oOo0O.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f12200o00oOOo0.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f12204o00oOo0o;
    }

    @oo0oO0
    public UUID o00oOOo0() {
        return this.f12200o00oOOo0;
    }

    @oo0oO0
    public o00oOOoO o00oOOoO() {
        return this.f12202o00oOo00;
    }

    @oo0oO0
    public o00oOOoO o00oOo00() {
        return this.f12203o00oOo0O;
    }

    @oo0oO0
    public o00oOOo0 o00oOo0O() {
        return this.f12201o00oOOoO;
    }

    @oo0oO0
    public Set<String> o00oOo0o() {
        return this.f12205o00oOooO;
    }

    @o0O0o00O(from = 0)
    public int o00oOooO() {
        return this.f12204o00oOo0o;
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("WorkInfo{mId='");
        o00oOOo02.append(this.f12200o00oOOo0);
        o00oOOo02.append('\'');
        o00oOOo02.append(", mState=");
        o00oOOo02.append(this.f12201o00oOOoO);
        o00oOOo02.append(", mOutputData=");
        o00oOOo02.append(this.f12202o00oOo00);
        o00oOOo02.append(", mTags=");
        o00oOOo02.append(this.f12205o00oOooO);
        o00oOOo02.append(", mProgress=");
        o00oOOo02.append(this.f12203o00oOo0O);
        o00oOOo02.append('}');
        return o00oOOo02.toString();
    }
}
