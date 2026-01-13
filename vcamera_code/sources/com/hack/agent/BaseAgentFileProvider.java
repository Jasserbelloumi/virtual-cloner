package com.hack.agent;

import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import o0O0oooo.o0OO0oO;
import o0O0oooo.o0OO0oO0;
/* loaded from: classes2.dex */
public class BaseAgentFileProvider extends ContentProvider {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f6513o00oo0O0 = "proxies.BaseAgentFileProvider";

    public static ContentProviderClient o00oOOo0(Context context, Uri uri) {
        return context.getContentResolver().acquireContentProviderClient(uri.getAuthority());
    }

    @Override // android.content.ContentProvider
    public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> arrayList) throws OperationApplicationException {
        if (arrayList != null) {
            Arrays.toString(arrayList.toArray());
        }
        return super.applyBatch(arrayList);
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        Objects.toString(uri);
        Uri uri2 = (Uri) o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12884o00ooooo, uri);
        ContentProviderClient o00oOOo02 = o00oOOo0(getContext(), uri2);
        if (o00oOOo02 != null) {
            try {
                return o00oOOo02.bulkInsert(uri2, contentValuesArr);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        Uri uri2 = (Uri) o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12884o00ooooo, uri);
        ContentProviderClient o00oOOo02 = o00oOOo0(getContext(), uri2);
        if (o00oOOo02 != null) {
            try {
                return o00oOOo02.delete(uri2, str, strArr);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        Objects.toString(uri);
        Uri uri2 = (Uri) o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12884o00ooooo, uri);
        ContentProviderClient o00oOOo02 = o00oOOo0(getContext(), uri2);
        if (o00oOOo02 != null) {
            try {
                return o00oOOo02.getType(uri2);
            } catch (RemoteException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        Uri uri2 = (Uri) o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12884o00ooooo, uri);
        ContentProviderClient o00oOOo02 = o00oOOo0(getContext(), uri2);
        if (o00oOOo02 != null) {
            try {
                return o00oOOo02.insert(uri2, contentValues);
            } catch (RemoteException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openAssetFile(Uri uri, String str) throws FileNotFoundException {
        Uri uri2 = (Uri) o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12884o00ooooo, uri);
        Objects.toString(uri);
        Objects.toString(uri2);
        ContentProviderClient o00oOOo02 = o00oOOo0(getContext(), uri2);
        Objects.toString(o00oOOo02);
        if (o00oOOo02 != null) {
            try {
                AssetFileDescriptor openAssetFile = o00oOOo02.openAssetFile(uri2, str);
                Objects.toString(uri);
                Objects.toString(openAssetFile);
                return openAssetFile;
            } catch (RemoteException e) {
                e.printStackTrace();
                Objects.toString(uri);
                throw new FileNotFoundException(uri.toString());
            }
        }
        return super.openAssetFile(uri, str);
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openAssetFile(Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
        Uri uri2 = (Uri) o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12884o00ooooo, uri);
        Objects.toString(uri);
        Objects.toString(cancellationSignal);
        Objects.toString(uri2);
        ContentProviderClient o00oOOo02 = o00oOOo0(getContext(), uri2);
        if (o00oOOo02 != null) {
            try {
                AssetFileDescriptor openAssetFile = o00oOOo02.openAssetFile(uri2, str, cancellationSignal);
                Objects.toString(uri2);
                Objects.toString(o00oOOo02.getLocalContentProvider());
                return openAssetFile;
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return super.openAssetFile(uri, str, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        Objects.toString(uri);
        Uri uri2 = (Uri) o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12884o00ooooo, uri);
        ContentProviderClient o00oOOo02 = o00oOOo0(getContext(), uri2);
        if (o00oOOo02 != null) {
            try {
                return o00oOOo02.openFile(uri2, str);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return super.openFile(uri, str);
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
        Objects.toString(uri);
        Uri uri2 = (Uri) o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12884o00ooooo, uri);
        ContentProviderClient o00oOOo02 = o00oOOo0(getContext(), uri2);
        if (o00oOOo02 != null) {
            try {
                return o00oOOo02.openFile(uri2, str, cancellationSignal);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return super.openFile(uri, str, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) throws FileNotFoundException {
        Objects.toString(uri);
        Uri uri2 = (Uri) o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12884o00ooooo, uri);
        ContentProviderClient o00oOOo02 = o00oOOo0(getContext(), uri2);
        if (o00oOOo02 != null) {
            try {
                return o00oOOo02.openTypedAssetFileDescriptor(uri2, str, bundle);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return super.openTypedAssetFile(uri, str, bundle);
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) throws FileNotFoundException {
        AssetFileDescriptor openTypedAssetFile;
        Objects.toString(uri);
        Uri uri2 = (Uri) o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12884o00ooooo, uri);
        ContentProviderClient o00oOOo02 = o00oOOo0(getContext(), uri2);
        if (o00oOOo02 != null) {
            try {
                openTypedAssetFile = o00oOOo02.openTypedAssetFile(uri2, str, bundle, cancellationSignal);
                return openTypedAssetFile;
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return super.openTypedAssetFile(uri, str, bundle, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Uri uri2 = (Uri) o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12884o00ooooo, uri);
        ContentProviderClient o00oOOo02 = o00oOOo0(getContext(), uri2);
        if (o00oOOo02 != null) {
            try {
                return o00oOOo02.query(uri2, strArr, str, strArr2, str2);
            } catch (RemoteException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Objects.toString(uri);
        Uri uri2 = (Uri) o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12884o00ooooo, uri);
        ContentProviderClient o00oOOo02 = o00oOOo0(getContext(), uri2);
        if (o00oOOo02 != null) {
            try {
                return o00oOOo02.update(uri2, contentValues, str, strArr);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
