/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

class bhp
implements ParameterizedType {
    final /* synthetic */ bho a;

    bhp(bho bho2) {
        this.a = bho2;
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{String.class};
    }

    @Override
    public Type getRawType() {
        return Collection.class;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }
}

