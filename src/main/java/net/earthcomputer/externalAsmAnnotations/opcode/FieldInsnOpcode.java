package net.earthcomputer.externalAsmAnnotations.opcode;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.Opcodes;

@MagicConstant(intValues = {
    Opcodes.GETSTATIC,
    Opcodes.PUTSTATIC,
    Opcodes.GETFIELD,
    Opcodes.PUTFIELD,
})
public @interface FieldInsnOpcode {
}
