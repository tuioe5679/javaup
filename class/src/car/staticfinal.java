package car;

public class staticfinal {//static final ��� 
	                      //Ŭ������ ���ԵǸ� �ʱⰪ�� ���ڵǸ� ���� �Ұ���
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static{
		EARTH_SURFACE_AREA = 4*Math.PI *EARTH_RADIUS;
	}

}
