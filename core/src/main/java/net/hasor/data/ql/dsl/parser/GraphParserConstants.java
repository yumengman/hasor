/* Generated By:JavaCC: Do not edit this line. GraphParserConstants.java */
package net.hasor.data.ql.dsl.parser;
/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface GraphParserConstants {
    /** End of File. */
    int      EOF                 = 0;
    /** RegularExpression Id. */
    int      C_SINGLE_COMMENT    = 6;
    /** RegularExpression Id. */
    int      C_MULTILINE_COMMENT = 7;
    /** RegularExpression Id. */
    int      EOL                 = 8;
    /** RegularExpression Id. */
    int      ZERO                = 9;
    /** RegularExpression Id. */
    int      SYMBOL              = 10;
    /** RegularExpression Id. */
    int      DIGIT               = 11;
    /** RegularExpression Id. */
    int      INTEGER_NUM         = 12;
    /** RegularExpression Id. */
    int      HEX_NUM             = 13;
    /** RegularExpression Id. */
    int      OCTAL_NUM           = 14;
    /** RegularExpression Id. */
    int      BINARY_NUM          = 15;
    /** RegularExpression Id. */
    int      DECIMAL_NUM         = 16;
    /** RegularExpression Id. */
    int      IF                  = 17;
    /** RegularExpression Id. */
    int      ELSEIF              = 18;
    /** RegularExpression Id. */
    int      ELSE                = 19;
    /** RegularExpression Id. */
    int      END                 = 20;
    /** RegularExpression Id. */
    int      RETURN              = 21;
    /** RegularExpression Id. */
    int      THROW               = 22;
    /** RegularExpression Id. */
    int      VAR                 = 23;
    /** RegularExpression Id. */
    int      LAMBDA              = 24;
    /** RegularExpression Id. */
    int      TRUE                = 25;
    /** RegularExpression Id. */
    int      FALSE               = 26;
    /** RegularExpression Id. */
    int      NULL                = 27;
    /** RegularExpression Id. */
    int      OPTION              = 28;
    /** RegularExpression Id. */
    int      COMMA               = 29;
    /** RegularExpression Id. */
    int      COLON               = 30;
    /** RegularExpression Id. */
    int      QUEM                = 31;
    /** RegularExpression Id. */
    int      SEMI                = 32;
    /** RegularExpression Id. */
    int      ASS                 = 33;
    /** RegularExpression Id. */
    int      QUOTE_SINGLE        = 34;
    /** RegularExpression Id. */
    int      QUOTE_DOUBLE        = 35;
    /** RegularExpression Id. */
    int      OPAR                = 36;
    /** RegularExpression Id. */
    int      CPAR                = 37;
    /** RegularExpression Id. */
    int      OBRA                = 38;
    /** RegularExpression Id. */
    int      CBRA                = 39;
    /** RegularExpression Id. */
    int      OCBRR               = 40;
    /** RegularExpression Id. */
    int      OCBR                = 41;
    /** RegularExpression Id. */
    int      CCBR                = 42;
    /** RegularExpression Id. */
    int      BANG                = 43;
    /** RegularExpression Id. */
    int      INCR                = 44;
    /** RegularExpression Id. */
    int      DECR                = 45;
    /** RegularExpression Id. */
    int      PLUS                = 46;
    /** RegularExpression Id. */
    int      MINUS               = 47;
    /** RegularExpression Id. */
    int      STAR                = 48;
    /** RegularExpression Id. */
    int      SLASH               = 49;
    /** RegularExpression Id. */
    int      REM                 = 50;
    /** RegularExpression Id. */
    int      ALI                 = 51;
    /** RegularExpression Id. */
    int      GT                  = 52;
    /** RegularExpression Id. */
    int      GE                  = 53;
    /** RegularExpression Id. */
    int      LT                  = 54;
    /** RegularExpression Id. */
    int      LE                  = 55;
    /** RegularExpression Id. */
    int      EQ                  = 56;
    /** RegularExpression Id. */
    int      NE                  = 57;
    /** RegularExpression Id. */
    int      BIT_AND             = 58;
    /** RegularExpression Id. */
    int      BIT_OR              = 59;
    /** RegularExpression Id. */
    int      XOR                 = 60;
    /** RegularExpression Id. */
    int      LSHIFT              = 61;
    /** RegularExpression Id. */
    int      RSIGNEDSHIFT        = 62;
    /** RegularExpression Id. */
    int      RUNSIGNEDSHIFT      = 63;
    /** RegularExpression Id. */
    int      SC_OR               = 64;
    /** RegularExpression Id. */
    int      SC_AND              = 65;
    /** RegularExpression Id. */
    int      LETTER              = 66;
    /** RegularExpression Id. */
    int      STR_UNICODE         = 67;
    /** RegularExpression Id. */
    int      STR_DOUBLE_BODY     = 68;
    /** RegularExpression Id. */
    int      STR_DOUBLE_QUOTED   = 69;
    /** RegularExpression Id. */
    int      STR_SINGLE_BODY     = 70;
    /** RegularExpression Id. */
    int      STR_SINGLE_QUOTED   = 71;
    /** RegularExpression Id. */
    int      STR_EMPTY           = 72;
    /** RegularExpression Id. */
    int      IDENTIFIER_S        = 73;
    /** RegularExpression Id. */
    int      IDENTIFIER_A        = 74;
    /** RegularExpression Id. */
    int      IDENTIFIER          = 75;
    /** Lexical state. */
    int      DEFAULT             = 0;
    /** Literal token values. */
    String[] tokenImage          = { "<EOF>", "\" \"", "\"\\t\"", "\"\\n\"", "\"\\r\"", "\"\\f\"", "<C_SINGLE_COMMENT>", "<C_MULTILINE_COMMENT>", "<EOL>", "\"0\"", "<SYMBOL>", "<DIGIT>", "<INTEGER_NUM>", "<HEX_NUM>", "<OCTAL_NUM>", "<BINARY_NUM>", "<DECIMAL_NUM>", "\"if\"", "\"elseif\"", "\"else\"", "\"end\"", "\"return\"", "\"throw\"", "\"var\"", "\"lambda\"", "\"true\"", "\"false\"", "\"null\"", "\"option\"", "\",\"", "\":\"", "\"?\"", "\";\"", "\"=\"", "\"\\\'\"", "\"\\\"\"", "\"(\"", "\")\"", "\"[\"", "\"]\"", "\"%{\"", "\"{\"", "\"}\"", "\"!\"", "\"++\"", "\"--\"", "\"+\"", "\"-\"",
            "\"*\"", "\"/\"", "\"%\"", "\"\\\\\"", "\">\"", "\">=\"", "\"<\"", "\"<=\"", "\"==\"", "\"!=\"", "\"&\"", "\"|\"", "\"^\"", "\"<<\"", "\">>\"", "\">>>\"", "\"||\"", "\"&&\"", "<LETTER>", "<STR_UNICODE>", "<STR_DOUBLE_BODY>", "<STR_DOUBLE_QUOTED>", "<STR_SINGLE_BODY>", "<STR_SINGLE_QUOTED>", "<STR_EMPTY>", "<IDENTIFIER_S>", "<IDENTIFIER_A>", "<IDENTIFIER>", "\"~\"", "\"->\"", };
}
