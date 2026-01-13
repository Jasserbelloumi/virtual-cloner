package o00ooo0;

import android.content.ContentProvider;
import android.content.Context;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oo {
    @oo0oO0
    public static Context o00oOOo0(@oo0oO0 ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}
