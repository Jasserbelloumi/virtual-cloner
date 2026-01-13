package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.R;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public class o0O000 implements o0O0000O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0O0000O f4482o00oOOo0 = new o0O000();

    public static float o00oOo0O(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float o00oooo2 = o0O0o00O.o00oooo(childAt);
                if (o00oooo2 > f) {
                    f = o00oooo2;
                }
            }
        }
        return f;
    }

    @Override // androidx.recyclerview.widget.o0O0000O
    public void o00oOOo0(View view) {
        int i = R.id.item_touch_helper_previous_elevation;
        Object tag = view.getTag(i);
        if (tag instanceof Float) {
            o0O0o00O.o0OO000(view, ((Float) tag).floatValue());
        }
        view.setTag(i, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.o0O0000O
    public void o00oOOoO(View view) {
    }

    @Override // androidx.recyclerview.widget.o0O0000O
    public void o00oOo00(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (z) {
            int i2 = R.id.item_touch_helper_previous_elevation;
            if (view.getTag(i2) == null) {
                Float valueOf = Float.valueOf(o0O0o00O.o00oooo(view));
                o0O0o00O.o00ooO0.o00oo0o0(view, o00oOo0O(recyclerView, view) + 1.0f);
                view.setTag(i2, valueOf);
            }
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    @Override // androidx.recyclerview.widget.o0O0000O
    public void o00oOooO(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }
}
