# Strukdat-assignment-1

# Object Oriented Programming (OOP)

**Mata Kuliah:** Struktur Data dan Pemrograman Berorientasi Objek  
**Nama:** Muhammad Syadzili Abdul Muhyi  
**NRP:** 5027251030\
**Kelas:** B  

---

## Class & Object
### 1. Class
**Class merupakan Blue print atau cetakan untuk membuat sebuah Object.**

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
```

### 2. Object
**Object merupakan hasil/representasi (Instance) dari sebuah class.**

Object yang kita pakai:
- `mhsReguler` (merupakan *object* dari class `MahasiswaReguler`)
- `mhsBeasiswa` (merupakan *object* dari class `MahasiswaBeasiswa`)

Contoh:
```java 
MahasiswaReguler mhsReguler = new MahasiswaReguler("Dzili", "5027251030", 5000000);
MahasiswaBeasiswa mhsBeasiswa = new MahasiswaBeasiswa("Ucup", "5027451045");

//ini buat gunain object untuk manggil method
System.out.println("Tagihan UKT Dzili: Rp " + mhsReguler.UKT());
System.out.println("Tagihan UKT Ucup: Rp " + mhsBeasiswa.UKT());
```
# 4 PILAR DARI OOP
## 1. Inheritance

Mekanisme di mana sebuah *class* baru mengambil sifat dari *class* yang sudah ada. 
- **Implementasi:** `MahasiswaReguler` mewarisi atribut `nama` dan `nrp` dari induknya (class utama), yaitu `Mahasiswa`.
- **Keyword:** Menggunakan `extends` untuk mewarisi dan `super()` untuk memanggil constructor class utama.



```java
class MahasiswaReguler extends Mahasiswa {
    public MahasiswaReguler(String nama, String nrp, double uktDasar) {
        super(nama, nrp); 
        this.uktDasar = uktDasar;
    }
}
```

## 2. Encapsulation (Enkapsulasi)

**Encapsulation** adalah teknik membungkus data agar tidak bisa diakses secara acak dari luar *class* guna menjaga integritas data.

- **Implementasi:** Atribut `nama` dan `nrp` diatur sebagai `private`.
- **Akses:** Data hanya bisa dibaca atau diubah melalui method **Getter** dan **Setter** yang bersifat `public`.

```java
abstract class Mahasiswa {
    // Variabel diset private (Data Hiding)
    private String nama;
    private String nrp;

    // Getter untuk membaca data
    public String getNama() {
        return nama;
    }

    // Setter untuk mengubah data secara terkontrol
    public void setNama(String nama) {
        this.nama = nama;
    }
}
```

## 3. Polymorphism (Polimorfisme)
Kemampuan satu *method* untuk memiliki banyak bentuk atau perilaku yang berbeda.
- **Implementasi:** Kita melakukan **Overriding** pada method `UKT()`.
- **Hasil:** Method `UKT()` pada mahasiswa reguler akan menghasilkan nilai bayaran, sedangkan pada beasiswa akan menghasilkan 0 (gratis).

```java
// Implementasi pada subclass (MahasiswaBeasiswa)
class MahasiswaBeasiswa extends Mahasiswa {
    public MahasiswaBeasiswa(String nama, String nrp) {
        super(nama, nrp);
    }

    // Melakukan Override untuk mengubah perilaku method UKT()
    @Override
    public double UKT() {
        return 0.0; // Khusus beasiswa, tagihan otomatis 0
    }
}
```

## 4. Abstraction (Abstraksi)
**Abstraction** berfungsi untuk menyembunyikan detail implementasi yang rumit dan hanya menampilkan fungsi pentingnya saja sebagai "kontrak".

- **Implementasi:** Menggunakan `abstract class` sebagai kontrak. Kita tidak bisa membuat objek "Mahasiswa" tanpa tipe yang jelas (harus Reguler atau Beasiswa) agar perhitungan UKT-nya pasti.

- **Aturan**: Class Utama hanya menentukan "apa" yang harus ada (semua mahasiswa harus punya fungsi hitung UKT), sementara subclass dipaksa untuk menentukan sendiri "bagaimana" cara menghitungnya secara spesifik.


```java
// Class Utama dideklarasikan sebagai abstract
abstract class Mahasiswa {
    protected String nama;
    protected String nrp;

    public Mahasiswa(String nama, String nrp) {
        this.nama = nama;
        this.nrp = nrp;
    }

    // Abstract method: wajib diimplementasikan oleh subclass
    public abstract double UKT();
}

// Implementasi pada Subclass
class MahasiswaReguler extends Mahasiswa {
    @Override
    public double UKT() {
        return 5000000; // Contoh implementasi spesifik
    }
}
```

---


# Cara Menjalankan Project

Ikuti langkah-langkah berikut untuk menjalankan program secara *local*.

## 1. Clone Repository

Download repository ini menggunakan perintah berikut:

```bash
git clone https://github.com/Dzili888/Strukdat-OOP_2026.git
```

## 2. Masuk ke Folder Project

```bash
cd Strukdat-OOP_2026/project_UKT-Mahasiswa
```

## 3. Compile Program

Compile semua file Java:

```bash
javac *.java
```

## 4. Jalankan Program

Setelah proses compile selesai, jalankan program dengan:

```bash
java Main
```