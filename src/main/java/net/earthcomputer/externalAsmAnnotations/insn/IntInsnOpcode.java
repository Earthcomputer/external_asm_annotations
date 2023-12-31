package net.earthcomputer.externalAsmAnnotations.insn;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.Opcodes;

@MagicConstant(intValues = {
    Opcodes.BIPUSH,
    Opcodes.SIPUSH,
    Opcodes.NEWARRAY,
})
public @interface IntInsnOpcode {
}
