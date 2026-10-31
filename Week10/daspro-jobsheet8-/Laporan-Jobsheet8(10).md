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
[Star10.java](Star10.java)


#### 2.1.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Contoh Gambar Output Percobaan 1](/Week10/daspro-jobsheet8-/Screenshot%202026-10-30%20214532.png)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Jika inisialisasi i = 1 diubah menjadi i = 0 tanpa mengubah kondisi, berapa karakter * yang tercetak ketika n = 5? Jelaskan.
  * **Jawab:** Tercetak 6 bintang. Perulangan berjalan untuk i = 0, 1, 2, 3, 4, 5, yaitu 6 iterasi, padahal sebelumnya 5 iterasi (i = 1 sampai 5).blok kode hanya jika kondisi bernilai `true`.
* **Pertanyaan 2:** 	Jika kondisi i <= n diganti menjadi i < n, berapa kali perulangan dijalankan saat n = 5? Mengapa hasilnya berbeda? 
  * **Jawab:**Perulangan berjalan 4 kali (i = 1, 2, 3, 4). Saat i = 5, kondisi 5 < 5 bernilai false sehingga perulangan berhenti sebelum badan perulangan dijalankan. Dengan <=, nilai i = 5 masih lolos.
* **Pertanyaan 3:**	Prediksi output potongan kode berikut ketika n = 9, kemudian buktikan dengan mengganti perulangan FOR pada program Anda dan menjalankannya.
  * **Jawab:** i mulai dari 2 dan naik 2 tiap iterasi (2, 4, 6, 8). Saat i = 10, kondisi 10 <= 9 false.
  ![Contoh Output Pertanyaan 3](/Week10/daspro-jobsheet8-/Screenshot%202026-10-30%20220306.png)
* **Pertanyaan 4** Jelaskan mengapa perubahan increment i++ menjadi i-- (dengan kondisi tetap i <= n) membuat perulangan berjalan terus-menerus dan tidak berhenti dalam waktu wajar untuk n positif. Jangan menjalankan versi tersebut; jika terlanjur berjalan, hentikan program dengan menekan Ctrl + C pada terminal. 
  * **Jawab:** i dimulai dari 1 lalu terus berkurang (0, -1, -2, ...). Nilai ini selalu lebih kecil dari n yang positif, sehingga kondisi i <= n selalu true dan tidak pernah menjadi false. Secara teknis perulangan baru berhenti jika i mengalami integer underflow (melewati batas terkecil int dan berputar ke nilai positif sangat besar). Itu butuh sekitar 2 miliar iterasi, jadi dalam praktik program terlihat tidak berhenti.

---

### 2.2 Percobaan 2: Pola Bintang Persegi Panjang (Nested FOR) 

Pada percobaan ini digunakan nested loop FOR untuk mencetak persegi panjang bintang. Jumlah baris dan kolom dimasukkan secara terpisah sehingga peran kedua loop dapat diamati dengan jelas: outer loop mengatur baris, sedangkan inner loop mengatur kolom (ingat analogi rak/loker pada materi). 

#### 2.2.1 Kode Program java

[Rectangle10.java](Rectangle10.java)

#### 2.1.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:  
![Output Program](/Week10/daspro-jobsheet8-/Screenshot%202026-10-30%20230558.png)

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
1.	Tentukan fungsi variabel i dan j pada program tersebut.  
  **Jawab:** i adalah penghitung baris (outer loop).
j adalah penghitung kolom (inner loop), yaitu banyak bintang dalam satu baris.
2.	Berapa kali outer loop, inner loop, dan perintah print("\*") dijalankan untuk baris = 4 
dan kolom = 7?   
  **Jawab:** Outer loop: 4 kali
Inner loop: dimulai 4 kali, masing-masing 7 iterasi, jadi total 28 iterasi (4 × 7)
print("\*"): 28 kali
3.	Apa yang terjadi jika batas perulangan luar dan dalam ditukar (outer menggunakan kolom, inner menggunakan baris)? Gunakan baris = 3 dan kolom = 6 untuk menjelaskan.  
  **Jawab:** Outer loop berjalan 6 kali dan inner loop 3 kali per putaran. Hasilnya 6 baris dengan 3 bintang per baris:
  
    \***  
    \***  
    \***    
    \***  
    \***  
    \*** 

4. Jelaskan akibat penghapusan System.out.println(); setelah inner loop.   
  **Jawab:** Kursor tidak pernah pindah baris, jadi semua bintang tercetak berderet dalam satu baris: ****************** (18 bintang untuk 3×6). Bentuk persegi panjang hilang.
5. Modifikasi program agar karakter yang dicetak adalah #, lalu commit dan push perubahan ke GitHub.   
  **Jawab:** System.out.print("#");

---
## 2.3 Percobaan 3: Debugging Bintang Segitiga – Nested WHILE 
  
  Kode awal pada percobaan ini sengaja dibuat belum menghasilkan format segitiga yang benar. Tugas Anda adalah mengidentifikasi kesalahannya dan memperbaikinya tanpa mengganti struktur WHILE menjadi FOR.  
Output target untuk n = 5:   
*   
**   
\***   
\****   
\*****   

### 2.3.1 Kode Program Java
[Triangle10.java](Triangle10.java)

### 2.3.2 Hasil Output   
Berikut adalah contoh tampilan output setelah program dijalankan:
![Hasil Output Program](/Week10/daspro-jobsheet8-/Screenshot%202026-10-30%20234543.png)

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi  
1.	Sebutkan ketidaksesuaian output awal dan minimal dua perbaikan yang diperlukan untuk menghasilkan pola segitiga bertingkat.   
  **Jawab:** Ketidaksesuaian pada kode awal:

    Semua bintang tercetak berderet dalam satu baris (n = 3 menghasilkan ******, n = 5 menghasilkan ***************), karena tidak ada println() setelah inner loop.
Outer loop berjalan n + 1 kali karena i dimulai dari 0. Iterasi i = 0 tidak mencetak bintang, sehingga akan menjadi baris kosong.

    Perbaikan:

    Tambahkan System.out.println(); setelah inner loop, sebelum i++.
Ubah inisialisasi outer loop menjadi int i = 1; agar berjalan tepat n kali tanpa baris kosong.
2.	Jelaskan peran variabel i dan j. Mengapa nilai j harus diinisialisasi kembali ke 0 pada setiap iterasi outer loop? Apa yang terjadi jika j tidak di-reset?   
  **Jawab:** i adalah nomor baris saat ini sekaligus jumlah bintang yang harus dicetak di baris itu.
j adalah penghitung bintang yang sudah tercetak dalam satu baris.

    j harus kembali ke 0 di setiap iterasi outer loop karena tiap baris menghitung bintangnya dari awal. Jika tidak di-reset (misalnya j dideklarasikan di luar outer loop), setelah baris pertama j bernilai 1. Pada baris kedua, kondisi j < 2 hanya memberi 1 putaran, dan seterusnya selalu hanya 1 bintang per baris. Hasilnya bukan segitiga, melainkan satu bintang per baris.
3.	Jelaskan perubahan inisialisasi, kondisi, dan perubahan nilai (update) pada outer loop yang diperlukan untuk membentuk segitiga terbalik.   
  **Jawab:** 

  | Bagian |	Segitiga biasa |	Segitiga terbalik |  
  | ----------- | ----------- | ----------- |  
  | nisialisasi	| i = 1 |	i = n |  
  | Kondisi |	i <= n	| i >= 1 |  
  | Update	| i++ |	i-- |  
  |

    Dengan begitu baris pertama mencetak n bintang, lalu berkurang satu per baris sampai tersisa 1 bintang.

---
## 2.4 Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok   
Dalam penilaian proyek kelompok, setiap kelompok memperoleh nilai dari sejumlah penilai. Program menerima jumlah kelompok dan jumlah penilai yang sama untuk setiap kelompok, kemudian menghitung rata-rata nilai tiap kelompok dan menentukan kelompok dengan ratarata tertinggi. Kasus ini diselesaikan dengan nested loop tanpa perlu menyimpan seluruh nilai: WHILE (luar) untuk kelompok, FOR (tengah) untuk penilai, dan DO-WHILE (dalam) untuk mengulang input nilai yang tidak valid. 
### 2.4.1 Kode Program Java
[NilaiKelompok10.java](NilaiKelompok10.java)  

### 2.4.2 Hasil Output
Berikut adalah contoh tampilan output setelah program dijalankan:
![Hasil Output Program](/Week10/daspro-jobsheet8-/Screenshot%202026-10-31%20001507.png)
  
### 2.4.3 Jawaban Pertanyaan / Pertanyaan Refleksi  
1.	Mengapa totalNilai perlu di-reset di dalam outer loop, tetapi rataTertinggi tidak boleh di-reset pada setiap kelompok?   
  **Jawab:** Jika di-reset di tiap kelompok, hanya kelompok terakhir yang pernah dibandingkan, sehingga rekor tertinggi dari kelompok sebelumnya hilang.
2.	Untuk 3 kelompok dan 2 penilai (tanpa input yang salah), berapa kali badan perulangan FOR dijalankan secara keseluruhan?   
  **Jawab:** 3 × 2 = 6 kali.
3.	Apa yang terjadi jika totalNilai dideklarasikan sebagai int dan rata-rata dihitung menggunakan pembagian dua bilangan bulat? Berikan contoh nilai.  
  **Jawab:** totalNilai bertipe int dengan pembagian bilangan bulat
Pecahan hasil bagi terpotong (dibuang). Contoh: nilai 80 dan 85, total = 165, 165 / 2 = 82 (bukan 82.5). Rata-rata menjadi kurang akurat dan bisa memengaruhi penentuan kelompok terbaik.
4.	Mengapa rataTertinggi diberi nilai awal -1, bukan 0? Berikan contoh input yang membuat hasil salah apabila nilai awalnya 0.   
  **Jawab:** Jika nilai awalnya 0, kelompok dengan rata-rata 0 tidak akan lolos rataNilai > rataTertinggi (0 > 0 false). Contoh: 2 kelompok, 1 penilai, nilai kelompok 1 = 0 dan kelompok 2 = 0. Dengan awal 0, kelompokTerbaik tetap 0 (kelompok yang tidak ada), padahal seharusnya kelompok 1. Dengan -1, rata-rata 0 tetap lebih besar sehingga kelompok pertama pasti tercatat.
5.	Program ini memiliki tiga tingkat perulangan. Sebutkan masing-masing jenis perulangan beserta perannya.   
  **Jawab:**   
  * WHILE (luar): mengulang per kelompok, sampai nomorKelompok > jumlahKelompok.  
* FOR (tengah): mengulang per penilai, jumlahnya sudah pasti (jumlahPenilai).  
* DO-WHILE (dalam): mengulang input nilai selama di luar rentang 0–100. Input diminta minimal sekali, lalu diulang jika tidak valid.
  
---
## 3: TUGAS MANDIRI

Kerjakan tugas berikut secara mandiri. Gunakan nested loop, struktur pemilihan jika diperlukan, dan cukup gunakan variabel biasa (variabel penampung dan penghitung) untuk menyimpan hasil perhitungan. Buat file terpisah untuk setiap tugas. Commit dan push seluruh file ke repository daspro-jobsheet8 di GitHub. 



### 3.1.1  Tugas 1: Pola Bilangan Bertingkat 

```java
// Contoh Kode Program Tugas 1
import java.util.Scanner;

public class Tugas110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Nilai n harus minimal 1.");
        } else {
            int total = 0;
            for (int i = 1; i <= n; i++) {          // outer loop: baris
                for (int j = 1; j <= i; j++) {      // inner loop: angka 1 sampai i
                    System.out.print(j);
                    if (j < i) {
                        System.out.print(" ");
                    }
                    total++;
                }
                System.out.println();
            }
            System.out.println("Total angka tercetak: " + total);
        }
        sc.close();
    }
}
```
### 3.1.2 Hasil Output Kode Program 
![Hasil Output](/Week10/daspro-jobsheet8-/Screenshot%202026-10-31%20131413.png)

### 3.2.1 Tugas 2: Tabel Perkalian
```java
// Contoh Kode Program Tugas 2
import java.util.Scanner;

public class Tugas210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n harus minimal 3.");
        } else {
            int jumlah = 0;
            for (int i = 1; i <= n; i++) {          // outer loop: nomor baris
                for (int j = 1; j <= n; j++) {      // inner loop: nomor kolom
                    int hasil = i * j;
                    System.out.printf("%4d", hasil);
                    jumlah += hasil;
                }
                System.out.println();
            }
            System.out.println("Jumlah seluruh angka: " + jumlah);
        }
        sc.close();
    }
}
```
### 3.2.2 Hasil Output Kode Program
![Hasil Output](/Week10/daspro-jobsheet8-/Screenshot%202026-10-31%20131905.png)

### 3.3.1 Tugas 3: Rekap Penjualan Beberapa Toko 

```java
// Contoh Kode Program Tugas 3
import java.util.Scanner;

public class Tugas310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko harus minimal 1.");
        } else {
            int totalSeluruh = 0;       // total barang seluruh toko
            int barangTerbanyak = -1;   // -1 agar toko pertama pasti tercatat
            int tokoTerbanyak = 0;

            for (int toko = 1; toko <= jumlahToko; toko++) {   // outer loop: toko
                System.out.println("Toko " + toko);

                int jumlahPelanggan;
                do {
                    System.out.print("  Jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;   // reset untuk tiap toko
                for (int p = 1; p <= jumlahPelanggan; p++) {   // inner loop: pelanggan
                    int barang;
                    do {
                        System.out.print("    Jumlah barang pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("    Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }

                System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko);

                totalSeluruh += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {   // > (bukan >=) agar nomor toko terkecil dipilih
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = toko;
                }
            }

            System.out.println("==============================");
            System.out.println("Total barang seluruh toko: " + totalSeluruh);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}
```
### 3.2.2 Hasil Output Kode Program
![Hasil Output](/Week10/daspro-jobsheet8-/Screenshot%202026-10-31%20132539.png)

---

## 4: Kesimpulan Jobsheet 8: Perulangan 2

Perulangan bersarang (nested loop) adalah perulangan yang berada di dalam perulangan lain. Setiap satu putaran outer loop, inner loop dijalankan sampai selesai, sehingga jumlah eksekusi badan perulangan terdalam adalah hasil kali jumlah putaran kedua loop. Pada pola bintang, outer loop mengatur baris dan inner loop mengatur kolom
