package o00ooO00;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintStream;
import java.util.HashMap;
/* loaded from: classes.dex */
public class o00oo00O implements o0O00O0 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f8135o00oOoO = "DesignTool";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final boolean f8136o00oOoO0 = false;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final HashMap<Pair<Integer, Integer>, String> f8137o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final HashMap<String, String> f8138o00oOoOo;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O000Oo f8139o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o0O00 f8140o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public String f8141o00oOo00 = null;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public String f8144o00oOooO = null;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f8142o00oOo0O = -1;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f8143o00oOo0o = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> hashMap = new HashMap<>();
        f8137o00oOoOO = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        f8138o00oOoOo = hashMap2;
        hashMap.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public o00oo00O(o0O000Oo o0o000oo) {
        this.f8139o00oOOo0 = o0o000oo;
    }

    public static void o00oOoOo(int i, androidx.constraintlayout.widget.o00oOoO o00oooo2, View view, HashMap<String, String> hashMap, int i2, int i3) {
        String str = f8137o00oOoOO.get(Pair.create(Integer.valueOf(i2), Integer.valueOf(i3)));
        String str2 = hashMap.get(str);
        if (str2 != null) {
            String str3 = f8138o00oOoOo.get(str);
            int o00oOoo02 = str3 != null ? o00oOoo0(i, hashMap.get(str3)) : 0;
            o00oooo2.o00ooOOo(view.getId(), i2, Integer.parseInt(str2), i3, o00oOoo02);
        }
    }

    public static int o00oOoo0(int i, String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(str.substring(0, indexOf)).intValue() * i) / 160.0f);
    }

    public static void o00oOooo(int i, androidx.constraintlayout.widget.o00oOoO o00oooo2, View view, HashMap<String, String> hashMap) {
        String str = hashMap.get("layout_editor_absoluteX");
        if (str != null) {
            o00oooo2.o0ooO(view.getId(), o00oOoo0(i, str));
        }
        String str2 = hashMap.get("layout_editor_absoluteY");
        if (str2 != null) {
            o00oooo2.o0O0OO0(view.getId(), o00oOoo0(i, str2));
        }
    }

    public static void o00oo0(int i, androidx.constraintlayout.widget.o00oOoO o00oooo2, View view, HashMap<String, String> hashMap, int i2) {
        String str = hashMap.get(i2 == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int o00oOoo02 = str.equalsIgnoreCase("wrap_content") ? -2 : o00oOoo0(i, str);
            int id = view.getId();
            if (i2 == 0) {
                o00oooo2.o00oooOo(id, o00oOoo02);
            } else {
                o00oooo2.o00ooOoo(id, o00oOoo02);
            }
        }
    }

    public static void o00oo00O(androidx.constraintlayout.widget.o00oOoO o00oooo2, View view, HashMap<String, String> hashMap, int i) {
        String str = hashMap.get(i == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (i == 0) {
                o00oooo2.o0O0OOoo(view.getId(), Float.parseFloat(str));
            } else if (i == 1) {
                o00oooo2.o0O0o0OO(view.getId(), Float.parseFloat(str));
            }
        }
    }

    @Override // o00ooO00.o0O00O0
    public long o00oOOo0() {
        return this.f8139o00oOOo0.getTransitionTimeMs();
    }

    @Override // o00ooO00.o0O00O0
    public int o00oOOoO(int i, String str, Object obj, float[] fArr, int i2, float[] fArr2, int i3) {
        o0O000 o0o000;
        View view = (View) obj;
        if (i != 0) {
            o0O000Oo o0o000oo = this.f8139o00oOOo0;
            if (o0o000oo.f8468o00oo0O0 == null || view == null || (o0o000 = o0o000oo.f8474o00ooO0.get(view)) == null) {
                return -1;
            }
        } else {
            o0o000 = null;
        }
        if (i != 0) {
            if (i == 1) {
                int o00oo0O02 = this.f8139o00oOOo0.f8468o00oo0O0.o00oo0O0() / 16;
                o0o000.o00oOo0o(fArr2, o00oo0O02);
                return o00oo0O02;
            } else if (i == 2) {
                int o00oo0O03 = this.f8139o00oOOo0.f8468o00oo0O0.o00oo0O0() / 16;
                o0o000.o00oOo0O(fArr2, null);
                return o00oo0O03;
            } else if (i != 3) {
                return -1;
            } else {
                int o00oo0O04 = this.f8139o00oOOo0.f8468o00oo0O0.o00oo0O0() / 16;
                return o0o000.o00oOoOo(str, fArr2, i3);
            }
        }
        return 1;
    }

    @Override // o00ooO00.o0O00O0
    public Boolean o00oOo00(Object obj, Object obj2, float f, float f2, String[] strArr, float[] fArr) {
        if (obj instanceof o00ooO) {
            View view = (View) obj2;
            this.f8139o00oOOo0.f8474o00ooO0.get(view).o00ooO0o(view, (o00ooO) obj, f, f2, strArr, fArr);
            this.f8139o00oOOo0.o0O000();
            this.f8139o00oOOo0.f8481o00ooOo = true;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // o00ooO00.o0O00O0
    public void o00oOo0O(float f) {
        o0O000Oo o0o000oo = this.f8139o00oOOo0;
        if (o0o000oo.f8468o00oo0O0 == null) {
            o0o000oo.f8468o00oo0O0 = this.f8140o00oOOoO;
        }
        o0o000oo.setProgress(f);
        this.f8139o00oOOo0.o00ooOOo(true);
        this.f8139o00oOOo0.requestLayout();
        this.f8139o00oOOo0.invalidate();
    }

    @Override // o00ooO00.o0O00O0
    public void o00oOo0o(Object obj, int i, String str, Object obj2) {
        o0O00 o0o00 = this.f8139o00oOOo0.f8468o00oo0O0;
        if (o0o00 != null) {
            o0o00.o0O000((View) obj, i, str, obj2);
            o0O000Oo o0o000oo = this.f8139o00oOOo0;
            o0o000oo.f8480o00ooOOo = i / 100.0f;
            o0o000oo.f8479o00ooOO0 = 0.0f;
            o0o000oo.o0O000();
            this.f8139o00oOOo0.o00ooOOo(true);
        }
    }

    @Override // o00ooO00.o0O00O0
    public float o00oOoO(Object obj, int i, float f, float f2) {
        return this.f8139o00oOOo0.f8474o00ooO0.get((View) obj).o00oo0O(i, f, f2);
    }

    @Override // o00ooO00.o0O00O0
    public void o00oOoO0(int i, String str, Object obj, Object obj2) {
        View view = (View) obj;
        HashMap hashMap = (HashMap) obj2;
        int o00ooooo2 = this.f8139o00oOOo0.o00ooooo(str);
        androidx.constraintlayout.widget.o00oOoO o00oOoo02 = this.f8139o00oOOo0.f8468o00oo0O0.o00oOoo0(o00ooooo2);
        if (o00oOoo02 == null) {
            return;
        }
        o00oOoo02.o00ooO00(view.getId());
        o00oo0(i, o00oOoo02, view, hashMap, 0);
        o00oo0(i, o00oOoo02, view, hashMap, 1);
        o00oOoOo(i, o00oOoo02, view, hashMap, 6, 6);
        o00oOoOo(i, o00oOoo02, view, hashMap, 6, 7);
        o00oOoOo(i, o00oOoo02, view, hashMap, 7, 7);
        o00oOoOo(i, o00oOoo02, view, hashMap, 7, 6);
        o00oOoOo(i, o00oOoo02, view, hashMap, 1, 1);
        o00oOoOo(i, o00oOoo02, view, hashMap, 1, 2);
        o00oOoOo(i, o00oOoo02, view, hashMap, 2, 2);
        o00oOoOo(i, o00oOoo02, view, hashMap, 2, 1);
        o00oOoOo(i, o00oOoo02, view, hashMap, 3, 3);
        o00oOoOo(i, o00oOoo02, view, hashMap, 3, 4);
        o00oOoOo(i, o00oOoo02, view, hashMap, 4, 3);
        o00oOoOo(i, o00oOoo02, view, hashMap, 4, 4);
        o00oOoOo(i, o00oOoo02, view, hashMap, 5, 5);
        o00oo00O(o00oOoo02, view, hashMap, 0);
        o00oo00O(o00oOoo02, view, hashMap, 1);
        o00oOooo(i, o00oOoo02, view, hashMap);
        this.f8139o00oOOo0.o0OoO00O(o00ooooo2, o00oOoo02);
        this.f8139o00oOOo0.requestLayout();
    }

    @Override // o00ooO00.o0O00O0
    public Object o00oOoOO(Object obj, float f, float f2) {
        o0O000 o0o000;
        View view = (View) obj;
        o0O000Oo o0o000oo = this.f8139o00oOOo0;
        if (o0o000oo.f8468o00oo0O0 == null) {
            return -1;
        }
        if (view == null || (o0o000 = o0o000oo.f8474o00ooO0.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return o0o000.o00oo0Oo(viewGroup.getWidth(), viewGroup.getHeight(), f, f2);
    }

    @Override // o00ooO00.o0O00O0
    public boolean o00oOooO(Object obj, int i, int i2, float f, float f2) {
        o0O000Oo o0o000oo = this.f8139o00oOOo0;
        if (o0o000oo.f8468o00oo0O0 != null) {
            o0O000 o0o000 = o0o000oo.f8474o00ooO0.get(obj);
            o0O000Oo o0o000oo2 = this.f8139o00oOOo0;
            int i3 = (int) (o0o000oo2.f8473o00ooO * 100.0f);
            if (o0o000 != null) {
                View view = (View) obj;
                if (o0o000oo2.f8468o00oo0O0.o00ooOoo(view, i3)) {
                    float o00oo0O2 = o0o000.o00oo0O(2, f, f2);
                    float o00oo0O3 = o0o000.o00oo0O(5, f, f2);
                    this.f8139o00oOOo0.f8468o00oo0O0.o0O000(view, i3, "motion:percentX", Float.valueOf(o00oo0O2));
                    this.f8139o00oOOo0.f8468o00oo0O0.o0O000(view, i3, "motion:percentY", Float.valueOf(o00oo0O3));
                    this.f8139o00oOOo0.o0O000();
                    this.f8139o00oOOo0.o00ooOOo(true);
                    this.f8139o00oOOo0.invalidate();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public Object o00oo(int i, int i2, int i3) {
        o0O000Oo o0o000oo = this.f8139o00oOOo0;
        o0O00 o0o00 = o0o000oo.f8468o00oo0O0;
        if (o0o00 == null) {
            return null;
        }
        return o0o00.o00oo0oO(o0o000oo.getContext(), i, i2, i3);
    }

    public int o00oo0O(Object obj, float[] fArr) {
        o0O00 o0o00 = this.f8139o00oOOo0.f8468o00oo0O0;
        if (o0o00 == null) {
            return -1;
        }
        int o00oo0O02 = o0o00.o00oo0O0() / 16;
        o0O000 o0o000 = this.f8139o00oOOo0.f8474o00ooO0.get(obj);
        if (o0o000 == null) {
            return 0;
        }
        o0o000.o00oOo0O(fArr, null);
        return o00oo0O02;
    }

    public void o00oo0O0(String str) {
        o0O000Oo o0o000oo = this.f8139o00oOOo0;
        if (o0o000oo.f8468o00oo0O0 == null) {
            o0o000oo.f8468o00oo0O0 = this.f8140o00oOOoO;
        }
        int o00ooooo2 = o0o000oo.o00ooooo(str);
        PrintStream printStream = System.out;
        printStream.println(" dumping  " + str + " (" + o00ooooo2 + ")");
        try {
            this.f8139o00oOOo0.f8468o00oo0O0.o00oOoo0(o00ooooo2).o0O000O(this.f8139o00oOOo0.f8468o00oo0O0, new int[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void o00oo0OO(boolean z) {
        this.f8139o00oOOo0.o00ooOO0(z);
    }

    public int o00oo0Oo(Object obj, float[] fArr, int i) {
        o0O000Oo o0o000oo = this.f8139o00oOOo0;
        if (o0o000oo.f8468o00oo0O0 == null) {
            return -1;
        }
        o0O000 o0o000 = o0o000oo.f8474o00ooO0.get(obj);
        if (o0o000 == null) {
            return 0;
        }
        o0o000.o00oOo0o(fArr, i);
        return i;
    }

    public String o00oo0o() {
        int endState = this.f8139o00oOOo0.getEndState();
        if (this.f8143o00oOo0o == endState) {
            return this.f8144o00oOooO;
        }
        String o00ooo0o2 = this.f8139o00oOOo0.o00ooo0o(endState);
        if (o00ooo0o2 != null) {
            this.f8144o00oOooO = o00ooo0o2;
            this.f8143o00oOo0o = endState;
        }
        return o00ooo0o2;
    }

    public void o00oo0o0(Object obj, float[] fArr) {
        o0O00 o0o00 = this.f8139o00oOOo0.f8468o00oo0O0;
        if (o0o00 == null) {
            return;
        }
        int o00oo0O02 = o0o00.o00oo0O0() / 16;
        o0O000 o0o000 = this.f8139o00oOOo0.f8474o00ooO0.get(obj);
        if (o0o000 == null) {
            return;
        }
        o0o000.o00oOoO(fArr, o00oo0O02);
    }

    public int o00oo0oO(Object obj, int i, int[] iArr) {
        o0O000 o0o000 = this.f8139o00oOOo0.f8474o00ooO0.get((View) obj);
        if (o0o000 == null) {
            return 0;
        }
        return o0o000.o00oo0O0(i, iArr);
    }

    public boolean o00ooO() {
        return (this.f8141o00oOo00 == null || this.f8144o00oOooO == null) ? false : true;
    }

    public float o00ooO0() {
        return this.f8139o00oOOo0.getProgress();
    }

    public Object o00ooO00(Object obj, int i, int i2) {
        if (this.f8139o00oOOo0.f8468o00oo0O0 == null) {
            return null;
        }
        int id = ((View) obj).getId();
        o0O000Oo o0o000oo = this.f8139o00oOOo0;
        return o0o000oo.f8468o00oo0O0.o00oo0oO(o0o000oo.getContext(), i, id, i2);
    }

    public String o00ooO0O() {
        int startState = this.f8139o00oOOo0.getStartState();
        if (this.f8142o00oOo0O == startState) {
            return this.f8141o00oOo00;
        }
        String o00ooo0o2 = this.f8139o00oOOo0.o00ooo0o(startState);
        if (o00ooo0o2 != null) {
            this.f8141o00oOo00 = o00ooo0o2;
            this.f8142o00oOo0O = startState;
        }
        return this.f8139o00oOOo0.o00ooo0o(startState);
    }

    public String o00ooO0o() {
        if (this.f8141o00oOo00 != null && this.f8144o00oOooO != null) {
            float o00ooO02 = o00ooO0();
            if (o00ooO02 <= 0.01f) {
                return this.f8141o00oOo00;
            }
            if (o00ooO02 >= 0.99f) {
                return this.f8144o00oOooO;
            }
        }
        return this.f8141o00oOo00;
    }

    public void o00ooOO(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (this.f8141o00oOo00 == str) {
            return;
        }
        this.f8141o00oOo00 = str;
        this.f8144o00oOooO = null;
        o0O000Oo o0o000oo = this.f8139o00oOOo0;
        if (o0o000oo.f8468o00oo0O0 == null) {
            o0o000oo.f8468o00oo0O0 = this.f8140o00oOOoO;
        }
        int o00ooooo2 = o0o000oo.o00ooooo(str);
        this.f8142o00oOo0O = o00ooooo2;
        if (o00ooooo2 != 0) {
            if (o00ooooo2 == this.f8139o00oOOo0.getStartState()) {
                this.f8139o00oOOo0.setProgress(0.0f);
            } else {
                if (o00ooooo2 != this.f8139o00oOOo0.getEndState()) {
                    this.f8139o00oOOo0.o0O000oo(o00ooooo2);
                }
                this.f8139o00oOOo0.setProgress(1.0f);
            }
        }
        this.f8139o00oOOo0.requestLayout();
    }

    public void o00ooOO0(Object obj, String str, Object obj2) {
        if (obj instanceof o00oo0) {
            ((o00oo0) obj).o00oOo0o(str, obj2);
            this.f8139o00oOOo0.o0O000();
            this.f8139o00oOOo0.f8481o00ooOo = true;
        }
    }

    public void o00ooOOo(String str, String str2) {
        o0O000Oo o0o000oo = this.f8139o00oOOo0;
        if (o0o000oo.f8468o00oo0O0 == null) {
            o0o000oo.f8468o00oo0O0 = this.f8140o00oOOoO;
        }
        int o00ooooo2 = o0o000oo.o00ooooo(str);
        int o00ooooo3 = this.f8139o00oOOo0.o00ooooo(str2);
        this.f8139o00oOOo0.o0O000Oo(o00ooooo2, o00ooooo3);
        this.f8142o00oOo0O = o00ooooo2;
        this.f8143o00oOo0o = o00ooooo3;
        this.f8141o00oOo00 = str;
        this.f8144o00oOooO = str2;
    }

    public void o00ooOo0(Object obj, int i) {
        o0O000 o0o000 = this.f8139o00oOOo0.f8474o00ooO0.get(obj);
        if (o0o000 != null) {
            o0o000.o00ooOO0(i);
            this.f8139o00oOOo0.invalidate();
        }
    }

    public int o0O0o(Object obj, int[] iArr, float[] fArr) {
        o0O000 o0o000 = this.f8139o00oOOo0.f8474o00ooO0.get((View) obj);
        if (o0o000 == null) {
            return 0;
        }
        return o0o000.o00oo(iArr, fArr);
    }
}
