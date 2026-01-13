package o00ooOoo;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.media.o00oOo0O;
import android.text.Html;
import android.text.Spanned;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import java.util.ArrayList;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOO0O;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0OOoo;
import o00oOooO.oo0oO0;
import o00ooO0.o00oOoO;
import o00ooo0.o0O000;
/* loaded from: classes.dex */
public final class oO0OO0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9123o00oOOo0 = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f9124o00oOOoO = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f9125o00oOo00 = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f9126o00oOo0O = ".sharecompat_";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f9127o00oOooO = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static String o00oOOo0(CharSequence charSequence) {
            return Html.escapeHtml(charSequence);
        }

        @o0O0O0Oo
        public static void o00oOOoO(@oo0oO0 Intent intent, @oo0oO0 ArrayList<Uri> arrayList) {
            ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(o0O000.f9572o00oOOoO), null, arrayList.get(0)));
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                clipData.addItem(new ClipData.Item(arrayList.get(i)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }

        @o0O0O0Oo
        public static void o00oOo00(@oo0oO0 Intent intent) {
            intent.setClipData(null);
            intent.setFlags(intent.getFlags() & (-2));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Context f9128o00oOOo0;
        @oo0oO0

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Intent f9129o00oOOoO;
        @o0OO00OO

        /* renamed from: o00oOo00  reason: collision with root package name */
        public CharSequence f9130o00oOo00;
        @o0OO00OO

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public ArrayList<String> f9131o00oOo0O;
        @o0OO00OO

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public ArrayList<String> f9132o00oOo0o;
        @o0OO00OO

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public ArrayList<Uri> f9133o00oOoO0;
        @o0OO00OO

        /* renamed from: o00oOooO  reason: collision with root package name */
        public ArrayList<String> f9134o00oOooO;

        public o00oOOoO(@oo0oO0 Context context) {
            context.getClass();
            this.f9128o00oOOo0 = context;
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f9129o00oOOoO = action;
            action.putExtra(oO0OO0O.f9123o00oOOo0, context.getPackageName());
            action.putExtra(oO0OO0O.f9124o00oOOoO, context.getPackageName());
            action.addFlags(524288);
            Activity activity = null;
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f9129o00oOOoO.putExtra(oO0OO0O.f9125o00oOo00, componentName);
                this.f9129o00oOOoO.putExtra(oO0OO0O.f9127o00oOooO, componentName);
            }
        }

        @oo0oO0
        @Deprecated
        public static o00oOOoO o00oOoo0(@oo0oO0 Activity activity) {
            return new o00oOOoO(activity);
        }

        @oo0oO0
        public o00oOOoO o00oOOo0(@oo0oO0 String str) {
            if (this.f9132o00oOo0o == null) {
                this.f9132o00oOo0o = new ArrayList<>();
            }
            this.f9132o00oOo0o.add(str);
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oOOoO(@oo0oO0 String[] strArr) {
            o00oOoOO("android.intent.extra.BCC", strArr);
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oOo00(@oo0oO0 String str) {
            if (this.f9131o00oOo0O == null) {
                this.f9131o00oOo0O = new ArrayList<>();
            }
            this.f9131o00oOo0O.add(str);
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oOo0O(@oo0oO0 String str) {
            if (this.f9134o00oOooO == null) {
                this.f9134o00oOooO = new ArrayList<>();
            }
            this.f9134o00oOooO.add(str);
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oOo0o(@oo0oO0 String[] strArr) {
            o00oOoOO("android.intent.extra.EMAIL", strArr);
            return this;
        }

        public final void o00oOoO(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f9129o00oOOoO.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f9129o00oOOoO.putExtra(str, strArr);
        }

        @oo0oO0
        public o00oOOoO o00oOoO0(@oo0oO0 Uri uri) {
            if (this.f9133o00oOoO0 == null) {
                this.f9133o00oOoO0 = new ArrayList<>();
            }
            this.f9133o00oOoO0.add(uri);
            return this;
        }

        public final void o00oOoOO(@o0OO00OO String str, @oo0oO0 String[] strArr) {
            Intent o00oo00O2 = o00oo00O();
            String[] stringArrayExtra = o00oo00O2.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[strArr.length + length];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            o00oo00O2.putExtra(str, strArr2);
        }

        @oo0oO0
        public Intent o00oOoOo() {
            return Intent.createChooser(o00oo00O(), this.f9130o00oOo00);
        }

        @oo0oO0
        public o00oOOoO o00oOooO(@oo0oO0 String[] strArr) {
            o00oOoOO("android.intent.extra.CC", strArr);
            return this;
        }

        @oo0oO0
        public Context o00oOooo() {
            return this.f9128o00oOOo0;
        }

        @oo0oO0
        public o00oOOoO o00oo(@o0OO00OO String str) {
            this.f9129o00oOOoO.setType(str);
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oo0(@o0OOO0O int i) {
            return o00oo0OO(this.f9128o00oOOo0.getText(i));
        }

        @oo0oO0
        public Intent o00oo00O() {
            ArrayList<String> arrayList = this.f9134o00oOooO;
            if (arrayList != null) {
                o00oOoO("android.intent.extra.EMAIL", arrayList);
                this.f9134o00oOooO = null;
            }
            ArrayList<String> arrayList2 = this.f9131o00oOo0O;
            if (arrayList2 != null) {
                o00oOoO("android.intent.extra.CC", arrayList2);
                this.f9131o00oOo0O = null;
            }
            ArrayList<String> arrayList3 = this.f9132o00oOo0o;
            if (arrayList3 != null) {
                o00oOoO("android.intent.extra.BCC", arrayList3);
                this.f9132o00oOo0o = null;
            }
            ArrayList<Uri> arrayList4 = this.f9133o00oOoO0;
            boolean z = true;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                z = false;
            }
            if (z) {
                this.f9129o00oOOoO.setAction("android.intent.action.SEND_MULTIPLE");
                this.f9129o00oOOoO.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f9133o00oOoO0);
            } else {
                this.f9129o00oOOoO.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.f9133o00oOoO0;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.f9129o00oOOoO.removeExtra("android.intent.extra.STREAM");
                    o00oOOo0.o00oOo00(this.f9129o00oOOoO);
                    return this.f9129o00oOOoO;
                }
                this.f9129o00oOOoO.putExtra("android.intent.extra.STREAM", this.f9133o00oOoO0.get(0));
            }
            o00oOOo0.o00oOOoO(this.f9129o00oOOoO, this.f9133o00oOoO0);
            return this.f9129o00oOOoO;
        }

        @oo0oO0
        public o00oOOoO o00oo0O(@o0OO00OO String[] strArr) {
            this.f9129o00oOOoO.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oo0O0(@o0OO00OO String[] strArr) {
            this.f9129o00oOOoO.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oo0OO(@o0OO00OO CharSequence charSequence) {
            this.f9130o00oOo00 = charSequence;
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oo0Oo(@o0OO00OO String[] strArr) {
            if (this.f9134o00oOooO != null) {
                this.f9134o00oOooO = null;
            }
            this.f9129o00oOOoO.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oo0o(@o0OO00OO Uri uri) {
            this.f9133o00oOoO0 = null;
            if (uri != null) {
                o00oOoO0(uri);
            }
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oo0o0(@o0OO00OO String str) {
            this.f9129o00oOOoO.putExtra(o0O000.f9572o00oOOoO, str);
            if (!this.f9129o00oOOoO.hasExtra("android.intent.extra.TEXT")) {
                o0O0o(Html.fromHtml(str));
            }
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oo0oO(@o0OO00OO String str) {
            this.f9129o00oOOoO.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        public void o00ooO00() {
            this.f9128o00oOOo0.startActivity(o00oOoOo());
        }

        @oo0oO0
        public o00oOOoO o0O0o(@o0OO00OO CharSequence charSequence) {
            this.f9129o00oOOoO.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }
    }

    @Deprecated
    public static void o00oOOo0(@oo0oO0 Menu menu, @oo0OOoo int i, @oo0oO0 o00oOOoO o00ooooo2) {
        MenuItem findItem = menu.findItem(i);
        if (findItem == null) {
            throw new IllegalArgumentException(o00oOoO.o00oOOo0("Could not find menu item with id ", i, " in the supplied menu"));
        }
        o00oOOoO(findItem, o00ooooo2);
    }

    @Deprecated
    public static void o00oOOoO(@oo0oO0 MenuItem menuItem, @oo0oO0 o00oOOoO o00ooooo2) {
        ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider shareActionProvider = !(actionProvider instanceof ShareActionProvider) ? new ShareActionProvider(o00ooooo2.o00oOooo()) : (ShareActionProvider) actionProvider;
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0(f9126o00oOo0O);
        o00oOOo02.append(o00ooooo2.o00oOooo().getClass().getName());
        shareActionProvider.setShareHistoryFileName(o00oOOo02.toString());
        shareActionProvider.setShareIntent(o00ooooo2.o00oo00O());
        menuItem.setActionProvider(shareActionProvider);
    }

    @o0OO00OO
    public static ComponentName o00oOo00(@oo0oO0 Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? o00oOooO(intent) : callingActivity;
    }

    @o0OO00OO
    public static String o00oOo0O(@oo0oO0 Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        return (callingPackage != null || intent == null) ? callingPackage : o00oOo0o(intent);
    }

    @o0OO00OO
    public static String o00oOo0o(@oo0oO0 Intent intent) {
        String stringExtra = intent.getStringExtra(f9123o00oOOo0);
        return stringExtra == null ? intent.getStringExtra(f9124o00oOOoO) : stringExtra;
    }

    @o0OO00OO
    public static ComponentName o00oOooO(@oo0oO0 Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(f9125o00oOo00);
        return componentName == null ? (ComponentName) intent.getParcelableExtra(f9127o00oOooO) : componentName;
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final String f9135o00oOo0o = "IntentReader";
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Context f9136o00oOOo0;
        @oo0oO0

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Intent f9137o00oOOoO;
        @o0OO00OO

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final String f9138o00oOo00;
        @o0OO00OO

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public ArrayList<Uri> f9139o00oOo0O;
        @o0OO00OO

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final ComponentName f9140o00oOooO;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public o00oOo00(@oo0oO0 Activity activity) {
            this(activity, activity.getIntent());
            activity.getClass();
        }

        @oo0oO0
        @Deprecated
        public static o00oOo00 o00oOOo0(@oo0oO0 Activity activity) {
            return new o00oOo00(activity);
        }

        public static void o00oo0o(StringBuilder sb, CharSequence charSequence, int i, int i2) {
            String str;
            while (i < i2) {
                char charAt = charSequence.charAt(i);
                if (charAt == '<') {
                    str = "&lt;";
                } else if (charAt == '>') {
                    str = "&gt;";
                } else if (charAt == '&') {
                    str = "&amp;";
                } else if (charAt > '~' || charAt < ' ') {
                    sb.append("&#");
                    sb.append((int) charAt);
                    str = ";";
                } else {
                    if (charAt == ' ') {
                        while (true) {
                            int i3 = i + 1;
                            if (i3 >= i2 || charSequence.charAt(i3) != ' ') {
                                break;
                            }
                            sb.append("&nbsp;");
                            i = i3;
                        }
                        sb.append(' ');
                    } else {
                        sb.append(charAt);
                    }
                    i++;
                }
                sb.append(str);
                i++;
            }
        }

        @o0OO00OO
        public ComponentName o00oOOoO() {
            return this.f9140o00oOooO;
        }

        @o0OO00OO
        public Drawable o00oOo00() {
            if (this.f9140o00oOooO == null) {
                return null;
            }
            try {
                return this.f9136o00oOOo0.getPackageManager().getActivityIcon(this.f9140o00oOooO);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @o0OO00OO
        public CharSequence o00oOo0O() {
            if (this.f9138o00oOo00 == null) {
                return null;
            }
            PackageManager packageManager = this.f9136o00oOOo0.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f9138o00oOo00, 0));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @o0OO00OO
        public String o00oOo0o() {
            return this.f9138o00oOo00;
        }

        @o0OO00OO
        public String[] o00oOoO() {
            return this.f9137o00oOOoO.getStringArrayExtra("android.intent.extra.CC");
        }

        @o0OO00OO
        public String[] o00oOoO0() {
            return this.f9137o00oOOoO.getStringArrayExtra("android.intent.extra.BCC");
        }

        @o0OO00OO
        public String[] o00oOoOO() {
            return this.f9137o00oOOoO.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @o0OO00OO
        public String o00oOoOo() {
            String stringExtra = this.f9137o00oOOoO.getStringExtra(o0O000.f9572o00oOOoO);
            if (stringExtra == null) {
                CharSequence o00oo0OO2 = o00oo0OO();
                return o00oo0OO2 instanceof Spanned ? Html.toHtml((Spanned) o00oo0OO2) : o00oo0OO2 != null ? o00oOOo0.o00oOOo0(o00oo0OO2) : stringExtra;
            }
            return stringExtra;
        }

        @o0OO00OO
        public Uri o00oOoo0() {
            return (Uri) this.f9137o00oOOoO.getParcelableExtra("android.intent.extra.STREAM");
        }

        @o0OO00OO
        public Drawable o00oOooO() {
            if (this.f9138o00oOo00 == null) {
                return null;
            }
            try {
                return this.f9136o00oOOo0.getPackageManager().getApplicationIcon(this.f9138o00oOo00);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @o0OO00OO
        public Uri o00oOooo(int i) {
            Object parcelableExtra;
            if (this.f9139o00oOo0O == null && o00oo0O()) {
                this.f9139o00oOo0O = this.f9137o00oOOoO.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f9139o00oOo0O;
            if (arrayList != null) {
                parcelableExtra = arrayList.get(i);
            } else if (i != 0) {
                StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Stream items available: ");
                o00oOOo02.append(o00oo00O());
                o00oOOo02.append(" index requested: ");
                o00oOOo02.append(i);
                throw new IndexOutOfBoundsException(o00oOOo02.toString());
            } else {
                parcelableExtra = this.f9137o00oOOoO.getParcelableExtra("android.intent.extra.STREAM");
            }
            return (Uri) parcelableExtra;
        }

        @o0OO00OO
        public String o00oo0() {
            return this.f9137o00oOOoO.getStringExtra("android.intent.extra.SUBJECT");
        }

        public int o00oo00O() {
            if (this.f9139o00oOo0O == null && o00oo0O()) {
                this.f9139o00oOo0O = this.f9137o00oOOoO.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f9139o00oOo0O;
            return arrayList != null ? arrayList.size() : this.f9137o00oOOoO.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        public boolean o00oo0O() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f9137o00oOOoO.getAction());
        }

        @o0OO00OO
        public String o00oo0O0() {
            return this.f9137o00oOOoO.getType();
        }

        @o0OO00OO
        public CharSequence o00oo0OO() {
            return this.f9137o00oOOoO.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        public boolean o00oo0Oo() {
            String action = this.f9137o00oOOoO.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        public boolean o00oo0o0() {
            return "android.intent.action.SEND".equals(this.f9137o00oOOoO.getAction());
        }

        public o00oOo00(@oo0oO0 Context context, @oo0oO0 Intent intent) {
            context.getClass();
            this.f9136o00oOOo0 = context;
            intent.getClass();
            this.f9137o00oOOoO = intent;
            this.f9138o00oOo00 = oO0OO0O.o00oOo0o(intent);
            this.f9140o00oOooO = oO0OO0O.o00oOooO(intent);
        }
    }
}
