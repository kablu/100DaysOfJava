/**
 * Animal is the Super class of Mammal,Parrot and Dove classes
 */
class Animal
{

}

/**
 * Mammal is the subclass of Animal class.
 */
class Mammal extends Animal
{

}

/**
 * Dog is the subclass of both Mammal and Animal classes.
 */
class Dog extends Mammal
{

}

/**
 * Elephant is the subclass of both Mammal and Animal classes.
 */
class Elephant extends Mammal
{

}

/**
 * Tiger is the subclass of both Mammal and Animal classes.
 */
class Tiger extends Mammal
{

}

/**
 * Parrot is the subclass of Animal classes.
 */
class Parrot extends Animal
{

}

/**
 * Dove is the subclass of Animal classes.
 */
class Dove extends Animal
{

}

public class AnimalDemo
{
	public static void main(String args[])
	{

		Mammal mammal = new Mammal();
		Dog dog = new Dog();
		Elephant elephant = new Elephant();
		Tiger tiger = new Tiger();

		System.out.print("Mammal IS-A Animal : ");
		System.out.println(mammal instanceof Animal);
		System.out.println();

		System.out.print("Dog IS-A Mammal : ");
		System.out.println(dog instanceof Mammal);
		System.out.print("Dog IS-A Animal : ");
		System.out.println(dog instanceof Animal);
		System.out.println();

		System.out.print("Elephant IS-A Mammal : ");
		System.out.println(elephant instanceof Mammal);
		System.out.print("Elephant IS-A Animal : ");
		System.out.println(elephant instanceof Animal);
		System.out.println();

		System.out.print("Tiger IS-A Mammal : ");
		System.out.println(tiger instanceof Mammal);
		System.out.print("Tiger IS-A Animal : ");
		System.out.println(tiger instanceof Animal);
		System.out.println();

		Parrot parrot = new Parrot();
		Dove dove = new Dove();

		System.out.print("Parrot IS-A Animal : ");
		System.out.println(parrot instanceof Animal);
		System.out.println();

		System.out.print("Dove IS-A Animal : ");
		System.out.println(dove instanceof Animal);

	}
}