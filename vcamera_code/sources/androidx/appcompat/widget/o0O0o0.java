package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntFunction;
import o00oOooO.o0OO0oO;
import o00ooOoo.oOo000Oo;
@o00oOooO.o0OOooO0(29)
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class o0O0o0 implements InspectionCompanion {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f1225o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1226o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1227o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f1228o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f1229o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f1230o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f1231o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int f1232o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public int f1233o00oOoOo;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f1234o00oOooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements IntFunction<String> {
        public o00oOOo0() {
        }

        @Override // java.util.function.IntFunction
        /* renamed from: o00oOOo0 */
        public String apply(int i) {
            return i != 0 ? i != 1 ? String.valueOf(i) : "vertical" : "horizontal";
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements IntFunction<Set<String>> {
        public o00oOOoO() {
        }

        @Override // java.util.function.IntFunction
        /* renamed from: o00oOOo0 */
        public Set<String> apply(int i) {
            HashSet hashSet = new HashSet();
            if (i == 0) {
                hashSet.add("none");
            }
            if (i == 1) {
                hashSet.add("beginning");
            }
            if (i == 2) {
                hashSet.add("middle");
            }
            if (i == 4) {
                hashSet.add(TtmlNode.END);
            }
            return hashSet;
        }
    }

    public void mapProperties(@o00oOooO.oo0oO0 PropertyMapper propertyMapper) {
        this.f1226o00oOOoO = propertyMapper.mapBoolean("baselineAligned", 16843046);
        this.f1227o00oOo00 = propertyMapper.mapInt("baselineAlignedChildIndex", 16843047);
        this.f1234o00oOooO = propertyMapper.mapGravity(oOo000Oo.o0O000.f9444o00ooOoo, 16842927);
        this.f1228o00oOo0O = propertyMapper.mapIntEnum("orientation", 16842948, new o00oOOo0());
        this.f1229o00oOo0o = propertyMapper.mapFloat("weightSum", 16843048);
        this.f1231o00oOoO0 = propertyMapper.mapObject("divider", R.attr.divider);
        this.f1230o00oOoO = propertyMapper.mapInt("dividerPadding", R.attr.dividerPadding);
        this.f1232o00oOoOO = propertyMapper.mapBoolean("measureWithLargestChild", R.attr.measureWithLargestChild);
        this.f1233o00oOoOo = propertyMapper.mapIntFlag("showDividers", R.attr.showDividers, new o00oOOoO());
        this.f1225o00oOOo0 = true;
    }

    /* renamed from: o00oOOo0 */
    public void readProperties(@o00oOooO.oo0oO0 LinearLayoutCompat linearLayoutCompat, @o00oOooO.oo0oO0 PropertyReader propertyReader) {
        if (!this.f1225o00oOOo0) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readBoolean(this.f1226o00oOOoO, linearLayoutCompat.isBaselineAligned());
        propertyReader.readInt(this.f1227o00oOo00, linearLayoutCompat.getBaselineAlignedChildIndex());
        propertyReader.readGravity(this.f1234o00oOooO, linearLayoutCompat.getGravity());
        propertyReader.readIntEnum(this.f1228o00oOo0O, linearLayoutCompat.getOrientation());
        propertyReader.readFloat(this.f1229o00oOo0o, linearLayoutCompat.getWeightSum());
        propertyReader.readObject(this.f1231o00oOoO0, linearLayoutCompat.getDividerDrawable());
        propertyReader.readInt(this.f1230o00oOoO, linearLayoutCompat.getDividerPadding());
        propertyReader.readBoolean(this.f1232o00oOoOO, linearLayoutCompat.isMeasureWithLargestChildEnabled());
        propertyReader.readIntFlag(this.f1233o00oOoOo, linearLayoutCompat.getShowDividers());
    }
}
