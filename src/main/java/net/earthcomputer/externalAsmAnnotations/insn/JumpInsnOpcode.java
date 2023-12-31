package net.earthcomputer.externalAsmAnnotations.insn;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.Opcodes;

@MagicConstant(intValues = {
    Opcodes.IFEQ,
    Opcodes.IFNE,
    Opcodes.IFLT,
    Opcodes.IFGE,
    Opcodes.IFGT,
    Opcodes.IFLE,
    Opcodes.IF_ICMPEQ,
    Opcodes.IF_ICMPGE,
    Opcodes.IF_ICMPLT,
    Opcodes.IF_ICMPGE,
    Opcodes.IF_ICMPGT,
    Opcodes.IF_ICMPLE,
    Opcodes.IF_ACMPEQ,
    Opcodes.IF_ACMPNE,
    Opcodes.GOTO,
    Opcodes.JSR,
    Opcodes.IFNULL,
    Opcodes.IFNONNULL,
})
public @interface JumpInsnOpcode {
}
