package net.earthcomputer.externalAsmAnnotations.pattern;

import org.intellij.lang.annotations.Pattern;
import org.intellij.lang.annotations.RegExp;

@Pattern(UnqualifiedMethodName.PATTERN)
public @interface UnqualifiedMethodName {
    @RegExp
    String PATTERN = "<init>|<clinit>|[^.;\\[/<>]+";
}
