package net.earthcomputer.externalAsmAnnotations.typeReference;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.TypeReference;

@MagicConstant(intValues = {
    TypeReference.CLASS_TYPE_PARAMETER,
    TypeReference.METHOD_TYPE_PARAMETER,
})
public @interface TypeRefParameterSort {
}
