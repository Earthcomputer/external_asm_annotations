package net.earthcomputer.externalAsmAnnotations.access;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.Opcodes;

@MagicConstant(flags = {
    Opcodes.ACC_PUBLIC,
    Opcodes.ACC_PRIVATE,
    Opcodes.ACC_PROTECTED,
    Opcodes.ACC_STATIC,
    Opcodes.ACC_FINAL,
    Opcodes.ACC_SYNCHRONIZED,
    Opcodes.ACC_BRIDGE,
    Opcodes.ACC_VARARGS,
    Opcodes.ACC_NATIVE,
    Opcodes.ACC_ABSTRACT,
    Opcodes.ACC_STRICT,
    Opcodes.ACC_SYNTHETIC,
    Opcodes.ACC_MANDATED,
    Opcodes.ACC_DEPRECATED,
})
public @interface MethodAccess {
}
