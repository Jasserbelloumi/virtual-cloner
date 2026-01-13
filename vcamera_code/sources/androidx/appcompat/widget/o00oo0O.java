package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OOooO0(29)
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class o00oo0O implements InspectionCompanion {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f1092o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1093o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1094o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f1095o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f1096o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f1097o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f1098o00oOooO;

    public void mapProperties(@o00oOooO.oo0oO0 PropertyMapper propertyMapper) {
        this.f1093o00oOOoO = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
        this.f1094o00oOo00 = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
        this.f1098o00oOooO = propertyMapper.mapObject("checkMarkTint", R.attr.checkMarkTint);
        this.f1095o00oOo0O = propertyMapper.mapObject("checkMarkTintMode", R.attr.checkMarkTintMode);
        this.f1096o00oOo0o = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
        this.f1097o00oOoO0 = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
        this.f1092o00oOOo0 = true;
    }

    /* renamed from: o00oOOo0 */
    public void readProperties(@o00oOooO.oo0oO0 o0O0o o0o0o, @o00oOooO.oo0oO0 PropertyReader propertyReader) {
        if (!this.f1092o00oOOo0) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f1093o00oOOoO, o0o0o.getBackgroundTintList());
        propertyReader.readObject(this.f1094o00oOo00, o0o0o.getBackgroundTintMode());
        propertyReader.readObject(this.f1098o00oOooO, o0o0o.getCheckMarkTintList());
        propertyReader.readObject(this.f1095o00oOo0O, o0o0o.getCheckMarkTintMode());
        propertyReader.readObject(this.f1096o00oOo0o, o0o0o.getCompoundDrawableTintList());
        propertyReader.readObject(this.f1097o00oOoO0, o0o0o.getCompoundDrawableTintMode());
    }
}
