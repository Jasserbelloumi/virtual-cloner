package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.support.v4.media.o00oOOo0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public abstract class FastJsonResponse {

    @VisibleForTesting
    @SafeParcelable.Class(creator = "FieldCreator")
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes.dex */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();
        @SafeParcelable.Field(getter = "getTypeIn", id = 2)
        public final int zaa;
        @SafeParcelable.Field(getter = "isTypeInArray", id = 3)
        public final boolean zab;
        @SafeParcelable.Field(getter = "getTypeOut", id = 4)
        public final int zac;
        @SafeParcelable.Field(getter = "isTypeOutArray", id = 5)
        public final boolean zad;
        @oo0oO0
        @SafeParcelable.Field(getter = "getOutputFieldName", id = 6)
        public final String zae;
        @SafeParcelable.Field(getter = "getSafeParcelableFieldId", id = 7)
        public final int zaf;
        @o0OO00OO
        public final Class zag;
        @o0OO00OO
        @SafeParcelable.Field(getter = "getConcreteTypeName", id = 8)
        public final String zah;
        @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
        private final int zai;
        private zan zaj;
        @o0OO00OO
        @SafeParcelable.Field(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        private FieldConverter zak;

        @SafeParcelable.Constructor
        public Field(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) int i4, @SafeParcelable.Param(id = 8) @o0OO00OO String str2, @SafeParcelable.Param(id = 9) @o0OO00OO com.google.android.gms.common.server.converter.zaa zaaVar) {
            this.zai = i;
            this.zaa = i2;
            this.zab = z;
            this.zac = i3;
            this.zad = z2;
            this.zae = str;
            this.zaf = i4;
            if (str2 == null) {
                this.zag = null;
                this.zah = null;
            } else {
                this.zag = SafeParcelResponse.class;
                this.zah = str2;
            }
            if (zaaVar == null) {
                this.zak = null;
            } else {
                this.zak = zaaVar.zab();
            }
        }

        public Field(int i, boolean z, int i2, boolean z2, @oo0oO0 String str, int i3, @o0OO00OO Class cls, @o0OO00OO FieldConverter fieldConverter) {
            this.zai = 1;
            this.zaa = i;
            this.zab = z;
            this.zac = i2;
            this.zad = z2;
            this.zae = str;
            this.zaf = i3;
            this.zag = cls;
            this.zah = cls == null ? null : cls.getCanonicalName();
            this.zak = fieldConverter;
        }

        @VisibleForTesting
        @oo0oO0
        @KeepForSdk
        public static Field<byte[], byte[]> forBase64(@oo0oO0 String str, int i) {
            return new Field<>(8, false, 8, false, str, i, null, null);
        }

        @oo0oO0
        @KeepForSdk
        public static Field<Boolean, Boolean> forBoolean(@oo0oO0 String str, int i) {
            return new Field<>(6, false, 6, false, str, i, null, null);
        }

        @oo0oO0
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(@oo0oO0 String str, int i, @oo0oO0 Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i, cls, null);
        }

        @oo0oO0
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(@oo0oO0 String str, int i, @oo0oO0 Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i, cls, null);
        }

        @oo0oO0
        @KeepForSdk
        public static Field<Double, Double> forDouble(@oo0oO0 String str, int i) {
            return new Field<>(4, false, 4, false, str, i, null, null);
        }

        @oo0oO0
        @KeepForSdk
        public static Field<Float, Float> forFloat(@oo0oO0 String str, int i) {
            return new Field<>(3, false, 3, false, str, i, null, null);
        }

        @VisibleForTesting
        @oo0oO0
        @KeepForSdk
        public static Field<Integer, Integer> forInteger(@oo0oO0 String str, int i) {
            return new Field<>(0, false, 0, false, str, i, null, null);
        }

        @oo0oO0
        @KeepForSdk
        public static Field<Long, Long> forLong(@oo0oO0 String str, int i) {
            return new Field<>(2, false, 2, false, str, i, null, null);
        }

        @oo0oO0
        @KeepForSdk
        public static Field<String, String> forString(@oo0oO0 String str, int i) {
            return new Field<>(7, false, 7, false, str, i, null, null);
        }

        @oo0oO0
        @KeepForSdk
        public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(@oo0oO0 String str, int i) {
            return new Field<>(10, false, 10, false, str, i, null, null);
        }

        @oo0oO0
        @KeepForSdk
        public static Field<ArrayList<String>, ArrayList<String>> forStrings(@oo0oO0 String str, int i) {
            return new Field<>(7, true, 7, true, str, i, null, null);
        }

        @oo0oO0
        @KeepForSdk
        public static Field withConverter(@oo0oO0 String str, int i, @oo0oO0 FieldConverter<?, ?> fieldConverter, boolean z) {
            fieldConverter.zaa();
            fieldConverter.zab();
            return new Field(7, z, 0, false, str, i, null, fieldConverter);
        }

        @KeepForSdk
        public int getSafeParcelableFieldId() {
            return this.zaf;
        }

        @oo0oO0
        public final String toString() {
            Objects.ToStringHelper add = Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.zai)).add("typeIn", Integer.valueOf(this.zaa)).add("typeInArray", Boolean.valueOf(this.zab)).add("typeOut", Integer.valueOf(this.zac)).add("typeOutArray", Boolean.valueOf(this.zad)).add("outputFieldName", this.zae).add("safeParcelFieldId", Integer.valueOf(this.zaf)).add("concreteTypeName", zag());
            Class cls = this.zag;
            if (cls != null) {
                add.add("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter fieldConverter = this.zak;
            if (fieldConverter != null) {
                add.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return add.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@oo0oO0 Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.zai);
            SafeParcelWriter.writeInt(parcel, 2, this.zaa);
            SafeParcelWriter.writeBoolean(parcel, 3, this.zab);
            SafeParcelWriter.writeInt(parcel, 4, this.zac);
            SafeParcelWriter.writeBoolean(parcel, 5, this.zad);
            SafeParcelWriter.writeString(parcel, 6, this.zae, false);
            SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            SafeParcelWriter.writeString(parcel, 8, zag(), false);
            SafeParcelWriter.writeParcelable(parcel, 9, zaa(), i, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        @o0OO00OO
        public final com.google.android.gms.common.server.converter.zaa zaa() {
            FieldConverter fieldConverter = this.zak;
            if (fieldConverter == null) {
                return null;
            }
            return com.google.android.gms.common.server.converter.zaa.zaa(fieldConverter);
        }

        @oo0oO0
        public final Field zab() {
            return new Field(this.zai, this.zaa, this.zab, this.zac, this.zad, this.zae, this.zaf, this.zah, zaa());
        }

        @oo0oO0
        public final FastJsonResponse zad() throws InstantiationException, IllegalAccessException {
            Preconditions.checkNotNull(this.zag);
            Class cls = this.zag;
            if (cls == SafeParcelResponse.class) {
                Preconditions.checkNotNull(this.zah);
                Preconditions.checkNotNull(this.zaj, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
                return new SafeParcelResponse(this.zaj, this.zah);
            }
            return (FastJsonResponse) cls.newInstance();
        }

        @oo0oO0
        public final Object zae(@o0OO00OO Object obj) {
            Preconditions.checkNotNull(this.zak);
            return Preconditions.checkNotNull(this.zak.zac(obj));
        }

        @oo0oO0
        public final Object zaf(@oo0oO0 Object obj) {
            Preconditions.checkNotNull(this.zak);
            return this.zak.zad(obj);
        }

        @o0OO00OO
        public final String zag() {
            String str = this.zah;
            if (str == null) {
                return null;
            }
            return str;
        }

        @oo0oO0
        public final Map zah() {
            Preconditions.checkNotNull(this.zah);
            Preconditions.checkNotNull(this.zaj);
            return (Map) Preconditions.checkNotNull(this.zaj.zab(this.zah));
        }

        public final void zai(zan zanVar) {
            this.zaj = zanVar;
        }

        public final boolean zaj() {
            return this.zak != null;
        }
    }

    @ShowFirstParty
    /* loaded from: classes.dex */
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        @o0OO00OO
        Object zac(@oo0oO0 Object obj);

        @oo0oO0
        Object zad(@oo0oO0 Object obj);
    }

    @oo0oO0
    public static final Object zaD(@oo0oO0 Field field, @o0OO00OO Object obj) {
        return field.zak != null ? field.zaf(obj) : obj;
    }

    private final void zaE(Field field, @o0OO00OO Object obj) {
        String str = field.zae;
        Object zae = field.zae(obj);
        int i = field.zac;
        switch (i) {
            case 0:
                if (zae != null) {
                    setIntegerInternal(field, str, ((Integer) zae).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zaf(field, str, (BigInteger) zae);
                return;
            case 2:
                if (zae != null) {
                    setLongInternal(field, str, ((Long) zae).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 3:
            default:
                throw new IllegalStateException(o00oOOo0.o00oOOo0("Unsupported type for conversion: ", i));
            case 4:
                if (zae != null) {
                    zan(field, str, ((Double) zae).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zab(field, str, (BigDecimal) zae);
                return;
            case 6:
                if (zae != null) {
                    setBooleanInternal(field, str, ((Boolean) zae).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                setStringInternal(field, str, (String) zae);
                return;
            case 8:
            case 9:
                if (zae != null) {
                    setDecodedBytesInternal(field, str, (byte[]) zae);
                    return;
                } else {
                    zaG(str);
                    return;
                }
        }
    }

    private static final void zaF(StringBuilder sb, Field field, Object obj) {
        String fastJsonResponse;
        int i = field.zaa;
        if (i == 11) {
            Class cls = field.zag;
            Preconditions.checkNotNull(cls);
            fastJsonResponse = ((FastJsonResponse) cls.cast(obj)).toString();
        } else if (i != 7) {
            sb.append(obj);
            return;
        } else {
            fastJsonResponse = "\"";
            sb.append("\"");
            sb.append(JsonUtils.escapeString((String) obj));
        }
        sb.append(fastJsonResponse);
    }

    private static final void zaG(String str) {
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@oo0oO0 Field field, @oo0oO0 String str, @o0OO00OO ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeInternal(@oo0oO0 Field field, @oo0oO0 String str, @oo0oO0 T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @oo0oO0
    @KeepForSdk
    public abstract Map<String, Field<?, ?>> getFieldMappings();

    @o0OO00OO
    @KeepForSdk
    public Object getFieldValue(@oo0oO0 Field field) {
        String str = field.zae;
        if (field.zag != null) {
            Preconditions.checkState(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", field.zae);
            try {
                char upperCase = Character.toUpperCase(str.charAt(0));
                String substring = str.substring(1);
                return getClass().getMethod("get" + upperCase + substring, new Class[0]).invoke(this, new Object[0]);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return getValueObject(str);
    }

    @o0OO00OO
    @KeepForSdk
    public abstract Object getValueObject(@oo0oO0 String str);

    @KeepForSdk
    public boolean isFieldSet(@oo0oO0 Field field) {
        if (field.zac == 11) {
            if (field.zad) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
            throw new UnsupportedOperationException("Concrete types not supported");
        }
        return isPrimitiveFieldSet(field.zae);
    }

    @KeepForSdk
    public abstract boolean isPrimitiveFieldSet(@oo0oO0 String str);

    @KeepForSdk
    public void setBooleanInternal(@oo0oO0 Field<?, ?> field, @oo0oO0 String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    @KeepForSdk
    public void setDecodedBytesInternal(@oo0oO0 Field<?, ?> field, @oo0oO0 String str, @o0OO00OO byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    @KeepForSdk
    public void setIntegerInternal(@oo0oO0 Field<?, ?> field, @oo0oO0 String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    @KeepForSdk
    public void setLongInternal(@oo0oO0 Field<?, ?> field, @oo0oO0 String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    @KeepForSdk
    public void setStringInternal(@oo0oO0 Field<?, ?> field, @oo0oO0 String str, @o0OO00OO String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    @KeepForSdk
    public void setStringMapInternal(@oo0oO0 Field<?, ?> field, @oo0oO0 String str, @o0OO00OO Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    @KeepForSdk
    public void setStringsInternal(@oo0oO0 Field<?, ?> field, @oo0oO0 String str, @o0OO00OO ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    @oo0oO0
    @KeepForSdk
    public String toString() {
        String str;
        String encode;
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str2 : fieldMappings.keySet()) {
            Field<?, ?> field = fieldMappings.get(str2);
            if (isFieldSet(field)) {
                Object zaD = zaD(field, getFieldValue(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str2);
                sb.append("\":");
                if (zaD != null) {
                    switch (field.zac) {
                        case 8:
                            sb.append("\"");
                            encode = Base64Utils.encode((byte[]) zaD);
                            sb.append(encode);
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            encode = Base64Utils.encodeUrlSafe((byte[]) zaD);
                            sb.append(encode);
                            sb.append("\"");
                            break;
                        case 10:
                            MapUtils.writeStringMapToJson(sb, (HashMap) zaD);
                            break;
                        default:
                            if (field.zab) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        zaF(sb, field, obj);
                                    }
                                }
                                str = "]";
                                break;
                            } else {
                                zaF(sb, field, zaD);
                                break;
                            }
                    }
                } else {
                    str = "null";
                }
                sb.append(str);
            }
        }
        sb.append(sb.length() > 0 ? "}" : "{}");
        return sb.toString();
    }

    public final void zaA(@oo0oO0 Field field, @o0OO00OO String str) {
        if (field.zak != null) {
            zaE(field, str);
        } else {
            setStringInternal(field, field.zae, str);
        }
    }

    public final void zaB(@oo0oO0 Field field, @o0OO00OO Map map) {
        if (field.zak != null) {
            zaE(field, map);
        } else {
            setStringMapInternal(field, field.zae, map);
        }
    }

    public final void zaC(@oo0oO0 Field field, @o0OO00OO ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            setStringsInternal(field, field.zae, arrayList);
        }
    }

    public final void zaa(@oo0oO0 Field field, @o0OO00OO BigDecimal bigDecimal) {
        if (field.zak != null) {
            zaE(field, bigDecimal);
        } else {
            zab(field, field.zae, bigDecimal);
        }
    }

    public void zab(@oo0oO0 Field field, @oo0oO0 String str, @o0OO00OO BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(@oo0oO0 Field field, @o0OO00OO ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zad(field, field.zae, arrayList);
        }
    }

    public void zad(@oo0oO0 Field field, @oo0oO0 String str, @o0OO00OO ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(@oo0oO0 Field field, @o0OO00OO BigInteger bigInteger) {
        if (field.zak != null) {
            zaE(field, bigInteger);
        } else {
            zaf(field, field.zae, bigInteger);
        }
    }

    public void zaf(@oo0oO0 Field field, @oo0oO0 String str, @o0OO00OO BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(@oo0oO0 Field field, @o0OO00OO ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zah(field, field.zae, arrayList);
        }
    }

    public void zah(@oo0oO0 Field field, @oo0oO0 String str, @o0OO00OO ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(@oo0oO0 Field field, boolean z) {
        if (field.zak != null) {
            zaE(field, Boolean.valueOf(z));
        } else {
            setBooleanInternal(field, field.zae, z);
        }
    }

    public final void zaj(@oo0oO0 Field field, @o0OO00OO ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zak(field, field.zae, arrayList);
        }
    }

    public void zak(@oo0oO0 Field field, @oo0oO0 String str, @o0OO00OO ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(@oo0oO0 Field field, @o0OO00OO byte[] bArr) {
        if (field.zak != null) {
            zaE(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.zae, bArr);
        }
    }

    public final void zam(@oo0oO0 Field field, double d) {
        if (field.zak != null) {
            zaE(field, Double.valueOf(d));
        } else {
            zan(field, field.zae, d);
        }
    }

    public void zan(@oo0oO0 Field field, @oo0oO0 String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(@oo0oO0 Field field, @o0OO00OO ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zap(field, field.zae, arrayList);
        }
    }

    public void zap(@oo0oO0 Field field, @oo0oO0 String str, @o0OO00OO ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(@oo0oO0 Field field, float f) {
        if (field.zak != null) {
            zaE(field, Float.valueOf(f));
        } else {
            zar(field, field.zae, f);
        }
    }

    public void zar(@oo0oO0 Field field, @oo0oO0 String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(@oo0oO0 Field field, @o0OO00OO ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zat(field, field.zae, arrayList);
        }
    }

    public void zat(@oo0oO0 Field field, @oo0oO0 String str, @o0OO00OO ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(@oo0oO0 Field field, int i) {
        if (field.zak != null) {
            zaE(field, Integer.valueOf(i));
        } else {
            setIntegerInternal(field, field.zae, i);
        }
    }

    public final void zav(@oo0oO0 Field field, @o0OO00OO ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zaw(field, field.zae, arrayList);
        }
    }

    public void zaw(@oo0oO0 Field field, @oo0oO0 String str, @o0OO00OO ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(@oo0oO0 Field field, long j) {
        if (field.zak != null) {
            zaE(field, Long.valueOf(j));
        } else {
            setLongInternal(field, field.zae, j);
        }
    }

    public final void zay(@oo0oO0 Field field, @o0OO00OO ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zaz(field, field.zae, arrayList);
        }
    }

    public void zaz(@oo0oO0 Field field, @oo0oO0 String str, @o0OO00OO ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
