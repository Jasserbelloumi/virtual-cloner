package o0O0Ooo0;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface o0O000O {
    @SuppressLint({"SyntheticAccessor"})
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o00oOOoO.o00oOo00 f12172o00oOOo0 = new o00oOOoO.o00oOo00();
    @SuppressLint({"SyntheticAccessor"})
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final o00oOOoO.C0153o00oOOoO f12173o00oOOoO = new o00oOOoO.C0153o00oOOoO(null);

    /* loaded from: classes.dex */
    public static abstract class o00oOOoO {

        /* loaded from: classes.dex */
        public static final class o00oOOo0 extends o00oOOoO {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final Throwable f12174o00oOOo0;

            public o00oOOo0(@oo0oO0 Throwable th) {
                this.f12174o00oOOo0 = th;
            }

            @oo0oO0
            public Throwable o00oOOo0() {
                return this.f12174o00oOOo0;
            }

            @oo0oO0
            public String toString() {
                return String.format("FAILURE (%s)", this.f12174o00oOOo0.getMessage());
            }
        }

        /* renamed from: o0O0Ooo0.o0O000O$o00oOOoO$o00oOOoO  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0153o00oOOoO extends o00oOOoO {
            public C0153o00oOOoO() {
            }

            public C0153o00oOOoO(o00oOOo0 o00oooo02) {
            }

            @oo0oO0
            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* loaded from: classes.dex */
        public static final class o00oOo00 extends o00oOOoO {
            public o00oOo00() {
            }

            @oo0oO0
            public String toString() {
                return "SUCCESS";
            }
        }
    }

    @oo0oO0
    ListenableFuture<o00oOOoO.o00oOo00> getResult();

    @oo0oO0
    LiveData<o00oOOoO> getState();
}
