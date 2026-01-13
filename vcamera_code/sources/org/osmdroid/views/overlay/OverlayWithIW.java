package org.osmdroid.views.overlay;

import android.content.Context;
import org.osmdroid.views.overlay.infowindow.InfoWindow;
/* loaded from: classes3.dex */
public abstract class OverlayWithIW extends Overlay {
    public String mId;
    public InfoWindow mInfoWindow;
    public Object mRelatedObject;
    public String mSnippet;
    public String mSubDescription;
    public String mTitle;

    public OverlayWithIW() {
    }

    @Deprecated
    public OverlayWithIW(Context context) {
        this();
    }

    public void closeInfoWindow() {
        InfoWindow infoWindow = this.mInfoWindow;
        if (infoWindow != null) {
            infoWindow.close();
        }
    }

    public String getId() {
        return this.mId;
    }

    public InfoWindow getInfoWindow() {
        return this.mInfoWindow;
    }

    public Object getRelatedObject() {
        return this.mRelatedObject;
    }

    public String getSnippet() {
        return this.mSnippet;
    }

    public String getSubDescription() {
        return this.mSubDescription;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public boolean isInfoWindowOpen() {
        InfoWindow infoWindow = this.mInfoWindow;
        return infoWindow != null && infoWindow.isOpen();
    }

    public void onDestroy() {
        InfoWindow infoWindow = this.mInfoWindow;
        if (infoWindow != null) {
            infoWindow.close();
            this.mInfoWindow.onDetach();
            this.mInfoWindow = null;
            this.mRelatedObject = null;
        }
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setInfoWindow(InfoWindow infoWindow) {
        this.mInfoWindow = infoWindow;
    }

    public void setRelatedObject(Object obj) {
        this.mRelatedObject = obj;
    }

    public void setSnippet(String str) {
        this.mSnippet = str;
    }

    public void setSubDescription(String str) {
        this.mSubDescription = str;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }
}
