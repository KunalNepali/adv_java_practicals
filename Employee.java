package interitancePack;

class Employee{
    int basesalary = 50000;
}
class Developer extends Employee{
    int bonus = 15000;
    int getSalary() {
        return basesalary + bonus;
    }
}

class MobileDeveloper extends Developer {
    int allowance = 20000;
    @Override
    public int getSalary() {
        return basesalary + bonus + allowance;
    }
}

class IOSDeveloper extends MultiLevelDeveloper {
        @Override
    public int getSalary() {
        return basesalary + bonus + allowance * 3;
}
}
publicclass MultiLevelInheritance{
     pubiic static void main(String[] args) {
        AndoridDeveloper adve = new AndoridDeveloper();
        System.out.println("Salary of Android Developer="  + adev.getSalary());
        IOSDeveloper idev = new IOSDeveloper();
        System.out.println("Salary of IOS Developer= " + idev.getSalary());
}
}