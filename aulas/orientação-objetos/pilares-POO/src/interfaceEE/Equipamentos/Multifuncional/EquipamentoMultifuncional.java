package interfaceEE.Equipamentos.Multifuncional;

import interfaceEE.Equipamentos.copiadora.Copiadora;
import interfaceEE.Equipamentos.digitalizadora.Digitalizadora;
import interfaceEE.Equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    
    public void Copiar() {
        
        System.out.println(" 'Copiar' via equipamento multifuncional");
    }

    
    public void imprimir() {
        
        System.out.println(" 'imprimir' via equipamento multifuncional");
    }

    
    public void Digitalizar() {
        
        System.out.println(" 'Digitalizar' via equipamento multifuncional");
    }
    
}
