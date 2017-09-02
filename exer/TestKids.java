package exer;

public class TestKids {
    public static void main(String[] args) {
        Kids someKid=new Kids();

        someKid.setSalary(0);
        someKid.setYearsOld(13);
        someKid.setSex(1);

        someKid.employees();
        someKid.manOrWoman();
        someKid.printAge();

    }
}
