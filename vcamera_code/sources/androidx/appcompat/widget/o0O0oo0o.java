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
public final class o0O0oo0o implements InspectionCompanion {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f1248o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1249o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1250o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f1251o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f1252o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f1253o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f1254o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int f1255o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f1256o00oOooO;

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
        this.f1249o00oOOoO = propertyMapper.mapInt("autoSizeMaxTextSize", R.attr.autoSizeMaxTextSize);
        this.f1250o00oOo00 = propertyMapper.mapInt("autoSizeMinTextSize", R.attr.autoSizeMinTextSize);
        this.f1256o00oOooO = propertyMapper.mapInt("autoSizeStepGranularity", R.attr.autoSizeStepGranularity);
        this.f1251o00oOo0O = propertyMapper.mapIntEnum("autoSizeTextType", R.attr.autoSizeTextType, new o00oOOo0());
        this.f1252o00oOo0o = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
        this.f1254o00oOoO0 = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
        this.f1253o00oOoO = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
        this.f1255o00oOoOO = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
        this.f1248o00oOOo0 = true;
    }

    /* renamed from: o00oOOo0 */
    public void readProperties(@o00oOooO.oo0oO0 AppCompatTextView appCompatTextView, @o00oOooO.oo0oO0 PropertyReader propertyReader) {
        if (!this.f1248o00oOOo0) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readInt(this.f1249o00oOOoO, appCompatTextView.getAutoSizeMaxTextSize());
        propertyReader.readInt(this.f1250o00oOo00, appCompatTextView.getAutoSizeMinTextSize());
        propertyReader.readInt(this.f1256o00oOooO, appCompatTextView.getAutoSizeStepGranularity());
        propertyReader.readIntEnum(this.f1251o00oOo0O, appCompatTextView.getAutoSizeTextType());
        propertyReader.readObject(this.f1252o00oOo0o, appCompatTextView.getBackgroundTintList());
        propertyReader.readObject(this.f1254o00oOoO0, appCompatTextView.getBackgroundTintMode());
        propertyReader.readObject(this.f1253o00oOoO, appCompatTextView.getCompoundDrawableTintList());
        propertyReader.readObject(this.f1255o00oOoOO, appCompatTextView.getCompoundDrawableTintMode());
    }
}
