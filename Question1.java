public class Question1 {
	public static void calculateRectBottomLeftAndTopRight(Point[] points) {
		int minX=0,minY=0,maxX=0,maxY=0;
		
		for(int i=0; i<points.length;i++){
			Point point = points[i];
			if(point.x <minX){
				minX = point.x;
			}
			if(point.x >maxX){
				maxX = point.x;
			}
			if(point.y <minY){
				minY = point.y;
			}
			if(point.y >maxY){
				maxY = point.y;
			}
			
		}
		System.out.println("Bottom-left: (" +minX +", "+ minY +")");
		System.out.println("Top-Right: (" +maxX +", "+ maxY +")");

	}

	public static void main(String[] args) {
		Point[] points = {new Point(-1,0),new Point(2,2),new Point(1,3)};
		calculateRectBottomLeftAndTopRight(points);
	}
	static class Point {
		int x, y;
		public Point(int x,int y){
			this.x = x;
			this.y = y;
		}
	}

}
