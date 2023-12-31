package net.earthcomputer.externalAsmAnnotations;

import org.intellij.lang.annotations.MagicConstant;
import org.objectweb.asm.ClassReader;

@MagicConstant(flagsFromClass = ClassReader.class)
public @interface ClassReaderFlags {
}
