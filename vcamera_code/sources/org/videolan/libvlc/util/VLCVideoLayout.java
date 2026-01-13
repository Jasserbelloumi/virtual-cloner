package org.videolan.libvlc.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import org.videolan.R;
/* loaded from: classes3.dex */
public class VLCVideoLayout extends FrameLayout {
    public VLCVideoLayout(@oo0oO0 Context context) {
        super(context);
        setupLayout(context);
    }

    public VLCVideoLayout(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
        setupLayout(context);
    }

    public VLCVideoLayout(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setupLayout(context);
    }

    @o0OOooO0(api = 21)
    public VLCVideoLayout(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setupLayout(context);
    }

    private void setupLayout(@oo0oO0 Context context) {
        View.inflate(context, R.layout.vlc_video_layout, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBackgroundResource(R.color.black);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        setLayoutParams(layoutParams);
    }
}
