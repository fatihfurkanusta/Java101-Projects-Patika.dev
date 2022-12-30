public class Calculation {
    Employee employee;
    Calculation(Employee employee) {
        this.employee = employee;
    }
    double tax() {
        if (this.employee.salary > 1000) {
            return (this.employee.salary * 0.03);
        }
        return 0;
    }

    int bonus() {
        if (this.employee.workHours > 40) {
            return (this.employee.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        int year = (2022 - this.employee.hireYear);
        if (year < 10) {
            return (this.employee.salary * 0.05);
        } else if (year < 20) {
            return this.employee.salary * 0.1;
        }
        return this.employee.salary*0.15;
    }
    double totalBonusTax(){
        return (this.employee.salary-tax()+bonus());
    }

    void printInfo(){
        System.out.println("**********************************************************");
        System.out.println("Çalışanın Adı : "+this.employee.name);
        System.out.println("Çalışanın Maaşı : "+this.employee.salary+" $");
        System.out.println("Çalışma Saati : "+this.employee.workHours);
        System.out.println("Başlangıç Yılı : "+this.employee.hireYear);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Tax : "+tax()+" $");
        System.out.println("Bonus : "+bonus()+" $");
        System.out.println("Maaş Artışı : "+raiseSalary()+" $");
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+totalBonusTax()+" $");
        System.out.println("Toplam Maaş : "+(totalBonusTax()+raiseSalary())+" $");
        System.out.println("-----------------------------------------------------------");

    }
}
