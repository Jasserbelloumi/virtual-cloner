package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
@SuppressLint({"UnknownNullness"})
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class o0O0OO0 {

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3104o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ int f3105o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3106o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3107o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3108o00oo0o0;

        public o00oOOo0(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3105o00oo0O0 = i;
            this.f3104o00oo0O = arrayList;
            this.f3106o00oo0Oo = arrayList2;
            this.f3108o00oo0o0 = arrayList3;
            this.f3107o00oo0o = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f3105o00oo0O0; i++) {
                o0O0o00O.o0OOO0((View) this.f3104o00oo0O.get(i), (String) this.f3106o00oo0Oo.get(i));
                o0O0o00O.o00ooO0.o0O0o((View) this.f3108o00oo0o0.get(i), (String) this.f3107o00oo0o.get(i));
            }
        }
    }

    public static boolean o00oOoO0(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean o00oOoOO(List list) {
        return list == null || list.isEmpty();
    }

    public static void o00oOooO(List<View> list, View view) {
        int size = list.size();
        if (o00oOoO0(list, view, size)) {
            return;
        }
        if (o0O0o00O.o0O0O0O(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!o00oOoO0(list, childAt, size) && o0O0o00O.o00ooO0.o00oOoo0(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public abstract void o00oOOo0(Object obj, View view);

    public abstract void o00oOOoO(Object obj, ArrayList<View> arrayList);

    public abstract void o00oOo00(ViewGroup viewGroup, Object obj);

    public abstract boolean o00oOo0O(Object obj);

    public abstract Object o00oOo0o(Object obj);

    public void o00oOoO(View view, Rect rect) {
        if (o0O0o00O.o0O0OOoo(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object o00oOoOo(Object obj, Object obj2, Object obj3);

    public abstract Object o00oOoo0(Object obj, Object obj2, Object obj3);

    public ArrayList<String> o00oOooo(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(o0O0o00O.o0O0O0O(view));
            o0O0o00O.o00ooO0.o0O0o(view, null);
        }
        return arrayList2;
    }

    public abstract Object o00oo(Object obj);

    public abstract void o00oo0(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void o00oo00O(Object obj, View view);

    public abstract void o00oo0O(Object obj, Rect rect);

    public abstract void o00oo0O0(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void o00oo0OO(Object obj, View view, ArrayList<View> arrayList);

    public abstract void o00oo0Oo(Object obj, View view);

    public void o00oo0o(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String o0O0O0O2 = o0O0o00O.o0O0O0O(view2);
            arrayList4.add(o0O0O0O2);
            if (o0O0O0O2 != null) {
                o0O0o00O.o00ooO0.o0O0o(view2, null);
                String str = map.get(o0O0O0O2);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        o0O0o00O.o00ooO0.o0O0o(arrayList2.get(i2), o0O0O0O2);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        o0O000oo.o0O0OOO0.o00oOOo0(view, new o00oOOo0(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public void o00oo0o0(@oo0oO0 Fragment fragment, @oo0oO0 Object obj, @oo0oO0 o0O000.o00oOoO o00oooo2, @oo0oO0 Runnable runnable) {
        runnable.run();
    }

    public abstract void o00oo0oO(Object obj, View view, ArrayList<View> arrayList);

    public abstract void o0O0o(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
