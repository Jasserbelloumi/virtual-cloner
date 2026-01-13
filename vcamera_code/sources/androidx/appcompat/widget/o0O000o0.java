package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OOooO0(29)
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class o0O000o0 implements InspectionCompanion {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f1152o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1153o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1154o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f1155o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f1156o00oOooO;

    public void mapProperties(@o00oOooO.oo0oO0 PropertyMapper propertyMapper) {
        this.f1153o00oOOoO = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
        this.f1154o00oOo00 = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
        this.f1156o00oOooO = propertyMapper.mapObject("tint", R.attr.tint);
        this.f1155o00oOo0O = propertyMapper.mapObject("tintMode", R.attr.tintMode);
        this.f1152o00oOOo0 = true;
    }

    /* renamed from: o00oOOo0 */
    public void readProperties(@o00oOooO.oo0oO0 AppCompatImageView appCompatImageView, @o00oOooO.oo0oO0 PropertyReader propertyReader) {
        if (!this.f1152o00oOOo0) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f1153o00oOOoO, appCompatImageView.getBackgroundTintList());
        propertyReader.readObject(this.f1154o00oOo00, appCompatImageView.getBackgroundTintMode());
        propertyReader.readObject(this.f1156o00oOooO, appCompatImageView.getImageTintList());
        propertyReader.readObject(this.f1155o00oOo0O, appCompatImageView.getImageTintMode());
    }
}
