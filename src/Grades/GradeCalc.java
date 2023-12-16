package Grades;

public class GradeCalc
{
    private int pointGrade;
    private String letterGrade;
    private int taskPoints;
    private int quizPoints;
    private int interviewPoints;
    private int lecturePoints;

    public GradeCalc(int tP, int qP, int iP, int lP)
    {
        this.taskPoints = tP;
        this.quizPoints = qP;
        this.interviewPoints = iP;
        this.lecturePoints = lP;
    }

    public void calcPointGrade()
    {
        this.pointGrade = this.taskPoints + this.quizPoints + this.interviewPoints + this.lecturePoints;
    }

    public void convertLetterGrade()
    {
        if (this.pointGrade >= 30 && this.pointGrade<= 34)
        {
            this.letterGrade = "A";
        }
        else if(this.pointGrade >= 26 && this.pointGrade <= 29)
        {
            this.letterGrade = "A-";
        }
        else if(this.pointGrade >= 22 && this.pointGrade <= 25)
        {
            this.letterGrade = "B+";
        }
        else if(this.pointGrade >= 18 && this.pointGrade <= 21)
        {
            this.letterGrade = "B";
        }
        else if(this.pointGrade >= 14 && this.pointGrade <= 17)
        {
            this.letterGrade = "B-";
        }
        else if(this.pointGrade >= 10 && this.pointGrade <= 13)
        {
            this.letterGrade = "C+";
        }
        else if(this.pointGrade >= 7 && this.pointGrade <= 9)
        {
            this.letterGrade = "C";
        }
        else if(this.pointGrade >= 4 && this.pointGrade <= 6)
        {
            this.letterGrade = "C-";
        }
        else if(this.pointGrade >= 0 && this.pointGrade <= 3)
        {
            this.letterGrade = "F";
        }
        else
        {
            this.letterGrade = "Invalid Input";
        }


    }

    //bleh im bored stopping here, maybe next time try a more advanced project.
    //This one is pretty boring doesn't require any datastructures or thinking.
    public void setTaskPoints(int TP)
    {
        if(TP >= 0 && TP <= 16)
        {
            this.taskPoints = TP;
        }
        this.taskPoints = -100;
    }


    public String getLetterGrade()
    {
        return this.letterGrade;
    }

    public int getPointGrade()
    {
        return this.pointGrade;
    }




}
