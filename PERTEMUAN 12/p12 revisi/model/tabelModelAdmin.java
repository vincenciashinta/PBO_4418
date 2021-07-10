package mvc.model;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class tabelModelAdmin extends AbstractTableModel{
    List<admin> lb;
    
    public tabelModelAdmin(List<admin> lb){
        this.lb = lb;
    }
    
    @Override
    public int getColumnCount(){
        return 7;
    }
    
    public int getRowCount(){
        return lb.size();
    }
    
    public String getColumnName(int column){
        switch (column){
            case 0:
                return "ID";
            case 1:
                return "NIK";
            case 2:
                return "Nama";
            case 3:
                return "Jenis Kelamin";
            case 4:
                return "Alamat";
            case 5:
                return "Usia";
            case 6:
                return "Alasan";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column){
        switch (column){
            case 0:
                return lb.get(row).getId();
            case 1:
                return lb.get(row).getNIK();
            case 2:
                return lb.get(row).getNama();
            case 3:
                return lb.get(row).getJk();
            case 4:
                return lb.get(row).getAlamat();
            case 5:
                return lb.get(row).getUsia();
            case 6:
                return lb.get(row).getAlasan();
            default:
                return null;
        }
    }
}