package net.earthcomputer.externalAsmAnnotations.pattern;

import org.intellij.lang.annotations.Pattern;
import org.intellij.lang.annotations.RegExp;

@Pattern(UnqualifiedName.PATTERN)
public @interface UnqualifiedName {
    @RegExp
    String PATTERN = "[^.;\\[/]+";
}
