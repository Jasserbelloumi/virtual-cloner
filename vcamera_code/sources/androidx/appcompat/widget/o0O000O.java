package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OOooO0(29)
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class o0O000O implements InspectionCompanion {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f1142o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1143o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1144o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f1145o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f1146o00oOooO;

    public void mapProperties(@o00oOooO.oo0oO0 PropertyMapper propertyMapper) {
        this.f1143o00oOOoO = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
        this.f1144o00oOo00 = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
        this.f1146o00oOooO = propertyMapper.mapObject("tint", R.attr.tint);
        this.f1145o00oOo0O = propertyMapper.mapObject("tintMode", R.attr.tintMode);
        this.f1142o00oOOo0 = true;
    }

    /* renamed from: o00oOOo0 */
    public void readProperties(@o00oOooO.oo0oO0 o0OoOoOo o0oooooo, @o00oOooO.oo0oO0 PropertyReader propertyReader) {
        if (!this.f1142o00oOOo0) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f1143o00oOOoO, o0oooooo.getBackgroundTintList());
        propertyReader.readObject(this.f1144o00oOo00, o0oooooo.getBackgroundTintMode());
        propertyReader.readObject(this.f1146o00oOooO, o0oooooo.getImageTintList());
        propertyReader.readObject(this.f1145o00oOo0O, o0oooooo.getImageTintMode());
    }
}
