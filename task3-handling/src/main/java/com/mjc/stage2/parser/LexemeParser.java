package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser {
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    // Write your code here!
    public void parse(AbstractTextComponent abstractTextComponent, String s) {
        char[] arr = s.toCharArray();
        for (char c : arr) {
            abstractTextComponent.add(new SymbolLeaf(c, TextComponentType.WORD));
        }
    }
}
