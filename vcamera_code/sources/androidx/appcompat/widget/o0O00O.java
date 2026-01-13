package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OOooO0(29)
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class o0O00O implements InspectionCompanion {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f1157o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1158o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1159o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f1160o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f1161o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f1162o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f1163o00oOooO;

    public void mapProperties(@o00oOooO.oo0oO0 PropertyMapper propertyMapper) {
        this.f1158o00oOOoO = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
        this.f1159o00oOo00 = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
        this.f1163o00oOooO = propertyMapper.mapObject("buttonTint", R.attr.buttonTint);
        this.f1160o00oOo0O = propertyMapper.mapObject("buttonTintMode", R.attr.buttonTintMode);
        this.f1161o00oOo0o = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
        this.f1162o00oOoO0 = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
        this.f1157o00oOOo0 = true;
    }

    /* renamed from: o00oOOo0 */
    public void readProperties(@o00oOooO.oo0oO0 AppCompatRadioButton appCompatRadioButton, @o00oOooO.oo0oO0 PropertyReader propertyReader) {
        if (!this.f1157o00oOOo0) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f1158o00oOOoO, appCompatRadioButton.getBackgroundTintList());
        propertyReader.readObject(this.f1159o00oOo00, appCompatRadioButton.getBackgroundTintMode());
        propertyReader.readObject(this.f1163o00oOooO, appCompatRadioButton.getButtonTintList());
        propertyReader.readObject(this.f1160o00oOo0O, appCompatRadioButton.getButtonTintMode());
        propertyReader.readObject(this.f1161o00oOo0o, appCompatRadioButton.getCompoundDrawableTintList());
        propertyReader.readObject(this.f1162o00oOoO0, appCompatRadioButton.getCompoundDrawableTintMode());
    }
}
