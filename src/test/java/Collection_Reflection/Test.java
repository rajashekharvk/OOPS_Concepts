package Collection_Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import Collection_Reflection.ArraList.Reflections;

public class Test {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String Operations="add";
		int x=100;
		int y=20;

		Reflections rf=new Reflections();
		
		Method m=rf.getClass().getMethod(Operations,int.class,int.class);
		m.invoke(rf,x,y);
		
		
	}

}
