package net.earthcomputer.externalAsmAnnotations.access;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.Opcodes;

@MagicConstant(flags = {
    Opcodes.ACC_PUBLIC,
    Opcodes.ACC_PRIVATE,
    Opcodes.ACC_PROTECTED,
    Opcodes.ACC_STATIC,
    Opcodes.ACC_FINAL,
    Opcodes.ACC_VOLATILE,
    Opcodes.ACC_TRANSIENT,
    Opcodes.ACC_SYNTHETIC,
    Opcodes.ACC_ENUM,
    Opcodes.ACC_MANDATED,
    Opcodes.ACC_DEPRECATED,
})
public @interface FieldAccess {
}
