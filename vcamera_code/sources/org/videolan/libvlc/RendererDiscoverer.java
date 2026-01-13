package org.videolan.libvlc;

import androidx.collection.o00oo0OO;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;
/* loaded from: classes3.dex */
public class RendererDiscoverer extends VLCObject<Event> {
    private static final String TAG = "LibVLC/RendererDiscoverer";
    private final o00oo0OO<RendererItem> index;
    public final List<RendererItem> mRenderers;

    /* loaded from: classes3.dex */
    public static class Description {
        public final String longName;
        public final String name;

        private Description(String str, String str2) {
            this.name = str;
            this.longName = str2;
        }
    }

    /* loaded from: classes3.dex */
    public static class Event extends AbstractVLCEvent {
        public static final int ItemAdded = 1282;
        public static final int ItemDeleted = 1283;
        private final RendererItem item;

        public Event(int i, long j, RendererItem rendererItem) {
            super(i, j);
            this.item = rendererItem;
            rendererItem.retain();
        }

        public RendererItem getItem() {
            return this.item;
        }

        @Override // org.videolan.libvlc.interfaces.AbstractVLCEvent
        public void release() {
            this.item.release();
            super.release();
        }
    }

    /* loaded from: classes3.dex */
    public interface EventListener extends AbstractVLCEvent.Listener<Event> {
    }

    public RendererDiscoverer(ILibVLC iLibVLC, String str) {
        super(iLibVLC);
        this.mRenderers = new ArrayList();
        this.index = new o00oo0OO<>();
        nativeNew(iLibVLC, str);
    }

    private static Description createDescriptionFromNative(String str, String str2) {
        return new Description(str, str2);
    }

    private static RendererItem createItemFromNative(String str, String str2, String str3, int i, long j) {
        return new RendererItem(str, str2, str3, i, j);
    }

    private synchronized RendererItem insertItemFromEvent(long j) {
        RendererItem nativeNewItem;
        nativeNewItem = nativeNewItem(j);
        this.index.o00oo0Oo(j, nativeNewItem);
        this.mRenderers.add(nativeNewItem);
        return nativeNewItem;
    }

    public static Description[] list(ILibVLC iLibVLC) {
        return nativeList(iLibVLC);
    }

    private static native Description[] nativeList(ILibVLC iLibVLC);

    private native void nativeNew(ILibVLC iLibVLC, String str);

    private native RendererItem nativeNewItem(long j);

    private native void nativeRelease();

    private native boolean nativeStart();

    private native void nativeStop();

    private synchronized RendererItem removeItemFromEvent(long j) {
        RendererItem o00oOooo2;
        o00oOooo2 = this.index.o00oOooo(j);
        if (o00oOooo2 != null) {
            this.index.o00oo0oO(j);
            this.mRenderers.remove(o00oOooo2);
            o00oOooo2.release();
        }
        return o00oOooo2;
    }

    @Override // org.videolan.libvlc.VLCObject
    public /* bridge */ /* synthetic */ long getInstance() {
        return super.getInstance();
    }

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ ILibVLC getLibVLC() {
        return super.getLibVLC();
    }

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ boolean isReleased() {
        return super.isReleased();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.videolan.libvlc.VLCObject
    public Event onEventNative(int i, long j, long j2, float f, @o0OO00OO String str) {
        if (i != 1282) {
            if (i != 1283) {
                return null;
            }
            return new Event(i, j, removeItemFromEvent(j));
        }
        return new Event(i, j, insertItemFromEvent(j));
    }

    @Override // org.videolan.libvlc.VLCObject
    public void onReleaseNative() {
        for (RendererItem rendererItem : this.mRenderers) {
            rendererItem.release();
        }
        this.mRenderers.clear();
        nativeRelease();
    }

    public void setEventListener(EventListener eventListener) {
        super.setEventListener((AbstractVLCEvent.Listener) eventListener);
    }

    public boolean start() {
        if (isReleased()) {
            throw new IllegalStateException("MediaDiscoverer is released");
        }
        return nativeStart();
    }

    public void stop() {
        if (isReleased()) {
            throw new IllegalStateException("MediaDiscoverer is released");
        }
        setEventListener((EventListener) null);
        nativeStop();
        release();
    }
}
