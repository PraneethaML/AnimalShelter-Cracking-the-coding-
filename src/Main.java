
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalQueue aq= new AnimalQueue();
		System.out.println(aq.dogs.toString());
		System.out.println(aq.cats.toString());
		
		aq.enqueue(new Dog("tom"));
		aq.enqueue(new Dog("pluto"));
		aq.enqueue(new Dog("dildo"));
		aq.enqueue(new Dog("puppy"));
		aq.enqueue(new Dog("snuffy"));
		aq.enqueue(new Dog("bittu"));
		aq.enqueue(new Cat("lilly"));
		aq.enqueue(new Cat("pussy"));
		aq.enqueue(new Cat("lilly"));
		aq.enqueue(new Cat("tiiggy"));
		aq.enqueue(new Cat("bella"));
		System.out.println(aq.dogs.toString());
		System.out.println(aq.cats.toString());
		
		System.out.println(aq.dequeueAny());
		System.out.println(aq.dequeueCats());
		System.out.println(aq.dequeueDogs());
		System.out.println(aq.dequeueCats());
		System.out.println(aq.dequeueAny());
		System.out.println(aq.cats.toString());
		System.out.println(aq.dogs.toString());

	}

}
