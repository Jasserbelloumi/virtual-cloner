package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OOooO0(29)
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class o0O0OO0 implements InspectionCompanion {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f1207o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1208o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1209o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f1210o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f1211o00oOooO;

    public void mapProperties(@o00oOooO.oo0oO0 PropertyMapper propertyMapper) {
        this.f1208o00oOOoO = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
        this.f1209o00oOo00 = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
        this.f1211o00oOooO = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
        this.f1210o00oOo0O = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
        this.f1207o00oOOo0 = true;
    }

    /* renamed from: o00oOOo0 */
    public void readProperties(@o00oOooO.oo0oO0 o0O0OO o0o0oo, @o00oOooO.oo0oO0 PropertyReader propertyReader) {
        if (!this.f1207o00oOOo0) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f1208o00oOOoO, o0o0oo.getBackgroundTintList());
        propertyReader.readObject(this.f1209o00oOo00, o0o0oo.getBackgroundTintMode());
        propertyReader.readObject(this.f1211o00oOooO, o0o0oo.getCompoundDrawableTintList());
        propertyReader.readObject(this.f1210o00oOo0O, o0o0oo.getCompoundDrawableTintMode());
    }
}
