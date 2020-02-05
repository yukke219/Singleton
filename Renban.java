package singleton;

class Renban {
	private static Renban ren = new Renban();
	private int num = 0;

	private Renban(){}
	public static Renban getInstance(){
		return ren;
	}

	public String getNumber(){
		//numを1つ増やして4桁の文字列に変えてreturnする処理
		num = num + 1;
		String str = String.format("%04d",num);
		return str;
	}
}