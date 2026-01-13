package o0O00OOO;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;
import o00oOooO.o0O0OO0;
import o00oOooO.o0OO0oO;
import o0O000oo.o0O0o00O;
import o0O00OOO.o00oOOo0;
import o0O00OOO.o00oOOoO;
/* loaded from: classes.dex */
public abstract class o00oOOoO<T extends o00oOOoO<T>> implements o00oOOo0.o00oOOoO {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final float f10938o00ooO = 0.1f;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final float f10942o00ooO0o = 1.0f;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final float f10943o00ooOO = 0.002f;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final float f10944o00ooOO0 = 0.00390625f;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final float f10945o00ooOOo = Float.MAX_VALUE;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final float f10946o00ooOo0 = 0.75f;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public float f10948o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public float f10949o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f10950o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o0O00OOO.o00oOo0O f10951o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f10952o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public float f10953o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public float f10954o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public long f10955o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public float f10956o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public final ArrayList<o0O0000O> f10957o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Object f10958o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public final ArrayList<o0O000> f10959o00oOooo;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final o0O000O f10930o00oo00O = new o00oo0(o00ooO00.o00oo0.f8125o00oo0o);

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final o0O000O f10929o00oo0 = new o00oo0OO(o00ooO00.o00oo0.f8127o00oo0oO);

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final o0O000O f10933o00oo0OO = new o00oo0O0(o00ooO00.o00oo0.f8129o0O0o);

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final o0O000O f10932o00oo0O0 = new o00oo0O(o00ooO00.o00oo0.f8123o00oo0OO);

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final o0O000O f10931o00oo0O = new o0O0o(o00ooO00.o00oo0.f8122o00oo0O0);

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final o0O000O f10934o00oo0Oo = new o00oo(o00ooO00.o00oo0.f8114o00oOoOO);

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final o0O000O f10936o00oo0o0 = new o00ooO0(o00ooO00.o00oo0.f8115o00oOoOo);

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final o0O000O f10935o00oo0o = new o00ooO(o00ooO00.o00oo0.f8116o00oOoo0);

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final o0O000O f10937o00oo0oO = new o0("x");

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final o0O000O f10947o0O0o = new o00oOOo0("y");

    /* renamed from: o00oo  reason: collision with root package name */
    public static final o0O000O f10928o00oo = new C0142o00oOOoO("z");

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final o0O000O f10940o00ooO00 = new o00oOo00(o00ooO00.o00oo0.f8113o00oOoO0);

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final o0O000O f10939o00ooO0 = new o00oOo0O("scrollX");

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final o0O000O f10941o00ooO0O = new o00oOoO("scrollY");

    /* loaded from: classes.dex */
    public static class o0 extends o0O000O {
        public o0(String str) {
            super(str, null);
        }

        @Override // o0O00OOO.o00oOo0O
        public float getValue(View view) {
            return view.getX();
        }

        public float o00oOOo0(View view) {
            return view.getX();
        }

        public void o00oOOoO(View view, float f) {
            view.setX(f);
        }

        @Override // o0O00OOO.o00oOo0O
        public void setValue(View view, float f) {
            view.setX(f);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o0O000O {
        public o00oOOo0(String str) {
            super(str, null);
        }

        @Override // o0O00OOO.o00oOo0O
        public float getValue(View view) {
            return view.getY();
        }

        public float o00oOOo0(View view) {
            return view.getY();
        }

        public void o00oOOoO(View view, float f) {
            view.setY(f);
        }

        @Override // o0O00OOO.o00oOo0O
        public void setValue(View view, float f) {
            view.setY(f);
        }
    }

    /* renamed from: o0O00OOO.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0142o00oOOoO extends o0O000O {
        public C0142o00oOOoO(String str) {
            super(str, null);
        }

        @Override // o0O00OOO.o00oOo0O
        public float getValue(View view) {
            return o0O0o00O.o0ooO(view);
        }

        public float o00oOOo0(View view) {
            return o0O0o00O.o0ooO(view);
        }

        public void o00oOOoO(View view, float f) {
            o0O0o00O.o0OOOOoO(view, f);
        }

        @Override // o0O00OOO.o00oOo0O
        public void setValue(View view, float f) {
            o0O0o00O.o0OOOOoO(view, f);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 extends o0O000O {
        public o00oOo00(String str) {
            super(str, null);
        }

        @Override // o0O00OOO.o00oOo0O
        public float getValue(View view) {
            return view.getAlpha();
        }

        public float o00oOOo0(View view) {
            return view.getAlpha();
        }

        public void o00oOOoO(View view, float f) {
            view.setAlpha(f);
        }

        @Override // o0O00OOO.o00oOo0O
        public void setValue(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O extends o0O000O {
        public o00oOo0O(String str) {
            super(str, null);
        }

        @Override // o0O00OOO.o00oOo0O
        public float getValue(View view) {
            return view.getScrollX();
        }

        public float o00oOOo0(View view) {
            return view.getScrollX();
        }

        public void o00oOOoO(View view, float f) {
            view.setScrollX((int) f);
        }

        @Override // o0O00OOO.o00oOo0O
        public void setValue(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO extends o0O000O {
        public o00oOoO(String str) {
            super(str, null);
        }

        @Override // o0O00OOO.o00oOo0O
        public float getValue(View view) {
            return view.getScrollY();
        }

        public float o00oOOo0(View view) {
            return view.getScrollY();
        }

        public void o00oOOoO(View view, float f) {
            view.setScrollY((int) f);
        }

        @Override // o0O00OOO.o00oOo0O
        public void setValue(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo extends o0O000O {
        public o00oo(String str) {
            super(str, null);
        }

        @Override // o0O00OOO.o00oOo0O
        public float getValue(View view) {
            return view.getRotation();
        }

        public float o00oOOo0(View view) {
            return view.getRotation();
        }

        public void o00oOOoO(View view, float f) {
            view.setRotation(f);
        }

        @Override // o0O00OOO.o00oOo0O
        public void setValue(View view, float f) {
            view.setRotation(f);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0 extends o0O000O {
        public o00oo0(String str) {
            super(str, null);
        }

        @Override // o0O00OOO.o00oOo0O
        public float getValue(View view) {
            return view.getTranslationX();
        }

        public float o00oOOo0(View view) {
            return view.getTranslationX();
        }

        public void o00oOOoO(View view, float f) {
            view.setTranslationX(f);
        }

        @Override // o0O00OOO.o00oOo0O
        public void setValue(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O extends o0O00OOO.o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0O00OOO.o00oOoO f10960o00oOOo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo00O(String str, o0O00OOO.o00oOoO o00oooo2) {
            super(str);
            this.f10960o00oOOo0 = o00oooo2;
        }

        @Override // o0O00OOO.o00oOo0O
        public float getValue(Object obj) {
            return this.f10960o00oOOo0.f10971o00oOOo0;
        }

        @Override // o0O00OOO.o00oOo0O
        public void setValue(Object obj, float f) {
            this.f10960o00oOOo0.f10971o00oOOo0 = f;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O extends o0O000O {
        public o00oo0O(String str) {
            super(str, null);
        }

        @Override // o0O00OOO.o00oOo0O
        public float getValue(View view) {
            return view.getScaleX();
        }

        public float o00oOOo0(View view) {
            return view.getScaleX();
        }

        public void o00oOOoO(View view, float f) {
            view.setScaleX(f);
        }

        @Override // o0O00OOO.o00oOo0O
        public void setValue(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O0 extends o0O000O {
        public o00oo0O0(String str) {
            super(str, null);
        }

        @Override // o0O00OOO.o00oOo0O
        public float getValue(View view) {
            return o0O0o00O.o0O0O0Oo(view);
        }

        public float o00oOOo0(View view) {
            return o0O0o00O.o0O0O0Oo(view);
        }

        public void o00oOOoO(View view, float f) {
            o0O0o00O.o0OOO0OO(view, f);
        }

        @Override // o0O00OOO.o00oOo0O
        public void setValue(View view, float f) {
            o0O0o00O.o0OOO0OO(view, f);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0OO extends o0O000O {
        public o00oo0OO(String str) {
            super(str, null);
        }

        @Override // o0O00OOO.o00oOo0O
        public float getValue(View view) {
            return view.getTranslationY();
        }

        public float o00oOOo0(View view) {
            return view.getTranslationY();
        }

        public void o00oOOoO(View view, float f) {
            view.setTranslationY(f);
        }

        @Override // o0O00OOO.o00oOo0O
        public void setValue(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* loaded from: classes.dex */
    public static class o00ooO extends o0O000O {
        public o00ooO(String str) {
            super(str, null);
        }

        @Override // o0O00OOO.o00oOo0O
        public float getValue(View view) {
            return view.getRotationY();
        }

        public float o00oOOo0(View view) {
            return view.getRotationY();
        }

        public void o00oOOoO(View view, float f) {
            view.setRotationY(f);
        }

        @Override // o0O00OOO.o00oOo0O
        public void setValue(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* loaded from: classes.dex */
    public static class o00ooO0 extends o0O000O {
        public o00ooO0(String str) {
            super(str, null);
        }

        @Override // o0O00OOO.o00oOo0O
        public float getValue(View view) {
            return view.getRotationX();
        }

        public float o00oOOo0(View view) {
            return view.getRotationX();
        }

        public void o00oOOoO(View view, float f) {
            view.setRotationX(f);
        }

        @Override // o0O00OOO.o00oOo0O
        public void setValue(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* loaded from: classes.dex */
    public interface o0O000 {
        void o00oOOo0(o00oOOoO o00ooooo2, float f, float f2);
    }

    /* loaded from: classes.dex */
    public static class o0O00000 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public float f10962o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public float f10963o00oOOoO;
    }

    /* loaded from: classes.dex */
    public interface o0O0000O {
        void o00oOOo0(o00oOOoO o00ooooo2, boolean z, float f, float f2);
    }

    /* loaded from: classes.dex */
    public static abstract class o0O000O extends o0O00OOO.o00oOo0O<View> {
        public o0O000O(String str) {
            super(str);
        }

        public o0O000O(String str, o00oo0 o00oo0Var) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static class o0O0o extends o0O000O {
        public o0O0o(String str) {
            super(str, null);
        }

        @Override // o0O00OOO.o00oOo0O
        public float getValue(View view) {
            return view.getScaleY();
        }

        public float o00oOOo0(View view) {
            return view.getScaleY();
        }

        public void o00oOOoO(View view, float f) {
            view.setScaleY(f);
        }

        @Override // o0O00OOO.o00oOo0O
        public void setValue(View view, float f) {
            view.setScaleY(f);
        }
    }

    public <K> o00oOOoO(K k, o0O00OOO.o00oOo0O<K> o00ooo0o2) {
        float f;
        this.f10948o00oOOo0 = 0.0f;
        this.f10949o00oOOoO = Float.MAX_VALUE;
        this.f10950o00oOo00 = false;
        this.f10952o00oOo0o = false;
        this.f10954o00oOoO0 = Float.MAX_VALUE;
        this.f10953o00oOoO = -Float.MAX_VALUE;
        this.f10955o00oOoOO = 0L;
        this.f10957o00oOoo0 = new ArrayList<>();
        this.f10959o00oOooo = new ArrayList<>();
        this.f10958o00oOooO = k;
        this.f10951o00oOo0O = o00ooo0o2;
        if (o00ooo0o2 == f10934o00oo0Oo || o00ooo0o2 == f10936o00oo0o0 || o00ooo0o2 == f10935o00oo0o) {
            f = 0.1f;
        } else if (o00ooo0o2 == f10940o00ooO00 || o00ooo0o2 == f10932o00oo0O0 || o00ooo0o2 == f10931o00oo0O) {
            this.f10956o00oOoOo = 0.00390625f;
            return;
        } else {
            f = 1.0f;
        }
        this.f10956o00oOoOo = f;
    }

    public o00oOOoO(o0O00OOO.o00oOoO o00oooo2) {
        this.f10948o00oOOo0 = 0.0f;
        this.f10949o00oOOoO = Float.MAX_VALUE;
        this.f10950o00oOo00 = false;
        this.f10952o00oOo0o = false;
        this.f10954o00oOoO0 = Float.MAX_VALUE;
        this.f10953o00oOoO = -Float.MAX_VALUE;
        this.f10955o00oOoOO = 0L;
        this.f10957o00oOoo0 = new ArrayList<>();
        this.f10959o00oOooo = new ArrayList<>();
        this.f10958o00oOooO = null;
        this.f10951o00oOo0O = new o00oo00O("FloatValueHolder", o00oooo2);
        this.f10956o00oOoOo = 1.0f;
    }

    public static <T> void o00oo0(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public static <T> void o00oo00O(ArrayList<T> arrayList, T t) {
        int indexOf = arrayList.indexOf(t);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    @Override // o0O00OOO.o00oOOo0.o00oOOoO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public boolean o00oOOo0(long j) {
        long j2 = this.f10955o00oOoOO;
        if (j2 == 0) {
            this.f10955o00oOoOO = j;
            o00oo0o0(this.f10949o00oOOoO);
            return false;
        }
        this.f10955o00oOoOO = j;
        boolean o00ooO02 = o00ooO0(j - j2);
        float min = Math.min(this.f10949o00oOOoO, this.f10954o00oOoO0);
        this.f10949o00oOOoO = min;
        float max = Math.max(min, this.f10953o00oOoO);
        this.f10949o00oOOoO = max;
        o00oo0o0(max);
        if (o00ooO02) {
            o00oOo0O(false);
        }
        return o00ooO02;
    }

    public T o00oOOoO(o0O0000O o0o0000o) {
        if (!this.f10957o00oOoo0.contains(o0o0000o)) {
            this.f10957o00oOoo0.add(o0o0000o);
        }
        return this;
    }

    public T o00oOo00(o0O000 o0o000) {
        if (o00oOoo0()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f10959o00oOooo.contains(o0o000)) {
            this.f10959o00oOooo.add(o0o000);
        }
        return this;
    }

    public final void o00oOo0O(boolean z) {
        this.f10952o00oOo0o = false;
        o0O00OOO.o00oOOo0.o00oOo0O().o00oOoO(this);
        this.f10955o00oOoOO = 0L;
        this.f10950o00oOo00 = false;
        for (int i = 0; i < this.f10957o00oOoo0.size(); i++) {
            if (this.f10957o00oOoo0.get(i) != null) {
                this.f10957o00oOoo0.get(i).o00oOOo0(this, z, this.f10949o00oOOoO, this.f10948o00oOOo0);
            }
        }
        o00oo0(this.f10957o00oOoo0);
    }

    public abstract float o00oOo0o(float f, float f2);

    public final float o00oOoO() {
        return this.f10951o00oOo0O.getValue(this.f10958o00oOooO);
    }

    public float o00oOoO0() {
        return this.f10956o00oOoOo;
    }

    public float o00oOoOO() {
        return this.f10956o00oOoOo * 0.75f;
    }

    public abstract boolean o00oOoOo(float f, float f2);

    public boolean o00oOoo0() {
        return this.f10952o00oOo0o;
    }

    public void o00oOooO() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f10952o00oOo0o) {
            o00oOo0O(true);
        }
    }

    public void o00oOooo(o0O0000O o0o0000o) {
        o00oo00O(this.f10957o00oOoo0, o0o0000o);
    }

    public void o00oo() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f10952o00oOo0o) {
            return;
        }
        o00ooO00();
    }

    public T o00oo0O(float f) {
        this.f10953o00oOoO = f;
        return this;
    }

    public T o00oo0O0(float f) {
        this.f10954o00oOoO0 = f;
        return this;
    }

    public void o00oo0OO(o0O000 o0o000) {
        o00oo00O(this.f10959o00oOooo, o0o000);
    }

    public T o00oo0Oo(@o0O0OO0(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f10956o00oOoOo = f;
            o0O0o(f * 0.75f);
            return this;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public T o00oo0o(float f) {
        this.f10949o00oOOoO = f;
        this.f10950o00oOo00 = true;
        return this;
    }

    public void o00oo0o0(float f) {
        this.f10951o00oOo0O.setValue(this.f10958o00oOooO, f);
        for (int i = 0; i < this.f10959o00oOooo.size(); i++) {
            if (this.f10959o00oOooo.get(i) != null) {
                this.f10959o00oOooo.get(i).o00oOOo0(this, this.f10949o00oOOoO, this.f10948o00oOOo0);
            }
        }
        o00oo0(this.f10959o00oOooo);
    }

    public T o00oo0oO(float f) {
        this.f10948o00oOOo0 = f;
        return this;
    }

    public abstract boolean o00ooO0(long j);

    public final void o00ooO00() {
        if (this.f10952o00oOo0o) {
            return;
        }
        this.f10952o00oOo0o = true;
        if (!this.f10950o00oOo00) {
            this.f10949o00oOOoO = o00oOoO();
        }
        float f = this.f10949o00oOOoO;
        if (f > this.f10954o00oOoO0 || f < this.f10953o00oOoO) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        o0O00OOO.o00oOOo0.o00oOo0O().o00oOOo0(this, 0L);
    }

    public abstract void o0O0o(float f);
}
