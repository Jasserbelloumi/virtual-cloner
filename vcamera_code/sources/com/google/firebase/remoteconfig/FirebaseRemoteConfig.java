package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o00oOooO.o0OO00OO;
import o00oOooO.o0o0000;
import o00oOooO.o0oo0000;
import o00oOooO.oo0oO0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class FirebaseRemoteConfig {
    public static final boolean DEFAULT_VALUE_FOR_BOOLEAN = false;
    public static final byte[] DEFAULT_VALUE_FOR_BYTE_ARRAY = new byte[0];
    public static final double DEFAULT_VALUE_FOR_DOUBLE = 0.0d;
    public static final long DEFAULT_VALUE_FOR_LONG = 0;
    public static final String DEFAULT_VALUE_FOR_STRING = "";
    public static final int LAST_FETCH_STATUS_FAILURE = 1;
    public static final int LAST_FETCH_STATUS_NO_FETCH_YET = 0;
    public static final int LAST_FETCH_STATUS_SUCCESS = -1;
    public static final int LAST_FETCH_STATUS_THROTTLED = 2;
    public static final String TAG = "FirebaseRemoteConfig";
    public static final int VALUE_SOURCE_DEFAULT = 1;
    public static final int VALUE_SOURCE_REMOTE = 2;
    public static final int VALUE_SOURCE_STATIC = 0;
    private final ConfigCacheClient activatedConfigsCache;
    private final Context context;
    private final ConfigCacheClient defaultConfigsCache;
    private final Executor executor;
    private final ConfigFetchHandler fetchHandler;
    private final ConfigCacheClient fetchedConfigsCache;
    @o0OO00OO
    private final FirebaseABTesting firebaseAbt;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigMetadataClient frcMetadata;
    private final ConfigGetParameterHandler getHandler;

    public FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, @o0OO00OO FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient) {
        this.context = context;
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.firebaseAbt = firebaseABTesting;
        this.executor = executor;
        this.fetchedConfigsCache = configCacheClient;
        this.activatedConfigsCache = configCacheClient2;
        this.defaultConfigsCache = configCacheClient3;
        this.fetchHandler = configFetchHandler;
        this.getHandler = configGetParameterHandler;
        this.frcMetadata = configMetadataClient;
    }

    @oo0oO0
    public static FirebaseRemoteConfig getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    @oo0oO0
    public static FirebaseRemoteConfig getInstance(@oo0oO0 FirebaseApp firebaseApp) {
        return ((RemoteConfigComponent) firebaseApp.get(RemoteConfigComponent.class)).getDefault();
    }

    private static boolean isFetchedFresh(ConfigContainer configContainer, @o0OO00OO ConfigContainer configContainer2) {
        return configContainer2 == null || !configContainer.getFetchTime().equals(configContainer2.getFetchTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$activate$2(Task task, Task task2, Task task3) throws Exception {
        if (!task.isSuccessful() || task.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        ConfigContainer configContainer = (ConfigContainer) task.getResult();
        return (!task2.isSuccessful() || isFetchedFresh(configContainer, (ConfigContainer) task2.getResult())) ? this.activatedConfigsCache.put(configContainer).continueWith(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.o00oo0O0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                boolean processActivatePutTask;
                processActivatePutTask = FirebaseRemoteConfig.this.processActivatePutTask(task4);
                return Boolean.valueOf(processActivatePutTask);
            }
        }) : Tasks.forResult(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseRemoteConfigInfo lambda$ensureInitialized$0(Task task, Task task2) throws Exception {
        return (FirebaseRemoteConfigInfo) task.getResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$fetch$3(ConfigFetchHandler.FetchResponse fetchResponse) throws Exception {
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$fetch$4(ConfigFetchHandler.FetchResponse fetchResponse) throws Exception {
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$fetchAndActivate$1(Void r1) throws Exception {
        return activate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$reset$6() throws Exception {
        this.activatedConfigsCache.clear();
        this.fetchedConfigsCache.clear();
        this.defaultConfigsCache.clear();
        this.frcMetadata.clear();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$setConfigSettingsAsync$5(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) throws Exception {
        this.frcMetadata.setConfigSettings(firebaseRemoteConfigSettings);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$setDefaultsWithStringsMapAsync$7(ConfigContainer configContainer) throws Exception {
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean processActivatePutTask(Task<ConfigContainer> task) {
        if (task.isSuccessful()) {
            this.fetchedConfigsCache.clear();
            if (task.getResult() != null) {
                updateAbtWithActivatedExperiments(task.getResult().getAbtExperiments());
                return true;
            }
            return true;
        }
        return false;
    }

    private Task<Void> setDefaultsWithStringsMapAsync(Map<String, String> map) {
        try {
            return this.defaultConfigsCache.put(ConfigContainer.newBuilder().replaceConfigsWith(map).build()).onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.o00oOOo0
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    Task lambda$setDefaultsWithStringsMapAsync$7;
                    lambda$setDefaultsWithStringsMapAsync$7 = FirebaseRemoteConfig.lambda$setDefaultsWithStringsMapAsync$7((ConfigContainer) obj);
                    return lambda$setDefaultsWithStringsMapAsync$7;
                }
            });
        } catch (JSONException unused) {
            return Tasks.forResult(null);
        }
    }

    @o0o0000
    public static List<Map<String, String>> toExperimentInfoMaps(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    @oo0oO0
    public Task<Boolean> activate() {
        final Task<ConfigContainer> task = this.fetchedConfigsCache.get();
        final Task<ConfigContainer> task2 = this.activatedConfigsCache.get();
        return Tasks.whenAllComplete(task, task2).continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.o00oo0O
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Task lambda$activate$2;
                lambda$activate$2 = FirebaseRemoteConfig.this.lambda$activate$2(task, task2, task3);
                return lambda$activate$2;
            }
        });
    }

    @oo0oO0
    public Task<FirebaseRemoteConfigInfo> ensureInitialized() {
        Task<ConfigContainer> task = this.activatedConfigsCache.get();
        Task<ConfigContainer> task2 = this.defaultConfigsCache.get();
        Task<ConfigContainer> task3 = this.fetchedConfigsCache.get();
        final Task call = Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.remoteconfig.o00oOoO
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.this.getInfo();
            }
        });
        return Tasks.whenAllComplete(task, task2, task3, call, this.firebaseInstallations.getId(), this.firebaseInstallations.getToken(false)).continueWith(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.o00oo00O
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                FirebaseRemoteConfigInfo lambda$ensureInitialized$0;
                lambda$ensureInitialized$0 = FirebaseRemoteConfig.lambda$ensureInitialized$0(Task.this, task4);
                return lambda$ensureInitialized$0;
            }
        });
    }

    @oo0oO0
    public Task<Void> fetch() {
        return this.fetchHandler.fetch().onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.o00oOo0O
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task lambda$fetch$3;
                lambda$fetch$3 = FirebaseRemoteConfig.lambda$fetch$3((ConfigFetchHandler.FetchResponse) obj);
                return lambda$fetch$3;
            }
        });
    }

    @oo0oO0
    public Task<Void> fetch(long j) {
        return this.fetchHandler.fetch(j).onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.o00oOOoO
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task lambda$fetch$4;
                lambda$fetch$4 = FirebaseRemoteConfig.lambda$fetch$4((ConfigFetchHandler.FetchResponse) obj);
                return lambda$fetch$4;
            }
        });
    }

    @oo0oO0
    public Task<Boolean> fetchAndActivate() {
        return fetch().onSuccessTask(this.executor, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.o00oo0OO
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task lambda$fetchAndActivate$1;
                lambda$fetchAndActivate$1 = FirebaseRemoteConfig.this.lambda$fetchAndActivate$1((Void) obj);
                return lambda$fetchAndActivate$1;
            }
        });
    }

    @oo0oO0
    public Map<String, FirebaseRemoteConfigValue> getAll() {
        return this.getHandler.getAll();
    }

    public boolean getBoolean(@oo0oO0 String str) {
        return this.getHandler.getBoolean(str);
    }

    public double getDouble(@oo0oO0 String str) {
        return this.getHandler.getDouble(str);
    }

    @oo0oO0
    public FirebaseRemoteConfigInfo getInfo() {
        return this.frcMetadata.getInfo();
    }

    @oo0oO0
    public Set<String> getKeysByPrefix(@oo0oO0 String str) {
        return this.getHandler.getKeysByPrefix(str);
    }

    public long getLong(@oo0oO0 String str) {
        return this.getHandler.getLong(str);
    }

    @oo0oO0
    public String getString(@oo0oO0 String str) {
        return this.getHandler.getString(str);
    }

    @oo0oO0
    public FirebaseRemoteConfigValue getValue(@oo0oO0 String str) {
        return this.getHandler.getValue(str);
    }

    @oo0oO0
    public Task<Void> reset() {
        return Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.remoteconfig.o00oOo00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void lambda$reset$6;
                lambda$reset$6 = FirebaseRemoteConfig.this.lambda$reset$6();
                return lambda$reset$6;
            }
        });
    }

    @oo0oO0
    public Task<Void> setConfigSettingsAsync(@oo0oO0 final FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.remoteconfig.o00oo0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void lambda$setConfigSettingsAsync$5;
                lambda$setConfigSettingsAsync$5 = FirebaseRemoteConfig.this.lambda$setConfigSettingsAsync$5(firebaseRemoteConfigSettings);
                return lambda$setConfigSettingsAsync$5;
            }
        });
    }

    @oo0oO0
    public Task<Void> setDefaultsAsync(@o0oo0000 int i) {
        return setDefaultsWithStringsMapAsync(DefaultsXmlParser.getDefaultsFromXml(this.context, i));
    }

    @oo0oO0
    public Task<Void> setDefaultsAsync(@oo0oO0 Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            boolean z = value instanceof byte[];
            String key = entry.getKey();
            if (z) {
                hashMap.put(key, new String((byte[]) value));
            } else {
                hashMap.put(key, value.toString());
            }
        }
        return setDefaultsWithStringsMapAsync(hashMap);
    }

    public void startLoadingConfigsFromDisk() {
        this.activatedConfigsCache.get();
        this.defaultConfigsCache.get();
        this.fetchedConfigsCache.get();
    }

    @o0o0000
    public void updateAbtWithActivatedExperiments(@oo0oO0 JSONArray jSONArray) {
        if (this.firebaseAbt == null) {
            return;
        }
        try {
            this.firebaseAbt.replaceAllExperiments(toExperimentInfoMaps(jSONArray));
        } catch (AbtException | JSONException unused) {
        }
    }
}
