class Bunga(_nama:String, _namaLatin:String="Helianthus", _warna: String="Kuning", _daerahAsal: String ="Mexico, Amerika Utara"){
    val nama = _nama
    val namaLatin = _namaLatin
    var warna = _warna
    var daerahAsal = _daerahAsal

    fun tampilDeskripsi():String{
        val hasil = "*****Deskripsi Bunga*****" +
                "\nNama : Bunga "+nama+
                "\nNama Latin : "+namaLatin+
                "\nWarna : "+warna+
                "\nDaerah Asal : "+daerahAsal+
                "\n\n"
        return hasil
    }
}
fun main(){
    val matahari = Bunga("Matahari")
    var hasilMatahari = matahari.tampilDeskripsi()
    print(hasilMatahari)

    val anggrek = Bunga("Anggrek","Orchidaceae","Ungu,Putih", "Kalimantan, Indonesia")
    var hasilAnggrek = anggrek.tampilDeskripsi()
    print(hasilAnggrek)
}