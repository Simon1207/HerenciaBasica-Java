
package empleo.clases;

/**
 *
 * @author Pintado
 */
public class area extends Empleado {
    int añosLaborando;
    String tipoArea;

    public area(String nombre, String apellidoPaterno, String apellidoMaterno, String area, int edad, int añosLaborando,String tipoArea ) {
        super(nombre, apellidoPaterno, apellidoMaterno, area, edad);
        this.añosLaborando=añosLaborando;
        this.tipoArea=tipoArea;
    }
    
    public void detalleArea(){
        System.out.println("Area: "+this.tipoArea+"\n"+"años laborando: "+this.añosLaborando);
    }
    
     public void trabaja(){
        System.out.println("Desalle empleado: "+this.nombre+" "+this.apellidoPaterno+" "+this.apellidoMaterno+" Trabaja en el area de "+this.area+" y tiene "
                + "la edad de "+this.edad+"años");
    }
    
}
