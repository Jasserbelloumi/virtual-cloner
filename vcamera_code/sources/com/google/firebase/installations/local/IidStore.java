package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import androidx.fragment.app.o0O00;
import com.google.android.gms.stats.CodePackage;
import com.google.common.base.Ascii;
import com.google.firebase.FirebaseApp;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class IidStore {
    private static final String[] ALLOWABLE_SCOPES = {"*", "FCM", CodePackage.GCM, ""};
    private static final String IID_SHARED_PREFS_NAME = "com.google.android.gms.appid";
    private static final String JSON_ENCODED_PREFIX = "{";
    private static final String JSON_TOKEN_KEY = "token";
    private static final String STORE_KEY_ID = "|S|id";
    private static final String STORE_KEY_PUB = "|S||P|";
    private static final String STORE_KEY_SEPARATOR = "|";
    private static final String STORE_KEY_TOKEN = "|T|";
    private final String defaultSenderId;
    @o0O0OOOo("iidPrefs")
    private final SharedPreferences iidPrefs;

    @o0o0000
    public IidStore(@oo0oO0 SharedPreferences sharedPreferences, @o0OO00OO String str) {
        this.iidPrefs = sharedPreferences;
        this.defaultSenderId = str;
    }

    public IidStore(@oo0oO0 FirebaseApp firebaseApp) {
        this.iidPrefs = firebaseApp.getApplicationContext().getSharedPreferences(IID_SHARED_PREFS_NAME, 0);
        this.defaultSenderId = getDefaultSenderId(firebaseApp);
    }

    private String createTokenKey(@oo0oO0 String str, @oo0oO0 String str2) {
        return o0O00.o00oOOo0(STORE_KEY_TOKEN, str, "|", str2);
    }

    private static String getDefaultSenderId(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (applicationId.startsWith("1:") || applicationId.startsWith("2:")) {
            String[] split = applicationId.split(":");
            if (split.length != 4) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return applicationId;
    }

    @o0OO00OO
    private static String getIdFromPublicKey(@oo0oO0 PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & Ascii.SI) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private String parseIidTokenFromJson(String str) {
        try {
            return new JSONObject(str).getString(JSON_TOKEN_KEY);
        } catch (JSONException unused) {
            return null;
        }
    }

    @o0OO00OO
    private PublicKey parseKey(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.toString();
            return null;
        }
    }

    @o0OO00OO
    private String readInstanceIdFromLocalStorage() {
        String string;
        synchronized (this.iidPrefs) {
            string = this.iidPrefs.getString(STORE_KEY_ID, null);
        }
        return string;
    }

    @o0OO00OO
    private String readPublicKeyFromLocalStorageAndCalculateInstanceId() {
        synchronized (this.iidPrefs) {
            String string = this.iidPrefs.getString(STORE_KEY_PUB, null);
            if (string == null) {
                return null;
            }
            PublicKey parseKey = parseKey(string);
            if (parseKey == null) {
                return null;
            }
            return getIdFromPublicKey(parseKey);
        }
    }

    @o0OO00OO
    public String readIid() {
        synchronized (this.iidPrefs) {
            String readInstanceIdFromLocalStorage = readInstanceIdFromLocalStorage();
            if (readInstanceIdFromLocalStorage != null) {
                return readInstanceIdFromLocalStorage;
            }
            return readPublicKeyFromLocalStorageAndCalculateInstanceId();
        }
    }

    @o0OO00OO
    public String readToken() {
        synchronized (this.iidPrefs) {
            for (String str : ALLOWABLE_SCOPES) {
                String string = this.iidPrefs.getString(createTokenKey(this.defaultSenderId, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith(JSON_ENCODED_PREFIX)) {
                        string = parseIidTokenFromJson(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
