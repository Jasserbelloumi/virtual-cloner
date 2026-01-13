package org.videolan.libvlc;

import o00oOooO.o0OO00OO;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;
/* loaded from: classes3.dex */
public class RendererItem extends VLCObject<Event> {
    public static final int LIBVLC_RENDERER_CAN_AUDIO = 1;
    public static final int LIBVLC_RENDERER_CAN_VIDEO = 2;
    public final String displayName;
    public final int flags;
    public final String iconUrl;
    public final String name;
    private final long ref;
    public final String type;

    /* loaded from: classes3.dex */
    public static class Event extends AbstractVLCEvent {
        public Event(int i) {
            super(i);
        }
    }

    public RendererItem(String str, String str2, String str3, int i, long j) {
        int lastIndexOf = str.lastIndexOf(45);
        this.name = str;
        this.displayName = lastIndexOf != -1 ? str.replace('-', ' ') : str;
        this.type = str2;
        this.iconUrl = str3;
        this.flags = i;
        this.ref = j;
    }

    private native void nativeReleaseItem();

    public boolean equals(Object obj) {
        return (obj instanceof RendererItem) && this.ref == ((RendererItem) obj).ref;
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
        return new Event(i);
    }

    @Override // org.videolan.libvlc.VLCObject
    public void onReleaseNative() {
        nativeReleaseItem();
    }
}
