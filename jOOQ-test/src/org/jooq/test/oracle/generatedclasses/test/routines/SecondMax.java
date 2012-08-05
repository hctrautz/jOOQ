/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
public class SecondMax extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> {

	private static final long serialVersionUID = -1364697873;


	/**
	 * The procedure parameter <code>TEST.SECOND_MAX.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The procedure parameter <code>TEST.SECOND_MAX.INPUT</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> INPUT = createParameter("INPUT", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public SecondMax() {
		super("SECOND_MAX", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(INPUT);
	}

	/**
	 * Set the <code>INPUT</code> parameter IN value to the routine
	 */
	public void setInput(java.lang.Number value) {
		setNumber(org.jooq.test.oracle.generatedclasses.test.routines.SecondMax.INPUT, value);
	}

	/**
	 * Set the <code>INPUT</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setInput(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(INPUT, field);
	}
}
