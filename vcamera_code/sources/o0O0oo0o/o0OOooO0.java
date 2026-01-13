package o0O0oo0o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o0OOooO0 {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f12808o00oOo0o = "LocalBroadcastManager";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f12809o00oOoO = 1;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final boolean f12810o00oOoO0 = false;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final Object f12811o00oOoOO = new Object();

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static o0OOooO0 f12812o00oOoOo;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f12813o00oOOo0;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final Handler f12816o00oOo0O;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<o00oOo00>> f12814o00oOOoO = new HashMap<>();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final HashMap<String, ArrayList<o00oOo00>> f12815o00oOo00 = new HashMap<>();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final ArrayList<o00oOOoO> f12817o00oOooO = new ArrayList<>();

    /* loaded from: classes.dex */
    public class o00oOOo0 extends Handler {
        public o00oOOo0(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                o0OOooO0.this.o00oOOo0();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Intent f12819o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final ArrayList<o00oOo00> f12820o00oOOoO;

        public o00oOOoO(Intent intent, ArrayList<o00oOo00> arrayList) {
            this.f12819o00oOOo0 = intent;
            this.f12820o00oOOoO = arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final IntentFilter f12821o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final BroadcastReceiver f12822o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f12823o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f12824o00oOooO;

        public o00oOo00(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f12821o00oOOo0 = intentFilter;
            this.f12822o00oOOoO = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f12822o00oOOoO);
            sb.append(" filter=");
            sb.append(this.f12821o00oOOo0);
            if (this.f12824o00oOooO) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public o0OOooO0(Context context) {
        this.f12813o00oOOo0 = context;
        this.f12816o00oOo0O = new o00oOOo0(context.getMainLooper());
    }

    @oo0oO0
    public static o0OOooO0 o00oOOoO(@oo0oO0 Context context) {
        o0OOooO0 o0ooooo0;
        synchronized (f12811o00oOoOO) {
            if (f12812o00oOoOo == null) {
                f12812o00oOoOo = new o0OOooO0(context.getApplicationContext());
            }
            o0ooooo0 = f12812o00oOoOo;
        }
        return o0ooooo0;
    }

    public void o00oOOo0() {
        int size;
        o00oOOoO[] o00oooooArr;
        while (true) {
            synchronized (this.f12814o00oOOoO) {
                size = this.f12817o00oOooO.size();
                if (size <= 0) {
                    return;
                }
                o00oooooArr = new o00oOOoO[size];
                this.f12817o00oOooO.toArray(o00oooooArr);
                this.f12817o00oOooO.clear();
            }
            for (int i = 0; i < size; i++) {
                o00oOOoO o00ooooo2 = o00oooooArr[i];
                int size2 = o00ooooo2.f12820o00oOOoO.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    o00oOo00 o00ooo002 = o00ooooo2.f12820o00oOOoO.get(i2);
                    if (!o00ooo002.f12824o00oOooO) {
                        o00ooo002.f12822o00oOOoO.onReceive(this.f12813o00oOOo0, o00ooooo2.f12819o00oOOo0);
                    }
                }
            }
        }
    }

    public void o00oOo00(@oo0oO0 BroadcastReceiver broadcastReceiver, @oo0oO0 IntentFilter intentFilter) {
        synchronized (this.f12814o00oOOoO) {
            o00oOo00 o00ooo002 = new o00oOo00(intentFilter, broadcastReceiver);
            ArrayList<o00oOo00> arrayList = this.f12814o00oOOoO.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f12814o00oOOoO.put(broadcastReceiver, arrayList);
            }
            arrayList.add(o00ooo002);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<o00oOo00> arrayList2 = this.f12815o00oOo00.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f12815o00oOo00.put(action, arrayList2);
                }
                arrayList2.add(o00ooo002);
            }
        }
    }

    public void o00oOo0O(@oo0oO0 Intent intent) {
        if (o00oOooO(intent)) {
            o00oOOo0();
        }
    }

    public void o00oOo0o(@oo0oO0 BroadcastReceiver broadcastReceiver) {
        synchronized (this.f12814o00oOOoO) {
            ArrayList<o00oOo00> remove = this.f12814o00oOOoO.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                o00oOo00 o00ooo002 = remove.get(size);
                o00ooo002.f12824o00oOooO = true;
                for (int i = 0; i < o00ooo002.f12821o00oOOo0.countActions(); i++) {
                    String action = o00ooo002.f12821o00oOOo0.getAction(i);
                    ArrayList<o00oOo00> arrayList = this.f12815o00oOo00.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            o00oOo00 o00ooo003 = arrayList.get(size2);
                            if (o00ooo003.f12822o00oOOoO == broadcastReceiver) {
                                o00ooo003.f12824o00oOooO = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f12815o00oOo00.remove(action);
                        }
                    }
                }
            }
        }
    }

    public boolean o00oOooO(@oo0oO0 Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList<o00oOo00> arrayList2;
        String str2;
        boolean z;
        synchronized (this.f12814o00oOOoO) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f12813o00oOOo0.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z2 = true;
            boolean z3 = (intent.getFlags() & 8) != 0;
            if (z3) {
                intent.toString();
            }
            ArrayList<o00oOo00> arrayList3 = this.f12815o00oOo00.get(intent.getAction());
            if (arrayList3 != null) {
                if (z3) {
                    arrayList3.toString();
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    o00oOo00 o00ooo002 = arrayList3.get(i2);
                    if (z3) {
                        Objects.toString(o00ooo002.f12821o00oOOo0);
                    }
                    if (o00ooo002.f12823o00oOo00) {
                        i = i2;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                        z = z2;
                    } else {
                        IntentFilter intentFilter = o00ooo002.f12821o00oOOo0;
                        String str3 = action;
                        String str4 = resolveTypeIfNeeded;
                        i = i2;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        z = z2;
                        int match = intentFilter.match(str3, str4, scheme, data, categories, f12808o00oOo0o);
                        if (match >= 0) {
                            if (z3) {
                                Integer.toHexString(match);
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(o00ooo002);
                            o00ooo002.f12823o00oOo00 = z;
                            i2 = i + 1;
                            z2 = z;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        }
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    z2 = z;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                boolean z4 = z2;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((o00oOo00) arrayList5.get(i3)).f12823o00oOo00 = false;
                    }
                    this.f12817o00oOooO.add(new o00oOOoO(intent, arrayList5));
                    if (!this.f12816o00oOo0O.hasMessages(z4 ? 1 : 0)) {
                        this.f12816o00oOo0O.sendEmptyMessage(z4 ? 1 : 0);
                    }
                    return z4;
                }
            }
            return false;
        }
    }
}
