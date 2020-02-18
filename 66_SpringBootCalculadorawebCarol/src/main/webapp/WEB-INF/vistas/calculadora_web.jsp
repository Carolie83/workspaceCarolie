<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el numero 1: ");
		String numero1 = sc.next();
		System.out.println("introduzca el numero 2: ");
		String numero2 = sc.next();
		System.out.println("Desea sumar, restar, multiplicar o dividir");
		String opcion = sc.next();
		
		
		
		
			switch (opcion) {
				case "sumar":
					double resultadoSuma = iNumero1 + iNumero2;
					ps.println("la suma es : " + resultadoSuma);

					break;
				case "restar":
					double resultadoResta = iNumero1 - iNumero2;
					ps.println("la resta es : " + resultadoResta);
					break;
				case "multiplicar":
					double resultadoMultiplicacion = iNumero1 * iNumero2;
					ps.println("la multiplicación es : " + resultadoMultiplicacion);
					break;
				case "dividir":
					double resultadoDivision = iNumero1 / iNumero2;
					ps.println("la división es : " + resultadoDivision);
					break;
				default:
					ps.println("Debe introducir una opción correcta");
				}

				System.out.println("Fin del servidor");
		
			}
		}
	}
}
		
</body>
</html>