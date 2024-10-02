package assignment6;

abstract class Animal {

	public abstract void sound();

	public abstract void move();
}

class Dog extends Animal {

	public void sound() {
		System.out.println("Dog: Woof Woof!");
	}

	public void move() {
		System.out.println("Dog is running!");
	}
}

class Cat extends Animal {

	public void sound() {
		System.out.println("Cat: Meow!");
	}

	public void move() {
		System.out.println("Cat is sneaking!");
	}
}

class Bird extends Animal {

	public void sound() {
		System.out.println("Bird: Tweet!");
	}

	public void move() {
		System.out.println("Bird is flying!");
	}

	
}
