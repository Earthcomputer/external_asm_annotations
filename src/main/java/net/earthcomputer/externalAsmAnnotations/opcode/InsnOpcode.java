package net.earthcomputer.externalAsmAnnotations.opcode;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.Opcodes;

@MagicConstant(intValues = {
    Opcodes.NOP,
    Opcodes.ACONST_NULL,
    Opcodes.ICONST_M1,
    Opcodes.ICONST_0,
    Opcodes.ICONST_1,
    Opcodes.ICONST_2,
    Opcodes.ICONST_3,
    Opcodes.ICONST_4,
    Opcodes.ICONST_5,
    Opcodes.LCONST_0,
    Opcodes.LCONST_1,
    Opcodes.FCONST_0,
    Opcodes.FCONST_1,
    Opcodes.FCONST_2,
    Opcodes.DCONST_0,
    Opcodes.DCONST_1,
    Opcodes.IALOAD,
    Opcodes.LALOAD,
    Opcodes.FALOAD,
    Opcodes.DALOAD,
    Opcodes.AALOAD,
    Opcodes.BALOAD,
    Opcodes.CALOAD,
    Opcodes.SALOAD,
    Opcodes.IASTORE,
    Opcodes.LASTORE,
    Opcodes.FASTORE,
    Opcodes.DASTORE,
    Opcodes.AASTORE,
    Opcodes.BASTORE,
    Opcodes.CASTORE,
    Opcodes.SASTORE,
    Opcodes.POP,
    Opcodes.POP2,
    Opcodes.DUP,
    Opcodes.DUP_X1,
    Opcodes.DUP_X2,
    Opcodes.DUP2,
    Opcodes.DUP2_X1,
    Opcodes.DUP2_X2,
    Opcodes.SWAP,
    Opcodes.IADD,
    Opcodes.LADD,
    Opcodes.FADD,
    Opcodes.DADD,
    Opcodes.ISUB,
    Opcodes.LSUB,
    Opcodes.FSUB,
    Opcodes.DSUB,
    Opcodes.IMUL,
    Opcodes.LMUL,
    Opcodes.FMUL,
    Opcodes.DMUL,
    Opcodes.IDIV,
    Opcodes.LDIV,
    Opcodes.FDIV,
    Opcodes.DDIV,
    Opcodes.IREM,
    Opcodes.LREM,
    Opcodes.FREM,
    Opcodes.DREM,
    Opcodes.INEG,
    Opcodes.LNEG,
    Opcodes.FNEG,
    Opcodes.DNEG,
    Opcodes.ISHL,
    Opcodes.LSHL,
    Opcodes.ISHR,
    Opcodes.LSHR,
    Opcodes.IUSHR,
    Opcodes.LUSHR,
    Opcodes.IAND,
    Opcodes.LAND,
    Opcodes.IOR,
    Opcodes.LOR,
    Opcodes.IXOR,
    Opcodes.LXOR,
    Opcodes.I2L,
    Opcodes.I2F,
    Opcodes.I2D,
    Opcodes.L2I,
    Opcodes.L2F,
    Opcodes.L2D,
    Opcodes.F2I,
    Opcodes.F2L,
    Opcodes.F2D,
    Opcodes.D2I,
    Opcodes.D2L,
    Opcodes.D2F,
    Opcodes.I2B,
    Opcodes.I2C,
    Opcodes.I2S,
    Opcodes.LCMP,
    Opcodes.FCMPL,
    Opcodes.FCMPG,
    Opcodes.DCMPL,
    Opcodes.DCMPG,
    Opcodes.IRETURN,
    Opcodes.LRETURN,
    Opcodes.FRETURN,
    Opcodes.DRETURN,
    Opcodes.ARETURN,
    Opcodes.RETURN,
    Opcodes.ARRAYLENGTH,
    Opcodes.ATHROW,
    Opcodes.MONITORENTER,
    Opcodes.MONITOREXIT,
})
public @interface InsnOpcode {
}
