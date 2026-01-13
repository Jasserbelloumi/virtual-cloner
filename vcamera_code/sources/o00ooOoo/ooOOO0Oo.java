package o00ooOoo;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.media.o00oOo0O;
import androidx.core.graphics.drawable.IconCompat;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class ooOOO0Oo {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f9508o00oOoO = "icon";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f9509o00oOoO0 = "name";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f9510o00oOoOO = "uri";

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f9511o00oOoOo = "key";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f9512o00oOoo0 = "isBot";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f9513o00oOooo = "isImportant";
    @o0OO00OO

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public CharSequence f9514o00oOOo0;
    @o0OO00OO

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public IconCompat f9515o00oOOoO;
    @o0OO00OO

    /* renamed from: o00oOo00  reason: collision with root package name */
    public String f9516o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public boolean f9517o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f9518o00oOo0o;
    @o0OO00OO

    /* renamed from: o00oOooO  reason: collision with root package name */
    public String f9519o00oOooO;

    @o0OOooO0(22)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static ooOOO0Oo o00oOOo0(PersistableBundle persistableBundle) {
            o00oOo00 o00ooo002 = new o00oOo00();
            o00ooo002.f9520o00oOOo0 = persistableBundle.getString("name");
            o00ooo002.f9522o00oOo00 = persistableBundle.getString("uri");
            o00ooo002.f9525o00oOooO = persistableBundle.getString("key");
            o00ooo002.f9523o00oOo0O = persistableBundle.getBoolean(ooOOO0Oo.f9512o00oOoo0);
            o00ooo002.f9524o00oOo0o = persistableBundle.getBoolean(ooOOO0Oo.f9513o00oOooo);
            return new ooOOO0Oo(o00ooo002);
        }

        @o0O0O0Oo
        public static PersistableBundle o00oOOoO(ooOOO0Oo ooooo0oo) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = ooooo0oo.f9514o00oOOo0;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", ooooo0oo.f9516o00oOo00);
            persistableBundle.putString("key", ooooo0oo.f9519o00oOooO);
            persistableBundle.putBoolean(ooOOO0Oo.f9512o00oOoo0, ooooo0oo.f9517o00oOo0O);
            persistableBundle.putBoolean(ooOOO0Oo.f9513o00oOooo, ooooo0oo.f9518o00oOo0o);
            return persistableBundle;
        }
    }

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static ooOOO0Oo o00oOOo0(Person person) {
            o00oOo00 o00ooo002 = new o00oOo00();
            o00ooo002.f9520o00oOOo0 = person.getName();
            o00ooo002.f9521o00oOOoO = person.getIcon() != null ? IconCompat.o00oOooo(person.getIcon()) : null;
            o00ooo002.f9522o00oOo00 = person.getUri();
            o00ooo002.f9525o00oOooO = person.getKey();
            o00ooo002.f9523o00oOo0O = person.isBot();
            o00ooo002.f9524o00oOo0o = person.isImportant();
            return new ooOOO0Oo(o00ooo002);
        }

        @o0O0O0Oo
        public static Person o00oOOoO(ooOOO0Oo ooooo0oo) {
            return new Person.Builder().setName(ooooo0oo.o00oOo0o()).setIcon(ooooo0oo.o00oOooO() != null ? ooooo0oo.o00oOooO().o00ooo0() : null).setUri(ooooo0oo.o00oOoO0()).setKey(ooooo0oo.o00oOo0O()).setBot(ooooo0oo.o00oOoO()).setImportant(ooooo0oo.o00oOoOO()).build();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0OO00OO

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public CharSequence f9520o00oOOo0;
        @o0OO00OO

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public IconCompat f9521o00oOOoO;
        @o0OO00OO

        /* renamed from: o00oOo00  reason: collision with root package name */
        public String f9522o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public boolean f9523o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public boolean f9524o00oOo0o;
        @o0OO00OO

        /* renamed from: o00oOooO  reason: collision with root package name */
        public String f9525o00oOooO;

        public o00oOo00() {
        }

        public o00oOo00(ooOOO0Oo ooooo0oo) {
            this.f9520o00oOOo0 = ooooo0oo.f9514o00oOOo0;
            this.f9521o00oOOoO = ooooo0oo.f9515o00oOOoO;
            this.f9522o00oOo00 = ooooo0oo.f9516o00oOo00;
            this.f9525o00oOooO = ooooo0oo.f9519o00oOooO;
            this.f9523o00oOo0O = ooooo0oo.f9517o00oOo0O;
            this.f9524o00oOo0o = ooooo0oo.f9518o00oOo0o;
        }

        @oo0oO0
        public ooOOO0Oo o00oOOo0() {
            return new ooOOO0Oo(this);
        }

        @oo0oO0
        public o00oOo00 o00oOOoO(boolean z) {
            this.f9523o00oOo0O = z;
            return this;
        }

        @oo0oO0
        public o00oOo00 o00oOo00(@o0OO00OO IconCompat iconCompat) {
            this.f9521o00oOOoO = iconCompat;
            return this;
        }

        @oo0oO0
        public o00oOo00 o00oOo0O(@o0OO00OO String str) {
            this.f9525o00oOooO = str;
            return this;
        }

        @oo0oO0
        public o00oOo00 o00oOo0o(@o0OO00OO CharSequence charSequence) {
            this.f9520o00oOOo0 = charSequence;
            return this;
        }

        @oo0oO0
        public o00oOo00 o00oOoO0(@o0OO00OO String str) {
            this.f9522o00oOo00 = str;
            return this;
        }

        @oo0oO0
        public o00oOo00 o00oOooO(boolean z) {
            this.f9524o00oOo0o = z;
            return this;
        }
    }

    public ooOOO0Oo(o00oOo00 o00ooo002) {
        this.f9514o00oOOo0 = o00ooo002.f9520o00oOOo0;
        this.f9515o00oOOoO = o00ooo002.f9521o00oOOoO;
        this.f9516o00oOo00 = o00ooo002.f9522o00oOo00;
        this.f9519o00oOooO = o00ooo002.f9525o00oOooO;
        this.f9517o00oOo0O = o00ooo002.f9523o00oOo0O;
        this.f9518o00oOo0o = o00ooo002.f9524o00oOo0o;
    }

    @o0OOooO0(28)
    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static ooOOO0Oo o00oOOo0(@oo0oO0 Person person) {
        return o00oOOoO.o00oOOo0(person);
    }

    @oo0oO0
    public static ooOOO0Oo o00oOOoO(@oo0oO0 Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        o00oOo00 o00ooo002 = new o00oOo00();
        o00ooo002.f9520o00oOOo0 = bundle.getCharSequence("name");
        o00ooo002.f9521o00oOOoO = bundle2 != null ? IconCompat.o00oOoOo(bundle2) : null;
        o00ooo002.f9522o00oOo00 = bundle.getString("uri");
        o00ooo002.f9525o00oOooO = bundle.getString("key");
        o00ooo002.f9523o00oOo0O = bundle.getBoolean(f9512o00oOoo0);
        o00ooo002.f9524o00oOo0o = bundle.getBoolean(f9513o00oOooo);
        return new ooOOO0Oo(o00ooo002);
    }

    @o0OOooO0(22)
    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static ooOOO0Oo o00oOo00(@oo0oO0 PersistableBundle persistableBundle) {
        return o00oOOo0.o00oOOo0(persistableBundle);
    }

    @o0OO00OO
    public String o00oOo0O() {
        return this.f9519o00oOooO;
    }

    @o0OO00OO
    public CharSequence o00oOo0o() {
        return this.f9514o00oOOo0;
    }

    public boolean o00oOoO() {
        return this.f9517o00oOo0O;
    }

    @o0OO00OO
    public String o00oOoO0() {
        return this.f9516o00oOo00;
    }

    public boolean o00oOoOO() {
        return this.f9518o00oOo0o;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public String o00oOoOo() {
        String str = this.f9516o00oOo00;
        if (str != null) {
            return str;
        }
        if (this.f9514o00oOOo0 != null) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("name:");
            o00oOOo02.append((Object) this.f9514o00oOOo0);
            return o00oOOo02.toString();
        }
        return "";
    }

    @o0OOooO0(28)
    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public Person o00oOoo0() {
        return o00oOOoO.o00oOOoO(this);
    }

    @o0OO00OO
    public IconCompat o00oOooO() {
        return this.f9515o00oOOoO;
    }

    @oo0oO0
    public o00oOo00 o00oOooo() {
        return new o00oOo00(this);
    }

    @o0OOooO0(22)
    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PersistableBundle o00oo0() {
        return o00oOOo0.o00oOOoO(this);
    }

    @oo0oO0
    public Bundle o00oo00O() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f9514o00oOOo0);
        IconCompat iconCompat = this.f9515o00oOOoO;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.o00ooo00() : null);
        bundle.putString("uri", this.f9516o00oOo00);
        bundle.putString("key", this.f9519o00oOooO);
        bundle.putBoolean(f9512o00oOoo0, this.f9517o00oOo0O);
        bundle.putBoolean(f9513o00oOooo, this.f9518o00oOo0o);
        return bundle;
    }
}
