package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OOooO0(29)
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class o0OO0o00 implements InspectionCompanion {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f1305o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1306o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1307o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f1308o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f1309o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f1310o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f1311o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int f1312o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public int f1313o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public int f1314o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f1315o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f1316o00oOooo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public int f1317o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public int f1318o00oo00O;

    public void mapProperties(@o00oOooO.oo0oO0 PropertyMapper propertyMapper) {
        this.f1306o00oOOoO = propertyMapper.mapObject("textOff", 16843045);
        this.f1307o00oOo00 = propertyMapper.mapObject("textOn", 16843044);
        this.f1315o00oOooO = propertyMapper.mapObject("thumb", 16843074);
        this.f1308o00oOo0O = propertyMapper.mapBoolean("showText", R.attr.showText);
        this.f1309o00oOo0o = propertyMapper.mapBoolean("splitTrack", R.attr.splitTrack);
        this.f1311o00oOoO0 = propertyMapper.mapInt("switchMinWidth", R.attr.switchMinWidth);
        this.f1310o00oOoO = propertyMapper.mapInt("switchPadding", R.attr.switchPadding);
        this.f1312o00oOoOO = propertyMapper.mapInt("thumbTextPadding", R.attr.thumbTextPadding);
        this.f1313o00oOoOo = propertyMapper.mapObject("thumbTint", R.attr.thumbTint);
        this.f1314o00oOoo0 = propertyMapper.mapObject("thumbTintMode", R.attr.thumbTintMode);
        this.f1316o00oOooo = propertyMapper.mapObject("track", R.attr.track);
        this.f1318o00oo00O = propertyMapper.mapObject("trackTint", R.attr.trackTint);
        this.f1317o00oo0 = propertyMapper.mapObject("trackTintMode", R.attr.trackTintMode);
        this.f1305o00oOOo0 = true;
    }

    /* renamed from: o00oOOo0 */
    public void readProperties(@o00oOooO.oo0oO0 SwitchCompat switchCompat, @o00oOooO.oo0oO0 PropertyReader propertyReader) {
        if (!this.f1305o00oOOo0) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f1306o00oOOoO, switchCompat.getTextOff());
        propertyReader.readObject(this.f1307o00oOo00, switchCompat.getTextOn());
        propertyReader.readObject(this.f1315o00oOooO, switchCompat.getThumbDrawable());
        propertyReader.readBoolean(this.f1308o00oOo0O, switchCompat.getShowText());
        propertyReader.readBoolean(this.f1309o00oOo0o, switchCompat.getSplitTrack());
        propertyReader.readInt(this.f1311o00oOoO0, switchCompat.getSwitchMinWidth());
        propertyReader.readInt(this.f1310o00oOoO, switchCompat.getSwitchPadding());
        propertyReader.readInt(this.f1312o00oOoOO, switchCompat.getThumbTextPadding());
        propertyReader.readObject(this.f1313o00oOoOo, switchCompat.getThumbTintList());
        propertyReader.readObject(this.f1314o00oOoo0, switchCompat.getThumbTintMode());
        propertyReader.readObject(this.f1316o00oOooo, switchCompat.getTrackDrawable());
        propertyReader.readObject(this.f1318o00oo00O, switchCompat.getTrackTintList());
        propertyReader.readObject(this.f1317o00oo0, switchCompat.getTrackTintMode());
    }
}
