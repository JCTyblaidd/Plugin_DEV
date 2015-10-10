package com.jct.portal.util;

public class Vec4 { //VEC3 with min/max y
	
	
	public int x;
	public int y_min;
	public int y_max;
	public int z;
	
	public Vec4(int x, int ymax, int ymin, int z) {
		this.x = x;
		this.y_max = ymax;
		this.y_min = ymin;
		this.z = z;
	}
	
}
