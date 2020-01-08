
public class FabricaPersonaje {

	//El patron fabrica busca centralizar la creacion (new) de los objetos de un mismo tipo en una sola clase
	//De tal manera que sea esta la que tenga todas las dependencias fuertes con las otras clases
	

		public static Personaje crear(String clase) {
			Personaje personaje = null;
			switch (clase) {
			case "guerrero":
				personaje = new Guerrero();
				break;
			case "mago":
				personaje = new Mago();
				break;
			case "enano":
				personaje = new Enano();
				break;
			
			default:
				break;
			}
			
			return personaje;
		}

}
