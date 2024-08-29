package interfaceEE.Equipamentos.estabelecimento;

import interfaceEE.Equipamentos.Multifuncional.EquipamentoMultifuncional;
import interfaceEE.Equipamentos.copiadora.Copiadora;
import interfaceEE.Equipamentos.digitalizadora.Digitalizadora;
import interfaceEE.Equipamentos.impressora.Impressora;

public class Loja {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        impressora.imprimir();
        digitalizadora.Digitalizar();
        copiadora.Copiar();
    }
    
    
}
