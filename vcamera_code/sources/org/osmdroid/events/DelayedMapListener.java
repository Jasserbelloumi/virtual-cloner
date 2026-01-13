package org.osmdroid.events;

import android.os.Handler;
import java.util.Objects;
/* loaded from: classes3.dex */
public class DelayedMapListener implements MapListener {
    public static final int DEFAULT_DELAY = 100;
    public CallbackTask callback;
    public long delay;
    public Handler handler;
    public MapListener wrappedListener;

    /* loaded from: classes3.dex */
    public class CallbackTask implements Runnable {
        private final MapEvent event;

        public CallbackTask(MapEvent mapEvent) {
            this.event = mapEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapEvent mapEvent = this.event;
            if (mapEvent instanceof ScrollEvent) {
                DelayedMapListener.this.wrappedListener.onScroll((ScrollEvent) mapEvent);
            } else if (mapEvent instanceof ZoomEvent) {
                DelayedMapListener.this.wrappedListener.onZoom((ZoomEvent) mapEvent);
            } else {
                Objects.toString(this.event);
            }
        }
    }

    public DelayedMapListener(MapListener mapListener) {
        this(mapListener, 100L);
    }

    public DelayedMapListener(MapListener mapListener, long j) {
        this.wrappedListener = mapListener;
        this.delay = j;
        this.handler = new Handler();
        this.callback = null;
    }

    public void dispatch(MapEvent mapEvent) {
        CallbackTask callbackTask = this.callback;
        if (callbackTask != null) {
            this.handler.removeCallbacks(callbackTask);
        }
        CallbackTask callbackTask2 = new CallbackTask(mapEvent);
        this.callback = callbackTask2;
        this.handler.postDelayed(callbackTask2, this.delay);
    }

    @Override // org.osmdroid.events.MapListener
    public boolean onScroll(ScrollEvent scrollEvent) {
        dispatch(scrollEvent);
        return true;
    }

    @Override // org.osmdroid.events.MapListener
    public boolean onZoom(ZoomEvent zoomEvent) {
        dispatch(zoomEvent);
        return true;
    }
}
