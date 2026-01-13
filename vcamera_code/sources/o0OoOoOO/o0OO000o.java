package o0OoOoOO;

import android.text.SpannableStringBuilder;
import com.google.common.base.Ascii;
import java.util.Locale;
import o0OOOoo0.oOo0oooO;
/* loaded from: classes.dex */
public final class o0OO000o {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final char f16809o00oOo0O = 8234;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final char f16810o00oOo0o = 8235;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final char f16811o00oOoO = 8206;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final char f16812o00oOoO0 = 8236;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final char f16813o00oOoOO = 8207;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f16814o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f16815o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final o0OO0o f16816o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f16817o00oOooo = "";

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f16818o00oo0 = 2;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f16819o00oo00O = 2;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f16820o00oo0O = -1;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final o0OO000o f16821o00oo0O0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final o0OO000o f16822o00oo0OO;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f16823o00oo0Oo = 0;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f16824o00oo0o0 = 1;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final boolean f16825o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final int f16826o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0OO0o f16827o00oOo00;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f16828o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f16829o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public o0OO0o f16830o00oOo00;

        public o00oOOo0() {
            o00oOo00(o0OO000o.o00oOoOo(Locale.getDefault()));
        }

        public o00oOOo0(Locale locale) {
            o00oOo00(o0OO000o.o00oOoOo(locale));
        }

        public o00oOOo0(boolean z) {
            o00oOo00(z);
        }

        public static o0OO000o o00oOOoO(boolean z) {
            return z ? o0OO000o.f16821o00oo0O0 : o0OO000o.f16822o00oo0OO;
        }

        public o0OO000o o00oOOo0() {
            return (this.f16829o00oOOoO == 2 && this.f16830o00oOo00 == o0OO000o.f16816o00oOooO) ? o00oOOoO(this.f16828o00oOOo0) : new o0OO000o(this.f16828o00oOOo0, this.f16829o00oOOoO, this.f16830o00oOo00);
        }

        public final void o00oOo00(boolean z) {
            this.f16828o00oOOo0 = z;
            this.f16830o00oOo00 = o0OO000o.f16816o00oOooO;
            this.f16829o00oOOoO = 2;
        }

        public o00oOOo0 o00oOo0O(boolean z) {
            this.f16829o00oOOoO = z ? this.f16829o00oOOoO | 2 : this.f16829o00oOOoO & (-3);
            return this;
        }

        public o00oOOo0 o00oOooO(o0OO0o o0oo0o) {
            this.f16830o00oOo00 = o0oo0o;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f16831o00oOo0o = 1792;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final byte[] f16832o00oOoO0 = new byte[f16831o00oOo0o];

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final CharSequence f16833o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final boolean f16834o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f16835o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public char f16836o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f16837o00oOooO;

        static {
            for (int i = 0; i < 1792; i++) {
                f16832o00oOoO0[i] = Character.getDirectionality(i);
            }
        }

        public o00oOOoO(CharSequence charSequence, boolean z) {
            this.f16833o00oOOo0 = charSequence;
            this.f16834o00oOOoO = z;
            this.f16835o00oOo00 = charSequence.length();
        }

        public static byte o00oOo00(char c) {
            return c < 1792 ? f16832o00oOoO0[c] : Character.getDirectionality(c);
        }

        public byte o00oOOo0() {
            char charAt = this.f16833o00oOOo0.charAt(this.f16837o00oOooO - 1);
            this.f16836o00oOo0O = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f16833o00oOOo0, this.f16837o00oOooO);
                this.f16837o00oOooO -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f16837o00oOooO--;
            byte o00oOo002 = o00oOo00(this.f16836o00oOo0O);
            if (this.f16834o00oOOoO) {
                char c = this.f16836o00oOo0O;
                return c == '>' ? o00oOoO() : c == ';' ? o00oOo0o() : o00oOo002;
            }
            return o00oOo002;
        }

        public byte o00oOOoO() {
            char charAt = this.f16833o00oOOo0.charAt(this.f16837o00oOooO);
            this.f16836o00oOo0O = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f16833o00oOOo0, this.f16837o00oOooO);
                this.f16837o00oOooO = Character.charCount(codePointAt) + this.f16837o00oOooO;
                return Character.getDirectionality(codePointAt);
            }
            this.f16837o00oOooO++;
            byte o00oOo002 = o00oOo00(this.f16836o00oOo0O);
            if (this.f16834o00oOOoO) {
                char c = this.f16836o00oOo0O;
                return c == '<' ? o00oOoOO() : c == '&' ? o00oOoO0() : o00oOo002;
            }
            return o00oOo002;
        }

        public int o00oOo0O() {
            this.f16837o00oOooO = this.f16835o00oOo00;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.f16837o00oOooO > 0) {
                    byte o00oOOo02 = o00oOOo0();
                    if (o00oOOo02 != 0) {
                        if (o00oOOo02 == 1 || o00oOOo02 == 2) {
                            if (i == 0) {
                                return 1;
                            }
                            if (i2 == 0) {
                                break;
                            }
                        } else if (o00oOOo02 != 9) {
                            switch (o00oOOo02) {
                                case 14:
                                case 15:
                                    if (i2 == i) {
                                        return -1;
                                    }
                                    i--;
                                    break;
                                case 16:
                                case 17:
                                    if (i2 == i) {
                                        return 1;
                                    }
                                    i--;
                                    break;
                                case 18:
                                    i++;
                                    break;
                                default:
                                    if (i2 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else if (i == 0) {
                        return -1;
                    } else {
                        if (i2 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }

        public final byte o00oOo0o() {
            char charAt;
            int i = this.f16837o00oOooO;
            do {
                int i2 = this.f16837o00oOooO;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f16833o00oOOo0;
                int i3 = i2 - 1;
                this.f16837o00oOooO = i3;
                charAt = charSequence.charAt(i3);
                this.f16836o00oOo0O = charAt;
                if (charAt == '&') {
                    return Ascii.FF;
                }
            } while (charAt != ';');
            this.f16837o00oOooO = i;
            this.f16836o00oOo0O = ';';
            return Ascii.CR;
        }

        public final byte o00oOoO() {
            char charAt;
            int i = this.f16837o00oOooO;
            while (true) {
                int i2 = this.f16837o00oOooO;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f16833o00oOOo0;
                int i3 = i2 - 1;
                this.f16837o00oOooO = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f16836o00oOo0O = charAt2;
                if (charAt2 == '<') {
                    return Ascii.FF;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f16837o00oOooO;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.f16833o00oOOo0;
                            int i5 = i4 - 1;
                            this.f16837o00oOooO = i5;
                            charAt = charSequence2.charAt(i5);
                            this.f16836o00oOo0O = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f16837o00oOooO = i;
            this.f16836o00oOo0O = oOo0oooO.f13906o00oOo0o;
            return Ascii.CR;
        }

        public final byte o00oOoO0() {
            char charAt;
            do {
                int i = this.f16837o00oOooO;
                if (i >= this.f16835o00oOo00) {
                    return Ascii.FF;
                }
                CharSequence charSequence = this.f16833o00oOOo0;
                this.f16837o00oOooO = i + 1;
                charAt = charSequence.charAt(i);
                this.f16836o00oOo0O = charAt;
            } while (charAt != ';');
            return Ascii.FF;
        }

        public final byte o00oOoOO() {
            char charAt;
            int i = this.f16837o00oOooO;
            while (true) {
                int i2 = this.f16837o00oOooO;
                if (i2 >= this.f16835o00oOo00) {
                    this.f16837o00oOooO = i;
                    this.f16836o00oOo0O = oOo0oooO.f13905o00oOo0O;
                    return Ascii.CR;
                }
                CharSequence charSequence = this.f16833o00oOOo0;
                this.f16837o00oOooO = i2 + 1;
                char charAt2 = charSequence.charAt(i2);
                this.f16836o00oOo0O = charAt2;
                if (charAt2 == '>') {
                    return Ascii.FF;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i3 = this.f16837o00oOooO;
                        if (i3 < this.f16835o00oOo00) {
                            CharSequence charSequence2 = this.f16833o00oOOo0;
                            this.f16837o00oOooO = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f16836o00oOo0O = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }

        public int o00oOooO() {
            this.f16837o00oOooO = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f16837o00oOooO < this.f16835o00oOo00 && i == 0) {
                byte o00oOOoO2 = o00oOOoO();
                if (o00oOOoO2 != 0) {
                    if (o00oOOoO2 == 1 || o00oOOoO2 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (o00oOOoO2 != 9) {
                        switch (o00oOOoO2) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f16837o00oOooO > 0) {
                switch (o00oOOo0()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }
    }

    static {
        o0OO0o o0oo0o = o0OO0oO0.f16864o00oOo00;
        f16816o00oOooO = o0oo0o;
        f16814o00oOoOo = Character.toString(f16811o00oOoO);
        f16815o00oOoo0 = Character.toString(f16813o00oOoOO);
        f16822o00oo0OO = new o0OO000o(false, 2, o0oo0o);
        f16821o00oo0O0 = new o0OO000o(true, 2, o0oo0o);
    }

    public o0OO000o(boolean z, int i, o0OO0o o0oo0o) {
        this.f16825o00oOOo0 = z;
        this.f16826o00oOOoO = i;
        this.f16827o00oOo00 = o0oo0o;
    }

    public static int o00oOOo0(CharSequence charSequence) {
        return new o00oOOoO(charSequence, false).o00oOooO();
    }

    public static int o00oOOoO(CharSequence charSequence) {
        return new o00oOOoO(charSequence, false).o00oOo0O();
    }

    public static o0OO000o o00oOo00() {
        return new o00oOOo0().o00oOOo0();
    }

    public static o0OO000o o00oOo0O(boolean z) {
        return new o00oOOo0(z).o00oOOo0();
    }

    public static boolean o00oOoOo(Locale locale) {
        return o0OO0oO.o00oOOoO(locale) == 1;
    }

    public static o0OO000o o00oOooO(Locale locale) {
        return new o00oOOo0(locale).o00oOOo0();
    }

    public boolean o00oOo0o() {
        return (this.f16826o00oOOoO & 2) != 0;
    }

    public boolean o00oOoO(String str) {
        return o00oOoO0(str);
    }

    public boolean o00oOoO0(CharSequence charSequence) {
        return this.f16827o00oOo00.isRtl(charSequence, 0, charSequence.length());
    }

    public boolean o00oOoOO() {
        return this.f16825o00oOOo0;
    }

    public final String o00oOoo0(CharSequence charSequence, o0OO0o o0oo0o) {
        boolean isRtl = o0oo0o.isRtl(charSequence, 0, charSequence.length());
        return (this.f16825o00oOOo0 || !(isRtl || o00oOOoO(charSequence) == 1)) ? this.f16825o00oOOo0 ? (!isRtl || o00oOOoO(charSequence) == -1) ? f16815o00oOoo0 : "" : "" : f16814o00oOoOo;
    }

    public final String o00oOooo(CharSequence charSequence, o0OO0o o0oo0o) {
        boolean isRtl = o0oo0o.isRtl(charSequence, 0, charSequence.length());
        return (this.f16825o00oOOo0 || !(isRtl || o00oOOo0(charSequence) == 1)) ? this.f16825o00oOOo0 ? (!isRtl || o00oOOo0(charSequence) == -1) ? f16815o00oOoo0 : "" : "" : f16814o00oOoOo;
    }

    public CharSequence o00oo0(CharSequence charSequence, o0OO0o o0oo0o) {
        return o00oo0OO(charSequence, o0oo0o, true);
    }

    public CharSequence o00oo00O(CharSequence charSequence) {
        return o00oo0OO(charSequence, this.f16827o00oOo00, true);
    }

    public String o00oo0O(String str) {
        return o00oo0o0(str, this.f16827o00oOo00, true);
    }

    public CharSequence o00oo0O0(CharSequence charSequence, boolean z) {
        return o00oo0OO(charSequence, this.f16827o00oOo00, z);
    }

    public CharSequence o00oo0OO(CharSequence charSequence, o0OO0o o0oo0o, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = o0oo0o.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (o00oOo0o() && z) {
            spannableStringBuilder.append((CharSequence) o00oOooo(charSequence, isRtl ? o0OO0oO0.f16863o00oOOoO : o0OO0oO0.f16862o00oOOo0));
        }
        if (isRtl != this.f16825o00oOOo0) {
            spannableStringBuilder.append(isRtl ? f16810o00oOo0o : f16809o00oOo0O);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f16812o00oOoO0);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) o00oOoo0(charSequence, isRtl ? o0OO0oO0.f16863o00oOOoO : o0OO0oO0.f16862o00oOOo0));
        }
        return spannableStringBuilder;
    }

    public String o00oo0Oo(String str, o0OO0o o0oo0o) {
        return o00oo0o0(str, o0oo0o, true);
    }

    public String o00oo0o(String str, boolean z) {
        return o00oo0o0(str, this.f16827o00oOo00, z);
    }

    public String o00oo0o0(String str, o0OO0o o0oo0o, boolean z) {
        if (str == null) {
            return null;
        }
        return o00oo0OO(str, o0oo0o, z).toString();
    }
}
