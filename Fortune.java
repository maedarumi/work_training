package exercise;

public class Fortune {

	public static void main(String[] args) {
		String[] color = 
			{"赤","黄色","青","緑","ピンク","オレンジ","紫"};

		System.out.print("あなたの運勢は");

		try {
			for(int i = 0; i < 3; i++) {
				System.out.print(".");
				Thread.sleep(1000);
			}	
		
		double fnl = Math.random();

		if( fnl >= 0.7) {
			System.out.println("大吉！");
		}else if( fnl >= 0.4) {
			System.out.println("中吉！");
		}else if( fnl >= 0.1) {
			System.out.println("小吉！");
		}else {
			System.out.println("凶");

		}
		int fn2 =((int)(fnl * 100)) % 10;
		System.out.println("ラッキーカラーは" + color[fn2]);
	}
	catch(InterruptedException e) {
		System.out.println("割り込みが発生しました");
	}
}

}




