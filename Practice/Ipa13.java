package Practice;

import java.util.Scanner;

class AutonomousCar{
    private int carId;
    private String brand;
    private int noOfTestsConducted;
    private int noOfTestsPassed;
    private String environment;

    public AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment){
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed  = noOfTestsPassed;
        this.environment = environment;
    }

    public int getCarId(){
        return this.carId;
    }

    public void setCarId(int carId){
        this.carId = carId;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getNoOfTestsConducted() {
        return this.noOfTestsConducted;
    }

    public void setNoOfTestsConducted(int noOfTestsConducted) {
        this.noOfTestsConducted = noOfTestsConducted;
    }

    public int getNoOfTestsPassed() {
        return this.noOfTestsPassed;
    }

    public void setNoOfTestsPassed(int noOfTestsPassed) {
        this.noOfTestsPassed = noOfTestsPassed;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}

public class Ipa13{
    public static int findTestPassedByEnv(AutonomousCar ac[], String environment){
        int sumOfTestPassed = 0;

        for(AutonomousCar a : ac){
            if(a.getEnvironment().equalsIgnoreCase(environment)){
                sumOfTestPassed += a.getNoOfTestsPassed();
            }
        }

        if(sumOfTestPassed != 0) return sumOfTestPassed;

        return 0;
    }

    public static AutonomousCar updateCarGrade(String brand, AutonomousCar ac[]){
        for(AutonomousCar a : ac){
            if(a.getBrand().equalsIgnoreCase(brand)){
                return a;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        AutonomousCar ac[] =  new AutonomousCar[4];

        for(int i=0;i<4;i++){
            int carId = sc.nextInt(); sc.nextLine();
            String brand = sc.nextLine();
            int noOfTestsConducted = sc.nextInt();sc.nextLine();
            int noOfTestsPassed = sc.nextInt(); sc.nextLine();
            String environment = sc.nextLine();

            ac[i] = new AutonomousCar(carId, brand, noOfTestsConducted, noOfTestsPassed, environment);
        }

        String searchEnvironment = sc.nextLine();
        String searchBrand = sc.nextLine();

        int ans1 = findTestPassedByEnv(ac, searchEnvironment);

        if(ans1 != 0){
            System.out.println(ans1);
        } else{
            System.out.println("There are no tests passed in this particular environment");
        }

        AutonomousCar ans2 = updateCarGrade(searchBrand, ac);

        if(ans2 != null){
            int rating = ((ans2.getNoOfTestsPassed()*100)/ans2.getNoOfTestsConducted());

            if(rating >= 80){
                System.out.println(ans2.getBrand() + "::" + "A1");
            } else{
                System.out.println(ans2.getBrand() + "::" + "B2");
            }
        } else{
            System.out.println("No Car is available with the specified brand");
        }

        sc.close();
    }
}