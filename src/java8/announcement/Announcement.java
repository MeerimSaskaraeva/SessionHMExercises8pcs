package java8.announcement;

public class Announcement {
    private String name;
    private String image;
    private double price;
    private String description;

    public Announcement() {
    }

    public Announcement(String name, String image, double price, String description) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;

    }

    public static double maxPrice(double price1, double price2) {
        if (price1 < price2) {
            return price2;
        } else {
            return price1;
        }
    }
    public static void findMaxMinPrice(Announcement[] announcement){
        double max=announcement[0].getPrice();
        double min=announcement[0].getPrice();
        for (Announcement announcement1 : announcement) {
            max=Math.max(max, announcement1.getPrice());
            min=Math.min(min, announcement1.getPrice());
        }
        System.out.println("Max price: "+max);
        System.out.println("Min price: "+min);
    }
    public static void getAllPrice(Announcement[] announcement){
        for (Announcement s : announcement) {

        System.out.println(s.getPrice());}

    }
    public static void findLongName(Announcement[] announcement){
        int size=0;
        for (int i = 0; i < announcement.length; i++) {
            if (announcement[i].getName().length()>size){
                size=announcement[i].getName().length();}
        }
        for (int i = 0; i < announcement.length; i++) {
            if (size==announcement[i].getName().length()){
                System.out.println(announcement[i].getName());
                System.out.println("Size word: "+announcement[i].getName().length());
            }
        }
    }
    public static int getTotalSum(Announcement[] announcement){
        double sum=0;
        for (Announcement announcement1 : announcement) {
            sum= (sum+announcement1.getPrice());
            System.out.print(announcement1.getPrice()+" + ");
        }
        return (int) sum;
    }
    public  void qtyNomination(Announcement[] announcement){

            System.out.println("Qty nomination: "+announcement.length+" pcs");


    }

    @Override
    public String toString() {
        return "Announcement{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
