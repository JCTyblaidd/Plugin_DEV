package com.jct.hax;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Reflection YAAAAY!!
public class Reflector {

	
	@SuppressWarnings({ "unchecked", "rawtypes" })//OBJS is paramaters
	public Object invoke_method(String name,Class clazz,Object[] objs, Object object) {
		try {
			Class[] clazzes = new Class[objs.length];
			for(int v = 0; v < objs.length; v++) {
				clazzes[v] = objs[v].getClass();
			}
			Method method = clazz.getMethod(name, clazzes);
			return method.invoke(object,objs);
		} catch (Exception e) {
		}
		return null;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object invoke_static_method(String name,Class clazz,Object[] objs) {
		try {
			Class[] clazzes = new Class[objs.length];
			for(int v = 0; v < objs.length; v++) {
				clazzes[v] = objs[v].getClass();
			}
			Method method = clazz.getMethod(name, clazzes);
			return method.invoke(null,objs); //CHECK
		} catch (Exception e) {
		}
		return null;
	}
	
	@SuppressWarnings({ "rawtypes" })
	public Object readProperty(String name,Class clazz, Object object) {
		try {
			Field field = clazz.getField(name);
			return field.get(object);
		} catch (Exception e) {
		}		
		return null;
	}
	
	public void setProperty() {
		
	}
	
}
