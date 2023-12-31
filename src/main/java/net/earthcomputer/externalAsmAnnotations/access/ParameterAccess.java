package net.earthcomputer.externalAsmAnnotations.access;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.Opcodes;

@MagicConstant(flags = {
    Opcodes.ACC_FINAL,
    Opcodes.ACC_SYNTHETIC,
    Opcodes.ACC_MANDATED,
})
public @interface ParameterAccess {
}
