package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.util.Util;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class ProgramInformation {
    @o0OO00OO
    public final String copyright;
    @o0OO00OO
    public final String lang;
    @o0OO00OO
    public final String moreInformationURL;
    @o0OO00OO
    public final String source;
    @o0OO00OO
    public final String title;

    public ProgramInformation(@o0OO00OO String str, @o0OO00OO String str2, @o0OO00OO String str3, @o0OO00OO String str4, @o0OO00OO String str5) {
        this.title = str;
        this.source = str2;
        this.copyright = str3;
        this.moreInformationURL = str4;
        this.lang = str5;
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProgramInformation) {
            ProgramInformation programInformation = (ProgramInformation) obj;
            return Util.areEqual(this.title, programInformation.title) && Util.areEqual(this.source, programInformation.source) && Util.areEqual(this.copyright, programInformation.copyright) && Util.areEqual(this.moreInformationURL, programInformation.moreInformationURL) && Util.areEqual(this.lang, programInformation.lang);
        }
        return false;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.source;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.copyright;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.moreInformationURL;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.lang;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
