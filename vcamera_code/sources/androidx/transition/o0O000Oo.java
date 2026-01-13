package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.o0O0000O;
import java.util.ArrayList;
import java.util.Iterator;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0OOoo;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
/* loaded from: classes.dex */
public class o0O000Oo extends o0O0000O {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f5156o00oo = 4;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f5157o00oo0oO = 1;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f5158o00ooO0 = 0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f5159o00ooO00 = 8;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f5160o00ooO0O = 1;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f5161o0O0o = 2;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f5162o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public ArrayList<o0O0000O> f5163o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f5164o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f5165o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f5166o00oo0o0;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O000O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0O0000O f5167o00oOOo0;

        public o00oOOo0(o0O0000O o0o0000o) {
            this.f5167o00oOOo0 = o0o0000o;
        }

        @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionEnd(@oo0oO0 o0O0000O o0o0000o) {
            this.f5167o00oOOo0.runAnimators();
            o0o0000o.removeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends o0O000O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o0O000Oo f5169o00oOOo0;

        public o00oOOoO(o0O000Oo o0o000oo) {
            this.f5169o00oOOo0 = o0o000oo;
        }

        @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionEnd(@oo0oO0 o0O0000O o0o0000o) {
            o0O000Oo o0o000oo = this.f5169o00oOOo0;
            int i = o0o000oo.f5164o00oo0Oo - 1;
            o0o000oo.f5164o00oo0Oo = i;
            if (i == 0) {
                o0o000oo.f5166o00oo0o0 = false;
                o0o000oo.end();
            }
            o0o0000o.removeListener(this);
        }

        @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionStart(@oo0oO0 o0O0000O o0o0000o) {
            o0O000Oo o0o000oo = this.f5169o00oOOo0;
            if (o0o000oo.f5166o00oo0o0) {
                return;
            }
            o0o000oo.start();
            this.f5169o00oOOo0.f5166o00oo0o0 = true;
        }
    }

    public o0O000Oo() {
        this.f5163o00oo0O0 = new ArrayList<>();
        this.f5162o00oo0O = true;
        this.f5166o00oo0o0 = false;
        this.f5165o00oo0o = 0;
    }

    @SuppressLint({"RestrictedApi"})
    public o0O000Oo(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5163o00oo0O0 = new ArrayList<>();
        this.f5162o00oo0O = true;
        this.f5166o00oo0o0 = false;
        this.f5165o00oo0o = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O00000.f5120o00oOoOO);
        o00oo(o0O0o00.o00oOoo0(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.o0O0000O
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int size = this.f5163o00oo0O0.size();
        for (int i = 0; i < size; i++) {
            this.f5163o00oo0O0.get(i).cancel();
        }
    }

    @Override // androidx.transition.o0O0000O
    public void captureEndValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o) {
        if (isValidTarget(o0ooo00o.f11945o00oOOoO)) {
            Iterator<o0O0000O> it = this.f5163o00oo0O0.iterator();
            while (it.hasNext()) {
                o0O0000O next = it.next();
                if (next.isValidTarget(o0ooo00o.f11945o00oOOoO)) {
                    next.captureEndValues(o0ooo00o);
                    o0ooo00o.f11946o00oOo00.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.o0O0000O
    public void capturePropagationValues(o0O0Oo0o.o0OoO00O o0ooo00o) {
        super.capturePropagationValues(o0ooo00o);
        int size = this.f5163o00oo0O0.size();
        for (int i = 0; i < size; i++) {
            this.f5163o00oo0O0.get(i).capturePropagationValues(o0ooo00o);
        }
    }

    @Override // androidx.transition.o0O0000O
    public void captureStartValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o) {
        if (isValidTarget(o0ooo00o.f11945o00oOOoO)) {
            Iterator<o0O0000O> it = this.f5163o00oo0O0.iterator();
            while (it.hasNext()) {
                o0O0000O next = it.next();
                if (next.isValidTarget(o0ooo00o.f11945o00oOOoO)) {
                    next.captureStartValues(o0ooo00o);
                    o0ooo00o.f11946o00oOo00.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.o0O0000O
    /* renamed from: clone */
    public o0O0000O mo3clone() {
        o0O000Oo o0o000oo = (o0O000Oo) super.mo3clone();
        o0o000oo.f5163o00oo0O0 = new ArrayList<>();
        int size = this.f5163o00oo0O0.size();
        for (int i = 0; i < size; i++) {
            o0o000oo.o00oOoo0(this.f5163o00oo0O0.get(i).mo3clone());
        }
        return o0o000oo;
    }

    @Override // androidx.transition.o0O0000O
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup, o0O0Oo0o.o0O00O0o o0o00o0o, o0O0Oo0o.o0O00O0o o0o00o0o2, ArrayList<o0O0Oo0o.o0OoO00O> arrayList, ArrayList<o0O0Oo0o.o0OoO00O> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f5163o00oo0O0.size();
        for (int i = 0; i < size; i++) {
            o0O0000O o0o0000o = this.f5163o00oo0O0.get(i);
            if (startDelay > 0 && (this.f5162o00oo0O || i == 0)) {
                long startDelay2 = o0o0000o.getStartDelay();
                if (startDelay2 > 0) {
                    o0o0000o.setStartDelay(startDelay2 + startDelay);
                } else {
                    o0o0000o.setStartDelay(startDelay);
                }
            }
            o0o0000o.createAnimators(viewGroup, o0o00o0o, o0o00o0o2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    public o0O0000O excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.f5163o00oo0O0.size(); i2++) {
            this.f5163o00oo0O0.get(i2).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    public o0O0000O excludeTarget(@oo0oO0 View view, boolean z) {
        for (int i = 0; i < this.f5163o00oo0O0.size(); i++) {
            this.f5163o00oo0O0.get(i).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    public o0O0000O excludeTarget(@oo0oO0 Class<?> cls, boolean z) {
        for (int i = 0; i < this.f5163o00oo0O0.size(); i++) {
            this.f5163o00oo0O0.get(i).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    public o0O0000O excludeTarget(@oo0oO0 String str, boolean z) {
        for (int i = 0; i < this.f5163o00oo0O0.size(); i++) {
            this.f5163o00oo0O0.get(i).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    @Override // androidx.transition.o0O0000O
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f5163o00oo0O0.size();
        for (int i = 0; i < size; i++) {
            this.f5163o00oo0O0.get(i).forceToEnd(viewGroup);
        }
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    /* renamed from: o00oOOoO */
    public o0O000Oo addListener(@oo0oO0 o0O0000O.o00oo0OO o00oo0oo) {
        return (o0O000Oo) super.addListener(o00oo0oo);
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    /* renamed from: o00oOo00 */
    public o0O000Oo addTarget(@oo0OOoo int i) {
        for (int i2 = 0; i2 < this.f5163o00oo0O0.size(); i2++) {
            this.f5163o00oo0O0.get(i2).addTarget(i);
        }
        return (o0O000Oo) super.addTarget(i);
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    /* renamed from: o00oOo0o */
    public o0O000Oo addTarget(@oo0oO0 Class<?> cls) {
        for (int i = 0; i < this.f5163o00oo0O0.size(); i++) {
            this.f5163o00oo0O0.get(i).addTarget(cls);
        }
        return (o0O000Oo) super.addTarget(cls);
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    /* renamed from: o00oOoOO */
    public o0O000Oo addTarget(@oo0oO0 String str) {
        for (int i = 0; i < this.f5163o00oo0O0.size(); i++) {
            this.f5163o00oo0O0.get(i).addTarget(str);
        }
        return (o0O000Oo) super.addTarget(str);
    }

    @oo0oO0
    public o0O000Oo o00oOoOo(@oo0oO0 o0O0000O o0o0000o) {
        o00oOoo0(o0o0000o);
        long j = this.mDuration;
        if (j >= 0) {
            o0o0000o.setDuration(j);
        }
        if ((this.f5165o00oo0o & 1) != 0) {
            o0o0000o.setInterpolator(getInterpolator());
        }
        if ((this.f5165o00oo0o & 2) != 0) {
            o0o0000o.setPropagation(getPropagation());
        }
        if ((this.f5165o00oo0o & 4) != 0) {
            o0o0000o.setPathMotion(getPathMotion());
        }
        if ((this.f5165o00oo0o & 8) != 0) {
            o0o0000o.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    public final void o00oOoo0(@oo0oO0 o0O0000O o0o0000o) {
        this.f5163o00oo0O0.add(o0o0000o);
        o0o0000o.mParent = this;
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    /* renamed from: o00oOooO */
    public o0O000Oo addTarget(@oo0oO0 View view) {
        for (int i = 0; i < this.f5163o00oo0O0.size(); i++) {
            this.f5163o00oo0O0.get(i).addTarget(view);
        }
        return (o0O000Oo) super.addTarget(view);
    }

    public int o00oOooo() {
        return !this.f5162o00oo0O ? 1 : 0;
    }

    @oo0oO0
    public o0O000Oo o00oo(int i) {
        if (i == 0) {
            this.f5162o00oo0O = true;
        } else if (i != 1) {
            throw new AndroidRuntimeException(android.support.v4.media.o00oOOo0.o00oOOo0("Invalid parameter for TransitionSet ordering: ", i));
        } else {
            this.f5162o00oo0O = false;
        }
        return this;
    }

    public int o00oo0() {
        return this.f5163o00oo0O0.size();
    }

    @o0OO00OO
    public o0O0000O o00oo00O(int i) {
        if (i < 0 || i >= this.f5163o00oo0O0.size()) {
            return null;
        }
        return this.f5163o00oo0O0.get(i);
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    /* renamed from: o00oo0O */
    public o0O000Oo removeTarget(@oo0oO0 View view) {
        for (int i = 0; i < this.f5163o00oo0O0.size(); i++) {
            this.f5163o00oo0O0.get(i).removeTarget(view);
        }
        return (o0O000Oo) super.removeTarget(view);
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    /* renamed from: o00oo0O0 */
    public o0O000Oo removeTarget(@oo0OOoo int i) {
        for (int i2 = 0; i2 < this.f5163o00oo0O0.size(); i2++) {
            this.f5163o00oo0O0.get(i2).removeTarget(i);
        }
        return (o0O000Oo) super.removeTarget(i);
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    /* renamed from: o00oo0OO */
    public o0O000Oo removeListener(@oo0oO0 o0O0000O.o00oo0OO o00oo0oo) {
        return (o0O000Oo) super.removeListener(o00oo0oo);
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    /* renamed from: o00oo0Oo */
    public o0O000Oo removeTarget(@oo0oO0 Class<?> cls) {
        for (int i = 0; i < this.f5163o00oo0O0.size(); i++) {
            this.f5163o00oo0O0.get(i).removeTarget(cls);
        }
        return (o0O000Oo) super.removeTarget(cls);
    }

    @oo0oO0
    public o0O000Oo o00oo0o(@oo0oO0 o0O0000O o0o0000o) {
        this.f5163o00oo0O0.remove(o0o0000o);
        o0o0000o.mParent = null;
        return this;
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    /* renamed from: o00oo0o0 */
    public o0O000Oo removeTarget(@oo0oO0 String str) {
        for (int i = 0; i < this.f5163o00oo0O0.size(); i++) {
            this.f5163o00oo0O0.get(i).removeTarget(str);
        }
        return (o0O000Oo) super.removeTarget(str);
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    /* renamed from: o00oo0oO */
    public o0O000Oo setDuration(long j) {
        ArrayList<o0O0000O> arrayList;
        super.setDuration(j);
        if (this.mDuration >= 0 && (arrayList = this.f5163o00oo0O0) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5163o00oo0O0.get(i).setDuration(j);
            }
        }
        return this;
    }

    public final void o00ooO0() {
        o00oOOoO o00ooooo2 = new o00oOOoO(this);
        Iterator<o0O0000O> it = this.f5163o00oo0O0.iterator();
        while (it.hasNext()) {
            it.next().addListener(o00ooooo2);
        }
        this.f5164o00oo0Oo = this.f5163o00oo0O0.size();
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    /* renamed from: o00ooO00 */
    public o0O000Oo setStartDelay(long j) {
        return (o0O000Oo) super.setStartDelay(j);
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    /* renamed from: o0O0o */
    public o0O000Oo setInterpolator(@o0OO00OO TimeInterpolator timeInterpolator) {
        this.f5165o00oo0o |= 1;
        ArrayList<o0O0000O> arrayList = this.f5163o00oo0O0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5163o00oo0O0.get(i).setInterpolator(timeInterpolator);
            }
        }
        return (o0O000Oo) super.setInterpolator(timeInterpolator);
    }

    @Override // androidx.transition.o0O0000O
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void pause(View view) {
        super.pause(view);
        int size = this.f5163o00oo0O0.size();
        for (int i = 0; i < size; i++) {
            this.f5163o00oo0O0.get(i).pause(view);
        }
    }

    @Override // androidx.transition.o0O0000O
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void resume(View view) {
        super.resume(view);
        int size = this.f5163o00oo0O0.size();
        for (int i = 0; i < size; i++) {
            this.f5163o00oo0O0.get(i).resume(view);
        }
    }

    @Override // androidx.transition.o0O0000O
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        if (this.f5163o00oo0O0.isEmpty()) {
            start();
            end();
            return;
        }
        o00ooO0();
        if (this.f5162o00oo0O) {
            Iterator<o0O0000O> it = this.f5163o00oo0O0.iterator();
            while (it.hasNext()) {
                it.next().runAnimators();
            }
            return;
        }
        for (int i = 1; i < this.f5163o00oo0O0.size(); i++) {
            this.f5163o00oo0O0.get(i - 1).addListener(new o00oOOo0(this.f5163o00oo0O0.get(i)));
        }
        o0O0000O o0o0000o = this.f5163o00oo0O0.get(0);
        if (o0o0000o != null) {
            o0o0000o.runAnimators();
        }
    }

    @Override // androidx.transition.o0O0000O
    public void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.f5163o00oo0O0.size();
        for (int i = 0; i < size; i++) {
            this.f5163o00oo0O0.get(i).setCanRemoveViews(z);
        }
    }

    @Override // androidx.transition.o0O0000O
    public void setEpicenterCallback(o0O0000O.o00oo00O o00oo00o) {
        super.setEpicenterCallback(o00oo00o);
        this.f5165o00oo0o |= 8;
        int size = this.f5163o00oo0O0.size();
        for (int i = 0; i < size; i++) {
            this.f5163o00oo0O0.get(i).setEpicenterCallback(o00oo00o);
        }
    }

    @Override // androidx.transition.o0O0000O
    public void setPathMotion(o0O0Oo0o.o0O000O o0o000o) {
        super.setPathMotion(o0o000o);
        this.f5165o00oo0o |= 4;
        if (this.f5163o00oo0O0 != null) {
            for (int i = 0; i < this.f5163o00oo0O0.size(); i++) {
                this.f5163o00oo0O0.get(i).setPathMotion(o0o000o);
            }
        }
    }

    @Override // androidx.transition.o0O0000O
    public void setPropagation(o0O0Oo0o.o0O00O0 o0o00o0) {
        super.setPropagation(o0o00o0);
        this.f5165o00oo0o |= 2;
        int size = this.f5163o00oo0O0.size();
        for (int i = 0; i < size; i++) {
            this.f5163o00oo0O0.get(i).setPropagation(o0o00o0);
        }
    }

    @Override // androidx.transition.o0O0000O
    public String toString(String str) {
        String o0o0000o = super.toString(str);
        for (int i = 0; i < this.f5163o00oo0O0.size(); i++) {
            StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(o0o0000o, "\n");
            o00oOOo02.append(this.f5163o00oo0O0.get(i).toString(str + "  "));
            o0o0000o = o00oOOo02.toString();
        }
        return o0o0000o;
    }
}
