// Command.java
//
// Copyright (C) 2000 by Richard Blaylock <blaylock@slurm.com>.
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
// are met:
// 1. Redistributions of source code must retain the above copyright
//    notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above copyright
//    notice, this list of conditions and the following disclaimer in the
//    documentation and/or other materials provided with the distribution.
//
// THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS ``AS IS'' AND
// ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
// ARE DISCLAIMED.  IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS BE LIABLE
// FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
// DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
// OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
// HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
// LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
// OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE.

package com.slurm.gf.command;

/**
 * Abstract class to encapsulate a command in the generic font
 * &quot;language&quot;"
 * Concrete subclasses allow access to the fields of the various commands.
 * This class also defines the opcode constants specified in the language.
 *
 * @author Richard Blaylock
 */

public abstract class Command {

  public static final int PAINT_0 = 0;
  public static final int PAINT_1 = 1;
  public static final int PAINT_2 = 2;
  public static final int PAINT_3 = 3;
  public static final int PAINT_4 = 4;
  public static final int PAINT_5 = 5;
  public static final int PAINT_6 = 6;
  public static final int PAINT_7 = 7;
  public static final int PAINT_8 = 8;
  public static final int PAINT_9 = 9;
  public static final int PAINT_10 = 10;
  public static final int PAINT_11 = 11;
  public static final int PAINT_12 = 12;
  public static final int PAINT_13 = 13;
  public static final int PAINT_14 = 14;
  public static final int PAINT_15 = 15;
  public static final int PAINT_16 = 16;
  public static final int PAINT_17 = 17;
  public static final int PAINT_18 = 18;
  public static final int PAINT_19 = 19;
  public static final int PAINT_20 = 20;
  public static final int PAINT_21 = 21;
  public static final int PAINT_22 = 22;
  public static final int PAINT_23 = 23;
  public static final int PAINT_24 = 24;
  public static final int PAINT_25 = 25;
  public static final int PAINT_26 = 26;
  public static final int PAINT_27 = 27;
  public static final int PAINT_28 = 28;
  public static final int PAINT_29 = 29;
  public static final int PAINT_30 = 30;
  public static final int PAINT_31 = 31;
  public static final int PAINT_32 = 32;
  public static final int PAINT_33 = 33;
  public static final int PAINT_34 = 34;
  public static final int PAINT_35 = 35;
  public static final int PAINT_36 = 36;
  public static final int PAINT_37 = 37;
  public static final int PAINT_38 = 38;
  public static final int PAINT_39 = 39;
  public static final int PAINT_40 = 40;
  public static final int PAINT_41 = 41;
  public static final int PAINT_42 = 42;
  public static final int PAINT_43 = 43;
  public static final int PAINT_44 = 44;
  public static final int PAINT_45 = 45;
  public static final int PAINT_46 = 46;
  public static final int PAINT_47 = 47;
  public static final int PAINT_48 = 48;
  public static final int PAINT_49 = 49;
  public static final int PAINT_50 = 50;
  public static final int PAINT_51 = 51;
  public static final int PAINT_52 = 52;
  public static final int PAINT_53 = 53;
  public static final int PAINT_54 = 54;
  public static final int PAINT_55 = 55;
  public static final int PAINT_56 = 56;
  public static final int PAINT_57 = 57;
  public static final int PAINT_58 = 58;
  public static final int PAINT_59 = 59;
  public static final int PAINT_60 = 60;
  public static final int PAINT_61 = 61;
  public static final int PAINT_62 = 62;
  public static final int PAINT_63 = 63;
  public static final int PAINT1 = 64;
  public static final int PAINT2 = 65;
  public static final int PAINT3 = 66;
  public static final int BOC = 67;
  public static final int BOC1 = 68;
  public static final int EOC = 69;
  public static final int SKIP0 = 70;
  public static final int SKIP1 = 71;
  public static final int SKIP2 = 72;
  public static final int SKIP3 = 73;
  public static final int NEW_ROW_0 = 74;
  public static final int NEW_ROW_1 = 75;
  public static final int NEW_ROW_2 = 76;
  public static final int NEW_ROW_3 = 77;
  public static final int NEW_ROW_4 = 78;
  public static final int NEW_ROW_5 = 79;
  public static final int NEW_ROW_6 = 80;
  public static final int NEW_ROW_7 = 81;
  public static final int NEW_ROW_8 = 82;
  public static final int NEW_ROW_9 = 83;
  public static final int NEW_ROW_10 = 84;
  public static final int NEW_ROW_11 = 85;
  public static final int NEW_ROW_12 = 86;
  public static final int NEW_ROW_13 = 87;
  public static final int NEW_ROW_14 = 88;
  public static final int NEW_ROW_15 = 89;
  public static final int NEW_ROW_16 = 90;
  public static final int NEW_ROW_17 = 91;
  public static final int NEW_ROW_18 = 92;
  public static final int NEW_ROW_19 = 93;
  public static final int NEW_ROW_20 = 94;
  public static final int NEW_ROW_21 = 95;
  public static final int NEW_ROW_22 = 96;
  public static final int NEW_ROW_23 = 97;
  public static final int NEW_ROW_24 = 98;
  public static final int NEW_ROW_25 = 99;
  public static final int NEW_ROW_26 = 100;
  public static final int NEW_ROW_27 = 101;
  public static final int NEW_ROW_28 = 102;
  public static final int NEW_ROW_29 = 103;
  public static final int NEW_ROW_30 = 104;
  public static final int NEW_ROW_31 = 105;
  public static final int NEW_ROW_32 = 106;
  public static final int NEW_ROW_33 = 107;
  public static final int NEW_ROW_34 = 108;
  public static final int NEW_ROW_35 = 109;
  public static final int NEW_ROW_36 = 110;
  public static final int NEW_ROW_37 = 111;
  public static final int NEW_ROW_38 = 112;
  public static final int NEW_ROW_39 = 113;
  public static final int NEW_ROW_40 = 114;
  public static final int NEW_ROW_41 = 115;
  public static final int NEW_ROW_42 = 116;
  public static final int NEW_ROW_43 = 117;
  public static final int NEW_ROW_44 = 118;
  public static final int NEW_ROW_45 = 119;
  public static final int NEW_ROW_46 = 120;
  public static final int NEW_ROW_47 = 121;
  public static final int NEW_ROW_48 = 122;
  public static final int NEW_ROW_49 = 123;
  public static final int NEW_ROW_50 = 124;
  public static final int NEW_ROW_51 = 125;
  public static final int NEW_ROW_52 = 126;
  public static final int NEW_ROW_53 = 127;
  public static final int NEW_ROW_54 = 128;
  public static final int NEW_ROW_55 = 129;
  public static final int NEW_ROW_56 = 130;
  public static final int NEW_ROW_57 = 131;
  public static final int NEW_ROW_58 = 132;
  public static final int NEW_ROW_59 = 133;
  public static final int NEW_ROW_60 = 134;
  public static final int NEW_ROW_61 = 135;
  public static final int NEW_ROW_62 = 136;
  public static final int NEW_ROW_63 = 137;
  public static final int NEW_ROW_64 = 138;
  public static final int NEW_ROW_65 = 139;
  public static final int NEW_ROW_66 = 140;
  public static final int NEW_ROW_67 = 141;
  public static final int NEW_ROW_68 = 142;
  public static final int NEW_ROW_69 = 143;
  public static final int NEW_ROW_70 = 144;
  public static final int NEW_ROW_71 = 145;
  public static final int NEW_ROW_72 = 146;
  public static final int NEW_ROW_73 = 147;
  public static final int NEW_ROW_74 = 148;
  public static final int NEW_ROW_75 = 149;
  public static final int NEW_ROW_76 = 150;
  public static final int NEW_ROW_77 = 151;
  public static final int NEW_ROW_78 = 152;
  public static final int NEW_ROW_79 = 153;
  public static final int NEW_ROW_80 = 154;
  public static final int NEW_ROW_81 = 155;
  public static final int NEW_ROW_82 = 156;
  public static final int NEW_ROW_83 = 157;
  public static final int NEW_ROW_84 = 158;
  public static final int NEW_ROW_85 = 159;
  public static final int NEW_ROW_86 = 160;
  public static final int NEW_ROW_87 = 161;
  public static final int NEW_ROW_88 = 162;
  public static final int NEW_ROW_89 = 163;
  public static final int NEW_ROW_90 = 164;
  public static final int NEW_ROW_91 = 165;
  public static final int NEW_ROW_92 = 166;
  public static final int NEW_ROW_93 = 167;
  public static final int NEW_ROW_94 = 168;
  public static final int NEW_ROW_95 = 169;
  public static final int NEW_ROW_96 = 170;
  public static final int NEW_ROW_97 = 171;
  public static final int NEW_ROW_98 = 172;
  public static final int NEW_ROW_99 = 173;
  public static final int NEW_ROW_100 = 174;
  public static final int NEW_ROW_101 = 175;
  public static final int NEW_ROW_102 = 176;
  public static final int NEW_ROW_103 = 177;
  public static final int NEW_ROW_104 = 178;
  public static final int NEW_ROW_105 = 179;
  public static final int NEW_ROW_106 = 180;
  public static final int NEW_ROW_107 = 181;
  public static final int NEW_ROW_108 = 182;
  public static final int NEW_ROW_109 = 183;
  public static final int NEW_ROW_110 = 184;
  public static final int NEW_ROW_111 = 185;
  public static final int NEW_ROW_112 = 186;
  public static final int NEW_ROW_113 = 187;
  public static final int NEW_ROW_114 = 188;
  public static final int NEW_ROW_115 = 189;
  public static final int NEW_ROW_116 = 190;
  public static final int NEW_ROW_117 = 191;
  public static final int NEW_ROW_118 = 192;
  public static final int NEW_ROW_119 = 193;
  public static final int NEW_ROW_120 = 194;
  public static final int NEW_ROW_121 = 195;
  public static final int NEW_ROW_122 = 196;
  public static final int NEW_ROW_123 = 197;
  public static final int NEW_ROW_124 = 198;
  public static final int NEW_ROW_125 = 199;
  public static final int NEW_ROW_126 = 200;
  public static final int NEW_ROW_127 = 201;
  public static final int NEW_ROW_128 = 202;
  public static final int NEW_ROW_129 = 203;
  public static final int NEW_ROW_130 = 204;
  public static final int NEW_ROW_131 = 205;
  public static final int NEW_ROW_132 = 206;
  public static final int NEW_ROW_133 = 207;
  public static final int NEW_ROW_134 = 208;
  public static final int NEW_ROW_135 = 209;
  public static final int NEW_ROW_136 = 210;
  public static final int NEW_ROW_137 = 211;
  public static final int NEW_ROW_138 = 212;
  public static final int NEW_ROW_139 = 213;
  public static final int NEW_ROW_140 = 214;
  public static final int NEW_ROW_141 = 215;
  public static final int NEW_ROW_142 = 216;
  public static final int NEW_ROW_143 = 217;
  public static final int NEW_ROW_144 = 218;
  public static final int NEW_ROW_145 = 219;
  public static final int NEW_ROW_146 = 220;
  public static final int NEW_ROW_147 = 221;
  public static final int NEW_ROW_148 = 222;
  public static final int NEW_ROW_149 = 223;
  public static final int NEW_ROW_150 = 224;
  public static final int NEW_ROW_151 = 225;
  public static final int NEW_ROW_152 = 226;
  public static final int NEW_ROW_153 = 227;
  public static final int NEW_ROW_154 = 228;
  public static final int NEW_ROW_155 = 229;
  public static final int NEW_ROW_156 = 230;
  public static final int NEW_ROW_157 = 231;
  public static final int NEW_ROW_158 = 232;
  public static final int NEW_ROW_159 = 233;
  public static final int NEW_ROW_160 = 234;
  public static final int NEW_ROW_161 = 235;
  public static final int NEW_ROW_162 = 236;
  public static final int NEW_ROW_163 = 237;
  public static final int NEW_ROW_164 = 238;
  public static final int XXX1 = 239;
  public static final int XXX2 = 240;
  public static final int XXX3 = 241;
  public static final int XXX4 = 242;
  public static final int YYY = 243;
  public static final int NO_OP = 244;
  public static final int CHAR_LOC = 245;
  public static final int CHAR_LOC0 = 246;
  public static final int PRE = 247;
  public static final int POST = 248;
  public static final int POST_POST = 249;

  public static final int GF_ID_BYTE = 131;
  public static final int GF_POST_SIG = 223;

  /**
   * The zero-based location (byte number) of this command within
   * the GF file.
   */
  private int location;


  /**
   * The opcode of this command. 
   */
  private int opcode;

  /**
   * Creates a Command object with the specified location and opcode.
   *
   * @param l the byte location of this Command within the GF file.
   * @param o the opcode of this Command.
   */
  public Command(int l, int o) {
    location = l;
    opcode = o;
  }

  /**
   * @return the opcode of this Command.
   */
  public int getOpCode() {
    return opcode;
  }

  /**
   * @return the byte location of this Command within the GF file.
   */
  public int getLocation() {
    return location;
  }
}
