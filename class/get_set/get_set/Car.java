package get_set;

public class Car {
	private int speed;
	private boolean stop;

	public int getspeed() {
		return speed;
	}

	public void setspeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}
