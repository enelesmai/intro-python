import javax.swing.JOptionPane;

public class MenuBar {
	
	public static void main (String args[])
	{
		String menuGeneral = "1.Comida.\n2.Bebidas.\n3.Snacks.";
		String subMenuComidas = "1.Milanesa de res.\n2.Carne asada.\n3.Chile pasilla.\n4.Flautas de pollo.";
		String subMenuBebidas = "1.Agua Fresca.\n2.Naranjada.\n3.Refresco.\n4.Cerveza.";
		String subMenuSnacks = "1.Papas fritas.\n2.Cacahuates.\n3.Pastel.\n4.Chicharrones.";
		
		int precioComida1 = 60;
		int precioBebida1 = 15;
		int precioSnack1 = 10;
		int precioComida2 = 65;
		int precioBebida2 = 25;
		int precioSnack2 = 10;
		int precioComida3 = 50;
		int precioBebida3 = 30;
		int precioSnack3 = 30;
		int precioComida4 = 55;
		int precioBebida4 = 35;
		int precioSnack4 = 20;
		
		String EMPTY_STRING = "";
		String oMenu = EMPTY_STRING;
		String oSeleccion = EMPTY_STRING;
		String cantidad = EMPTY_STRING;
		String nombre = EMPTY_STRING;
				
		int numeroMenu = 0;
		int numeroSubMenu = 0;
		int numeroCantidad = 0;
		int totalPagar = 0;
		
		boolean oValid=false;
		
		oValid=false;
		while (oValid==false)
		{
			
			oMenu=JOptionPane.showInputDialog("Seleccione una opción del Menú:\n" + menuGeneral);

			oValid=true;
			try{

				numeroMenu=Integer.parseInt(oMenu);
				if(numeroMenu <= 0 || numeroMenu >= 4 )
				{
					throw new Exception();
				}

			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(null, "\n\nIngrese una opción válida" , "Error", JOptionPane.ERROR_MESSAGE);
				oValid=false;
			}

		}
		
		oValid=true;

		//Mostrar submenú de acuerdo a la opción seleccionada
		switch(numeroMenu){
			case 1:
				oSeleccion=JOptionPane.showInputDialog("Seleccione una opción del Sub Menú de Comidas:\n" + subMenuComidas);
				
				try{

					numeroSubMenu = Integer.parseInt(oSeleccion);
					
					if(numeroSubMenu <= 0 || numeroSubMenu >= 5 )
					{
						throw new Exception();
					}
					else
					{
						try {
							cantidad = JOptionPane.showInputDialog("Ingrese la cantidad:\n");
						} catch(Exception e) {
							JOptionPane.showMessageDialog(null, "\n\nDebe ingresar un valor numéricos" , "Error", JOptionPane.ERROR_MESSAGE);
							oValid=false;
						}

						numeroCantidad = Integer.parseInt(cantidad);
						nombre = JOptionPane.showInputDialog("Nombre del usuario:\n");
						
						switch(numeroSubMenu){
							case 1:
								totalPagar = precioComida1 * numeroCantidad;
							case 2:
								totalPagar = precioComida2 * numeroCantidad;
							case 3:
								totalPagar = precioComida3 * numeroCantidad;
							case 4:
								totalPagar = precioComida4 * numeroCantidad;
							default: //nothing to do
						}

						JOptionPane.showMessageDialog(null,"Gracias " + nombre + " por su compra, el total a pagar es de: " +  totalPagar, "Mensaje de Resultado", JOptionPane.PLAIN_MESSAGE);
						
					}

				}
				catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, "\n\nIngrese una opción válida" , "Error", JOptionPane.ERROR_MESSAGE);
					oValid=false;
				}

			case 2:
				oSeleccion=JOptionPane.showInputDialog("Seleccione una opción del Sub Menú de Bebidas:\n" + subMenuBebidas);
					
				try{

					numeroSubMenu = Integer.parseInt(oSeleccion);
					
					if(numeroSubMenu <= 0 || numeroSubMenu >= 5 )
					{
						throw new Exception();
					}
					else
					{
						try {
							cantidad = JOptionPane.showInputDialog("Ingrese la cantidad:\n");
						} catch(Exception e) {
							JOptionPane.showMessageDialog(null, "\n\nDebe ingresar un valor numéricos" , "Error", JOptionPane.ERROR_MESSAGE);
							oValid=false;
						}

						numeroCantidad = Integer.parseInt(cantidad);
						nombre = JOptionPane.showInputDialog("Nombre del usuario:\n");
						
						switch(numeroSubMenu){
							case 1:
								totalPagar = precioBebida1 * numeroCantidad;
							case 2:
								totalPagar = precioBebida2 * numeroCantidad;
							case 3:
								totalPagar = precioBebida3 * numeroCantidad;
							case 4:
								totalPagar = precioBebida4 * numeroCantidad;
							default: //nothing to do
						}

						JOptionPane.showMessageDialog(null,"Gracias " + nombre + " por su compra, el total a pagar es de: " +  totalPagar, "Mensaje de Resultado", JOptionPane.PLAIN_MESSAGE);
						
					}

				}
				catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, "\n\nIngrese una opción válida" , "Error", JOptionPane.ERROR_MESSAGE);
					oValid=false;
				}

			case 3:
				oSeleccion=JOptionPane.showInputDialog("Seleccione una opción del Sub Menú de Comidas:\n" + subMenuSnacks);
						
				try{

					numeroSubMenu = Integer.parseInt(oSeleccion);
					
					if(numeroSubMenu <= 0 || numeroSubMenu >= 5 )
					{
						throw new Exception();
					}
					else
					{
						try {
							cantidad = JOptionPane.showInputDialog("Ingrese la cantidad:\n");
						} catch(Exception e) {
							JOptionPane.showMessageDialog(null, "\n\nDebe ingresar un valor numéricos" , "Error", JOptionPane.ERROR_MESSAGE);
							oValid=false;
						}

						numeroCantidad = Integer.parseInt(cantidad);
						nombre = JOptionPane.showInputDialog("Nombre del usuario:\n");
						
						switch(numeroSubMenu){
							case 1:
								totalPagar = precioSnack1 * numeroCantidad;
							case 2:
								totalPagar = precioSnack2 * numeroCantidad;
							case 3:
								totalPagar = precioSnack3 * numeroCantidad;
							case 4:
								totalPagar = precioSnack4 * numeroCantidad;
							default: //nothing to do
						}

						JOptionPane.showMessageDialog(null,"Gracias " + nombre + " por su compra, el total a pagar es de: " +  totalPagar, "Mensaje de Resultado", JOptionPane.PLAIN_MESSAGE);
						
					}

				}
				catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, "\n\nIngrese una opción válida" , "Error", JOptionPane.ERROR_MESSAGE);
					oValid=false;
				}

			default: //nothing to do
		}
		
		System.exit(0); // terminar
				
	}//

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public MenuBar() {
		super();
	}

}