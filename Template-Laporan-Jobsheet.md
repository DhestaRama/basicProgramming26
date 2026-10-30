# JOBSHEET 4 - PEMILIHAN 1

**Identitas Mahasiswa:**
* **Nama:** Dhesta Ramadhani Pramana
* **NIM:** 264107020215
* **Kelas / No. Presensi:** TI-1D

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. 	Memahami konsep perulangan bersarang pada algoritma  
2. 	Memahami alur perulangan bersarang 
3. Mengenal sintaks perulangan bersarang 
4. Mampu menerapkan perulangan bersarang untuk menyelesaikan studi kasus sederhana.



---

## 2: PRAKTIKUM

### 2.1 Percobaan 1: Review Perulangan 1 
Percobaan ini mengulang konsep perulangan FOR sebelum mempelajari perulangan bersarang. Program menampilkan karakter * sebanyak n kali secara mendatar (ke arah samping). Gunakan input n berupa bilangan bulat positif. 
#### 2.1.1 Kode Program Java
```java
// Contoh kode program dummy Percobaan 1
import java.util.Scanner;

public class Percobaan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();

        if (nilai >= 75) {
            System.out.println("Status: LULUS");
        } else {
            System.out.println("Status: TIDAK LULUS");
        }
    }
}
```

#### 2.1.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Contoh Gambar Output Percobaan 1](/contoh-gambar.png)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Apa fungsi dari perintah `if`?
  * **Jawab:** Perintah `if` digunakan untuk mengeksekusi sebuah blok kode hanya jika kondisi bernilai `true`.
* **Pertanyaan 2:** Apa yang terjadi jika kondisi bernilai `false`?
  * **Jawab:** Program akan melewati blok `if` dan mengeksekusi blok `else` (jika ada).

---

### 2.2 Percobaan 2: Penerapan Structure SWITCH-CASE

Paragraf ini menjelaskan ringkasan Percobaan 2. Percobaan ini berfokus pada penggunaan `switch-case` untuk memilih menu atau opsi berdasarkan nilai yang bersifat spesifik.

#### 2.2.1 Tabel Pengujian Parameter Output

Berikut adalah hasil uji coba program dengan beberapa variasi masukan *dummy*:

| No | Input Parameter | Output yang Dihasilkan | Status Eksekusi |
| :---: | :--- | :--- | :---: |
| 1 | `Case 1` | "Pilihan 1 Dipilih" | Valid |
| 2 | `Case 2` | "Pilihan 2 Dipilih" | Valid |
| 3 | `Default` | "Pilihan Tidak Tersedia" | Invalid |

---

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

- [x] **Tugas 1:** Mengubah struktur `if-else` menjadi *Ternary Operator*.
- [x] **Tugas 2:** Membuat program berdasarkan *Flowchart* penentuan SKS.
- [ ] **Tugas 3:** Mengimplementasikan studi kasus parkir & antrean.

### 3.1 Implementasi Kode Tugas

```java
// Contoh Kode Program Tugas Mandiri
public class TugasMandiri {
    public static void main(String[] args) {
        int sks = 20;
        String status = (sks <= 24) ? "KRS Valid" : "Melebihi Batas";
        System.out.println(status);
    }
}
```

---

## 4: KESIMPULAN

Tuliskan paragraf kesimpulan di sini. Secara singkat, struktur pemilihan sangat penting digunakan untuk mengatur alur jalannya program (*flow control*) berdasarkan variabel atau pilihan yang ditentukan oleh pengguna.
