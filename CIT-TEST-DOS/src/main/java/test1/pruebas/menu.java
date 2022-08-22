package test1.pruebas;

import javax.swing.JOptionPane;


public class menu {
private int opcion;
pruebas prueba = new pruebas();
    public void mostrarMenu() {
    
    opcion  = Integer.parseInt(JOptionPane.showInputDialog(null,
            "***MENÚ PRINCIPAL***\n\n"
            + "1.Prueba responsive\n"
            + "2.Prueba de correo electrónico\n"
            + "3.Prueba de registro incompleto\n"
            + "4.Prueba de registro completo\n"
            + "5.Prueba de Verificar Registro\n"
            + "6.Prueba de ver la imagen\n"
            + "7.Prueba de registro de cotización\n"
            + "8.Prueba de redes sociales\n"
            + "9.Prueba de inicio de sesión de usuario normal\n"
            + "10.Salir\n\n"
            + "Digite su opción:"));
    switch (opcion) {
        case 1: {
            prueba.responsive();
            break;
        }
        case 2: {

            prueba.enviarEmail(); //No se recibe el correo de respuesta pero si se envía y llega al inbox del correo info@ci-technologycr.com
            break;
        }
        case 3: {

            prueba.registroIncompleto();
            break;
        }
        case 4: {

            prueba.registroCompleto();
            break;
        }
        case 5: {

            prueba.verificarRegistroUsuario();
            break;
        }
        case 6: {

            prueba.visualizarImagenes();
            break;
        }
        case 7: {

            prueba.registrarCotizacion();
            break;
        }
        case 8: {

            prueba.verificarRedSocial();
            break;
        }
        case 9: {

            prueba.inicioSesionUsuario();
            break;
        }
        
        case 10: {
            System.exit(0);
            break;
        }
        default: {
            JOptionPane.showMessageDialog(null, "Usted digitó una opción incorrecta!");
            mostrarMenu();
        }
    }
}

}
