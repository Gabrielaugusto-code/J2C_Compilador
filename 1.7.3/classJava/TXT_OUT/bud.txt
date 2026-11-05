/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

final class bud
implements ParameterizedType {
    bud() {
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{String.class, btc.class};
    }

    @Override
    public Type getRawType() {
        return Map.class;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }
}

