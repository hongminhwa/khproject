package ch09;

public class Volume extends Area {   
	///   멤버변수 
	private int height;
	public Volume() {}
		public Volume(int width, int height, int length) {
			super(width, length);
			this.height =height;
			
			
	}
		// 메소드 
		public int getVolume() {
			return getArea()*height;
		}

} 
