package tugas;

// Kelas Induk Hewan
class Hewan { 
  String nama; 
  String jenis; 

  public void tampilkanInfo() { 
      System.out.println("Nama Hewan: " + nama); 
      System.out.println("Jenis: " + jenis); 
  } 
} 

// Kelas Turunan HewanAir
class HewanAir extends Hewan {
  String habitatAir;
  
  @Override
  public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Habitat: " + habitatAir);
  }
}

// Kelas Turunan HewanDarat
class HewanDarat extends Hewan {
  String habitatDarat;
  
  @Override
  public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Habitat: " + habitatDarat);
  }
}

// Kelas Turunan Kucing 
class Kucing extends HewanDarat { 
  String suara; 

  @Override 
  public void tampilkanInfo() { 
      super.tampilkanInfo(); 
      System.out.println("Miaw Miaw N-word"); 
  }  
}

// Kelas Turunan Anjing
class Ikan extends HewanAir { 
  String suara; 

  @Override 
  public void tampilkanInfo() { 
      super.tampilkanInfo(); 
      System.out.println("Blubuk blubuk"); 
  } 
} 

// Main class
public class Main {
  public static void main(String[] args) {
    Kucing kucing = new Kucing();
    kucing.nama = "Asep";
    kucing.jenis = "Mamalia";
    kucing.habitatDarat = "Darat";
    kucing.tampilkanInfo();
    
    Ikan ikan = new Ikan();
    ikan.nama = "Ikan";
    ikan.jenis = "Tongkol";
    ikan.habitatAir = "Air";
    ikan.tampilkanInfo();
  }
}