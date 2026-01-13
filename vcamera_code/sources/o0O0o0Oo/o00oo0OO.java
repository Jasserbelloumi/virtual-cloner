package o0O0o0Oo;

import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0OO.o00oOOo0;
@o0O0OO.o00oo0OO(foreignKeys = {@o0O0OO.o0O0o(childColumns = {"work_spec_id"}, entity = o0OoO00O.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"}), @o0O0OO.o0O0o(childColumns = {"prerequisite_id"}, entity = o0OoO00O.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@o0O0OO.o0O00000({"work_spec_id"}), @o0O0OO.o0O00000({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oo0OO {
    @oo0oO0
    @o00oOOo0(name = "work_spec_id")

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f12377o00oOOo0;
    @oo0oO0
    @o00oOOo0(name = "prerequisite_id")

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f12378o00oOOoO;

    public o00oo0OO(@oo0oO0 String str, @oo0oO0 String str2) {
        this.f12377o00oOOo0 = str;
        this.f12378o00oOOoO = str2;
    }
}
