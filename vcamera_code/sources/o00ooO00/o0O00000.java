package o00ooO00;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
/* loaded from: classes.dex */
public class o0O00000 extends o00oo0 {

    /* renamed from: o0  reason: collision with root package name */
    public static final int f8376o0 = 5;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final String f8377o00ooooO = "KeyTrigger";

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static final String f8378o00ooooo = "KeyTrigger";

    /* renamed from: o00ooO  reason: collision with root package name */
    public String f8379o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public int f8380o00ooO0 = -1;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public String f8381o00ooO0O = null;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public int f8382o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public int f8383o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public String f8384o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public int f8385o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public float f8386o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public View f8387o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public boolean f8388o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public boolean f8389o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public float f8390o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public boolean f8391o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public Method f8392o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public Method f8393o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public Method f8394o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public float f8395o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public boolean f8396o00oooOo;

    /* renamed from: o00oooo  reason: collision with root package name */
    public RectF f8397o00oooo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public RectF f8398o00oooo0;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f8399o00oOOo0 = 1;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f8400o00oOOoO = 2;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f8401o00oOo00 = 4;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f8402o00oOo0O = 6;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f8403o00oOo0o = 7;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f8404o00oOoO = 9;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f8405o00oOoO0 = 8;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f8406o00oOoOO = 10;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f8407o00oOoOo = 11;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static SparseIntArray f8408o00oOoo0 = null;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f8409o00oOooO = 5;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8408o00oOoo0 = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTrigger_framePosition, 8);
            f8408o00oOoo0.append(R.styleable.KeyTrigger_onCross, 4);
            f8408o00oOoo0.append(R.styleable.KeyTrigger_onNegativeCross, 1);
            f8408o00oOoo0.append(R.styleable.KeyTrigger_onPositiveCross, 2);
            f8408o00oOoo0.append(R.styleable.KeyTrigger_motionTarget, 7);
            f8408o00oOoo0.append(R.styleable.KeyTrigger_triggerId, 6);
            f8408o00oOoo0.append(R.styleable.KeyTrigger_triggerSlack, 5);
            f8408o00oOoo0.append(R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            f8408o00oOoo0.append(R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            f8408o00oOoo0.append(R.styleable.KeyTrigger_triggerReceiver, 11);
        }

        public static void o00oOOo0(o0O00000 o0o00000, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f8408o00oOoo0.get(index)) {
                    case 1:
                        o0o00000.f8379o00ooO = typedArray.getString(index);
                        continue;
                    case 2:
                        o0o00000.f8384o00ooOO0 = typedArray.getString(index);
                        continue;
                    case 4:
                        o0o00000.f8381o00ooO0O = typedArray.getString(index);
                        continue;
                    case 5:
                        o0o00000.f8386o00ooOo = typedArray.getFloat(index, o0o00000.f8386o00ooOo);
                        continue;
                    case 6:
                        o0o00000.f8383o00ooOO = typedArray.getResourceId(index, o0o00000.f8383o00ooOO);
                        continue;
                    case 7:
                        if (o0O000Oo.f8453o0O0OOO) {
                            int resourceId = typedArray.getResourceId(index, o0o00000.f8131o00oOOoO);
                            o0o00000.f8131o00oOOoO = resourceId;
                            if (resourceId != -1) {
                                continue;
                            }
                            o0o00000.f8132o00oOo00 = typedArray.getString(index);
                        } else {
                            if (typedArray.peekValue(index).type != 3) {
                                o0o00000.f8131o00oOOoO = typedArray.getResourceId(index, o0o00000.f8131o00oOOoO);
                            }
                            o0o00000.f8132o00oOo00 = typedArray.getString(index);
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, o0o00000.f8130o00oOOo0);
                        o0o00000.f8130o00oOOo0 = integer;
                        o0o00000.f8390o00ooo0 = (integer + 0.5f) / 100.0f;
                        continue;
                    case 9:
                        o0o00000.f8385o00ooOOo = typedArray.getResourceId(index, o0o00000.f8385o00ooOOo);
                        continue;
                    case 10:
                        o0o00000.f8396o00oooOo = typedArray.getBoolean(index, o0o00000.f8396o00oooOo);
                        continue;
                    case 11:
                        o0o00000.f8382o00ooO0o = typedArray.getResourceId(index, o0o00000.f8382o00ooO0o);
                        break;
                }
                Integer.toHexString(index);
                f8408o00oOoo0.get(index);
            }
        }
    }

    public o0O00000() {
        int i = o00oo0.f8111o00oOo0o;
        this.f8382o00ooO0o = i;
        this.f8379o00ooO = null;
        this.f8384o00ooOO0 = null;
        this.f8383o00ooOO = i;
        this.f8385o00ooOOo = i;
        this.f8387o00ooOo0 = null;
        this.f8386o00ooOo = 0.1f;
        this.f8388o00ooOoO = true;
        this.f8389o00ooOoo = true;
        this.f8391o00ooo00 = true;
        this.f8390o00ooo0 = Float.NaN;
        this.f8396o00oooOo = false;
        this.f8398o00oooo0 = new RectF();
        this.f8397o00oooo = new RectF();
        this.f8134o00oOooO = 5;
        this.f8133o00oOo0O = new HashMap<>();
    }

    @Override // o00ooO00.o00oo0
    public void o00oOOo0(HashMap<String, o0OoO00O> hashMap) {
    }

    @Override // o00ooO00.o00oo0
    public void o00oOOoO(HashSet<String> hashSet) {
    }

    @Override // o00ooO00.o00oo0
    public void o00oOo00(Context context, AttributeSet attributeSet) {
        o00oOOo0.o00oOOo0(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyTrigger), context);
    }

    @Override // o00ooO00.o00oo0
    public void o00oOo0o(String str, Object obj) {
    }

    public int o00oo() {
        return this.f8380o00ooO0;
    }

    public final void o00ooO00(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0O0o(float r9, android.view.View r10) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooO00.o0O00000.o0O0o(float, android.view.View):void");
    }
}
