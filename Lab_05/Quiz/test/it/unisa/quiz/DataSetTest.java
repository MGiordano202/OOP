package it.unisa.quiz;

import org.junit.Assert;
import org.junit.Test;

public class DataSetTest {
    @Test
    public void testMinimum() {
        Quiz q1 = new Quiz(6.5);
        Quiz q2 = new Quiz(7);
        Quiz q3 = new Quiz(7.5);
        DataSet dataset = new DataSet();
        dataset.add(q1);
        dataset.add(q2);
        dataset.add(q3);
        Assert.assertEquals(6.5, dataset.getMinimum().getMeasure(), 0);
    }

    @Test
    public void testMaximum() {
        Quiz q1 = new Quiz(10);
        Quiz q2 = new Quiz(7);
        Quiz q3 = new Quiz( 8);
        DataSet dataSet = new DataSet();
        dataSet.add(q1);
        dataSet.add(q2);
        dataSet.add(q3);
        Assert.assertEquals(10, dataSet.getMaximum().getMeasure(), 0);


    }

    @Test
    public void testAverage() {
        Quiz q1 = new Quiz(8);
        Quiz q2 = new Quiz(7.5);
        Quiz q3 = new Quiz( 7);
        DataSet dataSet = new DataSet();
        dataSet.add(q1);
        dataSet.add(q2);
        dataSet.add(q3);
        Assert.assertEquals(7.5, dataSet.getAverage(), 0);


    }
}