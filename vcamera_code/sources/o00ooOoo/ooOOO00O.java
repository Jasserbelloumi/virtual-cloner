package o00ooOoo;

import android.content.res.Configuration;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class ooOOO00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final boolean f9506o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Configuration f9507o00oOOoO;

    public ooOOO00O(boolean z) {
        this.f9506o00oOOo0 = z;
        this.f9507o00oOOoO = null;
    }

    @o0OOooO0(26)
    public ooOOO00O(boolean z, @oo0oO0 Configuration configuration) {
        this.f9506o00oOOo0 = z;
        this.f9507o00oOOoO = configuration;
    }

    @o0OOooO0(26)
    @oo0oO0
    public Configuration o00oOOo0() {
        Configuration configuration = this.f9507o00oOOoO;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean o00oOOoO() {
        return this.f9506o00oOOo0;
    }
}
