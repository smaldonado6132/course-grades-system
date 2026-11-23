/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m8homework;

/**
 *
 * @author smald
 */
public class FinalExam extends GradedActivity {
    private int numQuestions;
    private int numMissed;
    private double pointsEach;

    // calculates numeric score
    public FinalExam(int questions, int missed) {
        numQuestions = questions;
        numMissed = missed;

        pointsEach = 100.0 / numQuestions;
        double numericScore = 100.0 - (missed * pointsEach);

        setScore(numericScore);
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
