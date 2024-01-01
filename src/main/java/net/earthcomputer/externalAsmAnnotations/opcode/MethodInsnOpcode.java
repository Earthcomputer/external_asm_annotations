package net.earthcomputer.externalAsmAnnotations.opcode;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.Opcodes;

@MagicConstant(intValues = {
    Opcodes.INVOKEVIRTUAL,
    Opcodes.INVOKESPECIAL,
    Opcodes.INVOKESTATIC,
    Opcodes.INVOKEINTERFACE,
})
public @interface MethodInsnOpcode {
}
