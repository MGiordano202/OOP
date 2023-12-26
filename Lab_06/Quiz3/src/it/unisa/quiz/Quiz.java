package it.unisa.quiz;

public class Quiz implements Measurable {

    private final double score;

    public Quiz(double score) {
        this.score = score;
    }

    public int compareTo(Measurable measurable)
    {
        return Double.compare(this.score, measurable.getMeasure());
    }

    public double getMeasure()
    {
        return score;
    }
}
