# projek-viewmodelq
Penggunaan viewmodel basic
- Tambahkan dependency pada gradle dengan acuan link berikut : https://developer.android.com/jetpack/androidx/releases/lifecycle
- Buat class viewmodel beserta fungsinya
- Tampung viewmodel pada activity
- Kemudian assign viewmodel dengan ViewModelProvider

Penggunaan viewmodelfactory
- Tambahkan parameter baru pada viewmodel dan buat constuctornya
- Buat viewmodelfactory yang mengoveride class ViewModelProvider.Factory
- Tambah parameter pada viewmodelfactory
- Override method dari class ViewModelProvider.Factory lalu buat fungsinya
- Tampung viewmodelfactory pada activity
- Assign viewmodelfactory dengan data inisialisasi yang baru
- Lalu tambahkan viewmodel di parameter ke 2 dari ViewModelProvider
