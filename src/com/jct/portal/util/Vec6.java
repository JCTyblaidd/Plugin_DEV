package com.jct.portal.util;

public class Vec6 {
	
	
	public Vec3 vec1;
	public Vec3 vec2;
	
	public Vec6(Vec3 v1, Vec3 v2) {
		vec1 = v1;
		vec2 = v2;
	}
	
	public Vec6(int x1, int y1, int z1, int x2, int y2, int z2) {
		this(new Vec3(x1,y1,z1),new Vec3(x2,y2,z2));
	}
}
