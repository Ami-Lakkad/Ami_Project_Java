package assignment_2;
// compute simple interest

class Lesson4{
	void simpleInterest( int p , int t ,int r){
		double si = (p * t * r)/100;
		System.out.println("simpleInterest : " + si);
	}
	
	public static void main(String[] a){
		Lesson4 lesson4 = new Lesson4();
		lesson4.simpleInterest(5,80,8);
	}
	
}
