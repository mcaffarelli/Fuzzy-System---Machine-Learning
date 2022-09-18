
package computer.topics.fuzzysystem;
import java.util.Scanner;
public class Fuzzy {
    public static void main(String[] args) {
        
         Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to My Fuzzy System!");
        System.out.println();
        System.out.println("This System was created to help regulate your pool temperature!");
        System.out.println("The inputs are the pools water level and the pools temperature.");
        System.out.println("The output is the percentage of power your water heater needs to run at for your pool to be a good temperature.");
        System.out.println();
        
        System.out.println("Now lets begin!");
        System.out.println("Please Enter your pools water level in gallons.");
        
        while (!scan.hasNextInt()) {
        System.out.println("Input is not a number.");
        scan.nextLine();
        }
        int WL = scan.nextInt();
        
        
        System.out.println("Please Enter your pools temperature in degrees fahrenheit.");
        
         while (!scan.hasNextInt()) {
        System.out.println("Input is not a number.");
        scan.nextLine();
        }
        int T = scan.nextInt();
        
        double LL =0;
        double ML =0;
        double HL =0;
         
        if (WL <= 10000) {
            LL = 1;
            ML = 0.06;
            HL = 0.02;
        }
        
        if (WL > 10000 && WL <= 12000) {
            
            LL = 0.09;
            ML = 0.07;
            HL = 0.03;
            
        }
         if (WL > 12000 && WL <= 14000) {
            
            LL = 0.08;
            ML = 0.08;
            HL = 0.04;
            
        }
         
          if (WL > 14000 && WL <= 16000) {
            
            LL = 0.07;
            ML = 0.09;
            HL = 0.05;
            
        }
          if (WL > 16000 && WL <= 18000) {
            
            LL = 0.06;
            ML = 0.01;
            HL = 0.06;
            
        }
            if (WL > 18000 && WL <= 20000) {
            
            LL = 0.05;
            ML = 0.09;
            HL = 0.07;
            
        }
            if (WL > 20000 && WL <= 22000) {
            
            LL = 0.04;
            ML = 0.08;
            HL = 0.08;
            
        } 
            if (WL > 22000 && WL <= 24000) {
            
            LL = 0.03;
            ML = 0.07;
            HL = 0.09;
            
        }
             if (WL > 24000 ) {
            
            LL = 0.02;
            ML = 0.06;
            HL = 1;
            
        }     
        
        double LT = 0;
        double MT = 0;   
        double HT = 0;   
             
             
         if (T <= 20) {
             
            LT = 1;
            MT = 0.06;
            HT = 0.02;
            
        }
        
        if (T > 20 && T <= 30) {
            
           LT = 0.09;
           MT = 0.07;
           HT = 0.03;
            
        }
         if (T > 30 && T <= 40) {
            
           LT = 0.08;
           MT = 0.08;
           HT = 0.04;
            
        } 
         if (T > 40 && T <= 50) {
            
           LT = 0.07;
           MT = 0.09;
           HT = 0.05;
            
        } 
        if (T > 50 && T <= 60) {
            
           LT = 0.06;
           MT = 1;
           HT = 0.06;
            
        }
        if (T > 60 && T <= 70) {
            
           LT = 0.05;
           MT = 0.09;
           HT = 0.07;
            
        }
         if (T > 70 && T <= 80) {
            
           LT = 0.04;
           MT = 0.08;
           HT = 0.08;
            
        }
         if (T > 80 && T <= 90) {
            
           LT = 0.03;
           MT = 0.07;
           HT = 0.09;
            
        } 
        if (T > 90) {
            
           LT = 0.02;
           MT = 0.06;
           HT = 1;
            
        }  
             
       
        
        double rule1 = Double.min(LT, LL);
        double rule2 = Double.min(MT, LL);
        double rule3 = Double.min(HT, LL);
        double rule4 = Double.min(LT, ML);
        double rule5 = Double.min(MT, ML);
        double rule6 = Double.min(ML, HT);
        double rule7 = Double.min(LT, HL);
        double rule8 = Double.min(MT, HL);
        double rule9 = Double.min(HT, HL);
        
        
        
        
        
        
        
        double arrayLh[] = new double[10];
        arrayLh[0] = 1;
        arrayLh[1] = 0.09;
        arrayLh[2] = 0.08;
        arrayLh[3] = 0.07;
        arrayLh[4] = 0.06;
        arrayLh[5] = 0.05;
        arrayLh[6] = 0.04;
        arrayLh[7] = 0.03;
        arrayLh[8] = 0.02;
        arrayLh[9] = 0.01;
         
        
         double arrayMh[] = new double[10];
        arrayMh[0] = 0.06;
        arrayMh[1] = 0.07;
        arrayMh[2] = 0.08;
        arrayMh[3] = 0.09;
        arrayMh[4] = 1;
        arrayMh[5] = 0.09;
        arrayMh[6] = 0.08;
        arrayMh[7] = 0.07;
        arrayMh[8] = 0.06;
        arrayMh[9] = 0.05;
        
       double arrayHh[] = new double[10];
        arrayHh[0] = 0.01;
        arrayHh[1] = 0.02;
        arrayHh[2] = 0.03;
        arrayHh[3] = 0.04;
        arrayHh[4] = 0.05;
        arrayHh[5] = 0.06;
        arrayHh[6] = 0.07;
        arrayHh[7] = 0.08;
        arrayHh[8] = 0.09;
        arrayHh[9] = 1; 
        
//-------------------------------------------------------------
          
        double arrayRule1[] = new double[10];
        
        
        double R1 = Double.min(rule1, arrayMh[0]);
        double R11 = Double.min(rule1, arrayMh[1]);
        double R12 = Double.min(rule1, arrayMh[2]);
        double R13 = Double.min(rule1, arrayMh[3]);
        double R14 = Double.min(rule1, arrayMh[4]);
        double R15 = Double.min(rule1, arrayMh[5]);
        double R16 = Double.min(rule1, arrayMh[6]);
        double R17 = Double.min(rule1, arrayMh[7]);
        double R18 = Double.min(rule1, arrayMh[8]);
        double R19 = Double.min(rule1, arrayMh[9]);
        
        arrayRule1[0] = R1;
        arrayRule1[1] = R11;
        arrayRule1[2] = R12;
        arrayRule1[3] = R13;
        arrayRule1[4] = R14;
        arrayRule1[5] = R15;
        arrayRule1[6] = R16;
        arrayRule1[7] = R17;
        arrayRule1[8] = R18;
        arrayRule1[9] = R19;
        
        
        //-------------------------------------------------------------
        
        double arrayRule2[] = new double[10];
        
        
        double R2 = Double.min(rule2, arrayLh[0]);
        double R21 = Double.min(rule2, arrayLh[1]);
        double R22 = Double.min(rule2, arrayLh[2]);
        double R23 = Double.min(rule2, arrayLh[3]);
        double R24 = Double.min(rule2, arrayLh[4]);
        double R25 = Double.min(rule2, arrayLh[5]);
        double R26 = Double.min(rule2, arrayLh[6]);
        double R27 = Double.min(rule2, arrayLh[7]);
        double R28 = Double.min(rule2, arrayLh[8]);
        double R29 = Double.min(rule2, arrayLh[9]);
        
        arrayRule2[0] = R2;
        arrayRule2[1] = R21;
        arrayRule2[2] = R22;
        arrayRule2[3] = R23;
        arrayRule2[4] = R24;
        arrayRule2[5] = R25;
        arrayRule2[6] = R26;
        arrayRule2[7] = R27;
        arrayRule2[8] = R28;
        arrayRule2[9] = R29;
        
        //-------------------------------------------------------------
        
        
        
        double arrayRule3[] = new double[10];
        
        
        double R3 = Double.min(rule3, arrayLh[0]);
        double R31 = Double.min(rule3, arrayLh[1]);
        double R32 = Double.min(rule3, arrayLh[2]);
        double R33 = Double.min(rule3, arrayLh[3]);
        double R34 = Double.min(rule3, arrayLh[4]);
        double R35 = Double.min(rule3, arrayLh[5]);
        double R36 = Double.min(rule3, arrayLh[6]);
        double R37 = Double.min(rule3, arrayLh[7]);
        double R38 = Double.min(rule3, arrayLh[8]);
        double R39 = Double.min(rule3, arrayLh[9]);
        
        arrayRule3[0] = R3;
        arrayRule3[1] = R31;
        arrayRule3[2] = R32;
        arrayRule3[3] = R33;
        arrayRule3[4] = R34;
        arrayRule3[5] = R35;
        arrayRule3[6] = R36;
        arrayRule3[7] = R37;
        arrayRule3[8] = R38;
        arrayRule3[9] = R39;
        
        //-------------------------------------------------------------
        
        double arrayRule4[] = new double[10];
        
        
        double R4 = Double.min(rule4, arrayHh[0]);
        double R41 = Double.min(rule4, arrayHh[1]);
        double R42 = Double.min(rule4, arrayHh[2]);
        double R43 = Double.min(rule4, arrayHh[3]);
        double R44 = Double.min(rule4, arrayHh[4]);
        double R45 = Double.min(rule4, arrayHh[5]);
        double R46 = Double.min(rule4, arrayHh[6]);
        double R47 = Double.min(rule4, arrayHh[7]);
        double R48 = Double.min(rule4, arrayHh[8]);
        double R49 = Double.min(rule4, arrayHh[9]);
        
        arrayRule4[0] = R4;
        arrayRule4[1] = R41;
        arrayRule4[2] = R42;
        arrayRule4[3] = R43;
        arrayRule4[4] = R44;
        arrayRule4[5] = R45;
        arrayRule4[6] = R46;
        arrayRule4[7] = R47;
        arrayRule4[8] = R48;
        arrayRule4[9] = R49;
        
        //-------------------------------------------------------------
        
        double arrayRule5[] = new double[10];
        
        
        double R5 = Double.min(rule5, arrayMh[0]);
        double R51 = Double.min(rule5, arrayMh[1]);
        double R52 = Double.min(rule5, arrayMh[2]);
        double R53 = Double.min(rule5, arrayMh[3]);
        double R54 = Double.min(rule5, arrayMh[4]);
        double R55 = Double.min(rule5, arrayMh[5]);
        double R56 = Double.min(rule5, arrayMh[6]);
        double R57 = Double.min(rule5, arrayMh[7]);
        double R58 = Double.min(rule5, arrayMh[8]);
        double R59 = Double.min(rule5, arrayMh[9]);
        
        arrayRule5[0] = R5;
        arrayRule5[1] = R51;
        arrayRule5[2] = R52;
        arrayRule5[3] = R53;
        arrayRule5[4] = R54;
        arrayRule5[5] = R55;
        arrayRule5[6] = R56;
        arrayRule5[7] = R57;
        arrayRule5[8] = R58;
        arrayRule5[9] = R59;
        
        //-------------------------------------------------------------
        
        double arrayRule6[] = new double[10];
        
        
        double R6 = Double.min(rule6, arrayLh[0]);
        double R61 = Double.min(rule6, arrayLh[1]);
        double R62 = Double.min(rule6, arrayLh[2]);
        double R63 = Double.min(rule6, arrayLh[3]);
        double R64 = Double.min(rule6, arrayLh[4]);
        double R65 = Double.min(rule6, arrayLh[5]);
        double R66 = Double.min(rule6, arrayLh[6]);
        double R67 = Double.min(rule6, arrayLh[7]);
        double R68 = Double.min(rule6, arrayLh[8]);
        double R69 = Double.min(rule6, arrayLh[9]);
        
        arrayRule6[0] = R6;
        arrayRule6[1] = R61;
        arrayRule6[2] = R62;
        arrayRule6[3] = R63;
        arrayRule6[4] = R64;
        arrayRule6[5] = R65;
        arrayRule6[6] = R66;
        arrayRule6[7] = R67;
        arrayRule6[8] = R68;
        arrayRule6[9] = R69;
        
        //-------------------------------------------------------------
        
        
        double arrayRule7[] = new double[10];
        
        
        double R7 = Double.min(rule7, arrayHh[0]);
        double R71 = Double.min(rule7, arrayHh[1]);
        double R72 = Double.min(rule7, arrayHh[2]);
        double R73 = Double.min(rule7, arrayHh[3]);
        double R74 = Double.min(rule7, arrayHh[4]);
        double R75 = Double.min(rule7, arrayHh[5]);
        double R76 = Double.min(rule7, arrayHh[6]);
        double R77 = Double.min(rule7, arrayHh[7]);
        double R78 = Double.min(rule7, arrayHh[8]);
        double R79 = Double.min(rule7, arrayHh[9]);
        
        arrayRule7[0] = R7;
        arrayRule7[1] = R71;
        arrayRule7[2] = R72;
        arrayRule7[3] = R73;
        arrayRule7[4] = R74;
        arrayRule7[5] = R75;
        arrayRule7[6] = R76;
        arrayRule7[7] = R77;
        arrayRule7[8] = R78;
        arrayRule7[9] = R79;
        
        //-------------------------------------------------------------
        
        
        
        double arrayRule8[] = new double[10];
        
        
        double R8 = Double.min(rule8, arrayLh[0]);
        double R81 = Double.min(rule8, arrayLh[1]);
        double R82 = Double.min(rule8, arrayLh[2]);
        double R83 = Double.min(rule8, arrayLh[3]);
        double R84 = Double.min(rule8, arrayLh[4]);
        double R85 = Double.min(rule8, arrayLh[5]);
        double R86 = Double.min(rule8, arrayLh[6]);
        double R87 = Double.min(rule8, arrayLh[7]);
        double R88 = Double.min(rule8, arrayLh[8]);
        double R89 = Double.min(rule8, arrayLh[9]);
        
        arrayRule8[0] = R8;
        arrayRule8[1] = R81;
        arrayRule8[2] = R82;
        arrayRule8[3] = R83;
        arrayRule8[4] = R84;
        arrayRule8[5] = R85;
        arrayRule8[6] = R86;
        arrayRule8[7] = R87;
        arrayRule8[8] = R88;
        arrayRule8[9] = R89;
        
        //-------------------------------------------------------------
        
        
        double arrayRule9[] = new double[10];
        
        
        double R9 = Double.min(rule9, arrayLh[0]);
        double R91 = Double.min(rule9, arrayLh[1]);
        double R92 = Double.min(rule9, arrayLh[2]);
        double R93 = Double.min(rule9, arrayLh[3]);
        double R94 = Double.min(rule9, arrayLh[4]);
        double R95 = Double.min(rule9, arrayLh[5]);
        double R96 = Double.min(rule9, arrayLh[6]);
        double R97 = Double.min(rule9, arrayLh[7]);
        double R98 = Double.min(rule9, arrayLh[8]);
        double R99 = Double.min(rule9, arrayLh[9]);
        
        arrayRule9[0] = R9;
        arrayRule9[1] = R91;
        arrayRule9[2] = R92;
        arrayRule9[3] = R93;
        arrayRule9[4] = R94;
        arrayRule9[5] = R95;
        arrayRule9[6] = R96;
        arrayRule9[7] = R97;
        arrayRule9[8] = R98;
        arrayRule9[9] = R99;
        
        //-------------------------------------------------------------

        double finalArray[] = new double[10];
        
        double max1 = Math.max(arrayRule1[0], arrayRule2[0]);
        max1 = Math.max(max1, arrayRule3[0]);
        max1 = Math.max(max1, arrayRule4[0]);
        max1 = Math.max(max1, arrayRule5[0]);
        max1 = Math.max(max1, arrayRule6[0]);
        max1 = Math.max(max1, arrayRule7[0]);
        max1 = Math.max(max1, arrayRule8[0]);
        max1 = Math.max(max1, arrayRule9[0]);
        
         //-------------------------------------------------------------

        
        
        double max2 = Math.max(arrayRule1[1], arrayRule2[1]);
        max2 = Math.max(max2, arrayRule3[1]);
        max2 = Math.max(max2, arrayRule4[1]);
        max2 = Math.max(max2, arrayRule5[1]);
        max2 = Math.max(max2, arrayRule6[1]);
        max2 = Math.max(max2, arrayRule7[1]);
        max2 = Math.max(max2, arrayRule8[1]);
        max2 = Math.max(max2, arrayRule9[1]);
        
         //-------------------------------------------------------------

        
        double max3 = Math.max(arrayRule1[2], arrayRule2[2]);
        max3 = Math.max(max3, arrayRule3[2]);
        max3 = Math.max(max3, arrayRule4[2]);
        max3 = Math.max(max3, arrayRule5[2]);
        max3 = Math.max(max3, arrayRule6[2]);
        max3 = Math.max(max3, arrayRule7[2]);
        max3 = Math.max(max3, arrayRule8[2]);
        max3 = Math.max(max3, arrayRule9[2]);
        
        //-------------------------------------------------------------

        
        double max4 = Math.max(arrayRule1[3], arrayRule2[3]);
        max4 = Math.max(max4, arrayRule3[3]);
        max4 = Math.max(max4, arrayRule4[3]);
        max4 = Math.max(max4, arrayRule5[3]);
        max4 = Math.max(max4, arrayRule6[3]);
        max4 = Math.max(max4, arrayRule7[3]);
        max4 = Math.max(max4, arrayRule8[3]);
        max4 = Math.max(max4, arrayRule9[3]);
        
        //-------------------------------------------------------------

        
        double max5 = Math.max(arrayRule1[4], arrayRule2[4]);
        max5 = Math.max(max5, arrayRule3[4]);
        max5 = Math.max(max5, arrayRule4[4]);
        max5 = Math.max(max5, arrayRule5[4]);
        max5 = Math.max(max5, arrayRule6[4]);
        max5 = Math.max(max5, arrayRule7[4]);
        max5 = Math.max(max5, arrayRule8[4]);
        max5 = Math.max(max5, arrayRule9[4]);
        
        //-------------------------------------------------------------

        
        double max6 = Math.max(arrayRule1[5], arrayRule2[5]);
        max6 = Math.max(max6, arrayRule3[5]);
        max6 = Math.max(max6, arrayRule4[5]);
        max6 = Math.max(max6, arrayRule5[5]);
        max6 = Math.max(max6, arrayRule6[5]);
        max6 = Math.max(max6, arrayRule7[5]);
        max6 = Math.max(max6, arrayRule8[5]);
        max6 = Math.max(max6, arrayRule9[5]);
        
        //-------------------------------------------------------------

        
        double max7 = Math.max(arrayRule1[6], arrayRule2[6]);
        max7 = Math.max(max7, arrayRule3[6]);
        max7 = Math.max(max7, arrayRule4[6]);
        max7 = Math.max(max7, arrayRule5[6]);
        max7 = Math.max(max7, arrayRule6[6]);
        max7 = Math.max(max7, arrayRule7[6]);
        max7 = Math.max(max7, arrayRule8[6]);
        max7 = Math.max(max7, arrayRule9[6]);
        
         //-------------------------------------------------------------

        
        double max8 = Math.max(arrayRule1[7], arrayRule2[7]);
        max8 = Math.max(max8, arrayRule3[7]);
        max8 = Math.max(max8, arrayRule4[7]);
        max8 = Math.max(max8, arrayRule5[7]);
        max8 = Math.max(max8, arrayRule6[7]);
        max8 = Math.max(max8, arrayRule7[7]);
        max8 = Math.max(max8, arrayRule8[7]);
        max8 = Math.max(max8, arrayRule9[7]);
        //-------------------------------------------------------------

        
        double max9 = Math.max(arrayRule1[8], arrayRule2[8]);
        max9 = Math.max(max9, arrayRule3[8]);
        max9 = Math.max(max9, arrayRule4[8]);
        max9 = Math.max(max9, arrayRule5[8]);
        max9 = Math.max(max9, arrayRule6[8]);
        max9 = Math.max(max9, arrayRule7[8]);
        max9 = Math.max(max9, arrayRule8[8]);
        max9 = Math.max(max9, arrayRule9[8]);
        
        //-------------------------------------------------------------

        
        double max10 = Math.max(arrayRule1[9], arrayRule2[9]);
        max10 = Math.max(max10, arrayRule3[9]);
        max10 = Math.max(max10, arrayRule4[9]);
        max10 = Math.max(max10, arrayRule5[9]);
        max10 = Math.max(max10, arrayRule6[9]);
        max10 = Math.max(max10, arrayRule7[9]);
        max10 = Math.max(max10, arrayRule8[9]);
        max10 = Math.max(max10, arrayRule9[9]);
        
        
        
                
                
                
        finalArray[0] = max1;
        finalArray[1] = max2;
        finalArray[2] = max3;
        finalArray[3] = max4;
        finalArray[4] = max5;
        finalArray[5] = max6;
        finalArray[6] = max7;
        finalArray[7] = max8;
        finalArray[8] = max9;
        finalArray[9] = max10;
        
        
        
        
        
       double top = (max1*10)+(max2*15)+(max3*25)+(max4*35)+(max5*45)+(max6*55)+(max7*65)+(max8*75)+(max9*85)+(max10*95);
       double bottom = (max1+max2+max3+max4+max5+max6+max7+max8+max9+max10);
       double answer = top/bottom;
       
       
      System.out.println(); 
      System.out.println(); 
      System.out.println("The fuzzy system answer is: " + Math.round(answer) ); 
      System.out.println("This means you should opperate your pool heater at " + Math.round(answer) + "%" + " capacity!" ); 
      
      
    
    }
}