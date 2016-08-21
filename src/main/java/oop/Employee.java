package oop;


import java.time.LocalDate;

public abstract class Employee {

    public static final String DEFAULT_NAME = "UNKNOWN";
    private static int nextId;

    private Integer id;
    private String name;
    private LocalDate hirDate;

    public Employee() {
        this(DEFAULT_NAME);
    }

    public Employee(String name) {
        id = nextId++;
        this.name = name;
        hirDate = LocalDate.now();
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getPay();

    @Override
    public String toString() {
        return String.format("Employee{id=%d. name=%s. hireDate=%s}",
                id, name, hirDate);
    }

    public LocalDate getHirDate() {
        return hirDate;
    }

    public void setHirDate(LocalDate hirDate) {
        this.hirDate = hirDate;
    }
}
