
package AnalisisNumerico;
import java.math.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTextField;


public class Metodos {
    
    //TRAPECIO SIMPLE
    //PARAMETROS a, b, f(a), f(b)
    public BigDecimal trapecioSimple(BigDecimal a, BigDecimal b, BigDecimal fa, BigDecimal fb){
        BigDecimal delta = BigDecimal.ZERO;
        BigDecimal DOS = new BigDecimal("2");
        
        //delta = (b-a)[(f(a)+f(b))/2]
        delta = (b.subtract(a)).multiply((fa.add(fb)).divide(DOS, 30, RoundingMode.HALF_UP));
        
        return delta;
    }

    //SIMPSON 1/3 SIMPLE
    //PARAMETROS a, b, f(a), f(b), f((a+b)/2)
    public BigDecimal simpson13Simple(BigDecimal a, BigDecimal b, BigDecimal fa, BigDecimal fb, BigDecimal fab2){
        BigDecimal delta = BigDecimal.ZERO;
        BigDecimal SEIS = new BigDecimal("6");
        BigDecimal CUATRO = new BigDecimal("4");
        
        //delta = ((b-a)/6)[f(a)+4f((a+b)/2)+f(b)]
        delta = ((b.subtract(a)).divide(SEIS, 30, RoundingMode.HALF_UP)).multiply((fa.add(CUATRO.multiply(fab2)).add(fb)));
        System.out.println("b-a/6 = " + (b.subtract(a)).divide(SEIS, 30, RoundingMode.HALF_UP));
        System.out.println("\nf(a) + 4(f((a+b)/2)) + f(b) = " + (fa.add(CUATRO.multiply(fab2)).add(fb)));
        System.out.println("delta = " + delta);
        
        return delta;
    }
    
    //SIMPSON 3/8 SIMPLE
    //PARAMETROS a, b, f(a), f(b), f(x1), f(x2)
    public BigDecimal simpson38Simple(BigDecimal a, BigDecimal b, BigDecimal fa, BigDecimal fb, BigDecimal fx1, BigDecimal fx2){
        BigDecimal delta = BigDecimal.ZERO;
        BigDecimal TRES = new BigDecimal("3");
        BigDecimal OCHO = new BigDecimal("8");
        
        //delta = (b-a)[(f(b)+3f(x1)+3f(x2)+f(a))/8]
        delta = (b.subtract(a)).multiply((fb.add(TRES.multiply(fx1)).add(TRES.multiply(fx2)).add(fa)).divide(OCHO, 30, RoundingMode.HALF_UP));
        
      
        
        return delta;
    }
    
    public String minimosCuadrados(JTable Tabla1, int metodo){
        TableModel tableModel = Tabla1.getModel();
        int cols = Tabla1.getColumnCount();
        int fils = Tabla1.getRowCount();
        String status = "";
        Double XGORRITO = 0.0, YGORRITO = 0.0, XGorritoPow = 0.0, p = 0.0, q = 0.0, r = 0.0, s = 0.0, b = 0.0, n = (double) fils, xpory = 0.0;
        Double m = 0.0, bGORRITO = 0.0, XPow = 0.0, y = 0.0, yresul;
        Double [] xi = new Double [fils];
        
        switch(metodo){
            
            //Minimos Cuadrados Logaritmicos
            case 1:
                
                for(int i = 0; i < fils; i++){
                    
                    //x gorrito = log(x)
                    xi[i] = Double.parseDouble(tableModel.getValueAt(i,0).toString());
                    XGORRITO = Math.log10(xi[i]);
                    Tabla1.setValueAt(XGORRITO, i, 2);
                    
                    //sumatoria de x gorrito = p
                    p += XGORRITO;
                    
                    //y gorrito = log(y)
                    YGORRITO = Double.parseDouble(tableModel.getValueAt(i,1).toString());
                    YGORRITO = Math.log10(YGORRITO);
                    Tabla1.setValueAt(YGORRITO, i, 3);
                    
                    //sumatoria de y gorrito = q
                    q += YGORRITO;
                    
                    //x gorrito^2
                    XGorritoPow = Math.pow(XGORRITO, 2);
                    Tabla1.setValueAt(XGorritoPow, i, 4);
                    
                    //Sumatoria x gorrito^2 = r
                    r += XGorritoPow;

                    //x gorrito * y gorrito = xpory
                    xpory = XGORRITO*YGORRITO;
                    Tabla1.setValueAt(xpory, i, 5);
                    
                    //Sumatoria x gorrito * y gorrito = s
                    s += xpory;
                }
                
                DefaultTableModel modelo = (DefaultTableModel) Tabla1.getModel();
                String[] blanco1 = {"", "","","","","",""};
                modelo.addRow(blanco1);
                String[] datos = {"", "", p.toString(), q.toString(), r.toString(), s.toString()}; // Cantidad de columnas de la tabla
                modelo.addRow(datos);
                
                /*
                status += "Sumatoria de Xi = " + p +"\n";
                status += "Sumatoria de Yi = " + q +"\n";
                status += "Sumatoria de Xi^2 = " + r +"\n";
                status += "Sumatoria de Xi*Yi = " + s +"\n";
                */
                
                bGORRITO = ((s*p)-(r*q))/((p*p)-(r*n));
                
                status += "b (gorrito) = " + bGORRITO + "\n";
                
                m = (q-(bGORRITO*n))/p;
                status += "M = " + m + "\n";
                
                b = Math.exp(bGORRITO);
                status += "b = " + b + "\n";
                
                for(int i = 0; i < fils; i++){
                    
                    status += "\ny" + (i+1) + " = " + b * Math.pow(xi[i], m);
                }
                         
            break;
            //Minimos Cuadrados Exponencial
            case 2:
                
                for(int i = 0; i < fils; i++){
                    
                    xi[i] = Double.parseDouble(tableModel.getValueAt(i,0).toString());
                    p += xi[i];
                    
                    //y gorrito = log(y)
                    YGORRITO = Double.parseDouble(tableModel.getValueAt(i,1).toString());
                    YGORRITO = Math.log10(YGORRITO);
                    Tabla1.setValueAt(YGORRITO, i, 2);
                    
                    //sumatoria de y gorrito = q
                    q += YGORRITO;

                    

                    //x^2
                    XPow = Math.pow(xi[i], 2);
                    Tabla1.setValueAt(XPow, i, 3);
                    
                    //Sumatoria x gorrito^2 = r
                    r += XPow;

                    //x * y gorrito = xpory
                    xpory = xi[i]*YGORRITO;
                    Tabla1.setValueAt(xpory, i, 4);
                    
                    //Sumatoria x gorrito * y gorrito = s
                    s += xpory;
                }
                
                DefaultTableModel modelo2 = (DefaultTableModel) Tabla1.getModel();
                String[] blanco2 = {"", "","","","",""};
                modelo2.addRow(blanco2);
                String[] datos2 = {p.toString(), "",  q.toString(), r.toString(), s.toString()}; // Cantidad de columnas de la tabla
                modelo2.addRow(datos2);
                

                bGORRITO = ((s*p)-(r*q))/((p*p)-(r*n));
                
                status += "b (gorrito) = " + bGORRITO + "\n";
                
                m = (q-(bGORRITO*n))/p;
                status += "M = " + m + "\n";
                
                b = Math.exp(bGORRITO);
                status += "b = " + b + "\n";
                
                for(int i = 0; i < fils; i++){
                    
                    status += "\ny" + (i+1) + " = " + b * Math.exp(xi[i]*m);
                }
            break;
            //Minimos Cuadrados Lineal  
            case 3:
                
                for(int i = 0; i < fils; i++){
                    
                    xi[i] = Double.parseDouble(tableModel.getValueAt(i,0).toString());
                    p += xi[i];
                    
                    
                    y = Double.parseDouble(tableModel.getValueAt(i,1).toString());
                    
                    //sumatoria de y = q
                    q += y;

                 //200   

                    //x^2
                    XPow = Math.pow(xi[i], 2);
                    Tabla1.setValueAt(XPow, i, 2);
                    
                    //Sumatoria x gorrito^2 = r
                    r += XPow;

                    //x * y = xpory
                    xpory = xi[i]*y;
                    Tabla1.setValueAt(xpory, i, 3);
                    
                    //Sumatoria x gorrito * y gorrito = s
                    s += xpory;
                }
                
                DefaultTableModel modelo3 = (DefaultTableModel) Tabla1.getModel();
                String[] blanco3 = {"", "","","",""};
                modelo3.addRow(blanco3);
                String[] datos3 = {p.toString(), q.toString(), r.toString(), s.toString()}; // Cantidad de columnas de la tabla
                modelo3.addRow(datos3);
                

                bGORRITO = ((s*p)-(r*q))/((p*p)-(r*n));
                
                status += "b (gorrito) = " + bGORRITO + "\n";
                
                m = (q-(bGORRITO*n))/p;
                status += "M = " + m + "\n";
                

                b = Math.exp(bGORRITO);
                status += "b = " + b + "\n";
                
                for(int i = 0; i < fils; i++){
                    
                    yresul = (m*xi[i] + b);
                    status += "\ny" + (i+1) + " = " + yresul;
                }                
            break;
        }
        return status;
    }
    
    public double trapecioCompuesto(JTable Tabla){
        int i = 0, filas = Tabla.getRowCount();
        double yi, yn, sum, resultado, h;
        String resultadoString;
        
        
        h = Double.parseDouble(Tabla.getValueAt(1, 1).toString()) - Double.parseDouble(Tabla.getValueAt(0, 1).toString());
        sum = 0;
        yi = Double.parseDouble(Tabla.getValueAt(i, 2).toString());
        for(i = 1; i < filas-1; i++){
            sum += Double.parseDouble(Tabla.getValueAt(i, 2).toString());
        }
        yn = Double.parseDouble(Tabla.getValueAt(filas-1, 2).toString());
        
        resultado = (h/2)*(yi+yn+(2*sum));
        
        return resultado;
    }
    
    public String checkH(JTable Tabla){
        int i = 0, filas = Tabla.getRowCount();
        double h, h2;
        BigDecimal H = new BigDecimal(String.valueOf(0));
        BigDecimal H2 = new BigDecimal(String.valueOf(0));

        String valido = "";
        
            System.out.println("///////////////////Check H////////////////////////////");

            
            H = restaBigDecimal(Double.parseDouble(Tabla.getValueAt(1, 1).toString()), Double.parseDouble(Tabla.getValueAt(0, 1).toString()));
            System.out.println(H);
            //System.out.println(filas);
            i = 2;
            while((valido == "") && (i < filas)){
                
                
                H2 = restaBigDecimal(Double.parseDouble(Tabla.getValueAt(i, 1).toString()), Double.parseDouble(Tabla.getValueAt(i-1, 1).toString()));
                System.out.println(H2);
                
                if(H.compareTo(H2) != 0){
                    valido = "ERROR: tamaño de paso distinto";
                }else{
                    H = H2;
                    
                }
                
                i ++;
                System.out.println("i = " + i);
            }
            
            System.out.println("ERROR: tamaño de paso distinto");
            System.out.println("/////////////////////////////////////////////////////");
        return valido;
    }
    
    public static BigDecimal restaBigDecimal(double a, double b){
        BigDecimal A = new BigDecimal(String.valueOf(a));
        BigDecimal B = new BigDecimal(String.valueOf(b));
        BigDecimal resultado = new BigDecimal(String.valueOf(0));
        
        resultado = A.subtract(B);
        
        return resultado;
    }
    
}
//312