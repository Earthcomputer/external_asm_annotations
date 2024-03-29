package net.earthcomputer.externalAsmAnnotations.opcode;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.Opcodes;

@MagicConstant(intValues = {
    Opcodes.NEW,
    Opcodes.ANEWARRAY,
    Opcodes.CHECKCAST,
    Opcodes.INSTANCEOF,
})
public @interface TypeInsnOpcode {
}
