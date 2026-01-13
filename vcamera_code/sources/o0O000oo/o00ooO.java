package o0O000oo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public final class o00ooO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oOOo0 f10457o00oOOo0;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        void o00oOOo0(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        boolean o00oOOoO(MotionEvent motionEvent);

        void o00oOo00(boolean z);

        boolean o00oOooO();
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO implements o00oOOo0 {

        /* renamed from: o00ooO0  reason: collision with root package name */
        public static final int f10459o00ooO0 = 2;

        /* renamed from: o00ooO00  reason: collision with root package name */
        public static final int f10460o00ooO00 = 1;

        /* renamed from: o00ooO0O  reason: collision with root package name */
        public static final int f10461o00ooO0O = 3;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f10463o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f10464o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f10465o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final Handler f10466o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final GestureDetector.OnGestureListener f10467o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public boolean f10468o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public GestureDetector.OnDoubleTapListener f10469o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public boolean f10470o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public boolean f10471o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public boolean f10472o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f10473o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public boolean f10474o00oOooo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public MotionEvent f10475o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public MotionEvent f10476o00oo00O;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public float f10477o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public float f10478o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public boolean f10479o00oo0OO;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public float f10480o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public boolean f10481o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public float f10482o00oo0o0;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public VelocityTracker f10483o00oo0oO;

        /* renamed from: o0O0o  reason: collision with root package name */
        public static final int f10462o0O0o = ViewConfiguration.getTapTimeout();

        /* renamed from: o00oo  reason: collision with root package name */
        public static final int f10458o00oo = ViewConfiguration.getDoubleTapTimeout();

        /* loaded from: classes.dex */
        public class o00oOOo0 extends Handler {
            public o00oOOo0() {
            }

            public o00oOOo0(Handler handler) {
                super(handler.getLooper());
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    o00oOOoO o00ooooo2 = o00oOOoO.this;
                    o00ooooo2.f10467o00oOo0o.onShowPress(o00ooooo2.f10476o00oo00O);
                } else if (i == 2) {
                    o00oOOoO.this.o00oOoO0();
                } else if (i != 3) {
                    throw new RuntimeException("Unknown message " + message);
                } else {
                    o00oOOoO o00ooooo3 = o00oOOoO.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = o00ooooo3.f10469o00oOoO0;
                    if (onDoubleTapListener != null) {
                        if (o00ooooo3.f10468o00oOoO) {
                            o00ooooo3.f10470o00oOoOO = true;
                        } else {
                            onDoubleTapListener.onSingleTapConfirmed(o00ooooo3.f10476o00oo00O);
                        }
                    }
                }
            }
        }

        public o00oOOoO(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f10466o00oOo0O = new o00oOOo0(handler);
            } else {
                this.f10466o00oOo0O = new o00oOOo0();
            }
            this.f10467o00oOo0o = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                o00oOOo0((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            o00oOoO(context);
        }

        @Override // o0O000oo.o00ooO.o00oOOo0
        public void o00oOOo0(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f10469o00oOoO0 = onDoubleTapListener;
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x021b  */
        @Override // o0O000oo.o00ooO.o00oOOo0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean o00oOOoO(android.view.MotionEvent r13) {
            /*
                Method dump skipped, instructions count: 589
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o0O000oo.o00ooO.o00oOOoO.o00oOOoO(android.view.MotionEvent):boolean");
        }

        @Override // o0O000oo.o00ooO.o00oOOo0
        public void o00oOo00(boolean z) {
            this.f10481o00oo0o = z;
        }

        public final void o00oOo0O() {
            this.f10466o00oOo0O.removeMessages(1);
            this.f10466o00oOo0O.removeMessages(2);
            this.f10466o00oOo0O.removeMessages(3);
            this.f10483o00oo0oO.recycle();
            this.f10483o00oo0oO = null;
            this.f10479o00oo0OO = false;
            this.f10468o00oOoO = false;
            this.f10472o00oOoo0 = false;
            this.f10474o00oOooo = false;
            this.f10470o00oOoOO = false;
            if (this.f10471o00oOoOo) {
                this.f10471o00oOoOo = false;
            }
        }

        public final void o00oOo0o() {
            this.f10466o00oOo0O.removeMessages(1);
            this.f10466o00oOo0O.removeMessages(2);
            this.f10466o00oOo0O.removeMessages(3);
            this.f10479o00oo0OO = false;
            this.f10472o00oOoo0 = false;
            this.f10474o00oOooo = false;
            this.f10470o00oOoOO = false;
            if (this.f10471o00oOoOo) {
                this.f10471o00oOoOo = false;
            }
        }

        public final void o00oOoO(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            if (this.f10467o00oOo0o == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            this.f10481o00oo0o = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f10465o00oOo00 = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f10473o00oOooO = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f10463o00oOOo0 = scaledTouchSlop * scaledTouchSlop;
            this.f10464o00oOOoO = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }

        public void o00oOoO0() {
            this.f10466o00oOo0O.removeMessages(3);
            this.f10470o00oOoOO = false;
            this.f10471o00oOoOo = true;
            this.f10467o00oOo0o.onLongPress(this.f10476o00oo00O);
        }

        public final boolean o00oOoOO(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (this.f10474o00oOooo && motionEvent3.getEventTime() - motionEvent2.getEventTime() <= f10458o00oo) {
                int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
                int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
                return (y * y) + (x * x) < this.f10464o00oOOoO;
            }
            return false;
        }

        @Override // o0O000oo.o00ooO.o00oOOo0
        public boolean o00oOooO() {
            return this.f10481o00oo0o;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 implements o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final GestureDetector f10485o00oOOo0;

        public o00oOo00(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f10485o00oOOo0 = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // o0O000oo.o00ooO.o00oOOo0
        public void o00oOOo0(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f10485o00oOOo0.setOnDoubleTapListener(onDoubleTapListener);
        }

        @Override // o0O000oo.o00ooO.o00oOOo0
        public boolean o00oOOoO(MotionEvent motionEvent) {
            return this.f10485o00oOOo0.onTouchEvent(motionEvent);
        }

        @Override // o0O000oo.o00ooO.o00oOOo0
        public void o00oOo00(boolean z) {
            this.f10485o00oOOo0.setIsLongpressEnabled(z);
        }

        @Override // o0O000oo.o00ooO.o00oOOo0
        public boolean o00oOooO() {
            return this.f10485o00oOOo0.isLongpressEnabled();
        }
    }

    public o00ooO(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public o00ooO(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 GestureDetector.OnGestureListener onGestureListener, @o00oOooO.o0OO00OO Handler handler) {
        this.f10457o00oOOo0 = new o00oOo00(context, onGestureListener, handler);
    }

    public boolean o00oOOo0() {
        return this.f10457o00oOOo0.o00oOooO();
    }

    public boolean o00oOOoO(@o00oOooO.oo0oO0 MotionEvent motionEvent) {
        return this.f10457o00oOOo0.o00oOOoO(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void o00oOo00(boolean z) {
        this.f10457o00oOOo0.o00oOo00(z);
    }

    public void o00oOooO(@o00oOooO.o0OO00OO GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f10457o00oOOo0.o00oOOo0(onDoubleTapListener);
    }
}
