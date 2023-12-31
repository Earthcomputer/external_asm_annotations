package net.earthcomputer.externalAsmAnnotations;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.Opcodes;

@MagicConstant(intValues = {
    Opcodes.H_GETFIELD,
    Opcodes.H_GETSTATIC,
    Opcodes.H_PUTFIELD,
    Opcodes.H_PUTSTATIC,
    Opcodes.H_INVOKEVIRTUAL,
    Opcodes.H_INVOKESTATIC,
    Opcodes.H_INVOKESPECIAL,
    Opcodes.H_NEWINVOKESPECIAL,
    Opcodes.H_INVOKEINTERFACE,
})
public @interface HandleTag {
}
