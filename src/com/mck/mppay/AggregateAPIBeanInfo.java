package com.mck.mppay;



import java.beans.MethodDescriptor;
import java.beans.ParameterDescriptor;
import java.beans.SimpleBeanInfo;
import java.lang.reflect.Method;

//import teamworks.TWList;
//import teamworks.TWObject;

/**
 * @author akatre
 *
 */
public class AggregateAPIBeanInfo extends SimpleBeanInfo {

	@SuppressWarnings("rawtypes")
	private Class beanClass = AggregateAPI.class;

	@Override
	public MethodDescriptor[] getMethodDescriptors() {
		try {
			MethodDescriptor methodDescriptor1 = getMethodDescription(
					"invokeAsync",	//methodName
					new String[] { "url (String)", "httpMethod (String)", "sslAlias (String)", "requestJSON (String)", "sopDebug (boolean)" }, // parameters/arguments names
					new Class[]  { String.class, 	String.class, 			String.class, 		String.class, 			boolean.class }); // corresponding parameter types/classes
			
			MethodDescriptor methodDescriptor2 = getMethodDescription(
					"getCreditAccountInfo",	//methodName
					new String[] { "url (String)", "httpMethod (String)", "sslAlias (String)", "requestJSON (String)", "sopDebug (boolean)" }, // parameters/arguments names
					new Class[]  { String.class, 	String.class, 			String.class, 		String.class, 			boolean.class }); // corresponding parameter types/classes

			MethodDescriptor methodDescriptor3 = getMethodDescription(
					"getQuarterlyReport",	//methodName
					new String[] { "url (String)", "httpMethod (String)", "sslAlias (String)", "requestJSON (String)", "sopDebug (boolean)" }, // parameters/arguments names
					new Class[]  { String.class, 	String.class, 			String.class, 		String.class, 			boolean.class }); // corresponding parameter types/classes

			return new MethodDescriptor[] { methodDescriptor1, methodDescriptor2, methodDescriptor3 };
			
		} catch (Exception e) {
			return super.getMethodDescriptors();
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private MethodDescriptor getMethodDescription(String methodName,
			String parameters[], Class classes[]) throws NoSuchMethodException {
		MethodDescriptor methodDescriptor = null;
		Method method = beanClass.getMethod(methodName, classes);

		if (method != null) {
			ParameterDescriptor paramDescriptors[] = new ParameterDescriptor[parameters.length];
			for (int i = 0; i < parameters.length; i++) {
				ParameterDescriptor param = new ParameterDescriptor();
				param.setShortDescription(parameters[i]);
				param.setDisplayName(parameters[i]);
				paramDescriptors[i] = param;
			}
			methodDescriptor = new MethodDescriptor(method, paramDescriptors);
		}

		return methodDescriptor;
	}
}
