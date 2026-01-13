package o0O0o0Oo;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import o0O0OOOo.o00oOOoO;
import o0O0OOOo.o00oOo00;
import o0O0OOOo.o00oo0;
import o0O0o0Oo.o0OoO00O;
/* loaded from: classes.dex */
public final class o0 implements o00ooO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0OO.o0O00O0o f12371o00oOOo0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Callable<List<o0OoO00O.o00oOo00>> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0O0OOoO.o0 f12372o00oOOo0;

        public o00oOOo0(o0O0OOoO.o0 o0Var) {
            this.f12372o00oOOo0 = o0Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: o00oOOo0 */
        public List<o0OoO00O.o00oOo00> call() throws Exception {
            Cursor o00oOooO2 = o00oOo00.o00oOooO(o0.this.f12371o00oOOo0, this.f12372o00oOOo0, true, null);
            try {
                int o00oOOoO2 = o00oOOoO.o00oOOoO(o00oOooO2, "id");
                int o00oOOoO3 = o00oOOoO.o00oOOoO(o00oOooO2, "state");
                int o00oOOoO4 = o00oOOoO.o00oOOoO(o00oOooO2, "output");
                int o00oOOoO5 = o00oOOoO.o00oOOoO(o00oOooO2, "run_attempt_count");
                androidx.collection.o00oOOo0<String, ArrayList<String>> o00oooo02 = new androidx.collection.o00oOOo0<>();
                androidx.collection.o00oOOo0<String, ArrayList<androidx.work.o00oOOoO>> o00oooo03 = new androidx.collection.o00oOOo0<>();
                while (o00oOooO2.moveToNext()) {
                    if (!o00oOooO2.isNull(o00oOOoO2)) {
                        String string = o00oOooO2.getString(o00oOOoO2);
                        if (o00oooo02.getOrDefault(string, null) == null) {
                            o00oooo02.put(string, new ArrayList<>());
                        }
                    }
                    if (!o00oOooO2.isNull(o00oOOoO2)) {
                        String string2 = o00oOooO2.getString(o00oOOoO2);
                        if (o00oooo03.getOrDefault(string2, null) == null) {
                            o00oooo03.put(string2, new ArrayList<>());
                        }
                    }
                }
                o00oOooO2.moveToPosition(-1);
                o0.this.o00oOooO(o00oooo02);
                o0.this.o00oOo00(o00oooo03);
                ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
                while (o00oOooO2.moveToNext()) {
                    ArrayList<String> orDefault = !o00oOooO2.isNull(o00oOOoO2) ? o00oooo02.getOrDefault(o00oOooO2.getString(o00oOOoO2), null) : null;
                    if (orDefault == null) {
                        orDefault = new ArrayList<>();
                    }
                    ArrayList<androidx.work.o00oOOoO> orDefault2 = !o00oOooO2.isNull(o00oOOoO2) ? o00oooo03.getOrDefault(o00oOooO2.getString(o00oOOoO2), null) : null;
                    if (orDefault2 == null) {
                        orDefault2 = new ArrayList<>();
                    }
                    o0OoO00O.o00oOo00 o00ooo002 = new o0OoO00O.o00oOo00();
                    if (o00oOOoO2 != -1) {
                        o00ooo002.f12482o00oOOo0 = o00oOooO2.getString(o00oOOoO2);
                    }
                    if (o00oOOoO3 != -1) {
                        o00ooo002.f12483o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOOoO3));
                    }
                    if (o00oOOoO4 != -1) {
                        o00ooo002.f12484o00oOo00 = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOOoO4));
                    }
                    if (o00oOOoO5 != -1) {
                        o00ooo002.f12487o00oOooO = o00oOooO2.getInt(o00oOOoO5);
                    }
                    o00ooo002.f12485o00oOo0O = orDefault;
                    o00ooo002.f12486o00oOo0o = orDefault2;
                    arrayList.add(o00ooo002);
                }
                return arrayList;
            } finally {
                o00oOooO2.close();
            }
        }
    }

    public o0(o0O0OO.o0O00O0o o0o00o0o) {
        this.f12371o00oOOo0 = o0o00o0o;
    }

    @Override // o0O0o0Oo.o00ooO
    public LiveData<List<o0OoO00O.o00oOo00>> o00oOOo0(o0O0OOoO.o0 o0Var) {
        return this.f12371o00oOOo0.o00oOooo().o00oOo0O(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new o00oOOo0(o0Var));
    }

    @Override // o0O0o0Oo.o00ooO
    public List<o0OoO00O.o00oOo00> o00oOOoO(o0O0OOoO.o0 o0Var) {
        this.f12371o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o00oOo00.o00oOooO(this.f12371o00oOOo0, o0Var, true, null);
        try {
            int o00oOOoO2 = o00oOOoO.o00oOOoO(o00oOooO2, "id");
            int o00oOOoO3 = o00oOOoO.o00oOOoO(o00oOooO2, "state");
            int o00oOOoO4 = o00oOOoO.o00oOOoO(o00oOooO2, "output");
            int o00oOOoO5 = o00oOOoO.o00oOOoO(o00oOooO2, "run_attempt_count");
            androidx.collection.o00oOOo0<String, ArrayList<String>> o00oooo02 = new androidx.collection.o00oOOo0<>();
            androidx.collection.o00oOOo0<String, ArrayList<androidx.work.o00oOOoO>> o00oooo03 = new androidx.collection.o00oOOo0<>();
            while (o00oOooO2.moveToNext()) {
                if (!o00oOooO2.isNull(o00oOOoO2)) {
                    String string = o00oOooO2.getString(o00oOOoO2);
                    if (o00oooo02.getOrDefault(string, null) == null) {
                        o00oooo02.put(string, new ArrayList<>());
                    }
                }
                if (!o00oOooO2.isNull(o00oOOoO2)) {
                    String string2 = o00oOooO2.getString(o00oOOoO2);
                    if (o00oooo03.getOrDefault(string2, null) == null) {
                        o00oooo03.put(string2, new ArrayList<>());
                    }
                }
            }
            o00oOooO2.moveToPosition(-1);
            o00oOooO(o00oooo02);
            o00oOo00(o00oooo03);
            ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
            while (o00oOooO2.moveToNext()) {
                ArrayList<String> orDefault = !o00oOooO2.isNull(o00oOOoO2) ? o00oooo02.getOrDefault(o00oOooO2.getString(o00oOOoO2), null) : null;
                if (orDefault == null) {
                    orDefault = new ArrayList<>();
                }
                ArrayList<androidx.work.o00oOOoO> orDefault2 = !o00oOooO2.isNull(o00oOOoO2) ? o00oooo03.getOrDefault(o00oOooO2.getString(o00oOOoO2), null) : null;
                if (orDefault2 == null) {
                    orDefault2 = new ArrayList<>();
                }
                o0OoO00O.o00oOo00 o00ooo002 = new o0OoO00O.o00oOo00();
                if (o00oOOoO2 != -1) {
                    o00ooo002.f12482o00oOOo0 = o00oOooO2.getString(o00oOOoO2);
                }
                if (o00oOOoO3 != -1) {
                    o00ooo002.f12483o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOOoO3));
                }
                if (o00oOOoO4 != -1) {
                    o00ooo002.f12484o00oOo00 = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOOoO4));
                }
                if (o00oOOoO5 != -1) {
                    o00ooo002.f12487o00oOooO = o00oOooO2.getInt(o00oOOoO5);
                }
                o00ooo002.f12485o00oOo0O = orDefault;
                o00ooo002.f12486o00oOo0o = orDefault2;
                arrayList.add(o00ooo002);
            }
            return arrayList;
        } finally {
            o00oOooO2.close();
        }
    }

    public final void o00oOo00(androidx.collection.o00oOOo0<String, ArrayList<androidx.work.o00oOOoO>> o00oooo02) {
        ArrayList<androidx.work.o00oOOoO> arrayList;
        Set<String> keySet = o00oooo02.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (o00oooo02.size() > 999) {
            androidx.collection.o00oOOo0<String, ArrayList<androidx.work.o00oOOoO>> o00oooo03 = new androidx.collection.o00oOOo0<>((int) o0O0OO.o0O00O0o.f11320o00oo00O);
            int size = o00oooo02.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                o00oooo03.put(o00oooo02.o00oOoOo(i), o00oooo02.o00oo0(i));
                i++;
                i2++;
                if (i2 == 999) {
                    o00oOo00(o00oooo03);
                    o00oooo03 = new androidx.collection.o00oOOo0<>((int) o0O0OO.o0O00O0o.f11320o00oo00O);
                    i2 = 0;
                }
            }
            if (i2 > 0) {
                o00oOo00(o00oooo03);
                return;
            }
            return;
        }
        StringBuilder o00oOo002 = o00oo0.o00oOo00();
        o00oOo002.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        o00oo0.o00oOOo0(o00oOo002, size2);
        o00oOo002.append(")");
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o(o00oOo002.toString(), size2 + 0);
        int i3 = 1;
        for (String str : keySet) {
            if (str == null) {
                o00oOo0o2.o0O0o00(i3);
            } else {
                o00oOo0o2.o0O0O0O(i3, str);
            }
            i3++;
        }
        Cursor o00oOooO2 = o00oOo00.o00oOooO(this.f12371o00oOOo0, o00oOo0o2, false, null);
        try {
            int o00oOOoO2 = o00oOOoO.o00oOOoO(o00oOooO2, "work_spec_id");
            if (o00oOOoO2 == -1) {
                return;
            }
            while (o00oOooO2.moveToNext()) {
                if (!o00oOooO2.isNull(o00oOOoO2) && (arrayList = o00oooo02.get(o00oOooO2.getString(o00oOOoO2))) != null) {
                    arrayList.add(androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(0)));
                }
            }
        } finally {
            o00oOooO2.close();
        }
    }

    public final void o00oOooO(androidx.collection.o00oOOo0<String, ArrayList<String>> o00oooo02) {
        ArrayList<String> arrayList;
        Set<String> keySet = o00oooo02.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (o00oooo02.size() > 999) {
            androidx.collection.o00oOOo0<String, ArrayList<String>> o00oooo03 = new androidx.collection.o00oOOo0<>((int) o0O0OO.o0O00O0o.f11320o00oo00O);
            int size = o00oooo02.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                o00oooo03.put(o00oooo02.o00oOoOo(i), o00oooo02.o00oo0(i));
                i++;
                i2++;
                if (i2 == 999) {
                    o00oOooO(o00oooo03);
                    o00oooo03 = new androidx.collection.o00oOOo0<>((int) o0O0OO.o0O00O0o.f11320o00oo00O);
                    i2 = 0;
                }
            }
            if (i2 > 0) {
                o00oOooO(o00oooo03);
                return;
            }
            return;
        }
        StringBuilder o00oOo002 = o00oo0.o00oOo00();
        o00oOo002.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        o00oo0.o00oOOo0(o00oOo002, size2);
        o00oOo002.append(")");
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o(o00oOo002.toString(), size2 + 0);
        int i3 = 1;
        for (String str : keySet) {
            if (str == null) {
                o00oOo0o2.o0O0o00(i3);
            } else {
                o00oOo0o2.o0O0O0O(i3, str);
            }
            i3++;
        }
        Cursor o00oOooO2 = o00oOo00.o00oOooO(this.f12371o00oOOo0, o00oOo0o2, false, null);
        try {
            int o00oOOoO2 = o00oOOoO.o00oOOoO(o00oOooO2, "work_spec_id");
            if (o00oOOoO2 == -1) {
                return;
            }
            while (o00oOooO2.moveToNext()) {
                if (!o00oOooO2.isNull(o00oOOoO2) && (arrayList = o00oooo02.get(o00oOooO2.getString(o00oOOoO2))) != null) {
                    arrayList.add(o00oOooO2.getString(0));
                }
            }
        } finally {
            o00oOooO2.close();
        }
    }
}
