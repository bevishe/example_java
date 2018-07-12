package com.ldu.bevishe.day14.bean;

public class Worker implements Comparable<Worker>{
    private String name;
    private int years;

    public Worker() {
    }

    public Worker(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;

        Worker worker = (Worker) o;

        if (years != worker.years) return false;
        return name != null ? name.equals(worker.name) : worker.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + years;
        return result;
    }



    @Override
    public int compareTo(Worker o) {
        int num = years - o.years;
        return num == 0 ? name.compareTo(o.name) : num;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}
