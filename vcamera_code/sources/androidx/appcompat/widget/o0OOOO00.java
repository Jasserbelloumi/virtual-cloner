package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
import o00ooOoo.oO0O0O0;
@o00oOooO.o0OOooO0(29)
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class o0OOOO00 implements InspectionCompanion {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f1332o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1333o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1334o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f1335o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f1336o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f1337o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f1338o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int f1339o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public int f1340o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public int f1341o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f1342o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f1343o00oOooo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public int f1344o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public int f1345o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f1346o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f1347o00oo0O0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public int f1348o00oo0OO;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f1349o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f1350o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f1351o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f1352o00oo0oO;

    public void mapProperties(@o00oOooO.oo0oO0 PropertyMapper propertyMapper) {
        this.f1333o00oOOoO = propertyMapper.mapObject("collapseContentDescription", R.attr.collapseContentDescription);
        this.f1334o00oOo00 = propertyMapper.mapObject("collapseIcon", R.attr.collapseIcon);
        this.f1342o00oOooO = propertyMapper.mapInt("contentInsetEnd", R.attr.contentInsetEnd);
        this.f1335o00oOo0O = propertyMapper.mapInt("contentInsetEndWithActions", R.attr.contentInsetEndWithActions);
        this.f1336o00oOo0o = propertyMapper.mapInt("contentInsetLeft", R.attr.contentInsetLeft);
        this.f1338o00oOoO0 = propertyMapper.mapInt("contentInsetRight", R.attr.contentInsetRight);
        this.f1337o00oOoO = propertyMapper.mapInt("contentInsetStart", R.attr.contentInsetStart);
        this.f1339o00oOoOO = propertyMapper.mapInt("contentInsetStartWithNavigation", R.attr.contentInsetStartWithNavigation);
        this.f1340o00oOoOo = propertyMapper.mapObject("logo", R.attr.logo);
        this.f1341o00oOoo0 = propertyMapper.mapObject("logoDescription", R.attr.logoDescription);
        this.f1343o00oOooo = propertyMapper.mapObject(o00oOoOo.o00ooO0.f7024o00oOo0o, R.attr.menu);
        this.f1345o00oo00O = propertyMapper.mapObject("navigationContentDescription", R.attr.navigationContentDescription);
        this.f1344o00oo0 = propertyMapper.mapObject("navigationIcon", R.attr.navigationIcon);
        this.f1348o00oo0OO = propertyMapper.mapResourceId("popupTheme", R.attr.popupTheme);
        this.f1347o00oo0O0 = propertyMapper.mapObject("subtitle", R.attr.subtitle);
        this.f1346o00oo0O = propertyMapper.mapObject(oO0O0O0.f9045o00oOo0O, R.attr.title);
        this.f1349o00oo0Oo = propertyMapper.mapInt("titleMarginBottom", R.attr.titleMarginBottom);
        this.f1351o00oo0o0 = propertyMapper.mapInt("titleMarginEnd", R.attr.titleMarginEnd);
        this.f1350o00oo0o = propertyMapper.mapInt("titleMarginStart", R.attr.titleMarginStart);
        this.f1352o00oo0oO = propertyMapper.mapInt("titleMarginTop", R.attr.titleMarginTop);
        this.f1332o00oOOo0 = true;
    }

    /* renamed from: o00oOOo0 */
    public void readProperties(@o00oOooO.oo0oO0 Toolbar toolbar, @o00oOooO.oo0oO0 PropertyReader propertyReader) {
        if (!this.f1332o00oOOo0) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f1333o00oOOoO, toolbar.getCollapseContentDescription());
        propertyReader.readObject(this.f1334o00oOo00, toolbar.getCollapseIcon());
        propertyReader.readInt(this.f1342o00oOooO, toolbar.getContentInsetEnd());
        propertyReader.readInt(this.f1335o00oOo0O, toolbar.getContentInsetEndWithActions());
        propertyReader.readInt(this.f1336o00oOo0o, toolbar.getContentInsetLeft());
        propertyReader.readInt(this.f1338o00oOoO0, toolbar.getContentInsetRight());
        propertyReader.readInt(this.f1337o00oOoO, toolbar.getContentInsetStart());
        propertyReader.readInt(this.f1339o00oOoOO, toolbar.getContentInsetStartWithNavigation());
        propertyReader.readObject(this.f1340o00oOoOo, toolbar.getLogo());
        propertyReader.readObject(this.f1341o00oOoo0, toolbar.getLogoDescription());
        propertyReader.readObject(this.f1343o00oOooo, toolbar.getMenu());
        propertyReader.readObject(this.f1345o00oo00O, toolbar.getNavigationContentDescription());
        propertyReader.readObject(this.f1344o00oo0, toolbar.getNavigationIcon());
        propertyReader.readResourceId(this.f1348o00oo0OO, toolbar.getPopupTheme());
        propertyReader.readObject(this.f1347o00oo0O0, toolbar.getSubtitle());
        propertyReader.readObject(this.f1346o00oo0O, toolbar.getTitle());
        propertyReader.readInt(this.f1349o00oo0Oo, toolbar.getTitleMarginBottom());
        propertyReader.readInt(this.f1351o00oo0o0, toolbar.getTitleMarginEnd());
        propertyReader.readInt(this.f1350o00oo0o, toolbar.getTitleMarginStart());
        propertyReader.readInt(this.f1352o00oo0oO, toolbar.getTitleMarginTop());
    }
}
