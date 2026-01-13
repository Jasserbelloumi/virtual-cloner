package o0O00;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oo {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f9968o00oOOoO = -1;
    @o0OO00OO

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Object f9969o00oOOo0;

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 extends AccessibilityNodeProvider {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oo f9970o00oOOo0;

        public o00oOOo0(o00oo o00ooVar) {
            this.f9970o00oOOo0 = o00ooVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            o00oo0O o00oOOoO2 = this.f9970o00oOOo0.o00oOOoO(i);
            if (o00oOOoO2 == null) {
                return null;
            }
            return o00oOOoO2.o0OOooO0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<o00oo0O> o00oOo002 = this.f9970o00oOOo0.o00oOo00(str, i);
            if (o00oOo002 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = o00oOo002.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(o00oOo002.get(i2).o0OOooO0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f9970o00oOOo0.o00oOo0o(i, i2, bundle);
        }
    }

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOoO extends o00oOOo0 {
        public o00oOOoO(o00oo o00ooVar) {
            super(o00ooVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            o00oo0O o00oOooO2 = this.f9970o00oOOo0.o00oOooO(i);
            if (o00oOooO2 == null) {
                return null;
            }
            return o00oOooO2.o0OOooO0();
        }
    }

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oOo00 extends o00oOOoO {
        public o00oOo00(o00oo o00ooVar) {
            super(o00ooVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f9970o00oOOo0.o00oOOo0(i, o00oo0O.o0OO0Ooo(accessibilityNodeInfo), str, bundle);
        }
    }

    public o00oo() {
        this.f9969o00oOOo0 = new o00oOo00(this);
    }

    public o00oo(@o0OO00OO Object obj) {
        this.f9969o00oOOo0 = obj;
    }

    public void o00oOOo0(int i, @oo0oO0 o00oo0O o00oo0o2, @oo0oO0 String str, @o0OO00OO Bundle bundle) {
    }

    @o0OO00OO
    public o00oo0O o00oOOoO(int i) {
        return null;
    }

    @o0OO00OO
    public List<o00oo0O> o00oOo00(@oo0oO0 String str, int i) {
        return null;
    }

    @o0OO00OO
    public Object o00oOo0O() {
        return this.f9969o00oOOo0;
    }

    public boolean o00oOo0o(int i, int i2, @o0OO00OO Bundle bundle) {
        return false;
    }

    @o0OO00OO
    public o00oo0O o00oOooO(int i) {
        return null;
    }
}
