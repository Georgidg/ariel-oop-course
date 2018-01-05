package composite;

public abstract class Node {
	private int weight;
	public int getWeight() { return weight; }
	
	/**
	 * @return the sum of weights of this and all descendants.
	 */
	abstract int sum();
}
