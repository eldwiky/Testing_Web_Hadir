Feature: Web Hadir

Scenario: Testing form staff page
    When User Membuka halaman Form Staff
    And User Mencari data karyawan berdasarkan kategori yang ditentukan
    And User membuka form view history
    And User mengeksport data history absen karyawan
    And User membuka form edit data
		And User mengedit foto karyawan
    And User mengedit biodata karyawan
    And User mengedit departement karyawan
    Then User berhasil mengubah data
    