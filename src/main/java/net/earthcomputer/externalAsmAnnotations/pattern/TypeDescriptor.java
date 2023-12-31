package net.earthcomputer.externalAsmAnnotations.pattern;

import org.intellij.lang.annotations.Pattern;
import org.intellij.lang.annotations.RegExp;

@Pattern(TypeDescriptor.PATTERN)
public @interface TypeDescriptor {
    @RegExp
    String PATTERN = "\\[*(?:[BCDFIJSVZ]|" + ClassDescriptor.PATTERN + ")";
}
