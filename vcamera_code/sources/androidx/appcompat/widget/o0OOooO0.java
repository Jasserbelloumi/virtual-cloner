package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class o0OOooO0 extends o0O00O0o.o00oOo00 implements View.OnClickListener {

    /* renamed from: o0  reason: collision with root package name */
    public static final int f1380o0 = 0;

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final boolean f1381o00oooo = false;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final String f1382o00ooooO = "SuggestionsAdapter";

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static final int f1383o00ooooo = 50;

    /* renamed from: o0O00000  reason: collision with root package name */
    public static final int f1384o0O00000 = 1;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public static final int f1385o0O0000O = 2;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public static final int f1386o0O0000o = -1;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public final SearchView f1387o00ooOO;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public final SearchableInfo f1388o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f1389o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public final Context f1390o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public final int f1391o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public boolean f1392o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public ColorStateList f1393o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public int f1394o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public int f1395o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public int f1396o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public int f1397o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public int f1398o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public int f1399o00oooOo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public int f1400o00oooo0;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final TextView f1401o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final TextView f1402o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final ImageView f1403o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final ImageView f1404o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final ImageView f1405o00oOooO;

        public o00oOOo0(View view) {
            this.f1401o00oOOo0 = (TextView) view.findViewById(16908308);
            this.f1402o00oOOoO = (TextView) view.findViewById(16908309);
            this.f1403o00oOo00 = (ImageView) view.findViewById(16908295);
            this.f1405o00oOooO = (ImageView) view.findViewById(16908296);
            this.f1404o00oOo0O = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public o0OOooO0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1392o00ooOoo = false;
        this.f1394o00ooo00 = 1;
        this.f1395o00ooo0O = -1;
        this.f1396o00ooo0o = -1;
        this.f1397o00oooO = -1;
        this.f1398o00oooOO = -1;
        this.f1399o00oooOo = -1;
        this.f1400o00oooo0 = -1;
        this.f1387o00ooOO = searchView;
        this.f1388o00ooOOo = searchableInfo;
        this.f1391o00ooOoO = searchView.getSuggestionCommitIconResId();
        this.f1390o00ooOo0 = context;
        this.f1389o00ooOo = weakHashMap;
    }

    public static String o00oo0o(Cursor cursor, String str) {
        return o00ooOO0(cursor, cursor.getColumnIndex(str));
    }

    public static String o00ooOO0(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // o0O00O0o.o00oOOo0, o0O00O0o.o00oOOoO.o00oOOo0
    public CharSequence convertToString(Cursor cursor) {
        String o00oo0o2;
        String o00oo0o3;
        if (cursor == null) {
            return null;
        }
        String o00oo0o4 = o00oo0o(cursor, "suggest_intent_query");
        if (o00oo0o4 != null) {
            return o00oo0o4;
        }
        if (!this.f1388o00ooOOo.shouldRewriteQueryFromData() || (o00oo0o3 = o00oo0o(cursor, "suggest_intent_data")) == null) {
            if (!this.f1388o00ooOOo.shouldRewriteQueryFromText() || (o00oo0o2 = o00oo0o(cursor, "suggest_text_1")) == null) {
                return null;
            }
            return o00oo0o2;
        }
        return o00oo0o3;
    }

    @Override // o0O00O0o.o00oOOo0, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View o00oOoO2 = o00oOoO(this.f1390o00ooOo0, o00oOo00(), viewGroup);
            if (o00oOoO2 != null) {
                ((o00oOOo0) o00oOoO2.getTag()).f1401o00oOOo0.setText(e.toString());
            }
            return o00oOoO2;
        }
    }

    @Override // o0O00O0o.o00oOOo0, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View o00oOoOO2 = o00oOoOO(this.f1390o00ooOo0, o00oOo00(), viewGroup);
            if (o00oOoOO2 != null) {
                ((o00oOOo0) o00oOoOO2.getTag()).f1401o00oOOo0.setText(e.toString());
            }
            return o00oOoOO2;
        }
    }

    @Override // o0O00O0o.o00oOOo0, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        o00ooOoO(o00oOo00());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        o00ooOoO(o00oOo00());
    }

    @Override // o0O00O0o.o00oOOo0, o0O00O0o.o00oOOoO.o00oOOo0
    public void o00oOOo0(Cursor cursor) {
        if (this.f1392o00ooOoo) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.o00oOOo0(cursor);
            if (cursor != null) {
                this.f1395o00ooo0O = cursor.getColumnIndex("suggest_text_1");
                this.f1396o00ooo0o = cursor.getColumnIndex("suggest_text_2");
                this.f1397o00oooO = cursor.getColumnIndex("suggest_text_2_url");
                this.f1398o00oooOO = cursor.getColumnIndex("suggest_icon_1");
                this.f1399o00oooOo = cursor.getColumnIndex("suggest_icon_2");
                this.f1400o00oooo0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // o0O00O0o.o00oOOo0, o0O00O0o.o00oOOoO.o00oOOo0
    public Cursor o00oOOoO(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1387o00ooOO.getVisibility() == 0 && this.f1387o00ooOO.getWindowVisibility() == 0) {
            try {
                Cursor o00ooO2 = o00ooO(this.f1388o00ooOOo, charSequence2, 50);
                if (o00ooO2 != null) {
                    o00ooO2.getCount();
                    return o00ooO2;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    @Override // o0O00O0o.o00oOo00, o0O00O0o.o00oOOo0
    public View o00oOoOO(Context context, Cursor cursor, ViewGroup viewGroup) {
        View o00oOoOO2 = super.o00oOoOO(context, cursor, viewGroup);
        o00oOoOO2.setTag(new o00oOOo0(o00oOoOO2));
        ((ImageView) o00oOoOO2.findViewById(R.id.edit_query)).setImageResource(this.f1391o00ooOoO);
        return o00oOoOO2;
    }

    @Override // o0O00O0o.o00oOOo0
    public void o00oOooO(View view, Context context, Cursor cursor) {
        o00oOOo0 o00oooo02 = (o00oOOo0) view.getTag();
        int i = this.f1400o00oooo0;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (o00oooo02.f1401o00oOOo0 != null) {
            o00ooOo0(o00oooo02.f1401o00oOOo0, o00ooOO0(cursor, this.f1395o00ooo0O));
        }
        if (o00oooo02.f1402o00oOOoO != null) {
            String o00ooOO02 = o00ooOO0(cursor, this.f1397o00oooO);
            CharSequence o00oo0O2 = o00ooOO02 != null ? o00oo0O(o00ooOO02) : o00ooOO0(cursor, this.f1396o00ooo0o);
            if (TextUtils.isEmpty(o00oo0O2)) {
                TextView textView = o00oooo02.f1401o00oOOo0;
                if (textView != null) {
                    textView.setSingleLine(false);
                    o00oooo02.f1401o00oOOo0.setMaxLines(2);
                }
            } else {
                TextView textView2 = o00oooo02.f1401o00oOOo0;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    o00oooo02.f1401o00oOOo0.setMaxLines(1);
                }
            }
            o00ooOo0(o00oooo02.f1402o00oOOoO, o00oo0O2);
        }
        ImageView imageView = o00oooo02.f1403o00oOo00;
        if (imageView != null) {
            o00ooOOo(imageView, o00ooO0(cursor), 4);
        }
        ImageView imageView2 = o00oooo02.f1405o00oOooO;
        if (imageView2 != null) {
            o00ooOOo(imageView2, o00ooO0O(cursor), 8);
        }
        int i3 = this.f1394o00ooo00;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            o00oooo02.f1404o00oOo0O.setVisibility(8);
            return;
        }
        o00oooo02.f1404o00oOo0O.setVisibility(0);
        o00oooo02.f1404o00oOo0O.setTag(o00oooo02.f1401o00oOOo0.getText());
        o00oooo02.f1404o00oOo0O.setOnClickListener(this);
    }

    public Drawable o00oo(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1390o00ooOo0.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri);
            } else {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public final CharSequence o00oo0O(CharSequence charSequence) {
        if (this.f1393o00ooo0 == null) {
            TypedValue typedValue = new TypedValue();
            this.f1390o00ooOo0.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
            this.f1393o00ooo0 = this.f1390o00ooOo0.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1393o00ooo0, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public void o00oo0O0() {
        o00oOOo0(null);
        this.f1392o00ooOoo = true;
    }

    public final Drawable o00oo0OO(String str) {
        Drawable.ConstantState constantState = this.f1389o00ooOo.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public final Drawable o00oo0Oo(ComponentName componentName) {
        PackageManager packageManager = this.f1390o00ooOo0.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                componentName.flattenToShortString();
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            return null;
        }
    }

    public final Drawable o00oo0o0(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f1389o00ooOo.containsKey(flattenToShortString)) {
            Drawable o00oo0Oo2 = o00oo0Oo(componentName);
            this.f1389o00ooOo.put(flattenToShortString, o00oo0Oo2 != null ? o00oo0Oo2.getConstantState() : null);
            return o00oo0Oo2;
        }
        Drawable.ConstantState constantState = this.f1389o00ooOo.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1390o00ooOo0.getResources());
    }

    public final Drawable o00oo0oO() {
        Drawable o00oo0o02 = o00oo0o0(this.f1388o00ooOOo.getSearchActivity());
        return o00oo0o02 != null ? o00oo0o02 : this.f1390o00ooOo0.getPackageManager().getDefaultActivityIcon();
    }

    public Cursor o00ooO(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1390o00ooOo0.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public final Drawable o00ooO0(Cursor cursor) {
        int i = this.f1398o00oooOO;
        if (i == -1) {
            return null;
        }
        Drawable o00ooO002 = o00ooO00(cursor.getString(i));
        return o00ooO002 != null ? o00ooO002 : o00oo0oO();
    }

    public final Drawable o00ooO00(String str) {
        if (str == null || str.isEmpty() || SessionDescription.SUPPORTED_SDP_VERSION.equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1390o00ooOo0.getPackageName() + "/" + parseInt;
            Drawable o00oo0OO2 = o00oo0OO(str2);
            if (o00oo0OO2 != null) {
                return o00oo0OO2;
            }
            Drawable drawable = o00ooo0.o0.getDrawable(this.f1390o00ooOo0, parseInt);
            o00ooOo(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            return null;
        } catch (NumberFormatException unused2) {
            Drawable o00oo0OO3 = o00oo0OO(str);
            if (o00oo0OO3 != null) {
                return o00oo0OO3;
            }
            Drawable o0O0o2 = o0O0o(Uri.parse(str));
            o00ooOo(str, o0O0o2);
            return o0O0o2;
        }
    }

    public final Drawable o00ooO0O(Cursor cursor) {
        int i = this.f1399o00oooOo;
        if (i == -1) {
            return null;
        }
        return o00ooO00(cursor.getString(i));
    }

    public int o00ooO0o() {
        return this.f1394o00ooo00;
    }

    public void o00ooOO(int i) {
        this.f1394o00ooo00 = i;
    }

    public final void o00ooOOo(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void o00ooOo(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1389o00ooOo.put(str, drawable.getConstantState());
        }
    }

    public final void o00ooOo0(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public final void o00ooOoO(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final Drawable o0O0o(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return o00oo(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1390o00ooOo0.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    openInputStream.close();
                } catch (IOException unused2) {
                    uri.toString();
                }
                return createFromStream;
            }
            throw new FileNotFoundException("Failed to open " + uri);
        } catch (FileNotFoundException e) {
            Objects.toString(uri);
            e.getMessage();
            return null;
        }
        Objects.toString(uri);
        e.getMessage();
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1387o00ooOO.o00ooO00((CharSequence) tag);
        }
    }
}
