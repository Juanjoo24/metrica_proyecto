/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package registrar_entidades_y_pokemon;

import junit.framework.TestCase;

/**
 *
 * @author Kevin
 */
public class UsuarioTest extends TestCase {
    
    Usuario u1;
    Usuario u2;
    
    public UsuarioTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        u1 = new Usuario("25637", "1234", "Kevin");
        u2 = new Usuario("10175", "4321", "Ale");
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
