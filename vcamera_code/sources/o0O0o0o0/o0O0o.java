package o0O0o0o0;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0O00O;
import o0O0Ooo0.o0OoO00O;
import o0O0o0Oo.o0O00o00;
/* loaded from: classes.dex */
public final class o0O0o {
    public static void o00oOOo0(@oo0oO0 StringBuilder sb, int i) {
        if (i <= 0) {
            return;
        }
        sb.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",");
            sb.append("?");
        }
    }

    @oo0oO0
    public static o0O0OOoO.o0 o00oOOoO(@oo0oO0 o0O00O o0o00o) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        List<o0OoO00O.o00oOOo0> list = o0o00o.f12180o00oOooO;
        String str = " AND";
        String str2 = " WHERE";
        if (!list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(list.size());
            for (o0OoO00O.o00oOOo0 o00oooo02 : list) {
                arrayList2.add(Integer.valueOf(o0O00o00.o00oOoOo(o00oooo02)));
            }
            sb.append(" WHERE");
            sb.append(" state IN (");
            o00oOOo0(sb, arrayList2.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        List<UUID> list2 = o0o00o.f12177o00oOOo0;
        if (!list2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(list2.size());
            for (UUID uuid : list2) {
                arrayList3.add(uuid.toString());
            }
            sb.append(str2);
            sb.append(" id IN (");
            o00oOOo0(sb, list2.size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        List<String> list3 = o0o00o.f12179o00oOo00;
        if (list3.isEmpty()) {
            str = str2;
        } else {
            sb.append(str2);
            sb.append(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            o00oOOo0(sb, list3.size());
            sb.append("))");
            arrayList.addAll(list3);
        }
        List<String> list4 = o0o00o.f12178o00oOOoO;
        if (!list4.isEmpty()) {
            sb.append(str);
            sb.append(" id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            o00oOOo0(sb, list4.size());
            sb.append("))");
            arrayList.addAll(list4);
        }
        sb.append(";");
        return new o0O0OOoO.o0O0o(sb.toString(), arrayList.toArray());
    }
}
