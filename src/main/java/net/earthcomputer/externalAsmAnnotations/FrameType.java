package net.earthcomputer.externalAsmAnnotations;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.Opcodes;

@MagicConstant(intValues = {
    Opcodes.F_NEW,
    Opcodes.F_FULL,
    Opcodes.F_APPEND,
    Opcodes.F_CHOP,
    Opcodes.F_SAME,
    Opcodes.F_SAME1,
})
public @interface FrameType {
}
