package o00ooO00;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class o0 extends o00oo0 {

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static final String f8067o00oooOo = "KeyTimeCycle";

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final int f8068o00oooo = 3;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final String f8069o00oooo0 = "KeyTimeCycle";

    /* renamed from: o00ooO0  reason: collision with root package name */
    public String f8071o00ooO0;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f8072o00ooO0O = -1;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public float f8073o00ooO0o = Float.NaN;

    /* renamed from: o00ooO  reason: collision with root package name */
    public float f8070o00ooO = Float.NaN;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public float f8075o00ooOO0 = Float.NaN;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public float f8074o00ooOO = Float.NaN;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public float f8076o00ooOOo = Float.NaN;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public float f8078o00ooOo0 = Float.NaN;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public float f8077o00ooOo = Float.NaN;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public float f8079o00ooOoO = Float.NaN;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public float f8080o00ooOoo = Float.NaN;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public float f8082o00ooo00 = Float.NaN;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public float f8081o00ooo0 = Float.NaN;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public float f8083o00ooo0O = Float.NaN;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public int f8084o00ooo0o = 0;

    /* renamed from: o00oooO  reason: collision with root package name */
    public float f8085o00oooO = Float.NaN;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public float f8086o00oooOO = 0.0f;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f8087o00oOOo0 = 1;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f8088o00oOOoO = 2;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f8089o00oOo00 = 4;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f8090o00oOo0O = 6;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f8091o00oOo0o = 8;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f8092o00oOoO = 9;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f8093o00oOoO0 = 7;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f8094o00oOoOO = 10;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f8095o00oOoOo = 12;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static final int f8096o00oOoo0 = 13;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f8097o00oOooO = 5;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public static final int f8098o00oOooo = 14;

        /* renamed from: o00oo0  reason: collision with root package name */
        public static final int f8099o00oo0 = 16;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public static final int f8100o00oo00O = 15;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static final int f8101o00oo0O = 19;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final int f8102o00oo0O0 = 18;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public static final int f8103o00oo0OO = 17;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final int f8104o00oo0Oo = 20;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public static SparseIntArray f8105o00oo0o = null;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public static final int f8106o00oo0o0 = 21;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8105o00oo0o = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_alpha, 1);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_android_elevation, 2);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_android_rotation, 4);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_android_rotationX, 5);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_android_rotationY, 6);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_android_scaleX, 7);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_transitionPathRotate, 8);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_transitionEasing, 9);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_motionTarget, 10);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_framePosition, 12);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_curveFit, 13);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_android_scaleY, 14);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_android_translationX, 15);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_android_translationY, 16);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_android_translationZ, 17);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_motionProgress, 18);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_wavePeriod, 20);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_waveOffset, 21);
            f8105o00oo0o.append(R.styleable.KeyTimeCycle_waveShape, 19);
        }

        public static void o00oOOo0(o0 o0Var, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f8105o00oo0o.get(index)) {
                    case 1:
                        o0Var.f8073o00ooO0o = typedArray.getFloat(index, o0Var.f8073o00ooO0o);
                        break;
                    case 2:
                        o0Var.f8070o00ooO = typedArray.getDimension(index, o0Var.f8070o00ooO);
                        break;
                    case 3:
                    case 11:
                    default:
                        Integer.toHexString(index);
                        f8105o00oo0o.get(index);
                        break;
                    case 4:
                        o0Var.f8075o00ooOO0 = typedArray.getFloat(index, o0Var.f8075o00ooOO0);
                        break;
                    case 5:
                        o0Var.f8074o00ooOO = typedArray.getFloat(index, o0Var.f8074o00ooOO);
                        break;
                    case 6:
                        o0Var.f8076o00ooOOo = typedArray.getFloat(index, o0Var.f8076o00ooOOo);
                        break;
                    case 7:
                        o0Var.f8077o00ooOo = typedArray.getFloat(index, o0Var.f8077o00ooOo);
                        break;
                    case 8:
                        o0Var.f8078o00ooOo0 = typedArray.getFloat(index, o0Var.f8078o00ooOo0);
                        break;
                    case 9:
                        o0Var.f8071o00ooO0 = typedArray.getString(index);
                        break;
                    case 10:
                        if (o0O000Oo.f8453o0O0OOO) {
                            int resourceId = typedArray.getResourceId(index, o0Var.f8131o00oOOoO);
                            o0Var.f8131o00oOOoO = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                            o0Var.f8132o00oOo00 = typedArray.getString(index);
                            break;
                        } else {
                            if (typedArray.peekValue(index).type != 3) {
                                o0Var.f8131o00oOOoO = typedArray.getResourceId(index, o0Var.f8131o00oOOoO);
                                break;
                            }
                            o0Var.f8132o00oOo00 = typedArray.getString(index);
                        }
                    case 12:
                        o0Var.f8130o00oOOo0 = typedArray.getInt(index, o0Var.f8130o00oOOo0);
                        break;
                    case 13:
                        o0Var.f8072o00ooO0O = typedArray.getInteger(index, o0Var.f8072o00ooO0O);
                        break;
                    case 14:
                        o0Var.f8079o00ooOoO = typedArray.getFloat(index, o0Var.f8079o00ooOoO);
                        break;
                    case 15:
                        o0Var.f8080o00ooOoo = typedArray.getDimension(index, o0Var.f8080o00ooOoo);
                        break;
                    case 16:
                        o0Var.f8082o00ooo00 = typedArray.getDimension(index, o0Var.f8082o00ooo00);
                        break;
                    case 17:
                        o0Var.f8081o00ooo0 = typedArray.getDimension(index, o0Var.f8081o00ooo0);
                        break;
                    case 18:
                        o0Var.f8083o00ooo0O = typedArray.getFloat(index, o0Var.f8083o00ooo0O);
                        break;
                    case 19:
                        o0Var.f8084o00ooo0o = typedArray.getInt(index, o0Var.f8084o00ooo0o);
                        break;
                    case 20:
                        o0Var.f8085o00oooO = typedArray.getFloat(index, o0Var.f8085o00oooO);
                        break;
                    case 21:
                        o0Var.f8086o00oooOO = typedArray.peekValue(index).type == 5 ? typedArray.getDimension(index, o0Var.f8086o00oooOO) : typedArray.getFloat(index, o0Var.f8086o00oooOO);
                        break;
                }
            }
        }
    }

    public o0() {
        this.f8134o00oOooO = 3;
        this.f8133o00oOo0O = new HashMap<>();
    }

    @Override // o00ooO00.o00oo0
    public void o00oOOo0(HashMap<String, o0OoO00O> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // o00ooO00.o00oo0
    public void o00oOOoO(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f8073o00ooO0o)) {
            hashSet.add(o00oo0.f8113o00oOoO0);
        }
        if (!Float.isNaN(this.f8070o00ooO)) {
            hashSet.add(o00oo0.f8112o00oOoO);
        }
        if (!Float.isNaN(this.f8075o00ooOO0)) {
            hashSet.add(o00oo0.f8114o00oOoOO);
        }
        if (!Float.isNaN(this.f8074o00ooOO)) {
            hashSet.add(o00oo0.f8115o00oOoOo);
        }
        if (!Float.isNaN(this.f8076o00ooOOo)) {
            hashSet.add(o00oo0.f8116o00oOoo0);
        }
        if (!Float.isNaN(this.f8080o00ooOoo)) {
            hashSet.add(o00oo0.f8125o00oo0o);
        }
        if (!Float.isNaN(this.f8082o00ooo00)) {
            hashSet.add(o00oo0.f8127o00oo0oO);
        }
        if (!Float.isNaN(this.f8081o00ooo0)) {
            hashSet.add(o00oo0.f8129o0O0o);
        }
        if (!Float.isNaN(this.f8078o00ooOo0)) {
            hashSet.add(o00oo0.f8119o00oo0);
        }
        if (!Float.isNaN(this.f8077o00ooOo)) {
            hashSet.add(o00oo0.f8123o00oo0OO);
        }
        if (!Float.isNaN(this.f8079o00ooOoO)) {
            hashSet.add(o00oo0.f8122o00oo0O0);
        }
        if (!Float.isNaN(this.f8083o00ooo0O)) {
            hashSet.add("progress");
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
        o00oOOo0.o00oOOo0(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyTimeCycle));
    }

    @Override // o00ooO00.o00oo0
    public void o00oOo0O(HashMap<String, Integer> hashMap) {
        if (this.f8072o00ooO0O == -1) {
            return;
        }
        if (!Float.isNaN(this.f8073o00ooO0o)) {
            hashMap.put(o00oo0.f8113o00oOoO0, Integer.valueOf(this.f8072o00ooO0O));
        }
        if (!Float.isNaN(this.f8070o00ooO)) {
            hashMap.put(o00oo0.f8112o00oOoO, Integer.valueOf(this.f8072o00ooO0O));
        }
        if (!Float.isNaN(this.f8075o00ooOO0)) {
            hashMap.put(o00oo0.f8114o00oOoOO, Integer.valueOf(this.f8072o00ooO0O));
        }
        if (!Float.isNaN(this.f8074o00ooOO)) {
            hashMap.put(o00oo0.f8115o00oOoOo, Integer.valueOf(this.f8072o00ooO0O));
        }
        if (!Float.isNaN(this.f8076o00ooOOo)) {
            hashMap.put(o00oo0.f8116o00oOoo0, Integer.valueOf(this.f8072o00ooO0O));
        }
        if (!Float.isNaN(this.f8080o00ooOoo)) {
            hashMap.put(o00oo0.f8125o00oo0o, Integer.valueOf(this.f8072o00ooO0O));
        }
        if (!Float.isNaN(this.f8082o00ooo00)) {
            hashMap.put(o00oo0.f8127o00oo0oO, Integer.valueOf(this.f8072o00ooO0O));
        }
        if (!Float.isNaN(this.f8081o00ooo0)) {
            hashMap.put(o00oo0.f8129o0O0o, Integer.valueOf(this.f8072o00ooO0O));
        }
        if (!Float.isNaN(this.f8078o00ooOo0)) {
            hashMap.put(o00oo0.f8119o00oo0, Integer.valueOf(this.f8072o00ooO0O));
        }
        if (!Float.isNaN(this.f8077o00ooOo)) {
            hashMap.put(o00oo0.f8123o00oo0OO, Integer.valueOf(this.f8072o00ooO0O));
        }
        if (!Float.isNaN(this.f8077o00ooOo)) {
            hashMap.put(o00oo0.f8122o00oo0O0, Integer.valueOf(this.f8072o00ooO0O));
        }
        if (!Float.isNaN(this.f8083o00ooo0O)) {
            hashMap.put("progress", Integer.valueOf(this.f8072o00ooO0O));
        }
        if (this.f8133o00oOo0O.size() > 0) {
            for (String str : this.f8133o00oOo0O.keySet()) {
                hashMap.put(o00oOoOo.o00oo.o00oOOo0("CUSTOM,", str), Integer.valueOf(this.f8072o00ooO0O));
            }
        }
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
            case 579057826:
                if (str.equals("curveFit")) {
                    c = '\f';
                    break;
                }
                break;
            case 1317633238:
                if (str.equals("mTranslationZ")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f8071o00ooO0 = obj.toString();
                return;
            case 1:
                this.f8074o00ooOO = o00oOoO(obj);
                return;
            case 2:
                this.f8076o00ooOOo = o00oOoO(obj);
                return;
            case 3:
                this.f8080o00ooOoo = o00oOoO(obj);
                return;
            case 4:
                this.f8082o00ooo00 = o00oOoO(obj);
                return;
            case 5:
                this.f8083o00ooo0O = o00oOoO(obj);
                return;
            case 6:
                this.f8077o00ooOo = o00oOoO(obj);
                return;
            case 7:
                this.f8079o00ooOoO = o00oOoO(obj);
                return;
            case '\b':
                this.f8075o00ooOO0 = o00oOoO(obj);
                return;
            case '\t':
                this.f8070o00ooO = o00oOoO(obj);
                return;
            case '\n':
                this.f8078o00ooOo0 = o00oOoO(obj);
                return;
            case 11:
                this.f8073o00ooO0o = o00oOoO(obj);
                return;
            case '\f':
                this.f8072o00ooO0O = o00oOoOO(obj);
                return;
            case '\r':
                this.f8081o00ooo0 = o00oOoO(obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
        if (r1.equals(o00ooO00.o00oo0.f8122o00oo0O0) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oooo0(java.util.HashMap<java.lang.String, o00ooO00.o0O00O0o> r11) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooO00.o0.o00oooo0(java.util.HashMap):void");
    }
}
