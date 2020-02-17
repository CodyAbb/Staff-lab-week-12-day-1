package Staff;

public abstract class Employee {
    private String name;
    private String nINumber;
    private int salary;

    public Employee(String name, String nINumber, int salary ){
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("")){
            this.name = name;
        }
    }

    public String getnINumber() {
        return nINumber;
    }

    public int getSalary() {
        return salary;
    }

    public int raiseSalary(double amount){
        if (amount > 0){
            return this.salary += amount;
        } else {
            return this.salary;
        }


    }

    public int payBonus(){
        return this.salary *= 0.01;
    }
}
