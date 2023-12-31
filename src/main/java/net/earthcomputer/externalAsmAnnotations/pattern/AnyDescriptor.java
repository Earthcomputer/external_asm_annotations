package net.earthcomputer.externalAsmAnnotations.pattern;

import org.intellij.lang.annotations.Pattern;
import org.intellij.lang.annotations.RegExp;

@Pattern(AnyDescriptor.PATTERN)
public @interface AnyDescriptor {
    @RegExp
    String PATTERN = "(?:\\((?:" + TypeDescriptor.PATTERN + ")*\\))?" + TypeDescriptor.PATTERN;
}
