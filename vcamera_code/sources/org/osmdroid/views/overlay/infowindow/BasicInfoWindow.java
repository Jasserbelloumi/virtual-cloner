package org.osmdroid.views.overlay.infowindow;

import android.content.Context;
import android.text.Html;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.OverlayWithIW;
/* loaded from: classes3.dex */
public class BasicInfoWindow extends InfoWindow {
    public static final int UNDEFINED_RES_ID = 0;
    public static int mDescriptionId;
    public static int mImageId;
    public static int mSubDescriptionId;
    public static int mTitleId;

    public BasicInfoWindow(int i, MapView mapView) {
        super(i, mapView);
        if (mTitleId == 0) {
            setResIds(mapView.getContext());
        }
        this.mView.setOnTouchListener(new View.OnTouchListener() { // from class: org.osmdroid.views.overlay.infowindow.BasicInfoWindow.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    BasicInfoWindow.this.close();
                }
                return true;
            }
        });
    }

    private static void setResIds(Context context) {
        String packageName = context.getPackageName();
        mTitleId = context.getResources().getIdentifier("id/bubble_title", null, packageName);
        mDescriptionId = context.getResources().getIdentifier("id/bubble_description", null, packageName);
        mSubDescriptionId = context.getResources().getIdentifier("id/bubble_subdescription", null, packageName);
        mImageId = context.getResources().getIdentifier("id/bubble_image", null, packageName);
    }

    @Override // org.osmdroid.views.overlay.infowindow.InfoWindow
    public void onClose() {
    }

    @Override // org.osmdroid.views.overlay.infowindow.InfoWindow
    public void onOpen(Object obj) {
        int i;
        OverlayWithIW overlayWithIW = (OverlayWithIW) obj;
        String title = overlayWithIW.getTitle();
        if (title == null) {
            title = "";
        }
        View view = this.mView;
        if (view == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(mTitleId);
        if (textView != null) {
            textView.setText(title);
        }
        String snippet = overlayWithIW.getSnippet();
        if (snippet == null) {
            snippet = "";
        }
        ((TextView) this.mView.findViewById(mDescriptionId)).setText(Html.fromHtml(snippet));
        TextView textView2 = (TextView) this.mView.findViewById(mSubDescriptionId);
        String subDescription = overlayWithIW.getSubDescription();
        if (subDescription == null || "".equals(subDescription)) {
            i = 8;
        } else {
            textView2.setText(Html.fromHtml(subDescription));
            i = 0;
        }
        textView2.setVisibility(i);
    }
}
