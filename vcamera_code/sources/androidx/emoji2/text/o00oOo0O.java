package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.emoji2.text.o00oo00O;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public final class o00oOo0O {

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @oo0oO0

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final String f2653o00oOOoO = "emoji2.text.DefaultEmojiConfig";
        @oo0oO0

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final String f2654o00oOo00 = "androidx.content.action.LOAD_EMOJI_FONT";
        @oo0oO0

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final String f2655o00oOooO = "emojicompat-emoji-font";

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oOOoO f2656o00oOOo0;

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public o00oOOo0(@o0OO00OO o00oOOoO o00ooooo2) {
            this.f2656o00oOOo0 = o00ooooo2 == null ? new C0017o00oOo0O() : o00ooooo2;
        }

        @oo0oO0
        public static o00oOOoO o00oOo0O() {
            return new C0017o00oOo0O();
        }

        @o0OO00OO
        public final o00oo00O.o00oOo0O o00oOOo0(@oo0oO0 Context context, @o0OO00OO o0O000O.o00oo00O o00oo00o) {
            if (o00oo00o == null) {
                return null;
            }
            return new o00oo(context, o00oo00o);
        }

        @oo0oO0
        public final List<List<byte[]>> o00oOOoO(@oo0oO0 Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        @o0OO00OO
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public o00oo00O.o00oOo0O o00oOo00(@oo0oO0 Context context) {
            return o00oOOo0(context, o00oOoO(context));
        }

        public final boolean o00oOo0o(@o0OO00OO ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        @o0OO00OO
        @o0o0000
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public o0O000O.o00oo00O o00oOoO(@oo0oO0 Context context) {
            PackageManager packageManager = context.getPackageManager();
            ooOOOOoo.o00oo00O(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo o00oOoO02 = o00oOoO0(packageManager);
            if (o00oOoO02 == null) {
                return null;
            }
            try {
                return o00oOooO(o00oOoO02, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf(f2653o00oOOoO, e);
                return null;
            }
        }

        @o0OO00OO
        public final ProviderInfo o00oOoO0(@oo0oO0 PackageManager packageManager) {
            for (ResolveInfo resolveInfo : this.f2656o00oOOo0.o00oOo00(packageManager, new Intent(f2654o00oOo00), 0)) {
                ProviderInfo o00oOOo02 = this.f2656o00oOOo0.o00oOOo0(resolveInfo);
                if (o00oOo0o(o00oOOo02)) {
                    return o00oOOo02;
                }
            }
            return null;
        }

        @oo0oO0
        public final o0O000O.o00oo00O o00oOooO(@oo0oO0 ProviderInfo providerInfo, @oo0oO0 PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new o0O000O.o00oo00O(str, str2, f2655o00oOooO, o00oOOoO(this.f2656o00oOOo0.o00oOOoO(packageManager, str2)));
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0OO00OO
        public ProviderInfo o00oOOo0(@oo0oO0 ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @oo0oO0
        public Signature[] o00oOOoO(@oo0oO0 PackageManager packageManager, @oo0oO0 String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @oo0oO0
        public List<ResolveInfo> o00oOo00(@oo0oO0 PackageManager packageManager, @oo0oO0 Intent intent, int i) {
            return Collections.emptyList();
        }
    }

    @o0OOooO0(19)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public static class o00oOo00 extends o00oOOoO {
        @Override // androidx.emoji2.text.o00oOo0O.o00oOOoO
        @o0OO00OO
        public ProviderInfo o00oOOo0(@oo0oO0 ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.o00oOo0O.o00oOOoO
        @oo0oO0
        public List<ResolveInfo> o00oOo00(@oo0oO0 PackageManager packageManager, @oo0oO0 Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    @o0OOooO0(28)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* renamed from: androidx.emoji2.text.o00oOo0O$o00oOo0O  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0017o00oOo0O extends o00oOo00 {
        @Override // androidx.emoji2.text.o00oOo0O.o00oOOoO
        @oo0oO0
        public Signature[] o00oOOoO(@oo0oO0 PackageManager packageManager, @oo0oO0 String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    @o0OO00OO
    public static o00oo o00oOOo0(@oo0oO0 Context context) {
        return (o00oo) new o00oOOo0(null).o00oOo00(context);
    }
}
