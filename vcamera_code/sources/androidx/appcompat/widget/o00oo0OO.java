package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.R;
import java.util.function.IntFunction;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OOooO0(29)
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class o00oo0OO implements InspectionCompanion {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f1106o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1107o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1108o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f1109o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f1110o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f1111o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f1112o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int f1113o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f1114o00oOooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements IntFunction<String> {
        public o00oOOo0() {
        }

        @Override // java.util.function.IntFunction
        /* renamed from: o00oOOo0 */
        public String apply(int i) {
            return i != 0 ? i != 1 ? String.valueOf(i) : "uniform" : "none";
        }
    }

    public void mapProperties(@o00oOooO.oo0oO0 PropertyMapper propertyMapper) {
        this.f1107o00oOOoO = propertyMapper.mapInt("autoSizeMaxTextSize", R.attr.autoSizeMaxTextSize);
        this.f1108o00oOo00 = propertyMapper.mapInt("autoSizeMinTextSize", R.attr.autoSizeMinTextSize);
        this.f1114o00oOooO = propertyMapper.mapInt("autoSizeStepGranularity", R.attr.autoSizeStepGranularity);
        this.f1109o00oOo0O = propertyMapper.mapIntEnum("autoSizeTextType", R.attr.autoSizeTextType, new o00oOOo0());
        this.f1110o00oOo0o = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
        this.f1112o00oOoO0 = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
        this.f1111o00oOoO = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
        this.f1113o00oOoOO = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
        this.f1106o00oOOo0 = true;
    }

    /* renamed from: o00oOOo0 */
    public void readProperties(@o00oOooO.oo0oO0 AppCompatButton appCompatButton, @o00oOooO.oo0oO0 PropertyReader propertyReader) {
        if (!this.f1106o00oOOo0) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readInt(this.f1107o00oOOoO, appCompatButton.getAutoSizeMaxTextSize());
        propertyReader.readInt(this.f1108o00oOo00, appCompatButton.getAutoSizeMinTextSize());
        propertyReader.readInt(this.f1114o00oOooO, appCompatButton.getAutoSizeStepGranularity());
        propertyReader.readIntEnum(this.f1109o00oOo0O, appCompatButton.getAutoSizeTextType());
        propertyReader.readObject(this.f1110o00oOo0o, appCompatButton.getBackgroundTintList());
        propertyReader.readObject(this.f1112o00oOoO0, appCompatButton.getBackgroundTintMode());
        propertyReader.readObject(this.f1111o00oOoO, appCompatButton.getCompoundDrawableTintList());
        propertyReader.readObject(this.f1113o00oOoOO, appCompatButton.getCompoundDrawableTintMode());
    }
}
