Feature: Web Hadir Testing Form Regristration

Scenario: Testing form regristration page
    When User Membuka halaman Form Registration
    And User Membuka halaman Form Staff dari Form Regristration
    And User Pilih file foto wajah
    And User Mengisi username, email, fullname, password, Imei, dan NIK
    And User Memilih level, departemen, posisi kerja, jam kerja, lokasi kerja, lembur, jumlah cuti, jam masuk, jam keluar, absen point, head, dan gm
		And User Mendaftarkan anggota karyawan
    Then User Berhasil mendaftarkan anggota karyawan