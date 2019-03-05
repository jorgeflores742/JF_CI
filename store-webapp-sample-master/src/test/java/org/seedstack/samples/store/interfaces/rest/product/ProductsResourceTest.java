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

    }

    @Test
    public void getProduct() {

    }

    @Test
    public void createProduct() {

    }

    @Test
    public void updateProduct() {

    }
}
