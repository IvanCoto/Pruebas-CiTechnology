package test1.pruebas;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class pruebas {
    static WebDriver driver;
    
    public void responsive(){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        System.out.println("Test iniciado");
        driver = new ChromeDriver();
     
        //Abre pantalla de inicio en tamaño responsive
        driver.get("https://www.ci-technologycr.com/View/inicio.php");
        
    }
    
    public void enviarEmail(){
        
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        System.out.println("Test iniciado");
        driver = new ChromeDriver();
        
        //Maximiza la pantalla
        
        driver.manage().window().maximize();
        
        
        //Abre el formulario de contacto
        driver.get("https://www.ci-technologycr.com/View/contacto.php");
        
        driver.findElement(By.name("nombre")).sendKeys("Ivan");
        driver.findElement(By.name("email")).sendKeys("ivancototkd@gmail.com");
        driver.findElement(By.name("subject")).sendKeys("Mensaje de prueba desde selenium");
        driver.findElement(By.name("mensaje")).sendKeys("Mensaje de prueba desde selenium en el cuerpo");
        driver.findElement(By.xpath("//button[@type='submit' and @id='sendMessageButton']")).click();
        
    }
    
    public void registroIncompleto(){ //Falta el número de teléfono
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        System.out.println("Test iniciado");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ci-technologycr.com/View/InicioSesion.php");
        driver.findElement(By.xpath("/html/body/div[1]/div/label[2]")).click();
        
        driver.findElement(By.name("txtNombre")).sendKeys("User Prueba Uno");
        driver.findElement(By.name("txtUsuario")).sendKeys("User Prueba Uno");
        driver.findElement(By.name("txtEmail")).sendKeys("userprueba1@gmail.com");
        driver.findElement(By.name("txtPassword")).sendKeys("123");
        driver.findElement(By.name("txtConPass")).sendKeys("123");
        driver.findElement(By.xpath("//input[@type='submit' and @value='Registrarse']")).click();
        
    }
    
    public void registroCompleto(){ //Falta el número de teléfono
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        System.out.println("Test iniciado");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ci-technologycr.com/View/InicioSesion.php");
        driver.findElement(By.xpath("/html/body/div[1]/div/label[2]")).click();
        
        driver.findElement(By.name("txtNombre")).sendKeys("User Prueba dos");
        driver.findElement(By.name("txtUsuario")).sendKeys("User Prueba dos");
        driver.findElement(By.name("txtEmail")).sendKeys("userprueba2@gmail.com");
        driver.findElement(By.name("txtNumTelefono")).sendKeys("88888888");
        driver.findElement(By.name("txtPassword")).sendKeys("123");
        driver.findElement(By.name("txtConPass")).sendKeys("123");
        driver.findElement(By.xpath("//input[@type='submit' and @value='Registrarse']")).click();    
        
        
    }
    
    public void verificarRegistroUsuario(){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        System.out.println("Test iniciado");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ci-technologycr.com/View/InicioSesion.php");
        
        driver.findElement(By.name("txtEmailUsuario")).sendKeys("userprueba1@gmail.com");
        driver.findElement(By.name("txtContraseñaUsuario")).sendKeys("123");
        driver.findElement(By.xpath("//input[@type='submit' and @name='btnIniciarSesion']")).click();
        
        driver.get("https://www.ci-technologycr.com/View/Admin/ListadoUsuarios.php");
        
    }
    
    public void visualizarImagenes(){
        
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        System.out.println("Test iniciado");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ci-technologycr.com/View/galeria.php");
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[3]/div/a/img")).click();
        
    }
    
    public void verificarComentario(){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        System.out.println("Test iniciado");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ci-technologycr.com/View/InicioSesion.php");
        
        driver.findElement(By.name("txtEmailUsuario")).sendKeys("userprueba1@gmail.com");
        driver.findElement(By.name("txtContraseñaUsuario")).sendKeys("123");
        driver.findElement(By.xpath("//input[@type='submit' and @name='btnIniciarSesion']")).click();
        
        driver.get("https://www.ci-technologycr.com/View/Admin/Comentarios.php");
        
    }
    
    public void registrarComentario(){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        
        System.out.println("Test iniciado");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ci-technologycr.com/View/comentarios.php");
        
        js.executeScript("scroll(0, 950);");

        
        driver.findElement(By.name("txtNombre")).sendKeys("Comentario de prueba 1");
        driver.findElement(By.name("txtEmail")).sendKeys("userprueba2@gmail.com");
        driver.findElement(By.name("txtComentario")).sendKeys("comentario de prueba");
        driver.findElement(By.xpath("//input[@type='submit' and @value='Publicar']")).click();
        
        
        
    }
    
    public void verificarRedSocial(){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        
        System.out.println("Test iniciado");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ci-technologycr.com/View/contacto.php");
        
        driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/a[2]")).click();
        
        
    }
    
    public void registrarCotizacion(){
        
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        System.out.println("Test iniciado");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ci-technologycr.com/View/Cotizar.php");
        driver.findElement(By.name("txtnombre")).sendKeys("Usuario de prueba");
        driver.findElement(By.name("txtEmail")).sendKeys("userprueba2@gmail.com");
        driver.findElement(By.name("txtNumeroTel")).sendKeys("88888888");
        driver.findElement(By.name("txtNomEmpresa")).sendKeys("Empresa de prueba");
        driver.findElement(By.name("txtTipoEmpresa")).sendKeys("Tipo de prueba");
        driver.findElement(By.name("txtFacebook")).sendKeys("prueba de facebook");
        driver.findElement(By.name("txtFacebook")).sendKeys("prueba de facebook");
        driver.findElement(By.name("txtInstagram")).sendKeys("prueba de instagram");
        driver.findElement(By.name("txtComentario")).sendKeys("Mensaje de prueba");
        driver.findElement(By.xpath("//input[@type='submit' and @name='btnCotizacion']")).click();
        
    }
    
    public void inicioSesionUsuario(){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        System.out.println("Test iniciado");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ci-technologycr.com/View/InicioSesion.php");
        driver.findElement(By.name("txtEmailUsuario")).sendKeys("msroucks@gmail.com");
        driver.findElement(By.name("txtContraseñaUsuario")).sendKeys("123");
        driver.findElement(By.xpath("//input[@type='submit' and @name='btnIniciarSesion']")).click();
        driver.get("https://www.ci-technologycr.com/View/Admin/Dashboard.php");
    }
}

