package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import o00oOooO.o0OO0oO;
import org.xmlpull.v1.XmlPullParserException;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ooo0Oo0 extends o0OO00OO {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static boolean f1586o00oOo00 = false;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f1587o00oOooO = 20;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final WeakReference<Context> f1588o00oOOoO;

    public ooo0Oo0(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 Resources resources) {
        super(resources);
        this.f1588o00oOOoO = new WeakReference<>(context);
    }

    public static boolean o00oOOoO() {
        return f1586o00oOo00;
    }

    public static void o00oOo00(boolean z) {
        f1586o00oOo00 = z;
    }

    public static boolean o00oOooO() {
        boolean z = f1586o00oOo00;
        return false;
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i) throws Resources.NotFoundException {
        return super.getAnimation(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i) throws Resources.NotFoundException {
        return super.getBoolean(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i) throws Resources.NotFoundException {
        return super.getColor(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i) throws Resources.NotFoundException {
        return super.getColorStateList(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i) throws Resources.NotFoundException {
        return super.getDimension(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        return super.getDimensionPixelOffset(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        return super.getDimensionPixelSize(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = this.f1588o00oOOoO.get();
        return context != null ? oo0ooO.o00oOoO().o00oo0o(context, this, i) : o00oOOo0(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    @o00oOooO.o0OOooO0(21)
    public /* bridge */ /* synthetic */ Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        return super.getDrawable(i, theme);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    @o00oOooO.o0OOooO0(15)
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i, int i2) throws Resources.NotFoundException {
        return super.getDrawableForDensity(i, i2);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    @o00oOooO.o0OOooO0(21)
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return super.getDrawableForDensity(i, i2, theme);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i, int i2, int i3) {
        return super.getFraction(i, i2, i3);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i) throws Resources.NotFoundException {
        return super.getIntArray(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i) throws Resources.NotFoundException {
        return super.getInteger(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i) throws Resources.NotFoundException {
        return super.getLayout(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ Movie getMovie(int i) throws Resources.NotFoundException {
        return super.getMovie(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i, int i2) throws Resources.NotFoundException {
        return super.getQuantityString(i, i2);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i, int i2, Object[] objArr) throws Resources.NotFoundException {
        return super.getQuantityString(i, i2, objArr);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i, int i2) throws Resources.NotFoundException {
        return super.getQuantityText(i, i2);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceEntryName(int i) throws Resources.NotFoundException {
        return super.getResourceEntryName(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceName(int i) throws Resources.NotFoundException {
        return super.getResourceName(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourcePackageName(int i) throws Resources.NotFoundException {
        return super.getResourcePackageName(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceTypeName(int i) throws Resources.NotFoundException {
        return super.getResourceTypeName(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i) throws Resources.NotFoundException {
        return super.getString(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i, Object[] objArr) throws Resources.NotFoundException {
        return super.getString(i, objArr);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ String[] getStringArray(int i) throws Resources.NotFoundException {
        return super.getStringArray(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i) throws Resources.NotFoundException {
        return super.getText(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i, CharSequence charSequence) {
        return super.getText(i, charSequence);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i) throws Resources.NotFoundException {
        return super.getTextArray(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        super.getValue(i, typedValue, z);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        super.getValue(str, typedValue, z);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    @o00oOooO.o0OOooO0(15)
    public /* bridge */ /* synthetic */ void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        super.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i) throws Resources.NotFoundException {
        return super.getXml(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i) throws Resources.NotFoundException {
        return super.obtainTypedArray(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i) throws Resources.NotFoundException {
        return super.openRawResource(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i, TypedValue typedValue) throws Resources.NotFoundException {
        return super.openRawResource(i, typedValue);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i) throws Resources.NotFoundException {
        return super.openRawResourceFd(i);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // androidx.appcompat.widget.o0OO00OO, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }
}
