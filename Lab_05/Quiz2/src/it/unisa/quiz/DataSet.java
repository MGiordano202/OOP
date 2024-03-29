package it.unisa.quiz;

public class DataSet {

    private double sum;
    private Quiz minimum;
    private Quiz maximum;
    private int count;

    public DataSet() {
        count = 0;
        sum = 0;
        minimum = null;
        maximum = null;
    }

    public double getAverage() {
        if (count == 0) return 0;
        else return sum / count;
    }

    public Quiz getMaximum() {
        return maximum;
    }

    public Quiz getMinimum() {
        return minimum;
    }

    public void add(Quiz x) {
        sum = sum + x.getMeasure();
        if(count == 0 || maximum.getMeasure() < x.getMeasure())
        {
            maximum = x;
        }
        if(count == 0 || minimum.getMeasure() > x.getMeasure())
        {
            minimum = x;
        }
        count++;
    }
}