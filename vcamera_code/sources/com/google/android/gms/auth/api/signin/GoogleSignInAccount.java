package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.o00oOo00;
import androidx.core.content.FileProvider;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OOOo.o00oo0O0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    @oo0oO0
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();
    @VisibleForTesting
    @oo0oO0
    public static Clock zaa = DefaultClock.getInstance();
    @SafeParcelable.VersionField(id = 1)
    public final int zab;
    @SafeParcelable.Field(id = 10)
    public List zac;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getId", id = 2)
    private String zad;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getIdToken", id = 3)
    private String zae;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getEmail", id = 4)
    private String zaf;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getDisplayName", id = 5)
    private String zag;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getPhotoUrl", id = 6)
    private Uri zah;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getServerAuthCode", id = 7)
    private String zai;
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", id = 8)
    private long zaj;
    @SafeParcelable.Field(getter = "getObfuscatedIdentifier", id = 9)
    private String zak;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getGivenName", id = 11)
    private String zal;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getFamilyName", id = 12)
    private String zam;
    private Set zan = new HashSet();

    @SafeParcelable.Constructor
    public GoogleSignInAccount(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) @o0OO00OO String str, @SafeParcelable.Param(id = 3) @o0OO00OO String str2, @SafeParcelable.Param(id = 4) @o0OO00OO String str3, @SafeParcelable.Param(id = 5) @o0OO00OO String str4, @SafeParcelable.Param(id = 6) @o0OO00OO Uri uri, @SafeParcelable.Param(id = 7) @o0OO00OO String str5, @SafeParcelable.Param(id = 8) long j, @SafeParcelable.Param(id = 9) String str6, @SafeParcelable.Param(id = 10) List list, @SafeParcelable.Param(id = 11) @o0OO00OO String str7, @SafeParcelable.Param(id = 12) @o0OO00OO String str8) {
        this.zab = i;
        this.zad = str;
        this.zae = str2;
        this.zaf = str3;
        this.zag = str4;
        this.zah = uri;
        this.zai = str5;
        this.zaj = j;
        this.zak = str6;
        this.zac = list;
        this.zal = str7;
        this.zam = str8;
    }

    @oo0oO0
    @KeepForSdk
    public static GoogleSignInAccount createDefault() {
        return zae(new Account("<<default account>>", AccountType.GOOGLE), new HashSet());
    }

    @oo0oO0
    @KeepForSdk
    public static GoogleSignInAccount fromAccount(@oo0oO0 Account account) {
        return zae(account, new o00oOo00());
    }

    @oo0oO0
    public static GoogleSignInAccount zaa(@o0OO00OO String str, @o0OO00OO String str2, @o0OO00OO String str3, @o0OO00OO String str4, @o0OO00OO String str5, @o0OO00OO String str6, @o0OO00OO Uri uri, @o0OO00OO Long l, @oo0oO0 String str7, @oo0oO0 Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), Preconditions.checkNotEmpty(str7), new ArrayList((Collection) Preconditions.checkNotNull(set)), str5, str6);
    }

    @o0OO00OO
    public static GoogleSignInAccount zab(@o0OO00OO String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount zaa2 = zaa(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has(FileProvider.f2370o00ooOO0) ? jSONObject.optString(FileProvider.f2370o00ooOO0) : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        zaa2.zai = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return zaa2;
    }

    private static GoogleSignInAccount zae(Account account, Set set) {
        return zaa(null, null, account.name, null, null, null, null, 0L, account.name, set);
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.zak.equals(this.zak) && googleSignInAccount.getRequestedScopes().equals(getRequestedScopes());
        }
        return false;
    }

    @o0OO00OO
    public Account getAccount() {
        String str = this.zaf;
        if (str == null) {
            return null;
        }
        return new Account(str, AccountType.GOOGLE);
    }

    @o0OO00OO
    public String getDisplayName() {
        return this.zag;
    }

    @o0OO00OO
    public String getEmail() {
        return this.zaf;
    }

    @o0OO00OO
    public String getFamilyName() {
        return this.zam;
    }

    @o0OO00OO
    public String getGivenName() {
        return this.zal;
    }

    @oo0oO0
    public Set<Scope> getGrantedScopes() {
        return new HashSet(this.zac);
    }

    @o0OO00OO
    public String getId() {
        return this.zad;
    }

    @o0OO00OO
    public String getIdToken() {
        return this.zae;
    }

    @o0OO00OO
    public Uri getPhotoUrl() {
        return this.zah;
    }

    @oo0oO0
    @KeepForSdk
    public Set<Scope> getRequestedScopes() {
        HashSet hashSet = new HashSet(this.zac);
        hashSet.addAll(this.zan);
        return hashSet;
    }

    @o0OO00OO
    public String getServerAuthCode() {
        return this.zai;
    }

    public int hashCode() {
        return getRequestedScopes().hashCode() + o00oo0O0.o00oOOo0(this.zak, 527, 31);
    }

    @KeepForSdk
    public boolean isExpired() {
        return zaa.currentTimeMillis() / 1000 >= this.zaj + (-300);
    }

    @CanIgnoreReturnValue
    @oo0oO0
    @KeepForSdk
    public GoogleSignInAccount requestExtraScopes(@oo0oO0 Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.zan, scopeArr);
        }
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zab);
        SafeParcelWriter.writeString(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getIdToken(), false);
        SafeParcelWriter.writeString(parcel, 4, getEmail(), false);
        SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getPhotoUrl(), i, false);
        SafeParcelWriter.writeString(parcel, 7, getServerAuthCode(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.zaj);
        SafeParcelWriter.writeString(parcel, 9, this.zak, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.zac, false);
        SafeParcelWriter.writeString(parcel, 11, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 12, getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @oo0oO0
    public final String zac() {
        return this.zak;
    }

    @oo0oO0
    public final String zad() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put("id", getId());
            }
            if (getIdToken() != null) {
                jSONObject.put("tokenId", getIdToken());
            }
            if (getEmail() != null) {
                jSONObject.put("email", getEmail());
            }
            if (getDisplayName() != null) {
                jSONObject.put(FileProvider.f2370o00ooOO0, getDisplayName());
            }
            if (getGivenName() != null) {
                jSONObject.put("givenName", getGivenName());
            }
            if (getFamilyName() != null) {
                jSONObject.put("familyName", getFamilyName());
            }
            Uri photoUrl = getPhotoUrl();
            if (photoUrl != null) {
                jSONObject.put("photoUrl", photoUrl.toString());
            }
            if (getServerAuthCode() != null) {
                jSONObject.put("serverAuthCode", getServerAuthCode());
            }
            jSONObject.put("expirationTime", this.zaj);
            jSONObject.put("obfuscatedIdentifier", this.zak);
            JSONArray jSONArray = new JSONArray();
            List list = this.zac;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: com.google.android.gms.auth.api.signin.zaa
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
