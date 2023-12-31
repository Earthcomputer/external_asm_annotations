package net.earthcomputer.externalAsmAnnotations.pattern;

import org.intellij.lang.annotations.Pattern;
import org.intellij.lang.annotations.RegExp;

@Pattern(InternalName.PATTERN)
public @interface InternalName {
    @RegExp
    String PATTERN = UnqualifiedName.PATTERN + "(/" + UnqualifiedName.PATTERN + ")*";
}
