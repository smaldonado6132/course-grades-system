/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m8homework;

/**
 *
 * @author smald
 */
public class PassFailExam extends GradedActivity {
    private int numQuestions;
    private int numMissed;
    private double pointsEach;
    private double minPassingScore;

    // calculates score based on missed questions
    public PassFailExam(int questions, int missed, double minPassing) {
        numQuestions = questions;
        numMissed = missed;
        minPassingScore = minPassing;
        
        // each questions is worth an equal portion of 100%
        pointsEach = 100.0/ numQuestions;
        // calculate the numeric score, starting at 100 and subtracting missed points
        double numericScore = 100.0 - (missed * pointsEach);
        // store the score in the parent class
        setScore(numericScore);
    }
    // returns how many points each quesion is worth
    public double getPointsEach() {
        return pointsEach;
    }
    //returns how many questions teh student missed
    public int getNumMissed(){
        return numMissed;
    }
    
    
}
