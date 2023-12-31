package net.earthcomputer.externalAsmAnnotations.pattern;

import org.intellij.lang.annotations.Pattern;
import org.intellij.lang.annotations.RegExp;

@Pattern(MethodDescriptor.PATTERN)
public @interface MethodDescriptor {
    @RegExp
    String PATTERN = "\\((?:" + TypeDescriptor.PATTERN + ")*\\)" + TypeDescriptor.PATTERN;
}
