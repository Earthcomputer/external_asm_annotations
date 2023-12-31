package net.earthcomputer.externalAsmAnnotations.access;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.Opcodes;

@MagicConstant(flags = {
    Opcodes.ACC_PUBLIC,
    Opcodes.ACC_PRIVATE,
    Opcodes.ACC_PROTECTED,
    Opcodes.ACC_FINAL,
    Opcodes.ACC_SUPER,
    Opcodes.ACC_INTERFACE,
    Opcodes.ACC_ABSTRACT,
    Opcodes.ACC_SYNTHETIC,
    Opcodes.ACC_ANNOTATION,
    Opcodes.ACC_ENUM,
    Opcodes.ACC_MODULE,
    Opcodes.ACC_RECORD,
    Opcodes.ACC_DEPRECATED,
})
public @interface ClassAccess {
}
