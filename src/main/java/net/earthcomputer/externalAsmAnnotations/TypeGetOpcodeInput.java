package net.earthcomputer.externalAsmAnnotations;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.Opcodes;

@MagicConstant(intValues = {
    Opcodes.ILOAD,
    Opcodes.ISTORE,
    Opcodes.IALOAD,
    Opcodes.IASTORE,
    Opcodes.IADD,
    Opcodes.ISUB,
    Opcodes.IMUL,
    Opcodes.IDIV,
    Opcodes.IREM,
    Opcodes.INEG,
    Opcodes.ISHL,
    Opcodes.ISHR,
    Opcodes.IUSHR,
    Opcodes.IAND,
    Opcodes.IOR,
    Opcodes.IXOR,
    Opcodes.IRETURN,
})
public @interface TypeGetOpcodeInput {
}
