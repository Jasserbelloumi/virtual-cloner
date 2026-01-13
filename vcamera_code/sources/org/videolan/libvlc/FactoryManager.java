package org.videolan.libvlc;

import java.util.HashMap;
import java.util.Map;
import org.videolan.libvlc.interfaces.IComponentFactory;
import org.videolan.libvlc.interfaces.ILibVLCFactory;
import org.videolan.libvlc.interfaces.IMediaFactory;
/* loaded from: classes3.dex */
public class FactoryManager {
    private static Map<String, IComponentFactory> factories = new HashMap();

    public static IComponentFactory getFactory(String str) {
        IComponentFactory iComponentFactory = factories.get(str);
        if (iComponentFactory == null) {
            String str2 = IMediaFactory.factoryId;
            if (str.equals(str2)) {
                registerFactory(str2, new MediaFactory());
            }
            String str3 = ILibVLCFactory.factoryId;
            if (str.equals(str3)) {
                registerFactory(str3, new LibVLCFactory());
            }
            return factories.get(str);
        }
        return iComponentFactory;
    }

    public static void registerFactory(String str, IComponentFactory iComponentFactory) {
        factories.put(str, iComponentFactory);
    }
}
