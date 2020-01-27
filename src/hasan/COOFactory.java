package hasan;

import javax.enterprise.inject.Produces;

public class COOFactory {

	@Produces
	public CountryOfOrigin getCOO() {
		return new CountryOfOrigin("Made In China");
	}
}
