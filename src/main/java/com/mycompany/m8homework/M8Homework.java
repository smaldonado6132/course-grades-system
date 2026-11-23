/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m8homework;
/****************************************************************************************** 
* M8 Homework 
* Author: Sophia Maldonado 
* Project Purpose: This program creates and manages four graded activities including lab, pass/fail exam, essay, 
*                  and final exam. Using separate classes that store scores and determine letter grades.                 
* Input: This program does not accept inputs 
* Desired Output: The program prints each activity’s score and letter grade in a labeled list showing the lab, 
*                 pass/fail exam, essay, and final exam results. Also, the highest and lowest score and the corresponding index.
* Variables and Classes: There is one class, with the main method. It uses the System.out.println method. 
*             Variables: GradedActivity lab, PassFailExam pfExam, GradedActivity essay, FinalExam finalExam 
*          GradedACtivity class - Stores a numeric score and determines the letter grade
*          PassFailExam class - Calculates a score based on missed questions and determines pass/fail using a minimum passing score
*          FinalExam class - Computes a numeric score based on total questions and number missed.
*          CourseGrade class - Holds the four graded activities, calculates the average, and identifies the highest and lowest scores.
* Formulas: The values are stored as literals
* Testing: I tested the program by creating sample objects for each graded activity and verifying that the scores and letter grades printed correctly
* March 17, 2026 
*************************************************************************************/
public class M8Homework {

    public static void main(String[] args) {
       //Create the graded items
       GradedActivity lab = new GradedActivity();
       lab.setScore(85); 
       
       PassFailExam pfExam = new PassFailExam(10,7,70); //(questions, missed, minPassing)
       
       GradedActivity essay = new GradedActivity();
       essay.setScore(92);
       
       FinalExam finalExam = new FinalExam(50,42); //(questions, correct)
       
       // Create CourseGrades object
       CourseGrades course = new CourseGrades();
       
       course.setLab(lab);
       course.setPassFailExam(pfExam);
       course.setEssay(essay);
       course.setFinalExam(finalExam);
       
       //Display results
       System.out.println(course.toString());
       
       int highIndex = course.getHighest();
        int lowIndex = course.getLowest();

        System.out.println("\nHighest Score Index: " + highIndex +
                           " Score: " + course.getGrade(highIndex).getScore());

        System.out.println("Lowest Score Index: " + lowIndex +
                           " Score: " + course.getGrade(lowIndex).getScore());
    }
}


