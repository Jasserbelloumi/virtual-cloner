package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O000.o00oOoO;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public abstract class o0OooO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ViewGroup f3178o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final ArrayList<o00oOoO> f3179o00oOOoO = new ArrayList<>();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final ArrayList<o00oOoO> f3180o00oOo00 = new ArrayList<>();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f3182o00oOooO = false;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public boolean f3181o00oOo0O = false;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00oOo0O f3184o00oo0O0;

        public o00oOOo0(o00oOo0O o00ooo0o2) {
            this.f3184o00oo0O0 = o00ooo0o2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o0OooO0.this.f3179o00oOOoO.contains(this.f3184o00oo0O0)) {
                this.f3184o00oo0O0.o00oOo0O().applyState(this.f3184o00oo0O0.o00oOo0o().mView);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00oOo0O f3186o00oo0O0;

        public o00oOOoO(o00oOo0O o00ooo0o2) {
            this.f3186o00oo0O0 = o00ooo0o2;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0OooO0.this.f3179o00oOOoO.remove(this.f3186o00oo0O0);
            o0OooO0.this.f3180o00oOo00.remove(this.f3186o00oo0O0);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f3187o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final /* synthetic */ int[] f3188o00oOOoO;

        static {
            int[] iArr = new int[o00oOoO.o00oOOoO.values().length];
            f3188o00oOOoO = iArr;
            try {
                iArr[o00oOoO.o00oOOoO.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3188o00oOOoO[o00oOoO.o00oOOoO.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3188o00oOOoO[o00oOoO.o00oOOoO.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[o00oOoO.o00oOo00.values().length];
            f3187o00oOOo0 = iArr2;
            try {
                iArr2[o00oOoO.o00oOo00.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3187o00oOOo0[o00oOoO.o00oOo00.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3187o00oOOo0[o00oOoO.o00oOo00.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3187o00oOOo0[o00oOoO.o00oOo00.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O extends o00oOoO {
        @oo0oO0

        /* renamed from: o00oOoO  reason: collision with root package name */
        public final o0O00oO0 f3189o00oOoO;

        public o00oOo0O(@oo0oO0 o00oOoO.o00oOo00 o00ooo002, @oo0oO0 o00oOoO.o00oOOoO o00ooooo2, @oo0oO0 o0O00oO0 o0o00oo0, @oo0oO0 o0O000.o00oOoO o00oooo2) {
            super(o00ooo002, o00ooooo2, o0o00oo0.o00oOoo0(), o00oooo2);
            this.f3189o00oOoO = o0o00oo0;
        }

        @Override // androidx.fragment.app.o0OooO0.o00oOoO
        public void o00oOo00() {
            super.o00oOo00();
            this.f3189o00oOoO.o00oo00O();
        }

        @Override // androidx.fragment.app.o0OooO0.o00oOoO
        public void o00oOooo() {
            if (o00oOoO0() != o00oOoO.o00oOOoO.ADDING) {
                if (o00oOoO0() == o00oOoO.o00oOOoO.REMOVING) {
                    Fragment o00oOoo02 = this.f3189o00oOoO.o00oOoo0();
                    View requireView = o00oOoo02.requireView();
                    if (FragmentManager.oo0OOoo(2)) {
                        Objects.toString(requireView.findFocus());
                        requireView.toString();
                        o00oOoo02.toString();
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment o00oOoo03 = this.f3189o00oOoO.o00oOoo0();
            View findFocus = o00oOoo03.mView.findFocus();
            if (findFocus != null) {
                o00oOoo03.setFocusedView(findFocus);
                if (FragmentManager.oo0OOoo(2)) {
                    findFocus.toString();
                    o00oOoo03.toString();
                }
            }
            View requireView2 = o00oOo0o().requireView();
            if (requireView2.getParent() == null) {
                this.f3189o00oOoO.o00oOOoO();
                requireView2.setAlpha(0.0f);
            }
            if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(o00oOoo03.getPostOnViewCreatedAlpha());
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o00oOo00 f3190o00oOOo0;
        @oo0oO0

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o00oOOoO f3191o00oOOoO;
        @oo0oO0

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Fragment f3192o00oOo00;
        @oo0oO0

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final List<Runnable> f3196o00oOooO = new ArrayList();
        @oo0oO0

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final HashSet<o0O000.o00oOoO> f3193o00oOo0O = new HashSet<>();

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public boolean f3194o00oOo0o = false;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public boolean f3195o00oOoO0 = false;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements o00oOoO.o00oOOoO {
            public o00oOOo0() {
            }

            @Override // o0O000.o00oOoO.o00oOOoO
            public void onCancel() {
                o00oOoO.this.o00oOOoO();
            }
        }

        /* loaded from: classes.dex */
        public enum o00oOOoO {
            NONE,
            ADDING,
            REMOVING
        }

        /* loaded from: classes.dex */
        public enum o00oOo00 {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            @oo0oO0
            public static o00oOo00 from(int i) {
                if (i != 0) {
                    if (i != 4) {
                        if (i == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Unknown visibility ", i));
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            @oo0oO0
            public static o00oOo00 from(@oo0oO0 View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : from(view.getVisibility());
            }

            public void applyState(@oo0oO0 View view) {
                int i;
                int i2 = o00oOo00.f3187o00oOOo0[ordinal()];
                if (i2 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.oo0OOoo(2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i2 == 2) {
                    if (FragmentManager.oo0OOoo(2)) {
                        Objects.toString(view);
                    }
                    i = 0;
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                    if (FragmentManager.oo0OOoo(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                    return;
                } else {
                    if (FragmentManager.oo0OOoo(2)) {
                        Objects.toString(view);
                    }
                    i = 8;
                }
                view.setVisibility(i);
            }
        }

        public o00oOoO(@oo0oO0 o00oOo00 o00ooo002, @oo0oO0 o00oOOoO o00ooooo2, @oo0oO0 Fragment fragment, @oo0oO0 o0O000.o00oOoO o00oooo2) {
            this.f3190o00oOOo0 = o00ooo002;
            this.f3191o00oOOoO = o00ooooo2;
            this.f3192o00oOo00 = fragment;
            o00oooo2.o00oOooO(new o00oOOo0());
        }

        public final void o00oOOo0(@oo0oO0 Runnable runnable) {
            this.f3196o00oOooO.add(runnable);
        }

        public final void o00oOOoO() {
            if (o00oOoO()) {
                return;
            }
            this.f3194o00oOo0o = true;
            if (this.f3193o00oOo0O.isEmpty()) {
                o00oOo00();
                return;
            }
            Iterator it = new ArrayList(this.f3193o00oOo0O).iterator();
            while (it.hasNext()) {
                ((o0O000.o00oOoO) it.next()).o00oOOo0();
            }
        }

        @o00oOooO.o0O00O0
        public void o00oOo00() {
            if (this.f3195o00oOoO0) {
                return;
            }
            if (FragmentManager.oo0OOoo(2)) {
                toString();
            }
            this.f3195o00oOoO0 = true;
            for (Runnable runnable : this.f3196o00oOooO) {
                runnable.run();
            }
        }

        @oo0oO0
        public o00oOo00 o00oOo0O() {
            return this.f3190o00oOOo0;
        }

        @oo0oO0
        public final Fragment o00oOo0o() {
            return this.f3192o00oOo00;
        }

        public final boolean o00oOoO() {
            return this.f3194o00oOo0o;
        }

        @oo0oO0
        public o00oOOoO o00oOoO0() {
            return this.f3191o00oOOoO;
        }

        public final boolean o00oOoOO() {
            return this.f3195o00oOoO0;
        }

        public final void o00oOoOo(@oo0oO0 o0O000.o00oOoO o00oooo2) {
            o00oOooo();
            this.f3193o00oOo0O.add(o00oooo2);
        }

        public final void o00oOoo0(@oo0oO0 o00oOo00 o00ooo002, @oo0oO0 o00oOOoO o00ooooo2) {
            o00oOOoO o00ooooo3;
            int i = o00oOo00.f3188o00oOOoO[o00ooooo2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && this.f3190o00oOOo0 != o00oOo00.REMOVED) {
                        if (FragmentManager.oo0OOoo(2)) {
                            Objects.toString(this.f3192o00oOo00);
                            Objects.toString(this.f3190o00oOOo0);
                            Objects.toString(o00ooo002);
                        }
                        this.f3190o00oOOo0 = o00ooo002;
                        return;
                    }
                    return;
                }
                if (FragmentManager.oo0OOoo(2)) {
                    Objects.toString(this.f3192o00oOo00);
                    Objects.toString(this.f3190o00oOOo0);
                    Objects.toString(this.f3191o00oOOoO);
                }
                this.f3190o00oOOo0 = o00oOo00.REMOVED;
                o00ooooo3 = o00oOOoO.REMOVING;
            } else if (this.f3190o00oOOo0 != o00oOo00.REMOVED) {
                return;
            } else {
                if (FragmentManager.oo0OOoo(2)) {
                    Objects.toString(this.f3192o00oOo00);
                    Objects.toString(this.f3191o00oOOoO);
                }
                this.f3190o00oOOo0 = o00oOo00.VISIBLE;
                o00ooooo3 = o00oOOoO.ADDING;
            }
            this.f3191o00oOOoO = o00ooooo3;
        }

        public final void o00oOooO(@oo0oO0 o0O000.o00oOoO o00oooo2) {
            if (this.f3193o00oOo0O.remove(o00oooo2) && this.f3193o00oOo0O.isEmpty()) {
                o00oOo00();
            }
        }

        public void o00oOooo() {
        }

        @oo0oO0
        public String toString() {
            StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0("Operation ", "{");
            o00oOOo02.append(Integer.toHexString(System.identityHashCode(this)));
            o00oOOo02.append("} ");
            o00oOOo02.append("{");
            o00oOOo02.append("mFinalState = ");
            o00oOOo02.append(this.f3190o00oOOo0);
            o00oOOo02.append("} ");
            o00oOOo02.append("{");
            o00oOOo02.append("mLifecycleImpact = ");
            o00oOOo02.append(this.f3191o00oOOoO);
            o00oOOo02.append("} ");
            o00oOOo02.append("{");
            o00oOOo02.append("mFragment = ");
            o00oOOo02.append(this.f3192o00oOo00);
            o00oOOo02.append("}");
            return o00oOOo02.toString();
        }
    }

    public o0OooO0(@oo0oO0 ViewGroup viewGroup) {
        this.f3178o00oOOo0 = viewGroup;
    }

    @oo0oO0
    public static o0OooO0 o00oo0(@oo0oO0 ViewGroup viewGroup, @oo0oO0 FragmentManager fragmentManager) {
        return o00oo0OO(viewGroup, fragmentManager.o0O0OOoo());
    }

    @oo0oO0
    public static o0OooO0 o00oo0OO(@oo0oO0 ViewGroup viewGroup, @oo0oO0 oo0OOoo oo0oooo) {
        int i = R.id.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof o0OooO0) {
            return (o0OooO0) tag;
        }
        o0OooO0 o00oOOo02 = oo0oooo.o00oOOo0(viewGroup);
        viewGroup.setTag(i, o00oOOo02);
        return o00oOOo02;
    }

    public final void o00oOOo0(@oo0oO0 o00oOoO.o00oOo00 o00ooo002, @oo0oO0 o00oOoO.o00oOOoO o00ooooo2, @oo0oO0 o0O00oO0 o0o00oo0) {
        synchronized (this.f3179o00oOOoO) {
            o0O000.o00oOoO o00oooo2 = new o0O000.o00oOoO();
            o00oOoO o00oOoO2 = o00oOoO(o0o00oo0.o00oOoo0());
            if (o00oOoO2 != null) {
                o00oOoO2.o00oOoo0(o00ooo002, o00ooooo2);
                return;
            }
            o00oOo0O o00ooo0o2 = new o00oOo0O(o00ooo002, o00ooooo2, o0o00oo0, o00oooo2);
            this.f3179o00oOOoO.add(o00ooo0o2);
            o00ooo0o2.o00oOOo0(new o00oOOo0(o00ooo0o2));
            o00ooo0o2.o00oOOo0(new o00oOOoO(o00ooo0o2));
        }
    }

    public void o00oOOoO(@oo0oO0 o00oOoO.o00oOo00 o00ooo002, @oo0oO0 o0O00oO0 o0o00oo0) {
        if (FragmentManager.oo0OOoo(2)) {
            Objects.toString(o0o00oo0.o00oOoo0());
        }
        o00oOOo0(o00ooo002, o00oOoO.o00oOOoO.ADDING, o0o00oo0);
    }

    public void o00oOo00(@oo0oO0 o0O00oO0 o0o00oo0) {
        if (FragmentManager.oo0OOoo(2)) {
            Objects.toString(o0o00oo0.o00oOoo0());
        }
        o00oOOo0(o00oOoO.o00oOo00.GONE, o00oOoO.o00oOOoO.NONE, o0o00oo0);
    }

    public void o00oOo0O(@oo0oO0 o0O00oO0 o0o00oo0) {
        if (FragmentManager.oo0OOoo(2)) {
            Objects.toString(o0o00oo0.o00oOoo0());
        }
        o00oOOo0(o00oOoO.o00oOo00.VISIBLE, o00oOoO.o00oOOoO.NONE, o0o00oo0);
    }

    public abstract void o00oOo0o(@oo0oO0 List<o00oOoO> list, boolean z);

    @o0OO00OO
    public final o00oOoO o00oOoO(@oo0oO0 Fragment fragment) {
        Iterator<o00oOoO> it = this.f3179o00oOOoO.iterator();
        while (it.hasNext()) {
            o00oOoO next = it.next();
            if (next.o00oOo0o().equals(fragment) && !next.o00oOoO()) {
                return next;
            }
        }
        return null;
    }

    public void o00oOoO0() {
        if (this.f3181o00oOo0O) {
            return;
        }
        if (!o0O0o00O.o0O0OOoo(this.f3178o00oOOo0)) {
            o00oOoOo();
            this.f3182o00oOooO = false;
            return;
        }
        synchronized (this.f3179o00oOOoO) {
            if (!this.f3179o00oOOoO.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f3180o00oOo00);
                this.f3180o00oOo00.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    o00oOoO o00oooo2 = (o00oOoO) it.next();
                    if (FragmentManager.oo0OOoo(2)) {
                        Objects.toString(o00oooo2);
                    }
                    o00oooo2.o00oOOoO();
                    if (!o00oooo2.o00oOoOO()) {
                        this.f3180o00oOo00.add(o00oooo2);
                    }
                }
                o00oo0O();
                ArrayList arrayList2 = new ArrayList(this.f3179o00oOOoO);
                this.f3179o00oOOoO.clear();
                this.f3180o00oOo00.addAll(arrayList2);
                FragmentManager.oo0OOoo(2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((o00oOoO) it2.next()).o00oOooo();
                }
                o00oOo0o(arrayList2, this.f3182o00oOooO);
                this.f3182o00oOooO = false;
                FragmentManager.oo0OOoo(2);
            }
        }
    }

    @o0OO00OO
    public final o00oOoO o00oOoOO(@oo0oO0 Fragment fragment) {
        Iterator<o00oOoO> it = this.f3180o00oOo00.iterator();
        while (it.hasNext()) {
            o00oOoO next = it.next();
            if (next.o00oOo0o().equals(fragment) && !next.o00oOoO()) {
                return next;
            }
        }
        return null;
    }

    public void o00oOoOo() {
        FragmentManager.oo0OOoo(2);
        boolean o0O0OOoo2 = o0O0o00O.o0O0OOoo(this.f3178o00oOOo0);
        synchronized (this.f3179o00oOOoO) {
            o00oo0O();
            Iterator<o00oOoO> it = this.f3179o00oOOoO.iterator();
            while (it.hasNext()) {
                it.next().o00oOooo();
            }
            Iterator it2 = new ArrayList(this.f3180o00oOo00).iterator();
            while (it2.hasNext()) {
                o00oOoO o00oooo2 = (o00oOoO) it2.next();
                if (FragmentManager.oo0OOoo(2)) {
                    if (!o0O0OOoo2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append(this.f3178o00oOOo0);
                        sb.append(" is not attached to window. ");
                    }
                    Objects.toString(o00oooo2);
                }
                o00oooo2.o00oOOoO();
            }
            Iterator it3 = new ArrayList(this.f3179o00oOOoO).iterator();
            while (it3.hasNext()) {
                o00oOoO o00oooo3 = (o00oOoO) it3.next();
                if (FragmentManager.oo0OOoo(2)) {
                    if (!o0O0OOoo2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.f3178o00oOOo0);
                        sb2.append(" is not attached to window. ");
                    }
                    Objects.toString(o00oooo3);
                }
                o00oooo3.o00oOOoO();
            }
        }
    }

    public void o00oOoo0() {
        if (this.f3181o00oOo0O) {
            FragmentManager.oo0OOoo(2);
            this.f3181o00oOo0O = false;
            o00oOoO0();
        }
    }

    public void o00oOooO(@oo0oO0 o0O00oO0 o0o00oo0) {
        if (FragmentManager.oo0OOoo(2)) {
            Objects.toString(o0o00oo0.o00oOoo0());
        }
        o00oOOo0(o00oOoO.o00oOo00.REMOVED, o00oOoO.o00oOOoO.REMOVING, o0o00oo0);
    }

    @o0OO00OO
    public o00oOoO.o00oOOoO o00oOooo(@oo0oO0 o0O00oO0 o0o00oo0) {
        o00oOoO o00oOoO2 = o00oOoO(o0o00oo0.o00oOoo0());
        o00oOoO.o00oOOoO o00oOoO02 = o00oOoO2 != null ? o00oOoO2.o00oOoO0() : null;
        o00oOoO o00oOoOO2 = o00oOoOO(o0o00oo0.o00oOoo0());
        return (o00oOoOO2 == null || !(o00oOoO02 == null || o00oOoO02 == o00oOoO.o00oOOoO.NONE)) ? o00oOoO02 : o00oOoOO2.o00oOoO0();
    }

    @oo0oO0
    public ViewGroup o00oo00O() {
        return this.f3178o00oOOo0;
    }

    public final void o00oo0O() {
        Iterator<o00oOoO> it = this.f3179o00oOOoO.iterator();
        while (it.hasNext()) {
            o00oOoO next = it.next();
            if (next.o00oOoO0() == o00oOoO.o00oOOoO.ADDING) {
                next.o00oOoo0(o00oOoO.o00oOo00.from(next.o00oOo0o().requireView().getVisibility()), o00oOoO.o00oOOoO.NONE);
            }
        }
    }

    public void o00oo0O0() {
        synchronized (this.f3179o00oOOoO) {
            o00oo0O();
            this.f3181o00oOo0O = false;
            int size = this.f3179o00oOOoO.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                o00oOoO o00oooo2 = this.f3179o00oOOoO.get(size);
                o00oOoO.o00oOo00 from = o00oOoO.o00oOo00.from(o00oooo2.o00oOo0o().mView);
                o00oOoO.o00oOo00 o00oOo0O2 = o00oooo2.o00oOo0O();
                o00oOoO.o00oOo00 o00ooo002 = o00oOoO.o00oOo00.VISIBLE;
                if (o00oOo0O2 == o00ooo002 && from != o00ooo002) {
                    this.f3181o00oOo0O = o00oooo2.o00oOo0o().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    public void o00oo0Oo(boolean z) {
        this.f3182o00oOooO = z;
    }
}
