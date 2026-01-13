package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OOooO0(29)
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class o0OO0 implements InspectionCompanion {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f1262o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1263o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1264o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f1265o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f1266o00oOooO;

    public void mapProperties(@o00oOooO.oo0oO0 PropertyMapper propertyMapper) {
        this.f1263o00oOOoO = propertyMapper.mapInt("imeOptions", 16843364);
        this.f1264o00oOo00 = propertyMapper.mapInt("maxWidth", 16843039);
        this.f1266o00oOooO = propertyMapper.mapBoolean("iconifiedByDefault", R.attr.iconifiedByDefault);
        this.f1265o00oOo0O = propertyMapper.mapObject("queryHint", R.attr.queryHint);
        this.f1262o00oOOo0 = true;
    }

    /* renamed from: o00oOOo0 */
    public void readProperties(@o00oOooO.oo0oO0 SearchView searchView, @o00oOooO.oo0oO0 PropertyReader propertyReader) {
        if (!this.f1262o00oOOo0) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readInt(this.f1263o00oOOoO, searchView.getImeOptions());
        propertyReader.readInt(this.f1264o00oOo00, searchView.getMaxWidth());
        propertyReader.readBoolean(this.f1266o00oOooO, searchView.o00oOooo());
        propertyReader.readObject(this.f1265o00oOo0O, searchView.getQueryHint());
    }
}
