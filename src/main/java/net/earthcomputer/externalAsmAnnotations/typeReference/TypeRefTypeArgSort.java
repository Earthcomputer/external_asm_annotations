package net.earthcomputer.externalAsmAnnotations.typeReference;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.TypeReference;

@MagicConstant(intValues = {
    TypeReference.CAST,
    TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT,
    TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT,
    TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT,
    TypeReference.METHOD_REFERENCE_TYPE_ARGUMENT,
})
public @interface TypeRefTypeArgSort {
}
