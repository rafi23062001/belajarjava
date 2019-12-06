public class helloworld{
    public static void main(final String[] args) {
        System.out.println("Hello World !");
        mobil bmw = new mobil(); // kita bangun object mobil bmw
        bmw.merk = "BMW i3000";
        bmw.maju();
        
        mobil fordShelby = new mobil();
        fordShelby.merk = "Ford Mustang Shelby";
        fordShelby.maju();
    }
}

class mobil{
    //attribut
    public String merk;

    //method 
    public void maju(){
        System.out.println("Mobil "+this.merk+" maju !!!! Brmmm.....");
    }
}
