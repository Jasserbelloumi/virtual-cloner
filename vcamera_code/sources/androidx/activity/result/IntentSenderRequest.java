package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    @oo0oO0
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new o00oOOo0();
    @o0OO00OO

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Intent f104o00oo0O;
    @oo0oO0

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final IntentSender f105o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final int f106o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final int f107o00oo0o0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOo0 */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOoO */
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public IntentSender f108o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public Intent f109o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f110o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f111o00oOooO;

        public o00oOOoO(@oo0oO0 PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }

        public o00oOOoO(@oo0oO0 IntentSender intentSender) {
            this.f108o00oOOo0 = intentSender;
        }

        @oo0oO0
        public IntentSenderRequest o00oOOo0() {
            return new IntentSenderRequest(this.f108o00oOOo0, this.f109o00oOOoO, this.f110o00oOo00, this.f111o00oOooO);
        }

        @oo0oO0
        public o00oOOoO o00oOOoO(@o0OO00OO Intent intent) {
            this.f109o00oOOoO = intent;
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oOo00(int i, int i2) {
            this.f111o00oOooO = i;
            this.f110o00oOo00 = i2;
            return this;
        }
    }

    public IntentSenderRequest(@oo0oO0 IntentSender intentSender, @o0OO00OO Intent intent, int i, int i2) {
        this.f105o00oo0O0 = intentSender;
        this.f104o00oo0O = intent;
        this.f106o00oo0Oo = i;
        this.f107o00oo0o0 = i2;
    }

    public IntentSenderRequest(@oo0oO0 Parcel parcel) {
        this.f105o00oo0O0 = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f104o00oo0O = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f106o00oo0Oo = parcel.readInt();
        this.f107o00oo0o0 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @o0OO00OO
    public Intent o00oOOo0() {
        return this.f104o00oo0O;
    }

    public int o00oOOoO() {
        return this.f106o00oo0Oo;
    }

    public int o00oOo00() {
        return this.f107o00oo0o0;
    }

    @oo0oO0
    public IntentSender o00oOooO() {
        return this.f105o00oo0O0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        parcel.writeParcelable(this.f105o00oo0O0, i);
        parcel.writeParcelable(this.f104o00oo0O, i);
        parcel.writeInt(this.f106o00oo0Oo);
        parcel.writeInt(this.f107o00oo0o0);
    }
}
