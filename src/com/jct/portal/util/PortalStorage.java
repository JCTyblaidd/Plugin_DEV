package com.jct.portal.util;


public class PortalStorage {
	
	public static void main(String[] args) {
		//TEST LAUNCH IGNORE
		System.out.println("THIS IS A TEST LAUNCH");
		PortalStorage test = new PortalStorage(new Vec3(0,0,0),new Vec3(0,10,7));
		
		Vec6 ret = test.calculate_differential(new Vec3(-5,3,3), 20);
		
		System.out.println("OUTPUT:" + ret.vec1.x + "," + ret.vec1.y + "," + ret.vec1.z + "  :  " + ret.vec2.x + "," + ret.vec2.y + "," + ret.vec2.z);
	}
	
	
	
	//X = parrallel Y = perp
	
	public Vec3 point1; //1 -> 2 //XYZ  //THE X must be the same for all of them
	public Vec3 point2; //2 -> 3 //XYZ  //different Y,Z for limit //Z MUST BE BIGGER
	
	/**
	 * 
	 * @param p1 - X must be same for both
	 * @param p2 - Z must be bigger than other
	 */
	public PortalStorage(Vec3 p1, Vec3 p2) {
		point1 = p1;
		point2 = p2;
	}
	
	
	/**		X = towards portal, Z = side-side
	 * 		Returns the block spaces to populate with preview
	 */
	public Vec6 calculate_differential(Vec3 coordinate,int use_dist) { 
		int x = Math.min(point1.x,point2.x);
		int xdiff = Math.abs(coordinate.x - x);
		boolean pos = coordinate.x > x;
		//IF not close enough - paste the area behind and do not think
		if(xdiff > 25) {
			//LAZYNESS
			if(pos) {
				return new Vec6(point1.copy(),point2.diff(-use_dist,0,0));
			}else {
				return new Vec6(point1.copy(),point2.diff(use_dist,0,0));
			}
		}else { //Then do some mathematicas
			float z_max = point2.z;
			float z_min = point1.z;
			float z_max_d = z_max - coordinate.z;
			float z_min_d = coordinate.z - z_min;
			// % x to z  * new z
			int res_z_min =(int) ((z_min_d / xdiff) * use_dist * 1.2);
			int res_z_max =(int) ((z_max_d / xdiff) * use_dist * 1.2);
			if(pos) {
				return new Vec6(point1.diff(0, 0, 0-res_z_min),point2.diff(0-use_dist,0,res_z_max));
			}else {
				return new Vec6(point1.diff(0, 0, 0-res_z_min),point2.diff(use_dist,0,res_z_min));
			}
		}
	}
	
	
}
