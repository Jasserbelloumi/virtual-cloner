package o0O0Oo0o;

import android.support.v4.media.o00oOo0O;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0OoO00O {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public View f11945o00oOOoO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Map<String, Object> f11944o00oOOo0 = new HashMap();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final ArrayList<androidx.transition.o0O0000O> f11946o00oOo00 = new ArrayList<>();

    @Deprecated
    public o0OoO00O() {
    }

    public o0OoO00O(@oo0oO0 View view) {
        this.f11945o00oOOoO = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o0OoO00O) {
            o0OoO00O o0ooo00o = (o0OoO00O) obj;
            return this.f11945o00oOOoO == o0ooo00o.f11945o00oOOoO && this.f11944o00oOOo0.equals(o0ooo00o.f11944o00oOOo0);
        }
        return false;
    }

    public int hashCode() {
        return this.f11944o00oOOo0.hashCode() + (this.f11945o00oOOoO.hashCode() * 31);
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("TransitionValues@");
        o00oOOo02.append(Integer.toHexString(hashCode()));
        o00oOOo02.append(":\n");
        StringBuilder o00oOOo03 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(o00oOOo02.toString(), "    view = ");
        o00oOOo03.append(this.f11945o00oOOoO);
        o00oOOo03.append("\n");
        String o00oOOo04 = o00oOoOo.o00oo.o00oOOo0(o00oOOo03.toString(), "    values:");
        for (String str : this.f11944o00oOOo0.keySet()) {
            o00oOOo04 = o00oOOo04 + "    " + str + ": " + this.f11944o00oOOo0.get(str) + "\n";
        }
        return o00oOOo04;
    }
}
