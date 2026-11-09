public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private float payRate;
    private int hoursWorked;
    private int overtimeHoursWorked;

    public Employee(int employeeId,
                    String name,
                    String department,
                    float payRate,
                    int hoursWorked,
                    int overtimeHoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.overtimeHoursWorked = overtimeHoursWorked;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public float getPayRate() {
        return this.payRate;
    }

    public int totalHoursWorked() {
        return this.hoursWorked;
    }

    public float getTotalPay() {
        return this.hoursWorked * this.payRate;
    }

    public int getRegularHours() {
        return this.hoursWorked;
    }

    public int getOverTimeHours() {
        return this.overtimeHoursWorked;
    }
}
