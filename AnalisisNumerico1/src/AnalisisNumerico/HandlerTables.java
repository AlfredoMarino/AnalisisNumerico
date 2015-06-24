
package AnalisisNumerico;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.math.*;
import javax.swing.JTextField;


public class HandlerTables {
     
     public String getH(JTable Tabla1, JTextField resultado){
         TableModel tableModel = Tabla1.getModel();
         int cols = tableModel.getColumnCount();
         int j, metodo = 1, ac = 0, bc = 0;
         boolean supertrapecio = false;
         double MetodoPaso[][] = new double [cols][cols];
         String paso[] = new String[cols];
         BigDecimal a = BigDecimal.ZERO;
         BigDecimal b = BigDecimal.ZERO;
         BigDecimal diferencia1 = BigDecimal.ZERO;
         BigDecimal diferencia2 = BigDecimal.ZERO;
         BigDecimal dos = new BigDecimal("2");
         BigDecimal tamaño[] = new BigDecimal [cols];
         String MetodosAUsar = "", Sfa = "", Sfb = "", Sfx1 = "", Sfx2 = "", Sfab2 = "";
         BigDecimal RESULTADO = BigDecimal.ZERO;
         Metodos Metodo = new Metodos();
         BigDecimal fa = BigDecimal.ZERO;
         BigDecimal fb = BigDecimal.ZERO;
         BigDecimal fx1 = BigDecimal.ZERO;
         BigDecimal fx2 = BigDecimal.ZERO;
         BigDecimal fab2 = BigDecimal.ZERO;
        BigDecimal delta = BigDecimal.ZERO;
         
         burbuja(Tabla1, 1);
         paso = getX(Tabla1);
         
         
         for(int i=0; i< cols; i++){
             tamaño[i] = new BigDecimal(paso[i]);
         }
         
       
         a = tamaño[0];
         b = tamaño[1];
         for(j = 0; j+2 <= cols; j++){
             
                 
            if (j+2 < cols){    
                
                diferencia1 = tamaño[j+1].subtract(tamaño[j]);
                diferencia2 = tamaño[j+2].subtract(tamaño[j+1]);
                if(metodo == 1){
                    a = tamaño[j];
                    ac = j;
                }
                //if((diferencia1.compareTo(diferencia2) == 0) && (metodo <= 3)){
                if((diferencia1.compareTo(diferencia2) == 0)){
                    b = tamaño[j+2];
                    bc = j+2;
                    if(metodo >= 3){
                        supertrapecio = true;
                    }else{
                        metodo++;
                    }
                }else{
                  
                    if(supertrapecio == true){
                        metodo = 1;
                        //supertrapecio = false;
                    }
                    switch(metodo){
                    
                        //TRAPECIO
                        case 1:
                            if(supertrapecio == false){
                                a = tamaño[j];
                                b = tamaño[j+1];
                                Sfa = tableModel.getValueAt(1,j).toString();
                                Sfb = tableModel.getValueAt(1,j+1).toString();
                                
                            }else{
                                supertrapecio = false;
                                Sfa = tableModel.getValueAt(1,ac).toString();
                                Sfb = tableModel.getValueAt(1,bc).toString();
                            }
                            
                            System.out.println("trapecio:\na = "+ a+" b = "+ b);
                            
                            
                            fa = new BigDecimal(Sfa);
                            fb = new BigDecimal(Sfb);
                          
                            delta = Metodo.trapecioSimple(a, b, fa, fb);
                            MetodosAUsar = MetodosAUsar + "\nTRAPECIO SIMPLE:\na = " + a+ " b = " + b + "\nf(a) = " + Sfa + " f(b) = " + Sfb + "\nDelta = " + delta + "\n";
                            RESULTADO = RESULTADO.add(delta);
                        break;
                    
                        //SIMPSON 1/3
                        case 2:
                            a = tamaño[j-1];
                            
                            System.out.println("Simpson 1/3:\na = "+ a + " (a + b)/2 = " + (a.add(b)).divide(dos, 30, RoundingMode.HALF_UP) +" b = "+ b);
                                                  
                            Sfa = tableModel.getValueAt(1,j-1).toString();
                            fa = new BigDecimal(Sfa);
                            Sfb = tableModel.getValueAt(1,j+1).toString();
                            fb = new BigDecimal(Sfb);
                            Sfab2 = tableModel.getValueAt(1,j).toString();
                            fab2 = new BigDecimal(Sfab2);
                            
                            delta = Metodo.simpson13Simple(a, b, fa, fb, fab2);
                            MetodosAUsar = MetodosAUsar + "\nSIMPSON 1/3 SIMPLE:\na = " + a + " (a + b)/2 = " + (a.add(b)).divide(dos, 30, RoundingMode.HALF_UP) +" b = "+ b + "\n";
                            MetodosAUsar = MetodosAUsar + "f(a) = " + Sfa + " f((a+b)/2) = " + Sfab2 + " f(b) = " + Sfb + "\nDelta = " + delta + "\n";
                            RESULTADO = RESULTADO.add(delta);
                        break;
                    
                        //SIMPSON 3/8
                        case 3:
                            a = tamaño[j-2];
                            
                            System.out.println("Simpson 3/8:\na = "+ a +" X1 = " + ((tamaño[j+1].subtract(tamaño[j])).add(a)) +" X2 = " + ((tamaño[j+1].subtract(tamaño[j])).add(tamaño[j+1].subtract(tamaño[j])).add(a)) +" b = "+ b);
                            
                            
                            Sfa = tableModel.getValueAt(1,j-2).toString();
                            fa = new BigDecimal(Sfa);
                            Sfb = tableModel.getValueAt(1,j+1).toString();
                            fb = new BigDecimal(Sfb);
                            Sfx1 = tableModel.getValueAt(1,j-1).toString();
                            fx1 = new BigDecimal(Sfx1);
                            Sfx2 = tableModel.getValueAt(1,j).toString();
                            fx2 = new BigDecimal(Sfx2);
                            
                            delta = Metodo.simpson38Simple(a, b, fa, fb, fx1, fx2);
                            MetodosAUsar = MetodosAUsar + "\nSIMPSON 3/8 SIMPLE:\na = " + a +" x1 = " + ((tamaño[j+1].subtract(tamaño[j])).add(a)) +" x2 = " + ((tamaño[j+1].subtract(tamaño[j])).add(tamaño[j+1].subtract(tamaño[j])).add(a)) +" b = "+ b + "\n";
                            MetodosAUsar = MetodosAUsar + "f(a) = " + Sfa + " f(x1) = " + Sfx1 + " f(x2) = " + Sfx2 + " f(b) = " + Sfb + "\nDelta = " + delta + "\n";
                            RESULTADO = RESULTADO.add(delta);
                        break;
                    }
                    a = b;
                    metodo = 1;
                 }
          
            }else{

            switch(metodo){
                    
                        //TRAPECIO
                        case 1:
                            a = tamaño[j];
                            b = tamaño[j+1];
                            System.out.println("trapecio:\na = "+ a+" b = "+ b);
                            //MetodosAUsar = MetodosAUsar + "\nTRAPECIO SIMPLE:\na = " + a+ " b = " + b + "\n";
                            
                            Sfa = tableModel.getValueAt(1,j).toString();
                            fa = new BigDecimal(Sfa);
                            Sfb = tableModel.getValueAt(1,j+1).toString();
                            fb = new BigDecimal(Sfb);
                            
                            delta = Metodo.trapecioSimple(a, b, fa, fb);
                            MetodosAUsar = MetodosAUsar + "\nTRAPECIO SIMPLE:\na = " + a+ " b = " + b + "\nf(a) = " + Sfa + " f(b) = " + Sfb + "\nDelta = " + delta + "\n";
                            RESULTADO = RESULTADO.add(delta);
                        break;
                    
                        //SIMPSON 1/3
                        case 2:
                            a = tamaño[j-1];
                            
                            System.out.println("Simpson 1/3:\na = "+ a + " (a + b)/2 = " + (a.add(b)).divide(dos, 30, RoundingMode.HALF_UP) +" b = "+ b);
                            //MetodosAUsar = MetodosAUsar + "\nSIMPSON 1/3 SIMPLE:\na = " + a + " (a + b)/2 = " + (a.add(b)).divide(dos) +" b = "+ b + "\n";
                            
                            Sfa = tableModel.getValueAt(1,j-1).toString();
                            fa = new BigDecimal(Sfa);
                            Sfb = tableModel.getValueAt(1,j+1).toString();
                            fb = new BigDecimal(Sfb);
                            Sfab2 = tableModel.getValueAt(1,j).toString();
                            fab2 = new BigDecimal(Sfab2);
                            
                            delta = Metodo.simpson13Simple(a, b, fa, fb, fab2);
                            MetodosAUsar = MetodosAUsar + "\nSIMPSON 1/3 SIMPLE:\na = " + a + " (a + b)/2 = " + (a.add(b)).divide(dos, 30, RoundingMode.HALF_UP) +" b = "+ b + "\n";
                            MetodosAUsar = MetodosAUsar + "f(a) = " + Sfa + " f((a+b)/2) = " + Sfab2 + " f(b) = " + Sfb + "\nDelta = " + delta + "\n";
                            RESULTADO = RESULTADO.add(delta);
                        break;
                    
                        //SIMPSON 3/8
                        case 3:
                            a = tamaño[j-2];
                            
                            System.out.println("Simpson 3/8:\na = "+ a +" X1 = " + ((tamaño[j+1].subtract(tamaño[j])).add(a)) +" X2 = " + ((tamaño[j+1].subtract(tamaño[j])).add(tamaño[j+1].subtract(tamaño[j])).add(a)) +" b = "+ b);
                            //MetodosAUsar = MetodosAUsar + "\nSIMPSON 3/8 SIMPLE:\na = " + a +" X1 = " + ((tamaño[j+1].subtract(tamaño[j])).add(a)) +" X2 = " + ((tamaño[j+1].subtract(tamaño[j])).add(tamaño[j+1].subtract(tamaño[j])).add(a)) +" b = "+ b + "\n";
                            
                            Sfa = tableModel.getValueAt(1,j-2).toString();
                            fa = new BigDecimal(Sfa);
                            Sfb = tableModel.getValueAt(1,j+1).toString();
                            fb = new BigDecimal(Sfb);
                            Sfx1 = tableModel.getValueAt(1,j-1).toString();
                            fx1 = new BigDecimal(Sfx1);
                            Sfx2 = tableModel.getValueAt(1,j).toString();
                            //200
                            fx2 = new BigDecimal(Sfx2);
                            
                            delta = Metodo.simpson38Simple(a, b, fa, fb, fx1, fx2);
                            MetodosAUsar = MetodosAUsar + "\nSIMPSON 3/8 SIMPLE:\na = " + a +" x1 = " + ((tamaño[j+1].subtract(tamaño[j])).add(a)) +" x2 = " + ((tamaño[j+1].subtract(tamaño[j])).add(tamaño[j+1].subtract(tamaño[j])).add(a)) +" b = "+ b + "\n";
                            MetodosAUsar = MetodosAUsar + "f(a) = " + Sfa + " f(x1) = " + Sfx1 + " f(x2) = " + Sfx2 + " f(b) = " + Sfb + "\nDelta = " + delta + "\n";
                            RESULTADO = RESULTADO.add(delta);
                        break;
                    }
            }
            
         }
         
         resultado.setText(RESULTADO.toString());
         return MetodosAUsar;
     }
    
     public void numColumn(JTable Tabla1, int column){
       
        String [] columna = {""};
        String [] fila = {"",""};
        DefaultTableModel dtm2 = new DefaultTableModel(null, columna);
        
        for(int i = 1; i < column; i++){
            dtm2.addColumn("",fila);
        }
        
        Tabla1.setModel(dtm2);
    }
    
     
     public void numFils(JTable Tabla1, int fils, int metodo){
       
        switch(metodo){
            //Minimos cuadrados logaritmico 
        case 1:
            String [] columna = {"Xi","Yi","X^i","Y^i","X^i^2","Y^i * X^i"};
            String [] fila = {"",""};
            DefaultTableModel dtm3 = new DefaultTableModel(null, columna);
        
            for(int i = 0; i < fils; i++){
                dtm3.addRow(fila);
            }
        
            Tabla1.setModel(dtm3);
        break;
           //Minimos cuadrados exponencial
        case 2:
            String [] columna2 = {"Xi","Yi","Y^i","X^i^2","Y^i * Xi"};
            String [] fila2 = {"",""};
            DefaultTableModel dtm4 = new DefaultTableModel(null, columna2);
        
            for(int i = 0; i < fils; i++){
                dtm4.addRow(fila2);
            }
        
            Tabla1.setModel(dtm4);
        break;
            //Minimos cuadrados lineal
        case 3:
            String [] columna3 = {"Xi","Yi","Xi^2","Yi * Xi"};
            String [] fila3 = {"",""};
            DefaultTableModel dtm5 = new DefaultTableModel(null, columna3);
        
            for(int i = 0; i < fils; i++){
                dtm5.addRow(fila3);
            }
        
            Tabla1.setModel(dtm5);
        break;
            
        // Trapecio compuesto
        case 4:
            String [] columna4 = {"N","Xm","Ym"};
            String [] fila4 = {"",""};
            DefaultTableModel dtm6 = new DefaultTableModel(null, columna4);
            int i;
        
            for(i = 1; i <= fils + 1; i++){

                dtm6.addRow(fila4);
                dtm6.setValueAt(i, i-1, 0);
            }
        
            Tabla1.setModel(dtm6);  
        break;
        } 
        
    }
 
     
     public String getErrors(JTable Tabla1, int metodo){
        TableModel tableModel = Tabla1.getModel();
        int cols = tableModel.getColumnCount(); 
        int rows = tableModel.getRowCount();  
        String Errors = "";
        int f, c;
        
        switch(metodo){
            // integracion desigual
            case 1:
                cols = tableModel.getColumnCount(); 
                rows = tableModel.getRowCount(); 
         
            break;
            
            //Minimos cuadrados
            case 2:
                cols = 2; 
                rows = tableModel.getRowCount(); 
                
            break;
                
            //Minimos cuadrados
            case 3:
                cols = 3; 
                rows = tableModel.getRowCount(); 
                
            break;
        }         
            
        for(int i=0; i < rows; i++) { 
            for(int j=0; j < cols; j++){ 
                System.out.print(tableModel.getValueAt(i,j)); 
                System.out.println(); 
                try{
                    double x = Double.parseDouble(tableModel.getValueAt(i,j).toString());
                }catch(NullPointerException e){
                    f = i+1;
                    c = j+1;
                    Errors = Errors + "Error: CELDA VACIA en la fila: " + f + " columna: " + c + "\n";
                }catch(NumberFormatException e){
                    f = i+1;
                    c = j+1;
                    Errors = Errors + "Error: VALOR INVALIDO en la fila: " + f + " columna: " + c + "\n";    
                }
            }
        }                
        if(Errors == ""){
            burbuja(Tabla1, metodo);
        }
        return Errors;
    }
     
     public String[] getX(JTable Tabla1){
        TableModel tableModel = Tabla1.getModel();
        int cols = tableModel.getColumnCount();
        String Equis[] = new String[cols];
                
            for(int j=0; j < cols; j++){ 
                System.out.print(tableModel.getValueAt(0,j)); 
                System.out.println(); 
                
                Equis[j] = tableModel.getValueAt(0,j).toString();
                //equis[j] = Double.parseDouble(value);
                
            }
        
         return Equis;
    }
     
     public String getFx(JTable Tabla1, String funcion, int metodo){
        TableModel tableModel = Tabla1.getModel();
        Jep Expresion = new Jep();
        int cols = tableModel.getColumnCount(); 
        int rows = tableModel.getRowCount();
        String celda;
        String Errors = "";
        double fx, x;
        
        int f, c;
         
        switch(metodo){
            // integracion desigual
            case 1:
                cols = tableModel.getColumnCount(); 
                rows = tableModel.getRowCount(); 
 
                for(int i=0; i < rows; i++) { 
                    for(int j=0; j < cols; j++){ 
                        System.out.print(tableModel.getValueAt(i,j)); 
                        System.out.println(); 
                        try{
                            x = Double.parseDouble(tableModel.getValueAt(i,j).toString());
                    
                  
                        }catch(NullPointerException e){
                            if(i != 0){
                                celda = tableModel.getValueAt(0,j).toString();
                                x = Double.parseDouble(celda);

                                fx = Expresion.Evaluar(funcion, "x", x);
                                Tabla1.setValueAt(fx, 1, j);
                            
                            }else{
                    
                                f = i+1;
                                c = j+1;
                                Errors = Errors + "Error: CELDA VACIA en la fila: " + f + " columna: " + c + "\n";
                            }
                            //400
                        }catch(NumberFormatException e){
                            if(i != 0){
                                celda = tableModel.getValueAt(1,j).toString();
               
                        
                                if("".equals(celda)){
                                    x = Double.parseDouble(tableModel.getValueAt(0,j).toString());
                                    fx = Expresion.Evaluar(funcion, "x", x);
                                    Tabla1.setValueAt(String.valueOf(fx), 1, j);
                            
                                }else{
                                    f = i+1;
                                    c = j+1;
                                    Errors = Errors + "Error: VALOR INVALIDO en la fila: " + f + " columna: " + c + "\n"; 
                                }
                            }else{
                                f = i+1;
                                c = j+1;
                                Errors = Errors + "Error: VALOR INVALIDO en la fila: " + f + " columna: " + c + "\n";  
                            }
                        }
                
                    }
                }
            break;
            
            //Minimos cuadrados
            case 2:
                cols = 2; 
                rows = tableModel.getRowCount(); 
 
                for(int j=0; j < cols; j++){ 
                    for(int i=0; i < rows; i++) { 

                        System.out.print(tableModel.getValueAt(i,j)); 
                        System.out.println(); 
                        try{
                            x = Double.parseDouble(tableModel.getValueAt(i,j).toString());
                    
                  
                        }catch(NullPointerException e){
                            if(j != 0){
                                celda = tableModel.getValueAt(i,j-1).toString();
                                x = Double.parseDouble(celda);
                                //if("".equals(celda)){
                        
                                    fx = Expresion.Evaluar(funcion, "x", x);
                                    Tabla1.setValueAt(fx, i, j);
                            
                                //}
                            }else{
                    
                                f = i+1;
                                c = j+1;
                                Errors = Errors + "Error: CELDA VACIA en la fila: " + f + " columna: " + c + "\n";
                            }
                
                        }catch(NumberFormatException e){
                            if(j != 0){
                                celda = tableModel.getValueAt(i,j).toString();
                        
                                if("".equals(celda)){
                                    x = Double.parseDouble(tableModel.getValueAt(i,j-1).toString());
                                    fx = Expresion.Evaluar(funcion, "x", x);
                                    Tabla1.setValueAt(String.valueOf(fx), i, j);
                            
                                }else{
                                    f = i+1;
                                    c = j+1;
                                    Errors = Errors + "Error: VALOR INVALIDO en la fila: " + f + " columna: " + c + "\n"; 
                                }
                            }else{
                                f = i+1;
                                c = j+1;
                                Errors = Errors + "Error: VALOR INVALIDO en la fila: " + f + " columna: " + c + "\n";  
                            }
                        }
                
                    }
                }
            break;
                
            //Trapecio compuesto
            case 3:
                cols = 3; 
                rows = tableModel.getRowCount(); 
 
                for(int j=1; j < cols; j++){ 
                    for(int i=0; i < rows; i++) { 

                        System.out.print(tableModel.getValueAt(i,j)); 
                        System.out.println(); 
                        try{
                            x = Double.parseDouble(tableModel.getValueAt(i,j).toString());
                    
                  
                        }catch(NullPointerException e){
                            if(j != 0){
                                celda = tableModel.getValueAt(i,j-1).toString();
                                x = Double.parseDouble(celda);
                                //if("".equals(celda)){
                        
                                    fx = Expresion.Evaluar(funcion, "x", x);
                                    Tabla1.setValueAt(fx, i, j);
                            
                                //}
                            }else{
                    
                                f = i+1;
                                c = j+1;
                                Errors = Errors + "Error: CELDA VACIA en la fila: " + f + " columna: " + c + "\n";
                            }
                
                        }catch(NumberFormatException e){
                            if(j != 0){
                                celda = tableModel.getValueAt(i,j).toString();
                        
                                if("".equals(celda)){
                                    x = Double.parseDouble(tableModel.getValueAt(i,j-1).toString());
                                    fx = Expresion.Evaluar(funcion, "x", x);
                                    Tabla1.setValueAt(String.valueOf(fx), i, j);
                            
                                }else{
                                    f = i+1;
                                    c = j+1;
                                    Errors = Errors + "Error: VALOR INVALIDO en la fila: " + f + " columna: " + c + "\n"; 
                                }
                            }else{
                                f = i+1;
                                c = j+1;
                                Errors = Errors + "Error: VALOR INVALIDO en la fila: " + f + " columna: " + c + "\n";  
                            }
                        }
                
                    }
                }
            break;
        } 
        
        if(Errors == ""){
          burbuja(Tabla1, metodo);  
        }
        
        return Errors;
    }
     
     public static void burbuja(JTable Tabla, int metodo){
         int filas, columnas;
         if(metodo != 1){
            filas = 2;
            columnas = Tabla.getRowCount();
         }else{
            filas = Tabla.getRowCount();
            columnas = Tabla.getColumnCount();  
         }
         double [][] A = new double[filas][columnas];
         int i, j, limite;
         double aux, aux2;
         
         if(metodo == 1){
                for(i=0;i < filas;i++){
                    for(j=0;j < columnas;j++){
                        
                       A[i][j] = Double.parseDouble(Tabla.getValueAt(i, j).toString());
                       System.out.print("\t" + A[i][j]);
                    }
                    System.out.println("\n");
                }
         }else{
             for(j=0;j < 2;j++){
                for(i=0;i < columnas;i++){
                    
                                                                  
                       A[j][i] = Double.parseDouble(Tabla.getValueAt(i, j).toString());
                       System.out.print("\t" + A[j][i]);
                    }
                    System.out.println("\n");
                }
         
         
             
         }
        for(i=0;i < A[0].length-1;i++){
            for(j=0;j < A[0].length-1;j++){
        // for(i=0;i<= filas;i++){
            //for(j=0;j<= filas-i;j++)
                if (A[0][j] >= A[0][j+1]){
                //if(A[0][j+1]<A[0][j]){
                    aux = A[0][j+1];
                    aux2 = A[1][j+1];
                    A[0][j+1] = A[0][j];
                    A[1][j+1] = A[1][j];
                    A[0][j] = aux;
                    A[1][j] = aux2;
                }
                //System.out.println("\t" + A[i][j]);
               
            }
        }
        //600
          //System.out.println("\n");
            System.out.println("\n");
        if(metodo == 1){
           for(i=0; i<= A.length-1; i++){
                for(j=0; j<= A[0].length-1; j++){
                Tabla.setValueAt(A[i][j], i, j);
                System.out.print("\t" + A[i][j]);
            }
                System.out.println("\n");
                }
        }else{
           for(i=0; i<= A.length-1; i++){
                for(j=0; j<= A[0].length-1; j++){
                Tabla.setValueAt(A[i][j], j, i);
                System.out.print("\t" + A[i][j]);
            }
                System.out.println("\n");
                }           
        }
     }
}
//622
     

