package exercise;

public class Fortune {

	public static void main(String[] args) {
		String[] color = 
			{"��","���F","��","��","�s���N","�I�����W","��"};

		System.out.print("���Ȃ��̉^����");

		try {
			for(int i = 0; i < 3; i++) {
				System.out.print(".");
				Thread.sleep(1000);
			}	
		
		double fnl = Math.random();

		if( fnl >= 0.7) {
			System.out.println("��g�I");
		}else if( fnl >= 0.4) {
			System.out.println("���g�I");
		}else if( fnl >= 0.1) {
			System.out.println("���g�I");
		}else {
			System.out.println("��");

		}
		int fn2 =((int)(fnl * 100)) % 10;
		System.out.println("���b�L�[�J���[��" + color[fn2]);
	}
	catch(InterruptedException e) {
		System.out.println("���荞�݂��������܂���");
	}
}

}




