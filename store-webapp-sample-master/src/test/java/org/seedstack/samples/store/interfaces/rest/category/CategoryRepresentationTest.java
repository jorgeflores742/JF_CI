package org.seedstack.samples.store.interfaces.rest.category;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryRepresentationTest {

    CategoryRepresentation categoryRepresentation;

    @Before
    public void setUp() throws Exception {
        categoryRepresentation = new CategoryRepresentation(214214, "hola", "http://www.picture.com");
    }

    @Test
    public void getName() {
        assertEquals("hola", categoryRepresentation.getName());
    }

    @Test
    public void getUrlImg() {
        assertEquals("http://www.picture.com", categoryRepresentation.getUrlImg());
    }
}