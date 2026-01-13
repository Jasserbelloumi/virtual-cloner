package o00ooO00;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.media.o00oOOo0;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
/* loaded from: classes.dex */
public class o00oOoO {
    public static void o00oOOo0(ViewGroup.LayoutParams layoutParams, String str) {
        Field[] fields;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(".(");
        o00oOOo02.append(stackTraceElement.getFileName());
        o00oOOo02.append(":");
        o00oOOo02.append(stackTraceElement.getLineNumber());
        o00oOOo02.append(") ");
        o00oOOo02.append(str);
        o00oOOo02.append("  ");
        String sb = o00oOOo02.toString();
        System.out.println(" >>>>>>>>>>>>>>>>>>. dump " + sb + "  " + layoutParams.getClass().getName());
        for (Field field : layoutParams.getClass().getFields()) {
            try {
                Object obj = field.get(layoutParams);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals("-1")) {
                    System.out.println(sb + "       " + name + " " + obj);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + sb);
    }

    public static void o00oOOoO(ViewGroup viewGroup, String str) {
        Field[] fields;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(".(");
        o00oOOo02.append(stackTraceElement.getFileName());
        o00oOOo02.append(":");
        o00oOOo02.append(stackTraceElement.getLineNumber());
        o00oOOo02.append(") ");
        o00oOOo02.append(str);
        o00oOOo02.append("  ");
        String sb = o00oOOo02.toString();
        int childCount = viewGroup.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            PrintStream printStream = System.out;
            StringBuilder o00oOOo03 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(sb, "     ");
            o00oOOo03.append(o00oOoo0(childAt));
            printStream.println(o00oOOo03.toString());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            for (Field field : layoutParams.getClass().getFields()) {
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        System.out.println(sb + "       " + field.getName() + " " + obj);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void o00oOo00(Object obj) {
        Field[] fields;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(".(");
        o00oOOo02.append(stackTraceElement.getFileName());
        o00oOOo02.append(":");
        o00oOOo02.append(stackTraceElement.getLineNumber());
        o00oOOo02.append(")");
        String sb = o00oOOo02.toString();
        Class<?> cls = obj.getClass();
        PrintStream printStream = System.out;
        StringBuilder o00oOOo03 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(sb, "------------- ");
        o00oOOo03.append(cls.getName());
        o00oOOo03.append(" --------------------");
        printStream.println(o00oOOo03.toString());
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof Integer) || !obj2.toString().equals(SessionDescription.SUPPORTED_SDP_VERSION)) && ((!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    System.out.println(sb + "    " + field.getName() + " " + obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        PrintStream printStream2 = System.out;
        StringBuilder o00oOOo04 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(sb, "------------- ");
        o00oOOo04.append(cls.getSimpleName());
        o00oOOo04.append(" --------------------");
        printStream2.println(o00oOOo04.toString());
    }

    public static String o00oOo0O(int i) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[i + 2];
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(".(");
        o00oOOo02.append(stackTraceElement.getFileName());
        o00oOOo02.append(":");
        o00oOOo02.append(stackTraceElement.getLineNumber());
        o00oOOo02.append(")");
        return o00oOOo02.toString();
    }

    public static String o00oOo0o() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(".(");
        o00oOOo02.append(stackTraceElement.getFileName());
        o00oOOo02.append(":");
        o00oOOo02.append(stackTraceElement.getLineNumber());
        o00oOOo02.append(") ");
        o00oOOo02.append(stackTraceElement.getMethodName());
        o00oOOo02.append("()");
        return o00oOOo02.toString();
    }

    public static String o00oOoO() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(".(");
        o00oOOo02.append(stackTraceElement.getFileName());
        o00oOOo02.append(":");
        o00oOOo02.append(stackTraceElement.getLineNumber());
        o00oOOo02.append(")");
        return o00oOOo02.toString();
    }

    public static String o00oOoO0() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(".(");
        o00oOOo02.append(stackTraceElement.getFileName());
        o00oOOo02.append(":");
        o00oOOo02.append(stackTraceElement.getLineNumber());
        o00oOOo02.append(")");
        return o00oOOo02.toString();
    }

    public static String o00oOoOO(Context context, int i) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (Exception unused) {
                return o00oOOo0.o00oOOo0("?", i);
            }
        }
        return "UNKNOWN";
    }

    public static String o00oOoOo(Context context, int[] iArr) {
        String str;
        try {
            String str2 = iArr.length + "[";
            int i = 0;
            while (i < iArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(i == 0 ? "" : " ");
                String sb2 = sb.toString();
                try {
                    str = context.getResources().getResourceEntryName(iArr[i]);
                } catch (Resources.NotFoundException unused) {
                    str = "? " + iArr[i] + " ";
                }
                str2 = sb2 + str;
                i++;
            }
            return str2 + "]";
        } catch (Exception e) {
            e.toString();
            return "UNKNOWN";
        }
    }

    public static String o00oOoo0(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String o00oOooO(MotionEvent motionEvent) {
        Field[] fields;
        int action = motionEvent.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String o00oOooo(o0O000Oo o0o000oo, int i) {
        return i == -1 ? "UNDEFINED" : o0o000oo.getContext().getResources().getResourceEntryName(i);
    }

    public static void o00oo0(String str, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str2 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(".(");
            o00oOOo02.append(stackTrace[i2].getFileName());
            o00oOOo02.append(":");
            o00oOOo02.append(stackTrace[i2].getLineNumber());
            o00oOOo02.append(") ");
            String sb = o00oOOo02.toString();
            str2 = o00oOoOo.o00oo.o00oOOo0(str2, " ");
            PrintStream printStream = System.out;
            printStream.println(str + str2 + sb + str2);
        }
    }

    public static void o00oo00O(String str, String str2, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str3 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            stackTrace[i2].getFileName();
            stackTrace[i2].getLineNumber();
            stackTrace[i2].getMethodName();
            str3 = str3 + " ";
        }
    }
}
