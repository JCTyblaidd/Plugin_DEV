package com.jct.portal.util;

public class Vec3 {
	
	public int x;
	public int y;
	public int z;
	
	public Vec3(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//Distance is from origin
	public Vec3 ray(Vec3 origin, int distance) {
		int x_d_basic = x - origin.x; //Distance between them
		int y_d_basic = y - origin.y;
		int z_d_basic = z - origin.z;
		int distance_sq = (x_d_basic ^2) + (y_d_basic ^2) + (z_d_basic ^2); //Distance linear ^2
		float diff = (float) (distance / Math.sqrt(distance_sq)); //Differential between the two squares
		x_d_basic *= diff; //Alter the differentials
		y_d_basic *= diff;
		z_d_basic *= diff;
		Vec3 toReturn = new Vec3(origin.x + x_d_basic,origin.y + y_d_basic,origin.z + z_d_basic);
		return toReturn; //Return result
	}
	
	public Vec3 diff(int xd, int yd, int zd) {
		return new Vec3(x + xd, y + yd, z + zd);
	}
	
	public Vec3 copy() {
		return new Vec3(x,y,z);
	}
	
}
