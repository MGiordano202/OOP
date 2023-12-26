package it.unisa.school;

public class Professor extends Person {

    private String topic;
    private float wage;

    public Professor (String name, String surname, int birthYear, String topic, int wage)
    {
        super(name, surname, birthYear);
        this.topic = topic;
        this.wage = wage;
    }

    public String getTopic(String topic)
    {
        return  topic;
    }

    public void setTopic(String topic)
    {
        this.topic = topic;
    }

    public float getWage(float wage)
    {
        return wage;
    }

    public void setWage(float wage)
    {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Argomento='" + topic + '\'' +
                ", Stipendio=" + wage;
    }
}
