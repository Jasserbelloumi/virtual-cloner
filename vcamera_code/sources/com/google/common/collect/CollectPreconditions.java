package com.google.common.collect;

import com.google.android.gms.internal.ads.o00oOOo0;
import com.google.android.gms.internal.ads.o00oOOoO;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.o00oOo00;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class CollectPreconditions {
    public static void checkEntryNotNull(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            throw new NullPointerException(o00oOo00.o00oOOo0(valueOf.length() + 24, "null key in entry: null=", valueOf));
        } else if (obj2 != null) {
        } else {
            String valueOf2 = String.valueOf(obj);
            throw new NullPointerException(o00oOOoO.o00oOOo0(valueOf2.length() + 26, "null value in entry: ", valueOf2, "=null"));
        }
    }

    @CanIgnoreReturnValue
    public static int checkNonnegative(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(o00oOOo0.o00oOOo0(str, 40));
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void checkPositive(int i, String str) {
        if (i > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(o00oOOo0.o00oOOo0(str, 38));
        sb.append(str);
        sb.append(" must be positive but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void checkRemove(boolean z) {
        Preconditions.checkState(z, "no calls to next() since the last call to remove()");
    }

    @CanIgnoreReturnValue
    public static long checkNonnegative(long j, String str) {
        if (j >= 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder(o00oOOo0.o00oOOo0(str, 49));
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }
}
