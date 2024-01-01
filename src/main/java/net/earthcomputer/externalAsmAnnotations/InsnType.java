package net.earthcomputer.externalAsmAnnotations;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.tree.AbstractInsnNode;

@MagicConstant(valuesFromClass = AbstractInsnNode.class)
public @interface InsnType {
}
