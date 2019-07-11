package jicheng;

public class Animal {
    int age;
	double tizhong;
	public void run(){
		System.out.println("run");
	}
	public void eat(){
		System.out.println("eat");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getTizhong() {
		return tizhong;
	}
	public void setTizhong(double tizhong) {
		this.tizhong = tizhong;
	}
	public Animal(int age, double tizhong) {
		super();
		this.age = age;
		this.tizhong = tizhong;
	}
	public Animal() {
		super();
		
	}
	public String toString() {
		return "Animal [age=" + age + ", tizhong=" + tizhong + "]";
	}
	

}
