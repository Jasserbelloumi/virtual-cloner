package o0OOOoo0;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import o0OO0oO.o00oOo00;
import o0OO0oO.o0O00O0o;
import o0OO0oO.o0O0oo0o;
import o0OOO0OO.o00ooO0;
import o0OOOO.o00oo;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import o0OOOo0o.o0O0O0Oo;
import o0OOOoO0.ooOOOOoo;
import o0OOOoo0.oO00o00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class oO0OOO00 implements oO00o00 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Matcher f13894o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final CharSequence f13895o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final oOOoOOO0 f13896o00oOo00;
    @Nullable

    /* renamed from: o00oOooO  reason: collision with root package name */
    public List<String> f13897o00oOooO;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o00oOo00<String> {
        public o00oOOo0() {
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
        public int getSize() {
            return oO0OOO00.this.f13894o00oOOo0.groupCount() + 1;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }

        public /* bridge */ boolean o00oOOo0(String str) {
            return super.contains(str);
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        @NotNull
        /* renamed from: o00oOOoO */
        public String get(int i) {
            String group = oO0OOO00.this.f13894o00oOOo0.group(i);
            return group == null ? "" : group;
        }

        public /* bridge */ int o00oOo00(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int o00oOooO(String str) {
            return super.lastIndexOf(str);
        }
    }

    public oO0OOO00(@NotNull Matcher matcher, @NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(matcher, "matcher");
        o0ooO.o00oo0O0(charSequence, "input");
        this.f13894o00oOOo0 = matcher;
        this.f13895o00oOOoO = charSequence;
        this.f13896o00oOo00 = new o00oOOoO();
    }

    public static final MatchResult o00oOo0O(oO0OOO00 oo0ooo00) {
        return oo0ooo00.f13894o00oOOo0;
    }

    @Override // o0OOOoo0.oO00o00
    @NotNull
    public String getValue() {
        String group = this.f13894o00oOOo0.group();
        o0ooO.o00oo0OO(group, "matchResult.group()");
        return group;
    }

    @Override // o0OOOoo0.oO00o00
    @Nullable
    public oO00o00 next() {
        int end = this.f13894o00oOOo0.end() + (this.f13894o00oOOo0.end() == this.f13894o00oOOo0.start() ? 1 : 0);
        if (end <= this.f13895o00oOOoO.length()) {
            Matcher matcher = this.f13894o00oOOo0.pattern().matcher(this.f13895o00oOOoO);
            o0ooO.o00oo0OO(matcher, "matcher.pattern().matcher(input)");
            return oO00o0.o00oOo0o(matcher, end, this.f13895o00oOOoO);
        }
        return null;
    }

    @Override // o0OOOoo0.oO00o00
    @NotNull
    public oO00o00.o00oOOoO o00oOOo0() {
        return new oO00o00.o00oOOoO(this);
    }

    @Override // o0OOOoo0.oO00o00
    @NotNull
    public List<String> o00oOOoO() {
        if (this.f13897o00oOooO == null) {
            this.f13897o00oOooO = new o00oOOo0();
        }
        List<String> list = this.f13897o00oOooO;
        o0ooO.o00oo00O(list);
        return list;
    }

    @Override // o0OOOoo0.oO00o00
    @NotNull
    public o0O0O0Oo o00oOo00() {
        return oO00o0.o00oOoOO(this.f13894o00oOOo0);
    }

    public final MatchResult o00oOo0o() {
        return this.f13894o00oOOo0;
    }

    @Override // o0OOOoo0.oO00o00
    @NotNull
    public oOOoOOO0 o00oOooO() {
        return this.f13896o00oOo00;
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0OO0oO.o00oOOo0<oO00Oo0> implements oO00o000 {

        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0O0OO implements o00oo<Integer, oO00Oo0> {
            public o00oOOo0() {
                super(1);
            }

            @Override // o0OOOO.o00oo
            public /* bridge */ /* synthetic */ oO00Oo0 invoke(Integer num) {
                return invoke(num.intValue());
            }

            @Nullable
            public final oO00Oo0 invoke(int i) {
                return o00oOOoO.this.get(i);
            }
        }

        public o00oOOoO() {
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof oO00Oo0) {
                return super.contains((oO00Oo0) obj);
            }
            return false;
        }

        @Override // o0OOOoo0.oOOoOOO0
        @Nullable
        public oO00Oo0 get(int i) {
            o0O0O0Oo o00oOoOo2 = oO00o0.o00oOoOo(oO0OOO00.this.f13894o00oOOo0, i);
            if (o00oOoOo2.o00oOOo0().intValue() >= 0) {
                String group = oO0OOO00.this.f13894o00oOOo0.group(i);
                o0ooO.o00oo0OO(group, "matchResult.group(index)");
                return new oO00Oo0(group, o00oOoOo2);
            }
            return null;
        }

        @Override // o0OO0oO.o00oOOo0
        public int getSize() {
            return oO0OOO00.this.f13894o00oOOo0.groupCount() + 1;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<oO00Oo0> iterator() {
            return ooOOOOoo.o0O0o0o0(o0O0oo0o.o0O0oOO0(o0O00O0o.o00ooOo0(this)), new o00oOOo0()).iterator();
        }

        public /* bridge */ boolean o00oOOo0(oO00Oo0 oo00oo0) {
            return super.contains(oo00oo0);
        }

        @Override // o0OOOoo0.oO00o000
        @Nullable
        public oO00Oo0 get(@NotNull String str) {
            o0ooO.o00oo0O0(str, "name");
            return o00ooO0.f13445o00oOOo0.o00oOo00(oO0OOO00.this.f13894o00oOOo0, str);
        }
    }
}
