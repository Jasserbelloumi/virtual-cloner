package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0OOoo;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
import o0O000oo.o0O0o00O;
import o0O0Oo0o.o0O0O0Oo;
import o0O0Oo0o.o0O0oo00;
/* loaded from: classes.dex */
public abstract class o0O0000O implements Cloneable {
    public static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<o0O0Oo0o.o0OoO00O> mEndValuesList;
    private o00oo00O mEpicenterCallback;
    private androidx.collection.o00oOOo0<String, String> mNameOverrides;
    public o0O0Oo0o.o0O00O0 mPropagation;
    private ArrayList<o0O0Oo0o.o0OoO00O> mStartValuesList;
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final o0O0Oo0o.o0O000O STRAIGHT_PATH_MOTION = new o00oOOo0();
    private static ThreadLocal<androidx.collection.o00oOOo0<Animator, o00oOo0O>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    public long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    public ArrayList<Integer> mTargetIds = new ArrayList<>();
    public ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private o0O0Oo0o.o0O00O0o mStartValues = new o0O0Oo0o.o0O00O0o();
    private o0O0Oo0o.o0O00O0o mEndValues = new o0O0Oo0o.o0O00O0o();
    public o0O000Oo mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    public boolean mCanRemoveViews = false;
    public ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private int mNumInstances = 0;
    private boolean mPaused = false;
    private boolean mEnded = false;
    private ArrayList<o00oo0OO> mListeners = null;
    private ArrayList<Animator> mAnimators = new ArrayList<>();
    private o0O0Oo0o.o0O000O mPathMotion = STRAIGHT_PATH_MOTION;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O0Oo0o.o0O000O {
        @Override // o0O0Oo0o.o0O000O
        public Path getPath(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ androidx.collection.o00oOOo0 f5148o00oOOo0;

        public o00oOOoO(androidx.collection.o00oOOo0 o00oooo02) {
            this.f5148o00oOOo0 = o00oooo02;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5148o00oOOo0.remove(animator);
            o0O0000O.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            o0O0000O.this.mCurrentAnimators.add(animator);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends AnimatorListenerAdapter {
        public o00oOo00() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            o0O0000O.this.end();
            animator.removeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public View f5151o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public String f5152o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public o0O0Oo0o.o0OoO00O f5153o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public o0O0000O f5154o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public o0O0oo00 f5155o00oOooO;

        public o00oOo0O(View view, String str, o0O0000O o0o0000o, o0O0oo00 o0o0oo00, o0O0Oo0o.o0OoO00O o0ooo00o) {
            this.f5151o00oOOo0 = view;
            this.f5152o00oOOoO = str;
            this.f5153o00oOo00 = o0ooo00o;
            this.f5155o00oOooO = o0o0oo00;
            this.f5154o00oOo0O = o0o0000o;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO {
        public static <T> ArrayList<T> o00oOOo0(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        public static <T> ArrayList<T> o00oOOoO(ArrayList<T> arrayList, T t) {
            if (arrayList != null) {
                arrayList.remove(t);
                if (arrayList.isEmpty()) {
                    return null;
                }
                return arrayList;
            }
            return arrayList;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oo0 {
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo00O {
        public abstract Rect o00oOOo0(@oo0oO0 o0O0000O o0o0000o);
    }

    /* loaded from: classes.dex */
    public interface o00oo0OO {
        void onTransitionCancel(@oo0oO0 o0O0000O o0o0000o);

        void onTransitionEnd(@oo0oO0 o0O0000O o0o0000o);

        void onTransitionPause(@oo0oO0 o0O0000O o0o0000o);

        void onTransitionResume(@oo0oO0 o0O0000O o0o0000o);

        void onTransitionStart(@oo0oO0 o0O0000O o0o0000o);
    }

    public o0O0000O() {
    }

    @SuppressLint({"RestrictedApi"})
    public o0O0000O(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O00000.f5115o00oOo00);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long o00oOoo02 = o0O0o00.o00oOoo0(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (o00oOoo02 >= 0) {
            setDuration(o00oOoo02);
        }
        long o00oOoo03 = o0O0o00.o00oOoo0(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (o00oOoo03 > 0) {
            setStartDelay(o00oOoo03);
        }
        int o00oOooo2 = o0O0o00.o00oOooo(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (o00oOooo2 > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, o00oOooo2));
        }
        String o00oo00O2 = o0O0o00.o00oo00O(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (o00oo00O2 != null) {
            setMatchOrder(parseMatchOrder(o00oo00O2));
        }
        obtainStyledAttributes.recycle();
    }

    private void addUnmatched(androidx.collection.o00oOOo0<View, o0O0Oo0o.o0OoO00O> o00oooo02, androidx.collection.o00oOOo0<View, o0O0Oo0o.o0OoO00O> o00oooo03) {
        for (int i = 0; i < o00oooo02.size(); i++) {
            o0O0Oo0o.o0OoO00O o00oo02 = o00oooo02.o00oo0(i);
            if (isValidTarget(o00oo02.f11945o00oOOoO)) {
                this.mStartValuesList.add(o00oo02);
                this.mEndValuesList.add(null);
            }
        }
        for (int i2 = 0; i2 < o00oooo03.size(); i2++) {
            o0O0Oo0o.o0OoO00O o00oo03 = o00oooo03.o00oo0(i2);
            if (isValidTarget(o00oo03.f11945o00oOOoO)) {
                this.mEndValuesList.add(o00oo03);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static void addViewValues(o0O0Oo0o.o0O00O0o o0o00o0o, View view, o0O0Oo0o.o0OoO00O o0ooo00o) {
        o0o00o0o.f11916o00oOOo0.put(view, o0ooo00o);
        int id = view.getId();
        if (id >= 0) {
            if (o0o00o0o.f11917o00oOOoO.indexOfKey(id) >= 0) {
                o0o00o0o.f11917o00oOOoO.put(id, null);
            } else {
                o0o00o0o.f11917o00oOOoO.put(id, view);
            }
        }
        String o0O0O0O2 = o0O0o00O.o0O0O0O(view);
        if (o0O0O0O2 != null) {
            if (o0o00o0o.f11919o00oOooO.containsKey(o0O0O0O2)) {
                o0o00o0o.f11919o00oOooO.put(o0O0O0O2, null);
            } else {
                o0o00o0o.f11919o00oOooO.put(o0O0O0O2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (o0o00o0o.f11918o00oOo00.o00oo0(itemIdAtPosition) < 0) {
                    o0O0o00O.o00oo0OO.o00oo0Oo(view, true);
                    o0o00o0o.f11918o00oOo00.o00oo0Oo(itemIdAtPosition, view);
                    return;
                }
                View o00oOooo2 = o0o00o0o.f11918o00oOo00.o00oOooo(itemIdAtPosition);
                if (o00oOooo2 != null) {
                    o0O0o00O.o00oo0OO.o00oo0Oo(o00oOooo2, false);
                    o0o00o0o.f11918o00oOo00.o00oo0Oo(itemIdAtPosition, null);
                }
            }
        }
    }

    private static boolean alreadyContains(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    private void captureHierarchy(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    o0O0Oo0o.o0OoO00O o0ooo00o = new o0O0Oo0o.o0OoO00O(view);
                    if (z) {
                        captureStartValues(o0ooo00o);
                    } else {
                        captureEndValues(o0ooo00o);
                    }
                    o0ooo00o.f11946o00oOo00.add(this);
                    capturePropagationValues(o0ooo00o);
                    addViewValues(z ? this.mStartValues : this.mEndValues, view, o0ooo00o);
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.mTargetTypeChildExcludes.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                captureHierarchy(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i, boolean z) {
        if (i > 0) {
            Integer valueOf = Integer.valueOf(i);
            return z ? o00oOoO.o00oOOo0(arrayList, valueOf) : o00oOoO.o00oOOoO(arrayList, valueOf);
        }
        return arrayList;
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t, boolean z) {
        return t != null ? z ? o00oOoO.o00oOOo0(arrayList, t) : o00oOoO.o00oOOoO(arrayList, t) : arrayList;
    }

    private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
        return cls != null ? z ? o00oOoO.o00oOOo0(arrayList, cls) : o00oOoO.o00oOOoO(arrayList, cls) : arrayList;
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z) {
        return view != null ? z ? o00oOoO.o00oOOo0(arrayList, view) : o00oOoO.o00oOOoO(arrayList, view) : arrayList;
    }

    private static androidx.collection.o00oOOo0<Animator, o00oOo0O> getRunningAnimators() {
        androidx.collection.o00oOOo0<Animator, o00oOo0O> o00oooo02 = sRunningAnimators.get();
        if (o00oooo02 == null) {
            androidx.collection.o00oOOo0<Animator, o00oOo0O> o00oooo03 = new androidx.collection.o00oOOo0<>();
            sRunningAnimators.set(o00oooo03);
            return o00oooo03;
        }
        return o00oooo02;
    }

    private static boolean isValidMatch(int i) {
        return i >= 1 && i <= 4;
    }

    private static boolean isValueChanged(o0O0Oo0o.o0OoO00O o0ooo00o, o0O0Oo0o.o0OoO00O o0ooo00o2, String str) {
        Object obj = o0ooo00o.f11944o00oOOo0.get(str);
        Object obj2 = o0ooo00o2.f11944o00oOOo0.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void matchIds(androidx.collection.o00oOOo0<View, o0O0Oo0o.o0OoO00O> o00oooo02, androidx.collection.o00oOOo0<View, o0O0Oo0o.o0OoO00O> o00oooo03, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && isValidTarget(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                o0O0Oo0o.o0OoO00O o0ooo00o = o00oooo02.get(valueAt);
                o0O0Oo0o.o0OoO00O o0ooo00o2 = o00oooo03.get(view);
                if (o0ooo00o != null && o0ooo00o2 != null) {
                    this.mStartValuesList.add(o0ooo00o);
                    this.mEndValuesList.add(o0ooo00o2);
                    o00oooo02.remove(valueAt);
                    o00oooo03.remove(view);
                }
            }
        }
    }

    private void matchInstances(androidx.collection.o00oOOo0<View, o0O0Oo0o.o0OoO00O> o00oooo02, androidx.collection.o00oOOo0<View, o0O0Oo0o.o0OoO00O> o00oooo03) {
        o0O0Oo0o.o0OoO00O remove;
        for (int size = o00oooo02.size() - 1; size >= 0; size--) {
            View o00oOoOo2 = o00oooo02.o00oOoOo(size);
            if (o00oOoOo2 != null && isValidTarget(o00oOoOo2) && (remove = o00oooo03.remove(o00oOoOo2)) != null && isValidTarget(remove.f11945o00oOOoO)) {
                this.mStartValuesList.add(o00oooo02.o00oOooo(size));
                this.mEndValuesList.add(remove);
            }
        }
    }

    private void matchItemIds(androidx.collection.o00oOOo0<View, o0O0Oo0o.o0OoO00O> o00oooo02, androidx.collection.o00oOOo0<View, o0O0Oo0o.o0OoO00O> o00oooo03, androidx.collection.o00oo0OO<View> o00oo0oo, androidx.collection.o00oo0OO<View> o00oo0oo2) {
        View o00oOooo2;
        int o00ooO0o2 = o00oo0oo.o00ooO0o();
        for (int i = 0; i < o00ooO0o2; i++) {
            View o00ooO2 = o00oo0oo.o00ooO(i);
            if (o00ooO2 != null && isValidTarget(o00ooO2) && (o00oOooo2 = o00oo0oo2.o00oOooo(o00oo0oo.o00oo0O(i))) != null && isValidTarget(o00oOooo2)) {
                o0O0Oo0o.o0OoO00O o0ooo00o = o00oooo02.get(o00ooO2);
                o0O0Oo0o.o0OoO00O o0ooo00o2 = o00oooo03.get(o00oOooo2);
                if (o0ooo00o != null && o0ooo00o2 != null) {
                    this.mStartValuesList.add(o0ooo00o);
                    this.mEndValuesList.add(o0ooo00o2);
                    o00oooo02.remove(o00ooO2);
                    o00oooo03.remove(o00oOooo2);
                }
            }
        }
    }

    private void matchNames(androidx.collection.o00oOOo0<View, o0O0Oo0o.o0OoO00O> o00oooo02, androidx.collection.o00oOOo0<View, o0O0Oo0o.o0OoO00O> o00oooo03, androidx.collection.o00oOOo0<String, View> o00oooo04, androidx.collection.o00oOOo0<String, View> o00oooo05) {
        View view;
        int size = o00oooo04.size();
        for (int i = 0; i < size; i++) {
            View o00oo02 = o00oooo04.o00oo0(i);
            if (o00oo02 != null && isValidTarget(o00oo02) && (view = o00oooo05.get(o00oooo04.o00oOoOo(i))) != null && isValidTarget(view)) {
                o0O0Oo0o.o0OoO00O o0ooo00o = o00oooo02.get(o00oo02);
                o0O0Oo0o.o0OoO00O o0ooo00o2 = o00oooo03.get(view);
                if (o0ooo00o != null && o0ooo00o2 != null) {
                    this.mStartValuesList.add(o0ooo00o);
                    this.mEndValuesList.add(o0ooo00o2);
                    o00oooo02.remove(o00oo02);
                    o00oooo03.remove(view);
                }
            }
        }
    }

    private void matchStartAndEnd(o0O0Oo0o.o0O00O0o o0o00o0o, o0O0Oo0o.o0O00O0o o0o00o0o2) {
        androidx.collection.o00oOOo0<View, o0O0Oo0o.o0OoO00O> o00oooo02 = new androidx.collection.o00oOOo0<>(o0o00o0o.f11916o00oOOo0);
        androidx.collection.o00oOOo0<View, o0O0Oo0o.o0OoO00O> o00oooo03 = new androidx.collection.o00oOOo0<>(o0o00o0o2.f11916o00oOOo0);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i >= iArr.length) {
                addUnmatched(o00oooo02, o00oooo03);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                matchInstances(o00oooo02, o00oooo03);
            } else if (i2 == 2) {
                matchNames(o00oooo02, o00oooo03, o0o00o0o.f11919o00oOooO, o0o00o0o2.f11919o00oOooO);
            } else if (i2 == 3) {
                matchIds(o00oooo02, o00oooo03, o0o00o0o.f11917o00oOOoO, o0o00o0o2.f11917o00oOOoO);
            } else if (i2 == 4) {
                matchItemIds(o00oooo02, o00oooo03, o0o00o0o.f11918o00oOo00, o0o00o0o2.f11918o00oOo00);
            }
            i++;
        }
    }

    private static int[] parseMatchOrder(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (!trim.isEmpty()) {
                throw new InflateException(android.support.v4.media.o00oOoO.o00oOOo0("Unknown match type in matchOrder: '", trim, "'"));
            } else {
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            }
            i++;
        }
        return iArr;
    }

    private void runAnimator(Animator animator, androidx.collection.o00oOOo0<Animator, o00oOo0O> o00oooo02) {
        if (animator != null) {
            animator.addListener(new o00oOOoO(o00oooo02));
            animate(animator);
        }
    }

    @oo0oO0
    public o0O0000O addListener(@oo0oO0 o00oo0OO o00oo0oo) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(o00oo0oo);
        return this;
    }

    @oo0oO0
    public o0O0000O addTarget(@oo0OOoo int i) {
        if (i != 0) {
            this.mTargetIds.add(Integer.valueOf(i));
        }
        return this;
    }

    @oo0oO0
    public o0O0000O addTarget(@oo0oO0 View view) {
        this.mTargets.add(view);
        return this;
    }

    @oo0oO0
    public o0O0000O addTarget(@oo0oO0 Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    @oo0oO0
    public o0O0000O addTarget(@oo0oO0 String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new o00oOo00());
        animator.start();
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<o00oo0OO> arrayList = this.mListeners;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((o00oo0OO) arrayList2.get(i)).onTransitionCancel(this);
        }
    }

    public abstract void captureEndValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o);

    public void capturePropagationValues(o0O0Oo0o.o0OoO00O o0ooo00o) {
        String[] o00oOOoO2;
        if (this.mPropagation == null || o0ooo00o.f11944o00oOOo0.isEmpty() || (o00oOOoO2 = this.mPropagation.o00oOOoO()) == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= o00oOOoO2.length) {
                z = true;
                break;
            } else if (!o0ooo00o.f11944o00oOOo0.containsKey(o00oOOoO2[i])) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        this.mPropagation.o00oOOo0(o0ooo00o);
    }

    public abstract void captureStartValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o);

    public void captureValues(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        androidx.collection.o00oOOo0<String, String> o00oooo02;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View findViewById = viewGroup.findViewById(this.mTargetIds.get(i).intValue());
                if (findViewById != null) {
                    o0O0Oo0o.o0OoO00O o0ooo00o = new o0O0Oo0o.o0OoO00O(findViewById);
                    if (z) {
                        captureStartValues(o0ooo00o);
                    } else {
                        captureEndValues(o0ooo00o);
                    }
                    o0ooo00o.f11946o00oOo00.add(this);
                    capturePropagationValues(o0ooo00o);
                    addViewValues(z ? this.mStartValues : this.mEndValues, findViewById, o0ooo00o);
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                View view = this.mTargets.get(i2);
                o0O0Oo0o.o0OoO00O o0ooo00o2 = new o0O0Oo0o.o0OoO00O(view);
                if (z) {
                    captureStartValues(o0ooo00o2);
                } else {
                    captureEndValues(o0ooo00o2);
                }
                o0ooo00o2.f11946o00oOo00.add(this);
                capturePropagationValues(o0ooo00o2);
                addViewValues(z ? this.mStartValues : this.mEndValues, view, o0ooo00o2);
            }
        } else {
            captureHierarchy(viewGroup, z);
        }
        if (z || (o00oooo02 = this.mNameOverrides) == null) {
            return;
        }
        int size = o00oooo02.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.mStartValues.f11919o00oOooO.remove(this.mNameOverrides.o00oOoOo(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.mStartValues.f11919o00oOooO.put(this.mNameOverrides.o00oo0(i4), view2);
            }
        }
    }

    public void clearValues(boolean z) {
        o0O0Oo0o.o0O00O0o o0o00o0o;
        if (z) {
            this.mStartValues.f11916o00oOOo0.clear();
            this.mStartValues.f11917o00oOOoO.clear();
            o0o00o0o = this.mStartValues;
        } else {
            this.mEndValues.f11916o00oOOo0.clear();
            this.mEndValues.f11917o00oOOoO.clear();
            o0o00o0o = this.mEndValues;
        }
        o0o00o0o.f11918o00oOo00.o00oOo00();
    }

    @Override // 
    /* renamed from: clone */
    public o0O0000O mo3clone() {
        try {
            o0O0000O o0o0000o = (o0O0000O) super.clone();
            o0o0000o.mAnimators = new ArrayList<>();
            o0o0000o.mStartValues = new o0O0Oo0o.o0O00O0o();
            o0o0000o.mEndValues = new o0O0Oo0o.o0O00O0o();
            o0o0000o.mStartValuesList = null;
            o0o0000o.mEndValuesList = null;
            return o0o0000o;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @o0OO00OO
    public Animator createAnimator(@oo0oO0 ViewGroup viewGroup, @o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o, @o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o2) {
        return null;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup, o0O0Oo0o.o0O00O0o o0o00o0o, o0O0Oo0o.o0O00O0o o0o00o0o2, ArrayList<o0O0Oo0o.o0OoO00O> arrayList, ArrayList<o0O0Oo0o.o0OoO00O> arrayList2) {
        Animator createAnimator;
        int i;
        View view;
        Animator animator;
        o0O0Oo0o.o0OoO00O o0ooo00o;
        Animator animator2;
        o0O0Oo0o.o0OoO00O o0ooo00o2;
        androidx.collection.o00oOOo0<Animator, o00oOo0O> runningAnimators = getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            o0O0Oo0o.o0OoO00O o0ooo00o3 = arrayList.get(i2);
            o0O0Oo0o.o0OoO00O o0ooo00o4 = arrayList2.get(i2);
            if (o0ooo00o3 != null && !o0ooo00o3.f11946o00oOo00.contains(this)) {
                o0ooo00o3 = null;
            }
            if (o0ooo00o4 != null && !o0ooo00o4.f11946o00oOo00.contains(this)) {
                o0ooo00o4 = null;
            }
            if (o0ooo00o3 != null || o0ooo00o4 != null) {
                if ((o0ooo00o3 == null || o0ooo00o4 == null || isTransitionRequired(o0ooo00o3, o0ooo00o4)) && (createAnimator = createAnimator(viewGroup, o0ooo00o3, o0ooo00o4)) != null) {
                    if (o0ooo00o4 != null) {
                        view = o0ooo00o4.f11945o00oOOoO;
                        String[] transitionProperties = getTransitionProperties();
                        if (transitionProperties != null && transitionProperties.length > 0) {
                            o0ooo00o2 = new o0O0Oo0o.o0OoO00O(view);
                            i = size;
                            o0O0Oo0o.o0OoO00O o0ooo00o5 = o0o00o0o2.f11916o00oOOo0.get(view);
                            if (o0ooo00o5 != null) {
                                int i3 = 0;
                                while (i3 < transitionProperties.length) {
                                    Map<String, Object> map = o0ooo00o2.f11944o00oOOo0;
                                    String str = transitionProperties[i3];
                                    map.put(str, o0ooo00o5.f11944o00oOOo0.get(str));
                                    i3++;
                                    transitionProperties = transitionProperties;
                                }
                            }
                            int size2 = runningAnimators.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    animator2 = createAnimator;
                                    break;
                                }
                                o00oOo0O o00ooo0o2 = runningAnimators.get(runningAnimators.o00oOoOo(i4));
                                if (o00ooo0o2.f5153o00oOo00 != null && o00ooo0o2.f5151o00oOOo0 == view && o00ooo0o2.f5152o00oOOoO.equals(getName()) && o00ooo0o2.f5153o00oOo00.equals(o0ooo00o2)) {
                                    animator2 = null;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            i = size;
                            animator2 = createAnimator;
                            o0ooo00o2 = null;
                        }
                        animator = animator2;
                        o0ooo00o = o0ooo00o2;
                    } else {
                        i = size;
                        view = o0ooo00o3.f11945o00oOOoO;
                        animator = createAnimator;
                        o0ooo00o = null;
                    }
                    if (animator != null) {
                        o0O0Oo0o.o0O00O0 o0o00o0 = this.mPropagation;
                        if (o0o00o0 != null) {
                            long o00oOo002 = o0o00o0.o00oOo00(viewGroup, this, o0ooo00o3, o0ooo00o4);
                            sparseIntArray.put(this.mAnimators.size(), (int) o00oOo002);
                            j = Math.min(o00oOo002, j);
                        }
                        runningAnimators.put(animator, new o00oOo0O(view, getName(), this, o0O0O0Oo.o00oOooO(viewGroup), o0ooo00o));
                        this.mAnimators.add(animator);
                        j = j;
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator3 = this.mAnimators.get(sparseIntArray.keyAt(i5));
                animator3.setStartDelay(animator3.getStartDelay() + (sparseIntArray.valueAt(i5) - j));
            }
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            ArrayList<o00oo0OO> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((o00oo0OO) arrayList2.get(i2)).onTransitionEnd(this);
                }
            }
            for (int i3 = 0; i3 < this.mStartValues.f11918o00oOo00.o00ooO0o(); i3++) {
                View o00ooO2 = this.mStartValues.f11918o00oOo00.o00ooO(i3);
                if (o00ooO2 != null) {
                    o0O0o00O.oo0ooO(o00ooO2, false);
                }
            }
            for (int i4 = 0; i4 < this.mEndValues.f11918o00oOo00.o00ooO0o(); i4++) {
                View o00ooO3 = this.mEndValues.f11918o00oOo00.o00ooO(i4);
                if (o00ooO3 != null) {
                    o0O0o00O.oo0ooO(o00ooO3, false);
                }
            }
            this.mEnded = true;
        }
    }

    @oo0oO0
    public o0O0000O excludeChildren(@oo0OOoo int i, boolean z) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    @oo0oO0
    public o0O0000O excludeChildren(@oo0oO0 View view, boolean z) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z);
        return this;
    }

    @oo0oO0
    public o0O0000O excludeChildren(@oo0oO0 Class<?> cls, boolean z) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    @oo0oO0
    public o0O0000O excludeTarget(@oo0OOoo int i, boolean z) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i, z);
        return this;
    }

    @oo0oO0
    public o0O0000O excludeTarget(@oo0oO0 View view, boolean z) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z);
        return this;
    }

    @oo0oO0
    public o0O0000O excludeTarget(@oo0oO0 Class<?> cls, boolean z) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    @oo0oO0
    public o0O0000O excludeTarget(@oo0oO0 String str, boolean z) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z);
        return this;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(ViewGroup viewGroup) {
        androidx.collection.o00oOOo0<Animator, o00oOo0O> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        o0O0oo00 o00oOooO2 = o0O0O0Oo.o00oOooO(viewGroup);
        androidx.collection.o00oOOo0 o00oooo02 = new androidx.collection.o00oOOo0(runningAnimators);
        runningAnimators.clear();
        for (int i = size - 1; i >= 0; i--) {
            o00oOo0O o00ooo0o2 = (o00oOo0O) o00oooo02.o00oo0(i);
            if (o00ooo0o2.f5151o00oOOo0 != null && o00oOooO2 != null && o00oOooO2.equals(o00ooo0o2.f5155o00oOooO)) {
                ((Animator) o00oooo02.o00oOoOo(i)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    @o0OO00OO
    public Rect getEpicenter() {
        o00oo00O o00oo00o = this.mEpicenterCallback;
        if (o00oo00o == null) {
            return null;
        }
        return o00oo00o.o00oOOo0(this);
    }

    @o0OO00OO
    public o00oo00O getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    @o0OO00OO
    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public o0O0Oo0o.o0OoO00O getMatchedTransitionValues(View view, boolean z) {
        o0O000Oo o0o000oo = this.mParent;
        if (o0o000oo != null) {
            return o0o000oo.getMatchedTransitionValues(view, z);
        }
        ArrayList<o0O0Oo0o.o0OoO00O> arrayList = z ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            o0O0Oo0o.o0OoO00O o0ooo00o = arrayList.get(i2);
            if (o0ooo00o == null) {
                return null;
            }
            if (o0ooo00o.f11945o00oOOoO == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            return (z ? this.mEndValuesList : this.mStartValuesList).get(i);
        }
        return null;
    }

    @oo0oO0
    public String getName() {
        return this.mName;
    }

    @oo0oO0
    public o0O0Oo0o.o0O000O getPathMotion() {
        return this.mPathMotion;
    }

    @o0OO00OO
    public o0O0Oo0o.o0O00O0 getPropagation() {
        return this.mPropagation;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    @oo0oO0
    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    @o0OO00OO
    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    @o0OO00OO
    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    @oo0oO0
    public List<View> getTargets() {
        return this.mTargets;
    }

    @o0OO00OO
    public String[] getTransitionProperties() {
        return null;
    }

    @o0OO00OO
    public o0O0Oo0o.o0OoO00O getTransitionValues(@oo0oO0 View view, boolean z) {
        o0O000Oo o0o000oo = this.mParent;
        if (o0o000oo != null) {
            return o0o000oo.getTransitionValues(view, z);
        }
        return (z ? this.mStartValues : this.mEndValues).f11916o00oOOo0.get(view);
    }

    public boolean isTransitionRequired(@o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o, @o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o2) {
        if (o0ooo00o == null || o0ooo00o2 == null) {
            return false;
        }
        String[] transitionProperties = getTransitionProperties();
        if (transitionProperties == null) {
            for (String str : o0ooo00o.f11944o00oOOo0.keySet()) {
                if (isValueChanged(o0ooo00o, o0ooo00o2, str)) {
                }
            }
            return false;
        }
        for (String str2 : transitionProperties) {
            if (!isValueChanged(o0ooo00o, o0ooo00o2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList4 = this.mTargetExcludes;
            if (arrayList4 == null || !arrayList4.contains(view)) {
                ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    for (int i = 0; i < size; i++) {
                        if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                            return false;
                        }
                    }
                }
                if (this.mTargetNameExcludes == null || o0O0o00O.o0O0O0O(view) == null || !this.mTargetNameExcludes.contains(o0O0o00O.o00ooO0.o00oOoo0(view))) {
                    if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
                        return true;
                    }
                    ArrayList<String> arrayList6 = this.mTargetNames;
                    if (arrayList6 == null || !arrayList6.contains(o0O0o00O.o0O0O0O(view))) {
                        if (this.mTargetTypes != null) {
                            for (int i2 = 0; i2 < this.mTargetTypes.size(); i2++) {
                                if (this.mTargetTypes.get(i2).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).pause();
        }
        ArrayList<o00oo0OO> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((o00oo0OO) arrayList2.get(i)).onTransitionPause(this);
            }
        }
        this.mPaused = true;
    }

    public void playTransition(ViewGroup viewGroup) {
        o00oOo0O o00ooo0o2;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        androidx.collection.o00oOOo0<Animator, o00oOo0O> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        o0O0oo00 o00oOooO2 = o0O0O0Oo.o00oOooO(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator o00oOoOo2 = runningAnimators.o00oOoOo(i);
            if (o00oOoOo2 != null && (o00ooo0o2 = runningAnimators.get(o00oOoOo2)) != null && o00ooo0o2.f5151o00oOOo0 != null && o00oOooO2.equals(o00ooo0o2.f5155o00oOooO)) {
                o0O0Oo0o.o0OoO00O o0ooo00o = o00ooo0o2.f5153o00oOo00;
                View view = o00ooo0o2.f5151o00oOOo0;
                o0O0Oo0o.o0OoO00O transitionValues = getTransitionValues(view, true);
                o0O0Oo0o.o0OoO00O matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.f11916o00oOOo0.get(view);
                }
                if (!(transitionValues == null && matchedTransitionValues == null) && o00ooo0o2.f5154o00oOo0O.isTransitionRequired(o0ooo00o, matchedTransitionValues)) {
                    if (o00oOoOo2.isRunning() || o00oOoOo2.isStarted()) {
                        o00oOoOo2.cancel();
                    } else {
                        runningAnimators.remove(o00oOoOo2);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    @oo0oO0
    public o0O0000O removeListener(@oo0oO0 o00oo0OO o00oo0oo) {
        ArrayList<o00oo0OO> arrayList = this.mListeners;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(o00oo0oo);
        if (this.mListeners.size() == 0) {
            this.mListeners = null;
        }
        return this;
    }

    @oo0oO0
    public o0O0000O removeTarget(@oo0OOoo int i) {
        if (i != 0) {
            this.mTargetIds.remove(Integer.valueOf(i));
        }
        return this;
    }

    @oo0oO0
    public o0O0000O removeTarget(@oo0oO0 View view) {
        this.mTargets.remove(view);
        return this;
    }

    @oo0oO0
    public o0O0000O removeTarget(@oo0oO0 Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @oo0oO0
    public o0O0000O removeTarget(@oo0oO0 String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
                    this.mCurrentAnimators.get(size).resume();
                }
                ArrayList<o00oo0OO> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((o00oo0OO) arrayList2.get(i)).onTransitionResume(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        start();
        androidx.collection.o00oOOo0<Animator, o00oOo0O> runningAnimators = getRunningAnimators();
        Iterator<Animator> it = this.mAnimators.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (runningAnimators.containsKey(next)) {
                start();
                runAnimator(next, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    public void setCanRemoveViews(boolean z) {
        this.mCanRemoveViews = z;
    }

    @oo0oO0
    public o0O0000O setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public void setEpicenterCallback(@o0OO00OO o00oo00O o00oo00o) {
        this.mEpicenterCallback = o00oo00o;
    }

    @oo0oO0
    public o0O0000O setInterpolator(@o0OO00OO TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!isValidMatch(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (alreadyContains(iArr, i)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(@o0OO00OO o0O0Oo0o.o0O000O o0o000o) {
        if (o0o000o == null) {
            o0o000o = STRAIGHT_PATH_MOTION;
        }
        this.mPathMotion = o0o000o;
    }

    public void setPropagation(@o0OO00OO o0O0Oo0o.o0O00O0 o0o00o0) {
        this.mPropagation = o0o00o0;
    }

    @oo0oO0
    public o0O0000O setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void start() {
        if (this.mNumInstances == 0) {
            ArrayList<o00oo0OO> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((o00oo0OO) arrayList2.get(i)).onTransitionStart(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(str);
        o00oOOo02.append(getClass().getSimpleName());
        o00oOOo02.append("@");
        o00oOOo02.append(Integer.toHexString(hashCode()));
        o00oOOo02.append(": ");
        String sb = o00oOOo02.toString();
        if (this.mDuration != -1) {
            sb = android.support.v4.media.session.o00oOo00.o00oOOo0(androidx.appcompat.widget.o00oOo0O.o00oOOo0(sb, "dur("), this.mDuration, ") ");
        }
        if (this.mStartDelay != -1) {
            sb = android.support.v4.media.session.o00oOo00.o00oOOo0(androidx.appcompat.widget.o00oOo0O.o00oOOo0(sb, "dly("), this.mStartDelay, ") ");
        }
        if (this.mInterpolator != null) {
            StringBuilder o00oOOo03 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(sb, "interp(");
            o00oOOo03.append(this.mInterpolator);
            o00oOOo03.append(") ");
            sb = o00oOOo03.toString();
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            String o00oOOo04 = o00oOoOo.o00oo.o00oOOo0(sb, "tgts(");
            if (this.mTargetIds.size() > 0) {
                for (int i = 0; i < this.mTargetIds.size(); i++) {
                    if (i > 0) {
                        o00oOOo04 = o00oOoOo.o00oo.o00oOOo0(o00oOOo04, ", ");
                    }
                    StringBuilder o00oOOo05 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo04);
                    o00oOOo05.append(this.mTargetIds.get(i));
                    o00oOOo04 = o00oOOo05.toString();
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                    if (i2 > 0) {
                        o00oOOo04 = o00oOoOo.o00oo.o00oOOo0(o00oOOo04, ", ");
                    }
                    StringBuilder o00oOOo06 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo04);
                    o00oOOo06.append(this.mTargets.get(i2));
                    o00oOOo04 = o00oOOo06.toString();
                }
            }
            return o00oOoOo.o00oo.o00oOOo0(o00oOOo04, ")");
        }
        return sb;
    }
}
