package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class o00oOo00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f390o00oOOo0 = "ActionBarDrawerToggleHC";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int[] f391o00oOOoO = {16843531};

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Method f392o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public Method f393o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public ImageView f394o00oOo00;

        public o00oOOo0(Activity activity) {
            try {
                this.f392o00oOOo0 = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f393o00oOOoO = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(o0O00o0O.o00oOoO.f11139o00oo0O0);
                if (findViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f394o00oOo00 = (ImageView) childAt;
                }
            }
        }
    }

    public static Drawable o00oOOo0(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f391o00oOOoO);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static o00oOOo0 o00oOOoO(o00oOOo0 o00oooo02, Activity activity, int i) {
        if (o00oooo02 == null) {
            o00oooo02 = new o00oOOo0(activity);
        }
        if (o00oooo02.f392o00oOOo0 != null) {
            try {
                o00oooo02.f393o00oOOoO.invoke(activity.getActionBar(), Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
        return o00oooo02;
    }

    public static o00oOOo0 o00oOo00(Activity activity, Drawable drawable, int i) {
        o00oOOo0 o00oooo02 = new o00oOOo0(activity);
        if (o00oooo02.f392o00oOOo0 != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                o00oooo02.f392o00oOOo0.invoke(actionBar, drawable);
                o00oooo02.f393o00oOOoO.invoke(actionBar, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        } else {
            ImageView imageView = o00oooo02.f394o00oOo00;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        return o00oooo02;
    }
}
