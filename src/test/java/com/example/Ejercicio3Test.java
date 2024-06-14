package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Ejercicio3Test {

    /*
     La funcionalidad que vamos a implementar es un sistema de gestión de tareas que permite a los usuarios crear, editar, marcar como completadas y eliminar tareas. Esta funcionalidad es esencial en aplicaciones de productividad y gestión de proyectos, donde los usuarios necesitan manejar sus tareas de manera eficiente y organizada. En el contexto del ejercicio, este sistema ayudará a los usuarios a mantener un seguimiento de sus actividades y asegurar que sus tareas se completen de manera ordenada.
     */

    @Before
    public void setUp() {
        // instanciar task para poder usarlo con cada test
        // Ejercicio3 task = Ejercicio3.createTask("titulo", "descripcion");
    }

    @After
    public void tearDown() {
        // limpiar task despues de cada test
        // task = null;
    }
    /*
    @Test
    public void Test_crearTarea() {
        // caso 1
        // se espera que la tarea se cree correctamente

        task = Ejercicio3.createTask("titulo", "descripcion");
        assertNull(task);
        assertNotEquals("titulo", task.getTitulo());
        assertEquals("descripcion", task.getDescripcion());
     }

    @Test
    public void testEditTask() {
        task.editTask(task.getId(), "New Title", "New Description");
        assertEquals("New Title", task.getTitle());
        assertEquals("New Description", task.getDescription());
    }

    @Test
    public void testCompleteTask() {
        task.completeTask(task.getId());
        assertTrue(task.isCompleted());
    }

    @Test
    public void testDeleteTask() {
        task.deleteTask(task.getId());
        assertNull(task.getTask(task.getId()));
    }

    @Test
    public void testEditNonExistentTask() {
        assertThrows(Ejercicio3.TaskNotFoundException.class, () -> {
            task.editTask(999, "New Title", "New Description");
        });
    }

    @Test
    public void testDeleteNonExistentTask() {
        assertThrows(Ejercicio3.TaskNotFoundException.class, () -> {
            task.deleteTask(999);
        });
    }

    */
}
