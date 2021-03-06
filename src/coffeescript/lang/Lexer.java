/* The following code was generated by JFlex 1.4.3 on 4/13/10 4:28 PM */

/*
 * Copyright 2010 David Yeung
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package coffeescript.lang;


import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/13/10 4:28 PM from the specification file
 * <tt>/Users/dyeung/Projects/coffeescript-idea/src/coffeescript/lang/lexer.flex</tt>
 */
class Lexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int REGULAR_EXPRESSION = 8;
  public static final int VERB = 10;
  public static final int REGULAR_EXPRESSION_FLAG = 12;
  public static final int HEREDOCS = 18;
  public static final int DOUBLE_QUOTE_STRING = 4;
  public static final int SINGLE_QUOTE_STRING = 6;
  public static final int YYINITIAL = 0;
  public static final int NOUN = 2;
  public static final int JAVASCRIPT = 16;
  public static final int NOUN_OR_VERB = 14;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9, 9
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\20\2\0\1\27\22\0\1\31\1\15\1\24\1\21"+
    "\1\2\1\60\1\61\1\25\1\70\1\65\1\60\1\16\1\66\1\12"+
    "\1\10\1\30\1\4\11\3\1\23\1\67\1\63\1\17\1\22\1\60"+
    "\1\13\6\7\11\2\1\57\7\2\1\6\2\2\1\71\1\26\1\72"+
    "\1\64\1\56\1\35\1\37\1\74\1\36\1\41\1\11\1\42\1\34"+
    "\1\53\1\50\1\2\1\75\1\44\1\54\1\47\1\46\1\55\1\2"+
    "\1\52\1\40\1\45\1\43\1\51\1\14\1\5\1\73\1\2\1\32"+
    "\1\62\1\33\1\64\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\6\0\1\1\3\0\1\2\1\3\1\4\2\5\1\4"+
    "\1\6\1\7\1\4\2\6\1\2\1\10\1\11\1\12"+
    "\1\13\1\10\1\14\1\15\1\16\16\4\2\2\1\17"+
    "\1\20\1\21\1\22\1\23\4\4\1\24\2\25\1\6"+
    "\5\4\1\26\1\27\1\2\1\26\1\30\1\31\1\2"+
    "\1\32\1\33\1\2\1\6\1\2\2\6\1\34\1\6"+
    "\1\34\7\2\3\6\1\35\1\36\1\1\2\4\1\37"+
    "\1\40\2\41\3\0\3\4\1\42\2\4\2\0\7\4"+
    "\1\43\11\4\1\44\1\45\1\44\3\4\1\45\1\44"+
    "\11\4\1\46\3\4\1\47\1\50\1\51\1\32\1\6"+
    "\2\0\1\6\4\0\1\44\1\0\1\44\1\1\1\4"+
    "\1\44\1\0\2\5\1\0\1\5\7\4\1\52\31\4"+
    "\1\32\4\0\1\1\1\4\1\53\11\4\1\54\7\4"+
    "\1\32\1\0\1\1\11\4\1\32\1\0\13\4";

  private static int [] zzUnpackAction() {
    int [] result = new int[255];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\76\0\174\0\272\0\370\0\u0136\0\u0174\0\u01b2"+
    "\0\u01f0\0\u022e\0\u026c\0\u02aa\0\u02e8\0\u0326\0\u0364\0\u03a2"+
    "\0\u03e0\0\u026c\0\u041e\0\u045c\0\u026c\0\u03e0\0\u049a\0\u04d8"+
    "\0\u026c\0\u0516\0\u026c\0\u026c\0\u026c\0\u026c\0\u0554\0\u0592"+
    "\0\u05d0\0\u060e\0\u064c\0\u068a\0\u06c8\0\u0706\0\u0744\0\u0782"+
    "\0\u07c0\0\u07fe\0\u083c\0\u087a\0\u08b8\0\u08f6\0\u026c\0\u026c"+
    "\0\u026c\0\u026c\0\u026c\0\u0934\0\u0972\0\u09b0\0\u09ee\0\u03e0"+
    "\0\u049a\0\u026c\0\u0a2c\0\u0a6a\0\u0aa8\0\u0ae6\0\u0b24\0\u0b62"+
    "\0\u0ba0\0\u026c\0\u0bde\0\u0c1c\0\u0c5a\0\u026c\0\u0c98\0\u0cd6"+
    "\0\u0d14\0\u0d52\0\u0d90\0\u0dce\0\u0e0c\0\u0e4a\0\u0e88\0\u0ec6"+
    "\0\u0f04\0\u0f42\0\u0f80\0\u0fbe\0\u0ffc\0\u103a\0\u1078\0\u10b6"+
    "\0\u08b8\0\u08f6\0\u10f4\0\u026c\0\u026c\0\u1132\0\u1170\0\u11ae"+
    "\0\u11ec\0\u026c\0\u026c\0\u122a\0\u1268\0\u12a6\0\u12e4\0\u1322"+
    "\0\u1360\0\u139e\0\u026c\0\u13dc\0\u141a\0\u049a\0\u1458\0\u1496"+
    "\0\u14d4\0\u1512\0\u1550\0\u158e\0\u15cc\0\u160a\0\u02e8\0\u1648"+
    "\0\u1686\0\u16c4\0\u1702\0\u1740\0\u177e\0\u17bc\0\u17fa\0\u1838"+
    "\0\u1876\0\u02e8\0\u02e8\0\u18b4\0\u18f2\0\u1930\0\u196e\0\u19ac"+
    "\0\u19ea\0\u1a28\0\u1a66\0\u1aa4\0\u1ae2\0\u1b20\0\u1b5e\0\u1b9c"+
    "\0\u1bda\0\u026c\0\u1c18\0\u1c56\0\u1c94\0\u026c\0\u026c\0\u026c"+
    "\0\u1cd2\0\u1d10\0\u1d4e\0\u1d8c\0\u1dca\0\u1e08\0\u103a\0\u1e46"+
    "\0\u1e84\0\u026c\0\u1ec2\0\u1f00\0\u1f3e\0\u1f7c\0\u19ea\0\u1fba"+
    "\0\u1ff8\0\u2036\0\u2036\0\u12e4\0\u2074\0\u20b2\0\u20f0\0\u212e"+
    "\0\u216c\0\u21aa\0\u21e8\0\u026c\0\u2226\0\u2264\0\u22a2\0\u22e0"+
    "\0\u231e\0\u235c\0\u239a\0\u23d8\0\u2416\0\u2454\0\u2492\0\u24d0"+
    "\0\u250e\0\u254c\0\u258a\0\u25c8\0\u2606\0\u196e\0\u2644\0\u2682"+
    "\0\u26c0\0\u26fe\0\u273c\0\u277a\0\u27b8\0\u27f6\0\u2834\0\u2872"+
    "\0\u28b0\0\u28ee\0\u292c\0\u296a\0\u026c\0\u29a8\0\u29e6\0\u2a24"+
    "\0\u2a62\0\u2aa0\0\u2ade\0\u2b1c\0\u2b5a\0\u2b98\0\u02e8\0\u2bd6"+
    "\0\u2c14\0\u2c52\0\u2c90\0\u2cce\0\u2d0c\0\u2d4a\0\u2d88\0\u2dc6"+
    "\0\u026c\0\u2e04\0\u2e42\0\u2e80\0\u2ebe\0\u2efc\0\u2f3a\0\u2f78"+
    "\0\u2fb6\0\u2ff4\0\u026c\0\u3032\0\u3070\0\u30ae\0\u30ec\0\u312a"+
    "\0\u3168\0\u31a6\0\u31e4\0\u3222\0\u3260\0\u329e\0\u32dc";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[255];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\13\1\14\1\15\1\16\1\17\3\15\1\13\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\2\13\1\31\1\32\1\13\1\33\1\25\1\14\1\34"+
    "\1\35\1\15\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\3\15\1\54\1\15\1\25\1\55\1\56\2\13\1\57"+
    "\1\13\1\60\1\61\1\62\1\63\1\64\1\65\1\15"+
    "\1\13\1\14\1\15\1\16\1\17\3\15\1\13\1\66"+
    "\1\21\1\22\1\67\1\24\1\25\1\70\1\71\1\30"+
    "\2\13\1\31\1\32\1\13\1\72\1\73\1\14\1\34"+
    "\1\35\1\15\1\36\1\74\1\40\1\41\1\75\1\76"+
    "\1\44\1\15\1\46\1\47\1\77\1\100\1\15\1\53"+
    "\5\15\1\25\1\55\1\56\2\13\1\57\2\13\1\61"+
    "\1\62\1\63\1\64\1\65\1\15\20\101\1\33\3\101"+
    "\1\102\1\101\1\103\1\33\46\101\20\104\1\33\4\104"+
    "\1\102\1\103\1\33\46\104\20\105\1\106\5\105\1\107"+
    "\1\106\1\110\45\105\1\13\1\14\6\13\1\111\1\112"+
    "\1\113\1\22\1\114\1\115\1\116\1\117\1\71\1\30"+
    "\1\120\1\121\3\13\1\72\1\25\1\14\1\13\1\35"+
    "\3\13\1\122\2\13\1\123\1\124\1\13\1\125\1\126"+
    "\1\127\1\130\7\13\1\25\1\131\1\132\1\133\1\25"+
    "\1\134\1\135\1\60\1\61\1\62\1\63\23\13\1\0"+
    "\13\13\1\136\13\13\1\136\3\13\1\136\16\13\1\136"+
    "\3\13\1\14\1\15\1\16\1\17\3\15\1\111\1\66"+
    "\1\113\1\22\1\67\1\115\1\116\1\117\1\71\1\30"+
    "\1\120\1\121\1\31\1\32\1\13\1\72\1\25\1\14"+
    "\1\34\1\35\1\15\1\36\1\74\1\40\1\41\1\75"+
    "\1\76\1\44\1\15\1\137\1\47\1\77\1\140\1\15"+
    "\1\53\5\15\1\25\1\131\1\132\1\133\1\25\1\134"+
    "\1\135\1\60\1\61\1\62\1\63\1\64\1\65\1\15"+
    "\35\141\1\142\40\141\20\143\1\33\4\143\1\144\1\143"+
    "\1\33\46\143\77\0\1\14\17\0\1\30\7\0\1\14"+
    "\46\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\22\15\13\0\3\15\3\0\2\16\3\0\1\145"+
    "\1\146\67\0\2\16\2\147\1\0\1\145\1\146\66\0"+
    "\3\15\1\150\2\15\1\0\1\15\2\0\1\15\17\0"+
    "\1\15\1\0\6\15\1\151\2\15\1\152\10\15\13\0"+
    "\3\15\22\0\1\153\55\0\6\15\1\0\1\15\2\0"+
    "\1\15\17\0\1\15\1\0\12\15\1\154\2\15\1\155"+
    "\4\15\13\0\3\15\15\0\1\25\61\0\1\156\17\0"+
    "\1\30\7\0\1\156\44\0\20\30\1\156\55\30\25\0"+
    "\1\157\52\0\6\15\1\0\1\15\2\0\1\15\17\0"+
    "\1\15\1\0\1\15\1\160\4\15\1\161\1\15\1\162"+
    "\11\15\13\0\3\15\2\0\6\15\1\0\1\15\2\0"+
    "\1\15\17\0\1\15\1\0\11\15\1\163\10\15\13\0"+
    "\3\15\2\0\6\15\1\0\1\15\2\0\1\164\17\0"+
    "\1\15\1\0\5\15\1\165\14\15\13\0\3\15\2\0"+
    "\6\15\1\0\1\166\2\0\1\15\17\0\1\15\1\0"+
    "\10\15\1\167\11\15\13\0\3\15\2\0\6\15\1\0"+
    "\1\15\2\0\1\15\17\0\1\15\1\0\1\15\1\170"+
    "\3\15\1\171\2\15\1\172\1\15\1\173\7\15\13\0"+
    "\3\15\2\0\6\15\1\0\1\15\2\0\1\15\17\0"+
    "\1\15\1\0\11\15\1\174\10\15\13\0\3\15\2\0"+
    "\6\15\1\0\1\175\2\0\1\15\17\0\1\15\1\0"+
    "\22\15\13\0\3\15\2\0\6\15\1\0\1\15\2\0"+
    "\1\15\17\0\1\15\1\0\14\15\1\176\1\177\4\15"+
    "\13\0\1\200\2\15\2\0\6\15\1\0\1\15\2\0"+
    "\1\15\17\0\1\15\1\0\4\15\1\201\4\15\1\202"+
    "\2\15\1\203\5\15\13\0\3\15\2\0\6\15\1\0"+
    "\1\204\2\0\1\15\17\0\1\15\1\0\1\15\1\205"+
    "\3\15\1\206\2\15\1\207\11\15\13\0\3\15\2\0"+
    "\6\15\1\0\1\15\2\0\1\15\17\0\1\15\1\0"+
    "\2\15\1\210\1\15\1\203\4\15\1\211\4\15\1\212"+
    "\3\15\13\0\3\15\2\0\6\15\1\0\1\15\2\0"+
    "\1\15\17\0\1\15\1\0\1\15\1\213\6\15\1\214"+
    "\11\15\13\0\3\15\2\0\6\15\1\0\1\215\2\0"+
    "\1\15\17\0\1\15\1\0\22\15\13\0\3\15\2\0"+
    "\6\15\1\0\1\15\2\0\1\15\17\0\1\15\1\0"+
    "\20\15\1\216\1\15\13\0\3\15\61\0\1\25\76\0"+
    "\1\25\15\0\6\15\1\0\1\217\2\0\1\15\17\0"+
    "\1\15\1\0\22\15\13\0\3\15\2\0\6\15\1\0"+
    "\1\15\2\0\1\15\17\0\1\15\1\0\14\15\1\220"+
    "\5\15\13\0\1\203\2\15\2\0\3\15\1\221\2\15"+
    "\1\0\1\15\2\0\1\15\17\0\1\15\1\0\6\15"+
    "\1\151\13\15\13\0\3\15\2\0\6\15\1\0\1\15"+
    "\2\0\1\15\17\0\1\15\1\0\15\15\1\155\4\15"+
    "\13\0\3\15\31\222\1\0\44\222\2\0\6\15\1\0"+
    "\1\15\2\0\1\15\17\0\1\15\1\0\1\15\1\223"+
    "\4\15\1\161\1\15\1\224\11\15\13\0\3\15\2\0"+
    "\6\15\1\0\1\225\2\0\1\15\17\0\1\15\1\0"+
    "\22\15\13\0\3\15\2\0\6\15\1\0\1\15\2\0"+
    "\1\15\17\0\1\15\1\0\1\15\1\170\6\15\1\172"+
    "\1\15\1\173\7\15\13\0\3\15\2\0\6\15\1\0"+
    "\1\204\2\0\1\15\17\0\1\15\1\0\5\15\1\206"+
    "\2\15\1\207\11\15\13\0\3\15\2\0\6\15\1\0"+
    "\1\15\2\0\1\15\17\0\1\15\1\0\2\15\1\210"+
    "\1\15\1\203\4\15\1\211\10\15\13\0\3\15\20\101"+
    "\1\0\3\101\1\0\1\101\2\0\46\101\20\226\1\0"+
    "\3\226\3\227\16\226\1\227\1\226\1\227\26\226\20\104"+
    "\1\0\4\104\3\0\46\104\20\105\1\0\5\105\3\0"+
    "\45\105\20\230\1\0\55\230\34\0\1\231\13\0\1\231"+
    "\3\0\1\231\16\0\1\231\12\0\1\232\131\0\1\233"+
    "\43\0\1\25\7\0\1\153\126\0\1\234\37\0\1\25"+
    "\1\0\1\25\74\0\1\25\76\0\1\25\2\0\1\153"+
    "\72\0\1\25\2\0\1\235\76\0\1\25\121\0\1\236"+
    "\74\0\1\237\76\0\1\240\101\0\1\241\74\0\1\242"+
    "\71\0\1\243\67\0\1\244\1\0\1\242\4\0\1\242"+
    "\40\0\1\25\4\0\1\25\43\0\1\25\46\0\1\245"+
    "\13\0\1\245\3\0\1\245\16\0\1\245\4\0\6\15"+
    "\1\0\1\15\2\0\1\15\17\0\1\15\1\0\14\15"+
    "\1\176\1\246\4\15\13\0\1\200\2\15\2\0\6\15"+
    "\1\0\1\15\2\0\1\15\17\0\1\15\1\0\2\15"+
    "\1\210\1\15\1\203\4\15\1\247\10\15\13\0\3\15"+
    "\35\141\1\0\40\141\25\0\1\250\53\0\2\251\74\0"+
    "\2\252\5\0\1\253\3\0\1\253\62\0\2\254\2\0"+
    "\1\254\1\0\1\254\24\0\2\254\1\0\2\254\31\0"+
    "\1\254\3\0\6\15\1\0\1\15\2\0\1\15\17\0"+
    "\1\15\1\0\7\15\1\255\7\15\1\256\2\15\13\0"+
    "\3\15\2\0\6\15\1\0\1\15\2\0\1\15\17\0"+
    "\1\15\1\0\2\15\1\257\17\15\13\0\3\15\2\0"+
    "\6\15\1\0\1\15\2\0\1\15\17\0\1\15\1\0"+
    "\5\15\1\260\14\15\13\0\3\15\2\0\6\15\1\0"+
    "\1\15\2\0\1\15\17\0\1\15\1\0\7\15\1\261"+
    "\12\15\13\0\3\15\2\0\6\15\1\0\1\262\2\0"+
    "\1\15\17\0\1\15\1\0\12\15\1\263\7\15\13\0"+
    "\3\15\25\0\1\264\52\0\6\15\1\0\1\15\2\0"+
    "\1\15\17\0\1\15\1\0\2\15\1\265\4\15\1\266"+
    "\12\15\13\0\3\15\2\0\6\15\1\0\1\15\2\0"+
    "\1\15\17\0\1\15\1\0\1\15\1\267\20\15\13\0"+
    "\3\15\2\0\6\15\1\0\1\15\2\0\1\15\17\0"+
    "\1\15\1\0\11\15\1\270\10\15\13\0\3\15\2\0"+
    "\6\15\1\0\1\15\2\0\1\15\17\0\1\15\1\0"+
    "\3\15\1\203\16\15\13\0\3\15\2\0\6\15\1\0"+
    "\1\15\2\0\1\15\17\0\1\15\1\0\12\15\1\223"+
    "\7\15\13\0\3\15\2\0\6\15\1\0\1\15\2\0"+
    "\1\15\17\0\1\15\1\0\17\15\1\271\2\15\13\0"+
    "\3\15\2\0\6\15\1\0\1\15\2\0\1\15\17\0"+
    "\1\15\1\0\4\15\1\272\1\15\1\273\13\15\13\0"+
    "\3\15\2\0\6\15\1\0\1\15\2\0\1\15\17\0"+
    "\1\15\1\0\6\15\1\274\13\15\13\0\3\15\2\0"+
    "\6\15\1\0\1\15\2\0\1\15\17\0\1\15\1\0"+
    "\11\15\1\275\10\15\13\0\3\15\2\0\6\15\1\0"+
    "\1\15\2\0\1\15\17\0\1\15\1\0\14\15\1\203"+
    "\5\15\13\0\3\15\2\0\6\15\1\0\1\15\2\0"+
    "\1\15\17\0\1\15\1\0\11\15\1\276\10\15\13\0"+
    "\3\15\2\0\6\15\1\0\1\15\2\0\1\15\17\0"+
    "\1\15\1\0\6\15\1\277\13\15\13\0\3\15\2\0"+
    "\6\15\1\0\1\15\2\0\1\15\17\0\1\15\1\0"+
    "\7\15\1\167\12\15\13\0\3\15\2\0\6\15\1\0"+
    "\1\15\2\0\1\15\17\0\1\15\1\0\5\15\1\300"+
    "\14\15\13\0\1\203\2\15\2\0\6\15\1\0\1\15"+
    "\2\0\1\15\17\0\1\15\1\0\12\15\1\301\1\15"+
    "\1\302\5\15\13\0\3\15\2\0\6\15\1\0\1\15"+
    "\2\0\1\15\17\0\1\15\1\0\17\15\1\303\2\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\4\15\1\202\15\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\203\17\0\1\15"+
    "\1\0\22\15\13\0\3\15\2\0\6\15\1\0\1\15"+
    "\2\0\1\15\17\0\1\15\1\0\7\15\1\304\12\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\6\15\1\305\13\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\7\15\1\203\12\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\15\2\0\1\15\17\0\1\15\1\0\11\15"+
    "\1\306\10\15\13\0\3\15\2\0\6\15\1\0\1\15"+
    "\2\0\1\15\17\0\1\15\1\0\2\15\1\307\17\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\17\15\1\256\2\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\14\15\1\167\5\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\15\2\0\1\15\17\0\1\15\1\0\12\15"+
    "\1\310\7\15\13\0\3\15\2\0\6\15\1\0\1\15"+
    "\2\0\1\15\17\0\1\15\1\0\7\15\1\311\12\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\312\2\0\1\15"+
    "\17\0\1\15\1\0\15\15\1\313\4\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\2\15\1\202\17\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\314\2\0\1\15\17\0\1\15\1\0\22\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\7\15\1\255\12\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\7\15\1\266\12\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\15\2\0\1\15\17\0\1\15\1\0\11\15"+
    "\1\315\10\15\13\0\3\15\2\0\6\15\1\0\1\15"+
    "\2\0\1\15\17\0\1\15\1\0\6\15\1\273\13\15"+
    "\13\0\3\15\34\0\1\316\13\0\1\316\3\0\1\316"+
    "\16\0\1\316\12\0\1\25\125\0\1\317\105\0\1\320"+
    "\47\0\1\25\114\0\1\242\100\0\1\321\42\0\1\322"+
    "\131\0\1\242\77\0\1\243\62\0\1\323\13\0\1\323"+
    "\3\0\1\323\16\0\1\323\4\0\6\15\1\0\1\324"+
    "\2\0\1\15\17\0\1\15\1\0\12\15\1\301\1\15"+
    "\1\302\5\15\13\0\3\15\25\0\1\325\53\0\2\251"+
    "\4\0\1\146\67\0\2\252\73\0\6\15\1\0\1\326"+
    "\2\0\1\15\17\0\1\15\1\0\22\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\10\15\1\327\11\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\203\2\0\1\15\17\0\1\15\1\0\22\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\16\15\1\167\3\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\15\15\1\167\4\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\15\2\0\1\15\17\0\1\15\1\0\11\15"+
    "\1\203\2\15\1\257\5\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\15\2\0\1\15\17\0\1\15\1\0\6\15"+
    "\1\257\13\15\13\0\3\15\2\0\6\15\1\0\1\167"+
    "\2\0\1\15\17\0\1\15\1\0\22\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\1\330\21\15\13\0\3\15\2\0\6\15\1\0"+
    "\1\15\2\0\1\15\17\0\1\15\1\0\2\15\1\331"+
    "\17\15\13\0\3\15\2\0\6\15\1\0\1\15\2\0"+
    "\1\15\17\0\1\15\1\0\2\15\1\175\4\15\1\332"+
    "\12\15\13\0\3\15\2\0\6\15\1\0\1\172\2\0"+
    "\1\15\17\0\1\15\1\0\22\15\13\0\3\15\2\0"+
    "\6\15\1\0\1\15\2\0\1\15\17\0\1\15\1\0"+
    "\1\15\1\333\20\15\13\0\3\15\2\0\6\15\1\0"+
    "\1\334\2\0\1\15\17\0\1\15\1\0\22\15\13\0"+
    "\3\15\2\0\6\15\1\0\1\15\2\0\1\15\17\0"+
    "\1\15\1\0\2\15\1\300\17\15\13\0\3\15\2\0"+
    "\6\15\1\0\1\15\2\0\1\15\17\0\1\15\1\0"+
    "\1\335\21\15\13\0\3\15\2\0\6\15\1\0\1\15"+
    "\2\0\1\15\17\0\1\15\1\0\1\15\1\336\20\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\267\2\0\1\15"+
    "\17\0\1\15\1\0\22\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\202\2\0\1\15\17\0\1\15\1\0\22\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\2\15\1\337\17\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\10\15\1\204\11\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\340\2\0\1\15\17\0\1\15\1\0\22\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\12\15\1\341\7\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\6\15\1\337\13\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\15\2\0\1\15\17\0\1\15\1\0\7\15"+
    "\1\342\12\15\13\0\3\15\2\0\6\15\1\0\1\15"+
    "\2\0\1\15\17\0\1\15\1\0\3\15\1\167\16\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\5\15\1\343\14\15\13\0\3\15"+
    "\2\0\3\15\1\344\2\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\22\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\15\2\0\1\15\17\0\1\15\1\0\1\15"+
    "\1\345\20\15\13\0\3\15\2\0\6\15\1\0\1\15"+
    "\2\0\1\15\17\0\1\15\1\0\1\15\1\346\20\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\7\15\1\332\12\15\13\0\3\15"+
    "\34\0\1\347\13\0\1\347\3\0\1\347\16\0\1\347"+
    "\13\0\1\242\130\0\1\317\42\0\1\350\133\0\1\242"+
    "\62\0\1\351\13\0\1\351\3\0\1\351\16\0\1\351"+
    "\4\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\11\15\1\203\10\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\15\2\0\1\15\17\0\1\15\1\0\11\15"+
    "\1\352\10\15\13\0\3\15\2\0\6\15\1\0\1\15"+
    "\2\0\1\15\17\0\1\15\1\0\14\15\1\175\5\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\15\15\1\203\4\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\2\15\1\203\17\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\15\2\0\1\15\17\0\1\15\1\0\12\15"+
    "\1\353\7\15\13\0\3\15\2\0\6\15\1\0\1\15"+
    "\2\0\1\15\17\0\1\15\1\0\5\15\1\354\14\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\7\15\1\257\12\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\7\15\1\355\12\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\15\2\0\1\15\17\0\1\15\1\0\6\15"+
    "\1\356\13\15\13\0\3\15\2\0\6\15\1\0\1\15"+
    "\2\0\1\15\17\0\1\15\1\0\10\15\1\357\11\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\13\15\1\265\6\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\1\15\1\360\20\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\15\2\0\1\15\17\0\1\15\1\0\14\15"+
    "\1\324\5\15\13\0\3\15\2\0\6\15\1\0\1\15"+
    "\2\0\1\15\17\0\1\15\1\0\7\15\1\361\12\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\2\15\1\362\17\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\22\15\13\0\2\15\1\203\34\0\1\363\13\0"+
    "\1\363\3\0\1\363\16\0\1\363\42\0\1\364\37\0"+
    "\6\15\1\0\1\15\2\0\1\15\17\0\1\15\1\0"+
    "\3\15\1\331\16\15\13\0\3\15\2\0\6\15\1\0"+
    "\1\15\2\0\1\15\17\0\1\15\1\0\11\15\1\365"+
    "\10\15\13\0\3\15\2\0\6\15\1\0\1\15\2\0"+
    "\1\15\17\0\1\15\1\0\6\15\1\175\13\15\13\0"+
    "\3\15\2\0\6\15\1\0\1\15\2\0\1\15\17\0"+
    "\1\15\1\0\12\15\1\366\7\15\13\0\3\15\2\0"+
    "\6\15\1\0\1\15\2\0\1\15\17\0\1\15\1\0"+
    "\6\15\1\367\13\15\13\0\3\15\2\0\6\15\1\0"+
    "\1\15\2\0\1\15\17\0\1\15\1\0\4\15\1\203"+
    "\15\15\13\0\3\15\2\0\6\15\1\0\1\15\2\0"+
    "\1\15\17\0\1\15\1\0\11\15\1\370\10\15\13\0"+
    "\3\15\2\0\6\15\1\0\1\371\2\0\1\15\17\0"+
    "\1\15\1\0\22\15\13\0\3\15\2\0\6\15\1\0"+
    "\1\15\2\0\1\15\17\0\1\15\1\0\21\15\1\372"+
    "\13\0\3\15\40\0\1\242\37\0\6\15\1\0\1\15"+
    "\2\0\1\15\17\0\1\15\1\0\5\15\1\257\14\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\10\15\1\373\11\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\22\15\13\0\1\203\2\15\2\0\6\15\1\0"+
    "\1\15\2\0\1\15\17\0\1\15\1\0\1\303\21\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\11\15\1\374\10\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\14\15\1\375\5\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\15\2\0\1\15\17\0\1\15\1\0\11\15"+
    "\1\167\10\15\13\0\3\15\2\0\6\15\1\0\1\15"+
    "\2\0\1\15\17\0\1\15\1\0\3\15\1\376\16\15"+
    "\13\0\3\15\2\0\6\15\1\0\1\15\2\0\1\15"+
    "\17\0\1\15\1\0\10\15\1\377\11\15\13\0\3\15"+
    "\2\0\6\15\1\0\1\15\2\0\1\15\17\0\1\15"+
    "\1\0\2\15\1\167\17\15\13\0\3\15\2\0\6\15"+
    "\1\0\1\15\2\0\1\15\17\0\1\15\1\0\17\15"+
    "\1\167\2\15\13\0\3\15";

  private static int [] zzUnpackTrans() {
    int [] result = new int[13082];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\6\0\1\1\3\0\1\11\6\1\1\11\2\1\1\11"+
    "\3\1\1\11\1\1\4\11\20\1\5\11\6\1\1\11"+
    "\7\1\1\11\3\1\1\11\25\1\2\11\4\1\2\11"+
    "\1\1\3\0\3\1\1\11\2\1\2\0\42\1\1\11"+
    "\3\1\3\11\2\1\2\0\1\1\4\0\1\11\1\0"+
    "\4\1\1\0\2\1\1\0\10\1\1\11\32\1\4\0"+
    "\2\1\1\11\22\1\1\0\1\11\11\1\1\11\1\0"+
    "\13\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[255];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 148) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  // For Demetra compatibility
  public void reset(CharSequence buffer, int initialState){
    zzBuffer = buffer;
    zzBufferArray = null; 
    zzCurrentPos = zzMarkedPos = zzStartRead = 0;
    zzPushbackPos = 0;
    zzAtEOF = false;
    zzAtBOL = true;
    zzEndRead = buffer.length();
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 35: 
          { return Tokens.RESERVED_WORD;
          }
        case 45: break;
        case 19: 
          { yybegin(VERB); return Tokens.BRACKET;
          }
        case 46: break;
        case 34: 
          { yybegin(NOUN); return Tokens.FUNCTION;
          }
        case 47: break;
        case 21: 
          { yybegin(NOUN_OR_VERB); return Tokens.LINE_TERMINATOR;
          }
        case 48: break;
        case 25: 
          { yybegin(YYINITIAL); return Tokens.BAD_CHARACTER;
          }
        case 49: break;
        case 2: 
          { yybegin(YYINITIAL);   return Tokens.BAD_CHARACTER;
          }
        case 50: break;
        case 29: 
          { return Tokens.PARENTHESIS;
          }
        case 51: break;
        case 33: 
          { return Tokens.HEREDOCS;
          }
        case 52: break;
        case 26: 
          { final int length = yytext().length();
        if (length > 1) {
            yypushback(length -1);
            yybegin(REGULAR_EXPRESSION_FLAG);
        } else {
            yybegin(VERB);
        }
        return Tokens.REGULAR_EXPRESSION;
          }
        case 53: break;
        case 42: 
          { yybegin(HEREDOCS); return Tokens.HEREDOCS;
          }
        case 54: break;
        case 24: 
          { return Tokens.REGULAR_EXPRESSION;
          }
        case 55: break;
        case 23: 
          { yybegin(VERB); return Tokens.STRING;
          }
        case 56: break;
        case 14: 
          { yybegin(JAVASCRIPT); return Tokens.JAVASCRIPT;
          }
        case 57: break;
        case 1: 
          { yybegin(VERB); return Tokens.REGULAR_EXPRESSION_FLAG;
          }
        case 58: break;
        case 22: 
          { return Tokens.STRING;
          }
        case 59: break;
        case 43: 
          { yybegin(VERB);  return Tokens.HEREDOCS;
          }
        case 60: break;
        case 39: 
          { return Tokens.BAD_CHARACTER;
          }
        case 61: break;
        case 4: 
          { yybegin(NOUN_OR_VERB); return Tokens.IDENTIFIER;
          }
        case 62: break;
        case 16: 
          { yybegin(NOUN); return Tokens.SEMI_COLON;
          }
        case 63: break;
        case 38: 
          { yypushback(1); yybegin(REGULAR_EXPRESSION); return Tokens.REGULAR_EXPRESSION;
          }
        case 64: break;
        case 12: 
          { yybegin(NOUN); return Tokens.BRACE;
          }
        case 65: break;
        case 8: 
          { return Tokens.LINE_TERMINATOR;
          }
        case 66: break;
        case 28: 
          { yybegin(NOUN); return Tokens.ASSIGNMENT;
          }
        case 67: break;
        case 32: 
          { yybegin(YYINITIAL); return Tokens.JAVASCRIPT;
          }
        case 68: break;
        case 7: 
          { yybegin(NOUN); return Tokens.ACCESSOR;
          }
        case 69: break;
        case 6: 
          { yybegin(NOUN); return Tokens.OPERATOR;
          }
        case 70: break;
        case 15: 
          { yybegin(VERB); return Tokens.PARENTHESIS;
          }
        case 71: break;
        case 9: 
          { return Tokens.COMMENT;
          }
        case 72: break;
        case 27: 
          { yybegin(NOUN); return Tokens.DOT;
          }
        case 73: break;
        case 41: 
          { return Tokens.REGULAR_EXPRESSION_LITERAL;
          }
        case 74: break;
        case 13: 
          { yybegin(VERB); return Tokens.BRACE;
          }
        case 75: break;
        case 37: 
          { yybegin(VERB); return Tokens.BOOLEAN;
          }
        case 76: break;
        case 20: 
          { return Tokens.ASSIGNMENT;
          }
        case 77: break;
        case 5: 
          { yybegin(VERB); return Tokens.NUMBER;
          }
        case 78: break;
        case 11: 
          { yybegin(SINGLE_QUOTE_STRING); return Tokens.STRING;
          }
        case 79: break;
        case 36: 
          { yybegin(NOUN); return Tokens.KEYWORD;
          }
        case 80: break;
        case 44: 
          { yybegin(VERB); return Tokens.KEYWORD;
          }
        case 81: break;
        case 18: 
          { yybegin(NOUN); return Tokens.BRACKET;
          }
        case 82: break;
        case 30: 
          { yybegin(NOUN); return Tokens.COMMA;
          }
        case 83: break;
        case 40: 
          { return Tokens.STRING_LITERAL;
          }
        case 84: break;
        case 3: 
          { return Tokens.WHITESPACE;
          }
        case 85: break;
        case 17: 
          { yybegin(NOUN); return Tokens.PARENTHESIS;
          }
        case 86: break;
        case 10: 
          { yybegin(DOUBLE_QUOTE_STRING); return Tokens.STRING;
          }
        case 87: break;
        case 31: 
          { return Tokens.JAVASCRIPT;
          }
        case 88: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
