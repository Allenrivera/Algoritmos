import java.util.Scanner;


    public class Main {


        public static void main(String[] args) {
            ejercicio1();
            ejercicio2();
            ejercicio3();
            ejercicio4();
            ejercicio5();
            ejercicio6();
            ejercicio7();
        }

        public static void ejercicio1() {

            Scanner data = new Scanner(System.in);
            int i = 1, f = 1, cantHoras = 0, nHoras = 0, nEmpleados, totalHoras = 0, horas;
            double valHoras = 0, pagHoras = 0, pagHorasTotal = 0;
            boolean error = false;
            System.out.println("PAGO DE HORAS");
            System.out.println("Ingrese en valor de la hora:");
            valHoras = data.nextDouble();

            System.out.print("Ingrese por favor la cantidad de empleados :");
            nEmpleados = data.nextInt();

            for (f = 1; f <= nEmpleados; f++) {
                cantHoras = 0;
                pagHoras = 0;
                System.out.println("Ingrese la cantidad de días que el empleado trabajó a la semana: ");
                do {
                    horas = data.nextInt();
                    if (horas > 7) {
                        error = true;
                        System.out.println("No hay más de 8 días a la semana");
                    }
                } while (error);
                for (i = 1; i <= horas; i++) {
                    if (i == 1) {
                        System.out.print("Ingrese las horas trabajadas el día lunes por el empleado #" + f + ": ");
                        nHoras = data.nextInt();
                    } else if (i == 2) {
                        System.out.print("Ingrese las horas trabajadas el día martes por el empleado #" + f + ": ");
                        nHoras = data.nextInt();
                    } else if (i == 3) {
                        System.out.print("Ingrese las horas trabajadas el día miercoles por el empleado #" + f + ": ");
                        nHoras = data.nextInt();
                    } else if (i == 4) {
                        System.out.print("Ingrese las horas trabajadas el día jueves por el empleado #" + f + ": ");
                        nHoras = data.nextInt();
                    } else if (i == 5) {
                        System.out.print("Ingrese las horas trabajadas el día viernes por el empleado #" + f + ": ");
                        nHoras = data.nextInt();
                    } else if (i == 6) {
                        System.out.print("Ingrese las horas trabajadas el día sábado por el empleado #" + f + ": ");
                        nHoras = data.nextInt();
                    } else if (i == 7) {
                        System.out.print("Ingrese las horas trabajadas el día domingo por el empleado #" + f + ": ");
                        nHoras = data.nextInt();
                    }
                    cantHoras = cantHoras + nHoras;
                }
                totalHoras = totalHoras + cantHoras;
                pagHoras = cantHoras * valHoras;
                System.out.println("El empleado número " + f + " trabajó " + cantHoras + " horas a la semana.\n Y su sueldo semanal es: $" + pagHoras + "\n");
            }
            pagHorasTotal = totalHoras * valHoras
            ;
            System.out.println("Los " + nEmpleados + " empleados trabajaron " + totalHoras + " horas a la semana y el pago semanal es de $" + pagHorasTotal);
        }

        public static void ejercicio2() {
            Scanner data = new Scanner(System.in);
            double salInicial = 1500, aumento = 0;
            int i = 1, incAnual = 10;
            String nombre;

            System.out.println("Aumento Anual ");
            System.out.print("Ingrese el nombre del empleado: ");
            nombre = data.nextLine();

            System.out.println("\n El empleado " + nombre + " ha recibido sus aumentos anuales de la siguiente manera: ");
            System.out.println("\nAño " + i + ": $" + salInicial);

            for (i = 1; i <= 6; i++) {
                aumento = ((salInicial * incAnual) / 100);
                salInicial = salInicial + aumento;
                System.out.println("\nAño " + i + ": $" + salInicial);
            }

        }

        public static void ejercicio3() {
            Scanner data = new Scanner(System.in);
            System.out.println("El Náufrago Satisfecho\n");

            double hS = 20, hD = 25, hT = 28, total, totalDesc;
            int cant, cargo = 5;
            System.out.println("Ingrese la cantidad de hamburguesas sencillas: ");
            cant = data.nextInt();
            total = cant * hS;
            System.out.println("Ingrese la cantidad de hamburguesas dobles: ");
            cant = data.nextInt();
            total = total + (cant * hD);
            System.out.println("Ingrese la cantidad de hamburguesas triples: ");
            cant = data.nextInt();
            total = total + (cant * hT);

            totalDesc = ((total * cargo) / 100) + total;
            System.out.println("El valor total de las hamburguesas compradas es: $" + totalDesc);
        }

        public static void ejercicio4() {
            Scanner data = new Scanner(System.in);
            double valor, total, watts;

            System.out.println("CLS");
            System.out.println("Ingrese la cantidad de kilowatts:");
            watts = data.nextDouble();
            System.out.println("Ingrese la el valor por kilowatts para realizar el cálculo :");
            valor = data.nextDouble();
            total = valor * watts;
            System.out.println("El valor a pagar es de $" + total);
        }

        public static void ejercicio5() {
            Scanner data = new Scanner(System.in);
            int tiempo = 0, calc = 0;
            double sueldo = 0, bono = 0, total = 0;
            System.out.println("Cómo desea calcular el bono de mensual, ¿por antigüedad o por el sueldo?");
            System.out.println("Ingrese 1 para calcular por antigüedad, ingrese 2 para calcular por el sueldo");
            calc = data.nextInt();
            if (calc == 1) {
                System.out.print("Ingrese\nAntigüedad del empleado:");
                tiempo = data.nextInt();
                System.out.println("Sueldo del empleado");
                sueldo = data.nextDouble();
                if (tiempo > 2 == tiempo < 5) {
                    //20
                    bono = ((sueldo * 20) / 100);
                    total = bono + sueldo;
                    System.out.println("El empleado tiene una antigüedad de " + tiempo + " años y el bono es de: $" + bono + "\nEl total del sueldo más el bono es de: $" + total);

                } else if (tiempo >= 5) {
                    //30
                    bono = ((sueldo * 30) / 100);
                    total = bono + sueldo;
                    System.out.println("El empleado tiene una antigüedad de " + tiempo + " años y el bono es de: $" + bono + "\nEl total del sueldo más el bono es de: $" + total);
                } else {
                    System.out.println("El empleado no cumple con los requisitos para otorgar el bono.");
                }
            } else if (calc == 2) {
                System.out.println("Sueldo del empleado");
                sueldo = data.nextDouble();
                if (sueldo < 1000) {
                    //25
                    bono = ((sueldo * 25) / 100);
                    total = bono + sueldo;
                    System.out.println("El empleado tiene un sueldo de: $" + sueldo + " y el bono es de: $" + bono + "\nEl total del sueldo más el bono es de: $" + total);
                } else if (sueldo > 1000 && sueldo <= 3500) {
                    //15
                    bono = ((sueldo * 15) / 100);
                    total = bono + sueldo;
                    System.out.println("El empleado tiene un sueldo de: $" + sueldo + " y el bono es de: $" + bono + "\nEl total del sueldo más el bono es de: $" + total);
                } else if (sueldo > 3500) {
                    //10
                    bono = ((sueldo * 10) / 100);
                    total = bono + sueldo;
                    System.out.println("El empleado tiene un sueldo de: $" + sueldo + " y el bono es de: $" + bono + "\nEl total del sueldo más el bono es de: $" + total);
                } else {
                    System.out.println("El empleado no cumple con los requisitos para otorgar el bono.");
                }
            }
        }

        public static void ejercicio6() {
            Scanner data = new Scanner(System.in);
            double metros = 0, val = 5000, total;
            System.out.println("Pinturas La Brocha Gorda");
            System.out.println("Ingrese la cantidad de m2 para calcular el presupuesto:");
            metros = data.nextDouble();
            total = metros * val;
            System.out.println("Por los " + metros + "m2 se cobrará: $" + total);

        }

        public static void ejercicio7() {
            Scanner data = new Scanner(System.in);
            double cBase = 0, total = 0;
            int plan = 0, cargo = 0, interes = 0, edad = 0;

            System.out.println("Compañia de Seguros para Autos");
            System.out.println("¿Qué plan desea comprar?\nIngrese:\n 1. Cobertura Amplia - 2. Daños a Terceros");
            plan = data.nextInt();

            if (plan == 1) {
                System.out.println("Usted escogió el plan  1. Cobertura Amplia");
                cBase = 1200;
            } else if (plan == 2) {
                System.out.println("Usted escogió el plan  2. Daños a Terceros");
                cBase = 950;
            }
            System.out.println("Realizaremos unas preguntas para calcular el costo total del seguro\nIngrese 1.Sí - 2. No");

            System.out.println("¿Tiene usted el hábito de tomar alcohol?");
            cargo = data.nextInt();
            if (cargo == 1) {
                interes = interes + 10;
            }
            System.out.println("¿Utiliza lentes?");
            cargo = data.nextInt();
            if (cargo == 1) {
                interes = interes + 5;
            }
            System.out.println("¿Padece enfermedades de deficiencia cardiaca o diabetes?");
            cargo = data.nextInt();
            System.out.println("Ingrese su edad:");
            edad = data.nextInt();
            if (cargo == 1 && edad > 40) {
                interes = interes + 20;
            } else {
                interes = interes + 10;
            }
            total = ((cBase * cargo) / 100) + cBase;

            if (plan == 1) {
                System.out.println("El valor total del seguro Cobertura Amplia que usted desea es igual a: $" + total);
            } else {
                System.out.println("El valor total del seguro Daños a Terceros que usted desea es igual a: $" + total);
            }

        }

        public static void ejercicio8() {
            Scanner data = new Scanner(System.in);
            int cal = 0;
            System.out.println("Ingrese por favor la nota que obtuvo por favor:");
            cal = data.nextInt();
            if (cal == 10) {
                System.out.println("Su nota es: A");
            } else if (cal == 9) {
                System.out.println("Su nota es: B");
            } else if (cal == 8) {
                System.out.println("Su nota es: C");
            } else if (cal > 5 && cal < 8) {
                System.out.println("Su nota es: D");
            } else if (cal < 5 && cal >= 0) {
                System.out.println("Su nota es: F");
            }
        }

        public static void ejercicio9() {
            Scanner data = new Scanner(System.in);
            int nVentas = 0, i = 0, me10 = 0, mid10 = 0, may20 = 0;
            double vVentas = 0, vMe = 0, vMid = 0, vMay = 0, vTotal = 0;

            System.out.print("¿Cuantas ventas realizo el día de hoy? ");
            nVentas = data.nextInt();
            for (i = 1; i >= nVentas; i++) {
                System.out.print("Ingrese el valor de la venta " + i + ": ");
                vVentas = data.nextDouble();
                if (vVentas <= 10000) {
                    me10 = me10 + 1;
                    vMe = vMe + vVentas;
                } else if (vVentas > 10000 && vVentas < 20000) {
                    mid10 = mid10 + 1;
                    vMid = vMid + vVentas;
                } else {
                    may20 = may20 + 1;
                    vMay = vMay + vVentas;
                }
                vTotal = vTotal + vVentas;
            }
            System.out.println("El valor total de las" + nVentas + " ventas es igual a $" + vTotal);
            System.out.println("\n\n" + me10 + " ventas fueron por $10000 o menos y el valor de estas son: $" + vMe);
            System.out.println("\n\n" + mid10 + " ventas fueron mayores a $10000 y menores a $20000 y el valor de estas son: $" + vMid);
            System.out.println("\n\n" + may20 + " ventas fueron mayores a $20000 y el valor de estas son: $" + vMay);
        }


    }

