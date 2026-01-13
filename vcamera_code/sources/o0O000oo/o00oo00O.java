package o0O000oo;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import o00oOooO.o0OO0oO;
import o0ooOoOO.oO00O0o0;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public final class o00oo00O {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f10434o00oOOoO = 0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f10435o00oOo00 = 1;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f10436o00oOo0O = 3;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f10437o00oOo0o = 4;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f10438o00oOoO = 1;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f10439o00oOoO0 = 5;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f10440o00oOooO = 2;
    @o00oOooO.oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oo0 f10441o00oOOo0;

    @o00oOooO.o0OOooO0(31)
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        @o00oOooO.oo0oO0
        public static Pair<ContentInfo, ContentInfo> o00oOOo0(@o00oOooO.oo0oO0 ContentInfo contentInfo, @o00oOooO.oo0oO0 final Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() != 1) {
                Objects.requireNonNull(predicate);
                Pair<ClipData, ClipData> o00oOoO2 = o00oo00O.o00oOoO(clip, new oO00O0o0() { // from class: o0O000oo.o00oOoO
                    @Override // o0ooOoOO.oO00O0o0
                    public final boolean test(Object obj) {
                        return predicate.test((ClipData.Item) obj);
                    }
                });
                return o00oOoO2.first == null ? Pair.create(null, contentInfo) : o00oOoO2.second == null ? Pair.create(contentInfo, null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) o00oOoO2.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) o00oOoO2.second).build());
            }
            boolean test = predicate.test(clip.getItemAt(0));
            ContentInfo contentInfo2 = test ? contentInfo : null;
            if (test) {
                contentInfo = null;
            }
            return Pair.create(contentInfo2, contentInfo);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO {
        @o00oOooO.oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oOo0O f10442o00oOOo0;

        public o00oOOoO(@o00oOooO.oo0oO0 ClipData clipData, int i) {
            this.f10442o00oOOo0 = Build.VERSION.SDK_INT >= 31 ? new o00oOo00(clipData, i) : new o00oOoO(clipData, i);
        }

        public o00oOOoO(@o00oOooO.oo0oO0 o00oo00O o00oo00o) {
            this.f10442o00oOOo0 = Build.VERSION.SDK_INT >= 31 ? new o00oOo00(o00oo00o) : new o00oOoO(o00oo00o);
        }

        @o00oOooO.oo0oO0
        public o00oo00O o00oOOo0() {
            return this.f10442o00oOOo0.build();
        }

        @o00oOooO.oo0oO0
        public o00oOOoO o00oOOoO(@o00oOooO.oo0oO0 ClipData clipData) {
            this.f10442o00oOOo0.o00oOo00(clipData);
            return this;
        }

        @o00oOooO.oo0oO0
        public o00oOOoO o00oOo00(@o00oOooO.o0OO00OO Bundle bundle) {
            this.f10442o00oOOo0.setExtras(bundle);
            return this;
        }

        @o00oOooO.oo0oO0
        public o00oOOoO o00oOo0O(@o00oOooO.o0OO00OO Uri uri) {
            this.f10442o00oOOo0.o00oOOoO(uri);
            return this;
        }

        @o00oOooO.oo0oO0
        public o00oOOoO o00oOo0o(int i) {
            this.f10442o00oOOo0.o00oOOo0(i);
            return this;
        }

        @o00oOooO.oo0oO0
        public o00oOOoO o00oOooO(int i) {
            this.f10442o00oOOo0.setFlags(i);
            return this;
        }
    }

    @o00oOooO.o0OOooO0(31)
    /* loaded from: classes.dex */
    public static final class o00oOo00 implements o00oOo0O {
        @o00oOooO.oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final ContentInfo.Builder f10443o00oOOo0;

        public o00oOo00(@o00oOooO.oo0oO0 ClipData clipData, int i) {
            this.f10443o00oOOo0 = new ContentInfo.Builder(clipData, i);
        }

        public o00oOo00(@o00oOooO.oo0oO0 o00oo00O o00oo00o) {
            this.f10443o00oOOo0 = new ContentInfo.Builder(o00oo00o.o00oOooo());
        }

        @Override // o0O000oo.o00oo00O.o00oOo0O
        @o00oOooO.oo0oO0
        public o00oo00O build() {
            return new o00oo00O(new C0133o00oo00O(this.f10443o00oOOo0.build()));
        }

        @Override // o0O000oo.o00oo00O.o00oOo0O
        public void o00oOOo0(int i) {
            this.f10443o00oOOo0.setSource(i);
        }

        @Override // o0O000oo.o00oo00O.o00oOo0O
        public void o00oOOoO(@o00oOooO.o0OO00OO Uri uri) {
            this.f10443o00oOOo0.setLinkUri(uri);
        }

        @Override // o0O000oo.o00oo00O.o00oOo0O
        public void o00oOo00(@o00oOooO.oo0oO0 ClipData clipData) {
            this.f10443o00oOOo0.setClip(clipData);
        }

        @Override // o0O000oo.o00oo00O.o00oOo0O
        public void setExtras(@o00oOooO.o0OO00OO Bundle bundle) {
            this.f10443o00oOOo0.setExtras(bundle);
        }

        @Override // o0O000oo.o00oo00O.o00oOo0O
        public void setFlags(int i) {
            this.f10443o00oOOo0.setFlags(i);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo0O {
        @o00oOooO.oo0oO0
        o00oo00O build();

        void o00oOOo0(int i);

        void o00oOOoO(@o00oOooO.o0OO00OO Uri uri);

        void o00oOo00(@o00oOooO.oo0oO0 ClipData clipData);

        void setExtras(@o00oOooO.o0OO00OO Bundle bundle);

        void setFlags(int i);
    }

    /* loaded from: classes.dex */
    public static final class o00oOoO implements o00oOo0O {
        @o00oOooO.oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public ClipData f10444o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f10445o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f10446o00oOo00;
        @o00oOooO.o0OO00OO

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public Bundle f10447o00oOo0O;
        @o00oOooO.o0OO00OO

        /* renamed from: o00oOooO  reason: collision with root package name */
        public Uri f10448o00oOooO;

        public o00oOoO(@o00oOooO.oo0oO0 ClipData clipData, int i) {
            this.f10444o00oOOo0 = clipData;
            this.f10445o00oOOoO = i;
        }

        public o00oOoO(@o00oOooO.oo0oO0 o00oo00O o00oo00o) {
            this.f10444o00oOOo0 = o00oo00o.o00oOo00();
            this.f10445o00oOOoO = o00oo00o.o00oOoO0();
            this.f10446o00oOo00 = o00oo00o.o00oOo0O();
            this.f10448o00oOooO = o00oo00o.o00oOo0o();
            this.f10447o00oOo0O = o00oo00o.o00oOooO();
        }

        @Override // o0O000oo.o00oo00O.o00oOo0O
        @o00oOooO.oo0oO0
        public o00oo00O build() {
            return new o00oo00O(new o00oo0OO(this));
        }

        @Override // o0O000oo.o00oo00O.o00oOo0O
        public void o00oOOo0(int i) {
            this.f10445o00oOOoO = i;
        }

        @Override // o0O000oo.o00oo00O.o00oOo0O
        public void o00oOOoO(@o00oOooO.o0OO00OO Uri uri) {
            this.f10448o00oOooO = uri;
        }

        @Override // o0O000oo.o00oo00O.o00oOo0O
        public void o00oOo00(@o00oOooO.oo0oO0 ClipData clipData) {
            this.f10444o00oOOo0 = clipData;
        }

        @Override // o0O000oo.o00oo00O.o00oOo0O
        public void setExtras(@o00oOooO.o0OO00OO Bundle bundle) {
            this.f10447o00oOo0O = bundle;
        }

        @Override // o0O000oo.o00oo00O.o00oOo0O
        public void setFlags(int i) {
            this.f10446o00oOo00 = i;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oo0 {
        @o00oOooO.o0OO00OO
        Bundle getExtras();

        int getFlags();

        int getSource();

        @o00oOooO.o0OO00OO
        Uri o00oOOo0();

        @o00oOooO.o0OO00OO
        ContentInfo o00oOOoO();

        @o00oOooO.oo0oO0
        ClipData o00oOo00();
    }

    @o00oOooO.o0OOooO0(31)
    /* renamed from: o0O000oo.o00oo00O$o00oo00O  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0133o00oo00O implements o00oo0 {
        @o00oOooO.oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final ContentInfo f10449o00oOOo0;

        public C0133o00oo00O(@o00oOooO.oo0oO0 ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f10449o00oOOo0 = contentInfo;
        }

        @Override // o0O000oo.o00oo00O.o00oo0
        @o00oOooO.o0OO00OO
        public Bundle getExtras() {
            return this.f10449o00oOOo0.getExtras();
        }

        @Override // o0O000oo.o00oo00O.o00oo0
        public int getFlags() {
            return this.f10449o00oOOo0.getFlags();
        }

        @Override // o0O000oo.o00oo00O.o00oo0
        public int getSource() {
            return this.f10449o00oOOo0.getSource();
        }

        @Override // o0O000oo.o00oo00O.o00oo0
        @o00oOooO.o0OO00OO
        public Uri o00oOOo0() {
            return this.f10449o00oOOo0.getLinkUri();
        }

        @Override // o0O000oo.o00oo00O.o00oo0
        @o00oOooO.oo0oO0
        public ContentInfo o00oOOoO() {
            return this.f10449o00oOOo0;
        }

        @Override // o0O000oo.o00oo00O.o00oo0
        @o00oOooO.oo0oO0
        public ClipData o00oOo00() {
            return this.f10449o00oOOo0.getClip();
        }

        @o00oOooO.oo0oO0
        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ContentInfoCompat{");
            o00oOOo02.append(this.f10449o00oOOo0);
            o00oOOo02.append("}");
            return o00oOOo02.toString();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oo0O {
    }

    @Retention(RetentionPolicy.SOURCE)
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oo0O0 {
    }

    /* loaded from: classes.dex */
    public static final class o00oo0OO implements o00oo0 {
        @o00oOooO.oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final ClipData f10450o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f10451o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f10452o00oOo00;
        @o00oOooO.o0OO00OO

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final Bundle f10453o00oOo0O;
        @o00oOooO.o0OO00OO

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final Uri f10454o00oOooO;

        public o00oo0OO(o00oOoO o00oooo2) {
            ClipData clipData = o00oooo2.f10444o00oOOo0;
            clipData.getClass();
            this.f10450o00oOOo0 = clipData;
            this.f10451o00oOOoO = ooOOOOoo.o00oOoO0(o00oooo2.f10445o00oOOoO, 0, 5, FirebaseAnalytics.Param.SOURCE);
            this.f10452o00oOo00 = ooOOOOoo.o00oOoo0(o00oooo2.f10446o00oOo00, 1);
            this.f10454o00oOooO = o00oooo2.f10448o00oOooO;
            this.f10453o00oOo0O = o00oooo2.f10447o00oOo0O;
        }

        @Override // o0O000oo.o00oo00O.o00oo0
        @o00oOooO.o0OO00OO
        public Bundle getExtras() {
            return this.f10453o00oOo0O;
        }

        @Override // o0O000oo.o00oo00O.o00oo0
        public int getFlags() {
            return this.f10452o00oOo00;
        }

        @Override // o0O000oo.o00oo00O.o00oo0
        public int getSource() {
            return this.f10451o00oOOoO;
        }

        @Override // o0O000oo.o00oo00O.o00oo0
        @o00oOooO.o0OO00OO
        public Uri o00oOOo0() {
            return this.f10454o00oOooO;
        }

        @Override // o0O000oo.o00oo00O.o00oo0
        @o00oOooO.o0OO00OO
        public ContentInfo o00oOOoO() {
            return null;
        }

        @Override // o0O000oo.o00oo00O.o00oo0
        @o00oOooO.oo0oO0
        public ClipData o00oOo00() {
            return this.f10450o00oOOo0;
        }

        @o00oOooO.oo0oO0
        public String toString() {
            String sb;
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ContentInfoCompat{clip=");
            o00oOOo02.append(this.f10450o00oOOo0.getDescription());
            o00oOOo02.append(", source=");
            o00oOOo02.append(o00oo00O.o00oOoo0(this.f10451o00oOOoO));
            o00oOOo02.append(", flags=");
            o00oOOo02.append(o00oo00O.o00oOOoO(this.f10452o00oOo00));
            if (this.f10454o00oOooO == null) {
                sb = "";
            } else {
                StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0(", hasLinkUri(");
                o00oOOo03.append(this.f10454o00oOooO.toString().length());
                o00oOOo03.append(")");
                sb = o00oOOo03.toString();
            }
            o00oOOo02.append(sb);
            return android.support.v4.media.o00oOOoO.o00oOOo0(o00oOOo02, this.f10453o00oOo0O != null ? ", hasExtras" : "", "}");
        }
    }

    public o00oo00O(@o00oOooO.oo0oO0 o00oo0 o00oo0Var) {
        this.f10441o00oOOo0 = o00oo0Var;
    }

    @o00oOooO.oo0oO0
    public static ClipData o00oOOo0(@o00oOooO.oo0oO0 ClipDescription clipDescription, @o00oOooO.oo0oO0 List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem(list.get(i));
        }
        return clipData;
    }

    @o00oOooO.oo0oO0
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static String o00oOOoO(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    @o00oOooO.oo0oO0
    public static Pair<ClipData, ClipData> o00oOoO(@o00oOooO.oo0oO0 ClipData clipData, @o00oOooO.oo0oO0 oO00O0o0<ClipData.Item> oo00o0o0) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < clipData.getItemCount(); i++) {
            ClipData.Item itemAt = clipData.getItemAt(i);
            if (oo00o0o0.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        return arrayList == null ? Pair.create(null, clipData) : arrayList2 == null ? Pair.create(clipData, null) : Pair.create(o00oOOo0(clipData.getDescription(), arrayList), o00oOOo0(clipData.getDescription(), arrayList2));
    }

    @o00oOooO.o0OOooO0(31)
    @o00oOooO.oo0oO0
    public static Pair<ContentInfo, ContentInfo> o00oOoOO(@o00oOooO.oo0oO0 ContentInfo contentInfo, @o00oOooO.oo0oO0 Predicate<ClipData.Item> predicate) {
        return o00oOOo0.o00oOOo0(contentInfo, predicate);
    }

    @o00oOooO.oo0oO0
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static String o00oOoo0(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    @o00oOooO.o0OOooO0(31)
    @o00oOooO.oo0oO0
    public static o00oo00O o00oo00O(@o00oOooO.oo0oO0 ContentInfo contentInfo) {
        return new o00oo00O(new C0133o00oo00O(contentInfo));
    }

    @o00oOooO.oo0oO0
    public ClipData o00oOo00() {
        return this.f10441o00oOOo0.o00oOo00();
    }

    public int o00oOo0O() {
        return this.f10441o00oOOo0.getFlags();
    }

    @o00oOooO.o0OO00OO
    public Uri o00oOo0o() {
        return this.f10441o00oOOo0.o00oOOo0();
    }

    public int o00oOoO0() {
        return this.f10441o00oOOo0.getSource();
    }

    @o00oOooO.oo0oO0
    public Pair<o00oo00O, o00oo00O> o00oOoOo(@o00oOooO.oo0oO0 oO00O0o0<ClipData.Item> oo00o0o0) {
        ClipData o00oOo002 = this.f10441o00oOOo0.o00oOo00();
        if (o00oOo002.getItemCount() == 1) {
            boolean test = oo00o0o0.test(o00oOo002.getItemAt(0));
            return Pair.create(test ? this : null, test ? null : this);
        }
        Pair<ClipData, ClipData> o00oOoO2 = o00oOoO(o00oOo002, oo00o0o0);
        if (o00oOoO2.first == null) {
            return Pair.create(null, this);
        }
        if (o00oOoO2.second == null) {
            return Pair.create(this, null);
        }
        o00oOOoO o00ooooo2 = new o00oOOoO(this);
        o00ooooo2.f10442o00oOOo0.o00oOo00((ClipData) o00oOoO2.first);
        o00oo00O o00oOOo02 = o00ooooo2.o00oOOo0();
        o00oOOoO o00ooooo3 = new o00oOOoO(this);
        o00ooooo3.f10442o00oOOo0.o00oOo00((ClipData) o00oOoO2.second);
        return Pair.create(o00oOOo02, o00ooooo3.o00oOOo0());
    }

    @o00oOooO.o0OO00OO
    public Bundle o00oOooO() {
        return this.f10441o00oOOo0.getExtras();
    }

    @o00oOooO.o0OOooO0(31)
    @o00oOooO.oo0oO0
    public ContentInfo o00oOooo() {
        ContentInfo o00oOOoO2 = this.f10441o00oOOo0.o00oOOoO();
        Objects.requireNonNull(o00oOOoO2);
        return o00oOOoO2;
    }

    @o00oOooO.oo0oO0
    public String toString() {
        return this.f10441o00oOOo0.toString();
    }
}
