package org.seedstack.samples.store.interfaces.rest.product;

import org.junit.Before;
import org.junit.Test;
import org.seedstack.samples.store.interfaces.rest.Paging;

import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class ProductsResourceTest {

    ProductsResource p;
    ProductRepresentation prod = new ProductRepresentation();

    Paging pag = new Paging();

    @Before
    public void setUp() throws Exception {
        p = new ProductsResource();
    }

    @Test
    public void listProducts() {
        assertNotEquals(null, p.listProducts("hola", pag));
    }

    @Test
    public void getProduct() {
        assertNotEquals(null, p.getProduct(1));
    }

    @Test
    public void createProduct() throws URISyntaxException {
        assertNotEquals(null, p.createProduct(prod));
    }

    @Test
    public void updateProduct() {
        assertNotEquals(null, p.updateProduct(prod, 1));
    }
}
