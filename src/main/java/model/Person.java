package model;

/**
 * Created by PBanasiak on 3/18/2016.
 */
public class Person {

    private String name;
    private int id;
    private String job;

    public Person(String name,int id,String job){
        this.name=name;
        this.id=id;
        this.job=job;
    }

    public Person() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", job='" + job + '\'' +
                '}';
    }


}
