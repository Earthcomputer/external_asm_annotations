package net.earthcomputer.externalAsmAnnotations;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.ClassWriter;

@MagicConstant(flagsFromClass = ClassWriter.class)
public @interface ClassWriterFlags {
}
