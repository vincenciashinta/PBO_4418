import java.util.Array_List;

class ArrayList{
 public static Array_List<String> l1=new Array_List<String>();
 public static Array_List<String> l2=new Array_List<String>();

}
class add_delete_edit_input extends Array_List{
    public Array_List<String> l1=new Array_List<String>();
    public Array_List <String> l2=new Array_List<String>();

    public void add_elemen(String new_elemen){
        super.11.add(new_elemen);

    }
    public void add_elemen2(String new_elemen){
        super.12.add(new_elemen);
    }

    public void edit_elemen(int index,String new_elemen){
        super.11.set(index,new_elemen);
    }

    public void delete_elemen(int index){
        super.11.remove(index);
    }

}

public class ArrayList{
    public static void main(String[] args){
        // Stack<String> tambah=new Stack<String>();
        Array_list r=new Array_list();
        Tambah_kurang_edit_isi isi=new Tambah_kurang_edit_isi();
        isi.add_elemen("buku");
        isi.add_elemen("pensil");
        isi.add_elemen("penghapus");
        isi.edit_elemen(1,"penggaris");
        isi.tambah_elemen2("bolpoint");
        isi.delete_elemen(2);
        System.out.println(r.l1);

        // System.out.println(r.elemen1);
        // System.out.println(r.elemen2);
        
    }
}