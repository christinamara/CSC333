/* Generated By:JavaCC: Do not edit this line. JavaCCParserTokenManager.java */
package jminusminus;
import java.util.ArrayList;

public class JavaCCParserTokenManager implements JavaCCParserConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x7fffff80L) != 0L)
         {
            jjmatchedKind = 53;
            return 7;
         }
         return -1;
      case 1:
         if ((active0 & 0x7fffbf80L) != 0L)
         {
            jjmatchedKind = 53;
            jjmatchedPos = 1;
            return 7;
         }
         if ((active0 & 0x4000L) != 0L)
            return 7;
         return -1;
      case 2:
         if ((active0 & 0x7ff9bf80L) != 0L)
         {
            jjmatchedKind = 53;
            jjmatchedPos = 2;
            return 7;
         }
         if ((active0 & 0x60000L) != 0L)
            return 7;
         return -1;
      case 3:
         if ((active0 & 0x47f1b580L) != 0L)
         {
            jjmatchedKind = 53;
            jjmatchedPos = 3;
            return 7;
         }
         if ((active0 & 0x38080a00L) != 0L)
            return 7;
         return -1;
      case 4:
         if ((active0 & 0x3f19180L) != 0L)
         {
            jjmatchedKind = 53;
            jjmatchedPos = 4;
            return 7;
         }
         if ((active0 & 0x44002400L) != 0L)
            return 7;
         return -1;
      case 5:
         if ((active0 & 0x711180L) != 0L)
         {
            jjmatchedKind = 53;
            jjmatchedPos = 5;
            return 7;
         }
         if ((active0 & 0x3808000L) != 0L)
            return 7;
         return -1;
      case 6:
         if ((active0 & 0x410080L) != 0L)
         {
            jjmatchedKind = 53;
            jjmatchedPos = 6;
            return 7;
         }
         if ((active0 & 0x301100L) != 0L)
            return 7;
         return -1;
      case 7:
         if ((active0 & 0x410000L) != 0L)
         {
            jjmatchedKind = 53;
            jjmatchedPos = 7;
            return 7;
         }
         if ((active0 & 0x80L) != 0L)
            return 7;
         return -1;
      case 8:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 53;
            jjmatchedPos = 8;
            return 7;
         }
         if ((active0 & 0x400000L) != 0L)
            return 7;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 40);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 40:
         return jjStopAtPos(0, 44);
      case 41:
         return jjStopAtPos(0, 45);
      case 42:
         return jjStopAtPos(0, 43);
      case 43:
         jjmatchedKind = 31;
         return jjMoveStringLiteralDfa1_0(0x41000000000L);
      case 44:
         return jjStopAtPos(0, 51);
      case 45:
         jjmatchedKind = 41;
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 46:
         return jjStopAtPos(0, 52);
      case 59:
         return jjStopAtPos(0, 50);
      case 60:
         return jjMoveStringLiteralDfa1_0(0xc000000000L);
      case 61:
         jjmatchedKind = 32;
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 62:
         return jjStopAtPos(0, 35);
      case 91:
         return jjStopAtPos(0, 48);
      case 93:
         return jjStopAtPos(0, 49);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x600L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x1800L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x3c000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0xc0000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0xf00000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x6000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x18000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 123:
         return jjStopAtPos(0, 46);
      case 125:
         return jjStopAtPos(0, 47);
      default :
         return jjMoveNfa_0(5, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         break;
      case 43:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         break;
      case 45:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         break;
      case 60:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         break;
      case 61:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(1, 42);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x102000L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x1040000L);
      case 102:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(1, 14, 7);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x48000200L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0xc00L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x30000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000100L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x10600000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x4880000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000600L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x68200000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x82000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x400100L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x4008000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x10880L);
      case 116:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(2, 17, 7);
         return jjMoveStringLiteralDfa3_0(active0, 0x1001000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 119:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(2, 18, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(3, 29, 7);
         break;
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 7);
         else if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(3, 28, 7);
         return jjMoveStringLiteralDfa4_0(active0, 0x4001000L);
      case 107:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 108:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(3, 19, 7);
         return jjMoveStringLiteralDfa4_0(active0, 0x40800100L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 114:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(3, 9, 7);
         break;
      case 115:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(3, 27, 7);
         return jjMoveStringLiteralDfa4_0(active0, 0x2400L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x2410080L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000L);
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x310000L);
      case 101:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 7);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(4, 30, 7);
         return jjMoveStringLiteralDfa5_0(active0, 0x400100L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x2800000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 114:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(4, 26, 7);
         return jjMoveStringLiteralDfa5_0(active0, 0x1008080L);
      case 115:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(4, 10, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x180L);
      case 99:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(5, 23, 7);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(5, 25, 7);
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      case 103:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      case 110:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(5, 24, 7);
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 116:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(5, 15, 7);
         return jjMoveStringLiteralDfa6_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private final int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x10080L);
      case 101:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(6, 20, 7);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(6, 21, 7);
         break;
      case 110:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(6, 8, 7);
         break;
      case 115:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(6, 12, 7);
         break;
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private final int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x410000L);
      case 116:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(7, 7, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private final int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(8, 22, 7);
         break;
      case 111:
         return jjMoveStringLiteralDfa9_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private final int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 102:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(9, 16, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 25;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 57)
                        kind = 57;
                     jjCheckNAdd(9);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 57)
                        kind = 57;
                     jjAddStates(0, 1);
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(2, 4);
                  else if (curChar == 39)
                     jjAddStates(5, 6);
                  else if (curChar == 36)
                  {
                     if (kind > 53)
                        kind = 53;
                     jjCheckNAdd(7);
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar == 47)
                     jjCheckNAddStates(7, 9);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(7, 9);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 3:
                  if (curChar == 10 && kind > 6)
                     kind = 6;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 6:
                  if (curChar != 36)
                     break;
                  if (kind > 53)
                     kind = 53;
                  jjCheckNAdd(7);
                  break;
               case 7:
                  if ((0x3ff001000000000L & l) == 0L)
                     break;
                  if (kind > 53)
                     kind = 53;
                  jjCheckNAdd(7);
                  break;
               case 8:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 57)
                     kind = 57;
                  jjCheckNAdd(9);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 57)
                     kind = 57;
                  jjCheckNAdd(9);
                  break;
               case 10:
                  if (curChar == 39)
                     jjAddStates(5, 6);
                  break;
               case 12:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAdd(13);
                  break;
               case 13:
                  if (curChar == 39 && kind > 62)
                     kind = 62;
                  break;
               case 14:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAdd(13);
                  break;
               case 15:
                  if (curChar == 34)
                     jjCheckNAddStates(2, 4);
                  break;
               case 17:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 18:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 19:
                  if (curChar == 34 && kind > 63)
                     kind = 63;
                  break;
               case 20:
                  if (curChar != 48)
                     break;
                  if (kind > 57)
                     kind = 57;
                  jjAddStates(0, 1);
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 60)
                     kind = 60;
                  jjstateSet[jjnewStateCnt++] = 24;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 5:
               case 7:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 53)
                     kind = 53;
                  jjCheckNAdd(7);
                  break;
               case 1:
                  jjAddStates(7, 9);
                  break;
               case 11:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 12:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAdd(13);
                  break;
               case 14:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAdd(13);
                  break;
               case 16:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 17:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 18:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 21:
                  if ((0x400000004L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 23:
                  if ((0x100000001000000L & l) == 0L)
                     break;
                  if (kind > 60)
                     kind = 60;
                  jjstateSet[jjnewStateCnt++] = 24;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(7, 9);
                  break;
               case 14:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 18:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(2, 4);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 25 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   21, 23, 16, 18, 19, 11, 14, 1, 2, 4, 
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\141\142\163\164\162\141\143\164", 
"\142\157\157\154\145\141\156", "\143\150\141\162", "\143\154\141\163\163", "\145\154\163\145", 
"\145\170\164\145\156\144\163", "\146\141\154\163\145", "\151\146", "\151\155\160\157\162\164", 
"\151\156\163\164\141\156\143\145\157\146", "\151\156\164", "\156\145\167", "\156\165\154\154", 
"\160\141\143\153\141\147\145", "\160\162\151\166\141\164\145", "\160\162\157\164\145\143\164\145\144", 
"\160\165\142\154\151\143", "\162\145\164\165\162\156", "\163\164\141\164\151\143", 
"\163\165\160\145\162", "\164\150\151\163", "\164\162\165\145", "\166\157\151\144", 
"\167\150\151\154\145", "\53", "\75", "\55\55", "\75\75", "\76", "\53\53", "\46\46", "\74\75", 
"\74\74", "\41", "\55", "\53\75", "\52", "\50", "\51", "\173", "\175", "\133", "\135", 
"\73", "\54", "\56", null, null, null, null, null, null, null, null, null, null, null, 
null, null, };
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0xd63fffffffffff81L, 0x2L, 
};
static final long[] jjtoSkip = {
   0x7eL, 0x0L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[25];
private final int[] jjstateSet = new int[50];
protected char curChar;
public JavaCCParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public JavaCCParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 25; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedPos == 0 && jjmatchedKind > 65)
   {
      jjmatchedKind = 65;
   }
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

}
