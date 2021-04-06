import java.util.Stack1;

class Stack{
 public static Stack1<String> elemen1=new Stack1<String>();
 public static Stack1<String> elemen2=new Stack1<String>();

}
class Tambahisi extends Stack{
    public Stack1<String> elemen1=new Stack1<String>();
    public Stack1<String> elemen2=new Stack1<String>();

    public void add_elemen(String new_elemen){
        super.elemen1.push(new_elemen);

    }
    public void add_elemen2(String new_elemen){
        super.elemen2.push(new_elemen);
    }

    public void edit_elemen(int index,String new_elemen){
        super.elemen1.set(index,new_elemen);
    }

}


public class Stack{
    public static void main(String[] args){
        // Stack<String> tambah=new Stack<String>();
        Stack1 r=new Stack1();
        Tambahisi isi=new Tambahisi();
        isi.add_elemen("buku");
        isi.add_elemen("pensil");
        isi.edit_elemen(2,"penghapus");
        isi.add_elemen2("penggaris");

        System.out.println(r.elemen1);
        System.out.println(r.elemen2);
        
    }
}