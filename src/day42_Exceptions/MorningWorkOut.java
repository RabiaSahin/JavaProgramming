package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("------------Push up started----------");

        // Thread.sleep() methodu her kullanmada try&catch yazmak gerektigi icin kendimiz
        // sleep() custom method crate ettik. second ile
     /*   for (int i = 0; i < 30; i++) {

            System.out.print("\rPush up " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }*/

        for (int i = 1; i <= 30 ; i++) {

            System.out.print("\rPush up "+i); // ayni satirda sadece sayilar degisitir. timer line
        //  System.out.println("Push up " +i); // satirlar alta alta sira ile yaziyor

            sleep(1.5);

        }

        System.out.println("\n------------Push ups completed----------");
        // son sayinin yazilmasindan sonra ln olmadigi icin bu satir hemen yanina yaziyordu. o yuzden \n ekledik

        System.out.println("------------Pull up started----------");

        for (int i = 1; i <= 20 ; i++) {

            System.out.print("\rPull up "+i);
            sleep(2.5);
        }

        System.out.println("\n------------Pull ups completed----------");


    }

    //                      2.5
    public static void sleep(double seconds)  { // exception olmasin diye custom method olusturduk
                                                // bu methodu kullandik yukardaki kodlarda

        try {
            Thread.sleep( (long) (seconds * 1000) ); // millisecond degil second occur
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


/*
MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each
			2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */
