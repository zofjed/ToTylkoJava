public class zadanie1 {
    public static void main(String[] args) {
        int wiek;
        wiek=60;
        System.out.println("Dana osoba ma " + wiek + " lat");
        if (wiek<=10){
            System.out.println("Ta osoba jest jeszcze dzieckiem");
        }
        if (wiek<=20){
            System.out.println("Ta osoba jest młoda");
        }
        if (wiek>20 && wiek<50){
            System.out.println("Ta osoba jest w średnim wieku");
        }
        if (wiek>=50){
            System.out.println("Ta osoba jest starsza");
        }
    }
}
