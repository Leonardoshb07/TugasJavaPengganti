/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program1;

/**
 *
 * @author ASPIRE E 14
 */
public class Object {
    mhs[] data;
    private int index;
    private int x;
   
   
    mhs dt = new mhs();
    public Object(){
        data = new mhs[100];
    }
   
    public void get(int ind){
                System.out.println("NIM   : "+data[ind].getNim());
                System.out.println("Nama  : "+data[ind].getNama());
                System.out.println("IPK   : "+data[ind].getIpk());
                System.out.print("\n=====================\n");
                }
   
    public void set(int index, mhs datuk){
        data[index] = datuk;
    }

    public int getINDEX(){
        return index;
    }
   
    public void setINDEX(int index){
        this.index = index;
    }
  
    public void SearchNim(String nm){
        int a = getINDEX();
        for(int i = 0; i<a; i++){
            if(nm.equals(data[i].getNim())){
                get(i);
            }           
        }
    }
   
    public void SearchNama(String nm){
        int a = getINDEX();
        for(int i = 0; i<a; i++){
            if(nm.equals(data[i].getNama())){
                get(i);
            }           
        }
    }
   
    public void SearchIpk(String ip){
        int a = getINDEX();
        for(int i = 0; i<a; i++){
            if(ip.equals(data[i].getIpk())){
                get(i);
            }            
        }
    }
}