package ar.edu.utn.frba.cursoLink.TPIntegradorLink;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.stereotype.Component;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios.Usuario;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.app.RepoItem;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.app.RepoProducto;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.app.RepoUsuario;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Item;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Producto;

@Component
public class InitData implements CommandLineRunner {
	
	@Autowired
	RepositoryRestConfiguration config;
	
	@Autowired
	RepoProducto repoProducto;
	
	@Autowired
	RepoUsuario repoUsuario;
	
	@Autowired
	RepoItem repoItem;

	@Override
	public void run(String... args) throws Exception {
		config.exposeIdsFor(Producto.class);
		if(repoProducto.count() == 0) {
			
			Producto producto1 = new Producto("Motorola G51",50000.0,"128 GB , 4GB RAM , 3 camaras","https://olmoshogar.com.ar/wp-content/uploads/2022/05/CELU-MOTO-G51-DORADO.jpg",10);
			Producto producto2= new Producto("Notebook HP Pavilion",117000.0,"15-eh0004la plata natural 15.6, AMD Ryzen 3 4300U 8GB de RAM 256GB SSD, AMD Radeon RX Vega 5 1366x768px Windows 10 Home","https://http2.mlstatic.com/D_NQ_NP_2X_813398-MLA49715524038_042022-F.webp",30);
			Producto producto3= new Producto("Celular Samsung Galaxy A13",45000.0,"128gb + 4gb Ram Pls Lcd Negro","https://http2.mlstatic.com/D_NQ_NP_2X_917545-MLA50401654103_062022-F.webp",40);
			Producto producto4= new Producto("Samsung Galaxy S20 FE",92000.0,"128 GB cloud red 6 GB RAM","https://http2.mlstatic.com/D_NQ_NP_2X_890477-MLA44281674465_122020-F.webp",8);
			Producto producto5 = new Producto("Auriculares inear gamer inalámbricos Xiaomi Redmi AirDots 2 negro",3500.0,"La batería dura 4 h,alcance inalámbrico de 10 m","https://http2.mlstatic.com/D_NQ_NP_2X_725888-MLA44347499956_122020-F.webp",50);
			Producto producto6= new Producto("Notebook Asus ZenBook UX425EA gris 14",196000.0," Intel Core i5 1135G7 8GB de RAM 512GB SSD, Intel Iris Xe Graphics G7 80EUs 1920x1080px Windows 10 Home","https://http2.mlstatic.com/D_NQ_NP_2X_622883-MLA48011304859_102021-F.webp", 60);
			Producto producto7 = new Producto("Calefactor eléctrico Peabody PE-VC20", 13500.0,"blanco 220V","https://http2.mlstatic.com/D_NQ_NP_2X_959718-MLA31484381442_072019-F.webp",10);
			Producto producto8 = new Producto("Cafetera Nescafé",30000.0,"Moulinex Dolce Gusto Genio S automática blanca para cápsulas monodosis 230V","https://http2.mlstatic.com/D_NQ_NP_2X_668428-MLA45293283628_032021-F.webp", 100);
			Producto producto9 = new Producto("Freidora eléctrica Moulinex Easy pro" , 17800.0 , "3L acero inoxidable 220V" , "https://http2.mlstatic.com/D_NQ_NP_2X_979103-MLA42228612143_062020-F.webp", 20);
			Producto producto10 = new Producto("Caloventor eléctrico Liliana", 3500.0 , "FH400 negro 220V-240V" , "https://http2.mlstatic.com/D_NQ_NP_2X_732790-MLA31477395391_072019-F.webp",80);
			
			List<Producto> productos= List.of(producto1,producto2,producto3,producto4,producto5,producto6,producto7,producto8, producto9,producto10);    
			productos.stream().forEach(producto -> {
				repoProducto.save(producto);
			});	
			
			
			Usuario usuario1 = new Usuario("camila","12345");
			Usuario usuario2 = new Usuario("Juan" , "2468");
			
			List<Usuario> usuarios = List.of(usuario1,usuario2);
			
			usuarios.stream().forEach(usuario->{
				repoUsuario.save(usuario);
			});
			
			Item item1 = new Item(3,producto1);
		    Item item2 = new Item(2,producto3);
		    Item item3 = new Item(1,producto1);
		    Item item4 = new Item(5,producto5);
		    Item item5 = new Item(1,producto8);
		 
		    
			List<Item> items= List.of(item1,item2,item3,item4,item5);    
			items.stream().forEach(item -> {
				repoItem.save(item);
			});	
		
		
		
		}
		}

}
