package androidx.work.impl;

import androidx.preference.Preference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import o0O0OO.o00oOo0O;
import o0O0OO.o0O00O;
import o0O0OO.o0O00O0o;
import o0O0OO.o0O00OO;
import o0O0OOOo.o00oOo00;
import o0O0OOOo.o00oo0OO;
import o0O0OOoO.o00ooO0;
import o0O0o0Oo.o0;
import o0O0o0Oo.o00oo;
import o0O0o0Oo.o00oo0O;
import o0O0o0Oo.o00oo0O0;
import o0O0o0Oo.o00ooO;
import o0O0o0Oo.o0O00;
import o0O0o0Oo.o0O000;
import o0O0o0Oo.o0O0000O;
import o0O0o0Oo.o0O000Oo;
import o0O0o0Oo.o0O00O0;
import o0O0o0Oo.o0O00O0o;
import o0O0o0Oo.o0O00OOO;
import o0O0o0Oo.o0OoOoOo;
import o0O0o0Oo.o0oO0Ooo;
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: o00oo  reason: collision with root package name */
    public volatile o00oo f5566o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public volatile o0O00O0o f5567o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public volatile o00oo0O0 f5568o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public volatile o0O0000O f5569o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public volatile o0O00OOO f5570o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public volatile o0OoOoOo f5571o00oo0oO;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public volatile o00ooO f5572o00ooO00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public volatile o0O00 f5573o0O0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O00OO.o00oOOo0 {
        public o00oOOo0(int i) {
            super(i);
        }

        @Override // o0O0OO.o0O00OO.o00oOOo0
        public void o00oOOo0(o0O0OOoO.o00oo o00ooVar) {
            o00ooVar.o00oo0O0("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            o00ooVar.o00oo0O0("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            o00ooVar.o00oo0O0("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            o00ooVar.o00oo0O0("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            o00ooVar.o00oo0O0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            o00ooVar.o00oo0O0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            o00ooVar.o00oo0O0("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            o00ooVar.o00oo0O0("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            o00ooVar.o00oo0O0(androidx.work.impl.o00oOOo0.f5695o00oo00O);
            o00ooVar.o00oo0O0("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            o00ooVar.o00oo0O0("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            o00ooVar.o00oo0O0(androidx.work.impl.o00oOOo0.f5701o00oo0o0);
            o00ooVar.o00oo0O0(androidx.work.impl.o00oOOo0.f5693o00oo);
            o00ooVar.o00oo0O0(o0O00O.f11316o00oOo0o);
            o00ooVar.o00oo0O0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // o0O0OO.o0O00OO.o00oOOo0
        public void o00oOOoO(o0O0OOoO.o00oo o00ooVar) {
            o00ooVar.o00oo0O0("DROP TABLE IF EXISTS `Dependency`");
            o00ooVar.o00oo0O0("DROP TABLE IF EXISTS `WorkSpec`");
            o00ooVar.o00oo0O0("DROP TABLE IF EXISTS `WorkTag`");
            o00ooVar.o00oo0O0("DROP TABLE IF EXISTS `SystemIdInfo`");
            o00ooVar.o00oo0O0("DROP TABLE IF EXISTS `WorkName`");
            o00ooVar.o00oo0O0("DROP TABLE IF EXISTS `WorkProgress`");
            o00ooVar.o00oo0O0("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f11326o00oOoO != null) {
                int size = WorkDatabase_Impl.this.f11326o00oOoO.size();
                for (int i = 0; i < size; i++) {
                    WorkDatabase_Impl.this.f11326o00oOoO.get(i).o00oOOoO(o00ooVar);
                }
            }
        }

        @Override // o0O0OO.o0O00OO.o00oOOo0
        public void o00oOo00(o0O0OOoO.o00oo o00ooVar) {
            if (WorkDatabase_Impl.this.f11326o00oOoO != null) {
                int size = WorkDatabase_Impl.this.f11326o00oOoO.size();
                for (int i = 0; i < size; i++) {
                    WorkDatabase_Impl.this.f11326o00oOoO.get(i).o00oOOo0(o00ooVar);
                }
            }
        }

        @Override // o0O0OO.o0O00OO.o00oOOo0
        public void o00oOo0O(o0O0OOoO.o00oo o00ooVar) {
        }

        @Override // o0O0OO.o0O00OO.o00oOOo0
        public void o00oOo0o(o0O0OOoO.o00oo o00ooVar) {
            o00oOo00.o00oOOoO(o00ooVar);
        }

        @Override // o0O0OO.o0O00OO.o00oOOo0
        public o0O00OO.o00oOOoO o00oOoO0(o0O0OOoO.o00oo o00ooVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new o00oo0OO.o00oOOo0("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new o00oo0OO.o00oOOo0("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new o00oo0OO.o00oOOoO("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new o00oo0OO.o00oOOoO("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new o00oo0OO.o00oOo0O("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new o00oo0OO.o00oOo0O("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            o00oo0OO o00oo0oo = new o00oo0OO("Dependency", hashMap, hashSet, hashSet2);
            o00oo0OO o00oOOo02 = o00oo0OO.o00oOOo0(o00ooVar, "Dependency");
            if (!o00oo0oo.equals(o00oOOo02)) {
                return new o0O00OO.o00oOOoO(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + o00oo0oo + "\n Found:\n" + o00oOOo02);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new o00oo0OO.o00oOOo0("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new o00oo0OO.o00oOOo0("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new o00oo0OO.o00oOOo0("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new o00oo0OO.o00oOOo0("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new o00oo0OO.o00oOOo0("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new o00oo0OO.o00oOOo0("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new o00oo0OO.o00oOOo0("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new o00oo0OO.o00oOOo0("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new o00oo0OO.o00oOOo0("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new o00oo0OO.o00oOOo0("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new o00oo0OO.o00oOOo0("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new o00oo0OO.o00oOOo0("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new o00oo0OO.o00oOOo0("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new o00oo0OO.o00oOOo0("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new o00oo0OO.o00oOOo0("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new o00oo0OO.o00oOOo0("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new o00oo0OO.o00oOOo0("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new o00oo0OO.o00oOOo0("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new o00oo0OO.o00oOOo0("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new o00oo0OO.o00oOOo0("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new o00oo0OO.o00oOOo0("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new o00oo0OO.o00oOOo0("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new o00oo0OO.o00oOOo0("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new o00oo0OO.o00oOOo0("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new o00oo0OO.o00oOOo0("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new o00oo0OO.o00oOo0O("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new o00oo0OO.o00oOo0O("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            o00oo0OO o00oo0oo2 = new o00oo0OO("WorkSpec", hashMap2, hashSet3, hashSet4);
            o00oo0OO o00oOOo03 = o00oo0OO.o00oOOo0(o00ooVar, "WorkSpec");
            if (!o00oo0oo2.equals(o00oOOo03)) {
                return new o0O00OO.o00oOOoO(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + o00oo0oo2 + "\n Found:\n" + o00oOOo03);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new o00oo0OO.o00oOOo0("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new o00oo0OO.o00oOOo0("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new o00oo0OO.o00oOOoO("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new o00oo0OO.o00oOo0O("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            o00oo0OO o00oo0oo3 = new o00oo0OO("WorkTag", hashMap3, hashSet5, hashSet6);
            o00oo0OO o00oOOo04 = o00oo0OO.o00oOOo0(o00ooVar, "WorkTag");
            if (!o00oo0oo3.equals(o00oOOo04)) {
                return new o0O00OO.o00oOOoO(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + o00oo0oo3 + "\n Found:\n" + o00oOOo04);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new o00oo0OO.o00oOOo0("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("system_id", new o00oo0OO.o00oOOo0("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new o00oo0OO.o00oOOoO("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            o00oo0OO o00oo0oo4 = new o00oo0OO("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            o00oo0OO o00oOOo05 = o00oo0OO.o00oOOo0(o00ooVar, "SystemIdInfo");
            if (!o00oo0oo4.equals(o00oOOo05)) {
                return new o0O00OO.o00oOOoO(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + o00oo0oo4 + "\n Found:\n" + o00oOOo05);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new o00oo0OO.o00oOOo0("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new o00oo0OO.o00oOOo0("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new o00oo0OO.o00oOOoO("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new o00oo0OO.o00oOo0O("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            o00oo0OO o00oo0oo5 = new o00oo0OO("WorkName", hashMap5, hashSet8, hashSet9);
            o00oo0OO o00oOOo06 = o00oo0OO.o00oOOo0(o00ooVar, "WorkName");
            if (!o00oo0oo5.equals(o00oOOo06)) {
                return new o0O00OO.o00oOOoO(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + o00oo0oo5 + "\n Found:\n" + o00oOOo06);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new o00oo0OO.o00oOOo0("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new o00oo0OO.o00oOOo0("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new o00oo0OO.o00oOOoO("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            o00oo0OO o00oo0oo6 = new o00oo0OO("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            o00oo0OO o00oOOo07 = o00oo0OO.o00oOOo0(o00ooVar, "WorkProgress");
            if (!o00oo0oo6.equals(o00oOOo07)) {
                return new o0O00OO.o00oOOoO(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + o00oo0oo6 + "\n Found:\n" + o00oOOo07);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new o00oo0OO.o00oOOo0("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new o00oo0OO.o00oOOo0("long_value", "INTEGER", false, 0, null, 1));
            o00oo0OO o00oo0oo7 = new o00oo0OO(Preference.f3693o0O00, hashMap7, new HashSet(0), new HashSet(0));
            o00oo0OO o00oOOo08 = o00oo0OO.o00oOOo0(o00ooVar, Preference.f3693o0O00);
            if (o00oo0oo7.equals(o00oOOo08)) {
                return new o0O00OO.o00oOOoO(true, null);
            }
            return new o0O00OO.o00oOOoO(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + o00oo0oo7 + "\n Found:\n" + o00oOOo08);
        }

        @Override // o0O0OO.o0O00OO.o00oOOo0
        public void o00oOooO(o0O0OOoO.o00oo o00ooVar) {
            WorkDatabase_Impl.this.f11321o00oOOo0 = o00ooVar;
            o00ooVar.o00oo0O0("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.o00oo0o0(o00ooVar);
            List<o0O00O0o.o00oOOoO> list = WorkDatabase_Impl.this.f11326o00oOoO;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    WorkDatabase_Impl.this.f11326o00oOoO.get(i).o00oOo00(o00ooVar);
                }
            }
        }
    }

    @Override // o0O0OO.o0O00O0o
    public o00ooO0 o00oOoO(o00oOo0O o00ooo0o2) {
        o0O00OO o0o00oo = new o0O00OO(o00ooo0o2, new o00oOOo0(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        o00ooO0.o00oOOoO.o00oOOo0 o00oooo02 = new o00ooO0.o00oOOoO.o00oOOo0(o00ooo0o2.f11292o00oOOoO);
        o00oooo02.f11525o00oOOoO = o00ooo0o2.f11293o00oOo00;
        o00oooo02.f11526o00oOo00 = o0o00oo;
        return o00ooo0o2.f11291o00oOOo0.o00oOOo0(o00oooo02.o00oOOo0());
    }

    @Override // o0O0OO.o0O00O0o
    public androidx.room.o00oOo00 o00oOoO0() {
        return new androidx.room.o00oOo00(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", Preference.f3693o0O00);
    }

    @Override // o0O0OO.o0O00O0o
    public void o00oOooO() {
        o00oOOo0();
        o0O0OOoO.o00oo writableDatabase = this.f11331o00oOooO.getWritableDatabase();
        try {
            o00oOo00();
            writableDatabase.o00oo0O0("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.o00oo0O0("DELETE FROM `Dependency`");
            writableDatabase.o00oo0O0("DELETE FROM `WorkSpec`");
            writableDatabase.o00oo0O0("DELETE FROM `WorkTag`");
            writableDatabase.o00oo0O0("DELETE FROM `SystemIdInfo`");
            writableDatabase.o00oo0O0("DELETE FROM `WorkName`");
            writableDatabase.o00oo0O0("DELETE FROM `WorkProgress`");
            writableDatabase.o00oo0O0("DELETE FROM `Preference`");
            o00ooO0o();
        } finally {
            o00oOoOO();
            writableDatabase.o0O0Oo0o("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.o0O0o0Oo()) {
                writableDatabase.o00oo0O0("VACUUM");
            }
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public o00oo0O0 o00ooOO0() {
        o00oo0O0 o00oo0o02;
        if (this.f5568o00oo0Oo != null) {
            return this.f5568o00oo0Oo;
        }
        synchronized (this) {
            if (this.f5568o00oo0Oo == null) {
                this.f5568o00oo0Oo = new o00oo0O(this);
            }
            o00oo0o02 = this.f5568o00oo0Oo;
        }
        return o00oo0o02;
    }

    @Override // androidx.work.impl.WorkDatabase
    public o00oo o00ooOo() {
        o00oo o00ooVar;
        if (this.f5566o00oo != null) {
            return this.f5566o00oo;
        }
        synchronized (this) {
            if (this.f5566o00oo == null) {
                this.f5566o00oo = new o0O0o0Oo.o00ooO0(this);
            }
            o00ooVar = this.f5566o00oo;
        }
        return o00ooVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public o00ooO o00ooOoO() {
        o00ooO o00ooo;
        if (this.f5572o00ooO00 != null) {
            return this.f5572o00ooO00;
        }
        synchronized (this) {
            if (this.f5572o00ooO00 == null) {
                this.f5572o00ooO00 = new o0(this);
            }
            o00ooo = this.f5572o00ooO00;
        }
        return o00ooo;
    }

    @Override // androidx.work.impl.WorkDatabase
    public o0O0000O o00ooOoo() {
        o0O0000O o0o0000o;
        if (this.f5569o00oo0o != null) {
            return this.f5569o00oo0o;
        }
        synchronized (this) {
            if (this.f5569o00oo0o == null) {
                this.f5569o00oo0o = new o0O000(this);
            }
            o0o0000o = this.f5569o00oo0o;
        }
        return o0o0000o;
    }

    @Override // androidx.work.impl.WorkDatabase
    public o0O00 o00ooo0() {
        o0O00 o0o00;
        if (this.f5573o0O0o != null) {
            return this.f5573o0O0o;
        }
        synchronized (this) {
            if (this.f5573o0O0o == null) {
                this.f5573o0O0o = new o0O00O0(this);
            }
            o0o00 = this.f5573o0O0o;
        }
        return o0o00;
    }

    @Override // androidx.work.impl.WorkDatabase
    public o0OoOoOo o00ooo00() {
        o0OoOoOo o0oooooo;
        if (this.f5571o00oo0oO != null) {
            return this.f5571o00oo0oO;
        }
        synchronized (this) {
            if (this.f5571o00oo0oO == null) {
                this.f5571o00oo0oO = new o0O000Oo(this);
            }
            o0oooooo = this.f5571o00oo0oO;
        }
        return o0oooooo;
    }

    @Override // androidx.work.impl.WorkDatabase
    public o0O0o0Oo.o0O00O0o o00ooo0O() {
        o0O0o0Oo.o0O00O0o o0o00o0o;
        if (this.f5567o00oo0O != null) {
            return this.f5567o00oo0O;
        }
        synchronized (this) {
            if (this.f5567o00oo0O == null) {
                this.f5567o00oo0O = new o0O0o0Oo.o0O00O(this);
            }
            o0o00o0o = this.f5567o00oo0O;
        }
        return o0o00o0o;
    }

    @Override // androidx.work.impl.WorkDatabase
    public o0O00OOO o00ooo0o() {
        o0O00OOO o0o00ooo;
        if (this.f5570o00oo0o0 != null) {
            return this.f5570o00oo0o0;
        }
        synchronized (this) {
            if (this.f5570o00oo0o0 == null) {
                this.f5570o00oo0o0 = new o0oO0Ooo(this);
            }
            o0o00ooo = this.f5570o00oo0o0;
        }
        return o0o00ooo;
    }
}
