package it.unisa.medicaltests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

public class MedicalTestList {

    private final List<MedicalTest> medicalTestList;

    public MedicalTestList() {
        this.medicalTestList = new ArrayList<>();
    }

    public void addMedicalTest(MedicalTest mt) {
        this.medicalTestList.add(mt);
    }

    public List<MedicalTest> getMedicalTestByDate(GregorianCalendar date) {
        List<MedicalTest> resultList = new ArrayList<>();

        for(MedicalTest mt : this.medicalTestList)
        {
            if(mt.getDate() != null && mt.getDate().equals(date))
            {
                resultList.add(mt);
            }
        }
        return resultList;
    }

    public List<MedicalTest> getMedicalTestByDoctor(String doctorName) {
        List<MedicalTest> resultList = new ArrayList<>();

        for(MedicalTest mt : this.medicalTestList)
        {
            if(mt.getDoctorName() != null && mt.getDoctorName().equals(doctorName))
            {
                resultList.add(mt);
            }
        }
        return resultList;
    }

    public double getAverageCost() {
        double averageCost = 0;

        for(MedicalTest mt : this.medicalTestList)
        {
            averageCost += mt.getCost();
        }
        averageCost = averageCost / medicalTestList.size();

        return Math.round(averageCost * 100.0) / 100.0;
    }

    public List<MedicalTest> getMedicalTestList() {
        return medicalTestList;
    }
}
