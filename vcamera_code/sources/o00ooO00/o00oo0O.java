package o00ooO00;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.o00oOOo0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class o00oo0O extends o00oo0 {

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final String f8145o00oooo = "KeyCycle";

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final String f8146o00oooo0 = "KeyCycle";

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final int f8147o00ooooO = 4;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public String f8149o00ooO0 = null;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f8150o00ooO0O = 0;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public int f8151o00ooO0o = -1;

    /* renamed from: o00ooO  reason: collision with root package name */
    public float f8148o00ooO = Float.NaN;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public float f8153o00ooOO0 = 0.0f;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public float f8152o00ooOO = Float.NaN;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public int f8154o00ooOOo = -1;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public float f8156o00ooOo0 = Float.NaN;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public float f8155o00ooOo = Float.NaN;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public float f8157o00ooOoO = Float.NaN;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public float f8158o00ooOoo = Float.NaN;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public float f8160o00ooo00 = Float.NaN;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public float f8159o00ooo0 = Float.NaN;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public float f8161o00ooo0O = Float.NaN;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public float f8162o00ooo0o = Float.NaN;

    /* renamed from: o00oooO  reason: collision with root package name */
    public float f8163o00oooO = Float.NaN;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public float f8164o00oooOO = Float.NaN;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public float f8165o00oooOo = Float.NaN;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f8166o00oOOo0 = 1;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f8167o00oOOoO = 2;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f8168o00oOo00 = 3;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f8169o00oOo0O = 5;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f8170o00oOo0o = 6;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f8171o00oOoO = 8;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f8172o00oOoO0 = 7;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f8173o00oOoOO = 9;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f8174o00oOoOo = 10;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static final int f8175o00oOoo0 = 11;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f8176o00oOooO = 4;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public static final int f8177o00oOooo = 12;

        /* renamed from: o00oo0  reason: collision with root package name */
        public static final int f8178o00oo0 = 14;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public static final int f8179o00oo00O = 13;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static final int f8180o00oo0O = 17;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final int f8181o00oo0O0 = 16;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public static final int f8182o00oo0OO = 15;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final int f8183o00oo0Oo = 18;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public static final int f8184o00oo0o = 20;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public static final int f8185o00oo0o0 = 19;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public static SparseIntArray f8186o00oo0oO;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8186o00oo0oO = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyCycle_motionTarget, 1);
            f8186o00oo0oO.append(R.styleable.KeyCycle_framePosition, 2);
            f8186o00oo0oO.append(R.styleable.KeyCycle_transitionEasing, 3);
            f8186o00oo0oO.append(R.styleable.KeyCycle_curveFit, 4);
            f8186o00oo0oO.append(R.styleable.KeyCycle_waveShape, 5);
            f8186o00oo0oO.append(R.styleable.KeyCycle_wavePeriod, 6);
            f8186o00oo0oO.append(R.styleable.KeyCycle_waveOffset, 7);
            f8186o00oo0oO.append(R.styleable.KeyCycle_waveVariesBy, 8);
            f8186o00oo0oO.append(R.styleable.KeyCycle_android_alpha, 9);
            f8186o00oo0oO.append(R.styleable.KeyCycle_android_elevation, 10);
            f8186o00oo0oO.append(R.styleable.KeyCycle_android_rotation, 11);
            f8186o00oo0oO.append(R.styleable.KeyCycle_android_rotationX, 12);
            f8186o00oo0oO.append(R.styleable.KeyCycle_android_rotationY, 13);
            f8186o00oo0oO.append(R.styleable.KeyCycle_transitionPathRotate, 14);
            f8186o00oo0oO.append(R.styleable.KeyCycle_android_scaleX, 15);
            f8186o00oo0oO.append(R.styleable.KeyCycle_android_scaleY, 16);
            f8186o00oo0oO.append(R.styleable.KeyCycle_android_translationX, 17);
            f8186o00oo0oO.append(R.styleable.KeyCycle_android_translationY, 18);
            f8186o00oo0oO.append(R.styleable.KeyCycle_android_translationZ, 19);
            f8186o00oo0oO.append(R.styleable.KeyCycle_motionProgress, 20);
        }

        public static void o00oOOoO(o00oo0O o00oo0o2, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f8186o00oo0oO.get(index)) {
                    case 1:
                        if (o0O000Oo.f8453o0O0OOO) {
                            int resourceId = typedArray.getResourceId(index, o00oo0o2.f8131o00oOOoO);
                            o00oo0o2.f8131o00oOOoO = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                            o00oo0o2.f8132o00oOo00 = typedArray.getString(index);
                            break;
                        } else {
                            if (typedArray.peekValue(index).type != 3) {
                                o00oo0o2.f8131o00oOOoO = typedArray.getResourceId(index, o00oo0o2.f8131o00oOOoO);
                                break;
                            }
                            o00oo0o2.f8132o00oOo00 = typedArray.getString(index);
                        }
                    case 2:
                        o00oo0o2.f8130o00oOOo0 = typedArray.getInt(index, o00oo0o2.f8130o00oOOo0);
                        break;
                    case 3:
                        o00oo0o2.f8149o00ooO0 = typedArray.getString(index);
                        break;
                    case 4:
                        o00oo0o2.f8150o00ooO0O = typedArray.getInteger(index, o00oo0o2.f8150o00ooO0O);
                        break;
                    case 5:
                        o00oo0o2.f8151o00ooO0o = typedArray.getInt(index, o00oo0o2.f8151o00ooO0o);
                        break;
                    case 6:
                        o00oo0o2.f8148o00ooO = typedArray.getFloat(index, o00oo0o2.f8148o00ooO);
                        break;
                    case 7:
                        o00oo0o2.f8153o00ooOO0 = typedArray.peekValue(index).type == 5 ? typedArray.getDimension(index, o00oo0o2.f8153o00ooOO0) : typedArray.getFloat(index, o00oo0o2.f8153o00ooOO0);
                        break;
                    case 8:
                        o00oo0o2.f8154o00ooOOo = typedArray.getInt(index, o00oo0o2.f8154o00ooOOo);
                        break;
                    case 9:
                        o00oo0o2.f8156o00ooOo0 = typedArray.getFloat(index, o00oo0o2.f8156o00ooOo0);
                        break;
                    case 10:
                        o00oo0o2.f8155o00ooOo = typedArray.getDimension(index, o00oo0o2.f8155o00ooOo);
                        break;
                    case 11:
                        o00oo0o2.f8157o00ooOoO = typedArray.getFloat(index, o00oo0o2.f8157o00ooOoO);
                        break;
                    case 12:
                        o00oo0o2.f8160o00ooo00 = typedArray.getFloat(index, o00oo0o2.f8160o00ooo00);
                        break;
                    case 13:
                        o00oo0o2.f8159o00ooo0 = typedArray.getFloat(index, o00oo0o2.f8159o00ooo0);
                        break;
                    case 14:
                        o00oo0o2.f8158o00ooOoo = typedArray.getFloat(index, o00oo0o2.f8158o00ooOoo);
                        break;
                    case 15:
                        o00oo0o2.f8161o00ooo0O = typedArray.getFloat(index, o00oo0o2.f8161o00ooo0O);
                        break;
                    case 16:
                        o00oo0o2.f8162o00ooo0o = typedArray.getFloat(index, o00oo0o2.f8162o00ooo0o);
                        break;
                    case 17:
                        o00oo0o2.f8163o00oooO = typedArray.getDimension(index, o00oo0o2.f8163o00oooO);
                        break;
                    case 18:
                        o00oo0o2.f8164o00oooOO = typedArray.getDimension(index, o00oo0o2.f8164o00oooOO);
                        break;
                    case 19:
                        o00oo0o2.f8165o00oooOo = typedArray.getDimension(index, o00oo0o2.f8165o00oooOo);
                        break;
                    case 20:
                        o00oo0o2.f8152o00ooOO = typedArray.getFloat(index, o00oo0o2.f8152o00ooOO);
                        break;
                    default:
                        Integer.toHexString(index);
                        f8186o00oo0oO.get(index);
                        break;
                }
            }
        }
    }

    public o00oo0O() {
        this.f8134o00oOooO = 4;
        this.f8133o00oOo0O = new HashMap<>();
    }

    @Override // o00ooO00.o00oo0
    public void o00oOOo0(HashMap<String, o0OoO00O> hashMap) {
        int i;
        float f;
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("add ");
        o00oOOo02.append(hashMap.size());
        o00oOOo02.append(" values");
        o00oOoO.o00oo00O("KeyCycle", o00oOOo02.toString(), 2);
        for (String str : hashMap.keySet()) {
            o0OoO00O o0ooo00o = hashMap.get(str);
            str.getClass();
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals(o00oo0.f8115o00oOoOo)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals(o00oo0.f8116o00oOoo0)) {
                        c = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals(o00oo0.f8125o00oo0o)) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals(o00oo0.f8127o00oo0oO)) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals(o00oo0.f8129o0O0o)) {
                        c = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals(o00oo0.f8123o00oo0OO)) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals(o00oo0.f8122o00oo0O0)) {
                        c = 7;
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals(o00oo0.f8114o00oOoOO)) {
                        c = '\b';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals(o00oo0.f8112o00oOoO)) {
                        c = '\t';
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals(o00oo0.f8119o00oo0)) {
                        c = '\n';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals(o00oo0.f8113o00oOoO0)) {
                        c = 11;
                        break;
                    }
                    break;
                case 156108012:
                    if (str.equals(o00oo0.f8124o00oo0Oo)) {
                        c = '\f';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i = this.f8130o00oOOo0;
                    f = this.f8160o00ooo00;
                    break;
                case 1:
                    i = this.f8130o00oOOo0;
                    f = this.f8159o00ooo0;
                    break;
                case 2:
                    i = this.f8130o00oOOo0;
                    f = this.f8163o00oooO;
                    break;
                case 3:
                    i = this.f8130o00oOOo0;
                    f = this.f8164o00oooOO;
                    break;
                case 4:
                    i = this.f8130o00oOOo0;
                    f = this.f8165o00oooOo;
                    break;
                case 5:
                    i = this.f8130o00oOOo0;
                    f = this.f8152o00ooOO;
                    break;
                case 6:
                    i = this.f8130o00oOOo0;
                    f = this.f8161o00ooo0O;
                    break;
                case 7:
                    i = this.f8130o00oOOo0;
                    f = this.f8162o00ooo0o;
                    break;
                case '\b':
                    i = this.f8130o00oOOo0;
                    f = this.f8157o00ooOoO;
                    break;
                case '\t':
                    i = this.f8130o00oOOo0;
                    f = this.f8155o00ooOo;
                    break;
                case '\n':
                    i = this.f8130o00oOOo0;
                    f = this.f8158o00ooOoo;
                    break;
                case 11:
                    i = this.f8130o00oOOo0;
                    f = this.f8156o00ooOo0;
                    break;
                case '\f':
                    i = this.f8130o00oOOo0;
                    f = this.f8153o00ooOO0;
                    break;
            }
            o0ooo00o.o00oOo0o(i, f);
        }
    }

    @Override // o00ooO00.o00oo0
    public void o00oOOoO(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f8156o00ooOo0)) {
            hashSet.add(o00oo0.f8113o00oOoO0);
        }
        if (!Float.isNaN(this.f8155o00ooOo)) {
            hashSet.add(o00oo0.f8112o00oOoO);
        }
        if (!Float.isNaN(this.f8157o00ooOoO)) {
            hashSet.add(o00oo0.f8114o00oOoOO);
        }
        if (!Float.isNaN(this.f8160o00ooo00)) {
            hashSet.add(o00oo0.f8115o00oOoOo);
        }
        if (!Float.isNaN(this.f8159o00ooo0)) {
            hashSet.add(o00oo0.f8116o00oOoo0);
        }
        if (!Float.isNaN(this.f8161o00ooo0O)) {
            hashSet.add(o00oo0.f8123o00oo0OO);
        }
        if (!Float.isNaN(this.f8162o00ooo0o)) {
            hashSet.add(o00oo0.f8122o00oo0O0);
        }
        if (!Float.isNaN(this.f8158o00ooOoo)) {
            hashSet.add(o00oo0.f8119o00oo0);
        }
        if (!Float.isNaN(this.f8163o00oooO)) {
            hashSet.add(o00oo0.f8125o00oo0o);
        }
        if (!Float.isNaN(this.f8164o00oooOO)) {
            hashSet.add(o00oo0.f8127o00oo0oO);
        }
        if (!Float.isNaN(this.f8165o00oooOo)) {
            hashSet.add(o00oo0.f8129o0O0o);
        }
        if (this.f8133o00oOo0O.size() > 0) {
            Iterator<String> it = this.f8133o00oOo0O.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // o00ooO00.o00oo0
    public void o00oOo00(Context context, AttributeSet attributeSet) {
        o00oOOo0.o00oOOoO(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyCycle));
    }

    @Override // o00ooO00.o00oo0
    public void o00oOo0o(String str, Object obj) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals(o00oo0.f8115o00oOoOo)) {
                    c = 1;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals(o00oo0.f8116o00oOoo0)) {
                    c = 2;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals(o00oo0.f8125o00oo0o)) {
                    c = 3;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals(o00oo0.f8127o00oo0oO)) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals(o00oo0.f8123o00oo0OO)) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals(o00oo0.f8122o00oo0O0)) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(o00oo0.f8114o00oOoOO)) {
                    c = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals(o00oo0.f8112o00oOoO)) {
                    c = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals(o00oo0.f8119o00oo0)) {
                    c = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals(o00oo0.f8113o00oOoO0)) {
                    c = 11;
                    break;
                }
                break;
            case 156108012:
                if (str.equals(o00oo0.f8124o00oo0Oo)) {
                    c = '\f';
                    break;
                }
                break;
            case 184161818:
                if (str.equals(o00oo0.f8121o00oo0O)) {
                    c = '\r';
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 14;
                    break;
                }
                break;
            case 1317633238:
                if (str.equals("mTranslationZ")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f8149o00ooO0 = obj.toString();
                return;
            case 1:
                this.f8160o00ooo00 = o00oOoO(obj);
                return;
            case 2:
                this.f8159o00ooo0 = o00oOoO(obj);
                return;
            case 3:
                this.f8163o00oooO = o00oOoO(obj);
                return;
            case 4:
                this.f8164o00oooOO = o00oOoO(obj);
                return;
            case 5:
                this.f8152o00ooOO = o00oOoO(obj);
                return;
            case 6:
                this.f8161o00ooo0O = o00oOoO(obj);
                return;
            case 7:
                this.f8162o00ooo0o = o00oOoO(obj);
                return;
            case '\b':
                this.f8157o00ooOoO = o00oOoO(obj);
                return;
            case '\t':
                this.f8155o00ooOo = o00oOoO(obj);
                return;
            case '\n':
                this.f8158o00ooOoo = o00oOoO(obj);
                return;
            case 11:
                this.f8156o00ooOo0 = o00oOoO(obj);
                return;
            case '\f':
                this.f8153o00ooOO0 = o00oOoO(obj);
                return;
            case '\r':
                this.f8148o00ooO = o00oOoO(obj);
                return;
            case 14:
                this.f8150o00ooO0O = o00oOoOO(obj);
                return;
            case 15:
                this.f8165o00oooOo = o00oOoO(obj);
                return;
            default:
                return;
        }
    }

    public void o00ooooO(HashMap<String, o0O0o> hashMap) {
        for (String str : hashMap.keySet()) {
            if (str.startsWith(o00oo0.f8128o00ooO00)) {
                androidx.constraintlayout.widget.o00oOOo0 o00oooo02 = this.f8133o00oOo0O.get(str.substring(7));
                if (o00oooo02 != null && o00oooo02.o00oOooO() == o00oOOo0.o00oOOoO.FLOAT_TYPE) {
                    hashMap.get(str).o00oOo0o(this.f8130o00oOOo0, this.f8151o00ooO0o, this.f8154o00ooOOo, this.f8148o00ooO, this.f8153o00ooOO0, o00oooo02.o00oOo0O(), o00oooo02);
                }
            } else {
                float o00ooooo2 = o00ooooo(str);
                if (!Float.isNaN(o00ooooo2)) {
                    hashMap.get(str).o00oOo0O(this.f8130o00oOOo0, this.f8151o00ooO0o, this.f8154o00ooOOo, this.f8148o00ooO, this.f8153o00ooOO0, o00ooooo2);
                }
            }
        }
    }

    public float o00ooooo(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals(o00oo0.f8115o00oOoOo)) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals(o00oo0.f8116o00oOoo0)) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals(o00oo0.f8125o00oo0o)) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals(o00oo0.f8127o00oo0oO)) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals(o00oo0.f8129o0O0o)) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals(o00oo0.f8123o00oo0OO)) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals(o00oo0.f8122o00oo0O0)) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(o00oo0.f8114o00oOoOO)) {
                    c = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals(o00oo0.f8112o00oOoO)) {
                    c = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals(o00oo0.f8119o00oo0)) {
                    c = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals(o00oo0.f8113o00oOoO0)) {
                    c = 11;
                    break;
                }
                break;
            case 156108012:
                if (str.equals(o00oo0.f8124o00oo0Oo)) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f8160o00ooo00;
            case 1:
                return this.f8159o00ooo0;
            case 2:
                return this.f8163o00oooO;
            case 3:
                return this.f8164o00oooOO;
            case 4:
                return this.f8165o00oooOo;
            case 5:
                return this.f8152o00ooOO;
            case 6:
                return this.f8161o00ooo0O;
            case 7:
                return this.f8162o00ooo0o;
            case '\b':
                return this.f8157o00ooOoO;
            case '\t':
                return this.f8155o00ooOo;
            case '\n':
                return this.f8158o00ooOoo;
            case 11:
                return this.f8156o00ooOo0;
            case '\f':
                return this.f8153o00ooOO0;
            default:
                return Float.NaN;
        }
    }
}
