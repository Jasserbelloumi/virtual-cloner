package o0O00O;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oOOoO {

    /* loaded from: classes.dex */
    public interface o00oOOo0<T> {
        void o00oOOo0(T t, Rect rect);
    }

    /* renamed from: o0O00O.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0137o00oOOoO<T, V> {
        V o00oOOo0(T t, int i);

        int o00oOOoO(T t);
    }

    /* loaded from: classes.dex */
    public static class o00oOo00<T> implements Comparator<T> {

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final boolean f10833o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final o00oOOo0<T> f10834o00oo0o0;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Rect f10832o00oo0O0 = new Rect();

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final Rect f10831o00oo0O = new Rect();

        public o00oOo00(boolean z, o00oOOo0<T> o00oooo02) {
            this.f10833o00oo0Oo = z;
            this.f10834o00oo0o0 = o00oooo02;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.f10832o00oo0O0;
            Rect rect2 = this.f10831o00oo0O;
            this.f10834o00oo0o0.o00oOOo0(t, rect);
            this.f10834o00oo0o0.o00oOOo0(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.f10833o00oo0Oo ? 1 : -1;
            } else if (i3 > i4) {
                return this.f10833o00oo0Oo ? -1 : 1;
            } else {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    return this.f10833o00oo0Oo ? 1 : -1;
                } else if (i7 > i8) {
                    return this.f10833o00oo0Oo ? -1 : 1;
                } else {
                    return 0;
                }
            }
        }
    }

    public static boolean o00oOOo0(int i, @oo0oO0 Rect rect, @oo0oO0 Rect rect2, @oo0oO0 Rect rect3) {
        boolean o00oOOoO2 = o00oOOoO(i, rect, rect2);
        if (o00oOOoO(i, rect, rect3) || !o00oOOoO2) {
            return false;
        }
        return !o00oOoOo(i, rect, rect3) || i == 17 || i == 66 || o00oOoo0(i, rect, rect2) < o00oo00O(i, rect, rect3);
    }

    public static boolean o00oOOoO(int i, @oo0oO0 Rect rect, @oo0oO0 Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <L, T> T o00oOo00(@o00oOooO.oo0oO0 L r7, @o00oOooO.oo0oO0 o0O00O.o00oOOoO.InterfaceC0137o00oOOoO<L, T> r8, @o00oOooO.oo0oO0 o0O00O.o00oOOoO.o00oOOo0<T> r9, @o00oOooO.o0OO00OO T r10, @o00oOooO.oo0oO0 android.graphics.Rect r11, int r12) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 17
            r2 = 0
            if (r12 == r1) goto L38
            r1 = 33
            if (r12 == r1) goto L2e
            r1 = 66
            if (r12 == r1) goto L26
            r1 = 130(0x82, float:1.82E-43)
            if (r12 != r1) goto L1e
            int r1 = r11.height()
            int r1 = r1 + 1
            int r1 = -r1
            goto L34
        L1e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7.<init>(r8)
            throw r7
        L26:
            int r1 = r11.width()
            int r1 = r1 + 1
            int r1 = -r1
            goto L3e
        L2e:
            int r1 = r11.height()
            int r1 = r1 + 1
        L34:
            r0.offset(r2, r1)
            goto L41
        L38:
            int r1 = r11.width()
            int r1 = r1 + 1
        L3e:
            r0.offset(r1, r2)
        L41:
            r1 = 0
            int r3 = r8.o00oOOoO(r7)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
        L4b:
            if (r2 >= r3) goto L64
            java.lang.Object r5 = r8.o00oOOo0(r7, r2)
            if (r5 != r10) goto L54
            goto L61
        L54:
            r9.o00oOOo0(r5, r4)
            boolean r6 = o00oOoO(r12, r11, r4, r0)
            if (r6 == 0) goto L61
            r0.set(r4)
            r1 = r5
        L61:
            int r2 = r2 + 1
            goto L4b
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O00O.o00oOOoO.o00oOo00(java.lang.Object, o0O00O.o00oOOoO$o00oOOoO, o0O00O.o00oOOoO$o00oOOo0, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    public static <T> T o00oOo0O(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int lastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    public static <T> T o00oOo0o(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int indexOf = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    public static boolean o00oOoO(int i, @oo0oO0 Rect rect, @oo0oO0 Rect rect2, @oo0oO0 Rect rect3) {
        if (o00oOoOO(rect, rect2, i)) {
            if (o00oOoOO(rect, rect3, i) && !o00oOOo0(i, rect, rect2, rect3)) {
                if (o00oOOo0(i, rect, rect3, rect2)) {
                    return false;
                }
                int o00oOoo02 = o00oOoo0(i, rect, rect2);
                int o00oo0OO2 = o00oo0OO(i, rect, rect2);
                int i2 = (o00oo0OO2 * o00oo0OO2) + (o00oOoo02 * 13 * o00oOoo02);
                int o00oOoo03 = o00oOoo0(i, rect, rect3);
                int o00oo0OO3 = o00oo0OO(i, rect, rect3);
                return i2 < (o00oo0OO3 * o00oo0OO3) + ((o00oOoo03 * 13) * o00oOoo03);
            }
            return true;
        }
        return false;
    }

    public static int o00oOoO0(int i, int i2) {
        return (i2 * i2) + (i * 13 * i);
    }

    public static boolean o00oOoOO(@oo0oO0 Rect rect, @oo0oO0 Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static boolean o00oOoOo(int i, @oo0oO0 Rect rect, @oo0oO0 Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        } else if (i == 33) {
            return rect.top >= rect2.bottom;
        } else if (i == 66) {
            return rect.right <= rect2.left;
        } else if (i == 130) {
            return rect.bottom <= rect2.top;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int o00oOoo0(int i, @oo0oO0 Rect rect, @oo0oO0 Rect rect2) {
        return Math.max(0, o00oOooo(i, rect, rect2));
    }

    public static <L, T> T o00oOooO(@oo0oO0 L l, @oo0oO0 InterfaceC0137o00oOOoO<L, T> interfaceC0137o00oOOoO, @oo0oO0 o00oOOo0<T> o00oooo02, @o0OO00OO T t, int i, boolean z, boolean z2) {
        int o00oOOoO2 = interfaceC0137o00oOOoO.o00oOOoO(l);
        ArrayList arrayList = new ArrayList(o00oOOoO2);
        for (int i2 = 0; i2 < o00oOOoO2; i2++) {
            arrayList.add(interfaceC0137o00oOOoO.o00oOOo0(l, i2));
        }
        Collections.sort(arrayList, new o00oOo00(z, o00oooo02));
        if (i != 1) {
            if (i == 2) {
                return (T) o00oOo0O(t, arrayList, z2);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return (T) o00oOo0o(t, arrayList, z2);
    }

    public static int o00oOooo(int i, @oo0oO0 Rect rect, @oo0oO0 Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    public static int o00oo0(int i, @oo0oO0 Rect rect, @oo0oO0 Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    public static int o00oo00O(int i, @oo0oO0 Rect rect, @oo0oO0 Rect rect2) {
        return Math.max(1, o00oo0(i, rect, rect2));
    }

    public static int o00oo0OO(int i, @oo0oO0 Rect rect, @oo0oO0 Rect rect2) {
        int height;
        int i2;
        int height2;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = (rect.width() / 2) + rect.left;
            i2 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - ((height2 / 2) + i2));
        }
        height = (rect.height() / 2) + rect.top;
        i2 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - ((height2 / 2) + i2));
    }
}
