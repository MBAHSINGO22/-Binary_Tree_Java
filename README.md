# 📝 BinaryTreeJava

## Implementasi Pohon Biner Sederhana di Java
Proyek pembelajaran Java yang menunjukkan struktur data pohon biner dasar dengan node yang memiliki data dan dua anak (left dan right).

## 📖 Deskripsi Proyek

**Binary_Tree_Java** adalah proyek pembelajaran Java yang mengimplementasikan pohon biner sederhana. Proyek ini berfokus pada:

- 📊 **TreeNode.java**: Kelas dasar untuk node pohon dengan data integer, left child, dan right child.
- 🔍 **Tree.java**: Kelas utama untuk mengelola pohon dengan root node yang dapat diakses dan diatur.
- 🛠️ **MainTree.java**: Kelas utama untuk menguji pohon biner dengan pembuatan root dan dua child node secara manual.

Proyek ini terdiri dari tiga file Java (**MainTree.java, Tree.java, TreeNode.java**) dalam paket **PERTEMUAN2**. Cocok untuk pemula yang ingin mempelajari struktur data pohon biner. 🟢

## 🧠 Teknologi
- Java

## 📂 Struktur File
```
Binary_Tree_Java/
├── src/PERTEMUAN2/
│   ├── MainTree.java            # 🛠️ Kelas utama untuk pengujian
│   ├── Tree.java                # 🔍 Kelas untuk pohon biner
│   ├── TreeNode.java            # 📊 Kelas node pohon
├── README.md                    # 📖 Dokumentasi proyek
```

## ▶️ Menjalankan Program

1. **Kloning Repositori**:
   ```bash
   git clone https://github.com/MBAHSINGO22/Binary_Tree_Java.git
   cd Binary_Tree_Java
   ```

2. **Pastikan Java Terinstal**: Periksa versi Java:
   ```bash
   java -version
   ```
   Jika belum terinstal, unduh dari [java.com](https://www.java.com).

3. **Kompilasi dan Jalankan Kode**:
   Pastikan struktur paket dipertahankan.

   Kompilasi:
   ```bash
   javac -d bin src/PERTEMUAN2/*.java
   ```

   Jalankan:
   ```bash
   java -cp bin PERTEMUAN2.MainTree
   ```

## 🟢 Catatan:
- Pastikan Anda memiliki Java Development Kit (JDK) yang terinstal.
- Pohon diinisialisasi secara manual dengan root (10), left child (5), dan right child (15).
- Program saat ini hanya menampilkan data node tanpa traversal atau operasi tambahan.
- Tidak ada dependensi eksternal; gunakan pustaka standar Java.

## 📈 Contoh Output
**MainTree.java**
```
Root data: 10
Left child data: 5
Right child data: 15
```

## 👨‍💻 Pengembang
- **MBAHSINGO22**
- 🔗 GitHub
