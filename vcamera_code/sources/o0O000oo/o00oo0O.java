package o0O000oo;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import o00oOooO.o0OO0oO;
/* loaded from: classes.dex */
public final class o00oo0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final DragAndDropPermissions f10455o00oOOo0;

    @o00oOooO.o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @o00oOooO.o0O0O0Oo
        public static DragAndDropPermissions o00oOOoO(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    public o00oo0O(DragAndDropPermissions dragAndDropPermissions) {
        this.f10455o00oOOo0 = dragAndDropPermissions;
    }

    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static o00oo0O o00oOOoO(@o00oOooO.oo0oO0 Activity activity, @o00oOooO.oo0oO0 DragEvent dragEvent) {
        DragAndDropPermissions o00oOOoO2 = o00oOOo0.o00oOOoO(activity, dragEvent);
        if (o00oOOoO2 != null) {
            return new o00oo0O(o00oOOoO2);
        }
        return null;
    }

    public void o00oOOo0() {
        o00oOOo0.o00oOOo0(this.f10455o00oOOo0);
    }
}
