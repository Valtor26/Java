package Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Medicine{
    private String medicineName;
    private String batch;
    private String disease;
    private int price;

    public Medicine(String medicineName, String batch, String disease, int price){
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getMedicineName(){
        return this.medicineName;
    }

    public void setMedicineName(String medicineName){
        this.medicineName = medicineName;
    }

    public String getBatch(){
        return this.batch;
    }

    public void setBatch(String batch){
        this.batch = batch;
    }

    public String getDisease(){
        return this.disease;
    }

    public void setDisease(String disease){
        this.disease = disease;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}

public class Ipa12 {
    public static Integer[] getPriceByDisease(Medicine med[], String disease){
        ArrayList<Integer> prices = new ArrayList<>();

        for(Medicine m : med){
            if(m.getDisease().equalsIgnoreCase(disease)){
                prices.add(m.getPrice());
            }
        }

        prices.sort(Comparator.naturalOrder());

        return prices.toArray(new Integer[0]);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medicine m[] = new Medicine[4];

        for(int i=0;i<4;i++){
            String medicineName = sc.nextLine();
            String batch = sc.nextLine();
            String disease = sc.nextLine();
            int price = sc.nextInt(); sc.nextLine();

            m[i] = new Medicine(medicineName, batch, disease, price);
        }

        String searchDisease = sc.nextLine();

        Integer result[] = getPriceByDisease(m, searchDisease);

        if(result.length > 0){
            for(Integer res : result){
                System.out.println(res);
            }
        } else{
            System.out.println("No medicine for such disease");
        }
    }
}
