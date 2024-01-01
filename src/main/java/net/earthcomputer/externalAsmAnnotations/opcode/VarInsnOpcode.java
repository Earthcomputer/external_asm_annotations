package net.earthcomputer.externalAsmAnnotations.opcode;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.Opcodes;

@MagicConstant(intValues = {
    Opcodes.ILOAD,
    Opcodes.LLOAD,
    Opcodes.FLOAD,
    Opcodes.DLOAD,
    Opcodes.ALOAD,
    Opcodes.ISTORE,
    Opcodes.LSTORE,
    Opcodes.FSTORE,
    Opcodes.DSTORE,
    Opcodes.ASTORE,
    Opcodes.RET,
})
public @interface VarInsnOpcode {
}
