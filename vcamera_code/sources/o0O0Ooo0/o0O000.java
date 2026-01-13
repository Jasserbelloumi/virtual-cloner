package o0O0Ooo0;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0O00OO;
/* loaded from: classes.dex */
public final class o0O000 extends o0O00OO {

    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0O00OO.o00oOOo0<o00oOOo0, o0O000> {
        public o00oOOo0(@oo0oO0 Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f12193o00oOo00.f12472o00oOooO = OverwritingInputMerger.class.getName();
        }

        @Override // o0O0Ooo0.o0O00OO.o00oOOo0
        @oo0oO0
        public o00oOOo0 o00oOooO() {
            return this;
        }

        @Override // o0O0Ooo0.o0O00OO.o00oOOo0
        @oo0oO0
        /* renamed from: o00oo0Oo */
        public o0O000 o00oOo00() {
            if (this.f12191o00oOOo0 && this.f12193o00oOo00.f12470o00oOoOo.f12150o00oOo00) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new o0O000(this);
        }

        @oo0oO0
        public o00oOOo0 o00oo0o(@oo0oO0 Class<? extends o00ooO> cls) {
            this.f12193o00oOo00.f12472o00oOooO = cls.getName();
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oo0o0() {
            return this;
        }
    }

    public o0O000(o00oOOo0 o00oooo02) {
        super(o00oooo02.f12192o00oOOoO, o00oooo02.f12193o00oOo00, o00oooo02.f12195o00oOooO);
    }

    @oo0oO0
    public static List<o0O000> o00oOo0O(@oo0oO0 List<Class<? extends ListenableWorker>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Class<? extends ListenableWorker> cls : list) {
            arrayList.add(new o00oOOo0(cls).o00oOOoO());
        }
        return arrayList;
    }

    @oo0oO0
    public static o0O000 o00oOo0o(@oo0oO0 Class<? extends ListenableWorker> cls) {
        return new o00oOOo0(cls).o00oOOoO();
    }
}
