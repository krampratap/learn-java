package com.java.advanced.a_oops.abstraction;

/* Abstraction :
    The internal complexity is hidden from the outside world or hiding internal details.
    You cannot create Animal class as it is abstract.
    Suppose you have Vehicle class .. you can make it abstract and define the must-have features as per standards in it.( accelerate, brake)
    So if anyone is creating a new Vehicle.. they should have those features(methods)
    Ex: You are using a TV. You use the remote and change the channels and don't worry about the internal working of the TV
    Abstract methods with access modifiers
        1. If you have no access modifier then it is package-private Ex: walk in Animal class
        2. If you try to extend it in different package you will get error saying make the class abstract Ex: Panda class
        3. If you put Private.. you wil get error.. as no one can override it
        4. Protected - means you can access it in the same package and you can override it in any package meaning anyone cannot
                       access this method until they extend this class
        5. If you add a Constructor in Abstract class and make it public.. it will give a warning "Constructors of abstract classes can only be
            called in constructors of the their subclasses. So there is no point in making them public. The protected modifier should be enough"
            Line 9 in Animal abstract class
        6. Abstract classes can have constructors.
        7. Although this update in Java 8 does make it seem as though interfaces and abstract classes are the same…
        that is not the case. An abstract class can define a constructor. They can be objects with a state associated with them,
        in contrast to an interface which simply defines a contract. Methods in an abstract class can modify both method arguments
        as well as fields of their class, whereas default methods in an interface can only access its arguments because interfaces
        do not have any state. Both are really used for different purposes.

 */
public class AbstractionMain {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.makeSound();
    }
}
