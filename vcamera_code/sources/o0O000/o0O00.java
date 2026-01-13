package o0O000;

import android.os.Parcel;
import android.os.Parcelable;
@Deprecated
/* loaded from: classes.dex */
public final class o0O00 {

    /* loaded from: classes.dex */
    public static class o00oOOo0<T> implements Parcelable.ClassLoaderCreator<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0O00O0<T> f10117o00oOOo0;

        public o00oOOo0(o0O00O0<T> o0o00o0) {
            this.f10117o00oOOo0 = o0o00o0;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.f10117o00oOOo0.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f10117o00oOOo0.createFromParcel(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return this.f10117o00oOOo0.newArray(i);
        }
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> o00oOOo0(o0O00O0<T> o0o00o0) {
        return new o00oOOo0(o0o00o0);
    }
}
