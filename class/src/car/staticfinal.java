package car;

public class staticfinal {//static final 상수 
	                      //클래스에 포함되며 초기값이 정자되면 변경 불가능
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static{
		EARTH_SURFACE_AREA = 4*Math.PI *EARTH_RADIUS;
	}

}
