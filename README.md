# Strukdat-assignment-1

# Object Oriented Programming (OOP)

**Mata Kuliah:** Struktur Data dan Pemrograman Berorientasi Objek  
**Nama:** Muhammad Syadzili Abdul Muhyi  
**NRP:** 5027251030\
**Kelas:** B  

---

## Class & Object
### Class
**Class merupakan Blue print atau cetakan untuk membuat sebuah Object**

di program kali ini, Class utamanya (*abstract class*) adalah `Mahasiswa`. class utamanya diturunkan menjadi:

- `MahasiswaReguler`
- `MahasiswaBeasiswa`

Contoh:
```java
abstract class Mahasiswa {
    private String nama;
    private String nrp;

    public Mahasiswa() {
        this.nama = "Ucup";
        this.nrp = "5027451045";
    }

    public Mahasiswa(String nama, String nrp) {
        this.nama = nama;
        this.nrp = nrp;
    }

    public abstract double UKT();
}