/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

import java.util.Scanner;

/**
 *
 * @author barcz
 */
public class JavaCodingInterview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         int menuNumber;
         TwoSum twoSum = new TwoSum();
         MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
         NumberComplement numberComplement = new NumberComplement();
         HammingDistance hammingDistance = new HammingDistance();
         PalindromeNumber palindromeNumber = new PalindromeNumber();
         MergeSortedArray mergeSortedArray = new MergeSortedArray();
         JewelsandStones jewelsandStones = new JewelsandStones();
         The3Sum the3Sum = new The3Sum();
         PascalsTriangle pascalsTriangle = new PascalsTriangle();
         ProductofArrayExceptSelf productofArrayExceptSelf = new ProductofArrayExceptSelf();
         LargestNumberAtLeastTwiceofOthers  largestNumberAtLeastTwiceofOthers = new LargestNumberAtLeastTwiceofOthers();
         SortanArray sortanArray = new SortanArray();
         SubarraySumEqualsK subarraySumEquals = new SubarraySumEqualsK();
         TwoSumII twoSumII = new TwoSumII();
         SortColors sortColors = new SortColors();
         
         
          do {
            System.out.println("\n Please choose which program would you like to run :");
            System.out.println("666: Help test menu");
            System.out.println("1: Two Sum"); 
            System.out.println("2: Max Consecutive Ones");
            System.out.println("3: Number Complement");
            System.out.println("4: Hamming Distance");
            System.out.println("5: Palindrome Number");
            System.out.println("6: Merge Sorted Array");
            System.out.println("7: Jewels and Stones");
            System.out.println("8: 3Sum");
            System.out.println("9: Pascal`s Triangle");
            System.out.println("10: Product of Array Except Self");
            System.out.println("11: Largest Number At Least Twice of Others");
            System.out.println("12: Sort an Array");
            System.out.println("13: Subarray Sum Equals K");
            System.out.println("14: Two Sum II - Input array is not sorted");
            System.out.println("15: Sort Colors");
            
            
            
            
             
            System.out.println("0: EXIT");
                Scanner input =  new Scanner(System.in);
                if (input.hasNextInt()) {
                    menuNumber = input.nextInt();
                   
                    
                    
                    switch (menuNumber){
                        case 0:
                            System.exit(0);
                            break;
                        case 1:
                            int[] twoSumNums = {2, 7, 11, 15};
                            int twoSumtarget = 9;
                            twoSum.solution(twoSumNums, twoSumtarget);
                            break;
                        case 2:
                            //int[] maxConsecutiveOnesInput = {1,1,0,1,1,1};
                            int[] maxConsecutiveOnesInput = {1,1,0,1,1,1,0,1,1,1,1,1,1,0,0,0,1,1,1};
                            maxConsecutiveOnes.solution(maxConsecutiveOnesInput);
                            break;
                        case 3:
                            int numberComplementNumber = 5;
                            numberComplement.solution(numberComplementNumber);
                            break;
                        case 4:
                            int hammingInput = 11;
                            int hammingInput2 = 23;
                            hammingDistance.solution(hammingInput, hammingInput2);
                            break;
                        case 5:
                            int palindromeNumberN = 121;
                            palindromeNumber.solution(palindromeNumberN);
                            break;
                        case 6:
                            int[] mergeSortedArrayM = {1,2,3};
                            int[] mergeSortedArrayN = {2,5,6};
                            mergeSortedArray.solution(mergeSortedArrayM,mergeSortedArrayN);
                        case 7:
                            String jewelsandStonesJ = "aA";
                            String jewelsandStonesS =  "aAAbbbb";  
                            jewelsandStones.solution(jewelsandStonesJ,jewelsandStonesS);
                        case 8:
                            int[] the3Sumnums = {-1, 0, 1, 2, -1, -4};
                            the3Sum.solution(the3Sumnums);
                            break;
                        case 9:
                            int pascalsTriangleN = 5;
                            pascalsTriangle.generate(pascalsTriangleN);
                            break;
                        case 10:
                            //int[] productofArrayExceptSelfN = {1,2,3,4};
                            int[] productofArrayExceptSelfN = {4,5,1,8,2};
                            productofArrayExceptSelf.productExceptSelf(productofArrayExceptSelfN);
                            productofArrayExceptSelf.productExceptSelf2(productofArrayExceptSelfN);
                            break;
                        case 11:
                            //int[] largestNumberAtLeastTwiceofOthersN = {3, 6, 1, 0};
                            int[] largestNumberAtLeastTwiceofOthersN = {1, 2, 3, 4};
                            largestNumberAtLeastTwiceofOthers.dominantIndex(largestNumberAtLeastTwiceofOthersN);
                            break;
                        case 12:
                            int[] sortanArrayN = {5,2,3,1};
                            //sortanArrayN = {5,1,1,2,0,0};
                            sortanArray.solution(sortanArrayN);
                            break;
                        case 13:
                            //int[] subarraySumEqualsN = {1,1,1};
                            //int subarraySumEqualsK = 2;
                            int[] subarraySumEqualsN = {4,9,8,1,2,4};
                            int subarraySumEqualsK = 7;
                            subarraySumEquals.solution(subarraySumEqualsN,subarraySumEqualsK);
                            break;
                        case 14:
                            int[] twoSumNumsX = {15,7,11,2};
                            int twoSumtargetX = 9;
                            twoSumII.solution(twoSumNumsX, twoSumtargetX);
                            break;
                        case 15:
                            int[] sortColorsN = {2,0,2,1,1,0};
                            sortColors.solution(sortColorsN);
                            break;
                        default:
                            System.exit(0);
                    }
                        
                    
                    
                }else {
                            break;
                            }
          
                }while(menuNumber!=0);
                
                    
    }
    
}
