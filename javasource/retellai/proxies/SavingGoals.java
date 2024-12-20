// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package retellai.proxies;

public class SavingGoals implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject savingGoalsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "RetellAi.SavingGoals";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SavingGoalName("SavingGoalName"),
		SavingGoalTargetAmount("SavingGoalTargetAmount"),
		SavingGoalCurrentAmount("SavingGoalCurrentAmount");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public SavingGoals(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected SavingGoals(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject savingGoalsMendixObject)
	{
		if (savingGoalsMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, savingGoalsMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.savingGoalsMendixObject = savingGoalsMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static retellai.proxies.SavingGoals initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new retellai.proxies.SavingGoals(context, mendixObject);
	}

	public static retellai.proxies.SavingGoals load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return retellai.proxies.SavingGoals.initialize(context, mendixObject);
	}

	/**
	 * @return value of SavingGoalName
	 */
	public final java.lang.String getSavingGoalName()
	{
		return getSavingGoalName(getContext());
	}

	/**
	 * @param context
	 * @return value of SavingGoalName
	 */
	public final java.lang.String getSavingGoalName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SavingGoalName.toString());
	}

	/**
	 * Set value of SavingGoalName
	 * @param savinggoalname
	 */
	public final void setSavingGoalName(java.lang.String savinggoalname)
	{
		setSavingGoalName(getContext(), savinggoalname);
	}

	/**
	 * Set value of SavingGoalName
	 * @param context
	 * @param savinggoalname
	 */
	public final void setSavingGoalName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String savinggoalname)
	{
		getMendixObject().setValue(context, MemberNames.SavingGoalName.toString(), savinggoalname);
	}

	/**
	 * @return value of SavingGoalTargetAmount
	 */
	public final java.math.BigDecimal getSavingGoalTargetAmount()
	{
		return getSavingGoalTargetAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of SavingGoalTargetAmount
	 */
	public final java.math.BigDecimal getSavingGoalTargetAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.SavingGoalTargetAmount.toString());
	}

	/**
	 * Set value of SavingGoalTargetAmount
	 * @param savinggoaltargetamount
	 */
	public final void setSavingGoalTargetAmount(java.math.BigDecimal savinggoaltargetamount)
	{
		setSavingGoalTargetAmount(getContext(), savinggoaltargetamount);
	}

	/**
	 * Set value of SavingGoalTargetAmount
	 * @param context
	 * @param savinggoaltargetamount
	 */
	public final void setSavingGoalTargetAmount(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal savinggoaltargetamount)
	{
		getMendixObject().setValue(context, MemberNames.SavingGoalTargetAmount.toString(), savinggoaltargetamount);
	}

	/**
	 * @return value of SavingGoalCurrentAmount
	 */
	public final java.math.BigDecimal getSavingGoalCurrentAmount()
	{
		return getSavingGoalCurrentAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of SavingGoalCurrentAmount
	 */
	public final java.math.BigDecimal getSavingGoalCurrentAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.SavingGoalCurrentAmount.toString());
	}

	/**
	 * Set value of SavingGoalCurrentAmount
	 * @param savinggoalcurrentamount
	 */
	public final void setSavingGoalCurrentAmount(java.math.BigDecimal savinggoalcurrentamount)
	{
		setSavingGoalCurrentAmount(getContext(), savinggoalcurrentamount);
	}

	/**
	 * Set value of SavingGoalCurrentAmount
	 * @param context
	 * @param savinggoalcurrentamount
	 */
	public final void setSavingGoalCurrentAmount(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal savinggoalcurrentamount)
	{
		getMendixObject().setValue(context, MemberNames.SavingGoalCurrentAmount.toString(), savinggoalcurrentamount);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return savingGoalsMendixObject;
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final retellai.proxies.SavingGoals that = (retellai.proxies.SavingGoals) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
