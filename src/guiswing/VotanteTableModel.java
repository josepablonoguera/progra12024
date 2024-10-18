/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiswing;

import files.Voter;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class VotanteTableModel extends AbstractTableModel {
    private List<Voter> votantes;
    private String[] columnNames = {
        "Cédula", "Código Electoral", "Relleno", "Fecha Caducidad", 
        "Junta", "Nombre", "Primer Apellido", "Segundo Apellido"
    };

    public VotanteTableModel(List<Voter> votantes) {
        this.votantes = votantes;
    }

    @Override
    public int getRowCount() {
        return votantes.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Voter votante = votantes.get(rowIndex);
        switch (columnIndex) {
            case 0: return votante.getCedula();
            case 1: return votante.getCodeElectoral();
            case 2: return votante.getRelleno();
            case 3: return votante.getFechaCaducidad();
            case 4: return votante.getJunta();
            case 5: return votante.getNombre();
            case 6: return votante.getPrimerApellido();
            case 7: return votante.getSegundoApellido();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
