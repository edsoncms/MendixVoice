// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;

public final class Microflows
{
	/**
	 * Private constructor to prevent instantiation of this class. 
	 */
	private Microflows() {}

	// These are the microflows for the MyFirstModule module
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder myFirstLogicBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MyFirstModule.MyFirstLogic");
		return builder;
	}

	public static void myFirstLogic(IContext context)
	{
		myFirstLogicBuilder().execute(context);
	}
}
