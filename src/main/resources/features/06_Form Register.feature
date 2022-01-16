Feature: Web Hadir Testing Form Register

Scenario: Testing form Register page
    When User Membuka halaman Form Register
    And User menambah data karyawan di Form Register
    And User mengupload foto
    And User mengisi biodata karyawan
    And User mengkonfirmasi register karyawan
    And User mencari data karyawan sesuai filter yang telah disesuaikan
    And User click button next dan previous
    And User click lihat detail
    And User click ubah data
    And User mengubah data karyawan
    Then User berhasil mengubah data
    