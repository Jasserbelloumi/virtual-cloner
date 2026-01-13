package o0OOOo;

import android.support.v4.media.o00oOo0O;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import o00oOoOo.o00oo;
import o0OO0o.o0O000;
import o0OOOOO0.o0OOO00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n1549#2:231\n1620#2,3:232\n37#3,2:235\n26#4:237\n26#4:238\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235,2\n134#1:237\n137#1:238\n*E\n"})
@o0O000
/* loaded from: classes3.dex */
public final class oooOO0 implements TypeVariable<GenericDeclaration>, o0O0o0 {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0OooO0 f13693o00oo0O0;

    public oooOO0(@NotNull o0OooO0 o0oooo0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oooo0, "typeParameter");
        this.f13693o00oo0O0 = o0oooo0;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (o0OOOOO0.o0ooO.o00oOoO0(getName(), typeVariable.getName()) && o0OOOOO0.o0ooO.o00oOoO0(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public Type[] getBounds() {
        List<o0O0OOOo> upperBounds = this.f13693o00oo0O0.getUpperBounds();
        ArrayList arrayList = new ArrayList(o0OO0oO.o0O00O.o0O000(upperBounds, 10));
        for (o0O0OOOo o0o0oooo : upperBounds) {
            arrayList.add(o0O0oo00.o00oOo00(o0o0oooo, true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public GenericDeclaration getGenericDeclaration() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("getGenericDeclaration() is not yet supported for type variables created from KType: ");
        o00oOOo02.append(this.f13693o00oo0O0);
        throw new o0OO0o.o0O0O0o0(o00oo.o00oOOo0("An operation is not implemented: ", o00oOOo02.toString()));
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public String getName() {
        return this.f13693o00oo0O0.getName();
    }

    @Override // java.lang.reflect.Type, o0OOOo.o0O0o0
    @NotNull
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @Nullable
    public final <T extends Annotation> T o00oOOo0(@NotNull Class<T> cls) {
        o0OOOOO0.o0ooO.o00oo0O0(cls, "annotationClass");
        return null;
    }

    @NotNull
    public final Annotation[] o00oOOoO() {
        return new Annotation[0];
    }

    @NotNull
    public final Annotation[] o00oOo00() {
        return new Annotation[0];
    }

    @NotNull
    public String toString() {
        return getName();
    }
}
