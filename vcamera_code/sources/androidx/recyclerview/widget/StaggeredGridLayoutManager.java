package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o0O00000 implements RecyclerView.o0O00OO.o00oOOoO {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f4194o00ooO = 1;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final String f4195o00ooO0 = "StaggeredGridLManager";

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final boolean f4196o00ooO0O = false;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f4197o00ooO0o = 0;
    @Deprecated

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f4198o00ooOO = 1;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f4199o00ooOO0 = 0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f4200o00ooOOo = 2;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final float f4201o00ooOo = 0.33333334f;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f4202o00ooOo0 = Integer.MIN_VALUE;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOo0O[] f4204o00oOOoO;
    @oo0oO0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o0O00O f4205o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f4206o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f4207o00oOo0o;
    @oo0oO0

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final o0O000O f4209o00oOoO0;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public BitSet f4211o00oOoOo;
    @oo0oO0

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o0O00O f4213o00oOooO;

    /* renamed from: o00oo  reason: collision with root package name */
    public int[] f4215o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public SavedState f4218o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public boolean f4219o00oo0O0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public boolean f4220o00oo0OO;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f4221o00oo0Oo;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f4203o00oOOo0 = -1;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f4208o00oOoO = false;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public boolean f4210o00oOoOO = false;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public int f4212o00oOoo0 = -1;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f4214o00oOooo = Integer.MIN_VALUE;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public LazySpanLookup f4217o00oo00O = new LazySpanLookup();

    /* renamed from: o00oo0  reason: collision with root package name */
    public int f4216o00oo0 = 2;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final Rect f4223o00oo0o0 = new Rect();

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final o00oOOoO f4222o00oo0o = new o00oOOoO();

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public boolean f4224o00oo0oO = false;

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f4226o0O0o = true;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final Runnable f4225o00ooO00 = new o00oOOo0();

    /* loaded from: classes.dex */
    public static class LazySpanLookup {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f4227o00oOo00 = 10;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int[] f4228o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public List<FullSpanItem> f4229o00oOOoO;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new o00oOOo0();

            /* renamed from: o00oo0O  reason: collision with root package name */
            public int f4230o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public int f4231o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public int[] f4232o00oo0Oo;

            /* renamed from: o00oo0o0  reason: collision with root package name */
            public boolean f4233o00oo0o0;

            /* loaded from: classes.dex */
            public class o00oOOo0 implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: o00oOOo0 */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: o00oOOoO */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem() {
            }

            public FullSpanItem(Parcel parcel) {
                this.f4231o00oo0O0 = parcel.readInt();
                this.f4230o00oo0O = parcel.readInt();
                this.f4233o00oo0o0 = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f4232o00oo0Oo = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public int o00oOOo0(int i) {
                int[] iArr = this.f4232o00oo0Oo;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public String toString() {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("FullSpanItem{mPosition=");
                o00oOOo02.append(this.f4231o00oo0O0);
                o00oOOo02.append(", mGapDir=");
                o00oOOo02.append(this.f4230o00oo0O);
                o00oOOo02.append(", mHasUnwantedGapAfter=");
                o00oOOo02.append(this.f4233o00oo0o0);
                o00oOOo02.append(", mGapPerSpan=");
                o00oOOo02.append(Arrays.toString(this.f4232o00oo0Oo));
                o00oOOo02.append('}');
                return o00oOOo02.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f4231o00oo0O0);
                parcel.writeInt(this.f4230o00oo0O);
                parcel.writeInt(this.f4233o00oo0o0 ? 1 : 0);
                int[] iArr = this.f4232o00oo0Oo;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f4232o00oo0Oo);
            }
        }

        public void o00oOOo0(FullSpanItem fullSpanItem) {
            if (this.f4229o00oOOoO == null) {
                this.f4229o00oOOoO = new ArrayList();
            }
            int size = this.f4229o00oOOoO.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f4229o00oOOoO.get(i);
                if (fullSpanItem2.f4231o00oo0O0 == fullSpanItem.f4231o00oo0O0) {
                    this.f4229o00oOOoO.remove(i);
                }
                if (fullSpanItem2.f4231o00oo0O0 >= fullSpanItem.f4231o00oo0O0) {
                    this.f4229o00oOOoO.add(i, fullSpanItem);
                    return;
                }
            }
            this.f4229o00oOOoO.add(fullSpanItem);
        }

        public void o00oOOoO() {
            int[] iArr = this.f4228o00oOOo0;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4229o00oOOoO = null;
        }

        public void o00oOo00(int i) {
            int[] iArr = this.f4228o00oOOo0;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f4228o00oOOo0 = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[o00oo0OO(i)];
                this.f4228o00oOOo0 = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4228o00oOOo0;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public FullSpanItem o00oOo0O(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f4229o00oOOoO;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f4229o00oOOoO.get(i4);
                int i5 = fullSpanItem.f4231o00oo0O0;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f4230o00oo0O == i3 || (z && fullSpanItem.f4233o00oo0o0))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem o00oOo0o(int i) {
            List<FullSpanItem> list = this.f4229o00oOOoO;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4229o00oOOoO.get(size);
                if (fullSpanItem.f4231o00oo0O0 == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public int o00oOoO(int i) {
            int[] iArr = this.f4228o00oOOo0;
            if (iArr != null && i < iArr.length) {
                int o00oOoOO2 = o00oOoOO(i);
                if (o00oOoOO2 == -1) {
                    int[] iArr2 = this.f4228o00oOOo0;
                    Arrays.fill(iArr2, i, iArr2.length, -1);
                    return this.f4228o00oOOo0.length;
                }
                int min = Math.min(o00oOoOO2 + 1, this.f4228o00oOOo0.length);
                Arrays.fill(this.f4228o00oOOo0, i, min, -1);
                return min;
            }
            return -1;
        }

        public int o00oOoO0(int i) {
            int[] iArr = this.f4228o00oOOo0;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        public final int o00oOoOO(int i) {
            if (this.f4229o00oOOoO == null) {
                return -1;
            }
            FullSpanItem o00oOo0o2 = o00oOo0o(i);
            if (o00oOo0o2 != null) {
                this.f4229o00oOOoO.remove(o00oOo0o2);
            }
            int size = this.f4229o00oOOoO.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f4229o00oOOoO.get(i2).f4231o00oo0O0 >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                this.f4229o00oOOoO.remove(i2);
                return this.f4229o00oOOoO.get(i2).f4231o00oo0O0;
            }
            return -1;
        }

        public void o00oOoOo(int i, int i2) {
            int[] iArr = this.f4228o00oOOo0;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            o00oOo00(i3);
            int[] iArr2 = this.f4228o00oOOo0;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f4228o00oOOo0, i, i3, -1);
            o00oOooo(i, i2);
        }

        public void o00oOoo0(int i, int i2) {
            int[] iArr = this.f4228o00oOOo0;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            o00oOo00(i3);
            int[] iArr2 = this.f4228o00oOOo0;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f4228o00oOOo0;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            o00oo00O(i, i2);
        }

        public int o00oOooO(int i) {
            List<FullSpanItem> list = this.f4229o00oOOoO;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4229o00oOOoO.get(size).f4231o00oo0O0 >= i) {
                        this.f4229o00oOOoO.remove(size);
                    }
                }
            }
            return o00oOoO(i);
        }

        public final void o00oOooo(int i, int i2) {
            List<FullSpanItem> list = this.f4229o00oOOoO;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4229o00oOOoO.get(size);
                int i3 = fullSpanItem.f4231o00oo0O0;
                if (i3 >= i) {
                    fullSpanItem.f4231o00oo0O0 = i3 + i2;
                }
            }
        }

        public void o00oo0(int i, o00oOo0O o00ooo0o2) {
            o00oOo00(i);
            this.f4228o00oOOo0[i] = o00ooo0o2.f4259o00oOo0O;
        }

        public final void o00oo00O(int i, int i2) {
            List<FullSpanItem> list = this.f4229o00oOOoO;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4229o00oOOoO.get(size);
                int i4 = fullSpanItem.f4231o00oo0O0;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f4229o00oOOoO.remove(size);
                    } else {
                        fullSpanItem.f4231o00oo0O0 = i4 - i2;
                    }
                }
            }
        }

        public int o00oo0OO(int i) {
            int length = this.f4228o00oOOo0.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo  reason: collision with root package name */
        public boolean f4234o00oo;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f4235o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f4236o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public int f4237o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public int f4238o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public int[] f4239o00oo0o0;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public int[] f4240o00oo0oO;

        /* renamed from: o00ooO0  reason: collision with root package name */
        public boolean f4241o00ooO0;

        /* renamed from: o00ooO00  reason: collision with root package name */
        public boolean f4242o00ooO00;

        /* renamed from: o0O0o  reason: collision with root package name */
        public List<LazySpanLookup.FullSpanItem> f4243o0O0o;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOo0 */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOoO */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f4236o00oo0O0 = parcel.readInt();
            this.f4235o00oo0O = parcel.readInt();
            int readInt = parcel.readInt();
            this.f4237o00oo0Oo = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4239o00oo0o0 = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4238o00oo0o = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f4240o00oo0oO = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f4234o00oo = parcel.readInt() == 1;
            this.f4242o00ooO00 = parcel.readInt() == 1;
            this.f4241o00ooO0 = parcel.readInt() == 1;
            this.f4243o0O0o = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f4237o00oo0Oo = savedState.f4237o00oo0Oo;
            this.f4236o00oo0O0 = savedState.f4236o00oo0O0;
            this.f4235o00oo0O = savedState.f4235o00oo0O;
            this.f4239o00oo0o0 = savedState.f4239o00oo0o0;
            this.f4238o00oo0o = savedState.f4238o00oo0o;
            this.f4240o00oo0oO = savedState.f4240o00oo0oO;
            this.f4234o00oo = savedState.f4234o00oo;
            this.f4242o00ooO00 = savedState.f4242o00ooO00;
            this.f4241o00ooO0 = savedState.f4241o00ooO0;
            this.f4243o0O0o = savedState.f4243o0O0o;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void o00oOOo0() {
            this.f4239o00oo0o0 = null;
            this.f4237o00oo0Oo = 0;
            this.f4236o00oo0O0 = -1;
            this.f4235o00oo0O = -1;
        }

        public void o00oOOoO() {
            this.f4239o00oo0o0 = null;
            this.f4237o00oo0Oo = 0;
            this.f4238o00oo0o = 0;
            this.f4240o00oo0oO = null;
            this.f4243o0O0o = null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4236o00oo0O0);
            parcel.writeInt(this.f4235o00oo0O);
            parcel.writeInt(this.f4237o00oo0Oo);
            if (this.f4237o00oo0Oo > 0) {
                parcel.writeIntArray(this.f4239o00oo0o0);
            }
            parcel.writeInt(this.f4238o00oo0o);
            if (this.f4238o00oo0o > 0) {
                parcel.writeIntArray(this.f4240o00oo0oO);
            }
            parcel.writeInt(this.f4234o00oo ? 1 : 0);
            parcel.writeInt(this.f4242o00ooO00 ? 1 : 0);
            parcel.writeInt(this.f4241o00ooO0 ? 1 : 0);
            parcel.writeList(this.f4243o0O0o);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.o00oOoO0();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f4245o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4246o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f4247o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public boolean f4248o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int[] f4249o00oOo0o;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f4251o00oOooO;

        public o00oOOoO() {
            o00oOo00();
        }

        public void o00oOOo0() {
            this.f4246o00oOOoO = this.f4247o00oOo00 ? StaggeredGridLayoutManager.this.f4205o00oOo00.o00oOoOO() : StaggeredGridLayoutManager.this.f4205o00oOo00.o00oo0();
        }

        public void o00oOOoO(int i) {
            this.f4246o00oOOoO = this.f4247o00oOo00 ? StaggeredGridLayoutManager.this.f4205o00oOo00.o00oOoOO() - i : StaggeredGridLayoutManager.this.f4205o00oOo00.o00oo0() + i;
        }

        public void o00oOo00() {
            this.f4245o00oOOo0 = -1;
            this.f4246o00oOOoO = Integer.MIN_VALUE;
            this.f4247o00oOo00 = false;
            this.f4251o00oOooO = false;
            this.f4248o00oOo0O = false;
            int[] iArr = this.f4249o00oOo0o;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void o00oOooO(o00oOo0O[] o00ooo0oArr) {
            int length = o00ooo0oArr.length;
            int[] iArr = this.f4249o00oOo0o;
            if (iArr == null || iArr.length < length) {
                this.f4249o00oOo0o = new int[StaggeredGridLayoutManager.this.f4204o00oOOoO.length];
            }
            for (int i = 0; i < length; i++) {
                this.f4249o00oOo0o[i] = o00ooo0oArr[i].o00oo0oO(Integer.MIN_VALUE);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 extends RecyclerView.o0O0000O {

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f4252o00oOoO0 = -1;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public o00oOo0O f4253o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public boolean f4254o00oOo0o;

        public o00oOo00(int i, int i2) {
            super(i, i2);
        }

        public o00oOo00(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public o00oOo00(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public o00oOo00(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public o00oOo00(RecyclerView.o0O0000O o0o0000o) {
            super(o0o0000o);
        }

        public final int o00oOoOo() {
            o00oOo0O o00ooo0o2 = this.f4253o00oOo0O;
            if (o00ooo0o2 == null) {
                return -1;
            }
            return o00ooo0o2.f4259o00oOo0O;
        }

        public boolean o00oOoo0() {
            return this.f4254o00oOo0o;
        }

        public void o00oOooo(boolean z) {
            this.f4254o00oOo0o = z;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O {

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f4255o00oOoO0 = Integer.MIN_VALUE;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final int f4259o00oOo0O;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public ArrayList<View> f4256o00oOOo0 = new ArrayList<>();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4257o00oOOoO = Integer.MIN_VALUE;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f4258o00oOo00 = Integer.MIN_VALUE;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f4261o00oOooO = 0;

        public o00oOo0O(int i) {
            this.f4259o00oOo0O = i;
        }

        public void o00oOOo0(View view) {
            o00oOo00 o00oo0o02 = o00oo0o0(view);
            o00oo0o02.f4253o00oOo0O = this;
            this.f4256o00oOOo0.add(view);
            this.f4258o00oOo00 = Integer.MIN_VALUE;
            if (this.f4256o00oOOo0.size() == 1) {
                this.f4257o00oOOoO = Integer.MIN_VALUE;
            }
            if (o00oo0o02.o00oOoO0() || o00oo0o02.o00oOo0o()) {
                this.f4261o00oOooO = StaggeredGridLayoutManager.this.f4205o00oOo00.o00oOo0O(view) + this.f4261o00oOooO;
            }
        }

        public void o00oOOoO(boolean z, int i) {
            int o00oo0O2 = z ? o00oo0O(Integer.MIN_VALUE) : o00oo0oO(Integer.MIN_VALUE);
            o00oOo0O();
            if (o00oo0O2 == Integer.MIN_VALUE) {
                return;
            }
            if (!z || o00oo0O2 >= StaggeredGridLayoutManager.this.f4205o00oOo00.o00oOoOO()) {
                if (z || o00oo0O2 <= StaggeredGridLayoutManager.this.f4205o00oOo00.o00oo0()) {
                    if (i != Integer.MIN_VALUE) {
                        o00oo0O2 += i;
                    }
                    this.f4258o00oOo00 = o00oo0O2;
                    this.f4257o00oOOoO = o00oo0O2;
                }
            }
        }

        public void o00oOo00() {
            LazySpanLookup.FullSpanItem o00oOo0o2;
            ArrayList<View> arrayList = this.f4256o00oOOo0;
            View view = arrayList.get(arrayList.size() - 1);
            o00oOo00 o00oo0o02 = o00oo0o0(view);
            this.f4258o00oOo00 = StaggeredGridLayoutManager.this.f4205o00oOo00.o00oOooO(view);
            if (o00oo0o02.f4254o00oOo0o && (o00oOo0o2 = StaggeredGridLayoutManager.this.f4217o00oo00O.o00oOo0o(o00oo0o02.o00oOooO())) != null && o00oOo0o2.f4230o00oo0O == 1) {
                this.f4258o00oOo00 += o00oOo0o2.o00oOOo0(this.f4259o00oOo0O);
            }
        }

        public void o00oOo0O() {
            this.f4256o00oOOo0.clear();
            o0O0o();
            this.f4261o00oOooO = 0;
        }

        public int o00oOo0o() {
            int i;
            int size;
            if (StaggeredGridLayoutManager.this.f4208o00oOoO) {
                i = this.f4256o00oOOo0.size() - 1;
                size = -1;
            } else {
                i = 0;
                size = this.f4256o00oOOo0.size();
            }
            return o00oo0(i, size, true);
        }

        public int o00oOoO() {
            return StaggeredGridLayoutManager.this.f4208o00oOoO ? o00oo0(this.f4256o00oOOo0.size() - 1, -1, false) : o00oo0(0, this.f4256o00oOOo0.size(), false);
        }

        public int o00oOoO0() {
            int i;
            int size;
            if (StaggeredGridLayoutManager.this.f4208o00oOoO) {
                i = this.f4256o00oOOo0.size() - 1;
                size = -1;
            } else {
                i = 0;
                size = this.f4256o00oOOo0.size();
            }
            return o00oo00O(i, size, true);
        }

        public int o00oOoOO() {
            int size;
            int i;
            if (StaggeredGridLayoutManager.this.f4208o00oOoO) {
                size = 0;
                i = this.f4256o00oOOo0.size();
            } else {
                size = this.f4256o00oOOo0.size() - 1;
                i = -1;
            }
            return o00oo0(size, i, true);
        }

        public int o00oOoOo() {
            int size;
            int i;
            if (StaggeredGridLayoutManager.this.f4208o00oOoO) {
                size = 0;
                i = this.f4256o00oOOo0.size();
            } else {
                size = this.f4256o00oOOo0.size() - 1;
                i = -1;
            }
            return o00oo00O(size, i, true);
        }

        public int o00oOoo0() {
            return StaggeredGridLayoutManager.this.f4208o00oOoO ? o00oo0(0, this.f4256o00oOOo0.size(), false) : o00oo0(this.f4256o00oOOo0.size() - 1, -1, false);
        }

        public void o00oOooO() {
            LazySpanLookup.FullSpanItem o00oOo0o2;
            View view = this.f4256o00oOOo0.get(0);
            o00oOo00 o00oo0o02 = o00oo0o0(view);
            this.f4257o00oOOoO = StaggeredGridLayoutManager.this.f4205o00oOo00.o00oOoO0(view);
            if (o00oo0o02.f4254o00oOo0o && (o00oOo0o2 = StaggeredGridLayoutManager.this.f4217o00oo00O.o00oOo0o(o00oo0o02.o00oOooO())) != null && o00oOo0o2.f4230o00oo0O == -1) {
                this.f4257o00oOOoO -= o00oOo0o2.o00oOOo0(this.f4259o00oOo0O);
            }
        }

        public int o00oOooo(int i, int i2, boolean z, boolean z2, boolean z3) {
            int o00oo02 = StaggeredGridLayoutManager.this.f4205o00oOo00.o00oo0();
            int o00oOoOO2 = StaggeredGridLayoutManager.this.f4205o00oOo00.o00oOoOO();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f4256o00oOOo0.get(i);
                int o00oOoO02 = StaggeredGridLayoutManager.this.f4205o00oOo00.o00oOoO0(view);
                int o00oOooO2 = StaggeredGridLayoutManager.this.f4205o00oOo00.o00oOooO(view);
                boolean z4 = false;
                boolean z5 = !z3 ? o00oOoO02 >= o00oOoOO2 : o00oOoO02 > o00oOoOO2;
                if (!z3 ? o00oOooO2 > o00oo02 : o00oOooO2 >= o00oo02) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && o00oOoO02 >= o00oo02 && o00oOooO2 <= o00oOoOO2) {
                        }
                        return StaggeredGridLayoutManager.this.getPosition(view);
                    } else if (o00oOoO02 >= o00oo02 && o00oOooO2 <= o00oOoOO2) {
                        return StaggeredGridLayoutManager.this.getPosition(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        public void o00oo(int i) {
            int i2 = this.f4257o00oOOoO;
            if (i2 != Integer.MIN_VALUE) {
                this.f4257o00oOOoO = i2 + i;
            }
            int i3 = this.f4258o00oOo00;
            if (i3 != Integer.MIN_VALUE) {
                this.f4258o00oOo00 = i3 + i;
            }
        }

        public int o00oo0(int i, int i2, boolean z) {
            return o00oOooo(i, i2, z, true, false);
        }

        public int o00oo00O(int i, int i2, boolean z) {
            return o00oOooo(i, i2, false, false, z);
        }

        public int o00oo0O(int i) {
            int i2 = this.f4258o00oOo00;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4256o00oOOo0.size() == 0) {
                return i;
            }
            o00oOo00();
            return this.f4258o00oOo00;
        }

        public int o00oo0O0() {
            int i = this.f4258o00oOo00;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            o00oOo00();
            return this.f4258o00oOo00;
        }

        public int o00oo0OO() {
            return this.f4261o00oOooO;
        }

        public View o00oo0Oo(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f4256o00oOOo0.size() - 1;
                while (size >= 0) {
                    View view2 = this.f4256o00oOOo0.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f4208o00oOoO && staggeredGridLayoutManager.getPosition(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f4208o00oOoO && staggeredGridLayoutManager2.getPosition(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f4256o00oOOo0.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f4256o00oOOo0.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f4208o00oOoO && staggeredGridLayoutManager3.getPosition(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f4208o00oOoO && staggeredGridLayoutManager4.getPosition(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public int o00oo0o() {
            int i = this.f4257o00oOOoO;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            o00oOooO();
            return this.f4257o00oOOoO;
        }

        public o00oOo00 o00oo0o0(View view) {
            return (o00oOo00) view.getLayoutParams();
        }

        public int o00oo0oO(int i) {
            int i2 = this.f4257o00oOOoO;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4256o00oOOo0.size() == 0) {
                return i;
            }
            o00oOooO();
            return this.f4257o00oOOoO;
        }

        public void o00ooO0() {
            View remove = this.f4256o00oOOo0.remove(0);
            o00oOo00 o00oo0o02 = o00oo0o0(remove);
            o00oo0o02.f4253o00oOo0O = null;
            if (this.f4256o00oOOo0.size() == 0) {
                this.f4258o00oOo00 = Integer.MIN_VALUE;
            }
            if (o00oo0o02.o00oOoO0() || o00oo0o02.o00oOo0o()) {
                this.f4261o00oOooO -= StaggeredGridLayoutManager.this.f4205o00oOo00.o00oOo0O(remove);
            }
            this.f4257o00oOOoO = Integer.MIN_VALUE;
        }

        public void o00ooO00() {
            int size = this.f4256o00oOOo0.size();
            View remove = this.f4256o00oOOo0.remove(size - 1);
            o00oOo00 o00oo0o02 = o00oo0o0(remove);
            o00oo0o02.f4253o00oOo0O = null;
            if (o00oo0o02.o00oOoO0() || o00oo0o02.o00oOo0o()) {
                this.f4261o00oOooO -= StaggeredGridLayoutManager.this.f4205o00oOo00.o00oOo0O(remove);
            }
            if (size == 1) {
                this.f4257o00oOOoO = Integer.MIN_VALUE;
            }
            this.f4258o00oOo00 = Integer.MIN_VALUE;
        }

        public void o00ooO0O(View view) {
            o00oOo00 o00oo0o02 = o00oo0o0(view);
            o00oo0o02.f4253o00oOo0O = this;
            this.f4256o00oOOo0.add(0, view);
            this.f4257o00oOOoO = Integer.MIN_VALUE;
            if (this.f4256o00oOOo0.size() == 1) {
                this.f4258o00oOo00 = Integer.MIN_VALUE;
            }
            if (o00oo0o02.o00oOoO0() || o00oo0o02.o00oOo0o()) {
                this.f4261o00oOooO = StaggeredGridLayoutManager.this.f4205o00oOo00.o00oOo0O(view) + this.f4261o00oOooO;
            }
        }

        public void o00ooO0o(int i) {
            this.f4257o00oOOoO = i;
            this.f4258o00oOo00 = i;
        }

        public void o0O0o() {
            this.f4257o00oOOoO = Integer.MIN_VALUE;
            this.f4258o00oOo00 = Integer.MIN_VALUE;
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f4206o00oOo0O = i2;
        o0O00000(i);
        this.f4209o00oOoO0 = new o0O000O();
        o00oOoo0();
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.o0O00000.o00oOo0O properties = RecyclerView.o0O00000.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f4140o00oOOo0);
        o0O00000(properties.f4141o00oOOoO);
        setReverseLayout(properties.f4142o00oOo00);
        this.f4209o00oOoO0 = new o0O000O();
        o00oOoo0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f4218o00oo0O == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public boolean canScrollHorizontally() {
        return this.f4206o00oOo0O == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public boolean canScrollVertically() {
        return this.f4206o00oOo0O == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public boolean checkLayoutParams(RecyclerView.o0O0000O o0o0000o) {
        return o0o0000o instanceof o00oOo00;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.o0O00OOO o0o00ooo, RecyclerView.o0O00000.o00oOo00 o00ooo002) {
        int o00oo0O2;
        int i3;
        if (this.f4206o00oOo0O != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        o00oooO(i, o0o00ooo);
        int[] iArr = this.f4215o00oo;
        if (iArr == null || iArr.length < this.f4203o00oOOo0) {
            this.f4215o00oo = new int[this.f4203o00oOOo0];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f4203o00oOOo0; i5++) {
            o0O000O o0o000o = this.f4209o00oOoO0;
            if (o0o000o.f4582o00oOooO == -1) {
                o00oo0O2 = o0o000o.f4578o00oOo0o;
                i3 = this.f4204o00oOOoO[i5].o00oo0oO(o00oo0O2);
            } else {
                o00oo0O2 = this.f4204o00oOOoO[i5].o00oo0O(o0o000o.f4580o00oOoO0);
                i3 = this.f4209o00oOoO0.f4580o00oOoO0;
            }
            int i6 = o00oo0O2 - i3;
            if (i6 >= 0) {
                this.f4215o00oo[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.f4215o00oo, 0, i4);
        for (int i7 = 0; i7 < i4 && this.f4209o00oOoO0.o00oOOo0(o0o00ooo); i7++) {
            o00ooo002.o00oOOo0(this.f4209o00oOoO0.f4576o00oOo00, this.f4215o00oo[i7]);
            o0O000O o0o000o2 = this.f4209o00oOoO0;
            o0o000o2.f4576o00oOo00 += o0o000o2.f4582o00oOooO;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int computeHorizontalScrollExtent(RecyclerView.o0O00OOO o0o00ooo) {
        return computeScrollExtent(o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int computeHorizontalScrollOffset(RecyclerView.o0O00OOO o0o00ooo) {
        return computeScrollOffset(o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int computeHorizontalScrollRange(RecyclerView.o0O00OOO o0o00ooo) {
        return computeScrollRange(o0o00ooo);
    }

    public final int computeScrollExtent(RecyclerView.o0O00OOO o0o00ooo) {
        if (getChildCount() == 0) {
            return 0;
        }
        return o0O00o00.o00oOOo0(o0o00ooo, this.f4205o00oOo00, o00oo0O0(!this.f4226o0O0o), o00oo0OO(!this.f4226o0O0o), this, this.f4226o0O0o);
    }

    public final int computeScrollOffset(RecyclerView.o0O00OOO o0o00ooo) {
        if (getChildCount() == 0) {
            return 0;
        }
        return o0O00o00.o00oOOoO(o0o00ooo, this.f4205o00oOo00, o00oo0O0(!this.f4226o0O0o), o00oo0OO(!this.f4226o0O0o), this, this.f4226o0O0o, this.f4210o00oOoOO);
    }

    public final int computeScrollRange(RecyclerView.o0O00OOO o0o00ooo) {
        if (getChildCount() == 0) {
            return 0;
        }
        return o0O00o00.o00oOo00(o0o00ooo, this.f4205o00oOo00, o00oo0O0(!this.f4226o0O0o), o00oo0OO(!this.f4226o0O0o), this, this.f4226o0O0o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00OO.o00oOOoO
    public PointF computeScrollVectorForPosition(int i) {
        int o00oOo0o2 = o00oOo0o(i);
        PointF pointF = new PointF();
        if (o00oOo0o2 == 0) {
            return null;
        }
        if (this.f4206o00oOo0O == 0) {
            pointF.x = o00oOo0o2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = o00oOo0o2;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int computeVerticalScrollExtent(RecyclerView.o0O00OOO o0o00ooo) {
        return computeScrollExtent(o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int computeVerticalScrollOffset(RecyclerView.o0O00OOO o0o00ooo) {
        return computeScrollOffset(o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int computeVerticalScrollRange(RecyclerView.o0O00OOO o0o00ooo) {
        return computeScrollRange(o0o00ooo);
    }

    public final int convertFocusDirectionToLayoutDirection(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f4206o00oOo0O == 1) ? 1 : Integer.MIN_VALUE : this.f4206o00oOo0O == 0 ? 1 : Integer.MIN_VALUE : this.f4206o00oOo0O == 1 ? -1 : Integer.MIN_VALUE : this.f4206o00oOo0O == 0 ? -1 : Integer.MIN_VALUE : (this.f4206o00oOo0O != 1 && isLayoutRTL()) ? -1 : 1 : (this.f4206o00oOo0O != 1 && isLayoutRTL()) ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public RecyclerView.o0O0000O generateDefaultLayoutParams() {
        return this.f4206o00oOo0O == 0 ? new o00oOo00(-2, -1) : new o00oOo00(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public RecyclerView.o0O0000O generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new o00oOo00(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public RecyclerView.o0O0000O generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new o00oOo00((ViewGroup.MarginLayoutParams) layoutParams) : new o00oOo00(layoutParams);
    }

    public int getOrientation() {
        return this.f4206o00oOo0O;
    }

    public boolean getReverseLayout() {
        return this.f4208o00oOoO;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public boolean isAutoMeasureEnabled() {
        return this.f4216o00oo0 != 0;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public final void o0(int i) {
        o0O000O o0o000o = this.f4209o00oOoO0;
        o0o000o.f4577o00oOo0O = i;
        o0o000o.f4582o00oOooO = this.f4210o00oOoOO != (i == -1) ? -1 : 1;
    }

    public final void o00oOOo0(View view) {
        for (int i = this.f4203o00oOOo0 - 1; i >= 0; i--) {
            this.f4204o00oOOoO[i].o00oOOo0(view);
        }
    }

    public final void o00oOOoO(o00oOOoO o00ooooo2) {
        boolean z;
        SavedState savedState = this.f4218o00oo0O;
        int i = savedState.f4237o00oo0Oo;
        if (i > 0) {
            if (i == this.f4203o00oOOo0) {
                for (int i2 = 0; i2 < this.f4203o00oOOo0; i2++) {
                    this.f4204o00oOOoO[i2].o00oOo0O();
                    SavedState savedState2 = this.f4218o00oo0O;
                    int i3 = savedState2.f4239o00oo0o0[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += savedState2.f4242o00ooO00 ? this.f4205o00oOo00.o00oOoOO() : this.f4205o00oOo00.o00oo0();
                    }
                    this.f4204o00oOOoO[i2].o00ooO0o(i3);
                }
            } else {
                savedState.o00oOOoO();
                SavedState savedState3 = this.f4218o00oo0O;
                savedState3.f4236o00oo0O0 = savedState3.f4235o00oo0O;
            }
        }
        SavedState savedState4 = this.f4218o00oo0O;
        this.f4219o00oo0O0 = savedState4.f4241o00ooO0;
        setReverseLayout(savedState4.f4234o00oo);
        resolveShouldLayoutReverse();
        SavedState savedState5 = this.f4218o00oo0O;
        int i4 = savedState5.f4236o00oo0O0;
        if (i4 != -1) {
            this.f4212o00oOoo0 = i4;
            z = savedState5.f4242o00ooO00;
        } else {
            z = this.f4210o00oOoOO;
        }
        o00ooooo2.f4247o00oOo00 = z;
        if (savedState5.f4238o00oo0o > 1) {
            LazySpanLookup lazySpanLookup = this.f4217o00oo00O;
            lazySpanLookup.f4228o00oOOo0 = savedState5.f4240o00oo0oO;
            lazySpanLookup.f4229o00oOOoO = savedState5.f4243o0O0o;
        }
    }

    public boolean o00oOo00() {
        int o00oo0O2 = this.f4204o00oOOoO[0].o00oo0O(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4203o00oOOo0; i++) {
            if (this.f4204o00oOOoO[i].o00oo0O(Integer.MIN_VALUE) != o00oo0O2) {
                return false;
            }
        }
        return true;
    }

    public final void o00oOo0O(View view, o00oOo00 o00ooo002, o0O000O o0o000o) {
        if (o0o000o.f4577o00oOo0O == 1) {
            if (o00ooo002.f4254o00oOo0o) {
                o00oOOo0(view);
            } else {
                o00ooo002.f4253o00oOo0O.o00oOOo0(view);
            }
        } else if (o00ooo002.f4254o00oOo0o) {
            o00oooOO(view);
        } else {
            o00ooo002.f4253o00oOo0O.o00ooO0O(view);
        }
    }

    public final int o00oOo0o(int i) {
        if (getChildCount() == 0) {
            return this.f4210o00oOoOO ? 1 : -1;
        }
        return (i < o00ooO00()) != this.f4210o00oOoOO ? -1 : 1;
    }

    public final boolean o00oOoO(o00oOo0O o00ooo0o2) {
        if (this.f4210o00oOoOO) {
            if (o00ooo0o2.o00oo0O0() < this.f4205o00oOo00.o00oOoOO()) {
                ArrayList<View> arrayList = o00ooo0o2.f4256o00oOOo0;
                return !o00ooo0o2.o00oo0o0(arrayList.get(arrayList.size() - 1)).f4254o00oOo0o;
            }
        } else if (o00ooo0o2.o00oo0o() > this.f4205o00oOo00.o00oo0()) {
            return !o00ooo0o2.o00oo0o0(o00ooo0o2.f4256o00oOOo0.get(0)).f4254o00oOo0o;
        }
        return false;
    }

    public boolean o00oOoO0() {
        int o00ooO002;
        int o00ooO0O2;
        if (getChildCount() == 0 || this.f4216o00oo0 == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f4210o00oOoOO) {
            o00ooO002 = o00ooO0O();
            o00ooO0O2 = o00ooO00();
        } else {
            o00ooO002 = o00ooO00();
            o00ooO0O2 = o00ooO0O();
        }
        if (o00ooO002 == 0 && o00ooOoO() != null) {
            this.f4217o00oo00O.o00oOOoO();
        } else if (!this.f4224o00oo0oO) {
            return false;
        } else {
            int i = this.f4210o00oOoOO ? -1 : 1;
            int i2 = o00ooO0O2 + 1;
            LazySpanLookup.FullSpanItem o00oOo0O2 = this.f4217o00oo00O.o00oOo0O(o00ooO002, i2, i, true);
            if (o00oOo0O2 == null) {
                this.f4224o00oo0oO = false;
                this.f4217o00oo00O.o00oOooO(i2);
                return false;
            }
            LazySpanLookup.FullSpanItem o00oOo0O3 = this.f4217o00oo00O.o00oOo0O(o00ooO002, o00oOo0O2.f4231o00oo0O0, i * (-1), true);
            if (o00oOo0O3 == null) {
                this.f4217o00oo00O.o00oOooO(o00oOo0O2.f4231o00oo0O0);
            } else {
                this.f4217o00oo00O.o00oOooO(o00oOo0O3.f4231o00oo0O0 + 1);
            }
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    public final LazySpanLookup.FullSpanItem o00oOoOO(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f4232o00oo0Oo = new int[this.f4203o00oOOo0];
        for (int i2 = 0; i2 < this.f4203o00oOOo0; i2++) {
            fullSpanItem.f4232o00oo0Oo[i2] = i - this.f4204o00oOOoO[i2].o00oo0O(i);
        }
        return fullSpanItem;
    }

    public final LazySpanLookup.FullSpanItem o00oOoOo(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f4232o00oo0Oo = new int[this.f4203o00oOOo0];
        for (int i2 = 0; i2 < this.f4203o00oOOo0; i2++) {
            fullSpanItem.f4232o00oo0Oo[i2] = this.f4204o00oOOoO[i2].o00oo0oO(i) - i;
        }
        return fullSpanItem;
    }

    public final void o00oOoo0() {
        this.f4205o00oOo00 = o0O00O.o00oOOoO(this, this.f4206o00oOo0O);
        this.f4213o00oOooO = o0O00O.o00oOOoO(this, 1 - this.f4206o00oOo0O);
    }

    public boolean o00oOooO() {
        int o00oo0oO2 = this.f4204o00oOOoO[0].o00oo0oO(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4203o00oOOo0; i++) {
            if (this.f4204o00oOOoO[i].o00oo0oO(Integer.MIN_VALUE) != o00oo0oO2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final int o00oOooo(RecyclerView.o0O00O0 o0o00o0, o0O000O o0o000o, RecyclerView.o0O00OOO o0o00ooo) {
        o00oOo0O o00ooo0o2;
        int o00oOo0O2;
        int i;
        int i2;
        int o00oOo0O3;
        RecyclerView.o0O00000 o0o00000;
        View view;
        int i3;
        int i4;
        boolean z;
        ?? r9 = 0;
        this.f4211o00oOoOo.set(0, this.f4203o00oOOo0, true);
        int i5 = this.f4209o00oOoO0.f4581o00oOoOO ? o0o000o.f4577o00oOo0O == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : o0o000o.f4577o00oOo0O == 1 ? o0o000o.f4580o00oOoO0 + o0o000o.f4575o00oOOoO : o0o000o.f4578o00oOo0o - o0o000o.f4575o00oOOoO;
        o0O0000O(o0o000o.f4577o00oOo0O, i5);
        int o00oOoOO2 = this.f4210o00oOoOO ? this.f4205o00oOo00.o00oOoOO() : this.f4205o00oOo00.o00oo0();
        boolean z2 = false;
        while (o0o000o.o00oOOo0(o0o00ooo) && (this.f4209o00oOoO0.f4581o00oOoOO || !this.f4211o00oOoOo.isEmpty())) {
            View o00oOOoO2 = o0o000o.o00oOOoO(o0o00o0);
            o00oOo00 o00ooo002 = (o00oOo00) o00oOOoO2.getLayoutParams();
            int o00oOooO2 = o00ooo002.o00oOooO();
            int o00oOoO02 = this.f4217o00oo00O.o00oOoO0(o00oOooO2);
            boolean z3 = o00oOoO02 == -1 ? true : r9;
            if (z3) {
                o00ooo0o2 = o00ooo002.f4254o00oOo0o ? this.f4204o00oOOoO[r9] : o00ooOOo(o0o000o);
                this.f4217o00oo00O.o00oo0(o00oOooO2, o00ooo0o2);
            } else {
                o00ooo0o2 = this.f4204o00oOOoO[o00oOoO02];
            }
            o00oOo0O o00ooo0o3 = o00ooo0o2;
            o00ooo002.f4253o00oOo0O = o00ooo0o3;
            if (o0o000o.f4577o00oOo0O == 1) {
                addView(o00oOOoO2);
            } else {
                addView(o00oOOoO2, r9);
            }
            o00ooo0(o00oOOoO2, o00ooo002, r9);
            if (o0o000o.f4577o00oOo0O == 1) {
                int o00ooO0o2 = o00ooo002.f4254o00oOo0o ? o00ooO0o(o00oOoOO2) : o00ooo0o3.o00oo0O(o00oOoOO2);
                int o00oOo0O4 = this.f4205o00oOo00.o00oOo0O(o00oOOoO2) + o00ooO0o2;
                if (z3 && o00ooo002.f4254o00oOo0o) {
                    LazySpanLookup.FullSpanItem o00oOoOO3 = o00oOoOO(o00ooO0o2);
                    o00oOoOO3.f4230o00oo0O = -1;
                    o00oOoOO3.f4231o00oo0O0 = o00oOooO2;
                    this.f4217o00oo00O.o00oOOo0(o00oOoOO3);
                }
                i = o00oOo0O4;
                o00oOo0O2 = o00ooO0o2;
            } else {
                int o00ooOO2 = o00ooo002.f4254o00oOo0o ? o00ooOO(o00oOoOO2) : o00ooo0o3.o00oo0oO(o00oOoOO2);
                o00oOo0O2 = o00ooOO2 - this.f4205o00oOo00.o00oOo0O(o00oOOoO2);
                if (z3 && o00ooo002.f4254o00oOo0o) {
                    LazySpanLookup.FullSpanItem o00oOoOo2 = o00oOoOo(o00ooOO2);
                    o00oOoOo2.f4230o00oo0O = 1;
                    o00oOoOo2.f4231o00oo0O0 = o00oOooO2;
                    this.f4217o00oo00O.o00oOOo0(o00oOoOo2);
                }
                i = o00ooOO2;
            }
            if (o00ooo002.f4254o00oOo0o && o0o000o.f4582o00oOooO == -1) {
                if (!z3) {
                    if (!(o0o000o.f4577o00oOo0O == 1 ? o00oOo00() : o00oOooO())) {
                        LazySpanLookup.FullSpanItem o00oOo0o2 = this.f4217o00oo00O.o00oOo0o(o00oOooO2);
                        if (o00oOo0o2 != null) {
                            o00oOo0o2.f4233o00oo0o0 = true;
                        }
                    }
                }
                this.f4224o00oo0oO = true;
            }
            o00oOo0O(o00oOOoO2, o00ooo002, o0o000o);
            if (isLayoutRTL() && this.f4206o00oOo0O == 1) {
                int o00oOoOO4 = o00ooo002.f4254o00oOo0o ? this.f4213o00oOooO.o00oOoOO() : this.f4213o00oOooO.o00oOoOO() - (((this.f4203o00oOOo0 - 1) - o00ooo0o3.f4259o00oOo0O) * this.f4207o00oOo0o);
                o00oOo0O3 = o00oOoOO4;
                i2 = o00oOoOO4 - this.f4213o00oOooO.o00oOo0O(o00oOOoO2);
            } else {
                int o00oo02 = o00ooo002.f4254o00oOo0o ? this.f4213o00oOooO.o00oo0() : (o00ooo0o3.f4259o00oOo0O * this.f4207o00oOo0o) + this.f4213o00oOooO.o00oo0();
                i2 = o00oo02;
                o00oOo0O3 = this.f4213o00oOooO.o00oOo0O(o00oOOoO2) + o00oo02;
            }
            if (this.f4206o00oOo0O == 1) {
                o0o00000 = this;
                view = o00oOOoO2;
                i3 = i2;
                i2 = o00oOo0O2;
                i4 = o00oOo0O3;
            } else {
                o0o00000 = this;
                view = o00oOOoO2;
                i3 = o00oOo0O2;
                i4 = i;
                i = o00oOo0O3;
            }
            o0o00000.layoutDecoratedWithMargins(view, i3, i2, i4, i);
            if (o00ooo002.f4254o00oOo0o) {
                o0O0000O(this.f4209o00oOoO0.f4577o00oOo0O, i5);
            } else {
                o0OoOoOO(o00ooo0o3, this.f4209o00oOoO0.f4577o00oOo0O, i5);
            }
            o00oooOo(o0o00o0, this.f4209o00oOoO0);
            if (this.f4209o00oOoO0.f4579o00oOoO && o00oOOoO2.hasFocusable()) {
                if (o00ooo002.f4254o00oOo0o) {
                    this.f4211o00oOoOo.clear();
                } else {
                    z = false;
                    this.f4211o00oOoOo.set(o00ooo0o3.f4259o00oOo0O, false);
                    r9 = z;
                    z2 = true;
                }
            }
            z = false;
            r9 = z;
            z2 = true;
        }
        int i6 = r9;
        if (!z2) {
            o00oooOo(o0o00o0, this.f4209o00oOoO0);
        }
        int o00oo03 = this.f4209o00oOoO0.f4577o00oOo0O == -1 ? this.f4205o00oOo00.o00oo0() - o00ooOO(this.f4205o00oOo00.o00oo0()) : o00ooO0o(this.f4205o00oOo00.o00oOoOO()) - this.f4205o00oOo00.o00oOoOO();
        return o00oo03 > 0 ? Math.min(o0o000o.f4575o00oOOoO, o00oo03) : i6;
    }

    public final void o00oo(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, boolean z) {
        int o00oo02;
        int o00ooOO2 = o00ooOO(Integer.MAX_VALUE);
        if (o00ooOO2 != Integer.MAX_VALUE && (o00oo02 = o00ooOO2 - this.f4205o00oOo00.o00oo0()) > 0) {
            int scrollBy = o00oo02 - scrollBy(o00oo02, o0o00o0, o0o00ooo);
            if (!z || scrollBy <= 0) {
                return;
            }
            this.f4205o00oOo00.o00oo0o(-scrollBy);
        }
    }

    public final int o00oo0(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int position = getPosition(getChildAt(i2));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    public int[] o00oo00O(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f4203o00oOOo0];
        } else if (iArr.length < this.f4203o00oOOo0) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Provided int[]'s size must be more than or equal to span count. Expected:");
            o00oOOo02.append(this.f4203o00oOOo0);
            o00oOOo02.append(", array size:");
            o00oOOo02.append(iArr.length);
            throw new IllegalArgumentException(o00oOOo02.toString());
        }
        for (int i = 0; i < this.f4203o00oOOo0; i++) {
            iArr[i] = this.f4204o00oOOoO[i].o00oOo0o();
        }
        return iArr;
    }

    public int o00oo0O() {
        View o00oo0OO2 = this.f4210o00oOoOO ? o00oo0OO(true) : o00oo0O0(true);
        if (o00oo0OO2 == null) {
            return -1;
        }
        return getPosition(o00oo0OO2);
    }

    public View o00oo0O0(boolean z) {
        int o00oo02 = this.f4205o00oOo00.o00oo0();
        int o00oOoOO2 = this.f4205o00oOo00.o00oOoOO();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int o00oOoO02 = this.f4205o00oOo00.o00oOoO0(childAt);
            if (this.f4205o00oOo00.o00oOooO(childAt) > o00oo02 && o00oOoO02 < o00oOoOO2) {
                if (o00oOoO02 >= o00oo02 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public View o00oo0OO(boolean z) {
        int o00oo02 = this.f4205o00oOo00.o00oo0();
        int o00oOoOO2 = this.f4205o00oOo00.o00oOoOO();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int o00oOoO02 = this.f4205o00oOo00.o00oOoO0(childAt);
            int o00oOooO2 = this.f4205o00oOo00.o00oOooO(childAt);
            if (o00oOooO2 > o00oo02 && o00oOoO02 < o00oOoOO2) {
                if (o00oOooO2 <= o00oOoOO2 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public int[] o00oo0Oo(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f4203o00oOOo0];
        } else if (iArr.length < this.f4203o00oOOo0) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Provided int[]'s size must be more than or equal to span count. Expected:");
            o00oOOo02.append(this.f4203o00oOOo0);
            o00oOOo02.append(", array size:");
            o00oOOo02.append(iArr.length);
            throw new IllegalArgumentException(o00oOOo02.toString());
        }
        for (int i = 0; i < this.f4203o00oOOo0; i++) {
            iArr[i] = this.f4204o00oOOoO[i].o00oOoO();
        }
        return iArr;
    }

    public final int o00oo0o(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    public int[] o00oo0o0(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f4203o00oOOo0];
        } else if (iArr.length < this.f4203o00oOOo0) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Provided int[]'s size must be more than or equal to span count. Expected:");
            o00oOOo02.append(this.f4203o00oOOo0);
            o00oOOo02.append(", array size:");
            o00oOOo02.append(iArr.length);
            throw new IllegalArgumentException(o00oOOo02.toString());
        }
        for (int i = 0; i < this.f4203o00oOOo0; i++) {
            iArr[i] = this.f4204o00oOOoO[i].o00oOoOO();
        }
        return iArr;
    }

    public int[] o00oo0oO(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f4203o00oOOo0];
        } else if (iArr.length < this.f4203o00oOOo0) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Provided int[]'s size must be more than or equal to span count. Expected:");
            o00oOOo02.append(this.f4203o00oOOo0);
            o00oOOo02.append(", array size:");
            o00oOOo02.append(iArr.length);
            throw new IllegalArgumentException(o00oOOo02.toString());
        }
        for (int i = 0; i < this.f4203o00oOOo0; i++) {
            iArr[i] = this.f4204o00oOOoO[i].o00oOoo0();
        }
        return iArr;
    }

    public final int o00ooO(int i) {
        int o00oo0oO2 = this.f4204o00oOOoO[0].o00oo0oO(i);
        for (int i2 = 1; i2 < this.f4203o00oOOo0; i2++) {
            int o00oo0oO3 = this.f4204o00oOOoO[i2].o00oo0oO(i);
            if (o00oo0oO3 > o00oo0oO2) {
                o00oo0oO2 = o00oo0oO3;
            }
        }
        return o00oo0oO2;
    }

    public int o00ooO0() {
        return this.f4216o00oo0;
    }

    public int o00ooO00() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public int o00ooO0O() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int o00ooO0o(int i) {
        int o00oo0O2 = this.f4204o00oOOoO[0].o00oo0O(i);
        for (int i2 = 1; i2 < this.f4203o00oOOo0; i2++) {
            int o00oo0O3 = this.f4204o00oOOoO[i2].o00oo0O(i);
            if (o00oo0O3 > o00oo0O2) {
                o00oo0O2 = o00oo0O3;
            }
        }
        return o00oo0O2;
    }

    public final int o00ooOO(int i) {
        int o00oo0oO2 = this.f4204o00oOOoO[0].o00oo0oO(i);
        for (int i2 = 1; i2 < this.f4203o00oOOo0; i2++) {
            int o00oo0oO3 = this.f4204o00oOOoO[i2].o00oo0oO(i);
            if (o00oo0oO3 < o00oo0oO2) {
                o00oo0oO2 = o00oo0oO3;
            }
        }
        return o00oo0oO2;
    }

    public final int o00ooOO0(int i) {
        int o00oo0O2 = this.f4204o00oOOoO[0].o00oo0O(i);
        for (int i2 = 1; i2 < this.f4203o00oOOo0; i2++) {
            int o00oo0O3 = this.f4204o00oOOoO[i2].o00oo0O(i);
            if (o00oo0O3 < o00oo0O2) {
                o00oo0O2 = o00oo0O3;
            }
        }
        return o00oo0O2;
    }

    public final o00oOo0O o00ooOOo(o0O000O o0o000o) {
        int i;
        int i2;
        int i3 = -1;
        if (o00ooo0o(o0o000o.f4577o00oOo0O)) {
            i = this.f4203o00oOOo0 - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.f4203o00oOOo0;
            i2 = 1;
        }
        o00oOo0O o00ooo0o2 = null;
        if (o0o000o.f4577o00oOo0O == 1) {
            int i4 = Integer.MAX_VALUE;
            int o00oo02 = this.f4205o00oOo00.o00oo0();
            while (i != i3) {
                o00oOo0O o00ooo0o3 = this.f4204o00oOOoO[i];
                int o00oo0O2 = o00ooo0o3.o00oo0O(o00oo02);
                if (o00oo0O2 < i4) {
                    o00ooo0o2 = o00ooo0o3;
                    i4 = o00oo0O2;
                }
                i += i2;
            }
            return o00ooo0o2;
        }
        int i5 = Integer.MIN_VALUE;
        int o00oOoOO2 = this.f4205o00oOo00.o00oOoOO();
        while (i != i3) {
            o00oOo0O o00ooo0o4 = this.f4204o00oOOoO[i];
            int o00oo0oO2 = o00ooo0o4.o00oo0oO(o00oOoOO2);
            if (o00oo0oO2 > i5) {
                o00ooo0o2 = o00ooo0o4;
                i5 = o00oo0oO2;
            }
            i += i2;
        }
        return o00ooo0o2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o00ooOo(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f4210o00oOoOO
            if (r0 == 0) goto L9
            int r0 = r6.o00ooO0O()
            goto Ld
        L9:
            int r0 = r6.o00ooO00()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f4217o00oo00O
            r4.o00oOoO(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4217o00oo00O
            r9.o00oOoo0(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f4217o00oo00O
            r7.o00oOoOo(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4217o00oo00O
            r9.o00oOoo0(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4217o00oo00O
            r9.o00oOoOo(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f4210o00oOoOO
            if (r7 == 0) goto L4d
            int r7 = r6.o00ooO00()
            goto L51
        L4d:
            int r7 = r6.o00ooO0O()
        L51:
            if (r3 > r7) goto L56
            r6.requestLayout()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o00ooOo(int, int, int):void");
    }

    public int o00ooOo0() {
        return this.f4203o00oOOo0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View o00ooOoO() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f4203o00oOOo0
            r2.<init>(r3)
            int r3 = r12.f4203o00oOOo0
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f4206o00oOo0O
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r5
        L21:
            boolean r6 = r12.f4210o00oOoOO
            if (r6 == 0) goto L27
            r6 = r5
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L2b:
            if (r0 >= r6) goto L2e
            r5 = r1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$o00oOo00 r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.o00oOo00) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$o00oOo0O r9 = r8.f4253o00oOo0O
            int r9 = r9.f4259o00oOo0O
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$o00oOo0O r9 = r8.f4253o00oOo0O
            boolean r9 = r12.o00oOoO(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$o00oOo0O r9 = r8.f4253o00oOo0O
            int r9 = r9.f4259o00oOo0O
            r2.clear(r9)
        L54:
            boolean r9 = r8.f4254o00oOo0o
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f4210o00oOoOO
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.o0O00O r10 = r12.f4205o00oOo00
            int r10 = r10.o00oOooO(r7)
            androidx.recyclerview.widget.o0O00O r11 = r12.f4205o00oOo00
            int r11 = r11.o00oOooO(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.o0O00O r10 = r12.f4205o00oOo00
            int r10 = r10.o00oOoO0(r7)
            androidx.recyclerview.widget.o0O00O r11 = r12.f4205o00oOo00
            int r11 = r11.o00oOoO0(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = r1
            goto L8b
        L8a:
            r10 = r4
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$o00oOo00 r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.o00oOo00) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$o00oOo0O r8 = r8.f4253o00oOo0O
            int r8 = r8.f4259o00oOo0O
            androidx.recyclerview.widget.StaggeredGridLayoutManager$o00oOo0O r9 = r9.f4253o00oOo0O
            int r9 = r9.f4259o00oOo0O
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = r1
            goto La1
        La0:
            r8 = r4
        La1:
            if (r3 >= 0) goto La5
            r9 = r1
            goto La6
        La5:
            r9 = r4
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o00ooOoO():android.view.View");
    }

    public void o00ooOoo() {
        this.f4217o00oo00O.o00oOOoO();
        requestLayout();
    }

    public final void o00ooo0(View view, o00oOo00 o00ooo002, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        if (o00ooo002.f4254o00oOo0o) {
            if (this.f4206o00oOo0O != 1) {
                o00ooo00(view, RecyclerView.o0O00000.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) o00ooo002).width, true), this.f4221o00oo0Oo, z);
                return;
            }
            childMeasureSpec = this.f4221o00oo0Oo;
        } else if (this.f4206o00oOo0O != 1) {
            childMeasureSpec = RecyclerView.o0O00000.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) o00ooo002).width, true);
            childMeasureSpec2 = RecyclerView.o0O00000.getChildMeasureSpec(this.f4207o00oOo0o, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) o00ooo002).height, false);
            o00ooo00(view, childMeasureSpec, childMeasureSpec2, z);
        } else {
            childMeasureSpec = RecyclerView.o0O00000.getChildMeasureSpec(this.f4207o00oOo0o, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) o00ooo002).width, false);
        }
        childMeasureSpec2 = RecyclerView.o0O00000.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) o00ooo002).height, true);
        o00ooo00(view, childMeasureSpec, childMeasureSpec2, z);
    }

    public final void o00ooo00(View view, int i, int i2, boolean z) {
        calculateItemDecorationsForChild(view, this.f4223o00oo0o0);
        o00oOo00 o00ooo002 = (o00oOo00) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) o00ooo002).leftMargin;
        Rect rect = this.f4223o00oo0o0;
        int o0O000o02 = o0O000o0(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) o00ooo002).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) o00ooo002).topMargin;
        Rect rect2 = this.f4223o00oo0o0;
        int o0O000o03 = o0O000o0(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) o00ooo002).bottomMargin + rect2.bottom);
        if (z ? shouldReMeasureChild(view, o0O000o02, o0O000o03, o00ooo002) : shouldMeasureChild(view, o0O000o02, o0O000o03, o00ooo002)) {
            view.measure(o0O000o02, o0O000o03);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x014b, code lost:
        if (o00oOoO0() != false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o00ooo0O(androidx.recyclerview.widget.RecyclerView.o0O00O0 r9, androidx.recyclerview.widget.RecyclerView.o0O00OOO r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o00ooo0O(androidx.recyclerview.widget.RecyclerView$o0O00O0, androidx.recyclerview.widget.RecyclerView$o0O00OOO, boolean):void");
    }

    public final boolean o00ooo0o(int i) {
        if (this.f4206o00oOo0O == 0) {
            return (i == -1) != this.f4210o00oOoOO;
        }
        return ((i == -1) == this.f4210o00oOoOO) == isLayoutRTL();
    }

    public void o00oooO(int i, RecyclerView.o0O00OOO o0o00ooo) {
        int i2;
        int o00ooO002;
        if (i > 0) {
            o00ooO002 = o00ooO0O();
            i2 = 1;
        } else {
            i2 = -1;
            o00ooO002 = o00ooO00();
        }
        this.f4209o00oOoO0.f4574o00oOOo0 = true;
        o0OoOoOo(o00ooO002, o0o00ooo);
        o0(i2);
        o0O000O o0o000o = this.f4209o00oOoO0;
        o0o000o.f4576o00oOo00 = o00ooO002 + o0o000o.f4582o00oOooO;
        o0o000o.f4575o00oOOoO = Math.abs(i);
    }

    public final void o00oooOO(View view) {
        for (int i = this.f4203o00oOOo0 - 1; i >= 0; i--) {
            this.f4204o00oOOoO[i].o00ooO0O(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
        if (r4.f4577o00oOo0O == (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o00oooOo(androidx.recyclerview.widget.RecyclerView.o0O00O0 r3, androidx.recyclerview.widget.o0O000O r4) {
        /*
            r2 = this;
            boolean r0 = r4.f4574o00oOOo0
            if (r0 == 0) goto L4d
            boolean r0 = r4.f4581o00oOoOO
            if (r0 == 0) goto L9
            goto L4d
        L9:
            int r0 = r4.f4575o00oOOoO
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.f4577o00oOo0O
            if (r0 != r1) goto L18
        L12:
            int r4 = r4.f4580o00oOoO0
        L14:
            r2.o00oooo0(r3, r4)
            goto L4d
        L18:
            int r4 = r4.f4578o00oOo0o
        L1a:
            r2.o00oooo(r3, r4)
            goto L4d
        L1e:
            int r0 = r4.f4577o00oOo0O
            if (r0 != r1) goto L37
            int r0 = r4.f4578o00oOo0o
            int r1 = r2.o00ooO(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2c
            goto L12
        L2c:
            int r1 = r4.f4580o00oOoO0
            int r4 = r4.f4575o00oOOoO
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L14
        L37:
            int r0 = r4.f4580o00oOoO0
            int r0 = r2.o00ooOO0(r0)
            int r1 = r4.f4580o00oOoO0
            int r0 = r0 - r1
            if (r0 >= 0) goto L43
            goto L18
        L43:
            int r1 = r4.f4578o00oOo0o
            int r4 = r4.f4575o00oOOoO
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L1a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o00oooOo(androidx.recyclerview.widget.RecyclerView$o0O00O0, androidx.recyclerview.widget.o0O000O):void");
    }

    public final void o00oooo(RecyclerView.o0O00O0 o0o00o0, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f4205o00oOo00.o00oOooO(childAt) > i || this.f4205o00oOo00.o00oo0O(childAt) > i) {
                return;
            }
            o00oOo00 o00ooo002 = (o00oOo00) childAt.getLayoutParams();
            if (o00ooo002.f4254o00oOo0o) {
                for (int i2 = 0; i2 < this.f4203o00oOOo0; i2++) {
                    if (this.f4204o00oOOoO[i2].f4256o00oOOo0.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f4203o00oOOo0; i3++) {
                    this.f4204o00oOOoO[i3].o00ooO0();
                }
            } else if (o00ooo002.f4253o00oOo0O.f4256o00oOOo0.size() == 1) {
                return;
            } else {
                o00ooo002.f4253o00oOo0O.o00ooO0();
            }
            removeAndRecycleView(childAt, o0o00o0);
        }
    }

    public final void o00oooo0(RecyclerView.o0O00O0 o0o00o0, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f4205o00oOo00.o00oOoO0(childAt) < i || this.f4205o00oOo00.o00oo0Oo(childAt) < i) {
                return;
            }
            o00oOo00 o00ooo002 = (o00oOo00) childAt.getLayoutParams();
            if (o00ooo002.f4254o00oOo0o) {
                for (int i2 = 0; i2 < this.f4203o00oOOo0; i2++) {
                    if (this.f4204o00oOOoO[i2].f4256o00oOOo0.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f4203o00oOOo0; i3++) {
                    this.f4204o00oOOoO[i3].o00ooO00();
                }
            } else if (o00ooo002.f4253o00oOo0O.f4256o00oOOo0.size() == 1) {
                return;
            } else {
                o00ooo002.f4253o00oOo0O.o00ooO00();
            }
            removeAndRecycleView(childAt, o0o00o0);
        }
    }

    public final void o00ooooO() {
        if (this.f4213o00oOooO.o00oOooo() == 1073741824) {
            return;
        }
        float f = 0.0f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            float o00oOo0O2 = this.f4213o00oOooO.o00oOo0O(childAt);
            if (o00oOo0O2 >= f) {
                if (((o00oOo00) childAt.getLayoutParams()).o00oOoo0()) {
                    o00oOo0O2 = (o00oOo0O2 * 1.0f) / this.f4203o00oOOo0;
                }
                f = Math.max(f, o00oOo0O2);
            }
        }
        int i2 = this.f4207o00oOo0o;
        int round = Math.round(f * this.f4203o00oOOo0);
        if (this.f4213o00oOooO.o00oOooo() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f4213o00oOooO.o00oo0OO());
        }
        o0O000Oo(round);
        if (this.f4207o00oOo0o == i2) {
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            o00oOo00 o00ooo002 = (o00oOo00) childAt2.getLayoutParams();
            if (!o00ooo002.f4254o00oOo0o) {
                if (isLayoutRTL() && this.f4206o00oOo0O == 1) {
                    int i4 = this.f4203o00oOOo0;
                    int i5 = o00ooo002.f4253o00oOo0O.f4259o00oOo0O;
                    childAt2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f4207o00oOo0o) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = o00ooo002.f4253o00oOo0O.f4259o00oOo0O;
                    int i7 = this.f4206o00oOo0O;
                    int i8 = (this.f4207o00oOo0o * i6) - (i6 * i2);
                    if (i7 == 1) {
                        childAt2.offsetLeftAndRight(i8);
                    } else {
                        childAt2.offsetTopAndBottom(i8);
                    }
                }
            }
        }
    }

    public void o00ooooo(int i) {
        assertNotInLayoutOrScroll(null);
        if (i == this.f4216o00oo0) {
            return;
        }
        if (i != 0 && i != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.f4216o00oo0 = i;
        requestLayout();
    }

    public boolean o0O000(RecyclerView.o0O00OOO o0o00ooo, o00oOOoO o00ooooo2) {
        int i;
        int o00oo02;
        int o00oOoO02;
        if (!o0o00ooo.o00oOoOo() && (i = this.f4212o00oOoo0) != -1) {
            if (i >= 0 && i < o0o00ooo.o00oOooO()) {
                SavedState savedState = this.f4218o00oo0O;
                if (savedState == null || savedState.f4236o00oo0O0 == -1 || savedState.f4237o00oo0Oo < 1) {
                    View findViewByPosition = findViewByPosition(this.f4212o00oOoo0);
                    if (findViewByPosition != null) {
                        o00ooooo2.f4245o00oOOo0 = this.f4210o00oOoOO ? o00ooO0O() : o00ooO00();
                        if (this.f4214o00oOooo != Integer.MIN_VALUE) {
                            if (o00ooooo2.f4247o00oOo00) {
                                o00oo02 = this.f4205o00oOo00.o00oOoOO() - this.f4214o00oOooo;
                                o00oOoO02 = this.f4205o00oOo00.o00oOooO(findViewByPosition);
                            } else {
                                o00oo02 = this.f4205o00oOo00.o00oo0() + this.f4214o00oOooo;
                                o00oOoO02 = this.f4205o00oOo00.o00oOoO0(findViewByPosition);
                            }
                            o00ooooo2.f4246o00oOOoO = o00oo02 - o00oOoO02;
                            return true;
                        } else if (this.f4205o00oOo00.o00oOo0O(findViewByPosition) > this.f4205o00oOo00.o00oo0OO()) {
                            o00ooooo2.f4246o00oOOoO = o00ooooo2.f4247o00oOo00 ? this.f4205o00oOo00.o00oOoOO() : this.f4205o00oOo00.o00oo0();
                            return true;
                        } else {
                            int o00oOoO03 = this.f4205o00oOo00.o00oOoO0(findViewByPosition) - this.f4205o00oOo00.o00oo0();
                            if (o00oOoO03 < 0) {
                                o00ooooo2.f4246o00oOOoO = -o00oOoO03;
                                return true;
                            }
                            int o00oOoOO2 = this.f4205o00oOo00.o00oOoOO() - this.f4205o00oOo00.o00oOooO(findViewByPosition);
                            if (o00oOoOO2 < 0) {
                                o00ooooo2.f4246o00oOOoO = o00oOoOO2;
                                return true;
                            }
                            o00ooooo2.f4246o00oOOoO = Integer.MIN_VALUE;
                        }
                    } else {
                        int i2 = this.f4212o00oOoo0;
                        o00ooooo2.f4245o00oOOo0 = i2;
                        int i3 = this.f4214o00oOooo;
                        if (i3 == Integer.MIN_VALUE) {
                            o00ooooo2.f4247o00oOo00 = o00oOo0o(i2) == 1;
                            o00ooooo2.o00oOOo0();
                        } else {
                            o00ooooo2.o00oOOoO(i3);
                        }
                        o00ooooo2.f4251o00oOooO = true;
                    }
                } else {
                    o00ooooo2.f4246o00oOOoO = Integer.MIN_VALUE;
                    o00ooooo2.f4245o00oOOo0 = this.f4212o00oOoo0;
                }
                return true;
            }
            this.f4212o00oOoo0 = -1;
            this.f4214o00oOooo = Integer.MIN_VALUE;
        }
        return false;
    }

    public void o0O00000(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.f4203o00oOOo0) {
            o00ooOoo();
            this.f4203o00oOOo0 = i;
            this.f4211o00oOoOo = new BitSet(this.f4203o00oOOo0);
            this.f4204o00oOOoO = new o00oOo0O[this.f4203o00oOOo0];
            for (int i2 = 0; i2 < this.f4203o00oOOo0; i2++) {
                this.f4204o00oOOoO[i2] = new o00oOo0O(i2);
            }
            requestLayout();
        }
    }

    public final void o0O0000O(int i, int i2) {
        for (int i3 = 0; i3 < this.f4203o00oOOo0; i3++) {
            if (!this.f4204o00oOOoO[i3].f4256o00oOOo0.isEmpty()) {
                o0OoOoOO(this.f4204o00oOOoO[i3], i, i2);
            }
        }
    }

    public final boolean o0O0000o(RecyclerView.o0O00OOO o0o00ooo, o00oOOoO o00ooooo2) {
        boolean z = this.f4220o00oo0OO;
        int o00oOooO2 = o0o00ooo.o00oOooO();
        o00ooooo2.f4245o00oOOo0 = z ? o00oo0o(o00oOooO2) : o00oo0(o00oOooO2);
        o00ooooo2.f4246o00oOOoO = Integer.MIN_VALUE;
        return true;
    }

    public void o0O000O(RecyclerView.o0O00OOO o0o00ooo, o00oOOoO o00ooooo2) {
        if (o0O000(o0o00ooo, o00ooooo2) || o0O0000o(o0o00ooo, o00ooooo2)) {
            return;
        }
        o00ooooo2.o00oOOo0();
        o00ooooo2.f4245o00oOOo0 = 0;
    }

    public void o0O000Oo(int i) {
        this.f4207o00oOo0o = i / this.f4203o00oOOo0;
        this.f4221o00oo0Oo = View.MeasureSpec.makeMeasureSpec(i, this.f4213o00oOooO.o00oOooo());
    }

    public final int o0O000o0(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final void o0O0o(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, boolean z) {
        int o00oOoOO2;
        int o00ooO0o2 = o00ooO0o(Integer.MIN_VALUE);
        if (o00ooO0o2 != Integer.MIN_VALUE && (o00oOoOO2 = this.f4205o00oOo00.o00oOoOO() - o00ooO0o2) > 0) {
            int i = o00oOoOO2 - (-scrollBy(-o00oOoOO2, o0o00o0, o0o00ooo));
            if (!z || i <= 0) {
                return;
            }
            this.f4205o00oOo00.o00oo0o(i);
        }
    }

    public final void o0OoOoOO(o00oOo0O o00ooo0o2, int i, int i2) {
        int o00oo0OO2 = o00ooo0o2.o00oo0OO();
        if (i == -1) {
            if (o00ooo0o2.o00oo0o() + o00oo0OO2 > i2) {
                return;
            }
        } else if (o00ooo0o2.o00oo0O0() - o00oo0OO2 < i2) {
            return;
        }
        this.f4211o00oOoOo.set(o00ooo0o2.f4259o00oOo0O, false);
    }

    public final void o0OoOoOo(int i, RecyclerView.o0O00OOO o0o00ooo) {
        int i2;
        int i3;
        int o00oOoO02;
        o0O000O o0o000o = this.f4209o00oOoO0;
        boolean z = false;
        o0o000o.f4575o00oOOoO = 0;
        o0o000o.f4576o00oOo00 = i;
        if (!isSmoothScrolling() || (o00oOoO02 = o0o00ooo.o00oOoO0()) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f4210o00oOoOO == (o00oOoO02 < i)) {
                i2 = this.f4205o00oOo00.o00oo0OO();
                i3 = 0;
            } else {
                i3 = this.f4205o00oOo00.o00oo0OO();
                i2 = 0;
            }
        }
        if (getClipToPadding()) {
            this.f4209o00oOoO0.f4578o00oOo0o = this.f4205o00oOo00.o00oo0() - i3;
            this.f4209o00oOoO0.f4580o00oOoO0 = this.f4205o00oOo00.o00oOoOO() + i2;
        } else {
            this.f4209o00oOoO0.f4580o00oOoO0 = this.f4205o00oOo00.o00oOoO() + i2;
            this.f4209o00oOoO0.f4578o00oOo0o = -i3;
        }
        o0O000O o0o000o2 = this.f4209o00oOoO0;
        o0o000o2.f4579o00oOoO = false;
        o0o000o2.f4574o00oOOo0 = true;
        if (this.f4205o00oOo00.o00oOooo() == 0 && this.f4205o00oOo00.o00oOoO() == 0) {
            z = true;
        }
        o0o000o2.f4581o00oOoOO = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f4203o00oOOo0; i2++) {
            this.f4204o00oOOoO[i2].o00oo(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f4203o00oOOo0; i2++) {
            this.f4204o00oOOoO[i2].o00oo(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onAdapterChanged(@o0OO00OO RecyclerView.o00oo0OO o00oo0oo, @o0OO00OO RecyclerView.o00oo0OO o00oo0oo2) {
        this.f4217o00oo00O.o00oOOoO();
        for (int i = 0; i < this.f4203o00oOOo0; i++) {
            this.f4204o00oOOoO[i].o00oOo0O();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.o0O00O0 o0o00o0) {
        super.onDetachedFromWindow(recyclerView, o0o00o0);
        removeCallbacks(this.f4225o00ooO00);
        for (int i = 0; i < this.f4203o00oOOo0; i++) {
            this.f4204o00oOOoO[i].o00oOo0O();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    @o0OO00OO
    public View onFocusSearchFailed(View view, int i, RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo) {
        View findContainingItemView;
        View o00oo0Oo2;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        o00oOo00 o00ooo002 = (o00oOo00) findContainingItemView.getLayoutParams();
        boolean z = o00ooo002.f4254o00oOo0o;
        o00oOo0O o00ooo0o2 = o00ooo002.f4253o00oOo0O;
        int o00ooO0O2 = convertFocusDirectionToLayoutDirection == 1 ? o00ooO0O() : o00ooO00();
        o0OoOoOo(o00ooO0O2, o0o00ooo);
        o0(convertFocusDirectionToLayoutDirection);
        o0O000O o0o000o = this.f4209o00oOoO0;
        o0o000o.f4576o00oOo00 = o0o000o.f4582o00oOooO + o00ooO0O2;
        o0o000o.f4575o00oOOoO = (int) (this.f4205o00oOo00.o00oo0OO() * 0.33333334f);
        o0O000O o0o000o2 = this.f4209o00oOoO0;
        o0o000o2.f4579o00oOoO = true;
        o0o000o2.f4574o00oOOo0 = false;
        o00oOooo(o0o00o0, o0o000o2, o0o00ooo);
        this.f4220o00oo0OO = this.f4210o00oOoOO;
        if (z || (o00oo0Oo2 = o00ooo0o2.o00oo0Oo(o00ooO0O2, convertFocusDirectionToLayoutDirection)) == null || o00oo0Oo2 == findContainingItemView) {
            if (o00ooo0o(convertFocusDirectionToLayoutDirection)) {
                for (int i2 = this.f4203o00oOOo0 - 1; i2 >= 0; i2--) {
                    View o00oo0Oo3 = this.f4204o00oOOoO[i2].o00oo0Oo(o00ooO0O2, convertFocusDirectionToLayoutDirection);
                    if (o00oo0Oo3 != null && o00oo0Oo3 != findContainingItemView) {
                        return o00oo0Oo3;
                    }
                }
            } else {
                for (int i3 = 0; i3 < this.f4203o00oOOo0; i3++) {
                    View o00oo0Oo4 = this.f4204o00oOOoO[i3].o00oo0Oo(o00ooO0O2, convertFocusDirectionToLayoutDirection);
                    if (o00oo0Oo4 != null && o00oo0Oo4 != findContainingItemView) {
                        return o00oo0Oo4;
                    }
                }
            }
            boolean z2 = (this.f4208o00oOoO ^ true) == (convertFocusDirectionToLayoutDirection == -1);
            if (!z) {
                View findViewByPosition = findViewByPosition(z2 ? o00ooo0o2.o00oOoO0() : o00ooo0o2.o00oOoOo());
                if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
                    return findViewByPosition;
                }
            }
            if (o00ooo0o(convertFocusDirectionToLayoutDirection)) {
                for (int i4 = this.f4203o00oOOo0 - 1; i4 >= 0; i4--) {
                    if (i4 != o00ooo0o2.f4259o00oOo0O) {
                        o00oOo0O[] o00ooo0oArr = this.f4204o00oOOoO;
                        View findViewByPosition2 = findViewByPosition(z2 ? o00ooo0oArr[i4].o00oOoO0() : o00ooo0oArr[i4].o00oOoOo());
                        if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                            return findViewByPosition2;
                        }
                    }
                }
            } else {
                for (int i5 = 0; i5 < this.f4203o00oOOo0; i5++) {
                    o00oOo0O[] o00ooo0oArr2 = this.f4204o00oOOoO;
                    View findViewByPosition3 = findViewByPosition(z2 ? o00ooo0oArr2[i5].o00oOoO0() : o00ooo0oArr2[i5].o00oOoOo());
                    if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                        return findViewByPosition3;
                    }
                }
            }
            return null;
        }
        return o00oo0Oo2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View o00oo0O02 = o00oo0O0(false);
            View o00oo0OO2 = o00oo0OO(false);
            if (o00oo0O02 == null || o00oo0OO2 == null) {
                return;
            }
            int position = getPosition(o00oo0O02);
            int position2 = getPosition(o00oo0OO2);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
                return;
            }
            accessibilityEvent.setFromIndex(position2);
            accessibilityEvent.setToIndex(position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        o00ooOo(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f4217o00oo00O.o00oOOoO();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        o00ooOo(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        o00ooOo(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        o00ooOo(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onLayoutChildren(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo) {
        o00ooo0O(o0o00o0, o0o00ooo, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onLayoutCompleted(RecyclerView.o0O00OOO o0o00ooo) {
        super.onLayoutCompleted(o0o00ooo);
        this.f4212o00oOoo0 = -1;
        this.f4214o00oOooo = Integer.MIN_VALUE;
        this.f4218o00oo0O = null;
        this.f4222o00oo0o.o00oOo00();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f4218o00oo0O = savedState;
            if (this.f4212o00oOoo0 != -1) {
                savedState.o00oOOo0();
                this.f4218o00oo0O.o00oOOoO();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public Parcelable onSaveInstanceState() {
        int o00oo0oO2;
        int o00oo02;
        int[] iArr;
        if (this.f4218o00oo0O != null) {
            return new SavedState(this.f4218o00oo0O);
        }
        SavedState savedState = new SavedState();
        savedState.f4234o00oo = this.f4208o00oOoO;
        savedState.f4242o00ooO00 = this.f4220o00oo0OO;
        savedState.f4241o00ooO0 = this.f4219o00oo0O0;
        LazySpanLookup lazySpanLookup = this.f4217o00oo00O;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f4228o00oOOo0) == null) {
            savedState.f4238o00oo0o = 0;
        } else {
            savedState.f4240o00oo0oO = iArr;
            savedState.f4238o00oo0o = iArr.length;
            savedState.f4243o0O0o = lazySpanLookup.f4229o00oOOoO;
        }
        if (getChildCount() > 0) {
            savedState.f4236o00oo0O0 = this.f4220o00oo0OO ? o00ooO0O() : o00ooO00();
            savedState.f4235o00oo0O = o00oo0O();
            int i = this.f4203o00oOOo0;
            savedState.f4237o00oo0Oo = i;
            savedState.f4239o00oo0o0 = new int[i];
            for (int i2 = 0; i2 < this.f4203o00oOOo0; i2++) {
                if (this.f4220o00oo0OO) {
                    o00oo0oO2 = this.f4204o00oOOoO[i2].o00oo0O(Integer.MIN_VALUE);
                    if (o00oo0oO2 != Integer.MIN_VALUE) {
                        o00oo02 = this.f4205o00oOo00.o00oOoOO();
                        o00oo0oO2 -= o00oo02;
                        savedState.f4239o00oo0o0[i2] = o00oo0oO2;
                    } else {
                        savedState.f4239o00oo0o0[i2] = o00oo0oO2;
                    }
                } else {
                    o00oo0oO2 = this.f4204o00oOOoO[i2].o00oo0oO(Integer.MIN_VALUE);
                    if (o00oo0oO2 != Integer.MIN_VALUE) {
                        o00oo02 = this.f4205o00oOo00.o00oo0();
                        o00oo0oO2 -= o00oo02;
                        savedState.f4239o00oo0o0[i2] = o00oo0oO2;
                    } else {
                        savedState.f4239o00oo0o0[i2] = o00oo0oO2;
                    }
                }
            }
        } else {
            savedState.f4236o00oo0O0 = -1;
            savedState.f4235o00oo0O = -1;
            savedState.f4237o00oo0Oo = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            o00oOoO0();
        }
    }

    public final void resolveShouldLayoutReverse() {
        this.f4210o00oOoOO = (this.f4206o00oOo0O == 1 || !isLayoutRTL()) ? this.f4208o00oOoO : !this.f4208o00oOoO;
    }

    public int scrollBy(int i, RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        o00oooO(i, o0o00ooo);
        int o00oOooo2 = o00oOooo(o0o00o0, this.f4209o00oOoO0, o0o00ooo);
        if (this.f4209o00oOoO0.f4575o00oOOoO >= o00oOooo2) {
            i = i < 0 ? -o00oOooo2 : o00oOooo2;
        }
        this.f4205o00oOo00.o00oo0o(-i);
        this.f4220o00oo0OO = this.f4210o00oOoOO;
        o0O000O o0o000o = this.f4209o00oOoO0;
        o0o000o.f4575o00oOOoO = 0;
        o00oooOo(o0o00o0, o0o000o);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int scrollHorizontallyBy(int i, RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo) {
        return scrollBy(i, o0o00o0, o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void scrollToPosition(int i) {
        SavedState savedState = this.f4218o00oo0O;
        if (savedState != null && savedState.f4236o00oo0O0 != i) {
            savedState.o00oOOo0();
        }
        this.f4212o00oOoo0 = i;
        this.f4214o00oOooo = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        SavedState savedState = this.f4218o00oo0O;
        if (savedState != null) {
            savedState.o00oOOo0();
        }
        this.f4212o00oOoo0 = i;
        this.f4214o00oOooo = i2;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int scrollVerticallyBy(int i, RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo) {
        return scrollBy(i, o0o00o0, o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f4206o00oOo0O == 1) {
            chooseSize2 = RecyclerView.o0O00000.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            chooseSize = RecyclerView.o0O00000.chooseSize(i, (this.f4207o00oOo0o * this.f4203o00oOOo0) + paddingRight, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.o0O00000.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            chooseSize2 = RecyclerView.o0O00000.chooseSize(i2, (this.f4207o00oOo0o * this.f4203o00oOOo0) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i == this.f4206o00oOo0O) {
            return;
        }
        this.f4206o00oOo0O = i;
        o0O00O o0o00o = this.f4205o00oOo00;
        this.f4205o00oOo00 = this.f4213o00oOooO;
        this.f4213o00oOooO = o0o00o;
        requestLayout();
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f4218o00oo0O;
        if (savedState != null && savedState.f4234o00oo != z) {
            savedState.f4234o00oo = z;
        }
        this.f4208o00oOoO = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.o0O00OOO o0o00ooo, int i) {
        o0OoOoOo o0oooooo = new o0OoOoOo(recyclerView.getContext());
        o0oooooo.setTargetPosition(i);
        startSmoothScroll(o0oooooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public boolean supportsPredictiveItemAnimations() {
        return this.f4218o00oo0O == null;
    }
}
