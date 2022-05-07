package day44_Abstraction.animalTask;

public interface Playable { //class olmadigi icin super class denmez super type Playable denir

    boolean isFriendly = true; // static & final by default
    // static variable a verilebilecek tek keyword oldugu icin yazmaya gerek yok. gri yaziliyor
    // static variable oldugunun proofu reassign yapilabilir ama final yapilamaz.
    // variable create ederken daime assign i orda yapmaliyiz.
    // cunku class olmadigi icin static block olusturulamiyor ve static blockda assign edemeyiz

    /* proof this variable is static. // static variable sadece static method da call edilebilir.

    public static void method1(){ // static method is available only for static members
        System.out.println(isFriendly);
    }
    */

 //   public abstract void play(); // bu abstract method ama public ve abstract gri renkte.
                                    // bu demek ki bunlari yazmak gerekli degil.
    // public zaten verilebilecek tek access modifier interface de.
    // java 8 den once interface de sadece abstract method olurdu bu yuzden abstract yazmaya gerek yok.
    // sonra default ve static method dahil edildi.
    void play(); // abstract by default -> abstract keyword given by default


}