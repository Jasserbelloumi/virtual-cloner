package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class AccountPicker {

    /* loaded from: classes.dex */
    public static class AccountChooserOptions {
        @o0OO00OO
        private Account zza;
        private boolean zzb;
        @o0OO00OO
        private ArrayList zzc;
        @o0OO00OO
        private ArrayList zzd;
        private boolean zze;
        @o0OO00OO
        private String zzf;
        @o0OO00OO
        private Bundle zzg;
        private boolean zzh;
        private int zzi;
        @o0OO00OO
        private String zzj;
        private boolean zzk;
        @o0OO00OO
        private zza zzl;
        @o0OO00OO
        private String zzm;
        private boolean zzn;
        private boolean zzo;

        /* loaded from: classes.dex */
        public static class Builder {
            @o0OO00OO
            private Account zza;
            @o0OO00OO
            private ArrayList zzb;
            @o0OO00OO
            private ArrayList zzc;
            private boolean zzd = false;
            @o0OO00OO
            private String zze;
            @o0OO00OO
            private Bundle zzf;

            @oo0oO0
            public AccountChooserOptions build() {
                Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
                Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
                AccountChooserOptions accountChooserOptions = new AccountChooserOptions();
                accountChooserOptions.zzd = this.zzc;
                accountChooserOptions.zzc = this.zzb;
                accountChooserOptions.zze = this.zzd;
                accountChooserOptions.zzl = null;
                accountChooserOptions.zzj = null;
                accountChooserOptions.zzg = this.zzf;
                accountChooserOptions.zza = this.zza;
                accountChooserOptions.zzb = false;
                accountChooserOptions.zzh = false;
                accountChooserOptions.zzm = null;
                accountChooserOptions.zzi = 0;
                accountChooserOptions.zzf = this.zze;
                accountChooserOptions.zzk = false;
                accountChooserOptions.zzn = false;
                accountChooserOptions.zzo = false;
                return accountChooserOptions;
            }

            @CanIgnoreReturnValue
            @oo0oO0
            public Builder setAllowableAccounts(@o0OO00OO List<Account> list) {
                this.zzb = list == null ? null : new ArrayList(list);
                return this;
            }

            @CanIgnoreReturnValue
            @oo0oO0
            public Builder setAllowableAccountsTypes(@o0OO00OO List<String> list) {
                this.zzc = list == null ? null : new ArrayList(list);
                return this;
            }

            @CanIgnoreReturnValue
            @oo0oO0
            public Builder setAlwaysShowAccountPicker(boolean z) {
                this.zzd = z;
                return this;
            }

            @CanIgnoreReturnValue
            @oo0oO0
            public Builder setOptionsForAddingAccount(@o0OO00OO Bundle bundle) {
                this.zzf = bundle;
                return this;
            }

            @CanIgnoreReturnValue
            @oo0oO0
            public Builder setSelectedAccount(@o0OO00OO Account account) {
                this.zza = account;
                return this;
            }

            @CanIgnoreReturnValue
            @oo0oO0
            public Builder setTitleOverrideText(@o0OO00OO String str) {
                this.zze = str;
                return this;
            }
        }

        public static /* bridge */ /* synthetic */ boolean zzA(AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.zzo;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean zzB(AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.zzb;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean zzC(AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.zzh;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean zzD(AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.zzk;
            return false;
        }

        public static /* bridge */ /* synthetic */ int zza(AccountChooserOptions accountChooserOptions) {
            int i = accountChooserOptions.zzi;
            return 0;
        }

        public static /* bridge */ /* synthetic */ zza zzd(AccountChooserOptions accountChooserOptions) {
            zza zzaVar = accountChooserOptions.zzl;
            return null;
        }

        public static /* bridge */ /* synthetic */ String zze(AccountChooserOptions accountChooserOptions) {
            String str = accountChooserOptions.zzj;
            return null;
        }

        public static /* bridge */ /* synthetic */ String zzf(AccountChooserOptions accountChooserOptions) {
            String str = accountChooserOptions.zzm;
            return null;
        }

        public static /* bridge */ /* synthetic */ boolean zzz(AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.zzn;
            return false;
        }
    }

    private AccountPicker() {
    }

    @oo0oO0
    @Deprecated
    public static Intent newChooseAccountIntent(@o0OO00OO Account account, @o0OO00OO ArrayList<Account> arrayList, @o0OO00OO String[] strArr, boolean z, @o0OO00OO String str, @o0OO00OO String str2, @o0OO00OO String[] strArr2, @o0OO00OO Bundle bundle) {
        Intent intent = new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    @oo0oO0
    public static Intent newChooseAccountIntent(@oo0oO0 AccountChooserOptions accountChooserOptions) {
        Intent intent = new Intent();
        AccountChooserOptions.zzD(accountChooserOptions);
        AccountChooserOptions.zze(accountChooserOptions);
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        AccountChooserOptions.zzd(accountChooserOptions);
        Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
        AccountChooserOptions.zzB(accountChooserOptions);
        Preconditions.checkArgument(true, "Making the selected account non-clickable is only supported for the theme THEME_DAY_NIGHT_GOOGLE_MATERIAL2");
        AccountChooserOptions.zzD(accountChooserOptions);
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", accountChooserOptions.zzc);
        if (accountChooserOptions.zzd != null) {
            intent.putExtra("allowableAccountTypes", (String[]) accountChooserOptions.zzd.toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", accountChooserOptions.zzg);
        intent.putExtra("selectedAccount", accountChooserOptions.zza);
        AccountChooserOptions.zzB(accountChooserOptions);
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", accountChooserOptions.zze);
        intent.putExtra("descriptionTextOverride", accountChooserOptions.zzf);
        AccountChooserOptions.zzC(accountChooserOptions);
        intent.putExtra("setGmsCoreAccount", false);
        AccountChooserOptions.zzf(accountChooserOptions);
        intent.putExtra("realClientPackage", (String) null);
        AccountChooserOptions.zza(accountChooserOptions);
        intent.putExtra("overrideTheme", 0);
        AccountChooserOptions.zzD(accountChooserOptions);
        intent.putExtra("overrideCustomTheme", 0);
        AccountChooserOptions.zze(accountChooserOptions);
        intent.putExtra("hostedDomainFilter", (String) null);
        Bundle bundle = new Bundle();
        AccountChooserOptions.zzD(accountChooserOptions);
        AccountChooserOptions.zzd(accountChooserOptions);
        AccountChooserOptions.zzz(accountChooserOptions);
        AccountChooserOptions.zzA(accountChooserOptions);
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
