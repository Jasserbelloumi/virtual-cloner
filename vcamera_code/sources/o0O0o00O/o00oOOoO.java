package o0O0o00O;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o00oOoO;
import o0O0Ooo0.o00oo0;
import o0O0Ooo0.o00oo00O;
import o0O0Ooo0.o0O00000;
import o0O0Ooo0.o0O0000O;
import o0O0o0Oo.o0OoO00O;
@o0OOooO0(api = 23)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oOOoO {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f12327o00oOOoO = o0O00000.o00oOo0o("SystemJobInfoConverter");

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f12328o00oOo00 = "EXTRA_WORK_SPEC_ID";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f12329o00oOooO = "EXTRA_IS_PERIODIC";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ComponentName f12330o00oOOo0;

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f12331o00oOOo0;

        static {
            int[] iArr = new int[o0O0000O.values().length];
            f12331o00oOOo0 = iArr;
            try {
                iArr[o0O0000O.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12331o00oOOo0[o0O0000O.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12331o00oOOo0[o0O0000O.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12331o00oOOo0[o0O0000O.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12331o00oOOo0[o0O0000O.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @o0o0000(otherwise = 3)
    public o00oOOoO(@oo0oO0 Context context) {
        this.f12330o00oOOo0 = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    @o0OOooO0(24)
    public static JobInfo.TriggerContentUri o00oOOoO(o00oo0.o00oOOo0 o00oooo02) {
        return new JobInfo.TriggerContentUri(o00oooo02.f12145o00oOOo0, o00oooo02.f12146o00oOOoO ? 1 : 0);
    }

    public static int o00oOo00(o0O0000O o0o0000o) {
        int i = o00oOOo0.f12331o00oOOo0[o0o0000o.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            o0O00000.o00oOo00().o00oOOo0(f12327o00oOOoO, String.format("API version too low. Cannot convert network type value %s", o0o0000o), new Throwable[0]);
                            return 1;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static void o00oOooO(@oo0oO0 JobInfo.Builder builder, @oo0oO0 o0O0000O o0o0000o) {
        if (Build.VERSION.SDK_INT < 30 || o0o0000o != o0O0000O.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(o00oOo00(o0o0000o));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    public JobInfo o00oOOo0(o0OoO00O o0ooo00o, int i) {
        o00oo00O o00oo00o = o0ooo00o.f12470o00oOoOo;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f12328o00oOo00, o0ooo00o.f12462o00oOOo0);
        persistableBundle.putBoolean(f12329o00oOooO, o0ooo00o.o00oOooO());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f12330o00oOOo0).setRequiresCharging(o00oo00o.f12149o00oOOoO).setRequiresDeviceIdle(o00oo00o.f12150o00oOo00).setExtras(persistableBundle);
        o00oOooO(extras, o00oo00o.f12148o00oOOo0);
        if (!o00oo00o.f12150o00oOo00) {
            extras.setBackoffCriteria(o0ooo00o.f12475o00oo00O, o0ooo00o.f12473o00oOooo == o00oOoO.LINEAR ? 0 : 1);
        }
        long max = Math.max(o0ooo00o.o00oOOo0() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || max > 0) {
            extras.setMinimumLatency(max);
        } else if (!o0ooo00o.f12476o00oo0O) {
            extras.setImportantWhileForeground(true);
        }
        if (o00oo00o.o00oOo0O()) {
            for (o00oo0.o00oOOo0 o00oooo02 : o00oo00o.f12153o00oOoO.f12144o00oOOo0) {
                extras.addTriggerContentUri(o00oOOoO(o00oooo02));
            }
            extras.setTriggerContentUpdateDelay(o00oo00o.f12152o00oOo0o);
            extras.setTriggerContentMaxDelay(o00oo00o.f12154o00oOoO0);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(o00oo00o.f12155o00oOooO);
        extras.setRequiresStorageNotLow(o00oo00o.f12151o00oOo0O);
        boolean z = o0ooo00o.f12471o00oOoo0 > 0;
        if (o0O000.o00oOOo0.o00oOoOO() && o0ooo00o.f12476o00oo0O && !z) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
