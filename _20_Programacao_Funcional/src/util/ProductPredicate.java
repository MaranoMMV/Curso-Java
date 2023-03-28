package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		// TODO Stub de método gerado automaticamente
		return p.getPrice() >= 100.0;
	}
	
	
	
	
}
