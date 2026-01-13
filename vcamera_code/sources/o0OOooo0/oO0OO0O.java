package o0OOooo0;

import dalvik.system.PathClassLoader;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class oO0OO0O extends PathClassLoader {
    public oO0OO0O(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    public oO0OO0O(String str, String str2, ClassLoader classLoader) {
        super(str, str2, classLoader);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        return super.findClass(str);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public URL findResource(String str) {
        return super.findResource(str);
    }

    @Override // java.lang.ClassLoader
    public URL getResource(String str) {
        URL resource = Object.class.getClassLoader().getResource(str);
        if (resource != null) {
            return resource;
        }
        URL findResource = findResource(str);
        if (findResource != null) {
            return findResource;
        }
        ClassLoader parent = getParent();
        if (parent == null) {
            return null;
        }
        return parent.getResource(str);
    }

    @Override // java.lang.ClassLoader
    public Enumeration<URL> getResources(String str) throws IOException {
        Enumeration[] enumerationArr = new Enumeration[3];
        enumerationArr[0] = Object.class.getClassLoader().getResources(str);
        enumerationArr[1] = findResources(str);
        enumerationArr[2] = getParent() == null ? null : getParent().getResources(str);
        return new oO0OO00(enumerationArr);
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        Class<?> findLoadedClass = findLoadedClass(str);
        if (findLoadedClass != null) {
            return findLoadedClass;
        }
        try {
            try {
                return Object.class.getClassLoader().loadClass(str);
            } catch (ClassNotFoundException e) {
                try {
                    return getParent().loadClass(str);
                } catch (ClassNotFoundException unused) {
                    throw e;
                }
            }
        } catch (ClassNotFoundException unused2) {
            return findClass(str);
        }
    }

    public URL o00oOOo0(String str) {
        return super.getResource(str);
    }

    public Enumeration<URL> o00oOOoO(String str) throws IOException {
        return super.getResources(str);
    }

    public Class<?> o00oOo00(String str, boolean z) throws ClassNotFoundException {
        return super.loadClass(str, z);
    }
}
