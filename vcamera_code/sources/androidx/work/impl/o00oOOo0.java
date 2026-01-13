package androidx.work.impl;

import android.content.Context;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0OOoO.o00oo;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oOOo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f5681o00oOOo0 = 1;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f5682o00oOOoO = 2;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f5683o00oOo00 = 3;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f5684o00oOo0O = 5;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f5685o00oOo0o = 6;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f5686o00oOoO = 8;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f5687o00oOoO0 = 7;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f5688o00oOoOO = 9;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f5689o00oOoOo = 10;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f5690o00oOoo0 = 11;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f5691o00oOooO = 4;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f5692o00oOooo = 12;

    /* renamed from: o00oo  reason: collision with root package name */
    public static final String f5693o00oo = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))";

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f5694o00oo0 = "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo";

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final String f5695o00oo00O = "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f5696o00oo0O = "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f5697o00oo0O0 = "DROP TABLE IF EXISTS alarmInfo";

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final String f5698o00oo0OO = "UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0";

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String f5699o00oo0Oo = "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1";

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f5700o00oo0o = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)";

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f5701o00oo0o0 = "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f5702o00oo0oO = "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0";

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final String f5705o00ooO00 = "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0";

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final String f5711o0O0o = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";
    @oo0oO0

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static o0O0OOO0.o00oOOo0 f5704o00ooO0 = new C0066o00oOOo0(1, 2);
    @oo0oO0

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static o0O0OOO0.o00oOOo0 f5706o00ooO0O = new o00oOOoO(3, 4);
    @oo0oO0

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static o0O0OOO0.o00oOOo0 f5707o00ooO0o = new o00oOo00(4, 5);
    @oo0oO0

    /* renamed from: o00ooO  reason: collision with root package name */
    public static o0O0OOO0.o00oOOo0 f5703o00ooO = new o00oOo0O(6, 7);
    @oo0oO0

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static o0O0OOO0.o00oOOo0 f5709o00ooOO0 = new o00oOoO(7, 8);
    @oo0oO0

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static o0O0OOO0.o00oOOo0 f5708o00ooOO = new o00oo00O(8, 9);
    @oo0oO0

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static o0O0OOO0.o00oOOo0 f5710o00ooOOo = new o00oo0(11, 12);

    /* renamed from: androidx.work.impl.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0066o00oOOo0 extends o0O0OOO0.o00oOOo0 {
        public C0066o00oOOo0(int i, int i2) {
            super(i, i2);
        }

        @Override // o0O0OOO0.o00oOOo0
        public void o00oOOo0(@oo0oO0 o00oo o00ooVar) {
            o00ooVar.o00oo0O0(o00oOOo0.f5695o00oo00O);
            o00ooVar.o00oo0O0(o00oOOo0.f5694o00oo0);
            o00ooVar.o00oo0O0(o00oOOo0.f5697o00oo0O0);
            o00ooVar.o00oo0O0("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o0O0OOO0.o00oOOo0 {
        public o00oOOoO(int i, int i2) {
            super(i, i2);
        }

        @Override // o0O0OOO0.o00oOOo0
        public void o00oOOo0(@oo0oO0 o00oo o00ooVar) {
            o00ooVar.o00oo0O0(o00oOOo0.f5698o00oo0OO);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends o0O0OOO0.o00oOOo0 {
        public o00oOo00(int i, int i2) {
            super(i, i2);
        }

        @Override // o0O0OOO0.o00oOOo0
        public void o00oOOo0(@oo0oO0 o00oo o00ooVar) {
            o00ooVar.o00oo0O0(o00oOOo0.f5696o00oo0O);
            o00ooVar.o00oo0O0(o00oOOo0.f5699o00oo0Oo);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O extends o0O0OOO0.o00oOOo0 {
        public o00oOo0O(int i, int i2) {
            super(i, i2);
        }

        @Override // o0O0OOO0.o00oOOo0
        public void o00oOOo0(@oo0oO0 o00oo o00ooVar) {
            o00ooVar.o00oo0O0(o00oOOo0.f5701o00oo0o0);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO extends o0O0OOO0.o00oOOo0 {
        public o00oOoO(int i, int i2) {
            super(i, i2);
        }

        @Override // o0O0OOO0.o00oOOo0
        public void o00oOOo0(@oo0oO0 o00oo o00ooVar) {
            o00ooVar.o00oo0O0(o00oOOo0.f5700o00oo0o);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0 extends o0O0OOO0.o00oOOo0 {
        public o00oo0(int i, int i2) {
            super(i, i2);
        }

        @Override // o0O0OOO0.o00oOOo0
        public void o00oOOo0(@oo0oO0 o00oo o00ooVar) {
            o00ooVar.o00oo0O0(o00oOOo0.f5705o00ooO00);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O extends o0O0OOO0.o00oOOo0 {
        public o00oo00O(int i, int i2) {
            super(i, i2);
        }

        @Override // o0O0OOO0.o00oOOo0
        public void o00oOOo0(@oo0oO0 o00oo o00ooVar) {
            o00ooVar.o00oo0O0(o00oOOo0.f5702o00oo0oO);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O0 extends o0O0OOO0.o00oOOo0 {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Context f5712o00oOo00;

        public o00oo0O0(@oo0oO0 Context context) {
            super(9, 10);
            this.f5712o00oOo00 = context;
        }

        @Override // o0O0OOO0.o00oOOo0
        public void o00oOOo0(@oo0oO0 o00oo o00ooVar) {
            o00ooVar.o00oo0O0(o00oOOo0.f5693o00oo);
            o0O0o0o0.o00oo0OO.o00oOooO(this.f5712o00oOo00, o00ooVar);
            o0O0o0o0.o00oOoO.o00oOOo0(this.f5712o00oOo00, o00ooVar);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0OO extends o0O0OOO0.o00oOOo0 {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Context f5713o00oOo00;

        public o00oo0OO(@oo0oO0 Context context, int i, int i2) {
            super(i, i2);
            this.f5713o00oOo00 = context;
        }

        @Override // o0O0OOO0.o00oOOo0
        public void o00oOOo0(@oo0oO0 o00oo o00ooVar) {
            if (this.f11473o00oOOoO >= 10) {
                o00ooVar.o00ooo0o(o00oOOo0.f5711o0O0o, new Object[]{o0O0o0o0.o00oo0OO.f12559o00oOooO, 1});
            } else {
                this.f5713o00oOo00.getSharedPreferences(o0O0o0o0.o00oo0OO.f12557o00oOOoO, 0).edit().putBoolean(o0O0o0o0.o00oo0OO.f12559o00oOooO, true).apply();
            }
        }
    }
}
