package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OOooO0(29)
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class o0 implements InspectionCompanion {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f1020o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1021o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1022o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f1023o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f1024o00oOooO;

    public void mapProperties(@o00oOooO.oo0oO0 PropertyMapper propertyMapper) {
        this.f1021o00oOOoO = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
        this.f1022o00oOo00 = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
        this.f1024o00oOooO = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
        this.f1023o00oOo0O = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
        this.f1020o00oOOo0 = true;
    }

    /* renamed from: o00oOOo0 */
    public void readProperties(@o00oOooO.oo0oO0 AppCompatEditText appCompatEditText, @o00oOooO.oo0oO0 PropertyReader propertyReader) {
        if (!this.f1020o00oOOo0) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f1021o00oOOoO, appCompatEditText.getBackgroundTintList());
        propertyReader.readObject(this.f1022o00oOo00, appCompatEditText.getBackgroundTintMode());
        propertyReader.readObject(this.f1024o00oOooO, appCompatEditText.getCompoundDrawableTintList());
        propertyReader.readObject(this.f1023o00oOo0O, appCompatEditText.getCompoundDrawableTintMode());
    }
}
