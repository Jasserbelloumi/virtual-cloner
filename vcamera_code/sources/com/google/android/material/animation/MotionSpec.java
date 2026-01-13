package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import androidx.collection.o00ooO0;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0O0000O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOOO00;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class MotionSpec {
    private static final String TAG = "MotionSpec";
    private final o00ooO0<String, MotionTiming> timings = new o00ooO0<>();
    private final o00ooO0<String, PropertyValuesHolder[]> propertyValues = new o00ooO0<>();

    private static void addInfoFromAnimator(@oo0oO0 MotionSpec motionSpec, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            motionSpec.setPropertyValues(objectAnimator.getPropertyName(), objectAnimator.getValues());
            motionSpec.setTiming(objectAnimator.getPropertyName(), MotionTiming.createFromAnimator(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    @oo0oO0
    private PropertyValuesHolder[] clonePropertyValuesHolder(@oo0oO0 PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    @o0OO00OO
    public static MotionSpec createFromAttribute(@oo0oO0 Context context, @oo0oO0 TypedArray typedArray, @o0OOOO00 int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return createFromResource(context, resourceId);
    }

    @o0OO00OO
    public static MotionSpec createFromResource(@oo0oO0 Context context, @o0O0000O int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return createSpecFromAnimators(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return createSpecFromAnimators(arrayList);
            }
            return null;
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    @oo0oO0
    private static MotionSpec createSpecFromAnimators(@oo0oO0 List<Animator> list) {
        MotionSpec motionSpec = new MotionSpec();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            addInfoFromAnimator(motionSpec, list.get(i));
        }
        return motionSpec;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MotionSpec) {
            return this.timings.equals(((MotionSpec) obj).timings);
        }
        return false;
    }

    @oo0oO0
    public <T> ObjectAnimator getAnimator(@oo0oO0 String str, @oo0oO0 T t, @oo0oO0 Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, getPropertyValues(str));
        ofPropertyValuesHolder.setProperty(property);
        getTiming(str).apply(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    @oo0oO0
    public PropertyValuesHolder[] getPropertyValues(String str) {
        if (hasPropertyValues(str)) {
            return clonePropertyValuesHolder(this.propertyValues.get(str));
        }
        throw new IllegalArgumentException();
    }

    public MotionTiming getTiming(String str) {
        if (hasTiming(str)) {
            return this.timings.get(str);
        }
        throw new IllegalArgumentException();
    }

    public long getTotalDuration() {
        int size = this.timings.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            MotionTiming o00oo02 = this.timings.o00oo0(i);
            j = Math.max(j, o00oo02.getDuration() + o00oo02.getDelay());
        }
        return j;
    }

    public boolean hasPropertyValues(String str) {
        return this.propertyValues.get(str) != null;
    }

    public boolean hasTiming(String str) {
        return this.timings.get(str) != null;
    }

    public int hashCode() {
        return this.timings.hashCode();
    }

    public void setPropertyValues(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.propertyValues.put(str, propertyValuesHolderArr);
    }

    public void setTiming(String str, @o0OO00OO MotionTiming motionTiming) {
        this.timings.put(str, motionTiming);
    }

    @oo0oO0
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.timings + "}\n";
    }
}
