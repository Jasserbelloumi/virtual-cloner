package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0OO0oO extends ContextWrapper {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final Object f1319o00oOo00 = new Object();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static ArrayList<WeakReference<o0OO0oO>> f1320o00oOooO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Resources f1321o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Resources.Theme f1322o00oOOoO;

    public o0OO0oO(@o00oOooO.oo0oO0 Context context) {
        super(context);
        if (!ooo0Oo0.o00oOooO()) {
            this.f1321o00oOOo0 = new o0OOO00(this, context.getResources());
            this.f1322o00oOOoO = null;
            return;
        }
        ooo0Oo0 ooo0oo0 = new ooo0Oo0(this, context.getResources());
        this.f1321o00oOOo0 = ooo0oo0;
        Resources.Theme newTheme = ooo0oo0.newTheme();
        this.f1322o00oOOoO = newTheme;
        newTheme.setTo(context.getTheme());
    }

    public static boolean o00oOOo0(@o00oOooO.oo0oO0 Context context) {
        return ((context instanceof o0OO0oO) || (context.getResources() instanceof o0OOO00) || (context.getResources() instanceof ooo0Oo0) || !ooo0Oo0.o00oOooO()) ? false : true;
    }

    public static Context o00oOOoO(@o00oOooO.oo0oO0 Context context) {
        if (o00oOOo0(context)) {
            synchronized (f1319o00oOo00) {
                ArrayList<WeakReference<o0OO0oO>> arrayList = f1320o00oOooO;
                if (arrayList == null) {
                    f1320o00oOooO = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<o0OO0oO> weakReference = f1320o00oOooO.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1320o00oOooO.remove(size);
                        }
                    }
                    for (int size2 = f1320o00oOooO.size() - 1; size2 >= 0; size2--) {
                        WeakReference<o0OO0oO> weakReference2 = f1320o00oOooO.get(size2);
                        o0OO0oO o0oo0oo = weakReference2 != null ? weakReference2.get() : null;
                        if (o0oo0oo != null && o0oo0oo.getBaseContext() == context) {
                            return o0oo0oo;
                        }
                    }
                }
                o0OO0oO o0oo0oo2 = new o0OO0oO(context);
                f1320o00oOooO.add(new WeakReference<>(o0oo0oo2));
                return o0oo0oo2;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1321o00oOOo0.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1321o00oOOo0;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1322o00oOOoO;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f1322o00oOOoO;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
