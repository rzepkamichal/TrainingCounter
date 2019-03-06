package main;

import java.util.List;

public class TrainingTest {

    private String name;
    List<SingleDayTraining> list;

    public TrainingTest(String name, List<SingleDayTraining> list){
        this.name = name;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SingleDayTraining> getList() {
        return list;
    }

    public void setList(List<SingleDayTraining> list) {
        this.list = list;
    }
}