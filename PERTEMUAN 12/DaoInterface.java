package model;
import entity.tbl_pendaftaran;
import java.util.List;


public class DaoInterface {
    public void insertdata (tbl_pendaftaran data)throws Exception;
    public void deleteMahasiswa (int nim)throws Exception;
    public void updateMahasiswa (int nim, Mahasiswa mahasiswa)throws Exception;
    public List<Mahasiswa> readAll()throws Exception;