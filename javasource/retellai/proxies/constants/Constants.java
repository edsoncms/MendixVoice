// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package retellai.proxies.constants;

import com.mendix.core.Core;

public final class Constants
{
	/**
	 * Private constructor to prevent instantiation of this class. 
	 */
	private Constants() {}

	// These are the constants for the RetellAi module

	public static java.lang.String getRetell_Agent_ID_ENG()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("RetellAi.Retell_Agent_ID_ENG");
	}

	public static java.lang.String getRetell_Agent_ID_POR()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("RetellAi.Retell_Agent_ID_POR");
	}

	public static java.lang.String getRetell_API_Key()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("RetellAi.Retell_API_Key");
	}
}