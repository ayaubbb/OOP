package lab3.task2;

public class Whale implements Divable {
	private String name;
	
	public Whale(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(name + " swims and waving its tail.");

	}

	@Override
	public void dive(int depth) {
		// TODO Auto-generated method stub
		System.out.println(name + " dives to a depth of " + depth + " meters in search of krill");
	}

	@Override
	public void surface() {
		// TODO Auto-generated method stub
		System.out.println(name + " floats up to release a fountain of air");
	}

}
