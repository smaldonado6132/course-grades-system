/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m8homework;

/**
 *
 * @author smald
 */
public class CourseGrades {
   // array to hold the four graded components
   private GradedActivity[] grades = new GradedActivity[4];

   // stores lab grade in index 0
    public void setLab(GradedActivity g) {
        grades[0] = g;
    }

    // stores the pass/fal exam grade in index 1
    public void setPassFailExam(PassFailExam p) {
        grades[1] = p;
    }

    // stores the essay grade in index 2
    public void setEssay(GradedActivity e) {
        grades[2] = e;
    }

    // stores the final exam grade in index 3
    public void setFinalExam(FinalExam f) {
        grades[3] = f;
    }

    // returns GradedActivity object at the given index
     public GradedActivity getGrade(int index) {
        return grades[index];
    }

     // calculates average score of all four graded activities
    public double getAverage() {
        double total = 0;

        for (int i = 0; i < grades.length; i++) {
            total += grades[i].getScore();
        }

        return total / grades.length;
    }

    // returns index of the highest score in the array
    public int getHighest() {
        int highestIndex = 0;

        for (int i = 1; i < grades.length; i++) {
            if (grades[i].getScore() > grades[highestIndex].getScore()) {
                highestIndex = i;
            }
        }

        return highestIndex;
    }

    // returns score of the lowest score in the array
    public int getLowest() {
        int lowestIndex = 0;

        for (int i = 1; i < grades.length; i++) {
            if (grades[i].getScore() < grades[lowestIndex].getScore()) {
                lowestIndex = i;
            }
        }

        return lowestIndex;
    }


    public String toString() {
        String str = "Lab Score: " + grades[0].getScore() +
                     " Grade: " + grades[0].getGrade() + "\n" +
                     "Pass/Fail Exam Score: " + grades[1].getScore() +
                     " Grade: " + grades[1].getGrade() + "\n" +
                     "Essay Score: " + grades[2].getScore() +
                     " Grade: " + grades[2].getGrade() + "\n" +
                     "Final Exam Score: " + grades[3].getScore() +
                     " Grade: " + grades[3].getGrade();

        return str;
    } 
}
