public class Main{
	public static void main(String[] args) {
		for (int i = 0; i < Runtime.getRuntime().availableProcessors(); i++){
			new Thread(() -> {
				foreverTest();
			}).start();
		}
	}

	public static void foreverTest(){
		System.out.println("Test running");
		while (true){
			if (isCloseEnough()){
				System.out.println("Too bad.");
				break;
			}
		}
	}

	public static boolean isCloseEnough(){
		double randomNumber = 0.7492273134307722;		
		return Math.random() == randomNumber ? true : false;
	}
}
