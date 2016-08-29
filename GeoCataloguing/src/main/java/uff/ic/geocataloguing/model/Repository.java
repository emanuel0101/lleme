/* Generated by Together */

package uff.ic.geocataloguing.model;

import java.io.IOException;

/**
 * @version 1.0
 * @since 1.0
 * @author Luiz Andr�
 * @alias Repository
 * @stereotype abstract*/
abstract public class Repository extends DescriptionSource {

	/**
	 * @directed
	 * @label organize desc using
	 * @labelDirection forward*/
	private transient RepositoryDescBuilder builder = null;

	public Repository(String url) {
		super(url);
	}

	public abstract String[] listURI() throws IOException;

	/**
	 * @return Returns the builder.
	 */
	public Builder getBuilder() {
		if (builder == null)
			builder = getFactory().createRepositoryDescBuilder();
		return builder;
	}

}