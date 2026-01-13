package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.o0OOO0;
import com.google.android.material.R;
/* loaded from: classes2.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o0OOO0 o00ooOo02 = o0OOO0.o00ooOo0(context, attributeSet, R.styleable.TabItem);
        this.text = o00ooOo02.o00ooO00(R.styleable.TabItem_android_text);
        this.icon = o00ooOo02.o00oOoO(R.styleable.TabItem_android_icon);
        this.customLayout = o00ooOo02.o00oo0oO(R.styleable.TabItem_android_layout, 0);
        o00ooOo02.o00ooOoo();
    }
}
