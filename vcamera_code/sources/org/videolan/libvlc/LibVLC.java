package org.videolan.libvlc;

import android.content.Context;
import java.util.List;
import o00oOooO.o0OO00OO;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;
/* loaded from: classes3.dex */
public class LibVLC extends VLCObject<ILibVLC.Event> implements ILibVLC {
    private static final String TAG = "VLC/LibVLC";
    private static boolean sLoaded;
    public final Context mAppContext;

    /* loaded from: classes3.dex */
    public static class Event extends AbstractVLCEvent {
        public Event(int i) {
            super(i);
        }
    }

    public LibVLC(Context context) {
        this(context, null);
    }

    public LibVLC(Context context, List<String> list) {
        this.mAppContext = context.getApplicationContext();
        loadLibraries();
        nativeNew(list != null ? (String[]) list.toArray(new String[list.size()]) : null, context.getDir("vlc", 0).getAbsolutePath());
    }

    public static native String changeset();

    public static native String compiler();

    public static synchronized void loadLibraries() {
        synchronized (LibVLC.class) {
            if (sLoaded) {
                return;
            }
            sLoaded = true;
            try {
                System.loadLibrary("c++_shared");
                System.loadLibrary("vlc");
                System.loadLibrary("vlcjni");
            } catch (SecurityException e) {
                e.toString();
                System.exit(1);
            } catch (UnsatisfiedLinkError e2) {
                e2.toString();
                System.exit(1);
            }
        }
    }

    public static native int majorVersion();

    private native void nativeNew(String[] strArr, String str);

    private native void nativeRelease();

    private native void nativeSetUserAgent(String str, String str2);

    public static native String version();

    @Override // org.videolan.libvlc.interfaces.ILibVLC
    public Context getAppContext() {
        return this.mAppContext;
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

    @Override // org.videolan.libvlc.VLCObject
    public ILibVLC.Event onEventNative(int i, long j, long j2, float f, @o0OO00OO String str) {
        return null;
    }

    @Override // org.videolan.libvlc.VLCObject
    public void onReleaseNative() {
        nativeRelease();
    }

    public void setUserAgent(String str, String str2) {
        nativeSetUserAgent(str, str2);
    }
}
