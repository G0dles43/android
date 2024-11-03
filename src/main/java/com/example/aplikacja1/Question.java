package com.example.aplikacja1;

public class Question {
    private int questionId;
    private boolean trueAnswer;

    public Question(int questionId, boolean trueAnswer){
        this.questionId=questionId;
        this.trueAnswer=trueAnswer;
    }

    public boolean isTrueAnswer()
    {
        return trueAnswer;
    }

    public int getQuestionId(){
        return questionId;
    }

}
