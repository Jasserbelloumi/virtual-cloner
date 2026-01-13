package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    @oo0oO0
    public static final Parcelable.Creator<ActivityResult> CREATOR = new o00oOOo0();
    @o0OO00OO

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Intent f73o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final int f74o00oo0O0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Parcelable.Creator<ActivityResult> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOo0 */
        public ActivityResult createFromParcel(@oo0oO0 Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOoO */
        public ActivityResult[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(int i, @o0OO00OO Intent intent) {
        this.f74o00oo0O0 = i;
        this.f73o00oo0O = intent;
    }

    public ActivityResult(Parcel parcel) {
        this.f74o00oo0O0 = parcel.readInt();
        this.f73o00oo0O = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @oo0oO0
    public static String o00oOo00(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @o0OO00OO
    public Intent o00oOOo0() {
        return this.f73o00oo0O;
    }

    public int o00oOOoO() {
        return this.f74o00oo0O0;
    }

    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ActivityResult{resultCode=");
        o00oOOo02.append(o00oOo00(this.f74o00oo0O0));
        o00oOOo02.append(", data=");
        o00oOOo02.append(this.f73o00oo0O);
        o00oOOo02.append('}');
        return o00oOOo02.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        parcel.writeInt(this.f74o00oo0O0);
        parcel.writeInt(this.f73o00oo0O == null ? 0 : 1);
        Intent intent = this.f73o00oo0O;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
