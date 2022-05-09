package day45_Abstraction;

//extends: class tan classa one extends but interface dan interface a multiple possible
class C{

}

class A{

}

class B extends A{

}


interface Z{

}

interface X{

}

interface Y extends X, Z{ // multiple extends from interface to interface

}


//implements it can multiple implements from interface but it can not from class

class D implements X,Y,Z{

}


public class Extends_vs_Implements extends A implements X, Y, Z{


}
