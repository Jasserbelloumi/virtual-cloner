package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OOooO0(29)
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class o0O00oO0 implements InspectionCompanion {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f1179o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1180o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1181o00oOo00;

    public void mapProperties(@o00oOooO.oo0oO0 PropertyMapper propertyMapper) {
        this.f1180o00oOOoO = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
        this.f1181o00oOo00 = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
        this.f1179o00oOOo0 = true;
    }

    /* renamed from: o00oOOo0 */
    public void readProperties(@o00oOooO.oo0oO0 AppCompatSpinner appCompatSpinner, @o00oOooO.oo0oO0 PropertyReader propertyReader) {
        if (!this.f1179o00oOOo0) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f1180o00oOOoO, appCompatSpinner.getBackgroundTintList());
        propertyReader.readObject(this.f1181o00oOo00, appCompatSpinner.getBackgroundTintMode());
    }
}
