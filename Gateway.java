package protoss;

public class Gateway {
	//책임(질럿생성, 드라군 생성) 상태X 형태만
	public Zealot MakeZealot(){
		Zealot ze = new Zealot();
		return new Zealot();
	}
	
	public Dragoon MakeDragoon(){
		return new Dragoon();
	}
	
	public static void main(String[] args) {
		
	}
}
