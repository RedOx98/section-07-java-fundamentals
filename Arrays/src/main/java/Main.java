public class Main {


    public static void main(String[] args) {
        String[] names = {"olaide","Hammed","Ridwan","Abolore","Ayinde"};
//        names = new String[10];

//        names[0]= "Olaide";
//        names[0]= "Hammed";
//        names[0]= "Ridwan";

        int i;
        for(i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (String name: names
             ) {
            System.out.println(name);
        }
    }
}
