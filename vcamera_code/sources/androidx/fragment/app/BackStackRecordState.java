package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.o0O0oo0o;
import androidx.lifecycle.o0O00;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import o00oOooO.oo0oO0;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new o00oOOo0();

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final String f2777o00ooOO = "FragmentManager";

    /* renamed from: o00oo  reason: collision with root package name */
    public final int f2778o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final ArrayList<String> f2779o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final int[] f2780o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final int[] f2781o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final int f2782o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final int[] f2783o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final String f2784o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public final ArrayList<String> f2785o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public final int f2786o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final CharSequence f2787o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public final CharSequence f2788o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public final ArrayList<String> f2789o00ooO0o;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public final boolean f2790o00ooOO0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final int f2791o0O0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOo0 */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOoO */
        public BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(Parcel parcel) {
        this.f2780o00oo0O0 = parcel.createIntArray();
        this.f2779o00oo0O = parcel.createStringArrayList();
        this.f2781o00oo0Oo = parcel.createIntArray();
        this.f2783o00oo0o0 = parcel.createIntArray();
        this.f2782o00oo0o = parcel.readInt();
        this.f2784o00oo0oO = parcel.readString();
        this.f2791o0O0o = parcel.readInt();
        this.f2778o00oo = parcel.readInt();
        this.f2787o00ooO00 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2786o00ooO0 = parcel.readInt();
        this.f2788o00ooO0O = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2789o00ooO0o = parcel.createStringArrayList();
        this.f2785o00ooO = parcel.createStringArrayList();
        this.f2790o00ooOO0 = parcel.readInt() != 0;
    }

    public BackStackRecordState(androidx.fragment.app.o00oOOo0 o00oooo02) {
        int size = o00oooo02.f3151o00oOo00.size();
        this.f2780o00oo0O0 = new int[size * 6];
        if (!o00oooo02.f3156o00oOoOO) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2779o00oo0O = new ArrayList<>(size);
        this.f2781o00oo0Oo = new int[size];
        this.f2783o00oo0o0 = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            o0O0oo0o.o00oOOo0 o00oooo03 = o00oooo02.f3151o00oOo00.get(i);
            int i3 = i2 + 1;
            this.f2780o00oo0O0[i2] = o00oooo03.f3168o00oOOo0;
            ArrayList<String> arrayList = this.f2779o00oo0O;
            Fragment fragment = o00oooo03.f3169o00oOOoO;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f2780o00oo0O0;
            int i4 = i3 + 1;
            iArr[i3] = o00oooo03.f3170o00oOo00 ? 1 : 0;
            int i5 = i4 + 1;
            iArr[i4] = o00oooo03.f3176o00oOooO;
            int i6 = i5 + 1;
            iArr[i5] = o00oooo03.f3171o00oOo0O;
            int i7 = i6 + 1;
            iArr[i6] = o00oooo03.f3172o00oOo0o;
            iArr[i7] = o00oooo03.f3174o00oOoO0;
            this.f2781o00oo0Oo[i] = o00oooo03.f3173o00oOoO.ordinal();
            this.f2783o00oo0o0[i] = o00oooo03.f3175o00oOoOO.ordinal();
            i++;
            i2 = i7 + 1;
        }
        this.f2782o00oo0o = o00oooo02.f3154o00oOoO;
        this.f2784o00oo0oO = o00oooo02.f3158o00oOoo0;
        this.f2791o0O0o = o00oooo02.f2967o00oooOo;
        this.f2778o00oo = o00oooo02.f3160o00oOooo;
        this.f2787o00ooO00 = o00oooo02.f3162o00oo00O;
        this.f2786o00ooO0 = o00oooo02.f3161o00oo0;
        this.f2788o00ooO0O = o00oooo02.f3165o00oo0OO;
        this.f2789o00ooO0o = o00oooo02.f3164o00oo0O0;
        this.f2785o00ooO = o00oooo02.f3163o00oo0O;
        this.f2790o00ooOO0 = o00oooo02.f3166o00oo0Oo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void o00oOOo0(@oo0oO0 androidx.fragment.app.o00oOOo0 o00oooo02) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f2780o00oo0O0.length) {
                o00oooo02.f3154o00oOoO = this.f2782o00oo0o;
                o00oooo02.f3158o00oOoo0 = this.f2784o00oo0oO;
                o00oooo02.f3156o00oOoOO = true;
                o00oooo02.f3160o00oOooo = this.f2778o00oo;
                o00oooo02.f3162o00oo00O = this.f2787o00ooO00;
                o00oooo02.f3161o00oo0 = this.f2786o00ooO0;
                o00oooo02.f3165o00oo0OO = this.f2788o00ooO0O;
                o00oooo02.f3164o00oo0O0 = this.f2789o00ooO0o;
                o00oooo02.f3163o00oo0O = this.f2785o00ooO;
                o00oooo02.f3166o00oo0Oo = this.f2790o00ooOO0;
                return;
            }
            o0O0oo0o.o00oOOo0 o00oooo03 = new o0O0oo0o.o00oOOo0();
            int i3 = i + 1;
            o00oooo03.f3168o00oOOo0 = this.f2780o00oo0O0[i];
            if (FragmentManager.oo0OOoo(2)) {
                Objects.toString(o00oooo02);
                int i4 = this.f2780o00oo0O0[i3];
            }
            o00oooo03.f3173o00oOoO = o0O00.o00oOOoO.values()[this.f2781o00oo0Oo[i2]];
            o00oooo03.f3175o00oOoOO = o0O00.o00oOOoO.values()[this.f2783o00oo0o0[i2]];
            int[] iArr = this.f2780o00oo0O0;
            int i5 = i3 + 1;
            if (iArr[i3] == 0) {
                z = false;
            }
            o00oooo03.f3170o00oOo00 = z;
            int i6 = i5 + 1;
            int i7 = iArr[i5];
            o00oooo03.f3176o00oOooO = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            o00oooo03.f3171o00oOo0O = i9;
            int i10 = i8 + 1;
            int i11 = iArr[i8];
            o00oooo03.f3172o00oOo0o = i11;
            int i12 = iArr[i10];
            o00oooo03.f3174o00oOoO0 = i12;
            o00oooo02.f3159o00oOooO = i7;
            o00oooo02.f3152o00oOo0O = i9;
            o00oooo02.f3153o00oOo0o = i11;
            o00oooo02.f3155o00oOoO0 = i12;
            o00oooo02.o00oOoOO(o00oooo03);
            i2++;
            i = i10 + 1;
        }
    }

    @oo0oO0
    public androidx.fragment.app.o00oOOo0 o00oOOoO(@oo0oO0 FragmentManager fragmentManager) {
        androidx.fragment.app.o00oOOo0 o00oooo02 = new androidx.fragment.app.o00oOOo0(fragmentManager);
        o00oOOo0(o00oooo02);
        o00oooo02.f2967o00oooOo = this.f2791o0O0o;
        for (int i = 0; i < this.f2779o00oo0O.size(); i++) {
            String str = this.f2779o00oo0O.get(i);
            if (str != null) {
                o00oooo02.f3151o00oOo00.get(i).f3169o00oOOoO = fragmentManager.o0O00Oo(str);
            }
        }
        o00oooo02.o00oooo0(1);
        return o00oooo02;
    }

    @oo0oO0
    public androidx.fragment.app.o00oOOo0 o00oOo00(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Map<String, Fragment> map) {
        androidx.fragment.app.o00oOOo0 o00oooo02 = new androidx.fragment.app.o00oOOo0(fragmentManager);
        o00oOOo0(o00oooo02);
        for (int i = 0; i < this.f2779o00oo0O.size(); i++) {
            String str = this.f2779o00oo0O.get(i);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment == null) {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Restoring FragmentTransaction ");
                    o00oOOo02.append(this.f2784o00oo0oO);
                    o00oOOo02.append(" failed due to missing saved state for Fragment (");
                    o00oOOo02.append(str);
                    o00oOOo02.append(")");
                    throw new IllegalStateException(o00oOOo02.toString());
                }
                o00oooo02.f3151o00oOo00.get(i).f3169o00oOOoO = fragment;
            }
        }
        return o00oooo02;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2780o00oo0O0);
        parcel.writeStringList(this.f2779o00oo0O);
        parcel.writeIntArray(this.f2781o00oo0Oo);
        parcel.writeIntArray(this.f2783o00oo0o0);
        parcel.writeInt(this.f2782o00oo0o);
        parcel.writeString(this.f2784o00oo0oO);
        parcel.writeInt(this.f2791o0O0o);
        parcel.writeInt(this.f2778o00oo);
        TextUtils.writeToParcel(this.f2787o00ooO00, parcel, 0);
        parcel.writeInt(this.f2786o00ooO0);
        TextUtils.writeToParcel(this.f2788o00ooO0O, parcel, 0);
        parcel.writeStringList(this.f2789o00ooO0o);
        parcel.writeStringList(this.f2785o00ooO);
        parcel.writeInt(this.f2790o00ooOO0 ? 1 : 0);
    }
}
