package o0O0o0Oo;

import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0OO.o00oOOo0;
@o0O0OO.o00oo0OO(foreignKeys = {@o0O0OO.o0O0o(childColumns = {"work_spec_id"}, entity = o0OoO00O.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0O00000 {
    @oo0oO0
    @o00oOOo0(name = "work_spec_id")
    @o0O0OO.o0O000Oo

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f12389o00oOOo0;
    @o00oOOo0(name = "system_id")

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final int f12390o00oOOoO;

    public o0O00000(@oo0oO0 String str, int i) {
        this.f12389o00oOOo0 = str;
        this.f12390o00oOOoO = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O00000) {
            o0O00000 o0o00000 = (o0O00000) obj;
            if (this.f12390o00oOOoO != o0o00000.f12390o00oOOoO) {
                return false;
            }
            return this.f12389o00oOOo0.equals(o0o00000.f12389o00oOOo0);
        }
        return false;
    }

    public int hashCode() {
        return (this.f12389o00oOOo0.hashCode() * 31) + this.f12390o00oOOoO;
    }
}
