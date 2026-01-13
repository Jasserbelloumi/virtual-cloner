package o00ooO00;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o00ooO00.o0O000Oo;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class o0O00 {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f8262o00oo = 0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f8263o00oo0oO = "MotionScene";

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f8264o00ooO = 0;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f8265o00ooO0 = -1;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f8266o00ooO00 = 1;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f8267o00ooO0O = -2;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f8268o00ooO0o = -1;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f8269o00ooOO = 0;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f8270o00ooOO0 = 1;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f8271o00ooOOo = 1;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f8272o00ooOo = 3;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f8273o00ooOo0 = 2;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f8274o00ooOoO = 4;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final int f8275o00ooOoo = 5;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final boolean f8276o0O0o = false;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O000Oo f8277o00oOOo0;

    /* renamed from: o00oo0  reason: collision with root package name */
    public MotionEvent f8289o00oo0;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o0O000Oo.o00oo00O f8291o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f8294o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public float f8295o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public float f8296o00oo0o0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public androidx.constraintlayout.widget.o00oo0O0 f8278o00oOOoO = null;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oOOoO f8279o00oOo00 = null;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f8287o00oOooO = false;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public ArrayList<o00oOOoO> f8280o00oOo0O = new ArrayList<>();

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public o00oOOoO f8281o00oOo0o = null;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public ArrayList<o00oOOoO> f8283o00oOoO0 = new ArrayList<>();

    /* renamed from: o00oOoO  reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.o00oOoO> f8282o00oOoO = new SparseArray<>();

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public HashMap<String, Integer> f8284o00oOoOO = new HashMap<>();

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public SparseIntArray f8285o00oOoOo = new SparseIntArray();

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public boolean f8286o00oOoo0 = false;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f8288o00oOooo = 400;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public int f8290o00oo00O = 0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public boolean f8293o00oo0OO = false;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public boolean f8292o00oo0O0 = false;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Interpolator {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o00oo.o00oOo00 f8297o00oOOo0;

        public o00oOOo0(o00oo.o00oOo00 o00ooo002) {
            this.f8297o00oOOo0 = o00ooo002;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f8297o00oOOo0.o00oOOo0(f);
        }
    }

    public o0O00(Context context, o0O000Oo o0o000oo, int i) {
        this.f8277o00oOOo0 = o0o000oo;
        o00ooo0(context, i);
        SparseArray<androidx.constraintlayout.widget.o00oOoO> sparseArray = this.f8282o00oOoO;
        int i2 = R.id.motion_base;
        sparseArray.put(i2, new androidx.constraintlayout.widget.o00oOoO());
        this.f8284o00oOoOO.put("motion_base", Integer.valueOf(i2));
    }

    public o0O00(o0O000Oo o0o000oo) {
        this.f8277o00oOOo0 = o0o000oo;
    }

    public static String o0O000o0(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        return indexOf < 0 ? str : str.substring(indexOf + 1);
    }

    public void o0(o0O000Oo o0o000oo) {
        for (int i = 0; i < this.f8282o00oOoO.size(); i++) {
            int keyAt = this.f8282o00oOoO.keyAt(i);
            if (o00ooOoO(keyAt)) {
                return;
            }
            o00ooooo(keyAt);
        }
        for (int i2 = 0; i2 < this.f8282o00oOoO.size(); i2++) {
            this.f8282o00oOoO.valueAt(i2).o0O00o(o0o000oo);
        }
    }

    public void o00oOo0O(o0O000Oo o0o000oo, int i) {
        Iterator<o00oOOoO> it = this.f8280o00oOo0O.iterator();
        while (it.hasNext()) {
            o00oOOoO next = it.next();
            if (next.f8318o00oo00O.size() > 0) {
                Iterator<o00oOOoO.o00oOOo0> it2 = next.f8318o00oo00O.iterator();
                while (it2.hasNext()) {
                    it2.next().o00oOo00(o0o000oo);
                }
            }
        }
        Iterator<o00oOOoO> it3 = this.f8283o00oOoO0.iterator();
        while (it3.hasNext()) {
            o00oOOoO next2 = it3.next();
            if (next2.f8318o00oo00O.size() > 0) {
                Iterator<o00oOOoO.o00oOOo0> it4 = next2.f8318o00oo00O.iterator();
                while (it4.hasNext()) {
                    it4.next().o00oOo00(o0o000oo);
                }
            }
        }
        Iterator<o00oOOoO> it5 = this.f8280o00oOo0O.iterator();
        while (it5.hasNext()) {
            o00oOOoO next3 = it5.next();
            if (next3.f8318o00oo00O.size() > 0) {
                Iterator<o00oOOoO.o00oOOo0> it6 = next3.f8318o00oo00O.iterator();
                while (it6.hasNext()) {
                    it6.next().o00oOOo0(o0o000oo, i, next3);
                }
            }
        }
        Iterator<o00oOOoO> it7 = this.f8283o00oOoO0.iterator();
        while (it7.hasNext()) {
            o00oOOoO next4 = it7.next();
            if (next4.f8318o00oo00O.size() > 0) {
                Iterator<o00oOOoO.o00oOOo0> it8 = next4.f8318o00oo00O.iterator();
                while (it8.hasNext()) {
                    it8.next().o00oOOo0(o0o000oo, i, next4);
                }
            }
        }
    }

    public void o00oOo0o(o00oOOoO o00ooooo2) {
        int o00oo0o02 = o00oo0o0(o00ooooo2);
        if (o00oo0o02 == -1) {
            this.f8280o00oOo0O.add(o00ooooo2);
        } else {
            this.f8280o00oOo0O.set(o00oo0o02, o00ooooo2);
        }
    }

    public o00oOOoO o00oOoO(int i, float f, float f2, MotionEvent motionEvent) {
        o0O00O o0o00o;
        if (i != -1) {
            List<o00oOOoO> o00ooOo2 = o00ooOo(i);
            float f3 = 0.0f;
            o00oOOoO o00ooooo2 = null;
            RectF rectF = new RectF();
            for (o00oOOoO o00ooooo3 : o00ooOo2) {
                if (!o00ooooo3.f8321o00oo0OO && (o0o00o = o00ooooo3.f8316o00oOooo) != null) {
                    o0o00o.o00oo0oO(this.f8294o00oo0Oo);
                    RectF o00oOooo2 = o00ooooo3.f8316o00oOooo.o00oOooo(this.f8277o00oOOo0, rectF);
                    if (o00oOooo2 == null || motionEvent == null || o00oOooo2.contains(motionEvent.getX(), motionEvent.getY())) {
                        RectF o00oOooo3 = o00ooooo3.f8316o00oOooo.o00oOooo(this.f8277o00oOOo0, rectF);
                        if (o00oOooo3 == null || motionEvent == null || o00oOooo3.contains(motionEvent.getX(), motionEvent.getY())) {
                            float o00oOOo02 = o00ooooo3.f8316o00oOooo.o00oOOo0(f, f2) * (o00ooooo3.f8307o00oOo00 == i ? -1.0f : 1.1f);
                            if (o00oOOo02 > f3) {
                                o00ooooo2 = o00ooooo3;
                                f3 = o00oOOo02;
                            }
                        }
                    }
                }
            }
            return o00ooooo2;
        }
        return this.f8279o00oOo00;
    }

    public boolean o00oOoO0(o0O000Oo o0o000oo, int i) {
        if (o00ooo00() || this.f8287o00oOooO) {
            return false;
        }
        Iterator<o00oOOoO> it = this.f8280o00oOo0O.iterator();
        while (it.hasNext()) {
            o00oOOoO next = it.next();
            int i2 = next.f8317o00oo0;
            if (i2 != 0 && this.f8279o00oOo00 != next) {
                if (i == next.f8315o00oOooO && (i2 == 4 || i2 == 2)) {
                    o0O000Oo.o00oo0O o00oo0o2 = o0O000Oo.o00oo0O.FINISHED;
                    o0o000oo.setState(o00oo0o2);
                    o0o000oo.setTransition(next);
                    if (next.f8317o00oo0 == 4) {
                        o0o000oo.o0O000o();
                        o0o000oo.setState(o0O000Oo.o00oo0O.SETUP);
                        o0o000oo.setState(o0O000Oo.o00oo0O.MOVING);
                    } else {
                        o0o000oo.setProgress(1.0f);
                        o0o000oo.o00ooOOo(true);
                        o0o000oo.setState(o0O000Oo.o00oo0O.SETUP);
                        o0o000oo.setState(o0O000Oo.o00oo0O.MOVING);
                        o0o000oo.setState(o00oo0o2);
                        o0o000oo.o0O00000();
                    }
                    return true;
                } else if (i == next.f8307o00oOo00 && (i2 == 3 || i2 == 1)) {
                    o0O000Oo.o00oo0O o00oo0o3 = o0O000Oo.o00oo0O.FINISHED;
                    o0o000oo.setState(o00oo0o3);
                    o0o000oo.setTransition(next);
                    if (next.f8317o00oo0 == 3) {
                        o0o000oo.o0ooOoOO();
                        o0o000oo.setState(o0O000Oo.o00oo0O.SETUP);
                        o0o000oo.setState(o0O000Oo.o00oo0O.MOVING);
                    } else {
                        o0o000oo.setProgress(0.0f);
                        o0o000oo.o00ooOOo(true);
                        o0o000oo.setState(o0O000Oo.o00oo0O.SETUP);
                        o0o000oo.setState(o0O000Oo.o00oo0O.MOVING);
                        o0o000oo.setState(o00oo0o3);
                        o0o000oo.o0O00000();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void o00oOoOO(boolean z) {
        this.f8287o00oOooO = z;
    }

    public int o00oOoOo() {
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 != null) {
            return o00ooooo2.f8320o00oo0O0;
        }
        return -1;
    }

    public androidx.constraintlayout.widget.o00oOoO o00oOoo0(int i) {
        return o00oOooo(i, -1, -1);
    }

    public androidx.constraintlayout.widget.o00oOoO o00oOooo(int i, int i2, int i3) {
        androidx.constraintlayout.widget.o00oOoO o00oooo2;
        int o00oOo0O2;
        if (this.f8286o00oOoo0) {
            PrintStream printStream = System.out;
            printStream.println("id " + i);
            PrintStream printStream2 = System.out;
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("size ");
            o00oOOo02.append(this.f8282o00oOoO.size());
            printStream2.println(o00oOOo02.toString());
        }
        androidx.constraintlayout.widget.o00oo0O0 o00oo0o02 = this.f8278o00oOOoO;
        if (o00oo0o02 != null && (o00oOo0O2 = o00oo0o02.o00oOo0O(i, i2, i3)) != -1) {
            i = o00oOo0O2;
        }
        if (this.f8282o00oOoO.get(i) == null) {
            o00oOoO.o00oOoOO(this.f8277o00oOOo0.getContext(), i);
            SparseArray<androidx.constraintlayout.widget.o00oOoO> sparseArray = this.f8282o00oOoO;
            o00oooo2 = sparseArray.get(sparseArray.keyAt(0));
        } else {
            o00oooo2 = this.f8282o00oOoO.get(i);
        }
        return o00oooo2;
    }

    public float o00oo() {
        o0O00O o0o00o;
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 == null || (o0o00o = o00ooooo2.f8316o00oOooo) == null) {
            return 0.0f;
        }
        return o0o00o.o00oOoO();
    }

    public int[] o00oo0() {
        int size = this.f8282o00oOoO.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.f8282o00oOoO.keyAt(i);
        }
        return iArr;
    }

    public androidx.constraintlayout.widget.o00oOoO o00oo00O(Context context, String str) {
        if (this.f8286o00oOoo0) {
            PrintStream printStream = System.out;
            printStream.println("id " + str);
            PrintStream printStream2 = System.out;
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("size ");
            o00oOOo02.append(this.f8282o00oOoO.size());
            printStream2.println(o00oOOo02.toString());
        }
        for (int i = 0; i < this.f8282o00oOoO.size(); i++) {
            int keyAt = this.f8282o00oOoO.keyAt(i);
            String resourceName = context.getResources().getResourceName(keyAt);
            if (this.f8286o00oOoo0) {
                PrintStream printStream3 = System.out;
                printStream3.println("Id for <" + i + "> is <" + resourceName + "> looking for <" + str + ">");
            }
            if (str.equals(resourceName)) {
                return this.f8282o00oOoO.get(keyAt);
            }
        }
        return null;
    }

    public int o00oo0O() {
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 == null) {
            return -1;
        }
        return o00ooooo2.f8307o00oOo00;
    }

    public int o00oo0O0() {
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        return o00ooooo2 != null ? o00ooooo2.f8310o00oOoO : this.f8288o00oOooo;
    }

    public ArrayList<o00oOOoO> o00oo0OO() {
        return this.f8280o00oOo0O;
    }

    public final int o00oo0Oo(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f8286o00oOoo0) {
                System.out.println("id getMap res = " + i);
            }
        } else {
            i = -1;
        }
        return (i != -1 || str.length() <= 1) ? i : Integer.parseInt(str.substring(1));
    }

    public Interpolator o00oo0o() {
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        int i = o00ooooo2.f8308o00oOo0O;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 5) {
                                    return null;
                                }
                                return new BounceInterpolator();
                            }
                            return new AnticipateInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new o00oOOo0(o00oo.o00oOo00.o00oOo00(o00ooooo2.f8309o00oOo0o));
        }
        return AnimationUtils.loadInterpolator(this.f8277o00oOOo0.getContext(), this.f8279o00oOo00.f8311o00oOoO0);
    }

    public final int o00oo0o0(o00oOOoO o00ooooo2) {
        int i = o00ooooo2.f8305o00oOOo0;
        if (i != -1) {
            for (int i2 = 0; i2 < this.f8280o00oOo0O.size(); i2++) {
                if (this.f8280o00oOo0O.get(i2).f8305o00oOOo0 == i) {
                    return i2;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("The transition must have an id");
    }

    public o00oo0 o00oo0oO(Context context, int i, int i2, int i3) {
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 == null) {
            return null;
        }
        Iterator<o00oo> it = o00ooooo2.f8314o00oOoo0.iterator();
        while (it.hasNext()) {
            o00oo next = it.next();
            for (Integer num : next.o00oOooO()) {
                if (i2 == num.intValue()) {
                    Iterator<o00oo0> it2 = next.o00oOo00(num.intValue()).iterator();
                    while (it2.hasNext()) {
                        o00oo0 next2 = it2.next();
                        if (next2.f8130o00oOOo0 == i3 && next2.f8134o00oOooO == i) {
                            return next2;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public final int o00ooO(int i) {
        int o00oOo0O2;
        androidx.constraintlayout.widget.o00oo0O0 o00oo0o02 = this.f8278o00oOOoO;
        return (o00oo0o02 == null || (o00oOo0O2 = o00oo0o02.o00oOo0O(i, -1, -1)) == -1) ? i : o00oOo0O2;
    }

    public boolean o00ooO0() {
        o0O00O o0o00o;
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 == null || (o0o00o = o00ooooo2.f8316o00oOooo) == null) {
            return false;
        }
        return o0o00o.o00oOoOo();
    }

    public float o00ooO00() {
        o0O00O o0o00o;
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 == null || (o0o00o = o00ooooo2.f8316o00oOooo) == null) {
            return 0.0f;
        }
        return o0o00o.o00oOoOO();
    }

    public float o00ooO0O(View view, int i) {
        return 0.0f;
    }

    public float o00ooO0o(float f, float f2) {
        o0O00O o0o00o;
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 == null || (o0o00o = o00ooooo2.f8316o00oOooo) == null) {
            return 0.0f;
        }
        return o0o00o.o00oOoo0(f, f2);
    }

    public int o00ooOO() {
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 == null) {
            return -1;
        }
        return o00ooooo2.f8315o00oOooO;
    }

    public float o00ooOO0() {
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 != null) {
            return o00ooooo2.f8312o00oOoOO;
        }
        return 0.0f;
    }

    public o00oOOoO o00ooOOo(int i) {
        Iterator<o00oOOoO> it = this.f8280o00oOo0O.iterator();
        while (it.hasNext()) {
            o00oOOoO next = it.next();
            if (next.f8305o00oOOo0 == i) {
                return next;
            }
        }
        return null;
    }

    public List<o00oOOoO> o00ooOo(int i) {
        int o00ooO2 = o00ooO(i);
        ArrayList arrayList = new ArrayList();
        Iterator<o00oOOoO> it = this.f8280o00oOo0O.iterator();
        while (it.hasNext()) {
            o00oOOoO next = it.next();
            if (next.f8315o00oOooO == o00ooO2 || next.f8307o00oOo00 == o00ooO2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public int o00ooOo0(int i) {
        Iterator<o00oOOoO> it = this.f8280o00oOo0O.iterator();
        while (it.hasNext()) {
            if (it.next().f8315o00oOooO == i) {
                return 0;
            }
        }
        return 1;
    }

    public final boolean o00ooOoO(int i) {
        int i2 = this.f8285o00oOoOo.get(i);
        int size = this.f8285o00oOoOo.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.f8285o00oOoOo.get(i2);
            size = i3;
        }
        return false;
    }

    public boolean o00ooOoo(View view, int i) {
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 == null) {
            return false;
        }
        Iterator<o00oo> it = o00ooooo2.f8314o00oOoo0.iterator();
        while (it.hasNext()) {
            Iterator<o00oo0> it2 = it.next().o00oOo00(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f8130o00oOOo0 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void o00ooo0(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        o00oOOoO o00ooooo2 = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                char c = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    if (this.f8286o00oOoo0) {
                        System.out.println("parsing = " + name);
                    }
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals(androidx.constraintlayout.widget.o00oOoO.f1975o00oOo0O)) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                break;
                            }
                            c = 65535;
                            break;
                        case 312750793:
                            if (name.equals("OnClick")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 793277014:
                            if (name.equals(f8263o00oo0oO)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            o00oooOo(context, xml);
                            continue;
                        case 1:
                            ArrayList<o00oOOoO> arrayList = this.f8280o00oOo0O;
                            o00oOOoO o00ooooo3 = new o00oOOoO(this, context, xml);
                            arrayList.add(o00ooooo3);
                            if (this.f8279o00oOo00 == null && !o00ooooo3.f8306o00oOOoO) {
                                this.f8279o00oOo00 = o00ooooo3;
                                o0O00O o0o00o = o00ooooo3.f8316o00oOooo;
                                if (o0o00o != null) {
                                    o0o00o.o00oo0oO(this.f8294o00oo0Oo);
                                }
                            }
                            if (o00ooooo3.f8306o00oOOoO) {
                                if (o00ooooo3.f8307o00oOo00 == -1) {
                                    this.f8281o00oOo0o = o00ooooo3;
                                } else {
                                    this.f8283o00oOoO0.add(o00ooooo3);
                                }
                                this.f8280o00oOo0O.remove(o00ooooo3);
                            }
                            o00ooooo2 = o00ooooo3;
                            continue;
                        case 2:
                            if (o00ooooo2 == null) {
                                context.getResources().getResourceEntryName(i);
                                xml.getLineNumber();
                            }
                            o00ooooo2.f8316o00oOooo = new o0O00O(context, this.f8277o00oOOo0, xml);
                            continue;
                        case 3:
                            o00ooooo2.o00oo0o(context, xml);
                            continue;
                        case 4:
                            this.f8278o00oOOoO = new androidx.constraintlayout.widget.o00oo0O0(context, xml);
                            continue;
                        case 5:
                            o00oooOO(context, xml);
                            continue;
                        case 6:
                            o00ooooo2.f8314o00oOoo0.add(new o00oo(context, xml));
                            continue;
                        default:
                            continue;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final boolean o00ooo00() {
        return this.f8291o00oo0O != null;
    }

    public int o00ooo0O(String str) {
        return this.f8284o00oOoOO.get(str).intValue();
    }

    public String o00ooo0o(int i) {
        for (Map.Entry<String, Integer> entry : this.f8284o00oOoOO.entrySet()) {
            if (entry.getValue().intValue() == i) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void o00oooO(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void o00oooOO(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.o00oOoO o00oooo2 = new androidx.constraintlayout.widget.o00oOoO();
        o00oooo2.f2089o00oOo00 = false;
        int attributeCount = xmlPullParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            if (this.f8286o00oOoo0) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.getClass();
            if (attributeName.equals("deriveConstraintsFrom")) {
                i2 = o00oo0Oo(context, attributeValue);
            } else if (attributeName.equals("id")) {
                i = o00oo0Oo(context, attributeValue);
                this.f8284o00oOoOO.put(o0O000o0(attributeValue), Integer.valueOf(i));
            }
        }
        if (i != -1) {
            if (this.f8277o00oOOo0.f8487o00ooo0O != 0) {
                o00oooo2.f2087o00oOOo0 = true;
            }
            o00oooo2.o0O00Oo(context, xmlPullParser);
            if (i2 != -1) {
                this.f8285o00oOoOo.put(i, i2);
            }
            this.f8282o00oOoO.put(i, o00oooo2);
        }
    }

    public final void o00oooOo(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.MotionScene_defaultDuration) {
                this.f8288o00oOooo = obtainStyledAttributes.getInt(index, this.f8288o00oOooo);
            } else if (index == R.styleable.MotionScene_layoutDuringTransition) {
                this.f8290o00oo00O = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public void o00oooo(float f, float f2) {
        o0O00O o0o00o;
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 == null || (o0o00o = o00ooooo2.f8316o00oOooo) == null) {
            return;
        }
        o0o00o.o00oo0O0(f, f2);
    }

    public void o00oooo0(float f, float f2) {
        o0O00O o0o00o;
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 == null || (o0o00o = o00ooooo2.f8316o00oOooo) == null) {
            return;
        }
        o0o00o.o00oo0OO(f, f2);
    }

    public void o00ooooO(MotionEvent motionEvent, int i, o0O000Oo o0o000oo) {
        o0O000Oo.o00oo00O o00oo00o;
        o0O00O o0o00o;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f8291o00oo0O == null) {
            this.f8291o00oo0O = this.f8277o00oOOo0.o0();
        }
        this.f8291o00oo0O.o00oOOoO(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.f8296o00oo0o0 = motionEvent.getRawX();
                this.f8295o00oo0o = motionEvent.getRawY();
                this.f8289o00oo0 = motionEvent;
                this.f8293o00oo0OO = false;
                o0O00O o0o00o2 = this.f8279o00oOo00.f8316o00oOooo;
                if (o0o00o2 != null) {
                    RectF o00oOo0o2 = o0o00o2.o00oOo0o(this.f8277o00oOOo0, rectF);
                    if (o00oOo0o2 != null && !o00oOo0o2.contains(this.f8289o00oo0.getX(), this.f8289o00oo0.getY())) {
                        this.f8289o00oo0 = null;
                        this.f8293o00oo0OO = true;
                        return;
                    }
                    RectF o00oOooo2 = this.f8279o00oOo00.f8316o00oOooo.o00oOooo(this.f8277o00oOOo0, rectF);
                    if (o00oOooo2 == null || o00oOooo2.contains(this.f8289o00oo0.getX(), this.f8289o00oo0.getY())) {
                        this.f8292o00oo0O0 = false;
                    } else {
                        this.f8292o00oo0O0 = true;
                    }
                    this.f8279o00oOo00.f8316o00oOooo.o00oo0Oo(this.f8296o00oo0o0, this.f8295o00oo0o);
                    return;
                }
                return;
            } else if (action == 2 && !this.f8293o00oo0OO) {
                float rawY = motionEvent.getRawY() - this.f8295o00oo0o;
                float rawX = motionEvent.getRawX() - this.f8296o00oo0o0;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f8289o00oo0) == null) {
                    return;
                }
                o00oOOoO o00oOoO2 = o00oOoO(i, rawX, rawY, motionEvent2);
                if (o00oOoO2 != null) {
                    o0o000oo.setTransition(o00oOoO2);
                    RectF o00oOooo3 = this.f8279o00oOo00.f8316o00oOooo.o00oOooo(this.f8277o00oOOo0, rectF);
                    if (o00oOooo3 != null && !o00oOooo3.contains(this.f8289o00oo0.getX(), this.f8289o00oo0.getY())) {
                        z = true;
                    }
                    this.f8292o00oo0O0 = z;
                    this.f8279o00oOo00.f8316o00oOooo.o00oo(this.f8296o00oo0o0, this.f8295o00oo0o);
                }
            }
        }
        if (this.f8293o00oo0OO) {
            return;
        }
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 != null && (o0o00o = o00ooooo2.f8316o00oOooo) != null && !this.f8292o00oo0O0) {
            o0o00o.o00oo0(motionEvent, this.f8291o00oo0O, i, this);
        }
        this.f8296o00oo0o0 = motionEvent.getRawX();
        this.f8295o00oo0o = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (o00oo00o = this.f8291o00oo0O) == null) {
            return;
        }
        o00oo00o.o00oOoO0();
        this.f8291o00oo0O = null;
        int i2 = o0o000oo.f8470o00oo0o;
        if (i2 != -1) {
            o00oOoO0(o0o000oo, i2);
        }
    }

    public final void o00ooooo(int i) {
        int i2 = this.f8285o00oOoOo.get(i);
        if (i2 > 0) {
            o00ooooo(this.f8285o00oOoOo.get(i));
            androidx.constraintlayout.widget.o00oOoO o00oooo2 = this.f8282o00oOoO.get(i);
            androidx.constraintlayout.widget.o00oOoO o00oooo3 = this.f8282o00oOoO.get(i2);
            if (o00oooo3 == null) {
                o00oOoO.o00oOoOO(this.f8277o00oOOo0.getContext(), i2);
                return;
            }
            o00oooo2.o0O00oO0(o00oooo3);
            this.f8285o00oOoOo.put(i, -1);
        }
    }

    public void o0O000(View view, int i, String str, Object obj) {
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 == null) {
            return;
        }
        Iterator<o00oo> it = o00ooooo2.f8314o00oOoo0.iterator();
        while (it.hasNext()) {
            Iterator<o00oo0> it2 = it.next().o00oOo00(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f8130o00oOOo0 == i) {
                    if (obj != null) {
                        ((Float) obj).floatValue();
                    }
                    str.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    public void o0O00000(o00oOOoO o00ooooo2) {
        int o00oo0o02 = o00oo0o0(o00ooooo2);
        if (o00oo0o02 != -1) {
            this.f8280o00oOo0O.remove(o00oo0o02);
        }
    }

    public void o0O0000O(int i, androidx.constraintlayout.widget.o00oOoO o00oooo2) {
        this.f8282o00oOoO.put(i, o00oooo2);
    }

    public void o0O0000o(int i) {
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 != null) {
            o00ooooo2.o00ooo0O(i);
        } else {
            this.f8288o00oOooo = i;
        }
    }

    public void o0O000O(boolean z) {
        o0O00O o0o00o;
        this.f8294o00oo0Oo = z;
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 == null || (o0o00o = o00ooooo2.f8316o00oOooo) == null) {
            return;
        }
        o0o00o.o00oo0oO(z);
    }

    public void o0O000Oo(o00oOOoO o00ooooo2) {
        o0O00O o0o00o;
        this.f8279o00oOo00 = o00ooooo2;
        if (o00ooooo2 == null || (o0o00o = o00ooooo2.f8316o00oOooo) == null) {
            return;
        }
        o0o00o.o00oo0oO(this.f8294o00oo0Oo);
    }

    public boolean o0O000o() {
        Iterator<o00oOOoO> it = this.f8280o00oOo0O.iterator();
        while (it.hasNext()) {
            if (it.next().f8316o00oOooo != null) {
                return true;
            }
        }
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        return (o00ooooo2 == null || o00ooooo2.f8316o00oOooo == null) ? false : true;
    }

    public void o0O0o(o0O000 o0o000) {
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 != null) {
            Iterator<o00oo> it = o00ooooo2.f8314o00oOoo0.iterator();
            while (it.hasNext()) {
                it.next().o00oOOo0(o0o000);
            }
            return;
        }
        o00oOOoO o00ooooo3 = this.f8281o00oOo0o;
        if (o00ooooo3 != null) {
            Iterator<o00oo> it2 = o00ooooo3.f8314o00oOoo0.iterator();
            while (it2.hasNext()) {
                it2.next().o00oOOo0(o0o000);
            }
        }
    }

    public void o0OoOoOO() {
        o0O00O o0o00o;
        o00oOOoO o00ooooo2 = this.f8279o00oOo00;
        if (o00ooooo2 == null || (o0o00o = o00ooooo2.f8316o00oOooo) == null) {
            return;
        }
        o0o00o.o00ooO00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0OoOoOo(int r8, int r9) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.o00oo0O0 r0 = r7.f8278o00oOOoO
            r1 = -1
            if (r0 == 0) goto L16
            int r0 = r0.o00oOo0O(r8, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r8
        Ld:
            androidx.constraintlayout.widget.o00oo0O0 r2 = r7.f8278o00oOOoO
            int r2 = r2.o00oOo0O(r9, r1, r1)
            if (r2 == r1) goto L17
            goto L18
        L16:
            r0 = r8
        L17:
            r2 = r9
        L18:
            java.util.ArrayList<o00ooO00.o0O00$o00oOOoO> r3 = r7.f8280o00oOo0O
            java.util.Iterator r3 = r3.iterator()
        L1e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r4 = r3.next()
            o00ooO00.o0O00$o00oOOoO r4 = (o00ooO00.o0O00.o00oOOoO) r4
            int r5 = r4.f8307o00oOo00
            if (r5 != r2) goto L32
            int r6 = r4.f8315o00oOooO
            if (r6 == r0) goto L38
        L32:
            if (r5 != r9) goto L1e
            int r5 = r4.f8315o00oOooO
            if (r5 != r8) goto L1e
        L38:
            r7.f8279o00oOo00 = r4
            o00ooO00.o0O00O r8 = r4.f8316o00oOooo
            if (r8 == 0) goto L43
            boolean r9 = r7.f8294o00oo0Oo
            r8.o00oo0oO(r9)
        L43:
            return
        L44:
            o00ooO00.o0O00$o00oOOoO r8 = r7.f8281o00oOo0o
            java.util.ArrayList<o00ooO00.o0O00$o00oOOoO> r3 = r7.f8283o00oOoO0
            java.util.Iterator r3 = r3.iterator()
        L4c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r3.next()
            o00ooO00.o0O00$o00oOOoO r4 = (o00ooO00.o0O00.o00oOOoO) r4
            int r5 = r4.f8307o00oOo00
            if (r5 != r9) goto L4c
            r8 = r4
            goto L4c
        L5e:
            o00ooO00.o0O00$o00oOOoO r9 = new o00ooO00.o0O00$o00oOOoO
            r9.<init>(r7, r8)
            r9.f8315o00oOooO = r0
            r9.f8307o00oOo00 = r2
            if (r0 == r1) goto L6e
            java.util.ArrayList<o00ooO00.o0O00$o00oOOoO> r8 = r7.f8280o00oOo0O
            r8.add(r9)
        L6e:
            r7.f8279o00oOo00 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooO00.o0O00.o0OoOoOo(int, int):void");
    }

    public boolean o0ooOoOO(o0O000Oo o0o000oo) {
        return o0o000oo == this.f8277o00oOOo0 && o0o000oo.f8468o00oo0O0 == this;
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oo  reason: collision with root package name */
        public static final int f8299o00oo = 4;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public static final int f8300o00oo0o = 1;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public static final int f8301o00oo0o0 = 0;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public static final int f8302o00oo0oO = 2;

        /* renamed from: o00ooO00  reason: collision with root package name */
        public static final int f8303o00ooO00 = 1;

        /* renamed from: o0O0o  reason: collision with root package name */
        public static final int f8304o0O0o = 3;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f8305o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f8306o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f8307o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f8308o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public String f8309o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public int f8310o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f8311o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public float f8312o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public final o0O00 f8313o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public ArrayList<o00oo> f8314o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f8315o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public o0O00O f8316o00oOooo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public int f8317o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public ArrayList<o00oOOo0> f8318o00oo00O;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f8319o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f8320o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public boolean f8321o00oo0OO;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public int f8322o00oo0Oo;

        /* loaded from: classes.dex */
        public static class o00oOOo0 implements View.OnClickListener {

            /* renamed from: o00oo  reason: collision with root package name */
            public static final int f8323o00oo = 4096;

            /* renamed from: o00oo0o  reason: collision with root package name */
            public static final int f8324o00oo0o = 17;

            /* renamed from: o00oo0o0  reason: collision with root package name */
            public static final int f8325o00oo0o0 = 1;

            /* renamed from: o00oo0oO  reason: collision with root package name */
            public static final int f8326o00oo0oO = 16;

            /* renamed from: o0O0o  reason: collision with root package name */
            public static final int f8327o0O0o = 256;

            /* renamed from: o00oo0O  reason: collision with root package name */
            public int f8328o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final o00oOOoO f8329o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public int f8330o00oo0Oo;

            public o00oOOo0(Context context, o00oOOoO o00ooooo2, XmlPullParser xmlPullParser) {
                this.f8328o00oo0O = -1;
                this.f8330o00oo0Oo = 17;
                this.f8329o00oo0O0 = o00ooooo2;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == R.styleable.OnClick_targetId) {
                        this.f8328o00oo0O = obtainStyledAttributes.getResourceId(index, this.f8328o00oo0O);
                    } else if (index == R.styleable.OnClick_clickAction) {
                        this.f8330o00oo0Oo = obtainStyledAttributes.getInt(index, this.f8330o00oo0Oo);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View] */
            public void o00oOOo0(o0O000Oo o0o000oo, int i, o00oOOoO o00ooooo2) {
                int i2 = this.f8328o00oo0O;
                o0O000Oo o0o000oo2 = o0o000oo;
                if (i2 != -1) {
                    o0o000oo2 = o0o000oo.findViewById(i2);
                }
                if (o0o000oo2 == null) {
                    return;
                }
                int i3 = o00ooooo2.f8315o00oOooO;
                int i4 = o00ooooo2.f8307o00oOo00;
                if (i3 == -1) {
                    o0o000oo2.setOnClickListener(this);
                    return;
                }
                int i5 = this.f8330o00oo0Oo;
                boolean z = false;
                boolean z2 = ((i5 & 1) != 0 && i == i3) | ((i5 & 1) != 0 && i == i3) | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
                if ((i5 & 4096) != 0 && i == i4) {
                    z = true;
                }
                if (z2 || z) {
                    o0o000oo2.setOnClickListener(this);
                }
            }

            public boolean o00oOOoO(o00oOOoO o00ooooo2, o0O000Oo o0o000oo) {
                o00oOOoO o00ooooo3 = this.f8329o00oo0O0;
                if (o00ooooo3 == o00ooooo2) {
                    return true;
                }
                int i = o00ooooo3.f8307o00oOo00;
                int i2 = o00ooooo3.f8315o00oOooO;
                int i3 = o0o000oo.f8470o00oo0o;
                return i2 == -1 ? i3 != i : i3 == i2 || i3 == i;
            }

            public void o00oOo00(o0O000Oo o0o000oo) {
                View findViewById;
                int i = this.f8328o00oo0O;
                if (i == -1 || (findViewById = o0o000oo.findViewById(i)) == null) {
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00c8 A[ORIG_RETURN, RETURN] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.view.View r8) {
                /*
                    Method dump skipped, instructions count: 201
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o00ooO00.o0O00.o00oOOoO.o00oOOo0.onClick(android.view.View):void");
            }
        }

        public o00oOOoO(int i, o0O00 o0o00, int i2, int i3) {
            this.f8305o00oOOo0 = -1;
            this.f8306o00oOOoO = false;
            this.f8307o00oOo00 = -1;
            this.f8315o00oOooO = -1;
            this.f8308o00oOo0O = 0;
            this.f8309o00oOo0o = null;
            this.f8311o00oOoO0 = -1;
            this.f8310o00oOoO = 400;
            this.f8312o00oOoOO = 0.0f;
            this.f8314o00oOoo0 = new ArrayList<>();
            this.f8316o00oOooo = null;
            this.f8318o00oo00O = new ArrayList<>();
            this.f8317o00oo0 = 0;
            this.f8321o00oo0OO = false;
            this.f8320o00oo0O0 = -1;
            this.f8319o00oo0O = 0;
            this.f8322o00oo0Oo = 0;
            this.f8305o00oOOo0 = i;
            this.f8313o00oOoOo = o0o00;
            this.f8315o00oOooO = i2;
            this.f8307o00oOo00 = i3;
            this.f8310o00oOoO = o0o00.f8288o00oOooo;
            this.f8319o00oo0O = o0o00.f8290o00oo00O;
        }

        public o00oOOoO(o0O00 o0o00, o00oOOoO o00ooooo2) {
            this.f8305o00oOOo0 = -1;
            this.f8306o00oOOoO = false;
            this.f8307o00oOo00 = -1;
            this.f8315o00oOooO = -1;
            this.f8308o00oOo0O = 0;
            this.f8309o00oOo0o = null;
            this.f8311o00oOoO0 = -1;
            this.f8310o00oOoO = 400;
            this.f8312o00oOoOO = 0.0f;
            this.f8314o00oOoo0 = new ArrayList<>();
            this.f8316o00oOooo = null;
            this.f8318o00oo00O = new ArrayList<>();
            this.f8317o00oo0 = 0;
            this.f8321o00oo0OO = false;
            this.f8320o00oo0O0 = -1;
            this.f8319o00oo0O = 0;
            this.f8322o00oo0Oo = 0;
            this.f8313o00oOoOo = o0o00;
            if (o00ooooo2 != null) {
                this.f8320o00oo0O0 = o00ooooo2.f8320o00oo0O0;
                this.f8308o00oOo0O = o00ooooo2.f8308o00oOo0O;
                this.f8309o00oOo0o = o00ooooo2.f8309o00oOo0o;
                this.f8311o00oOoO0 = o00ooooo2.f8311o00oOoO0;
                this.f8310o00oOoO = o00ooooo2.f8310o00oOoO;
                this.f8314o00oOoo0 = o00ooooo2.f8314o00oOoo0;
                this.f8312o00oOoOO = o00ooooo2.f8312o00oOoOO;
                this.f8319o00oo0O = o00ooooo2.f8319o00oo0O;
            }
        }

        public final void o00oo(o0O00 o0o00, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transition);
            o0O0o(o0o00, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public void o00oo0o(Context context, XmlPullParser xmlPullParser) {
            this.f8318o00oo00O.add(new o00oOOo0(context, this, xmlPullParser));
        }

        public String o00oo0oO(Context context) {
            String resourceEntryName = this.f8315o00oOooO == -1 ? "null" : context.getResources().getResourceEntryName(this.f8315o00oOooO);
            if (this.f8307o00oOo00 == -1) {
                return o00oOoOo.o00oo.o00oOOo0(resourceEntryName, " -> null");
            }
            StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(resourceEntryName, " -> ");
            o00oOOo02.append(context.getResources().getResourceEntryName(this.f8307o00oOo00));
            return o00oOOo02.toString();
        }

        public List<o00oo> o00ooO() {
            return this.f8314o00oOoo0;
        }

        public int o00ooO0() {
            return this.f8310o00oOoO;
        }

        public int o00ooO00() {
            return this.f8317o00oo0;
        }

        public int o00ooO0O() {
            return this.f8307o00oOo00;
        }

        public int o00ooO0o() {
            return this.f8305o00oOOo0;
        }

        public List<o00oOOo0> o00ooOO() {
            return this.f8318o00oo00O;
        }

        public int o00ooOO0() {
            return this.f8319o00oo0O;
        }

        public int o00ooOOo() {
            return this.f8320o00oo0O0;
        }

        public int o00ooOo() {
            return this.f8315o00oOooO;
        }

        public float o00ooOo0() {
            return this.f8312o00oOoOO;
        }

        public o0O00O o00ooOoO() {
            return this.f8316o00oOooo;
        }

        public boolean o00ooOoo() {
            return !this.f8321o00oo0OO;
        }

        public void o00ooo0(int i) {
            this.f8317o00oo0 = i;
        }

        public boolean o00ooo00(int i) {
            return (i & this.f8322o00oo0Oo) != 0;
        }

        public void o00ooo0O(int i) {
            this.f8310o00oOoO = i;
        }

        public void o00ooo0o(boolean z) {
            this.f8321o00oo0OO = !z;
        }

        public void o00oooO(int i) {
            this.f8320o00oo0O0 = i;
        }

        public void o00oooOO(float f) {
            this.f8312o00oOoOO = f;
        }

        public final void o0O0o(o0O00 o0o00, Context context, TypedArray typedArray) {
            androidx.constraintlayout.widget.o00oOoO o00oooo2;
            SparseArray<androidx.constraintlayout.widget.o00oOoO> sparseArray;
            int i;
            int indexCount = typedArray.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArray.getIndex(i2);
                if (index == R.styleable.Transition_constraintSetEnd) {
                    this.f8307o00oOo00 = typedArray.getResourceId(index, this.f8307o00oOo00);
                    if (TtmlNode.TAG_LAYOUT.equals(context.getResources().getResourceTypeName(this.f8307o00oOo00))) {
                        o00oooo2 = new androidx.constraintlayout.widget.o00oOoO();
                        o00oooo2.o0O00OOO(context, this.f8307o00oOo00);
                        sparseArray = o0o00.f8282o00oOoO;
                        i = this.f8307o00oOo00;
                        sparseArray.append(i, o00oooo2);
                    }
                } else {
                    if (index == R.styleable.Transition_constraintSetStart) {
                        this.f8315o00oOooO = typedArray.getResourceId(index, this.f8315o00oOooO);
                        if (TtmlNode.TAG_LAYOUT.equals(context.getResources().getResourceTypeName(this.f8315o00oOooO))) {
                            o00oooo2 = new androidx.constraintlayout.widget.o00oOoO();
                            o00oooo2.o0O00OOO(context, this.f8315o00oOooO);
                            sparseArray = o0o00.f8282o00oOoO;
                            i = this.f8315o00oOooO;
                            sparseArray.append(i, o00oooo2);
                        }
                    } else if (index == R.styleable.Transition_motionInterpolator) {
                        int i3 = typedArray.peekValue(index).type;
                        if (i3 == 1) {
                            int resourceId = typedArray.getResourceId(index, -1);
                            this.f8311o00oOoO0 = resourceId;
                            if (resourceId == -1) {
                            }
                            this.f8308o00oOo0O = -2;
                        } else if (i3 == 3) {
                            String string = typedArray.getString(index);
                            this.f8309o00oOo0o = string;
                            if (string.indexOf("/") > 0) {
                                this.f8311o00oOoO0 = typedArray.getResourceId(index, -1);
                                this.f8308o00oOo0O = -2;
                            } else {
                                this.f8308o00oOo0O = -1;
                            }
                        } else {
                            this.f8308o00oOo0O = typedArray.getInteger(index, this.f8308o00oOo0O);
                        }
                    } else if (index == R.styleable.Transition_duration) {
                        this.f8310o00oOoO = typedArray.getInt(index, this.f8310o00oOoO);
                    } else if (index == R.styleable.Transition_staggered) {
                        this.f8312o00oOoOO = typedArray.getFloat(index, this.f8312o00oOoOO);
                    } else if (index == R.styleable.Transition_autoTransition) {
                        this.f8317o00oo0 = typedArray.getInteger(index, this.f8317o00oo0);
                    } else if (index == R.styleable.Transition_android_id) {
                        this.f8305o00oOOo0 = typedArray.getResourceId(index, this.f8305o00oOOo0);
                    } else if (index == R.styleable.Transition_transitionDisable) {
                        this.f8321o00oo0OO = typedArray.getBoolean(index, this.f8321o00oo0OO);
                    } else if (index == R.styleable.Transition_pathMotionArc) {
                        this.f8320o00oo0O0 = typedArray.getInteger(index, -1);
                    } else if (index == R.styleable.Transition_layoutDuringTransition) {
                        this.f8319o00oo0O = typedArray.getInteger(index, 0);
                    } else if (index == R.styleable.Transition_transitionFlags) {
                        this.f8322o00oo0Oo = typedArray.getInteger(index, 0);
                    }
                }
            }
            if (this.f8315o00oOooO == -1) {
                this.f8306o00oOOoO = true;
            }
        }

        public o00oOOoO(o0O00 o0o00, Context context, XmlPullParser xmlPullParser) {
            this.f8305o00oOOo0 = -1;
            this.f8306o00oOOoO = false;
            this.f8307o00oOo00 = -1;
            this.f8315o00oOooO = -1;
            this.f8308o00oOo0O = 0;
            this.f8309o00oOo0o = null;
            this.f8311o00oOoO0 = -1;
            this.f8310o00oOoO = 400;
            this.f8312o00oOoOO = 0.0f;
            this.f8314o00oOoo0 = new ArrayList<>();
            this.f8316o00oOooo = null;
            this.f8318o00oo00O = new ArrayList<>();
            this.f8317o00oo0 = 0;
            this.f8321o00oo0OO = false;
            this.f8320o00oo0O0 = -1;
            this.f8319o00oo0O = 0;
            this.f8322o00oo0Oo = 0;
            this.f8310o00oOoO = o0o00.f8288o00oOooo;
            this.f8319o00oo0O = o0o00.f8290o00oo00O;
            this.f8313o00oOoOo = o0o00;
            o00oo(o0o00, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
