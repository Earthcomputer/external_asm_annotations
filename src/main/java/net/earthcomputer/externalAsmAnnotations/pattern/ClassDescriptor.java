package net.earthcomputer.externalAsmAnnotations.pattern;

import org.intellij.lang.annotations.Pattern;
import org.intellij.lang.annotations.RegExp;

@Pattern(ClassDescriptor.PATTERN)
public @interface ClassDescriptor {
    @RegExp
    String PATTERN = "L" + InternalName.PATTERN + ";";
}
