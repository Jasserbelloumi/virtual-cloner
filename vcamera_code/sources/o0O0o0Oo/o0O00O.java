package o0O0o0Oo;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import o0O0OO.o0O0O0O;
import o0O0Ooo0.o0OoO00O;
import o0O0o0Oo.o0OoO00O;
/* loaded from: classes.dex */
public final class o0O00O implements o0O00O0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0OO.o0O00O0o f12398o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0OO.o00oo0O<o0OoO00O> f12399o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0O0O0O f12400o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o0O0O0O f12401o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final o0O0O0O f12402o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final o0O0O0O f12403o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final o0O0O0O f12404o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final o0O0O0O f12405o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final o0O0O0O f12406o00oOoOo;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0O0O0O f12407o00oOooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Callable<List<String>> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0O0OO.o0O00OOO f12408o00oOOo0;

        public o00oOOo0(o0O0OO.o0O00OOO o0o00ooo) {
            this.f12408o00oOOo0 = o0o00ooo;
        }

        public void finalize() {
            this.f12408o00oOOo0.release();
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: o00oOOo0 */
        public List<String> call() throws Exception {
            o0O00O.this.f12398o00oOOo0.o00oOo00();
            try {
                Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(o0O00O.this.f12398o00oOOo0, this.f12408o00oOOo0, false, null);
                ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
                while (o00oOooO2.moveToNext()) {
                    arrayList.add(o00oOooO2.getString(0));
                }
                o0O00O.this.f12398o00oOOo0.o00ooO0o();
                o00oOooO2.close();
                return arrayList;
            } finally {
                o0O00O.this.f12398o00oOOo0.o00oOoOO();
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Callable<List<o0OoO00O.o00oOo00>> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0O0OO.o0O00OOO f12410o00oOOo0;

        public o00oOOoO(o0O0OO.o0O00OOO o0o00ooo) {
            this.f12410o00oOOo0 = o0o00ooo;
        }

        public void finalize() {
            this.f12410o00oOOo0.release();
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: o00oOOo0 */
        public List<o0OoO00O.o00oOo00> call() throws Exception {
            o0O00O.this.f12398o00oOOo0.o00oOo00();
            try {
                Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(o0O00O.this.f12398o00oOOo0, this.f12410o00oOOo0, true, null);
                int o00oOo002 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "id");
                int o00oOo003 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "state");
                int o00oOo004 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "output");
                int o00oOo005 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_attempt_count");
                androidx.collection.o00oOOo0<String, ArrayList<String>> o00oooo02 = new androidx.collection.o00oOOo0<>();
                androidx.collection.o00oOOo0<String, ArrayList<androidx.work.o00oOOoO>> o00oooo03 = new androidx.collection.o00oOOo0<>();
                while (o00oOooO2.moveToNext()) {
                    if (!o00oOooO2.isNull(o00oOo002)) {
                        String string = o00oOooO2.getString(o00oOo002);
                        if (o00oooo02.getOrDefault(string, null) == null) {
                            o00oooo02.put(string, new ArrayList<>());
                        }
                    }
                    if (!o00oOooO2.isNull(o00oOo002)) {
                        String string2 = o00oOooO2.getString(o00oOo002);
                        if (o00oooo03.getOrDefault(string2, null) == null) {
                            o00oooo03.put(string2, new ArrayList<>());
                        }
                    }
                }
                o00oOooO2.moveToPosition(-1);
                o0O00O.this.o00ooo00(o00oooo02);
                o0O00O.this.o00ooOoo(o00oooo03);
                ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
                while (o00oOooO2.moveToNext()) {
                    ArrayList<String> orDefault = !o00oOooO2.isNull(o00oOo002) ? o00oooo02.getOrDefault(o00oOooO2.getString(o00oOo002), null) : null;
                    if (orDefault == null) {
                        orDefault = new ArrayList<>();
                    }
                    ArrayList<androidx.work.o00oOOoO> orDefault2 = !o00oOooO2.isNull(o00oOo002) ? o00oooo03.getOrDefault(o00oOooO2.getString(o00oOo002), null) : null;
                    if (orDefault2 == null) {
                        orDefault2 = new ArrayList<>();
                    }
                    o0OoO00O.o00oOo00 o00ooo002 = new o0OoO00O.o00oOo00();
                    o00ooo002.f12482o00oOOo0 = o00oOooO2.getString(o00oOo002);
                    o00ooo002.f12483o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOo003));
                    o00ooo002.f12484o00oOo00 = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOo004));
                    o00ooo002.f12487o00oOooO = o00oOooO2.getInt(o00oOo005);
                    o00ooo002.f12485o00oOo0O = orDefault;
                    o00ooo002.f12486o00oOo0o = orDefault2;
                    arrayList.add(o00ooo002);
                }
                o0O00O.this.f12398o00oOOo0.o00ooO0o();
                o00oOooO2.close();
                return arrayList;
            } finally {
                o0O00O.this.f12398o00oOOo0.o00oOoOO();
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Callable<List<o0OoO00O.o00oOo00>> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0O0OO.o0O00OOO f12412o00oOOo0;

        public o00oOo00(o0O0OO.o0O00OOO o0o00ooo) {
            this.f12412o00oOOo0 = o0o00ooo;
        }

        public void finalize() {
            this.f12412o00oOOo0.release();
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: o00oOOo0 */
        public List<o0OoO00O.o00oOo00> call() throws Exception {
            o0O00O.this.f12398o00oOOo0.o00oOo00();
            try {
                Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(o0O00O.this.f12398o00oOOo0, this.f12412o00oOOo0, true, null);
                int o00oOo002 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "id");
                int o00oOo003 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "state");
                int o00oOo004 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "output");
                int o00oOo005 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_attempt_count");
                androidx.collection.o00oOOo0<String, ArrayList<String>> o00oooo02 = new androidx.collection.o00oOOo0<>();
                androidx.collection.o00oOOo0<String, ArrayList<androidx.work.o00oOOoO>> o00oooo03 = new androidx.collection.o00oOOo0<>();
                while (o00oOooO2.moveToNext()) {
                    if (!o00oOooO2.isNull(o00oOo002)) {
                        String string = o00oOooO2.getString(o00oOo002);
                        if (o00oooo02.getOrDefault(string, null) == null) {
                            o00oooo02.put(string, new ArrayList<>());
                        }
                    }
                    if (!o00oOooO2.isNull(o00oOo002)) {
                        String string2 = o00oOooO2.getString(o00oOo002);
                        if (o00oooo03.getOrDefault(string2, null) == null) {
                            o00oooo03.put(string2, new ArrayList<>());
                        }
                    }
                }
                o00oOooO2.moveToPosition(-1);
                o0O00O.this.o00ooo00(o00oooo02);
                o0O00O.this.o00ooOoo(o00oooo03);
                ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
                while (o00oOooO2.moveToNext()) {
                    ArrayList<String> orDefault = !o00oOooO2.isNull(o00oOo002) ? o00oooo02.getOrDefault(o00oOooO2.getString(o00oOo002), null) : null;
                    if (orDefault == null) {
                        orDefault = new ArrayList<>();
                    }
                    ArrayList<androidx.work.o00oOOoO> orDefault2 = !o00oOooO2.isNull(o00oOo002) ? o00oooo03.getOrDefault(o00oOooO2.getString(o00oOo002), null) : null;
                    if (orDefault2 == null) {
                        orDefault2 = new ArrayList<>();
                    }
                    o0OoO00O.o00oOo00 o00ooo002 = new o0OoO00O.o00oOo00();
                    o00ooo002.f12482o00oOOo0 = o00oOooO2.getString(o00oOo002);
                    o00ooo002.f12483o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOo003));
                    o00ooo002.f12484o00oOo00 = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOo004));
                    o00ooo002.f12487o00oOooO = o00oOooO2.getInt(o00oOo005);
                    o00ooo002.f12485o00oOo0O = orDefault;
                    o00ooo002.f12486o00oOo0o = orDefault2;
                    arrayList.add(o00ooo002);
                }
                o0O00O.this.f12398o00oOOo0.o00ooO0o();
                o00oOooO2.close();
                return arrayList;
            } finally {
                o0O00O.this.f12398o00oOOo0.o00oOoOO();
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements Callable<List<o0OoO00O.o00oOo00>> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0O0OO.o0O00OOO f12414o00oOOo0;

        public o00oOo0O(o0O0OO.o0O00OOO o0o00ooo) {
            this.f12414o00oOOo0 = o0o00ooo;
        }

        public void finalize() {
            this.f12414o00oOOo0.release();
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: o00oOOo0 */
        public List<o0OoO00O.o00oOo00> call() throws Exception {
            o0O00O.this.f12398o00oOOo0.o00oOo00();
            try {
                Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(o0O00O.this.f12398o00oOOo0, this.f12414o00oOOo0, true, null);
                int o00oOo002 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "id");
                int o00oOo003 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "state");
                int o00oOo004 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "output");
                int o00oOo005 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_attempt_count");
                androidx.collection.o00oOOo0<String, ArrayList<String>> o00oooo02 = new androidx.collection.o00oOOo0<>();
                androidx.collection.o00oOOo0<String, ArrayList<androidx.work.o00oOOoO>> o00oooo03 = new androidx.collection.o00oOOo0<>();
                while (o00oOooO2.moveToNext()) {
                    if (!o00oOooO2.isNull(o00oOo002)) {
                        String string = o00oOooO2.getString(o00oOo002);
                        if (o00oooo02.getOrDefault(string, null) == null) {
                            o00oooo02.put(string, new ArrayList<>());
                        }
                    }
                    if (!o00oOooO2.isNull(o00oOo002)) {
                        String string2 = o00oOooO2.getString(o00oOo002);
                        if (o00oooo03.getOrDefault(string2, null) == null) {
                            o00oooo03.put(string2, new ArrayList<>());
                        }
                    }
                }
                o00oOooO2.moveToPosition(-1);
                o0O00O.this.o00ooo00(o00oooo02);
                o0O00O.this.o00ooOoo(o00oooo03);
                ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
                while (o00oOooO2.moveToNext()) {
                    ArrayList<String> orDefault = !o00oOooO2.isNull(o00oOo002) ? o00oooo02.getOrDefault(o00oOooO2.getString(o00oOo002), null) : null;
                    if (orDefault == null) {
                        orDefault = new ArrayList<>();
                    }
                    ArrayList<androidx.work.o00oOOoO> orDefault2 = !o00oOooO2.isNull(o00oOo002) ? o00oooo03.getOrDefault(o00oOooO2.getString(o00oOo002), null) : null;
                    if (orDefault2 == null) {
                        orDefault2 = new ArrayList<>();
                    }
                    o0OoO00O.o00oOo00 o00ooo002 = new o0OoO00O.o00oOo00();
                    o00ooo002.f12482o00oOOo0 = o00oOooO2.getString(o00oOo002);
                    o00ooo002.f12483o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOo003));
                    o00ooo002.f12484o00oOo00 = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOo004));
                    o00ooo002.f12487o00oOooO = o00oOooO2.getInt(o00oOo005);
                    o00ooo002.f12485o00oOo0O = orDefault;
                    o00ooo002.f12486o00oOo0o = orDefault2;
                    arrayList.add(o00ooo002);
                }
                o0O00O.this.f12398o00oOOo0.o00ooO0o();
                o00oOooO2.close();
                return arrayList;
            } finally {
                o0O00O.this.f12398o00oOOo0.o00oOoOO();
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO implements Callable<Long> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0O0OO.o0O00OOO f12416o00oOOo0;

        public o00oOoO(o0O0OO.o0O00OOO o0o00ooo) {
            this.f12416o00oOOo0 = o0o00ooo;
        }

        public void finalize() {
            this.f12416o00oOOo0.release();
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: o00oOOo0 */
        public Long call() throws Exception {
            Long l = null;
            Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(o0O00O.this.f12398o00oOOo0, this.f12416o00oOOo0, false, null);
            try {
                if (o00oOooO2.moveToFirst() && !o00oOooO2.isNull(0)) {
                    l = Long.valueOf(o00oOooO2.getLong(0));
                }
                return l;
            } finally {
                o00oOooO2.close();
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oo extends o0O0O0O {
        public o00oo(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0 extends o0O0O0O {
        public o00oo0(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O extends o0O0OO.o00oo0O<o0OoO00O> {
        public o00oo00O(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // o0O0OO.o00oo0O
        /* renamed from: o00oo0Oo */
        public void o00oOoO0(o0O0OOoO.o0O0000O o0o0000o, o0OoO00O o0ooo00o) {
            String str = o0ooo00o.f12462o00oOOo0;
            if (str == null) {
                o0o0000o.o0O0o00(1);
            } else {
                o0o0000o.o0O0O0O(1, str);
            }
            o0o0000o.o0O0OOOo(2, o0O00o00.o00oOoOo(o0ooo00o.f12463o00oOOoO));
            String str2 = o0ooo00o.f12464o00oOo00;
            if (str2 == null) {
                o0o0000o.o0O0o00(3);
            } else {
                o0o0000o.o0O0O0O(3, str2);
            }
            String str3 = o0ooo00o.f12472o00oOooO;
            if (str3 == null) {
                o0o0000o.o0O0o00(4);
            } else {
                o0o0000o.o0O0O0O(4, str3);
            }
            byte[] o00ooOo02 = androidx.work.o00oOOoO.o00ooOo0(o0ooo00o.f12465o00oOo0O);
            if (o00ooOo02 == null) {
                o0o0000o.o0O0o00(5);
            } else {
                o0o0000o.o0OooO0(5, o00ooOo02);
            }
            byte[] o00ooOo03 = androidx.work.o00oOOoO.o00ooOo0(o0ooo00o.f12466o00oOo0o);
            if (o00ooOo03 == null) {
                o0o0000o.o0O0o00(6);
            } else {
                o0o0000o.o0OooO0(6, o00ooOo03);
            }
            o0o0000o.o0O0OOOo(7, o0ooo00o.f12468o00oOoO0);
            o0o0000o.o0O0OOOo(8, o0ooo00o.f12467o00oOoO);
            o0o0000o.o0O0OOOo(9, o0ooo00o.f12469o00oOoOO);
            o0o0000o.o0O0OOOo(10, o0ooo00o.f12471o00oOoo0);
            o0o0000o.o0O0OOOo(11, o0O00o00.o00oOOo0(o0ooo00o.f12473o00oOooo));
            o0o0000o.o0O0OOOo(12, o0ooo00o.f12475o00oo00O);
            o0o0000o.o0O0OOOo(13, o0ooo00o.f12474o00oo0);
            o0o0000o.o0O0OOOo(14, o0ooo00o.f12478o00oo0OO);
            o0o0000o.o0O0OOOo(15, o0ooo00o.f12477o00oo0O0);
            o0o0000o.o0O0OOOo(16, o0ooo00o.f12476o00oo0O ? 1L : 0L);
            o0o0000o.o0O0OOOo(17, o0O00o00.o00oOoOO(o0ooo00o.f12479o00oo0Oo));
            o0O0Ooo0.o00oo00O o00oo00o = o0ooo00o.f12470o00oOoOo;
            if (o00oo00o != null) {
                o0o0000o.o0O0OOOo(18, o0O00o00.o00oOoO(o00oo00o.f12148o00oOOo0));
                o0o0000o.o0O0OOOo(19, o00oo00o.f12149o00oOOoO ? 1L : 0L);
                o0o0000o.o0O0OOOo(20, o00oo00o.f12150o00oOo00 ? 1L : 0L);
                o0o0000o.o0O0OOOo(21, o00oo00o.f12155o00oOooO ? 1L : 0L);
                o0o0000o.o0O0OOOo(22, o00oo00o.f12151o00oOo0O ? 1L : 0L);
                o0o0000o.o0O0OOOo(23, o00oo00o.f12152o00oOo0o);
                o0o0000o.o0O0OOOo(24, o00oo00o.f12154o00oOoO0);
                byte[] o00oOo002 = o0O00o00.o00oOo00(o00oo00o.f12153o00oOoO);
                if (o00oOo002 != null) {
                    o0o0000o.o0OooO0(25, o00oOo002);
                    return;
                }
            } else {
                o0o0000o.o0O0o00(18);
                o0o0000o.o0O0o00(19);
                o0o0000o.o0O0o00(20);
                o0o0000o.o0O0o00(21);
                o0o0000o.o0O0o00(22);
                o0o0000o.o0O0o00(23);
                o0o0000o.o0O0o00(24);
            }
            o0o0000o.o0O0o00(25);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0O extends o0O0O0O {
        public o00oo0O(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0O0 extends o0O0O0O {
        public o00oo0O0(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0OO extends o0O0O0O {
        public o00oo0OO(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class o00ooO extends o0O0O0O {
        public o00ooO(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* loaded from: classes.dex */
    public class o00ooO0 extends o0O0O0O {
        public o00ooO0(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* loaded from: classes.dex */
    public class o0O0o extends o0O0O0O {
        public o0O0o(o0O0OO.o0O00O0o o0o00o0o) {
            super(o0o00o0o);
        }

        @Override // o0O0OO.o0O0O0O
        public String o00oOooO() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public o0O00O(o0O0OO.o0O00O0o o0o00o0o) {
        this.f12398o00oOOo0 = o0o00o0o;
        this.f12399o00oOOoO = new o00oo00O(o0o00o0o);
        this.f12400o00oOo00 = new o00oo0(o0o00o0o);
        this.f12407o00oOooO = new o00oo0OO(o0o00o0o);
        this.f12401o00oOo0O = new o00oo0O0(o0o00o0o);
        this.f12402o00oOo0o = new o00oo0O(o0o00o0o);
        this.f12404o00oOoO0 = new o0O0o(o0o00o0o);
        this.f12403o00oOoO = new o00oo(o0o00o0o);
        this.f12405o00oOoOO = new o00ooO0(o0o00o0o);
        this.f12406o00oOoOo = new o00ooO(o0o00o0o);
    }

    @Override // o0O0o0Oo.o0O00O0o
    public void o00oOOo0(String str) {
        this.f12398o00oOOo0.o00oOOoO();
        o0O0OOoO.o0O0000O o00oOOo02 = this.f12400o00oOo00.o00oOOo0();
        if (str == null) {
            o00oOOo02.o0O0o00(1);
        } else {
            o00oOOo02.o0O0O0O(1, str);
        }
        this.f12398o00oOOo0.o00oOo00();
        try {
            o00oOOo02.o00oo0oO();
            this.f12398o00oOOo0.o00ooO0o();
        } finally {
            this.f12398o00oOOo0.o00oOoOO();
            this.f12400o00oOo00.o00oOo0o(o00oOOo02);
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public void o00oOOoO() {
        this.f12398o00oOOo0.o00oOOoO();
        o0O0OOoO.o0O0000O o00oOOo02 = this.f12406o00oOoOo.o00oOOo0();
        this.f12398o00oOOo0.o00oOo00();
        try {
            o00oOOo02.o00oo0oO();
            this.f12398o00oOOo0.o00ooO0o();
        } finally {
            this.f12398o00oOOo0.o00oOoOO();
            this.f12406o00oOoOo.o00oOo0o(o00oOOo02);
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public List<o0OoO00O> o00oOo00(long j) {
        o0O0OO.o0O00OOO o0o00ooo;
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        o00oOo0o2.o0O0OOOo(1, j);
        this.f12398o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            int o00oOo002 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "required_network_type");
            int o00oOo003 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_charging");
            int o00oOo004 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_device_idle");
            int o00oOo005 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_battery_not_low");
            int o00oOo006 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_storage_not_low");
            int o00oOo007 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "trigger_content_update_delay");
            int o00oOo008 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "trigger_max_content_delay");
            int o00oOo009 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "content_uri_triggers");
            int o00oOo0010 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "id");
            int o00oOo0011 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "state");
            int o00oOo0012 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "worker_class_name");
            int o00oOo0013 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "input_merger_class_name");
            int o00oOo0014 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "input");
            int o00oOo0015 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "output");
            o0o00ooo = o00oOo0o2;
            try {
                int o00oOo0016 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "initial_delay");
                int o00oOo0017 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "interval_duration");
                int o00oOo0018 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "flex_duration");
                int o00oOo0019 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_attempt_count");
                int o00oOo0020 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "backoff_policy");
                int o00oOo0021 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "backoff_delay_duration");
                int o00oOo0022 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "period_start_time");
                int o00oOo0023 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "minimum_retention_duration");
                int o00oOo0024 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "schedule_requested_at");
                int o00oOo0025 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_in_foreground");
                int o00oOo0026 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "out_of_quota_policy");
                int i = o00oOo0015;
                ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
                while (o00oOooO2.moveToNext()) {
                    String string = o00oOooO2.getString(o00oOo0010);
                    int i2 = o00oOo0010;
                    String string2 = o00oOooO2.getString(o00oOo0012);
                    int i3 = o00oOo0012;
                    o0O0Ooo0.o00oo00O o00oo00o = new o0O0Ooo0.o00oo00O();
                    int i4 = o00oOo002;
                    o00oo00o.f12148o00oOOo0 = o0O00o00.o00oOo0O(o00oOooO2.getInt(o00oOo002));
                    o00oo00o.f12149o00oOOoO = o00oOooO2.getInt(o00oOo003) != 0;
                    o00oo00o.f12150o00oOo00 = o00oOooO2.getInt(o00oOo004) != 0;
                    o00oo00o.f12155o00oOooO = o00oOooO2.getInt(o00oOo005) != 0;
                    o00oo00o.f12151o00oOo0O = o00oOooO2.getInt(o00oOo006) != 0;
                    int i5 = o00oOo003;
                    int i6 = o00oOo004;
                    o00oo00o.f12152o00oOo0o = o00oOooO2.getLong(o00oOo007);
                    o00oo00o.f12154o00oOoO0 = o00oOooO2.getLong(o00oOo008);
                    o00oo00o.f12153o00oOoO = o0O00o00.o00oOOoO(o00oOooO2.getBlob(o00oOo009));
                    o0OoO00O o0ooo00o = new o0OoO00O(string, string2);
                    o0ooo00o.f12463o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOo0011));
                    o0ooo00o.f12472o00oOooO = o00oOooO2.getString(o00oOo0013);
                    o0ooo00o.f12465o00oOo0O = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOo0014));
                    int i7 = i;
                    o0ooo00o.f12466o00oOo0o = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(i7));
                    int i8 = o00oOo0016;
                    i = i7;
                    o0ooo00o.f12468o00oOoO0 = o00oOooO2.getLong(i8);
                    int i9 = o00oOo0013;
                    int i10 = o00oOo0017;
                    o0ooo00o.f12467o00oOoO = o00oOooO2.getLong(i10);
                    int i11 = o00oOo005;
                    int i12 = o00oOo0018;
                    o0ooo00o.f12469o00oOoOO = o00oOooO2.getLong(i12);
                    int i13 = o00oOo0019;
                    o0ooo00o.f12471o00oOoo0 = o00oOooO2.getInt(i13);
                    int i14 = o00oOo0020;
                    o0ooo00o.f12473o00oOooo = o0O00o00.o00oOooO(o00oOooO2.getInt(i14));
                    o00oOo0018 = i12;
                    int i15 = o00oOo0021;
                    o0ooo00o.f12475o00oo00O = o00oOooO2.getLong(i15);
                    int i16 = o00oOo0022;
                    o0ooo00o.f12474o00oo0 = o00oOooO2.getLong(i16);
                    o00oOo0022 = i16;
                    int i17 = o00oOo0023;
                    o0ooo00o.f12478o00oo0OO = o00oOooO2.getLong(i17);
                    int i18 = o00oOo0024;
                    o0ooo00o.f12477o00oo0O0 = o00oOooO2.getLong(i18);
                    int i19 = o00oOo0025;
                    o0ooo00o.f12476o00oo0O = o00oOooO2.getInt(i19) != 0;
                    int i20 = o00oOo0026;
                    o0ooo00o.f12479o00oo0Oo = o0O00o00.o00oOo0o(o00oOooO2.getInt(i20));
                    o0ooo00o.f12470o00oOoOo = o00oo00o;
                    arrayList.add(o0ooo00o);
                    o00oOo003 = i5;
                    o00oOo0026 = i20;
                    o00oOo0013 = i9;
                    o00oOo0016 = i8;
                    o00oOo0017 = i10;
                    o00oOo0019 = i13;
                    o00oOo0024 = i18;
                    o00oOo0010 = i2;
                    o00oOo0012 = i3;
                    o00oOo002 = i4;
                    o00oOo0025 = i19;
                    o00oOo0023 = i17;
                    o00oOo004 = i6;
                    o00oOo0021 = i15;
                    o00oOo005 = i11;
                    o00oOo0020 = i14;
                }
                o00oOooO2.close();
                o0o00ooo.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o00oOooO2.close();
                o0o00ooo.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            o0o00ooo = o00oOo0o2;
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public o0OoO00O[] o00oOo0O(List<String> list) {
        o0O0OO.o0O00OOO o0o00ooo;
        StringBuilder o00oOo002 = o0O0OOOo.o00oo0.o00oOo00();
        o00oOo002.append("SELECT ");
        o00oOo002.append("*");
        o00oOo002.append(" FROM workspec WHERE id IN (");
        int size = list.size();
        o0O0OOOo.o00oo0.o00oOOo0(o00oOo002, size);
        o00oOo002.append(")");
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o(o00oOo002.toString(), size + 0);
        int i = 1;
        for (String str : list) {
            if (str == null) {
                o00oOo0o2.o0O0o00(i);
            } else {
                o00oOo0o2.o0O0O0O(i, str);
            }
            i++;
        }
        this.f12398o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            int o00oOo003 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "required_network_type");
            int o00oOo004 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_charging");
            int o00oOo005 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_device_idle");
            int o00oOo006 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_battery_not_low");
            int o00oOo007 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_storage_not_low");
            int o00oOo008 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "trigger_content_update_delay");
            int o00oOo009 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "trigger_max_content_delay");
            int o00oOo0010 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "content_uri_triggers");
            int o00oOo0011 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "id");
            int o00oOo0012 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "state");
            int o00oOo0013 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "worker_class_name");
            int o00oOo0014 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "input_merger_class_name");
            int o00oOo0015 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "input");
            int o00oOo0016 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "output");
            o0o00ooo = o00oOo0o2;
            try {
                int o00oOo0017 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "initial_delay");
                int o00oOo0018 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "interval_duration");
                int o00oOo0019 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "flex_duration");
                int o00oOo0020 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_attempt_count");
                int o00oOo0021 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "backoff_policy");
                int o00oOo0022 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "backoff_delay_duration");
                int o00oOo0023 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "period_start_time");
                int o00oOo0024 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "minimum_retention_duration");
                int o00oOo0025 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "schedule_requested_at");
                int o00oOo0026 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_in_foreground");
                int o00oOo0027 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "out_of_quota_policy");
                o0OoO00O[] o0ooo00oArr = new o0OoO00O[o00oOooO2.getCount()];
                int i2 = 0;
                while (o00oOooO2.moveToNext()) {
                    o0OoO00O[] o0ooo00oArr2 = o0ooo00oArr;
                    String string = o00oOooO2.getString(o00oOo0011);
                    int i3 = o00oOo0011;
                    String string2 = o00oOooO2.getString(o00oOo0013);
                    int i4 = o00oOo0013;
                    o0O0Ooo0.o00oo00O o00oo00o = new o0O0Ooo0.o00oo00O();
                    int i5 = o00oOo003;
                    o00oo00o.f12148o00oOOo0 = o0O00o00.o00oOo0O(o00oOooO2.getInt(o00oOo003));
                    o00oo00o.f12149o00oOOoO = o00oOooO2.getInt(o00oOo004) != 0;
                    o00oo00o.f12150o00oOo00 = o00oOooO2.getInt(o00oOo005) != 0;
                    o00oo00o.f12155o00oOooO = o00oOooO2.getInt(o00oOo006) != 0;
                    o00oo00o.f12151o00oOo0O = o00oOooO2.getInt(o00oOo007) != 0;
                    int i6 = o00oOo004;
                    int i7 = o00oOo005;
                    o00oo00o.f12152o00oOo0o = o00oOooO2.getLong(o00oOo008);
                    o00oo00o.f12154o00oOoO0 = o00oOooO2.getLong(o00oOo009);
                    o00oo00o.f12153o00oOoO = o0O00o00.o00oOOoO(o00oOooO2.getBlob(o00oOo0010));
                    o0OoO00O o0ooo00o = new o0OoO00O(string, string2);
                    o0ooo00o.f12463o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOo0012));
                    o0ooo00o.f12472o00oOooO = o00oOooO2.getString(o00oOo0014);
                    o0ooo00o.f12465o00oOo0O = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOo0015));
                    o0ooo00o.f12466o00oOo0o = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOo0016));
                    int i8 = o00oOo0016;
                    int i9 = o00oOo0017;
                    o0ooo00o.f12468o00oOoO0 = o00oOooO2.getLong(i9);
                    o00oOo0017 = i9;
                    int i10 = o00oOo0018;
                    o0ooo00o.f12467o00oOoO = o00oOooO2.getLong(i10);
                    int i11 = o00oOo0014;
                    int i12 = o00oOo0019;
                    o0ooo00o.f12469o00oOoOO = o00oOooO2.getLong(i12);
                    int i13 = o00oOo0020;
                    o0ooo00o.f12471o00oOoo0 = o00oOooO2.getInt(i13);
                    int i14 = o00oOo0021;
                    o0ooo00o.f12473o00oOooo = o0O00o00.o00oOooO(o00oOooO2.getInt(i14));
                    o00oOo0019 = i12;
                    int i15 = o00oOo0022;
                    o0ooo00o.f12475o00oo00O = o00oOooO2.getLong(i15);
                    int i16 = o00oOo0023;
                    o0ooo00o.f12474o00oo0 = o00oOooO2.getLong(i16);
                    o00oOo0023 = i16;
                    int i17 = o00oOo0024;
                    o0ooo00o.f12478o00oo0OO = o00oOooO2.getLong(i17);
                    o00oOo0024 = i17;
                    int i18 = o00oOo0025;
                    o0ooo00o.f12477o00oo0O0 = o00oOooO2.getLong(i18);
                    int i19 = o00oOo0026;
                    o0ooo00o.f12476o00oo0O = o00oOooO2.getInt(i19) != 0;
                    int i20 = o00oOo0027;
                    o0ooo00o.f12479o00oo0Oo = o0O00o00.o00oOo0o(o00oOooO2.getInt(i20));
                    o0ooo00o.f12470o00oOoOo = o00oo00o;
                    o0ooo00oArr2[i2] = o0ooo00o;
                    i2++;
                    o00oOo0027 = i20;
                    o00oOo004 = i6;
                    o00oOo0025 = i18;
                    o0ooo00oArr = o0ooo00oArr2;
                    o00oOo0011 = i3;
                    o00oOo0013 = i4;
                    o00oOo003 = i5;
                    o00oOo0026 = i19;
                    o00oOo0016 = i8;
                    o00oOo005 = i7;
                    o00oOo0022 = i15;
                    o00oOo0014 = i11;
                    o00oOo0018 = i10;
                    o00oOo0020 = i13;
                    o00oOo0021 = i14;
                }
                o0OoO00O[] o0ooo00oArr3 = o0ooo00oArr;
                o00oOooO2.close();
                o0o00ooo.release();
                return o0ooo00oArr3;
            } catch (Throwable th) {
                th = th;
                o00oOooO2.close();
                o0o00ooo.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            o0o00ooo = o00oOo0o2;
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public List<String> o00oOo0o(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12398o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
            while (o00oOooO2.moveToNext()) {
                arrayList.add(o00oOooO2.getString(0));
            }
            return arrayList;
        } finally {
            o00oOooO2.close();
            o00oOo0o2.release();
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public o0OoO00O.o00oOOo0 o00oOoO(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12398o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            return o00oOooO2.moveToFirst() ? o0O00o00.o00oOoO0(o00oOooO2.getInt(0)) : null;
        } finally {
            o00oOooO2.close();
            o00oOo0o2.release();
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public o0OoO00O.o00oOo00 o00oOoO0(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=?", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12398o00oOOo0.o00oOOoO();
        this.f12398o00oOOo0.o00oOo00();
        try {
            o0OoO00O.o00oOo00 o00ooo002 = null;
            Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, true, null);
            int o00oOo002 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "id");
            int o00oOo003 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "state");
            int o00oOo004 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "output");
            int o00oOo005 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_attempt_count");
            androidx.collection.o00oOOo0<String, ArrayList<String>> o00oooo02 = new androidx.collection.o00oOOo0<>();
            androidx.collection.o00oOOo0<String, ArrayList<androidx.work.o00oOOoO>> o00oooo03 = new androidx.collection.o00oOOo0<>();
            while (o00oOooO2.moveToNext()) {
                if (!o00oOooO2.isNull(o00oOo002)) {
                    String string = o00oOooO2.getString(o00oOo002);
                    if (o00oooo02.getOrDefault(string, null) == null) {
                        o00oooo02.put(string, new ArrayList<>());
                    }
                }
                if (!o00oOooO2.isNull(o00oOo002)) {
                    String string2 = o00oOooO2.getString(o00oOo002);
                    if (o00oooo03.getOrDefault(string2, null) == null) {
                        o00oooo03.put(string2, new ArrayList<>());
                    }
                }
            }
            o00oOooO2.moveToPosition(-1);
            o00ooo00(o00oooo02);
            o00ooOoo(o00oooo03);
            if (o00oOooO2.moveToFirst()) {
                ArrayList<String> orDefault = !o00oOooO2.isNull(o00oOo002) ? o00oooo02.getOrDefault(o00oOooO2.getString(o00oOo002), null) : null;
                if (orDefault == null) {
                    orDefault = new ArrayList<>();
                }
                ArrayList<androidx.work.o00oOOoO> orDefault2 = o00oOooO2.isNull(o00oOo002) ? null : o00oooo03.getOrDefault(o00oOooO2.getString(o00oOo002), null);
                if (orDefault2 == null) {
                    orDefault2 = new ArrayList<>();
                }
                o0OoO00O.o00oOo00 o00ooo003 = new o0OoO00O.o00oOo00();
                o00ooo003.f12482o00oOOo0 = o00oOooO2.getString(o00oOo002);
                o00ooo003.f12483o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOo003));
                o00ooo003.f12484o00oOo00 = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOo004));
                o00ooo003.f12487o00oOooO = o00oOooO2.getInt(o00oOo005);
                o00ooo003.f12485o00oOo0O = orDefault;
                o00ooo003.f12486o00oOo0o = orDefault2;
                o00ooo002 = o00ooo003;
            }
            this.f12398o00oOOo0.o00ooO0o();
            o00oOooO2.close();
            o00oOo0o2.release();
            return o00ooo002;
        } finally {
            this.f12398o00oOOo0.o00oOoOO();
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public o0OoO00O o00oOoOO(String str) {
        o0O0OO.o0O00OOO o0o00ooo;
        o0OoO00O o0ooo00o;
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12398o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            int o00oOo002 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "required_network_type");
            int o00oOo003 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_charging");
            int o00oOo004 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_device_idle");
            int o00oOo005 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_battery_not_low");
            int o00oOo006 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_storage_not_low");
            int o00oOo007 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "trigger_content_update_delay");
            int o00oOo008 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "trigger_max_content_delay");
            int o00oOo009 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "content_uri_triggers");
            int o00oOo0010 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "id");
            int o00oOo0011 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "state");
            int o00oOo0012 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "worker_class_name");
            int o00oOo0013 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "input_merger_class_name");
            int o00oOo0014 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "input");
            int o00oOo0015 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "output");
            o0o00ooo = o00oOo0o2;
            try {
                int o00oOo0016 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "initial_delay");
                int o00oOo0017 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "interval_duration");
                int o00oOo0018 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "flex_duration");
                int o00oOo0019 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_attempt_count");
                int o00oOo0020 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "backoff_policy");
                int o00oOo0021 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "backoff_delay_duration");
                int o00oOo0022 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "period_start_time");
                int o00oOo0023 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "minimum_retention_duration");
                int o00oOo0024 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "schedule_requested_at");
                int o00oOo0025 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_in_foreground");
                int o00oOo0026 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "out_of_quota_policy");
                if (o00oOooO2.moveToFirst()) {
                    String string = o00oOooO2.getString(o00oOo0010);
                    String string2 = o00oOooO2.getString(o00oOo0012);
                    o0O0Ooo0.o00oo00O o00oo00o = new o0O0Ooo0.o00oo00O();
                    o00oo00o.f12148o00oOOo0 = o0O00o00.o00oOo0O(o00oOooO2.getInt(o00oOo002));
                    o00oo00o.f12149o00oOOoO = o00oOooO2.getInt(o00oOo003) != 0;
                    o00oo00o.f12150o00oOo00 = o00oOooO2.getInt(o00oOo004) != 0;
                    o00oo00o.f12155o00oOooO = o00oOooO2.getInt(o00oOo005) != 0;
                    o00oo00o.f12151o00oOo0O = o00oOooO2.getInt(o00oOo006) != 0;
                    o00oo00o.f12152o00oOo0o = o00oOooO2.getLong(o00oOo007);
                    o00oo00o.f12154o00oOoO0 = o00oOooO2.getLong(o00oOo008);
                    o00oo00o.f12153o00oOoO = o0O00o00.o00oOOoO(o00oOooO2.getBlob(o00oOo009));
                    o0OoO00O o0ooo00o2 = new o0OoO00O(string, string2);
                    o0ooo00o2.f12463o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOo0011));
                    o0ooo00o2.f12472o00oOooO = o00oOooO2.getString(o00oOo0013);
                    o0ooo00o2.f12465o00oOo0O = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOo0014));
                    o0ooo00o2.f12466o00oOo0o = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOo0015));
                    o0ooo00o2.f12468o00oOoO0 = o00oOooO2.getLong(o00oOo0016);
                    o0ooo00o2.f12467o00oOoO = o00oOooO2.getLong(o00oOo0017);
                    o0ooo00o2.f12469o00oOoOO = o00oOooO2.getLong(o00oOo0018);
                    o0ooo00o2.f12471o00oOoo0 = o00oOooO2.getInt(o00oOo0019);
                    o0ooo00o2.f12473o00oOooo = o0O00o00.o00oOooO(o00oOooO2.getInt(o00oOo0020));
                    o0ooo00o2.f12475o00oo00O = o00oOooO2.getLong(o00oOo0021);
                    o0ooo00o2.f12474o00oo0 = o00oOooO2.getLong(o00oOo0022);
                    o0ooo00o2.f12478o00oo0OO = o00oOooO2.getLong(o00oOo0023);
                    o0ooo00o2.f12477o00oo0O0 = o00oOooO2.getLong(o00oOo0024);
                    o0ooo00o2.f12476o00oo0O = o00oOooO2.getInt(o00oOo0025) != 0;
                    o0ooo00o2.f12479o00oo0Oo = o0O00o00.o00oOo0o(o00oOooO2.getInt(o00oOo0026));
                    o0ooo00o2.f12470o00oOoOo = o00oo00o;
                    o0ooo00o = o0ooo00o2;
                } else {
                    o0ooo00o = null;
                }
                o00oOooO2.close();
                o0o00ooo.release();
                return o0ooo00o;
            } catch (Throwable th) {
                th = th;
                o00oOooO2.close();
                o0o00ooo.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            o0o00ooo = o00oOo0o2;
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public LiveData<Long> o00oOoOo(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        return this.f12398o00oOOo0.o00oOooo().o00oOo0O(new String[]{"workspec"}, false, new o00oOoO(o00oOo0o2));
    }

    @Override // o0O0o0Oo.o0O00O0o
    public List<String> o00oOoo0(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12398o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
            while (o00oOooO2.moveToNext()) {
                arrayList.add(o00oOooO2.getString(0));
            }
            return arrayList;
        } finally {
            o00oOooO2.close();
            o00oOo0o2.release();
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public List<o0OoO00O> o00oOooO() {
        o0O0OO.o0O00OOO o0o00ooo;
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f12398o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            int o00oOo002 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "required_network_type");
            int o00oOo003 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_charging");
            int o00oOo004 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_device_idle");
            int o00oOo005 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_battery_not_low");
            int o00oOo006 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_storage_not_low");
            int o00oOo007 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "trigger_content_update_delay");
            int o00oOo008 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "trigger_max_content_delay");
            int o00oOo009 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "content_uri_triggers");
            int o00oOo0010 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "id");
            int o00oOo0011 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "state");
            int o00oOo0012 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "worker_class_name");
            int o00oOo0013 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "input_merger_class_name");
            int o00oOo0014 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "input");
            int o00oOo0015 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "output");
            o0o00ooo = o00oOo0o2;
            try {
                int o00oOo0016 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "initial_delay");
                int o00oOo0017 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "interval_duration");
                int o00oOo0018 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "flex_duration");
                int o00oOo0019 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_attempt_count");
                int o00oOo0020 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "backoff_policy");
                int o00oOo0021 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "backoff_delay_duration");
                int o00oOo0022 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "period_start_time");
                int o00oOo0023 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "minimum_retention_duration");
                int o00oOo0024 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "schedule_requested_at");
                int o00oOo0025 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_in_foreground");
                int o00oOo0026 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "out_of_quota_policy");
                int i = o00oOo0015;
                ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
                while (o00oOooO2.moveToNext()) {
                    String string = o00oOooO2.getString(o00oOo0010);
                    int i2 = o00oOo0010;
                    String string2 = o00oOooO2.getString(o00oOo0012);
                    int i3 = o00oOo0012;
                    o0O0Ooo0.o00oo00O o00oo00o = new o0O0Ooo0.o00oo00O();
                    int i4 = o00oOo002;
                    o00oo00o.f12148o00oOOo0 = o0O00o00.o00oOo0O(o00oOooO2.getInt(o00oOo002));
                    o00oo00o.f12149o00oOOoO = o00oOooO2.getInt(o00oOo003) != 0;
                    o00oo00o.f12150o00oOo00 = o00oOooO2.getInt(o00oOo004) != 0;
                    o00oo00o.f12155o00oOooO = o00oOooO2.getInt(o00oOo005) != 0;
                    o00oo00o.f12151o00oOo0O = o00oOooO2.getInt(o00oOo006) != 0;
                    int i5 = o00oOo003;
                    int i6 = o00oOo004;
                    o00oo00o.f12152o00oOo0o = o00oOooO2.getLong(o00oOo007);
                    o00oo00o.f12154o00oOoO0 = o00oOooO2.getLong(o00oOo008);
                    o00oo00o.f12153o00oOoO = o0O00o00.o00oOOoO(o00oOooO2.getBlob(o00oOo009));
                    o0OoO00O o0ooo00o = new o0OoO00O(string, string2);
                    o0ooo00o.f12463o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOo0011));
                    o0ooo00o.f12472o00oOooO = o00oOooO2.getString(o00oOo0013);
                    o0ooo00o.f12465o00oOo0O = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOo0014));
                    int i7 = i;
                    o0ooo00o.f12466o00oOo0o = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(i7));
                    i = i7;
                    int i8 = o00oOo0016;
                    o0ooo00o.f12468o00oOoO0 = o00oOooO2.getLong(i8);
                    int i9 = o00oOo0014;
                    int i10 = o00oOo0017;
                    o0ooo00o.f12467o00oOoO = o00oOooO2.getLong(i10);
                    int i11 = o00oOo005;
                    int i12 = o00oOo0018;
                    o0ooo00o.f12469o00oOoOO = o00oOooO2.getLong(i12);
                    int i13 = o00oOo0019;
                    o0ooo00o.f12471o00oOoo0 = o00oOooO2.getInt(i13);
                    int i14 = o00oOo0020;
                    o0ooo00o.f12473o00oOooo = o0O00o00.o00oOooO(o00oOooO2.getInt(i14));
                    o00oOo0018 = i12;
                    int i15 = o00oOo0021;
                    o0ooo00o.f12475o00oo00O = o00oOooO2.getLong(i15);
                    int i16 = o00oOo0022;
                    o0ooo00o.f12474o00oo0 = o00oOooO2.getLong(i16);
                    o00oOo0022 = i16;
                    int i17 = o00oOo0023;
                    o0ooo00o.f12478o00oo0OO = o00oOooO2.getLong(i17);
                    int i18 = o00oOo0024;
                    o0ooo00o.f12477o00oo0O0 = o00oOooO2.getLong(i18);
                    int i19 = o00oOo0025;
                    o0ooo00o.f12476o00oo0O = o00oOooO2.getInt(i19) != 0;
                    int i20 = o00oOo0026;
                    o0ooo00o.f12479o00oo0Oo = o0O00o00.o00oOo0o(o00oOooO2.getInt(i20));
                    o0ooo00o.f12470o00oOoOo = o00oo00o;
                    arrayList.add(o0ooo00o);
                    o00oOo0026 = i20;
                    o00oOo003 = i5;
                    o00oOo0014 = i9;
                    o00oOo0016 = i8;
                    o00oOo0017 = i10;
                    o00oOo0019 = i13;
                    o00oOo0024 = i18;
                    o00oOo0010 = i2;
                    o00oOo0012 = i3;
                    o00oOo002 = i4;
                    o00oOo0025 = i19;
                    o00oOo0023 = i17;
                    o00oOo004 = i6;
                    o00oOo0021 = i15;
                    o00oOo005 = i11;
                    o00oOo0020 = i14;
                }
                o00oOooO2.close();
                o0o00ooo.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o00oOooO2.close();
                o0o00ooo.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            o0o00ooo = o00oOo0o2;
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public List<androidx.work.o00oOOoO> o00oOooo(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12398o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
            while (o00oOooO2.moveToNext()) {
                arrayList.add(androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(0)));
            }
            return arrayList;
        } finally {
            o00oOooO2.close();
            o00oOo0o2.release();
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public LiveData<List<o0OoO00O.o00oOo00>> o00oo(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        return this.f12398o00oOOo0.o00oOooo().o00oOo0O(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new o00oOo0O(o00oOo0o2));
    }

    @Override // o0O0o0Oo.o0O00O0o
    public List<o0OoO00O> o00oo0(int i) {
        o0O0OO.o0O00OOO o0o00ooo;
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        o00oOo0o2.o0O0OOOo(1, i);
        this.f12398o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            int o00oOo002 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "required_network_type");
            int o00oOo003 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_charging");
            int o00oOo004 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_device_idle");
            int o00oOo005 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_battery_not_low");
            int o00oOo006 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_storage_not_low");
            int o00oOo007 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "trigger_content_update_delay");
            int o00oOo008 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "trigger_max_content_delay");
            int o00oOo009 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "content_uri_triggers");
            int o00oOo0010 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "id");
            int o00oOo0011 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "state");
            int o00oOo0012 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "worker_class_name");
            int o00oOo0013 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "input_merger_class_name");
            int o00oOo0014 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "input");
            int o00oOo0015 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "output");
            o0o00ooo = o00oOo0o2;
            try {
                int o00oOo0016 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "initial_delay");
                int o00oOo0017 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "interval_duration");
                int o00oOo0018 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "flex_duration");
                int o00oOo0019 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_attempt_count");
                int o00oOo0020 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "backoff_policy");
                int o00oOo0021 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "backoff_delay_duration");
                int o00oOo0022 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "period_start_time");
                int o00oOo0023 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "minimum_retention_duration");
                int o00oOo0024 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "schedule_requested_at");
                int o00oOo0025 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_in_foreground");
                int o00oOo0026 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "out_of_quota_policy");
                int i2 = o00oOo0015;
                ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
                while (o00oOooO2.moveToNext()) {
                    String string = o00oOooO2.getString(o00oOo0010);
                    int i3 = o00oOo0010;
                    String string2 = o00oOooO2.getString(o00oOo0012);
                    int i4 = o00oOo0012;
                    o0O0Ooo0.o00oo00O o00oo00o = new o0O0Ooo0.o00oo00O();
                    int i5 = o00oOo002;
                    o00oo00o.f12148o00oOOo0 = o0O00o00.o00oOo0O(o00oOooO2.getInt(o00oOo002));
                    o00oo00o.f12149o00oOOoO = o00oOooO2.getInt(o00oOo003) != 0;
                    o00oo00o.f12150o00oOo00 = o00oOooO2.getInt(o00oOo004) != 0;
                    o00oo00o.f12155o00oOooO = o00oOooO2.getInt(o00oOo005) != 0;
                    o00oo00o.f12151o00oOo0O = o00oOooO2.getInt(o00oOo006) != 0;
                    int i6 = o00oOo003;
                    int i7 = o00oOo004;
                    o00oo00o.f12152o00oOo0o = o00oOooO2.getLong(o00oOo007);
                    o00oo00o.f12154o00oOoO0 = o00oOooO2.getLong(o00oOo008);
                    o00oo00o.f12153o00oOoO = o0O00o00.o00oOOoO(o00oOooO2.getBlob(o00oOo009));
                    o0OoO00O o0ooo00o = new o0OoO00O(string, string2);
                    o0ooo00o.f12463o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOo0011));
                    o0ooo00o.f12472o00oOooO = o00oOooO2.getString(o00oOo0013);
                    o0ooo00o.f12465o00oOo0O = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOo0014));
                    int i8 = i2;
                    o0ooo00o.f12466o00oOo0o = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(i8));
                    i2 = i8;
                    int i9 = o00oOo0016;
                    o0ooo00o.f12468o00oOoO0 = o00oOooO2.getLong(i9);
                    int i10 = o00oOo0013;
                    int i11 = o00oOo0017;
                    o0ooo00o.f12467o00oOoO = o00oOooO2.getLong(i11);
                    int i12 = o00oOo005;
                    int i13 = o00oOo0018;
                    o0ooo00o.f12469o00oOoOO = o00oOooO2.getLong(i13);
                    int i14 = o00oOo0019;
                    o0ooo00o.f12471o00oOoo0 = o00oOooO2.getInt(i14);
                    int i15 = o00oOo0020;
                    o0ooo00o.f12473o00oOooo = o0O00o00.o00oOooO(o00oOooO2.getInt(i15));
                    o00oOo0018 = i13;
                    int i16 = o00oOo0021;
                    o0ooo00o.f12475o00oo00O = o00oOooO2.getLong(i16);
                    int i17 = o00oOo0022;
                    o0ooo00o.f12474o00oo0 = o00oOooO2.getLong(i17);
                    o00oOo0022 = i17;
                    int i18 = o00oOo0023;
                    o0ooo00o.f12478o00oo0OO = o00oOooO2.getLong(i18);
                    int i19 = o00oOo0024;
                    o0ooo00o.f12477o00oo0O0 = o00oOooO2.getLong(i19);
                    int i20 = o00oOo0025;
                    o0ooo00o.f12476o00oo0O = o00oOooO2.getInt(i20) != 0;
                    int i21 = o00oOo0026;
                    o0ooo00o.f12479o00oo0Oo = o0O00o00.o00oOo0o(o00oOooO2.getInt(i21));
                    o0ooo00o.f12470o00oOoOo = o00oo00o;
                    arrayList.add(o0ooo00o);
                    o00oOo0026 = i21;
                    o00oOo003 = i6;
                    o00oOo0013 = i10;
                    o00oOo0016 = i9;
                    o00oOo0017 = i11;
                    o00oOo0019 = i14;
                    o00oOo0024 = i19;
                    o00oOo0010 = i3;
                    o00oOo0012 = i4;
                    o00oOo002 = i5;
                    o00oOo0025 = i20;
                    o00oOo0023 = i18;
                    o00oOo004 = i7;
                    o00oOo0021 = i16;
                    o00oOo005 = i12;
                    o00oOo0020 = i15;
                }
                o00oOooO2.close();
                o0o00ooo.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o00oOooO2.close();
                o0o00ooo.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            o0o00ooo = o00oOo0o2;
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public List<o0OoO00O.o00oOo00> o00oo00O(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12398o00oOOo0.o00oOOoO();
        this.f12398o00oOOo0.o00oOo00();
        try {
            Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, true, null);
            int o00oOo002 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "id");
            int o00oOo003 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "state");
            int o00oOo004 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "output");
            int o00oOo005 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_attempt_count");
            androidx.collection.o00oOOo0<String, ArrayList<String>> o00oooo02 = new androidx.collection.o00oOOo0<>();
            androidx.collection.o00oOOo0<String, ArrayList<androidx.work.o00oOOoO>> o00oooo03 = new androidx.collection.o00oOOo0<>();
            while (o00oOooO2.moveToNext()) {
                if (!o00oOooO2.isNull(o00oOo002)) {
                    String string = o00oOooO2.getString(o00oOo002);
                    if (o00oooo02.getOrDefault(string, null) == null) {
                        o00oooo02.put(string, new ArrayList<>());
                    }
                }
                if (!o00oOooO2.isNull(o00oOo002)) {
                    String string2 = o00oOooO2.getString(o00oOo002);
                    if (o00oooo03.getOrDefault(string2, null) == null) {
                        o00oooo03.put(string2, new ArrayList<>());
                    }
                }
            }
            o00oOooO2.moveToPosition(-1);
            o00ooo00(o00oooo02);
            o00ooOoo(o00oooo03);
            ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
            while (o00oOooO2.moveToNext()) {
                ArrayList<String> orDefault = !o00oOooO2.isNull(o00oOo002) ? o00oooo02.getOrDefault(o00oOooO2.getString(o00oOo002), null) : null;
                if (orDefault == null) {
                    orDefault = new ArrayList<>();
                }
                ArrayList<androidx.work.o00oOOoO> orDefault2 = !o00oOooO2.isNull(o00oOo002) ? o00oooo03.getOrDefault(o00oOooO2.getString(o00oOo002), null) : null;
                if (orDefault2 == null) {
                    orDefault2 = new ArrayList<>();
                }
                o0OoO00O.o00oOo00 o00ooo002 = new o0OoO00O.o00oOo00();
                o00ooo002.f12482o00oOOo0 = o00oOooO2.getString(o00oOo002);
                o00ooo002.f12483o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOo003));
                o00ooo002.f12484o00oOo00 = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOo004));
                o00ooo002.f12487o00oOooO = o00oOooO2.getInt(o00oOo005);
                o00ooo002.f12485o00oOo0O = orDefault;
                o00ooo002.f12486o00oOo0o = orDefault2;
                arrayList.add(o00ooo002);
            }
            this.f12398o00oOOo0.o00ooO0o();
            o00oOooO2.close();
            o00oOo0o2.release();
            return arrayList;
        } finally {
            this.f12398o00oOOo0.o00oOoOO();
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public List<o0OoO00O.o00oOOoO> o00oo0O(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12398o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            int o00oOo002 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "id");
            int o00oOo003 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "state");
            ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
            while (o00oOooO2.moveToNext()) {
                o0OoO00O.o00oOOoO o00ooooo2 = new o0OoO00O.o00oOOoO();
                o00ooooo2.f12480o00oOOo0 = o00oOooO2.getString(o00oOo002);
                o00ooooo2.f12481o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOo003));
                arrayList.add(o00ooooo2);
            }
            return arrayList;
        } finally {
            o00oOooO2.close();
            o00oOo0o2.release();
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public int o00oo0O0(String str, long j) {
        this.f12398o00oOOo0.o00oOOoO();
        o0O0OOoO.o0O0000O o00oOOo02 = this.f12403o00oOoO.o00oOOo0();
        o00oOOo02.o0O0OOOo(1, j);
        if (str == null) {
            o00oOOo02.o0O0o00(2);
        } else {
            o00oOOo02.o0O0O0O(2, str);
        }
        this.f12398o00oOOo0.o00oOo00();
        try {
            int o00oo0oO2 = o00oOOo02.o00oo0oO();
            this.f12398o00oOOo0.o00ooO0o();
            return o00oo0oO2;
        } finally {
            this.f12398o00oOOo0.o00oOoOO();
            this.f12403o00oOoO.o00oOo0o(o00oOOo02);
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public int o00oo0OO() {
        this.f12398o00oOOo0.o00oOOoO();
        o0O0OOoO.o0O0000O o00oOOo02 = this.f12405o00oOoOO.o00oOOo0();
        this.f12398o00oOOo0.o00oOo00();
        try {
            int o00oo0oO2 = o00oOOo02.o00oo0oO();
            this.f12398o00oOOo0.o00ooO0o();
            return o00oo0oO2;
        } finally {
            this.f12398o00oOOo0.o00oOoOO();
            this.f12405o00oOoOO.o00oOo0o(o00oOOo02);
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public int o00oo0Oo(o0OoO00O.o00oOOo0 o00oooo02, String... strArr) {
        this.f12398o00oOOo0.o00oOOoO();
        StringBuilder o00oOo002 = o0O0OOOo.o00oo0.o00oOo00();
        o00oOo002.append("UPDATE workspec SET state=");
        o00oOo002.append("?");
        o00oOo002.append(" WHERE id IN (");
        o0O0OOOo.o00oo0.o00oOOo0(o00oOo002, strArr.length);
        o00oOo002.append(")");
        o0O0OOoO.o0O0000O o00oOo0o2 = this.f12398o00oOOo0.o00oOo0o(o00oOo002.toString());
        o00oOo0o2.o0O0OOOo(1, o0O00o00.o00oOoOo(o00oooo02));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                o00oOo0o2.o0O0o00(i);
            } else {
                o00oOo0o2.o0O0O0O(i, str);
            }
            i++;
        }
        this.f12398o00oOOo0.o00oOo00();
        try {
            int o00oo0oO2 = o00oOo0o2.o00oo0oO();
            this.f12398o00oOOo0.o00ooO0o();
            return o00oo0oO2;
        } finally {
            this.f12398o00oOOo0.o00oOoOO();
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public void o00oo0o(o0OoO00O o0ooo00o) {
        this.f12398o00oOOo0.o00oOOoO();
        this.f12398o00oOOo0.o00oOo00();
        try {
            this.f12399o00oOOoO.o00oOoOO(o0ooo00o);
            this.f12398o00oOOo0.o00ooO0o();
        } finally {
            this.f12398o00oOOo0.o00oOoOO();
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public List<o0OoO00O> o00oo0o0(int i) {
        o0O0OO.o0O00OOO o0o00ooo;
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        o00oOo0o2.o0O0OOOo(1, i);
        this.f12398o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            int o00oOo002 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "required_network_type");
            int o00oOo003 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_charging");
            int o00oOo004 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_device_idle");
            int o00oOo005 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_battery_not_low");
            int o00oOo006 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_storage_not_low");
            int o00oOo007 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "trigger_content_update_delay");
            int o00oOo008 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "trigger_max_content_delay");
            int o00oOo009 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "content_uri_triggers");
            int o00oOo0010 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "id");
            int o00oOo0011 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "state");
            int o00oOo0012 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "worker_class_name");
            int o00oOo0013 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "input_merger_class_name");
            int o00oOo0014 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "input");
            int o00oOo0015 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "output");
            o0o00ooo = o00oOo0o2;
            try {
                int o00oOo0016 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "initial_delay");
                int o00oOo0017 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "interval_duration");
                int o00oOo0018 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "flex_duration");
                int o00oOo0019 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_attempt_count");
                int o00oOo0020 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "backoff_policy");
                int o00oOo0021 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "backoff_delay_duration");
                int o00oOo0022 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "period_start_time");
                int o00oOo0023 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "minimum_retention_duration");
                int o00oOo0024 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "schedule_requested_at");
                int o00oOo0025 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_in_foreground");
                int o00oOo0026 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "out_of_quota_policy");
                int i2 = o00oOo0015;
                ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
                while (o00oOooO2.moveToNext()) {
                    String string = o00oOooO2.getString(o00oOo0010);
                    int i3 = o00oOo0010;
                    String string2 = o00oOooO2.getString(o00oOo0012);
                    int i4 = o00oOo0012;
                    o0O0Ooo0.o00oo00O o00oo00o = new o0O0Ooo0.o00oo00O();
                    int i5 = o00oOo002;
                    o00oo00o.f12148o00oOOo0 = o0O00o00.o00oOo0O(o00oOooO2.getInt(o00oOo002));
                    o00oo00o.f12149o00oOOoO = o00oOooO2.getInt(o00oOo003) != 0;
                    o00oo00o.f12150o00oOo00 = o00oOooO2.getInt(o00oOo004) != 0;
                    o00oo00o.f12155o00oOooO = o00oOooO2.getInt(o00oOo005) != 0;
                    o00oo00o.f12151o00oOo0O = o00oOooO2.getInt(o00oOo006) != 0;
                    int i6 = o00oOo003;
                    int i7 = o00oOo004;
                    o00oo00o.f12152o00oOo0o = o00oOooO2.getLong(o00oOo007);
                    o00oo00o.f12154o00oOoO0 = o00oOooO2.getLong(o00oOo008);
                    o00oo00o.f12153o00oOoO = o0O00o00.o00oOOoO(o00oOooO2.getBlob(o00oOo009));
                    o0OoO00O o0ooo00o = new o0OoO00O(string, string2);
                    o0ooo00o.f12463o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOo0011));
                    o0ooo00o.f12472o00oOooO = o00oOooO2.getString(o00oOo0013);
                    o0ooo00o.f12465o00oOo0O = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOo0014));
                    int i8 = i2;
                    o0ooo00o.f12466o00oOo0o = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(i8));
                    i2 = i8;
                    int i9 = o00oOo0016;
                    o0ooo00o.f12468o00oOoO0 = o00oOooO2.getLong(i9);
                    int i10 = o00oOo0013;
                    int i11 = o00oOo0017;
                    o0ooo00o.f12467o00oOoO = o00oOooO2.getLong(i11);
                    int i12 = o00oOo005;
                    int i13 = o00oOo0018;
                    o0ooo00o.f12469o00oOoOO = o00oOooO2.getLong(i13);
                    int i14 = o00oOo0019;
                    o0ooo00o.f12471o00oOoo0 = o00oOooO2.getInt(i14);
                    int i15 = o00oOo0020;
                    o0ooo00o.f12473o00oOooo = o0O00o00.o00oOooO(o00oOooO2.getInt(i15));
                    o00oOo0018 = i13;
                    int i16 = o00oOo0021;
                    o0ooo00o.f12475o00oo00O = o00oOooO2.getLong(i16);
                    int i17 = o00oOo0022;
                    o0ooo00o.f12474o00oo0 = o00oOooO2.getLong(i17);
                    o00oOo0022 = i17;
                    int i18 = o00oOo0023;
                    o0ooo00o.f12478o00oo0OO = o00oOooO2.getLong(i18);
                    int i19 = o00oOo0024;
                    o0ooo00o.f12477o00oo0O0 = o00oOooO2.getLong(i19);
                    int i20 = o00oOo0025;
                    o0ooo00o.f12476o00oo0O = o00oOooO2.getInt(i20) != 0;
                    int i21 = o00oOo0026;
                    o0ooo00o.f12479o00oo0Oo = o0O00o00.o00oOo0o(o00oOooO2.getInt(i21));
                    o0ooo00o.f12470o00oOoOo = o00oo00o;
                    arrayList.add(o0ooo00o);
                    o00oOo0026 = i21;
                    o00oOo003 = i6;
                    o00oOo0013 = i10;
                    o00oOo0016 = i9;
                    o00oOo0017 = i11;
                    o00oOo0019 = i14;
                    o00oOo0024 = i19;
                    o00oOo0010 = i3;
                    o00oOo0012 = i4;
                    o00oOo002 = i5;
                    o00oOo0025 = i20;
                    o00oOo0023 = i18;
                    o00oOo004 = i7;
                    o00oOo0021 = i16;
                    o00oOo005 = i12;
                    o00oOo0020 = i15;
                }
                o00oOooO2.close();
                o0o00ooo.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o00oOooO2.close();
                o0o00ooo.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            o0o00ooo = o00oOo0o2;
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public void o00oo0oO(String str, androidx.work.o00oOOoO o00ooooo2) {
        this.f12398o00oOOo0.o00oOOoO();
        o0O0OOoO.o0O0000O o00oOOo02 = this.f12407o00oOooO.o00oOOo0();
        byte[] o00ooOo02 = androidx.work.o00oOOoO.o00ooOo0(o00ooooo2);
        if (o00ooOo02 == null) {
            o00oOOo02.o0O0o00(1);
        } else {
            o00oOOo02.o0OooO0(1, o00ooOo02);
        }
        if (str == null) {
            o00oOOo02.o0O0o00(2);
        } else {
            o00oOOo02.o0O0O0O(2, str);
        }
        this.f12398o00oOOo0.o00oOo00();
        try {
            o00oOOo02.o00oo0oO();
            this.f12398o00oOOo0.o00ooO0o();
        } finally {
            this.f12398o00oOOo0.o00oOoOO();
            this.f12407o00oOooO.o00oOo0o(o00oOOo02);
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public int o00ooO(String str) {
        this.f12398o00oOOo0.o00oOOoO();
        o0O0OOoO.o0O0000O o00oOOo02 = this.f12404o00oOoO0.o00oOOo0();
        if (str == null) {
            o00oOOo02.o0O0o00(1);
        } else {
            o00oOOo02.o0O0O0O(1, str);
        }
        this.f12398o00oOOo0.o00oOo00();
        try {
            int o00oo0oO2 = o00oOOo02.o00oo0oO();
            this.f12398o00oOOo0.o00ooO0o();
            return o00oo0oO2;
        } finally {
            this.f12398o00oOOo0.o00oOoOO();
            this.f12404o00oOoO0.o00oOo0o(o00oOOo02);
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public LiveData<List<o0OoO00O.o00oOo00>> o00ooO0(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        return this.f12398o00oOOo0.o00oOooo().o00oOo0O(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new o00oOo00(o00oOo0o2));
    }

    @Override // o0O0o0Oo.o0O00O0o
    public List<o0OoO00O> o00ooO00() {
        o0O0OO.o0O00OOO o0o00ooo;
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f12398o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            int o00oOo002 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "required_network_type");
            int o00oOo003 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_charging");
            int o00oOo004 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_device_idle");
            int o00oOo005 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_battery_not_low");
            int o00oOo006 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "requires_storage_not_low");
            int o00oOo007 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "trigger_content_update_delay");
            int o00oOo008 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "trigger_max_content_delay");
            int o00oOo009 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "content_uri_triggers");
            int o00oOo0010 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "id");
            int o00oOo0011 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "state");
            int o00oOo0012 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "worker_class_name");
            int o00oOo0013 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "input_merger_class_name");
            int o00oOo0014 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "input");
            int o00oOo0015 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "output");
            o0o00ooo = o00oOo0o2;
            try {
                int o00oOo0016 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "initial_delay");
                int o00oOo0017 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "interval_duration");
                int o00oOo0018 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "flex_duration");
                int o00oOo0019 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_attempt_count");
                int o00oOo0020 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "backoff_policy");
                int o00oOo0021 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "backoff_delay_duration");
                int o00oOo0022 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "period_start_time");
                int o00oOo0023 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "minimum_retention_duration");
                int o00oOo0024 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "schedule_requested_at");
                int o00oOo0025 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_in_foreground");
                int o00oOo0026 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "out_of_quota_policy");
                int i = o00oOo0015;
                ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
                while (o00oOooO2.moveToNext()) {
                    String string = o00oOooO2.getString(o00oOo0010);
                    int i2 = o00oOo0010;
                    String string2 = o00oOooO2.getString(o00oOo0012);
                    int i3 = o00oOo0012;
                    o0O0Ooo0.o00oo00O o00oo00o = new o0O0Ooo0.o00oo00O();
                    int i4 = o00oOo002;
                    o00oo00o.f12148o00oOOo0 = o0O00o00.o00oOo0O(o00oOooO2.getInt(o00oOo002));
                    o00oo00o.f12149o00oOOoO = o00oOooO2.getInt(o00oOo003) != 0;
                    o00oo00o.f12150o00oOo00 = o00oOooO2.getInt(o00oOo004) != 0;
                    o00oo00o.f12155o00oOooO = o00oOooO2.getInt(o00oOo005) != 0;
                    o00oo00o.f12151o00oOo0O = o00oOooO2.getInt(o00oOo006) != 0;
                    int i5 = o00oOo003;
                    int i6 = o00oOo004;
                    o00oo00o.f12152o00oOo0o = o00oOooO2.getLong(o00oOo007);
                    o00oo00o.f12154o00oOoO0 = o00oOooO2.getLong(o00oOo008);
                    o00oo00o.f12153o00oOoO = o0O00o00.o00oOOoO(o00oOooO2.getBlob(o00oOo009));
                    o0OoO00O o0ooo00o = new o0OoO00O(string, string2);
                    o0ooo00o.f12463o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOo0011));
                    o0ooo00o.f12472o00oOooO = o00oOooO2.getString(o00oOo0013);
                    o0ooo00o.f12465o00oOo0O = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOo0014));
                    int i7 = i;
                    o0ooo00o.f12466o00oOo0o = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(i7));
                    i = i7;
                    int i8 = o00oOo0016;
                    o0ooo00o.f12468o00oOoO0 = o00oOooO2.getLong(i8);
                    int i9 = o00oOo0014;
                    int i10 = o00oOo0017;
                    o0ooo00o.f12467o00oOoO = o00oOooO2.getLong(i10);
                    int i11 = o00oOo005;
                    int i12 = o00oOo0018;
                    o0ooo00o.f12469o00oOoOO = o00oOooO2.getLong(i12);
                    int i13 = o00oOo0019;
                    o0ooo00o.f12471o00oOoo0 = o00oOooO2.getInt(i13);
                    int i14 = o00oOo0020;
                    o0ooo00o.f12473o00oOooo = o0O00o00.o00oOooO(o00oOooO2.getInt(i14));
                    o00oOo0018 = i12;
                    int i15 = o00oOo0021;
                    o0ooo00o.f12475o00oo00O = o00oOooO2.getLong(i15);
                    int i16 = o00oOo0022;
                    o0ooo00o.f12474o00oo0 = o00oOooO2.getLong(i16);
                    o00oOo0022 = i16;
                    int i17 = o00oOo0023;
                    o0ooo00o.f12478o00oo0OO = o00oOooO2.getLong(i17);
                    int i18 = o00oOo0024;
                    o0ooo00o.f12477o00oo0O0 = o00oOooO2.getLong(i18);
                    int i19 = o00oOo0025;
                    o0ooo00o.f12476o00oo0O = o00oOooO2.getInt(i19) != 0;
                    int i20 = o00oOo0026;
                    o0ooo00o.f12479o00oo0Oo = o0O00o00.o00oOo0o(o00oOooO2.getInt(i20));
                    o0ooo00o.f12470o00oOoOo = o00oo00o;
                    arrayList.add(o0ooo00o);
                    o00oOo0026 = i20;
                    o00oOo003 = i5;
                    o00oOo0014 = i9;
                    o00oOo0016 = i8;
                    o00oOo0017 = i10;
                    o00oOo0019 = i13;
                    o00oOo0024 = i18;
                    o00oOo0010 = i2;
                    o00oOo0012 = i3;
                    o00oOo002 = i4;
                    o00oOo0025 = i19;
                    o00oOo0023 = i17;
                    o00oOo004 = i6;
                    o00oOo0021 = i15;
                    o00oOo005 = i11;
                    o00oOo0020 = i14;
                }
                o00oOooO2.close();
                o0o00ooo.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o00oOooO2.close();
                o0o00ooo.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            o0o00ooo = o00oOo0o2;
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public List<String> o00ooO0O() {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f12398o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
            while (o00oOooO2.moveToNext()) {
                arrayList.add(o00oOooO2.getString(0));
            }
            return arrayList;
        } finally {
            o00oOooO2.close();
            o00oOo0o2.release();
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public boolean o00ooO0o() {
        boolean z = false;
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f12398o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            if (o00oOooO2.moveToFirst()) {
                if (o00oOooO2.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            o00oOooO2.close();
            o00oOo0o2.release();
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public LiveData<List<o0OoO00O.o00oOo00>> o00ooOO(List<String> list) {
        StringBuilder o00oOo002 = o0O0OOOo.o00oo0.o00oOo00();
        o00oOo002.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = list.size();
        o0O0OOOo.o00oo0.o00oOOo0(o00oOo002, size);
        o00oOo002.append(")");
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o(o00oOo002.toString(), size + 0);
        int i = 1;
        for (String str : list) {
            if (str == null) {
                o00oOo0o2.o0O0o00(i);
            } else {
                o00oOo0o2.o0O0O0O(i, str);
            }
            i++;
        }
        return this.f12398o00oOOo0.o00oOooo().o00oOo0O(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new o00oOOoO(o00oOo0o2));
    }

    @Override // o0O0o0Oo.o0O00O0o
    public List<o0OoO00O.o00oOo00> o00ooOO0(String str) {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            o00oOo0o2.o0O0o00(1);
        } else {
            o00oOo0o2.o0O0O0O(1, str);
        }
        this.f12398o00oOOo0.o00oOOoO();
        this.f12398o00oOOo0.o00oOo00();
        try {
            Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, true, null);
            int o00oOo002 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "id");
            int o00oOo003 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "state");
            int o00oOo004 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "output");
            int o00oOo005 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_attempt_count");
            androidx.collection.o00oOOo0<String, ArrayList<String>> o00oooo02 = new androidx.collection.o00oOOo0<>();
            androidx.collection.o00oOOo0<String, ArrayList<androidx.work.o00oOOoO>> o00oooo03 = new androidx.collection.o00oOOo0<>();
            while (o00oOooO2.moveToNext()) {
                if (!o00oOooO2.isNull(o00oOo002)) {
                    String string = o00oOooO2.getString(o00oOo002);
                    if (o00oooo02.getOrDefault(string, null) == null) {
                        o00oooo02.put(string, new ArrayList<>());
                    }
                }
                if (!o00oOooO2.isNull(o00oOo002)) {
                    String string2 = o00oOooO2.getString(o00oOo002);
                    if (o00oooo03.getOrDefault(string2, null) == null) {
                        o00oooo03.put(string2, new ArrayList<>());
                    }
                }
            }
            o00oOooO2.moveToPosition(-1);
            o00ooo00(o00oooo02);
            o00ooOoo(o00oooo03);
            ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
            while (o00oOooO2.moveToNext()) {
                ArrayList<String> orDefault = !o00oOooO2.isNull(o00oOo002) ? o00oooo02.getOrDefault(o00oOooO2.getString(o00oOo002), null) : null;
                if (orDefault == null) {
                    orDefault = new ArrayList<>();
                }
                ArrayList<androidx.work.o00oOOoO> orDefault2 = !o00oOooO2.isNull(o00oOo002) ? o00oooo03.getOrDefault(o00oOooO2.getString(o00oOo002), null) : null;
                if (orDefault2 == null) {
                    orDefault2 = new ArrayList<>();
                }
                o0OoO00O.o00oOo00 o00ooo002 = new o0OoO00O.o00oOo00();
                o00ooo002.f12482o00oOOo0 = o00oOooO2.getString(o00oOo002);
                o00ooo002.f12483o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOo003));
                o00ooo002.f12484o00oOo00 = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOo004));
                o00ooo002.f12487o00oOooO = o00oOooO2.getInt(o00oOo005);
                o00ooo002.f12485o00oOo0O = orDefault;
                o00ooo002.f12486o00oOo0o = orDefault2;
                arrayList.add(o00ooo002);
            }
            this.f12398o00oOOo0.o00ooO0o();
            o00oOooO2.close();
            o00oOo0o2.release();
            return arrayList;
        } finally {
            this.f12398o00oOOo0.o00oOoOO();
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public int o00ooOOo(String str) {
        this.f12398o00oOOo0.o00oOOoO();
        o0O0OOoO.o0O0000O o00oOOo02 = this.f12402o00oOo0o.o00oOOo0();
        if (str == null) {
            o00oOOo02.o0O0o00(1);
        } else {
            o00oOOo02.o0O0O0O(1, str);
        }
        this.f12398o00oOOo0.o00oOo00();
        try {
            int o00oo0oO2 = o00oOOo02.o00oo0oO();
            this.f12398o00oOOo0.o00ooO0o();
            return o00oo0oO2;
        } finally {
            this.f12398o00oOOo0.o00oOoOO();
            this.f12402o00oOo0o.o00oOo0o(o00oOOo02);
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public List<o0OoO00O.o00oOo00> o00ooOo(List<String> list) {
        StringBuilder o00oOo002 = o0O0OOOo.o00oo0.o00oOo00();
        o00oOo002.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = list.size();
        o0O0OOOo.o00oo0.o00oOOo0(o00oOo002, size);
        o00oOo002.append(")");
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o(o00oOo002.toString(), size + 0);
        int i = 1;
        for (String str : list) {
            if (str == null) {
                o00oOo0o2.o0O0o00(i);
            } else {
                o00oOo0o2.o0O0O0O(i, str);
            }
            i++;
        }
        this.f12398o00oOOo0.o00oOOoO();
        this.f12398o00oOOo0.o00oOo00();
        try {
            Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, true, null);
            int o00oOo003 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "id");
            int o00oOo004 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "state");
            int o00oOo005 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "output");
            int o00oOo006 = o0O0OOOo.o00oOOoO.o00oOo00(o00oOooO2, "run_attempt_count");
            androidx.collection.o00oOOo0<String, ArrayList<String>> o00oooo02 = new androidx.collection.o00oOOo0<>();
            androidx.collection.o00oOOo0<String, ArrayList<androidx.work.o00oOOoO>> o00oooo03 = new androidx.collection.o00oOOo0<>();
            while (o00oOooO2.moveToNext()) {
                if (!o00oOooO2.isNull(o00oOo003)) {
                    String string = o00oOooO2.getString(o00oOo003);
                    if (o00oooo02.getOrDefault(string, null) == null) {
                        o00oooo02.put(string, new ArrayList<>());
                    }
                }
                if (!o00oOooO2.isNull(o00oOo003)) {
                    String string2 = o00oOooO2.getString(o00oOo003);
                    if (o00oooo03.getOrDefault(string2, null) == null) {
                        o00oooo03.put(string2, new ArrayList<>());
                    }
                }
            }
            o00oOooO2.moveToPosition(-1);
            o00ooo00(o00oooo02);
            o00ooOoo(o00oooo03);
            ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
            while (o00oOooO2.moveToNext()) {
                ArrayList<String> orDefault = !o00oOooO2.isNull(o00oOo003) ? o00oooo02.getOrDefault(o00oOooO2.getString(o00oOo003), null) : null;
                if (orDefault == null) {
                    orDefault = new ArrayList<>();
                }
                ArrayList<androidx.work.o00oOOoO> orDefault2 = !o00oOooO2.isNull(o00oOo003) ? o00oooo03.getOrDefault(o00oOooO2.getString(o00oOo003), null) : null;
                if (orDefault2 == null) {
                    orDefault2 = new ArrayList<>();
                }
                o0OoO00O.o00oOo00 o00ooo002 = new o0OoO00O.o00oOo00();
                o00ooo002.f12482o00oOOo0 = o00oOooO2.getString(o00oOo003);
                o00ooo002.f12483o00oOOoO = o0O00o00.o00oOoO0(o00oOooO2.getInt(o00oOo004));
                o00ooo002.f12484o00oOo00 = androidx.work.o00oOOoO.o00oo00O(o00oOooO2.getBlob(o00oOo005));
                o00ooo002.f12487o00oOooO = o00oOooO2.getInt(o00oOo006);
                o00ooo002.f12485o00oOo0O = orDefault;
                o00ooo002.f12486o00oOo0o = orDefault2;
                arrayList.add(o00ooo002);
            }
            this.f12398o00oOOo0.o00ooO0o();
            o00oOooO2.close();
            o00oOo0o2.release();
            return arrayList;
        } finally {
            this.f12398o00oOOo0.o00oOoOO();
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public void o00ooOo0(String str, long j) {
        this.f12398o00oOOo0.o00oOOoO();
        o0O0OOoO.o0O0000O o00oOOo02 = this.f12401o00oOo0O.o00oOOo0();
        o00oOOo02.o0O0OOOo(1, j);
        if (str == null) {
            o00oOOo02.o0O0o00(2);
        } else {
            o00oOOo02.o0O0O0O(2, str);
        }
        this.f12398o00oOOo0.o00oOo00();
        try {
            o00oOOo02.o00oo0oO();
            this.f12398o00oOOo0.o00ooO0o();
        } finally {
            this.f12398o00oOOo0.o00oOoOO();
            this.f12401o00oOo0O.o00oOo0o(o00oOOo02);
        }
    }

    @Override // o0O0o0Oo.o0O00O0o
    public List<String> o00ooOoO() {
        o0O0OO.o0O00OOO o00oOo0o2 = o0O0OO.o0O00OOO.o00oOo0o("SELECT id FROM workspec", 0);
        this.f12398o00oOOo0.o00oOOoO();
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            ArrayList arrayList = new ArrayList(o00oOooO2.getCount());
            while (o00oOooO2.moveToNext()) {
                arrayList.add(o00oOooO2.getString(0));
            }
            return arrayList;
        } finally {
            o00oOooO2.close();
            o00oOo0o2.release();
        }
    }

    public final void o00ooOoo(androidx.collection.o00oOOo0<String, ArrayList<androidx.work.o00oOOoO>> o00oooo02) {
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
                    o00ooOoo(o00oooo03);
                    o00oooo03 = new androidx.collection.o00oOOo0<>((int) o0O0OO.o0O00O0o.f11320o00oo00O);
                    i2 = 0;
                }
            }
            if (i2 > 0) {
                o00ooOoo(o00oooo03);
                return;
            }
            return;
        }
        StringBuilder o00oOo002 = o0O0OOOo.o00oo0.o00oOo00();
        o00oOo002.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        o0O0OOOo.o00oo0.o00oOOo0(o00oOo002, size2);
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
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            int o00oOOoO2 = o0O0OOOo.o00oOOoO.o00oOOoO(o00oOooO2, "work_spec_id");
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

    public final void o00ooo00(androidx.collection.o00oOOo0<String, ArrayList<String>> o00oooo02) {
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
                    o00ooo00(o00oooo03);
                    o00oooo03 = new androidx.collection.o00oOOo0<>((int) o0O0OO.o0O00O0o.f11320o00oo00O);
                    i2 = 0;
                }
            }
            if (i2 > 0) {
                o00ooo00(o00oooo03);
                return;
            }
            return;
        }
        StringBuilder o00oOo002 = o0O0OOOo.o00oo0.o00oOo00();
        o00oOo002.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        o0O0OOOo.o00oo0.o00oOOo0(o00oOo002, size2);
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
        Cursor o00oOooO2 = o0O0OOOo.o00oOo00.o00oOooO(this.f12398o00oOOo0, o00oOo0o2, false, null);
        try {
            int o00oOOoO2 = o0O0OOOo.o00oOOoO.o00oOOoO(o00oOooO2, "work_spec_id");
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

    @Override // o0O0o0Oo.o0O00O0o
    public LiveData<List<String>> o0O0o() {
        return this.f12398o00oOOo0.o00oOooo().o00oOo0O(new String[]{"workspec"}, true, new o00oOOo0(o0O0OO.o0O00OOO.o00oOo0o("SELECT id FROM workspec", 0)));
    }
}
