package net.earthcomputer.externalAsmAnnotations.pattern;

import org.intellij.lang.annotations.Pattern;
import org.intellij.lang.annotations.RegExp;

@Pattern(ArrayOrInternalName.PATTERN)
public @interface ArrayOrInternalName {
    @RegExp
    String PATTERN = "\\[" + TypeDescriptor.PATTERN + "|" + InternalName.PATTERN;
}
