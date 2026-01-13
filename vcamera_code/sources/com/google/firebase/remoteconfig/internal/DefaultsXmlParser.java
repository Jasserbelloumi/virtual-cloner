package com.google.firebase.remoteconfig.internal;
/* loaded from: classes2.dex */
public class DefaultsXmlParser {
    private static final String XML_TAG_ENTRY = "entry";
    private static final String XML_TAG_KEY = "key";
    private static final String XML_TAG_VALUE = "value";

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
        if (r9 == 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
        r4 = r8.getText();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0073, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0073, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> getDefaultsFromXml(android.content.Context r8, int r9) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.res.Resources r8 = r8.getResources()     // Catch: java.lang.Throwable -> L78
            if (r8 != 0) goto Lc
            return r0
        Lc:
            android.content.res.XmlResourceParser r8 = r8.getXml(r9)     // Catch: java.lang.Throwable -> L78
            int r9 = r8.getEventType()     // Catch: java.lang.Throwable -> L78
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L18:
            r5 = 1
            if (r9 == r5) goto L78
            r6 = 2
            if (r9 != r6) goto L23
            java.lang.String r2 = r8.getName()     // Catch: java.lang.Throwable -> L78
            goto L73
        L23:
            r6 = 3
            if (r9 != r6) goto L3d
            java.lang.String r9 = r8.getName()     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "entry"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> L78
            if (r9 == 0) goto L3b
            if (r3 == 0) goto L39
            if (r4 == 0) goto L39
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L78
        L39:
            r3 = r1
            r4 = r3
        L3b:
            r2 = r1
            goto L73
        L3d:
            r6 = 4
            if (r9 != r6) goto L73
            if (r2 == 0) goto L73
            r9 = -1
            int r6 = r2.hashCode()     // Catch: java.lang.Throwable -> L78
            r7 = 106079(0x19e5f, float:1.48648E-40)
            if (r6 == r7) goto L5c
            r7 = 111972721(0x6ac9171, float:6.4912916E-35)
            if (r6 == r7) goto L52
            goto L65
        L52:
            java.lang.String r6 = "value"
            boolean r6 = r2.equals(r6)     // Catch: java.lang.Throwable -> L78
            if (r6 == 0) goto L65
            r9 = r5
            goto L65
        L5c:
            java.lang.String r6 = "key"
            boolean r6 = r2.equals(r6)     // Catch: java.lang.Throwable -> L78
            if (r6 == 0) goto L65
            r9 = 0
        L65:
            if (r9 == 0) goto L6f
            if (r9 == r5) goto L6a
            goto L73
        L6a:
            java.lang.String r4 = r8.getText()     // Catch: java.lang.Throwable -> L78
            goto L73
        L6f:
            java.lang.String r3 = r8.getText()     // Catch: java.lang.Throwable -> L78
        L73:
            int r9 = r8.next()     // Catch: java.lang.Throwable -> L78
            goto L18
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.DefaultsXmlParser.getDefaultsFromXml(android.content.Context, int):java.util.Map");
    }
}
