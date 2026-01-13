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
public class o00oo0OO extends o00oo0 {

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static final String f8188o00oooOo = "KeyAttribute";

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final int f8189o00oooo = 1;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final String f8190o00oooo0 = "KeyAttribute";

    /* renamed from: o00ooO0  reason: collision with root package name */
    public String f8192o00ooO0;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f8193o00ooO0O = -1;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public boolean f8194o00ooO0o = false;

    /* renamed from: o00ooO  reason: collision with root package name */
    public float f8191o00ooO = Float.NaN;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public float f8196o00ooOO0 = Float.NaN;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public float f8195o00ooOO = Float.NaN;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public float f8197o00ooOOo = Float.NaN;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public float f8199o00ooOo0 = Float.NaN;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public float f8198o00ooOo = Float.NaN;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public float f8200o00ooOoO = Float.NaN;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public float f8201o00ooOoo = Float.NaN;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public float f8203o00ooo00 = Float.NaN;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public float f8202o00ooo0 = Float.NaN;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public float f8204o00ooo0O = Float.NaN;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public float f8205o00ooo0o = Float.NaN;

    /* renamed from: o00oooO  reason: collision with root package name */
    public float f8206o00oooO = Float.NaN;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public float f8207o00oooOO = Float.NaN;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f8208o00oOOo0 = 1;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f8209o00oOOoO = 2;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f8210o00oOo00 = 4;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f8211o00oOo0O = 6;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f8212o00oOo0o = 8;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f8213o00oOoO = 9;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f8214o00oOoO0 = 7;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f8215o00oOoOO = 10;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f8216o00oOoOo = 12;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static final int f8217o00oOoo0 = 13;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f8218o00oOooO = 5;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public static final int f8219o00oOooo = 14;

        /* renamed from: o00oo0  reason: collision with root package name */
        public static final int f8220o00oo0 = 16;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public static final int f8221o00oo00O = 15;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static final int f8222o00oo0O = 19;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final int f8223o00oo0O0 = 18;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public static final int f8224o00oo0OO = 17;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final int f8225o00oo0Oo = 20;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public static SparseIntArray f8226o00oo0o0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8226o00oo0o0 = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyAttribute_android_alpha, 1);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_android_elevation, 2);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_android_rotation, 4);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_android_rotationX, 5);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_android_rotationY, 6);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_android_transformPivotX, 19);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_android_transformPivotY, 20);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_android_scaleX, 7);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_transitionPathRotate, 8);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_transitionEasing, 9);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_motionTarget, 10);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_framePosition, 12);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_curveFit, 13);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_android_scaleY, 14);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_android_translationX, 15);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_android_translationY, 16);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_android_translationZ, 17);
            f8226o00oo0o0.append(R.styleable.KeyAttribute_motionProgress, 18);
        }

        public static void o00oOOo0(o00oo0OO o00oo0oo, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f8226o00oo0o0.get(index)) {
                    case 1:
                        o00oo0oo.f8191o00ooO = typedArray.getFloat(index, o00oo0oo.f8191o00ooO);
                        break;
                    case 2:
                        o00oo0oo.f8196o00ooOO0 = typedArray.getDimension(index, o00oo0oo.f8196o00ooOO0);
                        break;
                    case 3:
                    case 11:
                    default:
                        Integer.toHexString(index);
                        f8226o00oo0o0.get(index);
                        break;
                    case 4:
                        o00oo0oo.f8195o00ooOO = typedArray.getFloat(index, o00oo0oo.f8195o00ooOO);
                        break;
                    case 5:
                        o00oo0oo.f8197o00ooOOo = typedArray.getFloat(index, o00oo0oo.f8197o00ooOOo);
                        break;
                    case 6:
                        o00oo0oo.f8199o00ooOo0 = typedArray.getFloat(index, o00oo0oo.f8199o00ooOo0);
                        break;
                    case 7:
                        o00oo0oo.f8203o00ooo00 = typedArray.getFloat(index, o00oo0oo.f8203o00ooo00);
                        break;
                    case 8:
                        o00oo0oo.f8201o00ooOoo = typedArray.getFloat(index, o00oo0oo.f8201o00ooOoo);
                        break;
                    case 9:
                        o00oo0oo.f8192o00ooO0 = typedArray.getString(index);
                        break;
                    case 10:
                        if (o0O000Oo.f8453o0O0OOO) {
                            int resourceId = typedArray.getResourceId(index, o00oo0oo.f8131o00oOOoO);
                            o00oo0oo.f8131o00oOOoO = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                            o00oo0oo.f8132o00oOo00 = typedArray.getString(index);
                            break;
                        } else {
                            if (typedArray.peekValue(index).type != 3) {
                                o00oo0oo.f8131o00oOOoO = typedArray.getResourceId(index, o00oo0oo.f8131o00oOOoO);
                                break;
                            }
                            o00oo0oo.f8132o00oOo00 = typedArray.getString(index);
                        }
                    case 12:
                        o00oo0oo.f8130o00oOOo0 = typedArray.getInt(index, o00oo0oo.f8130o00oOOo0);
                        break;
                    case 13:
                        o00oo0oo.f8193o00ooO0O = typedArray.getInteger(index, o00oo0oo.f8193o00ooO0O);
                        break;
                    case 14:
                        o00oo0oo.f8202o00ooo0 = typedArray.getFloat(index, o00oo0oo.f8202o00ooo0);
                        break;
                    case 15:
                        o00oo0oo.f8204o00ooo0O = typedArray.getDimension(index, o00oo0oo.f8204o00ooo0O);
                        break;
                    case 16:
                        o00oo0oo.f8205o00ooo0o = typedArray.getDimension(index, o00oo0oo.f8205o00ooo0o);
                        break;
                    case 17:
                        o00oo0oo.f8206o00oooO = typedArray.getDimension(index, o00oo0oo.f8206o00oooO);
                        break;
                    case 18:
                        o00oo0oo.f8207o00oooOO = typedArray.getFloat(index, o00oo0oo.f8207o00oooOO);
                        break;
                    case 19:
                        o00oo0oo.f8198o00ooOo = typedArray.getDimension(index, o00oo0oo.f8198o00ooOo);
                        break;
                    case 20:
                        o00oo0oo.f8200o00ooOoO = typedArray.getDimension(index, o00oo0oo.f8200o00ooOoO);
                        break;
                }
            }
        }
    }

    public o00oo0OO() {
        this.f8134o00oOooO = 1;
        this.f8133o00oOo0O = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
        if (r1.equals(o00ooO00.o00oo0.f8122o00oo0O0) == false) goto L9;
     */
    @Override // o00ooO00.o00oo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oOOo0(java.util.HashMap<java.lang.String, o00ooO00.o0OoO00O> r7) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooO00.o00oo0OO.o00oOOo0(java.util.HashMap):void");
    }

    @Override // o00ooO00.o00oo0
    public void o00oOOoO(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f8191o00ooO)) {
            hashSet.add(o00oo0.f8113o00oOoO0);
        }
        if (!Float.isNaN(this.f8196o00ooOO0)) {
            hashSet.add(o00oo0.f8112o00oOoO);
        }
        if (!Float.isNaN(this.f8195o00ooOO)) {
            hashSet.add(o00oo0.f8114o00oOoOO);
        }
        if (!Float.isNaN(this.f8197o00ooOOo)) {
            hashSet.add(o00oo0.f8115o00oOoOo);
        }
        if (!Float.isNaN(this.f8199o00ooOo0)) {
            hashSet.add(o00oo0.f8116o00oOoo0);
        }
        if (!Float.isNaN(this.f8198o00ooOo)) {
            hashSet.add(o00oo0.f8117o00oOooo);
        }
        if (!Float.isNaN(this.f8200o00ooOoO)) {
            hashSet.add(o00oo0.f8120o00oo00O);
        }
        if (!Float.isNaN(this.f8204o00ooo0O)) {
            hashSet.add(o00oo0.f8125o00oo0o);
        }
        if (!Float.isNaN(this.f8205o00ooo0o)) {
            hashSet.add(o00oo0.f8127o00oo0oO);
        }
        if (!Float.isNaN(this.f8206o00oooO)) {
            hashSet.add(o00oo0.f8129o0O0o);
        }
        if (!Float.isNaN(this.f8201o00ooOoo)) {
            hashSet.add(o00oo0.f8119o00oo0);
        }
        if (!Float.isNaN(this.f8203o00ooo00)) {
            hashSet.add(o00oo0.f8123o00oo0OO);
        }
        if (!Float.isNaN(this.f8202o00ooo0)) {
            hashSet.add(o00oo0.f8122o00oo0O0);
        }
        if (!Float.isNaN(this.f8207o00oooOO)) {
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
        o00oOOo0.o00oOOo0(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyAttribute));
    }

    @Override // o00ooO00.o00oo0
    public void o00oOo0O(HashMap<String, Integer> hashMap) {
        if (this.f8193o00ooO0O == -1) {
            return;
        }
        if (!Float.isNaN(this.f8191o00ooO)) {
            hashMap.put(o00oo0.f8113o00oOoO0, Integer.valueOf(this.f8193o00ooO0O));
        }
        if (!Float.isNaN(this.f8196o00ooOO0)) {
            hashMap.put(o00oo0.f8112o00oOoO, Integer.valueOf(this.f8193o00ooO0O));
        }
        if (!Float.isNaN(this.f8195o00ooOO)) {
            hashMap.put(o00oo0.f8114o00oOoOO, Integer.valueOf(this.f8193o00ooO0O));
        }
        if (!Float.isNaN(this.f8197o00ooOOo)) {
            hashMap.put(o00oo0.f8115o00oOoOo, Integer.valueOf(this.f8193o00ooO0O));
        }
        if (!Float.isNaN(this.f8199o00ooOo0)) {
            hashMap.put(o00oo0.f8116o00oOoo0, Integer.valueOf(this.f8193o00ooO0O));
        }
        if (!Float.isNaN(this.f8198o00ooOo)) {
            hashMap.put(o00oo0.f8117o00oOooo, Integer.valueOf(this.f8193o00ooO0O));
        }
        if (!Float.isNaN(this.f8200o00ooOoO)) {
            hashMap.put(o00oo0.f8120o00oo00O, Integer.valueOf(this.f8193o00ooO0O));
        }
        if (!Float.isNaN(this.f8204o00ooo0O)) {
            hashMap.put(o00oo0.f8125o00oo0o, Integer.valueOf(this.f8193o00ooO0O));
        }
        if (!Float.isNaN(this.f8205o00ooo0o)) {
            hashMap.put(o00oo0.f8127o00oo0oO, Integer.valueOf(this.f8193o00ooO0O));
        }
        if (!Float.isNaN(this.f8206o00oooO)) {
            hashMap.put(o00oo0.f8129o0O0o, Integer.valueOf(this.f8193o00ooO0O));
        }
        if (!Float.isNaN(this.f8201o00ooOoo)) {
            hashMap.put(o00oo0.f8119o00oo0, Integer.valueOf(this.f8193o00ooO0O));
        }
        if (!Float.isNaN(this.f8203o00ooo00)) {
            hashMap.put(o00oo0.f8123o00oo0OO, Integer.valueOf(this.f8193o00ooO0O));
        }
        if (!Float.isNaN(this.f8202o00ooo0)) {
            hashMap.put(o00oo0.f8122o00oo0O0, Integer.valueOf(this.f8193o00ooO0O));
        }
        if (!Float.isNaN(this.f8207o00oooOO)) {
            hashMap.put("progress", Integer.valueOf(this.f8193o00ooO0O));
        }
        if (this.f8133o00oOo0O.size() > 0) {
            for (String str : this.f8133o00oOo0O.keySet()) {
                hashMap.put(o00oOoOo.o00oo.o00oOOo0("CUSTOM,", str), Integer.valueOf(this.f8193o00ooO0O));
            }
        }
    }

    @Override // o00ooO00.o00oo0
    public void o00oOo0o(String str, Object obj) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    c = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals(o00oo0.f8115o00oOoOo)) {
                    c = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals(o00oo0.f8116o00oOoo0)) {
                    c = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals(o00oo0.f8125o00oo0o)) {
                    c = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals(o00oo0.f8127o00oo0oO)) {
                    c = 5;
                    break;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c = 6;
                    break;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c = 7;
                    break;
                }
                break;
            case -908189618:
                if (str.equals(o00oo0.f8123o00oo0OO)) {
                    c = '\b';
                    break;
                }
                break;
            case -908189617:
                if (str.equals(o00oo0.f8122o00oo0O0)) {
                    c = '\t';
                    break;
                }
                break;
            case -40300674:
                if (str.equals(o00oo0.f8114o00oOoOO)) {
                    c = '\n';
                    break;
                }
                break;
            case -4379043:
                if (str.equals(o00oo0.f8112o00oOoO)) {
                    c = 11;
                    break;
                }
                break;
            case 37232917:
                if (str.equals(o00oo0.f8119o00oo0)) {
                    c = '\f';
                    break;
                }
                break;
            case 92909918:
                if (str.equals(o00oo0.f8113o00oOoO0)) {
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
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f8207o00oooOO = o00oOoO(obj);
                return;
            case 1:
                this.f8192o00ooO0 = obj.toString();
                return;
            case 2:
                this.f8197o00ooOOo = o00oOoO(obj);
                return;
            case 3:
                this.f8199o00ooOo0 = o00oOoO(obj);
                return;
            case 4:
                this.f8204o00ooo0O = o00oOoO(obj);
                return;
            case 5:
                this.f8205o00ooo0o = o00oOoO(obj);
                return;
            case 6:
                this.f8198o00ooOo = o00oOoO(obj);
                return;
            case 7:
                this.f8200o00ooOoO = o00oOoO(obj);
                return;
            case '\b':
                this.f8203o00ooo00 = o00oOoO(obj);
                return;
            case '\t':
                this.f8202o00ooo0 = o00oOoO(obj);
                return;
            case '\n':
                this.f8195o00ooOO = o00oOoO(obj);
                return;
            case 11:
                this.f8196o00ooOO0 = o00oOoO(obj);
                return;
            case '\f':
                this.f8201o00ooOoo = o00oOoO(obj);
                return;
            case '\r':
                this.f8191o00ooO = o00oOoO(obj);
                return;
            case 14:
                this.f8193o00ooO0O = o00oOoOO(obj);
                return;
            case 15:
                this.f8206o00oooO = o00oOoO(obj);
                return;
            case 16:
                this.f8194o00ooO0o = o00oOoO0(obj);
                return;
            default:
                return;
        }
    }

    public int o00oooOO() {
        return this.f8193o00ooO0O;
    }
}
