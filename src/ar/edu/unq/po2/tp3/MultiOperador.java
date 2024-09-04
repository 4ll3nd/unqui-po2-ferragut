package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.List;

public class MultiOperador {
	private List<Integer> numbers = new ArrayList<Integer>();
	
	public List<Integer> getnumbers() {
		return numbers;
	}
	
	public void addNewNumber(int x) {
		this.getnumbers().add(x);
	} 
 /**
 * sum is a function to get the result of sum each number in the Multioperator
 * */
	public int sum() {
		//sum is a variable to return the result from functio
		int sum = 0;
		for(int number: this.getnumbers()) {
			sum = sum + number;
		}
		return sum;
	}
	/**
	 * product is a function to get the result of Multiplication each number in the multioperator
	 * */
	public int product() {
		//prod is a variable to return the result from function 
		int prod = 1;
		for(int number: this.getnumbers()) {
			prod = prod * number;
		}
		return prod;
	}
	/**
	 * substraction is a function to get the result of substract each number in the multioperator 
	 * */
	public int substraction() {
		//sub is a variable to return the result from function
		int sub = 0;
		for(int number: this.getnumbers()) {
			sub = sub - number;
		}
		return sub;
	}
	
}
