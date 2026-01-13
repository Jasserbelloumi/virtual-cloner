package o00ooOoo;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class oOo00OO0 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f9476o00oOOoO = 0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f9477o00oOo00 = 1;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f9478o00oOo0O = 3;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f9479o00oOo0o = 4;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f9480o00oOoO = 6;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f9481o00oOoO0 = 5;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f9482o00oOoOO = 7;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f9483o00oOoOo = 8;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f9484o00oOoo0 = 8;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f9485o00oOooO = 2;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f9486o00oOooo = 1;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f9487o00oo0 = 4;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f9488o00oo00O = 2;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f9489o00oo0O = 32;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f9490o00oo0O0 = 16;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f9491o00oo0OO = 8;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f9492o00oo0Oo = 64;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f9493o00oo0o = 256;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f9494o00oo0o0 = 128;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f9495o00oo0oO = 511;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oOOoO f9496o00oOOo0;

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o00oOOoO {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f9497o00oOo0O = 1000000;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f9498o00oOo0o = 500000;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static Handler f9499o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static HandlerThread f9500o00oOoO0;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f9501o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public SparseIntArray[] f9502o00oOOoO = new SparseIntArray[9];

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final ArrayList<WeakReference<Activity>> f9503o00oOo00 = new ArrayList<>();

        /* renamed from: o00oOooO  reason: collision with root package name */
        public Window.OnFrameMetricsAvailableListener f9504o00oOooO = new Window$OnFrameMetricsAvailableListenerC0116o00oOOo0();

        /* renamed from: o00ooOoo.oOo00OO0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class Window$OnFrameMetricsAvailableListenerC0116o00oOOo0 implements Window.OnFrameMetricsAvailableListener {
            public Window$OnFrameMetricsAvailableListenerC0116o00oOOo0() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                o00oOOo0 o00oooo02 = o00oOOo0.this;
                if ((o00oooo02.f9501o00oOOo0 & 1) != 0) {
                    o00oooo02.o00oOo0o(o00oooo02.f9502o00oOOoO[0], frameMetrics.getMetric(8));
                }
                o00oOOo0 o00oooo03 = o00oOOo0.this;
                if ((o00oooo03.f9501o00oOOo0 & 2) != 0) {
                    o00oooo03.o00oOo0o(o00oooo03.f9502o00oOOoO[1], frameMetrics.getMetric(1));
                }
                o00oOOo0 o00oooo04 = o00oOOo0.this;
                if ((o00oooo04.f9501o00oOOo0 & 4) != 0) {
                    o00oooo04.o00oOo0o(o00oooo04.f9502o00oOOoO[2], frameMetrics.getMetric(3));
                }
                o00oOOo0 o00oooo05 = o00oOOo0.this;
                if ((o00oooo05.f9501o00oOOo0 & 8) != 0) {
                    o00oooo05.o00oOo0o(o00oooo05.f9502o00oOOoO[3], frameMetrics.getMetric(4));
                }
                o00oOOo0 o00oooo06 = o00oOOo0.this;
                if ((o00oooo06.f9501o00oOOo0 & 16) != 0) {
                    o00oooo06.o00oOo0o(o00oooo06.f9502o00oOOoO[4], frameMetrics.getMetric(5));
                }
                o00oOOo0 o00oooo07 = o00oOOo0.this;
                if ((o00oooo07.f9501o00oOOo0 & 64) != 0) {
                    o00oooo07.o00oOo0o(o00oooo07.f9502o00oOOoO[6], frameMetrics.getMetric(7));
                }
                o00oOOo0 o00oooo08 = o00oOOo0.this;
                if ((o00oooo08.f9501o00oOOo0 & 32) != 0) {
                    o00oooo08.o00oOo0o(o00oooo08.f9502o00oOOoO[5], frameMetrics.getMetric(6));
                }
                o00oOOo0 o00oooo09 = o00oOOo0.this;
                if ((o00oooo09.f9501o00oOOo0 & 128) != 0) {
                    o00oooo09.o00oOo0o(o00oooo09.f9502o00oOOoO[7], frameMetrics.getMetric(0));
                }
                o00oOOo0 o00oooo010 = o00oOOo0.this;
                if ((o00oooo010.f9501o00oOOo0 & 256) != 0) {
                    o00oooo010.o00oOo0o(o00oooo010.f9502o00oOOoO[8], frameMetrics.getMetric(2));
                }
            }
        }

        public o00oOOo0(int i) {
            this.f9501o00oOOo0 = i;
        }

        @Override // o00ooOoo.oOo00OO0.o00oOOoO
        public void o00oOOo0(Activity activity) {
            if (f9500o00oOoO0 == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f9500o00oOoO0 = handlerThread;
                handlerThread.start();
                f9499o00oOoO = new Handler(f9500o00oOoO0.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f9502o00oOOoO;
                if (sparseIntArrayArr[i] == null && (this.f9501o00oOOo0 & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f9504o00oOooO, f9499o00oOoO);
            this.f9503o00oOo00.add(new WeakReference<>(activity));
        }

        @Override // o00ooOoo.oOo00OO0.o00oOOoO
        public SparseIntArray[] o00oOOoO() {
            return this.f9502o00oOOoO;
        }

        @Override // o00ooOoo.oOo00OO0.o00oOOoO
        public SparseIntArray[] o00oOo00(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f9503o00oOo00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f9503o00oOo00.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f9504o00oOooO);
            return this.f9502o00oOOoO;
        }

        @Override // o00ooOoo.oOo00OO0.o00oOOoO
        public SparseIntArray[] o00oOo0O() {
            for (int size = this.f9503o00oOo00.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f9503o00oOo00.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f9504o00oOooO);
                    this.f9503o00oOo00.remove(size);
                }
            }
            return this.f9502o00oOOoO;
        }

        public void o00oOo0o(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }

        @Override // o00ooOoo.oOo00OO0.o00oOOoO
        public SparseIntArray[] o00oOooO() {
            SparseIntArray[] sparseIntArrayArr = this.f9502o00oOOoO;
            this.f9502o00oOOoO = new SparseIntArray[9];
            return sparseIntArrayArr;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {
        public void o00oOOo0(Activity activity) {
        }

        public SparseIntArray[] o00oOOoO() {
            return null;
        }

        public SparseIntArray[] o00oOo00(Activity activity) {
            return null;
        }

        public SparseIntArray[] o00oOo0O() {
            return null;
        }

        public SparseIntArray[] o00oOooO() {
            return null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oOo00 {
    }

    public oOo00OO0() {
        this(1);
    }

    public oOo00OO0(int i) {
        this.f9496o00oOOo0 = new o00oOOo0(i);
    }

    public void o00oOOo0(@oo0oO0 Activity activity) {
        this.f9496o00oOOo0.o00oOOo0(activity);
    }

    @o0OO00OO
    public SparseIntArray[] o00oOOoO() {
        return this.f9496o00oOOo0.o00oOOoO();
    }

    @o0OO00OO
    public SparseIntArray[] o00oOo00(@oo0oO0 Activity activity) {
        return this.f9496o00oOOo0.o00oOo00(activity);
    }

    @o0OO00OO
    public SparseIntArray[] o00oOo0O() {
        return this.f9496o00oOOo0.o00oOo0O();
    }

    @o0OO00OO
    public SparseIntArray[] o00oOooO() {
        return this.f9496o00oOOo0.o00oOooO();
    }
}
