package org.videolan.libvlc.interfaces;

import android.content.Context;
/* loaded from: classes3.dex */
public interface ILibVLC extends IVLCObject<Event> {

    /* loaded from: classes3.dex */
    public static class Event extends AbstractVLCEvent {
        public Event(int i) {
            super(i);
        }
    }

    Context getAppContext();
}
