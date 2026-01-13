package o00ooo0;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.textclassifier.TextLinks;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00ooo0.o0O000Oo;
import o0ooOoOO.o;
import o0ooOoOO.oO00O0o0;
/* loaded from: classes.dex */
public class o0O000Oo {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f9576o00oo0O0 = "IntentSanitizer";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f9577o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public oO00O0o0<String> f9578o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public oO00O0o0<Uri> f9579o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public oO00O0o0<String> f9580o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public oO00O0o0<String> f9581o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f9582o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public oO00O0o0<ComponentName> f9583o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public Map<String, oO00O0o0<Object>> f9584o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public boolean f9585o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public oO00O0o0<Uri> f9586o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public oO00O0o0<String> f9587o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public oO00O0o0<ClipData> f9588o00oOooo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public boolean f9589o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public boolean f9590o00oo00O;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public boolean f9591o00oo0OO;

    @o0OOooO0(15)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static Intent o00oOOo0(Intent intent) {
            return intent.getSelector();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOoO(Intent intent, Intent intent2) {
            intent.setSelector(intent2);
        }
    }

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOo00 {

        @o0OOooO0(31)
        /* loaded from: classes.dex */
        public static class o00oOOo0 {
            @o00oOooO.o0O0O0Oo
            public static void o00oOOo0(int i, ClipData.Item item, o<String> oVar) {
                TextLinks textLinks;
                if (item.getHtmlText() == null && item.getIntent() == null) {
                    textLinks = item.getTextLinks();
                    if (textLinks == null) {
                        return;
                    }
                }
                oVar.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
            }
        }

        public static void o00oOOo0(int i, ClipData.Item item, o<String> oVar) {
            if (item.getHtmlText() == null && item.getIntent() == null) {
                return;
            }
            oVar.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0091 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
        @o00oOooO.o0O0O0Oo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void o00oOOoO(@o00oOooO.oo0oO0 android.content.Intent r7, android.content.Intent r8, o0ooOoOO.oO00O0o0<android.content.ClipData> r9, boolean r10, o0ooOoOO.oO00O0o0<android.net.Uri> r11, o0ooOoOO.o<java.lang.String> r12) {
            /*
                android.content.ClipData r7 = r7.getClipData()
                if (r7 != 0) goto L7
                return
            L7:
                if (r9 == 0) goto L14
                boolean r9 = r9.test(r7)
                if (r9 == 0) goto L14
                r8.setClipData(r7)
                goto Lb5
            L14:
                r9 = 0
                r0 = 0
                r1 = r0
            L17:
                int r2 = r7.getItemCount()
                if (r9 >= r2) goto Lb0
                android.content.ClipData$Item r2 = r7.getItemAt(r9)
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 31
                if (r3 < r4) goto L2b
                o00ooo0.o0O000Oo.o00oOo00.o00oOOo0.o00oOOo0(r9, r2, r12)
                goto L2e
            L2b:
                o00oOOo0(r9, r2, r12)
            L2e:
                java.lang.CharSequence r3 = r2.getText()
                if (r10 == 0) goto L35
                goto L4e
            L35:
                if (r3 == 0) goto L4d
                java.lang.String r3 = "Item text cannot contain value. Item position: "
                java.lang.String r4 = ". Text: "
                java.lang.StringBuilder r3 = o00ooOoo.oO00O0oO.o00oOOo0(r3, r9, r4)
                java.lang.CharSequence r4 = r2.getText()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r12.accept(r3)
            L4d:
                r3 = r0
            L4e:
                java.lang.String r4 = ". URI: "
                java.lang.String r5 = "Item URI is not allowed. Item position: "
                android.net.Uri r6 = r2.getUri()
                if (r11 != 0) goto L60
                if (r6 == 0) goto L89
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                goto L72
            L60:
                if (r6 == 0) goto L8b
                android.net.Uri r6 = r2.getUri()
                boolean r6 = r11.test(r6)
                if (r6 == 0) goto L6d
                goto L8b
            L6d:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
            L72:
                r6.append(r5)
                r6.append(r9)
                r6.append(r4)
                android.net.Uri r2 = r2.getUri()
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r12.accept(r2)
            L89:
                r2 = r0
                goto L8f
            L8b:
                android.net.Uri r2 = r2.getUri()
            L8f:
                if (r3 != 0) goto L93
                if (r2 == 0) goto Lac
            L93:
                if (r1 != 0) goto La4
                android.content.ClipData r1 = new android.content.ClipData
                android.content.ClipDescription r4 = r7.getDescription()
                android.content.ClipData$Item r5 = new android.content.ClipData$Item
                r5.<init>(r3, r0, r2)
                r1.<init>(r4, r5)
                goto Lac
            La4:
                android.content.ClipData$Item r4 = new android.content.ClipData$Item
                r4.<init>(r3, r0, r2)
                r1.addItem(r4)
            Lac:
                int r9 = r9 + 1
                goto L17
            Lb0:
                if (r1 == 0) goto Lb5
                r8.setClipData(r1)
            Lb5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o00ooo0.o0O000Oo.o00oOo00.o00oOOoO(android.content.Intent, android.content.Intent, o0ooOoOO.oO00O0o0, boolean, o0ooOoOO.oO00O0o0, o0ooOoOO.o):void");
        }
    }

    @o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOo0O {
        @o00oOooO.o0O0O0Oo
        public static String o00oOOo0(Intent intent) {
            String identifier;
            identifier = intent.getIdentifier();
            return identifier;
        }

        @o00oOooO.o0O0O0Oo
        public static Intent o00oOOoO(Intent intent, String str) {
            Intent identifier;
            identifier = intent.setIdentifier(str);
            return identifier;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOoO {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static final int f9592o00oo0O = 2112614400;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final int f9593o00oo0Oo = 2015363072;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f9594o00oOOo0;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public boolean f9599o00oOoO;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public boolean f9601o00oOoOO;

        /* renamed from: o00oo0  reason: collision with root package name */
        public boolean f9606o00oo0;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public boolean f9608o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public boolean f9609o00oo0OO;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public oO00O0o0<String> f9595o00oOOoO = new oO00O0o0() { // from class: o00ooo0.o0O00oO0
            @Override // o0ooOoOO.oO00O0o0
            public final boolean test(Object obj) {
                String str = (String) obj;
                return false;
            }
        };

        /* renamed from: o00oOo00  reason: collision with root package name */
        public oO00O0o0<Uri> f9596o00oOo00 = new oO00O0o0() { // from class: o00ooo0.o0O0O0O
            @Override // o0ooOoOO.oO00O0o0
            public final boolean test(Object obj) {
                Uri uri = (Uri) obj;
                return false;
            }
        };

        /* renamed from: o00oOooO  reason: collision with root package name */
        public oO00O0o0<String> f9604o00oOooO = new oO00O0o0() { // from class: o00ooo0.o0O00oO0
            @Override // o0ooOoOO.oO00O0o0
            public final boolean test(Object obj) {
                String str = (String) obj;
                return false;
            }
        };

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public oO00O0o0<String> f9597o00oOo0O = new oO00O0o0() { // from class: o00ooo0.o0O00oO0
            @Override // o0ooOoOO.oO00O0o0
            public final boolean test(Object obj) {
                String str = (String) obj;
                return false;
            }
        };

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public oO00O0o0<String> f9598o00oOo0o = new oO00O0o0() { // from class: o00ooo0.o0O00oO0
            @Override // o0ooOoOO.oO00O0o0
            public final boolean test(Object obj) {
                String str = (String) obj;
                return false;
            }
        };

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public oO00O0o0<ComponentName> f9600o00oOoO0 = new oO00O0o0() { // from class: o00ooo0.o0oO0O0o
            @Override // o0ooOoOO.oO00O0o0
            public final boolean test(Object obj) {
                ComponentName componentName = (ComponentName) obj;
                return false;
            }
        };

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public Map<String, oO00O0o0<Object>> f9602o00oOoOo = new HashMap();

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public boolean f9603o00oOoo0 = false;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public oO00O0o0<Uri> f9605o00oOooo = new oO00O0o0() { // from class: o00ooo0.o0O0O0O
            @Override // o0ooOoOO.oO00O0o0
            public final boolean test(Object obj) {
                Uri uri = (Uri) obj;
                return false;
            }
        };

        /* renamed from: o00oo00O  reason: collision with root package name */
        public oO00O0o0<ClipData> f9607o00oo00O = new oO00O0o0() { // from class: o00ooo0.o0O0oo0o
            @Override // o0ooOoOO.oO00O0o0
            public final boolean test(Object obj) {
                ClipData clipData = (ClipData) obj;
                return false;
            }
        };

        public static /* synthetic */ boolean o00oOOo0(String str) {
            return false;
        }

        public static /* synthetic */ boolean o00oOOoO(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean o00oOo0O(String str) {
            return false;
        }

        public static /* synthetic */ boolean o00oOo0o(Object obj) {
            return false;
        }

        public static /* synthetic */ boolean o00oOoO(String str) {
            return false;
        }

        public static /* synthetic */ boolean o00oOoOO(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean o00oOoOo(String str) {
            return false;
        }

        public static /* synthetic */ boolean o00oOooO(ComponentName componentName) {
            return true;
        }

        public static /* synthetic */ boolean o00oOooo(Object obj) {
            return true;
        }

        public static /* synthetic */ boolean o00oo0O(ClipData clipData) {
            return false;
        }

        public static /* synthetic */ boolean o00oo0OO(ComponentName componentName) {
            return false;
        }

        public static /* synthetic */ boolean o0O00(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean o0O000(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean o0O0000o(ComponentName componentName) {
            return true;
        }

        public static /* synthetic */ boolean o0O000O(String str, ComponentName componentName) {
            return str.equals(componentName.getPackageName());
        }

        public static /* synthetic */ boolean o0O000Oo(Object obj) {
            return true;
        }

        public static /* synthetic */ boolean o0O000o(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean o0O000o0(Object obj) {
            return false;
        }

        public static /* synthetic */ boolean o0O000oo(String str) {
            return false;
        }

        public static /* synthetic */ boolean o0O00O(ComponentName componentName) {
            return false;
        }

        public static /* synthetic */ boolean o0O00O0(String str) {
            return false;
        }

        public static /* synthetic */ boolean o0O00O0o(String str) {
            return false;
        }

        public static /* synthetic */ boolean o0O00OO(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean o0O00OOO(ClipData clipData) {
            return false;
        }

        public static /* synthetic */ boolean o0OoO00O(String str) {
            return false;
        }

        public static /* synthetic */ boolean o0OoOoOO(Class cls, oO00O0o0 oo00o0o0, Object obj) {
            return cls.isInstance(obj) && oo00o0o0.test(cls.cast(obj));
        }

        public static /* synthetic */ boolean o0OoOoOo(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean o0ooOoOO(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o0(@oo0oO0 String str) {
            str.getClass();
            return o0O00000(new o0O0O0o0(str));
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00oo(@oo0oO0 oO00O0o0<ClipData> oo00o0o0) {
            oo00o0o0.getClass();
            this.f9607o00oo00O = this.f9607o00oo00O.o00oOooO(oo00o0o0);
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00oo0Oo(@oo0oO0 String str) {
            str.getClass();
            o00oo0o0(new o0O0O0o0(str));
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00oo0o() {
            this.f9599o00oOoO = true;
            this.f9600o00oOoO0 = new oO00O0o0() { // from class: o00ooo0.o0O0OO0
                @Override // o0ooOoOO.oO00O0o0
                public final boolean test(Object obj) {
                    ComponentName componentName = (ComponentName) obj;
                    return true;
                }
            };
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00oo0o0(@oo0oO0 oO00O0o0<String> oo00o0o0) {
            oo00o0o0.getClass();
            this.f9595o00oOOoO = this.f9595o00oOOoO.o00oOooO(oo00o0o0);
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00oo0oO(@oo0oO0 String str) {
            str.getClass();
            return o0O0o(new o0O0O0o0(str));
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooO(@oo0oO0 oO00O0o0<ComponentName> oo00o0o0) {
            oo00o0o0.getClass();
            this.f9601o00oOoOO = true;
            this.f9600o00oOoO0 = this.f9600o00oOoO0.o00oOooO(oo00o0o0);
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooO0(@oo0oO0 oO00O0o0<Uri> oo00o0o0) {
            oo00o0o0.getClass();
            this.f9605o00oOooo = this.f9605o00oOooo.o00oOooO(oo00o0o0);
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooO00() {
            this.f9603o00oOoo0 = true;
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooO0O(@oo0oO0 final String str) {
            str.getClass();
            return o00ooO0(new oO00O0o0() { // from class: o00ooo0.o0O0O0Oo
                @Override // o0ooOoOO.oO00O0o0
                public final boolean test(Object obj) {
                    return o0O000Oo.o00oOoO.o0O000(str, (Uri) obj);
                }
            });
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooO0o(@oo0oO0 final ComponentName componentName) {
            componentName.getClass();
            return o00ooO(new oO00O0o0() { // from class: o00ooo0.o0oO0Ooo
                @Override // o0ooOoOO.oO00O0o0
                public final boolean test(Object obj) {
                    return componentName.equals((ComponentName) obj);
                }
            });
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooOO(@oo0oO0 oO00O0o0<Uri> oo00o0o0) {
            oo00o0o0.getClass();
            this.f9596o00oOo00 = this.f9596o00oOo00.o00oOooO(oo00o0o0);
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooOO0(@oo0oO0 final String str) {
            str.getClass();
            return o00ooO(new oO00O0o0() { // from class: o00ooo0.o0O00O
                @Override // o0ooOoOO.oO00O0o0
                public final boolean test(Object obj) {
                    return o0O000Oo.o00oOoO.o0O000O(str, (ComponentName) obj);
                }
            });
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooOOo(@oo0oO0 final String str) {
            str.getClass();
            o00ooOO(new oO00O0o0() { // from class: o00ooo0.o0O00OO
                @Override // o0ooOoOO.oO00O0o0
                public final boolean test(Object obj) {
                    return o0O000Oo.o00oOoO.o0OoOoOo(str, (Uri) obj);
                }
            });
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public <T> o00oOoO o00ooOo(@oo0oO0 String str, @oo0oO0 final Class<T> cls, @oo0oO0 final oO00O0o0<T> oo00o0o0) {
            str.getClass();
            cls.getClass();
            oo00o0o0.getClass();
            return o00ooOoO(str, new oO00O0o0() { // from class: o00ooo0.o0O00O0o
                @Override // o0ooOoOO.oO00O0o0
                public final boolean test(Object obj) {
                    return o0O000Oo.o00oOoO.o0OoOoOO(cls, oo00o0o0, obj);
                }
            });
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooOo0(@oo0oO0 String str, @oo0oO0 Class<?> cls) {
            return o00ooOo(str, cls, new oO00O0o0() { // from class: o00ooo0.o0O00o00
                @Override // o0ooOoOO.oO00O0o0
                public final boolean test(Object obj) {
                    return true;
                }
            });
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooOoO(@oo0oO0 String str, @oo0oO0 oO00O0o0<Object> oo00o0o0) {
            str.getClass();
            oo00o0o0.getClass();
            oO00O0o0<Object> oo00o0o02 = this.f9602o00oOoOo.get(str);
            if (oo00o0o02 == null) {
                oo00o0o02 = new oO00O0o0() { // from class: o00ooo0.o0OoO00O
                    @Override // o0ooOoOO.oO00O0o0
                    public final boolean test(Object obj) {
                        return false;
                    }
                };
            }
            this.f9602o00oOoOo.put(str, oo00o0o02.o00oOooO(oo00o0o0));
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooOoo(@oo0oO0 final String str) {
            o00ooOo("output", Uri.class, new oO00O0o0() { // from class: o00ooo0.o0O00OOO
                @Override // o0ooOoOO.oO00O0o0
                public final boolean test(Object obj) {
                    return o0O000Oo.o00oOoO.o0O000o(str, (Uri) obj);
                }
            });
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooo0(@oo0oO0 oO00O0o0<Uri> oo00o0o0) {
            o00ooOo("android.intent.extra.STREAM", Uri.class, oo00o0o0);
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooo00(@oo0oO0 oO00O0o0<Uri> oo00o0o0) {
            o00ooOo("output", Uri.class, oo00o0o0);
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooo0O(@oo0oO0 final String str) {
            str.getClass();
            o00ooOo("android.intent.extra.STREAM", Uri.class, new oO00O0o0() { // from class: o00ooo0.o0ooO
                @Override // o0ooOoOO.oO00O0o0
                public final boolean test(Object obj) {
                    return o0O000Oo.o00oOoO.o0ooOoOO(str, (Uri) obj);
                }
            });
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooo0o(int i) {
            this.f9594o00oOOo0 = i | this.f9594o00oOOo0;
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00oooO() {
            this.f9594o00oOOo0 |= f9592o00oo0O;
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00oooOO() {
            this.f9606o00oo0 = true;
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00oooOo(@oo0oO0 String str) {
            str.getClass();
            return o00oooo0(new o0O0O0o0(str));
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00oooo() {
            this.f9594o00oOOo0 |= f9593o00oo0Oo;
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00oooo0(@oo0oO0 oO00O0o0<String> oo00o0o0) {
            oo00o0o0.getClass();
            this.f9598o00oOo0o = this.f9598o00oOo0o.o00oOooO(oo00o0o0);
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooooO() {
            this.f9609o00oo0OO = true;
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o00ooooo() {
            this.f9608o00oo0O0 = true;
            return this;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o0O00000(@oo0oO0 oO00O0o0<String> oo00o0o0) {
            oo00o0o0.getClass();
            this.f9604o00oOooO = this.f9604o00oOooO.o00oOooO(oo00o0o0);
            return this;
        }

        @oo0oO0
        @SuppressLint({"SyntheticAccessor"})
        public o0O000Oo o0O0000O() {
            boolean z = this.f9599o00oOoO;
            if (!(z && this.f9601o00oOoOO) && (z || this.f9601o00oOoOO)) {
                o0O000Oo o0o000oo = new o0O000Oo(null);
                o0o000oo.f9577o00oOOo0 = this.f9594o00oOOo0;
                o0o000oo.f9578o00oOOoO = this.f9595o00oOOoO;
                o0o000oo.f9579o00oOo00 = this.f9596o00oOo00;
                o0o000oo.f9587o00oOooO = this.f9604o00oOooO;
                o0o000oo.f9580o00oOo0O = this.f9597o00oOo0O;
                o0o000oo.f9581o00oOo0o = this.f9598o00oOo0o;
                o0o000oo.f9582o00oOoO = this.f9599o00oOoO;
                o0o000oo.f9583o00oOoO0 = this.f9600o00oOoO0;
                o0o000oo.f9584o00oOoOO = this.f9602o00oOoOo;
                o0o000oo.f9585o00oOoOo = this.f9603o00oOoo0;
                o0o000oo.f9586o00oOoo0 = this.f9605o00oOooo;
                o0o000oo.f9588o00oOooo = this.f9607o00oo00O;
                o0o000oo.f9590o00oo00O = this.f9606o00oo0;
                o0o000oo.f9589o00oo0 = this.f9609o00oo0OO;
                o0o000oo.f9591o00oo0OO = this.f9608o00oo0O0;
                return o0o000oo;
            }
            throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public o00oOoO o0O0o(@oo0oO0 oO00O0o0<String> oo00o0o0) {
            oo00o0o0.getClass();
            this.f9597o00oOo0O = this.f9597o00oOo0O.o00oOooO(oo00o0o0);
            return this;
        }
    }

    public o0O000Oo() {
    }

    public o0O000Oo(o00oOOo0 o00oooo02) {
    }

    public static /* synthetic */ void o00oOOoO(String str) {
    }

    public static /* synthetic */ void o00oo0Oo(String str) {
    }

    public static /* synthetic */ void o00oo0o0(String str) {
        throw new SecurityException(str);
    }

    @oo0oO0
    public Intent o00oo(@oo0oO0 Intent intent) {
        return o00oo0oO(intent, new o() { // from class: o00ooo0.o0OoOoOo
            @Override // o0ooOoOO.o
            public final void accept(Object obj) {
                o0O000Oo.o00oo0o0((String) obj);
            }
        });
    }

    public final void o00oo0o(Intent intent, String str, Object obj) {
        if (obj == null) {
            intent.getExtras().putString(str, null);
        } else if (obj instanceof Parcelable) {
            intent.putExtra(str, (Parcelable) obj);
        } else if (obj instanceof Parcelable[]) {
            intent.putExtra(str, (Parcelable[]) obj);
        } else if (obj instanceof Serializable) {
            intent.putExtra(str, (Serializable) obj);
        } else {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Unsupported type ");
            o00oOOo02.append(obj.getClass());
            throw new IllegalArgumentException(o00oOOo02.toString());
        }
    }

    @oo0oO0
    public Intent o00oo0oO(@oo0oO0 Intent intent, @oo0oO0 o<String> oVar) {
        String str;
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((!this.f9582o00oOoO || component != null) && !this.f9583o00oOoO0.test(component)) {
            oVar.accept("Component is not allowed: " + component);
            component = new ComponentName("android", "java.lang.Void");
        }
        intent2.setComponent(component);
        String str2 = intent.getPackage();
        if (str2 == null || this.f9581o00oOo0o.test(str2)) {
            intent2.setPackage(str2);
        } else {
            oVar.accept("Package is not allowed: " + str2);
        }
        int flags = this.f9577o00oOOo0 | intent.getFlags();
        int i = this.f9577o00oOOo0;
        if (flags == i) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i);
            oVar.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.f9577o00oOOo0)));
        }
        String action = intent.getAction();
        if (action == null || this.f9578o00oOOoO.test(action)) {
            intent2.setAction(action);
        } else {
            oVar.accept("Action is not allowed: " + action);
        }
        Uri data = intent.getData();
        if (data == null || this.f9579o00oOo00.test(data)) {
            intent2.setData(data);
        } else {
            oVar.accept("Data is not allowed: " + data);
        }
        String type = intent.getType();
        if (type == null || this.f9587o00oOooO.test(type)) {
            intent2.setDataAndType(intent2.getData(), type);
        } else {
            oVar.accept("Type is not allowed: " + type);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String str3 : categories) {
                if (this.f9580o00oOo0O.test(str3)) {
                    intent2.addCategory(str3);
                } else {
                    oVar.accept("Category is not allowed: " + str3);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str4 : extras.keySet()) {
                if (str4.equals("android.intent.extra.STREAM") && (this.f9577o00oOOo0 & 1) == 0) {
                    str = "Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.";
                } else if (!str4.equals("output") || ((~this.f9577o00oOOo0) & 3) == 0) {
                    Object obj = extras.get(str4);
                    oO00O0o0<Object> oo00o0o0 = this.f9584o00oOoOO.get(str4);
                    if (oo00o0o0 == null || !oo00o0o0.test(obj)) {
                        str = "Extra is not allowed. Key: " + str4 + ". Value: " + obj;
                    } else {
                        o00oo0o(intent2, str4, obj);
                    }
                } else {
                    str = "Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.";
                }
                oVar.accept(str);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        o00oOo00.o00oOOoO(intent, intent2, this.f9588o00oOooo, this.f9585o00oOoOo, this.f9586o00oOoo0, oVar);
        if (i2 >= 29) {
            if (this.f9590o00oo00O) {
                o00oOo0O.o00oOOoO(intent2, o00oOo0O.o00oOOo0(intent));
            } else if (o00oOo0O.o00oOOo0(intent) != null) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Identifier is not allowed: ");
                o00oOOo02.append(o00oOo0O.o00oOOo0(intent));
                oVar.accept(o00oOOo02.toString());
            }
        }
        if (this.f9589o00oo0) {
            o00oOOoO.o00oOOoO(intent2, o00oOOoO.o00oOOo0(intent));
        } else if (o00oOOoO.o00oOOo0(intent) != null) {
            StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("Selector is not allowed: ");
            o00oOOo03.append(o00oOOoO.o00oOOo0(intent));
            oVar.accept(o00oOOo03.toString());
        }
        if (this.f9591o00oo0OO) {
            intent2.setSourceBounds(intent.getSourceBounds());
        } else if (intent.getSourceBounds() != null) {
            StringBuilder o00oOOo04 = android.support.v4.media.o00oOo0O.o00oOOo0("SourceBounds is not allowed: ");
            o00oOOo04.append(intent.getSourceBounds());
            oVar.accept(o00oOOo04.toString());
        }
        return intent2;
    }

    @oo0oO0
    public Intent o0O0o(@oo0oO0 Intent intent) {
        return o00oo0oO(intent, new o() { // from class: o00ooo0.o0O000O
            @Override // o0ooOoOO.o
            public final void accept(Object obj) {
                String str = (String) obj;
            }
        });
    }
}
