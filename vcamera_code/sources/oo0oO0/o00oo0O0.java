package oo0oO0;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import oo0oO0.o00oOOo0;
/* loaded from: classes2.dex */
public final class o00oo0O0 {
    public static boolean o00oOOo0(@o0OO00OO Activity activity, boolean z) {
        if (activity == null) {
            if (z) {
                throw new IllegalArgumentException("The instance of the context must be an activity object");
            }
            return false;
        } else if (activity.isFinishing()) {
            if (z) {
                throw new IllegalStateException("The activity has been finishing, please manually determine the status of the activity");
            }
            return false;
        } else if (activity.isDestroyed()) {
            if (z) {
                throw new IllegalStateException("The activity has been destroyed, please manually determine the status of the activity");
            }
            return false;
        } else {
            return true;
        }
    }

    public static void o00oOOoO(@oo0oO0 List<String> list) {
        if (o0O00O.o00oOo0O(list, o00oo0.f17330o00oo0O0)) {
            if (o0O00O.o00oOo0O(list, o00oo0.f17330o00oo0O0) && !o0O00O.o00oOo0O(list, o00oo0.f17313o0)) {
                throw new IllegalArgumentException("Applying for background sensor permissions must contain android.permission.BODY_SENSORS");
            }
            for (String str : list) {
                if (o0O00O.o00oOo0o(str, o00oo0.f17326o00oo)) {
                    throw new IllegalArgumentException("Applying for permissions android.permission.BODY_SENSORS_BACKGROUND and android.permission.ACCESS_BACKGROUND_LOCATION at the same time is not supported");
                }
                if (o0O00O.o00oOo0o(str, o00oo0.f17337o00ooO0)) {
                    throw new IllegalArgumentException("Applying for permissions android.permission.BODY_SENSORS_BACKGROUND and android.permission.ACCESS_MEDIA_LOCATION at the same time is not supported");
                }
            }
        }
    }

    public static void o00oOo00(@oo0oO0 List<String> list) {
        if (o0O00O.o00oOo0O(list, o00oo0.f17326o00oo)) {
            if (o0O00O.o00oOo0O(list, o00oo0.f17346o00ooOoO) && !o0O00O.o00oOo0O(list, o00oo0.f17344o00ooOo)) {
                throw new IllegalArgumentException("Applying for background positioning permissions must include android.permission.ACCESS_FINE_LOCATION");
            }
            for (String str : list) {
                if (!o0O00O.o00oOo0o(str, o00oo0.f17344o00ooOo) && !o0O00O.o00oOo0o(str, o00oo0.f17346o00ooOoO) && !o0O00O.o00oOo0o(str, o00oo0.f17326o00oo)) {
                    throw new IllegalArgumentException("Because it includes background location permissions, do not apply for permissions unrelated to location");
                }
            }
        }
    }

    public static void o00oOo0O(@oo0oO0 List<o00oOOo0.o00oOo00> list, String str, int i) {
        o00oOOo0.o00oOo00 o00ooo002;
        Iterator<o00oOOo0.o00oOo00> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                o00ooo002 = null;
                break;
            }
            o00ooo002 = it.next();
            if (TextUtils.equals(o00ooo002.f17270o00oOOo0, str)) {
                break;
            }
        }
        if (o00ooo002 == null) {
            throw new IllegalStateException(android.support.v4.media.o00oOoO.o00oOOo0("Please register permissions in the AndroidManifest.xml file <uses-permission android:name=\"", str, "\" />"));
        }
        int i2 = o00ooo002.f17271o00oOOoO;
        if (i2 < i) {
            StringBuilder sb = new StringBuilder();
            sb.append("The AndroidManifest.xml file <uses-permission android:name=\"");
            sb.append(str);
            sb.append("\" android:maxSdkVersion=\"");
            sb.append(i2);
            sb.append("\" /> does not meet the requirements, ");
            sb.append(i != Integer.MAX_VALUE ? android.support.v4.media.o00oOOo0.o00oOOo0("the minimum requirement for maxSdkVersion is ", i) : o00ooO0.o00oOoO.o00oOOo0("please delete the android:maxSdkVersion=\"", i2, "\" attribute"));
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void o00oOo0o(@oo0oO0 Context context, @oo0oO0 List<String> list, @o0OO00OO o00oOOo0 o00oooo02) {
        if (o00oooo02 == null) {
            return;
        }
        List<o00oOOo0.o00oOo00> list2 = o00oooo02.f17261o00oOo00;
        if (list2.isEmpty()) {
            throw new IllegalStateException("No permissions are registered in the AndroidManifest.xml file");
        }
        int i = context.getApplicationInfo().minSdkVersion;
        for (String str : list) {
            if (!o0O00O.o00oOo0o(str, o00oo0.f17328o00oo00O) && !o0O00O.o00oOo0o(str, o00oo0.f17323o00oOoo0) && !o0O00O.o00oOo0o(str, o00oo0.f17325o00oOooo) && !o0O00O.o00oOo0o(str, o00oo0.f17317o00oOo0O)) {
                if (o0O00O.o00oOo0o(str, o00oo0.f17330o00oo0O0)) {
                    str = o00oo0.f17313o0;
                } else if (!o0O00O.o00oOo0o(str, o00oo0.f17326o00oo)) {
                    if (i < 33) {
                        if (o0O00O.o00oOo0o(str, o00oo0.f17329o00oo0O) || o0O00O.o00oOo0o(str, o00oo0.f17332o00oo0Oo) || o0O00O.o00oOo0o(str, o00oo0.f17334o00oo0o0)) {
                            o00oOo0O(list2, o00oo0.f17342o00ooOO0, 32);
                            o00oOo0O(list2, o00oo0.f17341o00ooOO, 32);
                        } else if (o0O00O.o00oOo0o(str, o00oo0.f17331o00oo0OO)) {
                            o00oOo0O(list2, o00oo0.f17344o00ooOo, 32);
                        }
                    }
                    if (i < 31) {
                        if (o0O00O.o00oOo0o(str, o00oo0.f17333o00oo0o)) {
                            o00oOo0O(list2, "android.permission.BLUETOOTH_ADMIN", 30);
                            o00oOo0O(list2, o00oo0.f17344o00ooOo, 30);
                        } else if (o0O00O.o00oOo0o(str, o00oo0.f17335o00oo0oO)) {
                            o00oOo0O(list2, "android.permission.BLUETOOTH", 30);
                        } else if (o0O00O.o00oOo0o(str, o00oo0.f17364o0O0o)) {
                            o00oOo0O(list2, "android.permission.BLUETOOTH_ADMIN", 30);
                        }
                    }
                    if (i < 30 && o0O00O.o00oOo0o(str, o00oo0.f17316o00oOo00)) {
                        o00oOo0O(list2, o00oo0.f17342o00ooOO0, 29);
                        o00oOo0O(list2, o00oo0.f17341o00ooOO, 29);
                    } else if (i < 26 && o0O00O.o00oOo0o(str, o00oo0.f17340o00ooO0o)) {
                        o00oOo0O(list2, o00oo0.f17352o00oooO, 25);
                    } else if (o0O00O.o00oOo0o(str, o00oo0.f17314o00oOOo0)) {
                        o00oOooO(list2, "android.permission.QUERY_ALL_PACKAGES");
                    }
                } else if (o00oOo00.o00oOOoO(context) >= 31) {
                    o00oOo0O(list2, o00oo0.f17344o00ooOo, 30);
                    str = o00oo0.f17346o00ooOoO;
                } else {
                    o00oOooO(list2, o00oo0.f17344o00ooOo);
                }
                o00oOooO(list2, str);
            }
        }
    }

    public static void o00oOoO(@oo0oO0 List<String> list, @o0OO00OO o00oOOo0 o00oooo02) {
        if ((!o0O00O.o00oOo0O(list, o00oo0.f17333o00oo0o) && !o0O00O.o00oOo0O(list, o00oo0.f17331o00oo0OO)) || o0O00O.o00oOo0O(list, o00oo0.f17344o00ooOo) || o00oooo02 == null) {
            return;
        }
        for (o00oOOo0.o00oOo00 o00ooo002 : o00oooo02.f17261o00oOo00) {
            if (o0O00O.o00oOo0o(o00ooo002.f17270o00oOOo0, o00oo0.f17333o00oo0o) || o0O00O.o00oOo0o(o00ooo002.f17270o00oOOo0, o00oo0.f17331o00oo0OO)) {
                if (!o00ooo002.o00oOOo0()) {
                    String o00oOOo02 = o00ooo002.f17271o00oOOoO != Integer.MAX_VALUE ? android.support.v4.media.o00oOo00.o00oOOo0(android.support.v4.media.o00oOo0O.o00oOOo0("android:maxSdkVersion=\""), o00ooo002.f17271o00oOOoO, "\" ") : "";
                    StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("If your app doesn't use ");
                    o00oOOo03.append(o00ooo002.f17270o00oOOo0);
                    o00oOOo03.append(" to get physical location, please change the <uses-permission android:name=\"");
                    o00oOOo03.append(o00ooo002.f17270o00oOOo0);
                    o00oOOo03.append("\" ");
                    o00oOOo03.append(o00oOOo02);
                    o00oOOo03.append("/> node in the manifest file to <uses-permission android:name=\"");
                    o00oOOo03.append(o00ooo002.f17270o00oOOo0);
                    o00oOOo03.append("\" android:usesPermissionFlags=\"neverForLocation\" ");
                    o00oOOo03.append(o00oOOo02);
                    o00oOOo03.append("/> node, if your app need use ");
                    o00oOOo03.append(o00ooo002.f17270o00oOOo0);
                    o00oOOo03.append(" to get physical location, also need to add ");
                    o00oOOo03.append(o00oo0.f17344o00ooOo);
                    o00oOOo03.append(" permissions");
                    throw new IllegalArgumentException(o00oOOo03.toString());
                }
            }
        }
    }

    public static void o00oOoO0(@oo0oO0 Context context, @oo0oO0 List<String> list) {
        if (o0O00O.o00oOo0O(list, o00oo0.f17337o00ooO0)) {
            for (String str : list) {
                if (!o0O00O.o00oOo0o(str, o00oo0.f17337o00ooO0) && !o0O00O.o00oOo0o(str, o00oo0.f17329o00oo0O) && !o0O00O.o00oOo0o(str, o00oo0.f17342o00ooOO0) && !o0O00O.o00oOo0o(str, o00oo0.f17341o00ooOO) && !o0O00O.o00oOo0o(str, o00oo0.f17316o00oOo00)) {
                    throw new IllegalArgumentException("Because it includes access media location permissions, do not apply for permissions unrelated to access media location");
                }
            }
            if (o00oOo00.o00oOOoO(context) >= 33) {
                if (!o0O00O.o00oOo0O(list, o00oo0.f17329o00oo0O) && !o0O00O.o00oOo0O(list, o00oo0.f17316o00oOo00)) {
                    throw new IllegalArgumentException("You must add android.permission.READ_MEDIA_IMAGES or android.permission.MANAGE_EXTERNAL_STORAGE rights to apply for android.permission.ACCESS_MEDIA_LOCATION rights");
                }
            } else if (!o0O00O.o00oOo0O(list, o00oo0.f17342o00ooOO0) && !o0O00O.o00oOo0O(list, o00oo0.f17316o00oOo00)) {
                throw new IllegalArgumentException("You must add android.permission.READ_EXTERNAL_STORAGE or android.permission.MANAGE_EXTERNAL_STORAGE rights to apply for android.permission.ACCESS_MEDIA_LOCATION rights");
            }
        }
    }

    public static void o00oOoOO(@oo0oO0 List<String> list, @o0OO00OO o00oOOo0 o00oooo02) {
        if (o0O00O.o00oOo0O(list, o00oo0.f17323o00oOoo0) && o00oooo02 != null) {
            List<o00oOOo0.o00oOo0O> list2 = o00oooo02.f17263o00oOo0o;
            for (int i = 0; i < list2.size(); i++) {
                if (TextUtils.equals(list2.get(i).f17274o00oOOoO, o00oo0.f17323o00oOoo0)) {
                    return;
                }
            }
            throw new IllegalArgumentException("No service registered permission attribute, please register <service android:permission=\"android.permission.BIND_NOTIFICATION_LISTENER_SERVICE\" > in AndroidManifest.xml");
        }
    }

    public static boolean o00oOoOo(@o0OO00OO List<String> list, boolean z) {
        if (list == null || list.isEmpty()) {
            if (z) {
                throw new IllegalArgumentException("The requested permission cannot be empty");
            }
            return false;
        }
        if (Build.VERSION.SDK_INT <= 33 && z) {
            ArrayList arrayList = new ArrayList();
            Field[] declaredFields = o00oo0.class.getDeclaredFields();
            if (declaredFields.length == 0) {
                return true;
            }
            for (Field field : declaredFields) {
                if (String.class.equals(field.getType())) {
                    try {
                        arrayList.add((String) field.get(null));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            for (String str : list) {
                if (!o0O00O.o00oOo0O(arrayList, str)) {
                    throw new IllegalArgumentException(android.support.v4.media.o00oOoO.o00oOOo0("The ", str, " is not a dangerous permission or special permission, please do not request dynamically"));
                }
            }
        }
        return true;
    }

    public static void o00oOoo0(@oo0oO0 Activity activity, @oo0oO0 List<String> list, @o0OO00OO o00oOOo0 o00oooo02) {
        if (o0O00O.o00oOo0O(list, o00oo0.f17317o00oOo0O) && o00oooo02 != null) {
            List<o00oOOo0.C0227o00oOOo0> list2 = o00oooo02.f17262o00oOo0O;
            for (int i = 0; i < list2.size(); i++) {
                if (list2.get(i).f17266o00oOOoO) {
                    return;
                }
            }
            throw new IllegalArgumentException(android.support.v4.media.o00oOoO.o00oOOo0("No activity registered supportsPictureInPicture attribute, please register \n<activity android:name=\"", activity.getClass().getName().replace(activity.getPackageName(), ""), "\" android:supportsPictureInPicture=\"true\" > in AndroidManifest.xml"));
        }
    }

    public static void o00oOooO(@oo0oO0 List<o00oOOo0.o00oOo00> list, String str) {
        o00oOo0O(list, str, Integer.MAX_VALUE);
    }

    public static void o00oOooo(@oo0oO0 Context context, @oo0oO0 List<String> list, @o0OO00OO o00oOOo0 o00oooo02) {
        o00oOOo0.o00oOOoO o00ooooo2;
        if (o0O00O.o00oOo0O(list, o00oo0.f17329o00oo0O) || o0O00O.o00oOo0O(list, o00oo0.f17332o00oo0Oo) || o0O00O.o00oOo0O(list, o00oo0.f17334o00oo0o0) || o0O00O.o00oOo0O(list, o00oo0.f17316o00oOo00) || o0O00O.o00oOo0O(list, o00oo0.f17342o00ooOO0) || o0O00O.o00oOo0O(list, o00oo0.f17341o00ooOO)) {
            if (o00oOo00.o00oOOoO(context) >= 33 && (o0O00O.o00oOo0O(list, o00oo0.f17342o00ooOO0) || o0O00O.o00oOo0O(list, o00oo0.f17341o00ooOO))) {
                throw new IllegalArgumentException("When targetSdkVersion >= 33 should use android.permission.READ_MEDIA_IMAGES, android.permission.READ_MEDIA_VIDEO, android.permission.READ_MEDIA_AUDIO instead of android.permission.READ_EXTERNAL_STORAGE, android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (o0O00O.o00oOo0O(list, o00oo0.f17329o00oo0O) || o0O00O.o00oOo0O(list, o00oo0.f17337o00ooO0) || o00oooo02 == null || (o00ooooo2 = o00oooo02.f17264o00oOooO) == null) {
                return;
            }
            boolean o00oo0OO2 = o0O00O.o00oo0OO(context);
            int o00oOOoO2 = o00oOo00.o00oOOoO(context);
            boolean z = o00ooooo2.f17268o00oOOoO;
            if (o00oOOoO2 >= 29 && !z && (o0O00O.o00oOo0O(list, o00oo0.f17316o00oOo00) || !o00oo0OO2)) {
                throw new IllegalStateException("Please register the android:requestLegacyExternalStorage=\"true\" attribute in the AndroidManifest.xml file, otherwise it will cause incompatibility with the old version");
            }
            if (o00oOOoO2 >= 30 && !o0O00O.o00oOo0O(list, o00oo0.f17316o00oOo00) && !o00oo0OO2) {
                throw new IllegalArgumentException("The storage permission application is abnormal. If you have adapted the scope storage, please register the <meta-data android:name=\"ScopedStorage\" android:value=\"true\" /> attribute in the AndroidManifest.xml file. If there is no adaptation scope storage, please use android.permission.MANAGE_EXTERNAL_STORAGE to apply for permission");
            }
        }
    }

    public static void o00oo0(@oo0oO0 List<String> list) {
        if (!o00oOo00.o00oOo0o()) {
            if (o0O00O.o00oOo0O(list, o00oo0.f17327o00oo0) && !o0O00O.o00oOo0O(list, o00oo0.f17328o00oo00O)) {
                list.add(o00oo0.f17328o00oo00O);
            }
            if (o0O00O.o00oOo0O(list, o00oo0.f17331o00oo0OO) && !o0O00O.o00oOo0O(list, o00oo0.f17344o00ooOo)) {
                list.add(o00oo0.f17344o00ooOo);
            }
            if (o0O00O.o00oOo0O(list, o00oo0.f17329o00oo0O) || o0O00O.o00oOo0O(list, o00oo0.f17332o00oo0Oo) || o0O00O.o00oOo0O(list, o00oo0.f17334o00oo0o0)) {
                if (!o0O00O.o00oOo0O(list, o00oo0.f17342o00ooOO0)) {
                    list.add(o00oo0.f17342o00ooOO0);
                }
                if (!o0O00O.o00oOo0O(list, o00oo0.f17341o00ooOO)) {
                    list.add(o00oo0.f17341o00ooOO);
                }
            }
        }
        if (!o00oOo00.o00oOo0O() && o0O00O.o00oOo0O(list, o00oo0.f17333o00oo0o) && !o0O00O.o00oOo0O(list, o00oo0.f17344o00ooOo)) {
            list.add(o00oo0.f17344o00ooOo);
        }
        if (o0O00O.o00oOo0O(list, o00oo0.f17316o00oOo00)) {
            if (o0O00O.o00oOo0O(list, o00oo0.f17342o00ooOO0) || o0O00O.o00oOo0O(list, o00oo0.f17341o00ooOO)) {
                throw new IllegalArgumentException("If you have applied for MANAGE_EXTERNAL_STORAGE permissions, do not apply for the READ_EXTERNAL_STORAGE and WRITE_EXTERNAL_STORAGE permissions");
            }
            if (!o00oOo00.o00oOooO()) {
                list.add(o00oo0.f17342o00ooOO0);
                list.add(o00oo0.f17341o00ooOO);
            }
        }
        if (o00oOo00.o00oOo00() || !o0O00O.o00oOo0O(list, o00oo0.f17338o00ooO00) || o0O00O.o00oOo0O(list, o00oo0.f17313o0)) {
            return;
        }
        list.add(o00oo0.f17313o0);
    }

    public static void o00oo00O(@oo0oO0 Context context, @oo0oO0 List<String> list) {
        int i = (o0O00O.o00oOo0O(list, o00oo0.f17327o00oo0) || o0O00O.o00oOo0O(list, o00oo0.f17331o00oo0OO) || o0O00O.o00oOo0O(list, o00oo0.f17330o00oo0O0) || o0O00O.o00oOo0O(list, o00oo0.f17329o00oo0O) || o0O00O.o00oOo0O(list, o00oo0.f17332o00oo0Oo) || o0O00O.o00oOo0O(list, o00oo0.f17334o00oo0o0)) ? 33 : (o0O00O.o00oOo0O(list, o00oo0.f17333o00oo0o) || o0O00O.o00oOo0O(list, o00oo0.f17335o00oo0oO) || o0O00O.o00oOo0O(list, o00oo0.f17364o0O0o) || o0O00O.o00oOo0O(list, o00oo0.f17315o00oOOoO)) ? 31 : o0O00O.o00oOo0O(list, o00oo0.f17316o00oOo00) ? 30 : (o0O00O.o00oOo0O(list, o00oo0.f17326o00oo) || o0O00O.o00oOo0O(list, o00oo0.f17338o00ooO00) || o0O00O.o00oOo0O(list, o00oo0.f17337o00ooO0)) ? 29 : o0O00O.o00oOo0O(list, o00oo0.f17339o00ooO0O) ? 28 : (o0O00O.o00oOo0O(list, o00oo0.f17324o00oOooO) || o0O00O.o00oOo0O(list, o00oo0.f17336o00ooO) || o0O00O.o00oOo0O(list, o00oo0.f17340o00ooO0o) || o0O00O.o00oOo0O(list, o00oo0.f17317o00oOo0O)) ? 26 : 23;
        if (o00oOo00.o00oOOoO(context) < i) {
            throw new RuntimeException(o00ooO0.o00oOoO.o00oOOo0("The targetSdkVersion SDK must be ", i, " or more, if you do not want to upgrade targetSdkVersion, please apply with the old permissions"));
        }
    }
}
