package mvc.DAOinterface;
import java.util.List;
import mvc.model.admin;



public interface admin {
    public void insert(admin u);
    public void update(admin u);
    public void delete(String identitas);
    public List<admin> getAll();
    public List<admin> getCariNama(String nama);
}