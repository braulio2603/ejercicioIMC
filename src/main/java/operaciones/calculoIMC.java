package operaciones;

import static varIMC.varIMC.*;
public class calculoIMC {
    public void opCalculoIMC(){
       double estaturaAlCuadrado = estatura*estatura;
       double res =  peso/= estaturaAlCuadrado;

        System.out.println("TU IMC ES: " + res);

        if (res < 16) {
            System.out.println("Usted tiene delgadez severa");
        } else if (res == 16 || res == 17)
        {
            System.out.println("Usted tiene delgadez moderada");
        }
       else if (res > 17 && res < 18.5)
        {
            System.out.println("Usted tiene delgadez leve");
        }
        else if (res > 18.5 && res < 25)
        {
            System.out.println("Usted tiene peso normal");
        }
        else if (res > 25 && res < 30)
        {
            System.out.println("Usted tiene sobrepeso");
        }
      else if (res > 30 && res < 35)
        {
            System.out.println("Usted tiene obesidad leve");
        }
       else if (res > 35 && res < 40)
        {
            System.out.println("Usted tiene obesidad moderada");
        }
        else if (res >= 40)
        {
            System.out.println("Usted tiene obesidad morbida");
        }

            }

    }
