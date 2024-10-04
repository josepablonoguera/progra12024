package simpo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ucr
 */
public class PersonaIT {
    
    private Persona instance;

    public PersonaIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        // Inicialización de recursos compartidos si es necesario
    }
    
    @AfterAll
    public static void tearDownClass() {
        // Liberación de recursos compartidos si es necesario
    }
    
    @BeforeEach
    public void setUp() {
        // Inicializamos una nueva instancia de Persona antes de cada prueba
        instance = new Persona("123", "Pedro");
    }
    
    @AfterEach
    public void tearDown() {
        // Liberamos cualquier recurso específico de cada prueba
        instance = null;
    }

    /**
     * Test of getId method, of class Persona.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        String expectedId = "12345";
        instance.setId(expectedId);
        String result = instance.getId();
        assertEquals(expectedId, result);
    }

    /**
     * Test of setId method, of class Persona.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "67890";
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    /**
     * Test of getName method, of class Persona.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expectedName = "John Doe";
        instance.setName(expectedName);
        String result = instance.getName();
        assertEquals(expectedName, result);
    }

    /**
     * Test of setName method, of class Persona.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Jane Doe";
        instance.setName(name);
        assertEquals(name, instance.getName());
    }
}
