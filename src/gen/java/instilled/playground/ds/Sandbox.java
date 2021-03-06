/**
 * This class is generated by jOOQ
 */
package instilled.playground.ds;


import instilled.playground.ds.tables.Author;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sandbox extends SchemaImpl {

	private static final long serialVersionUID = 882498229;

	/**
	 * The reference instance of <code>sandbox</code>
	 */
	public static final Sandbox SANDBOX = new Sandbox();

	/**
	 * No further instances allowed
	 */
	private Sandbox() {
		super("sandbox");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			Author.AUTHOR);
	}
}
