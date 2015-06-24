
package AnalisisNumerico;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;
import org.nfunk.jep.*;


public class Jep {
    
    
    public boolean ComprobarFuncion(String funcion){
        boolean Valido = false;
            
        
        DJep Expresion = new DJep();
        Expresion.addStandardFunctions();
        Expresion.addStandardConstants();
        Expresion.addComplex();
        Expresion.setAllowUndeclared(true);
        Expresion.setAllowAssignment(true);
        Expresion.setImplicitMul(true);
        Expresion.addStandardDiffRules();
        
        Node node = Expresion.parseExpression(funcion);
        
        if(Expresion.hasError()){
            Valido = false;
        }else{
            Valido = true;
            try{
                node = Expresion.parse(funcion);
                Valido = true;
            
            }catch(ParseException e){
                e.printStackTrace();
                Valido = false;
            }
        }
        return Valido;
    }
    
     public double Evaluar(String funcion, String variable, double valor){
        double Resultado = 0;
        
        DJep expresion = new DJep();
        expresion.addStandardFunctions();
        expresion.addStandardConstants();
        expresion.addComplex();
        expresion.setAllowUndeclared(true);
        expresion.setAllowAssignment(true);
        expresion.setImplicitMul(true);
        expresion.addStandardDiffRules();
        
        expresion.addVariable(variable, valor);
        expresion.parseExpression(funcion);
        
        Resultado = expresion.getValue();
        
        return Resultado;
    }
    
     
    public String Derivar(String funcion){
        
        String Derivada = "";
        DJep Derivar = new DJep();
        Derivar.addStandardFunctions();
        Derivar.addStandardConstants();
        Derivar.addComplex();
        Derivar.setAllowUndeclared(true);
        Derivar.setAllowAssignment(true);
        Derivar.setImplicitMul(true);
        Derivar.addStandardDiffRules();
        
        try{
            Node node = Derivar.parse(funcion);
            Node diff = Derivar.differentiate(node,"x");
            Node sim = Derivar.simplify(diff);
            
            Derivada = Derivar.toString(sim);
            
        }catch(ParseException e){
            e.printStackTrace();
        }
        
        return Derivada;
    }
     
}
//92
