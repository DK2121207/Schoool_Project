public class Main {
    public static void main(String[] args) {
        Person Person_Num_1 = new Person("Malik", 16, 61);
        Person Person_Num_2 = new Person("Nadia", 16);

        System.out.printf("Nama saya %s saya berusia %d tahun berat badan saya %d\n", Person_Num_1.nameGetter(), Person_Num_1.ageGetter(), Person_Num_1.weigthGetter());
        System.out.printf("Nama saya %s saya berusia %d tahun berat badan? rahasia\n", Person_Num_2.nameGetter(), Person_Num_2.ageGetter());

        
    }
}