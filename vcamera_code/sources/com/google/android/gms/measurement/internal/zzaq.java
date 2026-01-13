package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.support.v4.media.o00oOoO;
import com.google.android.gms.common.internal.AccountType;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o00oOooO.oO0Oo;
import o00ooo0.o0;
import oo0oO0.o00oo0;
/* loaded from: classes2.dex */
public final class zzaq extends zzgl {
    private long zza;
    private String zzb;
    private AccountManager zzc;
    private Boolean zzd;
    private long zze;

    public zzaq(zzfr zzfrVar) {
        super(zzfrVar);
    }

    @oO0Oo
    public final long zza() {
        zzg();
        return this.zze;
    }

    public final long zzb() {
        zzu();
        return this.zza;
    }

    public final String zzc() {
        zzu();
        return this.zzb;
    }

    @oO0Oo
    public final void zzd() {
        zzg();
        this.zzd = null;
        this.zze = 0L;
    }

    @oO0Oo
    public final boolean zze() {
        zzg();
        long currentTimeMillis = this.zzt.zzav().currentTimeMillis();
        if (currentTimeMillis - this.zze > 86400000) {
            this.zzd = null;
        }
        Boolean bool = this.zzd;
        if (bool == null) {
            if (o0.checkSelfPermission(this.zzt.zzau(), o00oo0.f17348o00ooo0) != 0) {
                this.zzt.zzay().zzm().zza("Permission error checking for dasher/unicorn accounts");
            } else {
                if (this.zzc == null) {
                    this.zzc = AccountManager.get(this.zzt.zzau());
                }
                try {
                    Account[] result = this.zzc.getAccountsByTypeAndFeatures(AccountType.GOOGLE, new String[]{"service_HOSTED"}, null, null).getResult();
                    if (result != null && result.length > 0) {
                        this.zzd = Boolean.TRUE;
                        this.zze = currentTimeMillis;
                        return true;
                    }
                    Account[] result2 = this.zzc.getAccountsByTypeAndFeatures(AccountType.GOOGLE, new String[]{"service_uca"}, null, null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.zzd = Boolean.TRUE;
                        this.zze = currentTimeMillis;
                        return true;
                    }
                } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                    this.zzt.zzay().zzh().zzb("Exception checking account types", e);
                }
            }
            this.zze = currentTimeMillis;
            this.zzd = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final boolean zzf() {
        Calendar calendar = Calendar.getInstance();
        this.zza = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.zzb = o00oOoO.o00oOOo0(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }
}
