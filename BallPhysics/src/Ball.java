public class Ball {  
	
	int gravity = 1;

	int width;
	int x;
	int y;
	
	int dy = 0;
	int dx = 0;
	
	public Ball(int x, int y, int width) {
        this.width = width;
        this.x = x;
        this.y = y;
    }

	public void moveBall() {
		dy += gravity;
		y += dy;
		x += dx;
	}

}